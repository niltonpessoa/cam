package com.xforce.v5.xdvpro.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xforce.v5.xdvpro.R;
import java.util.HashMap;
import java.util.Map;

public class XFHorizontalScrollViewForText extends HorizontalScrollView implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Context f1174a;

    /* renamed from: b  reason: collision with root package name */
    private int f1175b = 4;
    private String[] c;
    private int d;
    private LayoutInflater e;
    private b f;
    private LinearLayout.LayoutParams g;
    private LinearLayout h;
    private View[] i;
    private int j = 0;
    private Map<View, Integer> k;
    private c l;
    private Handler m = new a();

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                XFHorizontalScrollViewForText.this.e();
            } else if (i == 153) {
                XFHorizontalScrollViewForText.this.c(message.arg1);
            }
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public TextView f1177a;

        public b(XFHorizontalScrollViewForText xFHorizontalScrollViewForText) {
        }
    }

    public interface c {
        void a(int i, View view, int i2);
    }

    public XFHorizontalScrollViewForText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1174a = context;
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        this.d = i2;
        if (i2 < this.f1175b) {
            this.f1175b = i2;
        }
        this.k = new HashMap();
        this.i = new View[i2];
        this.e = (LayoutInflater) this.f1174a.getSystemService("layout_inflater");
        this.g = new LinearLayout.LayoutParams((b.c.a.a.d.b.i / i2) - 1, (int) getResources().getDimension(R.dimen.video_por_mid_params_bg_height));
        this.m.sendEmptyMessage(0);
    }

    /* access modifiers changed from: private */
    public void e() {
        if (!this.k.isEmpty()) {
            this.h.removeAllViews();
            this.k.clear();
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            this.i[i2] = this.e.inflate(R.layout.main_horsettngfortext, this.h, false);
            this.i[i2].setClickable(true);
            this.i[i2].setOnClickListener(this);
            b bVar = new b(this);
            this.f = bVar;
            bVar.f1177a = (TextView) this.i[i2].findViewById(R.id.tv_main_cameraSetting);
            this.f.f1177a.setText(this.c[i2]);
            if (i2 == this.j) {
                this.f.f1177a.setTextColor(this.f1174a.getResources().getColor(R.color.main_color));
            } else {
                this.f.f1177a.setTextColor(this.f1174a.getResources().getColorStateList(R.color.black));
            }
            this.i[i2].setTag(this.f);
            this.k.put(this.i[i2], Integer.valueOf(i2));
            this.h.addView(this.i[i2], this.g);
        }
    }

    public void d(LinearLayout linearLayout, int i2, String[] strArr) {
        this.h = linearLayout;
        this.c = strArr;
        Message obtainMessage = this.m.obtainMessage();
        obtainMessage.what = 153;
        obtainMessage.arg1 = i2;
        this.m.sendMessage(obtainMessage);
    }

    public void onClick(View view) {
        c cVar = this.l;
        if (cVar != null) {
            cVar.a(getId(), view, this.k.get(view).intValue());
        }
    }

    public void setOnItemClickListener(c cVar) {
        this.l = cVar;
    }

    public void setSelectCount(int i2) {
        this.j = i2;
        this.m.sendEmptyMessage(0);
    }
}
