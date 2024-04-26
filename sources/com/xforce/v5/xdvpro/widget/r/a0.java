package com.xforce.v5.xdvpro.widget.r;

public class a0 implements o {

    /* renamed from: a  reason: collision with root package name */
    public float f1238a = 0.5f;

    public r a(r rVar) {
        float f = this.f1238a + 1.0f;
        float f2 = 1.0f - f;
        for (int i = 0; i < rVar.m(); i++) {
            for (int i2 = 0; i2 < rVar.i(); i2++) {
                float f3 = 0.2126f * f2;
                float f4 = 0.7152f * f2;
                float f5 = f4 + f;
                float f6 = 0.0722f * f2;
                float f7 = f6 + f;
                float l = (float) rVar.l(i, i2);
                float h = (float) rVar.h(i, i2);
                float f8 = f4 * h;
                float f9 = (float) rVar.f(i, i2);
                float f10 = f6 * f9;
                float f11 = ((f3 + f) * l) + f8 + f10;
                float f12 = l * f3;
                float f13 = (h * f5) + f12 + f10;
                float f14 = f12 + f8 + (f9 * f7);
                rVar.o(i, i2, f11 > 255.0f ? 255 : f11 < 0.0f ? 0 : (int) f11, f13 > 255.0f ? 255 : f13 < 0.0f ? 0 : (int) f13, f14 > 255.0f ? 255 : f14 < 0.0f ? 0 : (int) f14);
            }
        }
        return rVar;
    }
}
