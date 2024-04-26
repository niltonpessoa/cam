package com.xforce.v5.xdvpro.widget.r;

import com.xforce.v5.xdvpro.widget.r.o;

public class c0 implements o {

    /* renamed from: a  reason: collision with root package name */
    int f1241a;

    public c0(int i) {
        this.f1241a = i < 2 ? 2 : i;
    }

    public r a(r rVar) {
        int i;
        int m = rVar.m();
        int i2 = rVar.i();
        r d = rVar.clone();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            while (i5 < m) {
                if (i5 == 0) {
                    i = (w.b(-255, 255) % this.f1241a) * (w.b(-255, 255) % 2 > 0 ? 1 : -1);
                } else {
                    i = i3;
                }
                int a2 = o.a.a(i5 + i, 0, m - 1);
                rVar.o(i5, i4, d.l(a2, i4), d.h(a2, i4), d.f(a2, i4));
                i5++;
                i3 = i;
            }
        }
        return rVar;
    }
}
