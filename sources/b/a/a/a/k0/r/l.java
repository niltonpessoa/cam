package b.a.a.a.k0.r;

import b.a.a.a.k0.f;
import b.a.a.a.r0.m;

final class l {

    /* renamed from: a  reason: collision with root package name */
    public c f394a;

    /* renamed from: b  reason: collision with root package name */
    public long f395b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public k o;
    public int p;
    public m q;
    public boolean r;
    public long s;

    l() {
    }

    public void a(f fVar) {
        fVar.i(this.q.f734a, 0, this.p);
        this.q.J(0);
        this.r = false;
    }

    public void b(m mVar) {
        mVar.g(this.q.f734a, 0, this.p);
        this.q.J(0);
        this.r = false;
    }

    public long c(int i2) {
        return this.k[i2] + ((long) this.j[i2]);
    }

    public void d(int i2) {
        m mVar = this.q;
        if (mVar == null || mVar.d() < i2) {
            this.q = new m(i2);
        }
        this.p = i2;
        this.m = true;
        this.r = true;
    }

    public void e(int i2, int i3) {
        this.e = i2;
        this.f = i3;
        int[] iArr = this.h;
        if (iArr == null || iArr.length < i2) {
            this.g = new long[i2];
            this.h = new int[i2];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.i = new int[i4];
            this.j = new int[i4];
            this.k = new long[i4];
            this.l = new boolean[i4];
            this.n = new boolean[i4];
        }
    }

    public void f() {
        this.e = 0;
        this.s = 0;
        this.m = false;
        this.r = false;
        this.o = null;
    }
}
