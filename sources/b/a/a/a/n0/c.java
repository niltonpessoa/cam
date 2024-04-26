package b.a.a.a.n0;

import android.net.Uri;
import android.os.Handler;
import b.a.a.a.e0;
import b.a.a.a.k0.g;
import b.a.a.a.k0.k;
import b.a.a.a.k0.l;
import b.a.a.a.n;
import b.a.a.a.n0.e;
import b.a.a.a.n0.g;
import b.a.a.a.n0.i;
import b.a.a.a.o;
import b.a.a.a.q0.h;
import b.a.a.a.q0.p;
import b.a.a.a.r0.j;
import b.a.a.a.r0.w;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

final class c implements e, g, p.a<C0031c>, p.d, i.b {
    private boolean[] A;
    private boolean[] B;
    private boolean[] C;
    private boolean D;
    private long E;
    private long F;
    private long G;
    private boolean H;
    private int I;
    private boolean J;
    /* access modifiers changed from: private */
    public boolean K;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f548a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a.a.a.q0.f f549b;
    private final int c;
    private final g.a d;
    private final e e;
    private final b.a.a.a.q0.b f;
    /* access modifiers changed from: private */
    public final String g;
    /* access modifiers changed from: private */
    public final long h;
    private final p i = new p("Loader:ExtractorMediaPeriod");
    private final d j;
    private final b.a.a.a.r0.e k;
    private final Runnable l;
    /* access modifiers changed from: private */
    public final Runnable m;
    /* access modifiers changed from: private */
    public final Handler n;
    /* access modifiers changed from: private */
    public e.a o;
    private l p;
    private i[] q;
    private int[] r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    private boolean w;
    private int x;
    private n y;
    private long z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            c.this.I();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            if (!c.this.K) {
                c.this.o.e(c.this);
            }
        }
    }

    /* renamed from: b.a.a.a.n0.c$c  reason: collision with other inner class name */
    final class C0031c implements p.c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f552a;

        /* renamed from: b  reason: collision with root package name */
        private final b.a.a.a.q0.f f553b;
        private final d c;
        private final b.a.a.a.r0.e d;
        private final k e = new k();
        private volatile boolean f;
        private boolean g = true;
        /* access modifiers changed from: private */
        public long h;
        /* access modifiers changed from: private */
        public h i;
        /* access modifiers changed from: private */
        public long j = -1;
        /* access modifiers changed from: private */
        public long k;

        public C0031c(Uri uri, b.a.a.a.q0.f fVar, d dVar, b.a.a.a.r0.e eVar) {
            b.a.a.a.r0.a.e(uri);
            this.f552a = uri;
            b.a.a.a.r0.a.e(fVar);
            this.f553b = fVar;
            b.a.a.a.r0.a.e(dVar);
            this.c = dVar;
            this.d = eVar;
        }

        public void a() {
            int i2 = 0;
            while (i2 == 0 && !this.f) {
                b.a.a.a.k0.b bVar = null;
                try {
                    long j2 = this.e.f320a;
                    h hVar = new h(this.f552a, j2, -1, c.this.g);
                    this.i = hVar;
                    long b2 = this.f553b.b(hVar);
                    this.j = b2;
                    if (b2 != -1) {
                        this.j = b2 + j2;
                    }
                    b.a.a.a.q0.f fVar = this.f553b;
                    b.a.a.a.k0.b bVar2 = new b.a.a.a.k0.b(fVar, j2, this.j);
                    try {
                        b.a.a.a.k0.e b3 = this.c.b(bVar2, fVar.c());
                        if (this.g) {
                            b3.f(j2, this.h);
                            this.g = false;
                        }
                        while (i2 == 0 && !this.f) {
                            this.d.a();
                            i2 = b3.g(bVar2, this.e);
                            if (bVar2.k() > c.this.h + j2) {
                                j2 = bVar2.k();
                                this.d.b();
                                c.this.n.post(c.this.m);
                            }
                        }
                        if (i2 == 1) {
                            i2 = 0;
                        } else {
                            this.e.f320a = bVar2.k();
                            this.k = this.e.f320a - this.i.c;
                        }
                        w.f(this.f553b);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        if (!(i2 == 1 || bVar == null)) {
                            this.e.f320a = bVar.k();
                            this.k = this.e.f320a - this.i.c;
                        }
                        w.f(this.f553b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.e.f320a = bVar.k();
                    this.k = this.e.f320a - this.i.c;
                    w.f(this.f553b);
                    throw th;
                }
            }
        }

        public boolean b() {
            return this.f;
        }

        public void c() {
            this.f = true;
        }

        public void h(long j2, long j3) {
            this.e.f320a = j2;
            this.h = j3;
            this.g = true;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final b.a.a.a.k0.e[] f554a;

        /* renamed from: b  reason: collision with root package name */
        private final b.a.a.a.k0.g f555b;
        private b.a.a.a.k0.e c;

        public d(b.a.a.a.k0.e[] eVarArr, b.a.a.a.k0.g gVar) {
            this.f554a = eVarArr;
            this.f555b = gVar;
        }

        public void a() {
            b.a.a.a.k0.e eVar = this.c;
            if (eVar != null) {
                eVar.a();
                this.c = null;
            }
        }

        public b.a.a.a.k0.e b(b.a.a.a.k0.f fVar, Uri uri) {
            b.a.a.a.k0.e eVar = this.c;
            if (eVar != null) {
                return eVar;
            }
            b.a.a.a.k0.e[] eVarArr = this.f554a;
            int length = eVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                b.a.a.a.k0.e eVar2 = eVarArr[i];
                try {
                    if (eVar2.h(fVar)) {
                        this.c = eVar2;
                        fVar.b();
                        break;
                    }
                    fVar.b();
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    fVar.b();
                    throw th;
                }
            }
            b.a.a.a.k0.e eVar3 = this.c;
            if (eVar3 != null) {
                eVar3.d(this.f555b);
                return this.c;
            }
            throw new o("None of the available extractors (" + w.m(this.f554a) + ") could read the stream.", uri);
        }
    }

    interface e {
        void c(long j, boolean z);
    }

    private final class f implements j {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f556a;

        public f(int i) {
            this.f556a = i;
        }

        public int a(o oVar, b.a.a.a.i0.e eVar, boolean z) {
            return c.this.P(this.f556a, oVar, eVar, z);
        }

        public void b() {
            c.this.L();
        }

        public int c(long j) {
            return c.this.S(this.f556a, j);
        }

        public boolean e() {
            return c.this.H(this.f556a);
        }
    }

    public c(Uri uri, b.a.a.a.q0.f fVar, b.a.a.a.k0.e[] eVarArr, int i2, g.a aVar, e eVar, b.a.a.a.q0.b bVar, String str, int i3) {
        this.f548a = uri;
        this.f549b = fVar;
        this.c = i2;
        this.d = aVar;
        this.e = eVar;
        this.f = bVar;
        this.g = str;
        this.h = (long) i3;
        this.j = new d(eVarArr, this);
        this.k = new b.a.a.a.r0.e();
        this.l = new a();
        this.m = new b();
        this.n = new Handler();
        this.r = new int[0];
        this.q = new i[0];
        this.G = -9223372036854775807L;
        this.E = -1;
        this.z = -9223372036854775807L;
        this.u = i2 == -1 ? 3 : i2;
    }

    private boolean B(C0031c cVar, int i2) {
        l lVar;
        if (this.E == -1 && ((lVar = this.p) == null || lVar.i() == -9223372036854775807L)) {
            if (!this.t || U()) {
                this.w = this.t;
                this.F = 0;
                this.I = 0;
                for (i x2 : this.q) {
                    x2.x();
                }
                cVar.h(0, 0);
                return true;
            }
            this.H = true;
            return false;
        }
        this.I = i2;
        return true;
    }

    private void C(C0031c cVar) {
        if (this.E == -1) {
            this.E = cVar.j;
        }
    }

    private int D() {
        int i2 = 0;
        for (i p2 : this.q) {
            i2 += p2.p();
        }
        return i2;
    }

    private long E() {
        long j2 = Long.MIN_VALUE;
        for (i m2 : this.q) {
            j2 = Math.max(j2, m2.m());
        }
        return j2;
    }

    private static boolean F(IOException iOException) {
        return iOException instanceof o;
    }

    private boolean G() {
        return this.G != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v1 ?, r4v3 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public void I() {
        /*
            r8 = this;
            boolean r0 = r8.K
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r8.t
            if (r0 != 0) goto L_0x00b0
            b.a.a.a.k0.l r0 = r8.p
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r8.s
            if (r0 != 0) goto L_0x0012
            goto L_0x00b0
        L_0x0012:
            b.a.a.a.n0.i[] r0 = r8.q
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0017:
            if (r3 >= r1) goto L_0x0025
            r4 = r0[r3]
            b.a.a.a.n r4 = r4.o()
            if (r4 != 0) goto L_0x0022
            return
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0025:
            b.a.a.a.r0.e r0 = r8.k
            r0.b()
            b.a.a.a.n0.i[] r0 = r8.q
            int r0 = r0.length
            b.a.a.a.n0.m[] r1 = new b.a.a.a.n0.m[r0]
            boolean[] r3 = new boolean[r0]
            r8.B = r3
            boolean[] r3 = new boolean[r0]
            r8.A = r3
            boolean[] r3 = new boolean[r0]
            r8.C = r3
            b.a.a.a.k0.l r3 = r8.p
            long r3 = r3.i()
            r8.z = r3
            r3 = 0
        L_0x0044:
            r4 = 1
            if (r3 >= r0) goto L_0x0076
            b.a.a.a.n0.i[] r5 = r8.q
            r5 = r5[r3]
            b.a.a.a.n r5 = r5.o()
            b.a.a.a.n0.m r6 = new b.a.a.a.n0.m
            b.a.a.a.n[] r7 = new b.a.a.a.n[r4]
            r7[r2] = r5
            r6.<init>(r7)
            r1[r3] = r6
            java.lang.String r5 = r5.f
            boolean r6 = b.a.a.a.r0.j.h(r5)
            if (r6 != 0) goto L_0x006a
            boolean r5 = b.a.a.a.r0.j.f(r5)
            if (r5 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            boolean[] r5 = r8.B
            r5[r3] = r4
            boolean r5 = r8.D
            r4 = r4 | r5
            r8.D = r4
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0076:
            b.a.a.a.n0.n r0 = new b.a.a.a.n0.n
            r0.<init>(r1)
            r8.y = r0
            int r0 = r8.c
            r1 = -1
            if (r0 != r1) goto L_0x009c
            long r0 = r8.E
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x009c
            b.a.a.a.k0.l r0 = r8.p
            long r0 = r0.i()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x009c
            r0 = 6
            r8.u = r0
        L_0x009c:
            r8.t = r4
            b.a.a.a.n0.c$e r0 = r8.e
            long r1 = r8.z
            b.a.a.a.k0.l r3 = r8.p
            boolean r3 = r3.b()
            r0.c(r1, r3)
            b.a.a.a.n0.e$a r0 = r8.o
            r0.d(r8)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.c.I():void");
    }

    private void J(int i2) {
        if (!this.C[i2]) {
            n a2 = this.y.a(i2).a(0);
            this.d.d(j.e(a2.f), a2, 0, (Object) null, this.F);
            this.C[i2] = true;
        }
    }

    private void K(int i2) {
        if (this.H && this.B[i2] && !this.q[i2].q()) {
            this.G = 0;
            this.H = false;
            this.w = true;
            this.F = 0;
            this.I = 0;
            for (i x2 : this.q) {
                x2.x();
            }
            this.o.e(this);
        }
    }

    private boolean R(long j2) {
        int length = this.q.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                return true;
            }
            i iVar = this.q[i2];
            iVar.z();
            if (iVar.f(j2, true, false) == -1) {
                z2 = false;
            }
            if (z2 || (!this.B[i2] && this.D)) {
                i2++;
            }
        }
        return false;
    }

    private void T() {
        C0031c cVar = new C0031c(this.f548a, this.f549b, this.j, this.k);
        if (this.t) {
            b.a.a.a.r0.a.f(G());
            long j2 = this.z;
            if (j2 == -9223372036854775807L || this.G < j2) {
                cVar.h(this.p.e(this.G).f321a.f326b, this.G);
                this.G = -9223372036854775807L;
            } else {
                this.J = true;
                this.G = -9223372036854775807L;
                return;
            }
        }
        this.I = D();
        this.d.h(cVar.i, 1, -1, (n) null, 0, (Object) null, cVar.h, this.z, this.i.i(cVar, this, this.u));
    }

    private boolean U() {
        return this.w || G();
    }

    /* access modifiers changed from: package-private */
    public boolean H(int i2) {
        return !U() && (this.J || this.q[i2].q());
    }

    /* access modifiers changed from: package-private */
    public void L() {
        this.i.g(this.u);
    }

    /* renamed from: M */
    public void m(C0031c cVar, long j2, long j3, boolean z2) {
        this.d.e(cVar.i, 1, -1, (n) null, 0, (Object) null, cVar.h, this.z, j2, j3, cVar.k);
        if (!z2) {
            C(cVar);
            for (i x2 : this.q) {
                x2.x();
            }
            if (this.x > 0) {
                this.o.e(this);
            }
        }
    }

    /* renamed from: N */
    public void h(C0031c cVar, long j2, long j3) {
        if (this.z == -9223372036854775807L) {
            long E2 = E();
            long j4 = E2 == Long.MIN_VALUE ? 0 : E2 + 10000;
            this.z = j4;
            this.e.c(j4, this.p.b());
        }
        this.d.f(cVar.i, 1, -1, (n) null, 0, (Object) null, cVar.h, this.z, j2, j3, cVar.k);
        C(cVar);
        this.J = true;
        this.o.e(this);
    }

    /* renamed from: O */
    public int e(C0031c cVar, long j2, long j3, IOException iOException) {
        boolean z2;
        C0031c cVar2;
        boolean F2 = F(iOException);
        this.d.g(cVar.i, 1, -1, (n) null, 0, (Object) null, cVar.h, this.z, j2, j3, cVar.k, iOException, F2);
        C(cVar);
        if (F2) {
            return 3;
        }
        int D2 = D();
        if (D2 > this.I) {
            cVar2 = cVar;
            z2 = true;
        } else {
            cVar2 = cVar;
            z2 = false;
        }
        if (B(cVar2, D2)) {
            return z2 ? 1 : 0;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    public int P(int i2, o oVar, b.a.a.a.i0.e eVar, boolean z2) {
        if (U()) {
            return -3;
        }
        int t2 = this.q[i2].t(oVar, eVar, z2, this.J, this.F);
        if (t2 == -4) {
            J(i2);
        } else if (t2 == -3) {
            K(i2);
        }
        return t2;
    }

    public void Q() {
        if (this.t) {
            for (i k2 : this.q) {
                k2.k();
            }
        }
        this.i.h(this);
        this.n.removeCallbacksAndMessages((Object) null);
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public int S(int i2, long j2) {
        int i3 = 0;
        if (U()) {
            return 0;
        }
        i iVar = this.q[i2];
        if (!this.J || j2 <= iVar.m()) {
            int f2 = iVar.f(j2, true, true);
            if (f2 != -1) {
                i3 = f2;
            }
        } else {
            i3 = iVar.g();
        }
        if (i3 > 0) {
            J(i2);
        } else {
            K(i2);
        }
        return i3;
    }

    public long a(long j2, e0 e0Var) {
        if (!this.p.b()) {
            return 0;
        }
        l.a e2 = this.p.e(j2);
        return w.B(j2, e0Var, e2.f321a.f325a, e2.f322b.f325a);
    }

    public n b() {
        return this.y;
    }

    public void c(l lVar) {
        this.p = lVar;
        this.n.post(this.l);
    }

    public void d() {
        this.s = true;
        this.n.post(this.l);
    }

    public b.a.a.a.k0.n f(int i2, int i3) {
        int length = this.q.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.r[i4] == i2) {
                return this.q[i4];
            }
        }
        i iVar = new i(this.f);
        iVar.A(this);
        int i5 = length + 1;
        int[] copyOf = Arrays.copyOf(this.r, i5);
        this.r = copyOf;
        copyOf[length] = i2;
        i[] iVarArr = (i[]) Arrays.copyOf(this.q, i5);
        this.q = iVarArr;
        iVarArr[length] = iVar;
        return iVar;
    }

    public void g() {
        for (i x2 : this.q) {
            x2.x();
        }
        this.j.a();
    }

    public long i() {
        long j2;
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (G()) {
            return this.G;
        }
        if (this.D) {
            j2 = Long.MAX_VALUE;
            int length = this.q.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.B[i2]) {
                    j2 = Math.min(j2, this.q[i2].m());
                }
            }
        } else {
            j2 = E();
        }
        return j2 == Long.MIN_VALUE ? this.F : j2;
    }

    public void j() {
        L();
    }

    public void k(long j2, boolean z2) {
        int length = this.q.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.q[i2].j(j2, z2, this.A[i2]);
        }
    }

    public long l(b.a.a.a.p0.e[] eVarArr, boolean[] zArr, j[] jVarArr, boolean[] zArr2, long j2) {
        b.a.a.a.r0.a.f(this.t);
        int i2 = this.x;
        int i3 = 0;
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            if (jVarArr[i4] != null && (eVarArr[i4] == null || !zArr[i4])) {
                int d2 = jVarArr[i4].f556a;
                b.a.a.a.r0.a.f(this.A[d2]);
                this.x--;
                this.A[d2] = false;
                jVarArr[i4] = null;
            }
        }
        boolean z2 = !this.v ? j2 != 0 : i2 == 0;
        for (int i5 = 0; i5 < eVarArr.length; i5++) {
            if (jVarArr[i5] == null && eVarArr[i5] != null) {
                b.a.a.a.p0.e eVar = eVarArr[i5];
                b.a.a.a.r0.a.f(eVar.e() == 1);
                b.a.a.a.r0.a.f(eVar.i(0) == 0);
                int b2 = this.y.b(eVar.a());
                b.a.a.a.r0.a.f(!this.A[b2]);
                this.x++;
                this.A[b2] = true;
                jVarArr[i5] = new f(b2);
                zArr2[i5] = true;
                if (!z2) {
                    i iVar = this.q[b2];
                    iVar.z();
                    z2 = iVar.f(j2, true, true) == -1 && iVar.n() != 0;
                }
            }
        }
        if (this.x == 0) {
            this.H = false;
            this.w = false;
            if (this.i.f()) {
                i[] iVarArr = this.q;
                int length = iVarArr.length;
                while (i3 < length) {
                    iVarArr[i3].k();
                    i3++;
                }
                this.i.e();
            } else {
                i[] iVarArr2 = this.q;
                int length2 = iVarArr2.length;
                while (i3 < length2) {
                    iVarArr2[i3].x();
                    i3++;
                }
            }
        } else if (z2) {
            j2 = n(j2);
            while (i3 < jVarArr.length) {
                if (jVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.v = true;
        return j2;
    }

    public long n(long j2) {
        if (!this.p.b()) {
            j2 = 0;
        }
        this.F = j2;
        this.w = false;
        if (!G() && R(j2)) {
            return j2;
        }
        this.H = false;
        this.G = j2;
        this.J = false;
        if (this.i.f()) {
            this.i.e();
        } else {
            for (i x2 : this.q) {
                x2.x();
            }
        }
        return j2;
    }

    public long o() {
        if (this.x == 0) {
            return Long.MIN_VALUE;
        }
        return i();
    }

    public long p() {
        if (!this.w) {
            return -9223372036854775807L;
        }
        if (!this.J && D() <= this.I) {
            return -9223372036854775807L;
        }
        this.w = false;
        return this.F;
    }

    public void q(e.a aVar, long j2) {
        this.o = aVar;
        this.k.c();
        T();
    }

    public boolean r(long j2) {
        if (this.J || this.H) {
            return false;
        }
        if (this.t && this.x == 0) {
            return false;
        }
        boolean c2 = this.k.c();
        if (this.i.f()) {
            return c2;
        }
        T();
        return true;
    }

    public void s(n nVar) {
        this.n.post(this.l);
    }

    public void t(long j2) {
    }
}
