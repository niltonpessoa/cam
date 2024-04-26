package com.xforce.v5.xdvpro.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import b.c.a.a.d.b;
import com.xforce.v5.xdvpro.R;

public class X1InfoActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1010a;

    /* renamed from: b  reason: collision with root package name */
    private Button f1011b;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            X1InfoActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_info);
        TextView textView = (TextView) findViewById(R.id.tv_version);
        this.f1010a = textView;
        textView.setText("V" + b.o);
        Button button = (Button) findViewById(R.id.back_btn);
        this.f1011b = button;
        button.setOnClickListener(new a());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        finish();
        return false;
    }
}
