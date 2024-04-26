package android.support.v4.app;

import a.b.b.b.h;
import android.app.Activity;
import android.arch.lifecycle.c;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import android.arch.lifecycle.m;
import android.os.Bundle;
import android.support.v4.view.c;
import android.view.KeyEvent;
import android.view.View;

public class x extends Activity implements e, c.a {

    /* renamed from: a  reason: collision with root package name */
    private f f148a = new f(this);

    public x() {
        new h();
    }

    public android.arch.lifecycle.c a() {
        return this.f148a;
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !c.d(decorView, keyEvent)) {
            return c.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !c.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m.e(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f148a.k(c.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
