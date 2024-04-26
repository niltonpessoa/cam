package b.a.a.a.k0;

public interface l {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final m f321a;

        /* renamed from: b  reason: collision with root package name */
        public final m f322b;

        public a(m mVar) {
            this(mVar, mVar);
        }

        public a(m mVar, m mVar2) {
            b.a.a.a.r0.a.e(mVar);
            this.f321a = mVar;
            b.a.a.a.r0.a.e(mVar2);
            this.f322b = mVar2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f321a.equals(aVar.f321a) && this.f322b.equals(aVar.f322b);
        }

        public int hashCode() {
            return (this.f321a.hashCode() * 31) + this.f322b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f321a);
            if (this.f321a.equals(this.f322b)) {
                str = "";
            } else {
                str = ", " + this.f322b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    public static final class b implements l {

        /* renamed from: a  reason: collision with root package name */
        private final long f323a;

        /* renamed from: b  reason: collision with root package name */
        private final a f324b;

        public b(long j) {
            this(j, 0);
        }

        public b(long j, long j2) {
            this.f323a = j;
            this.f324b = new a(j2 == 0 ? m.c : new m(0, j2));
        }

        public boolean b() {
            return false;
        }

        public a e(long j) {
            return this.f324b;
        }

        public long i() {
            return this.f323a;
        }
    }

    boolean b();

    a e(long j);

    long i();
}
