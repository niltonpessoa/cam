package b.a.a.a;

import b.a.a.a.i0.e;
import b.a.a.a.j0.c;
import b.a.a.a.n0.j;
import b.a.a.a.r0.i;

public abstract class a implements a0, b0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f222a;

    /* renamed from: b  reason: collision with root package name */
    private c0 f223b;
    private int c;
    private int d;
    private j e;
    private long f;
    private boolean g = true;
    private boolean h;

    public a(int i) {
        this.f222a = i;
    }

    protected static boolean K(c<?> cVar, b.a.a.a.j0.a aVar) {
        if (aVar == null) {
            return true;
        }
        if (cVar == null) {
            return false;
        }
        return cVar.a(aVar);
    }

    /* access modifiers changed from: protected */
    public final int A() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return this.g ? this.h : this.e.e();
    }

    /* access modifiers changed from: protected */
    public abstract void C();

    /* access modifiers changed from: protected */
    public void D(boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void E(long j, boolean z);

    /* access modifiers changed from: protected */
    public void F() {
    }

    /* access modifiers changed from: protected */
    public void G() {
    }

    /* access modifiers changed from: protected */
    public void H(n[] nVarArr, long j) {
    }

    /* access modifiers changed from: protected */
    public final int I(o oVar, e eVar, boolean z) {
        int a2 = this.e.a(oVar, eVar, z);
        if (a2 == -4) {
            if (eVar.j()) {
                this.g = true;
                return this.h ? -4 : -3;
            }
            eVar.d += this.f;
        } else if (a2 == -5) {
            n nVar = oVar.f593a;
            long j = nVar.w;
            if (j != Long.MAX_VALUE) {
                oVar.f593a = nVar.e(j + this.f);
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public int J(long j) {
        return this.e.c(j - this.f);
    }

    public final int d() {
        return this.d;
    }

    public final int g() {
        return this.f222a;
    }

    public final void h() {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        b.a.a.a.r0.a.f(z);
        this.d = 0;
        this.e = null;
        this.h = false;
        C();
    }

    public final void i() {
        this.h = true;
    }

    public final void j() {
        b.a.a.a.r0.a.f(this.d == 2);
        this.d = 1;
        G();
    }

    public final void k() {
        this.e.b();
    }

    public final void l(int i) {
        this.c = i;
    }

    public final void m() {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        b.a.a.a.r0.a.f(z);
        this.d = 2;
        F();
    }

    public final boolean n() {
        return this.g;
    }

    public final void o(long j) {
        this.h = false;
        this.g = false;
        E(j, false);
    }

    public final boolean p() {
        return this.h;
    }

    public i q() {
        return null;
    }

    public final void r(c0 c0Var, n[] nVarArr, j jVar, long j, boolean z, long j2) {
        b.a.a.a.r0.a.f(this.d == 0);
        this.f223b = c0Var;
        this.d = 1;
        D(z);
        y(nVarArr, jVar, j2);
        E(j, z);
    }

    public int s() {
        return 0;
    }

    public void u(int i, Object obj) {
    }

    public final b0 v() {
        return this;
    }

    public final j w() {
        return this.e;
    }

    public final void y(n[] nVarArr, j jVar, long j) {
        b.a.a.a.r0.a.f(!this.h);
        this.e = jVar;
        this.g = false;
        this.f = j;
        H(nVarArr, j);
    }

    /* access modifiers changed from: protected */
    public final c0 z() {
        return this.f223b;
    }
}
