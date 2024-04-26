package b.a.a.a.k0.p;

import b.a.a.a.k0.f;
import b.a.a.a.u;
import java.util.Stack;

final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f335a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final Stack<b> f336b = new Stack<>();
    private final f c = new f();
    private c d;
    private int e;
    private int f;
    private long g;

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f337a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f338b;

        private b(int i, long j) {
            this.f337a = i;
            this.f338b = j;
        }
    }

    a() {
    }

    private long c(f fVar) {
        fVar.b();
        while (true) {
            fVar.h(this.f335a, 0, 4);
            int c2 = f.c(this.f335a[0]);
            if (c2 != -1 && c2 <= 4) {
                int a2 = (int) f.a(this.f335a, c2, false);
                if (this.d.g(a2)) {
                    fVar.c(c2);
                    return (long) a2;
                }
            }
            fVar.c(1);
        }
    }

    private double d(f fVar, int i) {
        long e2 = e(fVar, i);
        return i == 4 ? (double) Float.intBitsToFloat((int) e2) : Double.longBitsToDouble(e2);
    }

    private long e(f fVar, int i) {
        fVar.i(this.f335a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f335a[i2] & 255));
        }
        return j;
    }

    private String f(f fVar, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        fVar.i(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public boolean a(f fVar) {
        b.a.a.a.r0.a.f(this.d != null);
        while (true) {
            if (this.f336b.isEmpty() || fVar.k() < this.f336b.peek().f338b) {
                if (this.e == 0) {
                    long d2 = this.c.d(fVar, true, false, 4);
                    if (d2 == -2) {
                        d2 = c(fVar);
                    }
                    if (d2 == -1) {
                        return false;
                    }
                    this.f = (int) d2;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.d(fVar, false, true, 8);
                    this.e = 2;
                }
                int c2 = this.d.c(this.f);
                if (c2 == 0) {
                    fVar.c((int) this.g);
                    this.e = 0;
                } else if (c2 == 1) {
                    long k = fVar.k();
                    this.f336b.add(new b(this.f, this.g + k));
                    this.d.f(this.f, k, this.g);
                    this.e = 0;
                    return true;
                } else if (c2 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.h(this.f, e(fVar, (int) j));
                        this.e = 0;
                        return true;
                    }
                    throw new u("Invalid integer size: " + this.g);
                } else if (c2 == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.e(this.f, f(fVar, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    throw new u("String element size: " + this.g);
                } else if (c2 == 4) {
                    this.d.b(this.f, (int) this.g, fVar);
                    this.e = 0;
                    return true;
                } else if (c2 == 5) {
                    long j3 = this.g;
                    if (j3 == 4 || j3 == 8) {
                        this.d.d(this.f, d(fVar, (int) j3));
                        this.e = 0;
                        return true;
                    }
                    throw new u("Invalid float size: " + this.g);
                } else {
                    throw new u("Invalid element type " + c2);
                }
            } else {
                this.d.a(this.f336b.pop().f337a);
                return true;
            }
        }
    }

    public void b(c cVar) {
        this.d = cVar;
    }

    public void reset() {
        this.e = 0;
        this.f336b.clear();
        this.c.e();
    }
}
