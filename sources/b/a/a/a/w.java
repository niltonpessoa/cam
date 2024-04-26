package b.a.a.a;

import b.a.a.a.r0.a;

public final class w {
    public static final w d = new w(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f787a;

    /* renamed from: b  reason: collision with root package name */
    public final float f788b;
    private final int c;

    public w(float f, float f2) {
        boolean z = true;
        a.a(f > 0.0f);
        a.a(f2 <= 0.0f ? false : z);
        this.f787a = f;
        this.f788b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public long a(long j) {
        return j * ((long) this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f787a == wVar.f787a && this.f788b == wVar.f788b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f787a)) * 31) + Float.floatToRawIntBits(this.f788b);
    }
}
