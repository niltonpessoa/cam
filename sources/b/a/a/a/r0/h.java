package b.a.a.a.r0;

import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private int f724a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f725b;

    public h() {
        this(32);
    }

    public h(int i) {
        this.f725b = new long[i];
    }

    public void a(long j) {
        int i = this.f724a;
        long[] jArr = this.f725b;
        if (i == jArr.length) {
            this.f725b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f725b;
        int i2 = this.f724a;
        this.f724a = i2 + 1;
        jArr2[i2] = j;
    }

    public long b(int i) {
        if (i >= 0 && i < this.f724a) {
            return this.f725b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f724a);
    }

    public int c() {
        return this.f724a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f725b, this.f724a);
    }
}
