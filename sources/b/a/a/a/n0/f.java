package b.a.a.a.n0;

import b.a.a.a.g0;
import b.a.a.a.i;

public interface f {

    public interface a {
        void c(f fVar, g0 g0Var, Object obj);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f562a;

        /* renamed from: b  reason: collision with root package name */
        public final int f563b;
        public final int c;
        public final long d;

        public b(int i) {
            this(i, -1);
        }

        public b(int i, int i2, int i3, long j) {
            this.f562a = i;
            this.f563b = i2;
            this.c = i3;
            this.d = j;
        }

        public b(int i, long j) {
            this(i, -1, -1, j);
        }

        public b a(int i) {
            if (this.f562a == i) {
                return this;
            }
            return new b(i, this.f563b, this.c, this.d);
        }

        public boolean b() {
            return this.f563b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f562a == bVar.f562a && this.f563b == bVar.f563b && this.c == bVar.c && this.d == bVar.d;
        }

        public int hashCode() {
            return ((((((527 + this.f562a) * 31) + this.f563b) * 31) + this.c) * 31) + ((int) this.d);
        }
    }

    e a(b bVar, b.a.a.a.q0.b bVar2);

    void b();

    void d(e eVar);

    void e(i iVar, boolean z, a aVar);

    void f();
}
