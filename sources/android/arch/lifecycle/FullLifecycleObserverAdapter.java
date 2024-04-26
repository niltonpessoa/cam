package android.arch.lifecycle;

import android.arch.lifecycle.c;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final FullLifecycleObserver f38a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.arch.lifecycle.c$a[] r0 = android.arch.lifecycle.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39a = r0
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f39a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f39a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f39a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.arch.lifecycle.c$a r1 = android.arch.lifecycle.c.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.lifecycle.FullLifecycleObserverAdapter.a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f38a = fullLifecycleObserver;
    }

    public void g(e eVar, c.a aVar) {
        switch (a.f39a[aVar.ordinal()]) {
            case 1:
                this.f38a.d(eVar);
                return;
            case 2:
                this.f38a.c(eVar);
                return;
            case 3:
                this.f38a.f(eVar);
                return;
            case 4:
                this.f38a.e(eVar);
                return;
            case 5:
                this.f38a.b(eVar);
                return;
            case 6:
                this.f38a.a(eVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
