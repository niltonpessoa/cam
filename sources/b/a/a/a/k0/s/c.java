package b.a.a.a.k0.s;

import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.k;
import b.a.a.a.k0.n;
import b.a.a.a.r0.m;
import b.a.a.a.u;

public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private g f403a;

    /* renamed from: b  reason: collision with root package name */
    private h f404b;
    private boolean c;

    private static m b(m mVar) {
        mVar.J(0);
        return mVar;
    }

    private boolean c(f fVar) {
        h gVar;
        e eVar = new e();
        if (eVar.a(fVar, true) && (eVar.f408b & 2) == 2) {
            int min = Math.min(eVar.f, 8);
            m mVar = new m(min);
            fVar.h(mVar.f734a, 0, min);
            b(mVar);
            if (b.o(mVar)) {
                gVar = new b();
            } else {
                b(mVar);
                if (j.p(mVar)) {
                    gVar = new j();
                } else {
                    b(mVar);
                    if (g.n(mVar)) {
                        gVar = new g();
                    }
                }
            }
            this.f404b = gVar;
            return true;
        }
        return false;
    }

    public void a() {
    }

    public void d(g gVar) {
        this.f403a = gVar;
    }

    public void f(long j, long j2) {
        h hVar = this.f404b;
        if (hVar != null) {
            hVar.k(j, j2);
        }
    }

    public int g(f fVar, k kVar) {
        if (this.f404b == null) {
            if (c(fVar)) {
                fVar.b();
            } else {
                throw new u("Failed to determine bitstream type");
            }
        }
        if (!this.c) {
            n f = this.f403a.f(0, 1);
            this.f403a.d();
            this.f404b.c(this.f403a, f);
            this.c = true;
        }
        return this.f404b.f(fVar, kVar);
    }

    public boolean h(f fVar) {
        try {
            return c(fVar);
        } catch (u unused) {
            return false;
        }
    }
}
