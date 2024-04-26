package b.a.a.a.k0.s;

import android.util.Log;
import b.a.a.a.r0.m;
import b.a.a.a.u;
import java.util.Arrays;

final class k {

    public static final class a {
        public a(int i, int i2, long[] jArr, int i3, boolean z) {
        }
    }

    public static final class b {
        public b(String str, String[] strArr, int i) {
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f417a;

        public c(boolean z, int i, int i2, int i3) {
            this.f417a = z;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f418a;

        /* renamed from: b  reason: collision with root package name */
        public final long f419b;
        public final int c;
        public final int d;
        public final int e;
        public final byte[] f;

        public d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f418a = i;
            this.f419b = j2;
            this.c = i3;
            this.d = i5;
            this.e = i6;
            this.f = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private static long b(long j, long j2) {
        double d2 = (double) j2;
        Double.isNaN(d2);
        return (long) Math.floor(Math.pow((double) j, 1.0d / d2));
    }

    private static a c(i iVar) {
        if (iVar.d(24) == 5653314) {
            int d2 = iVar.d(16);
            int d3 = iVar.d(24);
            long[] jArr = new long[d3];
            boolean c2 = iVar.c();
            long j = 0;
            if (!c2) {
                boolean c3 = iVar.c();
                for (int i = 0; i < d3; i++) {
                    if (!c3) {
                        jArr[i] = (long) (iVar.d(5) + 1);
                    } else if (iVar.c()) {
                        jArr[i] = (long) (iVar.d(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int d4 = iVar.d(5) + 1;
                int i2 = 0;
                while (i2 < d3) {
                    int d5 = iVar.d(a(d3 - i2));
                    for (int i3 = 0; i3 < d5 && i2 < d3; i3++) {
                        jArr[i2] = (long) d4;
                        i2++;
                    }
                    d4++;
                }
            }
            int d6 = iVar.d(4);
            if (d6 <= 2) {
                if (d6 == 1 || d6 == 2) {
                    iVar.e(32);
                    iVar.e(32);
                    int d7 = iVar.d(4) + 1;
                    iVar.e(1);
                    if (d6 != 1) {
                        j = (long) (d3 * d2);
                    } else if (d2 != 0) {
                        j = b((long) d3, (long) d2);
                    }
                    iVar.e((int) (j * ((long) d7)));
                }
                return new a(d2, d3, jArr, d6, c2);
            }
            throw new u("lookup type greater than 2 not decodable: " + d6);
        }
        throw new u("expected code book to start with [0x56, 0x43, 0x42] at " + iVar.b());
    }

    private static void d(i iVar) {
        int d2 = iVar.d(6) + 1;
        for (int i = 0; i < d2; i++) {
            int d3 = iVar.d(16);
            if (d3 == 0) {
                iVar.e(8);
                iVar.e(16);
                iVar.e(16);
                iVar.e(6);
                iVar.e(8);
                int d4 = iVar.d(4) + 1;
                for (int i2 = 0; i2 < d4; i2++) {
                    iVar.e(8);
                }
            } else if (d3 == 1) {
                int d5 = iVar.d(5);
                int i3 = -1;
                int[] iArr = new int[d5];
                for (int i4 = 0; i4 < d5; i4++) {
                    iArr[i4] = iVar.d(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = iVar.d(3) + 1;
                    int d6 = iVar.d(2);
                    if (d6 > 0) {
                        iVar.e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d6); i7++) {
                        iVar.e(8);
                    }
                }
                iVar.e(2);
                int d7 = iVar.d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d5; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        iVar.e(d7);
                        i9++;
                    }
                }
            } else {
                throw new u("floor type greater than 1 not decodable: " + d3);
            }
        }
    }

    private static void e(int i, i iVar) {
        int d2 = iVar.d(6) + 1;
        for (int i2 = 0; i2 < d2; i2++) {
            int d3 = iVar.d(16);
            if (d3 != 0) {
                Log.e("VorbisUtil", "mapping type other than 0 not supported: " + d3);
            } else {
                int d4 = iVar.c() ? iVar.d(4) + 1 : 1;
                if (iVar.c()) {
                    int d5 = iVar.d(8) + 1;
                    for (int i3 = 0; i3 < d5; i3++) {
                        int i4 = i - 1;
                        iVar.e(a(i4));
                        iVar.e(a(i4));
                    }
                }
                if (iVar.d(2) == 0) {
                    if (d4 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            iVar.e(4);
                        }
                    }
                    for (int i6 = 0; i6 < d4; i6++) {
                        iVar.e(8);
                        iVar.e(8);
                        iVar.e(8);
                    }
                } else {
                    throw new u("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    private static c[] f(i iVar) {
        int d2 = iVar.d(6) + 1;
        c[] cVarArr = new c[d2];
        for (int i = 0; i < d2; i++) {
            cVarArr[i] = new c(iVar.c(), iVar.d(16), iVar.d(16), iVar.d(8));
        }
        return cVarArr;
    }

    private static void g(i iVar) {
        int d2 = iVar.d(6) + 1;
        int i = 0;
        while (i < d2) {
            if (iVar.d(16) <= 2) {
                iVar.e(24);
                iVar.e(24);
                iVar.e(24);
                int d3 = iVar.d(6) + 1;
                iVar.e(8);
                int[] iArr = new int[d3];
                for (int i2 = 0; i2 < d3; i2++) {
                    iArr[i2] = ((iVar.c() ? iVar.d(5) : 0) * 8) + iVar.d(3);
                }
                for (int i3 = 0; i3 < d3; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            iVar.e(8);
                        }
                    }
                }
                i++;
            } else {
                throw new u("residueType greater than 2 is not decodable");
            }
        }
    }

    public static b h(m mVar) {
        k(3, mVar, false);
        String u = mVar.u((int) mVar.n());
        int length = 11 + u.length();
        long n = mVar.n();
        String[] strArr = new String[((int) n)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < n; i2++) {
            strArr[i2] = mVar.u((int) mVar.n());
            i = i + 4 + strArr[i2].length();
        }
        if ((mVar.x() & 1) != 0) {
            return new b(u, strArr, i + 1);
        }
        throw new u("framing bit expected to be set");
    }

    public static d i(m mVar) {
        m mVar2 = mVar;
        k(1, mVar2, false);
        long n = mVar.n();
        int x = mVar.x();
        long n2 = mVar.n();
        int l = mVar.l();
        int l2 = mVar.l();
        int l3 = mVar.l();
        int x2 = mVar.x();
        return new d(n, x, n2, l, l2, l3, (int) Math.pow(2.0d, (double) (x2 & 15)), (int) Math.pow(2.0d, (double) ((x2 & 240) >> 4)), (mVar.x() & 1) > 0, Arrays.copyOf(mVar2.f734a, mVar.d()));
    }

    public static c[] j(m mVar, int i) {
        int i2 = 0;
        k(5, mVar, false);
        int x = mVar.x() + 1;
        i iVar = new i(mVar.f734a);
        iVar.e(mVar.c() * 8);
        for (int i3 = 0; i3 < x; i3++) {
            c(iVar);
        }
        int d2 = iVar.d(6) + 1;
        while (i2 < d2) {
            if (iVar.d(16) == 0) {
                i2++;
            } else {
                throw new u("placeholder of time domain transforms not zeroed out");
            }
        }
        d(iVar);
        g(iVar);
        e(i, iVar);
        c[] f = f(iVar);
        if (iVar.c()) {
            return f;
        }
        throw new u("framing bit after modes not set as expected");
    }

    public static boolean k(int i, m mVar, boolean z) {
        if (mVar.a() < 7) {
            if (z) {
                return false;
            }
            throw new u("too short header: " + mVar.a());
        } else if (mVar.x() != i) {
            if (z) {
                return false;
            }
            throw new u("expected header type " + Integer.toHexString(i));
        } else if (mVar.x() == 118 && mVar.x() == 111 && mVar.x() == 114 && mVar.x() == 98 && mVar.x() == 105 && mVar.x() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new u("expected characters 'vorbis'");
        }
    }
}
