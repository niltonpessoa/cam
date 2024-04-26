package com.rp.rptool.util;

public class v {
    public static Object j;
    private static a jniCallbackListener;

    public interface a {
        void a(int i, byte[] bArr, int i2, byte[] bArr2, int i3);
    }

    static {
        try {
            System.loadLibrary("vc");
            System.loadLibrary("vb");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    public static int UNCallbackFunc(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        a aVar = jniCallbackListener;
        if (aVar == null) {
            return 0;
        }
        aVar.a(i, bArr, i2, bArr2, i3);
        return 0;
    }

    public static native int cd(String str, String str2);

    public static native int dd(int i);

    public static native int dt();

    public static native void gd(int i);

    public static native int gn(int i, byte[] bArr);

    public static native String it(String str);

    public static native int pd(int i, String str);

    public static native int sa(int i);

    public static native int sac(int i, int i2, byte[] bArr, int i3);

    public static native int sam(int i);

    public static native int sbm(int i);

    public static native int sda(int i, byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3);

    public static native int sed();

    public static void setJniCallbackListener(a aVar) {
        jniCallbackListener = aVar;
    }

    public static native int sp(int i);

    public static native int spb(int i, byte[] bArr);

    public static native int spbm(int i);

    public static native int spm(int i);

    public static native int ss(Object obj, int i);

    public static native int ssm(int i);

    public static native int st(Object obj);

    public static native int sv(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3);

    public static void yt() {
        f0.c(j);
    }
}
