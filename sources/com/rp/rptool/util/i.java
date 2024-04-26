package com.rp.rptool.util;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f948a;

    /* renamed from: b  reason: collision with root package name */
    public int f949b;

    public i(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        this.f948a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f949b = b.a(bArr, 128);
    }
}
