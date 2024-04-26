package b.a.a.a.k0.s;

import b.a.a.a.k0.f;
import b.a.a.a.k0.l;
import b.a.a.a.k0.m;
import java.io.EOFException;
import java.io.IOException;

final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final e f398a = new e();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f399b;
    private final long c;
    /* access modifiers changed from: private */
    public final h d;
    private int e;
    /* access modifiers changed from: private */
    public long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    private class b implements l {
        private b() {
        }

        public boolean b() {
            return true;
        }

        public l.a e(long j) {
            if (j == 0) {
                return new l.a(new m(0, a.this.f399b));
            }
            long b2 = a.this.d.b(j);
            a aVar = a.this;
            return new l.a(new m(j, aVar.i(aVar.f399b, b2, 30000)));
        }

        public long i() {
            return a.this.d.a(a.this.f);
        }
    }

    public a(long j2, long j3, h hVar, int i2, long j4) {
        b.a.a.a.r0.a.a(j2 >= 0 && j3 > j2);
        this.d = hVar;
        this.f399b = j2;
        this.c = j3;
        if (((long) i2) == j3 - j2) {
            this.f = j4;
            this.e = 3;
            return;
        }
        this.e = 0;
    }

    /* access modifiers changed from: private */
    public long i(long j2, long j3, long j4) {
        long j5 = this.c;
        long j6 = this.f399b;
        long j7 = j2 + (((j3 * (j5 - j6)) / this.f) - j4);
        if (j7 >= j6) {
            j6 = j7;
        }
        return j6 >= j5 ? j5 - 1 : j6;
    }

    public long a(f fVar) {
        int i2 = this.e;
        if (i2 == 0) {
            long k2 = fVar.k();
            this.g = k2;
            this.e = 1;
            long j2 = this.c - 65307;
            if (j2 > k2) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long j3 = this.h;
                long j4 = 0;
                if (j3 != 0) {
                    long j5 = j(j3, fVar);
                    if (j5 >= 0) {
                        return j5;
                    }
                    j4 = o(fVar, this.h, -(j5 + 2));
                }
                this.e = 3;
                return -(j4 + 2);
            } else if (i2 == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        this.f = k(fVar);
        this.e = 3;
        return this.g;
    }

    public long f(long j2) {
        int i2 = this.e;
        b.a.a.a.r0.a.a(i2 == 3 || i2 == 2);
        long j3 = 0;
        if (j2 != 0) {
            j3 = this.d.b(j2);
        }
        this.h = j3;
        this.e = 2;
        l();
        return this.h;
    }

    /* renamed from: h */
    public b d() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    public long j(long j2, f fVar) {
        f fVar2 = fVar;
        long j3 = 2;
        if (this.i == this.j) {
            return -(this.k + 2);
        }
        long k2 = fVar.k();
        if (!n(fVar2, this.j)) {
            long j4 = this.i;
            if (j4 != k2) {
                return j4;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f398a.a(fVar2, false);
        fVar.b();
        e eVar = this.f398a;
        long j5 = eVar.c;
        long j6 = j2 - j5;
        int i2 = eVar.e + eVar.f;
        if (j6 < 0 || j6 > 72000) {
            if (j6 < 0) {
                this.j = k2;
                this.l = j5;
            } else {
                long j7 = (long) i2;
                long k3 = fVar.k() + j7;
                this.i = k3;
                this.k = this.f398a.c;
                if ((this.j - k3) + j7 < 100000) {
                    fVar2.c(i2);
                    return -(this.k + 2);
                }
            }
            long j8 = this.j;
            long j9 = this.i;
            if (j8 - j9 < 100000) {
                this.j = j9;
                return j9;
            }
            long j10 = (long) i2;
            if (j6 > 0) {
                j3 = 1;
            }
            long j11 = j10 * j3;
            long j12 = this.j;
            long j13 = this.i;
            return Math.min(Math.max((fVar.k() - j11) + ((j6 * (j12 - j13)) / (this.l - this.k)), j13), this.j - 1);
        }
        fVar2.c(i2);
        return -(this.f398a.c + 2);
    }

    /* access modifiers changed from: package-private */
    public long k(f fVar) {
        m(fVar);
        this.f398a.b();
        while ((this.f398a.f408b & 4) != 4 && fVar.k() < this.c) {
            this.f398a.a(fVar, false);
            e eVar = this.f398a;
            fVar.c(eVar.e + eVar.f);
        }
        return this.f398a.c;
    }

    public void l() {
        this.i = this.f399b;
        this.j = this.c;
        this.k = 0;
        this.l = this.f;
    }

    /* access modifiers changed from: package-private */
    public void m(f fVar) {
        if (!n(fVar, this.c)) {
            throw new EOFException();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n(f fVar, long j2) {
        int i2;
        long min = Math.min(j2 + 3, this.c);
        int i3 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i4 = 0;
            if (fVar.k() + ((long) i3) <= min || (i3 = (int) (min - fVar.k())) >= 4) {
                fVar.f(bArr, 0, i3, false);
                while (true) {
                    i2 = i3 - 3;
                    if (i4 >= i2) {
                        break;
                    } else if (bArr[i4] == 79 && bArr[i4 + 1] == 103 && bArr[i4 + 2] == 103 && bArr[i4 + 3] == 83) {
                        fVar.c(i4);
                        return true;
                    } else {
                        i4++;
                    }
                }
            } else {
                return false;
            }
            fVar.c(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public long o(f fVar, long j2, long j3) {
        this.f398a.a(fVar, false);
        while (true) {
            e eVar = this.f398a;
            if (eVar.c < j2) {
                fVar.c(eVar.e + eVar.f);
                e eVar2 = this.f398a;
                long j4 = eVar2.c;
                eVar2.a(fVar, false);
                j3 = j4;
            } else {
                fVar.b();
                return j3;
            }
        }
    }
}
