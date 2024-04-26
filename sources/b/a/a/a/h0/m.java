package b.a.a.a.h0;

import b.a.a.a.r0.a;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class m {

    /* renamed from: a  reason: collision with root package name */
    private final int f285a;

    /* renamed from: b  reason: collision with root package name */
    private final int f286b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final short[] i;
    private int j;
    private short[] k;
    private int l;
    private short[] m;
    private int n;
    private short[] o;
    private int p = 0;
    private int q = 0;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v = 0;
    private int w;
    private int x;
    private int y;

    public m(int i2, int i3, float f2, float f3, int i4) {
        this.f285a = i2;
        this.f286b = i3;
        this.f = i2 / 400;
        int i5 = i2 / 65;
        this.g = i5;
        int i6 = i5 * 2;
        this.h = i6;
        this.i = new short[i6];
        this.j = i6;
        this.k = new short[(i6 * i3)];
        this.l = i6;
        this.m = new short[(i6 * i3)];
        this.n = i6;
        this.o = new short[(i6 * i3)];
        this.c = f2;
        this.d = f3;
        this.e = ((float) i2) / ((float) i4);
    }

    private void a(float f2, int i2) {
        int i3;
        int i4;
        if (this.s != i2) {
            int i5 = this.f285a;
            int i6 = (int) (((float) i5) / f2);
            while (true) {
                if (i6 <= 16384 && i5 <= 16384) {
                    break;
                }
                i6 /= 2;
                i5 /= 2;
            }
            n(i2);
            int i7 = 0;
            while (true) {
                int i8 = this.t;
                boolean z = true;
                if (i7 < i8 - 1) {
                    while (true) {
                        i3 = this.p;
                        int i9 = (i3 + 1) * i6;
                        i4 = this.q;
                        if (i9 <= i4 * i5) {
                            break;
                        }
                        g(1);
                        int i10 = 0;
                        while (true) {
                            int i11 = this.f286b;
                            if (i10 >= i11) {
                                break;
                            }
                            this.m[(this.s * i11) + i10] = m(this.o, (i11 * i7) + i10, i5, i6);
                            i10++;
                        }
                        this.q++;
                        this.s++;
                    }
                    int i12 = i3 + 1;
                    this.p = i12;
                    if (i12 == i5) {
                        this.p = 0;
                        if (i4 != i6) {
                            z = false;
                        }
                        a.f(z);
                        this.q = 0;
                    }
                    i7++;
                } else {
                    t(i8 - 1);
                    return;
                }
            }
        }
    }

    private void b(float f2) {
        int v2;
        int i2 = this.r;
        if (i2 >= this.h) {
            int i3 = 0;
            do {
                if (this.u > 0) {
                    v2 = c(i3);
                } else {
                    int h2 = h(this.k, i3, true);
                    int i4 = (((double) f2) > 1.0d ? 1 : (((double) f2) == 1.0d ? 0 : -1));
                    short[] sArr = this.k;
                    v2 = i4 > 0 ? h2 + v(sArr, i3, f2, h2) : l(sArr, i3, f2, h2);
                }
                i3 += v2;
            } while (this.h + i3 <= i2);
            u(i3);
        }
    }

    private int c(int i2) {
        int min = Math.min(this.h, this.u);
        d(this.k, i2, min);
        this.u -= min;
        return min;
    }

    private void d(short[] sArr, int i2, int i3) {
        g(i3);
        int i4 = this.f286b;
        System.arraycopy(sArr, i2 * i4, this.m, this.s * i4, i4 * i3);
        this.s += i3;
    }

    private void e(short[] sArr, int i2, int i3) {
        int i4 = this.h / i3;
        int i5 = this.f286b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.i[i8] = (short) (i9 / i6);
        }
    }

    private void f(int i2) {
        int i3 = this.r + i2;
        int i4 = this.j;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.j = i5;
            this.k = Arrays.copyOf(this.k, i5 * this.f286b);
        }
    }

    private void g(int i2) {
        int i3 = this.s + i2;
        int i4 = this.l;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.l = i5;
            this.m = Arrays.copyOf(this.m, i5 * this.f286b);
        }
    }

    private int h(short[] sArr, int i2, boolean z) {
        int i3;
        int i4 = this.f285a;
        int i5 = i4 > 4000 ? i4 / 4000 : 1;
        if (this.f286b == 1 && i5 == 1) {
            i3 = i(sArr, i2, this.f, this.g);
        } else {
            e(sArr, i2, i5);
            int i6 = i(this.i, 0, this.f / i5, this.g / i5);
            if (i5 != 1) {
                int i7 = i6 * i5;
                int i8 = i5 * 4;
                int i9 = i7 - i8;
                int i10 = i7 + i8;
                int i11 = this.f;
                if (i9 < i11) {
                    i9 = i11;
                }
                int i12 = this.g;
                if (i10 > i12) {
                    i10 = i12;
                }
                if (this.f286b == 1) {
                    i3 = i(sArr, i2, i9, i10);
                } else {
                    e(sArr, i2, 1);
                    i3 = i(this.i, 0, i9, i10);
                }
            } else {
                i3 = i6;
            }
        }
        int i13 = p(this.x, this.y, z) ? this.v : i3;
        this.w = this.x;
        this.v = i3;
        return i13;
    }

    private int i(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f286b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.x = i6 / i8;
        this.y = i9 / i7;
        return i8;
    }

    private int l(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((((float) i3) * f2) / (1.0f - f2));
        } else {
            this.u = (int) ((((float) i3) * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
            i4 = i3;
        }
        int i5 = i3 + i4;
        g(i5);
        int i6 = this.f286b;
        System.arraycopy(sArr, i2 * i6, this.m, this.s * i6, i6 * i3);
        o(i4, this.f286b, this.m, this.s + i3, sArr, i2 + i3, sArr, i2);
        this.s += i5;
        return i4;
    }

    private short m(short[] sArr, int i2, int i3, int i4) {
        short s2 = sArr[i2];
        short s3 = sArr[i2 + this.f286b];
        int i5 = this.q * i3;
        int i6 = this.p;
        int i7 = i6 * i4;
        int i8 = (i6 + 1) * i4;
        int i9 = i8 - i5;
        int i10 = i8 - i7;
        return (short) (((s2 * i9) + ((i10 - i9) * s3)) / i10);
    }

    private void n(int i2) {
        int i3 = this.s - i2;
        int i4 = this.t + i3;
        int i5 = this.n;
        if (i4 > i5) {
            int i6 = i5 + (i5 / 2) + i3;
            this.n = i6;
            this.o = Arrays.copyOf(this.o, i6 * this.f286b);
        }
        short[] sArr = this.m;
        int i7 = this.f286b;
        System.arraycopy(sArr, i2 * i7, this.o, this.t * i7, i7 * i3);
        this.s = i2;
        this.t += i3;
    }

    private static void o(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    private boolean p(int i2, int i3, boolean z) {
        if (i2 == 0 || this.v == 0) {
            return false;
        }
        return z ? i3 <= i2 * 3 && i2 * 2 > this.w * 3 : i2 > this.w;
    }

    private void q() {
        int i2 = this.s;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = f2 / f3;
        float f5 = this.e * f3;
        double d2 = (double) f4;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            b(f4);
        } else {
            d(this.k, 0, this.r);
            this.r = 0;
        }
        if (f5 != 1.0f) {
            a(f5, i2);
        }
    }

    private void t(int i2) {
        if (i2 != 0) {
            short[] sArr = this.o;
            int i3 = this.f286b;
            System.arraycopy(sArr, i2 * i3, sArr, 0, (this.t - i2) * i3);
            this.t -= i2;
        }
    }

    private void u(int i2) {
        int i3 = this.r - i2;
        short[] sArr = this.k;
        int i4 = this.f286b;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.r = i3;
    }

    private int v(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 >= 2.0f) {
            i4 = (int) (((float) i3) / (f2 - 1.0f));
        } else {
            this.u = (int) ((((float) i3) * (2.0f - f2)) / (f2 - 1.0f));
            i4 = i3;
        }
        g(i4);
        o(i4, this.f286b, this.m, this.s, sArr, i2, sArr, i2 + i3);
        this.s += i4;
        return i4;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f286b, this.s);
        shortBuffer.put(this.m, 0, this.f286b * min);
        int i2 = this.s - min;
        this.s = i2;
        short[] sArr = this.m;
        int i3 = this.f286b;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    public int k() {
        return this.s;
    }

    public void r() {
        int i2;
        int i3 = this.r;
        float f2 = this.c;
        float f3 = this.d;
        int i4 = this.s + ((int) ((((((float) i3) / (f2 / f3)) + ((float) this.t)) / (this.e * f3)) + 0.5f));
        f((this.h * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.h;
            int i6 = this.f286b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.k[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.r += i2 * 2;
        q();
        if (this.s > i4) {
            this.s = i4;
        }
        this.r = 0;
        this.u = 0;
        this.t = 0;
    }

    public void s(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f286b;
        int i3 = remaining / i2;
        f(i3);
        shortBuffer.get(this.k, this.r * this.f286b, ((i2 * i3) * 2) / 2);
        this.r += i3;
        q();
    }
}
