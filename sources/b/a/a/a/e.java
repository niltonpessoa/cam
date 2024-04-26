package b.a.a.a;

import b.a.a.a.n0.n;
import b.a.a.a.p0.f;
import b.a.a.a.q0.b;
import b.a.a.a.q0.i;
import b.a.a.a.r0.p;
import b.a.a.a.r0.w;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;

public class e implements q {

    /* renamed from: a  reason: collision with root package name */
    private final i f228a;

    /* renamed from: b  reason: collision with root package name */
    private final long f229b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final p h;
    private int i;
    private boolean j;

    public e() {
        this(new i(true, 65536));
    }

    public e(i iVar) {
        this(iVar, 15000, 30000, 2500, BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT, -1, true);
    }

    public e(i iVar, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(iVar, i2, i3, i4, i5, i6, z, (p) null);
    }

    public e(i iVar, int i2, int i3, int i4, int i5, int i6, boolean z, p pVar) {
        this.f228a = iVar;
        this.f229b = ((long) i2) * 1000;
        this.c = ((long) i3) * 1000;
        this.d = ((long) i4) * 1000;
        this.e = ((long) i5) * 1000;
        this.f = i6;
        this.g = z;
    }

    private void k(boolean z) {
        this.i = 0;
        p pVar = this.h;
        if (pVar == null || !this.j) {
            this.j = false;
            if (z) {
                this.f228a.g();
                return;
            }
            return;
        }
        pVar.b(0);
        throw null;
    }

    public boolean a(long j2, float f2, boolean z) {
        long s = w.s(j2, f2);
        long j3 = z ? this.e : this.d;
        return j3 <= 0 || s >= j3 || (!this.g && this.f228a.f() >= this.i);
    }

    public boolean b() {
        return false;
    }

    public boolean c(long j2, float f2) {
        boolean z;
        boolean z2 = true;
        boolean z3 = this.f228a.f() >= this.i;
        boolean z4 = this.j;
        if (!this.g ? z3 || (j2 >= this.f229b && (j2 > this.c || !z4)) : j2 >= this.f229b && (j2 > this.c || !z4 || z3)) {
            z2 = false;
        }
        this.j = z2;
        p pVar = this.h;
        if (pVar == null || (z = this.j) == z4) {
            return this.j;
        }
        if (z) {
            pVar.a(0);
            throw null;
        }
        pVar.b(0);
        throw null;
    }

    public b d() {
        return this.f228a;
    }

    public void e() {
        k(true);
    }

    public void f(a0[] a0VarArr, n nVar, f fVar) {
        int i2 = this.f;
        if (i2 == -1) {
            i2 = j(a0VarArr, fVar);
        }
        this.i = i2;
        this.f228a.h(i2);
    }

    public long g() {
        return 0;
    }

    public void h() {
        k(true);
    }

    public void i() {
        k(false);
    }

    /* access modifiers changed from: protected */
    public int j(a0[] a0VarArr, f fVar) {
        int i2 = 0;
        for (int i3 = 0; i3 < a0VarArr.length; i3++) {
            if (fVar.a(i3) != null) {
                i2 += w.n(a0VarArr[i3].g());
            }
        }
        return i2;
    }
}
