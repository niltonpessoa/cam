package b.a.a.a.n0;

import b.a.a.a.g0;
import b.a.a.a.r0.a;

public final class l extends g0 {
    private static final Object j = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final long f584b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final boolean h;
    private final boolean i;

    public l(long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2) {
        this.f584b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = z;
        this.i = z2;
    }

    public l(long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this(-9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z, z2);
    }

    public l(long j2, boolean z, boolean z2) {
        this(j2, j2, 0, 0, z, z2);
    }

    public int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    public g0.b g(int i2, g0.b bVar, boolean z) {
        a.c(i2, 0, 1);
        Object obj = z ? j : null;
        bVar.o(obj, obj, 0, this.d, -this.f);
        return bVar;
    }

    public int h() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1 > r6) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.a.a.a.g0.c n(int r19, b.a.a.a.g0.c r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = r19
            b.a.a.a.r0.a.c(r3, r1, r2)
            if (r21 == 0) goto L_0x000e
            java.lang.Object r1 = j
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            r3 = r1
            long r1 = r0.g
            boolean r9 = r0.i
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L_0x0030
            r6 = 0
            int r8 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0030
            long r6 = r0.e
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0029
        L_0x0027:
            r10 = r4
            goto L_0x0031
        L_0x0029:
            long r1 = r1 + r22
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0030
            goto L_0x0027
        L_0x0030:
            r10 = r1
        L_0x0031:
            long r4 = r0.f584b
            long r6 = r0.c
            boolean r8 = r0.h
            long r12 = r0.e
            r14 = 0
            r15 = 0
            long r1 = r0.f
            r16 = r1
            r2 = r20
            r2.d(r3, r4, r6, r8, r9, r10, r12, r14, r15, r16)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.l.n(int, b.a.a.a.g0$c, boolean, long):b.a.a.a.g0$c");
    }

    public int o() {
        return 1;
    }
}
