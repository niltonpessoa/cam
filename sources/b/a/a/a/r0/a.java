package b.a.a.a.r0;

import android.text.TextUtils;
import java.util.Objects;

public final class a {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
