package com.xforce.v5.xdvpro.widget.r;

import android.app.Activity;

public class g implements o {

    /* renamed from: a  reason: collision with root package name */
    private r f1251a;

    /* renamed from: b  reason: collision with root package name */
    private float f1252b = 0.2f;

    public g(Activity activity, int i) {
        this.f1251a = r.a(activity, i);
    }

    public r a(r rVar) {
        int i = (int) (this.f1252b * 255.0f);
        int i2 = 255 - i;
        for (int i3 = 0; i3 < rVar.m(); i3++) {
            for (int i4 = 0; i4 < rVar.i(); i4++) {
                int m = i3 % this.f1251a.m();
                int i5 = i4 % this.f1251a.i();
                int l = rVar.l(i3, i4);
                int h = rVar.h(i3, i4);
                int f = rVar.f(i3, i4);
                int b2 = r.b(this.f1251a.l(m, i5) + l);
                rVar.o(i3, i4, ((l * i2) + (b2 * i)) >> 8, ((h * i2) + (r.b(this.f1251a.h(m, i5) + h) * i)) >> 8, ((f * i2) + (r.b(this.f1251a.f(m, i5) + f) * i)) >> 8);
            }
        }
        return rVar;
    }
}
