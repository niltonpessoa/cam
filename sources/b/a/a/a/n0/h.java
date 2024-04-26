package b.a.a.a.n0;

import b.a.a.a.k0.n;
import b.a.a.a.r0.w;

final class h {

    /* renamed from: a  reason: collision with root package name */
    private int f576a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private int[] f577b = new int[1000];
    private long[] c = new long[1000];
    private int[] d = new int[1000];
    private int[] e = new int[1000];
    private long[] f = new long[1000];
    private n.a[] g = new n.a[1000];
    private b.a.a.a.n[] h = new b.a.a.a.n[1000];
    private int i;
    private int j;
    private int k;
    private int l;
    private long m = Long.MIN_VALUE;
    private long n = Long.MIN_VALUE;
    private boolean o = true;
    private boolean p = true;
    private b.a.a.a.n q;
    private int r;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f578a;

        /* renamed from: b  reason: collision with root package name */
        public long f579b;
        public n.a c;
    }

    private long f(int i2) {
        this.m = Math.max(this.m, m(i2));
        int i3 = this.i - i2;
        this.i = i3;
        this.j += i2;
        int i4 = this.k + i2;
        this.k = i4;
        int i5 = this.f576a;
        if (i4 >= i5) {
            this.k = i4 - i5;
        }
        int i6 = this.l - i2;
        this.l = i6;
        if (i6 < 0) {
            this.l = 0;
        }
        if (i3 != 0) {
            return this.c[this.k];
        }
        int i7 = this.k;
        if (i7 != 0) {
            i5 = i7;
        }
        int i8 = i5 - 1;
        return this.c[i8] + ((long) this.d[i8]);
    }

    private int j(int i2, int i3, long j2, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3 && this.f[i2] <= j2; i5++) {
            if (!z || (this.e[i2] & 1) != 0) {
                i4 = i5;
            }
            i2++;
            if (i2 == this.f576a) {
                i2 = 0;
            }
        }
        return i4;
    }

    private long m(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int o2 = o(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.f[o2]);
            if ((this.e[o2] & 1) != 0) {
                break;
            }
            o2--;
            if (o2 == -1) {
                o2 = this.f576a - 1;
            }
        }
        return j2;
    }

    private int o(int i2) {
        int i3 = this.k + i2;
        int i4 = this.f576a;
        return i3 < i4 ? i3 : i3 - i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int a(long r9, boolean r11, boolean r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.l     // Catch:{ all -> 0x0039 }
            int r2 = r8.o(r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r8.r()     // Catch:{ all -> 0x0039 }
            r7 = -1
            if (r0 == 0) goto L_0x0037
            long[] r0 = r8.f     // Catch:{ all -> 0x0039 }
            r3 = r0[r2]     // Catch:{ all -> 0x0039 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            long r0 = r8.n     // Catch:{ all -> 0x0039 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x001f
            if (r12 != 0) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            int r12 = r8.i     // Catch:{ all -> 0x0039 }
            int r0 = r8.l     // Catch:{ all -> 0x0039 }
            int r3 = r12 - r0
            r1 = r8
            r4 = r9
            r6 = r11
            int r9 = r1.j(r2, r3, r4, r6)     // Catch:{ all -> 0x0039 }
            if (r9 != r7) goto L_0x0030
            monitor-exit(r8)
            return r7
        L_0x0030:
            int r10 = r8.l     // Catch:{ all -> 0x0039 }
            int r10 = r10 + r9
            r8.l = r10     // Catch:{ all -> 0x0039 }
            monitor-exit(r8)
            return r9
        L_0x0037:
            monitor-exit(r8)
            return r7
        L_0x0039:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.h.a(long, boolean, boolean):int");
    }

    public synchronized int b() {
        int i2;
        int i3 = this.i;
        i2 = i3 - this.l;
        this.l = i3;
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean c(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.i     // Catch:{ all -> 0x0049 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            long r3 = r7.m     // Catch:{ all -> 0x0049 }
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            r1 = 1
        L_0x000e:
            monitor-exit(r7)
            return r1
        L_0x0010:
            long r3 = r7.m     // Catch:{ all -> 0x0049 }
            int r0 = r7.l     // Catch:{ all -> 0x0049 }
            long r5 = r7.m(r0)     // Catch:{ all -> 0x0049 }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x0049 }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            monitor-exit(r7)
            return r1
        L_0x0022:
            int r0 = r7.i     // Catch:{ all -> 0x0049 }
            int r1 = r0 + -1
            int r1 = r7.o(r1)     // Catch:{ all -> 0x0049 }
        L_0x002a:
            int r3 = r7.l     // Catch:{ all -> 0x0049 }
            if (r0 <= r3) goto L_0x0041
            long[] r3 = r7.f     // Catch:{ all -> 0x0049 }
            r4 = r3[r1]     // Catch:{ all -> 0x0049 }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0041
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x002a
            int r1 = r7.f576a     // Catch:{ all -> 0x0049 }
            int r1 = r1 - r2
            goto L_0x002a
        L_0x0041:
            int r8 = r7.j     // Catch:{ all -> 0x0049 }
            int r8 = r8 + r0
            r7.i(r8)     // Catch:{ all -> 0x0049 }
            monitor-exit(r7)
            return r2
        L_0x0049:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x004d
        L_0x004c:
            throw r8
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.h.c(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void d(long r6, int r8, long r9, int r11, b.a.a.a.k0.n.a r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.o     // Catch:{ all -> 0x00c8 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.o = r1     // Catch:{ all -> 0x00c8 }
        L_0x000e:
            boolean r0 = r5.p     // Catch:{ all -> 0x00c8 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            b.a.a.a.r0.a.f(r0)     // Catch:{ all -> 0x00c8 }
            r5.e(r6)     // Catch:{ all -> 0x00c8 }
            int r0 = r5.i     // Catch:{ all -> 0x00c8 }
            int r0 = r5.o(r0)     // Catch:{ all -> 0x00c8 }
            long[] r3 = r5.f     // Catch:{ all -> 0x00c8 }
            r3[r0] = r6     // Catch:{ all -> 0x00c8 }
            long[] r6 = r5.c     // Catch:{ all -> 0x00c8 }
            r6[r0] = r9     // Catch:{ all -> 0x00c8 }
            int[] r7 = r5.d     // Catch:{ all -> 0x00c8 }
            r7[r0] = r11     // Catch:{ all -> 0x00c8 }
            int[] r7 = r5.e     // Catch:{ all -> 0x00c8 }
            r7[r0] = r8     // Catch:{ all -> 0x00c8 }
            b.a.a.a.k0.n$a[] r7 = r5.g     // Catch:{ all -> 0x00c8 }
            r7[r0] = r12     // Catch:{ all -> 0x00c8 }
            b.a.a.a.n[] r7 = r5.h     // Catch:{ all -> 0x00c8 }
            b.a.a.a.n r8 = r5.q     // Catch:{ all -> 0x00c8 }
            r7[r0] = r8     // Catch:{ all -> 0x00c8 }
            int[] r7 = r5.f577b     // Catch:{ all -> 0x00c8 }
            int r8 = r5.r     // Catch:{ all -> 0x00c8 }
            r7[r0] = r8     // Catch:{ all -> 0x00c8 }
            int r7 = r5.i     // Catch:{ all -> 0x00c8 }
            int r7 = r7 + r2
            r5.i = r7     // Catch:{ all -> 0x00c8 }
            int r8 = r5.f576a     // Catch:{ all -> 0x00c8 }
            if (r7 != r8) goto L_0x00c6
            int r7 = r8 + 1000
            int[] r9 = new int[r7]     // Catch:{ all -> 0x00c8 }
            long[] r10 = new long[r7]     // Catch:{ all -> 0x00c8 }
            long[] r11 = new long[r7]     // Catch:{ all -> 0x00c8 }
            int[] r12 = new int[r7]     // Catch:{ all -> 0x00c8 }
            int[] r0 = new int[r7]     // Catch:{ all -> 0x00c8 }
            b.a.a.a.k0.n$a[] r2 = new b.a.a.a.k0.n.a[r7]     // Catch:{ all -> 0x00c8 }
            b.a.a.a.n[] r3 = new b.a.a.a.n[r7]     // Catch:{ all -> 0x00c8 }
            int r4 = r5.k     // Catch:{ all -> 0x00c8 }
            int r8 = r8 - r4
            java.lang.System.arraycopy(r6, r4, r10, r1, r8)     // Catch:{ all -> 0x00c8 }
            long[] r6 = r5.f     // Catch:{ all -> 0x00c8 }
            int r4 = r5.k     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r6, r4, r11, r1, r8)     // Catch:{ all -> 0x00c8 }
            int[] r6 = r5.e     // Catch:{ all -> 0x00c8 }
            int r4 = r5.k     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r6, r4, r12, r1, r8)     // Catch:{ all -> 0x00c8 }
            int[] r6 = r5.d     // Catch:{ all -> 0x00c8 }
            int r4 = r5.k     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r6, r4, r0, r1, r8)     // Catch:{ all -> 0x00c8 }
            b.a.a.a.k0.n$a[] r6 = r5.g     // Catch:{ all -> 0x00c8 }
            int r4 = r5.k     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r6, r4, r2, r1, r8)     // Catch:{ all -> 0x00c8 }
            b.a.a.a.n[] r6 = r5.h     // Catch:{ all -> 0x00c8 }
            int r4 = r5.k     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r6, r4, r3, r1, r8)     // Catch:{ all -> 0x00c8 }
            int[] r6 = r5.f577b     // Catch:{ all -> 0x00c8 }
            int r4 = r5.k     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r6, r4, r9, r1, r8)     // Catch:{ all -> 0x00c8 }
            int r6 = r5.k     // Catch:{ all -> 0x00c8 }
            long[] r4 = r5.c     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r4, r1, r10, r8, r6)     // Catch:{ all -> 0x00c8 }
            long[] r4 = r5.f     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r4, r1, r11, r8, r6)     // Catch:{ all -> 0x00c8 }
            int[] r4 = r5.e     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r4, r1, r12, r8, r6)     // Catch:{ all -> 0x00c8 }
            int[] r4 = r5.d     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r4, r1, r0, r8, r6)     // Catch:{ all -> 0x00c8 }
            b.a.a.a.k0.n$a[] r4 = r5.g     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r4, r1, r2, r8, r6)     // Catch:{ all -> 0x00c8 }
            b.a.a.a.n[] r4 = r5.h     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r4, r1, r3, r8, r6)     // Catch:{ all -> 0x00c8 }
            int[] r4 = r5.f577b     // Catch:{ all -> 0x00c8 }
            java.lang.System.arraycopy(r4, r1, r9, r8, r6)     // Catch:{ all -> 0x00c8 }
            r5.c = r10     // Catch:{ all -> 0x00c8 }
            r5.f = r11     // Catch:{ all -> 0x00c8 }
            r5.e = r12     // Catch:{ all -> 0x00c8 }
            r5.d = r0     // Catch:{ all -> 0x00c8 }
            r5.g = r2     // Catch:{ all -> 0x00c8 }
            r5.h = r3     // Catch:{ all -> 0x00c8 }
            r5.f577b = r9     // Catch:{ all -> 0x00c8 }
            r5.k = r1     // Catch:{ all -> 0x00c8 }
            int r6 = r5.f576a     // Catch:{ all -> 0x00c8 }
            r5.i = r6     // Catch:{ all -> 0x00c8 }
            r5.f576a = r7     // Catch:{ all -> 0x00c8 }
        L_0x00c6:
            monitor-exit(r5)
            return
        L_0x00c8:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.h.d(long, int, long, int, b.a.a.a.k0.n$a):void");
    }

    public synchronized void e(long j2) {
        this.n = Math.max(this.n, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long g(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.i     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f     // Catch:{ all -> 0x002f }
            int r5 = r10.k     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.l     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.j(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.f(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.h.g(long, boolean, boolean):long");
    }

    public synchronized long h() {
        int i2 = this.i;
        if (i2 == 0) {
            return -1;
        }
        return f(i2);
    }

    public long i(int i2) {
        int q2 = q() - i2;
        b.a.a.a.r0.a.a(q2 >= 0 && q2 <= this.i - this.l);
        int i3 = this.i - q2;
        this.i = i3;
        this.n = Math.max(this.m, m(i3));
        int i4 = this.i;
        if (i4 == 0) {
            return 0;
        }
        int o2 = o(i4 - 1);
        return this.c[o2] + ((long) this.d[o2]);
    }

    public synchronized boolean k(b.a.a.a.n nVar) {
        if (nVar == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (w.b(nVar, this.q)) {
            return false;
        }
        this.q = nVar;
        return true;
    }

    public synchronized long l() {
        return this.n;
    }

    public int n() {
        return this.j + this.l;
    }

    public synchronized b.a.a.a.n p() {
        return this.p ? null : this.q;
    }

    public int q() {
        return this.j + this.i;
    }

    public synchronized boolean r() {
        return this.l != this.i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int s(b.a.a.a.o r5, b.a.a.a.i0.e r6, boolean r7, boolean r8, b.a.a.a.n r9, b.a.a.a.n0.h.a r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.r()     // Catch:{ all -> 0x0066 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0020
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.l(r5)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            b.a.a.a.n r6 = r4.q     // Catch:{ all -> 0x0066 }
            if (r6 == 0) goto L_0x001e
            if (r7 != 0) goto L_0x001a
            if (r6 == r9) goto L_0x001e
        L_0x001a:
            r5.f593a = r6     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)
            return r1
        L_0x001e:
            monitor-exit(r4)
            return r2
        L_0x0020:
            int r8 = r4.l     // Catch:{ all -> 0x0066 }
            int r8 = r4.o(r8)     // Catch:{ all -> 0x0066 }
            if (r7 != 0) goto L_0x005e
            b.a.a.a.n[] r7 = r4.h     // Catch:{ all -> 0x0066 }
            r7 = r7[r8]     // Catch:{ all -> 0x0066 }
            if (r7 == r9) goto L_0x002f
            goto L_0x005e
        L_0x002f:
            boolean r5 = r6.q()     // Catch:{ all -> 0x0066 }
            if (r5 == 0) goto L_0x0037
            monitor-exit(r4)
            return r2
        L_0x0037:
            long[] r5 = r4.f     // Catch:{ all -> 0x0066 }
            r0 = r5[r8]     // Catch:{ all -> 0x0066 }
            r6.d = r0     // Catch:{ all -> 0x0066 }
            int[] r5 = r4.e     // Catch:{ all -> 0x0066 }
            r5 = r5[r8]     // Catch:{ all -> 0x0066 }
            r6.l(r5)     // Catch:{ all -> 0x0066 }
            int[] r5 = r4.d     // Catch:{ all -> 0x0066 }
            r5 = r5[r8]     // Catch:{ all -> 0x0066 }
            r10.f578a = r5     // Catch:{ all -> 0x0066 }
            long[] r5 = r4.c     // Catch:{ all -> 0x0066 }
            r6 = r5[r8]     // Catch:{ all -> 0x0066 }
            r10.f579b = r6     // Catch:{ all -> 0x0066 }
            b.a.a.a.k0.n$a[] r5 = r4.g     // Catch:{ all -> 0x0066 }
            r5 = r5[r8]     // Catch:{ all -> 0x0066 }
            r10.c = r5     // Catch:{ all -> 0x0066 }
            int r5 = r4.l     // Catch:{ all -> 0x0066 }
            int r5 = r5 + 1
            r4.l = r5     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)
            return r3
        L_0x005e:
            b.a.a.a.n[] r6 = r4.h     // Catch:{ all -> 0x0066 }
            r6 = r6[r8]     // Catch:{ all -> 0x0066 }
            r5.f593a = r6     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)
            return r1
        L_0x0066:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.n0.h.s(b.a.a.a.o, b.a.a.a.i0.e, boolean, boolean, b.a.a.a.n, b.a.a.a.n0.h$a):int");
    }

    public void t(boolean z) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.o = true;
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        if (z) {
            this.q = null;
            this.p = true;
        }
    }

    public synchronized void u() {
        this.l = 0;
    }
}
