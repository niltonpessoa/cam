package b.a.a.a.k0;

public final class m {
    public static final m c = new m(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f325a;

    /* renamed from: b  reason: collision with root package name */
    public final long f326b;

    public m(long j, long j2) {
        this.f325a = j;
        this.f326b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f325a == mVar.f325a && this.f326b == mVar.f326b;
    }

    public int hashCode() {
        return (((int) this.f325a) * 31) + ((int) this.f326b);
    }

    public String toString() {
        return "[timeUs=" + this.f325a + ", position=" + this.f326b + "]";
    }
}
