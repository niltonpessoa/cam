package b.a.a.a.r0;

import android.annotation.TargetApi;
import android.os.Trace;

public final class v {
    public static void a(String str) {
        if (w.f743a >= 18) {
            b(str);
        }
    }

    @TargetApi(18)
    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (w.f743a >= 18) {
            d();
        }
    }

    @TargetApi(18)
    private static void d() {
        Trace.endSection();
    }
}
