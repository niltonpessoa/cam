package b.a.a.a.o0.t;

import b.a.a.a.o0.c;
import b.a.a.a.o0.g;
import b.a.a.a.o0.t.e;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.Collections;

public final class b extends c {
    private static final int p = w.o("payl");
    private static final int q = w.o("sttg");
    private static final int r = w.o("vttc");
    private final m n = new m();
    private final e.b o = new e.b();

    public b() {
        super("Mp4WebvttDecoder");
    }

    private static b.a.a.a.o0.b D(m mVar, e.b bVar, int i) {
        bVar.c();
        while (i > 0) {
            if (i >= 8) {
                int i2 = mVar.i();
                int i3 = mVar.i();
                int i4 = i2 - 8;
                String str = new String(mVar.f734a, mVar.c(), i4);
                mVar.K(i4);
                i = (i - 8) - i4;
                if (i3 == q) {
                    f.j(str, bVar);
                } else if (i3 == p) {
                    f.k((String) null, str.trim(), bVar, Collections.emptyList());
                }
            } else {
                throw new g("Incomplete vtt cue box header found.");
            }
        }
        return bVar.a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c z(byte[] bArr, int i, boolean z) {
        this.n.H(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.n.a() > 0) {
            if (this.n.a() >= 8) {
                int i2 = this.n.i();
                if (this.n.i() == r) {
                    arrayList.add(D(this.n, this.o, i2 - 8));
                } else {
                    this.n.K(i2 - 8);
                }
            } else {
                throw new g("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new c(arrayList);
    }
}
