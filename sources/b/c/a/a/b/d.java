package b.c.a.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.rp.rptool.util.e0;
import com.xforce.v5.xdvpro.R;
import java.util.ArrayList;
import java.util.List;

public class d extends BaseExpandableListAdapter {

    /* renamed from: a  reason: collision with root package name */
    private String f841a;

    /* renamed from: b  reason: collision with root package name */
    private List<b.c.a.a.c.b> f842b;
    private List<String> c;
    private Context d;
    private LayoutInflater e;
    private b f;
    private a g;
    private b.c.a.a.c.b h;
    private List<b.c.a.a.c.b> i;
    private boolean j = false;
    private boolean k = false;
    private Animation l;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout f843a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public TextView f844b;
        /* access modifiers changed from: private */
        public TextView c;
        /* access modifiers changed from: private */
        public ImageView d;
        /* access modifiers changed from: private */
        public ImageView e;
    }

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public TextView f845a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ImageView f846b;
    }

    public d(Context context, List<b.c.a.a.c.b> list, List<String> list2) {
        this.d = context;
        this.e = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f841a = e0.o().m(context);
        this.f842b = list;
        this.c = list2;
    }

    private List<b.c.a.a.c.b> a(List<String> list, List<b.c.a.a.c.b> list2) {
        if (list == null && list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = list.get(i2);
                b.c.a.a.c.a i3 = b.c.a.a.d.b.i(str);
                if (i3 != null) {
                    b.c.a.a.c.b bVar = new b.c.a.a.c.b(str, i3.b(), 1, b.c.a.a.c.b.l, true);
                    bVar.j(true);
                    bVar.i(true);
                    arrayList.add(bVar);
                }
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                b.c.a.a.c.b bVar2 = list2.get(i4);
                String b2 = bVar2.b();
                if (list.contains(b2)) {
                    int indexOf = list.indexOf(b2);
                    if (indexOf < arrayList.size()) {
                        b.c.a.a.c.b bVar3 = (b.c.a.a.c.b) arrayList.get(indexOf);
                        bVar3.j(true);
                        bVar3.i(false);
                        bVar3.h(bVar2.a());
                        bVar3.k(bVar2.d());
                    }
                } else {
                    arrayList.add(bVar2);
                }
            }
        }
        return arrayList;
    }

    public b.c.a.a.c.b b(String str) {
        List<b.c.a.a.c.b> list = this.i;
        b.c.a.a.c.b bVar = null;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bVar = this.i.get(i2);
            if (bVar.b().equals(str)) {
                break;
            }
        }
        return bVar;
    }

    public boolean c() {
        return this.j;
    }

    public void d(String str) {
        this.f841a = str;
    }

    public void e(boolean z) {
        this.j = z;
    }

    public void f(List<b.c.a.a.c.b> list) {
        this.f842b = list;
    }

    public Object getChild(int i2, int i3) {
        if (i2 == 0) {
            String str = this.f841a;
            return (str == null || "".equals(str) || this.f841a.contains("unknown") || "0x".equals(this.f841a)) ? this.d.getResources().getString(R.string.phone_network) : this.f841a;
        }
        List<b.c.a.a.c.b> list = this.i;
        return list != null ? list.get(i3).b() : "";
    }

    public long getChildId(int i2, int i3) {
        return 0;
    }

    public View getChildView(int i2, int i3, boolean z, View view, ViewGroup viewGroup) {
        Resources resources;
        RelativeLayout relativeLayout;
        int i4;
        Resources resources2;
        TextView textView;
        int i5;
        int i6;
        Resources resources3;
        ImageView imageView;
        String str;
        TextView textView2;
        this.g = null;
        if (view == null) {
            view = this.e.inflate(R.layout.wifi_child_item, (ViewGroup) null);
            a aVar = new a();
            this.g = aVar;
            RelativeLayout unused = aVar.f843a = (RelativeLayout) view.findViewById(R.id.file_child_bg);
            TextView unused2 = this.g.f844b = (TextView) view.findViewById(R.id.wifi_child_name);
            TextView unused3 = this.g.c = (TextView) view.findViewById(R.id.wifi_child_state);
            ImageView unused4 = this.g.d = (ImageView) view.findViewById(R.id.wifi_child_lock);
            ImageView unused5 = this.g.e = (ImageView) view.findViewById(R.id.wifi_child_level);
            view.setTag(this.g);
        } else {
            this.g = (a) view.getTag();
        }
        if (z) {
            relativeLayout = this.g.f843a;
            resources = this.d.getResources();
            i4 = R.drawable.file_last_item_bg_selector;
        } else {
            relativeLayout = this.g.f843a;
            resources = this.d.getResources();
            i4 = R.drawable.file_item_bg_selector;
        }
        relativeLayout.setBackgroundDrawable(resources.getDrawable(i4));
        if (i2 == 0) {
            this.g.f844b.setGravity(16);
            String str2 = this.f841a;
            if (str2 == null || "".equals(str2) || this.f841a.contains("unknown") || "0x".equals(this.f841a)) {
                textView2 = this.g.f844b;
                str = this.d.getResources().getString(R.string.phone_network);
            } else {
                textView2 = this.g.f844b;
                str = this.f841a;
            }
            textView2.setText(str);
            this.g.c.setVisibility(8);
            this.g.d.setVisibility(8);
            this.g.e.setVisibility(8);
        } else {
            this.g.f844b.setGravity(80);
            this.g.c.setVisibility(0);
            this.g.d.setVisibility(0);
            this.g.e.setVisibility(0);
            this.h = this.i.get(i3);
            this.g.f844b.setText(this.h.b());
            this.g.c.setTextColor(this.d.getResources().getColor(R.color.edittext_color));
            if (this.h.f()) {
                textView = this.g.c;
                resources2 = this.d.getResources();
                i5 = R.string.saved;
            } else {
                textView = this.g.c;
                resources2 = this.d.getResources();
                i5 = R.string.wifi_protected;
            }
            textView.setText(resources2.getString(i5));
            if (this.h.g()) {
                this.g.d.setVisibility(0);
            } else {
                this.g.d.setVisibility(8);
            }
            int d2 = this.h.d();
            if (d2 != 0) {
                i6 = R.drawable.wifi_lv_mid;
                if (d2 == 1 || d2 != 2) {
                    imageView = this.g.e;
                    resources3 = this.d.getResources();
                } else {
                    imageView = this.g.e;
                    resources3 = this.d.getResources();
                    i6 = R.drawable.wifi_lv_high;
                }
            } else {
                imageView = this.g.e;
                resources3 = this.d.getResources();
                i6 = R.drawable.wifi_lv_low;
            }
            imageView.setBackgroundDrawable(resources3.getDrawable(i6));
            if (this.h.e()) {
                this.g.d.setVisibility(8);
                this.g.e.setVisibility(8);
                this.g.c.setText(this.d.getResources().getString(R.string.offline));
            }
        }
        return view;
    }

    public int getChildrenCount(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1 || this.i == null) {
            return 0;
        }
        return this.f842b.size();
    }

    public Object getGroup(int i2) {
        return null;
    }

    public int getGroupCount() {
        return 2;
    }

    public long getGroupId(int i2) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        if (b.c.a.a.b.d.b.c(r2.f).getVisibility() != 8) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getGroupView(int r3, boolean r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r2 = this;
            r4 = 0
            r2.f = r4
            if (r5 != 0) goto L_0x0035
            android.view.LayoutInflater r5 = r2.e
            r6 = 2131361863(0x7f0a0047, float:1.834349E38)
            android.view.View r5 = r5.inflate(r6, r4)
            b.c.a.a.b.d$b r4 = new b.c.a.a.b.d$b
            r4.<init>()
            r2.f = r4
            r6 = 2131231040(0x7f080140, float:1.807815E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.widget.TextView unused = r4.f845a = r6
            b.c.a.a.b.d$b r4 = r2.f
            r6 = 2131231042(0x7f080142, float:1.8078154E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            android.widget.ImageView unused = r4.f846b = r6
            b.c.a.a.b.d$b r4 = r2.f
            r5.setTag(r4)
            goto L_0x003d
        L_0x0035:
            java.lang.Object r4 = r5.getTag()
            b.c.a.a.b.d$b r4 = (b.c.a.a.b.d.b) r4
            r2.f = r4
        L_0x003d:
            r4 = 8
            if (r3 != 0) goto L_0x0061
            b.c.a.a.b.d$b r3 = r2.f
            android.widget.TextView r3 = r3.f845a
            android.content.Context r6 = r2.d
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131492918(0x7f0c0036, float:1.8609301E38)
            java.lang.String r6 = r6.getString(r0)
            r3.setText(r6)
        L_0x0057:
            b.c.a.a.b.d$b r3 = r2.f
            android.widget.ImageView r3 = r3.f846b
            r3.setVisibility(r4)
            goto L_0x00c6
        L_0x0061:
            r6 = 1
            if (r3 != r6) goto L_0x00c6
            b.c.a.a.b.d$b r3 = r2.f
            android.widget.TextView r3 = r3.f845a
            android.content.Context r0 = r2.d
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131493089(0x7f0c00e1, float:1.8609648E38)
            java.lang.String r0 = r0.getString(r1)
            r3.setText(r0)
            b.c.a.a.b.d$b r3 = r2.f
            android.widget.ImageView r3 = r3.f846b
            r3.setVisibility(r4)
            boolean r3 = r2.j
            if (r3 == 0) goto L_0x00b9
            b.c.a.a.b.d$b r3 = r2.f
            android.widget.ImageView r3 = r3.f846b
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L_0x009d
            b.c.a.a.b.d$b r3 = r2.f
            android.widget.ImageView r3 = r3.f846b
            r4 = 0
            r3.setVisibility(r4)
        L_0x009d:
            boolean r3 = r2.k
            if (r3 != 0) goto L_0x00c6
            r2.k = r6
            android.content.Context r3 = r2.d
            r4 = 2130771968(0x7f010000, float:1.7147041E38)
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4)
            r2.l = r3
            b.c.a.a.b.d$b r3 = r2.f
            android.widget.ImageView r3 = r3.f846b
            android.view.animation.Animation r4 = r2.l
            r3.startAnimation(r4)
            goto L_0x00c6
        L_0x00b9:
            b.c.a.a.b.d$b r3 = r2.f
            android.widget.ImageView r3 = r3.f846b
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L_0x00c6
            goto L_0x0057
        L_0x00c6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.a.a.b.d.getGroupView(int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i2, int i3) {
        return true;
    }

    public void notifyDataSetChanged() {
        this.i = a(this.c, this.f842b);
        super.notifyDataSetChanged();
    }
}
