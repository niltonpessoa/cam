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

public class e extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Button f1186a;

    /* renamed from: b  reason: collision with root package name */
    private Button f1187b;
    private TextView c;
    private boolean d = false;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            e.this.cancel();
        }
    }

    public e(Context context, int i) {
        super(context, i);
    }

    public e(Context context, int i, boolean z) {
        super(context, i);
        this.d = z;
    }

    private void b() {
        setContentView(R.layout.confirm_dialog);
        Button button = (Button) findViewById(R.id.cancel);
        this.f1186a = button;
        button.setVisibility(this.d ? 8 : 0);
        this.f1186a.setOnClickListener(new a());
        this.f1187b = (Button) findViewById(R.id.confirm);
        this.c = (TextView) findViewById(R.id.content);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = b.i;
        window.setGravity(80);
        onWindowAttributesChanged(attributes);
    }

    public String a() {
        return (String) this.c.getText();
    }

    public void c(View.OnClickListener onClickListener) {
        this.f1186a.setOnClickListener(onClickListener);
    }

    public void d(String str) {
        this.c.setText(str);
    }

    public void e(View.OnClickListener onClickListener) {
        this.f1187b.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
    }
}
