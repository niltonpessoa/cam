package b.c.a.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import b.b.d.b;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.d;
import com.xforce.v5.xdvpro.widget.o;
import java.util.List;

public class c extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Context f837a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f838b;
    private a c;
    private List<b.b.d.c> d;
    private int e;
    private int[] f;
    private d g;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout f839a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public TextView f840b;
        /* access modifiers changed from: private */
        public TextView c;
        /* access modifiers changed from: private */
        public ToggleButton d;
        /* access modifiers changed from: private */
        public ImageView e;
    }

    public c(Context context, List<b.b.d.c> list) {
        this.f837a = context;
        this.f838b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.d = list;
    }

    public List<b.b.d.c> a() {
        return this.d;
    }

    public int b(String str) {
        for (b.b.d.c next : this.d) {
            if (next.c().equals(str)) {
                return this.d.indexOf(next);
            }
        }
        return -1;
    }

    public void c(List<b.b.d.c> list) {
        this.d = list;
    }

    public void d(int[] iArr) {
        this.f = iArr;
    }

    public void e(int i) {
        this.e = i;
    }

    public void f(d dVar) {
        this.g = dVar;
    }

    public int getCount() {
        List<b.b.d.c> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i) {
        List<b.b.d.c> list = this.d;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        this.c = null;
        if (view == null) {
            view = this.f838b.inflate(R.layout.setting_child_item, (ViewGroup) null);
            a aVar = new a();
            this.c = aVar;
            RelativeLayout unused = aVar.f839a = (RelativeLayout) view.findViewById(R.id.setting_child_bg);
            TextView unused2 = this.c.f840b = (TextView) view.findViewById(R.id.setting_item_name);
            TextView unused3 = this.c.c = (TextView) view.findViewById(R.id.setting_item_tips);
            ImageView unused4 = this.c.e = (ImageView) view.findViewById(R.id.setting_item_crow);
            ToggleButton unused5 = this.c.d = (ToggleButton) view.findViewById(R.id.setting_item_toggle);
            view.setTag(this.c);
        } else {
            this.c = (a) view.getTag();
        }
        b.b.d.c cVar = this.d.get(i);
        this.c.f840b.setText(cVar.d());
        boolean z = true;
        this.c.f839a.setEnabled(true);
        this.c.e.setVisibility(8);
        this.c.c.setVisibility(8);
        this.c.d.setVisibility(8);
        if (cVar.e() == 1001) {
            this.c.e.setVisibility(0);
            this.c.c.setVisibility(0);
            int[] iArr = this.f;
            if (iArr == null || iArr.length <= i) {
                i2 = 0;
            } else if (this.e != 8 || !d0.t().p().a().equals("V5")) {
                i2 = this.f[i];
            } else {
                i2 = this.f[b.e().d(i)];
            }
            c0.a(0, "TPSettingExpendableListAdapter", "item's id name is " + cVar.c());
            c0.a(0, "TPSettingExpendableListAdapter", "item = " + cVar);
            c0.a(0, "TPSettingExpendableListAdapter", "item's current value is " + i2);
            c0.a(0, "TPSettingExpendableListAdapter", "item.getArrayValues() = " + cVar.a());
            if (cVar.a().size() > 0 && i2 < 0) {
                this.c.f839a.setEnabled(false);
                this.c.e.setVisibility(4);
            } else if (!(cVar == null || cVar.a() == null || cVar.a().size() <= i2 || cVar.a().get(i2) == null)) {
                this.c.c.setText(cVar.a().get(i2));
                c0.a(0, "TPSettingExpendableListAdapter", "item's current valueStr is " + cVar.a().get(i2));
            }
        } else if (cVar.e() == 1002) {
            this.c.d.setVisibility(0);
            this.c.d.setOnClickListener(this);
            this.c.d.setTag(i + "");
            if (d0.t().s(cVar.c()) != 1) {
                z = false;
            }
            this.c.d.setChecked(z);
        } else if (cVar.e() == 1003) {
            this.c.e.setVisibility(0);
        } else if (cVar.e() == 1004) {
            this.c.e.setVisibility(8);
            this.c.c.setVisibility(0);
            this.c.c.setText("");
        }
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void onClick(View view) {
        Context context;
        Resources resources;
        int i;
        ToggleButton toggleButton = (ToggleButton) view;
        boolean isChecked = toggleButton.isChecked();
        String str = (String) view.getTag();
        c0.a(0, "TPSettingExpendableListAdapter", "onClick --- tag = " + str + " value = " + isChecked);
        if (b.c.a.a.d.b.p) {
            toggleButton.setChecked(!toggleButton.isChecked());
            context = this.f837a;
            resources = context.getResources();
            i = R.string.device_offline;
        } else if (!b.c.a.a.d.b.q) {
            toggleButton.setChecked(!toggleButton.isChecked());
            context = this.f837a;
            resources = context.getResources();
            i = R.string.device_is_preparing;
        } else {
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(str, isChecked);
                return;
            } else {
                c0.a(3, "TPSettingExpendableListAdapter", "toggleListener == null!");
                return;
            }
        }
        o.g(context, resources.getString(i), false);
    }
}
