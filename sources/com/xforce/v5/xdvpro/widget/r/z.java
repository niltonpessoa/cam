package com.xforce.v5.xdvpro.widget.r;

public class z {

    /* renamed from: a  reason: collision with root package name */
    private double f1286a = 0.0625d;

    /* renamed from: b  reason: collision with root package name */
    private double f1287b = 1.0d;
    private double c = 0.65d;
    private int d = 4;

    public z(double d2, double d3, double d4, int i) {
        this.f1286a = d2;
        this.f1287b = d3;
        this.c = d4;
        this.d = Math.max(1, i);
    }

    private double a(double d2, double d3, double d4) {
        double cos = (1.0d - Math.cos(d4 * 3.141592653589793d)) * 0.5d;
        return (d2 * (1.0d - cos)) + (d3 * cos);
    }

    private double c(int i, int i2) {
        int i3 = i + (i2 * 57);
        int i4 = i3 ^ (i3 << 13);
        double d2 = (double) (((i4 * ((i4 * i4 * 15731) + 789221)) + 1376312589) & Integer.MAX_VALUE);
        Double.isNaN(d2);
        return 1.0d - (d2 / 1.073741824E9d);
    }

    private double d(double d2, double d3) {
        double d4 = d2;
        double d5 = d3;
        int i = (int) d4;
        int i2 = (int) d5;
        double d6 = (double) i;
        Double.isNaN(d6);
        double d7 = d4 - d6;
        double d8 = (double) i2;
        Double.isNaN(d8);
        double d9 = d5 - d8;
        double c2 = c(i, i2);
        int i3 = i + 1;
        double c3 = c(i3, i2);
        int i4 = i2 + 1;
        double c4 = c(i, i4);
        double c5 = c(i3, i4);
        double d10 = d7;
        return a(a(c2, c3, d10), a(c4, c5, d10), d9);
    }

    public double b(double d2, double d3) {
        double d4 = this.f1286a;
        double d5 = this.f1287b;
        double d6 = 0.0d;
        for (int i = 0; i < this.d; i++) {
            d6 += d(d2 * d4, d3 * d4) * d5;
            d4 *= 2.0d;
            d5 *= this.c;
        }
        return d6;
    }
}
