package com.xforce.v5.xdvpro.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.xforce.v5.xdvpro.R;

public class g extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f1193a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f1194b;
    private LinearLayout c;
    private LinearLayout d;
    private Button e;
    private Button f;
    private Button g;
    private Button h;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            g.this.cancel();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            g.this.cancel();
        }
    }

    public g(Context context, int i) {
        super(context, i);
    }

    private void a() {
        setContentView(R.layout.file_opt_dialog);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.top);
        this.f1193a = relativeLayout;
        relativeLayout.setOnClickListener(new a());
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.bottom);
        this.f1194b = relativeLayout2;
        relativeLayout2.setOnClickListener(new b());
        this.e = (Button) findViewById(R.id.file_opt_loc_delete);
        this.f = (Button) findViewById(R.id.file_opt_loc_share);
        this.h = (Button) findViewById(R.id.file_opt_dev_download);
        this.g = (Button) findViewById(R.id.file_opt_dev_delete);
        this.c = (LinearLayout) findViewById(R.id.file_opt_local);
        this.d = (LinearLayout) findViewById(R.id.file_opt_device);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = b.c.a.a.d.b.i;
        attributes.height = b.c.a.a.d.b.h;
        window.setGravity(49);
        onWindowAttributesChanged(attributes);
    }

    public void b(View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    public void c(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void d(boolean z) {
        if (z) {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            return;
        }
        this.c.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void e(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void f(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }
}
