package com.xforce.v5.xdvpro.widget.r;

import android.graphics.Color;

public class b implements o {

    /* renamed from: a  reason: collision with root package name */
    r f1239a;

    b() {
    }

    static int b(double d, double d2, int[] iArr) {
        int[] iArr2 = {(iArr[0] & 16711680) >> 16, (iArr[0] & 65280) >> 8, iArr[0] & 255};
        int[] iArr3 = {(iArr[1] & 16711680) >> 16, (iArr[1] & 65280) >> 8, iArr[1] & 255};
        int[] iArr4 = {(iArr[2] & 16711680) >> 16, (iArr[2] & 65280) >> 8, iArr[2] & 255};
        int[] iArr5 = {(16711680 & iArr[3]) >> 16, (iArr[3] & 65280) >> 8, iArr[3] & 255};
        int[] iArr6 = new int[3];
        for (int i = 0; i < 3; i++) {
            double d3 = (double) iArr2[i];
            double d4 = (double) (iArr3[i] - iArr2[i]);
            Double.isNaN(d4);
            Double.isNaN(d3);
            double d5 = d3 + (d4 * d);
            double d6 = (double) iArr4[i];
            double d7 = (double) (iArr5[i] - iArr4[i]);
            Double.isNaN(d7);
            Double.isNaN(d6);
            iArr6[i] = r.b((int) (d5 + (((d6 + (d7 * d)) - d5) * d2)));
        }
        return Color.rgb(iArr6[0], iArr6[1], iArr6[2]);
    }

    public r a(r rVar) {
        int i;
        int i2;
        r rVar2 = rVar;
        this.f1239a = rVar.clone();
        int m = rVar.m();
        int i3 = rVar.i();
        char c = 0;
        int i4 = 0;
        while (i4 < m) {
            int i5 = 0;
            while (i5 < i3) {
                double[] d = d(i4, i5, 0.0d, 0.0d);
                double d2 = d[c];
                double d3 = d[1];
                int i6 = i4;
                if (d2 <= -1.0d || d2 >= ((double) m) || d3 <= -1.0d || d3 >= ((double) i3)) {
                    i = i6;
                    i2 = -1;
                } else {
                    int i7 = d2 < 0.0d ? -1 : (int) d2;
                    int i8 = d3 < 0.0d ? -1 : (int) d3;
                    int i9 = i7 + 1;
                    int i10 = i8 + 1;
                    int[] iArr = new int[4];
                    iArr[0] = c(m, i3, i7, i8) ? this.f1239a.k(i7, i8) : -1;
                    iArr[1] = c(m, i3, i9, i8) ? this.f1239a.k(i9, i8) : -1;
                    iArr[2] = c(m, i3, i7, i10) ? this.f1239a.k(i7, i10) : -1;
                    iArr[3] = c(m, i3, i9, i10) ? this.f1239a.k(i9, i10) : -1;
                    double d4 = (double) i7;
                    Double.isNaN(d4);
                    double d5 = (double) i8;
                    Double.isNaN(d5);
                    i2 = b(d2 - d4, d3 - d5, iArr);
                    i = i6;
                }
                rVar2.n(i, i5, i2);
                i5++;
                i4 = i;
                c = 0;
            }
            i4++;
            c = 0;
        }
        return rVar2;
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i, int i2, int i3, int i4) {
        return i3 >= 0 && i3 < i && i4 >= 0 && i4 < i2;
    }

    /* access modifiers changed from: package-private */
    public double[] d(int i, int i2, double d, double d2) {
        throw null;
    }
}
