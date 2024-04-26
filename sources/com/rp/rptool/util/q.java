package com.rp.rptool.util;

public class q {
    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[b()];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, 32, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, 64, bArr3.length);
        return bArr4;
    }

    public static int b() {
        return 100;
    }
}
