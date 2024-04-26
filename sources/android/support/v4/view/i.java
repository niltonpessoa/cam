package android.support.v4.view;

import android.os.Build;
import android.view.WindowInsets;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Object f216a;

    private i(Object obj) {
        this.f216a = obj;
    }

    static Object g(i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar.f216a;
    }

    static i h(Object obj) {
        if (obj == null) {
            return null;
        }
        return new i(obj);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f216a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f216a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f216a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f216a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f216a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f216a;
        Object obj3 = ((i) obj).f216a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public i f(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new i(((WindowInsets) this.f216a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f216a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
