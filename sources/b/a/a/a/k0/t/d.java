package b.a.a.a.k0.t;

import android.util.Log;
import android.util.Pair;
import b.a.a.a.j0.a;
import b.a.a.a.k0.g;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.c;
import b.a.a.a.r0.l;
import b.a.a.a.r0.m;
import java.util.Arrays;
import java.util.Collections;

public final class d implements h {
    private static final byte[] r = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f426a;

    /* renamed from: b  reason: collision with root package name */
    private final l f427b;
    private final m c;
    private final String d;
    private String e;
    private n f;
    private n g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private long m;
    private int n;
    private long o;
    private n p;
    private long q;

    public d(boolean z) {
        this(z, (String) null);
    }

    public d(boolean z, String str) {
        this.f427b = new l(new byte[7]);
        this.c = new m(Arrays.copyOf(r, 10));
        k();
        this.f426a = z;
        this.d = str;
    }

    private boolean b(m mVar, byte[] bArr, int i2) {
        int min = Math.min(mVar.a(), i2 - this.i);
        mVar.g(bArr, this.i, min);
        int i3 = this.i + min;
        this.i = i3;
        return i3 == i2;
    }

    private void g(m mVar) {
        int i2;
        byte[] bArr = mVar.f734a;
        int c2 = mVar.c();
        int d2 = mVar.d();
        while (c2 < d2) {
            int i3 = c2 + 1;
            byte b2 = bArr[c2] & 255;
            int i4 = this.j;
            if (i4 != 512 || b2 < 240 || b2 == 255) {
                byte b3 = b2 | i4;
                if (b3 != 329) {
                    if (b3 == 511) {
                        this.j = 512;
                    } else if (b3 == 836) {
                        i2 = 1024;
                    } else if (b3 == 1075) {
                        m();
                    } else if (i4 != 256) {
                        this.j = 256;
                        i3--;
                    }
                    c2 = i3;
                } else {
                    i2 = 768;
                }
                this.j = i2;
                c2 = i3;
            } else {
                boolean z = true;
                if ((b2 & 1) != 0) {
                    z = false;
                }
                this.k = z;
                l();
            }
            mVar.J(i3);
            return;
        }
        mVar.J(c2);
    }

    private void h() {
        this.f427b.m(0);
        if (!this.l) {
            int h2 = this.f427b.h(2) + 1;
            if (h2 != 2) {
                Log.w("AdtsReader", "Detected audio object type: " + h2 + ", but assuming AAC LC.");
                h2 = 2;
            }
            int h3 = this.f427b.h(4);
            this.f427b.o(1);
            byte[] a2 = c.a(h2, h3, this.f427b.h(3));
            Pair<Integer, Integer> f2 = c.f(a2);
            b.a.a.a.n h4 = b.a.a.a.n.h(this.e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) f2.second).intValue(), ((Integer) f2.first).intValue(), Collections.singletonList(a2), (a) null, 0, this.d);
            this.m = 1024000000 / ((long) h4.s);
            this.f.c(h4);
            this.l = true;
        } else {
            this.f427b.o(10);
        }
        this.f427b.o(4);
        int h5 = (this.f427b.h(13) - 2) - 5;
        if (this.k) {
            h5 -= 2;
        }
        n(this.f, this.m, 0, h5);
    }

    private void i() {
        this.g.a(this.c, 10);
        this.c.J(6);
        n(this.g, 0, 10, this.c.w() + 10);
    }

    private void j(m mVar) {
        int min = Math.min(mVar.a(), this.n - this.i);
        this.p.a(mVar, min);
        int i2 = this.i + min;
        this.i = i2;
        int i3 = this.n;
        if (i2 == i3) {
            this.p.d(this.o, 1, i3, 0, (n.a) null);
            this.o += this.q;
            k();
        }
    }

    private void k() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    private void l() {
        this.h = 2;
        this.i = 0;
    }

    private void m() {
        this.h = 1;
        this.i = r.length;
        this.n = 0;
        this.c.J(0);
    }

    private void n(n nVar, long j2, int i2, int i3) {
        this.h = 3;
        this.i = i2;
        this.p = nVar;
        this.q = j2;
        this.n = i3;
    }

    public void a() {
        k();
    }

    public void c(m mVar) {
        while (mVar.a() > 0) {
            int i2 = this.h;
            if (i2 == 0) {
                g(mVar);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    if (b(mVar, this.f427b.f732a, this.k ? 7 : 5)) {
                        h();
                    }
                } else if (i2 == 3) {
                    j(mVar);
                }
            } else if (b(mVar, this.c.f734a, 10)) {
                i();
            }
        }
    }

    public void d(long j2, boolean z) {
        this.o = j2;
    }

    public void e() {
    }

    public void f(g gVar, w.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = gVar.f(dVar.c(), 1);
        if (this.f426a) {
            dVar.a();
            n f2 = gVar.f(dVar.c(), 4);
            this.g = f2;
            f2.c(b.a.a.a.n.k(dVar.b(), "application/id3", (String) null, -1, (a) null));
            return;
        }
        this.g = new b.a.a.a.k0.d();
    }
}
