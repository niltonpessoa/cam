package b.a.a.a.o0;

import b.a.a.a.i0.f;
import java.util.List;

public abstract class j extends f implements e {
    private e d;
    private long e;

    public int a(long j) {
        return this.d.a(j - this.e);
    }

    public List<b> b(long j) {
        return this.d.b(j - this.e);
    }

    public long c(int i) {
        return this.d.c(i) + this.e;
    }

    public int d() {
        return this.d.d();
    }

    public void f() {
        super.f();
        this.d = null;
    }

    public abstract void m();

    public void n(long j, e eVar, long j2) {
        this.f297b = j;
        this.d = eVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.e = j;
    }
}
