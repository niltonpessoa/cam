package b.a.a.a.k0.t;

import android.util.Log;
import b.a.a.a.j0.a;
import b.a.a.a.k0.g;
import b.a.a.a.k0.n;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.m;

public final class l implements h {

    /* renamed from: a  reason: collision with root package name */
    private final m f448a = new m(10);

    /* renamed from: b  reason: collision with root package name */
    private n f449b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public void a() {
        this.c = false;
    }

    public void c(m mVar) {
        if (this.c) {
            int a2 = mVar.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a2, 10 - i);
                System.arraycopy(mVar.f734a, mVar.c(), this.f448a.f734a, this.f, min);
                if (this.f + min == 10) {
                    this.f448a.J(0);
                    if (73 == this.f448a.x() && 68 == this.f448a.x() && 51 == this.f448a.x()) {
                        this.f448a.K(3);
                        this.e = this.f448a.w() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a2, this.e - this.f);
            this.f449b.a(mVar, min2);
            this.f += min2;
        }
    }

    public void d(long j, boolean z) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    public void e() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.f449b.d(this.d, 1, i, 0, (n.a) null);
            this.c = false;
        }
    }

    public void f(g gVar, w.d dVar) {
        dVar.a();
        n f2 = gVar.f(dVar.c(), 4);
        this.f449b = f2;
        f2.c(b.a.a.a.n.k(dVar.b(), "application/id3", (String) null, -1, (a) null));
    }
}
