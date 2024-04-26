package b.a.a.a.k0.t;

import b.a.a.a.k0.g;
import b.a.a.a.k0.t.w;
import b.a.a.a.n;
import b.a.a.a.o0.m.f;
import b.a.a.a.r0.a;
import b.a.a.a.r0.m;
import java.util.List;

final class t {

    /* renamed from: a  reason: collision with root package name */
    private final List<n> f464a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a.a.a.k0.n[] f465b;

    public t(List<n> list) {
        this.f464a = list;
        this.f465b = new b.a.a.a.k0.n[list.size()];
    }

    public void a(long j, m mVar) {
        f.a(j, mVar, this.f465b);
    }

    public void b(g gVar, w.d dVar) {
        for (int i = 0; i < this.f465b.length; i++) {
            dVar.a();
            b.a.a.a.k0.n f = gVar.f(dVar.c(), 3);
            n nVar = this.f464a.get(i);
            String str = nVar.f;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            a.b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = nVar.f542a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            f.c(n.n(str2, str, (String) null, -1, nVar.x, nVar.y, nVar.z, (b.a.a.a.j0.a) null));
            this.f465b[i] = f;
        }
    }
}
