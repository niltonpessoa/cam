package b.a.a.a;

import b.a.a.a.r0.a;

public final class e0 {
    public static final e0 c;
    public static final e0 d;

    /* renamed from: a  reason: collision with root package name */
    public final long f230a;

    /* renamed from: b  reason: collision with root package name */
    public final long f231b;

    static {
        e0 e0Var = new e0(0, 0);
        c = e0Var;
        new e0(Long.MAX_VALUE, Long.MAX_VALUE);
        new e0(Long.MAX_VALUE, 0);
        new e0(0, Long.MAX_VALUE);
        d = e0Var;
    }

    public e0(long j, long j2) {
        boolean z = true;
        a.a(j >= 0);
        a.a(j2 < 0 ? false : z);
        this.f230a = j;
        this.f231b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f230a == e0Var.f230a && this.f231b == e0Var.f231b;
    }

    public int hashCode() {
        return (((int) this.f230a) * 31) + ((int) this.f231b);
    }
}
