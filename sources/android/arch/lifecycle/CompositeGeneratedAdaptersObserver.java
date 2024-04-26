package android.arch.lifecycle;

import android.arch.lifecycle.c;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f37a;

    CompositeGeneratedAdaptersObserver(b[] bVarArr) {
        this.f37a = bVarArr;
    }

    public void g(e eVar, c.a aVar) {
        i iVar = new i();
        for (b a2 : this.f37a) {
            a2.a(eVar, aVar, false, iVar);
        }
        for (b a3 : this.f37a) {
            a3.a(eVar, aVar, true, iVar);
        }
    }
}
