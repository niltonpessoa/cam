package b.a.a.a.k0.t;

import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.k;
import b.a.a.a.k0.l;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;

public final class a implements e {
    private static final int e = w.o("ID3");

    /* renamed from: a  reason: collision with root package name */
    private final long f420a;

    /* renamed from: b  reason: collision with root package name */
    private final b f421b;
    private final m c;
    private boolean d;

    public a() {
        this(0);
    }

    public a(long j) {
        this.f420a = j;
        this.f421b = new b();
        this.c = new m(2786);
    }

    public void a() {
    }

    public void d(g gVar) {
        this.f421b.f(gVar, new w.d(0, 1));
        gVar.d();
        gVar.c(new l.b(-9223372036854775807L));
    }

    public void f(long j, long j2) {
        this.d = false;
        this.f421b.a();
    }

    public int g(f fVar, k kVar) {
        int a2 = fVar.a(this.c.f734a, 0, 2786);
        if (a2 == -1) {
            return -1;
        }
        this.c.J(0);
        this.c.I(a2);
        if (!this.d) {
            this.f421b.d(this.f420a, true);
            this.d = true;
        }
        this.f421b.c(this.c);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r8.b();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if ((r4 - r3) < 8192) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(b.a.a.a.k0.f r8) {
        /*
            r7 = this;
            b.a.a.a.r0.m r0 = new b.a.a.a.r0.m
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f734a
            r8.h(r4, r2, r1)
            r0.J(r2)
            int r4 = r0.A()
            int r5 = e
            if (r4 == r5) goto L_0x0058
            r8.b()
            r8.j(r3)
            r4 = r3
        L_0x0020:
            r1 = 0
        L_0x0021:
            byte[] r5 = r0.f734a
            r6 = 5
            r8.h(r5, r2, r6)
            r0.J(r2)
            int r5 = r0.D()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0042
            r8.b()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x003e
            return r2
        L_0x003e:
            r8.j(r4)
            goto L_0x0020
        L_0x0042:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x0048
            return r5
        L_0x0048:
            byte[] r5 = r0.f734a
            int r5 = b.a.a.a.h0.a.e(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0052
            return r2
        L_0x0052:
            int r5 = r5 + -5
            r8.j(r5)
            goto L_0x0021
        L_0x0058:
            r4 = 3
            r0.K(r4)
            int r4 = r0.w()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.j(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.t.a.h(b.a.a.a.k0.f):boolean");
    }
}
