package android.support.v4.app;

import android.arch.lifecycle.e;
import android.arch.lifecycle.q;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class t {
    public static <T extends e & q> t b(T t) {
        return new LoaderManagerImpl(t, ((q) t).c());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
