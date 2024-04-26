package b.a.a.a.p0;

import java.util.Arrays;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f679a;

    /* renamed from: b  reason: collision with root package name */
    private final e[] f680b;
    private int c;

    public f(e... eVarArr) {
        this.f680b = eVarArr;
        this.f679a = eVarArr.length;
    }

    public e a(int i) {
        return this.f680b[i];
    }

    public e[] b() {
        return (e[]) this.f680b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f680b, ((f) obj).f680b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.f680b);
        }
        return this.c;
    }
}
