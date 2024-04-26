package com.xforce.v5.xdvpro.widget.r;

public class a implements o {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1237a = {167, 200, 230, 216, 181, 94, 72, 193, 242, 232, 36, 52, 222, 167, 200, 181, 126, 210, 94, 72, 232, 153, 111, 36, 52, 167, 200, 230, 216, 181, 94, 72, 193, 242, 232, 36, 52, 222, 167, 200, 181, 126, 210, 94, 72, 232, 153, 111, 36, 52, 167, 200, 230, 216, 181, 94, 72, 193, 242, 232, 36, 52, 222, 167, 200, 181, 126, 210, 94, 72, 232, 153, 111, 36, 52, 167, 200, 230, 216, 181, 94, 72, 193, 242, 232, 36, 52, 222, 167, 200, 181, 126, 210, 94, 72, 232, 153, 111, 36, 52};

    private void b(int i, int i2, r rVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int i7 = 0; i7 < 100; i7++) {
            int i8 = i7 / 10;
            int i9 = i + (i7 % 10);
            if (i9 < rVar.m() && (i3 = i2 + i8) < rVar.i()) {
                if (255 - rVar.l(i9, i3) > f1237a[i7]) {
                    i6 = 0;
                    i5 = 0;
                    i4 = 0;
                } else {
                    i6 = 255;
                    i5 = 255;
                    i4 = 255;
                }
                rVar.o(i9, i3, i6, i5, i4);
            }
        }
    }

    public r a(r rVar) {
        for (int i = 0; i < rVar.m(); i += 10) {
            for (int i2 = 0; i2 < rVar.i(); i2 += 10) {
                b(i, i2, rVar);
            }
        }
        return rVar;
    }
}
