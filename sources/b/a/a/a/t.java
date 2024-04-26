package b.a.a.a;

import android.util.Pair;
import b.a.a.a.g0;
import b.a.a.a.n0.e;
import b.a.a.a.n0.f;
import b.a.a.a.p0.g;
import b.a.a.a.p0.h;
import b.a.a.a.q0.b;
import b.a.a.a.r0.a;

final class t {

    /* renamed from: a  reason: collision with root package name */
    private final g0.b f783a = new g0.b();

    /* renamed from: b  reason: collision with root package name */
    private final g0.c f784b = new g0.c();
    private long c;
    private g0 d;
    private int e;
    private boolean f;
    private r g;
    private r h;
    private r i;
    private int j;

    private long A(int i2) {
        Object obj = this.d.g(i2, this.f783a, true).f241b;
        for (r h2 = h(); h2 != null; h2 = h2.i) {
            if (h2.f715b.equals(obj)) {
                return h2.h.f746a.d;
            }
        }
        int i3 = this.f783a.c;
        for (r h3 = h(); h3 != null; h3 = h3.i) {
            int b2 = this.d.b(h3.f715b);
            if (b2 != -1 && this.d.f(b2, this.f783a).c == i3) {
                return h3.h.f746a.d;
            }
        }
        long j2 = this.c;
        this.c = 1 + j2;
        return j2;
    }

    private boolean D() {
        r rVar;
        r h2 = h();
        if (h2 == null) {
            return true;
        }
        while (true) {
            int d2 = this.d.d(h2.h.f746a.f562a, this.f783a, this.f784b, this.e, this.f);
            while (true) {
                rVar = h2.i;
                if (rVar != null && !h2.h.f) {
                    h2 = rVar;
                }
            }
            if (d2 == -1 || rVar == null || rVar.h.f746a.f562a != d2) {
                boolean x = x(h2);
                s sVar = h2.h;
                h2.h = q(sVar, sVar.f746a);
            } else {
                h2 = rVar;
            }
        }
        boolean x2 = x(h2);
        s sVar2 = h2.h;
        h2.h = q(sVar2, sVar2.f746a);
        return !x2 || !s();
    }

    private boolean c(r rVar, s sVar) {
        s sVar2 = rVar.h;
        return sVar2.f747b == sVar.f747b && sVar2.c == sVar.c && sVar2.f746a.equals(sVar.f746a);
    }

    private s f(v vVar) {
        return j(vVar.c, vVar.e, vVar.d);
    }

    private s g(r rVar, long j2) {
        long j3;
        int i2;
        long j4;
        r rVar2 = rVar;
        s sVar = rVar2.h;
        if (sVar.f) {
            int d2 = this.d.d(sVar.f746a.f562a, this.f783a, this.f784b, this.e, this.f);
            if (d2 == -1) {
                return null;
            }
            int i3 = this.d.g(d2, this.f783a, true).c;
            Object obj = this.f783a.f241b;
            long j5 = sVar.f746a.d;
            long j6 = 0;
            if (this.d.l(i3, this.f784b).d == d2) {
                Pair<Integer, Long> j7 = this.d.j(this.f784b, this.f783a, i3, -9223372036854775807L, Math.max(0, (rVar.j() + sVar.e) - j2));
                if (j7 == null) {
                    return null;
                }
                int intValue = ((Integer) j7.first).intValue();
                long longValue = ((Long) j7.second).longValue();
                r rVar3 = rVar2.i;
                if (rVar3 == null || !rVar3.f715b.equals(obj)) {
                    j4 = this.c;
                    this.c = 1 + j4;
                } else {
                    j4 = rVar2.i.h.f746a.d;
                }
                j6 = longValue;
                j3 = j4;
                i2 = intValue;
            } else {
                i2 = d2;
                j3 = j5;
            }
            long j8 = j6;
            return j(z(i2, j8, j3), j8, j6);
        }
        f.b bVar = sVar.f746a;
        this.d.f(bVar.f562a, this.f783a);
        if (bVar.b()) {
            int i4 = bVar.f563b;
            int a2 = this.f783a.a(i4);
            if (a2 == -1) {
                return null;
            }
            int j9 = this.f783a.j(i4, bVar.c);
            if (j9 >= a2) {
                return l(bVar.f562a, sVar.d, bVar.d);
            } else if (!this.f783a.n(i4, j9)) {
                return null;
            } else {
                return k(bVar.f562a, i4, j9, sVar.d, bVar.d);
            }
        } else {
            long j10 = sVar.c;
            if (j10 != Long.MIN_VALUE) {
                int e2 = this.f783a.e(j10);
                if (e2 == -1) {
                    return l(bVar.f562a, sVar.c, bVar.d);
                }
                int i5 = this.f783a.i(e2);
                if (!this.f783a.n(e2, i5)) {
                    return null;
                }
                return k(bVar.f562a, e2, i5, sVar.c, bVar.d);
            }
            int c2 = this.f783a.c();
            if (c2 == 0) {
                return null;
            }
            int i6 = c2 - 1;
            if (this.f783a.f(i6) != Long.MIN_VALUE || this.f783a.m(i6)) {
                return null;
            }
            int i7 = this.f783a.i(i6);
            if (!this.f783a.n(i6, i7)) {
                return null;
            }
            return k(bVar.f562a, i6, i7, this.f783a.h(), bVar.d);
        }
    }

    private s j(f.b bVar, long j2, long j3) {
        this.d.f(bVar.f562a, this.f783a);
        if (!bVar.b()) {
            return l(bVar.f562a, j3, bVar.d);
        } else if (!this.f783a.n(bVar.f563b, bVar.c)) {
            return null;
        } else {
            return k(bVar.f562a, bVar.f563b, bVar.c, j2, bVar.d);
        }
    }

    private s k(int i2, int i3, int i4, long j2, long j3) {
        f.b bVar = new f.b(i2, i3, i4, j3);
        boolean t = t(bVar, Long.MIN_VALUE);
        boolean u = u(bVar, t);
        return new s(bVar, i4 == this.f783a.i(i3) ? this.f783a.g() : 0, Long.MIN_VALUE, j2, this.d.f(bVar.f562a, this.f783a).b(bVar.f563b, bVar.c), t, u);
    }

    private s l(int i2, long j2, long j3) {
        f.b bVar = new f.b(i2, j3);
        this.d.f(bVar.f562a, this.f783a);
        int d2 = this.f783a.d(j2);
        long f2 = d2 == -1 ? Long.MIN_VALUE : this.f783a.f(d2);
        boolean t = t(bVar, f2);
        return new s(bVar, j2, f2, -9223372036854775807L, f2 == Long.MIN_VALUE ? this.f783a.h() : f2, t, u(bVar, t));
    }

    private s q(s sVar, f.b bVar) {
        long j2;
        long h2;
        long j3 = sVar.f747b;
        long j4 = sVar.c;
        boolean t = t(bVar, j4);
        boolean u = u(bVar, t);
        this.d.f(bVar.f562a, this.f783a);
        if (bVar.b()) {
            h2 = this.f783a.b(bVar.f563b, bVar.c);
        } else if (j4 == Long.MIN_VALUE) {
            h2 = this.f783a.h();
        } else {
            j2 = j4;
            return new s(bVar, j3, j4, sVar.d, j2, t, u);
        }
        j2 = h2;
        return new s(bVar, j3, j4, sVar.d, j2, t, u);
    }

    private boolean t(f.b bVar, long j2) {
        int c2 = this.d.f(bVar.f562a, this.f783a).c();
        if (c2 == 0) {
            return true;
        }
        int i2 = c2 - 1;
        boolean b2 = bVar.b();
        if (this.f783a.f(i2) != Long.MIN_VALUE) {
            return !b2 && j2 == Long.MIN_VALUE;
        }
        int a2 = this.f783a.a(i2);
        if (a2 == -1) {
            return false;
        }
        if (!(b2 && bVar.f563b == i2 && bVar.c == a2 + -1)) {
            return !b2 && this.f783a.i(i2) == a2;
        }
        return true;
    }

    private boolean u(f.b bVar, boolean z) {
        return !this.d.l(this.d.f(bVar.f562a, this.f783a).c, this.f784b).c && this.d.q(bVar.f562a, this.f783a, this.f784b, this.e, this.f) && z;
    }

    private f.b z(int i2, long j2, long j3) {
        this.d.f(i2, this.f783a);
        int e2 = this.f783a.e(j2);
        if (e2 == -1) {
            return new f.b(i2, j3);
        }
        return new f.b(i2, e2, this.f783a.i(e2), j3);
    }

    public void B(g0 g0Var) {
        this.d = g0Var;
    }

    public boolean C() {
        r rVar = this.i;
        return rVar == null || (!rVar.h.g && rVar.l() && this.i.h.e != -9223372036854775807L && this.j < 100);
    }

    public boolean E(f.b bVar, long j2) {
        int i2 = bVar.f562a;
        r rVar = null;
        int i3 = i2;
        for (r h2 = h(); h2 != null; h2 = h2.i) {
            if (rVar == null) {
                h2.h = p(h2.h, i3);
            } else if (i3 == -1 || !h2.f715b.equals(this.d.g(i3, this.f783a, true).f241b)) {
                return true ^ x(rVar);
            } else {
                s g2 = g(rVar, j2);
                if (g2 == null) {
                    return true ^ x(rVar);
                }
                h2.h = p(h2.h, i3);
                if (!c(h2, g2)) {
                    return true ^ x(rVar);
                }
            }
            if (h2.h.f) {
                i3 = this.d.d(i3, this.f783a, this.f784b, this.e, this.f);
            }
            rVar = h2;
        }
        return true;
    }

    public boolean F(int i2) {
        this.e = i2;
        return D();
    }

    public boolean G(boolean z) {
        this.f = z;
        return D();
    }

    public r a() {
        r rVar = this.g;
        if (rVar != null) {
            if (rVar == this.h) {
                this.h = rVar.i;
            }
            rVar.n();
            this.g = this.g.i;
            int i2 = this.j - 1;
            this.j = i2;
            if (i2 == 0) {
                this.i = null;
            }
        } else {
            r rVar2 = this.i;
            this.g = rVar2;
            this.h = rVar2;
        }
        return this.g;
    }

    public r b() {
        r rVar = this.h;
        a.f((rVar == null || rVar.i == null) ? false : true);
        r rVar2 = this.h.i;
        this.h = rVar2;
        return rVar2;
    }

    public void d() {
        r h2 = h();
        if (h2 != null) {
            h2.n();
            x(h2);
        }
        this.g = null;
        this.i = null;
        this.h = null;
        this.j = 0;
    }

    public e e(b0[] b0VarArr, long j2, g gVar, b bVar, f fVar, Object obj, s sVar) {
        r rVar = this.i;
        r rVar2 = new r(b0VarArr, rVar == null ? sVar.f747b + j2 : rVar.j() + this.i.h.e, gVar, bVar, fVar, obj, sVar);
        if (this.i != null) {
            a.f(s());
            this.i.i = rVar2;
        }
        this.i = rVar2;
        this.j++;
        return rVar2.f714a;
    }

    public r h() {
        return s() ? this.g : this.i;
    }

    public r i() {
        return this.i;
    }

    public s m(long j2, v vVar) {
        r rVar = this.i;
        return rVar == null ? f(vVar) : g(rVar, j2);
    }

    public r n() {
        return this.g;
    }

    public r o() {
        return this.h;
    }

    public s p(s sVar, int i2) {
        return q(sVar, sVar.f746a.a(i2));
    }

    public h r(float f2) {
        return this.i.k(f2);
    }

    public boolean s() {
        return this.g != null;
    }

    public boolean v(e eVar) {
        r rVar = this.i;
        return rVar != null && rVar.f714a == eVar;
    }

    public void w(long j2) {
        r rVar = this.i;
        if (rVar != null) {
            rVar.m(j2);
        }
    }

    public boolean x(r rVar) {
        boolean z = false;
        a.f(rVar != null);
        this.i = rVar;
        while (true) {
            rVar = rVar.i;
            if (rVar != null) {
                if (rVar == this.h) {
                    this.h = this.g;
                    z = true;
                }
                rVar.n();
                this.j--;
            } else {
                this.i.i = null;
                return z;
            }
        }
    }

    public f.b y(int i2, long j2) {
        return z(i2, j2, A(i2));
    }
}
