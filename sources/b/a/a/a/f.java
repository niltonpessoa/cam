package b.a.a.a;

import b.a.a.a.r0.b;
import b.a.a.a.r0.i;
import b.a.a.a.r0.r;

final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final r f232a;

    /* renamed from: b  reason: collision with root package name */
    private final a f233b;
    private a0 c;
    private i d;

    public interface a {
        void b(w wVar);
    }

    public f(a aVar, b bVar) {
        this.f233b = aVar;
        this.f232a = new r(bVar);
    }

    private void a() {
        this.f232a.a(this.d.x());
        w c2 = this.d.c();
        if (!c2.equals(this.f232a.c())) {
            this.f232a.f(c2);
            this.f233b.b(c2);
        }
    }

    private boolean b() {
        a0 a0Var = this.c;
        return a0Var != null && !a0Var.b() && (this.c.e() || !this.c.n());
    }

    public w c() {
        i iVar = this.d;
        return iVar != null ? iVar.c() : this.f232a.c();
    }

    public void d(a0 a0Var) {
        if (a0Var == this.c) {
            this.d = null;
            this.c = null;
        }
    }

    public void e(a0 a0Var) {
        i iVar;
        i q = a0Var.q();
        if (q != null && q != (iVar = this.d)) {
            if (iVar == null) {
                this.d = q;
                this.c = a0Var;
                q.f(this.f232a.c());
                a();
                return;
            }
            throw h.c(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public w f(w wVar) {
        i iVar = this.d;
        if (iVar != null) {
            wVar = iVar.f(wVar);
        }
        this.f232a.f(wVar);
        this.f233b.b(wVar);
        return wVar;
    }

    public void g(long j) {
        this.f232a.a(j);
    }

    public void h() {
        this.f232a.b();
    }

    public void i() {
        this.f232a.d();
    }

    public long j() {
        if (!b()) {
            return this.f232a.x();
        }
        a();
        return this.d.x();
    }

    public long x() {
        return b() ? this.d.x() : this.f232a.x();
    }
}
