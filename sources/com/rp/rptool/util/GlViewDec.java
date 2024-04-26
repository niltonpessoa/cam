package com.rp.rptool.util;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public class GlViewDec extends GLSurfaceView {
    private static final boolean DEBUG = false;
    public static final String TAG = "XVIDVIEW";

    private static class b implements GLSurfaceView.EGLConfigChooser {
        private static int[] h = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

        /* renamed from: a  reason: collision with root package name */
        protected int f920a;

        /* renamed from: b  reason: collision with root package name */
        protected int f921b;
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        private int[] g = new int[1];

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f920a = i;
            this.f921b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }

        private int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.g) ? this.g[0] : i2;
        }

        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int b2 = b(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int b3 = b(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (b2 >= this.e && b3 >= this.f) {
                    EGL10 egl103 = egl10;
                    EGLDisplay eGLDisplay3 = eGLDisplay;
                    EGLConfig eGLConfig3 = eGLConfig;
                    int b4 = b(egl103, eGLDisplay3, eGLConfig3, 12324, 0);
                    int b5 = b(egl103, eGLDisplay3, eGLConfig3, 12323, 0);
                    int b6 = b(egl103, eGLDisplay3, eGLConfig3, 12322, 0);
                    int b7 = b(egl103, eGLDisplay3, eGLConfig3, 12321, 0);
                    if (b4 == this.f920a && b5 == this.f921b && b6 == this.c && b7 == this.d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, h, (EGLConfig[]) null, 0, iArr);
            int i = iArr[0];
            if (i > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                egl10.eglChooseConfig(eGLDisplay, h, eGLConfigArr, i, iArr);
                return a(egl10, eGLDisplay, eGLConfigArr);
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }
    }

    private static class c implements GLSurfaceView.EGLContextFactory {

        /* renamed from: a  reason: collision with root package name */
        private static int f922a = 12440;

        private c() {
        }

        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            Log.w(GlViewDec.TAG, "creating OpenGL ES 2.0 context");
            GlViewDec.checkEglError("Before eglCreateContext", egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{f922a, 2, 12344});
            GlViewDec.checkEglError("After eglCreateContext", egl10);
            return eglCreateContext;
        }

        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            Log.w(GlViewDec.TAG, "destroy OpenGL ES 2.0 context");
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public GlViewDec(Context context) {
        super(context);
        Log.w(TAG, "GL2JNIView context");
        init(DEBUG, 0, 0);
    }

    public GlViewDec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.w(TAG, "GL2JNIView context att");
        init(DEBUG, 0, 0);
    }

    public GlViewDec(Context context, boolean z, int i, int i2) {
        super(context);
        Log.w(TAG, "GL2JNIView context translucent");
        init(z, i, i2);
    }

    /* access modifiers changed from: private */
    public static void checkEglError(String str, EGL10 egl10) {
        do {
        } while (egl10.eglGetError() != 12288);
    }

    private void init(boolean z, int i, int i2) {
        b bVar;
        if (z) {
            getHolder().setFormat(-3);
        }
        setEGLContextFactory(new c());
        if (z) {
            int i3 = i;
            int i4 = i2;
        } else {
            new b(5, 6, 5, 0, i, i2);
        }
        setEGLConfigChooser(bVar);
        Log.w(TAG, "GL2JNIView init finished");
    }
}
