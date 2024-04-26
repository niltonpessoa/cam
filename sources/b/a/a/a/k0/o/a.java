package b.a.a.a.k0.o;

import android.util.Pair;
import b.a.a.a.k0.n;
import b.a.a.a.k0.o.d;
import b.a.a.a.r0.c;
import b.a.a.a.r0.m;
import java.util.Collections;
import java.util.List;

final class a extends d {
    private static final int[] e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f329b;
    private boolean c;
    private int d;

    public a(n nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    public boolean b(m mVar) {
        b.a.a.a.n g;
        if (!this.f329b) {
            int x = mVar.x();
            int i = (x >> 4) & 15;
            this.d = i;
            if (i == 2) {
                g = b.a.a.a.n.h((String) null, "audio/mpeg", (String) null, -1, -1, 1, e[(x >> 2) & 3], (List<byte[]>) null, (b.a.a.a.j0.a) null, 0, (String) null);
            } else if (i == 7 || i == 8) {
                g = b.a.a.a.n.g((String) null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (x & 1) == 1 ? 2 : 3, (List<byte[]>) null, (b.a.a.a.j0.a) null, 0, (String) null);
            } else {
                if (i != 10) {
                    throw new d.a("Audio format not supported: " + this.d);
                }
                this.f329b = true;
            }
            this.f333a.c(g);
            this.c = true;
            this.f329b = true;
        } else {
            mVar.K(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void c(m mVar, long j) {
        m mVar2 = mVar;
        if (this.d == 2) {
            int a2 = mVar.a();
            this.f333a.a(mVar2, a2);
            this.f333a.d(j, 1, a2, 0, (n.a) null);
            return;
        }
        int x = mVar.x();
        if (x == 0 && !this.c) {
            int a3 = mVar.a();
            byte[] bArr = new byte[a3];
            mVar2.g(bArr, 0, a3);
            Pair<Integer, Integer> f = c.f(bArr);
            this.f333a.c(b.a.a.a.n.h((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) f.second).intValue(), ((Integer) f.first).intValue(), Collections.singletonList(bArr), (b.a.a.a.j0.a) null, 0, (String) null));
            this.c = true;
        } else if (this.d != 10 || x == 1) {
            int a4 = mVar.a();
            this.f333a.a(mVar2, a4);
            this.f333a.d(j, 1, a4, 0, (n.a) null);
        }
    }
}
