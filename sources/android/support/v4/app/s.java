package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.view.g;
import android.support.v4.view.h;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class s {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f141b;
        final /* synthetic */ ArrayList c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ ArrayList e;

        a(s sVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f140a = i;
            this.f141b = arrayList;
            this.c = arrayList2;
            this.d = arrayList3;
            this.e = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f140a; i++) {
                g.n((View) this.f141b.get(i), (String) this.c.get(i));
                g.n((View) this.d.get(i), (String) this.e.get(i));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f142a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f143b;

        b(s sVar, ArrayList arrayList, Map map) {
            this.f142a = arrayList;
            this.f143b = map;
        }

        public void run() {
            int size = this.f142a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f142a.get(i);
                String e = g.e(view);
                if (e != null) {
                    g.n(view, s.i(this.f143b, e));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f145b;

        c(s sVar, ArrayList arrayList, Map map) {
            this.f144a = arrayList;
            this.f145b = map;
        }

        public void run() {
            int size = this.f144a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f144a.get(i);
                g.n(view, (String) this.f145b.get(g.e(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a2 = h.a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a2) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String e = g.e(view);
            if (e != null) {
                map.put(e, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(g.e(view));
            g.n(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        u.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    /* access modifiers changed from: package-private */
    public void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        u.a(view, new b(this, arrayList, map));
    }

    /* access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String e = g.e(view2);
            arrayList4.add(e);
            if (e != null) {
                g.n(view2, (String) null);
                String str = map.get(e);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        g.n(arrayList2.get(i2), e);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        u.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
