package com.xforce.v5.xdvpro.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import b.c.a.a.d.b;
import com.xforce.v5.xdvpro.R;

public class q extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Context f1235a;

    /* renamed from: b  reason: collision with root package name */
    private ImageButton f1236b;
    private ImageButton c;
    private ImageButton d;

    public q(Context context, int i) {
        super(context, i);
        this.f1235a = context;
    }

    private void a() {
        setContentView(R.layout.video_xflanopt);
        ImageButton imageButton = (ImageButton) findViewById(R.id.video_lan_opt_setting_btn);
        this.f1236b = (ImageButton) findViewById(R.id.video_lan_opt_record);
        this.c = (ImageButton) findViewById(R.id.video_lan_opt_capture);
        this.d = (ImageButton) findViewById(R.id.video_lan_opt_slowgraphy);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = b.h;
        attributes.height = (int) this.f1235a.getResources().getDimension(R.dimen.video_lanopt_bg_height);
        window.setGravity(81);
        onWindowAttributesChanged(attributes);
    }

    public void b(int i) {
        ImageButton imageButton;
        int i2;
        Resources resources;
        if (i == 0) {
            imageButton = this.c;
            resources = this.f1235a.getResources();
            i2 = R.drawable.normal_capture_selector;
        } else if (i == 1) {
            imageButton = this.c;
            resources = this.f1235a.getResources();
            i2 = R.drawable.time_capture_selector;
        } else if (i == 2) {
            imageButton = this.c;
            resources = this.f1235a.getResources();
            i2 = R.drawable.auto_capture_selector;
        } else if (i == 3) {
            imageButton = this.c;
            resources = this.f1235a.getResources();
            i2 = R.drawable.motion_capture_selector;
        } else {
            return;
        }
        imageButton.setBackground(resources.getDrawable(i2));
    }

    public void c(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void d(int i) {
        ImageButton imageButton;
        boolean z = true;
        if (i == 1) {
            imageButton = this.c;
        } else {
            imageButton = this.c;
            z = false;
        }
        imageButton.setSelected(z);
    }

    public void e(int i) {
        ImageButton imageButton;
        int i2;
        Resources resources;
        if (i == 0) {
            imageButton = this.f1236b;
            resources = this.f1235a.getResources();
            i2 = R.drawable.normal_record_selector;
        } else if (i == 1) {
            imageButton = this.f1236b;
            resources = this.f1235a.getResources();
            i2 = R.drawable.time_record_selector;
        } else if (i == 2) {
            imageButton = this.f1236b;
            resources = this.f1235a.getResources();
            i2 = R.drawable.loop_record_selector;
        } else {
            return;
        }
        imageButton.setBackground(resources.getDrawable(i2));
    }

    public void f(View.OnClickListener onClickListener) {
        this.f1236b.setOnClickListener(onClickListener);
    }

    public void g(int i) {
        ImageButton imageButton;
        boolean z = true;
        if (i == 1) {
            imageButton = this.f1236b;
        } else {
            imageButton = this.f1236b;
            z = false;
        }
        imageButton.setSelected(z);
    }

    public void h(int i) {
        ImageButton imageButton;
        boolean z = true;
        if (i == 1) {
            imageButton = this.d;
        } else {
            imageButton = this.d;
            z = false;
        }
        imageButton.setSelected(z);
    }

    public void i(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }
}
