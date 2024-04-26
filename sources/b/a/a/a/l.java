package b.a.a.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import b.a.a.a.f;
import b.a.a.a.g0;
import b.a.a.a.n0.e;
import b.a.a.a.n0.f;
import b.a.a.a.n0.j;
import b.a.a.a.p0.g;
import b.a.a.a.p0.h;
import b.a.a.a.r0.w;
import b.a.a.a.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

final class l implements Handler.Callback, e.a, g.a, f.a, f.a, z.a {
    private boolean A;
    private int B;
    private e C;
    private long D;
    private int E;

    /* renamed from: a  reason: collision with root package name */
    private final a0[] f486a;

    /* renamed from: b  reason: collision with root package name */
    private final b0[] f487b;
    private final g c;
    private final h d;
    private final q e;
    private final b.a.a.a.r0.g f;
    private final HandlerThread g;
    private final Handler h;
    private final i i;
    private final g0.c j;
    private final g0.b k;
    private final long l;
    private final boolean m;
    private final f n;
    private final d o;
    private final ArrayList<c> p;
    private final b.a.a.a.r0.b q;
    private final t r = new t();
    private e0 s;
    private v t;
    private b.a.a.a.n0.f u;
    private a0[] v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f488a;

        a(z zVar) {
            this.f488a = zVar;
        }

        public void run() {
            try {
                l.this.g(this.f488a);
            } catch (h e) {
                Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                throw new RuntimeException(e);
            }
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final b.a.a.a.n0.f f490a;

        /* renamed from: b  reason: collision with root package name */
        public final g0 f491b;
        public final Object c;

        public b(b.a.a.a.n0.f fVar, g0 g0Var, Object obj) {
            this.f490a = fVar;
            this.f491b = g0Var;
            this.c = obj;
        }
    }

    private static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final z f492a;

        /* renamed from: b  reason: collision with root package name */
        public int f493b;
        public long c;
        public Object d;

        public c(z zVar) {
            this.f492a = zVar;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            Object obj = this.d;
            if ((obj == null) != (cVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f493b - cVar.f493b;
            return i != 0 ? i : w.g(this.c, cVar.c);
        }

        public void b(int i, long j, Object obj) {
            this.f493b = i;
            this.c = j;
            this.d = obj;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private v f494a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f495b;
        /* access modifiers changed from: private */
        public boolean c;
        /* access modifiers changed from: private */
        public int d;

        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        public boolean d(v vVar) {
            return vVar != this.f494a || this.f495b > 0 || this.c;
        }

        public void e(int i) {
            this.f495b += i;
        }

        public void f(v vVar) {
            this.f494a = vVar;
            this.f495b = 0;
            this.c = false;
        }

        public void g(int i) {
            boolean z = true;
            if (!this.c || this.d == 4) {
                this.c = true;
                this.d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            b.a.a.a.r0.a.a(z);
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final g0 f496a;

        /* renamed from: b  reason: collision with root package name */
        public final int f497b;
        public final long c;

        public e(g0 g0Var, int i, long j) {
            this.f496a = g0Var;
            this.f497b = i;
            this.c = j;
        }
    }

    public l(a0[] a0VarArr, g gVar, h hVar, q qVar, boolean z2, int i2, boolean z3, Handler handler, i iVar, b.a.a.a.r0.b bVar) {
        this.f486a = a0VarArr;
        this.c = gVar;
        this.d = hVar;
        this.e = qVar;
        this.x = z2;
        this.z = i2;
        this.A = z3;
        this.h = handler;
        this.i = iVar;
        this.q = bVar;
        this.l = qVar.g();
        this.m = qVar.b();
        this.s = e0.d;
        this.t = new v(g0.f239a, -9223372036854775807L, hVar);
        this.o = new d((a) null);
        this.f487b = new b0[a0VarArr.length];
        for (int i3 = 0; i3 < a0VarArr.length; i3++) {
            a0VarArr[i3].l(i3);
            this.f487b[i3] = a0VarArr[i3].v();
        }
        this.n = new f(this, bVar);
        this.p = new ArrayList<>();
        this.v = new a0[0];
        this.j = new g0.c();
        this.k = new g0.b();
        gVar.a(this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.g = handlerThread;
        handlerThread.start();
        this.f = bVar.c(handlerThread.getLooper(), this);
    }

    private void C(b.a.a.a.n0.f fVar, boolean z2, boolean z3) {
        this.B++;
        H(true, z2, z3);
        this.e.i();
        this.u = fVar;
        f0(2);
        fVar.e(this.i, true, this);
        this.f.e(2);
    }

    private void E() {
        H(true, true, true);
        this.e.h();
        f0(1);
        this.g.quit();
        synchronized (this) {
            this.w = true;
            notifyAll();
        }
    }

    private boolean F(a0 a0Var) {
        r rVar = this.r.o().i;
        return rVar != null && rVar.f && a0Var.n();
    }

    private void G() {
        if (this.r.s()) {
            float f2 = this.n.c().f787a;
            r n2 = this.r.n();
            r o2 = this.r.o();
            boolean z2 = true;
            while (n2 != null && n2.f) {
                if (n2.o(f2)) {
                    if (z2) {
                        r n3 = this.r.n();
                        boolean x2 = this.r.x(n3);
                        boolean[] zArr = new boolean[this.f486a.length];
                        long b2 = n3.b(this.t.i, x2, zArr);
                        l0(n3.j);
                        v vVar = this.t;
                        if (!(vVar.f == 4 || b2 == vVar.i)) {
                            v vVar2 = this.t;
                            this.t = vVar2.g(vVar2.c, b2, vVar2.e);
                            this.o.g(4);
                            I(b2);
                        }
                        boolean[] zArr2 = new boolean[this.f486a.length];
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            a0[] a0VarArr = this.f486a;
                            if (i2 >= a0VarArr.length) {
                                break;
                            }
                            a0 a0Var = a0VarArr[i2];
                            zArr2[i2] = a0Var.d() != 0;
                            j jVar = n3.c[i2];
                            if (jVar != null) {
                                i3++;
                            }
                            if (zArr2[i2]) {
                                if (jVar != a0Var.w()) {
                                    h(a0Var);
                                } else if (zArr[i2]) {
                                    a0Var.o(this.D);
                                }
                            }
                            i2++;
                        }
                        this.t = this.t.f(n3.j);
                        k(zArr2, i3);
                    } else {
                        this.r.x(n2);
                        if (n2.f) {
                            n2.a(Math.max(n2.h.f747b, n2.p(this.D)), false);
                            l0(n2.j);
                        }
                    }
                    if (this.t.f != 4) {
                        v();
                        n0();
                        this.f.e(2);
                        return;
                    }
                    return;
                }
                if (n2 == o2) {
                    z2 = false;
                }
                n2 = n2.i;
            }
        }
    }

    private void H(boolean z2, boolean z3, boolean z4) {
        b.a.a.a.n0.f fVar;
        this.f.c(2);
        this.y = false;
        this.n.i();
        this.D = 60000000;
        for (a0 h2 : this.v) {
            try {
                h(h2);
            } catch (h | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.v = new a0[0];
        this.r.d();
        W(false);
        if (z3) {
            this.C = null;
        }
        if (z4) {
            this.r.B(g0.f239a);
            Iterator<c> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().f492a.j(false);
            }
            this.p.clear();
            this.E = 0;
        }
        g0 g0Var = z4 ? g0.f239a : this.t.f785a;
        Object obj = z4 ? null : this.t.f786b;
        f.b bVar = z3 ? new f.b(m()) : this.t.c;
        long j2 = -9223372036854775807L;
        long j3 = z3 ? -9223372036854775807L : this.t.i;
        if (!z3) {
            j2 = this.t.e;
        }
        long j4 = j2;
        v vVar = this.t;
        this.t = new v(g0Var, obj, bVar, j3, j4, vVar.f, false, z4 ? this.d : vVar.h);
        if (z2 && (fVar = this.u) != null) {
            fVar.f();
            this.u = null;
        }
    }

    private void I(long j2) {
        long q2 = !this.r.s() ? j2 + 60000000 : this.r.n().q(j2);
        this.D = q2;
        this.n.g(q2);
        for (a0 o2 : this.v) {
            o2.o(this.D);
        }
    }

    private boolean J(c cVar) {
        Object obj = cVar.d;
        if (obj == null) {
            Pair<Integer, Long> L = L(new e(cVar.f492a.g(), cVar.f492a.i(), b.a(cVar.f492a.e())), false);
            if (L == null) {
                return false;
            }
            cVar.b(((Integer) L.first).intValue(), ((Long) L.second).longValue(), this.t.f785a.g(((Integer) L.first).intValue(), this.k, true).f241b);
        } else {
            int b2 = this.t.f785a.b(obj);
            if (b2 == -1) {
                return false;
            }
            cVar.f493b = b2;
        }
        return true;
    }

    private void K() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (!J(this.p.get(size))) {
                this.p.get(size).f492a.j(false);
                this.p.remove(size);
            }
        }
        Collections.sort(this.p);
    }

    private Pair<Integer, Long> L(e eVar, boolean z2) {
        int M;
        g0 g0Var = this.t.f785a;
        g0 g0Var2 = eVar.f496a;
        if (g0Var.p()) {
            return null;
        }
        if (g0Var2.p()) {
            g0Var2 = g0Var;
        }
        try {
            Pair<Integer, Long> i2 = g0Var2.i(this.j, this.k, eVar.f497b, eVar.c);
            if (g0Var == g0Var2) {
                return i2;
            }
            int b2 = g0Var.b(g0Var2.g(((Integer) i2.first).intValue(), this.k, true).f241b);
            if (b2 != -1) {
                return Pair.create(Integer.valueOf(b2), i2.second);
            }
            if (!z2 || (M = M(((Integer) i2.first).intValue(), g0Var2, g0Var)) == -1) {
                return null;
            }
            return o(g0Var, g0Var.f(M, this.k).c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new p(g0Var, eVar.f497b, eVar.c);
        }
    }

    private int M(int i2, g0 g0Var, g0 g0Var2) {
        int h2 = g0Var.h();
        int i3 = i2;
        int i4 = -1;
        for (int i5 = 0; i5 < h2 && i4 == -1; i5++) {
            i3 = g0Var.d(i3, this.k, this.j, this.z, this.A);
            if (i3 == -1) {
                break;
            }
            i4 = g0Var2.b(g0Var.g(i3, this.k, true).f241b);
        }
        return i4;
    }

    private void N(long j2, long j3) {
        this.f.c(2);
        this.f.b(2, j2 + j3);
    }

    private void P(boolean z2) {
        f.b bVar = this.r.n().h.f746a;
        long S = S(bVar, this.t.i, true);
        if (S != this.t.i) {
            v vVar = this.t;
            this.t = vVar.g(bVar, S, vVar.e);
            if (z2) {
                this.o.g(4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061 A[Catch:{ all -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Q(b.a.a.a.l.e r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            b.a.a.a.l$d r2 = r1.o
            r3 = 1
            r2.e(r3)
            android.util.Pair r2 = r1.L(r0, r3)
            r4 = 0
            r6 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x0027
            b.a.a.a.n0.f$b r2 = new b.a.a.a.n0.f$b
            int r9 = r20.m()
            r2.<init>(r9)
            r15 = r2
            r12 = r7
            r18 = r12
        L_0x0025:
            r2 = 1
            goto L_0x005c
        L_0x0027:
            java.lang.Object r9 = r2.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r2.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            b.a.a.a.t r12 = r1.r
            b.a.a.a.n0.f$b r9 = r12.y(r9, r10)
            boolean r12 = r9.b()
            if (r12 == 0) goto L_0x0048
            r12 = r4
            r15 = r9
            r18 = r10
            goto L_0x0025
        L_0x0048:
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r12 = r2.longValue()
            long r14 = r0.c
            int r2 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0058
            r2 = 1
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            r15 = r9
            r18 = r10
        L_0x005c:
            r9 = 2
            b.a.a.a.n0.f r10 = r1.u     // Catch:{ all -> 0x00db }
            if (r10 == 0) goto L_0x00c7
            int r10 = r1.B     // Catch:{ all -> 0x00db }
            if (r10 <= 0) goto L_0x0066
            goto L_0x00c7
        L_0x0066:
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0072
            r0 = 4
            r1.f0(r0)     // Catch:{ all -> 0x00db }
            r1.H(r6, r3, r6)     // Catch:{ all -> 0x00db }
            goto L_0x00c9
        L_0x0072:
            b.a.a.a.v r0 = r1.t     // Catch:{ all -> 0x00db }
            b.a.a.a.n0.f$b r0 = r0.c     // Catch:{ all -> 0x00db }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00b8
            b.a.a.a.t r0 = r1.r     // Catch:{ all -> 0x00db }
            b.a.a.a.r r0 = r0.n()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x0091
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0091
            b.a.a.a.n0.e r0 = r0.f714a     // Catch:{ all -> 0x00db }
            b.a.a.a.e0 r4 = r1.s     // Catch:{ all -> 0x00db }
            long r4 = r0.a(r12, r4)     // Catch:{ all -> 0x00db }
            goto L_0x0092
        L_0x0091:
            r4 = r12
        L_0x0092:
            long r7 = b.a.a.a.b.b(r4)     // Catch:{ all -> 0x00db }
            b.a.a.a.v r0 = r1.t     // Catch:{ all -> 0x00db }
            long r10 = r0.i     // Catch:{ all -> 0x00db }
            long r10 = b.a.a.a.b.b(r10)     // Catch:{ all -> 0x00db }
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            b.a.a.a.v r0 = r1.t     // Catch:{ all -> 0x00db }
            long r3 = r0.i     // Catch:{ all -> 0x00db }
            b.a.a.a.v r14 = r1.t
            r16 = r3
            b.a.a.a.v r0 = r14.g(r15, r16, r18)
            r1.t = r0
            if (r2 == 0) goto L_0x00b7
            b.a.a.a.l$d r0 = r1.o
            r0.g(r9)
        L_0x00b7:
            return
        L_0x00b8:
            r4 = r12
        L_0x00b9:
            long r4 = r1.R(r15, r4)     // Catch:{ all -> 0x00db }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            r2 = r2 | r3
            r16 = r4
            goto L_0x00cb
        L_0x00c7:
            r1.C = r0     // Catch:{ all -> 0x00db }
        L_0x00c9:
            r16 = r12
        L_0x00cb:
            b.a.a.a.v r14 = r1.t
            b.a.a.a.v r0 = r14.g(r15, r16, r18)
            r1.t = r0
            if (r2 == 0) goto L_0x00da
            b.a.a.a.l$d r0 = r1.o
            r0.g(r9)
        L_0x00da:
            return
        L_0x00db:
            r0 = move-exception
            b.a.a.a.v r14 = r1.t
            r16 = r12
            b.a.a.a.v r3 = r14.g(r15, r16, r18)
            r1.t = r3
            if (r2 == 0) goto L_0x00ed
            b.a.a.a.l$d r2 = r1.o
            r2.g(r9)
        L_0x00ed:
            goto L_0x00ef
        L_0x00ee:
            throw r0
        L_0x00ef:
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l.Q(b.a.a.a.l$e):void");
    }

    private long R(f.b bVar, long j2) {
        return S(bVar, j2, this.r.n() != this.r.o());
    }

    private long S(f.b bVar, long j2, boolean z2) {
        k0();
        this.y = false;
        f0(2);
        r n2 = this.r.n();
        r rVar = n2;
        while (true) {
            if (rVar == null) {
                break;
            } else if (g0(bVar, j2, rVar)) {
                this.r.x(rVar);
                break;
            } else {
                rVar = this.r.a();
            }
        }
        if (n2 != rVar || z2) {
            for (a0 h2 : this.v) {
                h(h2);
            }
            this.v = new a0[0];
            n2 = null;
        }
        if (rVar != null) {
            o0(n2);
            if (rVar.g) {
                long n3 = rVar.f714a.n(j2);
                rVar.f714a.k(n3 - this.l, this.m);
                j2 = n3;
            }
            I(j2);
            v();
        } else {
            this.r.d();
            I(j2);
        }
        this.f.e(2);
        return j2;
    }

    private void T(z zVar) {
        if (zVar.e() == -9223372036854775807L) {
            U(zVar);
        } else if (this.u == null || this.B > 0) {
            this.p.add(new c(zVar));
        } else {
            c cVar = new c(zVar);
            if (J(cVar)) {
                this.p.add(cVar);
                Collections.sort(this.p);
                return;
            }
            zVar.j(false);
        }
    }

    private void U(z zVar) {
        if (zVar.c().getLooper() == this.f.f()) {
            g(zVar);
            int i2 = this.t.f;
            if (i2 == 3 || i2 == 2) {
                this.f.e(2);
                return;
            }
            return;
        }
        this.f.d(15, zVar).sendToTarget();
    }

    private void V(z zVar) {
        zVar.c().post(new a(zVar));
    }

    private void W(boolean z2) {
        v vVar = this.t;
        if (vVar.g != z2) {
            this.t = vVar.b(z2);
        }
    }

    private void Y(boolean z2) {
        this.y = false;
        this.x = z2;
        if (!z2) {
            k0();
            n0();
            return;
        }
        int i2 = this.t.f;
        if (i2 == 3) {
            i0();
        } else if (i2 != 2) {
            return;
        }
        this.f.e(2);
    }

    private void Z(w wVar) {
        this.n.f(wVar);
    }

    private void b0(int i2) {
        this.z = i2;
        if (!this.r.F(i2)) {
            P(true);
        }
    }

    private void c0(e0 e0Var) {
        this.s = e0Var;
    }

    private void e0(boolean z2) {
        this.A = z2;
        if (!this.r.G(z2)) {
            P(true);
        }
    }

    private void f0(int i2) {
        v vVar = this.t;
        if (vVar.f != i2) {
            this.t = vVar.d(i2);
        }
    }

    /* access modifiers changed from: private */
    public void g(z zVar) {
        try {
            zVar.f().u(zVar.h(), zVar.d());
        } finally {
            zVar.j(true);
        }
    }

    private boolean g0(f.b bVar, long j2, r rVar) {
        if (!bVar.equals(rVar.h.f746a) || !rVar.f) {
            return false;
        }
        this.t.f785a.f(rVar.h.f746a.f562a, this.k);
        int d2 = this.k.d(j2);
        return d2 == -1 || this.k.f(d2) == rVar.h.c;
    }

    private void h(a0 a0Var) {
        this.n.d(a0Var);
        l(a0Var);
        a0Var.h();
    }

    private boolean h0(boolean z2) {
        if (this.v.length == 0) {
            return u();
        }
        if (!z2) {
            return false;
        }
        if (!this.t.g) {
            return true;
        }
        r i2 = this.r.i();
        long h2 = i2.h(!i2.h.g);
        return h2 == Long.MIN_VALUE || this.e.a(h2 - i2.p(this.D), this.n.c().f787a, this.y);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r17 = this;
            r0 = r17
            b.a.a.a.r0.b r1 = r0.q
            long r1 = r1.a()
            r17.m0()
            b.a.a.a.t r3 = r0.r
            boolean r3 = r3.s()
            r4 = 10
            if (r3 != 0) goto L_0x001c
            r17.x()
            r0.N(r1, r4)
            return
        L_0x001c:
            b.a.a.a.t r3 = r0.r
            b.a.a.a.r r3 = r3.n()
            java.lang.String r6 = "doSomeWork"
            b.a.a.a.r0.v.a(r6)
            r17.n0()
            long r6 = android.os.SystemClock.elapsedRealtime()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            b.a.a.a.n0.e r10 = r3.f714a
            b.a.a.a.v r11 = r0.t
            long r11 = r11.i
            long r13 = r0.l
            long r11 = r11 - r13
            boolean r13 = r0.m
            r10.k(r11, r13)
            b.a.a.a.a0[] r10 = r0.v
            int r11 = r10.length
            r13 = 1
            r14 = 0
            r15 = 1
            r16 = 1
        L_0x0048:
            if (r14 >= r11) goto L_0x0085
            r12 = r10[r14]
            long r8 = r0.D
            r12.t(r8, r6)
            if (r16 == 0) goto L_0x005c
            boolean r8 = r12.b()
            if (r8 == 0) goto L_0x005c
            r16 = 1
            goto L_0x005e
        L_0x005c:
            r16 = 0
        L_0x005e:
            boolean r8 = r12.e()
            if (r8 != 0) goto L_0x0073
            boolean r8 = r12.b()
            if (r8 != 0) goto L_0x0073
            boolean r8 = r0.F(r12)
            if (r8 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r8 = 0
            goto L_0x0074
        L_0x0073:
            r8 = 1
        L_0x0074:
            if (r8 != 0) goto L_0x0079
            r12.k()
        L_0x0079:
            if (r15 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r15 = 1
            goto L_0x0080
        L_0x007f:
            r15 = 0
        L_0x0080:
            int r14 = r14 + 1
            r8 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0048
        L_0x0085:
            if (r15 != 0) goto L_0x008a
            r17.x()
        L_0x008a:
            b.a.a.a.s r6 = r3.h
            long r6 = r6.e
            r8 = 4
            r9 = 3
            r10 = 2
            if (r16 == 0) goto L_0x00b1
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x00a4
            b.a.a.a.v r11 = r0.t
            long r11 = r11.i
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x00b1
        L_0x00a4:
            b.a.a.a.s r3 = r3.h
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x00b1
            r0.f0(r8)
        L_0x00ad:
            r17.k0()
            goto L_0x00e4
        L_0x00b1:
            b.a.a.a.v r3 = r0.t
            int r3 = r3.f
            if (r3 != r10) goto L_0x00c8
            boolean r3 = r0.h0(r15)
            if (r3 == 0) goto L_0x00c8
            r0.f0(r9)
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x00e4
            r17.i0()
            goto L_0x00e4
        L_0x00c8:
            b.a.a.a.v r3 = r0.t
            int r3 = r3.f
            if (r3 != r9) goto L_0x00e4
            b.a.a.a.a0[] r3 = r0.v
            int r3 = r3.length
            if (r3 != 0) goto L_0x00da
            boolean r3 = r17.u()
            if (r3 == 0) goto L_0x00dc
            goto L_0x00e4
        L_0x00da:
            if (r15 != 0) goto L_0x00e4
        L_0x00dc:
            boolean r3 = r0.x
            r0.y = r3
            r0.f0(r10)
            goto L_0x00ad
        L_0x00e4:
            b.a.a.a.v r3 = r0.t
            int r3 = r3.f
            if (r3 != r10) goto L_0x00f8
            b.a.a.a.a0[] r3 = r0.v
            int r6 = r3.length
            r12 = 0
        L_0x00ee:
            if (r12 >= r6) goto L_0x00f8
            r7 = r3[r12]
            r7.k()
            int r12 = r12 + 1
            goto L_0x00ee
        L_0x00f8:
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x0102
            b.a.a.a.v r3 = r0.t
            int r3 = r3.f
            if (r3 == r9) goto L_0x0108
        L_0x0102:
            b.a.a.a.v r3 = r0.t
            int r3 = r3.f
            if (r3 != r10) goto L_0x010c
        L_0x0108:
            r0.N(r1, r4)
            goto L_0x011e
        L_0x010c:
            b.a.a.a.a0[] r4 = r0.v
            int r4 = r4.length
            if (r4 == 0) goto L_0x0119
            if (r3 == r8) goto L_0x0119
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.N(r1, r3)
            goto L_0x011e
        L_0x0119:
            b.a.a.a.r0.g r1 = r0.f
            r1.c(r10)
        L_0x011e:
            b.a.a.a.r0.v.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l.i():void");
    }

    private void i0() {
        this.y = false;
        this.n.h();
        for (a0 m2 : this.v) {
            m2.m();
        }
    }

    private void j(int i2, boolean z2, int i3) {
        r n2 = this.r.n();
        a0 a0Var = this.f486a[i2];
        this.v[i3] = a0Var;
        if (a0Var.d() == 0) {
            h hVar = n2.j;
            c0 c0Var = hVar.e[i2];
            n[] n3 = n(hVar.c.a(i2));
            boolean z3 = this.x && this.t.f == 3;
            a0Var.r(c0Var, n3, n2.c[i2], this.D, !z2 && z3, n2.j());
            this.n.e(a0Var);
            if (z3) {
                a0Var.m();
            }
        }
    }

    private void j0(boolean z2, boolean z3) {
        H(true, z2, z2);
        this.o.e(this.B + (z3 ? 1 : 0));
        this.B = 0;
        this.e.e();
        f0(1);
    }

    private void k(boolean[] zArr, int i2) {
        this.v = new a0[i2];
        r n2 = this.r.n();
        int i3 = 0;
        for (int i4 = 0; i4 < this.f486a.length; i4++) {
            if (n2.j.f682b[i4]) {
                j(i4, zArr[i4], i3);
                i3++;
            }
        }
    }

    private void k0() {
        this.n.i();
        for (a0 l2 : this.v) {
            l(l2);
        }
    }

    private void l(a0 a0Var) {
        if (a0Var.d() == 2) {
            a0Var.j();
        }
    }

    private void l0(h hVar) {
        this.e.f(this.f486a, hVar.f681a, hVar.c);
    }

    private int m() {
        g0 g0Var = this.t.f785a;
        if (g0Var.p()) {
            return 0;
        }
        return g0Var.l(g0Var.a(this.A), this.j).d;
    }

    private void m0() {
        b.a.a.a.n0.f fVar = this.u;
        if (fVar != null) {
            if (this.B > 0) {
                fVar.b();
                return;
            }
            z();
            r i2 = this.r.i();
            int i3 = 0;
            if (i2 == null || i2.l()) {
                W(false);
            } else if (!this.t.g) {
                v();
            }
            if (this.r.s()) {
                r n2 = this.r.n();
                r o2 = this.r.o();
                boolean z2 = false;
                while (this.x && n2 != o2 && this.D >= n2.i.e) {
                    if (z2) {
                        w();
                    }
                    int i4 = n2.h.f ? 0 : 3;
                    r a2 = this.r.a();
                    o0(n2);
                    v vVar = this.t;
                    s sVar = a2.h;
                    this.t = vVar.g(sVar.f746a, sVar.f747b, sVar.d);
                    this.o.g(i4);
                    n0();
                    n2 = a2;
                    z2 = true;
                }
                if (o2.h.g) {
                    while (true) {
                        a0[] a0VarArr = this.f486a;
                        if (i3 < a0VarArr.length) {
                            a0 a0Var = a0VarArr[i3];
                            j jVar = o2.c[i3];
                            if (jVar != null && a0Var.w() == jVar && a0Var.n()) {
                                a0Var.i();
                            }
                            i3++;
                        } else {
                            return;
                        }
                    }
                } else {
                    r rVar = o2.i;
                    if (rVar != null && rVar.f) {
                        int i5 = 0;
                        while (true) {
                            a0[] a0VarArr2 = this.f486a;
                            if (i5 < a0VarArr2.length) {
                                a0 a0Var2 = a0VarArr2[i5];
                                j jVar2 = o2.c[i5];
                                if (a0Var2.w() != jVar2) {
                                    return;
                                }
                                if (jVar2 == null || a0Var2.n()) {
                                    i5++;
                                } else {
                                    return;
                                }
                            } else {
                                h hVar = o2.j;
                                r b2 = this.r.b();
                                h hVar2 = b2.j;
                                boolean z3 = b2.f714a.p() != -9223372036854775807L;
                                int i6 = 0;
                                while (true) {
                                    a0[] a0VarArr3 = this.f486a;
                                    if (i6 < a0VarArr3.length) {
                                        a0 a0Var3 = a0VarArr3[i6];
                                        if (hVar.f682b[i6]) {
                                            if (!z3) {
                                                if (!a0Var3.p()) {
                                                    b.a.a.a.p0.e a3 = hVar2.c.a(i6);
                                                    boolean z4 = hVar2.f682b[i6];
                                                    boolean z5 = this.f487b[i6].g() == 5;
                                                    c0 c0Var = hVar.e[i6];
                                                    c0 c0Var2 = hVar2.e[i6];
                                                    if (z4 && c0Var2.equals(c0Var) && !z5) {
                                                        a0Var3.y(n(a3), b2.c[i6], b2.j());
                                                    }
                                                }
                                            }
                                            a0Var3.i();
                                        }
                                        i6++;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static n[] n(b.a.a.a.p0.e eVar) {
        int e2 = eVar != null ? eVar.e() : 0;
        n[] nVarArr = new n[e2];
        for (int i2 = 0; i2 < e2; i2++) {
            nVarArr[i2] = eVar.d(i2);
        }
        return nVarArr;
    }

    private void n0() {
        if (this.r.s()) {
            r n2 = this.r.n();
            long p2 = n2.f714a.p();
            if (p2 != -9223372036854775807L) {
                I(p2);
                if (p2 != this.t.i) {
                    v vVar = this.t;
                    this.t = vVar.g(vVar.c, p2, vVar.e);
                    this.o.g(4);
                }
            } else {
                long j2 = this.n.j();
                this.D = j2;
                long p3 = n2.p(j2);
                y(this.t.i, p3);
                this.t.i = p3;
            }
            this.t.j = this.v.length == 0 ? n2.h.e : n2.h(true);
        }
    }

    private Pair<Integer, Long> o(g0 g0Var, int i2, long j2) {
        return g0Var.i(this.j, this.k, i2, j2);
    }

    private void o0(r rVar) {
        r n2 = this.r.n();
        if (n2 != null && rVar != n2) {
            boolean[] zArr = new boolean[this.f486a.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                a0[] a0VarArr = this.f486a;
                if (i2 < a0VarArr.length) {
                    a0 a0Var = a0VarArr[i2];
                    zArr[i2] = a0Var.d() != 0;
                    boolean[] zArr2 = n2.j.f682b;
                    if (zArr2[i2]) {
                        i3++;
                    }
                    if (zArr[i2] && (!zArr2[i2] || (a0Var.p() && a0Var.w() == rVar.c[i2]))) {
                        h(a0Var);
                    }
                    i2++;
                } else {
                    this.t = this.t.f(n2.j);
                    k(zArr, i3);
                    return;
                }
            }
        }
    }

    private void p0(float f2) {
        for (r h2 = this.r.h(); h2 != null; h2 = h2.i) {
            h hVar = h2.j;
            if (hVar != null) {
                for (b.a.a.a.p0.e eVar : hVar.c.b()) {
                    if (eVar != null) {
                        eVar.g(f2);
                    }
                }
            }
        }
    }

    private void q(b.a.a.a.n0.e eVar) {
        if (this.r.v(eVar)) {
            this.r.w(this.D);
            v();
        }
    }

    private void r(b.a.a.a.n0.e eVar) {
        if (this.r.v(eVar)) {
            l0(this.r.r(this.n.c().f787a));
            if (!this.r.s()) {
                I(this.r.a().h.f747b);
                o0((r) null);
            }
            v();
        }
    }

    private void s() {
        f0(4);
        H(false, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        if (r11.b() != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        if (r11.b() != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a0, code lost:
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        r0.t = r10.g(r11, r12, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(b.a.a.a.l.b r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            b.a.a.a.n0.f r2 = r1.f490a
            b.a.a.a.n0.f r3 = r0.u
            if (r2 == r3) goto L_0x000b
            return
        L_0x000b:
            b.a.a.a.v r2 = r0.t
            b.a.a.a.g0 r2 = r2.f785a
            b.a.a.a.g0 r3 = r1.f491b
            java.lang.Object r1 = r1.c
            b.a.a.a.t r4 = r0.r
            r4.B(r3)
            b.a.a.a.v r4 = r0.t
            b.a.a.a.v r1 = r4.e(r3, r1)
            r0.t = r1
            r19.K()
            int r1 = r0.B
            r4 = 0
            r5 = 1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            if (r1 <= 0) goto L_0x00a8
            b.a.a.a.l$d r2 = r0.o
            r2.e(r1)
            r0.B = r4
            b.a.a.a.l$e r1 = r0.C
            if (r1 == 0) goto L_0x0064
            android.util.Pair r1 = r0.L(r1, r5)
            r2 = 0
            r0.C = r2
            if (r1 != 0) goto L_0x0045
            goto L_0x0072
        L_0x0045:
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r14 = r1.longValue()
            b.a.a.a.t r1 = r0.r
            b.a.a.a.n0.f$b r11 = r1.y(r2, r14)
            b.a.a.a.v r10 = r0.t
            boolean r1 = r11.b()
            if (r1 == 0) goto L_0x00a0
            goto L_0x009e
        L_0x0064:
            b.a.a.a.v r1 = r0.t
            long r1 = r1.d
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00a7
            boolean r1 = r3.p()
            if (r1 == 0) goto L_0x0076
        L_0x0072:
            r19.s()
            goto L_0x00a7
        L_0x0076:
            boolean r1 = r0.A
            int r1 = r3.a(r1)
            android.util.Pair r1 = r0.o(r3, r1, r6)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r14 = r1.longValue()
            b.a.a.a.t r1 = r0.r
            b.a.a.a.n0.f$b r11 = r1.y(r2, r14)
            b.a.a.a.v r10 = r0.t
            boolean r1 = r11.b()
            if (r1 == 0) goto L_0x00a0
        L_0x009e:
            r12 = r8
            goto L_0x00a1
        L_0x00a0:
            r12 = r14
        L_0x00a1:
            b.a.a.a.v r1 = r10.g(r11, r12, r14)
            r0.t = r1
        L_0x00a7:
            return
        L_0x00a8:
            b.a.a.a.v r1 = r0.t
            b.a.a.a.n0.f$b r10 = r1.c
            int r10 = r10.f562a
            long r13 = r1.e
            boolean r1 = r2.p()
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r3.p()
            if (r1 != 0) goto L_0x00d5
            b.a.a.a.t r1 = r0.r
            b.a.a.a.n0.f$b r12 = r1.y(r10, r13)
            b.a.a.a.v r11 = r0.t
            boolean r1 = r12.b()
            if (r1 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r8 = r13
        L_0x00cc:
            r1 = r13
            r13 = r8
            r15 = r1
            b.a.a.a.v r1 = r11.g(r12, r13, r15)
            r0.t = r1
        L_0x00d5:
            return
        L_0x00d6:
            b.a.a.a.t r1 = r0.r
            b.a.a.a.r r1 = r1.h()
            if (r1 != 0) goto L_0x00e7
            b.a.a.a.g0$b r11 = r0.k
            b.a.a.a.g0$b r11 = r2.g(r10, r11, r5)
            java.lang.Object r11 = r11.f241b
            goto L_0x00e9
        L_0x00e7:
            java.lang.Object r11 = r1.f715b
        L_0x00e9:
            int r11 = r3.b(r11)
            r12 = -1
            if (r11 != r12) goto L_0x015b
            int r2 = r0.M(r10, r2, r3)
            if (r2 != r12) goto L_0x00fa
            r19.s()
            return
        L_0x00fa:
            b.a.a.a.g0$b r4 = r0.k
            b.a.a.a.g0$b r2 = r3.f(r2, r4)
            int r2 = r2.c
            android.util.Pair r2 = r0.o(r3, r2, r6)
            java.lang.Object r4 = r2.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r6 = r2.longValue()
            b.a.a.a.t r2 = r0.r
            b.a.a.a.n0.f$b r14 = r2.y(r4, r6)
            b.a.a.a.g0$b r2 = r0.k
            r3.g(r4, r2, r5)
            if (r1 == 0) goto L_0x0144
            b.a.a.a.g0$b r2 = r0.k
            java.lang.Object r2 = r2.f241b
        L_0x0127:
            b.a.a.a.s r3 = r1.h
            b.a.a.a.s r3 = r3.a(r12)
        L_0x012d:
            r1.h = r3
            b.a.a.a.r r1 = r1.i
            if (r1 == 0) goto L_0x0144
            java.lang.Object r3 = r1.f715b
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0127
            b.a.a.a.t r3 = r0.r
            b.a.a.a.s r5 = r1.h
            b.a.a.a.s r3 = r3.p(r5, r4)
            goto L_0x012d
        L_0x0144:
            boolean r1 = r14.b()
            if (r1 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r8 = r6
        L_0x014c:
            long r15 = r0.R(r14, r8)
            b.a.a.a.v r13 = r0.t
            r17 = r6
            b.a.a.a.v r1 = r13.g(r14, r15, r17)
        L_0x0158:
            r0.t = r1
            return
        L_0x015b:
            if (r11 == r10) goto L_0x0165
            b.a.a.a.v r1 = r0.t
            b.a.a.a.v r1 = r1.c(r11)
            r0.t = r1
        L_0x0165:
            b.a.a.a.v r1 = r0.t
            b.a.a.a.n0.f$b r1 = r1.c
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x0191
            b.a.a.a.t r2 = r0.r
            b.a.a.a.n0.f$b r12 = r2.y(r11, r13)
            boolean r2 = r12.equals(r1)
            if (r2 != 0) goto L_0x0191
            boolean r1 = r12.b()
            if (r1 == 0) goto L_0x0182
            goto L_0x0183
        L_0x0182:
            r8 = r13
        L_0x0183:
            long r1 = r0.R(r12, r8)
            b.a.a.a.v r11 = r0.t
            r3 = r13
            r13 = r1
            r15 = r3
            b.a.a.a.v r1 = r11.g(r12, r13, r15)
            goto L_0x0158
        L_0x0191:
            b.a.a.a.t r2 = r0.r
            long r5 = r0.D
            boolean r1 = r2.E(r1, r5)
            if (r1 != 0) goto L_0x019e
            r0.P(r4)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l.t(b.a.a.a.l$b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r0 = r0.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean u() {
        /*
            r6 = this;
            b.a.a.a.t r0 = r6.r
            b.a.a.a.r r0 = r0.n()
            b.a.a.a.s r1 = r0.h
            long r1 = r1.e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0030
            b.a.a.a.v r3 = r6.t
            long r3 = r3.i
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x0030
            b.a.a.a.r r0 = r0.i
            if (r0 == 0) goto L_0x002e
            boolean r1 = r0.f
            if (r1 != 0) goto L_0x0030
            b.a.a.a.s r0 = r0.h
            b.a.a.a.n0.f$b r0 = r0.f746a
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l.u():boolean");
    }

    private void v() {
        r i2 = this.r.i();
        long i3 = i2.i();
        if (i3 == Long.MIN_VALUE) {
            W(false);
            return;
        }
        boolean c2 = this.e.c(i3 - i2.p(this.D), this.n.c().f787a);
        W(c2);
        if (c2) {
            i2.d(this.D);
        }
    }

    private void w() {
        if (this.o.d(this.t)) {
            this.h.obtainMessage(0, this.o.f495b, this.o.c ? this.o.d : -1, this.t).sendToTarget();
            this.o.f(this.t);
        }
    }

    private void x() {
        r i2 = this.r.i();
        r o2 = this.r.o();
        if (i2 != null && !i2.f) {
            if (o2 == null || o2.i == i2) {
                a0[] a0VarArr = this.v;
                int length = a0VarArr.length;
                int i3 = 0;
                while (i3 < length) {
                    if (a0VarArr[i3].n()) {
                        i3++;
                    } else {
                        return;
                    }
                }
                i2.f714a.j();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r6.E < r6.p.size()) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r1 = r6.p.get(r6.E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r1 == null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r1.d == null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r3 = r1.f493b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r3 < r0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r3 != r0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r1.c > r7) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        r1 = r6.E + 1;
        r6.E = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r1 >= r6.p.size()) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r1 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r1.d == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        if (r1.f493b != r0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        r3 = r1.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (r3 <= r7) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        if (r3 > r9) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        U(r1.f492a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r1.f492a.b() == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r6.p.remove(r6.E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        r6.E++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r6.E >= r6.p.size()) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r1 = r6.p.get(r6.E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y(long r7, long r9) {
        /*
            r6 = this;
            java.util.ArrayList<b.a.a.a.l$c> r0 = r6.p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ca
            b.a.a.a.v r0 = r6.t
            b.a.a.a.n0.f$b r0 = r0.c
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00ca
        L_0x0014:
            b.a.a.a.v r0 = r6.t
            long r1 = r0.d
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x001f
            r1 = 1
            long r7 = r7 - r1
        L_0x001f:
            b.a.a.a.n0.f$b r0 = r0.c
            int r0 = r0.f562a
            int r1 = r6.E
            r2 = 0
            if (r1 <= 0) goto L_0x0033
            java.util.ArrayList<b.a.a.a.l$c> r3 = r6.p
        L_0x002a:
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            b.a.a.a.l$c r1 = (b.a.a.a.l.c) r1
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            if (r1 == 0) goto L_0x004d
            int r3 = r1.f493b
            if (r3 > r0) goto L_0x0042
            if (r3 != r0) goto L_0x004d
            long r3 = r1.c
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x004d
        L_0x0042:
            int r1 = r6.E
            int r1 = r1 + -1
            r6.E = r1
            if (r1 <= 0) goto L_0x0033
            java.util.ArrayList<b.a.a.a.l$c> r3 = r6.p
            goto L_0x002a
        L_0x004d:
            int r1 = r6.E
            java.util.ArrayList<b.a.a.a.l$c> r3 = r6.p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0062
        L_0x0057:
            java.util.ArrayList<b.a.a.a.l$c> r1 = r6.p
            int r3 = r6.E
            java.lang.Object r1 = r1.get(r3)
            b.a.a.a.l$c r1 = (b.a.a.a.l.c) r1
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            if (r1 == 0) goto L_0x0084
            java.lang.Object r3 = r1.d
            if (r3 == 0) goto L_0x0084
            int r3 = r1.f493b
            if (r3 < r0) goto L_0x0075
            if (r3 != r0) goto L_0x0084
            long r3 = r1.c
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0084
        L_0x0075:
            int r1 = r6.E
            int r1 = r1 + 1
            r6.E = r1
            java.util.ArrayList<b.a.a.a.l$c> r3 = r6.p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0062
            goto L_0x0057
        L_0x0084:
            if (r1 == 0) goto L_0x00ca
            java.lang.Object r3 = r1.d
            if (r3 == 0) goto L_0x00ca
            int r3 = r1.f493b
            if (r3 != r0) goto L_0x00ca
            long r3 = r1.c
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ca
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x00ca
            b.a.a.a.z r3 = r1.f492a
            r6.U(r3)
            b.a.a.a.z r1 = r1.f492a
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00ad
            java.util.ArrayList<b.a.a.a.l$c> r1 = r6.p
            int r3 = r6.E
            r1.remove(r3)
            goto L_0x00b3
        L_0x00ad:
            int r1 = r6.E
            int r1 = r1 + 1
            r6.E = r1
        L_0x00b3:
            int r1 = r6.E
            java.util.ArrayList<b.a.a.a.l$c> r3 = r6.p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00c8
            java.util.ArrayList<b.a.a.a.l$c> r1 = r6.p
            int r3 = r6.E
            java.lang.Object r1 = r1.get(r3)
            b.a.a.a.l$c r1 = (b.a.a.a.l.c) r1
            goto L_0x0084
        L_0x00c8:
            r1 = r2
            goto L_0x0084
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l.y(long, long):void");
    }

    private void z() {
        this.r.w(this.D);
        if (this.r.C()) {
            s m2 = this.r.m(this.D, this.t);
            if (m2 == null) {
                this.u.b();
                return;
            }
            this.r.e(this.f487b, 60000000, this.c, this.e.d(), this.u, this.t.f785a.g(m2.f746a.f562a, this.k, true).f241b, m2).q(this, m2.f747b);
            W(true);
        }
    }

    /* renamed from: A */
    public void e(b.a.a.a.n0.e eVar) {
        this.f.d(10, eVar).sendToTarget();
    }

    public void B(b.a.a.a.n0.f fVar, boolean z2, boolean z3) {
        this.f.g(0, z2 ? 1 : 0, z3 ? 1 : 0, fVar).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void D() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.w     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            b.a.a.a.r0.g r0 = r2.f     // Catch:{ all -> 0x0023 }
            r1 = 7
            r0.e(r1)     // Catch:{ all -> 0x0023 }
            r0 = 0
        L_0x000e:
            boolean r1 = r2.w     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0018
            r2.wait()     // Catch:{ InterruptedException -> 0x0016 }
            goto L_0x000e
        L_0x0016:
            r0 = 1
            goto L_0x000e
        L_0x0018:
            if (r0 == 0) goto L_0x0021
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
            r0.interrupt()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0027
        L_0x0026:
            throw r0
        L_0x0027:
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l.D():void");
    }

    public void O(g0 g0Var, int i2, long j2) {
        this.f.d(3, new e(g0Var, i2, j2)).sendToTarget();
    }

    public void X(boolean z2) {
        this.f.a(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public synchronized void a(z zVar) {
        if (this.w) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zVar.j(false);
            return;
        }
        this.f.d(14, zVar).sendToTarget();
    }

    public void a0(int i2) {
        this.f.a(12, i2, 0).sendToTarget();
    }

    public void b(w wVar) {
        this.h.obtainMessage(1, wVar).sendToTarget();
        p0(wVar.f787a);
    }

    public void c(b.a.a.a.n0.f fVar, g0 g0Var, Object obj) {
        this.f.d(8, new b(fVar, g0Var, obj)).sendToTarget();
    }

    public void d(b.a.a.a.n0.e eVar) {
        this.f.d(9, eVar).sendToTarget();
    }

    public void d0(boolean z2) {
        this.f.a(13, z2 ? 1 : 0, 0).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        Handler handler;
        try {
            switch (message.what) {
                case 0:
                    C((b.a.a.a.n0.f) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    Y(message.arg1 != 0);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    Q((e) message.obj);
                    break;
                case 4:
                    Z((w) message.obj);
                    break;
                case 5:
                    c0((e0) message.obj);
                    break;
                case 6:
                    j0(message.arg1 != 0, true);
                    break;
                case 7:
                    E();
                    return true;
                case 8:
                    t((b) message.obj);
                    break;
                case 9:
                    r((b.a.a.a.n0.e) message.obj);
                    break;
                case 10:
                    q((b.a.a.a.n0.e) message.obj);
                    break;
                case 11:
                    G();
                    break;
                case 12:
                    b0(message.arg1);
                    break;
                case 13:
                    e0(message.arg1 != 0);
                    break;
                case com.google.android.exoplayer2.ui.g.H /*14*/:
                    T((z) message.obj);
                    break;
                case com.google.android.exoplayer2.ui.g.I /*15*/:
                    V((z) message.obj);
                    break;
                default:
                    return false;
            }
            w();
        } catch (h e2) {
            e = e2;
            Log.e("ExoPlayerImplInternal", "Playback error.", e);
            j0(false, false);
            handler = this.h;
            handler.obtainMessage(2, e).sendToTarget();
            w();
            return true;
        } catch (IOException e3) {
            Log.e("ExoPlayerImplInternal", "Source error.", e3);
            j0(false, false);
            handler = this.h;
            e = h.b(e3);
            handler.obtainMessage(2, e).sendToTarget();
            w();
            return true;
        } catch (RuntimeException e4) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e4);
            j0(false, false);
            handler = this.h;
            e = h.c(e4);
            handler.obtainMessage(2, e).sendToTarget();
            w();
            return true;
        }
        return true;
    }

    public Looper p() {
        return this.g.getLooper();
    }
}
