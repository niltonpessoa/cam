package b.a.a.a.k0.s;

import b.a.a.a.k0.s.h;
import b.a.a.a.k0.s.k;
import b.a.a.a.n;
import b.a.a.a.r0.m;
import b.a.a.a.u;
import java.util.ArrayList;

final class j extends h {
    private a n;
    private int o;
    private boolean p;
    private k.d q;
    private k.b r;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final k.d f415a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f416b;
        public final k.c[] c;
        public final int d;

        public a(k.d dVar, k.b bVar, byte[] bArr, k.c[] cVarArr, int i) {
            this.f415a = dVar;
            this.f416b = bArr;
            this.c = cVarArr;
            this.d = i;
        }
    }

    j() {
    }

    static void l(m mVar, long j) {
        mVar.I(mVar.d() + 4);
        mVar.f734a[mVar.d() - 4] = (byte) ((int) (j & 255));
        mVar.f734a[mVar.d() - 3] = (byte) ((int) ((j >>> 8) & 255));
        mVar.f734a[mVar.d() - 2] = (byte) ((int) ((j >>> 16) & 255));
        mVar.f734a[mVar.d() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    private static int m(byte b2, a aVar) {
        return !aVar.c[n(b2, aVar.d, 1)].f417a ? aVar.f415a.d : aVar.f415a.e;
    }

    static int n(byte b2, int i, int i2) {
        return (b2 >> i2) & (255 >>> (8 - i));
    }

    public static boolean p(m mVar) {
        try {
            return k.k(1, mVar, true);
        } catch (u unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void d(long j) {
        super.d(j);
        int i = 0;
        this.p = j != 0;
        k.d dVar = this.q;
        if (dVar != null) {
            i = dVar.d;
        }
        this.o = i;
    }

    /* access modifiers changed from: protected */
    public long e(m mVar) {
        byte[] bArr = mVar.f734a;
        int i = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        int m = m(bArr[0], this.n);
        if (this.p) {
            i = (this.o + m) / 4;
        }
        long j = (long) i;
        l(mVar, j);
        this.p = true;
        this.o = m;
        return j;
    }

    /* access modifiers changed from: protected */
    public boolean h(m mVar, long j, h.b bVar) {
        if (this.n != null) {
            return false;
        }
        a o2 = o(mVar);
        this.n = o2;
        if (o2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.f415a.f);
        arrayList.add(this.n.f416b);
        k.d dVar = this.n.f415a;
        bVar.f411a = n.h((String) null, "audio/vorbis", (String) null, dVar.c, -1, dVar.f418a, (int) dVar.f419b, arrayList, (b.a.a.a.j0.a) null, 0, (String) null);
        return true;
    }

    /* access modifiers changed from: protected */
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* access modifiers changed from: package-private */
    public a o(m mVar) {
        if (this.q == null) {
            this.q = k.i(mVar);
            return null;
        } else if (this.r == null) {
            this.r = k.h(mVar);
            return null;
        } else {
            byte[] bArr = new byte[mVar.d()];
            System.arraycopy(mVar.f734a, 0, bArr, 0, mVar.d());
            k.c[] j = k.j(mVar, this.q.f418a);
            return new a(this.q, this.r, bArr, j, k.a(j.length - 1));
        }
    }
}
