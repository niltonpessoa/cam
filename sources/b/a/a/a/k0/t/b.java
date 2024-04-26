package b.a.a.a.k0.t;

import b.a.a.a.h0.a;
import b.a.a.a.k0.g;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.l;
import b.a.a.a.r0.m;
import java.util.List;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final l f422a;

    /* renamed from: b  reason: collision with root package name */
    private final m f423b;
    private final String c;
    private String d;
    private n e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private b.a.a.a.n j;
    private int k;
    private long l;

    public b() {
        this((String) null);
    }

    public b(String str) {
        l lVar = new l(new byte[128]);
        this.f422a = lVar;
        this.f423b = new m(lVar.f732a);
        this.f = 0;
        this.c = str;
    }

    private boolean b(m mVar, byte[] bArr, int i2) {
        int min = Math.min(mVar.a(), i2 - this.g);
        mVar.g(bArr, this.g, min);
        int i3 = this.g + min;
        this.g = i3;
        return i3 == i2;
    }

    private void g() {
        this.f422a.m(0);
        a.b d2 = a.d(this.f422a);
        b.a.a.a.n nVar = this.j;
        if (!(nVar != null && d2.c == nVar.r && d2.f248b == nVar.s && d2.f247a == nVar.f)) {
            b.a.a.a.n h2 = b.a.a.a.n.h(this.d, d2.f247a, (String) null, -1, -1, d2.c, d2.f248b, (List<byte[]>) null, (b.a.a.a.j0.a) null, 0, this.c);
            this.j = h2;
            this.e.c(h2);
        }
        this.k = d2.d;
        this.i = (((long) d2.e) * 1000000) / ((long) this.j.s);
    }

    private boolean h(m mVar) {
        while (true) {
            boolean z = false;
            if (mVar.a() <= 0) {
                return false;
            }
            if (this.h) {
                int x = mVar.x();
                if (x == 119) {
                    this.h = false;
                    return true;
                } else if (x != 11) {
                    this.h = z;
                }
            } else if (mVar.x() != 11) {
                this.h = z;
            }
            z = true;
            this.h = z;
        }
    }

    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
    }

    public void c(m mVar) {
        while (mVar.a() > 0) {
            int i2 = this.f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(mVar.a(), this.k - this.g);
                        this.e.a(mVar, min);
                        int i3 = this.g + min;
                        this.g = i3;
                        int i4 = this.k;
                        if (i3 == i4) {
                            this.e.d(this.l, 1, i4, 0, (n.a) null);
                            this.l += this.i;
                            this.f = 0;
                        }
                    }
                } else if (b(mVar, this.f423b.f734a, 128)) {
                    g();
                    this.f423b.J(0);
                    this.e.a(this.f423b, 128);
                    this.f = 2;
                }
            } else if (h(mVar)) {
                this.f = 1;
                byte[] bArr = this.f423b.f734a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.g = 2;
            }
        }
    }

    public void d(long j2, boolean z) {
        this.l = j2;
    }

    public void e() {
    }

    public void f(g gVar, w.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = gVar.f(dVar.c(), 1);
    }
}
