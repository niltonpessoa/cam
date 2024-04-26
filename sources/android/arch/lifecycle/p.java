package android.arch.lifecycle;

import java.util.HashMap;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, n> f66a = new HashMap<>();

    public final void a() {
        for (n a2 : this.f66a.values()) {
            a2.a();
        }
        this.f66a.clear();
    }

    /* access modifiers changed from: package-private */
    public final n b(String str) {
        return this.f66a.get(str);
    }

    /* access modifiers changed from: package-private */
    public final void c(String str, n nVar) {
        n put = this.f66a.put(str, nVar);
        if (put != null) {
            put.a();
        }
    }
}
