package b.a.a.a.o0.q;

import b.a.a.a.o0.e;
import b.a.a.a.r0.a;
import b.a.a.a.r0.w;
import java.util.Collections;
import java.util.List;

final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final b.a.a.a.o0.b[] f636a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f637b;

    public b(b.a.a.a.o0.b[] bVarArr, long[] jArr) {
        this.f636a = bVarArr;
        this.f637b = jArr;
    }

    public int a(long j) {
        int c = w.c(this.f637b, j, false, false);
        if (c < this.f637b.length) {
            return c;
        }
        return -1;
    }

    public List<b.a.a.a.o0.b> b(long j) {
        int d = w.d(this.f637b, j, true, false);
        if (d != -1) {
            b.a.a.a.o0.b[] bVarArr = this.f636a;
            if (bVarArr[d] != null) {
                return Collections.singletonList(bVarArr[d]);
            }
        }
        return Collections.emptyList();
    }

    public long c(int i) {
        boolean z = true;
        a.a(i >= 0);
        if (i >= this.f637b.length) {
            z = false;
        }
        a.a(z);
        return this.f637b[i];
    }

    public int d() {
        return this.f637b.length;
    }
}
