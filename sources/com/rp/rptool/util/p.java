package com.rp.rptool.util;

public class p {
    public static byte[] a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[b()];
        System.arraycopy(b.c(i), 0, bArr2, 0, 4);
        System.arraycopy(b.c(i2), 0, bArr2, 4, 4);
        System.arraycopy(bArr, 0, bArr2, 8, bArr.length);
        return bArr2;
    }

    public static int b() {
        return 76;
    }
}
