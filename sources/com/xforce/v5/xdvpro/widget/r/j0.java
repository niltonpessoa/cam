package com.xforce.v5.xdvpro.widget.r;

import android.graphics.Bitmap;

public class j0 {
    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] b2 = d0.b(bitmap);
        int[] e = d0.e(b2);
        d0.d(e, width, height, i, (float) i2);
        d0.c(b2, e);
        return Bitmap.createBitmap(b2, width, height, Bitmap.Config.RGB_565);
    }
}
