package com.xforce.v5.xdvpro.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import b.c.a.a.b.f;
import com.xforce.v5.xdvpro.R;
import java.util.List;

public class p extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private int f1218a;

    /* renamed from: b  reason: collision with root package name */
    private int f1219b;
    private ListView c;
    private View d;

    public p(Context context, List<String> list, int i, AdapterView.OnItemClickListener onItemClickListener) {
        super(context);
        b(context, onItemClickListener);
        a(context, list, i);
        c();
    }

    private void a(Context context, List<String> list, int i) {
        boolean z;
        ListView listView;
        f fVar = new f(context, list, i);
        if (list == null || list.size() <= 5) {
            listView = this.c;
            z = false;
        } else {
            listView = this.c;
            z = true;
        }
        listView.setVerticalScrollBarEnabled(z);
        this.c.setAdapter(fVar);
    }

    private void b(Context context, AdapterView.OnItemClickListener onItemClickListener) {
        View inflate = View.inflate(context, R.layout.video_por_pop_item, (ViewGroup) null);
        this.d = inflate;
        ListView listView = (ListView) inflate.findViewById(R.id.ls_data);
        this.c = listView;
        listView.setOnItemClickListener(onItemClickListener);
        setContentView(this.d);
    }

    private void c() {
        setWidth(-2);
        setHeight(-2);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        this.d.measure(0, 0);
        this.f1219b = this.d.getMeasuredHeight();
        this.f1218a = this.d.getMeasuredWidth();
    }

    public void d(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Log.e("XFParamsSelectPopWindow", "width:" + this.f1218a + " height:" + this.f1219b + " LX:" + iArr[0] + " LY:" + iArr[1] + " x:" + (iArr[0] - (this.f1218a / 2)) + " y:" + (iArr[1] - this.f1219b));
        showAtLocation(view, 0, iArr[0] + ((view.getWidth() / 2) - (this.f1218a / 2)), (iArr[1] - this.f1219b) + -10);
    }
}
