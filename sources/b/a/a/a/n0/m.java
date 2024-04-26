package b.a.a.a.n0;

import b.a.a.a.n;
import b.a.a.a.r0.a;
import java.util.Arrays;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f585a;

    /* renamed from: b  reason: collision with root package name */
    private final n[] f586b;
    private int c;

    public m(n... nVarArr) {
        a.f(nVarArr.length > 0);
        this.f586b = nVarArr;
        this.f585a = nVarArr.length;
    }

    public n a(int i) {
        return this.f586b[i];
    }

    public int b(n nVar) {
        int i = 0;
        while (true) {
            n[] nVarArr = this.f586b;
            if (i >= nVarArr.length) {
                return -1;
            }
            if (nVar == nVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f585a == mVar.f585a && Arrays.equals(this.f586b, mVar.f586b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.f586b);
        }
        return this.c;
    }
}
