package b.a.a.a.k0.t;

import b.a.a.a.r0.a;
import java.util.Arrays;

final class o {

    /* renamed from: a  reason: collision with root package name */
    private final int f454a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f455b;
    private boolean c;
    public byte[] d;
    public int e;

    public o(int i, int i2) {
        this.f454a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.f455b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e;
            if (length < i4 + i3) {
                this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public boolean b(int i) {
        if (!this.f455b) {
            return false;
        }
        this.e -= i;
        this.f455b = false;
        this.c = true;
        return true;
    }

    public boolean c() {
        return this.c;
    }

    public void d() {
        this.f455b = false;
        this.c = false;
    }

    public void e(int i) {
        boolean z = true;
        a.f(!this.f455b);
        if (i != this.f454a) {
            z = false;
        }
        this.f455b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
