package com.xforce.v5.xdvpro.widget;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import b.c.a.a.d.b;
import com.xforce.v5.xdvpro.R;

public class o {
    public static o g = null;
    public static boolean h = false;
    private static Handler i = new Handler();
    private static Runnable j = new a();

    /* renamed from: a  reason: collision with root package name */
    private View f1216a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1217b;
    private ImageView c = ((ImageView) this.f1216a.findViewById(R.id.toast_icon));
    private Context d;
    private WindowManager e;
    private WindowManager.LayoutParams f;

    class a implements Runnable {
        a() {
        }

        public void run() {
            o.g.b();
        }
    }

    private o(Context context, String str, boolean z) {
        this.d = context;
        this.e = (WindowManager) context.getSystemService("window");
        View inflate = View.inflate(context, R.layout.top_toast, (ViewGroup) null);
        this.f1216a = inflate;
        this.f1217b = (TextView) inflate.findViewById(R.id.toast_tips);
        e(context, str, z);
        d();
    }

    /* access modifiers changed from: private */
    public void b() {
        this.e.removeView(this.f1216a);
        h = false;
    }

    public static void c() {
        if (h && g != null) {
            i.removeCallbacks(j);
            g.b();
        }
    }

    private void d() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f = layoutParams;
        int i2 = 90;
        layoutParams.height = 90;
        float f2 = b.j;
        if (((double) f2) >= 3.0d) {
            i2 = (int) (f2 * 45.0f);
        }
        layoutParams.height = i2;
        layoutParams.width = b.i;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.toast_view_anim;
        layoutParams.flags = 152;
        layoutParams.gravity = 55;
        layoutParams.y = 48;
        layoutParams.y = (int) (b.j * 48.0f);
    }

    private void e(Context context, String str, boolean z) {
        this.f1217b.setText(str);
        this.c.setBackgroundDrawable(context.getResources().getDrawable(z ? R.drawable.tips_success : R.drawable.tips_fail));
    }

    private void f() {
        if (!h) {
            this.e.addView(this.f1216a, this.f);
            h = true;
        }
    }

    public static void g(Context context, String str, boolean z) {
        o oVar;
        i.removeCallbacks(j);
        o oVar2 = g;
        if (oVar2 == null) {
            oVar = new o(context, str, z);
        } else if (context != oVar2.d) {
            oVar = new o(context, str, z);
        } else {
            oVar2.f1217b.setText(str);
            g.c.setBackgroundDrawable(context.getResources().getDrawable(z ? R.drawable.tips_success : R.drawable.tips_fail));
            i.postDelayed(j, 1500);
            g.f();
        }
        g = oVar;
        i.postDelayed(j, 1500);
        g.f();
    }
}
