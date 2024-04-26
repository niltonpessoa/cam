package com.xforce.v5.xdvpro.widget.r;

public class l implements o {

    /* renamed from: a  reason: collision with root package name */
    public k f1264a = new k();

    /* renamed from: b  reason: collision with root package name */
    public float f1265b;
    public float c;

    public r a(r rVar) {
        y b2 = this.f1264a.b(256);
        int[] iArr = b2.c;
        int[] iArr2 = b2.f1285b;
        int[] iArr3 = b2.f1284a;
        r d = rVar.clone();
        d.c(-1);
        int i = (int) (this.f1265b * 255.0f);
        float f = this.c + 1.0f;
        int i2 = ((int) (f * f * 32768.0f)) + 1;
        int i3 = 0;
        while (true) {
            int[] iArr4 = rVar.e;
            if (i3 >= iArr4.length) {
                return d;
            }
            int i4 = 255;
            int i5 = (((((iArr4[i3] & 16711680) >>> 16) * 6966) + (((iArr4[i3] & 65280) >>> 8) * 23436)) + ((iArr4[i3] & 255) * 2366)) >> 15;
            if (i != 0) {
                i5 += i;
                if (i5 > 255) {
                    i5 = 255;
                } else if (i5 < 0) {
                    i5 = 0;
                }
            }
            if (i2 != 32769) {
                int i6 = (((i5 - 128) * i2) >> 15) + 128;
                if (i6 <= 255) {
                    i4 = i6 < 0 ? 0 : i6;
                }
                i5 = i4;
            }
            d.e[i3] = ((iArr[i5] << 16) - 16777216) + (iArr2[i5] << 8) + iArr3[i5];
            i3++;
        }
    }
}
