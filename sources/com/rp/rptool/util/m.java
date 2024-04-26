package com.rp.rptool.util;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public int f952a;

    /* renamed from: b  reason: collision with root package name */
    public int f953b;
    public byte[] c = new byte[200];

    public m(byte[] bArr) {
        this.f952a = b.b(bArr, 0);
        this.f953b = b.b(bArr, 4);
        byte[] bArr2 = this.c;
        System.arraycopy(bArr, 8, bArr2, 0, bArr2.length);
    }
}
