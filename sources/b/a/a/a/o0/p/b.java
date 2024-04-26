package b.a.a.a.o0.p;

import b.a.a.a.o0.e;
import b.a.a.a.r0.a;
import b.a.a.a.r0.w;
import java.util.Collections;
import java.util.List;

final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final b.a.a.a.o0.b[] f634a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f635b;

    public b(b.a.a.a.o0.b[] bVarArr, long[] jArr) {
        this.f634a = bVarArr;
        this.f635b = jArr;
    }

    public int a(long j) {
        int c = w.c(this.f635b, j, false, false);
        if (c < this.f635b.length) {
            return c;
        }
        return -1;
    }

    public List<b.a.a.a.o0.b> b(long j) {
        int d = w.d(this.f635b, j, true, false);
        if (d != -1) {
            b.a.a.a.o0.b[] bVarArr = this.f634a;
            if (bVarArr[d] != null) {
                return Collections.singletonList(bVarArr[d]);
            }
        }
        return Collections.emptyList();
    }

    public long c(int i) {
        boolean z = true;
        a.a(i >= 0);
        if (i >= this.f635b.length) {
            z = false;
        }
        a.a(z);
        return this.f635b[i];
    }

    public int d() {
        return this.f635b.length;
    }
}
