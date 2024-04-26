package b.a.a.a.o0.r;

import android.text.Layout;
import b.a.a.a.r0.a;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private String f644a;

    /* renamed from: b  reason: collision with root package name */
    private int f645b;
    private boolean c;
    private int d;
    private boolean e;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private float k;
    private String l;
    private e m;
    private Layout.Alignment n;

    private e l(e eVar, boolean z) {
        if (eVar != null) {
            if (!this.c && eVar.c) {
                q(eVar.f645b);
            }
            if (this.h == -1) {
                this.h = eVar.h;
            }
            if (this.i == -1) {
                this.i = eVar.i;
            }
            if (this.f644a == null) {
                this.f644a = eVar.f644a;
            }
            if (this.f == -1) {
                this.f = eVar.f;
            }
            if (this.g == -1) {
                this.g = eVar.g;
            }
            if (this.n == null) {
                this.n = eVar.n;
            }
            if (this.j == -1) {
                this.j = eVar.j;
                this.k = eVar.k;
            }
            if (z && !this.e && eVar.e) {
                o(eVar.d);
            }
        }
        return this;
    }

    public e a(e eVar) {
        l(eVar, true);
        return this;
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.f645b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f644a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    public String g() {
        return this.l;
    }

    public int h() {
        int i2 = this.h;
        if (i2 == -1 && this.i == -1) {
            return -1;
        }
        int i3 = 0;
        int i4 = i2 == 1 ? 1 : 0;
        if (this.i == 1) {
            i3 = 2;
        }
        return i4 | i3;
    }

    public Layout.Alignment i() {
        return this.n;
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.c;
    }

    public boolean m() {
        return this.f == 1;
    }

    public boolean n() {
        return this.g == 1;
    }

    public e o(int i2) {
        this.d = i2;
        this.e = true;
        return this;
    }

    public e p(boolean z) {
        a.f(this.m == null);
        this.h = z ? 1 : 0;
        return this;
    }

    public e q(int i2) {
        a.f(this.m == null);
        this.f645b = i2;
        this.c = true;
        return this;
    }

    public e r(String str) {
        a.f(this.m == null);
        this.f644a = str;
        return this;
    }

    public e s(float f2) {
        this.k = f2;
        return this;
    }

    public e t(int i2) {
        this.j = i2;
        return this;
    }

    public e u(String str) {
        this.l = str;
        return this;
    }

    public e v(boolean z) {
        a.f(this.m == null);
        this.i = z ? 1 : 0;
        return this;
    }

    public e w(boolean z) {
        a.f(this.m == null);
        this.f = z ? 1 : 0;
        return this;
    }

    public e x(Layout.Alignment alignment) {
        this.n = alignment;
        return this;
    }

    public e y(boolean z) {
        a.f(this.m == null);
        this.g = z ? 1 : 0;
        return this;
    }
}
