package com.xforce.v5.xdvpro.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.xforce.v5.xdvpro.R;
import java.util.Timer;
import java.util.TimerTask;

public class m extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Context f1209a;

    /* renamed from: b  reason: collision with root package name */
    private Button f1210b;
    private Button c;
    private TextView d;
    /* access modifiers changed from: private */
    public EditText e;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            m.this.cancel();
        }
    }

    class b implements TextWatcher {
        b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            m.this.e.setHint("");
        }
    }

    class c extends TimerTask {
        c() {
        }

        public void run() {
            ((InputMethodManager) m.this.e.getContext().getSystemService("input_method")).showSoftInput(m.this.e, 0);
        }
    }

    public m(Context context, int i) {
        super(context, i);
        this.f1209a = context;
    }

    private void e() {
        setContentView(R.layout.pwdinput_dialog);
        Button button = (Button) findViewById(R.id.cancel);
        this.f1210b = button;
        button.setOnClickListener(new a());
        this.c = (Button) findViewById(R.id.pwdinput_connect);
        this.d = (TextView) findViewById(R.id.pwdinput_ssid);
        EditText editText = (EditText) findViewById(R.id.pwdinput_pwd);
        this.e = editText;
        editText.setFocusable(true);
        this.e.setFocusableInTouchMode(true);
        this.e.requestFocus();
        this.e.addTextChangedListener(new b());
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = b.c.a.a.d.b.i;
        window.setGravity(17);
        onWindowAttributesChanged(attributes);
    }

    public boolean b() {
        int i;
        Resources resources;
        EditText editText;
        String obj = this.e.getText().toString();
        if (obj == null || "".equals(obj)) {
            this.e.setText("");
            editText = this.e;
            resources = this.f1209a.getResources();
            i = R.string.wifi_not_null;
        } else if (obj.length() >= 8) {
            return true;
        } else {
            this.e.setText("");
            editText = this.e;
            resources = this.f1209a.getResources();
            i = R.string.wifi_length_short;
        }
        editText.setHint(resources.getString(i));
        this.e.setFocusable(true);
        return false;
    }

    public String c() {
        return this.e.getText().toString().trim();
    }

    public String d() {
        return this.d.getText().toString().trim();
    }

    public void f(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void g(String str) {
        this.d.setText(str);
    }

    public void h(String str) {
        this.e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
    }

    public void show() {
        super.show();
        this.e.setText("");
        new Timer().schedule(new c(), 100);
    }
}
