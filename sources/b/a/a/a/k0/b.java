package b.a.a.a.k0;

import b.a.a.a.q0.f;
import b.a.a.a.r0.w;
import java.io.EOFException;
import java.util.Arrays;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f312a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final f f313b;
    private final long c;
    private long d;
    private byte[] e = new byte[65536];
    private int f;
    private int g;

    public b(f fVar, long j, long j2) {
        this.f313b = fVar;
        this.d = j;
        this.c = j2;
    }

    private void m(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    private void n(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, w.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int o(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a2 = this.f313b.a(bArr, i + i3, i2 - i3);
            if (a2 != -1) {
                return i3 + a2;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private int p(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        s(min);
        return min;
    }

    private int q(int i) {
        int min = Math.min(this.g, i);
        s(min);
        return min;
    }

    private void s(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    public int a(byte[] bArr, int i, int i2) {
        int p = p(bArr, i, i2);
        if (p == 0) {
            p = o(bArr, i, i2, 0, true);
        }
        m(p);
        return p;
    }

    public void b() {
        this.f = 0;
    }

    public void c(int i) {
        r(i, false);
    }

    public int d(int i) {
        int q = q(i);
        if (q == 0) {
            byte[] bArr = this.f312a;
            q = o(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m(q);
        return q;
    }

    public boolean e(byte[] bArr, int i, int i2, boolean z) {
        int p = p(bArr, i, i2);
        while (p < i2 && p != -1) {
            p = o(bArr, i, i2, p, z);
        }
        m(p);
        return p != -1;
    }

    public boolean f(byte[] bArr, int i, int i2, boolean z) {
        if (!l(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public long g() {
        return this.d + ((long) this.f);
    }

    public long getLength() {
        return this.c;
    }

    public void h(byte[] bArr, int i, int i2) {
        f(bArr, i, i2, false);
    }

    public void i(byte[] bArr, int i, int i2) {
        e(bArr, i, i2, false);
    }

    public void j(int i) {
        l(i, false);
    }

    public long k() {
        return this.d;
    }

    public boolean l(int i, boolean z) {
        n(i);
        int min = Math.min(this.g - this.f, i);
        while (min < i) {
            min = o(this.e, this.f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i2 = this.f + i;
        this.f = i2;
        this.g = Math.max(this.g, i2);
        return true;
    }

    public boolean r(int i, boolean z) {
        int q = q(i);
        while (q < i && q != -1) {
            q = o(this.f312a, -q, Math.min(i, this.f312a.length + q), q, z);
        }
        m(q);
        return q != -1;
    }
}
