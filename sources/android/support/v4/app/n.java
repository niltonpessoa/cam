package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.f;
import android.view.View;
import android.view.ViewGroup;

public abstract class n extends f {

    /* renamed from: a  reason: collision with root package name */
    private final j f119a;

    /* renamed from: b  reason: collision with root package name */
    private p f120b = null;
    private e c = null;

    public n(j jVar) {
        this.f119a = jVar;
    }

    private static String r(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f120b == null) {
            this.f120b = this.f119a.a();
        }
        this.f120b.e((e) obj);
    }

    public void c(ViewGroup viewGroup) {
        p pVar = this.f120b;
        if (pVar != null) {
            pVar.d();
            this.f120b = null;
        }
    }

    public Object g(ViewGroup viewGroup, int i) {
        if (this.f120b == null) {
            this.f120b = this.f119a.a();
        }
        long q = q(i);
        e c2 = this.f119a.c(r(viewGroup.getId(), q));
        if (c2 != null) {
            this.f120b.c(c2);
        } else {
            c2 = p(i);
            this.f120b.b(viewGroup.getId(), c2, r(viewGroup.getId(), q));
        }
        if (c2 != this.c) {
            c2.Z0(false);
            c2.e1(false);
        }
        return c2;
    }

    public boolean h(View view, Object obj) {
        return ((e) obj).D() == view;
    }

    public void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable j() {
        return null;
    }

    public void l(ViewGroup viewGroup, int i, Object obj) {
        e eVar = (e) obj;
        e eVar2 = this.c;
        if (eVar != eVar2) {
            if (eVar2 != null) {
                eVar2.Z0(false);
                this.c.e1(false);
            }
            eVar.Z0(true);
            eVar.e1(true);
            this.c = eVar;
        }
    }

    public void o(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract e p(int i);

    public long q(int i) {
        return (long) i;
    }
}
