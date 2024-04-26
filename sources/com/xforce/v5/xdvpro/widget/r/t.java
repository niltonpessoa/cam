package com.xforce.v5.xdvpro.widget.r;

public class t implements o {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f1277a = new int[256];

    public r a(r rVar) {
        for (int i = 0; i <= 255; i++) {
            this.f1277a[i] = b(i);
        }
        for (int i2 = 0; i2 < rVar.m() - 1; i2++) {
            for (int i3 = 0; i3 < rVar.i() - 1; i3++) {
                int l = rVar.l(i2, i3);
                int h = rVar.h(i2, i3);
                int f = rVar.f(i2, i3);
                rVar.o(i2, i3, r.b(this.f1277a[l]), r.b(this.f1277a[h]), r.b(this.f1277a[f]));
            }
        }
        return rVar;
    }

    /* access modifiers changed from: protected */
    public int b(int i) {
        throw null;
    }
}
