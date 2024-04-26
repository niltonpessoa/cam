package com.xforce.v5.xdvpro.widget.r;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public float f1266a;

    /* renamed from: b  reason: collision with root package name */
    public float f1267b;
    public float c;

    public m(float f, float f2, float f3) {
        this.f1266a = f;
        this.c = f2;
        this.f1267b = f3;
    }

    public static int a(m mVar) {
        byte b2;
        byte b3;
        byte b4;
        double d;
        m mVar2 = mVar;
        float f = mVar2.f1266a;
        if (f == 0.0f) {
            b4 = (byte) ((int) (mVar2.f1267b * 255.0f));
            b3 = b4;
            b2 = b3;
        } else {
            double d2 = (double) f;
            Double.isNaN(d2);
            double d3 = d2 / 360.0d;
            float f2 = mVar2.f1267b;
            if (((double) f2) < 0.5d) {
                d = (double) ((mVar2.c + 1.0f) * f2);
            } else {
                float f3 = mVar2.c;
                d = (double) ((f2 + f3) - (f3 * f2));
            }
            double d4 = d;
            double d5 = (double) (f2 * 2.0f);
            Double.isNaN(d5);
            double d6 = d5 - d4;
            b4 = (byte) ((int) (b(d6, d4, d3 + 0.3333333333333333d) * 255.0d));
            b2 = (byte) ((int) (b(d6, d4, d3) * 255.0d));
            b3 = (byte) ((int) (b(d6, d4, d3 - 0.3333333333333333d) * 255.0d));
        }
        return ((b4 << 16) - 16777216) + (b2 << 8) + b3;
    }

    private static double b(double d, double d2, double d3) {
        double d4;
        if (d3 < 0.0d) {
            d3 += 1.0d;
        }
        if (d3 > 1.0d) {
            d3 -= 1.0d;
        }
        if (d3 * 6.0d < 1.0d) {
            d4 = (d2 - d) * 6.0d * d3;
        } else if (d3 * 2.0d < 1.0d) {
            return d2;
        } else {
            if (3.0d * d3 >= 2.0d) {
                return d;
            }
            d4 = (d2 - d) * (0.6666666666666666d - d3) * 6.0d;
        }
        return d + d4;
    }

    public static void c(int i, int i2, int i3, m mVar) {
        m mVar2 = mVar;
        double d = (double) i;
        Double.isNaN(d);
        double d2 = d / 255.0d;
        double d3 = (double) i2;
        Double.isNaN(d3);
        double d4 = d3 / 255.0d;
        double d5 = (double) i3;
        Double.isNaN(d5);
        double d6 = d5 / 255.0d;
        double min = Math.min(Math.min(d2, d4), d6);
        double max = Math.max(Math.max(d2, d4), d6);
        double d7 = max - min;
        double d8 = max + min;
        float f = ((float) d8) / 2.0f;
        mVar2.f1267b = f;
        if (d7 == 0.0d) {
            mVar2.f1266a = 0.0f;
            mVar2.c = 0.0f;
            return;
        }
        double d9 = d6;
        mVar2.c = (float) (((double) f) < 0.5d ? d7 / d8 : d7 / ((2.0d - max) - min));
        double d10 = d7 / 2.0d;
        double d11 = (((max - d2) / 6.0d) + d10) / d7;
        double d12 = (((max - d4) / 6.0d) + d10) / d7;
        double d13 = (((max - d9) / 6.0d) + d10) / d7;
        double d14 = d2 == max ? d13 - d12 : d4 == max ? (d11 + 0.3333333333333333d) - d13 : (d12 + 0.6666666666666666d) - d11;
        if (d14 < 0.0d) {
            d14 += 1.0d;
        }
        if (d14 > 1.0d) {
            d14 -= 1.0d;
        }
        mVar2.f1266a = (float) ((int) (360.0d * d14));
    }
}
