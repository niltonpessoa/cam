package com.xforce.v5.xdvpro.widget.r;

import android.graphics.Color;

public class f implements o {

    /* renamed from: a  reason: collision with root package name */
    double f1247a;

    /* renamed from: b  reason: collision with root package name */
    double f1248b;
    double[] c = new double[256];

    public f(int i, int i2) {
        int i3 = i2;
        double[] f = f(i, this.f1247a, 0.0d, this.f1248b);
        this.f1247a = f[0];
        double d = f[1];
        double d2 = f[2];
        this.f1248b = d2;
        double d3 = (double) i3;
        Double.isNaN(d3);
        double d4 = d3 / 255.0d;
        double d5 = d2 * d4 * d4;
        this.f1248b = d5;
        this.f1248b = d5 >= 1.0d ? 1.0d : d5;
        for (int i4 = 0; i4 < 256; i4++) {
            double[] f2 = f(Color.rgb(i4, i4, i4), 0.0d, 0.0d, 0.0d);
            double d6 = f2[0];
            double d7 = f2[1];
            double d8 = f2[2];
            double abs = (double) (128 - Math.abs(i3 - 128));
            Double.isNaN(abs);
            double d9 = d7 * (((abs / 128.0d) / 9.0d) + 1.0d);
            double[] dArr = this.c;
            if (d9 >= 1.0d) {
                d9 = 1.0d;
            }
            dArr[i4] = d9;
        }
    }

    static int b(double d, double d2, double d3) {
        return Color.rgb(r.b((int) (d * 255.0d)), r.b((int) (d2 * 255.0d)), r.b((int) (d3 * 255.0d)));
    }

    static int c(int i, int i2, int i3) {
        return (((i * 30) + (i2 * 59)) + (i2 * 11)) / 100;
    }

    static double d(double d, double d2, double d3) {
        double d4;
        if (d3 > 6.0d) {
            d3 -= 6.0d;
        } else if (d3 < 0.0d) {
            d3 += 6.0d;
        }
        if (d3 < 1.0d) {
            d4 = (d2 - d) * d3;
        } else if (d3 < 3.0d) {
            return d2;
        } else {
            if (d3 >= 4.0d) {
                return d;
            }
            d4 = (d2 - d) * (4.0d - d3);
        }
        return d + d4;
    }

    static int e(double d, double d2, double d3) {
        if (d3 <= 0.0d && d3 >= 0.0d) {
            return b(d2, d2, d2);
        }
        double d4 = d2 > 0.5d ? (d2 + d3) - (d2 * d3) : (d3 + 1.0d) * d2;
        double d5 = 6.0d * d;
        double d6 = (d2 * 2.0d) - d4;
        double d7 = d4;
        return b(d(d6, d7, d5 + 2.0d), d(d6, d7, d5), d(d6, d7, d5 - 2.0d));
    }

    static double[] f(int i, double d, double d2, double d3) {
        double d4;
        double d5;
        int i2 = i;
        int i3 = (16711680 & i2) >> 16;
        int i4 = (65280 & i2) >> 8;
        int i5 = i2 & 255;
        int max = Math.max(i3, Math.max(i4, i5));
        int min = Math.min(i3, Math.min(i4, i5));
        double d6 = (double) (max + min);
        Double.isNaN(d6);
        double d7 = (d6 / 2.0d) / 255.0d;
        if (max == min) {
            return new double[]{0.0d, d7, 0.0d};
        }
        double d8 = (double) i3;
        Double.isNaN(d8);
        double d9 = (double) i4;
        Double.isNaN(d9);
        double d10 = d9 / 255.0d;
        double d11 = (double) i5;
        Double.isNaN(d11);
        double d12 = d8 / 255.0d;
        double d13 = (double) max;
        Double.isNaN(d13);
        double d14 = d13 / 255.0d;
        double d15 = d11 / 255.0d;
        double d16 = (double) min;
        Double.isNaN(d16);
        double d17 = d16 / 255.0d;
        double d18 = d14 - d17;
        if (d7 < 0.5d) {
            d5 = d18 / (d14 + d17);
            d4 = 2.0d;
        } else {
            d4 = 2.0d;
            d5 = d18 / ((2.0d - d14) - d17);
        }
        double d19 = (i3 == max ? (d10 - d15) / d18 : i4 == max ? ((d15 - d12) / d18) + d4 : ((d12 - d10) / d18) + 4.0d) / 6.0d;
        if (d19 < 0.0d) {
            d19 += 1.0d;
        }
        return new double[]{d19, d7, d5};
    }

    public r a(r rVar) {
        for (int i = 0; i < rVar.m(); i++) {
            for (int i2 = 0; i2 < rVar.i(); i2++) {
                rVar.n(i, i2, e(this.f1247a, this.c[c(rVar.l(i, i2), rVar.h(i, i2), rVar.f(i, i2))], this.f1248b));
            }
        }
        return rVar;
    }
}
