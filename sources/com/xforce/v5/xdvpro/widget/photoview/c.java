package com.xforce.v5.xdvpro.widget.photoview;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(16)
public class c {
    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
