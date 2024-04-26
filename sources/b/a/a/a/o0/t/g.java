package b.a.a.a.o0.t;

import android.text.TextUtils;
import b.a.a.a.o0.c;
import b.a.a.a.o0.t.e;
import b.a.a.a.r0.m;
import java.util.ArrayList;
import java.util.List;

public final class g extends c {
    private final f n = new f();
    private final m o = new m();
    private final e.b p = new e.b();
    private final a q = new a();
    private final List<d> r = new ArrayList();

    public g() {
        super("WebvttDecoder");
    }

    private static int D(m mVar) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = mVar.c();
            String k = mVar.k();
            i = k == null ? 0 : "STYLE".equals(k) ? 2 : "NOTE".startsWith(k) ? 1 : 3;
        }
        mVar.J(i2);
        return i;
    }

    private static void E(m mVar) {
        do {
        } while (!TextUtils.isEmpty(mVar.k()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public i z(byte[] bArr, int i, boolean z) {
        this.o.H(bArr, i);
        this.p.c();
        this.r.clear();
        h.c(this.o);
        do {
        } while (!TextUtils.isEmpty(this.o.k()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            int D = D(this.o);
            if (D == 0) {
                return new i(arrayList);
            }
            if (D == 1) {
                E(this.o);
            } else if (D == 2) {
                if (arrayList.isEmpty()) {
                    this.o.k();
                    d d = this.q.d(this.o);
                    if (d != null) {
                        this.r.add(d);
                    }
                } else {
                    throw new b.a.a.a.o0.g("A style block was found after the first cue.");
                }
            } else if (D == 3 && this.n.h(this.o, this.p, this.r)) {
                arrayList.add(this.p.a());
                this.p.c();
            }
        }
    }
}
