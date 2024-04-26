package com.rp.rptool.util;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public int f945a;

    /* renamed from: b  reason: collision with root package name */
    public int f946b;
    public byte[] c = new byte[4];

    public f(byte[] bArr) {
        this.f945a = b.b(bArr, 0);
        this.f946b = b.b(bArr, 4);
        byte[] bArr2 = this.c;
        System.arraycopy(bArr, 8, bArr2, 0, bArr2.length);
    }
}
