package b.a.a.a.k0.r;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import b.a.a.a.j0.a;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.l;
import b.a.a.a.k0.n;
import b.a.a.a.k0.r.a;
import b.a.a.a.n;
import b.a.a.a.r0.k;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;
import b.a.a.a.r0.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public final class e implements b.a.a.a.k0.e {
    private static final int I = w.o("seig");
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final n K = n.j((String) null, "application/x-emsg", Long.MAX_VALUE);
    private int A;
    private int B;
    private int C;
    private boolean D;
    private g E;
    private b.a.a.a.k0.n[] F;
    private b.a.a.a.k0.n[] G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final int f376a;

    /* renamed from: b  reason: collision with root package name */
    private final j f377b;
    private final List<n> c;
    private final b.a.a.a.j0.a d;
    private final SparseArray<b> e;
    private final m f;
    private final m g;
    private final m h;
    private final m i;
    private final m j;
    private final u k;
    private final m l;
    private final byte[] m;
    private final Stack<a.C0022a> n;
    private final ArrayDeque<a> o;
    private final b.a.a.a.k0.n p;
    private int q;
    private int r;
    private long s;
    private int t;
    private m u;
    private long v;
    private int w;
    private long x;
    private long y;
    private b z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f378a;

        /* renamed from: b  reason: collision with root package name */
        public final int f379b;

        public a(long j, int i) {
            this.f378a = j;
            this.f379b = i;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final l f380a = new l();

        /* renamed from: b  reason: collision with root package name */
        public final b.a.a.a.k0.n f381b;
        public j c;
        public c d;
        public int e;
        public int f;
        public int g;

        public b(b.a.a.a.k0.n nVar) {
            this.f381b = nVar;
        }

        public void a(j jVar, c cVar) {
            b.a.a.a.r0.a.e(jVar);
            this.c = jVar;
            b.a.a.a.r0.a.e(cVar);
            this.d = cVar;
            this.f381b.c(jVar.f);
            b();
        }

        public void b() {
            this.f380a.f();
            this.e = 0;
            this.g = 0;
            this.f = 0;
        }

        public void c(b.a.a.a.j0.a aVar) {
            k a2 = this.c.a(this.f380a.f394a.f372a);
            this.f381b.c(this.c.f.a(aVar.b(a2 != null ? a2.f392a : null)));
        }
    }

    public e(int i2) {
        this(i2, (u) null);
    }

    public e(int i2, u uVar) {
        this(i2, uVar, (j) null, (b.a.a.a.j0.a) null);
    }

    public e(int i2, u uVar, j jVar, b.a.a.a.j0.a aVar) {
        this(i2, uVar, jVar, aVar, Collections.emptyList());
    }

    public e(int i2, u uVar, j jVar, b.a.a.a.j0.a aVar, List<n> list) {
        this(i2, uVar, jVar, aVar, list, (b.a.a.a.k0.n) null);
    }

    public e(int i2, u uVar, j jVar, b.a.a.a.j0.a aVar, List<n> list, b.a.a.a.k0.n nVar) {
        this.f376a = i2 | (jVar != null ? 8 : 0);
        this.k = uVar;
        this.f377b = jVar;
        this.d = aVar;
        this.c = Collections.unmodifiableList(list);
        this.p = nVar;
        this.l = new m(16);
        this.f = new m(k.f726a);
        this.g = new m(5);
        this.h = new m();
        this.i = new m(1);
        this.j = new m();
        this.m = new byte[16];
        this.n = new Stack<>();
        this.o = new ArrayDeque<>();
        this.e = new SparseArray<>();
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        c();
    }

    private static void A(a.C0022a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) {
        b z2 = z(aVar.g(a.y).P0, sparseArray, i2);
        if (z2 != null) {
            l lVar = z2.f380a;
            long j2 = lVar.s;
            z2.b();
            int i3 = a.x;
            if (aVar.g(i3) != null && (i2 & 2) == 0) {
                j2 = y(aVar.g(i3).P0);
            }
            D(aVar, z2, j2, i2);
            k a2 = z2.c.a(lVar.f394a.f372a);
            a.b g2 = aVar.g(a.d0);
            if (g2 != null) {
                t(a2, g2.P0, lVar);
            }
            a.b g3 = aVar.g(a.e0);
            if (g3 != null) {
                s(g3.P0, lVar);
            }
            a.b g4 = aVar.g(a.i0);
            if (g4 != null) {
                v(g4.P0, lVar);
            }
            a.b g5 = aVar.g(a.f0);
            a.b g6 = aVar.g(a.g0);
            if (!(g5 == null || g6 == null)) {
                w(g5.P0, g6.P0, a2 != null ? a2.f392a : null, lVar);
            }
            int size = aVar.Q0.size();
            for (int i4 = 0; i4 < size; i4++) {
                a.b bVar = aVar.Q0.get(i4);
                if (bVar.f359a == a.h0) {
                    E(bVar.P0, lVar, bArr);
                }
            }
        }
    }

    private static Pair<Integer, c> B(m mVar) {
        mVar.J(12);
        return Pair.create(Integer.valueOf(mVar.i()), new c(mVar.B() - 1, mVar.B(), mVar.B(), mVar.i()));
    }

    private static int C(b bVar, int i2, long j2, int i3, m mVar, int i4) {
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        b bVar2 = bVar;
        mVar.J(8);
        int b2 = a.b(mVar.i());
        j jVar = bVar2.c;
        l lVar = bVar2.f380a;
        c cVar = lVar.f394a;
        lVar.h[i2] = mVar.B();
        long[] jArr = lVar.g;
        jArr[i2] = lVar.c;
        if ((b2 & 1) != 0) {
            jArr[i2] = jArr[i2] + ((long) mVar.i());
        }
        boolean z6 = (b2 & 4) != 0;
        int i7 = cVar.d;
        if (z6) {
            i7 = mVar.B();
        }
        boolean z7 = (b2 & 256) != 0;
        boolean z8 = (b2 & 512) != 0;
        boolean z9 = (b2 & 1024) != 0;
        boolean z10 = (b2 & 2048) != 0;
        long[] jArr2 = jVar.h;
        long j3 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j3 = w.C(jVar.i[0], 1000, jVar.c);
        }
        int[] iArr = lVar.i;
        int[] iArr2 = lVar.j;
        long[] jArr3 = lVar.k;
        boolean[] zArr = lVar.l;
        int i8 = i7;
        boolean z11 = jVar.f391b == 2 && (i3 & 1) != 0;
        int i9 = i4 + lVar.h[i2];
        long j4 = jVar.c;
        long j5 = j3;
        boolean[] zArr2 = zArr;
        long j6 = i2 > 0 ? lVar.s : j2;
        int i10 = i4;
        while (i10 < i9) {
            int B2 = z7 ? mVar.B() : cVar.f373b;
            if (z8) {
                z2 = z7;
                i5 = mVar.B();
            } else {
                z2 = z7;
                i5 = cVar.c;
            }
            if (i10 == 0 && z6) {
                z3 = z6;
                i6 = i8;
            } else if (z9) {
                z3 = z6;
                i6 = mVar.i();
            } else {
                z3 = z6;
                i6 = cVar.d;
            }
            boolean z12 = z10;
            if (z10) {
                z5 = z8;
                z4 = z9;
                iArr2[i10] = (int) ((((long) mVar.i()) * 1000) / j4);
            } else {
                z5 = z8;
                z4 = z9;
                iArr2[i10] = 0;
            }
            jArr3[i10] = w.C(j6, 1000, j4) - j5;
            iArr[i10] = i5;
            zArr2[i10] = ((i6 >> 16) & 1) == 0 && (!z11 || i10 == 0);
            i10++;
            j6 += (long) B2;
            j4 = j4;
            z7 = z2;
            z6 = z3;
            z10 = z12;
            z8 = z5;
            z9 = z4;
        }
        lVar.s = j6;
        return i9;
    }

    private static void D(a.C0022a aVar, b bVar, long j2, int i2) {
        List<a.b> list = aVar.Q0;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            a.b bVar2 = list.get(i5);
            if (bVar2.f359a == a.A) {
                m mVar = bVar2.P0;
                mVar.J(12);
                int B2 = mVar.B();
                if (B2 > 0) {
                    i4 += B2;
                    i3++;
                }
            }
        }
        bVar.g = 0;
        bVar.f = 0;
        bVar.e = 0;
        bVar.f380a.e(i3, i4);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            a.b bVar3 = list.get(i8);
            if (bVar3.f359a == a.A) {
                i7 = C(bVar, i6, j2, i2, bVar3.P0, i7);
                i6++;
            }
        }
    }

    private static void E(m mVar, l lVar, byte[] bArr) {
        mVar.J(8);
        mVar.g(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            u(mVar, 16, lVar);
        }
    }

    private void F(long j2) {
        while (!this.n.isEmpty() && this.n.peek().P0 == j2) {
            k(this.n.pop());
        }
        c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean G(b.a.a.a.k0.f r9) {
        /*
            r8 = this;
            int r0 = r8.t
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x002a
            b.a.a.a.r0.m r0 = r8.l
            byte[] r0 = r0.f734a
            boolean r0 = r9.e(r0, r2, r1, r3)
            if (r0 != 0) goto L_0x0013
            return r2
        L_0x0013:
            r8.t = r1
            b.a.a.a.r0.m r0 = r8.l
            r0.J(r2)
            b.a.a.a.r0.m r0 = r8.l
            long r4 = r0.z()
            r8.s = r4
            b.a.a.a.r0.m r0 = r8.l
            int r0 = r0.i()
            r8.r = r0
        L_0x002a:
            long r4 = r8.s
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            b.a.a.a.r0.m r0 = r8.l
            byte[] r0 = r0.f734a
            r9.i(r0, r1, r1)
            int r0 = r8.t
            int r0 = r0 + r1
            r8.t = r0
            b.a.a.a.r0.m r0 = r8.l
            long r4 = r0.C()
        L_0x0044:
            r8.s = r4
            goto L_0x0077
        L_0x0047:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r4 = r9.getLength()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            java.util.Stack<b.a.a.a.k0.r.a$a> r0 = r8.n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.util.Stack<b.a.a.a.k0.r.a$a> r0 = r8.n
            java.lang.Object r0 = r0.peek()
            b.a.a.a.k0.r.a$a r0 = (b.a.a.a.k0.r.a.C0022a) r0
            long r4 = r0.P0
        L_0x0069:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            long r6 = r9.k()
            long r4 = r4 - r6
            int r0 = r8.t
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0044
        L_0x0077:
            long r4 = r8.s
            int r0 = r8.t
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0145
            long r4 = r9.k()
            int r0 = r8.t
            long r6 = (long) r0
            long r4 = r4 - r6
            int r0 = r8.r
            int r6 = b.a.a.a.k0.r.a.L
            if (r0 != r6) goto L_0x00aa
            android.util.SparseArray<b.a.a.a.k0.r.e$b> r0 = r8.e
            int r0 = r0.size()
            r6 = 0
        L_0x0095:
            if (r6 >= r0) goto L_0x00aa
            android.util.SparseArray<b.a.a.a.k0.r.e$b> r7 = r8.e
            java.lang.Object r7 = r7.valueAt(r6)
            b.a.a.a.k0.r.e$b r7 = (b.a.a.a.k0.r.e.b) r7
            b.a.a.a.k0.r.l r7 = r7.f380a
            r7.f395b = r4
            r7.d = r4
            r7.c = r4
            int r6 = r6 + 1
            goto L_0x0095
        L_0x00aa:
            int r0 = r8.r
            int r6 = b.a.a.a.k0.r.a.i
            r7 = 0
            if (r0 != r6) goto L_0x00ce
            r8.z = r7
            long r0 = r8.s
            long r0 = r0 + r4
            r8.v = r0
            boolean r9 = r8.H
            if (r9 != 0) goto L_0x00ca
            b.a.a.a.k0.g r9 = r8.E
            b.a.a.a.k0.l$b r0 = new b.a.a.a.k0.l$b
            long r1 = r8.x
            r0.<init>(r1, r4)
            r9.c(r0)
            r8.H = r3
        L_0x00ca:
            r9 = 2
            r8.q = r9
            return r3
        L_0x00ce:
            boolean r0 = K(r0)
            if (r0 == 0) goto L_0x00fb
            long r0 = r9.k()
            long r4 = r8.s
            long r0 = r0 + r4
            r4 = 8
            long r0 = r0 - r4
            java.util.Stack<b.a.a.a.k0.r.a$a> r9 = r8.n
            b.a.a.a.k0.r.a$a r2 = new b.a.a.a.k0.r.a$a
            int r4 = r8.r
            r2.<init>(r4, r0)
            r9.add(r2)
            long r4 = r8.s
            int r9 = r8.t
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00f7
            r8.F(r0)
            goto L_0x013c
        L_0x00f7:
            r8.c()
            goto L_0x013c
        L_0x00fb:
            int r9 = r8.r
            boolean r9 = L(r9)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r9 == 0) goto L_0x0132
            int r9 = r8.t
            if (r9 != r1) goto L_0x012a
            long r6 = r8.s
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0122
            b.a.a.a.r0.m r9 = new b.a.a.a.r0.m
            int r0 = (int) r6
            r9.<init>((int) r0)
            r8.u = r9
            b.a.a.a.r0.m r0 = r8.l
            byte[] r0 = r0.f734a
            byte[] r9 = r9.f734a
            java.lang.System.arraycopy(r0, r2, r9, r2, r1)
            goto L_0x013a
        L_0x0122:
            b.a.a.a.u r9 = new b.a.a.a.u
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            r9.<init>(r0)
            throw r9
        L_0x012a:
            b.a.a.a.u r9 = new b.a.a.a.u
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            r9.<init>(r0)
            throw r9
        L_0x0132:
            long r0 = r8.s
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x013d
            r8.u = r7
        L_0x013a:
            r8.q = r3
        L_0x013c:
            return r3
        L_0x013d:
            b.a.a.a.u r9 = new b.a.a.a.u
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            r9.<init>(r0)
            throw r9
        L_0x0145:
            b.a.a.a.u r9 = new b.a.a.a.u
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            r9.<init>(r0)
            goto L_0x014e
        L_0x014d:
            throw r9
        L_0x014e:
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.r.e.G(b.a.a.a.k0.f):boolean");
    }

    private void H(f fVar) {
        int i2 = ((int) this.s) - this.t;
        m mVar = this.u;
        if (mVar != null) {
            fVar.i(mVar.f734a, 8, i2);
            m(new a.b(this.r, this.u), fVar.k());
        } else {
            fVar.c(i2);
        }
        F(fVar.k());
    }

    private void I(f fVar) {
        int size = this.e.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            l lVar = this.e.valueAt(i2).f380a;
            if (lVar.r) {
                long j3 = lVar.d;
                if (j3 < j2) {
                    bVar = this.e.valueAt(i2);
                    j2 = j3;
                }
            }
        }
        if (bVar == null) {
            this.q = 3;
            return;
        }
        int k2 = (int) (j2 - fVar.k());
        if (k2 >= 0) {
            fVar.c(k2);
            bVar.f380a.a(fVar);
            return;
        }
        throw new b.a.a.a.u("Offset to encryption data was negative.");
    }

    private boolean J(f fVar) {
        n.a aVar;
        boolean z2;
        int i2;
        f fVar2 = fVar;
        int i3 = 4;
        int i4 = 1;
        int i5 = 0;
        if (this.q == 3) {
            if (this.z == null) {
                b i6 = i(this.e);
                if (i6 == null) {
                    int k2 = (int) (this.v - fVar.k());
                    if (k2 >= 0) {
                        fVar2.c(k2);
                        c();
                        return false;
                    }
                    throw new b.a.a.a.u("Offset to end of mdat was negative.");
                }
                int k3 = (int) (i6.f380a.g[i6.g] - fVar.k());
                if (k3 < 0) {
                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    k3 = 0;
                }
                fVar2.c(k3);
                this.z = i6;
            }
            b bVar = this.z;
            l lVar = bVar.f380a;
            this.A = lVar.i[bVar.e];
            if (lVar.m) {
                int b2 = b(bVar);
                this.B = b2;
                this.A += b2;
            } else {
                this.B = 0;
            }
            if (this.z.c.g == 1) {
                this.A -= 8;
                fVar2.c(8);
            }
            this.q = 4;
            this.C = 0;
        }
        b bVar2 = this.z;
        l lVar2 = bVar2.f380a;
        j jVar = bVar2.c;
        b.a.a.a.k0.n nVar = bVar2.f381b;
        int i7 = bVar2.e;
        int i8 = jVar.j;
        if (i8 == 0) {
            while (true) {
                int i9 = this.B;
                int i10 = this.A;
                if (i9 >= i10) {
                    break;
                }
                this.B += nVar.b(fVar2, i10 - i9, false);
            }
        } else {
            byte[] bArr = this.g.f734a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i11 = i8 + 1;
            int i12 = 4 - i8;
            while (this.B < this.A) {
                int i13 = this.C;
                if (i13 == 0) {
                    fVar2.i(bArr, i12, i11);
                    this.g.J(i5);
                    this.C = this.g.B() - i4;
                    this.f.J(i5);
                    nVar.a(this.f, i3);
                    nVar.a(this.g, i4);
                    this.D = this.G.length > 0 && k.g(jVar.f.f, bArr[i3]);
                    this.B += 5;
                    this.A += i12;
                } else {
                    if (this.D) {
                        this.h.G(i13);
                        fVar2.i(this.h.f734a, i5, this.C);
                        nVar.a(this.h, this.C);
                        i2 = this.C;
                        m mVar = this.h;
                        int k4 = k.k(mVar.f734a, mVar.d());
                        this.h.J("video/hevc".equals(jVar.f.f) ? 1 : 0);
                        this.h.I(k4);
                        b.a.a.a.o0.m.f.a(lVar2.c(i7) * 1000, this.h, this.G);
                    } else {
                        i2 = nVar.b(fVar2, i13, false);
                    }
                    this.B += i2;
                    this.C -= i2;
                    i3 = 4;
                    i4 = 1;
                    i5 = 0;
                }
            }
        }
        long c2 = lVar2.c(i7) * 1000;
        u uVar = this.k;
        if (uVar != null) {
            c2 = uVar.a(c2);
        }
        boolean z3 = lVar2.l[i7];
        if (lVar2.m) {
            boolean z4 = z3 | true;
            k kVar = lVar2.o;
            if (kVar == null) {
                kVar = jVar.a(lVar2.f394a.f372a);
            }
            z2 = z4;
            aVar = kVar.f393b;
        } else {
            z2 = z3;
            aVar = null;
        }
        nVar.d(c2, z2 ? 1 : 0, this.A, 0, aVar);
        p(c2);
        b bVar3 = this.z;
        bVar3.e++;
        int i14 = bVar3.f + 1;
        bVar3.f = i14;
        int[] iArr = lVar2.h;
        int i15 = bVar3.g;
        if (i14 == iArr[i15]) {
            bVar3.g = i15 + 1;
            bVar3.f = 0;
            this.z = null;
        }
        this.q = 3;
        return true;
    }

    private static boolean K(int i2) {
        return i2 == a.C || i2 == a.E || i2 == a.F || i2 == a.G || i2 == a.H || i2 == a.L || i2 == a.M || i2 == a.N || i2 == a.Q;
    }

    private static boolean L(int i2) {
        return i2 == a.T || i2 == a.S || i2 == a.D || i2 == a.B || i2 == a.U || i2 == a.x || i2 == a.y || i2 == a.P || i2 == a.z || i2 == a.A || i2 == a.V || i2 == a.d0 || i2 == a.e0 || i2 == a.i0 || i2 == a.h0 || i2 == a.f0 || i2 == a.g0 || i2 == a.R || i2 == a.O || i2 == a.G0;
    }

    private int b(b bVar) {
        m mVar;
        l lVar = bVar.f380a;
        int i2 = lVar.f394a.f372a;
        k kVar = lVar.o;
        if (kVar == null) {
            kVar = bVar.c.a(i2);
        }
        int i3 = kVar.c;
        if (i3 != 0) {
            mVar = lVar.q;
        } else {
            byte[] bArr = kVar.d;
            this.j.H(bArr, bArr.length);
            mVar = this.j;
            i3 = bArr.length;
        }
        boolean z2 = lVar.n[bVar.e];
        m mVar2 = this.i;
        mVar2.f734a[0] = (byte) ((z2 ? 128 : 0) | i3);
        mVar2.J(0);
        b.a.a.a.k0.n nVar = bVar.f381b;
        nVar.a(this.i, 1);
        nVar.a(mVar, i3);
        if (!z2) {
            return i3 + 1;
        }
        m mVar3 = lVar.q;
        int D2 = mVar3.D();
        mVar3.K(-2);
        int i4 = (D2 * 6) + 2;
        nVar.a(mVar3, i4);
        return i3 + 1 + i4;
    }

    private void c() {
        this.q = 0;
        this.t = 0;
    }

    private static b.a.a.a.j0.a e(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            a.b bVar = list.get(i2);
            if (bVar.f359a == a.V) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.P0.f734a;
                UUID b2 = h.b(bArr);
                if (b2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new a.b(b2, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new b.a.a.a.j0.a((List<a.b>) arrayList);
    }

    private static b i(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            b valueAt = sparseArray.valueAt(i2);
            int i3 = valueAt.g;
            l lVar = valueAt.f380a;
            if (i3 != lVar.e) {
                long j3 = lVar.g[i3];
                if (j3 < j2) {
                    bVar = valueAt;
                    j2 = j3;
                }
            }
        }
        return bVar;
    }

    private void j() {
        int i2;
        if (this.F == null) {
            b.a.a.a.k0.n[] nVarArr = new b.a.a.a.k0.n[2];
            this.F = nVarArr;
            b.a.a.a.k0.n nVar = this.p;
            if (nVar != null) {
                nVarArr[0] = nVar;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.f376a & 4) != 0) {
                nVarArr[i2] = this.E.f(this.e.size(), 4);
                i2++;
            }
            b.a.a.a.k0.n[] nVarArr2 = (b.a.a.a.k0.n[]) Arrays.copyOf(this.F, i2);
            this.F = nVarArr2;
            for (b.a.a.a.k0.n c2 : nVarArr2) {
                c2.c(K);
            }
        }
        if (this.G == null) {
            this.G = new b.a.a.a.k0.n[this.c.size()];
            for (int i3 = 0; i3 < this.G.length; i3++) {
                b.a.a.a.k0.n f2 = this.E.f(this.e.size() + 1 + i3, 3);
                f2.c(this.c.get(i3));
                this.G[i3] = f2;
            }
        }
    }

    private void k(a.C0022a aVar) {
        int i2 = aVar.f359a;
        if (i2 == a.C) {
            o(aVar);
        } else if (i2 == a.L) {
            n(aVar);
        } else if (!this.n.isEmpty()) {
            this.n.peek().d(aVar);
        }
    }

    private void l(m mVar) {
        b.a.a.a.k0.n[] nVarArr = this.F;
        if (nVarArr != null && nVarArr.length != 0) {
            mVar.J(12);
            int a2 = mVar.a();
            mVar.r();
            mVar.r();
            long C2 = w.C(mVar.z(), 1000000, mVar.z());
            for (b.a.a.a.k0.n a3 : this.F) {
                mVar.J(12);
                a3.a(mVar, a2);
            }
            if (this.y != -9223372036854775807L) {
                for (b.a.a.a.k0.n d2 : this.F) {
                    d2.d(this.y + C2, 1, a2, 0, (n.a) null);
                }
                return;
            }
            this.o.addLast(new a(C2, a2));
            this.w += a2;
        }
    }

    private void m(a.b bVar, long j2) {
        if (!this.n.isEmpty()) {
            this.n.peek().e(bVar);
            return;
        }
        int i2 = bVar.f359a;
        if (i2 == a.B) {
            Pair<Long, b.a.a.a.k0.a> x2 = x(bVar.P0, j2);
            this.y = ((Long) x2.first).longValue();
            this.E.c((l) x2.second);
            this.H = true;
        } else if (i2 == a.G0) {
            l(bVar.P0);
        }
    }

    private void n(a.C0022a aVar) {
        r(aVar, this.e, this.f376a, this.m);
        b.a.a.a.j0.a e2 = this.d != null ? null : e(aVar.Q0);
        if (e2 != null) {
            int size = this.e.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.e.valueAt(i2).c(e2);
            }
        }
    }

    private void o(a.C0022a aVar) {
        int i2;
        int i3;
        a.C0022a aVar2 = aVar;
        boolean z2 = true;
        int i4 = 0;
        b.a.a.a.r0.a.g(this.f377b == null, "Unexpected moov box.");
        b.a.a.a.j0.a aVar3 = this.d;
        if (aVar3 == null) {
            aVar3 = e(aVar2.Q0);
        }
        a.C0022a f2 = aVar2.f(a.N);
        SparseArray sparseArray = new SparseArray();
        int size = f2.Q0.size();
        long j2 = -9223372036854775807L;
        for (int i5 = 0; i5 < size; i5++) {
            a.b bVar = f2.Q0.get(i5);
            int i6 = bVar.f359a;
            if (i6 == a.z) {
                Pair<Integer, c> B2 = B(bVar.P0);
                sparseArray.put(((Integer) B2.first).intValue(), B2.second);
            } else if (i6 == a.O) {
                j2 = q(bVar.P0);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.R0.size();
        int i7 = 0;
        while (i7 < size2) {
            a.C0022a aVar4 = aVar2.R0.get(i7);
            if (aVar4.f359a == a.E) {
                i2 = i7;
                i3 = size2;
                j t2 = b.t(aVar4, aVar2.g(a.D), j2, aVar3, (this.f376a & 16) != 0, false);
                if (t2 != null) {
                    sparseArray2.put(t2.f390a, t2);
                }
            } else {
                i2 = i7;
                i3 = size2;
            }
            i7 = i2 + 1;
            size2 = i3;
        }
        int size3 = sparseArray2.size();
        if (this.e.size() == 0) {
            while (i4 < size3) {
                j jVar = (j) sparseArray2.valueAt(i4);
                b bVar2 = new b(this.E.f(i4, jVar.f391b));
                bVar2.a(jVar, (c) sparseArray.get(jVar.f390a));
                this.e.put(jVar.f390a, bVar2);
                this.x = Math.max(this.x, jVar.e);
                i4++;
            }
            j();
            this.E.d();
            return;
        }
        if (this.e.size() != size3) {
            z2 = false;
        }
        b.a.a.a.r0.a.f(z2);
        while (i4 < size3) {
            j jVar2 = (j) sparseArray2.valueAt(i4);
            this.e.get(jVar2.f390a).a(jVar2, (c) sparseArray.get(jVar2.f390a));
            i4++;
        }
    }

    private void p(long j2) {
        while (!this.o.isEmpty()) {
            a removeFirst = this.o.removeFirst();
            this.w -= removeFirst.f379b;
            for (b.a.a.a.k0.n d2 : this.F) {
                d2.d(removeFirst.f378a + j2, 1, removeFirst.f379b, this.w, (n.a) null);
            }
        }
    }

    private static long q(m mVar) {
        mVar.J(8);
        return a.c(mVar.i()) == 0 ? mVar.z() : mVar.C();
    }

    private static void r(a.C0022a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) {
        int size = aVar.R0.size();
        for (int i3 = 0; i3 < size; i3++) {
            a.C0022a aVar2 = aVar.R0.get(i3);
            if (aVar2.f359a == a.M) {
                A(aVar2, sparseArray, i2, bArr);
            }
        }
    }

    private static void s(m mVar, l lVar) {
        mVar.J(8);
        int i2 = mVar.i();
        if ((a.b(i2) & 1) == 1) {
            mVar.K(8);
        }
        int B2 = mVar.B();
        if (B2 == 1) {
            lVar.d += a.c(i2) == 0 ? mVar.z() : mVar.C();
            return;
        }
        throw new b.a.a.a.u("Unexpected saio entry count: " + B2);
    }

    private static void t(k kVar, m mVar, l lVar) {
        int i2;
        int i3 = kVar.c;
        mVar.J(8);
        boolean z2 = true;
        if ((a.b(mVar.i()) & 1) == 1) {
            mVar.K(8);
        }
        int x2 = mVar.x();
        int B2 = mVar.B();
        if (B2 == lVar.f) {
            if (x2 == 0) {
                boolean[] zArr = lVar.n;
                i2 = 0;
                for (int i4 = 0; i4 < B2; i4++) {
                    int x3 = mVar.x();
                    i2 += x3;
                    zArr[i4] = x3 > i3;
                }
            } else {
                if (x2 <= i3) {
                    z2 = false;
                }
                i2 = (x2 * B2) + 0;
                Arrays.fill(lVar.n, 0, B2, z2);
            }
            lVar.d(i2);
            return;
        }
        throw new b.a.a.a.u("Length mismatch: " + B2 + ", " + lVar.f);
    }

    private static void u(m mVar, int i2, l lVar) {
        mVar.J(i2 + 8);
        int b2 = a.b(mVar.i());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int B2 = mVar.B();
            if (B2 == lVar.f) {
                Arrays.fill(lVar.n, 0, B2, z2);
                lVar.d(mVar.a());
                lVar.b(mVar);
                return;
            }
            throw new b.a.a.a.u("Length mismatch: " + B2 + ", " + lVar.f);
        }
        throw new b.a.a.a.u("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void v(m mVar, l lVar) {
        u(mVar, 0, lVar);
    }

    private static void w(m mVar, m mVar2, String str, l lVar) {
        byte[] bArr;
        m mVar3 = mVar;
        m mVar4 = mVar2;
        l lVar2 = lVar;
        mVar3.J(8);
        int i2 = mVar.i();
        int i3 = mVar.i();
        int i4 = I;
        if (i3 == i4) {
            if (a.c(i2) == 1) {
                mVar3.K(4);
            }
            if (mVar.i() == 1) {
                mVar4.J(8);
                int i5 = mVar2.i();
                if (mVar2.i() == i4) {
                    int c2 = a.c(i5);
                    if (c2 == 1) {
                        if (mVar2.z() == 0) {
                            throw new b.a.a.a.u("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (c2 >= 2) {
                        mVar4.K(4);
                    }
                    if (mVar2.z() == 1) {
                        mVar4.K(1);
                        int x2 = mVar2.x();
                        int i6 = (x2 & 240) >> 4;
                        int i7 = x2 & 15;
                        boolean z2 = mVar2.x() == 1;
                        if (z2) {
                            int x3 = mVar2.x();
                            byte[] bArr2 = new byte[16];
                            mVar4.g(bArr2, 0, 16);
                            if (!z2 || x3 != 0) {
                                bArr = null;
                            } else {
                                int x4 = mVar2.x();
                                byte[] bArr3 = new byte[x4];
                                mVar4.g(bArr3, 0, x4);
                                bArr = bArr3;
                            }
                            lVar2.m = true;
                            lVar2.o = new k(z2, str, x3, bArr2, i6, i7, bArr);
                            return;
                        }
                        return;
                    }
                    throw new b.a.a.a.u("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new b.a.a.a.u("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static Pair<Long, b.a.a.a.k0.a> x(m mVar, long j2) {
        long j3;
        long j4;
        m mVar2 = mVar;
        mVar2.J(8);
        int c2 = a.c(mVar.i());
        mVar2.K(4);
        long z2 = mVar.z();
        if (c2 == 0) {
            j4 = mVar.z();
            j3 = mVar.z();
        } else {
            j4 = mVar.C();
            j3 = mVar.C();
        }
        long j5 = j4;
        long j6 = j2 + j3;
        long C2 = w.C(j5, 1000000, z2);
        mVar2.K(2);
        int D2 = mVar.D();
        int[] iArr = new int[D2];
        long[] jArr = new long[D2];
        long[] jArr2 = new long[D2];
        long[] jArr3 = new long[D2];
        long j7 = j5;
        long j8 = C2;
        int i2 = 0;
        while (i2 < D2) {
            int i3 = mVar.i();
            if ((i3 & Integer.MIN_VALUE) == 0) {
                long z3 = mVar.z();
                iArr[i2] = i3 & Integer.MAX_VALUE;
                jArr[i2] = j6;
                jArr3[i2] = j8;
                long j9 = j7 + z3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i4 = D2;
                int[] iArr2 = iArr;
                long C3 = w.C(j9, 1000000, z2);
                jArr4[i2] = C3 - jArr5[i2];
                mVar2.K(4);
                j6 += (long) iArr2[i2];
                i2++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                D2 = i4;
                long j10 = C3;
                j7 = j9;
                j8 = j10;
            } else {
                throw new b.a.a.a.u("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(C2), new b.a.a.a.k0.a(iArr, jArr, jArr2, jArr3));
    }

    private static long y(m mVar) {
        mVar.J(8);
        return a.c(mVar.i()) == 1 ? mVar.C() : mVar.z();
    }

    private static b z(m mVar, SparseArray<b> sparseArray, int i2) {
        mVar.J(8);
        int b2 = a.b(mVar.i());
        int i3 = mVar.i();
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        b bVar = sparseArray.get(i3);
        if (bVar == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long C2 = mVar.C();
            l lVar = bVar.f380a;
            lVar.c = C2;
            lVar.d = C2;
        }
        c cVar = bVar.d;
        bVar.f380a.f394a = new c((b2 & 2) != 0 ? mVar.B() - 1 : cVar.f372a, (b2 & 8) != 0 ? mVar.B() : cVar.f373b, (b2 & 16) != 0 ? mVar.B() : cVar.c, (b2 & 32) != 0 ? mVar.B() : cVar.d);
        return bVar;
    }

    public void a() {
    }

    public void d(g gVar) {
        this.E = gVar;
        j jVar = this.f377b;
        if (jVar != null) {
            b bVar = new b(gVar.f(0, jVar.f391b));
            bVar.a(this.f377b, new c(0, 0, 0, 0));
            this.e.put(0, bVar);
            j();
            this.E.d();
        }
    }

    public void f(long j2, long j3) {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.e.valueAt(i2).b();
        }
        this.o.clear();
        this.w = 0;
        this.n.clear();
        c();
    }

    public int g(f fVar, b.a.a.a.k0.k kVar) {
        while (true) {
            int i2 = this.q;
            if (i2 != 0) {
                if (i2 == 1) {
                    H(fVar);
                } else if (i2 == 2) {
                    I(fVar);
                } else if (J(fVar)) {
                    return 0;
                }
            } else if (!G(fVar)) {
                return -1;
            }
        }
    }

    public boolean h(f fVar) {
        return i.b(fVar);
    }
}
