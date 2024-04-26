package b.a.a.a.o0.r;

import b.a.a.a.o0.b;
import b.a.a.a.o0.e;
import b.a.a.a.r0.w;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final b f646a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f647b;
    private final Map<String, e> c;
    private final Map<String, c> d;

    public f(b bVar, Map<String, e> map, Map<String, c> map2) {
        this.f646a = bVar;
        this.d = map2;
        this.c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f647b = bVar.j();
    }

    public int a(long j) {
        int c2 = w.c(this.f647b, j, false, false);
        if (c2 < this.f647b.length) {
            return c2;
        }
        return -1;
    }

    public List<b> b(long j) {
        return this.f646a.h(j, this.c, this.d);
    }

    public long c(int i) {
        return this.f647b[i];
    }

    public int d() {
        return this.f647b.length;
    }
}
