package com.rp.rptool.util;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f950a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f951b = new byte[128];

    public k(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        this.f950a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        byte[] bArr3 = this.f951b;
        System.arraycopy(bArr, 128, bArr3, 0, bArr3.length);
    }
}
