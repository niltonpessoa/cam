package b.a.a.a.p0;

import b.a.a.a.c0;
import b.a.a.a.n0.n;
import b.a.a.a.r0.w;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final n f681a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean[] f682b;
    public final f c;
    public final Object d;
    public final c0[] e;

    public h(n nVar, boolean[] zArr, f fVar, Object obj, c0[] c0VarArr) {
        this.f681a = nVar;
        this.f682b = zArr;
        this.c = fVar;
        this.d = obj;
        this.e = c0VarArr;
    }

    public boolean a(h hVar) {
        if (hVar == null || hVar.c.f679a != this.c.f679a) {
            return false;
        }
        for (int i = 0; i < this.c.f679a; i++) {
            if (!b(hVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(h hVar, int i) {
        return hVar != null && this.f682b[i] == hVar.f682b[i] && w.b(this.c.a(i), hVar.c.a(i)) && w.b(this.e[i], hVar.e[i]);
    }
}
