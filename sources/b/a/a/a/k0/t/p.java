package b.a.a.a.k0.t;

import android.util.Log;
import b.a.a.a.k0.g;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.l;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;

public final class p implements w {

    /* renamed from: a  reason: collision with root package name */
    private final h f456a;

    /* renamed from: b  reason: collision with root package name */
    private final l f457b = new l(new byte[10]);
    private int c = 0;
    private int d;
    private u e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public p(h hVar) {
        this.f456a = hVar;
    }

    private boolean d(m mVar, byte[] bArr, int i2) {
        int min = Math.min(mVar.a(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            mVar.K(min);
        } else {
            mVar.g(bArr, this.d, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }

    private boolean e() {
        this.f457b.m(0);
        int h2 = this.f457b.h(24);
        if (h2 != 1) {
            Log.w("PesReader", "Unexpected start code prefix: " + h2);
            this.j = -1;
            return false;
        }
        this.f457b.o(8);
        int h3 = this.f457b.h(16);
        this.f457b.o(5);
        this.k = this.f457b.g();
        this.f457b.o(2);
        this.f = this.f457b.g();
        this.g = this.f457b.g();
        this.f457b.o(6);
        int h4 = this.f457b.h(8);
        this.i = h4;
        if (h3 == 0) {
            this.j = -1;
        } else {
            this.j = ((h3 + 6) - 9) - h4;
        }
        return true;
    }

    private void f() {
        this.f457b.m(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.f457b.o(4);
            this.f457b.o(1);
            this.f457b.o(1);
            long h2 = (((long) this.f457b.h(3)) << 30) | ((long) (this.f457b.h(15) << 15)) | ((long) this.f457b.h(15));
            this.f457b.o(1);
            if (!this.h && this.g) {
                this.f457b.o(4);
                this.f457b.o(1);
                this.f457b.o(1);
                this.f457b.o(1);
                this.e.b((((long) this.f457b.h(3)) << 30) | ((long) (this.f457b.h(15) << 15)) | ((long) this.f457b.h(15)));
                this.h = true;
            }
            this.l = this.e.b(h2);
        }
    }

    private void g(int i2) {
        this.c = i2;
        this.d = 0;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f456a.a();
    }

    public void b(u uVar, g gVar, w.d dVar) {
        this.e = uVar;
        this.f456a.f(gVar, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be A[SYNTHETIC] */
    public final void c(b.a.a.a.r0.m r8, boolean r9) {
        /*
            r7 = this;
            r0 = -1
            r1 = 1
            r2 = 3
            r3 = 2
            if (r9 == 0) goto L_0x0037
            int r9 = r7.c
            java.lang.String r4 = "PesReader"
            if (r9 == r3) goto L_0x002f
            if (r9 == r2) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            int r9 = r7.j
            if (r9 == r0) goto L_0x006d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "Unexpected start indicator: expected "
            r9.append(r5)
            int r5 = r7.j
            r9.append(r5)
            java.lang.String r5 = " more bytes"
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r4, r9)
            goto L_0x006d
        L_0x002f:
            java.lang.String r9 = "Unexpected start indicator reading extended header"
            android.util.Log.w(r4, r9)
        L_0x0034:
            r7.g(r1)
        L_0x0037:
            int r9 = r8.a()
            if (r9 <= 0) goto L_0x00be
            int r9 = r7.c
            if (r9 == 0) goto L_0x00b5
            r4 = 0
            if (r9 == r1) goto L_0x009e
            if (r9 == r3) goto L_0x0073
            if (r9 == r2) goto L_0x0049
            goto L_0x0037
        L_0x0049:
            int r9 = r8.a()
            int r5 = r7.j
            if (r5 != r0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            int r4 = r9 - r5
        L_0x0054:
            if (r4 <= 0) goto L_0x005f
            int r9 = r9 - r4
            int r4 = r8.c()
            int r4 = r4 + r9
            r8.I(r4)
        L_0x005f:
            b.a.a.a.k0.t.h r4 = r7.f456a
            r4.c(r8)
            int r4 = r7.j
            if (r4 == r0) goto L_0x0037
            int r4 = r4 - r9
            r7.j = r4
            if (r4 != 0) goto L_0x0037
        L_0x006d:
            b.a.a.a.k0.t.h r9 = r7.f456a
            r9.e()
            goto L_0x0034
        L_0x0073:
            r9 = 10
            int r4 = r7.i
            int r9 = java.lang.Math.min(r9, r4)
            b.a.a.a.r0.l r4 = r7.f457b
            byte[] r4 = r4.f732a
            boolean r9 = r7.d(r8, r4, r9)
            if (r9 == 0) goto L_0x0037
            r9 = 0
            int r4 = r7.i
            boolean r9 = r7.d(r8, r9, r4)
            if (r9 == 0) goto L_0x0037
            r7.f()
            b.a.a.a.k0.t.h r9 = r7.f456a
            long r4 = r7.l
            boolean r6 = r7.k
            r9.d(r4, r6)
            r7.g(r2)
            goto L_0x0037
        L_0x009e:
            b.a.a.a.r0.l r9 = r7.f457b
            byte[] r9 = r9.f732a
            r5 = 9
            boolean r9 = r7.d(r8, r9, r5)
            if (r9 == 0) goto L_0x0037
            boolean r9 = r7.e()
            if (r9 == 0) goto L_0x00b1
            r4 = 2
        L_0x00b1:
            r7.g(r4)
            goto L_0x0037
        L_0x00b5:
            int r9 = r8.a()
            r8.K(r9)
            goto L_0x0037
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.t.p.c(b.a.a.a.r0.m, boolean):void");
    }
}
