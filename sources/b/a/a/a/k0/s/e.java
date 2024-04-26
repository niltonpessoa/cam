package b.a.a.a.k0.s;

import b.a.a.a.k0.f;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import b.a.a.a.u;
import java.io.EOFException;

final class e {
    private static final int i = w.o("OggS");

    /* renamed from: a  reason: collision with root package name */
    public int f407a;

    /* renamed from: b  reason: collision with root package name */
    public int f408b;
    public long c;
    public int d;
    public int e;
    public int f;
    public final int[] g = new int[255];
    private final m h = new m(255);

    e() {
    }

    public boolean a(f fVar, boolean z) {
        this.h.F();
        b();
        if (!(fVar.getLength() == -1 || fVar.getLength() - fVar.g() >= 27) || !fVar.f(this.h.f734a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.h.z() == ((long) i)) {
            int x = this.h.x();
            this.f407a = x;
            if (x == 0) {
                this.f408b = this.h.x();
                this.c = this.h.m();
                this.h.n();
                this.h.n();
                this.h.n();
                int x2 = this.h.x();
                this.d = x2;
                this.e = x2 + 27;
                this.h.F();
                fVar.h(this.h.f734a, 0, this.d);
                for (int i2 = 0; i2 < this.d; i2++) {
                    this.g[i2] = this.h.x();
                    this.f += this.g[i2];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new u("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new u("expected OggS capture pattern at begin of page");
        }
    }

    public void b() {
        this.f407a = 0;
        this.f408b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }
}
