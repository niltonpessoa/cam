package b.a.a.a.k0;

import b.a.a.a.r0.m;
import java.util.Arrays;

public interface n {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f327a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f328b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f327a = i;
            this.f328b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f327a == aVar.f327a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.f328b, aVar.f328b);
        }

        public int hashCode() {
            return (((((this.f327a * 31) + Arrays.hashCode(this.f328b)) * 31) + this.c) * 31) + this.d;
        }
    }

    void a(m mVar, int i);

    int b(f fVar, int i, boolean z);

    void c(b.a.a.a.n nVar);

    void d(long j, int i, int i2, int i3, a aVar);
}
