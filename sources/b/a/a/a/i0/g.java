package b.a.a.a.i0;

import b.a.a.a.i0.e;
import b.a.a.a.i0.f;
import java.lang.Exception;
import java.util.LinkedList;

public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f298a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f299b = new Object();
    private final LinkedList<I> c = new LinkedList<>();
    private final LinkedList<O> d = new LinkedList<>();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    class a extends Thread {
        a() {
        }

        public void run() {
            g.this.u();
        }
    }

    protected g(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.e[i2] = h();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i3 = 0; i3 < this.h; i3++) {
            this.f[i3] = i();
        }
        a aVar = new a();
        this.f298a = aVar;
        aVar.start();
    }

    private boolean g() {
        return !this.c.isEmpty() && this.h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.j() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.e(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.i() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.e(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.j = k(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r6.j = j(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f299b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.l     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.g()     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f299b     // Catch:{ all -> 0x008d }
            r1.wait()     // Catch:{ all -> 0x008d }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.l     // Catch:{ all -> 0x008d }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return r2
        L_0x001a:
            java.util.LinkedList<I> r1 = r6.c     // Catch:{ all -> 0x008d }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x008d }
            b.a.a.a.i0.e r1 = (b.a.a.a.i0.e) r1     // Catch:{ all -> 0x008d }
            O[] r3 = r6.f     // Catch:{ all -> 0x008d }
            int r4 = r6.h     // Catch:{ all -> 0x008d }
            r5 = 1
            int r4 = r4 - r5
            r6.h = r4     // Catch:{ all -> 0x008d }
            r3 = r3[r4]     // Catch:{ all -> 0x008d }
            boolean r4 = r6.k     // Catch:{ all -> 0x008d }
            r6.k = r2     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            boolean r0 = r1.j()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.e(r0)
            goto L_0x0063
        L_0x003c:
            boolean r0 = r1.i()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.e(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.k(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0050, OutOfMemoryError -> 0x004e }
            r6.j = r0     // Catch:{ RuntimeException -> 0x0050, OutOfMemoryError -> 0x004e }
            goto L_0x0057
        L_0x004e:
            r0 = move-exception
            goto L_0x0051
        L_0x0050:
            r0 = move-exception
        L_0x0051:
            java.lang.Exception r0 = r6.j(r0)
            r6.j = r0
        L_0x0057:
            E r0 = r6.j
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r6.f299b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return r2
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        L_0x0063:
            java.lang.Object r4 = r6.f299b
            monitor-enter(r4)
            boolean r0 = r6.k     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x006e
        L_0x006a:
            r6.t(r3)     // Catch:{ all -> 0x008a }
            goto L_0x0085
        L_0x006e:
            boolean r0 = r3.i()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x007a
            int r0 = r6.m     // Catch:{ all -> 0x008a }
            int r0 = r0 + r5
            r6.m = r0     // Catch:{ all -> 0x008a }
            goto L_0x006a
        L_0x007a:
            int r0 = r6.m     // Catch:{ all -> 0x008a }
            r3.c = r0     // Catch:{ all -> 0x008a }
            r6.m = r2     // Catch:{ all -> 0x008a }
            java.util.LinkedList<O> r0 = r6.d     // Catch:{ all -> 0x008a }
            r0.addLast(r3)     // Catch:{ all -> 0x008a }
        L_0x0085:
            r6.r(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r4)     // Catch:{ all -> 0x008a }
            return r5
        L_0x008a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008a }
            throw r0
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0091
        L_0x0090:
            throw r1
        L_0x0091:
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.i0.g.l():boolean");
    }

    private void o() {
        if (g()) {
            this.f299b.notify();
        }
    }

    private void p() {
        E e2 = this.j;
        if (e2 != null) {
            throw e2;
        }
    }

    private void r(I i2) {
        i2.f();
        I[] iArr = this.e;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr[i3] = i2;
    }

    private void t(O o) {
        o.f();
        O[] oArr = this.f;
        int i2 = this.h;
        this.h = i2 + 1;
        oArr[i2] = o;
    }

    /* access modifiers changed from: private */
    public void u() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (l());
    }

    public void a() {
        synchronized (this.f299b) {
            this.l = true;
            this.f299b.notify();
        }
        try {
            this.f298a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void flush() {
        synchronized (this.f299b) {
            this.k = true;
            this.m = 0;
            I i2 = this.i;
            if (i2 != null) {
                r(i2);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                r((e) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                t((f) this.d.removeFirst());
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract I h();

    /* access modifiers changed from: protected */
    public abstract O i();

    /* access modifiers changed from: protected */
    public abstract E j(Throwable th);

    /* access modifiers changed from: protected */
    public abstract E k(I i2, O o, boolean z);

    /* renamed from: m */
    public final I e() {
        I i2;
        synchronized (this.f299b) {
            p();
            b.a.a.a.r0.a.f(this.i == null);
            int i3 = this.g;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.e;
                int i4 = i3 - 1;
                this.g = i4;
                i2 = iArr[i4];
            }
            this.i = i2;
        }
        return i2;
    }

    /* renamed from: n */
    public final O d() {
        synchronized (this.f299b) {
            p();
            if (this.d.isEmpty()) {
                return null;
            }
            O o = (f) this.d.removeFirst();
            return o;
        }
    }

    /* renamed from: q */
    public final void c(I i2) {
        synchronized (this.f299b) {
            p();
            b.a.a.a.r0.a.a(i2 == this.i);
            this.c.addLast(i2);
            o();
            this.i = null;
        }
    }

    /* access modifiers changed from: protected */
    public void s(O o) {
        synchronized (this.f299b) {
            t(o);
            o();
        }
    }

    /* access modifiers changed from: protected */
    public final void v(int i2) {
        b.a.a.a.r0.a.f(this.g == this.e.length);
        for (I n : this.e) {
            n.n(i2);
        }
    }
}
