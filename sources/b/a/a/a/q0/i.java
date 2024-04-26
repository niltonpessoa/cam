package b.a.a.a.q0;

import b.a.a.a.r0.a;
import b.a.a.a.r0.w;
import java.util.Arrays;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f693a;

    /* renamed from: b  reason: collision with root package name */
    private final int f694b;
    private final byte[] c;
    private final a[] d;
    private int e;
    private int f;
    private int g;
    private a[] h;

    public i(boolean z, int i) {
        this(z, i, 0);
    }

    public i(boolean z, int i, int i2) {
        a.a(i > 0);
        a.a(i2 >= 0);
        this.f693a = z;
        this.f694b = i;
        this.g = i2;
        this.h = new a[(i2 + 100)];
        if (i2 > 0) {
            this.c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.h[i3] = new a(this.c, i3 * i);
            }
        } else {
            this.c = null;
        }
        this.d = new a[1];
    }

    public synchronized void a(a aVar) {
        a[] aVarArr = this.d;
        aVarArr[0] = aVar;
        c(aVarArr);
    }

    public synchronized void b() {
        int i = 0;
        int max = Math.max(0, w.e(this.e, this.f694b) - this.f);
        int i2 = this.g;
        if (max < i2) {
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    a[] aVarArr = this.h;
                    a aVar = aVarArr[i];
                    byte[] bArr = aVar.f683a;
                    byte[] bArr2 = this.c;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        a aVar2 = aVarArr[i3];
                        if (aVar2.f683a != bArr2) {
                            i3--;
                        } else {
                            aVarArr[i] = aVar2;
                            aVarArr[i3] = aVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.g) {
                    return;
                }
            }
            Arrays.fill(this.h, max, this.g, (Object) null);
            this.g = max;
        }
    }

    public synchronized void c(a[] aVarArr) {
        boolean z;
        int i = this.g;
        int length = aVarArr.length + i;
        a[] aVarArr2 = this.h;
        if (length >= aVarArr2.length) {
            this.h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            byte[] bArr = aVar.f683a;
            if (bArr != this.c) {
                if (bArr.length != this.f694b) {
                    z = false;
                    a.a(z);
                    a[] aVarArr3 = this.h;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    aVarArr3[i2] = aVar;
                }
            }
            z = true;
            a.a(z);
            a[] aVarArr32 = this.h;
            int i22 = this.g;
            this.g = i22 + 1;
            aVarArr32[i22] = aVar;
        }
        this.f -= aVarArr.length;
        notifyAll();
    }

    public synchronized a d() {
        a aVar;
        this.f++;
        int i = this.g;
        if (i > 0) {
            a[] aVarArr = this.h;
            int i2 = i - 1;
            this.g = i2;
            aVar = aVarArr[i2];
            aVarArr[i2] = null;
        } else {
            aVar = new a(new byte[this.f694b], 0);
        }
        return aVar;
    }

    public int e() {
        return this.f694b;
    }

    public synchronized int f() {
        return this.f * this.f694b;
    }

    public synchronized void g() {
        if (this.f693a) {
            h(0);
        }
    }

    public synchronized void h(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            b();
        }
    }
}
