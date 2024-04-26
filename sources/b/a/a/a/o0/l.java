package b.a.a.a.o0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b.a.a.a.a;
import b.a.a.a.h;
import b.a.a.a.j0.c;
import b.a.a.a.n;
import b.a.a.a.o;
import b.a.a.a.r0.j;
import java.util.Collections;
import java.util.List;

public final class l extends a implements Handler.Callback {
    private final Handler i;
    private final k j;
    private final h k;
    private final o l;
    private boolean m;
    private boolean n;
    private int o;
    private n p;
    private f q;
    private i r;
    private j s;
    private j t;
    private int u;

    public l(k kVar, Looper looper) {
        this(kVar, looper, h.f598a);
    }

    public l(k kVar, Looper looper, h hVar) {
        super(3);
        b.a.a.a.r0.a.e(kVar);
        this.j = kVar;
        this.i = looper == null ? null : new Handler(looper, this);
        this.k = hVar;
        this.l = new o();
    }

    private void L() {
        R(Collections.emptyList());
    }

    private long M() {
        int i2 = this.u;
        if (i2 == -1 || i2 >= this.s.d()) {
            return Long.MAX_VALUE;
        }
        return this.s.c(this.u);
    }

    private void N(List<b> list) {
        this.j.p(list);
    }

    private void O() {
        this.r = null;
        this.u = -1;
        j jVar = this.s;
        if (jVar != null) {
            jVar.m();
            this.s = null;
        }
        j jVar2 = this.t;
        if (jVar2 != null) {
            jVar2.m();
            this.t = null;
        }
    }

    private void P() {
        O();
        this.q.a();
        this.q = null;
        this.o = 0;
    }

    private void Q() {
        P();
        this.q = this.k.b(this.p);
    }

    private void R(List<b> list) {
        Handler handler = this.i;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            N(list);
        }
    }

    /* access modifiers changed from: protected */
    public void C() {
        this.p = null;
        L();
        P();
    }

    /* access modifiers changed from: protected */
    public void E(long j2, boolean z) {
        L();
        this.m = false;
        this.n = false;
        if (this.o != 0) {
            Q();
            return;
        }
        O();
        this.q.flush();
    }

    /* access modifiers changed from: protected */
    public void H(n[] nVarArr, long j2) {
        n nVar = nVarArr[0];
        this.p = nVar;
        if (this.q != null) {
            this.o = 1;
        } else {
            this.q = this.k.b(nVar);
        }
    }

    public int a(n nVar) {
        return this.k.a(nVar) ? a.K((c<?>) null, nVar.i) ? 4 : 2 : j.g(nVar.f) ? 1 : 0;
    }

    public boolean b() {
        return this.n;
    }

    public boolean e() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            N((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public void t(long j2, long j3) {
        boolean z;
        if (!this.n) {
            if (this.t == null) {
                this.q.b(j2);
                try {
                    this.t = (j) this.q.d();
                } catch (g e) {
                    throw h.a(e, A());
                }
            }
            if (d() == 2) {
                if (this.s != null) {
                    long M = M();
                    z = false;
                    while (M <= j2) {
                        this.u++;
                        M = M();
                        z = true;
                    }
                } else {
                    z = false;
                }
                j jVar = this.t;
                if (jVar != null) {
                    if (jVar.j()) {
                        if (!z && M() == Long.MAX_VALUE) {
                            if (this.o == 2) {
                                Q();
                            } else {
                                O();
                                this.n = true;
                            }
                        }
                    } else if (this.t.f297b <= j2) {
                        j jVar2 = this.s;
                        if (jVar2 != null) {
                            jVar2.m();
                        }
                        j jVar3 = this.t;
                        this.s = jVar3;
                        this.t = null;
                        this.u = jVar3.a(j2);
                        z = true;
                    }
                }
                if (z) {
                    R(this.s.b(j2));
                }
                if (this.o != 2) {
                    while (!this.m) {
                        try {
                            if (this.r == null) {
                                i iVar = (i) this.q.e();
                                this.r = iVar;
                                if (iVar == null) {
                                    return;
                                }
                            }
                            if (this.o == 1) {
                                this.r.l(4);
                                this.q.c(this.r);
                                this.r = null;
                                this.o = 2;
                                return;
                            }
                            int I = I(this.l, this.r, false);
                            if (I == -4) {
                                if (this.r.j()) {
                                    this.m = true;
                                } else {
                                    i iVar2 = this.r;
                                    iVar2.f = this.l.f593a.w;
                                    iVar2.o();
                                }
                                this.q.c(this.r);
                                this.r = null;
                            } else if (I == -3) {
                                return;
                            }
                        } catch (g e2) {
                            throw h.a(e2, A());
                        }
                    }
                }
            }
        }
    }
}
