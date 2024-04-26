package com.xforce.v5.xdvpro.widget.r;

public class v implements o {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1280a = true;

    public v(boolean z) {
        this.f1280a = z;
    }

    public r a(r rVar) {
        int i = rVar.i();
        int m = rVar.m();
        if (this.f1280a) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < m / 2; i3++) {
                    int k = rVar.k(i3, i2);
                    int i4 = (m - 1) - i3;
                    int k2 = rVar.k(i4, i2);
                    rVar.n(i4, i2, k);
                    rVar.n(i3, i2, k2);
                }
            }
        } else {
            for (int i5 = 0; i5 < m; i5++) {
                for (int i6 = 0; i6 < i / 2; i6++) {
                    int k3 = rVar.k(i5, i6);
                    int i7 = (i - 1) - i6;
                    int k4 = rVar.k(i5, i7);
                    rVar.n(i5, i7, k3);
                    rVar.n(i5, i6, k4);
                }
            }
        }
        return rVar;
    }
}
