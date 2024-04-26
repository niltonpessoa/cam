package b.a.a.a.k0.s;

import b.a.a.a.k0.l;
import b.a.a.a.k0.m;
import b.a.a.a.k0.s.h;
import b.a.a.a.n;
import b.a.a.a.r0.f;
import b.a.a.a.r0.w;
import com.google.android.exoplayer2.ui.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class b extends h {
    /* access modifiers changed from: private */
    public f n;
    private a o;

    private class a implements f, l {

        /* renamed from: a  reason: collision with root package name */
        private long[] f401a;

        /* renamed from: b  reason: collision with root package name */
        private long[] f402b;
        private long c = -1;
        private long d = -1;

        public a() {
        }

        public long a(b.a.a.a.k0.f fVar) {
            long j = this.d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.d = -1;
            return j2;
        }

        public boolean b() {
            return true;
        }

        public l d() {
            return this;
        }

        public l.a e(long j) {
            int d2 = w.d(this.f401a, b.this.b(j), true, true);
            long a2 = b.this.a(this.f401a[d2]);
            m mVar = new m(a2, this.c + this.f402b[d2]);
            if (a2 < j) {
                long[] jArr = this.f401a;
                if (d2 != jArr.length - 1) {
                    int i = d2 + 1;
                    return new l.a(mVar, new m(b.this.a(jArr[i]), this.c + this.f402b[i]));
                }
            }
            return new l.a(mVar);
        }

        public long f(long j) {
            long b2 = b.this.b(j);
            this.d = this.f401a[w.d(this.f401a, b2, true, true)];
            return b2;
        }

        public void g(b.a.a.a.r0.m mVar) {
            mVar.K(1);
            int A = mVar.A() / 18;
            this.f401a = new long[A];
            this.f402b = new long[A];
            for (int i = 0; i < A; i++) {
                this.f401a[i] = mVar.q();
                this.f402b[i] = mVar.q();
                mVar.K(2);
            }
        }

        public void h(long j) {
            this.c = j;
        }

        public long i() {
            return b.this.n.b();
        }
    }

    b() {
    }

    private int m(b.a.a.a.r0.m mVar) {
        int i;
        int i2;
        int i3 = (mVar.f734a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                mVar.K(4);
                mVar.E();
                int x = i3 == 6 ? mVar.x() : mVar.D();
                mVar.J(0);
                return x + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case g.H /*14*/:
            case g.I /*15*/:
                i = 256;
                i2 = i3 - 8;
                break;
            default:
                return -1;
        }
        return i << i2;
    }

    private static boolean n(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean o(b.a.a.a.r0.m mVar) {
        return mVar.a() >= 5 && mVar.x() == 127 && mVar.z() == 1179402563;
    }

    /* access modifiers changed from: protected */
    public long e(b.a.a.a.r0.m mVar) {
        if (!n(mVar.f734a)) {
            return -1;
        }
        return (long) m(mVar);
    }

    /* access modifiers changed from: protected */
    public boolean h(b.a.a.a.r0.m mVar, long j, h.b bVar) {
        byte[] bArr = mVar.f734a;
        if (this.n == null) {
            this.n = new f(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, mVar.d());
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int a2 = this.n.a();
            f fVar = this.n;
            bVar.f411a = n.h((String) null, "audio/flac", (String) null, -1, a2, fVar.f723b, fVar.f722a, singletonList, (b.a.a.a.j0.a) null, 0, (String) null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            a aVar = new a();
            this.o = aVar;
            aVar.g(mVar);
            return true;
        } else if (!n(bArr)) {
            return true;
        } else {
            a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.h(j);
                bVar.f412b = this.o;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
