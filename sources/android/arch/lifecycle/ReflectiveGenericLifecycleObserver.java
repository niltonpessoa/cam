package android.arch.lifecycle;

import android.arch.lifecycle.a;
import android.arch.lifecycle.c;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Object f44a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0005a f45b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f44a = obj;
        this.f45b = a.c.c(obj.getClass());
    }

    public void g(e eVar, c.a aVar) {
        this.f45b.a(eVar, aVar, this.f44a);
    }
}
