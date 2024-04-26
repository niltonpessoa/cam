package b.a.a.a.k0.s;

import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.k;
import b.a.a.a.k0.l;
import b.a.a.a.k0.n;
import b.a.a.a.r0.m;

abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final d f409a = new d();

    /* renamed from: b  reason: collision with root package name */
    private n f410b;
    private g c;
    private f d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private b j;
    private long k;
    private boolean l;
    private boolean m;

    static class b {

        /* renamed from: a  reason: collision with root package name */
        b.a.a.a.n f411a;

        /* renamed from: b  reason: collision with root package name */
        f f412b;

        b() {
        }
    }

    private static final class c implements f {
        private c() {
        }

        public long a(f fVar) {
            return -1;
        }

        public l d() {
            return new l.b(-9223372036854775807L);
        }

        public long f(long j) {
            return 0;
        }
    }

    private int g(f fVar) {
        boolean z = true;
        while (z) {
            if (!this.f409a.d(fVar)) {
                this.h = 3;
                return -1;
            }
            this.k = fVar.k() - this.f;
            z = h(this.f409a.c(), this.f, this.j);
            if (z) {
                this.f = fVar.k();
            }
        }
        b.a.a.a.n nVar = this.j.f411a;
        this.i = nVar.s;
        if (!this.m) {
            this.f410b.c(nVar);
            this.m = true;
        }
        f fVar2 = this.j.f412b;
        if (fVar2 != null) {
            this.d = fVar2;
        } else if (fVar.getLength() == -1) {
            this.d = new c();
        } else {
            e b2 = this.f409a.b();
            this.d = new a(this.f, fVar.getLength(), this, b2.e + b2.f, b2.c);
        }
        this.j = null;
        this.h = 2;
        this.f409a.f();
        return 0;
    }

    private int i(f fVar, k kVar) {
        f fVar2 = fVar;
        long a2 = this.d.a(fVar2);
        if (a2 >= 0) {
            kVar.f320a = a2;
            return 1;
        }
        if (a2 < -1) {
            d(-(a2 + 2));
        }
        if (!this.l) {
            this.c.c(this.d.d());
            this.l = true;
        }
        if (this.k > 0 || this.f409a.d(fVar2)) {
            this.k = 0;
            m c2 = this.f409a.c();
            long e2 = e(c2);
            if (e2 >= 0) {
                long j2 = this.g;
                if (j2 + e2 >= this.e) {
                    long a3 = a(j2);
                    this.f410b.a(c2, c2.d());
                    this.f410b.d(a3, 1, c2.d(), 0, (n.a) null);
                    this.e = -1;
                }
            }
            this.g += e2;
            return 0;
        }
        this.h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public long a(long j2) {
        return (j2 * 1000000) / ((long) this.i);
    }

    /* access modifiers changed from: protected */
    public long b(long j2) {
        return (((long) this.i) * j2) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public void c(g gVar, n nVar) {
        this.c = gVar;
        this.f410b = nVar;
        j(true);
    }

    /* access modifiers changed from: protected */
    public void d(long j2) {
        this.g = j2;
    }

    /* access modifiers changed from: protected */
    public abstract long e(m mVar);

    /* access modifiers changed from: package-private */
    public final int f(f fVar, k kVar) {
        int i2 = this.h;
        if (i2 == 0) {
            return g(fVar);
        }
        if (i2 == 1) {
            fVar.c((int) this.f);
            this.h = 2;
            return 0;
        } else if (i2 == 2) {
            return i(fVar, kVar);
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean h(m mVar, long j2, b bVar);

    /* access modifiers changed from: protected */
    public void j(boolean z) {
        int i2;
        if (z) {
            this.j = new b();
            this.f = 0;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.h = i2;
        this.e = -1;
        this.g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void k(long j2, long j3) {
        this.f409a.e();
        if (j2 == 0) {
            j(!this.l);
        } else if (this.h != 0) {
            this.e = this.d.f(j3);
            this.h = 2;
        }
    }
}
