package com.xforce.v5.xdvpro.widget.r;

public class n implements o {

    /* renamed from: a  reason: collision with root package name */
    private float f1268a;

    public n(float f) {
        this.f1268a = Math.max(0.0f, Math.min(359.0f, f));
    }

    public r a(r rVar) {
        m mVar = new m(this.f1268a, 0.0f, 0.0f);
        for (int i = 0; i < rVar.m(); i++) {
            for (int i2 = 0; i2 < rVar.i(); i2++) {
                m.c(rVar.l(i, i2), rVar.h(i, i2), rVar.f(i, i2), mVar);
                mVar.f1266a = this.f1268a;
                rVar.n(i, i2, m.a(mVar));
            }
        }
        return rVar;
    }
}
