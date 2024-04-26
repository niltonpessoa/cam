package com.rp.rptool.util;

public class b {
    public static final int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final short b(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static final byte[] c(int i) {
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }
}
