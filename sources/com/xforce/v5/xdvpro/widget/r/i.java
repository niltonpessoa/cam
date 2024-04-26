package com.xforce.v5.xdvpro.widget.r;

import com.xforce.v5.xdvpro.widget.r.o;

public class i extends t {

    /* renamed from: b  reason: collision with root package name */
    double f1258b;

    public i(int i) {
        double d = (double) (i < 1 ? 1 : i);
        Double.isNaN(d);
        this.f1258b = 1.0d / (d / 100.0d);
    }

    public int b(int i) {
        return o.a.b(Math.pow((double) i, this.f1258b) / (Math.pow(255.0d, this.f1258b) / 255.0d));
    }
}
