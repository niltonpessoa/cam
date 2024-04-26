package com.xforce.v5.xdvpro.widget.r;

public class e0 implements o {

    /* renamed from: a  reason: collision with root package name */
    private p f1245a;

    /* renamed from: b  reason: collision with root package name */
    private float[][] f1246b = null;
    private double c = 0.5d;
    private double d = 0.5d;

    public e0(p pVar, double d2, double d3) {
        this.f1245a = pVar;
        this.c = Math.max(0.0d, Math.min(1.0d, d2));
        this.d = Math.max(0.0d, Math.min(1.0d, d3));
    }

    public r a(r rVar) {
        r rVar2 = rVar;
        int m = rVar.m();
        int i = rVar.i();
        p pVar = this.f1245a;
        if (pVar != null) {
            this.f1246b = pVar.a(m, i);
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = 0;
            while (i3 < m) {
                double d2 = (double) this.f1246b[i2][i3];
                int l = rVar2.l(i3, i2);
                int h = rVar2.h(i3, i2);
                int f = rVar2.f(i3, i2);
                double d3 = this.d;
                int i4 = i2;
                double d4 = (double) l;
                Double.isNaN(d4);
                int i5 = m;
                double d5 = this.c;
                Double.isNaN(d4);
                Double.isNaN(d2);
                byte min = (byte) ((int) Math.min(255.0d, (d3 * d4) + (d5 * d4 * d2)));
                double d6 = this.d;
                double d7 = (double) h;
                Double.isNaN(d7);
                double d8 = this.c;
                Double.isNaN(d7);
                Double.isNaN(d2);
                byte min2 = (byte) ((int) Math.min(255.0d, (d6 * d7) + (d8 * d7 * d2)));
                double d9 = this.d;
                double d10 = (double) f;
                Double.isNaN(d10);
                double d11 = this.c;
                Double.isNaN(d10);
                Double.isNaN(d2);
                rVar.o(i3, i4, min, min2, (byte) ((int) Math.min(255.0d, (d9 * d10) + (d11 * d10 * d2))));
                i3++;
                i2 = i4;
                m = i5;
                i = i;
            }
            int i6 = m;
            int i7 = i;
            i2++;
        }
        return rVar2;
    }
}
