package b.a.a.a.o0.m;

import b.a.a.a.o0.e;
import b.a.a.a.o0.f;
import b.a.a.a.o0.i;
import b.a.a.a.o0.j;
import java.util.LinkedList;
import java.util.PriorityQueue;

abstract class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<b> f607a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private final LinkedList<j> f608b;
    private final PriorityQueue<b> c;
    private b d;
    private long e;
    private long f;

    private static final class b extends i implements Comparable<b> {
        /* access modifiers changed from: private */
        public long g;

        private b() {
        }

        /* renamed from: t */
        public int compareTo(b bVar) {
            if (j() != bVar.j()) {
                return j() ? 1 : -1;
            }
            long j = this.d - bVar.d;
            if (j == 0) {
                j = this.g - bVar.g;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    private final class c extends j {
        private c() {
        }

        public final void m() {
            d.this.m(this);
        }
    }

    public d() {
        for (int i = 0; i < 10; i++) {
            this.f607a.add(new b());
        }
        this.f608b = new LinkedList<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f608b.add(new c());
        }
        this.c = new PriorityQueue<>();
    }

    private void l(b bVar) {
        bVar.f();
        this.f607a.add(bVar);
    }

    public void a() {
    }

    public void b(long j) {
        this.e = j;
    }

    /* access modifiers changed from: protected */
    public abstract e f();

    public void flush() {
        this.f = 0;
        this.e = 0;
        while (!this.c.isEmpty()) {
            l(this.c.poll());
        }
        b bVar = this.d;
        if (bVar != null) {
            l(bVar);
            this.d = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g(i iVar);

    /* renamed from: h */
    public i e() {
        b.a.a.a.r0.a.f(this.d == null);
        if (this.f607a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f607a.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    /* renamed from: i */
    public j d() {
        j pollFirst;
        if (this.f608b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && this.c.peek().d <= this.e) {
            b poll = this.c.poll();
            if (poll.j()) {
                pollFirst = this.f608b.pollFirst();
                pollFirst.e(4);
            } else {
                g(poll);
                if (j()) {
                    e f2 = f();
                    if (!poll.i()) {
                        pollFirst = this.f608b.pollFirst();
                        pollFirst.n(poll.d, f2, Long.MAX_VALUE);
                    }
                }
                l(poll);
            }
            l(poll);
            return pollFirst;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean j();

    /* renamed from: k */
    public void c(i iVar) {
        b.a.a.a.r0.a.a(iVar == this.d);
        if (iVar.i()) {
            l(this.d);
        } else {
            b bVar = this.d;
            long j = this.f;
            this.f = 1 + j;
            long unused = bVar.g = j;
            this.c.add(this.d);
        }
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public void m(j jVar) {
        jVar.f();
        this.f608b.add(jVar);
    }
}
