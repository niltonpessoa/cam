package com.nostra13.universalimageloader.cache.disc.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import com.nostra13.universalimageloader.utils.IoUtils;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LimitedAgeDiscCache extends BaseDiscCache {
    private final Map<File, Long> loadingDates;
    private final long maxFileAge;

    public LimitedAgeDiscCache(File file, long j) {
        this(file, (File) null, DefaultConfigurationFactory.createFileNameGenerator(), j);
    }

    public LimitedAgeDiscCache(File file, File file2, long j) {
        this(file, file2, DefaultConfigurationFactory.createFileNameGenerator(), j);
    }

    public LimitedAgeDiscCache(File file, File file2, FileNameGenerator fileNameGenerator, long j) {
        super(file, file2, fileNameGenerator);
        this.loadingDates = Collections.synchronizedMap(new HashMap());
        this.maxFileAge = j * 1000;
    }

    private void rememberUsage(String str) {
        File file = getFile(str);
        long currentTimeMillis = System.currentTimeMillis();
        file.setLastModified(currentTimeMillis);
        this.loadingDates.put(file, Long.valueOf(currentTimeMillis));
    }

    public void clear() {
        super.clear();
        this.loadingDates.clear();
    }

    public File get(String str) {
        boolean z;
        File file = super.get(str);
        if (file != null && file.exists()) {
            Long l = this.loadingDates.get(file);
            if (l == null) {
                l = Long.valueOf(file.lastModified());
                z = false;
            } else {
                z = true;
            }
            if (System.currentTimeMillis() - l.longValue() > this.maxFileAge) {
                file.delete();
                this.loadingDates.remove(file);
            } else if (!z) {
                this.loadingDates.put(file, l);
            }
        }
        return file;
    }

    public boolean remove(String str) {
        this.loadingDates.remove(getFile(str));
        return super.remove(str);
    }

    public boolean save(String str, Bitmap bitmap) {
        boolean save = super.save(str, bitmap);
        rememberUsage(str);
        return save;
    }

    public boolean save(String str, InputStream inputStream, IoUtils.CopyListener copyListener) {
        boolean save = super.save(str, inputStream, copyListener);
        rememberUsage(str);
        return save;
    }
}
