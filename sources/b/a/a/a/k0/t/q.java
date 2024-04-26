package b.a.a.a.k0.t;

import android.util.SparseArray;
import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.l;
import b.a.a.a.r0.l;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;

public final class q implements e {

    /* renamed from: a  reason: collision with root package name */
    private final u f458a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<a> f459b;
    private final m c;
    private boolean d;
    private boolean e;
    private boolean f;
    private g g;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final h f460a;

        /* renamed from: b  reason: collision with root package name */
        private final u f461b;
        private final l c = new l(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(h hVar, u uVar) {
            this.f460a = hVar;
            this.f461b = uVar;
        }

        private void b() {
            this.c.o(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.o(6);
            this.g = this.c.h(8);
        }

        private void c() {
            this.h = 0;
            if (this.d) {
                this.c.o(4);
                this.c.o(1);
                this.c.o(1);
                long h2 = (((long) this.c.h(3)) << 30) | ((long) (this.c.h(15) << 15)) | ((long) this.c.h(15));
                this.c.o(1);
                if (!this.f && this.e) {
                    this.c.o(4);
                    this.c.o(1);
                    this.c.o(1);
                    this.c.o(1);
                    this.f461b.b((((long) this.c.h(3)) << 30) | ((long) (this.c.h(15) << 15)) | ((long) this.c.h(15)));
                    this.f = true;
                }
                this.h = this.f461b.b(h2);
            }
        }

        public void a(m mVar) {
            mVar.g(this.c.f732a, 0, 3);
            this.c.m(0);
            b();
            mVar.g(this.c.f732a, 0, this.g);
            this.c.m(0);
            c();
            this.f460a.d(this.h, true);
            this.f460a.c(mVar);
            this.f460a.e();
        }

        public void d() {
            this.f = false;
            this.f460a.a();
        }
    }

    public q() {
        this(new u(0));
    }

    public q(u uVar) {
        this.f458a = uVar;
        this.c = new m(4096);
        this.f459b = new SparseArray<>();
    }

    public void a() {
    }

    public void d(g gVar) {
        this.g = gVar;
        gVar.c(new l.b(-9223372036854775807L));
    }

    public void f(long j, long j2) {
        this.f458a.g();
        for (int i = 0; i < this.f459b.size(); i++) {
            this.f459b.valueAt(i).d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g(b.a.a.a.k0.f r10, b.a.a.a.k0.k r11) {
        /*
            r9 = this;
            b.a.a.a.r0.m r11 = r9.c
            byte[] r11 = r11.f734a
            r0 = 0
            r1 = 4
            r2 = 1
            boolean r11 = r10.f(r11, r0, r1, r2)
            r1 = -1
            if (r11 != 0) goto L_0x000f
            return r1
        L_0x000f:
            b.a.a.a.r0.m r11 = r9.c
            r11.J(r0)
            b.a.a.a.r0.m r11 = r9.c
            int r11 = r11.i()
            r3 = 441(0x1b9, float:6.18E-43)
            if (r11 != r3) goto L_0x001f
            return r1
        L_0x001f:
            r1 = 442(0x1ba, float:6.2E-43)
            if (r11 != r1) goto L_0x0041
            b.a.a.a.r0.m r11 = r9.c
            byte[] r11 = r11.f734a
            r1 = 10
            r10.h(r11, r0, r1)
            b.a.a.a.r0.m r11 = r9.c
            r1 = 9
            r11.J(r1)
            b.a.a.a.r0.m r11 = r9.c
            int r11 = r11.x()
            r11 = r11 & 7
            int r11 = r11 + 14
        L_0x003d:
            r10.c(r11)
            return r0
        L_0x0041:
            r1 = 443(0x1bb, float:6.21E-43)
            r3 = 2
            r4 = 6
            if (r11 != r1) goto L_0x005b
            b.a.a.a.r0.m r11 = r9.c
            byte[] r11 = r11.f734a
            r10.h(r11, r0, r3)
            b.a.a.a.r0.m r11 = r9.c
            r11.J(r0)
            b.a.a.a.r0.m r11 = r9.c
            int r11 = r11.D()
            int r11 = r11 + r4
            goto L_0x003d
        L_0x005b:
            r1 = r11 & -256(0xffffffffffffff00, float:NaN)
            int r1 = r1 >> 8
            if (r1 == r2) goto L_0x0065
            r10.c(r2)
            return r0
        L_0x0065:
            r11 = r11 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<b.a.a.a.k0.t.q$a> r1 = r9.f459b
            java.lang.Object r1 = r1.get(r11)
            b.a.a.a.k0.t.q$a r1 = (b.a.a.a.k0.t.q.a) r1
            boolean r5 = r9.d
            if (r5 != 0) goto L_0x00d9
            if (r1 != 0) goto L_0x00bf
            r5 = 0
            boolean r6 = r9.e
            if (r6 != 0) goto L_0x0086
            r7 = 189(0xbd, float:2.65E-43)
            if (r11 != r7) goto L_0x0086
            b.a.a.a.k0.t.b r5 = new b.a.a.a.k0.t.b
            r5.<init>()
        L_0x0083:
            r9.e = r2
            goto L_0x00a5
        L_0x0086:
            if (r6 != 0) goto L_0x0094
            r6 = r11 & 224(0xe0, float:3.14E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r6 != r7) goto L_0x0094
            b.a.a.a.k0.t.n r5 = new b.a.a.a.k0.t.n
            r5.<init>()
            goto L_0x0083
        L_0x0094:
            boolean r6 = r9.f
            if (r6 != 0) goto L_0x00a5
            r6 = r11 & 240(0xf0, float:3.36E-43)
            r7 = 224(0xe0, float:3.14E-43)
            if (r6 != r7) goto L_0x00a5
            b.a.a.a.k0.t.i r5 = new b.a.a.a.k0.t.i
            r5.<init>()
            r9.f = r2
        L_0x00a5:
            if (r5 == 0) goto L_0x00bf
            b.a.a.a.k0.t.w$d r1 = new b.a.a.a.k0.t.w$d
            r6 = 256(0x100, float:3.59E-43)
            r1.<init>(r11, r6)
            b.a.a.a.k0.g r6 = r9.g
            r5.f(r6, r1)
            b.a.a.a.k0.t.q$a r1 = new b.a.a.a.k0.t.q$a
            b.a.a.a.r0.u r6 = r9.f458a
            r1.<init>(r5, r6)
            android.util.SparseArray<b.a.a.a.k0.t.q$a> r5 = r9.f459b
            r5.put(r11, r1)
        L_0x00bf:
            boolean r11 = r9.e
            if (r11 == 0) goto L_0x00c7
            boolean r11 = r9.f
            if (r11 != 0) goto L_0x00d2
        L_0x00c7:
            long r5 = r10.k()
            r7 = 1048576(0x100000, double:5.180654E-318)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x00d9
        L_0x00d2:
            r9.d = r2
            b.a.a.a.k0.g r11 = r9.g
            r11.d()
        L_0x00d9:
            b.a.a.a.r0.m r11 = r9.c
            byte[] r11 = r11.f734a
            r10.h(r11, r0, r3)
            b.a.a.a.r0.m r11 = r9.c
            r11.J(r0)
            b.a.a.a.r0.m r11 = r9.c
            int r11 = r11.D()
            int r11 = r11 + r4
            if (r1 != 0) goto L_0x00f2
            r10.c(r11)
            goto L_0x0111
        L_0x00f2:
            b.a.a.a.r0.m r2 = r9.c
            r2.G(r11)
            b.a.a.a.r0.m r2 = r9.c
            byte[] r2 = r2.f734a
            r10.i(r2, r0, r11)
            b.a.a.a.r0.m r10 = r9.c
            r10.J(r4)
            b.a.a.a.r0.m r10 = r9.c
            r1.a(r10)
            b.a.a.a.r0.m r10 = r9.c
            int r11 = r10.b()
            r10.I(r11)
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.t.q.g(b.a.a.a.k0.f, b.a.a.a.k0.k):int");
    }

    public boolean h(f fVar) {
        byte[] bArr = new byte[14];
        fVar.h(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        fVar.j(bArr[13] & 7);
        fVar.h(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
