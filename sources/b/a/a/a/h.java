package b.a.a.a;

import java.io.IOException;

public final class h extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final int f244a;

    private h(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.f244a = i;
    }

    public static h a(Exception exc, int i) {
        return new h(1, (String) null, exc, i);
    }

    public static h b(IOException iOException) {
        return new h(0, (String) null, iOException, -1);
    }

    static h c(RuntimeException runtimeException) {
        return new h(2, (String) null, runtimeException, -1);
    }
}
