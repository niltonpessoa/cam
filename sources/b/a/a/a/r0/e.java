package b.a.a.a.r0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f721a;

    public synchronized void a() {
        while (!this.f721a) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z;
        z = this.f721a;
        this.f721a = false;
        return z;
    }

    public synchronized boolean c() {
        if (this.f721a) {
            return false;
        }
        this.f721a = true;
        notifyAll();
        return true;
    }
}
