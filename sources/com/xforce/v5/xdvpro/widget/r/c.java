package com.xforce.v5.xdvpro.widget.r;

public class c implements o {
    public r a(r rVar) {
        for (int i = 0; i < rVar.m(); i++) {
            for (int i2 = 0; i2 < rVar.i(); i2++) {
                int l = rVar.l(i, i2);
                int h = rVar.h(i, i2);
                int f = rVar.f(i, i2);
                double d = (double) l;
                Double.isNaN(d);
                double d2 = (double) f;
                Double.isNaN(d2);
                double d3 = (double) h;
                Double.isNaN(d3);
                int i3 = (int) ((d * 0.3d) + (d2 * 0.59d) + (d3 * 0.11d));
                rVar.o(i, i2, i3, i3, i3);
            }
        }
        return rVar;
    }
}
