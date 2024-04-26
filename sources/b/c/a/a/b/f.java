package b.c.a.a.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.xforce.v5.xdvpro.R;
import java.util.List;

public class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    private Context f852a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f853b;
    private a c;
    private List<String> d;
    private int e = 0;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public TextView f854a;
    }

    public f(Context context, List<String> list, int i) {
        this.f852a = context;
        this.d = list;
        this.f853b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.e = i;
    }

    public int getCount() {
        List<String> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i) {
        List<String> list = this.d;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.d.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        this.c = null;
        if (view == null) {
            view = this.f853b.inflate(R.layout.params_select_pop_lst_item, (ViewGroup) null);
            a aVar = new a();
            this.c = aVar;
            TextView unused = aVar.f854a = (TextView) view.findViewById(R.id.item_tv);
            view.setTag(this.c);
        } else {
            this.c = (a) view.getTag();
        }
        this.c.f854a.setTextColor(this.f852a.getResources().getColor(R.color.white));
        if (i == this.e) {
            this.c.f854a.setTextColor(this.f852a.getResources().getColor(R.color.black));
        }
        List<String> list = this.d;
        if (list != null && list.size() > 0) {
            this.c.f854a.setText(this.d.get(i));
        }
        return view;
    }
}
