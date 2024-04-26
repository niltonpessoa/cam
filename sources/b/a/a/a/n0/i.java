package b.a.a.a.n0;

import b.a.a.a.i0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.n;
import b.a.a.a.n0.h;
import b.a.a.a.o;
import b.a.a.a.r0.m;
import java.io.EOFException;
import java.nio.ByteBuffer;

public final class i implements n {

    /* renamed from: a  reason: collision with root package name */
    private final b.a.a.a.q0.b f580a;

    /* renamed from: b  reason: collision with root package name */
    private final int f581b;
    private final h c = new h();
    private final h.a d = new h.a();
    private final m e = new m(32);
    private a f;
    private a g;
    private a h;
    private b.a.a.a.n i;
    private boolean j;
    private b.a.a.a.n k;
    private long l;
    private long m;
    private boolean n;
    private b o;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f582a;

        /* renamed from: b  reason: collision with root package name */
        public final long f583b;
        public boolean c;
        public b.a.a.a.q0.a d;
        public a e;

        public a(long j, int i) {
            this.f582a = j;
            this.f583b = j + ((long) i);
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void b(b.a.a.a.q0.a aVar, a aVar2) {
            this.d = aVar;
            this.e = aVar2;
            this.c = true;
        }

        public int c(long j) {
            return ((int) (j - this.f582a)) + this.d.f684b;
        }
    }

    public interface b {
        void s(b.a.a.a.n nVar);
    }

    public i(b.a.a.a.q0.b bVar) {
        this.f580a = bVar;
        int e2 = bVar.e();
        this.f581b = e2;
        a aVar = new a(0, e2);
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
    }

    private void e(long j2) {
        while (true) {
            a aVar = this.g;
            if (j2 >= aVar.f583b) {
                this.g = aVar.e;
            } else {
                return;
            }
        }
    }

    private void h(a aVar) {
        if (aVar.c) {
            a aVar2 = this.h;
            int i2 = (aVar2.c ? 1 : 0) + (((int) (aVar2.f582a - aVar.f582a)) / this.f581b);
            b.a.a.a.q0.a[] aVarArr = new b.a.a.a.q0.a[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                aVarArr[i3] = aVar.d;
                aVar = aVar.a();
            }
            this.f580a.c(aVarArr);
        }
    }

    private void i(long j2) {
        a aVar;
        if (j2 != -1) {
            while (true) {
                aVar = this.f;
                if (j2 < aVar.f583b) {
                    break;
                }
                this.f580a.a(aVar.d);
                this.f = this.f.a();
            }
            if (this.g.f582a < aVar.f582a) {
                this.g = aVar;
            }
        }
    }

    private static b.a.a.a.n l(b.a.a.a.n nVar, long j2) {
        if (nVar == null) {
            return null;
        }
        if (j2 == 0) {
            return nVar;
        }
        long j3 = nVar.w;
        return j3 != Long.MAX_VALUE ? nVar.e(j3 + j2) : nVar;
    }

    private void r(int i2) {
        long j2 = this.m + ((long) i2);
        this.m = j2;
        a aVar = this.h;
        if (j2 == aVar.f583b) {
            this.h = aVar.e;
        }
    }

    private int s(int i2) {
        a aVar = this.h;
        if (!aVar.c) {
            aVar.b(this.f580a.d(), new a(this.h.f583b, this.f581b));
        }
        return Math.min(i2, (int) (this.h.f583b - this.m));
    }

    private void u(long j2, ByteBuffer byteBuffer, int i2) {
        e(j2);
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.g.f583b - j2));
            a aVar = this.g;
            byteBuffer.put(aVar.d.f683a, aVar.c(j2), min);
            i2 -= min;
            j2 += (long) min;
            a aVar2 = this.g;
            if (j2 == aVar2.f583b) {
                this.g = aVar2.e;
            }
        }
    }

    private void v(long j2, byte[] bArr, int i2) {
        e(j2);
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (this.g.f583b - j2));
            a aVar = this.g;
            System.arraycopy(aVar.d.f683a, aVar.c(j2), bArr, i2 - i3, min);
            i3 -= min;
            j2 += (long) min;
            a aVar2 = this.g;
            if (j2 == aVar2.f583b) {
                this.g = aVar2.e;
            }
        }
    }

    private void w(e eVar, h.a aVar) {
        int i2;
        e eVar2 = eVar;
        h.a aVar2 = aVar;
        long j2 = aVar2.f579b;
        this.e.G(1);
        v(j2, this.e.f734a, 1);
        long j3 = j2 + 1;
        byte b2 = this.e.f734a[0];
        boolean z = (b2 & 128) != 0;
        byte b3 = b2 & Byte.MAX_VALUE;
        b.a.a.a.i0.b bVar = eVar2.f296b;
        if (bVar.f290a == null) {
            bVar.f290a = new byte[16];
        }
        v(j3, bVar.f290a, b3);
        long j4 = j3 + ((long) b3);
        if (z) {
            this.e.G(2);
            v(j4, this.e.f734a, 2);
            j4 += 2;
            i2 = this.e.D();
        } else {
            i2 = 1;
        }
        b.a.a.a.i0.b bVar2 = eVar2.f296b;
        int[] iArr = bVar2.d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            this.e.G(i3);
            v(j4, this.e.f734a, i3);
            j4 += (long) i3;
            this.e.J(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = this.e.D();
                iArr4[i4] = this.e.B();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f578a - ((int) (j4 - aVar2.f579b));
        }
        n.a aVar3 = aVar2.c;
        b.a.a.a.i0.b bVar3 = eVar2.f296b;
        bVar3.c(i2, iArr2, iArr4, aVar3.f328b, bVar3.f290a, aVar3.f327a, aVar3.c, aVar3.d);
        long j5 = aVar2.f579b;
        int i5 = (int) (j4 - j5);
        aVar2.f579b = j5 + ((long) i5);
        aVar2.f578a -= i5;
    }

    public void A(b bVar) {
        this.o = bVar;
    }

    public void a(m mVar, int i2) {
        while (i2 > 0) {
            int s = s(i2);
            a aVar = this.h;
            mVar.g(aVar.d.f683a, aVar.c(this.m), s);
            i2 -= s;
            r(s);
        }
    }

    public int b(f fVar, int i2, boolean z) {
        int s = s(i2);
        a aVar = this.h;
        int a2 = fVar.a(aVar.d.f683a, aVar.c(this.m), s);
        if (a2 != -1) {
            r(a2);
            return a2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void c(b.a.a.a.n nVar) {
        b.a.a.a.n l2 = l(nVar, this.l);
        boolean k2 = this.c.k(l2);
        this.k = nVar;
        this.j = false;
        b bVar = this.o;
        if (bVar != null && k2) {
            bVar.s(l2);
        }
    }

    public void d(long j2, int i2, int i3, int i4, n.a aVar) {
        long j3 = j2;
        if (this.j) {
            c(this.k);
        }
        if (this.n) {
            if ((i2 & 1) != 0 && this.c.c(j2)) {
                this.n = false;
            } else {
                return;
            }
        }
        this.c.d(j3 + this.l, i2, (this.m - ((long) i3)) - ((long) i4), i3, aVar);
    }

    public int f(long j2, boolean z, boolean z2) {
        return this.c.a(j2, z, z2);
    }

    public int g() {
        return this.c.b();
    }

    public void j(long j2, boolean z, boolean z2) {
        i(this.c.g(j2, z, z2));
    }

    public void k() {
        i(this.c.h());
    }

    public long m() {
        return this.c.l();
    }

    public int n() {
        return this.c.n();
    }

    public b.a.a.a.n o() {
        return this.c.p();
    }

    public int p() {
        return this.c.q();
    }

    public boolean q() {
        return this.c.r();
    }

    public int t(o oVar, e eVar, boolean z, boolean z2, long j2) {
        int s = this.c.s(oVar, eVar, z, z2, this.i, this.d);
        if (s == -5) {
            this.i = oVar.f593a;
            return -5;
        } else if (s == -4) {
            if (!eVar.j()) {
                if (eVar.d < j2) {
                    eVar.e(Integer.MIN_VALUE);
                }
                if (eVar.p()) {
                    w(eVar, this.d);
                }
                eVar.n(this.d.f578a);
                h.a aVar = this.d;
                u(aVar.f579b, eVar.c, aVar.f578a);
            }
            return -4;
        } else if (s == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    public void x() {
        y(false);
    }

    public void y(boolean z) {
        this.c.t(z);
        h(this.f);
        a aVar = new a(0, this.f581b);
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.m = 0;
        this.f580a.b();
    }

    public void z() {
        this.c.u();
        this.g = this.f;
    }
}
