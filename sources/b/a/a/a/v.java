package b.a.a.a;

import b.a.a.a.n0.f;
import b.a.a.a.p0.h;

final class v {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f785a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f786b;
    public final f.b c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final h h;
    public volatile long i;
    public volatile long j;

    public v(g0 g0Var, long j2, h hVar) {
        this(g0Var, (Object) null, new f.b(0), j2, -9223372036854775807L, 1, false, hVar);
    }

    public v(g0 g0Var, Object obj, f.b bVar, long j2, long j3, int i2, boolean z, h hVar) {
        this.f785a = g0Var;
        this.f786b = obj;
        this.c = bVar;
        this.d = j2;
        this.e = j3;
        this.i = j2;
        this.j = j2;
        this.f = i2;
        this.g = z;
        this.h = hVar;
    }

    private static void a(v vVar, v vVar2) {
        vVar2.i = vVar.i;
        vVar2.j = vVar.j;
    }

    public v b(boolean z) {
        v vVar = new v(this.f785a, this.f786b, this.c, this.d, this.e, this.f, z, this.h);
        a(this, vVar);
        return vVar;
    }

    public v c(int i2) {
        v vVar = new v(this.f785a, this.f786b, this.c.a(i2), this.d, this.e, this.f, this.g, this.h);
        a(this, vVar);
        return vVar;
    }

    public v d(int i2) {
        v vVar = new v(this.f785a, this.f786b, this.c, this.d, this.e, i2, this.g, this.h);
        a(this, vVar);
        return vVar;
    }

    public v e(g0 g0Var, Object obj) {
        v vVar = new v(g0Var, obj, this.c, this.d, this.e, this.f, this.g, this.h);
        a(this, vVar);
        return vVar;
    }

    public v f(h hVar) {
        v vVar = new v(this.f785a, this.f786b, this.c, this.d, this.e, this.f, this.g, hVar);
        a(this, vVar);
        return vVar;
    }

    public v g(f.b bVar, long j2, long j3) {
        return new v(this.f785a, this.f786b, bVar, j2, bVar.b() ? j3 : -9223372036854775807L, this.f, this.g, this.h);
    }
}
