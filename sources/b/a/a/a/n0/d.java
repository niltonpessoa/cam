package b.a.a.a.n0;

import android.net.Uri;
import android.os.Handler;
import b.a.a.a.i;
import b.a.a.a.k0.h;
import b.a.a.a.n0.c;
import b.a.a.a.n0.f;
import b.a.a.a.n0.g;
import b.a.a.a.q0.f;

public final class d implements f, c.e {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f558a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f559b;
    private final h c;
    private final int d;
    private final g.a e;
    private final String f;
    private final int g;
    private f.a h;
    private long i;
    private boolean j;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f.a f560a;

        /* renamed from: b  reason: collision with root package name */
        private h f561b;
        private String c;
        private int d = -1;
        private int e = 1048576;

        public b(f.a aVar) {
            this.f560a = aVar;
        }

        public d a(Uri uri) {
            return b(uri, (Handler) null, (g) null);
        }

        public d b(Uri uri, Handler handler, g gVar) {
            if (this.f561b == null) {
                this.f561b = new b.a.a.a.k0.c();
            }
            return new d(uri, this.f560a, this.f561b, this.d, handler, gVar, this.c, this.e);
        }
    }

    private d(Uri uri, f.a aVar, h hVar, int i2, Handler handler, g gVar, String str, int i3) {
        this.f558a = uri;
        this.f559b = aVar;
        this.c = hVar;
        this.d = i2;
        this.e = new g.a(handler, gVar);
        this.f = str;
        this.g = i3;
    }

    private void g(long j2, boolean z) {
        this.i = j2;
        this.j = z;
        this.h.c(this, new l(this.i, this.j, false), (Object) null);
    }

    public e a(f.b bVar, b.a.a.a.q0.b bVar2) {
        b.a.a.a.r0.a.a(bVar.f562a == 0);
        return new c(this.f558a, this.f559b.a(), this.c.a(), this.d, this.e, this, bVar2, this.f, this.g);
    }

    public void b() {
    }

    public void c(long j2, boolean z) {
        if (j2 == -9223372036854775807L) {
            j2 = this.i;
        }
        if (this.i != j2 || this.j != z) {
            g(j2, z);
        }
    }

    public void d(e eVar) {
        ((c) eVar).Q();
    }

    public void e(i iVar, boolean z, f.a aVar) {
        this.h = aVar;
        g(-9223372036854775807L, false);
    }

    public void f() {
        this.h = null;
    }
}
