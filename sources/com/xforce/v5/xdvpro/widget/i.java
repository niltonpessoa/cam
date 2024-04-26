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

public class i extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Button f1197a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1198b;

    public i(Context context, int i) {
        super(context, i);
    }

    private void a() {
        setContentView(R.layout.mid_confirm_dialog);
        this.f1197a = (Button) findViewById(R.id.confirm);
        this.f1198b = (TextView) findViewById(R.id.content);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = b.i;
        window.setGravity(17);
        onWindowAttributesChanged(attributes);
    }

    public void b(String str) {
        this.f1198b.setText(str);
    }

    public void c(View.OnClickListener onClickListener) {
        this.f1197a.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }
}
