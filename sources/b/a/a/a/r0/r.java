package b.a.a.a.r0;

import b.a.a.a.b;
import b.a.a.a.w;

public final class r implements i {

    /* renamed from: a  reason: collision with root package name */
    private final b f738a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f739b;
    private long c;
    private long d;
    private w e = w.d;

    public r(b bVar) {
        this.f738a = bVar;
    }

    public void a(long j) {
        this.c = j;
        if (this.f739b) {
            this.d = this.f738a.b();
        }
    }

    public void b() {
        if (!this.f739b) {
            this.d = this.f738a.b();
            this.f739b = true;
        }
    }

    public w c() {
        return this.e;
    }

    public void d() {
        if (this.f739b) {
            a(x());
            this.f739b = false;
        }
    }

    public w f(w wVar) {
        if (this.f739b) {
            a(x());
        }
        this.e = wVar;
        return wVar;
    }

    public long x() {
        long j = this.c;
        if (!this.f739b) {
            return j;
        }
        long b2 = this.f738a.b() - this.d;
        w wVar = this.e;
        return j + (wVar.f787a == 1.0f ? b.a(b2) : wVar.a(b2));
    }
}
