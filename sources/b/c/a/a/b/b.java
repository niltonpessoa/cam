package b.c.a.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import b.b.d.c;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.d;
import com.xforce.v5.xdvpro.widget.o;
import java.util.ArrayList;
import java.util.List;

public class b extends BaseExpandableListAdapter implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Context f831a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f832b;
    private C0044b c;
    private a d;
    private List<String> e;
    private List<List<c>> f;
    private d g;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout f833a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public TextView f834b;
        /* access modifiers changed from: private */
        public TextView c;
        /* access modifiers changed from: private */
        public ToggleButton d;
        /* access modifiers changed from: private */
        public ImageView e;
    }

    /* renamed from: b.c.a.a.b.b$b  reason: collision with other inner class name */
    public static class C0044b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public ImageView f835a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public TextView f836b;
    }

    public b(Context context, List<List<c>> list) {
        this.f831a = context;
        this.f832b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.e = a(context);
        this.f = list;
    }

    private String b() {
        String str;
        c0.a(0, "SettingExpendableListAdapter", "refreshTFCardResp()");
        String str2 = "--";
        if (d0.t().p() == null || d0.t().p().i() <= 0) {
            str = str2;
        } else {
            String p = b.c.a.a.d.b.p(d0.t().p().i());
            str2 = b.c.a.a.d.b.p(d0.t().p().h());
            str = p;
        }
        return str2 + "/" + str;
    }

    public List<String> a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getResources().getString(R.string.setting_group_0));
        arrayList.add(context.getResources().getString(R.string.setting_group_1));
        arrayList.add(context.getResources().getString(R.string.setting_group_2));
        arrayList.add(context.getResources().getString(R.string.setting_group_3));
        return arrayList;
    }

    public void c(d dVar) {
        this.g = dVar;
    }

    public Object getChild(int i, int i2) {
        return null;
    }

    public long getChildId(int i, int i2) {
        return 0;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        this.d = null;
        if (view == null) {
            view = this.f832b.inflate(R.layout.setting_child_item, (ViewGroup) null);
            a aVar = new a();
            this.d = aVar;
            RelativeLayout unused = aVar.f833a = (RelativeLayout) view.findViewById(R.id.setting_child_bg);
            TextView unused2 = this.d.f834b = (TextView) view.findViewById(R.id.setting_item_name);
            TextView unused3 = this.d.c = (TextView) view.findViewById(R.id.setting_item_tips);
            ImageView unused4 = this.d.e = (ImageView) view.findViewById(R.id.setting_item_crow);
            ToggleButton unused5 = this.d.d = (ToggleButton) view.findViewById(R.id.setting_item_toggle);
            view.setTag(this.d);
        } else {
            this.d = (a) view.getTag();
        }
        boolean z2 = false;
        c0.a(0, "SettingExpendableListAdapter", "TET ------- GROUP:" + i + " child:" + i2);
        c cVar = (c) this.f.get(i).get(i2);
        this.d.f834b.setText(cVar.d());
        this.d.e.setVisibility(8);
        this.d.c.setVisibility(8);
        this.d.d.setVisibility(8);
        if (cVar.e() == 1001) {
            this.d.e.setVisibility(0);
            this.d.c.setVisibility(0);
            int s = d0.t().s(cVar.c());
            this.d.c.setText(cVar.a().get(s));
            c0.a(0, "SettingExpendableListAdapter", "item's id name is " + cVar.c() + "\nitem's current value is " + s + "\nitem's current valueStr is " + cVar.a().get(s));
        } else if (cVar.e() == 1002) {
            this.d.d.setVisibility(0);
            this.d.d.setOnClickListener(this);
            this.d.d.setTag(i + ":" + i2);
            if (d0.t().s(cVar.c()) == 1) {
                z2 = true;
            }
            this.d.d.setChecked(z2);
        } else if (cVar.e() == 1003) {
            this.d.e.setVisibility(0);
        } else if (cVar.e() == 1004) {
            this.d.e.setVisibility(8);
            this.d.c.setVisibility(0);
            this.d.c.setText("");
        }
        if (cVar.c().equals("ml_storage_id")) {
            this.d.c.setText(b());
        }
        this.d.f833a.setBackgroundDrawable(this.f831a.getResources().getDrawable(z ? R.drawable.setting_last_item_bg_selector : R.drawable.setting_item_bg_selector));
        return view;
    }

    public int getChildrenCount(int i) {
        return this.f.get(i).size();
    }

    public Object getGroup(int i) {
        return null;
    }

    public int getGroupCount() {
        return this.e.size();
    }

    public long getGroupId(int i) {
        return 0;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        Resources resources;
        ImageView imageView;
        int i2;
        this.c = null;
        if (view == null) {
            view = this.f832b.inflate(R.layout.setting_group_item, (ViewGroup) null);
            C0044b bVar = new C0044b();
            this.c = bVar;
            ImageView unused = bVar.f835a = (ImageView) view.findViewById(R.id.setting_group_icon);
            TextView unused2 = this.c.f836b = (TextView) view.findViewById(R.id.setting_group_name);
            view.setTag(this.c);
        } else {
            this.c = (C0044b) view.getTag();
        }
        this.c.f836b.setText(this.e.get(i));
        if (i == 0) {
            imageView = this.c.f835a;
            resources = this.f831a.getResources();
            i2 = R.drawable.setting_group_icon_0;
        } else if (i == 1) {
            imageView = this.c.f835a;
            resources = this.f831a.getResources();
            i2 = R.drawable.setting_group_icon_1;
        } else if (i != 2) {
            if (i == 3) {
                imageView = this.c.f835a;
                resources = this.f831a.getResources();
                i2 = R.drawable.setting_group_icon_3;
            }
            c0.a(0, "SettingExpendableListAdapter", "TET ------- GROUP111111:" + i);
            return view;
        } else {
            imageView = this.c.f835a;
            resources = this.f831a.getResources();
            i2 = R.drawable.setting_group_icon_2;
        }
        imageView.setBackgroundDrawable(resources.getDrawable(i2));
        c0.a(0, "SettingExpendableListAdapter", "TET ------- GROUP111111:" + i);
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public void onClick(View view) {
        Context context;
        Resources resources;
        int i;
        ToggleButton toggleButton = (ToggleButton) view;
        boolean isChecked = toggleButton.isChecked();
        String str = (String) view.getTag();
        c0.a(0, "SettingExpendableListAdapter", "onClick --- tag = " + str + " value = " + isChecked);
        if (b.c.a.a.d.b.p) {
            toggleButton.setChecked(!toggleButton.isChecked());
            context = this.f831a;
            resources = context.getResources();
            i = R.string.device_offline;
        } else if (!b.c.a.a.d.b.q) {
            toggleButton.setChecked(!toggleButton.isChecked());
            context = this.f831a;
            resources = context.getResources();
            i = R.string.device_is_preparing;
        } else {
            d dVar = this.g;
            if (dVar != null) {
                dVar.a(str, isChecked);
                return;
            } else {
                c0.a(3, "SettingExpendableListAdapter", "toggleListener == null!");
                return;
            }
        }
        o.g(context, resources.getString(i), false);
    }
}
