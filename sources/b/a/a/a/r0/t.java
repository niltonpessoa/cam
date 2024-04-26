package b.a.a.a.r0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class t implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f740a;

    public t(Handler handler) {
        this.f740a = handler;
    }

    public Message a(int i, int i2, int i3) {
        return this.f740a.obtainMessage(i, i2, i3);
    }

    public boolean b(int i, long j) {
        return this.f740a.sendEmptyMessageAtTime(i, j);
    }

    public void c(int i) {
        this.f740a.removeMessages(i);
    }

    public Message d(int i, Object obj) {
        return this.f740a.obtainMessage(i, obj);
    }

    public boolean e(int i) {
        return this.f740a.sendEmptyMessage(i);
    }

    public Looper f() {
        return this.f740a.getLooper();
    }

    public Message g(int i, int i2, int i3, Object obj) {
        return this.f740a.obtainMessage(i, i2, i3, obj);
    }
}
