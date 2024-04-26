package b.a.a.a.k0.t;

import android.util.Pair;
import b.a.a.a.j0.a;
import b.a.a.a.k0.g;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.c;
import b.a.a.a.r0.l;
import b.a.a.a.u;
import java.util.Collections;

public final class m implements h {

    /* renamed from: a  reason: collision with root package name */
    private final String f450a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a.a.a.r0.m f451b;
    private final l c;
    private n d;
    private b.a.a.a.n e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    public m(String str) {
        this.f450a = str;
        b.a.a.a.r0.m mVar = new b.a.a.a.r0.m(1024);
        this.f451b = mVar;
        this.c = new l(mVar.f734a);
    }

    private static long b(l lVar) {
        return (long) lVar.h((lVar.h(2) + 1) * 8);
    }

    private void g(l lVar) {
        if (!lVar.g()) {
            this.l = true;
            l(lVar);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw new u();
        } else if (this.n == 0) {
            k(lVar, j(lVar));
            if (this.p) {
                lVar.o((int) this.q);
            }
        } else {
            throw new u();
        }
    }

    private int h(l lVar) {
        int b2 = lVar.b();
        Pair<Integer, Integer> e2 = c.e(lVar, true);
        this.r = ((Integer) e2.first).intValue();
        this.t = ((Integer) e2.second).intValue();
        return b2 - lVar.b();
    }

    private void i(l lVar) {
        int i2;
        int h2 = lVar.h(3);
        this.o = h2;
        if (h2 == 0) {
            i2 = 8;
        } else if (h2 == 1) {
            i2 = 9;
        } else if (h2 == 3 || h2 == 4 || h2 == 5) {
            lVar.o(6);
            return;
        } else if (h2 == 6 || h2 == 7) {
            lVar.o(1);
            return;
        } else {
            return;
        }
        lVar.o(i2);
    }

    private int j(l lVar) {
        int h2;
        if (this.o == 0) {
            int i2 = 0;
            do {
                h2 = lVar.h(8);
                i2 += h2;
            } while (h2 == 255);
            return i2;
        }
        throw new u();
    }

    private void k(l lVar, int i2) {
        int e2 = lVar.e();
        if ((e2 & 7) == 0) {
            this.f451b.J(e2 >> 3);
        } else {
            lVar.i(this.f451b.f734a, 0, i2 * 8);
            this.f451b.J(0);
        }
        this.d.a(this.f451b, i2);
        this.d.d(this.k, 1, i2, 0, (n.a) null);
        this.k += this.s;
    }

    private void l(l lVar) {
        boolean g2;
        l lVar2 = lVar;
        int h2 = lVar2.h(1);
        int h3 = h2 == 1 ? lVar2.h(1) : 0;
        this.m = h3;
        if (h3 == 0) {
            if (h2 == 1) {
                b(lVar);
            }
            if (lVar.g()) {
                this.n = lVar2.h(6);
                int h4 = lVar2.h(4);
                int h5 = lVar2.h(3);
                if (h4 == 0 && h5 == 0) {
                    if (h2 == 0) {
                        int e2 = lVar.e();
                        int h6 = h(lVar);
                        lVar2.m(e2);
                        byte[] bArr = new byte[((h6 + 7) / 8)];
                        lVar2.i(bArr, 0, h6);
                        b.a.a.a.n h7 = b.a.a.a.n.h(this.f, "audio/mp4a-latm", (String) null, -1, -1, this.t, this.r, Collections.singletonList(bArr), (a) null, 0, this.f450a);
                        if (!h7.equals(this.e)) {
                            this.e = h7;
                            this.s = 1024000000 / ((long) h7.s);
                            this.d.c(h7);
                        }
                    } else {
                        lVar2.o(((int) b(lVar)) - h(lVar));
                    }
                    i(lVar);
                    boolean g3 = lVar.g();
                    this.p = g3;
                    this.q = 0;
                    if (g3) {
                        if (h2 == 1) {
                            this.q = b(lVar);
                        } else {
                            do {
                                g2 = lVar.g();
                                this.q = (this.q << 8) + ((long) lVar2.h(8));
                            } while (g2);
                        }
                    }
                    if (lVar.g()) {
                        lVar2.o(8);
                        return;
                    }
                    return;
                }
                throw new u();
            }
            throw new u();
        }
        throw new u();
    }

    private void m(int i2) {
        this.f451b.G(i2);
        this.c.k(this.f451b.f734a);
    }

    public void a() {
        this.g = 0;
        this.l = false;
    }

    public void c(b.a.a.a.r0.m mVar) {
        while (mVar.a() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 == 1) {
                    int x = mVar.x();
                    if ((x & 224) == 224) {
                        this.j = x;
                        this.g = 2;
                    } else if (x == 86) {
                    }
                } else if (i2 == 2) {
                    int x2 = ((this.j & -225) << 8) | mVar.x();
                    this.i = x2;
                    if (x2 > this.f451b.f734a.length) {
                        m(x2);
                    }
                    this.h = 0;
                    this.g = 3;
                } else if (i2 == 3) {
                    int min = Math.min(mVar.a(), this.i - this.h);
                    mVar.g(this.c.f732a, this.h, min);
                    int i3 = this.h + min;
                    this.h = i3;
                    if (i3 == this.i) {
                        this.c.m(0);
                        g(this.c);
                    }
                }
                this.g = 0;
            } else if (mVar.x() == 86) {
                this.g = 1;
            }
        }
    }

    public void d(long j2, boolean z) {
        this.k = j2;
    }

    public void e() {
    }

    public void f(g gVar, w.d dVar) {
        dVar.a();
        this.d = gVar.f(dVar.c(), 1);
        this.f = dVar.b();
    }
}
