package b.a.a.a.r0;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f726a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f727b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f728a;

        /* renamed from: b  reason: collision with root package name */
        public final int f729b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.f728a = i;
            this.f729b = i2;
            this.c = z;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f730a;

        /* renamed from: b  reason: collision with root package name */
        public final int f731b;
        public final int c;
        public final float d;
        public final boolean e;
        public final boolean f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;

        public b(int i2, int i3, int i4, float f2, boolean z, boolean z2, int i5, int i6, int i7, boolean z3) {
            this.f730a = i2;
            this.f731b = i3;
            this.c = i4;
            this.d = f2;
            this.e = z;
            this.f = z2;
            this.g = i5;
            this.h = i6;
            this.i = i7;
            this.j = z3;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b2 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b2 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b2 == 0) {
                    i2++;
                }
                if (b2 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0097, code lost:
        r8 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            b.a.a.a.r0.a.f(r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            a(r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            a(r10)
            int r8 = r8 - r3
            return r8
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r10[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r7[r8]
            if (r4 != 0) goto L_0x0040
            int r4 = r8 + 1
            byte r4 = r7[r4]
            if (r4 != r2) goto L_0x0040
            a(r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0067
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0062
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0062
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0062
            if (r10 == 0) goto L_0x0061
            a(r10)
        L_0x0061:
            return r5
        L_0x0062:
            int r8 = r8 + -2
        L_0x0064:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0067:
            if (r10 == 0) goto L_0x00bb
            if (r0 <= r3) goto L_0x007e
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
            goto L_0x0097
        L_0x007c:
            r8 = 0
            goto L_0x0098
        L_0x007e:
            if (r0 != r3) goto L_0x008f
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x007c
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
            goto L_0x0097
        L_0x008f:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
        L_0x0097:
            r8 = 1
        L_0x0098:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00a7
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
            goto L_0x00af
        L_0x00a7:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
        L_0x00af:
            r8 = 1
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00b9
            r1 = 1
        L_0x00b9:
            r10[r3] = r1
        L_0x00bb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.r0.k.c(byte[], int, int, boolean[]):int");
    }

    private static int d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean g(String str, byte b2) {
        if (!"video/avc".equals(str) || (b2 & 31) != 6) {
            return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
        }
        return true;
    }

    public static a h(byte[] bArr, int i, int i2) {
        n nVar = new n(bArr, i, i2);
        nVar.l(8);
        int h = nVar.h();
        int h2 = nVar.h();
        nVar.k();
        return new a(h, h2, nVar.d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.a.a.a.r0.k.b i(byte[] r18, int r19, int r20) {
        /*
            b.a.a.a.r0.n r0 = new b.a.a.a.r0.n
            r1 = r18
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.l(r1)
            int r2 = r0.e(r1)
            r3 = 16
            r0.l(r3)
            int r5 = r0.h()
            r4 = 3
            r6 = 0
            r7 = 1
            r8 = 100
            if (r2 == r8) goto L_0x004c
            r8 = 110(0x6e, float:1.54E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 122(0x7a, float:1.71E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 244(0xf4, float:3.42E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 44
            if (r2 == r8) goto L_0x004c
            r8 = 83
            if (r2 == r8) goto L_0x004c
            r8 = 86
            if (r2 == r8) goto L_0x004c
            r8 = 118(0x76, float:1.65E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 128(0x80, float:1.794E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 138(0x8a, float:1.93E-43)
            if (r2 != r8) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2 = 1
            r9 = 0
            goto L_0x0086
        L_0x004c:
            int r2 = r0.h()
            if (r2 != r4) goto L_0x0057
            boolean r8 = r0.d()
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            r0.h()
            r0.h()
            r0.k()
            boolean r9 = r0.d()
            if (r9 == 0) goto L_0x0085
            if (r2 == r4) goto L_0x006c
            r9 = 8
            goto L_0x006e
        L_0x006c:
            r9 = 12
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 >= r9) goto L_0x0085
            boolean r11 = r0.d()
            if (r11 == 0) goto L_0x0082
            r11 = 6
            if (r10 >= r11) goto L_0x007d
            r11 = 16
            goto L_0x007f
        L_0x007d:
            r11 = 64
        L_0x007f:
            j(r0, r11)
        L_0x0082:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x0085:
            r9 = r8
        L_0x0086:
            int r8 = r0.h()
            int r11 = r8 + 4
            int r12 = r0.h()
            if (r12 != 0) goto L_0x009c
            int r8 = r0.h()
            int r8 = r8 + 4
            r18 = r5
            r13 = r8
            goto L_0x00c1
        L_0x009c:
            if (r12 != r7) goto L_0x00be
            boolean r8 = r0.d()
            r0.g()
            r0.g()
            int r10 = r0.h()
            long r13 = (long) r10
            r18 = r5
            r10 = 0
        L_0x00b0:
            long r4 = (long) r10
            int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00bb
            r0.h()
            int r10 = r10 + 1
            goto L_0x00b0
        L_0x00bb:
            r14 = r8
            r13 = 0
            goto L_0x00c2
        L_0x00be:
            r18 = r5
            r13 = 0
        L_0x00c1:
            r14 = 0
        L_0x00c2:
            r0.h()
            r0.k()
            int r4 = r0.h()
            int r4 = r4 + r7
            int r5 = r0.h()
            int r5 = r5 + r7
            boolean r10 = r0.d()
            int r6 = 2 - r10
            int r6 = r6 * r5
            if (r10 != 0) goto L_0x00df
            r0.k()
        L_0x00df:
            r0.k()
            int r4 = r4 * 16
            int r6 = r6 * 16
            boolean r5 = r0.d()
            if (r5 == 0) goto L_0x011a
            int r5 = r0.h()
            int r8 = r0.h()
            int r15 = r0.h()
            int r16 = r0.h()
            if (r2 != 0) goto L_0x0101
            int r2 = 2 - r10
            goto L_0x0111
        L_0x0101:
            r17 = 2
            r3 = 3
            if (r2 != r3) goto L_0x0108
            r3 = 1
            goto L_0x0109
        L_0x0108:
            r3 = 2
        L_0x0109:
            if (r2 != r7) goto L_0x010c
            r7 = 2
        L_0x010c:
            int r2 = 2 - r10
            int r2 = r2 * r7
            r7 = r3
        L_0x0111:
            int r5 = r5 + r8
            int r5 = r5 * r7
            int r4 = r4 - r5
            int r15 = r15 + r16
            int r15 = r15 * r2
            int r6 = r6 - r15
        L_0x011a:
            r7 = r6
            r6 = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x0165
            boolean r3 = r0.d()
            if (r3 == 0) goto L_0x0165
            int r1 = r0.e(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0146
            r3 = 16
            int r1 = r0.e(r3)
            int r0 = r0.e(r3)
            if (r1 == 0) goto L_0x0144
            if (r0 == 0) goto L_0x0144
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = r1 / r0
        L_0x0144:
            r8 = r2
            goto L_0x0167
        L_0x0146:
            float[] r0 = f727b
            int r3 = r0.length
            if (r1 >= r3) goto L_0x014f
            r0 = r0[r1]
            r8 = r0
            goto L_0x0167
        L_0x014f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unexpected aspect_ratio_idc value: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NalUnitUtil"
            android.util.Log.w(r1, r0)
        L_0x0165:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0167:
            b.a.a.a.r0.k$b r0 = new b.a.a.a.r0.k$b
            r4 = r0
            r5 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.r0.k.i(byte[], int, int):b.a.a.a.r0.k$b");
    }

    private static void j(n nVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((nVar.g() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    public static int k(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = d;
                        if (iArr.length <= i4) {
                            d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
