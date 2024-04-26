package b.a.a.a.k0.t;

import android.util.SparseArray;
import b.a.a.a.j0.a;
import b.a.a.a.k0.t.w;
import b.a.a.a.n;
import b.a.a.a.r0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class e implements w.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f428a;

    /* renamed from: b  reason: collision with root package name */
    private final List<n> f429b;

    public e(int i) {
        this(i, Collections.emptyList());
    }

    public e(int i, List<n> list) {
        this.f428a = i;
        if (!d(32) && list.isEmpty()) {
            list = Collections.singletonList(n.l((String) null, "application/cea-608", 0, (String) null));
        }
        this.f429b = list;
    }

    private t c(w.b bVar) {
        int i;
        String str;
        if (d(32)) {
            return new t(this.f429b);
        }
        m mVar = new m(bVar.d);
        List<n> list = this.f429b;
        while (mVar.a() > 0) {
            int x = mVar.x();
            int c = mVar.c() + mVar.x();
            if (x == 134) {
                list = new ArrayList<>();
                int x2 = mVar.x() & 31;
                for (int i2 = 0; i2 < x2; i2++) {
                    String u = mVar.u(3);
                    int x3 = mVar.x();
                    if ((x3 & 128) != 0) {
                        i = x3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    list.add(n.n((String) null, str, (String) null, -1, 0, u, i, (a) null));
                    mVar.K(2);
                }
            }
            mVar.J(c);
        }
        return new t(list);
    }

    private boolean d(int i) {
        return (i & this.f428a) != 0;
    }

    public SparseArray<w> a() {
        return new SparseArray<>();
    }

    public w b(int i, w.b bVar) {
        if (i == 2) {
            return new p(new i());
        }
        if (i == 3 || i == 4) {
            return new p(new n(bVar.f477b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new p(new l());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new p(new k(c(bVar)));
                    }
                    if (i == 89) {
                        return new p(new g(bVar.c));
                    }
                    if (i != 138) {
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (d(16)) {
                                    return null;
                                } else {
                                    return new s(new u());
                                }
                            }
                        }
                        return new p(new b(bVar.f477b));
                    }
                    return new p(new f(bVar.f477b));
                } else if (d(4)) {
                    return null;
                } else {
                    return new p(new j(c(bVar), d(1), d(8)));
                }
            } else if (d(2)) {
                return null;
            } else {
                return new p(new m(bVar.f477b));
            }
        } else if (d(2)) {
            return null;
        } else {
            return new p(new d(false, bVar.f477b));
        }
    }
}
