package b.a.a.a.p0;

import b.a.a.a.n;
import b.a.a.a.n0.m;
import java.util.Arrays;
import java.util.Comparator;

public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    protected final m f667a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f668b;
    protected final int[] c;
    private final n[] d;
    private int e;

    private static final class b implements Comparator<n> {
        private b() {
        }

        /* renamed from: a */
        public int compare(n nVar, n nVar2) {
            return nVar2.f543b - nVar.f543b;
        }
    }

    public a(m mVar, int... iArr) {
        int i = 0;
        b.a.a.a.r0.a.f(iArr.length > 0);
        b.a.a.a.r0.a.e(mVar);
        this.f667a = mVar;
        int length = iArr.length;
        this.f668b = length;
        this.d = new n[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = mVar.a(iArr[i2]);
        }
        Arrays.sort(this.d, new b());
        this.c = new int[this.f668b];
        while (true) {
            int i3 = this.f668b;
            if (i < i3) {
                this.c[i] = mVar.b(this.d[i]);
                i++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    public final m a() {
        return this.f667a;
    }

    public final n b() {
        return this.d[c()];
    }

    public final n d(int i) {
        return this.d[i];
    }

    public final int e() {
        return this.c.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f667a == aVar.f667a && Arrays.equals(this.c, aVar.c);
    }

    public void f() {
    }

    public void g(float f) {
    }

    public void h() {
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = (System.identityHashCode(this.f667a) * 31) + Arrays.hashCode(this.c);
        }
        return this.e;
    }

    public final int i(int i) {
        return this.c[i];
    }
}
