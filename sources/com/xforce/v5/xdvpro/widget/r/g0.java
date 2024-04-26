package com.xforce.v5.xdvpro.widget.r;

public class g0 implements o {

    /* renamed from: a  reason: collision with root package name */
    public float f1253a;

    public g0() {
        this.f1253a = 0.5f;
        this.f1253a = 0.5f;
    }

    public r a(r rVar) {
        int i;
        int i2;
        r rVar2 = rVar;
        if (rVar.m() > rVar.i()) {
            i2 = rVar.i() * 32768;
            i = rVar.m();
        } else {
            i2 = rVar.m() * 32768;
            i = rVar.i();
        }
        int i3 = i2 / i;
        int m = rVar.m() >> 1;
        int i4 = rVar.i() >> 1;
        int i5 = (m * m) + (i4 * i4);
        int i6 = (int) (((float) i5) * (1.0f - this.f1253a));
        int i7 = i5 - i6;
        for (int i8 = 0; i8 < rVar.m(); i8++) {
            int i9 = 0;
            while (i9 < rVar.i()) {
                int l = rVar2.l(i8, i9);
                int h = rVar2.h(i8, i9);
                int f = rVar2.f(i8, i9);
                int i10 = m - i8;
                int i11 = i4 - i9;
                int i12 = m;
                if (rVar.m() > rVar.i()) {
                    i10 = (i10 * i3) >> 15;
                } else {
                    i11 = (i11 * i3) >> 15;
                }
                int i13 = (i10 * i10) + (i11 * i11);
                if (i13 > i6) {
                    int i14 = ((i5 - i13) << 8) / i7;
                    int i15 = i14 * i14;
                    int i16 = (l * i15) >> 16;
                    int i17 = (h * i15) >> 16;
                    int i18 = (f * i15) >> 16;
                    if (i16 > 255) {
                        i16 = 255;
                    } else if (i16 < 0) {
                        i16 = 0;
                    }
                    l = (byte) i16;
                    if (i17 > 255) {
                        i17 = 255;
                    } else if (i17 < 0) {
                        i17 = 0;
                    }
                    h = (byte) i17;
                    if (i18 > 255) {
                        i18 = 255;
                    } else if (i18 < 0) {
                        i18 = 0;
                    }
                    f = (byte) i18;
                }
                rVar.o(i8, i9, l, h, f);
                i9++;
                m = i12;
            }
            int i19 = m;
        }
        return rVar2;
    }
}
