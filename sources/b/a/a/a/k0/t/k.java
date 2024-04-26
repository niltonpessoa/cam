package b.a.a.a.k0.t;

import android.util.Log;
import b.a.a.a.k0.g;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;
import java.util.Collections;

public final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    private final t f444a;

    /* renamed from: b  reason: collision with root package name */
    private String f445b;
    private n c;
    private a d;
    private boolean e;
    private final boolean[] f = new boolean[3];
    private final o g = new o(32, 128);
    private final o h = new o(33, 128);
    private final o i = new o(34, 128);
    private final o j = new o(39, 128);
    private final o k = new o(40, 128);
    private long l;
    private long m;
    private final m n = new m();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final n f446a;

        /* renamed from: b  reason: collision with root package name */
        private long f447b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(n nVar) {
            this.f446a = nVar;
        }

        private void b(int i2) {
            boolean z = this.m;
            int i3 = (int) (this.f447b - this.k);
            this.f446a.d(this.l, z ? 1 : 0, i3, i2, (n.a) null);
        }

        public void a(long j2, int i2) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (this.i) {
                    b(i2 + ((int) (j2 - this.f447b)));
                }
                this.k = this.f447b;
                this.l = this.e;
                this.i = true;
                this.m = this.c;
            }
        }

        public void c(byte[] bArr, int i2, int i3) {
            if (this.f) {
                int i4 = this.d;
                int i5 = (i2 + 2) - i4;
                if (i5 < i3) {
                    this.g = (bArr[i5] & 128) != 0;
                    this.f = false;
                    return;
                }
                this.d = i4 + (i3 - i2);
            }
        }

        public void d() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void e(long j2, int i2, int i3, long j3) {
            boolean z = false;
            this.g = false;
            this.h = false;
            this.e = j3;
            this.d = 0;
            this.f447b = j2;
            if (i3 >= 32) {
                if (!this.j && this.i) {
                    b(i2);
                    this.i = false;
                }
                if (i3 <= 34) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i3 >= 16 && i3 <= 21;
            this.c = z2;
            if (z2 || i3 <= 9) {
                z = true;
            }
            this.f = z;
        }
    }

    public k(t tVar) {
        this.f444a = tVar;
    }

    private void b(long j2, int i2, int i3, long j3) {
        if (this.e) {
            this.d.a(j2, i2);
        } else {
            this.g.b(i3);
            this.h.b(i3);
            this.i.b(i3);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.c(h(this.f445b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i3)) {
            o oVar = this.j;
            this.n.H(this.j.d, b.a.a.a.r0.k.k(oVar.d, oVar.e));
            this.n.K(5);
            this.f444a.a(j3, this.n);
        }
        if (this.k.b(i3)) {
            o oVar2 = this.k;
            this.n.H(this.k.d, b.a.a.a.r0.k.k(oVar2.d, oVar2.e));
            this.n.K(5);
            this.f444a.a(j3, this.n);
        }
    }

    private void g(byte[] bArr, int i2, int i3) {
        if (this.e) {
            this.d.c(bArr, i2, i3);
        } else {
            this.g.a(bArr, i2, i3);
            this.h.a(bArr, i2, i3);
            this.i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private static b.a.a.a.n h(String str, o oVar, o oVar2, o oVar3) {
        float f2;
        o oVar4 = oVar;
        o oVar5 = oVar2;
        o oVar6 = oVar3;
        int i2 = oVar4.e;
        byte[] bArr = new byte[(oVar5.e + i2 + oVar6.e)];
        System.arraycopy(oVar4.d, 0, bArr, 0, i2);
        System.arraycopy(oVar5.d, 0, bArr, oVar4.e, oVar5.e);
        System.arraycopy(oVar6.d, 0, bArr, oVar4.e + oVar5.e, oVar6.e);
        b.a.a.a.r0.n nVar = new b.a.a.a.r0.n(oVar5.d, 0, oVar5.e);
        nVar.l(44);
        int e2 = nVar.e(3);
        nVar.k();
        nVar.l(88);
        nVar.l(8);
        int i3 = 0;
        for (int i4 = 0; i4 < e2; i4++) {
            if (nVar.d()) {
                i3 += 89;
            }
            if (nVar.d()) {
                i3 += 8;
            }
        }
        nVar.l(i3);
        if (e2 > 0) {
            nVar.l((8 - e2) * 2);
        }
        nVar.h();
        int h2 = nVar.h();
        if (h2 == 3) {
            nVar.k();
        }
        int h3 = nVar.h();
        int h4 = nVar.h();
        if (nVar.d()) {
            int h5 = nVar.h();
            int h6 = nVar.h();
            int h7 = nVar.h();
            int h8 = nVar.h();
            h3 -= ((h2 == 1 || h2 == 2) ? 2 : 1) * (h5 + h6);
            h4 -= (h2 == 1 ? 2 : 1) * (h7 + h8);
        }
        int i5 = h3;
        int i6 = h4;
        nVar.h();
        nVar.h();
        int h9 = nVar.h();
        int i7 = nVar.d() ? 0 : e2;
        while (true) {
            nVar.h();
            nVar.h();
            nVar.h();
            if (i7 > e2) {
                break;
            }
            i7++;
        }
        nVar.h();
        nVar.h();
        nVar.h();
        if (nVar.d() && nVar.d()) {
            i(nVar);
        }
        nVar.l(2);
        if (nVar.d()) {
            nVar.l(8);
            nVar.h();
            nVar.h();
            nVar.k();
        }
        j(nVar);
        if (nVar.d()) {
            for (int i8 = 0; i8 < nVar.h(); i8++) {
                nVar.l(h9 + 4 + 1);
            }
        }
        nVar.l(2);
        float f3 = 1.0f;
        if (nVar.d() && nVar.d()) {
            int e3 = nVar.e(8);
            if (e3 == 255) {
                int e4 = nVar.e(16);
                int e5 = nVar.e(16);
                if (!(e4 == 0 || e5 == 0)) {
                    f3 = ((float) e4) / ((float) e5);
                }
                f2 = f3;
            } else {
                float[] fArr = b.a.a.a.r0.k.f727b;
                if (e3 < fArr.length) {
                    f2 = fArr[e3];
                } else {
                    Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + e3);
                }
            }
            return b.a.a.a.n.p(str, "video/hevc", (String) null, -1, -1, i5, i6, -1.0f, Collections.singletonList(bArr), -1, f2, (b.a.a.a.j0.a) null);
        }
        f2 = 1.0f;
        return b.a.a.a.n.p(str, "video/hevc", (String) null, -1, -1, i5, i6, -1.0f, Collections.singletonList(bArr), -1, f2, (b.a.a.a.j0.a) null);
    }

    private static void i(b.a.a.a.r0.n nVar) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (!nVar.d()) {
                    nVar.h();
                } else {
                    int min = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        nVar.g();
                    }
                    for (int i5 = 0; i5 < min; i5++) {
                        nVar.g();
                    }
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    private static void j(b.a.a.a.r0.n nVar) {
        int h2 = nVar.h();
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < h2; i3++) {
            if (i3 != 0) {
                z = nVar.d();
            }
            if (z) {
                nVar.k();
                nVar.h();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (nVar.d()) {
                        nVar.k();
                    }
                }
            } else {
                int h3 = nVar.h();
                int h4 = nVar.h();
                int i5 = h3 + h4;
                for (int i6 = 0; i6 < h3; i6++) {
                    nVar.h();
                    nVar.k();
                }
                for (int i7 = 0; i7 < h4; i7++) {
                    nVar.h();
                    nVar.k();
                }
                i2 = i5;
            }
        }
    }

    private void k(long j2, int i2, int i3, long j3) {
        if (this.e) {
            this.d.e(j2, i2, i3, j3);
        } else {
            this.g.e(i3);
            this.h.e(i3);
            this.i.e(i3);
        }
        this.j.e(i3);
        this.k.e(i3);
    }

    public void a() {
        b.a.a.a.r0.k.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.d.d();
        this.l = 0;
    }

    public void c(m mVar) {
        m mVar2 = mVar;
        while (mVar.a() > 0) {
            int c2 = mVar.c();
            int d2 = mVar.d();
            byte[] bArr = mVar2.f734a;
            this.l += (long) mVar.a();
            this.c.a(mVar2, mVar.a());
            while (true) {
                if (c2 < d2) {
                    int c3 = b.a.a.a.r0.k.c(bArr, c2, d2, this.f);
                    if (c3 == d2) {
                        g(bArr, c2, d2);
                        return;
                    }
                    int e2 = b.a.a.a.r0.k.e(bArr, c3);
                    int i2 = c3 - c2;
                    if (i2 > 0) {
                        g(bArr, c2, c3);
                    }
                    int i3 = d2 - c3;
                    long j2 = this.l - ((long) i3);
                    int i4 = i2 < 0 ? -i2 : 0;
                    long j3 = j2;
                    int i5 = i3;
                    b(j3, i5, i4, this.m);
                    k(j3, i5, e2, this.m);
                    c2 = c3 + 3;
                }
            }
        }
    }

    public void d(long j2, boolean z) {
        this.m = j2;
    }

    public void e() {
    }

    public void f(g gVar, w.d dVar) {
        dVar.a();
        this.f445b = dVar.b();
        n f2 = gVar.f(dVar.c(), 2);
        this.c = f2;
        this.d = new a(f2);
        this.f444a.b(gVar, dVar);
    }
}
