package com.xforce.v5.xdvpro.widget.r;

import com.xforce.v5.xdvpro.widget.r.o;

public class d extends b {

    /* renamed from: b  reason: collision with root package name */
    double f1242b;
    double c;
    double d;

    public d(int i) {
        this(i, 0.0d, 0.0d);
    }

    public d(int i, double d2, double d3) {
        double d4 = (double) i;
        Double.isNaN(d4);
        this.f1242b = d4 / 100.0d;
        this.c = o.a.c(d2, -1.0d, 1.0d);
        this.d = o.a.c(d3, -1.0d, 1.0d);
    }

    public double[] d(int i, int i2, double d2, double d3) {
        double m = (double) this.f1239a.m();
        Double.isNaN(m);
        double d4 = m / 2.0d;
        double i3 = (double) this.f1239a.i();
        Double.isNaN(i3);
        double d5 = i3 / 2.0d;
        double d6 = d4 < d5 ? d4 : d5;
        double d7 = d4 + (this.c * d4);
        double d8 = d5 + (this.d * d5);
        double d9 = (double) i;
        Double.isNaN(d9);
        double d10 = d9 - d7;
        double d11 = (double) i2;
        Double.isNaN(d11);
        double d12 = d11 - d8;
        double sqrt = 1.0d - (Math.sqrt((d10 * d10) + (d12 * d12)) / d6);
        if (sqrt > 0.0d) {
            double d13 = 1.0d - ((this.f1242b * sqrt) * sqrt);
            double m2 = (double) this.f1239a.m();
            Double.isNaN(m2);
            double c2 = o.a.c(d7 + (d10 * d13), 0.0d, m2 - 1.0d);
            double i4 = (double) this.f1239a.i();
            Double.isNaN(i4);
            d11 = o.a.c(d8 + (d12 * d13), 0.0d, i4 - 1.0d);
            d9 = c2;
        }
        return new double[]{d9, d11};
    }
}
