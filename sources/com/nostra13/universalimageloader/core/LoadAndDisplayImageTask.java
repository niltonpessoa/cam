package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import android.os.Handler;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.core.decode.ImageDecoder;
import com.nostra13.universalimageloader.core.decode.ImageDecodingInfo;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.utils.IoUtils;
import com.nostra13.universalimageloader.utils.L;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

final class LoadAndDisplayImageTask implements Runnable, IoUtils.CopyListener {
    private static final String ERROR_POST_PROCESSOR_NULL = "Post-processor returned null [%s]";
    private static final String ERROR_PRE_PROCESSOR_NULL = "Pre-processor returned null [%s]";
    private static final String ERROR_PROCESSOR_FOR_DISK_CACHE_NULL = "Bitmap processor for disk cache returned null [%s]";
    private static final String LOG_CACHE_IMAGE_IN_MEMORY = "Cache image in memory [%s]";
    private static final String LOG_CACHE_IMAGE_ON_DISK = "Cache image on disk [%s]";
    private static final String LOG_DELAY_BEFORE_LOADING = "Delay %d ms before loading...  [%s]";
    private static final String LOG_GET_IMAGE_FROM_MEMORY_CACHE_AFTER_WAITING = "...Get cached bitmap from memory after waiting. [%s]";
    private static final String LOG_LOAD_IMAGE_FROM_DISK_CACHE = "Load image from disk cache [%s]";
    private static final String LOG_LOAD_IMAGE_FROM_NETWORK = "Load image from network [%s]";
    private static final String LOG_POSTPROCESS_IMAGE = "PostProcess image before displaying [%s]";
    private static final String LOG_PREPROCESS_IMAGE = "PreProcess image before caching in memory [%s]";
    private static final String LOG_PROCESS_IMAGE_BEFORE_CACHE_ON_DISK = "Process image before cache on disk [%s]";
    private static final String LOG_RESIZE_CACHED_IMAGE_FILE = "Resize image in disk cache [%s]";
    private static final String LOG_RESUME_AFTER_PAUSE = ".. Resume loading [%s]";
    private static final String LOG_START_DISPLAY_IMAGE_TASK = "Start display image task [%s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_COLLECTED = "ImageAware was collected by GC. Task is cancelled. [%s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_REUSED = "ImageAware is reused for another image. Task is cancelled. [%s]";
    private static final String LOG_TASK_INTERRUPTED = "Task was interrupted [%s]";
    private static final String LOG_WAITING_FOR_IMAGE_LOADED = "Image already is loading. Waiting... [%s]";
    private static final String LOG_WAITING_FOR_RESUME = "ImageLoader is paused. Waiting...  [%s]";
    /* access modifiers changed from: private */
    public final ImageLoaderConfiguration configuration;
    private final ImageDecoder decoder;
    private final ImageDownloader downloader;
    private final ImageLoaderEngine engine;
    private final Handler handler;
    final ImageAware imageAware;
    private final ImageLoadingInfo imageLoadingInfo;
    final ImageLoadingListener listener;
    private LoadedFrom loadedFrom = LoadedFrom.NETWORK;
    private final String memoryCacheKey;
    private final ImageDownloader networkDeniedDownloader;
    final DisplayImageOptions options;
    final ImageLoadingProgressListener progressListener;
    private final ImageDownloader slowNetworkDownloader;
    private final boolean syncLoading;
    private final ImageSize targetSize;
    final String uri;

    class TaskCancelledException extends Exception {
        TaskCancelledException() {
        }
    }

    public LoadAndDisplayImageTask(ImageLoaderEngine imageLoaderEngine, ImageLoadingInfo imageLoadingInfo2, Handler handler2) {
        this.engine = imageLoaderEngine;
        this.imageLoadingInfo = imageLoadingInfo2;
        this.handler = handler2;
        ImageLoaderConfiguration imageLoaderConfiguration = imageLoaderEngine.configuration;
        this.configuration = imageLoaderConfiguration;
        this.downloader = imageLoaderConfiguration.downloader;
        this.networkDeniedDownloader = imageLoaderConfiguration.networkDeniedDownloader;
        this.slowNetworkDownloader = imageLoaderConfiguration.slowNetworkDownloader;
        this.decoder = imageLoaderConfiguration.decoder;
        this.uri = imageLoadingInfo2.uri;
        this.memoryCacheKey = imageLoadingInfo2.memoryCacheKey;
        this.imageAware = imageLoadingInfo2.imageAware;
        this.targetSize = imageLoadingInfo2.targetSize;
        DisplayImageOptions displayImageOptions = imageLoadingInfo2.options;
        this.options = displayImageOptions;
        this.listener = imageLoadingInfo2.listener;
        this.progressListener = imageLoadingInfo2.progressListener;
        this.syncLoading = displayImageOptions.isSyncLoading();
    }

    private void checkTaskInterrupted() {
        if (isTaskInterrupted()) {
            throw new TaskCancelledException();
        }
    }

    private void checkTaskNotActual() {
        checkViewCollected();
        checkViewReused();
    }

    private void checkViewCollected() {
        if (isViewCollected()) {
            throw new TaskCancelledException();
        }
    }

    private void checkViewReused() {
        if (isViewReused()) {
            throw new TaskCancelledException();
        }
    }

    private Bitmap decodeImage(String str) {
        String str2 = str;
        return this.decoder.decode(new ImageDecodingInfo(this.memoryCacheKey, str2, this.uri, this.targetSize, this.imageAware.getScaleType(), getDownloader(), this.options));
    }

    private boolean delayIfNeed() {
        if (!this.options.shouldDelayBeforeLoading()) {
            return false;
        }
        L.d(LOG_DELAY_BEFORE_LOADING, Integer.valueOf(this.options.getDelayBeforeLoading()), this.memoryCacheKey);
        try {
            Thread.sleep((long) this.options.getDelayBeforeLoading());
            return isTaskNotActual();
        } catch (InterruptedException unused) {
            L.e(LOG_TASK_INTERRUPTED, this.memoryCacheKey);
            return true;
        }
    }

    private boolean downloadImage() {
        return this.configuration.diskCache.save(this.uri, getDownloader().getStream(this.uri, this.options.getExtraForDownloader()), this);
    }

    private void fireCancelEvent() {
        if (!this.syncLoading && !isTaskInterrupted()) {
            runTask(new Runnable() {
                public void run() {
                    LoadAndDisplayImageTask loadAndDisplayImageTask = LoadAndDisplayImageTask.this;
                    loadAndDisplayImageTask.listener.onLoadingCancelled(loadAndDisplayImageTask.uri, loadAndDisplayImageTask.imageAware.getWrappedView());
                }
            }, false, this.handler, this.engine);
        }
    }

    private void fireFailEvent(final FailReason.FailType failType, final Throwable th) {
        if (!this.syncLoading && !isTaskInterrupted() && !isTaskNotActual()) {
            runTask(new Runnable() {
                public void run() {
                    if (LoadAndDisplayImageTask.this.options.shouldShowImageOnFail()) {
                        LoadAndDisplayImageTask loadAndDisplayImageTask = LoadAndDisplayImageTask.this;
                        loadAndDisplayImageTask.imageAware.setImageDrawable(loadAndDisplayImageTask.options.getImageOnFail(loadAndDisplayImageTask.configuration.resources));
                    }
                    LoadAndDisplayImageTask loadAndDisplayImageTask2 = LoadAndDisplayImageTask.this;
                    loadAndDisplayImageTask2.listener.onLoadingFailed(loadAndDisplayImageTask2.uri, loadAndDisplayImageTask2.imageAware.getWrappedView(), new FailReason(failType, th));
                }
            }, false, this.handler, this.engine);
        }
    }

    private boolean fireProgressEvent(final int i, final int i2) {
        if (isTaskInterrupted() || isTaskNotActual()) {
            return false;
        }
        if (this.progressListener == null) {
            return true;
        }
        runTask(new Runnable() {
            public void run() {
                LoadAndDisplayImageTask loadAndDisplayImageTask = LoadAndDisplayImageTask.this;
                loadAndDisplayImageTask.progressListener.onProgressUpdate(loadAndDisplayImageTask.uri, loadAndDisplayImageTask.imageAware.getWrappedView(), i, i2);
            }
        }, false, this.handler, this.engine);
        return true;
    }

    private ImageDownloader getDownloader() {
        return this.engine.isNetworkDenied() ? this.networkDeniedDownloader : this.engine.isSlowNetwork() ? this.slowNetworkDownloader : this.downloader;
    }

    private boolean isTaskInterrupted() {
        if (!Thread.interrupted()) {
            return false;
        }
        L.d(LOG_TASK_INTERRUPTED, this.memoryCacheKey);
        return true;
    }

    private boolean isTaskNotActual() {
        return isViewCollected() || isViewReused();
    }

    private boolean isViewCollected() {
        if (!this.imageAware.isCollected()) {
            return false;
        }
        L.d(LOG_TASK_CANCELLED_IMAGEAWARE_COLLECTED, this.memoryCacheKey);
        return true;
    }

    private boolean isViewReused() {
        if (!(!this.memoryCacheKey.equals(this.engine.getLoadingUriForView(this.imageAware)))) {
            return false;
        }
        L.d(LOG_TASK_CANCELLED_IMAGEAWARE_REUSED, this.memoryCacheKey);
        return true;
    }

    private boolean resizeAndSaveImage(int i, int i2) {
        File file = this.configuration.diskCache.get(this.uri);
        if (file == null || !file.exists()) {
            return false;
        }
        Bitmap decode = this.decoder.decode(new ImageDecodingInfo(this.memoryCacheKey, ImageDownloader.Scheme.FILE.wrap(file.getAbsolutePath()), this.uri, new ImageSize(i, i2), ViewScaleType.FIT_INSIDE, getDownloader(), new DisplayImageOptions.Builder().cloneFrom(this.options).imageScaleType(ImageScaleType.IN_SAMPLE_INT).build()));
        if (!(decode == null || this.configuration.processorForDiskCache == null)) {
            L.d(LOG_PROCESS_IMAGE_BEFORE_CACHE_ON_DISK, this.memoryCacheKey);
            decode = this.configuration.processorForDiskCache.process(decode);
            if (decode == null) {
                L.e(ERROR_PROCESSOR_FOR_DISK_CACHE_NULL, this.memoryCacheKey);
            }
        }
        if (decode == null) {
            return false;
        }
        boolean save = this.configuration.diskCache.save(this.uri, decode);
        decode.recycle();
        return save;
    }

    static void runTask(Runnable runnable, boolean z, Handler handler2, ImageLoaderEngine imageLoaderEngine) {
        if (z) {
            runnable.run();
        } else if (handler2 == null) {
            imageLoaderEngine.fireCallback(runnable);
        } else {
            handler2.post(runnable);
        }
    }

    private boolean tryCacheImageOnDisk() {
        L.d(LOG_CACHE_IMAGE_ON_DISK, this.memoryCacheKey);
        try {
            boolean downloadImage = downloadImage();
            if (downloadImage) {
                ImageLoaderConfiguration imageLoaderConfiguration = this.configuration;
                int i = imageLoaderConfiguration.maxImageWidthForDiskCache;
                int i2 = imageLoaderConfiguration.maxImageHeightForDiskCache;
                if (i > 0 || i2 > 0) {
                    L.d(LOG_RESIZE_CACHED_IMAGE_FILE, this.memoryCacheKey);
                    resizeAndSaveImage(i, i2);
                }
            }
            return downloadImage;
        } catch (IOException e) {
            L.e(e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        r7 = r1;
        r1 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r7 = r1;
        r1 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a0, code lost:
        r7 = r1;
        r1 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd A[ExcHandler: TaskCancelledException (r0v1 'e' com.nostra13.universalimageloader.core.LoadAndDisplayImageTask$TaskCancelledException A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap tryLoadBitmap() {
        /*
            r8 = this;
            r0 = 0
            com.nostra13.universalimageloader.core.ImageLoaderConfiguration r1 = r8.configuration     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            com.nostra13.universalimageloader.cache.disc.DiskCache r1 = r1.diskCache     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            java.lang.String r2 = r8.uri     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            java.io.File r1 = r1.get(r2)     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0036
            boolean r4 = r1.exists()     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            if (r4 == 0) goto L_0x0036
            java.lang.String r4 = "Load image from disk cache [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            java.lang.String r6 = r8.memoryCacheKey     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            r5[r2] = r6     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            com.nostra13.universalimageloader.utils.L.d(r4, r5)     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            com.nostra13.universalimageloader.core.assist.LoadedFrom r4 = com.nostra13.universalimageloader.core.assist.LoadedFrom.DISC_CACHE     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            r8.loadedFrom = r4     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            r8.checkTaskNotActual()     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r4 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            java.lang.String r1 = r4.wrap(r1)     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            android.graphics.Bitmap r1 = r8.decodeImage(r1)     // Catch:{ IllegalStateException -> 0x00bf, TaskCancelledException -> 0x00bd, IOException -> 0x00b2, OutOfMemoryError -> 0x00ab, all -> 0x00a4 }
            goto L_0x0037
        L_0x0036:
            r1 = r0
        L_0x0037:
            if (r1 == 0) goto L_0x0045
            int r4 = r1.getWidth()     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            if (r4 <= 0) goto L_0x0045
            int r4 = r1.getHeight()     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            if (r4 > 0) goto L_0x00c5
        L_0x0045:
            java.lang.String r4 = "Load image from network [%s]"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            java.lang.String r5 = r8.memoryCacheKey     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            r3[r2] = r5     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            com.nostra13.universalimageloader.utils.L.d(r4, r3)     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            com.nostra13.universalimageloader.core.assist.LoadedFrom r2 = com.nostra13.universalimageloader.core.assist.LoadedFrom.NETWORK     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            r8.loadedFrom = r2     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            java.lang.String r2 = r8.uri     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            com.nostra13.universalimageloader.core.DisplayImageOptions r3 = r8.options     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            boolean r3 = r3.isCacheOnDisk()     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            if (r3 == 0) goto L_0x007a
            boolean r3 = r8.tryCacheImageOnDisk()     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            if (r3 == 0) goto L_0x007a
            com.nostra13.universalimageloader.core.ImageLoaderConfiguration r3 = r8.configuration     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            com.nostra13.universalimageloader.cache.disc.DiskCache r3 = r3.diskCache     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            java.lang.String r4 = r8.uri     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            java.io.File r3 = r3.get(r4)     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            if (r3 == 0) goto L_0x007a
            com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r2 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            java.lang.String r2 = r2.wrap(r3)     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
        L_0x007a:
            r8.checkTaskNotActual()     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            android.graphics.Bitmap r1 = r8.decodeImage(r2)     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            if (r1 == 0) goto L_0x008f
            int r2 = r1.getWidth()     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            if (r2 <= 0) goto L_0x008f
            int r2 = r1.getHeight()     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            if (r2 > 0) goto L_0x00c5
        L_0x008f:
            com.nostra13.universalimageloader.core.assist.FailReason$FailType r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.DECODING_ERROR     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            r8.fireFailEvent(r2, r0)     // Catch:{ IllegalStateException -> 0x00c0, TaskCancelledException -> 0x00bd, IOException -> 0x009f, OutOfMemoryError -> 0x009a, all -> 0x0095 }
            goto L_0x00c5
        L_0x0095:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x00a5
        L_0x009a:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x00ac
        L_0x009f:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x00b3
        L_0x00a4:
            r1 = move-exception
        L_0x00a5:
            com.nostra13.universalimageloader.utils.L.e(r1)
            com.nostra13.universalimageloader.core.assist.FailReason$FailType r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.UNKNOWN
            goto L_0x00b8
        L_0x00ab:
            r1 = move-exception
        L_0x00ac:
            com.nostra13.universalimageloader.utils.L.e(r1)
            com.nostra13.universalimageloader.core.assist.FailReason$FailType r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.OUT_OF_MEMORY
            goto L_0x00b8
        L_0x00b2:
            r1 = move-exception
        L_0x00b3:
            com.nostra13.universalimageloader.utils.L.e(r1)
            com.nostra13.universalimageloader.core.assist.FailReason$FailType r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.IO_ERROR
        L_0x00b8:
            r8.fireFailEvent(r2, r1)
            r1 = r0
            goto L_0x00c5
        L_0x00bd:
            r0 = move-exception
            throw r0
        L_0x00bf:
            r1 = r0
        L_0x00c0:
            com.nostra13.universalimageloader.core.assist.FailReason$FailType r2 = com.nostra13.universalimageloader.core.assist.FailReason.FailType.NETWORK_DENIED
            r8.fireFailEvent(r2, r0)
        L_0x00c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.LoadAndDisplayImageTask.tryLoadBitmap():android.graphics.Bitmap");
    }

    private boolean waitIfPaused() {
        AtomicBoolean pause = this.engine.getPause();
        if (pause.get()) {
            synchronized (this.engine.getPauseLock()) {
                if (pause.get()) {
                    L.d(LOG_WAITING_FOR_RESUME, this.memoryCacheKey);
                    try {
                        this.engine.getPauseLock().wait();
                        L.d(LOG_RESUME_AFTER_PAUSE, this.memoryCacheKey);
                    } catch (InterruptedException unused) {
                        L.e(LOG_TASK_INTERRUPTED, this.memoryCacheKey);
                        return true;
                    }
                }
            }
        }
        return isTaskNotActual();
    }

    /* access modifiers changed from: package-private */
    public String getLoadingUri() {
        return this.uri;
    }

    public boolean onBytesCopied(int i, int i2) {
        return this.syncLoading || fireProgressEvent(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        fireCancelEvent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0106, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ff */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4 A[Catch:{ TaskCancelledException -> 0x00ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            boolean r0 = r7.waitIfPaused()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.delayIfNeed()
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            com.nostra13.universalimageloader.core.ImageLoadingInfo r0 = r7.imageLoadingInfo
            java.util.concurrent.locks.ReentrantLock r0 = r0.loadFromUriLock
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r7.memoryCacheKey
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Start display image task [%s]"
            com.nostra13.universalimageloader.utils.L.d(r3, r2)
            boolean r2 = r0.isLocked()
            if (r2 == 0) goto L_0x0030
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r7.memoryCacheKey
            r2[r4] = r3
            java.lang.String r3 = "Image already is loading. Waiting... [%s]"
            com.nostra13.universalimageloader.utils.L.d(r3, r2)
        L_0x0030:
            r0.lock()
            r7.checkTaskNotActual()     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.core.ImageLoaderConfiguration r2 = r7.configuration     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.cache.memory.MemoryCache r2 = r2.memoryCache     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r3 = r7.memoryCacheKey     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ TaskCancelledException -> 0x00ff }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ TaskCancelledException -> 0x00ff }
            if (r2 == 0) goto L_0x005b
            boolean r3 = r2.isRecycled()     // Catch:{ TaskCancelledException -> 0x00ff }
            if (r3 == 0) goto L_0x004b
            goto L_0x005b
        L_0x004b:
            com.nostra13.universalimageloader.core.assist.LoadedFrom r3 = com.nostra13.universalimageloader.core.assist.LoadedFrom.MEMORY_CACHE     // Catch:{ TaskCancelledException -> 0x00ff }
            r7.loadedFrom = r3     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r3 = "...Get cached bitmap from memory after waiting. [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r6 = r7.memoryCacheKey     // Catch:{ TaskCancelledException -> 0x00ff }
            r5[r4] = r6     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.utils.L.d(r3, r5)     // Catch:{ TaskCancelledException -> 0x00ff }
            goto L_0x00b3
        L_0x005b:
            android.graphics.Bitmap r2 = r7.tryLoadBitmap()     // Catch:{ TaskCancelledException -> 0x00ff }
            if (r2 != 0) goto L_0x0065
            r0.unlock()
            return
        L_0x0065:
            r7.checkTaskNotActual()     // Catch:{ TaskCancelledException -> 0x00ff }
            r7.checkTaskInterrupted()     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.core.DisplayImageOptions r3 = r7.options     // Catch:{ TaskCancelledException -> 0x00ff }
            boolean r3 = r3.shouldPreProcess()     // Catch:{ TaskCancelledException -> 0x00ff }
            if (r3 == 0) goto L_0x0095
            java.lang.String r3 = "PreProcess image before caching in memory [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r6 = r7.memoryCacheKey     // Catch:{ TaskCancelledException -> 0x00ff }
            r5[r4] = r6     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.utils.L.d(r3, r5)     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.core.DisplayImageOptions r3 = r7.options     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.core.process.BitmapProcessor r3 = r3.getPreProcessor()     // Catch:{ TaskCancelledException -> 0x00ff }
            android.graphics.Bitmap r2 = r3.process(r2)     // Catch:{ TaskCancelledException -> 0x00ff }
            if (r2 != 0) goto L_0x0095
            java.lang.String r3 = "Pre-processor returned null [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r6 = r7.memoryCacheKey     // Catch:{ TaskCancelledException -> 0x00ff }
            r5[r4] = r6     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.utils.L.e(r3, r5)     // Catch:{ TaskCancelledException -> 0x00ff }
        L_0x0095:
            if (r2 == 0) goto L_0x00b3
            com.nostra13.universalimageloader.core.DisplayImageOptions r3 = r7.options     // Catch:{ TaskCancelledException -> 0x00ff }
            boolean r3 = r3.isCacheInMemory()     // Catch:{ TaskCancelledException -> 0x00ff }
            if (r3 == 0) goto L_0x00b3
            java.lang.String r3 = "Cache image in memory [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r6 = r7.memoryCacheKey     // Catch:{ TaskCancelledException -> 0x00ff }
            r5[r4] = r6     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.utils.L.d(r3, r5)     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.core.ImageLoaderConfiguration r3 = r7.configuration     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.cache.memory.MemoryCache r3 = r3.memoryCache     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r5 = r7.memoryCacheKey     // Catch:{ TaskCancelledException -> 0x00ff }
            r3.put(r5, r2)     // Catch:{ TaskCancelledException -> 0x00ff }
        L_0x00b3:
            if (r2 == 0) goto L_0x00df
            com.nostra13.universalimageloader.core.DisplayImageOptions r3 = r7.options     // Catch:{ TaskCancelledException -> 0x00ff }
            boolean r3 = r3.shouldPostProcess()     // Catch:{ TaskCancelledException -> 0x00ff }
            if (r3 == 0) goto L_0x00df
            java.lang.String r3 = "PostProcess image before displaying [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r6 = r7.memoryCacheKey     // Catch:{ TaskCancelledException -> 0x00ff }
            r5[r4] = r6     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.utils.L.d(r3, r5)     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.core.DisplayImageOptions r3 = r7.options     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.core.process.BitmapProcessor r3 = r3.getPostProcessor()     // Catch:{ TaskCancelledException -> 0x00ff }
            android.graphics.Bitmap r2 = r3.process(r2)     // Catch:{ TaskCancelledException -> 0x00ff }
            if (r2 != 0) goto L_0x00df
            java.lang.String r3 = "Post-processor returned null [%s]"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ TaskCancelledException -> 0x00ff }
            java.lang.String r5 = r7.memoryCacheKey     // Catch:{ TaskCancelledException -> 0x00ff }
            r1[r4] = r5     // Catch:{ TaskCancelledException -> 0x00ff }
            com.nostra13.universalimageloader.utils.L.e(r3, r1)     // Catch:{ TaskCancelledException -> 0x00ff }
        L_0x00df:
            r7.checkTaskNotActual()     // Catch:{ TaskCancelledException -> 0x00ff }
            r7.checkTaskInterrupted()     // Catch:{ TaskCancelledException -> 0x00ff }
            r0.unlock()
            com.nostra13.universalimageloader.core.DisplayBitmapTask r0 = new com.nostra13.universalimageloader.core.DisplayBitmapTask
            com.nostra13.universalimageloader.core.ImageLoadingInfo r1 = r7.imageLoadingInfo
            com.nostra13.universalimageloader.core.ImageLoaderEngine r3 = r7.engine
            com.nostra13.universalimageloader.core.assist.LoadedFrom r4 = r7.loadedFrom
            r0.<init>(r2, r1, r3, r4)
            boolean r1 = r7.syncLoading
            android.os.Handler r2 = r7.handler
            com.nostra13.universalimageloader.core.ImageLoaderEngine r3 = r7.engine
            runTask(r0, r1, r2, r3)
            return
        L_0x00fd:
            r1 = move-exception
            goto L_0x0106
        L_0x00ff:
            r7.fireCancelEvent()     // Catch:{ all -> 0x00fd }
            r0.unlock()
            return
        L_0x0106:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.LoadAndDisplayImageTask.run():void");
    }
}
