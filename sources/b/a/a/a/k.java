package b.a.a.a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import b.a.a.a.g0;
import b.a.a.a.n0.f;
import b.a.a.a.n0.n;
import b.a.a.a.p0.e;
import b.a.a.a.p0.f;
import b.a.a.a.p0.g;
import b.a.a.a.p0.h;
import b.a.a.a.r0.b;
import b.a.a.a.r0.w;
import b.a.a.a.y;
import b.a.a.a.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private final a0[] f307a;

    /* renamed from: b  reason: collision with root package name */
    private final g f308b;
    private final h c;
    private final Handler d;
    private final l e;
    private final Handler f;
    private final CopyOnWriteArraySet<y.b> g;
    private final g0.c h;
    private final g0.b i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    private w p;
    private v q;
    private int r;
    private int s;
    private long t;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            k.this.o(message);
        }
    }

    @SuppressLint({"HandlerLeak"})
    public k(a0[] a0VarArr, g gVar, q qVar, b bVar) {
        a0[] a0VarArr2 = a0VarArr;
        Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.7.3" + "] [" + w.e + "]");
        b.a.a.a.r0.a.f(a0VarArr2.length > 0);
        b.a.a.a.r0.a.e(a0VarArr);
        this.f307a = a0VarArr2;
        b.a.a.a.r0.a.e(gVar);
        this.f308b = gVar;
        this.j = false;
        this.k = 0;
        this.l = false;
        this.g = new CopyOnWriteArraySet<>();
        h hVar = new h(n.d, new boolean[a0VarArr2.length], new f(new e[a0VarArr2.length]), (Object) null, new c0[a0VarArr2.length]);
        this.c = hVar;
        this.h = new g0.c();
        this.i = new g0.b();
        this.p = w.d;
        a aVar = new a(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.d = aVar;
        this.q = new v(g0.f239a, 0, hVar);
        l lVar = new l(a0VarArr, gVar, hVar, qVar, this.j, this.k, this.l, aVar, this, bVar);
        this.e = lVar;
        this.f = new Handler(lVar.p());
    }

    private long C(long j2) {
        long b2 = b.b(j2);
        if (this.q.c.b()) {
            return b2;
        }
        v vVar = this.q;
        vVar.f785a.f(vVar.c.f562a, this.i);
        return b2 + this.i.k();
    }

    private boolean D() {
        return this.q.f785a.p() || this.m > 0;
    }

    private void G(v vVar, boolean z, int i2, int i3, boolean z2) {
        v vVar2 = this.q;
        boolean z3 = false;
        boolean z4 = (vVar2.f785a == vVar.f785a && vVar2.f786b == vVar.f786b) ? false : true;
        boolean z5 = vVar2.f != vVar.f;
        boolean z6 = vVar2.g != vVar.g;
        if (vVar2.h != vVar.h) {
            z3 = true;
        }
        this.q = vVar;
        if (z4 || i3 == 0) {
            Iterator<y.b> it = this.g.iterator();
            while (it.hasNext()) {
                v vVar3 = this.q;
                it.next().l(vVar3.f785a, vVar3.f786b, i3);
            }
        }
        if (z) {
            Iterator<y.b> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().f(i2);
            }
        }
        if (z3) {
            this.f308b.b(this.q.h.d);
            Iterator<y.b> it3 = this.g.iterator();
            while (it3.hasNext()) {
                h hVar = this.q.h;
                it3.next().j(hVar.f681a, hVar.c);
            }
        }
        if (z6) {
            Iterator<y.b> it4 = this.g.iterator();
            while (it4.hasNext()) {
                it4.next().e(this.q.g);
            }
        }
        if (z5) {
            Iterator<y.b> it5 = this.g.iterator();
            while (it5.hasNext()) {
                it5.next().c(this.j, this.q.f);
            }
        }
        if (z2) {
            Iterator<y.b> it6 = this.g.iterator();
            while (it6.hasNext()) {
                it6.next().o();
            }
        }
    }

    private v l(boolean z, boolean z2, int i2) {
        long j2;
        if (z) {
            this.r = 0;
            this.s = 0;
            j2 = 0;
        } else {
            this.r = B();
            this.s = k();
            j2 = H();
        }
        this.t = j2;
        g0 g0Var = z2 ? g0.f239a : this.q.f785a;
        Object obj = z2 ? null : this.q.f786b;
        v vVar = this.q;
        return new v(g0Var, obj, vVar.c, vVar.d, vVar.e, i2, false, z2 ? this.c : vVar.h);
    }

    private void r(v vVar, int i2, boolean z, int i3) {
        int i4 = this.m - i2;
        this.m = i4;
        if (i4 == 0) {
            if (vVar.d == -9223372036854775807L) {
                vVar = vVar.g(vVar.c, 0, vVar.e);
            }
            v vVar2 = vVar;
            if ((!this.q.f785a.p() || this.n) && vVar2.f785a.p()) {
                this.s = 0;
                this.r = 0;
                this.t = 0;
            }
            int i5 = this.n ? 0 : 2;
            boolean z2 = this.o;
            this.n = false;
            this.o = false;
            G(vVar2, z, i3, i5, z2);
        }
    }

    public void A(long j2) {
        m(B(), j2);
    }

    public int B() {
        if (D()) {
            return this.r;
        }
        v vVar = this.q;
        return vVar.f785a.f(vVar.c.f562a, this.i).c;
    }

    public f E() {
        return this.q.h.c;
    }

    public int F(int i2) {
        return this.f307a[i2].g();
    }

    public long H() {
        return D() ? this.t : C(this.q.i);
    }

    public y.c J() {
        return null;
    }

    public void a() {
        Log.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.7.3" + "] [" + w.e + "] [" + m.b() + "]");
        this.e.D();
        this.d.removeCallbacksAndMessages((Object) null);
    }

    public void b(b.a.a.a.n0.f fVar, boolean z, boolean z2) {
        v l2 = l(z, z2, 2);
        this.n = true;
        this.m++;
        this.e.B(fVar, z, z2);
        G(l2, false, 4, 1, false);
    }

    public w c() {
        return this.p;
    }

    public void d(int i2) {
        if (this.k != i2) {
            this.k = i2;
            this.e.a0(i2);
            Iterator<y.b> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().d(i2);
            }
        }
    }

    public void e(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.e.X(z);
            Iterator<y.b> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().c(z, this.q.f);
            }
        }
    }

    public y.d f() {
        return null;
    }

    public boolean g() {
        return !D() && this.q.c.b();
    }

    public int h() {
        g0 g0Var = this.q.f785a;
        if (g0Var.p()) {
            return -1;
        }
        return g0Var.e(B(), this.k, this.l);
    }

    public void i(y.b bVar) {
        this.g.add(bVar);
    }

    public long j() {
        if (!g()) {
            return H();
        }
        v vVar = this.q;
        vVar.f785a.f(vVar.c.f562a, this.i);
        return this.i.k() + b.b(this.q.e);
    }

    public int k() {
        return D() ? this.s : this.q.c.f562a;
    }

    public void m(int i2, long j2) {
        g0 g0Var = this.q.f785a;
        if (i2 < 0 || (!g0Var.p() && i2 >= g0Var.o())) {
            throw new p(g0Var, i2, j2);
        }
        this.o = true;
        this.m++;
        if (g()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.d.obtainMessage(0, 1, -1, this.q).sendToTarget();
            return;
        }
        this.r = i2;
        if (g0Var.p()) {
            this.t = j2 == -9223372036854775807L ? 0 : j2;
            this.s = 0;
        } else {
            long a2 = j2 == -9223372036854775807L ? g0Var.l(i2, this.h).a() : b.a(j2);
            Pair<Integer, Long> i3 = g0Var.i(this.h, this.i, i2, a2);
            this.t = b.b(a2);
            this.s = ((Integer) i3.first).intValue();
        }
        this.e.O(g0Var, i2, b.a(j2));
        Iterator<y.b> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().f(1);
        }
    }

    public int n() {
        g0 g0Var = this.q.f785a;
        if (g0Var.p()) {
            return -1;
        }
        return g0Var.k(B(), this.k, this.l);
    }

    /* access modifiers changed from: package-private */
    public void o(Message message) {
        int i2 = message.what;
        boolean z = true;
        if (i2 == 0) {
            v vVar = (v) message.obj;
            int i3 = message.arg1;
            int i4 = message.arg2;
            if (i4 == -1) {
                z = false;
            }
            r(vVar, i3, z, i4);
        } else if (i2 == 1) {
            w wVar = (w) message.obj;
            if (!this.p.equals(wVar)) {
                this.p = wVar;
                Iterator<y.b> it = this.g.iterator();
                while (it.hasNext()) {
                    it.next().b(wVar);
                }
            }
        } else if (i2 == 2) {
            h hVar = (h) message.obj;
            Iterator<y.b> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().m(hVar);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public long p() {
        return D() ? this.t : C(this.q.j);
    }

    public boolean q() {
        return this.j;
    }

    public int s() {
        return this.k;
    }

    public long t() {
        g0 g0Var = this.q.f785a;
        if (g0Var.p()) {
            return -9223372036854775807L;
        }
        if (!g()) {
            return g0Var.l(B(), this.h).b();
        }
        f.b bVar = this.q.c;
        g0Var.f(bVar.f562a, this.i);
        return b.b(this.i.b(bVar.f563b, bVar.c));
    }

    public void u(boolean z) {
        if (this.l != z) {
            this.l = z;
            this.e.d0(z);
            Iterator<y.b> it = this.g.iterator();
            while (it.hasNext()) {
                it.next().k(z);
            }
        }
    }

    public g0 v() {
        return this.q.f785a;
    }

    public int w() {
        return this.q.f;
    }

    public z x(z.b bVar) {
        return new z(this.e, bVar, this.q.f785a, B(), this.f);
    }

    public boolean y() {
        return this.l;
    }

    public void z(y.b bVar) {
        this.g.remove(bVar);
    }
}
