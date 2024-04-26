package com.xforce.v5.xdvpro.widget.r;

public class w implements o {

    /* renamed from: a  reason: collision with root package name */
    public float f1281a = 0.2f;

    public static int b(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        double random = Math.random();
        double d = (double) ((max - min) + 1);
        Double.isNaN(d);
        return min + ((int) (random * d));
    }

    public r a(r rVar) {
        byte b2;
        byte b3;
        byte b4;
        int i = (int) (this.f1281a * 32768.0f);
        for (int i2 = 0; i2 < rVar.m(); i2++) {
            for (int i3 = 0; i3 < rVar.i(); i3++) {
                int l = rVar.l(i2, i3);
                int h = rVar.h(i2, i3);
                int f = rVar.f(i2, i3);
                if (i != 0) {
                    int b5 = l + ((b(-255, 255) * i) >> 15);
                    int b6 = h + ((b(-255, 255) * i) >> 15);
                    int b7 = f + ((b(-255, 255) * i) >> 15);
                    byte b8 = -1;
                    byte b9 = b5 > 255 ? -1 : b5 < 0 ? 0 : (byte) b5;
                    byte b10 = b6 > 255 ? -1 : b6 < 0 ? 0 : (byte) b6;
                    if (b7 <= 255) {
                        b8 = b7 < 0 ? 0 : (byte) b7;
                    }
                    b3 = b10;
                    b2 = b8;
                    b4 = b9;
                } else {
                    b4 = l;
                    b3 = h;
                    b2 = f;
                }
                rVar.o(i2, i3, b4, b3, b2);
            }
        }
        return rVar;
    }
}
