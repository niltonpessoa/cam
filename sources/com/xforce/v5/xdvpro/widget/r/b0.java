package com.xforce.v5.xdvpro.widget.r;

public class b0 implements o {

    /* renamed from: a  reason: collision with root package name */
    int f1240a = 1;

    public r a(r rVar) {
        r rVar2 = rVar;
        int i = rVar.i();
        int m = rVar.m();
        r d = rVar.clone();
        rVar2.c(16777215);
        int i2 = 1;
        int[] iArr = {-1, -1, -1, -1, this.f1240a + 8, -1, -1, -1, -1};
        int i3 = 1;
        while (i3 < m - 1) {
            int i4 = 1;
            while (i4 < i - 1) {
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i5 <= i2) {
                    int i10 = -1;
                    while (i10 <= i2) {
                        int i11 = i3 + i10;
                        int i12 = i4 + i5;
                        int l = d.l(i11, i12);
                        int h = d.h(i11, i12);
                        int f = d.f(i11, i12);
                        i6 += l * iArr[i9];
                        i7 += h * iArr[i9];
                        i8 += f * iArr[i9];
                        i9++;
                        i10++;
                        i2 = 1;
                    }
                    i5++;
                    i2 = 1;
                }
                int b2 = r.b(i6);
                int b3 = r.b(i7);
                int i13 = b3;
                rVar.o(i3 - 1, i4 - 1, b2, i13, r.b(i8));
                i4++;
                i2 = 1;
            }
            i3++;
            i2 = 1;
        }
        return rVar2;
    }
}
