package b.a.a.a.r0;

import java.nio.charset.Charset;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f734a;

    /* renamed from: b  reason: collision with root package name */
    private int f735b;
    private int c;

    public m() {
    }

    public m(int i) {
        this.f734a = new byte[i];
        this.c = i;
    }

    public m(byte[] bArr) {
        this.f734a = bArr;
        this.c = bArr.length;
    }

    public m(byte[] bArr, int i) {
        this.f734a = bArr;
        this.c = i;
    }

    public int A() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        byte b2 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f735b = i3 + 1;
        return (bArr[i3] & 255) | b2;
    }

    public int B() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    public long C() {
        long q = q();
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException("Top bit not zero: " + q);
    }

    public int D() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        this.f735b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public long E() {
        int i;
        int i2;
        long j = (long) this.f734a[this.f735b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b2 = this.f734a[this.f735b + i];
                if ((b2 & 192) == 128) {
                    j = (j << 6) | ((long) (b2 & 63));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f735b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    public void F() {
        this.f735b = 0;
        this.c = 0;
    }

    public void G(int i) {
        H(b() < i ? new byte[i] : this.f734a, i);
    }

    public void H(byte[] bArr, int i) {
        this.f734a = bArr;
        this.c = i;
        this.f735b = 0;
    }

    public void I(int i) {
        a.a(i >= 0 && i <= this.f734a.length);
        this.c = i;
    }

    public void J(int i) {
        a.a(i >= 0 && i <= this.c);
        this.f735b = i;
    }

    public void K(int i) {
        J(this.f735b + i);
    }

    public int a() {
        return this.c - this.f735b;
    }

    public int b() {
        byte[] bArr = this.f734a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public int c() {
        return this.f735b;
    }

    public int d() {
        return this.c;
    }

    public char e() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public void f(l lVar, int i) {
        g(lVar.f732a, 0, i);
        lVar.m(0);
    }

    public void g(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f734a, this.f735b, bArr, i, i2);
        this.f735b += i2;
    }

    public double h() {
        return Double.longBitsToDouble(q());
    }

    public int i() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f735b = i4;
        byte b3 = b2 | ((bArr[i3] & 255) << 8);
        this.f735b = i4 + 1;
        return (bArr[i4] & 255) | b3;
    }

    public int j() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        byte b2 = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f735b = i3 + 1;
        return (bArr[i3] & 255) | b2;
    }

    public String k() {
        if (a() == 0) {
            return null;
        }
        int i = this.f735b;
        while (i < this.c && !w.x(this.f734a[i])) {
            i++;
        }
        int i2 = this.f735b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f734a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f735b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f734a;
        int i3 = this.f735b;
        String str = new String(bArr2, i3, i - i3);
        this.f735b = i;
        int i4 = this.c;
        if (i == i4) {
            return str;
        }
        byte[] bArr3 = this.f734a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f735b = i5;
            if (i5 == i4) {
                return str;
            }
        }
        int i6 = this.f735b;
        if (bArr3[i6] == 10) {
            this.f735b = i6 + 1;
        }
        return str;
    }

    public int l() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        byte b2 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f735b = i4;
        byte b3 = b2 | ((bArr[i3] & 255) << 16);
        this.f735b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b3;
    }

    public long m() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        int i4 = i3 + 1;
        this.f735b = i4;
        int i5 = i4 + 1;
        this.f735b = i5;
        int i6 = i5 + 1;
        this.f735b = i6;
        int i7 = i6 + 1;
        this.f735b = i7;
        int i8 = i7 + 1;
        this.f735b = i8;
        this.f735b = i8 + 1;
        return ((((long) bArr[i8]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48);
    }

    public long n() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        int i4 = i3 + 1;
        this.f735b = i4;
        this.f735b = i4 + 1;
        return ((((long) bArr[i4]) & 255) << 24) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
    }

    public int o() {
        int l = l();
        if (l >= 0) {
            return l;
        }
        throw new IllegalStateException("Top bit not zero: " + l);
    }

    public int p() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        this.f735b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public long q() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        int i4 = i3 + 1;
        this.f735b = i4;
        int i5 = i4 + 1;
        this.f735b = i5;
        int i6 = i5 + 1;
        this.f735b = i6;
        int i7 = i6 + 1;
        this.f735b = i7;
        int i8 = i7 + 1;
        this.f735b = i8;
        this.f735b = i8 + 1;
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    public String r() {
        if (a() == 0) {
            return null;
        }
        int i = this.f735b;
        while (i < this.c && this.f734a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f734a;
        int i2 = this.f735b;
        String str = new String(bArr, i2, i - i2);
        this.f735b = i;
        if (i < this.c) {
            this.f735b = i + 1;
        }
        return str;
    }

    public String s(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f735b + i) - 1;
        String str = new String(this.f734a, this.f735b, (i2 >= this.c || this.f734a[i2] != 0) ? i : i - 1);
        this.f735b += i;
        return str;
    }

    public short t() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        this.f735b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public String u(int i) {
        return v(i, Charset.forName("UTF-8"));
    }

    public String v(int i, Charset charset) {
        String str = new String(this.f734a, this.f735b, i, charset);
        this.f735b += i;
        return str;
    }

    public int w() {
        return (x() << 21) | (x() << 14) | (x() << 7) | x();
    }

    public int x() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        this.f735b = i + 1;
        return bArr[i] & 255;
    }

    public int y() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        byte b2 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f735b = i3 + 2;
        return b2;
    }

    public long z() {
        byte[] bArr = this.f734a;
        int i = this.f735b;
        int i2 = i + 1;
        this.f735b = i2;
        int i3 = i2 + 1;
        this.f735b = i3;
        int i4 = i3 + 1;
        this.f735b = i4;
        this.f735b = i4 + 1;
        return (((long) bArr[i4]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
    }
}
