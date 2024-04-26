package com.rp.rptool.util;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f925a = new byte[21];

    /* renamed from: b  reason: collision with root package name */
    public byte[] f926b = new byte[16];
    public short c;

    public b0(byte[] bArr, int i) {
        byte[] bArr2 = this.f925a;
        System.arraycopy(bArr, a() * i, bArr2, 0, bArr2.length);
        int length = this.f925a.length + (a() * i);
        byte[] bArr3 = this.f926b;
        System.arraycopy(bArr, length, bArr3, 0, bArr3.length);
        this.c = b.b(bArr, (i * a()) + this.f925a.length + this.f926b.length);
    }

    public static int a() {
        return 41;
    }

    public String toString() {
        String trim = new String(this.f925a).trim();
        String trim2 = new String(this.f926b).trim();
        return "LanSearchInfo [UID=" + trim + ", IP=" + trim2 + ", port=" + this.c + "]";
    }
}
