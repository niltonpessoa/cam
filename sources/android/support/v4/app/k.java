package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.p;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.e;
import android.support.v4.app.j;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class k extends j implements LayoutInflater.Factory2 {
    static boolean E = false;
    static Field F;
    static final Interpolator G = new DecelerateInterpolator(2.5f);
    static final Interpolator H = new DecelerateInterpolator(1.5f);
    SparseArray<Parcelable> A = null;
    ArrayList<m> B;
    l C;
    Runnable D = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<l> f93a;

    /* renamed from: b  reason: collision with root package name */
    boolean f94b;
    int c = 0;
    final ArrayList<e> d = new ArrayList<>();
    SparseArray<e> e;
    ArrayList<b> f;
    ArrayList<e> g;
    ArrayList<b> h;
    ArrayList<Integer> i;
    ArrayList<j.b> j;
    private final CopyOnWriteArrayList<j> k = new CopyOnWriteArrayList<>();
    int l = 0;
    i m;
    g n;
    e o;
    e p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    ArrayList<b> w;
    ArrayList<Boolean> x;
    ArrayList<e> y;
    Bundle z = null;

    class a implements Runnable {
        a() {
        }

        public void run() {
            k.this.c0();
        }
    }

    class b extends f {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f96b;
        final /* synthetic */ e c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.c.j() != null) {
                    b.this.c.U0((View) null);
                    b bVar = b.this;
                    k kVar = k.this;
                    e eVar = bVar.c;
                    kVar.E0(eVar, eVar.C(), 0, 0, false);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Animation.AnimationListener animationListener, ViewGroup viewGroup, e eVar) {
            super(animationListener);
            this.f96b = viewGroup;
            this.c = eVar;
        }

        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f96b.post(new a());
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f98a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f99b;
        final /* synthetic */ e c;

        c(ViewGroup viewGroup, View view, e eVar) {
            this.f98a = viewGroup;
            this.f99b = view;
            this.c = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f98a.endViewTransition(this.f99b);
            Animator k = this.c.k();
            this.c.V0((Animator) null);
            if (k != null && this.f98a.indexOfChild(this.f99b) < 0) {
                k kVar = k.this;
                e eVar = this.c;
                kVar.E0(eVar, eVar.C(), 0, 0, false);
            }
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f101b;
        final /* synthetic */ e c;

        d(k kVar, ViewGroup viewGroup, View view, e eVar) {
            this.f100a = viewGroup;
            this.f101b = view;
            this.c = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f100a.endViewTransition(this.f101b);
            animator.removeListener(this);
            View view = this.c.I;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    private static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        View f102b;

        class a implements Runnable {
            a() {
            }

            public void run() {
                e.this.f102b.setLayerType(0, (Paint) null);
            }
        }

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f102b = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (android.support.v4.view.g.g(this.f102b) || Build.VERSION.SDK_INT >= 24) {
                this.f102b.post(new a());
            } else {
                this.f102b.setLayerType(0, (Paint) null);
            }
            super.onAnimationEnd(animation);
        }
    }

    private static class f implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final Animation.AnimationListener f104a;

        f(Animation.AnimationListener animationListener) {
            this.f104a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f104a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f104a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f104a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f105a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f106b;

        g(Animator animator) {
            this.f105a = null;
            this.f106b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f105a = animation;
            this.f106b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        View f107a;

        h(View view) {
            this.f107a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f107a.setLayerType(0, (Paint) null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f107a.setLayerType(2, (Paint) null);
        }
    }

    private static class i extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f108a;

        /* renamed from: b  reason: collision with root package name */
        private final View f109b;
        private boolean c;
        private boolean d;
        private boolean e = true;

        i(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f108a = viewGroup;
            this.f109b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.c = true;
                u.a(this.f108a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.c = true;
                u.a(this.f108a, this);
            }
            return true;
        }

        public void run() {
            if (this.c || !this.e) {
                this.f108a.endViewTransition(this.f109b);
                this.d = true;
                return;
            }
            this.e = false;
            this.f108a.post(this);
        }
    }

    private static final class j {

        /* renamed from: a  reason: collision with root package name */
        final j.a f110a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f111b;
    }

    /* renamed from: android.support.v4.app.k$k  reason: collision with other inner class name */
    static class C0008k {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f112a = {16842755, 16842960, 16842961};
    }

    interface l {
        boolean a(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2);
    }

    static class m implements e.f {

        /* renamed from: a  reason: collision with root package name */
        final boolean f113a;

        /* renamed from: b  reason: collision with root package name */
        final b f114b;
        private int c;

        m(b bVar, boolean z) {
            this.f113a = z;
            this.f114b = bVar;
        }

        public void a() {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.f114b.f71a.V0();
            }
        }

        public void b() {
            this.c++;
        }

        public void c() {
            b bVar = this.f114b;
            bVar.f71a.p(bVar, this.f113a, false, false);
        }

        public void d() {
            boolean z = this.c > 0;
            k kVar = this.f114b.f71a;
            int size = kVar.d.size();
            for (int i = 0; i < size; i++) {
                e eVar = kVar.d.get(i);
                eVar.c1((e.f) null);
                if (z && eVar.L()) {
                    eVar.j1();
                }
            }
            b bVar = this.f114b;
            bVar.f71a.p(bVar, this.f113a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    k() {
    }

    static boolean A0(g gVar) {
        Animation animation = gVar.f105a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return z0(gVar.f106b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private boolean H0(String str, int i2, int i3) {
        j v0;
        c0();
        a0(true);
        e eVar = this.p;
        if (eVar != null && i2 < 0 && str == null && (v0 = eVar.v0()) != null && v0.f()) {
            return true;
        }
        boolean I0 = I0(this.w, this.x, str, i2, i3);
        if (I0) {
            this.f94b = true;
            try {
                M0(this.w, this.x);
            } finally {
                o();
            }
        }
        Y();
        m();
        return I0;
    }

    private int J0(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.b.b.b.b<e> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            b bVar2 = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (bVar2.s() && !bVar2.q(arrayList, i5 + 1, i3)) {
                if (this.B == null) {
                    this.B = new ArrayList<>();
                }
                m mVar = new m(bVar2, booleanValue);
                this.B.add(mVar);
                bVar2.u(mVar);
                if (booleanValue) {
                    bVar2.l();
                } else {
                    bVar2.m(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, bVar2);
                }
                g(bVar);
            }
        }
        return i4;
    }

    private void M0(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            g0(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).s) {
                    if (i3 != i2) {
                        f0(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).s) {
                            i3++;
                        }
                    }
                    f0(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                f0(arrayList, arrayList2, i3, size);
            }
        }
    }

    public static int Q0(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    private void W(int i2) {
        try {
            this.f94b = true;
            C0(i2, false);
            this.f94b = false;
            c0();
        } catch (Throwable th) {
            this.f94b = false;
            throw th;
        }
    }

    private static void X0(View view, g gVar) {
        if (view != null && gVar != null && a1(view, gVar)) {
            Animator animator = gVar.f106b;
            if (animator != null) {
                animator.addListener(new h(view));
                return;
            }
            Animation.AnimationListener n0 = n0(gVar.f105a);
            view.setLayerType(2, (Paint) null);
            gVar.f105a.setAnimationListener(new e(view, n0));
        }
    }

    private void Z() {
        SparseArray<e> sparseArray = this.e;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            e valueAt = this.e.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.j() != null) {
                    int C2 = valueAt.C();
                    View j2 = valueAt.j();
                    Animation animation = j2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        j2.clearAnimation();
                    }
                    valueAt.U0((View) null);
                    E0(valueAt, C2, 0, 0, false);
                } else if (valueAt.k() != null) {
                    valueAt.k().end();
                }
            }
        }
    }

    private static void Z0(l lVar) {
        if (lVar != null) {
            List<e> b2 = lVar.b();
            if (b2 != null) {
                for (e eVar : b2) {
                    eVar.D = true;
                }
            }
            List<l> a2 = lVar.a();
            if (a2 != null) {
                for (l Z0 : a2) {
                    Z0(Z0);
                }
            }
        }
    }

    private void a0(boolean z2) {
        if (this.f94b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.m.g().getLooper()) {
            if (!z2) {
                n();
            }
            if (this.w == null) {
                this.w = new ArrayList<>();
                this.x = new ArrayList<>();
            }
            this.f94b = true;
            try {
                g0((ArrayList<b>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f94b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    static boolean a1(View view, g gVar) {
        return view != null && gVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && android.support.v4.view.g.f(view) && A0(gVar);
    }

    private void d1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a.b.b.b.e("FragmentManager"));
        i iVar = this.m;
        if (iVar != null) {
            try {
                iVar.i("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            b("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    private static void e0(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            b bVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                bVar.g(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                bVar.m(z2);
            } else {
                bVar.g(1);
                bVar.l();
            }
            i2++;
        }
    }

    public static int e1(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private void f0(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        ArrayList<b> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i6 = i2;
        int i7 = i3;
        boolean z2 = arrayList3.get(i6).s;
        ArrayList<e> arrayList5 = this.y;
        if (arrayList5 == null) {
            this.y = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.y.addAll(this.d);
        e q0 = q0();
        boolean z3 = false;
        for (int i8 = i6; i8 < i7; i8++) {
            b bVar = arrayList3.get(i8);
            q0 = !arrayList4.get(i8).booleanValue() ? bVar.n(this.y, q0) : bVar.v(this.y, q0);
            z3 = z3 || bVar.i;
        }
        this.y.clear();
        if (!z2) {
            q.C(this, arrayList, arrayList2, i2, i3, false);
        }
        e0(arrayList, arrayList2, i2, i3);
        if (z2) {
            a.b.b.b.b bVar2 = new a.b.b.b.b();
            g(bVar2);
            int J0 = J0(arrayList, arrayList2, i2, i3, bVar2);
            y0(bVar2);
            i4 = J0;
        } else {
            i4 = i7;
        }
        if (i4 != i6 && z2) {
            q.C(this, arrayList, arrayList2, i2, i4, true);
            C0(this.l, true);
        }
        while (i6 < i7) {
            b bVar3 = arrayList3.get(i6);
            if (arrayList4.get(i6).booleanValue() && (i5 = bVar3.l) >= 0) {
                l0(i5);
                bVar3.l = -1;
            }
            bVar3.t();
            i6++;
        }
        if (z3) {
            N0();
        }
    }

    private void g(a.b.b.b.b<e> bVar) {
        int i2 = this.l;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar = this.d.get(i3);
                if (eVar.f79a < min) {
                    E0(eVar, min, eVar.u(), eVar.v(), false);
                    if (eVar.I != null && !eVar.A && eVar.N) {
                        bVar.add(eVar);
                    }
                }
            }
        }
    }

    private void g0(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.B;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.B.get(i2);
            if (arrayList == null || mVar.f113a || (indexOf2 = arrayList.indexOf(mVar.f114b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f114b.q(arrayList, 0, arrayList.size()))) {
                    this.B.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || mVar.f113a || (indexOf = arrayList.indexOf(mVar.f114b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.d();
                    }
                }
                i2++;
            }
            mVar.c();
            i2++;
        }
    }

    private void j(e eVar, g gVar, int i2) {
        View view = eVar.I;
        ViewGroup viewGroup = eVar.H;
        viewGroup.startViewTransition(view);
        eVar.d1(i2);
        if (gVar.f105a != null) {
            i iVar = new i(gVar.f105a, viewGroup, view);
            eVar.U0(eVar.I);
            iVar.setAnimationListener(new b(n0(iVar), viewGroup, eVar));
            X0(view, gVar);
            eVar.I.startAnimation(iVar);
            return;
        }
        Animator animator = gVar.f106b;
        eVar.V0(animator);
        animator.addListener(new c(viewGroup, view, eVar));
        animator.setTarget(eVar.I);
        X0(eVar.I, gVar);
        animator.start();
    }

    private e j0(e eVar) {
        ViewGroup viewGroup = eVar.H;
        View view = eVar.I;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.d.indexOf(eVar) - 1; indexOf >= 0; indexOf--) {
                e eVar2 = this.d.get(indexOf);
                if (eVar2.H == viewGroup && eVar2.I != null) {
                    return eVar2;
                }
            }
        }
        return null;
    }

    private void k0() {
        if (this.B != null) {
            while (!this.B.isEmpty()) {
                this.B.remove(0).d();
            }
        }
    }

    private void m() {
        SparseArray<e> sparseArray = this.e;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.e.valueAt(size) == null) {
                    SparseArray<e> sparseArray2 = this.e;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m0(java.util.ArrayList<android.support.v4.app.b> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.k$l> r0 = r4.f93a     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000d
            goto L_0x0038
        L_0x000d:
            java.util.ArrayList<android.support.v4.app.k$l> r0 = r4.f93a     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = 0
        L_0x0014:
            if (r1 >= r0) goto L_0x0026
            java.util.ArrayList<android.support.v4.app.k$l> r3 = r4.f93a     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            android.support.v4.app.k$l r3 = (android.support.v4.app.k.l) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.a(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0026:
            java.util.ArrayList<android.support.v4.app.k$l> r5 = r4.f93a     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            android.support.v4.app.i r5 = r4.m     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.g()     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.D     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003d:
            throw r5
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.k.m0(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private void n() {
        if (e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.u);
        }
    }

    private static Animation.AnimationListener n0(Animation animation) {
        String str;
        try {
            if (F == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                F = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) F.get(animation);
        } catch (NoSuchFieldException e2) {
            e = e2;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    private void o() {
        this.f94b = false;
        this.x.clear();
        this.w.clear();
    }

    static g v0(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(H);
        alphaAnimation.setDuration(220);
        return new g((Animation) alphaAnimation);
    }

    static g x0(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(G);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(H);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new g((Animation) animationSet);
    }

    private void y0(a.b.b.b.b<e> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            e h2 = bVar.h(i2);
            if (!h2.k) {
                View D2 = h2.D();
                h2.P = D2.getAlpha();
                D2.setAlpha(0.0f);
            }
        }
    }

    static boolean z0(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (z0(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void A(boolean z2) {
        int size = this.d.size();
        while (true) {
            size--;
            if (size >= 0) {
                e eVar = this.d.get(size);
                if (eVar != null) {
                    eVar.H0(z2);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B(e eVar, Bundle bundle, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).B(eVar, bundle, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.a(this, eVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = r0.I;
        r1 = r11.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B0(android.support.v4.app.e r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.l
            boolean r1 = r11.l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r11.K()
            if (r1 == 0) goto L_0x0016
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x001a
        L_0x0016:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x001a:
            r6 = r0
            int r7 = r11.v()
            int r8 = r11.w()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.E0(r5, r6, r7, r8, r9)
            android.view.View r0 = r11.I
            if (r0 == 0) goto L_0x008c
            android.support.v4.app.e r0 = r10.j0(r11)
            if (r0 == 0) goto L_0x004b
            android.view.View r0 = r0.I
            android.view.ViewGroup r1 = r11.H
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.I
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x004b
            r1.removeViewAt(r4)
            android.view.View r4 = r11.I
            r1.addView(r4, r0)
        L_0x004b:
            boolean r0 = r11.N
            if (r0 == 0) goto L_0x008c
            android.view.ViewGroup r0 = r11.H
            if (r0 == 0) goto L_0x008c
            float r0 = r11.P
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            android.view.View r4 = r11.I
            r4.setAlpha(r0)
        L_0x005f:
            r11.P = r1
            r11.N = r3
            int r0 = r11.v()
            int r1 = r11.w()
            android.support.v4.app.k$g r0 = r10.t0(r11, r0, r2, r1)
            if (r0 == 0) goto L_0x008c
            android.view.View r1 = r11.I
            X0(r1, r0)
            android.view.animation.Animation r1 = r0.f105a
            if (r1 == 0) goto L_0x0080
            android.view.View r0 = r11.I
            r0.startAnimation(r1)
            goto L_0x008c
        L_0x0080:
            android.animation.Animator r1 = r0.f106b
            android.view.View r2 = r11.I
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f106b
            r0.start()
        L_0x008c:
            boolean r0 = r11.O
            if (r0 == 0) goto L_0x0093
            r10.q(r11)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.k.B0(android.support.v4.app.e):void");
    }

    /* access modifiers changed from: package-private */
    public void C(e eVar, Context context, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).C(eVar, context, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.b(this, eVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C0(int i2, boolean z2) {
        i iVar;
        if (this.m == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.l) {
            this.l = i2;
            if (this.e != null) {
                int size = this.d.size();
                for (int i3 = 0; i3 < size; i3++) {
                    B0(this.d.get(i3));
                }
                int size2 = this.e.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    e valueAt = this.e.valueAt(i4);
                    if (valueAt != null && ((valueAt.l || valueAt.B) && !valueAt.N)) {
                        B0(valueAt);
                    }
                }
                c1();
                if (this.q && (iVar = this.m) != null && this.l == 4) {
                    iVar.o();
                    this.q = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D(e eVar, Bundle bundle, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).D(eVar, bundle, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.c(this, eVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D0(e eVar) {
        E0(eVar, this.l, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    public void E(e eVar, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).E(eVar, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.d(this, eVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r0 != 3) goto L_0x0418;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E0(android.support.v4.app.e r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7.k
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.B
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r18
            goto L_0x0016
        L_0x0011:
            r0 = r18
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.l
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f79a
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r17.K()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f79a
        L_0x002a:
            boolean r1 = r7.K
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.f79a
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = 2
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.f79a
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x02d6
            boolean r0 = r7.m
            if (r0 == 0) goto L_0x004a
            boolean r0 = r7.n
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            android.view.View r0 = r17.j()
            if (r0 != 0) goto L_0x0056
            android.animation.Animator r0 = r17.k()
            if (r0 == 0) goto L_0x006a
        L_0x0056:
            r7.U0(r14)
            r7.V0(r14)
            int r2 = r17.C()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r0.E0(r1, r2, r3, r4, r5)
        L_0x006a:
            int r0 = r7.f79a
            if (r0 == 0) goto L_0x0076
            if (r0 == r8) goto L_0x019e
            if (r0 == r10) goto L_0x0290
            if (r0 == r9) goto L_0x02b0
            goto L_0x0418
        L_0x0076:
            if (r11 <= 0) goto L_0x019e
            boolean r0 = E
            if (r0 == 0) goto L_0x0090
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0090:
            android.os.Bundle r0 = r7.f80b
            if (r0 == 0) goto L_0x00e1
            android.support.v4.app.i r1 = r6.m
            android.content.Context r1 = r1.e()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f80b
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.c = r0
            android.os.Bundle r0 = r7.f80b
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.e r0 = r6.o0(r0, r1)
            r7.h = r0
            if (r0 == 0) goto L_0x00c1
            android.os.Bundle r0 = r7.f80b
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.j = r0
        L_0x00c1:
            java.lang.Boolean r0 = r7.d
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r0.booleanValue()
            r7.L = r0
            r7.d = r14
            goto L_0x00d8
        L_0x00ce:
            android.os.Bundle r0 = r7.f80b
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.L = r0
        L_0x00d8:
            boolean r0 = r7.L
            if (r0 != 0) goto L_0x00e1
            r7.K = r8
            if (r11 <= r10) goto L_0x00e1
            r11 = 2
        L_0x00e1:
            android.support.v4.app.i r0 = r6.m
            r7.s = r0
            android.support.v4.app.e r1 = r6.o
            r7.w = r1
            if (r1 == 0) goto L_0x00ee
            android.support.v4.app.k r0 = r1.t
            goto L_0x00f2
        L_0x00ee:
            android.support.v4.app.k r0 = r0.f()
        L_0x00f2:
            r7.r = r0
            android.support.v4.app.e r0 = r7.h
            java.lang.String r15 = "Fragment "
            if (r0 == 0) goto L_0x0138
            android.util.SparseArray<android.support.v4.app.e> r1 = r6.e
            int r0 = r0.e
            java.lang.Object r0 = r1.get(r0)
            android.support.v4.app.e r1 = r7.h
            if (r0 != r1) goto L_0x0114
            int r0 = r1.f79a
            if (r0 >= r8) goto L_0x0138
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.E0(r1, r2, r3, r4, r5)
            goto L_0x0138
        L_0x0114:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.e r2 = r7.h
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0138:
            android.support.v4.app.i r0 = r6.m
            android.content.Context r0 = r0.e()
            r6.H(r7, r0, r13)
            r7.G = r13
            android.support.v4.app.i r0 = r6.m
            android.content.Context r0 = r0.e()
            r7.S(r0)
            boolean r0 = r7.G
            if (r0 == 0) goto L_0x0184
            android.support.v4.app.e r0 = r7.w
            if (r0 != 0) goto L_0x015a
            android.support.v4.app.i r0 = r6.m
            r0.h(r7)
            goto L_0x015d
        L_0x015a:
            r0.T(r7)
        L_0x015d:
            android.support.v4.app.i r0 = r6.m
            android.content.Context r0 = r0.e()
            r6.C(r7, r0, r13)
            boolean r0 = r7.R
            if (r0 != 0) goto L_0x017a
            android.os.Bundle r0 = r7.f80b
            r6.I(r7, r0, r13)
            android.os.Bundle r0 = r7.f80b
            r7.z0(r0)
            android.os.Bundle r0 = r7.f80b
            r6.D(r7, r0, r13)
            goto L_0x0181
        L_0x017a:
            android.os.Bundle r0 = r7.f80b
            r7.S0(r0)
            r7.f79a = r8
        L_0x0181:
            r7.D = r13
            goto L_0x019e
        L_0x0184:
            android.support.v4.app.w r0 = new android.support.v4.app.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019e:
            r16.b0(r17)
            if (r11 <= r8) goto L_0x0290
            boolean r0 = E
            if (r0 == 0) goto L_0x01bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x01bb:
            boolean r0 = r7.m
            if (r0 != 0) goto L_0x027b
            int r0 = r7.y
            if (r0 == 0) goto L_0x0231
            r1 = -1
            if (r0 == r1) goto L_0x0212
            android.support.v4.app.g r1 = r6.n
            android.view.View r0 = r1.b(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0232
            boolean r1 = r7.o
            if (r1 == 0) goto L_0x01d5
            goto L_0x0232
        L_0x01d5:
            android.content.res.Resources r0 = r17.y()     // Catch:{ NotFoundException -> 0x01e0 }
            int r1 = r7.y     // Catch:{ NotFoundException -> 0x01e0 }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x01e0 }
            goto L_0x01e2
        L_0x01e0:
            java.lang.String r0 = "unknown"
        L_0x01e2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.y
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.d1(r1)
            throw r14
        L_0x0212:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.d1(r0)
            throw r14
        L_0x0231:
            r0 = r14
        L_0x0232:
            r7.H = r0
            android.os.Bundle r1 = r7.f80b
            android.view.LayoutInflater r1 = r7.F0(r1)
            android.os.Bundle r2 = r7.f80b
            r7.B0(r1, r0, r2)
            android.view.View r1 = r7.I
            if (r1 == 0) goto L_0x0279
            r7.J = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x024f
            android.view.View r1 = r7.I
            r0.addView(r1)
        L_0x024f:
            boolean r0 = r7.A
            if (r0 == 0) goto L_0x025a
            android.view.View r0 = r7.I
            r1 = 8
            r0.setVisibility(r1)
        L_0x025a:
            android.view.View r0 = r7.I
            android.os.Bundle r1 = r7.f80b
            r7.t0(r0, r1)
            android.view.View r0 = r7.I
            android.os.Bundle r1 = r7.f80b
            r6.N(r7, r0, r1, r13)
            android.view.View r0 = r7.I
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0275
            android.view.ViewGroup r0 = r7.H
            if (r0 == 0) goto L_0x0275
            goto L_0x0276
        L_0x0275:
            r8 = 0
        L_0x0276:
            r7.N = r8
            goto L_0x027b
        L_0x0279:
            r7.J = r14
        L_0x027b:
            android.os.Bundle r0 = r7.f80b
            r7.w0(r0)
            android.os.Bundle r0 = r7.f80b
            r6.B(r7, r0, r13)
            android.view.View r0 = r7.I
            if (r0 == 0) goto L_0x028e
            android.os.Bundle r0 = r7.f80b
            r7.T0(r0)
        L_0x028e:
            r7.f80b = r14
        L_0x0290:
            if (r11 <= r10) goto L_0x02b0
            boolean r0 = E
            if (r0 == 0) goto L_0x02aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02aa:
            r17.P0()
            r6.L(r7, r13)
        L_0x02b0:
            if (r11 <= r9) goto L_0x0418
            boolean r0 = E
            if (r0 == 0) goto L_0x02ca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02ca:
            r17.N0()
            r6.J(r7, r13)
            r7.f80b = r14
            r7.c = r14
            goto L_0x0418
        L_0x02d6:
            if (r0 <= r11) goto L_0x0418
            if (r0 == r8) goto L_0x03a4
            if (r0 == r10) goto L_0x0323
            if (r0 == r9) goto L_0x0303
            r1 = 4
            if (r0 == r1) goto L_0x02e3
            goto L_0x0418
        L_0x02e3:
            if (r11 >= r1) goto L_0x0303
            boolean r0 = E
            if (r0 == 0) goto L_0x02fd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02fd:
            r17.K0()
            r6.G(r7, r13)
        L_0x0303:
            if (r11 >= r9) goto L_0x0323
            boolean r0 = E
            if (r0 == 0) goto L_0x031d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x031d:
            r17.Q0()
            r6.M(r7, r13)
        L_0x0323:
            if (r11 >= r10) goto L_0x03a4
            boolean r0 = E
            if (r0 == 0) goto L_0x033d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x033d:
            android.view.View r0 = r7.I
            if (r0 == 0) goto L_0x0350
            android.support.v4.app.i r0 = r6.m
            boolean r0 = r0.m(r7)
            if (r0 == 0) goto L_0x0350
            android.util.SparseArray<android.os.Parcelable> r0 = r7.c
            if (r0 != 0) goto L_0x0350
            r16.T0(r17)
        L_0x0350:
            r17.D0()
            r6.O(r7, r13)
            android.view.View r0 = r7.I
            if (r0 == 0) goto L_0x0395
            android.view.ViewGroup r1 = r7.H
            if (r1 == 0) goto L_0x0395
            r1.endViewTransition(r0)
            android.view.View r0 = r7.I
            r0.clearAnimation()
            int r0 = r6.l
            r1 = 0
            if (r0 <= 0) goto L_0x0386
            boolean r0 = r6.t
            if (r0 != 0) goto L_0x0386
            android.view.View r0 = r7.I
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0386
            float r0 = r7.P
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0386
            r0 = r19
            r2 = r20
            android.support.v4.app.k$g r0 = r6.t0(r7, r0, r13, r2)
            goto L_0x0387
        L_0x0386:
            r0 = r14
        L_0x0387:
            r7.P = r1
            if (r0 == 0) goto L_0x038e
            r6.j(r7, r0, r11)
        L_0x038e:
            android.view.ViewGroup r0 = r7.H
            android.view.View r1 = r7.I
            r0.removeView(r1)
        L_0x0395:
            r7.H = r14
            r7.I = r14
            r7.U = r14
            android.arch.lifecycle.j<android.arch.lifecycle.e> r0 = r7.V
            r0.k(r14)
            r7.J = r14
            r7.n = r13
        L_0x03a4:
            if (r11 >= r8) goto L_0x0418
            boolean r0 = r6.t
            if (r0 == 0) goto L_0x03cb
            android.view.View r0 = r17.j()
            if (r0 == 0) goto L_0x03bb
            android.view.View r0 = r17.j()
            r7.U0(r14)
            r0.clearAnimation()
            goto L_0x03cb
        L_0x03bb:
            android.animation.Animator r0 = r17.k()
            if (r0 == 0) goto L_0x03cb
            android.animation.Animator r0 = r17.k()
            r7.V0(r14)
            r0.cancel()
        L_0x03cb:
            android.view.View r0 = r17.j()
            if (r0 != 0) goto L_0x0414
            android.animation.Animator r0 = r17.k()
            if (r0 == 0) goto L_0x03d8
            goto L_0x0414
        L_0x03d8:
            boolean r0 = E
            if (r0 == 0) goto L_0x03f0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x03f0:
            boolean r0 = r7.D
            if (r0 != 0) goto L_0x03fb
            r17.C0()
            r6.E(r7, r13)
            goto L_0x03fd
        L_0x03fb:
            r7.f79a = r13
        L_0x03fd:
            r17.E0()
            r6.F(r7, r13)
            if (r21 != 0) goto L_0x0418
            boolean r0 = r7.D
            if (r0 != 0) goto L_0x040d
            r16.w0(r17)
            goto L_0x0418
        L_0x040d:
            r7.s = r14
            r7.w = r14
            r7.r = r14
            goto L_0x0418
        L_0x0414:
            r7.d1(r11)
            goto L_0x0419
        L_0x0418:
            r8 = r11
        L_0x0419:
            int r0 = r7.f79a
            if (r0 == r8) goto L_0x044a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; "
            r0.append(r1)
            java.lang.String r1 = "expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f79a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.f79a = r8
        L_0x044a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.k.E0(android.support.v4.app.e, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void F(e eVar, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).F(eVar, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.e(this, eVar);
            }
        }
    }

    public void F0() {
        this.C = null;
        this.r = false;
        this.s = false;
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.d.get(i2);
            if (eVar != null) {
                eVar.O();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void G(e eVar, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).G(eVar, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.f(this, eVar);
            }
        }
    }

    public void G0(e eVar) {
        if (!eVar.K) {
            return;
        }
        if (this.f94b) {
            this.v = true;
            return;
        }
        eVar.K = false;
        E0(eVar, this.l, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    public void H(e eVar, Context context, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).H(eVar, context, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.g(this, eVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I(e eVar, Bundle bundle, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).I(eVar, bundle, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.h(this, eVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I0(ArrayList<b> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        Boolean bool = Boolean.TRUE;
        ArrayList<b> arrayList3 = this.f;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f.remove(size));
            arrayList2.add(bool);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    b bVar = this.f.get(size2);
                    if ((str != null && str.equals(bVar.o())) || (i2 >= 0 && i2 == bVar.l)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        b bVar2 = this.f.get(size2);
                        if ((str == null || !str.equals(bVar2.o())) && (i2 < 0 || i2 != bVar2.l)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f.size() - 1) {
                return false;
            }
            for (int size3 = this.f.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void J(e eVar, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).J(eVar, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.i(this, eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void K(e eVar, Bundle bundle, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).K(eVar, bundle, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.j(this, eVar, bundle);
            }
        }
    }

    public void K0(Bundle bundle, String str, e eVar) {
        int i2 = eVar.e;
        if (i2 >= 0) {
            bundle.putInt(str, i2);
            return;
        }
        d1(new IllegalStateException("Fragment " + eVar + " is not currently in the FragmentManager"));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void L(e eVar, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).L(eVar, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.k(this, eVar);
            }
        }
    }

    public void L0(e eVar) {
        if (E) {
            Log.v("FragmentManager", "remove: " + eVar + " nesting=" + eVar.q);
        }
        boolean z2 = !eVar.K();
        if (!eVar.B || z2) {
            synchronized (this.d) {
                this.d.remove(eVar);
            }
            if (eVar.E && eVar.F) {
                this.q = true;
            }
            eVar.k = false;
            eVar.l = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void M(e eVar, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).M(eVar, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.l(this, eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void N(e eVar, View view, Bundle bundle, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).N(eVar, view, bundle, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.m(this, eVar, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void N0() {
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.j.get(i2).a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O(e eVar, boolean z2) {
        e eVar2 = this.o;
        if (eVar2 != null) {
            j r2 = eVar2.r();
            if (r2 instanceof k) {
                ((k) r2).O(eVar, true);
            }
        }
        Iterator<j> it = this.k.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (!z2 || next.f111b) {
                next.f110a.n(this, eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O0(Parcelable parcelable, l lVar) {
        List<p> list;
        List<l> list2;
        o[] oVarArr;
        if (parcelable != null) {
            m mVar = (m) parcelable;
            if (mVar.f117a != null) {
                if (lVar != null) {
                    List<e> b2 = lVar.b();
                    list2 = lVar.a();
                    list = lVar.c();
                    int size = b2 != null ? b2.size() : 0;
                    int i2 = 0;
                    while (i2 < size) {
                        e eVar = b2.get(i2);
                        if (E) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + eVar);
                        }
                        int i3 = 0;
                        while (true) {
                            oVarArr = mVar.f117a;
                            if (i3 < oVarArr.length && oVarArr[i3].f122b != eVar.e) {
                                i3++;
                            }
                        }
                        if (i3 != oVarArr.length) {
                            o oVar = oVarArr[i3];
                            oVar.l = eVar;
                            eVar.c = null;
                            eVar.q = 0;
                            eVar.n = false;
                            eVar.k = false;
                            eVar.h = null;
                            Bundle bundle = oVar.k;
                            if (bundle != null) {
                                bundle.setClassLoader(this.m.e().getClassLoader());
                                eVar.c = oVar.k.getSparseParcelableArray("android:view_state");
                                eVar.f80b = oVar.k;
                            }
                            i2++;
                        } else {
                            d1(new IllegalStateException("Could not find active fragment with index " + eVar.e));
                            throw null;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.e = new SparseArray<>(mVar.f117a.length);
                int i4 = 0;
                while (true) {
                    o[] oVarArr2 = mVar.f117a;
                    if (i4 >= oVarArr2.length) {
                        break;
                    }
                    o oVar2 = oVarArr2[i4];
                    if (oVar2 != null) {
                        e a2 = oVar2.a(this.m, this.n, this.o, (list2 == null || i4 >= list2.size()) ? null : list2.get(i4), (list == null || i4 >= list.size()) ? null : list.get(i4));
                        if (E) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + a2);
                        }
                        this.e.put(a2.e, a2);
                        oVar2.l = null;
                    }
                    i4++;
                }
                if (lVar != null) {
                    List<e> b3 = lVar.b();
                    int size2 = b3 != null ? b3.size() : 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        e eVar2 = b3.get(i5);
                        int i6 = eVar2.i;
                        if (i6 >= 0) {
                            e eVar3 = this.e.get(i6);
                            eVar2.h = eVar3;
                            if (eVar3 == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + eVar2 + " target no longer exists: " + eVar2.i);
                            }
                        }
                    }
                }
                this.d.clear();
                if (mVar.f118b != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr = mVar.f118b;
                        if (i7 >= iArr.length) {
                            break;
                        }
                        e eVar4 = this.e.get(iArr[i7]);
                        if (eVar4 != null) {
                            eVar4.k = true;
                            if (E) {
                                Log.v("FragmentManager", "restoreAllState: added #" + i7 + ": " + eVar4);
                            }
                            if (!this.d.contains(eVar4)) {
                                synchronized (this.d) {
                                    this.d.add(eVar4);
                                }
                                i7++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            d1(new IllegalStateException("No instantiated fragment for index #" + mVar.f118b[i7]));
                            throw null;
                        }
                    }
                }
                if (mVar.c != null) {
                    this.f = new ArrayList<>(mVar.c.length);
                    int i8 = 0;
                    while (true) {
                        c[] cVarArr = mVar.c;
                        if (i8 >= cVarArr.length) {
                            break;
                        }
                        b a3 = cVarArr[i8].a(this);
                        if (E) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + a3.l + "): " + a3);
                            PrintWriter printWriter = new PrintWriter(new a.b.b.b.e("FragmentManager"));
                            a3.k("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f.add(a3);
                        int i9 = a3.l;
                        if (i9 >= 0) {
                            W0(i9, a3);
                        }
                        i8++;
                    }
                } else {
                    this.f = null;
                }
                int i10 = mVar.d;
                if (i10 >= 0) {
                    this.p = this.e.get(i10);
                }
                this.c = mVar.e;
            }
        }
    }

    public boolean P(MenuItem menuItem) {
        if (this.l < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            e eVar = this.d.get(i2);
            if (eVar != null && eVar.I0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public l P0() {
        Z0(this.C);
        return this.C;
    }

    public void Q(Menu menu) {
        if (this.l >= 1) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                e eVar = this.d.get(i2);
                if (eVar != null) {
                    eVar.J0(menu);
                }
            }
        }
    }

    public void R() {
        W(3);
    }

    /* access modifiers changed from: package-private */
    public Parcelable R0() {
        int[] iArr;
        int size;
        k0();
        Z();
        c0();
        this.r = true;
        c[] cVarArr = null;
        this.C = null;
        SparseArray<e> sparseArray = this.e;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.e.size();
        o[] oVarArr = new o[size2];
        boolean z2 = false;
        for (int i2 = 0; i2 < size2; i2++) {
            e valueAt = this.e.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.e >= 0) {
                    o oVar = new o(valueAt);
                    oVarArr[i2] = oVar;
                    if (valueAt.f79a <= 0 || oVar.k != null) {
                        oVar.k = valueAt.f80b;
                    } else {
                        Bundle S0 = S0(valueAt);
                        oVar.k = S0;
                        e eVar = valueAt.h;
                        if (eVar != null) {
                            if (eVar.e >= 0) {
                                if (S0 == null) {
                                    oVar.k = new Bundle();
                                }
                                K0(oVar.k, "android:target_state", valueAt.h);
                                int i3 = valueAt.j;
                                if (i3 != 0) {
                                    oVar.k.putInt("android:target_req_state", i3);
                                }
                            } else {
                                d1(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.h));
                                throw null;
                            }
                        }
                    }
                    if (E) {
                        Log.v("FragmentManager", "Saved state of " + valueAt + ": " + oVar.k);
                    }
                    z2 = true;
                } else {
                    d1(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.e));
                    throw null;
                }
            }
        }
        if (!z2) {
            if (E) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            iArr = new int[size3];
            int i4 = 0;
            while (i4 < size3) {
                iArr[i4] = this.d.get(i4).e;
                if (iArr[i4] >= 0) {
                    if (E) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.d.get(i4));
                    }
                    i4++;
                } else {
                    d1(new IllegalStateException("Failure saving state: active " + this.d.get(i4) + " has cleared index: " + iArr[i4]));
                    throw null;
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<b> arrayList = this.f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            cVarArr = new c[size];
            for (int i5 = 0; i5 < size; i5++) {
                cVarArr[i5] = new c(this.f.get(i5));
                if (E) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f.get(i5));
                }
            }
        }
        m mVar = new m();
        mVar.f117a = oVarArr;
        mVar.f118b = iArr;
        mVar.c = cVarArr;
        e eVar2 = this.p;
        if (eVar2 != null) {
            mVar.d = eVar2.e;
        }
        mVar.e = this.c;
        U0();
        return mVar;
    }

    public void S(boolean z2) {
        int size = this.d.size();
        while (true) {
            size--;
            if (size >= 0) {
                e eVar = this.d.get(size);
                if (eVar != null) {
                    eVar.L0(z2);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Bundle S0(e eVar) {
        if (this.z == null) {
            this.z = new Bundle();
        }
        eVar.O0(this.z);
        K(eVar, this.z, false);
        Bundle bundle = null;
        if (!this.z.isEmpty()) {
            Bundle bundle2 = this.z;
            this.z = null;
            bundle = bundle2;
        }
        if (eVar.I != null) {
            T0(eVar);
        }
        if (eVar.c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", eVar.c);
        }
        if (!eVar.L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", eVar.L);
        }
        return bundle;
    }

    public boolean T(Menu menu) {
        if (this.l < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            e eVar = this.d.get(i2);
            if (eVar != null && eVar.M0(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void T0(e eVar) {
        if (eVar.J != null) {
            SparseArray<Parcelable> sparseArray = this.A;
            if (sparseArray == null) {
                this.A = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            eVar.J.saveHierarchyState(this.A);
            if (this.A.size() > 0) {
                eVar.c = this.A;
                this.A = null;
            }
        }
    }

    public void U() {
        this.r = false;
        this.s = false;
        W(4);
    }

    /* access modifiers changed from: package-private */
    public void U0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        l lVar;
        if (this.e != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                e valueAt = this.e.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.C) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        e eVar = valueAt.h;
                        valueAt.i = eVar != null ? eVar.e : -1;
                        if (E) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    k kVar = valueAt.t;
                    if (kVar != null) {
                        kVar.U0();
                        lVar = valueAt.t.C;
                    } else {
                        lVar = valueAt.u;
                    }
                    if (arrayList2 == null && lVar != null) {
                        arrayList2 = new ArrayList(this.e.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add((Object) null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(lVar);
                    }
                    if (arrayList == null && valueAt.v != null) {
                        arrayList = new ArrayList(this.e.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList.add((Object) null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.v);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.C = null;
        } else {
            this.C = new l(arrayList3, arrayList2, arrayList);
        }
    }

    public void V() {
        this.r = false;
        this.s = false;
        W(3);
    }

    /* access modifiers changed from: package-private */
    public void V0() {
        synchronized (this) {
            ArrayList<m> arrayList = this.B;
            boolean z2 = false;
            boolean z3 = arrayList != null && !arrayList.isEmpty();
            ArrayList<l> arrayList2 = this.f93a;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.m.g().removeCallbacks(this.D);
                this.m.g().post(this.D);
            }
        }
    }

    public void W0(int i2, b bVar) {
        synchronized (this) {
            if (this.h == null) {
                this.h = new ArrayList<>();
            }
            int size = this.h.size();
            if (i2 < size) {
                if (E) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + bVar);
                }
                this.h.set(i2, bVar);
            } else {
                while (size < i2) {
                    this.h.add((Object) null);
                    if (this.i == null) {
                        this.i = new ArrayList<>();
                    }
                    if (E) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.i.add(Integer.valueOf(size));
                    size++;
                }
                if (E) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + bVar);
                }
                this.h.add(bVar);
            }
        }
    }

    public void X() {
        this.s = true;
        W(2);
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        if (this.v) {
            this.v = false;
            c1();
        }
    }

    public void Y0(e eVar) {
        if (eVar == null || (this.e.get(eVar.e) == eVar && (eVar.s == null || eVar.r() == this))) {
            this.p = eVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + eVar + " is not an active fragment of FragmentManager " + this);
    }

    public p a() {
        return new b(this);
    }

    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<e> sparseArray = this.e;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                e valueAt = this.e.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.d(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.d.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.d.get(i3).toString());
            }
        }
        ArrayList<e> arrayList = this.g;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(this.g.get(i4).toString());
            }
        }
        ArrayList<b> arrayList2 = this.f;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                b bVar = this.f.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                bVar.j(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            ArrayList<b> arrayList3 = this.h;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(this.h.get(i6));
                }
            }
            ArrayList<Integer> arrayList4 = this.i;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.i.toArray()));
            }
        }
        ArrayList<l> arrayList5 = this.f93a;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(this.f93a.get(i7));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.r);
        printWriter.print(" mStopped=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.q) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.q);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
    }

    /* access modifiers changed from: package-private */
    public void b0(e eVar) {
        if (eVar.m && !eVar.p) {
            eVar.B0(eVar.F0(eVar.f80b), (ViewGroup) null, eVar.f80b);
            View view = eVar.I;
            if (view != null) {
                eVar.J = view;
                view.setSaveFromParentEnabled(false);
                if (eVar.A) {
                    eVar.I.setVisibility(8);
                }
                eVar.t0(eVar.I, eVar.f80b);
                N(eVar, eVar.I, eVar.f80b, false);
                return;
            }
            eVar.J = null;
        }
    }

    public void b1(e eVar) {
        if (E) {
            Log.v("FragmentManager", "show: " + eVar);
        }
        if (eVar.A) {
            eVar.A = false;
            eVar.O = !eVar.O;
        }
    }

    public e c(String str) {
        if (str != null) {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                e eVar = this.d.get(size);
                if (eVar != null && str.equals(eVar.z)) {
                    return eVar;
                }
            }
        }
        SparseArray<e> sparseArray = this.e;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            e valueAt = this.e.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.z)) {
                return valueAt;
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    public boolean c0() {
        a0(true);
        boolean z2 = false;
        while (m0(this.w, this.x)) {
            this.f94b = true;
            try {
                M0(this.w, this.x);
                o();
                z2 = true;
            } catch (Throwable th) {
                o();
                throw th;
            }
        }
        Y();
        m();
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void c1() {
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                e valueAt = this.e.valueAt(i2);
                if (valueAt != null) {
                    G0(valueAt);
                }
            }
        }
    }

    public List<e> d() {
        List<e> list;
        if (this.d.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.d) {
            list = (List) this.d.clone();
        }
        return list;
    }

    public void d0(l lVar, boolean z2) {
        if (!z2 || (this.m != null && !this.t)) {
            a0(z2);
            if (lVar.a(this.w, this.x)) {
                this.f94b = true;
                try {
                    M0(this.w, this.x);
                } finally {
                    o();
                }
            }
            Y();
            m();
        }
    }

    public boolean e() {
        return this.r || this.s;
    }

    public boolean f() {
        n();
        return H0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void h(b bVar) {
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        this.f.add(bVar);
    }

    public e h0(int i2) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            e eVar = this.d.get(size);
            if (eVar != null && eVar.x == i2) {
                return eVar;
            }
        }
        SparseArray<e> sparseArray = this.e;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            e valueAt = this.e.valueAt(size2);
            if (valueAt != null && valueAt.x == i2) {
                return valueAt;
            }
        }
        return null;
    }

    public void i(e eVar, boolean z2) {
        if (E) {
            Log.v("FragmentManager", "add: " + eVar);
        }
        u0(eVar);
        if (eVar.B) {
            return;
        }
        if (!this.d.contains(eVar)) {
            synchronized (this.d) {
                this.d.add(eVar);
            }
            eVar.k = true;
            eVar.l = false;
            if (eVar.I == null) {
                eVar.O = false;
            }
            if (eVar.E && eVar.F) {
                this.q = true;
            }
            if (z2) {
                D0(eVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + eVar);
    }

    public e i0(String str) {
        e f2;
        SparseArray<e> sparseArray = this.e;
        if (sparseArray == null || str == null) {
            return null;
        }
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            e valueAt = this.e.valueAt(size);
            if (valueAt != null && (f2 = valueAt.f(str)) != null) {
                return f2;
            }
        }
    }

    public void k(i iVar, g gVar, e eVar) {
        if (this.m == null) {
            this.m = iVar;
            this.n = gVar;
            this.o = eVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void l(e eVar) {
        if (E) {
            Log.v("FragmentManager", "attach: " + eVar);
        }
        if (eVar.B) {
            eVar.B = false;
            if (eVar.k) {
                return;
            }
            if (!this.d.contains(eVar)) {
                if (E) {
                    Log.v("FragmentManager", "add from attach: " + eVar);
                }
                synchronized (this.d) {
                    this.d.add(eVar);
                }
                eVar.k = true;
                if (eVar.E && eVar.F) {
                    this.q = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + eVar);
        }
    }

    public void l0(int i2) {
        synchronized (this) {
            this.h.set(i2, (Object) null);
            if (this.i == null) {
                this.i = new ArrayList<>();
            }
            if (E) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.i.add(Integer.valueOf(i2));
        }
    }

    public e o0(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        e eVar = this.e.get(i2);
        if (eVar != null) {
            return eVar;
        }
        d1(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        throw null;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C0008k.f112a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!e.N(this.m.e(), str3)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str3);
        }
        e h0 = resourceId != -1 ? h0(resourceId) : null;
        if (h0 == null && string != null) {
            h0 = c(string);
        }
        if (h0 == null && i2 != -1) {
            h0 = h0(i2);
        }
        if (E) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str3 + " existing=" + h0);
        }
        if (h0 == null) {
            h0 = this.n.a(context, str3, (Bundle) null);
            h0.m = true;
            h0.x = resourceId != 0 ? resourceId : i2;
            h0.y = i2;
            h0.z = string;
            h0.n = true;
            h0.r = this;
            i iVar = this.m;
            h0.s = iVar;
            h0.h0(iVar.e(), attributeSet2, h0.f80b);
            i(h0, true);
        } else if (!h0.n) {
            h0.n = true;
            i iVar2 = this.m;
            h0.s = iVar2;
            if (!h0.D) {
                h0.h0(iVar2.e(), attributeSet2, h0.f80b);
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str3);
        }
        e eVar = h0;
        if (this.l >= 1 || !eVar.m) {
            D0(eVar);
        } else {
            E0(eVar, 1, 0, 0, false);
        }
        View view2 = eVar.I;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (eVar.I.getTag() == null) {
                eVar.I.setTag(string);
            }
            return eVar.I;
        }
        throw new IllegalStateException("Fragment " + str3 + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void p(b bVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            bVar.m(z4);
        } else {
            bVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(bVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            q.C(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            C0(this.l, true);
        }
        SparseArray<e> sparseArray = this.e;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                e valueAt = this.e.valueAt(i2);
                if (valueAt != null && valueAt.I != null && valueAt.N && bVar.p(valueAt.y)) {
                    float f2 = valueAt.P;
                    if (f2 > 0.0f) {
                        valueAt.I.setAlpha(f2);
                    }
                    if (z4) {
                        valueAt.P = 0.0f;
                    } else {
                        valueAt.P = -1.0f;
                        valueAt.N = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 p0() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public void q(e eVar) {
        Animator animator;
        if (eVar.I != null) {
            g t0 = t0(eVar, eVar.v(), !eVar.A, eVar.w());
            if (t0 == null || (animator = t0.f106b) == null) {
                if (t0 != null) {
                    X0(eVar.I, t0);
                    eVar.I.startAnimation(t0.f105a);
                    t0.f105a.start();
                }
                eVar.I.setVisibility((!eVar.A || eVar.J()) ? 0 : 8);
                if (eVar.J()) {
                    eVar.X0(false);
                }
            } else {
                animator.setTarget(eVar.I);
                if (!eVar.A) {
                    eVar.I.setVisibility(0);
                } else if (eVar.J()) {
                    eVar.X0(false);
                } else {
                    ViewGroup viewGroup = eVar.H;
                    View view = eVar.I;
                    viewGroup.startViewTransition(view);
                    t0.f106b.addListener(new d(this, viewGroup, view, eVar));
                }
                X0(eVar.I, t0);
                t0.f106b.start();
            }
        }
        if (eVar.k && eVar.E && eVar.F) {
            this.q = true;
        }
        eVar.O = false;
        eVar.f0(eVar.A);
    }

    public e q0() {
        return this.p;
    }

    public void r(e eVar) {
        if (E) {
            Log.v("FragmentManager", "detach: " + eVar);
        }
        if (!eVar.B) {
            eVar.B = true;
            if (eVar.k) {
                if (E) {
                    Log.v("FragmentManager", "remove from detach: " + eVar);
                }
                synchronized (this.d) {
                    this.d.remove(eVar);
                }
                if (eVar.E && eVar.F) {
                    this.q = true;
                }
                eVar.k = false;
            }
        }
    }

    public void r0(e eVar) {
        if (E) {
            Log.v("FragmentManager", "hide: " + eVar);
        }
        if (!eVar.A) {
            eVar.A = true;
            eVar.O = true ^ eVar.O;
        }
    }

    public void s() {
        this.r = false;
        this.s = false;
        W(2);
    }

    /* access modifiers changed from: package-private */
    public boolean s0(int i2) {
        return this.l >= i2;
    }

    public void t(Configuration configuration) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            e eVar = this.d.get(i2);
            if (eVar != null) {
                eVar.x0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public g t0(e eVar, int i2, boolean z2, int i3) {
        int e1;
        int u2 = eVar.u();
        Animation W = eVar.W(i2, z2, u2);
        if (W != null) {
            return new g(W);
        }
        Animator X = eVar.X(i2, z2, u2);
        if (X != null) {
            return new g(X);
        }
        if (u2 != 0) {
            boolean equals = "anim".equals(this.m.e().getResources().getResourceTypeName(u2));
            boolean z3 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.m.e(), u2);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.m.e(), u2);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.m.e(), u2);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0 || (e1 = e1(i2, z2)) < 0) {
            return null;
        }
        switch (e1) {
            case 1:
                return x0(this.m.e(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return x0(this.m.e(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return x0(this.m.e(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return x0(this.m.e(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return v0(this.m.e(), 0.0f, 1.0f);
            case 6:
                return v0(this.m.e(), 1.0f, 0.0f);
            default:
                if (i3 != 0 || !this.m.l()) {
                    return null;
                }
                int k2 = this.m.k();
                return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.o;
        if (obj == null) {
            obj = this.m;
        }
        a.b.b.b.d.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public boolean u(MenuItem menuItem) {
        if (this.l < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            e eVar = this.d.get(i2);
            if (eVar != null && eVar.y0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u0(e eVar) {
        if (eVar.e < 0) {
            int i2 = this.c;
            this.c = i2 + 1;
            eVar.Y0(i2, this.o);
            if (this.e == null) {
                this.e = new SparseArray<>();
            }
            this.e.put(eVar.e, eVar);
            if (E) {
                Log.v("FragmentManager", "Allocated fragment index " + eVar);
            }
        }
    }

    public void v() {
        this.r = false;
        this.s = false;
        W(1);
    }

    public boolean w(Menu menu, MenuInflater menuInflater) {
        if (this.l < 1) {
            return false;
        }
        ArrayList<e> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            e eVar = this.d.get(i2);
            if (eVar != null && eVar.A0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(eVar);
                z2 = true;
            }
        }
        if (this.g != null) {
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                e eVar2 = this.g.get(i3);
                if (arrayList == null || !arrayList.contains(eVar2)) {
                    eVar2.b0();
                }
            }
        }
        this.g = arrayList;
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void w0(e eVar) {
        if (eVar.e >= 0) {
            if (E) {
                Log.v("FragmentManager", "Freeing fragment index " + eVar);
            }
            this.e.put(eVar.e, (Object) null);
            eVar.E();
        }
    }

    public void x() {
        this.t = true;
        c0();
        W(0);
        this.m = null;
        this.n = null;
        this.o = null;
    }

    public void y() {
        W(1);
    }

    public void z() {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            e eVar = this.d.get(i2);
            if (eVar != null) {
                eVar.G0();
            }
        }
    }
}
