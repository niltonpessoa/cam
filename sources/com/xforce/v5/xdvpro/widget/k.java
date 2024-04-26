package com.xforce.v5.xdvpro.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import b.c.a.a.d.b;
import com.xforce.v5.xdvpro.R;

public class k extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Button f1203a;

    /* renamed from: b  reason: collision with root package name */
    private Button f1204b;
    private TextView c;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            k.this.cancel();
        }
    }

    public k(Context context, int i) {
        super(context, i);
    }

    private void b() {
        setContentView(R.layout.midtips2_dialog);
        Button button = (Button) findViewById(R.id.midtips_cancel);
        this.f1203a = button;
        button.setOnClickListener(new a());
        this.f1204b = (Button) findViewById(R.id.midtips_confirm);
        this.c = (TextView) findViewById(R.id.midtips_title);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = b.i;
        window.setGravity(17);
        onWindowAttributesChanged(attributes);
    }

    public void a(View.OnClickListener onClickListener) {
        this.f1204b.setOnClickListener(onClickListener);
    }

    public void c(String str) {
        this.c.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
    }
}
