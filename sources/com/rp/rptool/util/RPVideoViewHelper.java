package com.rp.rptool.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class RPVideoViewHelper {
    public static final String TAG = "UNVideoViewHelper";
    /* access modifiers changed from: private */
    public boolean isShotCut = false;
    private boolean isVideoViewShow = false;
    private Context mContext;
    private SurfaceHolder mHolder;
    private RelativeLayout mParentView;
    private GlViewDec mRenderView;
    private b mRenderer;
    private List<Bitmap> mShotCutList = null;
    private c videoViewListener;

    class a implements SurfaceHolder.Callback {
        a(RPVideoViewHelper rPVideoViewHelper) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            c0.a(0, RPVideoViewHelper.TAG, " Video display surface is being changed. width " + i2 + "height " + i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            c0.a(0, RPVideoViewHelper.TAG, "Video display surface created");
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            c0.a(0, RPVideoViewHelper.TAG, "Video display surface destroyed");
        }
    }

    private class b implements GLSurfaceView.Renderer {

        /* renamed from: a  reason: collision with root package name */
        long f923a = 0;

        /* renamed from: b  reason: collision with root package name */
        boolean f924b = false;
        int c;
        int d;

        public b() {
            c0.a(0, RPVideoViewHelper.TAG, "Renderer Create");
        }

        public void a(long j) {
            c0.a(0, RPVideoViewHelper.TAG, "rptest --- set ptr:" + Long.toHexString(j));
            synchronized (this) {
                if (j != 0) {
                    if (j != this.f923a) {
                        this.f924b = true;
                    }
                }
                this.f923a = j;
            }
        }

        public void b(long j) {
            this.f923a = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                long r0 = r7.f923a     // Catch:{ all -> 0x003b }
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0010
                r0 = 16640(0x4100, float:2.3318E-41)
                r8.glClear(r0)     // Catch:{ all -> 0x003b }
                monitor-exit(r7)     // Catch:{ all -> 0x003b }
                return
            L_0x0010:
                boolean r4 = r7.f924b     // Catch:{ all -> 0x003b }
                r5 = 0
                if (r4 == 0) goto L_0x001e
                int r4 = r7.c     // Catch:{ all -> 0x003b }
                int r6 = r7.d     // Catch:{ all -> 0x003b }
                com.rp.rptool.util.RPVideoViewHelper.init(r0, r4, r6)     // Catch:{ all -> 0x003b }
                r7.f924b = r5     // Catch:{ all -> 0x003b }
            L_0x001e:
                long r0 = r7.f923a     // Catch:{ all -> 0x003b }
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L_0x0027
                com.rp.rptool.util.RPVideoViewHelper.render(r0)     // Catch:{ all -> 0x003b }
            L_0x0027:
                com.rp.rptool.util.RPVideoViewHelper r0 = com.rp.rptool.util.RPVideoViewHelper.this     // Catch:{ all -> 0x003b }
                boolean r0 = r0.isShotCut     // Catch:{ all -> 0x003b }
                if (r0 == 0) goto L_0x0039
                com.rp.rptool.util.RPVideoViewHelper r0 = com.rp.rptool.util.RPVideoViewHelper.this     // Catch:{ all -> 0x003b }
                boolean unused = r0.isShotCut = r5     // Catch:{ all -> 0x003b }
                com.rp.rptool.util.RPVideoViewHelper r0 = com.rp.rptool.util.RPVideoViewHelper.this     // Catch:{ all -> 0x003b }
                android.graphics.Bitmap unused = r0.SavePixels(r8)     // Catch:{ all -> 0x003b }
            L_0x0039:
                monitor-exit(r7)     // Catch:{ all -> 0x003b }
                return
            L_0x003b:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x003b }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rp.rptool.util.RPVideoViewHelper.b.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            c0.a(0, RPVideoViewHelper.TAG, "onSurfaceChanged width " + i + "height " + i2);
            this.c = i;
            this.d = i2;
            this.f924b = true;
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            c0.a(0, RPVideoViewHelper.TAG, "onSurfaceCreated");
        }
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();
    }

    public RPVideoViewHelper(Context context, RelativeLayout relativeLayout) {
        this.mContext = context;
        this.mParentView = relativeLayout;
        init();
    }

    /* access modifiers changed from: private */
    public Bitmap SavePixels(GL10 gl10) {
        c0.a(0, TAG, "SavePixels");
        ViewGroup.LayoutParams layoutParams = this.mParentView.getLayoutParams();
        int i = layoutParams.height;
        int i2 = layoutParams.width;
        c0.a(0, TAG, "x = " + 0 + ";y = " + 0 + ";h = " + i + "; w = " + i2);
        int i3 = i2 * i;
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        gl10.glReadPixels(0, 0, i2, i, 6408, 5121, wrap);
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = iArr[(i4 * i2) + i5];
                iArr2[(((i - i4) - 1) * i2) + i5] = (i6 & -16711936) | ((i6 << 16) & 16711680) | ((i6 >> 16) & 255);
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, i2, i, Bitmap.Config.ARGB_8888);
        if (this.mShotCutList == null) {
            this.mShotCutList = new ArrayList();
        }
        this.mShotCutList.add(createBitmap);
        c cVar = this.videoViewListener;
        if (cVar != null) {
            cVar.b();
        }
        c0.a(0, TAG, "sb height = " + createBitmap.getHeight());
        return createBitmap;
    }

    private void init() {
        GlViewDec glViewDec = new GlViewDec(this.mContext);
        this.mRenderView = glViewDec;
        this.mParentView.addView(glViewDec);
        ViewGroup.LayoutParams layoutParams = this.mRenderView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.mRenderView.setLayoutParams(layoutParams);
        this.mRenderView.setZOrderOnTop(false);
        this.mRenderView.getHolder().addCallback(new a(this));
        b bVar = new b();
        this.mRenderer = bVar;
        this.mRenderView.setRenderer(bVar);
        this.mRenderView.setRenderMode(1);
    }

    /* access modifiers changed from: private */
    public static native void init(long j, int i, int i2);

    /* access modifiers changed from: private */
    public static native void render(long j);

    private void setOpenGLESDisplay(long j) {
        c0.a(0, TAG, "setOpenGLESDisplay");
        this.mRenderer.a(j);
    }

    private void showFrameCallBack() {
        c cVar = this.videoViewListener;
        if (cVar == null) {
            c0.a(3, TAG, "showFrameCallBack  mListener = null");
        } else if (!this.isVideoViewShow) {
            cVar.c();
            this.isVideoViewShow = true;
        } else {
            cVar.d();
        }
    }

    private void stopFrameCallBack() {
        c0.a(0, TAG, "stopFrameCallBack");
        this.isVideoViewShow = false;
        this.mRenderer.b(0);
        c cVar = this.videoViewListener;
        if (cVar == null) {
            c0.a(0, TAG, "stopFrameCallBack  mListener = null");
        } else {
            cVar.a();
        }
    }

    public Bitmap getShotCut() {
        if (this.mShotCutList.size() <= 0) {
            return null;
        }
        c0.a(0, TAG, "mShotCutList size = " + this.mShotCutList.size());
        Bitmap bitmap = this.mShotCutList.get(0);
        this.mShotCutList.remove(0);
        return bitmap;
    }

    public void goShotCut() {
        this.isShotCut = true;
    }

    public boolean isVideoViewShow() {
        return this.isVideoViewShow;
    }

    public void setVideoViewListener(c cVar) {
        this.videoViewListener = cVar;
    }
}
