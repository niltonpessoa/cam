package b.a.a.a.k0.t;

import android.util.Pair;
import b.a.a.a.k0.g;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.k;
import b.a.a.a.r0.m;
import java.util.Arrays;

public final class i implements h {
    private static final double[] n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f434a;

    /* renamed from: b  reason: collision with root package name */
    private n f435b;
    private boolean c;
    private long d;
    private final boolean[] e = new boolean[4];
    private final a f = new a(128);
    private long g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private boolean l;
    private boolean m;

    private static final class a {
        private static final byte[] e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f436a;

        /* renamed from: b  reason: collision with root package name */
        public int f437b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f436a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.f437b;
                if (length < i4 + i3) {
                    this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.d, this.f437b, i3);
                this.f437b += i3;
            }
        }

        public boolean b(int i, int i2) {
            if (this.f436a) {
                int i3 = this.f437b - i2;
                this.f437b = i3;
                if (this.c == 0 && i == 181) {
                    this.c = i3;
                } else {
                    this.f436a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f436a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f436a = false;
            this.f437b = 0;
            this.c = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<b.a.a.a.n, java.lang.Long> b(b.a.a.a.k0.t.i.a r20, java.lang.String r21) {
        /*
            r0 = r20
            byte[] r1 = r0.d
            int r2 = r0.f437b
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 4
            byte r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 5
            byte r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 6
            byte r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r2
            int r7 = r5 >> 4
            r13 = r3 | r7
            r3 = r5 & 15
            int r3 = r3 << 8
            r14 = r3 | r6
            r3 = 7
            byte r5 = r1[r3]
            r5 = r5 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r2
            r6 = 2
            if (r5 == r6) goto L_0x0043
            r6 = 3
            if (r5 == r6) goto L_0x003d
            if (r5 == r2) goto L_0x0037
            r2 = 1065353216(0x3f800000, float:1.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004c
        L_0x0037:
            int r2 = r14 * 121
            float r2 = (float) r2
            int r5 = r13 * 100
            goto L_0x0048
        L_0x003d:
            int r2 = r14 * 16
            float r2 = (float) r2
            int r5 = r13 * 9
            goto L_0x0048
        L_0x0043:
            int r2 = r14 * 4
            float r2 = (float) r2
            int r5 = r13 * 3
        L_0x0048:
            float r5 = (float) r5
            float r2 = r2 / r5
            r18 = r2
        L_0x004c:
            r10 = 0
            r11 = -1
            r12 = -1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r16 = java.util.Collections.singletonList(r1)
            r17 = -1
            r19 = 0
            java.lang.String r9 = "video/mpeg2"
            r8 = r21
            b.a.a.a.n r2 = b.a.a.a.n.p(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = 0
            byte r3 = r1[r3]
            r3 = r3 & 15
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0098
            double[] r7 = n
            int r8 = r7.length
            if (r3 >= r8) goto L_0x0098
            r5 = r7[r3]
            int r0 = r0.c
            int r0 = r0 + 9
            byte r3 = r1[r0]
            r3 = r3 & 96
            int r3 = r3 >> r4
            byte r0 = r1[r0]
            r0 = r0 & 31
            if (r3 == r0) goto L_0x0091
            double r3 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 + r7
            int r0 = r0 + 1
            double r0 = (double) r0
            java.lang.Double.isNaN(r0)
            double r3 = r3 / r0
            double r5 = r5 * r3
        L_0x0091:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r5
            long r5 = (long) r0
        L_0x0098:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.t.i.b(b.a.a.a.k0.t.i$a, java.lang.String):android.util.Pair");
    }

    public void a() {
        k.a(this.e);
        this.f.c();
        this.g = 0;
        this.h = false;
    }

    public void c(m mVar) {
        m mVar2 = mVar;
        int c2 = mVar.c();
        int d2 = mVar.d();
        byte[] bArr = mVar2.f734a;
        this.g += (long) mVar.a();
        this.f435b.a(mVar2, mVar.a());
        while (true) {
            int c3 = k.c(bArr, c2, d2, this.e);
            if (c3 == d2) {
                break;
            }
            int i2 = c3 + 3;
            byte b2 = mVar2.f734a[i2] & 255;
            if (!this.c) {
                int i3 = c3 - c2;
                if (i3 > 0) {
                    this.f.a(bArr, c2, c3);
                }
                if (this.f.b(b2, i3 < 0 ? -i3 : 0)) {
                    Pair<b.a.a.a.n, Long> b3 = b(this.f, this.f434a);
                    this.f435b.c((b.a.a.a.n) b3.first);
                    this.d = ((Long) b3.second).longValue();
                    this.c = true;
                }
            }
            if (b2 == 0 || b2 == 179) {
                int i4 = d2 - c3;
                if (this.h && this.m && this.c) {
                    this.f435b.d(this.k, this.l ? 1 : 0, ((int) (this.g - this.j)) - i4, i4, (n.a) null);
                }
                boolean z = this.h;
                if (!z || this.m) {
                    this.j = this.g - ((long) i4);
                    long j2 = this.i;
                    if (j2 == -9223372036854775807L) {
                        j2 = z ? this.k + this.d : 0;
                    }
                    this.k = j2;
                    this.l = false;
                    this.i = -9223372036854775807L;
                    this.h = true;
                }
                this.m = b2 == 0;
            } else if (b2 == 184) {
                this.l = true;
            }
            c2 = i2;
        }
        if (!this.c) {
            this.f.a(bArr, c2, d2);
        }
    }

    public void d(long j2, boolean z) {
        this.i = j2;
    }

    public void e() {
    }

    public void f(g gVar, w.d dVar) {
        dVar.a();
        this.f434a = dVar.b();
        this.f435b = gVar.f(dVar.c(), 2);
    }
}
