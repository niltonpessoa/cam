package com.xforce.v5.xdvpro.widget.r;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.IntBuffer;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f1271a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1272b;
    private int c;
    private int d;
    protected int[] e;

    public r(Bitmap bitmap) {
        this.f1271a = bitmap;
        this.c = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.d = height;
        this.f1272b = Bitmap.createBitmap(this.c, height, Bitmap.Config.ARGB_8888);
        p();
    }

    public static r a(Activity activity, int i) {
        return new r(BitmapFactory.decodeResource(activity.getResources(), i));
    }

    public static int b(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    private void p() {
        int i = this.c;
        int i2 = this.d;
        int[] iArr = new int[(i * i2)];
        this.e = iArr;
        this.f1271a.getPixels(iArr, 0, i, 0, 0, i, i2);
        for (int i3 = 0; i3 < this.d; i3++) {
            int i4 = 0;
            while (true) {
                int i5 = this.c;
                if (i4 >= i5) {
                    break;
                }
                int i6 = (i5 * i3) + i4;
                int[] iArr2 = this.e;
                iArr2[i6] = ((iArr2[i6] >> 16) & 255) | (((iArr2[i6] >> 8) & 255) << 8) | ((iArr2[i6] & 255) << 16) | -16777216;
                i4++;
            }
        }
    }

    public void c(int i) {
        for (int i2 = 0; i2 < this.d; i2++) {
            for (int i3 = 0; i3 < this.c; i3++) {
                n(i3, i2, i);
            }
        }
    }

    /* renamed from: d */
    public r clone() {
        return new r(this.f1271a);
    }

    public void e() {
        IntBuffer wrap = IntBuffer.wrap(this.e);
        this.f1272b.copyPixelsFromBuffer(wrap);
        wrap.clear();
    }

    public int f(int i, int i2) {
        return g()[(i2 * this.c) + i] & 255;
    }

    public int[] g() {
        return this.e;
    }

    public int h(int i, int i2) {
        return (g()[(i2 * this.c) + i] & 65280) >>> 8;
    }

    public int i() {
        return this.d;
    }

    public Bitmap j() {
        return this.f1272b;
    }

    public int k(int i, int i2) {
        return this.e[(i2 * this.c) + i];
    }

    public int l(int i, int i2) {
        return (g()[(i2 * this.c) + i] & 16711680) >>> 16;
    }

    public int m() {
        return this.c;
    }

    public void n(int i, int i2, int i3) {
        this.e[(i2 * this.f1271a.getWidth()) + i] = i3;
    }

    public void o(int i, int i2, int i3, int i4, int i5) {
        this.e[(i2 * this.f1271a.getWidth()) + i] = ((i3 << 16) - 16777216) + (i4 << 8) + i5;
    }
}
