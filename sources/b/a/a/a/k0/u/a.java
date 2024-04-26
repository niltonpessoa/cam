package b.a.a.a.k0.u;

import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.k;
import b.a.a.a.k0.n;
import b.a.a.a.u;
import java.util.List;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private g f480a;

    /* renamed from: b  reason: collision with root package name */
    private n f481b;
    private b c;
    private int d;
    private int e;

    public void a() {
    }

    public void d(g gVar) {
        this.f480a = gVar;
        this.f481b = gVar.f(0, 1);
        this.c = null;
        gVar.d();
    }

    public void f(long j, long j2) {
        this.e = 0;
    }

    public int g(f fVar, k kVar) {
        if (this.c == null) {
            b a2 = c.a(fVar);
            this.c = a2;
            if (a2 != null) {
                this.f481b.c(b.a.a.a.n.g((String) null, "audio/raw", (String) null, a2.a(), 32768, this.c.g(), this.c.h(), this.c.f(), (List<byte[]>) null, (b.a.a.a.j0.a) null, 0, (String) null));
                this.d = this.c.d();
            } else {
                throw new u("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.c.j()) {
            c.b(fVar, this.c);
            this.f480a.c(this.c);
        }
        int b2 = this.f481b.b(fVar, 32768 - this.e, true);
        if (b2 != -1) {
            this.e += b2;
        }
        int i = this.e / this.d;
        if (i > 0) {
            long c2 = this.c.c(fVar.k() - ((long) this.e));
            int i2 = i * this.d;
            int i3 = this.e - i2;
            this.e = i3;
            this.f481b.d(c2, 1, i2, i3, (n.a) null);
        }
        return b2 == -1 ? -1 : 0;
    }

    public boolean h(f fVar) {
        return c.a(fVar) != null;
    }
}
