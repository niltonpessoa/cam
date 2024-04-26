package b.a.a.a.k0.t;

import b.a.a.a.j0.a;
import b.a.a.a.k0.g;
import b.a.a.a.k0.j;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;
import java.util.List;

public final class n implements h {

    /* renamed from: a  reason: collision with root package name */
    private final m f452a;

    /* renamed from: b  reason: collision with root package name */
    private final j f453b;
    private final String c;
    private String d;
    private b.a.a.a.k0.n e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public n() {
        this((String) null);
    }

    public n(String str) {
        this.f = 0;
        m mVar = new m(4);
        this.f452a = mVar;
        mVar.f734a[0] = -1;
        this.f453b = new j();
        this.c = str;
    }

    private void b(m mVar) {
        byte[] bArr = mVar.f734a;
        int d2 = mVar.d();
        for (int c2 = mVar.c(); c2 < d2; c2++) {
            boolean z = (bArr[c2] & 255) == 255;
            boolean z2 = this.i && (bArr[c2] & 224) == 224;
            this.i = z;
            if (z2) {
                mVar.J(c2 + 1);
                this.i = false;
                this.f452a.f734a[1] = bArr[c2];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        mVar.J(d2);
    }

    private void g(m mVar) {
        int min = Math.min(mVar.a(), this.k - this.g);
        this.e.a(mVar, min);
        int i2 = this.g + min;
        this.g = i2;
        int i3 = this.k;
        if (i2 >= i3) {
            this.e.d(this.l, 1, i3, 0, (n.a) null);
            this.l += this.j;
            this.g = 0;
            this.f = 0;
        }
    }

    private void h(m mVar) {
        int min = Math.min(mVar.a(), 4 - this.g);
        mVar.g(this.f452a.f734a, this.g, min);
        int i2 = this.g + min;
        this.g = i2;
        if (i2 >= 4) {
            this.f452a.J(0);
            if (!j.b(this.f452a.i(), this.f453b)) {
                this.g = 0;
                this.f = 1;
                return;
            }
            j jVar = this.f453b;
            this.k = jVar.c;
            if (!this.h) {
                int i3 = jVar.d;
                this.j = (((long) jVar.g) * 1000000) / ((long) i3);
                this.e.c(b.a.a.a.n.h(this.d, jVar.f319b, (String) null, -1, 4096, jVar.e, i3, (List<byte[]>) null, (a) null, 0, this.c));
                this.h = true;
            }
            this.f452a.J(0);
            this.e.a(this.f452a, 4);
            this.f = 2;
        }
    }

    public void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }

    public void c(m mVar) {
        while (mVar.a() > 0) {
            int i2 = this.f;
            if (i2 == 0) {
                b(mVar);
            } else if (i2 == 1) {
                h(mVar);
            } else if (i2 == 2) {
                g(mVar);
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
