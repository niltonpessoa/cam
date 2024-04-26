package android.support.v4.app;

import a.b.b.b.h;
import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.c;
import android.arch.lifecycle.j;
import android.arch.lifecycle.p;
import android.arch.lifecycle.q;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

public class e implements ComponentCallbacks, View.OnCreateContextMenuListener, android.arch.lifecycle.e, q {
    private static final h<String, Class<?>> W = new h<>();
    static final Object X = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F = true;
    boolean G;
    ViewGroup H;
    View I;
    View J;
    boolean K;
    boolean L = true;
    d M;
    boolean N;
    boolean O;
    float P;
    LayoutInflater Q;
    boolean R;
    android.arch.lifecycle.f S = new android.arch.lifecycle.f(this);
    android.arch.lifecycle.f T;
    android.arch.lifecycle.e U;
    j<android.arch.lifecycle.e> V = new j<>();

    /* renamed from: a  reason: collision with root package name */
    int f79a = 0;

    /* renamed from: b  reason: collision with root package name */
    Bundle f80b;
    SparseArray<Parcelable> c;
    Boolean d;
    int e = -1;
    String f;
    Bundle g;
    e h;
    int i = -1;
    int j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    int q;
    k r;
    i s;
    k t;
    l u;
    p v;
    e w;
    int x;
    int y;
    String z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            e.this.b();
        }
    }

    class b extends g {
        b() {
        }

        public e a(Context context, String str, Bundle bundle) {
            return e.this.s.a(context, str, bundle);
        }

        public View b(int i) {
            View view = e.this.I;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        public boolean c() {
            return e.this.I != null;
        }
    }

    class c implements android.arch.lifecycle.e {
        c() {
        }

        public android.arch.lifecycle.c a() {
            e eVar = e.this;
            if (eVar.T == null) {
                eVar.T = new android.arch.lifecycle.f(eVar.U);
            }
            return e.this.T;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        View f84a;

        /* renamed from: b  reason: collision with root package name */
        Animator f85b;
        int c;
        int d;
        int e;
        int f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        v o;
        v p;
        boolean q;
        f r;
        boolean s;

        d() {
            Object obj = e.X;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
        }
    }

    /* renamed from: android.support.v4.app.e$e  reason: collision with other inner class name */
    public static class C0007e extends RuntimeException {
        public C0007e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public static e F(Context context, String str, Bundle bundle) {
        try {
            h<String, Class<?>> hVar = W;
            Class<?> cls = hVar.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                hVar.put(str, cls);
            }
            e eVar = (e) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(eVar.getClass().getClassLoader());
                eVar.W0(bundle);
            }
            return eVar;
        } catch (ClassNotFoundException e2) {
            throw new C0007e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0007e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new C0007e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new C0007e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new C0007e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    static boolean N(Context context, String str) {
        try {
            h<String, Class<?>> hVar = W;
            Class<?> cls = hVar.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                hVar.put(str, cls);
            }
            return e.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private d e() {
        if (this.M == null) {
            this.M = new d();
        }
        return this.M;
    }

    public Object A() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    /* access modifiers changed from: package-private */
    public boolean A0(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            Y(menu, menuInflater);
            z2 = true;
        }
        k kVar = this.t;
        return kVar != null ? z2 | kVar.w(menu, menuInflater) : z2;
    }

    public Object B() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == X ? A() : obj;
    }

    /* access modifiers changed from: package-private */
    public void B0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k kVar = this.t;
        if (kVar != null) {
            kVar.F0();
        }
        this.p = true;
        this.U = new c();
        this.T = null;
        View Z = Z(layoutInflater, viewGroup, bundle);
        this.I = Z;
        if (Z != null) {
            this.U.a();
            this.V.k(this.U);
        } else if (this.T == null) {
            this.U = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public int C() {
        d dVar = this.M;
        if (dVar == null) {
            return 0;
        }
        return dVar.c;
    }

    /* access modifiers changed from: package-private */
    public void C0() {
        this.S.i(c.a.ON_DESTROY);
        k kVar = this.t;
        if (kVar != null) {
            kVar.x();
        }
        this.f79a = 0;
        this.G = false;
        this.R = false;
        a0();
        if (this.G) {
            this.t = null;
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public View D() {
        return this.I;
    }

    /* access modifiers changed from: package-private */
    public void D0() {
        if (this.I != null) {
            this.T.i(c.a.ON_DESTROY);
        }
        k kVar = this.t;
        if (kVar != null) {
            kVar.y();
        }
        this.f79a = 1;
        this.G = false;
        c0();
        if (this.G) {
            t.b(this).c();
            this.p = false;
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void E() {
        this.e = -1;
        this.f = null;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.q = 0;
        this.r = null;
        this.t = null;
        this.s = null;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.B = false;
        this.D = false;
    }

    /* access modifiers changed from: package-private */
    public void E0() {
        this.G = false;
        d0();
        this.Q = null;
        if (this.G) {
            k kVar = this.t;
            if (kVar == null) {
                return;
            }
            if (this.D) {
                kVar.x();
                this.t = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new w("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater F0(Bundle bundle) {
        LayoutInflater e0 = e0(bundle);
        this.Q = e0;
        return e0;
    }

    /* access modifiers changed from: package-private */
    public void G() {
        if (this.s != null) {
            k kVar = new k();
            this.t = kVar;
            kVar.k(this.s, new b(), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    public void G0() {
        onLowMemory();
        k kVar = this.t;
        if (kVar != null) {
            kVar.z();
        }
    }

    public final boolean H() {
        return this.s != null && this.k;
    }

    /* access modifiers changed from: package-private */
    public void H0(boolean z2) {
        i0(z2);
        k kVar = this.t;
        if (kVar != null) {
            kVar.A(z2);
        }
    }

    public final boolean I() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean I0(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (this.E && this.F && j0(menuItem)) {
            return true;
        }
        k kVar = this.t;
        return kVar != null && kVar.P(menuItem);
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        d dVar = this.M;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    /* access modifiers changed from: package-private */
    public void J0(Menu menu) {
        if (!this.A) {
            if (this.E && this.F) {
                k0(menu);
            }
            k kVar = this.t;
            if (kVar != null) {
                kVar.Q(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean K() {
        return this.q > 0;
    }

    /* access modifiers changed from: package-private */
    public void K0() {
        if (this.I != null) {
            this.T.i(c.a.ON_PAUSE);
        }
        this.S.i(c.a.ON_PAUSE);
        k kVar = this.t;
        if (kVar != null) {
            kVar.R();
        }
        this.f79a = 3;
        this.G = false;
        l0();
        if (!this.G) {
            throw new w("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean L() {
        d dVar = this.M;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    /* access modifiers changed from: package-private */
    public void L0(boolean z2) {
        m0(z2);
        k kVar = this.t;
        if (kVar != null) {
            kVar.S(z2);
        }
    }

    public final boolean M() {
        k kVar = this.r;
        if (kVar == null) {
            return false;
        }
        return kVar.e();
    }

    /* access modifiers changed from: package-private */
    public boolean M0(Menu menu) {
        boolean z2 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            n0(menu);
            z2 = true;
        }
        k kVar = this.t;
        return kVar != null ? z2 | kVar.T(menu) : z2;
    }

    /* access modifiers changed from: package-private */
    public void N0() {
        k kVar = this.t;
        if (kVar != null) {
            kVar.F0();
            this.t.c0();
        }
        this.f79a = 4;
        this.G = false;
        p0();
        if (this.G) {
            k kVar2 = this.t;
            if (kVar2 != null) {
                kVar2.U();
                this.t.c0();
            }
            android.arch.lifecycle.f fVar = this.S;
            c.a aVar = c.a.ON_RESUME;
            fVar.i(aVar);
            if (this.I != null) {
                this.T.i(aVar);
                return;
            }
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void O() {
        k kVar = this.t;
        if (kVar != null) {
            kVar.F0();
        }
    }

    /* access modifiers changed from: package-private */
    public void O0(Bundle bundle) {
        Parcelable R0;
        q0(bundle);
        k kVar = this.t;
        if (kVar != null && (R0 = kVar.R0()) != null) {
            bundle.putParcelable("android:support:fragments", R0);
        }
    }

    public void P(Bundle bundle) {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void P0() {
        k kVar = this.t;
        if (kVar != null) {
            kVar.F0();
            this.t.c0();
        }
        this.f79a = 3;
        this.G = false;
        r0();
        if (this.G) {
            k kVar2 = this.t;
            if (kVar2 != null) {
                kVar2.V();
            }
            android.arch.lifecycle.f fVar = this.S;
            c.a aVar = c.a.ON_START;
            fVar.i(aVar);
            if (this.I != null) {
                this.T.i(aVar);
                return;
            }
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onStart()");
    }

    public void Q(int i2, int i3, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public void Q0() {
        if (this.I != null) {
            this.T.i(c.a.ON_STOP);
        }
        this.S.i(c.a.ON_STOP);
        k kVar = this.t;
        if (kVar != null) {
            kVar.X();
        }
        this.f79a = 2;
        this.G = false;
        s0();
        if (!this.G) {
            throw new w("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    @Deprecated
    public void R(Activity activity) {
        this.G = true;
    }

    public final Context R0() {
        Context m2 = m();
        if (m2 != null) {
            return m2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void S(Context context) {
        this.G = true;
        i iVar = this.s;
        Activity d2 = iVar == null ? null : iVar.d();
        if (d2 != null) {
            this.G = false;
            R(d2);
        }
    }

    /* access modifiers changed from: package-private */
    public void S0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.t == null) {
                G();
            }
            this.t.O0(parcelable, this.u);
            this.u = null;
            this.t.v();
        }
    }

    public void T(e eVar) {
    }

    /* access modifiers changed from: package-private */
    public final void T0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.c;
        if (sparseArray != null) {
            this.J.restoreHierarchyState(sparseArray);
            this.c = null;
        }
        this.G = false;
        u0(bundle);
        if (!this.G) {
            throw new w("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.I != null) {
            this.T.i(c.a.ON_CREATE);
        }
    }

    public boolean U(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void U0(View view) {
        e().f84a = view;
    }

    public void V(Bundle bundle) {
        this.G = true;
        S0(bundle);
        k kVar = this.t;
        if (kVar != null && !kVar.s0(1)) {
            this.t.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void V0(Animator animator) {
        e().f85b = animator;
    }

    public Animation W(int i2, boolean z2, int i3) {
        return null;
    }

    public void W0(Bundle bundle) {
        if (this.e < 0 || !M()) {
            this.g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public Animator X(int i2, boolean z2, int i3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void X0(boolean z2) {
        e().s = z2;
    }

    public void Y(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public final void Y0(int i2, e eVar) {
        StringBuilder sb;
        String str;
        this.e = i2;
        if (eVar != null) {
            sb.append(eVar.f);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.e);
        this.f = sb.toString();
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void Z0(boolean z2) {
        if (this.F != z2) {
            this.F = z2;
            if (this.E && H() && !I()) {
                this.s.o();
            }
        }
    }

    public android.arch.lifecycle.c a() {
        return this.S;
    }

    public void a0() {
        boolean z2 = true;
        this.G = true;
        f g2 = g();
        if (g2 == null || !g2.isChangingConfigurations()) {
            z2 = false;
        }
        p pVar = this.v;
        if (pVar != null && !z2) {
            pVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a1(int i2) {
        if (this.M != null || i2 != 0) {
            e().d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        d dVar = this.M;
        f fVar = null;
        if (dVar != null) {
            dVar.q = false;
            f fVar2 = dVar.r;
            dVar.r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public void b0() {
    }

    /* access modifiers changed from: package-private */
    public void b1(int i2, int i3) {
        if (this.M != null || i2 != 0 || i3 != 0) {
            e();
            d dVar = this.M;
            dVar.e = i2;
            dVar.f = i3;
        }
    }

    public p c() {
        if (m() != null) {
            if (this.v == null) {
                this.v = new p();
            }
            return this.v;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void c0() {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void c1(f fVar) {
        e();
        d dVar = this.M;
        f fVar2 = dVar.r;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                if (dVar.q) {
                    dVar.r = fVar;
                }
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f79a);
        printWriter.print(" mIndex=");
        printWriter.print(this.e);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mRetaining=");
        printWriter.print(this.D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.r);
        }
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.s);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.w);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.f80b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f80b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.h);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(u());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.I);
        }
        if (j() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(j());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(C());
        }
        if (m() != null) {
            t.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.t + ":");
            k kVar = this.t;
            kVar.b(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void d0() {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void d1(int i2) {
        e().c = i2;
    }

    public LayoutInflater e0(Bundle bundle) {
        return t(bundle);
    }

    public void e1(boolean z2) {
        if (!this.L && z2 && this.f79a < 3 && this.r != null && H() && this.R) {
            this.r.G0(this);
        }
        this.L = z2;
        this.K = this.f79a < 3 && !z2;
        if (this.f80b != null) {
            this.d = Boolean.valueOf(z2);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public e f(String str) {
        if (str.equals(this.f)) {
            return this;
        }
        k kVar = this.t;
        if (kVar != null) {
            return kVar.i0(str);
        }
        return null;
    }

    public void f0(boolean z2) {
    }

    public void f1(Intent intent) {
        g1(intent, (Bundle) null);
    }

    public final f g() {
        i iVar = this.s;
        if (iVar == null) {
            return null;
        }
        return (f) iVar.d();
    }

    @Deprecated
    public void g0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    public void g1(Intent intent, Bundle bundle) {
        i iVar = this.s;
        if (iVar != null) {
            iVar.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public boolean h() {
        Boolean bool;
        d dVar = this.M;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void h0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        i iVar = this.s;
        Activity d2 = iVar == null ? null : iVar.d();
        if (d2 != null) {
            this.G = false;
            g0(d2, attributeSet, bundle);
        }
    }

    public void h1(Intent intent, int i2) {
        i1(intent, i2, (Bundle) null);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean i() {
        Boolean bool;
        d dVar = this.M;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void i0(boolean z2) {
    }

    public void i1(Intent intent, int i2, Bundle bundle) {
        i iVar = this.s;
        if (iVar != null) {
            iVar.n(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public View j() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        return dVar.f84a;
    }

    public boolean j0(MenuItem menuItem) {
        return false;
    }

    public void j1() {
        k kVar = this.r;
        if (kVar == null || kVar.m == null) {
            e().q = false;
        } else if (Looper.myLooper() != this.r.m.g().getLooper()) {
            this.r.m.g().postAtFrontOfQueue(new a());
        } else {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public Animator k() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        return dVar.f85b;
    }

    public void k0(Menu menu) {
    }

    public final j l() {
        if (this.t == null) {
            G();
            int i2 = this.f79a;
            if (i2 >= 4) {
                this.t.U();
            } else if (i2 >= 3) {
                this.t.V();
            } else if (i2 >= 2) {
                this.t.s();
            } else if (i2 >= 1) {
                this.t.v();
            }
        }
        return this.t;
    }

    public void l0() {
        this.G = true;
    }

    public Context m() {
        i iVar = this.s;
        if (iVar == null) {
            return null;
        }
        return iVar.e();
    }

    public void m0(boolean z2) {
    }

    public Object n() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        return dVar.g;
    }

    public void n0(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    public v o() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    public void o0(int i2, String[] strArr, int[] iArr) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        g().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.G = true;
    }

    public Object p() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    public void p0() {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public v q() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        return dVar.p;
    }

    public void q0(Bundle bundle) {
    }

    public final j r() {
        return this.r;
    }

    public void r0() {
        this.G = true;
    }

    public final LayoutInflater s() {
        LayoutInflater layoutInflater = this.Q;
        return layoutInflater == null ? F0((Bundle) null) : layoutInflater;
    }

    public void s0() {
        this.G = true;
    }

    @Deprecated
    public LayoutInflater t(Bundle bundle) {
        i iVar = this.s;
        if (iVar != null) {
            LayoutInflater j2 = iVar.j();
            l();
            k kVar = this.t;
            kVar.p0();
            android.support.v4.view.d.b(j2, kVar);
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void t0(View view, Bundle bundle) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.b.b.b.d.a(this, sb);
        if (this.e >= 0) {
            sb.append(" #");
            sb.append(this.e);
        }
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" ");
            sb.append(this.z);
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public int u() {
        d dVar = this.M;
        if (dVar == null) {
            return 0;
        }
        return dVar.d;
    }

    public void u0(Bundle bundle) {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public int v() {
        d dVar = this.M;
        if (dVar == null) {
            return 0;
        }
        return dVar.e;
    }

    /* access modifiers changed from: package-private */
    public j v0() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public int w() {
        d dVar = this.M;
        if (dVar == null) {
            return 0;
        }
        return dVar.f;
    }

    /* access modifiers changed from: package-private */
    public void w0(Bundle bundle) {
        k kVar = this.t;
        if (kVar != null) {
            kVar.F0();
        }
        this.f79a = 2;
        this.G = false;
        P(bundle);
        if (this.G) {
            k kVar2 = this.t;
            if (kVar2 != null) {
                kVar2.s();
                return;
            }
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object x() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == X ? p() : obj;
    }

    /* access modifiers changed from: package-private */
    public void x0(Configuration configuration) {
        onConfigurationChanged(configuration);
        k kVar = this.t;
        if (kVar != null) {
            kVar.t(configuration);
        }
    }

    public final Resources y() {
        return R0().getResources();
    }

    /* access modifiers changed from: package-private */
    public boolean y0(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (U(menuItem)) {
            return true;
        }
        k kVar = this.t;
        return kVar != null && kVar.u(menuItem);
    }

    public Object z() {
        d dVar = this.M;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.h;
        return obj == X ? n() : obj;
    }

    /* access modifiers changed from: package-private */
    public void z0(Bundle bundle) {
        k kVar = this.t;
        if (kVar != null) {
            kVar.F0();
        }
        this.f79a = 1;
        this.G = false;
        V(bundle);
        this.R = true;
        if (this.G) {
            this.S.i(c.a.ON_CREATE);
            return;
        }
        throw new w("Fragment " + this + " did not call through to super.onCreate()");
    }
}
