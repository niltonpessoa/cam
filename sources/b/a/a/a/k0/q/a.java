package b.a.a.a.k0.q;

import b.a.a.a.k0.j;
import b.a.a.a.k0.l;
import b.a.a.a.k0.m;
import b.a.a.a.k0.q.b;
import b.a.a.a.r0.w;

final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final long f350a;

    /* renamed from: b  reason: collision with root package name */
    private final int f351b;
    private final long c;
    private final int d;
    private final long e;

    public a(long j, long j2, j jVar) {
        long j3;
        this.f350a = j2;
        this.f351b = jVar.c;
        this.d = jVar.f;
        if (j == -1) {
            this.c = -1;
            j3 = -9223372036854775807L;
        } else {
            this.c = j - j2;
            j3 = c(j);
        }
        this.e = j3;
    }

    public boolean b() {
        return this.c != -1;
    }

    public long c(long j) {
        return ((Math.max(0, j - this.f350a) * 1000000) * 8) / ((long) this.d);
    }

    public l.a e(long j) {
        long j2 = this.c;
        if (j2 == -1) {
            return new l.a(new m(0, this.f350a));
        }
        int i = this.f351b;
        long j3 = w.j((((((long) this.d) * j) / 8000000) / ((long) i)) * ((long) i), 0, j2 - ((long) i));
        long j4 = this.f350a + j3;
        long c2 = c(j4);
        m mVar = new m(c2, j4);
        if (c2 < j) {
            long j5 = this.c;
            int i2 = this.f351b;
            if (j3 != j5 - ((long) i2)) {
                long j6 = j4 + ((long) i2);
                return new l.a(mVar, new m(c(j6), j6));
            }
        }
        return new l.a(mVar);
    }

    public long i() {
        return this.e;
    }
}
