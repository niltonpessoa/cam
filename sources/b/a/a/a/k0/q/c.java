package b.a.a.a.k0.q;

import android.util.Log;
import b.a.a.a.k0.j;
import b.a.a.a.k0.l;
import b.a.a.a.k0.q.b;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;

final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f354a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f355b;
    private final long c;

    private c(long[] jArr, long[] jArr2, long j) {
        this.f354a = jArr;
        this.f355b = jArr2;
        this.c = j;
    }

    public static c a(long j, long j2, j jVar, m mVar) {
        int i;
        long j3 = j;
        j jVar2 = jVar;
        m mVar2 = mVar;
        mVar2.K(10);
        int i2 = mVar.i();
        if (i2 <= 0) {
            return null;
        }
        int i3 = jVar2.d;
        long C = w.C((long) i2, 1000000 * ((long) (i3 >= 32000 ? 1152 : 576)), (long) i3);
        int D = mVar.D();
        int D2 = mVar.D();
        int D3 = mVar.D();
        mVar2.K(2);
        long j4 = j2 + ((long) jVar2.c);
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long j5 = j2;
        int i4 = 0;
        while (i4 < D) {
            long j6 = C;
            jArr[i4] = (((long) i4) * C) / ((long) D);
            long j7 = j4;
            jArr2[i4] = Math.max(j5, j7);
            if (D3 == 1) {
                i = mVar.x();
            } else if (D3 == 2) {
                i = mVar.D();
            } else if (D3 == 3) {
                i = mVar.A();
            } else if (D3 != 4) {
                return null;
            } else {
                i = mVar.B();
            }
            j5 += (long) (i * D2);
            i4++;
            j4 = j7;
            C = j6;
        }
        long j8 = C;
        if (!(j3 == -1 || j3 == j5)) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new c(jArr, jArr2, j8);
    }

    public boolean b() {
        return true;
    }

    public long c(long j) {
        return this.f354a[w.d(this.f355b, j, true, true)];
    }

    public l.a e(long j) {
        int d = w.d(this.f354a, j, true, true);
        long[] jArr = this.f354a;
        b.a.a.a.k0.m mVar = new b.a.a.a.k0.m(jArr[d], this.f355b[d]);
        if (mVar.f325a >= j || d == jArr.length - 1) {
            return new l.a(mVar);
        }
        int i = d + 1;
        return new l.a(mVar, new b.a.a.a.k0.m(this.f354a[i], this.f355b[i]));
    }

    public long i() {
        return this.c;
    }
}
