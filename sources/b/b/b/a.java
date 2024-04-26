package b.b.b;

import b.b.b.e.b;
import java.io.File;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f799a;

    public static a c() {
        if (f799a == null) {
            f799a = new a();
        }
        return f799a;
    }

    public int a() {
        return b.c().a();
    }

    public List<b.b.b.d.a> b(int i) {
        return b.c().b(i);
    }

    public void d(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        b.b.b.c.b.f801b = str2;
        b.b.b.c.b.c = str;
    }

    public void e(String str) {
        b.b.b.e.a.a().b(str);
    }
}
