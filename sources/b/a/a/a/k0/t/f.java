package b.a.a.a.k0.t;

import b.a.a.a.h0.i;
import b.a.a.a.j0.a;
import b.a.a.a.k0.g;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;

public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    private final m f430a = new m(new byte[18]);

    /* renamed from: b  reason: collision with root package name */
    private final String f431b;
    private String c;
    private n d;
    private int e = 0;
    private int f;
    private int g;
    private long h;
    private b.a.a.a.n i;
    private int j;
    private long k;

    public f(String str) {
        this.f431b = str;
    }

    private boolean b(m mVar, byte[] bArr, int i2) {
        int min = Math.min(mVar.a(), i2 - this.f);
        mVar.g(bArr, this.f, min);
        int i3 = this.f + min;
        this.f = i3;
        return i3 == i2;
    }

    private void g() {
        byte[] bArr = this.f430a.f734a;
        if (this.i == null) {
            b.a.a.a.n g2 = i.g(bArr, this.c, this.f431b, (a) null);
            this.i = g2;
            this.d.c(g2);
        }
        this.j = i.a(bArr);
        this.h = (long) ((int) ((((long) i.f(bArr)) * 1000000) / ((long) this.i.s)));
    }

    private boolean h(m mVar) {
        while (mVar.a() > 0) {
            int i2 = this.g << 8;
            this.g = i2;
            int x = i2 | mVar.x();
            this.g = x;
            if (i.d(x)) {
                byte[] bArr = this.f430a.f734a;
                int i3 = this.g;
                bArr[0] = (byte) ((i3 >> 24) & 255);
                bArr[1] = (byte) ((i3 >> 16) & 255);
                bArr[2] = (byte) ((i3 >> 8) & 255);
                bArr[3] = (byte) (i3 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    public void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public void c(m mVar) {
        while (mVar.a() > 0) {
            int i2 = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(mVar.a(), this.j - this.f);
                        this.d.a(mVar, min);
                        int i3 = this.f + min;
                        this.f = i3;
                        int i4 = this.j;
                        if (i3 == i4) {
                            this.d.d(this.k, 1, i4, 0, (n.a) null);
                            this.k += this.h;
                            this.e = 0;
                        }
                    }
                } else if (b(mVar, this.f430a.f734a, 18)) {
                    g();
                    this.f430a.J(0);
                    this.d.a(this.f430a, 18);
                    this.e = 2;
                }
            } else if (h(mVar)) {
                this.e = 1;
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
        this.c = dVar.b();
        this.d = gVar.f(dVar.c(), 1);
    }
}
