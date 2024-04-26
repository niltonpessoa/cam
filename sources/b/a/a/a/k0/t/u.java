package b.a.a.a.k0.t;

import b.a.a.a.j0.a;
import b.a.a.a.k0.g;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;

public final class u implements r {

    /* renamed from: a  reason: collision with root package name */
    private b.a.a.a.r0.u f466a;

    /* renamed from: b  reason: collision with root package name */
    private n f467b;
    private boolean c;

    public void b(b.a.a.a.r0.u uVar, g gVar, w.d dVar) {
        this.f466a = uVar;
        dVar.a();
        n f = gVar.f(dVar.c(), 4);
        this.f467b = f;
        f.c(b.a.a.a.n.k(dVar.b(), "application/x-scte35", (String) null, -1, (a) null));
    }

    public void c(m mVar) {
        if (!this.c) {
            if (this.f466a.e() != -9223372036854775807L) {
                this.f467b.c(b.a.a.a.n.j((String) null, "application/x-scte35", this.f466a.e()));
                this.c = true;
            } else {
                return;
            }
        }
        int a2 = mVar.a();
        this.f467b.a(mVar, a2);
        this.f467b.d(this.f466a.d(), 1, a2, 0, (n.a) null);
    }
}
