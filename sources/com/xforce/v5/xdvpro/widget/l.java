package com.xforce.v5.xdvpro.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.xforce.v5.xdvpro.R;
import java.util.List;

public class l extends Dialog implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Context f1206a;

    /* renamed from: b  reason: collision with root package name */
    private ImageButton f1207b;
    private ListView c;
    private TextView d;
    private b.c.a.a.b.a e;
    private b f;
    private int g;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            l.this.dismiss();
        }
    }

    public interface b {
        void a(int i, int i2);
    }

    public l(Context context, int i) {
        super(context, i);
        this.f1206a = context;
    }

    private void b(String str, String[] strArr, int i, boolean z, int i2) {
        i(str);
        g(i);
        d(strArr);
        e(z);
        if (z) {
            f(i2);
        } else {
            f(-1);
        }
    }

    private void c() {
        setContentView(R.layout.portrait_setting_dialog);
        this.f1207b = (ImageButton) findViewById(R.id.por_set_back);
        this.d = (TextView) findViewById(R.id.por_set_title);
        this.f1207b.setOnClickListener(new a());
        this.e = new b.c.a.a.b.a(this.f1206a, (String[]) null);
        ListView listView = (ListView) findViewById(R.id.por_set_list);
        this.c = listView;
        listView.setAdapter(this.e);
        this.c.setOnItemClickListener(this);
        Window window = getWindow();
        window.getAttributes();
        window.setGravity(17);
    }

    private void d(String[] strArr) {
        b.c.a.a.b.a aVar = this.e;
        if (aVar != null) {
            aVar.c(strArr);
            this.e.notifyDataSetChanged();
        }
    }

    private void e(boolean z) {
        b.c.a.a.b.a aVar = this.e;
        if (aVar != null) {
            aVar.e(z);
            this.e.notifyDataSetChanged();
        }
    }

    private void f(int i) {
        b.c.a.a.b.a aVar = this.e;
        if (aVar != null) {
            aVar.d(i);
            this.e.notifyDataSetChanged();
        }
    }

    private void g(int i) {
        this.g = i;
    }

    private void i(String str) {
        this.d.setText(str);
    }

    public void a(String str, List<String> list, int i, int i2) {
        String[] strArr;
        if (list != null) {
            int size = list.size();
            strArr = new String[size];
            for (int i3 = 0; i3 < size; i3++) {
                strArr[i3] = list.get(i3);
            }
        } else {
            strArr = null;
        }
        b(str, strArr, i, true, i2);
    }

    public void h(b bVar) {
        this.f = bVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.e.b()) {
            if (this.e.a() != i) {
                f(i);
            }
            b bVar = this.f;
            if (bVar != null) {
                bVar.a(i, this.g);
            }
        }
    }
}
