package b.a.a.a.k0.s;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f413a;

    /* renamed from: b  reason: collision with root package name */
    private final int f414b;
    private int c;
    private int d;

    public i(byte[] bArr) {
        this.f413a = bArr;
        this.f414b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f414b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f414b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            b.a.a.a.r0.a.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.s.i.a():void");
    }

    public int b() {
        return (this.c * 8) + this.d;
    }

    public boolean c() {
        boolean z = (((this.f413a[this.c] & 255) >> this.d) & 1) == 1;
        e(1);
        return z;
    }

    public int d(int i) {
        int i2 = this.c;
        int min = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.f413a[i2] & 255) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f413a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        e(i);
        return i5;
    }

    public void e(int i) {
        int i2 = i / 8;
        int i3 = this.c + i2;
        this.c = i3;
        int i4 = this.d + (i - (i2 * 8));
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        a();
    }
}
