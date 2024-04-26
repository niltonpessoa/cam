package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class f {
    public f() {
        new DataSetObservable();
    }

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    @Deprecated
    public void b(View view) {
    }

    public void c(ViewGroup viewGroup) {
        b(viewGroup);
    }

    public abstract int d();

    public int e(Object obj) {
        return -1;
    }

    public float f(int i) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i);

    public abstract boolean h(View view, Object obj);

    public abstract void i(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable j();

    @Deprecated
    public void k(View view, int i, Object obj) {
    }

    public void l(ViewGroup viewGroup, int i, Object obj) {
        k(viewGroup, i, obj);
    }

    /* access modifiers changed from: package-private */
    public void m(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    @Deprecated
    public void n(View view) {
    }

    public void o(ViewGroup viewGroup) {
        n(viewGroup);
    }
}
