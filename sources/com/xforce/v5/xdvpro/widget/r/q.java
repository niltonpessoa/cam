package com.xforce.v5.xdvpro.widget.r;

import com.xforce.v5.xdvpro.widget.r.o;

public class q implements o {

    /* renamed from: a  reason: collision with root package name */
    double f1269a;

    /* renamed from: b  reason: collision with root package name */
    double f1270b;
    double c;

    public q(int i) {
        double d = (double) (i < 1 ? 1 : i);
        Double.isNaN(d);
        this.f1269a = 3.141592653589793d / d;
    }

    public r a(r rVar) {
        r rVar2 = rVar;
        double m = (double) rVar.m();
        double i = (double) rVar.i();
        r d = rVar.clone();
        int i2 = 0;
        while (true) {
            double d2 = (double) i2;
            double d3 = 1.0d;
            Double.isNaN(m);
            double d4 = m - 1.0d;
            if (d2 >= d4) {
                return rVar2;
            }
            int i3 = i2;
            int i4 = 0;
            while (true) {
                double d5 = (double) i4;
                Double.isNaN(i);
                double d6 = d4;
                double d7 = i - d3;
                if (d5 >= d7) {
                    break;
                }
                int i5 = i3;
                int l = rVar2.l(i5, i4);
                r rVar3 = d;
                int h = rVar2.h(i5, i4);
                int f = rVar2.f(i5, i4);
                Double.isNaN(m);
                Double.isNaN(m);
                Double.isNaN(i);
                Double.isNaN(i);
                int i6 = i5;
                double sqrt = Math.sqrt((m * m) + (i * i)) / 2.0d;
                this.f1270b = sqrt;
                double d8 = d7;
                this.c = (double) ((int) (sqrt / 2.0d));
                Double.isNaN(m);
                Double.isNaN(d2);
                double d9 = (d2 - (m / 2.0d)) / sqrt;
                Double.isNaN(i);
                Double.isNaN(d5);
                double d10 = (d5 - (i / 2.0d)) / sqrt;
                double d11 = m;
                double d12 = i;
                double d13 = this.f1269a;
                double floor = (Math.floor((Math.atan2(d10, d9) / 2.0d) / this.f1269a) * 2.0d * d13) + d13;
                double sqrt2 = Math.sqrt((d9 * d9) + (d10 * d10));
                Double.isNaN(d2);
                Double.isNaN(d5);
                double d14 = d6;
                int a2 = o.a.a((int) (d2 - (this.c * Math.cos(floor))), 0, (int) d14);
                int a3 = o.a.a((int) (d5 - (this.c * Math.sin(floor))), 0, (int) d8);
                double d15 = (double) l;
                r rVar4 = rVar3;
                int i7 = f;
                double l2 = (double) (rVar4.l(a2, a3) - l);
                Double.isNaN(l2);
                Double.isNaN(d15);
                int b2 = o.a.b(d15 + (l2 * sqrt2));
                int i8 = h;
                double d16 = (double) i8;
                double d17 = d2;
                double h2 = (double) (rVar4.h(a2, a3) - i8);
                Double.isNaN(h2);
                Double.isNaN(d16);
                int b3 = o.a.b(d16 + (h2 * sqrt2));
                int i9 = i7;
                double d18 = (double) i9;
                double f2 = (double) (rVar4.f(a2, a3) - i9);
                Double.isNaN(f2);
                Double.isNaN(d18);
                int b4 = o.a.b(d18 + (sqrt2 * f2));
                int i10 = i6;
                int i11 = i4;
                double d19 = d17;
                rVar.o(i10, i11, b2, b3, b4);
                i4 = i11 + 1;
                d4 = d14;
                d = rVar4;
                i3 = i10;
                d2 = d19;
                i = d12;
                m = d11;
                d3 = 1.0d;
            }
            double d20 = m;
            double d21 = i;
            r rVar5 = d;
            i2 = i3 + 1;
            i = d21;
        }
    }
}
