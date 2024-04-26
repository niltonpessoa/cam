package com.rp.rptool.util;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public int f956a;

    /* renamed from: b  reason: collision with root package name */
    public int f957b;
    public byte[] c = new byte[64];

    public o(byte[] bArr) {
        this.f956a = b.b(bArr, 0);
        this.f957b = b.b(bArr, 4);
        byte[] bArr2 = this.c;
        System.arraycopy(bArr, 8, bArr2, 0, bArr2.length);
    }
}
