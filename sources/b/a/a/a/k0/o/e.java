package b.a.a.a.k0.o;

import b.a.a.a.k0.n;
import b.a.a.a.k0.o.d;
import b.a.a.a.r0.k;
import b.a.a.a.r0.m;
import b.a.a.a.s0.a;

final class e extends d {

    /* renamed from: b  reason: collision with root package name */
    private final m f334b = new m(k.f726a);
    private final m c = new m(4);
    private int d;
    private boolean e;
    private int f;

    public e(n nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    public boolean b(m mVar) {
        int x = mVar.x();
        int i = (x >> 4) & 15;
        int i2 = x & 15;
        if (i2 == 7) {
            this.f = i;
            return i != 5;
        }
        throw new d.a("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    public void c(m mVar, long j) {
        int x = mVar.x();
        long j2 = j + (((long) mVar.j()) * 1000);
        if (x == 0 && !this.e) {
            m mVar2 = new m(new byte[mVar.a()]);
            mVar.g(mVar2.f734a, 0, mVar.a());
            a b2 = a.b(mVar2);
            this.d = b2.f749b;
            this.f333a.c(b.a.a.a.n.p((String) null, "video/avc", (String) null, -1, -1, b2.c, b2.d, -1.0f, b2.f748a, -1, b2.e, (b.a.a.a.j0.a) null));
            this.e = true;
        } else if (x == 1 && this.e) {
            byte[] bArr = this.c.f734a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.d;
            int i2 = 0;
            while (mVar.a() > 0) {
                mVar.g(this.c.f734a, i, this.d);
                this.c.J(0);
                int B = this.c.B();
                this.f334b.J(0);
                this.f333a.a(this.f334b, 4);
                this.f333a.a(mVar, B);
                i2 = i2 + 4 + B;
            }
            this.f333a.d(j2, this.f == 1 ? 1 : 0, i2, 0, (n.a) null);
        }
    }
}
