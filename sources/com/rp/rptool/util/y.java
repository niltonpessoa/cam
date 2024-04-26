package com.rp.rptool.util;

public class y {
    public static byte[] a(int i, int i2, int i3, int i4, int i5, int i6) {
        byte[] bArr = new byte[b()];
        System.arraycopy(b.c(i), 0, bArr, 0, 4);
        System.arraycopy(b.c(i2), 0, bArr, 4, 4);
        System.arraycopy(b.c(i3), 0, bArr, 8, 4);
        System.arraycopy(b.c(0), 0, bArr, 12, 4);
        System.arraycopy(b.c(i4), 0, bArr, 16, 4);
        System.arraycopy(b.c(i5), 0, bArr, 20, 4);
        System.arraycopy(b.c(i6), 0, bArr, 24, 4);
        System.arraycopy(b.c(0), 0, bArr, 28, 4);
        return bArr;
    }

    public static int b() {
        return 32;
    }
}
