package b.a.a.a.k0;

import b.a.a.a.k0.l;
import b.a.a.a.r0.w;

public final class a implements l {

    /* renamed from: a  reason: collision with root package name */
    public final int f310a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f311b;
    public final long[] c;
    private final long d;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f311b = jArr;
        this.c = jArr3;
        int length = iArr.length;
        this.f310a = length;
        if (length > 0) {
            this.d = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.d = 0;
        }
    }

    public int a(long j) {
        return w.d(this.c, j, true, true);
    }

    public boolean b() {
        return true;
    }

    public l.a e(long j) {
        int a2 = a(j);
        m mVar = new m(this.c[a2], this.f311b[a2]);
        if (mVar.f325a >= j || a2 == this.f310a - 1) {
            return new l.a(mVar);
        }
        int i = a2 + 1;
        return new l.a(mVar, new m(this.c[i], this.f311b[i]));
    }

    public long i() {
        return this.d;
    }
}
