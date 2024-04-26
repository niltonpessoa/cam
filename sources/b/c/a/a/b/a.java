package b.c.a.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.xforce.v5.xdvpro.R;

public class a extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private LayoutInflater f827a;

    /* renamed from: b  reason: collision with root package name */
    private String[] f828b;
    private C0043a c;
    private Drawable d;
    private Drawable e;
    private int f = -1;
    private boolean g = true;

    /* renamed from: b.c.a.a.b.a$a  reason: collision with other inner class name */
    public static class C0043a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public ImageView f829a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public TextView f830b;
    }

    public a(Context context, String[] strArr) {
        this.f827a = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f828b = strArr;
        this.d = context.getResources().getDrawable(R.drawable.video_por_wb_tick);
        this.e = context.getResources().getDrawable(R.drawable.video_por_wb_tickness);
    }

    public int a() {
        return this.f;
    }

    public boolean b() {
        return this.g;
    }

    public void c(String[] strArr) {
        this.f828b = strArr;
    }

    public void d(int i) {
        this.f = i;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public int getCount() {
        String[] strArr = this.f828b;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"NewApi"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        ImageView imageView;
        this.c = null;
        if (view == null) {
            view = this.f827a.inflate(R.layout.portrait_set_child_item, (ViewGroup) null);
            C0043a aVar = new C0043a();
            this.c = aVar;
            TextView unused = aVar.f830b = (TextView) view.findViewById(R.id.por_set_item_tip);
            ImageView unused2 = this.c.f829a = (ImageView) view.findViewById(R.id.por_set_item_check);
            view.setTag(this.c);
        } else {
            this.c = (C0043a) view.getTag();
        }
        if (this.f828b.length > 0) {
            this.c.f830b.setText(this.f828b[i]);
        }
        if (this.g) {
            this.c.f829a.setBackground(this.e);
            if (this.f == i) {
                this.c.f829a.setBackground(this.d);
            }
            imageView = this.c.f829a;
            i2 = 0;
        } else {
            imageView = this.c.f829a;
            i2 = 8;
        }
        imageView.setVisibility(i2);
        return view;
    }

    public void onClick(View view) {
    }
}
