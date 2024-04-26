package com.rp.rptool.util;

public class j {
    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[b()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int b() {
        return 128;
    }
}
