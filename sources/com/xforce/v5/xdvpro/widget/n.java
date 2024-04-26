package com.xforce.v5.xdvpro.widget;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import b.c.a.a.d.b;
import com.xforce.v5.xdvpro.R;

public class n {
    private static Toast g = null;
    public static n h = null;
    public static boolean i = false;
    private static Handler j = new Handler();
    private static Runnable k = new a();

    /* renamed from: a  reason: collision with root package name */
    private View f1214a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1215b;
    private ImageView c = ((ImageView) this.f1214a.findViewById(R.id.toast_icon));
    private Context d;
    private WindowManager e;
    private WindowManager.LayoutParams f;

    class a implements Runnable {
        a() {
        }

        public void run() {
            n.h.b();
        }
    }

    private n(Context context, String str, boolean z) {
        this.d = context;
        this.e = (WindowManager) context.getSystemService("window");
        View inflate = View.inflate(context, R.layout.top_toast, (ViewGroup) null);
        this.f1214a = inflate;
        this.f1215b = (TextView) inflate.findViewById(R.id.toast_tips);
        e(context, str, z);
        d();
    }

    /* access modifiers changed from: private */
    public void b() {
        if (i) {
            this.e.removeView(this.f1214a);
            i = false;
        }
    }

    public static void c() {
        if (i && h != null) {
            j.removeCallbacks(k);
            h.b();
        }
    }

    private void d() {
        this.f = new WindowManager.LayoutParams();
        WindowManager.LayoutParams layoutParams = this.f;
        layoutParams.height = (int) this.d.getResources().getDimension(R.dimen.x1toast_height);
        layoutParams.width = b.i;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.toast_view_anim;
        layoutParams.flags = 152;
        layoutParams.gravity = 55;
        this.f.y = (int) this.d.getResources().getDimension(R.dimen.title_height);
    }

    private void e(Context context, String str, boolean z) {
        this.f1215b.setText(str);
        this.c.setBackgroundDrawable(context.getResources().getDrawable(z ? R.drawable.tips_success : R.drawable.tips_fail));
    }

    private void f() {
        if (!i) {
            this.e.addView(this.f1214a, this.f);
            i = true;
        }
    }

    public static void g(Context context, String str) {
        h(context, str, 0);
    }

    public static void h(Context context, String str, int i2) {
        Toast toast = g;
        if (toast == null) {
            g = Toast.makeText(context, str, i2);
        } else {
            toast.setText(str);
        }
        g.show();
    }

    public static void i(Context context, String str, boolean z) {
        n nVar;
        j.removeCallbacks(k);
        n nVar2 = h;
        if (nVar2 == null) {
            nVar = new n(context, str, z);
        } else if (context != nVar2.d) {
            nVar = new n(context, str, z);
        } else {
            nVar2.f1215b.setText(str);
            h.c.setBackgroundDrawable(context.getResources().getDrawable(z ? R.drawable.tips_success : R.drawable.tips_fail));
            j.postDelayed(k, 3000);
            h.f();
        }
        h = nVar;
        j.postDelayed(k, 3000);
        h.f();
    }
}
