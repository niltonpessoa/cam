package b.a.a.a.r0;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f736a;

    /* renamed from: b  reason: collision with root package name */
    private int f737b;
    private int c;
    private int d;

    public n(byte[] bArr, int i, int i2) {
        i(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f737b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f737b
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
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.r0.n.a():void");
    }

    private int f() {
        int i = 0;
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = e(i2);
        }
        return i3 + i;
    }

    private boolean j(int i) {
        if (2 <= i && i < this.f737b) {
            byte[] bArr = this.f736a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    public boolean b(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f737b) {
                int i6 = this.f737b;
            } else if (j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f737b;
        if (i4 >= i62) {
            return i4 == i62 && i5 == 0;
        }
        return true;
    }

    public boolean c() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.f737b && !d()) {
            i3++;
        }
        boolean z = this.c == this.f737b;
        this.c = i;
        this.d = i2;
        return !z && b((i3 * 2) + 1);
    }

    public boolean d() {
        boolean z = (this.f736a[this.c] & (128 >> this.d)) != 0;
        k();
        return z;
    }

    public int e(int i) {
        int i2;
        int i3;
        this.d += i;
        int i4 = 0;
        while (true) {
            i2 = this.d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            byte[] bArr = this.f736a;
            int i6 = this.c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!j(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        byte[] bArr2 = this.f736a;
        int i7 = this.c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            if (!j(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        a();
        return i8;
    }

    public int g() {
        int f = f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i, int i2) {
        this.f736a = bArr;
        this.c = i;
        this.f737b = i2;
        this.d = 0;
        a();
    }

    public void k() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (j(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        a();
    }

    public void l(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                a();
                return;
            } else if (j(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }
}
