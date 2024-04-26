package b.a.a.a;

import android.util.Pair;
import b.a.a.a.n0.p.a;

public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f239a = new a();

    static class a extends g0 {
        a() {
        }

        public int b(Object obj) {
            return -1;
        }

        public b g(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        public int h() {
            return 0;
        }

        public c n(int i, c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        public int o() {
            return 0;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Object f240a;

        /* renamed from: b  reason: collision with root package name */
        public Object f241b;
        public int c;
        public long d;
        private long e;
        private b.a.a.a.n0.p.a f;

        public int a(int i) {
            return this.f.c[i].f591a;
        }

        public long b(int i, int i2) {
            a.C0033a aVar = this.f.c[i];
            if (aVar.f591a != -1) {
                return aVar.c[i2];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f.f589a;
        }

        public int d(long j) {
            return this.f.a(j);
        }

        public int e(long j) {
            return this.f.b(j);
        }

        public long f(int i) {
            return this.f.f590b[i];
        }

        public long g() {
            return this.f.d;
        }

        public long h() {
            return this.d;
        }

        public int i(int i) {
            return this.f.c[i].a();
        }

        public int j(int i, int i2) {
            return this.f.c[i].b(i2);
        }

        public long k() {
            return b.b(this.e);
        }

        public long l() {
            return this.e;
        }

        public boolean m(int i) {
            return !this.f.c[i].c();
        }

        public boolean n(int i, int i2) {
            a.C0033a aVar = this.f.c[i];
            return (aVar.f591a == -1 || aVar.f592b[i2] == 0) ? false : true;
        }

        public b o(Object obj, Object obj2, int i, long j, long j2) {
            p(obj, obj2, i, j, j2, b.a.a.a.n0.p.a.e);
            return this;
        }

        public b p(Object obj, Object obj2, int i, long j, long j2, b.a.a.a.n0.p.a aVar) {
            this.f240a = obj;
            this.f241b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.f = aVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public Object f242a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f243b;
        public boolean c;
        public int d;
        public int e;
        public long f;
        public long g;
        public long h;

        public long a() {
            return this.f;
        }

        public long b() {
            return b.b(this.g);
        }

        public long c() {
            return this.h;
        }

        public c d(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f242a = obj;
            this.f243b = z;
            this.c = z2;
            this.f = j3;
            this.g = j4;
            this.d = i;
            this.e = i2;
            this.h = j5;
            return this;
        }
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar).c;
        if (l(i3, cVar).e != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return l(e, cVar).d;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == c(z) ? a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final b f(int i, b bVar) {
        return g(i, bVar, false);
    }

    public abstract b g(int i, b bVar, boolean z);

    public abstract int h();

    public final Pair<Integer, Long> i(c cVar, b bVar, int i, long j) {
        return j(cVar, bVar, i, j, 0);
    }

    public final Pair<Integer, Long> j(c cVar, b bVar, int i, long j, long j2) {
        b.a.a.a.r0.a.c(i, 0, o());
        n(i, cVar, false, j2);
        if (j == -9223372036854775807L) {
            j = cVar.a();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.d;
        long c2 = cVar.c() + j;
        while (true) {
            long h = f(i2, bVar).h();
            if (h != -9223372036854775807L && c2 >= h && i2 < cVar.e) {
                c2 -= h;
                i2++;
            }
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(c2));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == a(z) ? c(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public final c l(int i, c cVar) {
        return m(i, cVar, false);
    }

    public final c m(int i, c cVar, boolean z) {
        return n(i, cVar, z, 0);
    }

    public abstract c n(int i, c cVar, boolean z, long j);

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }

    public final boolean q(int i, b bVar, c cVar, int i2, boolean z) {
        return d(i, bVar, cVar, i2, z) == -1;
    }
}
