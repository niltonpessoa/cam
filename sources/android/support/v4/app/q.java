package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.g;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class q {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f123a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final s f124b = (Build.VERSION.SDK_INT >= 21 ? new r() : null);
    private static final s c = x();

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f125a;

        a(ArrayList arrayList) {
            this.f125a = arrayList;
        }

        public void run() {
            q.B(this.f125a, 4);
        }
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f127b;
        final /* synthetic */ View c;
        final /* synthetic */ e d;
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ Object h;

        b(Object obj, s sVar, View view, e eVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f126a = obj;
            this.f127b = sVar;
            this.c = view;
            this.d = eVar;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = arrayList3;
            this.h = obj2;
        }

        public void run() {
            Object obj = this.f126a;
            if (obj != null) {
                this.f127b.p(obj, this.c);
                this.f.addAll(q.k(this.f127b, this.f126a, this.d, this.e, this.c));
            }
            if (this.g != null) {
                if (this.h != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.c);
                    this.f127b.q(this.h, this.g, arrayList);
                }
                this.g.clear();
                this.g.add(this.c);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f129b;
        final /* synthetic */ boolean c;
        final /* synthetic */ a.b.b.b.a d;
        final /* synthetic */ View e;
        final /* synthetic */ s f;
        final /* synthetic */ Rect g;

        c(e eVar, e eVar2, boolean z, a.b.b.b.a aVar, View view, s sVar, Rect rect) {
            this.f128a = eVar;
            this.f129b = eVar2;
            this.c = z;
            this.d = aVar;
            this.e = view;
            this.f = sVar;
            this.g = rect;
        }

        public void run() {
            q.f(this.f128a, this.f129b, this.c, this.d, false);
            View view = this.e;
            if (view != null) {
                this.f.k(view, this.g);
            }
        }
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.b.b.b.a f131b;
        final /* synthetic */ Object c;
        final /* synthetic */ e d;
        final /* synthetic */ ArrayList e;
        final /* synthetic */ View f;
        final /* synthetic */ e g;
        final /* synthetic */ e h;
        final /* synthetic */ boolean i;
        final /* synthetic */ ArrayList j;
        final /* synthetic */ Object k;
        final /* synthetic */ Rect l;

        d(s sVar, a.b.b.b.a aVar, Object obj, e eVar, ArrayList arrayList, View view, e eVar2, e eVar3, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f130a = sVar;
            this.f131b = aVar;
            this.c = obj;
            this.d = eVar;
            this.e = arrayList;
            this.f = view;
            this.g = eVar2;
            this.h = eVar3;
            this.i = z;
            this.j = arrayList2;
            this.k = obj2;
            this.l = rect;
        }

        public void run() {
            a.b.b.b.a<String, View> h2 = q.h(this.f130a, this.f131b, this.c, this.d);
            if (h2 != null) {
                this.e.addAll(h2.values());
                this.e.add(this.f);
            }
            q.f(this.g, this.h, this.i, h2, false);
            Object obj = this.c;
            if (obj != null) {
                this.f130a.z(obj, this.j, this.e);
                View t = q.t(h2, this.d, this.k, this.i);
                if (t != null) {
                    this.f130a.k(t, this.l);
                }
            }
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        public e f132a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f133b;
        public b c;
        public e d;
        public boolean e;
        public b f;

        e() {
        }
    }

    private static void A(s sVar, Object obj, Object obj2, a.b.b.b.a<String, View> aVar, boolean z, b bVar) {
        ArrayList<String> arrayList = bVar.q;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? bVar.r : bVar.q).get(0));
            sVar.v(obj, view);
            if (obj2 != null) {
                sVar.v(obj2, view);
            }
        }
    }

    static void B(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    static void C(k kVar, ArrayList<b> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (kVar.l >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                b bVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    e(bVar, sparseArray, z);
                } else {
                    c(bVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(kVar.m.e());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    a.b.b.b.a<String, String> d2 = d(keyAt, arrayList, arrayList2, i, i2);
                    e eVar = (e) sparseArray.valueAt(i4);
                    if (z) {
                        o(kVar, keyAt, eVar, view, d2);
                    } else {
                        n(kVar, keyAt, eVar, view, d2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, a.b.b.b.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l = aVar.l(size);
            if (collection.contains(g.e(l))) {
                arrayList.add(l);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.k != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0090, code lost:
        if (r10.A == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(android.support.v4.app.b r16, android.support.v4.app.b.a r17, android.util.SparseArray<android.support.v4.app.q.e> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            android.support.v4.app.e r10 = r1.f74b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.y
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f123a
            int r1 = r1.f73a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f73a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0085
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0085
            r1 = 0
        L_0x0031:
            r12 = 0
            r13 = 0
            goto L_0x0098
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.O
            if (r1 == 0) goto L_0x0094
            boolean r1 = r10.A
            if (r1 != 0) goto L_0x0094
            boolean r1 = r10.k
            if (r1 == 0) goto L_0x0094
            goto L_0x0092
        L_0x0044:
            boolean r1 = r10.A
            goto L_0x0095
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.O
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.k
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.A
            if (r1 == 0) goto L_0x0078
        L_0x0055:
            goto L_0x0076
        L_0x0056:
            boolean r1 = r10.k
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.A
            if (r1 != 0) goto L_0x0078
            goto L_0x0055
        L_0x005f:
            boolean r1 = r10.k
            if (r20 == 0) goto L_0x007a
            if (r1 != 0) goto L_0x0078
            android.view.View r1 = r10.I
            if (r1 == 0) goto L_0x0078
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0078
            float r1 = r10.P
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x0081
        L_0x0078:
            r1 = 0
            goto L_0x0081
        L_0x007a:
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.A
            if (r1 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0081:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x0098
        L_0x0085:
            if (r20 == 0) goto L_0x008a
            boolean r1 = r10.N
            goto L_0x0095
        L_0x008a:
            boolean r1 = r10.k
            if (r1 != 0) goto L_0x0094
            boolean r1 = r10.A
            if (r1 != 0) goto L_0x0094
        L_0x0092:
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            r4 = r1
            r1 = 1
            goto L_0x0031
        L_0x0098:
            java.lang.Object r6 = r2.get(r11)
            android.support.v4.app.q$e r6 = (android.support.v4.app.q.e) r6
            if (r4 == 0) goto L_0x00aa
            android.support.v4.app.q$e r6 = p(r6, r2, r11)
            r6.f132a = r10
            r6.f133b = r3
            r6.c = r0
        L_0x00aa:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d1
            if (r1 == 0) goto L_0x00d1
            if (r14 == 0) goto L_0x00b8
            android.support.v4.app.e r1 = r14.d
            if (r1 != r10) goto L_0x00b8
            r14.d = r15
        L_0x00b8:
            android.support.v4.app.k r4 = r0.f71a
            int r1 = r10.f79a
            if (r1 >= r5) goto L_0x00d1
            int r1 = r4.l
            if (r1 < r5) goto L_0x00d1
            boolean r1 = r0.s
            if (r1 != 0) goto L_0x00d1
            r4.u0(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.E0(r5, r6, r7, r8, r9)
        L_0x00d1:
            if (r13 == 0) goto L_0x00e3
            if (r14 == 0) goto L_0x00d9
            android.support.v4.app.e r1 = r14.d
            if (r1 != 0) goto L_0x00e3
        L_0x00d9:
            android.support.v4.app.q$e r14 = p(r14, r2, r11)
            r14.d = r10
            r14.e = r3
            r14.f = r0
        L_0x00e3:
            if (r20 != 0) goto L_0x00ef
            if (r12 == 0) goto L_0x00ef
            if (r14 == 0) goto L_0x00ef
            android.support.v4.app.e r0 = r14.f132a
            if (r0 != r10) goto L_0x00ef
            r14.f132a = r15
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.q.b(android.support.v4.app.b, android.support.v4.app.b$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(b bVar, SparseArray<e> sparseArray, boolean z) {
        int size = bVar.f72b.size();
        for (int i = 0; i < size; i++) {
            b(bVar, bVar.f72b.get(i), sparseArray, false, z);
        }
    }

    private static a.b.b.b.a<String, String> d(int i, ArrayList<b> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        a.b.b.b.a<String, String> aVar = new a.b.b.b.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            b bVar = arrayList.get(i4);
            if (bVar.p(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = bVar.q;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = bVar.q;
                        arrayList4 = bVar.r;
                    } else {
                        ArrayList<String> arrayList6 = bVar.q;
                        arrayList3 = bVar.r;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(b bVar, SparseArray<e> sparseArray, boolean z) {
        if (bVar.f71a.n.c()) {
            for (int size = bVar.f72b.size() - 1; size >= 0; size--) {
                b(bVar, bVar.f72b.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(e eVar, e eVar2, boolean z, a.b.b.b.a<String, View> aVar, boolean z2) {
        v o = z ? eVar2.o() : eVar.o();
        if (o != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.i(i));
                arrayList.add(aVar.l(i));
            }
            if (z2) {
                o.c(arrayList2, arrayList, (List<View>) null);
            } else {
                o.b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    private static boolean g(s sVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!sVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static a.b.b.b.a<String, View> h(s sVar, a.b.b.b.a<String, String> aVar, Object obj, e eVar) {
        v vVar;
        ArrayList<String> arrayList;
        String q;
        e eVar2 = eVar.f132a;
        View D = eVar2.D();
        if (aVar.isEmpty() || obj == null || D == null) {
            aVar.clear();
            return null;
        }
        a.b.b.b.a<String, View> aVar2 = new a.b.b.b.a<>();
        sVar.j(aVar2, D);
        b bVar = eVar.c;
        if (eVar.f133b) {
            vVar = eVar2.q();
            arrayList = bVar.q;
        } else {
            vVar = eVar2.o();
            arrayList = bVar.r;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        if (vVar != null) {
            vVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String q2 = q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(g.e(view)) && (q = q(aVar, str)) != null) {
                    aVar.put(q, g.e(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static a.b.b.b.a<String, View> i(s sVar, a.b.b.b.a<String, String> aVar, Object obj, e eVar) {
        v vVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        e eVar2 = eVar.d;
        a.b.b.b.a<String, View> aVar2 = new a.b.b.b.a<>();
        sVar.j(aVar2, eVar2.D());
        b bVar = eVar.f;
        if (eVar.e) {
            vVar = eVar2.o();
            arrayList = bVar.r;
        } else {
            vVar = eVar2.q();
            arrayList = bVar.q;
        }
        aVar2.n(arrayList);
        if (vVar != null) {
            vVar.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(g.e(view))) {
                    aVar.put(g.e(view), aVar.remove(str));
                }
            }
        } else {
            aVar.n(aVar2.keySet());
        }
        return aVar2;
    }

    private static s j(e eVar, e eVar2) {
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            Object p = eVar.p();
            if (p != null) {
                arrayList.add(p);
            }
            Object z = eVar.z();
            if (z != null) {
                arrayList.add(z);
            }
            Object B = eVar.B();
            if (B != null) {
                arrayList.add(B);
            }
        }
        if (eVar2 != null) {
            Object n = eVar2.n();
            if (n != null) {
                arrayList.add(n);
            }
            Object x = eVar2.x();
            if (x != null) {
                arrayList.add(x);
            }
            Object A = eVar2.A();
            if (A != null) {
                arrayList.add(A);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        s sVar = f124b;
        if (sVar != null && g(sVar, arrayList)) {
            return sVar;
        }
        s sVar2 = c;
        if (sVar2 != null && g(sVar2, arrayList)) {
            return sVar2;
        }
        if (sVar == null && sVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(s sVar, Object obj, e eVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View D = eVar.D();
        if (D != null) {
            sVar.f(arrayList2, D);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        sVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(s sVar, ViewGroup viewGroup, View view, a.b.b.b.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        a.b.b.b.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        s sVar2 = sVar;
        e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        e eVar3 = eVar2.f132a;
        e eVar4 = eVar2.d;
        if (eVar3 == null || eVar4 == null) {
            return null;
        }
        boolean z = eVar2.f133b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = u(sVar2, eVar3, eVar4, z);
            aVar2 = aVar;
        }
        a.b.b.b.a<String, View> i = i(sVar2, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(eVar3, eVar4, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            sVar2.y(obj4, view, arrayList3);
            A(sVar, obj4, obj2, i, eVar2.e, eVar2.f);
            if (obj5 != null) {
                sVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        d dVar = r0;
        d dVar2 = new d(sVar, aVar, obj4, eVar, arrayList2, view, eVar3, eVar4, z, arrayList, obj, rect);
        u.a(viewGroup, dVar);
        return obj4;
    }

    private static Object m(s sVar, ViewGroup viewGroup, View view, a.b.b.b.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        s sVar2 = sVar;
        View view3 = view;
        a.b.b.b.a<String, String> aVar2 = aVar;
        e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        e eVar3 = eVar2.f132a;
        e eVar4 = eVar2.d;
        if (eVar3 != null) {
            eVar3.D().setVisibility(0);
        }
        if (eVar3 == null || eVar4 == null) {
            return null;
        }
        boolean z = eVar2.f133b;
        Object u = aVar.isEmpty() ? null : u(sVar, eVar3, eVar4, z);
        a.b.b.b.a<String, View> i = i(sVar, aVar2, u, eVar2);
        a.b.b.b.a<String, View> h = h(sVar, aVar2, u, eVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj3 = null;
        } else {
            a(arrayList3, i, aVar.keySet());
            a(arrayList4, h, aVar.values());
            obj3 = u;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(eVar3, eVar4, z, i, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            sVar.y(obj3, view3, arrayList3);
            A(sVar, obj3, obj2, i, eVar2.e, eVar2.f);
            Rect rect2 = new Rect();
            View t = t(h, eVar2, obj4, z);
            if (t != null) {
                sVar.u(obj4, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        u.a(viewGroup, new c(eVar3, eVar4, z, h, view2, sVar, rect));
        return obj3;
    }

    private static void n(k kVar, int i, e eVar, View view, a.b.b.b.a<String, String> aVar) {
        e eVar2;
        e eVar3;
        s j;
        Object obj;
        k kVar2 = kVar;
        e eVar4 = eVar;
        View view2 = view;
        a.b.b.b.a<String, String> aVar2 = aVar;
        ViewGroup viewGroup = kVar2.n.c() ? (ViewGroup) kVar2.n.b(i) : null;
        if (viewGroup != null && (j = j(eVar3, eVar2)) != null) {
            boolean z = eVar4.f133b;
            boolean z2 = eVar4.e;
            Object r = r(j, (eVar2 = eVar4.f132a), z);
            Object s = s(j, (eVar3 = eVar4.d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s;
            s sVar = j;
            Object l = l(j, viewGroup, view, aVar, eVar, arrayList, arrayList2, r, obj2);
            Object obj3 = r;
            if (obj3 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> k = k(sVar, obj, eVar3, arrayList3, view2);
            Object obj4 = (k == null || k.isEmpty()) ? null : obj;
            sVar.a(obj3, view2);
            Object v = v(sVar, obj3, obj4, l, eVar2, eVar4.f133b);
            if (v != null) {
                ArrayList arrayList4 = new ArrayList();
                s sVar2 = sVar;
                sVar2.t(v, obj3, arrayList4, obj4, k, l, arrayList2);
                z(sVar2, viewGroup, eVar2, view, arrayList2, obj3, arrayList4, obj4, k);
                ArrayList arrayList5 = arrayList2;
                sVar.w(viewGroup, arrayList5, aVar2);
                sVar.c(viewGroup, v);
                sVar.s(viewGroup, arrayList5, aVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r11 = r4.f132a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void o(android.support.v4.app.k r17, int r18, android.support.v4.app.q.e r19, android.view.View r20, a.b.b.b.a<java.lang.String, java.lang.String> r21) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            android.support.v4.app.g r1 = r0.n
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0019
            android.support.v4.app.g r0 = r0.n
            r1 = r18
            android.view.View r0 = r0.b(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r10 = r0
            if (r10 != 0) goto L_0x001e
            return
        L_0x001e:
            android.support.v4.app.e r11 = r4.f132a
            android.support.v4.app.e r12 = r4.d
            android.support.v4.app.s r13 = j(r12, r11)
            if (r13 != 0) goto L_0x0029
            return
        L_0x0029:
            boolean r14 = r4.f133b
            boolean r0 = r4.e
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = r(r13, r11, r14)
            java.lang.Object r6 = s(r13, r12, r0)
            r0 = r13
            r1 = r10
            r2 = r20
            r3 = r21
            r4 = r19
            r5 = r8
            r17 = r6
            r6 = r15
            r18 = r7
            r16 = r10
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0061
            if (r8 != 0) goto L_0x0061
            r7 = r17
            if (r7 != 0) goto L_0x0063
            return
        L_0x0061:
            r7 = r17
        L_0x0063:
            java.util.ArrayList r5 = k(r13, r7, r12, r10, r9)
            java.util.ArrayList r9 = k(r13, r6, r11, r15, r9)
            r0 = 4
            B(r9, r0)
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r11 = r5
            r5 = r14
            java.lang.Object r14 = v(r0, r1, r2, r3, r4, r5)
            if (r14 == 0) goto L_0x00a4
            w(r13, r7, r12, r11)
            java.util.ArrayList r12 = r13.o(r15)
            r0 = r13
            r1 = r14
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r7 = r15
            r0.t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r13.c(r0, r14)
            r1 = r13
            r2 = r0
            r3 = r10
            r4 = r15
            r5 = r12
            r6 = r21
            r1.x(r2, r3, r4, r5, r6)
            r0 = 0
            B(r9, r0)
            r13.z(r8, r10, r15)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.q.o(android.support.v4.app.k, int, android.support.v4.app.q$e, android.view.View, a.b.b.b.a):void");
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    private static String q(a.b.b.b.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.l(i))) {
                return aVar.i(i);
            }
        }
        return null;
    }

    private static Object r(s sVar, e eVar, boolean z) {
        if (eVar == null) {
            return null;
        }
        return sVar.g(z ? eVar.x() : eVar.n());
    }

    private static Object s(s sVar, e eVar, boolean z) {
        if (eVar == null) {
            return null;
        }
        return sVar.g(z ? eVar.z() : eVar.p());
    }

    static View t(a.b.b.b.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        b bVar = eVar.c;
        if (obj == null || aVar == null || (arrayList = bVar.q) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? bVar.q : bVar.r).get(0));
    }

    private static Object u(s sVar, e eVar, e eVar2, boolean z) {
        if (eVar == null || eVar2 == null) {
            return null;
        }
        return sVar.A(sVar.g(z ? eVar2.B() : eVar.A()));
    }

    private static Object v(s sVar, Object obj, Object obj2, Object obj3, e eVar, boolean z) {
        return (obj == null || obj2 == null || eVar == null) ? true : z ? eVar.i() : eVar.h() ? sVar.n(obj2, obj, obj3) : sVar.m(obj2, obj, obj3);
    }

    private static void w(s sVar, Object obj, e eVar, ArrayList<View> arrayList) {
        if (eVar != null && obj != null && eVar.k && eVar.A && eVar.O) {
            eVar.X0(true);
            sVar.r(obj, eVar.D(), arrayList);
            u.a(eVar.H, new a(arrayList));
        }
    }

    private static s x() {
        try {
            return (s) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(a.b.b.b.a<String, String> aVar, a.b.b.b.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void z(s sVar, ViewGroup viewGroup, e eVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        u.a(viewGroup, new b(obj, sVar, view, eVar, arrayList, arrayList2, arrayList3, obj2));
    }
}
