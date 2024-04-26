package b.a.a.a.k0.t;

import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.k;
import b.a.a.a.k0.l;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;

public final class c implements e {
    private static final int e = w.o("ID3");

    /* renamed from: a  reason: collision with root package name */
    private final long f424a;

    /* renamed from: b  reason: collision with root package name */
    private final d f425b;
    private final m c;
    private boolean d;

    public c() {
        this(0);
    }

    public c(long j) {
        this.f424a = j;
        this.f425b = new d(true);
        this.c = new m(200);
    }

    public void a() {
    }

    public void d(g gVar) {
        this.f425b.f(gVar, new w.d(0, 1));
        gVar.d();
        gVar.c(new l.b(-9223372036854775807L));
    }

    public void f(long j, long j2) {
        this.d = false;
        this.f425b.a();
    }

    public int g(f fVar, k kVar) {
        int a2 = fVar.a(this.c.f734a, 0, 200);
        if (a2 == -1) {
            return -1;
        }
        this.c.J(0);
        this.c.I(a2);
        if (!this.d) {
            this.f425b.d(this.f424a, true);
            this.d = true;
        }
        this.f425b.c(this.c);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        r11.b();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if ((r5 - r4) < 8192) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(b.a.a.a.k0.f r11) {
        /*
            r10 = this;
            b.a.a.a.r0.m r0 = new b.a.a.a.r0.m
            r1 = 10
            r0.<init>((int) r1)
            b.a.a.a.r0.l r2 = new b.a.a.a.r0.l
            byte[] r3 = r0.f734a
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L_0x0010:
            byte[] r5 = r0.f734a
            r11.h(r5, r3, r1)
            r0.J(r3)
            int r5 = r0.A()
            int r6 = e
            if (r5 == r6) goto L_0x0074
            r11.b()
            r11.j(r4)
            r5 = r4
        L_0x0027:
            r1 = 0
            r6 = 0
        L_0x0029:
            byte[] r7 = r0.f734a
            r8 = 2
            r11.h(r7, r3, r8)
            r0.J(r3)
            int r7 = r0.D()
            r8 = 65526(0xfff6, float:9.1821E-41)
            r7 = r7 & r8
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r7 == r8) goto L_0x004f
            r11.b()
            int r5 = r5 + 1
            int r1 = r5 - r4
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r6) goto L_0x004b
            return r3
        L_0x004b:
            r11.j(r5)
            goto L_0x0027
        L_0x004f:
            r7 = 1
            int r1 = r1 + r7
            r8 = 4
            if (r1 < r8) goto L_0x0059
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 <= r9) goto L_0x0059
            return r7
        L_0x0059:
            byte[] r7 = r0.f734a
            r11.h(r7, r3, r8)
            r7 = 14
            r2.m(r7)
            r7 = 13
            int r7 = r2.h(r7)
            r8 = 6
            if (r7 > r8) goto L_0x006d
            return r3
        L_0x006d:
            int r8 = r7 + -6
            r11.j(r8)
            int r6 = r6 + r7
            goto L_0x0029
        L_0x0074:
            r5 = 3
            r0.K(r5)
            int r5 = r0.w()
            int r6 = r5 + 10
            int r4 = r4 + r6
            r11.j(r5)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.t.c.h(b.a.a.a.k0.f):boolean");
    }
}
