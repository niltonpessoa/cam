package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f146a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f147b;
    private final Runnable c;

    private u(View view, Runnable runnable) {
        this.f146a = view;
        this.f147b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static u a(View view, Runnable runnable) {
        u uVar = new u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(uVar);
        view.addOnAttachStateChangeListener(uVar);
        return uVar;
    }

    public void b() {
        (this.f147b.isAlive() ? this.f147b : this.f146a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f146a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f147b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
