package android.arch.lifecycle;

import android.arch.lifecycle.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class f extends c {

    /* renamed from: a  reason: collision with root package name */
    private a.a.a.b.a<d, b> f55a = new a.a.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    private c.b f56b;
    private final WeakReference<e> c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<c.b> g = new ArrayList<>();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f58b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                android.arch.lifecycle.c$b[] r0 = android.arch.lifecycle.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58b = r0
                r1 = 1
                android.arch.lifecycle.c$b r2 = android.arch.lifecycle.c.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f58b     // Catch:{ NoSuchFieldError -> 0x001d }
                android.arch.lifecycle.c$b r3 = android.arch.lifecycle.c.b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f58b     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.arch.lifecycle.c$b r4 = android.arch.lifecycle.c.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f58b     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.arch.lifecycle.c$b r5 = android.arch.lifecycle.c.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f58b     // Catch:{ NoSuchFieldError -> 0x003e }
                android.arch.lifecycle.c$b r6 = android.arch.lifecycle.c.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                android.arch.lifecycle.c$a[] r5 = android.arch.lifecycle.c.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f57a = r5
                android.arch.lifecycle.c$a r6 = android.arch.lifecycle.c.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f57a     // Catch:{ NoSuchFieldError -> 0x0059 }
                android.arch.lifecycle.c$a r5 = android.arch.lifecycle.c.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f57a     // Catch:{ NoSuchFieldError -> 0x0063 }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f57a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f57a     // Catch:{ NoSuchFieldError -> 0x0077 }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f57a     // Catch:{ NoSuchFieldError -> 0x0082 }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f57a     // Catch:{ NoSuchFieldError -> 0x008d }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.lifecycle.f.a.<clinit>():void");
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        c.b f59a;

        /* renamed from: b  reason: collision with root package name */
        GenericLifecycleObserver f60b;

        b(d dVar, c.b bVar) {
            this.f60b = h.d(dVar);
            this.f59a = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(e eVar, c.a aVar) {
            c.b h = f.h(aVar);
            this.f59a = f.l(this.f59a, h);
            this.f60b.g(eVar, aVar);
            this.f59a = h;
        }
    }

    public f(e eVar) {
        this.c = new WeakReference<>(eVar);
        this.f56b = c.b.INITIALIZED;
    }

    private void d(e eVar) {
        Iterator<Map.Entry<d, b>> descendingIterator = this.f55a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f) {
            Map.Entry next = descendingIterator.next();
            b bVar = (b) next.getValue();
            while (bVar.f59a.compareTo(this.f56b) > 0 && !this.f && this.f55a.contains(next.getKey())) {
                c.a f2 = f(bVar.f59a);
                o(h(f2));
                bVar.a(eVar, f2);
                n();
            }
        }
    }

    private c.b e(d dVar) {
        Map.Entry<d, b> i = this.f55a.i(dVar);
        c.b bVar = null;
        c.b bVar2 = i != null ? i.getValue().f59a : null;
        if (!this.g.isEmpty()) {
            ArrayList<c.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.f56b, bVar2), bVar);
    }

    private static c.a f(c.b bVar) {
        int i = a.f58b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return c.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return c.a.ON_STOP;
            }
            if (i == 4) {
                return c.a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    private void g(e eVar) {
        a.a.a.b.b<K, V>.e d2 = this.f55a.d();
        while (d2.hasNext() && !this.f) {
            Map.Entry entry = (Map.Entry) d2.next();
            b bVar = (b) entry.getValue();
            while (bVar.f59a.compareTo(this.f56b) < 0 && !this.f && this.f55a.contains(entry.getKey())) {
                o(bVar.f59a);
                bVar.a(eVar, q(bVar.f59a));
                n();
            }
        }
    }

    static c.b h(c.a aVar) {
        switch (a.f57a[aVar.ordinal()]) {
            case 1:
            case 2:
                return c.b.CREATED;
            case 3:
            case 4:
                return c.b.STARTED;
            case 5:
                return c.b.RESUMED;
            case 6:
                return c.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.f55a.size() == 0) {
            return true;
        }
        c.b bVar = this.f55a.b().getValue().f59a;
        c.b bVar2 = this.f55a.e().getValue().f59a;
        return bVar == bVar2 && this.f56b == bVar2;
    }

    static c.b l(c.b bVar, c.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(c.b bVar) {
        if (this.f56b != bVar) {
            this.f56b = bVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            p();
            this.e = false;
        }
    }

    private void n() {
        ArrayList<c.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(c.b bVar) {
        this.g.add(bVar);
    }

    private void p() {
        e eVar = (e) this.c.get();
        if (eVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            boolean j = j();
            this.f = false;
            if (!j) {
                if (this.f56b.compareTo(this.f55a.b().getValue().f59a) < 0) {
                    d(eVar);
                }
                Map.Entry<d, b> e2 = this.f55a.e();
                if (!this.f && e2 != null && this.f56b.compareTo(e2.getValue().f59a) > 0) {
                    g(eVar);
                }
            } else {
                return;
            }
        }
    }

    private static c.a q(c.b bVar) {
        int i = a.f58b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c.a.ON_START;
            }
            if (i == 3) {
                return c.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return c.a.ON_CREATE;
    }

    public void a(d dVar) {
        e eVar;
        c.b bVar = this.f56b;
        c.b bVar2 = c.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = c.b.INITIALIZED;
        }
        b bVar3 = new b(dVar, bVar2);
        if (this.f55a.g(dVar, bVar3) == null && (eVar = (e) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            c.b e2 = e(dVar);
            this.d++;
            while (bVar3.f59a.compareTo(e2) < 0 && this.f55a.contains(dVar)) {
                o(bVar3.f59a);
                bVar3.a(eVar, q(bVar3.f59a));
                n();
                e2 = e(dVar);
            }
            if (!z) {
                p();
            }
            this.d--;
        }
    }

    public c.b b() {
        return this.f56b;
    }

    public void c(d dVar) {
        this.f55a.h(dVar);
    }

    public void i(c.a aVar) {
        m(h(aVar));
    }

    public void k(c.b bVar) {
        m(bVar);
    }
}
