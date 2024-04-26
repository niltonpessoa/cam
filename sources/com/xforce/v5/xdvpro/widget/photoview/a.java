package com.xforce.v5.xdvpro.widget.photoview;

import android.os.Build;
import android.view.View;

public class a {
    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            c.a(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }
}
