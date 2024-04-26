package b.a.a.a.r0;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f722a;

    /* renamed from: b  reason: collision with root package name */
    public final int f723b;
    public final int c;
    public final long d;

    public f(byte[] bArr, int i) {
        l lVar = new l(bArr);
        lVar.m(i * 8);
        lVar.h(16);
        lVar.h(16);
        lVar.h(24);
        lVar.h(24);
        this.f722a = lVar.h(20);
        this.f723b = lVar.h(3) + 1;
        this.c = lVar.h(5) + 1;
        this.d = ((((long) lVar.h(4)) & 15) << 32) | (((long) lVar.h(32)) & 4294967295L);
    }

    public int a() {
        return this.c * this.f722a;
    }

    public long b() {
        return (this.d * 1000000) / ((long) this.f722a);
    }
}
