package android.support.v4.app;

import a.b.b.b.i;
import android.arch.lifecycle.c;
import android.arch.lifecycle.p;
import android.arch.lifecycle.q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class f extends x implements q {

    /* renamed from: b  reason: collision with root package name */
    final Handler f86b = new a();
    final h c = h.b(new b());
    private p d;
    boolean e;
    boolean f;
    boolean g = true;
    boolean h;
    boolean i;
    int j;
    i<String> k;

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            f.this.l();
            f.this.c.s();
        }
    }

    class b extends i<f> {
        public b() {
            super(f.this);
        }

        public View b(int i) {
            return f.this.findViewById(i);
        }

        public boolean c() {
            Window window = f.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public void h(e eVar) {
            f.this.j(eVar);
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            f.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater j() {
            return f.this.getLayoutInflater().cloneInContext(f.this);
        }

        public int k() {
            Window window = f.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        public boolean l() {
            return f.this.getWindow() != null;
        }

        public boolean m(e eVar) {
            return !f.this.isFinishing();
        }

        public void n(e eVar, Intent intent, int i, Bundle bundle) {
            f.this.n(eVar, intent, i, bundle);
        }

        public void o() {
            f.this.o();
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        Object f88a;

        /* renamed from: b  reason: collision with root package name */
        p f89b;
        l c;

        c() {
        }
    }

    private int d(e eVar) {
        if (this.k.k() < 65534) {
            while (this.k.g(this.j) >= 0) {
                this.j = (this.j + 1) % 65534;
            }
            int i2 = this.j;
            this.k.i(i2, eVar.f);
            this.j = (this.j + 1) % 65534;
            return i2;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void e(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void h() {
        do {
        } while (i(g(), c.b.CREATED));
    }

    private static boolean i(j jVar, c.b bVar) {
        boolean z = false;
        for (e next : jVar.d()) {
            if (next != null) {
                if (next.a().b().a(c.b.STARTED)) {
                    next.S.k(bVar);
                    z = true;
                }
                j v0 = next.v0();
                if (v0 != null) {
                    z |= i(v0, bVar);
                }
            }
        }
        return z;
    }

    public android.arch.lifecycle.c a() {
        return super.a();
    }

    public p c() {
        if (getApplication() != null) {
            if (this.d == null) {
                c cVar = (c) getLastNonConfigurationInstance();
                if (cVar != null) {
                    this.d = cVar.f89b;
                }
                if (this.d == null) {
                    this.d = new p();
                }
            }
            return this.d;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.e);
        printWriter.print(" mResumed=");
        printWriter.print(this.f);
        printWriter.print(" mStopped=");
        printWriter.print(this.g);
        if (getApplication() != null) {
            t.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.c.u().b(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    public final View f(View view, String str, Context context, AttributeSet attributeSet) {
        return this.c.w(view, str, context, attributeSet);
    }

    public j g() {
        return this.c.u();
    }

    public void j(e eVar) {
    }

    /* access modifiers changed from: protected */
    public boolean k(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.c.p();
    }

    public Object m() {
        return null;
    }

    public void n(e eVar, Intent intent, int i2, Bundle bundle) {
        this.i = true;
        if (i2 == -1) {
            try {
                a.e(this, intent, -1, bundle);
            } finally {
                this.i = false;
            }
        } else {
            e(i2);
            a.e(this, intent, ((d(eVar) + 1) << 16) + (i2 & 65535), bundle);
            this.i = false;
        }
    }

    @Deprecated
    public void o() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.c.v();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String e2 = this.k.e(i5);
            this.k.j(i5);
            if (e2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            e t = this.c.t(e2);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + e2);
                return;
            }
            t.Q(i2 & 65535, i3, intent);
            return;
        }
        a.C0006a d2 = a.d();
        if (d2 == null || !d2.a(this, i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        j u = this.c.u();
        boolean e2 = u.e();
        if (e2 && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (e2 || !u.f()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.v();
        this.c.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        p pVar;
        l lVar = null;
        this.c.a((e) null);
        super.onCreate(bundle);
        c cVar = (c) getLastNonConfigurationInstance();
        if (!(cVar == null || (pVar = cVar.f89b) == null || this.d != null)) {
            this.d = pVar;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            h hVar = this.c;
            if (cVar != null) {
                lVar = cVar.c;
            }
            hVar.x(parcelable, lVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.j = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.k = new i<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.k.i(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.k == null) {
            this.k = new i<>();
            this.j = 0;
        }
        this.c.f();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.c.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View f2 = f(view, str, context, attributeSet);
        return f2 == null ? super.onCreateView(view, str, context, attributeSet) : f2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View f2 = f((View) null, str, context, attributeSet);
        return f2 == null ? super.onCreateView(str, context, attributeSet) : f2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.d != null && !isChangingConfigurations()) {
            this.d.a();
        }
        this.c.h();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.c.i();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.c.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.c.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.c.j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.c.v();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.c.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f = false;
        if (this.f86b.hasMessages(2)) {
            this.f86b.removeMessages(2);
            l();
        }
        this.c.m();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.c.n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f86b.removeMessages(2);
        l();
        this.c.s();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return (i2 != 0 || menu == null) ? super.onPreparePanel(i2, view, menu) : k(view, menu) | this.c.o(menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.c.v();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String e2 = this.k.e(i4);
            this.k.j(i4);
            if (e2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            e t = this.c.t(e2);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + e2);
                return;
            }
            t.o0(i2 & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f86b.sendEmptyMessage(2);
        this.f = true;
        this.c.s();
    }

    public final Object onRetainNonConfigurationInstance() {
        Object m = m();
        l y = this.c.y();
        if (y == null && this.d == null && m == null) {
            return null;
        }
        c cVar = new c();
        cVar.f88a = m;
        cVar.f89b = this.d;
        cVar.c = y;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h();
        Parcelable z = this.c.z();
        if (z != null) {
            bundle.putParcelable("android:support:fragments", z);
        }
        if (this.k.k() > 0) {
            bundle.putInt("android:support:next_request_index", this.j);
            int[] iArr = new int[this.k.k()];
            String[] strArr = new String[this.k.k()];
            for (int i2 = 0; i2 < this.k.k(); i2++) {
                iArr[i2] = this.k.h(i2);
                strArr[i2] = this.k.l(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.g = false;
        if (!this.e) {
            this.e = true;
            this.c.c();
        }
        this.c.v();
        this.c.s();
        this.c.q();
    }

    public void onStateNotSaved() {
        this.c.v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.g = true;
        h();
        this.c.r();
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (!this.i && i2 != -1) {
            e(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (!this.i && i2 != -1) {
            e(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (!this.h && i2 != -1) {
            e(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (!this.h && i2 != -1) {
            e(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
