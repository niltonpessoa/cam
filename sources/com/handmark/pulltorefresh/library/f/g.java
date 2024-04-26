package com.handmark.pulltorefresh.library.f;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

public class g {

    @TargetApi(16)
    static class a {
        public static void a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void b(View view, int i) {
            view.setBackgroundColor(i);
        }
    }

    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.a(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    public static void b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.b(view, i);
        } else {
            view.setBackgroundColor(i);
        }
    }
}
