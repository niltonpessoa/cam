package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] f0 = {16842931};
    private static final Comparator<f> g0 = new a();
    private static final Interpolator h0 = new b();
    private static final n i0 = new n();
    private int A;
    private int B;
    private float C;
    private float D;
    private float E;
    private float F;
    private int G = -1;
    private VelocityTracker H;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private EdgeEffect N;
    private EdgeEffect O;
    private boolean P = true;
    private boolean Q;
    private int R;
    private List<j> S;
    private j T;
    private j U;
    private List<i> V;
    private k W;

    /* renamed from: a  reason: collision with root package name */
    private int f193a;
    private int a0;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<f> f194b = new ArrayList<>();
    private int b0;
    private final f c = new f();
    private ArrayList<View> c0;
    private final Rect d = new Rect();
    private final Runnable d0 = new c();
    f e;
    private int e0 = 0;
    int f;
    private int g = -1;
    private Parcelable h = null;
    private ClassLoader i = null;
    private Scroller j;
    private boolean k;
    private l l;
    private int m;
    private Drawable n;
    private int o;
    private int p;
    private float q = -3.4028235E38f;
    private float r = Float.MAX_VALUE;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w = 1;
    private boolean x;
    private boolean y;
    private int z;

    static class a implements Comparator<f> {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f199b - fVar2.f199b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.C();
        }
    }

    class d implements e {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f196a = new Rect();

        d() {
        }

        public i a(View view, i iVar) {
            i h = g.h(view, iVar);
            if (h.e()) {
                return h;
            }
            Rect rect = this.f196a;
            rect.left = h.b();
            rect.top = h.d();
            rect.right = h.c();
            rect.bottom = h.a();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                i a2 = g.a(ViewPager.this.getChildAt(i), h);
                rect.left = Math.min(a2.b(), rect.left);
                rect.top = Math.min(a2.d(), rect.top);
                rect.right = Math.min(a2.c(), rect.right);
                rect.bottom = Math.min(a2.a(), rect.bottom);
            }
            return h.f(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a  reason: collision with root package name */
        Object f198a;

        /* renamed from: b  reason: collision with root package name */
        int f199b;
        boolean c;
        float d;
        float e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f200a;

        /* renamed from: b  reason: collision with root package name */
        public int f201b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f0);
            this.f201b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class h extends b {
        h() {
        }

        private boolean k() {
            f fVar = ViewPager.this.e;
            return fVar != null && fVar.d() > 1;
        }

        public void d(View view, AccessibilityEvent accessibilityEvent) {
            f fVar;
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(k());
            if (accessibilityEvent.getEventType() == 4096 && (fVar = ViewPager.this.e) != null) {
                accessibilityEvent.setItemCount(fVar.d());
                accessibilityEvent.setFromIndex(ViewPager.this.f);
                accessibilityEvent.setToIndex(ViewPager.this.f);
            }
        }

        public void e(View view, android.support.v4.view.j.a aVar) {
            super.e(view, aVar);
            aVar.u(ViewPager.class.getName());
            aVar.v(k());
            if (ViewPager.this.canScrollHorizontally(1)) {
                aVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                aVar.a(8192);
            }
        }

        public boolean h(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.h(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.f + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, f fVar, f fVar2);
    }

    public interface j {
        void a(int i, float f, int i2);

        void b(int i);

        void c(int i);
    }

    public interface k {
        void a(View view, float f);
    }

    private class l extends DataSetObserver {
        l() {
        }

        public void onChanged() {
            ViewPager.this.f();
        }

        public void onInvalidated() {
            ViewPager.this.f();
        }
    }

    public static class m extends a {
        public static final Parcelable.Creator<m> CREATOR = new a();
        int c;
        Parcelable d;
        ClassLoader e;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            /* renamed from: c */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.c + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }
    }

    static class n implements Comparator<View> {
        n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.f200a;
            return z != gVar2.f200a ? z ? 1 : -1 : gVar.e - gVar2.e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t();
    }

    private boolean A(int i2) {
        if (this.f194b.size() != 0) {
            f r2 = r();
            int clientWidth = getClientWidth();
            int i3 = this.m;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = r2.f199b;
            float f3 = ((((float) i2) / f2) - r2.e) / (r2.d + (((float) i3) / f2));
            this.Q = false;
            w(i5, f3, (int) (((float) i4) * f3));
            if (this.Q) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.P) {
            return false;
        } else {
            this.Q = false;
            w(0, 0.0f, 0);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean B(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.C - f2;
        this.C = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.q * clientWidth;
        float f5 = this.r * clientWidth;
        boolean z4 = false;
        f fVar = this.f194b.get(0);
        ArrayList<f> arrayList = this.f194b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f199b != 0) {
            f4 = fVar.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.f199b != this.e.d() - 1) {
            f5 = fVar2.e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.N.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.O.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.C += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        A(i2);
        return z4;
    }

    private void E(int i2, int i3, int i4, int i5) {
        int min;
        if (i3 <= 0 || this.f194b.isEmpty()) {
            f s2 = s(this.f);
            min = (int) ((s2 != null ? Math.min(s2.e, this.r) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                e(false);
            } else {
                return;
            }
        } else if (!this.j.isFinished()) {
            this.j.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
        }
        scrollTo(min, getScrollY());
    }

    private void F() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).f200a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void G(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean H() {
        this.G = -1;
        m();
        this.N.onRelease();
        this.O.onRelease();
        return this.N.isFinished() || this.O.isFinished();
    }

    private void I(int i2, boolean z2, int i3, boolean z3) {
        f s2 = s(i2);
        int clientWidth = s2 != null ? (int) (((float) getClientWidth()) * Math.max(this.q, Math.min(s2.e, this.r))) : 0;
        if (z2) {
            M(clientWidth, 0, i3);
            if (z3) {
                i(i2);
                return;
            }
            return;
        }
        if (z3) {
            i(i2);
        }
        e(false);
        scrollTo(clientWidth, 0);
        A(clientWidth);
    }

    private void N() {
        if (this.b0 != 0) {
            ArrayList<View> arrayList = this.c0;
            if (arrayList == null) {
                this.c0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.c0.add(getChildAt(i2));
            }
            Collections.sort(this.c0, i0);
        }
    }

    private void c(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int d2 = this.e.d();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.m) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f199b;
            int i6 = fVar.f199b;
            if (i5 < i6) {
                int i7 = 0;
                float f3 = fVar2.e + fVar2.d + f2;
                while (true) {
                    i5++;
                    if (i5 > fVar.f199b || i7 >= this.f194b.size()) {
                        break;
                    }
                    while (true) {
                        fVar4 = this.f194b.get(i7);
                        if (i5 > fVar4.f199b && i7 < this.f194b.size() - 1) {
                            i7++;
                        }
                    }
                    while (i5 < fVar4.f199b) {
                        f3 += this.e.f(i5) + f2;
                        i5++;
                    }
                    fVar4.e = f3;
                    f3 += fVar4.d + f2;
                }
            } else if (i5 > i6) {
                int size = this.f194b.size() - 1;
                float f4 = fVar2.e;
                while (true) {
                    int i8 = i5 - 1;
                    if (i8 < fVar.f199b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f194b.get(size);
                        if (i8 < fVar3.f199b && size > 0) {
                            size--;
                        }
                    }
                    while (i5 > fVar3.f199b) {
                        f4 -= this.e.f(i5) + f2;
                        i8 = i5 - 1;
                    }
                    f4 -= fVar3.d + f2;
                    fVar3.e = f4;
                }
            }
        }
        int size2 = this.f194b.size();
        float f5 = fVar.e;
        int i9 = fVar.f199b;
        int i10 = i9 - 1;
        this.q = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = d2 - 1;
        this.r = i9 == i11 ? (fVar.d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = this.f194b.get(i12);
            while (true) {
                i4 = fVar5.f199b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.e.f(i10) + f2;
                i10--;
            }
            f5 -= fVar5.d + f2;
            fVar5.e = f5;
            if (i4 == 0) {
                this.q = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.e + fVar.d + f2;
        int i13 = fVar.f199b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = this.f194b.get(i14);
            while (true) {
                i3 = fVar6.f199b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.e.f(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.r = (fVar6.d + f6) - 1.0f;
            }
            fVar6.e = f6;
            f6 += fVar6.d + f2;
            i14++;
            i13++;
        }
    }

    private void e(boolean z2) {
        boolean z3 = this.e0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.v = false;
        for (int i2 = 0; i2 < this.f194b.size(); i2++) {
            f fVar = this.f194b.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            g.j(this, this.d0);
        } else {
            this.d0.run();
        }
    }

    private int g(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.K || Math.abs(i3) <= this.I) {
            i2 += (int) (f2 + (i2 >= this.f ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f194b.size() <= 0) {
            return i2;
        }
        ArrayList<f> arrayList = this.f194b;
        return Math.max(this.f194b.get(0).f199b, Math.min(i2, arrayList.get(arrayList.size() - 1).f199b));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i2, float f2, int i3) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.S.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.U;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void i(int i2) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.S.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.U;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void j(int i2) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.S.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.U;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    private void l(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.a0 : 0, (Paint) null);
        }
    }

    private void m() {
        this.x = false;
        this.y = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
    }

    private Rect o(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f r() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.m) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f194b.size()) {
            f fVar2 = this.f194b.get(i4);
            if (!z2 && fVar2.f199b != (i2 = i3 + 1)) {
                fVar2 = this.c;
                fVar2.e = f2 + f4 + f3;
                fVar2.f199b = i2;
                fVar2.d = this.e.f(i2);
                i4--;
            }
            f2 = fVar2.e;
            float f5 = fVar2.d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.f194b.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f199b;
            f4 = fVar2.d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
        }
    }

    private static boolean u(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean v(float f2, float f3) {
        return (f2 < ((float) this.A) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.A)) && f3 < 0.0f);
    }

    private void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.C = motionEvent.getX(i2);
            this.G = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        D(this.f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013c, code lost:
        if (r4 < r0.f194b.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        if (r4 < r0.f194b.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        if (r4 < r0.f194b.size()) goto L_0x013e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f
            if (r2 == r1) goto L_0x000f
            android.support.v4.view.ViewPager$f r2 = r0.s(r2)
            r0.f = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            android.support.v4.view.f r1 = r0.e
            if (r1 != 0) goto L_0x0018
            r17.N()
            return
        L_0x0018:
            boolean r1 = r0.v
            if (r1 == 0) goto L_0x0020
            r17.N()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            android.support.v4.view.f r1 = r0.e
            r1.o(r0)
            int r1 = r0.w
            int r4 = r0.f
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            android.support.v4.view.f r6 = r0.e
            int r6 = r6.d()
            int r7 = r6 + -1
            int r8 = r0.f
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f193a
            if (r6 != r7) goto L_0x01ef
            r7 = 0
        L_0x004a:
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r8 = r0.f194b
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r8 = r0.f194b
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.view.ViewPager$f r8 = (android.support.v4.view.ViewPager.f) r8
            int r9 = r8.f199b
            int r10 = r0.f
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f
            android.support.v4.view.ViewPager$f r8 = r0.a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017c
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r11 = r0.f194b
            java.lang.Object r11 = r11.get(r10)
            android.support.v4.view.ViewPager$f r11 = (android.support.v4.view.ViewPager.f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00ed
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00c3
            if (r3 >= r4) goto L_0x00c3
            if (r11 != 0) goto L_0x00a8
            goto L_0x00ed
        L_0x00a8:
            int r5 = r11.f199b
            if (r3 != r5) goto L_0x00e9
            boolean r5 = r11.c
            if (r5 != 0) goto L_0x00e9
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            r5.remove(r10)
            android.support.v4.view.f r5 = r0.e
            java.lang.Object r11 = r11.f198a
            r5.a(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00c3:
            if (r11 == 0) goto L_0x00d1
            int r5 = r11.f199b
            if (r3 != r5) goto L_0x00d1
            float r5 = r11.d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00d1:
            int r5 = r10 + 1
            android.support.v4.view.ViewPager$f r5 = r0.a(r3, r5)
            float r5 = r5.d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00e7
        L_0x00de:
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            java.lang.Object r5 = r5.get(r10)
            android.support.v4.view.ViewPager$f r5 = (android.support.v4.view.ViewPager.f) r5
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            r11 = r5
        L_0x00e9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00ed:
            float r3 = r8.d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0170
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0106
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$f r5 = (android.support.v4.view.ViewPager.f) r5
            goto L_0x0107
        L_0x0106:
            r5 = 0
        L_0x0107:
            if (r12 > 0) goto L_0x010b
            r10 = 0
            goto L_0x0113
        L_0x010b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0113:
            int r11 = r0.f
        L_0x0115:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0170
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0149
            if (r11 <= r1) goto L_0x0149
            if (r5 != 0) goto L_0x0122
            goto L_0x0170
        L_0x0122:
            int r12 = r5.f199b
            if (r11 != r12) goto L_0x016f
            boolean r12 = r5.c
            if (r12 != 0) goto L_0x016f
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r12 = r0.f194b
            r12.remove(r4)
            android.support.v4.view.f r12 = r0.e
            java.lang.Object r5 = r5.f198a
            r12.a(r0, r11, r5)
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
        L_0x013e:
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$f r5 = (android.support.v4.view.ViewPager.f) r5
            goto L_0x016f
        L_0x0147:
            r5 = 0
            goto L_0x016f
        L_0x0149:
            if (r5 == 0) goto L_0x015d
            int r12 = r5.f199b
            if (r11 != r12) goto L_0x015d
            float r5 = r5.d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x015d:
            android.support.v4.view.ViewPager$f r5 = r0.a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.d
            float r3 = r3 + r5
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x016f:
            goto L_0x0115
        L_0x0170:
            r0.c(r8, r7, r2)
            android.support.v4.view.f r1 = r0.e
            int r2 = r0.f
            java.lang.Object r3 = r8.f198a
            r1.l(r0, r2, r3)
        L_0x017c:
            android.support.v4.view.f r1 = r0.e
            r1.c(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0186:
            if (r2 >= r1) goto L_0x01af
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v4.view.ViewPager$g r4 = (android.support.v4.view.ViewPager.g) r4
            r4.f = r2
            boolean r5 = r4.f200a
            if (r5 != 0) goto L_0x01ac
            float r5 = r4.c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ac
            android.support.v4.view.ViewPager$f r3 = r0.q(r3)
            if (r3 == 0) goto L_0x01ac
            float r5 = r3.d
            r4.c = r5
            int r3 = r3.f199b
            r4.e = r3
        L_0x01ac:
            int r2 = r2 + 1
            goto L_0x0186
        L_0x01af:
            r17.N()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01ee
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c3
            android.support.v4.view.ViewPager$f r3 = r0.p(r1)
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 == 0) goto L_0x01cc
            int r1 = r3.f199b
            int r2 = r0.f
            if (r1 == r2) goto L_0x01ee
        L_0x01cc:
            r5 = 0
        L_0x01cd:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x01ee
            android.view.View r1 = r0.getChildAt(r5)
            android.support.v4.view.ViewPager$f r2 = r0.q(r1)
            if (r2 == 0) goto L_0x01eb
            int r2 = r2.f199b
            int r3 = r0.f
            if (r2 != r3) goto L_0x01eb
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            int r5 = r5 + 1
            goto L_0x01cd
        L_0x01ee:
            return
        L_0x01ef:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01fc }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01fc }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0204:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f193a
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            android.support.v4.view.f r1 = r0.e
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x0248
        L_0x0247:
            throw r2
        L_0x0248:
            goto L_0x0247
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.D(int):void");
    }

    public void J(int i2, boolean z2) {
        this.v = false;
        K(i2, z2, false);
    }

    /* access modifiers changed from: package-private */
    public void K(int i2, boolean z2, boolean z3) {
        L(i2, z2, z3, 0);
    }

    /* access modifiers changed from: package-private */
    public void L(int i2, boolean z2, boolean z3, int i3) {
        f fVar = this.e;
        boolean z4 = false;
        if (fVar == null || fVar.d() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f != i2 || this.f194b.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.e.d()) {
                i2 = this.e.d() - 1;
            }
            int i4 = this.w;
            int i5 = this.f;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f194b.size(); i6++) {
                    this.f194b.get(i6).c = true;
                }
            }
            if (this.f != i2) {
                z4 = true;
            }
            if (this.P) {
                this.f = i2;
                if (z4) {
                    i(i2);
                }
                requestLayout();
                return;
            }
            D(i2);
            I(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(int i2, int i3, int i4) {
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            i5 = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i5 = getScrollX();
        }
        int i6 = i5;
        int scrollY = getScrollY();
        int i7 = i2 - i6;
        int i8 = i3 - scrollY;
        if (i7 == 0 && i8 == 0) {
            e(false);
            C();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i9;
        float k2 = f3 + (k(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(k2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i7)) / ((f2 * this.e.f(this.f)) + ((float) this.m))) + 1.0f) * 100.0f), 600);
        this.k = false;
        this.j.startScroll(i6, scrollY, i7, i8, min);
        g.i(this);
    }

    /* access modifiers changed from: package-private */
    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.f199b = i2;
        fVar.f198a = this.e.g(this, i2);
        fVar.d = this.e.f(i2);
        if (i3 < 0 || i3 >= this.f194b.size()) {
            this.f194b.add(fVar);
        } else {
            this.f194b.add(i3, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f q2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (q2 = q(childAt)) != null && q2.f199b == this.f) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        f q2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (q2 = q(childAt)) != null && q2.f199b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean u2 = gVar.f200a | u(view);
        gVar.f200a = u2;
        if (!this.t) {
            super.addView(view, i2, layoutParams);
        } else if (gVar == null || !u2) {
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.d
            android.graphics.Rect r1 = r6.o(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.d
            android.graphics.Rect r2 = r6.o(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.y()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00c8
        L_0x009a:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.d
            android.graphics.Rect r1 = r6.o(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.d
            android.graphics.Rect r2 = r6.o(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 > r2) goto L_0x0094
            boolean r0 = r6.z()
            goto L_0x0098
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.z()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.y()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.b(int):boolean");
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.q)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.r));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        g.i(this);
    }

    /* access modifiers changed from: protected */
    public boolean d(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (d(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f q2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (q2 = q(childAt)) != null && q2.f199b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        f fVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (fVar = this.e) != null && fVar.d() > 1)) {
            if (!this.N.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.q * ((float) width));
                this.N.setSize(height, width);
                z2 = false | this.N.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.O.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.r + 1.0f)) * ((float) width2));
                this.O.setSize(height2, width2);
                z2 |= this.O.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.N.finish();
            this.O.finish();
        }
        if (z2) {
            g.i(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        int d2 = this.e.d();
        this.f193a = d2;
        boolean z2 = this.f194b.size() < (this.w * 2) + 1 && this.f194b.size() < d2;
        int i2 = this.f;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.f194b.size()) {
            f fVar = this.f194b.get(i3);
            int e2 = this.e.e(fVar.f198a);
            if (e2 != -1) {
                if (e2 == -2) {
                    this.f194b.remove(i3);
                    i3--;
                    if (!z3) {
                        this.e.o(this);
                        z3 = true;
                    }
                    this.e.a(this, fVar.f199b, fVar.f198a);
                    int i4 = this.f;
                    if (i4 == fVar.f199b) {
                        i2 = Math.max(0, Math.min(i4, d2 - 1));
                    }
                } else {
                    int i5 = fVar.f199b;
                    if (i5 != e2) {
                        if (i5 == this.f) {
                            i2 = e2;
                        }
                        fVar.f199b = e2;
                    }
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.e.c(this);
        }
        Collections.sort(this.f194b, g0);
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                g gVar = (g) getChildAt(i6).getLayoutParams();
                if (!gVar.f200a) {
                    gVar.c = 0.0f;
                }
            }
            K(i2, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public f getAdapter() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.b0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.c0.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.w;
    }

    public int getPageMargin() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public float k(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    public boolean n(KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return b(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return b(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return z();
                } else {
                    i2 = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return y();
            } else {
                i2 = 17;
            }
            return b(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.d0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.m
            if (r1 <= 0) goto L_0x00aa
            android.graphics.drawable.Drawable r1 = r0.n
            if (r1 == 0) goto L_0x00aa
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r1 = r0.f194b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00aa
            android.support.v4.view.f r1 = r0.e
            if (r1 == 0) goto L_0x00aa
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.m
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            android.support.v4.view.ViewPager$f r5 = (android.support.v4.view.ViewPager.f) r5
            float r7 = r5.e
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r8 = r0.f194b
            int r8 = r8.size()
            int r9 = r5.f199b
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r10 = r0.f194b
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            android.support.v4.view.ViewPager$f r10 = (android.support.v4.view.ViewPager.f) r10
            int r10 = r10.f199b
        L_0x0045:
            if (r9 >= r10) goto L_0x00aa
        L_0x0047:
            int r11 = r5.f199b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<android.support.v4.view.ViewPager$f> r5 = r0.f194b
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            android.support.v4.view.ViewPager$f r5 = (android.support.v4.view.ViewPager.f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.e
            float r11 = r5.d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0071
        L_0x0065:
            android.support.v4.view.f r11 = r0.e
            float r11 = r11.f(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x0071:
            int r11 = r0.m
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            android.graphics.drawable.Drawable r11 = r0.n
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.o
            int r15 = r0.m
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.p
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.n
            r11 = r18
            r3.draw(r11)
            goto L_0x009d
        L_0x0099:
            r11 = r18
            r16 = r3
        L_0x009d:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            H();
            return false;
        }
        if (action != 0) {
            if (this.x) {
                return true;
            }
            if (this.y) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.E = x2;
            this.C = x2;
            float y2 = motionEvent.getY();
            this.F = y2;
            this.D = y2;
            this.G = motionEvent2.getPointerId(0);
            this.y = false;
            this.k = true;
            this.j.computeScrollOffset();
            if (this.e0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.L) {
                e(false);
                this.x = false;
            } else {
                this.j.abortAnimation();
                this.v = false;
                C();
                this.x = true;
                G(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.G;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.C;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.F);
                if (f2 != 0.0f && !v(this.C, f2)) {
                    if (d(this, false, (int) f2, (int) x3, (int) y3)) {
                        this.C = x3;
                        this.D = y3;
                        this.y = true;
                        return false;
                    }
                }
                int i3 = this.B;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.x = true;
                    G(true);
                    setScrollState(1);
                    this.C = f2 > 0.0f ? this.E + ((float) this.B) : this.E - ((float) this.B);
                    this.D = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.y = true;
                }
                if (this.x && B(x3)) {
                    g.i(this);
                }
            }
        } else if (action == 6) {
            x(motionEvent);
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent2);
        return this.x;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            android.support.v4.view.ViewPager$g r12 = (android.support.v4.view.ViewPager.g) r12
            boolean r14 = r12.f200a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f201b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.support.v4.view.ViewPager$g r9 = (android.support.v4.view.ViewPager.g) r9
            boolean r10 = r9.f200a
            if (r10 != 0) goto L_0x0105
            android.support.v4.view.ViewPager$f r10 = r0.q(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.d = r14
            float r9 = r9.c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.o = r5
            int r3 = r3 - r7
            r0.p = r3
            r0.R = r11
            boolean r1 = r0.P
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f
            r2 = 0
            r0.I(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.P = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.z
            int r15 = java.lang.Math.min(r15, r1)
            r13.A = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.support.v4.view.ViewPager$g r3 = (android.support.v4.view.ViewPager.g) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f200a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f201b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.s = r15
            r13.t = r4
            r13.C()
            r13.t = r0
            int r15 = r13.getChildCount()
        L_0x00c6:
            if (r0 >= r15) goto L_0x00f0
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.support.v4.view.ViewPager$g r2 = (android.support.v4.view.ViewPager.g) r2
            if (r2 == 0) goto L_0x00de
            boolean r4 = r2.f200a
            if (r4 != 0) goto L_0x00ed
        L_0x00de:
            float r4 = (float) r14
            float r2 = r2.c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.s
            r1.measure(r2, r4)
        L_0x00ed:
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f q2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (q2 = q(childAt)) != null && q2.f199b == this.f && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        f fVar = this.e;
        if (fVar != null) {
            fVar.i(mVar.d, mVar.e);
            K(mVar.c, false, true);
            return;
        }
        this.g = mVar.c;
        this.h = mVar.d;
        this.i = mVar.e;
    }

    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.c = this.f;
        f fVar = this.e;
        if (fVar != null) {
            mVar.d = fVar.j();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.m;
            E(i2, i4, i6, i6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.M
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            android.support.v4.view.f r0 = r7.e
            if (r0 == 0) goto L_0x0155
            int r0 = r0.d()
            if (r0 != 0) goto L_0x0020
            goto L_0x0155
        L_0x0020:
            android.view.VelocityTracker r0 = r7.H
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.H = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.H
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x012f
            if (r0 == r1) goto L_0x00e2
            r3 = 2
            if (r0 == r3) goto L_0x0073
            r3 = 3
            if (r0 == r3) goto L_0x0068
            r3 = 5
            if (r0 == r3) goto L_0x0058
            r3 = 6
            if (r0 == r3) goto L_0x0047
            goto L_0x014f
        L_0x0047:
            r7.x(r8)
            int r0 = r7.G
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.C = r8
            goto L_0x014f
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.C = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x014d
        L_0x0068:
            boolean r8 = r7.x
            if (r8 == 0) goto L_0x014f
            int r8 = r7.f
            r7.I(r8, r1, r2, r2)
            goto L_0x012a
        L_0x0073:
            boolean r0 = r7.x
            if (r0 != 0) goto L_0x00ce
            int r0 = r7.G
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0082
            goto L_0x012a
        L_0x0082:
            float r3 = r8.getX(r0)
            float r4 = r7.C
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.D
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.B
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ce
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            r7.x = r1
            r7.G(r1)
            float r4 = r7.E
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            int r3 = r7.B
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bb
        L_0x00b7:
            int r3 = r7.B
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bb:
            r7.C = r4
            r7.D = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00ce:
            boolean r0 = r7.x
            if (r0 == 0) goto L_0x014f
            int r0 = r7.G
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.B(r8)
            r2 = r2 | r8
            goto L_0x014f
        L_0x00e2:
            boolean r0 = r7.x
            if (r0 == 0) goto L_0x014f
            android.view.VelocityTracker r0 = r7.H
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.J
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.G
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.v = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            android.support.v4.view.ViewPager$f r4 = r7.r()
            int r5 = r7.m
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f199b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.e
            float r3 = r3 - r2
            float r2 = r4.d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.G
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.E
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.g(r6, r3, r0, r8)
            r7.L(r8, r1, r1, r0)
        L_0x012a:
            boolean r2 = r7.H()
            goto L_0x014f
        L_0x012f:
            android.widget.Scroller r0 = r7.j
            r0.abortAnimation()
            r7.v = r2
            r7.C()
            float r0 = r8.getX()
            r7.E = r0
            r7.C = r0
            float r0 = r8.getY()
            r7.F = r0
            r7.D = r0
            int r8 = r8.getPointerId(r2)
        L_0x014d:
            r7.G = r8
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            android.support.v4.view.g.i(r7)
        L_0x0154:
            return r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public f p(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return q(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public f q(View view) {
        for (int i2 = 0; i2 < this.f194b.size(); i2++) {
            f fVar = this.f194b.get(i2);
            if (this.e.h(view, fVar.f198a)) {
                return fVar;
            }
        }
        return null;
    }

    public void removeView(View view) {
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    public f s(int i2) {
        for (int i3 = 0; i3 < this.f194b.size(); i3++) {
            f fVar = this.f194b.get(i3);
            if (fVar.f199b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(f fVar) {
        f fVar2 = this.e;
        if (fVar2 != null) {
            fVar2.m((DataSetObserver) null);
            this.e.o(this);
            for (int i2 = 0; i2 < this.f194b.size(); i2++) {
                f fVar3 = this.f194b.get(i2);
                this.e.a(this, fVar3.f199b, fVar3.f198a);
            }
            this.e.c(this);
            this.f194b.clear();
            F();
            this.f = 0;
            scrollTo(0, 0);
        }
        f fVar4 = this.e;
        this.e = fVar;
        this.f193a = 0;
        if (fVar != null) {
            if (this.l == null) {
                this.l = new l();
            }
            this.e.m(this.l);
            this.v = false;
            boolean z2 = this.P;
            this.P = true;
            this.f193a = this.e.d();
            if (this.g >= 0) {
                this.e.i(this.h, this.i);
                K(this.g, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (!z2) {
                C();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.V;
        if (list != null && !list.isEmpty()) {
            int size = this.V.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.V.get(i3).a(this, fVar4, fVar);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.v = false;
        K(i2, !this.P, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.w) {
            this.w = i2;
            C();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.T = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.m;
        this.m = i2;
        int width = getWidth();
        E(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(android.support.v4.content.a.a(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (this.e0 != i2) {
            this.e0 = i2;
            if (this.W != null) {
                l(i2 != 0);
            }
            j(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, h0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.I = (int) (400.0f * f2);
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.N = new EdgeEffect(context);
        this.O = new EdgeEffect(context);
        this.K = (int) (25.0f * f2);
        this.L = (int) (2.0f * f2);
        this.z = (int) (f2 * 16.0f);
        g.k(this, new h());
        if (g.d(this) == 0) {
            g.l(this, 1);
        }
        g.m(this, new d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.R
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.support.v4.view.ViewPager$g r9 = (android.support.v4.view.ViewPager.g) r9
            boolean r10 = r9.f200a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f201b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.h(r13, r14, r15)
            android.support.v4.view.ViewPager$k r13 = r12.W
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            android.support.v4.view.ViewPager$g r0 = (android.support.v4.view.ViewPager.g) r0
            boolean r0 = r0.f200a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            android.support.v4.view.ViewPager$k r3 = r12.W
            r3.a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.w(int, float, int):void");
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        int i2 = this.f;
        if (i2 <= 0) {
            return false;
        }
        J(i2 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        f fVar = this.e;
        if (fVar == null || this.f >= fVar.d() - 1) {
            return false;
        }
        J(this.f + 1, true);
        return true;
    }
}
