package b.a.a.a.k0.u;

import b.a.a.a.k0.l;
import b.a.a.a.k0.m;
import b.a.a.a.r0.w;

final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final int f482a;

    /* renamed from: b  reason: collision with root package name */
    private final int f483b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private long g;
    private long h;

    public b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f482a = i;
        this.f483b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public int a() {
        return this.f483b * this.e * this.f482a;
    }

    public boolean b() {
        return true;
    }

    public long c(long j) {
        return (Math.max(0, j - this.g) * 1000000) / ((long) this.c);
    }

    public int d() {
        return this.d;
    }

    public l.a e(long j) {
        int i = this.d;
        long j2 = w.j((((((long) this.c) * j) / 1000000) / ((long) i)) * ((long) i), 0, this.h - ((long) i));
        long j3 = this.g + j2;
        long c2 = c(j3);
        m mVar = new m(c2, j3);
        if (c2 < j) {
            long j4 = this.h;
            int i2 = this.d;
            if (j2 != j4 - ((long) i2)) {
                long j5 = j3 + ((long) i2);
                return new l.a(mVar, new m(c(j5), j5));
            }
        }
        return new l.a(mVar);
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.f482a;
    }

    public int h() {
        return this.f483b;
    }

    public long i() {
        return ((this.h / ((long) this.d)) * 1000000) / ((long) this.f483b);
    }

    public boolean j() {
        return (this.g == 0 || this.h == 0) ? false : true;
    }

    public void k(long j, long j2) {
        this.g = j;
        this.h = j2;
    }
}
