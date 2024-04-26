package com.xforce.v5.xdvpro.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.xforce.v5.xdvpro.R;

public class j extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Context f1199a;

    /* renamed from: b  reason: collision with root package name */
    private Button f1200b;
    private ImageView c;
    /* access modifiers changed from: private */
    public Animation d;
    private TextView e;
    private DialogInterface.OnCancelListener f = new b();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            j.this.cancel();
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (j.this.d != null && j.this.d.hasStarted()) {
                j.this.d.cancel();
            }
        }
    }

    public j(Context context, int i) {
        super(context, i);
        this.f1199a = context;
    }

    private void b() {
        setContentView(R.layout.confirm_loading_dialog);
        Button button = (Button) findViewById(R.id.cancel);
        this.f1200b = button;
        button.setOnClickListener(new a());
        this.c = (ImageView) findViewById(R.id.loading_image);
        this.e = (TextView) findViewById(R.id.content);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = b.c.a.a.d.b.i;
        window.setGravity(17);
        onWindowAttributesChanged(attributes);
    }

    public void c(String str) {
        this.e.setText(str);
    }

    public void d(boolean z) {
        Button button;
        int i;
        if (z) {
            this.c.setBackgroundDrawable(this.f1199a.getResources().getDrawable(R.drawable.confirm_loading));
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f1199a, R.anim.loading_animation);
            this.d = loadAnimation;
            this.c.startAnimation(loadAnimation);
            button = this.f1200b;
            i = 8;
        } else {
            this.c.setBackgroundDrawable(this.f1199a.getResources().getDrawable(R.drawable.tick));
            button = this.f1200b;
            i = 0;
        }
        button.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setOnCancelListener(this.f);
        b();
    }
}
