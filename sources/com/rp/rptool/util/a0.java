package com.rp.rptool.util;

public class a0 {
    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[b()];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, 128, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, 256, bArr3.length);
        return bArr4;
    }

    public static int b() {
        return 384;
    }
}
