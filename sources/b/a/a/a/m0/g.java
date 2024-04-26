package b.a.a.a.m0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b.a.a.a.a;
import b.a.a.a.h;
import b.a.a.a.j0.c;
import b.a.a.a.n;
import b.a.a.a.o;
import java.util.Arrays;

public final class g extends a implements Handler.Callback {
    private final d i;
    private final f j;
    private final Handler k;
    private final o l;
    private final e m;
    private final a[] n;
    private final long[] o;
    private int p;
    private int q;
    private b r;
    private boolean s;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f510a);
    }

    public g(f fVar, Looper looper, d dVar) {
        super(4);
        b.a.a.a.r0.a.e(fVar);
        this.j = fVar;
        this.k = looper == null ? null : new Handler(looper, this);
        b.a.a.a.r0.a.e(dVar);
        this.i = dVar;
        this.l = new o();
        this.m = new e();
        this.n = new a[5];
        this.o = new long[5];
    }

    private void L() {
        Arrays.fill(this.n, (Object) null);
        this.p = 0;
        this.q = 0;
    }

    private void M(a aVar) {
        Handler handler = this.k;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            N(aVar);
        }
    }

    private void N(a aVar) {
        this.j.j(aVar);
    }

    /* access modifiers changed from: protected */
    public void C() {
        L();
        this.r = null;
    }

    /* access modifiers changed from: protected */
    public void E(long j2, boolean z) {
        L();
        this.s = false;
    }

    /* access modifiers changed from: protected */
    public void H(n[] nVarArr, long j2) {
        this.r = this.i.b(nVarArr[0]);
    }

    public int a(n nVar) {
        if (this.i.a(nVar)) {
            return a.K((c<?>) null, nVar.i) ? 4 : 2;
        }
        return 0;
    }

    public boolean b() {
        return this.s;
    }

    public boolean e() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            N((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public void t(long j2, long j3) {
        if (!this.s && this.q < 5) {
            this.m.f();
            if (I(this.l, this.m, false) == -4) {
                if (this.m.j()) {
                    this.s = true;
                } else if (!this.m.i()) {
                    e eVar = this.m;
                    eVar.f = this.l.f593a.w;
                    eVar.o();
                    try {
                        int i2 = (this.p + this.q) % 5;
                        this.n[i2] = this.r.a(this.m);
                        this.o[i2] = this.m.d;
                        this.q++;
                    } catch (c e) {
                        throw h.a(e, A());
                    }
                }
            }
        }
        if (this.q > 0) {
            long[] jArr = this.o;
            int i3 = this.p;
            if (jArr[i3] <= j2) {
                M(this.n[i3]);
                a[] aVarArr = this.n;
                int i4 = this.p;
                aVarArr[i4] = null;
                this.p = (i4 + 1) % 5;
                this.q--;
            }
        }
    }
}
