package b.a.a.a.k0.r;

import android.util.Log;
import android.util.Pair;
import b.a.a.a.k0.i;
import b.a.a.a.k0.r.a;
import b.a.a.a.k0.r.d;
import b.a.a.a.m0.a;
import b.a.a.a.n;
import b.a.a.a.r0.j;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import b.a.a.a.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f360a = w.o("vide");

    /* renamed from: b  reason: collision with root package name */
    private static final int f361b = w.o("soun");
    private static final int c = w.o("text");
    private static final int d = w.o("sbtl");
    private static final int e = w.o("subt");
    private static final int f = w.o("clcp");
    private static final int g = w.o("meta");

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f362a;

        /* renamed from: b  reason: collision with root package name */
        public int f363b;
        public int c;
        public long d;
        private final boolean e;
        private final m f;
        private final m g;
        private int h;
        private int i;

        public a(m mVar, m mVar2, boolean z) {
            this.g = mVar;
            this.f = mVar2;
            this.e = z;
            mVar2.J(12);
            this.f362a = mVar2.B();
            mVar.J(12);
            this.i = mVar.B();
            b.a.a.a.r0.a.g(mVar.i() != 1 ? false : true, "first_chunk must be 1");
            this.f363b = -1;
        }

        public boolean a() {
            int i2 = this.f363b + 1;
            this.f363b = i2;
            if (i2 == this.f362a) {
                return false;
            }
            this.d = this.e ? this.f.C() : this.f.z();
            if (this.f363b == this.h) {
                this.c = this.g.B();
                this.g.K(4);
                int i3 = this.i - 1;
                this.i = i3;
                this.h = i3 > 0 ? this.g.B() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: b.a.a.a.k0.r.b$b  reason: collision with other inner class name */
    private interface C0023b {
        int a();

        int b();

        boolean c();
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k[] f364a;

        /* renamed from: b  reason: collision with root package name */
        public n f365b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.f364a = new k[i];
        }
    }

    static final class d implements C0023b {

        /* renamed from: a  reason: collision with root package name */
        private final int f366a;

        /* renamed from: b  reason: collision with root package name */
        private final int f367b;
        private final m c;

        public d(a.b bVar) {
            m mVar = bVar.P0;
            this.c = mVar;
            mVar.J(12);
            this.f366a = mVar.B();
            this.f367b = mVar.B();
        }

        public int a() {
            return this.f367b;
        }

        public int b() {
            int i = this.f366a;
            return i == 0 ? this.c.B() : i;
        }

        public boolean c() {
            return this.f366a != 0;
        }
    }

    static final class e implements C0023b {

        /* renamed from: a  reason: collision with root package name */
        private final m f368a;

        /* renamed from: b  reason: collision with root package name */
        private final int f369b;
        private final int c;
        private int d;
        private int e;

        public e(a.b bVar) {
            m mVar = bVar.P0;
            this.f368a = mVar;
            mVar.J(12);
            this.c = mVar.B() & 255;
            this.f369b = mVar.B();
        }

        public int a() {
            return this.f369b;
        }

        public int b() {
            int i = this.c;
            if (i == 8) {
                return this.f368a.x();
            }
            if (i == 16) {
                return this.f368a.D();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int x = this.f368a.x();
            this.e = x;
            return (x & 240) >> 4;
        }

        public boolean c() {
            return false;
        }
    }

    private static final class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f370a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f371b;
        /* access modifiers changed from: private */
        public final int c;

        public f(int i, long j, int i2) {
            this.f370a = i;
            this.f371b = j;
            this.c = i2;
        }
    }

    private static int a(m mVar, int i, int i2) {
        int c2 = mVar.c();
        while (c2 - i < i2) {
            mVar.J(c2);
            int i3 = mVar.i();
            b.a.a.a.r0.a.b(i3 > 0, "childAtomSize should be positive");
            if (mVar.i() == a.K) {
                return c2;
            }
            c2 += i3;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01f6: MOVE  (r8v4 java.lang.String) = (r25v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    private static void b(b.a.a.a.r0.m r28, int r29, int r30, int r31, int r32, java.lang.String r33, boolean r34, b.a.a.a.j0.a r35, b.a.a.a.k0.r.b.c r36, int r37) {
        /*
            r0 = r28
            r1 = r30
            r2 = r31
            r14 = r33
            r3 = r35
            r15 = r36
            int r4 = r1 + 8
            r5 = 8
            int r4 = r4 + r5
            r0.J(r4)
            r4 = 6
            r13 = 0
            if (r34 == 0) goto L_0x0020
            int r5 = r28.D()
            r0.K(r4)
            goto L_0x0024
        L_0x0020:
            r0.K(r5)
            r5 = 0
        L_0x0024:
            r12 = 2
            r6 = 16
            r11 = 1
            if (r5 == 0) goto L_0x0046
            if (r5 != r11) goto L_0x002d
            goto L_0x0046
        L_0x002d:
            if (r5 != r12) goto L_0x0045
            r0.K(r6)
            double r4 = r28.h()
            long r4 = java.lang.Math.round(r4)
            int r5 = (int) r4
            int r4 = r28.B()
            r6 = 20
            r0.K(r6)
            goto L_0x0058
        L_0x0045:
            return
        L_0x0046:
            int r7 = r28.D()
            r0.K(r4)
            int r4 = r28.y()
            if (r5 != r11) goto L_0x0056
            r0.K(r6)
        L_0x0056:
            r5 = r4
            r4 = r7
        L_0x0058:
            int r6 = r28.c()
            int r7 = b.a.a.a.k0.r.a.b0
            r16 = 0
            r8 = r29
            if (r8 != r7) goto L_0x008c
            android.util.Pair r7 = n(r0, r1, r2)
            if (r7 == 0) goto L_0x0089
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r3 != 0) goto L_0x0077
            r3 = r16
            goto L_0x0081
        L_0x0077:
            java.lang.Object r9 = r7.second
            b.a.a.a.k0.r.k r9 = (b.a.a.a.k0.r.k) r9
            java.lang.String r9 = r9.f392a
            b.a.a.a.j0.a r3 = r3.b(r9)
        L_0x0081:
            b.a.a.a.k0.r.k[] r9 = r15.f364a
            java.lang.Object r7 = r7.second
            b.a.a.a.k0.r.k r7 = (b.a.a.a.k0.r.k) r7
            r9[r37] = r7
        L_0x0089:
            r0.J(r6)
        L_0x008c:
            r10 = r3
            int r3 = b.a.a.a.k0.r.a.o
            java.lang.String r9 = "audio/raw"
            if (r8 != r3) goto L_0x0096
            java.lang.String r3 = "audio/ac3"
            goto L_0x00e0
        L_0x0096:
            int r3 = b.a.a.a.k0.r.a.q
            if (r8 != r3) goto L_0x009d
            java.lang.String r3 = "audio/eac3"
            goto L_0x00e0
        L_0x009d:
            int r3 = b.a.a.a.k0.r.a.s
            if (r8 != r3) goto L_0x00a4
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x00e0
        L_0x00a4:
            int r3 = b.a.a.a.k0.r.a.t
            if (r8 == r3) goto L_0x00de
            int r3 = b.a.a.a.k0.r.a.u
            if (r8 != r3) goto L_0x00ad
            goto L_0x00de
        L_0x00ad:
            int r3 = b.a.a.a.k0.r.a.v
            if (r8 != r3) goto L_0x00b4
            java.lang.String r3 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00e0
        L_0x00b4:
            int r3 = b.a.a.a.k0.r.a.y0
            if (r8 != r3) goto L_0x00bb
            java.lang.String r3 = "audio/3gpp"
            goto L_0x00e0
        L_0x00bb:
            int r3 = b.a.a.a.k0.r.a.z0
            if (r8 != r3) goto L_0x00c2
            java.lang.String r3 = "audio/amr-wb"
            goto L_0x00e0
        L_0x00c2:
            int r3 = b.a.a.a.k0.r.a.m
            if (r8 == r3) goto L_0x00dc
            int r3 = b.a.a.a.k0.r.a.n
            if (r8 != r3) goto L_0x00cb
            goto L_0x00dc
        L_0x00cb:
            int r3 = b.a.a.a.k0.r.a.k
            if (r8 != r3) goto L_0x00d2
            java.lang.String r3 = "audio/mpeg"
            goto L_0x00e0
        L_0x00d2:
            int r3 = b.a.a.a.k0.r.a.O0
            if (r8 != r3) goto L_0x00d9
            java.lang.String r3 = "audio/alac"
            goto L_0x00e0
        L_0x00d9:
            r3 = r16
            goto L_0x00e0
        L_0x00dc:
            r3 = r9
            goto L_0x00e0
        L_0x00de:
            java.lang.String r3 = "audio/vnd.dts.hd"
        L_0x00e0:
            r8 = r3
            r17 = r4
            r18 = r5
            r7 = r6
            r19 = r16
        L_0x00e8:
            int r3 = r7 - r1
            r4 = -1
            if (r3 >= r2) goto L_0x01ea
            r0.J(r7)
            int r6 = r28.i()
            if (r6 <= 0) goto L_0x00f8
            r3 = 1
            goto L_0x00f9
        L_0x00f8:
            r3 = 0
        L_0x00f9:
            java.lang.String r5 = "childAtomSize should be positive"
            b.a.a.a.r0.a.b(r3, r5)
            int r3 = r28.i()
            int r5 = b.a.a.a.k0.r.a.K
            if (r3 == r5) goto L_0x019e
            if (r34 == 0) goto L_0x010e
            int r11 = b.a.a.a.k0.r.a.l
            if (r3 != r11) goto L_0x010e
            goto L_0x019e
        L_0x010e:
            int r4 = b.a.a.a.k0.r.a.p
            if (r3 != r4) goto L_0x012e
            int r3 = r7 + 8
            r0.J(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            b.a.a.a.n r3 = b.a.a.a.h0.a.c(r0, r3, r14, r10)
        L_0x011f:
            r15.f365b = r3
            r25 = r8
            r26 = r9
            r21 = r10
            r1 = 0
            r20 = 1
            r22 = 2
            goto L_0x019b
        L_0x012e:
            int r4 = b.a.a.a.k0.r.a.r
            if (r3 != r4) goto L_0x0140
            int r3 = r7 + 8
            r0.J(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            b.a.a.a.n r3 = b.a.a.a.h0.a.f(r0, r3, r14, r10)
            goto L_0x011f
        L_0x0140:
            int r4 = b.a.a.a.k0.r.a.w
            if (r3 != r4) goto L_0x0179
            java.lang.String r3 = java.lang.Integer.toString(r32)
            r5 = 0
            r11 = -1
            r21 = -1
            r22 = 0
            r23 = 0
            r4 = r8
            r24 = r6
            r6 = r11
            r11 = r7
            r7 = r21
            r25 = r8
            r8 = r17
            r26 = r9
            r9 = r18
            r21 = r10
            r10 = r22
            r27 = r11
            r20 = 1
            r11 = r21
            r22 = 2
            r12 = r23
            r1 = 0
            r13 = r33
            b.a.a.a.n r3 = b.a.a.a.n.h(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.f365b = r3
            r6 = r24
            goto L_0x0199
        L_0x0179:
            r24 = r6
            r27 = r7
            r25 = r8
            r26 = r9
            r21 = r10
            r1 = 0
            r20 = 1
            r22 = 2
            int r4 = b.a.a.a.k0.r.a.O0
            if (r3 != r4) goto L_0x0199
            byte[] r3 = new byte[r6]
            r7 = r27
            r0.J(r7)
            r0.g(r3, r1, r6)
            r19 = r3
            goto L_0x019b
        L_0x0199:
            r7 = r27
        L_0x019b:
            r8 = r25
            goto L_0x01de
        L_0x019e:
            r25 = r8
            r26 = r9
            r21 = r10
            r1 = 0
            r20 = 1
            r22 = 2
            if (r3 != r5) goto L_0x01ad
            r3 = r7
            goto L_0x01b1
        L_0x01ad:
            int r3 = a(r0, r7, r6)
        L_0x01b1:
            if (r3 == r4) goto L_0x019b
            android.util.Pair r3 = e(r0, r3)
            java.lang.Object r4 = r3.first
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r3.second
            r19 = r3
            byte[] r19 = (byte[]) r19
            java.lang.String r3 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x01de
            android.util.Pair r3 = b.a.a.a.r0.c.f(r19)
            java.lang.Object r4 = r3.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r18 = r4.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r17 = r3.intValue()
        L_0x01de:
            int r7 = r7 + r6
            r1 = r30
            r10 = r21
            r9 = r26
            r11 = 1
            r12 = 2
            r13 = 0
            goto L_0x00e8
        L_0x01ea:
            r25 = r8
            r26 = r9
            r21 = r10
            r22 = 2
            b.a.a.a.n r0 = r15.f365b
            if (r0 != 0) goto L_0x0227
            r8 = r25
            if (r8 == 0) goto L_0x0227
            r0 = r26
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0204
            r7 = 2
            goto L_0x0205
        L_0x0204:
            r7 = -1
        L_0x0205:
            java.lang.String r0 = java.lang.Integer.toString(r32)
            r2 = 0
            r3 = -1
            r4 = -1
            if (r19 != 0) goto L_0x020f
            goto L_0x0215
        L_0x020f:
            java.util.List r1 = java.util.Collections.singletonList(r19)
            r16 = r1
        L_0x0215:
            r10 = 0
            r1 = r8
            r5 = r17
            r6 = r18
            r8 = r16
            r9 = r21
            r11 = r33
            b.a.a.a.n r0 = b.a.a.a.n.g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.f365b = r0
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.r.b.b(b.a.a.a.r0.m, int, int, int, int, java.lang.String, boolean, b.a.a.a.j0.a, b.a.a.a.k0.r.b$c, int):void");
    }

    static Pair<Integer, k> c(m mVar, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            mVar.J(i3);
            int i6 = mVar.i();
            int i7 = mVar.i();
            if (i7 == a.c0) {
                num = Integer.valueOf(mVar.i());
            } else if (i7 == a.X) {
                mVar.K(4);
                str = mVar.u(4);
            } else if (i7 == a.Y) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        b.a.a.a.r0.a.b(num != null, "frma atom is mandatory");
        b.a.a.a.r0.a.b(i4 != -1, "schi atom is mandatory");
        k o = o(mVar, i4, i5, str);
        if (o != null) {
            z = true;
        }
        b.a.a.a.r0.a.b(z, "tenc atom is mandatory");
        return Pair.create(num, o);
    }

    private static Pair<long[], long[]> d(a.C0022a aVar) {
        a.b g2;
        if (aVar == null || (g2 = aVar.g(a.R)) == null) {
            return Pair.create((Object) null, (Object) null);
        }
        m mVar = g2.P0;
        mVar.J(8);
        int c2 = a.c(mVar.i());
        int B = mVar.B();
        long[] jArr = new long[B];
        long[] jArr2 = new long[B];
        int i = 0;
        while (i < B) {
            jArr[i] = c2 == 1 ? mVar.C() : mVar.z();
            jArr2[i] = c2 == 1 ? mVar.q() : (long) mVar.i();
            if (mVar.t() == 1) {
                mVar.K(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> e(m mVar, int i) {
        mVar.J(i + 8 + 4);
        mVar.K(1);
        f(mVar);
        mVar.K(2);
        int x = mVar.x();
        if ((x & 128) != 0) {
            mVar.K(2);
        }
        if ((x & 64) != 0) {
            mVar.K(mVar.D());
        }
        if ((x & 32) != 0) {
            mVar.K(2);
        }
        mVar.K(1);
        f(mVar);
        String c2 = j.c(mVar.x());
        if ("audio/mpeg".equals(c2) || "audio/vnd.dts".equals(c2) || "audio/vnd.dts.hd".equals(c2)) {
            return Pair.create(c2, (Object) null);
        }
        mVar.K(12);
        mVar.K(1);
        int f2 = f(mVar);
        byte[] bArr = new byte[f2];
        mVar.g(bArr, 0, f2);
        return Pair.create(c2, bArr);
    }

    private static int f(m mVar) {
        int x = mVar.x();
        int i = x & 127;
        while ((x & 128) == 128) {
            x = mVar.x();
            i = (i << 7) | (x & 127);
        }
        return i;
    }

    private static int g(m mVar) {
        mVar.J(16);
        int i = mVar.i();
        if (i == f361b) {
            return 1;
        }
        if (i == f360a) {
            return 2;
        }
        if (i == c || i == d || i == e || i == f) {
            return 3;
        }
        return i == g ? 4 : -1;
    }

    private static b.a.a.a.m0.a h(m mVar, int i) {
        mVar.K(8);
        ArrayList arrayList = new ArrayList();
        while (mVar.c() < i) {
            a.b c2 = f.c(mVar);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b.a.a.a.m0.a((List<? extends a.b>) arrayList);
    }

    private static Pair<Long, String> i(m mVar) {
        int i = 8;
        mVar.J(8);
        int c2 = a.c(mVar.i());
        mVar.K(c2 == 0 ? 8 : 16);
        long z = mVar.z();
        if (c2 == 0) {
            i = 4;
        }
        mVar.K(i);
        int D = mVar.D();
        return Pair.create(Long.valueOf(z), "" + ((char) (((D >> 10) & 31) + 96)) + ((char) (((D >> 5) & 31) + 96)) + ((char) ((D & 31) + 96)));
    }

    private static b.a.a.a.m0.a j(m mVar, int i) {
        mVar.K(12);
        while (mVar.c() < i) {
            int c2 = mVar.c();
            int i2 = mVar.i();
            if (mVar.i() == a.C0) {
                mVar.J(c2);
                return h(mVar, c2 + i2);
            }
            mVar.K(i2 - 8);
        }
        return null;
    }

    private static long k(m mVar) {
        int i = 8;
        mVar.J(8);
        if (a.c(mVar.i()) != 0) {
            i = 16;
        }
        mVar.K(i);
        return mVar.z();
    }

    private static float l(m mVar, int i) {
        mVar.J(i + 8);
        return ((float) mVar.B()) / ((float) mVar.B());
    }

    private static byte[] m(m mVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            mVar.J(i3);
            int i4 = mVar.i();
            if (mVar.i() == a.J0) {
                return Arrays.copyOfRange(mVar.f734a, i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    private static Pair<Integer, k> n(m mVar, int i, int i2) {
        Pair<Integer, k> c2;
        int c3 = mVar.c();
        while (c3 - i < i2) {
            mVar.J(c3);
            int i3 = mVar.i();
            b.a.a.a.r0.a.b(i3 > 0, "childAtomSize should be positive");
            if (mVar.i() == a.W && (c2 = c(mVar, c3, i3)) != null) {
                return c2;
            }
            c3 += i3;
        }
        return null;
    }

    private static k o(m mVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            mVar.J(i5);
            int i6 = mVar.i();
            if (mVar.i() == a.Z) {
                int c2 = a.c(mVar.i());
                mVar.K(1);
                if (c2 == 0) {
                    mVar.K(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int x = mVar.x();
                    i3 = x & 15;
                    i4 = (x & 240) >> 4;
                }
                boolean z = mVar.x() == 1;
                int x2 = mVar.x();
                byte[] bArr2 = new byte[16];
                mVar.g(bArr2, 0, 16);
                if (z && x2 == 0) {
                    int x3 = mVar.x();
                    bArr = new byte[x3];
                    mVar.g(bArr, 0, x3);
                }
                return new k(z, str, x2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    public static m p(j jVar, a.C0022a aVar, i iVar) {
        C0023b bVar;
        boolean z;
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        long[] jArr2;
        j jVar2;
        String str;
        int[] iArr3;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        boolean z2;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        String str2;
        int[] iArr8;
        int i5;
        j jVar3 = jVar;
        a.C0022a aVar2 = aVar;
        i iVar2 = iVar;
        a.b g2 = aVar2.g(a.q0);
        if (g2 != null) {
            bVar = new d(g2);
        } else {
            a.b g3 = aVar2.g(a.r0);
            if (g3 != null) {
                bVar = new e(g3);
            } else {
                throw new u("Track has no sample table size information");
            }
        }
        int a2 = bVar.a();
        if (a2 == 0) {
            return new m(new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        a.b g4 = aVar2.g(a.s0);
        if (g4 == null) {
            g4 = aVar2.g(a.t0);
            z = true;
        } else {
            z = false;
        }
        m mVar = g4.P0;
        m mVar2 = aVar2.g(a.p0).P0;
        m mVar3 = aVar2.g(a.m0).P0;
        a.b g5 = aVar2.g(a.n0);
        m mVar4 = null;
        m mVar5 = g5 != null ? g5.P0 : null;
        a.b g6 = aVar2.g(a.o0);
        m mVar6 = g6 != null ? g6.P0 : null;
        a aVar3 = new a(mVar2, mVar, z);
        mVar3.J(12);
        int B = mVar3.B() - 1;
        int B2 = mVar3.B();
        int B3 = mVar3.B();
        if (mVar6 != null) {
            mVar6.J(12);
            i = mVar6.B();
        } else {
            i = 0;
        }
        int i6 = -1;
        if (mVar5 != null) {
            mVar5.J(12);
            i2 = mVar5.B();
            if (i2 > 0) {
                i6 = mVar5.B() - 1;
                mVar4 = mVar5;
            }
        } else {
            mVar4 = mVar5;
            i2 = 0;
        }
        long j2 = 0;
        if (!(bVar.c() && "audio/raw".equals(jVar3.f.f) && B == 0 && i == 0 && i2 == 0)) {
            jArr2 = new long[a2];
            iArr2 = new int[a2];
            int i7 = i2;
            jArr = new long[a2];
            int i8 = B;
            iArr = new int[a2];
            m mVar7 = mVar3;
            int i9 = B3;
            long j3 = 0;
            long j4 = 0;
            int i10 = i8;
            int i11 = 0;
            i4 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = B2;
            int i16 = i7;
            String str3 = "AtomParsers";
            int i17 = i6;
            int i18 = i;
            int i19 = i15;
            while (i11 < a2) {
                while (i14 == 0) {
                    b.a.a.a.r0.a.f(aVar3.a());
                    j4 = aVar3.d;
                    i14 = aVar3.c;
                    i10 = i10;
                    i19 = i19;
                }
                int i20 = i10;
                int i21 = i19;
                if (mVar6 != null) {
                    while (i12 == 0 && i18 > 0) {
                        i12 = mVar6.B();
                        i13 = mVar6.i();
                        i18--;
                    }
                    i12--;
                }
                int i22 = i13;
                jArr2[i11] = j4;
                iArr2[i11] = bVar.b();
                if (iArr2[i11] > i4) {
                    i4 = iArr2[i11];
                }
                int i23 = a2;
                C0023b bVar2 = bVar;
                jArr[i11] = j3 + ((long) i22);
                iArr[i11] = mVar4 == null ? 1 : 0;
                if (i11 == i17) {
                    iArr[i11] = 1;
                    i16--;
                    if (i16 > 0) {
                        i17 = mVar4.B() - 1;
                    }
                }
                j3 += (long) i9;
                int i24 = i21 - 1;
                if (i24 == 0 && i20 > 0) {
                    i20--;
                    i24 = mVar7.B();
                    i9 = mVar7.i();
                }
                int i25 = i24;
                j4 += (long) iArr2[i11];
                i14--;
                i11++;
                bVar = bVar2;
                a2 = i23;
                i9 = i9;
                i19 = i25;
                i13 = i22;
                i10 = i20;
            }
            int i26 = i10;
            int i27 = i19;
            int i28 = i13;
            i3 = a2;
            j = j3 + ((long) i28);
            b.a.a.a.r0.a.a(i12 == 0);
            while (i18 > 0) {
                b.a.a.a.r0.a.a(mVar6.B() == 0);
                mVar6.i();
                i18--;
            }
            if (i16 == 0 && i27 == 0) {
                i5 = i14;
                if (i5 == 0 && i26 == 0) {
                    jVar2 = jVar;
                    str = str3;
                }
            } else {
                i5 = i14;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Inconsistent stbl box for track ");
            jVar2 = jVar;
            sb.append(jVar2.f390a);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i16);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i27);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i5);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i26);
            String sb2 = sb.toString();
            str = str3;
            Log.w(str, sb2);
        } else {
            jVar2 = jVar3;
            i3 = a2;
            C0023b bVar3 = bVar;
            str = "AtomParsers";
            int i29 = aVar3.f362a;
            long[] jArr6 = new long[i29];
            int[] iArr9 = new int[i29];
            while (aVar3.a()) {
                int i30 = aVar3.f363b;
                jArr6[i30] = aVar3.d;
                iArr9[i30] = aVar3.c;
            }
            d.b a3 = d.a(bVar3.b(), jArr6, iArr9, (long) B3);
            jArr2 = a3.f374a;
            iArr2 = a3.f375b;
            i4 = a3.c;
            jArr = a3.d;
            iArr = a3.e;
            j = a3.f;
        }
        long[] jArr7 = jArr;
        int[] iArr10 = iArr2;
        int[] iArr11 = iArr;
        int i31 = i4;
        long C = w.C(j, 1000000, jVar2.c);
        if (jVar2.h == null || iVar.a()) {
            int[] iArr12 = iArr10;
            w.D(jArr7, 1000000, jVar2.c);
            return new m(jArr2, iArr12, i31, jArr7, iArr11, C);
        }
        long[] jArr8 = jVar2.h;
        if (jArr8.length == 1 && jVar2.f391b == 1 && jArr7.length >= 2) {
            long j5 = jVar2.i[0];
            long C2 = w.C(jArr8[0], jVar2.c, jVar2.d) + j5;
            if (jArr7[0] <= j5 && j5 < jArr7[1] && jArr7[jArr7.length - 1] < C2 && C2 <= j) {
                long j6 = j - C2;
                long C3 = w.C(j5 - jArr7[0], (long) jVar2.f.s, jVar2.c);
                long C4 = w.C(j6, (long) jVar2.f.s, jVar2.c);
                if (!(C3 == 0 && C4 == 0) && C3 <= 2147483647L && C4 <= 2147483647L) {
                    int i32 = (int) C3;
                    i iVar3 = iVar;
                    iVar3.f316a = i32;
                    iVar3.f317b = (int) C4;
                    w.D(jArr7, 1000000, jVar2.c);
                    return new m(jArr2, iArr10, i31, jArr7, iArr11, C);
                }
            }
        }
        long[] jArr9 = jVar2.h;
        if (jArr9.length == 1 && jArr9[0] == 0) {
            long j7 = jVar2.i[0];
            for (int i33 = 0; i33 < jArr7.length; i33++) {
                jArr7[i33] = w.C(jArr7[i33] - j7, 1000000, jVar2.c);
            }
            return new m(jArr2, iArr10, i31, jArr7, iArr11, w.C(j - j7, 1000000, jVar2.c));
        }
        boolean z3 = jVar2.f391b == 1;
        boolean z4 = false;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            long[] jArr10 = jVar2.h;
            if (i36 >= jArr10.length) {
                break;
            }
            long j8 = jVar2.i[i36];
            if (j8 != -1) {
                iArr8 = iArr11;
                iArr7 = iArr10;
                str2 = str;
                long C5 = w.C(jArr10[i36], jVar2.c, jVar2.d);
                int c2 = w.c(jArr7, j8, true, true);
                int c3 = w.c(jArr7, j8 + C5, z3, false);
                i34 += c3 - c2;
                z4 = (i35 != c2) | z4;
                i35 = c3;
            } else {
                iArr7 = iArr10;
                str2 = str;
                iArr8 = iArr11;
            }
            i36++;
            iArr11 = iArr8;
            str = str2;
            iArr10 = iArr7;
        }
        int[] iArr13 = iArr10;
        String str4 = str;
        int[] iArr14 = iArr11;
        boolean z5 = (i34 != i3) | z4;
        long[] jArr11 = z5 ? new long[i34] : jArr2;
        int[] iArr15 = z5 ? new int[i34] : iArr13;
        int i37 = z5 ? 0 : i31;
        int[] iArr16 = z5 ? new int[i34] : iArr14;
        long[] jArr12 = new long[i34];
        int i38 = i37;
        int i39 = 0;
        int i40 = 0;
        while (true) {
            long[] jArr13 = jVar2.h;
            if (i39 >= jArr13.length) {
                break;
            }
            int i41 = i38;
            int[] iArr17 = iArr14;
            long j9 = jVar2.i[i39];
            long j10 = jArr13[i39];
            if (j9 != -1) {
                long j11 = jVar2.c;
                jArr3 = jArr12;
                int[] iArr18 = iArr16;
                int c4 = w.c(jArr7, j9, true, true);
                int c5 = w.c(jArr7, w.C(j10, j11, jVar2.d) + j9, z3, false);
                if (z5) {
                    int i42 = c5 - c4;
                    System.arraycopy(jArr2, c4, jArr11, i40, i42);
                    iArr4 = iArr13;
                    System.arraycopy(iArr4, c4, iArr15, i40, i42);
                    z2 = z3;
                    iArr6 = iArr17;
                    jArr5 = jArr11;
                    iArr5 = iArr18;
                    System.arraycopy(iArr6, c4, iArr5, i40, i42);
                } else {
                    iArr4 = iArr13;
                    z2 = z3;
                    iArr6 = iArr17;
                    jArr5 = jArr11;
                    iArr5 = iArr18;
                }
                int i43 = i41;
                while (c4 < c5) {
                    long[] jArr14 = jArr2;
                    int[] iArr19 = iArr6;
                    long j12 = j9;
                    jArr3[i40] = w.C(j2, 1000000, jVar2.d) + w.C(jArr7[c4] - j9, 1000000, jVar2.c);
                    if (z5 && iArr15[i40] > i43) {
                        i43 = iArr4[c4];
                    }
                    i40++;
                    c4++;
                    jArr2 = jArr14;
                    j9 = j12;
                    iArr6 = iArr19;
                }
                jArr4 = jArr2;
                iArr3 = iArr6;
                i38 = i43;
            } else {
                jArr4 = jArr2;
                jArr3 = jArr12;
                iArr4 = iArr13;
                iArr3 = iArr17;
                jArr5 = jArr11;
                z2 = z3;
                iArr5 = iArr16;
                i38 = i41;
            }
            j2 += j10;
            i39++;
            iArr16 = iArr5;
            z3 = z2;
            jArr11 = jArr5;
            jArr2 = jArr4;
            jArr12 = jArr3;
            iArr14 = iArr3;
            iArr13 = iArr4;
        }
        long[] jArr15 = jArr11;
        long[] jArr16 = jArr2;
        long[] jArr17 = jArr12;
        int[] iArr20 = iArr16;
        int i44 = i38;
        int[] iArr21 = iArr14;
        int[] iArr22 = iArr13;
        long C6 = w.C(j2, 1000000, jVar2.c);
        boolean z6 = false;
        for (int i45 = 0; i45 < iArr20.length && !z6; i45++) {
            z6 |= (iArr20[i45] & 1) != 0;
        }
        if (z6) {
            return new m(jArr15, iArr15, i44, jArr17, iArr20, C6);
        }
        Log.w(str4, "Ignoring edit list: Edited sample sequence does not contain a sync sample.");
        w.D(jArr7, 1000000, jVar2.c);
        return new m(jArr16, iArr22, i31, jArr7, iArr21, C);
    }

    private static c q(m mVar, int i, int i2, String str, b.a.a.a.j0.a aVar, boolean z) {
        m mVar2 = mVar;
        mVar2.J(12);
        int i3 = mVar.i();
        c cVar = new c(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int c2 = mVar.c();
            int i5 = mVar.i();
            b.a.a.a.r0.a.b(i5 > 0, "childAtomSize should be positive");
            int i6 = mVar.i();
            if (i6 == a.c || i6 == a.d || i6 == a.a0 || i6 == a.l0 || i6 == a.e || i6 == a.f || i6 == a.g || i6 == a.K0 || i6 == a.L0) {
                v(mVar, i6, c2, i5, i, i2, aVar, cVar, i4);
            } else if (i6 == a.j || i6 == a.b0 || i6 == a.o || i6 == a.q || i6 == a.s || i6 == a.v || i6 == a.t || i6 == a.u || i6 == a.y0 || i6 == a.z0 || i6 == a.m || i6 == a.n || i6 == a.k || i6 == a.O0) {
                b(mVar, i6, c2, i5, i, str, z, aVar, cVar, i4);
            } else if (i6 == a.k0 || i6 == a.u0 || i6 == a.v0 || i6 == a.w0 || i6 == a.x0) {
                r(mVar, i6, c2, i5, i, str, cVar);
            } else if (i6 == a.N0) {
                cVar.f365b = n.k(Integer.toString(i), "application/x-camera-motion", (String) null, -1, (b.a.a.a.j0.a) null);
            }
            mVar2.J(c2 + i5);
        }
        return cVar;
    }

    private static void r(m mVar, int i, int i2, int i3, int i4, String str, c cVar) {
        m mVar2 = mVar;
        int i5 = i;
        c cVar2 = cVar;
        mVar2.J(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i5 != a.k0) {
            if (i5 == a.u0) {
                int i6 = (i3 - 8) - 8;
                byte[] bArr = new byte[i6];
                mVar2.g(bArr, 0, i6);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i5 == a.v0) {
                str2 = "application/x-mp4-vtt";
            } else if (i5 == a.w0) {
                j = 0;
            } else if (i5 == a.x0) {
                cVar2.d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar2.f365b = n.o(Integer.toString(i4), str2, (String) null, -1, 0, str, -1, (b.a.a.a.j0.a) null, j, list);
    }

    private static f s(m mVar) {
        boolean z;
        int i = 8;
        mVar.J(8);
        int c2 = a.c(mVar.i());
        mVar.K(c2 == 0 ? 8 : 16);
        int i2 = mVar.i();
        mVar.K(4);
        int c3 = mVar.c();
        if (c2 == 0) {
            i = 4;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                z = true;
                break;
            } else if (mVar.f734a[c3 + i4] != -1) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            mVar.K(i);
        } else {
            long z2 = c2 == 0 ? mVar.z() : mVar.C();
            if (z2 != 0) {
                j = z2;
            }
        }
        mVar.K(16);
        int i5 = mVar.i();
        int i6 = mVar.i();
        mVar.K(4);
        int i7 = mVar.i();
        int i8 = mVar.i();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new f(i2, j, i3);
    }

    public static j t(a.C0022a aVar, a.b bVar, long j, b.a.a.a.j0.a aVar2, boolean z, boolean z2) {
        long j2;
        a.b bVar2;
        long[] jArr;
        long[] jArr2;
        a.C0022a aVar3 = aVar;
        a.C0022a f2 = aVar3.f(a.F);
        int g2 = g(f2.g(a.T).P0);
        if (g2 == -1) {
            return null;
        }
        f s = s(aVar3.g(a.P).P0);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = s.f371b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long k = k(bVar2.P0);
        if (j2 != -9223372036854775807L) {
            j3 = w.C(j2, 1000000, k);
        }
        long j4 = j3;
        a.C0022a f3 = f2.f(a.G).f(a.H);
        Pair<Long, String> i = i(f2.g(a.S).P0);
        c q = q(f3.g(a.U).P0, s.f370a, s.c, (String) i.second, aVar2, z2);
        if (!z) {
            Pair<long[], long[]> d2 = d(aVar3.f(a.Q));
            jArr = (long[]) d2.second;
            jArr2 = (long[]) d2.first;
        } else {
            jArr2 = null;
            jArr = null;
        }
        if (q.f365b == null) {
            return null;
        }
        return new j(s.f370a, g2, ((Long) i.first).longValue(), k, j4, q.f365b, q.d, q.f364a, q.c, jArr2, jArr);
    }

    public static b.a.a.a.m0.a u(a.b bVar, boolean z) {
        if (z) {
            return null;
        }
        m mVar = bVar.P0;
        mVar.J(8);
        while (mVar.a() >= 8) {
            int c2 = mVar.c();
            int i = mVar.i();
            if (mVar.i() == a.B0) {
                mVar.J(c2);
                return j(mVar, c2 + i);
            }
            mVar.K(i - 8);
        }
        return null;
    }

    private static void v(m mVar, int i, int i2, int i3, int i4, int i5, b.a.a.a.j0.a aVar, c cVar, int i6) {
        m mVar2 = mVar;
        int i7 = i2;
        int i8 = i3;
        b.a.a.a.j0.a aVar2 = aVar;
        c cVar2 = cVar;
        mVar2.J(i7 + 8 + 8);
        mVar2.K(16);
        int D = mVar.D();
        int D2 = mVar.D();
        mVar2.K(50);
        int c2 = mVar.c();
        String str = null;
        int i9 = i;
        if (i9 == a.a0) {
            Pair<Integer, k> n = n(mVar2, i7, i8);
            if (n != null) {
                i9 = ((Integer) n.first).intValue();
                aVar2 = aVar2 == null ? null : aVar2.b(((k) n.second).f392a);
                cVar2.f364a[i6] = (k) n.second;
            }
            mVar2.J(c2);
        }
        b.a.a.a.j0.a aVar3 = aVar2;
        List<byte[]> list = null;
        byte[] bArr = null;
        boolean z = false;
        float f2 = 1.0f;
        int i10 = -1;
        while (c2 - i7 < i8) {
            mVar2.J(c2);
            int c3 = mVar.c();
            int i11 = mVar.i();
            if (i11 == 0 && mVar.c() - i7 == i8) {
                break;
            }
            b.a.a.a.r0.a.b(i11 > 0, "childAtomSize should be positive");
            int i12 = mVar.i();
            if (i12 == a.I) {
                b.a.a.a.r0.a.f(str == null);
                mVar2.J(c3 + 8);
                b.a.a.a.s0.a b2 = b.a.a.a.s0.a.b(mVar);
                list = b2.f748a;
                cVar2.c = b2.f749b;
                if (!z) {
                    f2 = b2.e;
                }
                str = "video/avc";
            } else if (i12 == a.J) {
                b.a.a.a.r0.a.f(str == null);
                mVar2.J(c3 + 8);
                b.a.a.a.s0.d a2 = b.a.a.a.s0.d.a(mVar);
                list = a2.f756a;
                cVar2.c = a2.f757b;
                str = "video/hevc";
            } else if (i12 == a.M0) {
                b.a.a.a.r0.a.f(str == null);
                str = i9 == a.K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (i12 == a.h) {
                b.a.a.a.r0.a.f(str == null);
                str = "video/3gpp";
            } else if (i12 == a.K) {
                b.a.a.a.r0.a.f(str == null);
                Pair<String, byte[]> e2 = e(mVar2, c3);
                str = (String) e2.first;
                list = Collections.singletonList(e2.second);
            } else if (i12 == a.j0) {
                f2 = l(mVar2, c3);
                z = true;
            } else if (i12 == a.I0) {
                bArr = m(mVar2, c3, i11);
            } else if (i12 == a.H0) {
                int x = mVar.x();
                mVar2.K(3);
                if (x == 0) {
                    int x2 = mVar.x();
                    if (x2 == 0) {
                        i10 = 0;
                    } else if (x2 == 1) {
                        i10 = 1;
                    } else if (x2 == 2) {
                        i10 = 2;
                    } else if (x2 == 3) {
                        i10 = 3;
                    }
                }
            }
            c2 += i11;
        }
        if (str != null) {
            cVar2.f365b = n.q(Integer.toString(i4), str, (String) null, -1, -1, D, D2, -1.0f, list, i5, f2, bArr, i10, (b.a.a.a.s0.b) null, aVar3);
        }
    }
}
