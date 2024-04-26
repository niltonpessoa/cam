package b.a.a.a.k0.t;

import b.a.a.a.j0.a;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;
import java.util.Collections;
import java.util.List;

public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List<w.a> f432a;

    /* renamed from: b  reason: collision with root package name */
    private final n[] f433b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public g(List<w.a> list) {
        this.f432a = list;
        this.f433b = new n[list.size()];
    }

    private boolean b(m mVar, int i) {
        if (mVar.a() == 0) {
            return false;
        }
        if (mVar.x() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    public void a() {
        this.c = false;
    }

    public void c(m mVar) {
        if (!this.c) {
            return;
        }
        if (this.d != 2 || b(mVar, 32)) {
            if (this.d != 1 || b(mVar, 0)) {
                int c2 = mVar.c();
                int a2 = mVar.a();
                for (n a3 : this.f433b) {
                    mVar.J(c2);
                    a3.a(mVar, a2);
                }
                this.e += a2;
            }
        }
    }

    public void d(long j, boolean z) {
        if (z) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    public void e() {
        if (this.c) {
            for (n d2 : this.f433b) {
                d2.d(this.f, 1, this.e, 0, (n.a) null);
            }
            this.c = false;
        }
    }

    public void f(b.a.a.a.k0.g gVar, w.d dVar) {
        for (int i = 0; i < this.f433b.length; i++) {
            w.a aVar = this.f432a.get(i);
            dVar.a();
            n f2 = gVar.f(dVar.c(), 3);
            f2.c(b.a.a.a.n.i(dVar.b(), "application/dvbsubs", (String) null, -1, 0, Collections.singletonList(aVar.f475b), aVar.f474a, (a) null));
            this.f433b[i] = f2;
        }
    }
}
