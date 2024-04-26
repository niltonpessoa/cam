package b.a.a.a.k0.o;

import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.k;
import b.a.a.a.k0.l;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;

public final class b implements e {
    private static final int p = w.o("FLV");

    /* renamed from: a  reason: collision with root package name */
    private final m f330a = new m(4);

    /* renamed from: b  reason: collision with root package name */
    private final m f331b = new m(9);
    private final m c = new m(11);
    private final m d = new m();
    private final c e = new c();
    private g f;
    private int g = 1;
    private long h = -9223372036854775807L;
    private int i;
    private int j;
    private int k;
    private long l;
    private boolean m;
    private a n;
    private e o;

    private void b() {
        if (!this.m) {
            this.f.c(new l.b(-9223372036854775807L));
            this.m = true;
        }
        if (this.h == -9223372036854775807L) {
            this.h = this.e.d() == -9223372036854775807L ? -this.l : 0;
        }
    }

    private m c(f fVar) {
        if (this.k > this.d.b()) {
            m mVar = this.d;
            mVar.H(new byte[Math.max(mVar.b() * 2, this.k)], 0);
        } else {
            this.d.J(0);
        }
        this.d.I(this.k);
        fVar.i(this.d.f734a, 0, this.k);
        return this.d;
    }

    private boolean e(f fVar) {
        boolean z = false;
        if (!fVar.e(this.f331b.f734a, 0, 9, true)) {
            return false;
        }
        this.f331b.J(0);
        this.f331b.K(4);
        int x = this.f331b.x();
        boolean z2 = (x & 4) != 0;
        if ((x & 1) != 0) {
            z = true;
        }
        if (z2 && this.n == null) {
            this.n = new a(this.f.f(8, 1));
        }
        if (z && this.o == null) {
            this.o = new e(this.f.f(9, 2));
        }
        this.f.d();
        this.i = (this.f331b.i() - 9) + 4;
        this.g = 2;
        return true;
    }

    private boolean i(f fVar) {
        d dVar;
        int i2 = this.j;
        boolean z = true;
        if (i2 == 8 && this.n != null) {
            b();
            dVar = this.n;
        } else if (i2 == 9 && this.o != null) {
            b();
            dVar = this.o;
        } else if (i2 != 18 || this.m) {
            fVar.c(this.k);
            z = false;
            this.i = 4;
            this.g = 2;
            return z;
        } else {
            this.e.a(c(fVar), this.l);
            long d2 = this.e.d();
            if (d2 != -9223372036854775807L) {
                this.f.c(new l.b(d2));
                this.m = true;
            }
            this.i = 4;
            this.g = 2;
            return z;
        }
        dVar.a(c(fVar), this.h + this.l);
        this.i = 4;
        this.g = 2;
        return z;
    }

    private boolean j(f fVar) {
        if (!fVar.e(this.c.f734a, 0, 11, true)) {
            return false;
        }
        this.c.J(0);
        this.j = this.c.x();
        this.k = this.c.A();
        this.l = (long) this.c.A();
        this.l = (((long) (this.c.x() << 24)) | this.l) * 1000;
        this.c.K(3);
        this.g = 4;
        return true;
    }

    private void k(f fVar) {
        fVar.c(this.i);
        this.i = 0;
        this.g = 3;
    }

    public void a() {
    }

    public void d(g gVar) {
        this.f = gVar;
    }

    public void f(long j2, long j3) {
        this.g = 1;
        this.h = -9223372036854775807L;
        this.i = 0;
    }

    public int g(f fVar, k kVar) {
        while (true) {
            int i2 = this.g;
            if (i2 != 1) {
                if (i2 == 2) {
                    k(fVar);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    } else if (i(fVar)) {
                        return 0;
                    }
                } else if (!j(fVar)) {
                    return -1;
                }
            } else if (!e(fVar)) {
                return -1;
            }
        }
    }

    public boolean h(f fVar) {
        fVar.h(this.f330a.f734a, 0, 3);
        this.f330a.J(0);
        if (this.f330a.A() != p) {
            return false;
        }
        fVar.h(this.f330a.f734a, 0, 2);
        this.f330a.J(0);
        if ((this.f330a.D() & 250) != 0) {
            return false;
        }
        fVar.h(this.f330a.f734a, 0, 4);
        this.f330a.J(0);
        int i2 = this.f330a.i();
        fVar.b();
        fVar.j(i2);
        fVar.h(this.f330a.f734a, 0, 4);
        this.f330a.J(0);
        return this.f330a.i() == 0;
    }
}
