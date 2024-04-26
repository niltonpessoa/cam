package android.arch.lifecycle;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private final a f64a;

    /* renamed from: b  reason: collision with root package name */
    private final p f65b;

    public interface a {
        <T extends n> T a(Class<T> cls);
    }

    public o(p pVar, a aVar) {
        this.f64a = aVar;
        this.f65b = pVar;
    }

    public <T extends n> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends n> T b(String str, Class<T> cls) {
        T b2 = this.f65b.b(str);
        if (cls.isInstance(b2)) {
            return b2;
        }
        T a2 = this.f64a.a(cls);
        this.f65b.c(str, a2);
        return a2;
    }
}
