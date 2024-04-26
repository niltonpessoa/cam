package b.a.a.a.n0;

import b.a.a.a.e0;
import b.a.a.a.n;
import b.a.a.a.n0.e;
import b.a.a.a.o;
import b.a.a.a.r0.j;

public final class a implements e, e.a {

    /* renamed from: a  reason: collision with root package name */
    public final e f544a;

    /* renamed from: b  reason: collision with root package name */
    private e.a f545b;
    private C0030a[] c = new C0030a[0];
    private long d;
    long e;
    long f;

    /* renamed from: b.a.a.a.n0.a$a  reason: collision with other inner class name */
    private final class C0030a implements j {

        /* renamed from: a  reason: collision with root package name */
        public final j f546a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f547b;

        public C0030a(j jVar) {
            this.f546a = jVar;
        }

        public int a(o oVar, b.a.a.a.i0.e eVar, boolean z) {
            if (a.this.f()) {
                return -3;
            }
            if (this.f547b) {
                eVar.l(4);
                return -4;
            }
            int a2 = this.f546a.a(oVar, eVar, z);
            if (a2 == -5) {
                n nVar = oVar.f593a;
                int i = nVar.u;
                if (!(i == -1 && nVar.v == -1)) {
                    a aVar = a.this;
                    int i2 = 0;
                    if (aVar.e != 0) {
                        i = 0;
                    }
                    if (aVar.f == Long.MIN_VALUE) {
                        i2 = nVar.v;
                    }
                    oVar.f593a = nVar.b(i, i2);
                }
                return -5;
            }
            a aVar2 = a.this;
            long j = aVar2.f;
            if (j == Long.MIN_VALUE || ((a2 != -4 || eVar.d < j) && !(a2 == -3 && aVar2.i() == Long.MIN_VALUE))) {
                if (a2 == -4 && !eVar.j()) {
                    eVar.d -= a.this.e;
                }
                return a2;
            }
            eVar.f();
            eVar.l(4);
            this.f547b = true;
            return -4;
        }

        public void b() {
            this.f546a.b();
        }

        public int c(long j) {
            if (a.this.f()) {
                return -3;
            }
            return this.f546a.c(a.this.e + j);
        }

        public void d() {
            this.f547b = false;
        }

        public boolean e() {
            return !a.this.f() && this.f546a.e();
        }
    }

    public a(e eVar, boolean z) {
        this.f544a = eVar;
        this.d = z ? 0 : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
    }

    private e0 c(long j, e0 e0Var) {
        long min = Math.min(j - this.e, e0Var.f230a);
        long j2 = this.f;
        long min2 = j2 == Long.MIN_VALUE ? e0Var.f231b : Math.min(j2 - j, e0Var.f231b);
        return (min == e0Var.f230a && min2 == e0Var.f231b) ? e0Var : new e0(min, min2);
    }

    private static boolean m(long j, b.a.a.a.p0.e[] eVarArr) {
        if (j != 0) {
            for (b.a.a.a.p0.e eVar : eVarArr) {
                if (eVar != null && !j.f(eVar.b().f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public long a(long j, e0 e0Var) {
        long j2 = this.e;
        if (j == j2) {
            return 0;
        }
        long j3 = j + j2;
        return this.f544a.a(j3, c(j3, e0Var)) - this.e;
    }

    public n b() {
        return this.f544a.b();
    }

    public void d(e eVar) {
        b.a.a.a.r0.a.f((this.e == -9223372036854775807L || this.f == -9223372036854775807L) ? false : true);
        this.f545b.d(this);
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.d != -9223372036854775807L;
    }

    /* renamed from: g */
    public void e(e eVar) {
        this.f545b.e(this);
    }

    public void h(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    public long i() {
        long i = this.f544a.i();
        if (i != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || i < j) {
                return Math.max(0, i - this.e);
            }
        }
        return Long.MIN_VALUE;
    }

    public void j() {
        this.f544a.j();
    }

    public void k(long j, boolean z) {
        this.f544a.k(j + this.e, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if ((r0.e + r3) > r5) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long l(b.a.a.a.p0.e[] r13, boolean[] r14, b.a.a.a.n0.j[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            b.a.a.a.n0.a$a[] r2 = new b.a.a.a.n0.a.C0030a[r2]
            r0.c = r2
            int r2 = r1.length
            b.a.a.a.n0.j[] r2 = new b.a.a.a.n0.j[r2]
            r10 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.length
            r11 = 0
            if (r3 >= r4) goto L_0x0025
            b.a.a.a.n0.a$a[] r4 = r0.c
            r5 = r1[r3]
            b.a.a.a.n0.a$a r5 = (b.a.a.a.n0.a.C0030a) r5
            r4[r3] = r5
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0020
            r4 = r4[r3]
            b.a.a.a.n0.j r11 = r4.f546a
        L_0x0020:
            r2[r3] = r11
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0025:
            b.a.a.a.n0.e r3 = r0.f544a
            long r4 = r0.e
            long r8 = r17 + r4
            r4 = r13
            r5 = r14
            r6 = r2
            r7 = r16
            long r3 = r3.l(r4, r5, r6, r7, r8)
            long r5 = r0.e
            long r3 = r3 - r5
            boolean r5 = r12.f()
            r6 = 0
            if (r5 == 0) goto L_0x004e
            int r5 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x004e
            long r8 = r0.e
            r5 = r13
            boolean r5 = m(r8, r13)
            if (r5 == 0) goto L_0x004e
            r8 = r3
            goto L_0x0053
        L_0x004e:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0053:
            r0.d = r8
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x006f
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x006d
            long r5 = r0.f
            r7 = -9223372036854775808
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x006f
            long r7 = r0.e
            long r7 = r7 + r3
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r5 = 0
            goto L_0x0070
        L_0x006f:
            r5 = 1
        L_0x0070:
            b.a.a.a.r0.a.f(r5)
        L_0x0073:
            int r5 = r1.length
            if (r10 >= r5) goto L_0x00a1
            r5 = r2[r10]
            if (r5 != 0) goto L_0x007f
            b.a.a.a.n0.a$a[] r5 = r0.c
            r5[r10] = r11
            goto L_0x0098
        L_0x007f:
            r5 = r1[r10]
            if (r5 == 0) goto L_0x008d
            b.a.a.a.n0.a$a[] r5 = r0.c
            r5 = r5[r10]
            b.a.a.a.n0.j r5 = r5.f546a
            r6 = r2[r10]
            if (r5 == r6) goto L_0x0098
        L_0x008d:
            b.a.a.a.n0.a$a[] r5 = r0.c
            b.a.a.a.n0.a$a r6 = new b.a.a.a.n0.a$a
            r7 = r2[r10]
            r6.<init>(r7)
            r5[r10] = r6
        L_0x0098:
            b.a.a.a.n0.a$a[] r5 = r0.c
            r5 = r5[r10]
            r1[r10] = r5
            int r10 = r10 + 1
            goto L_0x0073
        L_0x00a1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.a.l(b.a.a.a.p0.e[], boolean[], b.a.a.a.n0.j[], boolean[], long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 > r7) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long n(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.d = r0
            b.a.a.a.n0.a$a[] r0 = r6.c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.d()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            long r0 = r6.e
            long r7 = r7 + r0
            b.a.a.a.n0.e r0 = r6.f544a
            long r0 = r0.n(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0037
            long r7 = r6.e
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0038
            long r7 = r6.f
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0037
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0038
        L_0x0037:
            r2 = 1
        L_0x0038:
            b.a.a.a.r0.a.f(r2)
            long r7 = r6.e
            long r0 = r0 - r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.a.n(long):long");
    }

    public long o() {
        long o = this.f544a.o();
        if (o != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || o < j) {
                return o - this.e;
            }
        }
        return Long.MIN_VALUE;
    }

    public long p() {
        if (f()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long p = p();
            return p != -9223372036854775807L ? p : j;
        }
        long p2 = this.f544a.p();
        if (p2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        b.a.a.a.r0.a.f(p2 >= this.e);
        long j2 = this.f;
        if (j2 != Long.MIN_VALUE && p2 > j2) {
            z = false;
        }
        b.a.a.a.r0.a.f(z);
        return p2 - this.e;
    }

    public void q(e.a aVar, long j) {
        this.f545b = aVar;
        this.f544a.q(this, this.e + j);
    }

    public boolean r(long j) {
        return this.f544a.r(j + this.e);
    }

    public void t(long j) {
        this.f544a.t(j + this.e);
    }
}
