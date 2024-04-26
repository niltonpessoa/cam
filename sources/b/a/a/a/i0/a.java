package b.a.a.a.i0;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private int f289a;

    public final void e(int i) {
        this.f289a = i | this.f289a;
    }

    public void f() {
        this.f289a = 0;
    }

    public final void g(int i) {
        this.f289a = (i ^ -1) & this.f289a;
    }

    /* access modifiers changed from: protected */
    public final boolean h(int i) {
        return (this.f289a & i) == i;
    }

    public final boolean i() {
        return h(Integer.MIN_VALUE);
    }

    public final boolean j() {
        return h(4);
    }

    public final boolean k() {
        return h(1);
    }

    public final void l(int i) {
        this.f289a = i;
    }
}
