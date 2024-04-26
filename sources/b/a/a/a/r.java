package b.a.a.a;

import android.util.Log;
import b.a.a.a.n0.e;
import b.a.a.a.n0.f;
import b.a.a.a.n0.j;
import b.a.a.a.p0.g;
import b.a.a.a.p0.h;
import b.a.a.a.q0.b;
import b.a.a.a.r0.a;

final class r {

    /* renamed from: a  reason: collision with root package name */
    public final e f714a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f715b;
    public final j[] c;
    public final boolean[] d;
    public long e;
    public boolean f;
    public boolean g;
    public s h;
    public r i;
    public h j;
    private final b0[] k;
    private final g l;
    private final f m;
    private h n;

    public r(b0[] b0VarArr, long j2, g gVar, b bVar, f fVar, Object obj, s sVar) {
        this.k = b0VarArr;
        this.e = j2 - sVar.f747b;
        this.l = gVar;
        this.m = fVar;
        a.e(obj);
        this.f715b = obj;
        this.h = sVar;
        this.c = new j[b0VarArr.length];
        this.d = new boolean[b0VarArr.length];
        e a2 = fVar.a(sVar.f746a, bVar);
        long j3 = sVar.c;
        if (j3 != Long.MIN_VALUE) {
            b.a.a.a.n0.a aVar = new b.a.a.a.n0.a(a2, true);
            aVar.h(0, j3);
            a2 = aVar;
        }
        this.f714a = a2;
    }

    private void c(j[] jVarArr) {
        int i2 = 0;
        while (true) {
            b0[] b0VarArr = this.k;
            if (i2 < b0VarArr.length) {
                if (b0VarArr[i2].g() == 5 && this.j.f682b[i2]) {
                    jVarArr[i2] = new b.a.a.a.n0.b();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void e(h hVar) {
        int i2 = 0;
        while (true) {
            boolean[] zArr = hVar.f682b;
            if (i2 < zArr.length) {
                boolean z = zArr[i2];
                b.a.a.a.p0.e a2 = hVar.c.a(i2);
                if (z && a2 != null) {
                    a2.h();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void f(j[] jVarArr) {
        int i2 = 0;
        while (true) {
            b0[] b0VarArr = this.k;
            if (i2 < b0VarArr.length) {
                if (b0VarArr[i2].g() == 5) {
                    jVarArr[i2] = null;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void g(h hVar) {
        int i2 = 0;
        while (true) {
            boolean[] zArr = hVar.f682b;
            if (i2 < zArr.length) {
                boolean z = zArr[i2];
                b.a.a.a.p0.e a2 = hVar.c.a(i2);
                if (z && a2 != null) {
                    a2.f();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void r(h hVar) {
        h hVar2 = this.n;
        if (hVar2 != null) {
            e(hVar2);
        }
        this.n = hVar;
        if (hVar != null) {
            g(hVar);
        }
    }

    public long a(long j2, boolean z) {
        return b(j2, z, new boolean[this.k.length]);
    }

    public long b(long j2, boolean z, boolean[] zArr) {
        b.a.a.a.p0.f fVar = this.j.c;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= fVar.f679a) {
                break;
            }
            boolean[] zArr2 = this.d;
            if (z || !this.j.b(this.n, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        f(this.c);
        r(this.j);
        long l2 = this.f714a.l(fVar.b(), this.d, this.c, zArr, j2);
        c(this.c);
        this.g = false;
        int i3 = 0;
        while (true) {
            j[] jVarArr = this.c;
            if (i3 >= jVarArr.length) {
                return l2;
            }
            if (jVarArr[i3] != null) {
                a.f(this.j.f682b[i3]);
                if (this.k[i3].g() != 5) {
                    this.g = true;
                }
            } else {
                a.f(fVar.a(i3) == null);
            }
            i3++;
        }
    }

    public void d(long j2) {
        this.f714a.r(p(j2));
    }

    public long h(boolean z) {
        if (!this.f) {
            return this.h.f747b;
        }
        long i2 = this.f714a.i();
        return (i2 != Long.MIN_VALUE || !z) ? i2 : this.h.e;
    }

    public long i() {
        if (!this.f) {
            return 0;
        }
        return this.f714a.o();
    }

    public long j() {
        return this.e;
    }

    public h k(float f2) {
        this.f = true;
        o(f2);
        long a2 = a(this.h.f747b, false);
        long j2 = this.e;
        s sVar = this.h;
        this.e = j2 + (sVar.f747b - a2);
        this.h = sVar.b(a2);
        return this.j;
    }

    public boolean l() {
        return this.f && (!this.g || this.f714a.i() == Long.MIN_VALUE);
    }

    public void m(long j2) {
        if (this.f) {
            this.f714a.t(p(j2));
        }
    }

    public void n() {
        f fVar;
        e eVar;
        r((h) null);
        try {
            if (this.h.c != Long.MIN_VALUE) {
                fVar = this.m;
                eVar = ((b.a.a.a.n0.a) this.f714a).f544a;
            } else {
                fVar = this.m;
                eVar = this.f714a;
            }
            fVar.d(eVar);
        } catch (RuntimeException e2) {
            Log.e("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public boolean o(float f2) {
        h c2 = this.l.c(this.k, this.f714a.b());
        if (c2.a(this.n)) {
            return false;
        }
        this.j = c2;
        for (b.a.a.a.p0.e eVar : c2.c.b()) {
            if (eVar != null) {
                eVar.g(f2);
            }
        }
        return true;
    }

    public long p(long j2) {
        return j2 - j();
    }

    public long q(long j2) {
        return j2 + j();
    }
}
