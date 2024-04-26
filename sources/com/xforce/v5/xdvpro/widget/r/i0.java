package com.xforce.v5.xdvpro.widget.r;

public class i0 implements o {

    /* renamed from: a  reason: collision with root package name */
    int f1259a;

    /* renamed from: b  reason: collision with root package name */
    double f1260b;
    double c;
    int d;
    int e;

    public i0(int i) {
        this(i, 0.0d, 0.0d);
    }

    public i0(int i, double d2, double d3) {
        this.f1259a = i < 1 ? 1 : i;
        if (d2 > 2.0d) {
            d2 = 2.0d;
        } else if (d2 < -2.0d) {
            d2 = 0.0d;
        }
        this.f1260b = d2;
        if (d3 > 2.0d) {
            d3 = 2.0d;
        } else if (d3 < -2.0d) {
            d3 = 0.0d;
        }
        this.c = d3;
    }

    public r a(r rVar) {
        i0 i0Var = this;
        int m = rVar.m();
        int i = rVar.i();
        double d2 = (double) m;
        double d3 = i0Var.f1260b;
        Double.isNaN(d2);
        int i2 = 32768;
        i0Var.d = ((int) (d2 * d3 * 32768.0d)) + (m * 32768);
        double d4 = (double) i;
        double d5 = i0Var.c;
        Double.isNaN(d4);
        i0Var.e = ((int) (d4 * d5 * 32768.0d)) + (i * 32768);
        r d6 = rVar.clone();
        int i3 = 0;
        while (i3 < m) {
            int i4 = 0;
            while (i4 < i) {
                int l = d6.l(i3, i4) * 255;
                int h = d6.h(i3, i4) * 255;
                int f = d6.f(i3, i4) * 255;
                int i5 = (i3 * 65536) - i0Var.d;
                int i6 = (i4 * 65536) - i0Var.e;
                int i7 = 255;
                int i8 = 0;
                while (i8 < 64) {
                    int i9 = i0Var.f1259a;
                    i5 -= ((i5 / 16) * i9) / 1024;
                    i6 -= ((i6 / 16) * i9) / 1024;
                    int i10 = ((i0Var.d + i5) + i2) / 65536;
                    int i11 = ((i0Var.e + i6) + i2) / 65536;
                    if (i10 >= 0 && i10 < m && i11 >= 0 && i11 < i) {
                        l += d6.l(i10, i11) * 255;
                        h += d6.h(i10, i11) * 255;
                        f += d6.f(i10, i11) * 255;
                        i7 += 255;
                    }
                    i8++;
                    i0Var = this;
                    i2 = 32768;
                }
                rVar.o(i3, i4, r.b(l / i7), r.b(h / i7), r.b(f / i7));
                i4++;
                i0Var = this;
                i2 = 32768;
            }
            i3++;
            i0Var = this;
            i2 = 32768;
        }
        return rVar;
    }
}
