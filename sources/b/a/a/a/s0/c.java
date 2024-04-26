package b.a.a.a.s0;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import b.a.a.a.r0.w;

@TargetApi(17)
public final class c extends Surface {
    private static int c;
    private static boolean d;

    /* renamed from: a  reason: collision with root package name */
    private final b f752a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f753b;

    private static class b extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f754a = new int[1];

        /* renamed from: b  reason: collision with root package name */
        private EGLDisplay f755b;
        private EGLContext c;
        private EGLSurface d;
        private Handler e;
        private SurfaceTexture f;
        private Error g;
        private RuntimeException h;
        private c i;

        public b() {
            super("dummySurface");
        }

        private void b(int i2) {
            EGLSurface eGLSurface;
            boolean z = false;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f755b = eglGetDisplay;
            b.a.a.a.r0.a.g(eglGetDisplay != null, "eglGetDisplay failed");
            int[] iArr = new int[2];
            b.a.a.a.r0.a.g(EGL14.eglInitialize(this.f755b, iArr, 0, iArr, 1), "eglInitialize failed");
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            b.a.a.a.r0.a.g(EGL14.eglChooseConfig(this.f755b, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.f755b, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            this.c = eglCreateContext;
            b.a.a.a.r0.a.g(eglCreateContext != null, "eglCreateContext failed");
            if (i2 == 1) {
                eGLSurface = EGL14.EGL_NO_SURFACE;
            } else {
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f755b, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.d = eglCreatePbufferSurface;
                b.a.a.a.r0.a.g(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                eGLSurface = this.d;
            }
            b.a.a.a.r0.a.g(EGL14.eglMakeCurrent(this.f755b, eGLSurface, eGLSurface, this.c), "eglMakeCurrent failed");
            GLES20.glGenTextures(1, this.f754a, 0);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f754a[0]);
            this.f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            SurfaceTexture surfaceTexture2 = this.f;
            if (i2 != 0) {
                z = true;
            }
            this.i = new c(this, surfaceTexture2, z);
        }

        private void d() {
            try {
                SurfaceTexture surfaceTexture = this.f;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, this.f754a, 0);
                }
            } finally {
                EGLSurface eGLSurface = this.d;
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(this.f755b, eGLSurface);
                }
                EGLContext eGLContext = this.c;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(this.f755b, eGLContext);
                }
                this.d = null;
                this.c = null;
                this.f755b = null;
                this.i = null;
                this.f = null;
            }
        }

        public c a(int i2) {
            boolean z;
            start();
            this.e = new Handler(getLooper(), this);
            synchronized (this) {
                z = false;
                this.e.obtainMessage(1, i2, 0).sendToTarget();
                while (this.i == null && this.h == null && this.g == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.h;
            if (runtimeException == null) {
                Error error = this.g;
                if (error == null) {
                    return this.i;
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            this.e.sendEmptyMessage(3);
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.h = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    try {
                        Log.e("DummySurface", "Failed to initialize dummy surface", e3);
                        this.g = e3;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i2 == 2) {
                this.f.updateTexImage();
                return true;
            } else if (i2 != 3) {
                return true;
            } else {
                try {
                    d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.e.sendEmptyMessage(2);
        }
    }

    private c(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f752a = bVar;
    }

    private static void a() {
        if (w.f743a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    private static int b(Context context) {
        String eglQueryString;
        int i = w.f743a;
        if (i < 26 && ("samsung".equals(w.c) || "XT1650".equals(w.d))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z;
        synchronized (c.class) {
            z = true;
            if (!d) {
                c = w.f743a < 24 ? 0 : b(context);
                d = true;
            }
            if (c == 0) {
                z = false;
            }
        }
        return z;
    }

    public static c d(Context context, boolean z) {
        a();
        int i = 0;
        b.a.a.a.r0.a.f(!z || c(context));
        b bVar = new b();
        if (z) {
            i = c;
        }
        return bVar.a(i);
    }

    public void release() {
        super.release();
        synchronized (this.f752a) {
            if (!this.f753b) {
                this.f752a.c();
                this.f753b = true;
            }
        }
    }
}
