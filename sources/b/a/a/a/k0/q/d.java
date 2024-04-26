package b.a.a.a.k0.q;

import android.util.Log;
import b.a.a.a.k0.j;
import b.a.a.a.k0.l;
import b.a.a.a.k0.q.b;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;

final class d implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final long f356a;

    /* renamed from: b  reason: collision with root package name */
    private final int f357b;
    private final long c;
    private final long d;
    private final long[] e;

    private d(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    private d(long j, int i, long j2, long j3, long[] jArr) {
        this.f356a = j;
        this.f357b = i;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public static d a(long j, long j2, j jVar, m mVar) {
        int B;
        long j3 = j;
        j jVar2 = jVar;
        int i = jVar2.g;
        int i2 = jVar2.d;
        int i3 = mVar.i();
        if ((i3 & 1) != 1 || (B = mVar.B()) == 0) {
            return null;
        }
        long C = w.C((long) B, ((long) i) * 1000000, (long) i2);
        if ((i3 & 6) != 6) {
            return new d(j2, jVar2.c, C);
        }
        long B2 = (long) mVar.B();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = (long) mVar.x();
        }
        if (j3 != -1) {
            long j4 = j2 + B2;
            if (j3 != j4) {
                Log.w("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new d(j2, jVar2.c, C, B2, jArr);
    }

    private long d(int i) {
        return (this.c * ((long) i)) / 100;
    }

    public boolean b() {
        return this.e != null;
    }

    public long c(long j) {
        double d2;
        long j2 = j - this.f356a;
        if (!b() || j2 <= ((long) this.f357b)) {
            return 0;
        }
        double d3 = (double) j2;
        Double.isNaN(d3);
        double d4 = (double) this.d;
        Double.isNaN(d4);
        double d5 = (d3 * 256.0d) / d4;
        int d6 = w.d(this.e, (long) d5, true, true);
        long d7 = d(d6);
        long j3 = this.e[d6];
        int i = d6 + 1;
        long d8 = d(i);
        long j4 = d6 == 99 ? 256 : this.e[i];
        if (j3 == j4) {
            d2 = 0.0d;
        } else {
            double d9 = (double) j3;
            Double.isNaN(d9);
            double d10 = (double) (j4 - j3);
            Double.isNaN(d10);
            d2 = (d5 - d9) / d10;
        }
        double d11 = (double) (d8 - d7);
        Double.isNaN(d11);
        return d7 + Math.round(d2 * d11);
    }

    public l.a e(long j) {
        if (!b()) {
            return new l.a(new b.a.a.a.k0.m(0, this.f356a + ((long) this.f357b)));
        }
        long j2 = w.j(j, 0, this.c);
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = (double) this.c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d4;
                long[] jArr = this.e;
                double d6 = (double) jArr[i];
                double d7 = i == 99 ? 256.0d : (double) jArr[i + 1];
                double d8 = (double) i;
                Double.isNaN(d8);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d4 - d8) * (d7 - d6));
            }
        }
        double d9 = (double) this.d;
        Double.isNaN(d9);
        return new l.a(new b.a.a.a.k0.m(j2, this.f356a + w.j(Math.round((d5 / 256.0d) * d9), (long) this.f357b, this.d - 1)));
    }

    public long i() {
        return this.c;
    }
}
