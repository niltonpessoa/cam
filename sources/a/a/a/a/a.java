package a.a.a.a;

public class a extends c {
    private static volatile a c;

    /* renamed from: a  reason: collision with root package name */
    private c f0a;

    /* renamed from: b  reason: collision with root package name */
    private c f1b;

    private a() {
        b bVar = new b();
        this.f1b = bVar;
        this.f0a = bVar;
    }

    public static a b() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
        }
        return c;
    }

    public boolean a() {
        return this.f0a.a();
    }
}
