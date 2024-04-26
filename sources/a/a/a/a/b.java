package a.a.a.a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f3b = Executors.newFixedThreadPool(2);

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
