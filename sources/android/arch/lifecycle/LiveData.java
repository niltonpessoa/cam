package android.arch.lifecycle;

import a.a.a.b.b;
import android.arch.lifecycle.c;
import java.util.Map;

public abstract class LiveData<T> {
    private static final Object i = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Object f40a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private b<k<T>, LiveData<T>.a> f41b = new b<>();
    /* access modifiers changed from: private */
    public int c = 0;
    private volatile Object d;
    private volatile Object e;
    private int f;
    private boolean g;
    private boolean h;

    class LifecycleBoundObserver extends LiveData<T>.a implements GenericLifecycleObserver {
        final e e;

        LifecycleBoundObserver(e eVar, k<T> kVar) {
            super(kVar);
            this.e = eVar;
        }

        public void g(e eVar, c.a aVar) {
            if (this.e.a().b() == c.b.DESTROYED) {
                LiveData.this.j(this.f42a);
            } else {
                h(k());
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.e.a().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean j(e eVar) {
            return this.e == eVar;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.e.a().b().a(c.b.STARTED);
        }
    }

    private abstract class a {

        /* renamed from: a  reason: collision with root package name */
        final k<T> f42a;

        /* renamed from: b  reason: collision with root package name */
        boolean f43b;
        int c = -1;

        a(k<T> kVar) {
            this.f42a = kVar;
        }

        /* access modifiers changed from: package-private */
        public void h(boolean z) {
            if (z != this.f43b) {
                this.f43b = z;
                int i = 1;
                boolean z2 = LiveData.this.c == 0;
                LiveData liveData = LiveData.this;
                int a2 = liveData.c;
                if (!this.f43b) {
                    i = -1;
                }
                int unused = liveData.c = a2 + i;
                if (z2 && this.f43b) {
                    LiveData.this.h();
                }
                if (LiveData.this.c == 0 && !this.f43b) {
                    LiveData.this.i();
                }
                if (this.f43b) {
                    LiveData.this.f(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
        }

        /* access modifiers changed from: package-private */
        public boolean j(e eVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean k();
    }

    public LiveData() {
        Object obj = i;
        this.d = obj;
        this.e = obj;
        this.f = -1;
    }

    private static void d(String str) {
        if (!a.a.a.a.a.b().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    private void e(LiveData<T>.a aVar) {
        if (aVar.f43b) {
            if (!aVar.k()) {
                aVar.h(false);
                return;
            }
            int i2 = aVar.c;
            int i3 = this.f;
            if (i2 < i3) {
                aVar.c = i3;
                aVar.f42a.a(this.d);
            }
        }
    }

    /* access modifiers changed from: private */
    public void f(LiveData<T>.a aVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (aVar == null) {
                b<K, V>.e d2 = this.f41b.d();
                while (d2.hasNext()) {
                    e((a) ((Map.Entry) d2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                e(aVar);
                aVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public void g(e eVar, k<T> kVar) {
        if (eVar.a().b() != c.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(eVar, kVar);
            a g2 = this.f41b.g(kVar, lifecycleBoundObserver);
            if (g2 != null && !g2.j(eVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (g2 == null) {
                eVar.a().a(lifecycleBoundObserver);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    public void j(k<T> kVar) {
        d("removeObserver");
        a h2 = this.f41b.h(kVar);
        if (h2 != null) {
            h2.i();
            h2.h(false);
        }
    }

    /* access modifiers changed from: protected */
    public void k(T t) {
        d("setValue");
        this.f++;
        this.d = t;
        f((LiveData<T>.a) null);
    }
}
