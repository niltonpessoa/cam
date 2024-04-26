package b.a.a.a.k0.q;

import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.i;
import b.a.a.a.k0.j;
import b.a.a.a.k0.k;
import b.a.a.a.k0.l;
import b.a.a.a.k0.n;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import b.a.a.a.u;
import java.io.EOFException;
import java.util.List;

public final class b implements e {
    private static final int n = w.o("Xing");
    private static final int o = w.o("Info");
    private static final int p = w.o("VBRI");

    /* renamed from: a  reason: collision with root package name */
    private final int f352a;

    /* renamed from: b  reason: collision with root package name */
    private final long f353b;
    private final m c;
    private final j d;
    private final i e;
    private g f;
    private n g;
    private int h;
    private b.a.a.a.m0.a i;
    private a j;
    private long k;
    private long l;
    private int m;

    interface a extends l {
        long c(long j);
    }

    public b(int i2) {
        this(i2, -9223372036854775807L);
    }

    public b(int i2, long j2) {
        this.f352a = i2;
        this.f353b = j2;
        this.c = new m(10);
        this.d = new j();
        this.e = new i();
        this.k = -9223372036854775807L;
    }

    private a b(f fVar) {
        fVar.h(this.c.f734a, 0, 4);
        this.c.J(0);
        j.b(this.c.i(), this.d);
        return new a(fVar.getLength(), fVar.k(), this.d);
    }

    private static int c(m mVar, int i2) {
        if (mVar.d() >= i2 + 4) {
            mVar.J(i2);
            int i3 = mVar.i();
            if (i3 == n || i3 == o) {
                return i3;
            }
        }
        if (mVar.d() < 40) {
            return 0;
        }
        mVar.J(36);
        int i4 = mVar.i();
        int i5 = p;
        if (i4 == i5) {
            return i5;
        }
        return 0;
    }

    private static boolean e(int i2, long j2) {
        return ((long) (i2 & -128000)) == (j2 & -128000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private b.a.a.a.k0.q.b.a i(b.a.a.a.k0.f r10) {
        /*
            r9 = this;
            b.a.a.a.r0.m r5 = new b.a.a.a.r0.m
            b.a.a.a.k0.j r0 = r9.d
            int r0 = r0.c
            r5.<init>((int) r0)
            byte[] r0 = r5.f734a
            b.a.a.a.k0.j r1 = r9.d
            int r1 = r1.c
            r6 = 0
            r10.h(r0, r6, r1)
            b.a.a.a.k0.j r0 = r9.d
            int r1 = r0.f318a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            int r0 = r0.e
            if (r1 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x0028
            r3 = 36
            r7 = 36
            goto L_0x002f
        L_0x0026:
            if (r0 == r2) goto L_0x002b
        L_0x0028:
            r7 = 21
            goto L_0x002f
        L_0x002b:
            r3 = 13
            r7 = 13
        L_0x002f:
            int r8 = c(r5, r7)
            int r0 = n
            if (r8 == r0) goto L_0x005b
            int r0 = o
            if (r8 != r0) goto L_0x003c
            goto L_0x005b
        L_0x003c:
            int r0 = p
            if (r8 != r0) goto L_0x0056
            long r0 = r10.getLength()
            long r2 = r10.k()
            b.a.a.a.k0.j r4 = r9.d
            b.a.a.a.k0.q.c r0 = b.a.a.a.k0.q.c.a(r0, r2, r4, r5)
            b.a.a.a.k0.j r1 = r9.d
            int r1 = r1.c
            r10.c(r1)
            goto L_0x00ab
        L_0x0056:
            r0 = 0
            r10.b()
            goto L_0x00ab
        L_0x005b:
            long r0 = r10.getLength()
            long r2 = r10.k()
            b.a.a.a.k0.j r4 = r9.d
            b.a.a.a.k0.q.d r0 = b.a.a.a.k0.q.d.a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x0093
            b.a.a.a.k0.i r1 = r9.e
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0093
            r10.b()
            int r7 = r7 + 141
            r10.j(r7)
            b.a.a.a.r0.m r1 = r9.c
            byte[] r1 = r1.f734a
            r2 = 3
            r10.h(r1, r6, r2)
            b.a.a.a.r0.m r1 = r9.c
            r1.J(r6)
            b.a.a.a.k0.i r1 = r9.e
            b.a.a.a.r0.m r2 = r9.c
            int r2 = r2.A()
            r1.d(r2)
        L_0x0093:
            b.a.a.a.k0.j r1 = r9.d
            int r1 = r1.c
            r10.c(r1)
            if (r0 == 0) goto L_0x00ab
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x00ab
            int r1 = o
            if (r8 != r1) goto L_0x00ab
            b.a.a.a.k0.q.b$a r10 = r9.b(r10)
            return r10
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.q.b.i(b.a.a.a.k0.f):b.a.a.a.k0.q.b$a");
    }

    private void j(f fVar) {
        int i2 = 0;
        while (true) {
            fVar.h(this.c.f734a, 0, 10);
            this.c.J(0);
            if (this.c.A() != b.a.a.a.m0.i.g.f519b) {
                fVar.b();
                fVar.j(i2);
                return;
            }
            this.c.K(3);
            int w = this.c.w();
            int i3 = w + 10;
            if (this.i == null) {
                byte[] bArr = new byte[i3];
                System.arraycopy(this.c.f734a, 0, bArr, 0, 10);
                fVar.h(bArr, 10, w);
                b.a.a.a.m0.a c2 = new b.a.a.a.m0.i.g((this.f352a & 2) != 0 ? i.c : null).c(bArr, i3);
                this.i = c2;
                if (c2 != null) {
                    this.e.c(c2);
                }
            } else {
                fVar.j(w);
            }
            i2 += i3;
        }
    }

    private int k(f fVar) {
        if (this.m == 0) {
            fVar.b();
            if (!fVar.f(this.c.f734a, 0, 4, true)) {
                return -1;
            }
            this.c.J(0);
            int i2 = this.c.i();
            if (!e(i2, (long) this.h) || j.a(i2) == -1) {
                fVar.c(1);
                this.h = 0;
                return 0;
            }
            j.b(i2, this.d);
            if (this.k == -9223372036854775807L) {
                this.k = this.j.c(fVar.k());
                if (this.f353b != -9223372036854775807L) {
                    this.k += this.f353b - this.j.c(0);
                }
            }
            this.m = this.d.c;
        }
        int b2 = this.g.b(fVar, this.m, true);
        if (b2 == -1) {
            return -1;
        }
        int i3 = this.m - b2;
        this.m = i3;
        if (i3 > 0) {
            return 0;
        }
        long j2 = this.k;
        j jVar = this.d;
        this.g.d(j2 + ((this.l * 1000000) / ((long) jVar.d)), 1, jVar.c, 0, (n.a) null);
        this.l += (long) this.d.g;
        this.m = 0;
        return 0;
    }

    private boolean l(f fVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int a2;
        int i5 = z ? 16384 : 131072;
        fVar.b();
        if (fVar.k() == 0) {
            j(fVar);
            i2 = (int) fVar.g();
            if (!z) {
                fVar.c(i2);
            }
            i3 = 0;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (!fVar.f(this.c.f734a, 0, 4, i3 > 0)) {
                break;
            }
            this.c.J(0);
            int i8 = this.c.i();
            if ((i6 == 0 || e(i8, (long) i6)) && (a2 = j.a(i8)) != -1) {
                i4 = i3 + 1;
                if (i4 != 1) {
                    if (i4 == 4) {
                        break;
                    }
                } else {
                    j.b(i8, this.d);
                    i6 = i8;
                }
                fVar.j(a2 - 4);
            } else {
                int i9 = i7 + 1;
                if (i7 != i5) {
                    if (z) {
                        fVar.b();
                        fVar.j(i2 + i9);
                    } else {
                        fVar.c(1);
                    }
                    i7 = i9;
                    i4 = 0;
                    i6 = 0;
                } else if (z) {
                    return false;
                } else {
                    throw new u("Searched too many bytes.");
                }
            }
        }
        if (z) {
            fVar.c(i2 + i7);
        } else {
            fVar.b();
        }
        this.h = i6;
        return true;
    }

    public void a() {
    }

    public void d(g gVar) {
        this.f = gVar;
        this.g = gVar.f(0, 1);
        this.f.d();
    }

    public void f(long j2, long j3) {
        this.h = 0;
        this.k = -9223372036854775807L;
        this.l = 0;
        this.m = 0;
    }

    public int g(f fVar, k kVar) {
        if (this.h == 0) {
            try {
                l(fVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        } else {
            f fVar2 = fVar;
        }
        if (this.j == null) {
            a i2 = i(fVar);
            this.j = i2;
            if (i2 == null || (!i2.b() && (this.f352a & 1) != 0)) {
                this.j = b(fVar);
            }
            this.f.c(this.j);
            n nVar = this.g;
            j jVar = this.d;
            String str = jVar.f319b;
            int i3 = jVar.e;
            int i4 = jVar.d;
            i iVar = this.e;
            nVar.c(b.a.a.a.n.f((String) null, str, (String) null, -1, 4096, i3, i4, -1, iVar.f316a, iVar.f317b, (List<byte[]>) null, (b.a.a.a.j0.a) null, 0, (String) null, (this.f352a & 2) != 0 ? null : this.i));
        }
        return k(fVar);
    }

    public boolean h(f fVar) {
        return l(fVar, true);
    }
}
