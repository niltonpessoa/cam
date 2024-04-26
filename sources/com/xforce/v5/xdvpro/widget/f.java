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

public class f extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Context f1189a;

    /* renamed from: b  reason: collision with root package name */
    private Button f1190b;
    private ImageView c;
    /* access modifiers changed from: private */
    public Animation d;
    private TextView e;
    private DialogInterface.OnCancelListener f = new b();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            f.this.cancel();
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (f.this.d != null && f.this.d.hasStarted()) {
                f.this.d.cancel();
            }
        }
    }

    public f(Context context, int i) {
        super(context, i);
        this.f1189a = context;
    }

    private void b() {
        setContentView(R.layout.confirm_loading_dialog);
        Button button = (Button) findViewById(R.id.cancel);
        this.f1190b = button;
        button.setOnClickListener(new a());
        this.c = (ImageView) findViewById(R.id.loading_image);
        this.e = (TextView) findViewById(R.id.content);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = b.c.a.a.d.b.i;
        window.setGravity(81);
        onWindowAttributesChanged(attributes);
    }

    public void c(String str) {
        this.e.setText(str);
    }

    public void d(boolean z) {
        Button button;
        int i;
        if (z) {
            this.c.setBackgroundDrawable(this.f1189a.getResources().getDrawable(R.drawable.confirm_loading));
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f1189a, R.anim.loading_animation);
            this.d = loadAnimation;
            this.c.startAnimation(loadAnimation);
            button = this.f1190b;
            i = 8;
        } else {
            this.c.setAnimation((Animation) null);
            Animation animation = this.d;
            if (animation != null && animation.hasStarted()) {
                this.d.cancel();
            }
            this.c.setBackgroundDrawable(this.f1189a.getResources().getDrawable(R.drawable.tick));
            button = this.f1190b;
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
