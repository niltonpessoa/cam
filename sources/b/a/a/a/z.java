package b.a.a.a;

import android.os.Handler;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final b f789a;

    /* renamed from: b  reason: collision with root package name */
    private final a f790b;
    private final g0 c;
    private int d;
    private Object e;
    private Handler f;
    private int g;
    private long h = -9223372036854775807L;
    private boolean i = true;
    private boolean j;
    private boolean k;
    private boolean l;

    public interface a {
        void a(z zVar);
    }

    public interface b {
        void u(int i, Object obj);
    }

    public z(a aVar, b bVar, g0 g0Var, int i2, Handler handler) {
        this.f790b = aVar;
        this.f789a = bVar;
        this.c = g0Var;
        this.f = handler;
        this.g = i2;
    }

    public synchronized boolean a() {
        b.a.a.a.r0.a.f(this.j);
        b.a.a.a.r0.a.f(this.f.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }

    public boolean b() {
        return this.i;
    }

    public Handler c() {
        return this.f;
    }

    public Object d() {
        return this.e;
    }

    public long e() {
        return this.h;
    }

    public b f() {
        return this.f789a;
    }

    public g0 g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.g;
    }

    public synchronized void j(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }

    public z k() {
        b.a.a.a.r0.a.f(!this.j);
        if (this.h == -9223372036854775807L) {
            b.a.a.a.r0.a.a(this.i);
        }
        this.j = true;
        this.f790b.a(this);
        return this;
    }

    public z l(Object obj) {
        b.a.a.a.r0.a.f(!this.j);
        this.e = obj;
        return this;
    }

    public z m(int i2) {
        b.a.a.a.r0.a.f(!this.j);
        this.d = i2;
        return this;
    }
}
