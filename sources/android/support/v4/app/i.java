package android.support.v4.app;

import a.b.b.b.g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class i<E> extends g {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f91a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f92b;
    private final Handler c;
    final k d;

    i(Activity activity, Context context, Handler handler, int i) {
        this.d = new k();
        this.f91a = activity;
        g.a(context, "context == null");
        this.f92b = context;
        g.a(handler, "handler == null");
        this.c = handler;
    }

    i(f fVar) {
        this(fVar, fVar, fVar.f86b, 0);
    }

    /* access modifiers changed from: package-private */
    public Activity d() {
        return this.f91a;
    }

    /* access modifiers changed from: package-private */
    public Context e() {
        return this.f92b;
    }

    /* access modifiers changed from: package-private */
    public k f() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public Handler g() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public abstract void h(e eVar);

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract LayoutInflater j();

    public abstract int k();

    public abstract boolean l();

    public abstract boolean m(e eVar);

    public abstract void n(e eVar, Intent intent, int i, Bundle bundle);

    public abstract void o();
}
