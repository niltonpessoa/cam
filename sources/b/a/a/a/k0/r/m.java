package b.a.a.a.k0.r;

import b.a.a.a.r0.a;
import b.a.a.a.r0.w;

final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f396a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f397b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;
    public final long g;

    public m(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = true;
        a.a(iArr.length == jArr2.length);
        a.a(jArr.length == jArr2.length);
        a.a(iArr2.length != jArr2.length ? false : z);
        this.f397b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.g = j;
        this.f396a = jArr.length;
    }

    public int a(long j) {
        for (int d2 = w.d(this.e, j, true, false); d2 >= 0; d2--) {
            if ((this.f[d2] & 1) != 0) {
                return d2;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int c2 = w.c(this.e, j, true, false); c2 < this.e.length; c2++) {
            if ((this.f[c2] & 1) != 0) {
                return c2;
            }
        }
        return -1;
    }
}
