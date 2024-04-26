package b.a.a.a.k0.t;

import b.a.a.a.k0.g;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;

public final class s implements w {

    /* renamed from: a  reason: collision with root package name */
    private final r f462a;

    /* renamed from: b  reason: collision with root package name */
    private final m f463b = new m(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public s(r rVar) {
        this.f462a = rVar;
    }

    public void a() {
        this.f = true;
    }

    public void b(u uVar, g gVar, w.d dVar) {
        this.f462a.b(uVar, gVar, dVar);
        this.f = true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ef A[SYNTHETIC] */
    public void c(b.a.a.a.r0.m r8, boolean r9) {
        /*
            r7 = this;
            r0 = -1
            if (r9 == 0) goto L_0x000d
            int r1 = r8.x()
            int r2 = r8.c()
            int r2 = r2 + r1
            goto L_0x000e
        L_0x000d:
            r2 = -1
        L_0x000e:
            boolean r1 = r7.f
            r3 = 0
            if (r1 == 0) goto L_0x001d
            if (r9 != 0) goto L_0x0016
            return
        L_0x0016:
            r7.f = r3
            r8.J(r2)
        L_0x001b:
            r7.d = r3
        L_0x001d:
            int r9 = r8.a()
            if (r9 <= 0) goto L_0x00ef
            int r9 = r7.d
            r1 = 1
            r2 = 3
            if (r9 >= r2) goto L_0x00a7
            if (r9 != 0) goto L_0x003e
            int r9 = r8.x()
            int r4 = r8.c()
            int r4 = r4 - r1
            r8.J(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r9 != r4) goto L_0x003e
            r7.f = r1
            return
        L_0x003e:
            int r9 = r8.a()
            int r4 = r7.d
            int r4 = 3 - r4
            int r9 = java.lang.Math.min(r9, r4)
            b.a.a.a.r0.m r4 = r7.f463b
            byte[] r4 = r4.f734a
            int r5 = r7.d
            r8.g(r4, r5, r9)
            int r4 = r7.d
            int r4 = r4 + r9
            r7.d = r4
            if (r4 != r2) goto L_0x001d
            b.a.a.a.r0.m r9 = r7.f463b
            r9.G(r2)
            b.a.a.a.r0.m r9 = r7.f463b
            r9.K(r1)
            b.a.a.a.r0.m r9 = r7.f463b
            int r9 = r9.x()
            b.a.a.a.r0.m r4 = r7.f463b
            int r4 = r4.x()
            r5 = r9 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            r7.e = r1
            r9 = r9 & 15
            int r9 = r9 << 8
            r9 = r9 | r4
            int r9 = r9 + r2
            r7.c = r9
            b.a.a.a.r0.m r9 = r7.f463b
            int r9 = r9.b()
            int r1 = r7.c
            if (r9 >= r1) goto L_0x001d
            b.a.a.a.r0.m r9 = r7.f463b
            byte[] r4 = r9.f734a
            r5 = 4098(0x1002, float:5.743E-42)
            int r6 = r4.length
            int r6 = r6 * 2
            int r1 = java.lang.Math.max(r1, r6)
            int r1 = java.lang.Math.min(r5, r1)
            r9.G(r1)
            b.a.a.a.r0.m r9 = r7.f463b
            byte[] r9 = r9.f734a
            java.lang.System.arraycopy(r4, r3, r9, r3, r2)
            goto L_0x001d
        L_0x00a7:
            int r9 = r8.a()
            int r2 = r7.c
            int r4 = r7.d
            int r2 = r2 - r4
            int r9 = java.lang.Math.min(r9, r2)
            b.a.a.a.r0.m r2 = r7.f463b
            byte[] r2 = r2.f734a
            int r4 = r7.d
            r8.g(r2, r4, r9)
            int r2 = r7.d
            int r2 = r2 + r9
            r7.d = r2
            int r9 = r7.c
            if (r2 != r9) goto L_0x001d
            boolean r2 = r7.e
            if (r2 == 0) goto L_0x00e1
            b.a.a.a.r0.m r2 = r7.f463b
            byte[] r2 = r2.f734a
            int r9 = b.a.a.a.r0.w.k(r2, r3, r9, r0)
            if (r9 == 0) goto L_0x00d7
            r7.f = r1
            return
        L_0x00d7:
            b.a.a.a.r0.m r9 = r7.f463b
            int r1 = r7.c
            int r1 = r1 + -4
            r9.G(r1)
            goto L_0x00e6
        L_0x00e1:
            b.a.a.a.r0.m r1 = r7.f463b
            r1.G(r9)
        L_0x00e6:
            b.a.a.a.k0.t.r r9 = r7.f462a
            b.a.a.a.r0.m r1 = r7.f463b
            r9.c(r1)
            goto L_0x001b
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.t.s.c(b.a.a.a.r0.m, boolean):void");
    }
}
