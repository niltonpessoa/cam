package b.a.a.a.k0.s;

import b.a.a.a.k0.f;
import b.a.a.a.r0.a;
import b.a.a.a.r0.m;
import java.util.Arrays;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private final e f405a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final m f406b = new m(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    d() {
    }

    private int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            e eVar = this.f405a;
            if (i5 >= eVar.d) {
                break;
            }
            int[] iArr = eVar.g;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public e b() {
        return this.f405a;
    }

    public m c() {
        return this.f406b;
    }

    public boolean d(f fVar) {
        int i;
        a.f(fVar != null);
        if (this.e) {
            this.e = false;
            this.f406b.F();
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.f405a.a(fVar, true)) {
                    return false;
                }
                e eVar = this.f405a;
                int i2 = eVar.e;
                if ((eVar.f408b & 1) == 1 && this.f406b.d() == 0) {
                    i2 += a(0);
                    i = this.d + 0;
                } else {
                    i = 0;
                }
                fVar.c(i2);
                this.c = i;
            }
            int a2 = a(this.c);
            int i3 = this.c + this.d;
            if (a2 > 0) {
                if (this.f406b.b() < this.f406b.d() + a2) {
                    m mVar = this.f406b;
                    mVar.f734a = Arrays.copyOf(mVar.f734a, mVar.d() + a2);
                }
                m mVar2 = this.f406b;
                fVar.i(mVar2.f734a, mVar2.d(), a2);
                m mVar3 = this.f406b;
                mVar3.I(mVar3.d() + a2);
                this.e = this.f405a.g[i3 + -1] != 255;
            }
            if (i3 == this.f405a.d) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public void e() {
        this.f405a.b();
        this.f406b.F();
        this.c = -1;
        this.e = false;
    }

    public void f() {
        m mVar = this.f406b;
        byte[] bArr = mVar.f734a;
        if (bArr.length != 65025) {
            mVar.f734a = Arrays.copyOf(bArr, Math.max(65025, mVar.d()));
        }
    }
}
