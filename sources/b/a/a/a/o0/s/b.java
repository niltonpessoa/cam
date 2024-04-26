package b.a.a.a.o0.s;

import b.a.a.a.o0.e;
import b.a.a.a.r0.a;
import java.util.Collections;
import java.util.List;

final class b implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final b f648b = new b();

    /* renamed from: a  reason: collision with root package name */
    private final List<b.a.a.a.o0.b> f649a;

    private b() {
        this.f649a = Collections.emptyList();
    }

    public b(b.a.a.a.o0.b bVar) {
        this.f649a = Collections.singletonList(bVar);
    }

    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public List<b.a.a.a.o0.b> b(long j) {
        return j >= 0 ? this.f649a : Collections.emptyList();
    }

    public long c(int i) {
        a.a(i == 0);
        return 0;
    }

    public int d() {
        return 1;
    }
}
