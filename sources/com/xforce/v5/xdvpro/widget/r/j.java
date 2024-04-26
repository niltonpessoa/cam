package com.xforce.v5.xdvpro.widget.r;

public class j implements o {

    /* renamed from: b  reason: collision with root package name */
    protected static int f1261b = 3;

    /* renamed from: a  reason: collision with root package name */
    public float f1262a = 0.75f;

    public r a(r rVar) {
        int m = rVar.m();
        int i = rVar.i();
        float[] b2 = b(d(rVar, m, i), m, i);
        int i2 = (f1261b * 2) + m;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = ((i3 + 3) * i2) + 3;
            for (int i5 = 0; i5 < m; i5++) {
                int i6 = (i4 + i5) * 3;
                rVar.o(i5, i3, (byte) ((int) (b2[i6] * 255.0f)), (byte) ((int) (b2[i6 + 1] * 255.0f)), (byte) ((int) (b2[i6 + 2] * 255.0f)));
            }
        }
        return rVar;
    }

    /* access modifiers changed from: package-private */
    public float[] b(float[] fArr, int i, int i2) {
        float[] fArr2 = fArr;
        int length = fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
        int i3 = f1261b;
        int i4 = i + (i3 * 2);
        int i5 = i2 + (i3 * 2);
        float f = this.f1262a;
        float f2 = f * f;
        float f3 = f2 * f;
        float f4 = f * 2.44413f;
        float f5 = 1.4281f * f2;
        float f6 = f3 * 0.422205f;
        float f7 = 1.57825f + f4 + f5 + f6;
        float f8 = f3 * 1.26661f;
        float f9 = f4 + (f2 * 2.85619f) + f8;
        float f10 = -(f5 + f8);
        float f11 = f7;
        float f12 = f9;
        float f13 = f10;
        float f14 = f6;
        float f15 = f10;
        float f16 = 1.0f - (((f9 + f10) + f6) / f7);
        c(fArr3, i4, i5, f11, f12, f13, f14, f16);
        float[] fArr4 = new float[length];
        e(fArr3, fArr4, i4, i5);
        c(fArr4, i5, i4, f11, f12, f15, f14, f16);
        e(fArr4, fArr3, i5, i4);
        return fArr3;
    }

    /* access modifiers changed from: package-private */
    public void c(float[] fArr, int i, int i2, float f, float f2, float f3, float f4, float f5) {
        int i3;
        float f6 = 1.0f / f;
        int i4 = i * 3;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i5 * i4;
            int i7 = i6 + 9;
            while (true) {
                i3 = i6 + i4;
                if (i7 >= i3) {
                    break;
                }
                fArr[i7] = (fArr[i7] * f5) + (((fArr[i7 - 3] * f2) + (fArr[i7 - 6] * f3) + (fArr[i7 - 9] * f4)) * f6);
                int i8 = i7 + 1;
                fArr[i8] = (fArr[i8] * f5) + (((fArr[i8 - 3] * f2) + (fArr[i8 - 6] * f3) + (fArr[i8 - 9] * f4)) * f6);
                int i9 = i7 + 2;
                fArr[i9] = (fArr[i9] * f5) + (((fArr[i9 - 3] * f2) + (fArr[i9 - 6] * f3) + (fArr[i9 - 9] * f4)) * f6);
                i7 += 3;
            }
            for (int i10 = (i3 - 9) - 3; i10 >= i6; i10 -= 3) {
                fArr[i10] = (fArr[i10] * f5) + (((fArr[i10 + 3] * f2) + (fArr[i10 + 6] * f3) + (fArr[i10 + 9] * f4)) * f6);
                int i11 = i10 + 1;
                fArr[i11] = (fArr[i11] * f5) + (((fArr[i11 + 3] * f2) + (fArr[i11 + 6] * f3) + (fArr[i11 + 9] * f4)) * f6);
                int i12 = i10 + 2;
                fArr[i12] = (fArr[i12] * f5) + (((fArr[i12 + 3] * f2) + (fArr[i12 + 6] * f3) + (fArr[i12 + 9] * f4)) * f6);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public float[] d(r rVar, int i, int i2) {
        r rVar2 = rVar;
        int i3 = i;
        int i4 = i2;
        int i5 = f1261b;
        int i6 = (i5 * 2) + i4;
        int i7 = (i5 * 2) + i3;
        float[] fArr = new float[(i6 * i7 * 3)];
        int i8 = -3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i6) {
            int i11 = i8 < 0 ? 0 : i8 >= i4 ? i4 - 1 : i8;
            int i12 = f1261b * -1;
            int i13 = 0;
            while (i13 < i7) {
                int i14 = i12 < 0 ? 0 : i12 >= i3 ? i3 - 1 : i12;
                fArr[i10] = ((float) rVar2.l(i14, i11)) * 0.003921569f;
                fArr[i10 + 1] = ((float) rVar2.h(i14, i11)) * 0.003921569f;
                fArr[i10 + 2] = ((float) rVar2.f(i14, i11)) * 0.003921569f;
                i13++;
                i12++;
                i10 += 3;
            }
            i9++;
            i8++;
        }
        return fArr;
    }

    /* access modifiers changed from: package-private */
    public void e(float[] fArr, float[] fArr2, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = (i4 * i2 * 3) + (i3 * 3);
                int i6 = (i3 * i * 3) + (i4 * 3);
                fArr2[i5] = fArr[i6];
                fArr2[i5 + 1] = fArr[i6 + 1];
                fArr2[i5 + 2] = fArr[i6 + 2];
            }
        }
    }
}
