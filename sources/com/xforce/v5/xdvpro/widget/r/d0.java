package com.xforce.v5.xdvpro.widget.r;

import android.graphics.Bitmap;

public class d0 {
    private static int a(int i, int i2) {
        int i3 = i + ((i * i2) / (255 - i2));
        if (i3 > 255) {
            return 255;
        }
        return i3;
    }

    public static int[] b(Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = (i * width) + i2;
                int i4 = iArr[i3];
                int i5 = (int) ((((float) ((16711680 & i4) >> 16)) * 0.299f) + (((float) ((65280 & i4) >> 8)) * 0.587f) + (((float) (i4 & 255)) * 0.114f));
                iArr[i3] = i5 | (i5 << 16) | (i5 << 8) | -16777216;
            }
        }
        return iArr;
    }

    public static void c(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int a2 = a(iArr[i] & 255, iArr2[i] & 255);
            iArr[i] = a2 | (a2 << 16) | (a2 << 8) | -16777216;
        }
    }

    public static void d(int[] iArr, int i, int i2, int i3, float f) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        float f2 = f;
        double sqrt = Math.sqrt(6.283185307179586d);
        double d = (double) f2;
        Double.isNaN(d);
        float f3 = (float) (1.0d / (sqrt * d));
        float f4 = -1.0f / ((2.0f * f2) * f2);
        int i7 = (i6 * 2) + 1;
        float[] fArr = new float[i7];
        int i8 = -i6;
        int i9 = i8;
        int i10 = 0;
        float f5 = 0.0f;
        while (i9 <= i6) {
            double d2 = (double) f3;
            float f6 = (float) i9;
            double exp = Math.exp((double) (f6 * f4 * f6));
            Double.isNaN(d2);
            float f7 = (float) (d2 * exp);
            fArr[i10] = f7;
            f5 += f7;
            i9++;
            i10++;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            fArr[i11] = fArr[i11] / f5;
        }
        for (int i12 = 0; i12 < i5; i12++) {
            for (int i13 = 0; i13 < i4; i13++) {
                float f8 = 0.0f;
                float f9 = 0.0f;
                for (int i14 = i8; i14 <= i6; i14++) {
                    int i15 = i13 + i14;
                    if (i15 >= 0 && i15 < i4) {
                        int i16 = i14 + i6;
                        f8 += ((float) (iArr[(i12 * i4) + i15] & 255)) * fArr[i16];
                        f9 += fArr[i16];
                    }
                }
                int i17 = (int) (f8 / f9);
                iArr[(i12 * i4) + i13] = i17 | (i17 << 16) | (i17 << 8) | -16777216;
            }
        }
        for (int i18 = 0; i18 < i4; i18++) {
            for (int i19 = 0; i19 < i5; i19++) {
                float f10 = 0.0f;
                float f11 = 0.0f;
                for (int i20 = i8; i20 <= i6; i20++) {
                    int i21 = i19 + i20;
                    if (i21 >= 0 && i21 < i5) {
                        int i22 = i20 + i6;
                        f10 += ((float) (iArr[(i21 * i4) + i18] & 255)) * fArr[i22];
                        f11 += fArr[i22];
                    }
                }
                int i23 = (int) (f10 / f11);
                iArr[(i19 * i4) + i18] = i23 | (i23 << 16) | (i23 << 8) | -16777216;
            }
        }
    }

    public static int[] e(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = 255 - (iArr[i] & 255);
            iArr2[i] = i2 | (i2 << 16) | (i2 << 8) | -16777216;
        }
        return iArr2;
    }
}
