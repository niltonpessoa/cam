package b.a.a.a.n0;

import java.util.Arrays;

public final class n {
    public static final n d = new n(new m[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f587a;

    /* renamed from: b  reason: collision with root package name */
    private final m[] f588b;
    private int c;

    public n(m... mVarArr) {
        this.f588b = mVarArr;
        this.f587a = mVarArr.length;
    }

    public m a(int i) {
        return this.f588b[i];
    }

    public int b(m mVar) {
        for (int i = 0; i < this.f587a; i++) {
            if (this.f588b[i] == mVar) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f587a == nVar.f587a && Arrays.equals(this.f588b, nVar.f588b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.f588b);
        }
        return this.c;
    }
}
