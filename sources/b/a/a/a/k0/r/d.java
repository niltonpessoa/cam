package b.a.a.a.k0.r;

import b.a.a.a.r0.w;

final class d {

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f374a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f375b;
        public final int c;
        public final long[] d;
        public final int[] e;
        public final long f;

        private b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f374a = jArr;
            this.f375b = iArr;
            this.c = i;
            this.d = jArr2;
            this.e = iArr2;
            this.f = j;
        }
    }

    public static b a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int e : iArr2) {
            i3 += w.e(e, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        return new b(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
    }
}
