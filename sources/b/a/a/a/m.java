package b.a.a.a;

import java.util.HashSet;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f507a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static String f508b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (m.class) {
            if (f507a.add(str)) {
                f508b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (m.class) {
            str = f508b;
        }
        return str;
    }
}
