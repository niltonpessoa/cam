package b.a.a.a.k0.r;

import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.i;
import b.a.a.a.k0.l;
import b.a.a.a.k0.n;
import b.a.a.a.k0.r.a;
import b.a.a.a.r0.k;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.Stack;

public final class g implements e, l {
    private static final int t = w.o("qt  ");

    /* renamed from: a  reason: collision with root package name */
    private final int f384a;

    /* renamed from: b  reason: collision with root package name */
    private final m f385b = new m(k.f726a);
    private final m c = new m(4);
    private final m d = new m(16);
    private final Stack<a.C0022a> e = new Stack<>();
    private int f;
    private int g;
    private long h;
    private int i;
    private m j;
    private int k = -1;
    private int l;
    private int m;
    private b.a.a.a.k0.g n;
    private a[] o;
    private long[][] p;
    private int q;
    private long r;
    private boolean s;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f386a;

        /* renamed from: b  reason: collision with root package name */
        public final m f387b;
        public final n c;
        public int d;

        public a(j jVar, m mVar, n nVar) {
            this.f386a = jVar;
            this.f387b = mVar;
            this.c = nVar;
        }
    }

    public g(int i2) {
        this.f384a = i2;
    }

    private static long[][] j(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            jArr[i2] = new long[aVarArr[i2].f387b.f396a];
            jArr2[i2] = aVarArr[i2].f387b.e[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < aVarArr.length) {
            long j3 = Long.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < aVarArr.length; i5++) {
                if (!zArr[i5] && jArr2[i5] <= j3) {
                    j3 = jArr2[i5];
                    i4 = i5;
                }
            }
            int i6 = iArr[i4];
            jArr[i4][i6] = j2;
            j2 += (long) aVarArr[i4].f387b.c[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr[i4].length) {
                jArr2[i4] = aVarArr[i4].f387b.e[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private void k() {
        this.f = 0;
        this.i = 0;
    }

    private static int l(m mVar, long j2) {
        int a2 = mVar.a(j2);
        return a2 == -1 ? mVar.b(j2) : a2;
    }

    private int m(long j2) {
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        long j4 = Long.MAX_VALUE;
        boolean z2 = true;
        long j5 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.o;
            if (i4 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i4];
            int i5 = aVar.d;
            m mVar = aVar.f387b;
            if (i5 != mVar.f396a) {
                long j6 = mVar.f397b[i5];
                long j7 = this.p[i4][i5];
                long j8 = j6 - j2;
                boolean z3 = j8 < 0 || j8 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j8 < j5)) {
                    z2 = z3;
                    j5 = j8;
                    i3 = i4;
                    j4 = j7;
                }
                if (j7 < j3) {
                    z = z3;
                    i2 = i4;
                    j3 = j7;
                }
            }
            i4++;
        }
        return (j3 == Long.MAX_VALUE || !z || j4 < j3 + 10485760) ? i3 : i2;
    }

    private static long n(m mVar, long j2, long j3) {
        int l2 = l(mVar, j2);
        return l2 == -1 ? j3 : Math.min(mVar.f397b[l2], j3);
    }

    private void o(long j2) {
        while (!this.e.isEmpty() && this.e.peek().P0 == j2) {
            a.C0022a pop = this.e.pop();
            if (pop.f359a == a.C) {
                q(pop);
                this.e.clear();
                this.f = 2;
            } else if (!this.e.isEmpty()) {
                this.e.peek().d(pop);
            }
        }
        if (this.f != 2) {
            k();
        }
    }

    private static boolean p(m mVar) {
        mVar.J(8);
        if (mVar.i() == t) {
            return true;
        }
        mVar.K(4);
        while (mVar.a() > 0) {
            if (mVar.i() == t) {
                return true;
            }
        }
        return false;
    }

    private void q(a.C0022a aVar) {
        b.a.a.a.m0.a aVar2;
        a.C0022a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        a.b g2 = aVar3.g(a.A0);
        if (g2 != null) {
            aVar2 = b.u(g2, this.s);
            if (aVar2 != null) {
                iVar.c(aVar2);
            }
        } else {
            aVar2 = null;
        }
        int i2 = -1;
        long j2 = -9223372036854775807L;
        for (int i3 = 0; i3 < aVar3.R0.size(); i3++) {
            a.C0022a aVar4 = aVar3.R0.get(i3);
            if (aVar4.f359a == a.E) {
                j t2 = b.t(aVar4, aVar3.g(a.D), -9223372036854775807L, (b.a.a.a.j0.a) null, (this.f384a & 1) != 0, this.s);
                if (t2 != null) {
                    m p2 = b.p(t2, aVar4.f(a.F).f(a.G).f(a.H), iVar);
                    if (p2.f396a != 0) {
                        a aVar5 = new a(t2, p2, this.n.f(i3, t2.f391b));
                        b.a.a.a.n c2 = t2.f.c(p2.d + 30);
                        if (t2.f391b == 1) {
                            if (iVar.a()) {
                                c2 = c2.b(iVar.f316a, iVar.f317b);
                            }
                            if (aVar2 != null) {
                                c2 = c2.d(aVar2);
                            }
                        }
                        aVar5.c.c(c2);
                        long j3 = t2.e;
                        if (j3 == -9223372036854775807L) {
                            j3 = p2.g;
                        }
                        j2 = Math.max(j2, j3);
                        if (t2.f391b == 2) {
                            if (i2 == -1) {
                                i2 = arrayList.size();
                            }
                        }
                        arrayList.add(aVar5);
                    }
                }
            }
        }
        this.q = i2;
        this.r = j2;
        a[] aVarArr = (a[]) arrayList.toArray(new a[arrayList.size()]);
        this.o = aVarArr;
        this.p = j(aVarArr);
        this.n.d();
        this.n.c(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean r(b.a.a.a.k0.f r9) {
        /*
            r8 = this;
            int r0 = r8.i
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L_0x002a
            b.a.a.a.r0.m r0 = r8.d
            byte[] r0 = r0.f734a
            boolean r0 = r9.e(r0, r3, r2, r1)
            if (r0 != 0) goto L_0x0013
            return r3
        L_0x0013:
            r8.i = r2
            b.a.a.a.r0.m r0 = r8.d
            r0.J(r3)
            b.a.a.a.r0.m r0 = r8.d
            long r4 = r0.z()
            r8.h = r4
            b.a.a.a.r0.m r0 = r8.d
            int r0 = r0.i()
            r8.g = r0
        L_0x002a:
            long r4 = r8.h
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            b.a.a.a.r0.m r0 = r8.d
            byte[] r0 = r0.f734a
            r9.i(r0, r2, r2)
            int r0 = r8.i
            int r0 = r0 + r2
            r8.i = r0
            b.a.a.a.r0.m r0 = r8.d
            long r4 = r0.C()
        L_0x0044:
            r8.h = r4
            goto L_0x0077
        L_0x0047:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r4 = r9.getLength()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            java.util.Stack<b.a.a.a.k0.r.a$a> r0 = r8.e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.util.Stack<b.a.a.a.k0.r.a$a> r0 = r8.e
            java.lang.Object r0 = r0.peek()
            b.a.a.a.k0.r.a$a r0 = (b.a.a.a.k0.r.a.C0022a) r0
            long r4 = r0.P0
        L_0x0069:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            long r6 = r9.k()
            long r4 = r4 - r6
            int r0 = r8.i
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0044
        L_0x0077:
            long r4 = r8.h
            int r0 = r8.i
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00eb
            int r0 = r8.g
            boolean r0 = u(r0)
            if (r0 == 0) goto L_0x00b0
            long r2 = r9.k()
            long r4 = r8.h
            long r2 = r2 + r4
            int r9 = r8.i
            long r4 = (long) r9
            long r2 = r2 - r4
            java.util.Stack<b.a.a.a.k0.r.a$a> r9 = r8.e
            b.a.a.a.k0.r.a$a r0 = new b.a.a.a.k0.r.a$a
            int r4 = r8.g
            r0.<init>(r4, r2)
            r9.add(r0)
            long r4 = r8.h
            int r9 = r8.i
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00ac
            r8.o(r2)
            goto L_0x00ea
        L_0x00ac:
            r8.k()
            goto L_0x00ea
        L_0x00b0:
            int r9 = r8.g
            boolean r9 = v(r9)
            if (r9 == 0) goto L_0x00e5
            int r9 = r8.i
            if (r9 != r2) goto L_0x00be
            r9 = 1
            goto L_0x00bf
        L_0x00be:
            r9 = 0
        L_0x00bf:
            b.a.a.a.r0.a.f(r9)
            long r4 = r8.h
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x00cd
            r9 = 1
            goto L_0x00ce
        L_0x00cd:
            r9 = 0
        L_0x00ce:
            b.a.a.a.r0.a.f(r9)
            b.a.a.a.r0.m r9 = new b.a.a.a.r0.m
            long r4 = r8.h
            int r0 = (int) r4
            r9.<init>((int) r0)
            r8.j = r9
            b.a.a.a.r0.m r0 = r8.d
            byte[] r0 = r0.f734a
            byte[] r9 = r9.f734a
            java.lang.System.arraycopy(r0, r3, r9, r3, r2)
            goto L_0x00e8
        L_0x00e5:
            r9 = 0
            r8.j = r9
        L_0x00e8:
            r8.f = r1
        L_0x00ea:
            return r1
        L_0x00eb:
            b.a.a.a.u r9 = new b.a.a.a.u
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            r9.<init>(r0)
            goto L_0x00f4
        L_0x00f3:
            throw r9
        L_0x00f4:
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.r.g.r(b.a.a.a.k0.f):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean s(b.a.a.a.k0.f r10, b.a.a.a.k0.k r11) {
        /*
            r9 = this;
            long r0 = r9.h
            int r2 = r9.i
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.k()
            long r2 = r2 + r0
            b.a.a.a.r0.m r4 = r9.j
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0045
            byte[] r11 = r4.f734a
            int r4 = r9.i
            int r1 = (int) r0
            r10.i(r11, r4, r1)
            int r10 = r9.g
            int r11 = b.a.a.a.k0.r.a.f358b
            if (r10 != r11) goto L_0x0028
            b.a.a.a.r0.m r10 = r9.j
            boolean r10 = p(r10)
            r9.s = r10
            goto L_0x0050
        L_0x0028:
            java.util.Stack<b.a.a.a.k0.r.a$a> r10 = r9.e
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0050
            java.util.Stack<b.a.a.a.k0.r.a$a> r10 = r9.e
            java.lang.Object r10 = r10.peek()
            b.a.a.a.k0.r.a$a r10 = (b.a.a.a.k0.r.a.C0022a) r10
            b.a.a.a.k0.r.a$b r11 = new b.a.a.a.k0.r.a$b
            int r0 = r9.g
            b.a.a.a.r0.m r1 = r9.j
            r11.<init>(r0, r1)
            r10.e(r11)
            goto L_0x0050
        L_0x0045:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0052
            int r11 = (int) r0
            r10.c(r11)
        L_0x0050:
            r10 = 0
            goto L_0x005a
        L_0x0052:
            long r7 = r10.k()
            long r7 = r7 + r0
            r11.f320a = r7
            r10 = 1
        L_0x005a:
            r9.o(r2)
            if (r10 == 0) goto L_0x0065
            int r10 = r9.f
            r11 = 2
            if (r10 == r11) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.r.g.s(b.a.a.a.k0.f, b.a.a.a.k0.k):boolean");
    }

    private int t(f fVar, b.a.a.a.k0.k kVar) {
        long k2 = fVar.k();
        if (this.k == -1) {
            int m2 = m(k2);
            this.k = m2;
            if (m2 == -1) {
                return -1;
            }
        }
        a aVar = this.o[this.k];
        n nVar = aVar.c;
        int i2 = aVar.d;
        m mVar = aVar.f387b;
        long j2 = mVar.f397b[i2];
        int i3 = mVar.c[i2];
        long j3 = (j2 - k2) + ((long) this.l);
        if (j3 < 0 || j3 >= 262144) {
            kVar.f320a = j2;
            return 1;
        }
        if (aVar.f386a.g == 1) {
            j3 += 8;
            i3 -= 8;
        }
        fVar.c((int) j3);
        int i4 = aVar.f386a.j;
        if (i4 == 0) {
            while (true) {
                int i5 = this.l;
                if (i5 >= i3) {
                    break;
                }
                int b2 = nVar.b(fVar, i3 - i5, false);
                this.l += b2;
                this.m -= b2;
            }
        } else {
            byte[] bArr = this.c.f734a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i6 = 4 - i4;
            while (this.l < i3) {
                int i7 = this.m;
                if (i7 == 0) {
                    fVar.i(this.c.f734a, i6, i4);
                    this.c.J(0);
                    this.m = this.c.B();
                    this.f385b.J(0);
                    nVar.a(this.f385b, 4);
                    this.l += 4;
                    i3 += i6;
                } else {
                    int b3 = nVar.b(fVar, i7, false);
                    this.l += b3;
                    this.m -= b3;
                }
            }
        }
        m mVar2 = aVar.f387b;
        nVar.d(mVar2.e[i2], mVar2.f[i2], i3, 0, (n.a) null);
        aVar.d++;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        return 0;
    }

    private static boolean u(int i2) {
        return i2 == a.C || i2 == a.E || i2 == a.F || i2 == a.G || i2 == a.H || i2 == a.Q;
    }

    private static boolean v(int i2) {
        return i2 == a.S || i2 == a.D || i2 == a.T || i2 == a.U || i2 == a.m0 || i2 == a.n0 || i2 == a.o0 || i2 == a.R || i2 == a.p0 || i2 == a.q0 || i2 == a.r0 || i2 == a.s0 || i2 == a.t0 || i2 == a.P || i2 == a.f358b || i2 == a.A0;
    }

    private void w(long j2) {
        for (a aVar : this.o) {
            m mVar = aVar.f387b;
            int a2 = mVar.a(j2);
            if (a2 == -1) {
                a2 = mVar.b(j2);
            }
            aVar.d = a2;
        }
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public void d(b.a.a.a.k0.g gVar) {
        this.n = gVar;
    }

    public l.a e(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        int b2;
        a[] aVarArr = this.o;
        if (aVarArr.length == 0) {
            return new l.a(b.a.a.a.k0.m.c);
        }
        int i2 = this.q;
        if (i2 != -1) {
            m mVar = aVarArr[i2].f387b;
            int l2 = l(mVar, j2);
            if (l2 == -1) {
                return new l.a(b.a.a.a.k0.m.c);
            }
            long j7 = mVar.e[l2];
            j3 = mVar.f397b[l2];
            if (j7 >= j2 || l2 >= mVar.f396a - 1 || (b2 = mVar.b(j2)) == -1 || b2 == l2) {
                j6 = -1;
                j5 = -9223372036854775807L;
            } else {
                j5 = mVar.e[b2];
                j6 = mVar.f397b[b2];
            }
            j4 = j6;
            j2 = j7;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr2 = this.o;
            if (i3 >= aVarArr2.length) {
                break;
            }
            if (i3 != this.q) {
                m mVar2 = aVarArr2[i3].f387b;
                long n2 = n(mVar2, j2, j3);
                if (j5 != -9223372036854775807L) {
                    j4 = n(mVar2, j5, j4);
                }
                j3 = n2;
            }
            i3++;
        }
        b.a.a.a.k0.m mVar3 = new b.a.a.a.k0.m(j2, j3);
        return j5 == -9223372036854775807L ? new l.a(mVar3) : new l.a(mVar3, new b.a.a.a.k0.m(j5, j4));
    }

    public void f(long j2, long j3) {
        this.e.clear();
        this.i = 0;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        if (j2 == 0) {
            k();
        } else if (this.o != null) {
            w(j3);
        }
    }

    public int g(f fVar, b.a.a.a.k0.k kVar) {
        while (true) {
            int i2 = this.f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return t(fVar, kVar);
                    }
                    throw new IllegalStateException();
                } else if (s(fVar, kVar)) {
                    return 1;
                }
            } else if (!r(fVar)) {
                return -1;
            }
        }
    }

    public boolean h(f fVar) {
        return i.d(fVar);
    }

    public long i() {
        return this.r;
    }
}
