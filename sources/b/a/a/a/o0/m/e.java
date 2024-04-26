package b.a.a.a.o0.m;

import b.a.a.a.o0.b;
import b.a.a.a.r0.a;
import java.util.Collections;
import java.util.List;

final class e implements b.a.a.a.o0.e {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f609a;

    public e(List<b> list) {
        this.f609a = list;
    }

    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public List<b> b(long j) {
        return j >= 0 ? this.f609a : Collections.emptyList();
    }

    public long c(int i) {
        a.a(i == 0);
        return 0;
    }

    public int d() {
        return 1;
    }
}
