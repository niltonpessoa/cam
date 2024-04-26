package b.a.a.a.o0.o;

import android.graphics.Bitmap;
import b.a.a.a.o0.b;
import b.a.a.a.o0.c;
import b.a.a.a.o0.e;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class a extends c {
    private final m n = new m();
    private final C0037a o = new C0037a();

    /* renamed from: b.a.a.a.o0.o.a$a  reason: collision with other inner class name */
    private static final class C0037a {

        /* renamed from: a  reason: collision with root package name */
        private final m f631a = new m();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f632b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* access modifiers changed from: private */
        public void e(m mVar, int i2) {
            int A;
            if (i2 >= 4) {
                mVar.K(3);
                int i3 = i2 - 4;
                if ((mVar.x() & 128) != 0) {
                    if (i3 >= 7 && (A = mVar.A()) >= 4) {
                        this.h = mVar.D();
                        this.i = mVar.D();
                        this.f631a.G(A - 4);
                        i3 -= 7;
                    } else {
                        return;
                    }
                }
                int c2 = this.f631a.c();
                int d2 = this.f631a.d();
                if (c2 < d2 && i3 > 0) {
                    int min = Math.min(i3, d2 - c2);
                    mVar.g(this.f631a.f734a, c2, min);
                    this.f631a.J(c2 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void f(m mVar, int i2) {
            if (i2 >= 19) {
                this.d = mVar.D();
                this.e = mVar.D();
                mVar.K(11);
                this.f = mVar.D();
                this.g = mVar.D();
            }
        }

        /* access modifiers changed from: private */
        public void g(m mVar, int i2) {
            if (i2 % 5 == 2) {
                mVar.K(2);
                Arrays.fill(this.f632b, 0);
                int i3 = i2 / 5;
                int i4 = 0;
                while (i4 < i3) {
                    int x = mVar.x();
                    int x2 = mVar.x();
                    int x3 = mVar.x();
                    int x4 = mVar.x();
                    int x5 = mVar.x();
                    double d2 = (double) x2;
                    double d3 = (double) (x3 - 128);
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    int i5 = i4;
                    double d4 = (double) (x4 - 128);
                    Double.isNaN(d4);
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    Double.isNaN(d2);
                    int[] iArr = this.f632b;
                    int i6 = w.i((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255) << 8;
                    iArr[x] = w.i((int) (d2 + (d4 * 1.772d)), 0, 255) | i6 | (x5 << 24) | (w.i((int) ((1.402d * d3) + d2), 0, 255) << 16);
                    i4 = i5 + 1;
                }
                this.c = true;
            }
        }

        public b d() {
            int x;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.f631a.d() == 0 || this.f631a.c() != this.f631a.d() || !this.c) {
                return null;
            }
            this.f631a.J(0);
            int i2 = this.h * this.i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int x2 = this.f631a.x();
                if (x2 != 0) {
                    x = i3 + 1;
                    iArr[i3] = this.f632b[x2];
                } else {
                    int x3 = this.f631a.x();
                    if (x3 != 0) {
                        x = ((x3 & 64) == 0 ? x3 & 63 : ((x3 & 63) << 8) | this.f631a.x()) + i3;
                        Arrays.fill(iArr, i3, x, (x3 & 128) == 0 ? 0 : this.f632b[this.f631a.x()]);
                    }
                }
                i3 = x;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888);
            int i4 = this.d;
            float f2 = ((float) this.f) / ((float) i4);
            int i5 = this.e;
            return new b(createBitmap, f2, 0, ((float) this.g) / ((float) i5), 0, ((float) this.h) / ((float) i4), ((float) this.i) / ((float) i5));
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.f631a.G(0);
            this.c = false;
        }
    }

    public a() {
        super("PgsDecoder");
    }

    private static b C(m mVar, C0037a aVar) {
        int d = mVar.d();
        int x = mVar.x();
        int D = mVar.D();
        int c = mVar.c() + D;
        b bVar = null;
        if (c > d) {
            mVar.J(d);
            return null;
        }
        if (x != 128) {
            switch (x) {
                case 20:
                    aVar.g(mVar, D);
                    break;
                case 21:
                    aVar.e(mVar, D);
                    break;
                case 22:
                    aVar.f(mVar, D);
                    break;
            }
        } else {
            bVar = aVar.d();
            aVar.h();
        }
        mVar.J(c);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public e z(byte[] bArr, int i, boolean z) {
        this.n.H(bArr, i);
        this.o.h();
        ArrayList arrayList = new ArrayList();
        while (this.n.a() >= 3) {
            b C = C(this.n, this.o);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
