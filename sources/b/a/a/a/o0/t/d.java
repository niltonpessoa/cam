package b.a.a.a.o0.t;

import android.text.Layout;
import b.a.a.a.r0.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f653a;

    /* renamed from: b  reason: collision with root package name */
    private String f654b;
    private List<String> c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private Layout.Alignment p;

    public d() {
        m();
    }

    private static int x(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public int b() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String c() {
        return this.e;
    }

    public float d() {
        return this.o;
    }

    public int e() {
        return this.n;
    }

    public int f(String str, String str2, String[] strArr, String str3) {
        if (this.f653a.isEmpty() && this.f654b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int x = x(x(x(0, this.f653a, str, 1073741824), this.f654b, str2, 2), this.d, str3, 4);
        if (x == -1 || !Arrays.asList(strArr).containsAll(this.c)) {
            return 0;
        }
        return x + (this.c.size() * 4);
    }

    public int g() {
        int i2 = this.l;
        if (i2 == -1 && this.m == -1) {
            return -1;
        }
        int i3 = 0;
        int i4 = i2 == 1 ? 1 : 0;
        if (this.m == 1) {
            i3 = 2;
        }
        return i4 | i3;
    }

    public Layout.Alignment h() {
        return this.p;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        return this.j == 1;
    }

    public boolean l() {
        return this.k == 1;
    }

    public void m() {
        this.f653a = "";
        this.f654b = "";
        this.c = Collections.emptyList();
        this.d = "";
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.p = null;
    }

    public d n(int i2) {
        this.h = i2;
        this.i = true;
        return this;
    }

    public d o(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public d p(int i2) {
        this.f = i2;
        this.g = true;
        return this;
    }

    public d q(String str) {
        this.e = w.G(str);
        return this;
    }

    public d r(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public void s(String[] strArr) {
        this.c = Arrays.asList(strArr);
    }

    public void t(String str) {
        this.f653a = str;
    }

    public void u(String str) {
        this.f654b = str;
    }

    public void v(String str) {
        this.d = str;
    }

    public d w(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }
}
