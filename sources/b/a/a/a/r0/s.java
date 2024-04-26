package b.a.a.a.r0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

final class s implements b {
    s() {
    }

    public long a() {
        return SystemClock.uptimeMillis();
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public g c(Looper looper, Handler.Callback callback) {
        return new t(new Handler(looper, callback));
    }
}
