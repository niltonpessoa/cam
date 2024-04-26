package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public abstract class e<T extends View> extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f896a;

    /* renamed from: b  reason: collision with root package name */
    private float f897b;
    private float c;
    private float d;
    private float e;
    private boolean f = false;
    private m g = m.RESET;
    private C0046e h = C0046e.a();
    private C0046e i;
    T j;
    private FrameLayout k;
    private boolean l = true;
    private boolean m = false;
    private boolean n = true;
    private boolean o = true;
    private boolean p = true;
    /* access modifiers changed from: private */
    public Interpolator q;
    private d r = d.b();
    private com.handmark.pulltorefresh.library.f.d s;
    private com.handmark.pulltorefresh.library.f.d t;
    private i<T> u;
    private h<T> v;
    private g<T> w;
    private e<T>.l x;

    class a implements j {
        a() {
        }

        public void a() {
            e.this.f();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            e.this.requestLayout();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f900a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f901b;
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|(2:15|16)|17|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a4 */
        static {
            /*
                com.handmark.pulltorefresh.library.e$d[] r0 = com.handmark.pulltorefresh.library.e.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                d = r0
                r1 = 1
                com.handmark.pulltorefresh.library.e$d r2 = com.handmark.pulltorefresh.library.e.d.ROTATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.handmark.pulltorefresh.library.e$d r3 = com.handmark.pulltorefresh.library.e.d.FLIP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.handmark.pulltorefresh.library.e$e[] r2 = com.handmark.pulltorefresh.library.e.C0046e.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                c = r2
                com.handmark.pulltorefresh.library.e$e r3 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_END     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.handmark.pulltorefresh.library.e$e r3 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_START     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = c     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.handmark.pulltorefresh.library.e$e r4 = com.handmark.pulltorefresh.library.e.C0046e.MANUAL_REFRESH_ONLY     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                r3 = 4
                int[] r4 = c     // Catch:{ NoSuchFieldError -> 0x004e }
                com.handmark.pulltorefresh.library.e$e r5 = com.handmark.pulltorefresh.library.e.C0046e.BOTH     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.handmark.pulltorefresh.library.e$m[] r4 = com.handmark.pulltorefresh.library.e.m.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f901b = r4
                com.handmark.pulltorefresh.library.e$m r5 = com.handmark.pulltorefresh.library.e.m.RESET     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r4 = f901b     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.handmark.pulltorefresh.library.e$m r5 = com.handmark.pulltorefresh.library.e.m.PULL_TO_REFRESH     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r4 = f901b     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.handmark.pulltorefresh.library.e$m r5 = com.handmark.pulltorefresh.library.e.m.RELEASE_TO_REFRESH     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r2 = f901b     // Catch:{ NoSuchFieldError -> 0x007d }
                com.handmark.pulltorefresh.library.e$m r4 = com.handmark.pulltorefresh.library.e.m.REFRESHING     // Catch:{ NoSuchFieldError -> 0x007d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2[r4] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r2 = f901b     // Catch:{ NoSuchFieldError -> 0x0088 }
                com.handmark.pulltorefresh.library.e$m r3 = com.handmark.pulltorefresh.library.e.m.MANUAL_REFRESHING     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r2 = f901b     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.handmark.pulltorefresh.library.e$m r3 = com.handmark.pulltorefresh.library.e.m.OVERSCROLLING     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                com.handmark.pulltorefresh.library.e$k[] r2 = com.handmark.pulltorefresh.library.e.k.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f900a = r2
                com.handmark.pulltorefresh.library.e$k r3 = com.handmark.pulltorefresh.library.e.k.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                int[] r1 = f900a     // Catch:{ NoSuchFieldError -> 0x00ae }
                com.handmark.pulltorefresh.library.e$k r2 = com.handmark.pulltorefresh.library.e.k.VERTICAL     // Catch:{ NoSuchFieldError -> 0x00ae }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ae }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x00ae }
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.e.c.<clinit>():void");
        }
    }

    public enum d {
        ROTATE,
        FLIP;

        static d b() {
            return ROTATE;
        }

        static d c(int i) {
            return i != 1 ? ROTATE : FLIP;
        }

        /* access modifiers changed from: package-private */
        public com.handmark.pulltorefresh.library.f.d a(Context context, C0046e eVar, k kVar, TypedArray typedArray) {
            return c.d[ordinal()] != 2 ? new com.handmark.pulltorefresh.library.f.e(context, eVar, kVar, typedArray) : new com.handmark.pulltorefresh.library.f.b(context, eVar, kVar, typedArray);
        }
    }

    /* renamed from: com.handmark.pulltorefresh.library.e$e  reason: collision with other inner class name */
    public enum C0046e {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_FROM_END(2),
        BOTH(3),
        MANUAL_REFRESH_ONLY(4);
        

        /* renamed from: a  reason: collision with root package name */
        private int f905a;

        private C0046e(int i) {
            this.f905a = i;
        }

        static C0046e a() {
            return PULL_FROM_START;
        }

        static C0046e c(int i) {
            for (C0046e eVar : values()) {
                if (i == eVar.b()) {
                    return eVar;
                }
            }
            return a();
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f905a;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return (this == DISABLED || this == MANUAL_REFRESH_ONLY) ? false : true;
        }

        public boolean e() {
            return this == PULL_FROM_END || this == BOTH || this == MANUAL_REFRESH_ONLY;
        }

        public boolean f() {
            return this == PULL_FROM_START || this == BOTH;
        }
    }

    public interface f {
        void a();
    }

    public interface g<V extends View> {
        void a(e<V> eVar, m mVar, C0046e eVar2);
    }

    public interface h<V extends View> {
        void a(e<V> eVar);

        void b(e<V> eVar);
    }

    public interface i<V extends View> {
        void a(e<V> eVar);
    }

    interface j {
        void a();
    }

    public enum k {
        VERTICAL,
        HORIZONTAL
    }

    final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Interpolator f908a;

        /* renamed from: b  reason: collision with root package name */
        private final int f909b;
        private final int c;
        private final long d;
        private j e;
        private boolean f = true;
        private long g = -1;
        private int h = -1;

        public l(int i2, int i3, long j, j jVar) {
            this.c = i2;
            this.f909b = i3;
            this.f908a = e.this.q;
            this.d = j;
            this.e = jVar;
        }

        public void a() {
            this.f = false;
            e.this.removeCallbacks(this);
        }

        public void run() {
            int i2 = (this.g > -1 ? 1 : (this.g == -1 ? 0 : -1));
            long currentTimeMillis = System.currentTimeMillis();
            if (i2 == 0) {
                this.g = currentTimeMillis;
            } else {
                int round = this.c - Math.round(((float) (this.c - this.f909b)) * this.f908a.getInterpolation(((float) Math.max(Math.min(((currentTimeMillis - this.g) * 1000) / this.d, 1000), 0)) / 1000.0f));
                this.h = round;
                e.this.setHeaderScroll(round);
            }
            if (!this.f || this.f909b == this.h) {
                j jVar = this.e;
                if (jVar != null) {
                    jVar.a();
                    return;
                }
                return;
            }
            com.handmark.pulltorefresh.library.f.g.a(e.this, this);
        }
    }

    public enum m {
        RESET(0),
        PULL_TO_REFRESH(1),
        RELEASE_TO_REFRESH(2),
        REFRESHING(8),
        MANUAL_REFRESHING(9),
        OVERSCROLLING(16);
        

        /* renamed from: a  reason: collision with root package name */
        private int f911a;

        private m(int i) {
            this.f911a = i;
        }

        static m b(int i) {
            for (m mVar : values()) {
                if (i == mVar.a()) {
                    return mVar;
                }
            }
            return RESET;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f911a;
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(context, attributeSet);
    }

    private final void F(int i2, long j2) {
        G(i2, j2, 0, (j) null);
    }

    private final void G(int i2, long j2, long j3, j jVar) {
        e<T>.l lVar = this.x;
        if (lVar != null) {
            lVar.a();
        }
        int scrollY = c.f900a[getPullToRefreshScrollDirection().ordinal()] != 1 ? getScrollY() : getScrollX();
        if (scrollY != i2) {
            if (this.q == null) {
                this.q = new DecelerateInterpolator();
            }
            l lVar2 = new l(scrollY, i2, j2, jVar);
            this.x = lVar2;
            if (j3 > 0) {
                postDelayed(lVar2, j3);
            } else {
                post(lVar2);
            }
        }
    }

    private void c(Context context, T t2) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.k = frameLayout;
        frameLayout.addView(t2, -1, -1);
        e(this.k, new LinearLayout.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: private */
    public void f() {
        i<T> iVar = this.u;
        if (iVar != null) {
            iVar.a(this);
            return;
        }
        h<T> hVar = this.v;
        if (hVar != null) {
            C0046e eVar = this.i;
            if (eVar == C0046e.PULL_FROM_START) {
                hVar.b(this);
            } else if (eVar == C0046e.PULL_FROM_END) {
                hVar.a(this);
            }
        }
    }

    private LinearLayout.LayoutParams getLoadingLayoutLayoutParams() {
        return c.f900a[getPullToRefreshScrollDirection().ordinal()] != 1 ? new LinearLayout.LayoutParams(-1, -2) : new LinearLayout.LayoutParams(-2, -1);
    }

    private int getMaximumPullScroll() {
        return Math.round(((float) (c.f900a[getPullToRefreshScrollDirection().ordinal()] != 1 ? getHeight() : getWidth())) / 2.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0073, code lost:
        if (r6 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        if (r6 != null) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int[] r0 = com.handmark.pulltorefresh.library.e.c.f900a
            com.handmark.pulltorefresh.library.e$k r1 = r5.getPullToRefreshScrollDirection()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0014
            r5.setOrientation(r1)
            goto L_0x0017
        L_0x0014:
            r5.setOrientation(r2)
        L_0x0017:
            r0 = 17
            r5.setGravity(r0)
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r6)
            int r0 = r0.getScaledTouchSlop()
            r5.f896a = r0
            int[] r0 = b.c.a.a.a.f825a
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r7, r0)
            r3 = 12
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L_0x003e
            int r3 = r0.getInteger(r3, r2)
            com.handmark.pulltorefresh.library.e$e r3 = com.handmark.pulltorefresh.library.e.C0046e.c(r3)
            r5.h = r3
        L_0x003e:
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L_0x004e
            int r3 = r0.getInteger(r1, r2)
            com.handmark.pulltorefresh.library.e$d r3 = com.handmark.pulltorefresh.library.e.d.c(r3)
            r5.r = r3
        L_0x004e:
            android.view.View r7 = r5.i(r6, r7)
            r5.j = r7
            r5.c(r6, r7)
            com.handmark.pulltorefresh.library.e$e r7 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_START
            com.handmark.pulltorefresh.library.f.d r7 = r5.g(r6, r7, r0)
            r5.s = r7
            com.handmark.pulltorefresh.library.e$e r7 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_END
            com.handmark.pulltorefresh.library.f.d r6 = r5.g(r6, r7, r0)
            r5.t = r6
            r6 = 14
            boolean r7 = r0.hasValue(r6)
            if (r7 == 0) goto L_0x0076
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r6)
            if (r6 == 0) goto L_0x008e
            goto L_0x0089
        L_0x0076:
            boolean r6 = r0.hasValue(r2)
            if (r6 == 0) goto L_0x008e
            java.lang.String r6 = "ptrAdapterViewBackground"
            java.lang.String r7 = "ptrRefreshableViewBackground"
            com.handmark.pulltorefresh.library.f.f.a(r6, r7)
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r2)
            if (r6 == 0) goto L_0x008e
        L_0x0089:
            T r7 = r5.j
            r7.setBackgroundDrawable(r6)
        L_0x008e:
            r6 = 13
            boolean r7 = r0.hasValue(r6)
            if (r7 == 0) goto L_0x009c
            boolean r6 = r0.getBoolean(r6, r1)
            r5.o = r6
        L_0x009c:
            r6 = 16
            boolean r7 = r0.hasValue(r6)
            if (r7 == 0) goto L_0x00aa
            boolean r6 = r0.getBoolean(r6, r2)
            r5.m = r6
        L_0x00aa:
            r5.k(r0)
            r0.recycle()
            r5.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.e.l(android.content.Context, android.util.AttributeSet):void");
    }

    private boolean o() {
        int i2 = c.c[this.h.ordinal()];
        if (i2 == 1) {
            return p();
        }
        if (i2 == 2) {
            return q();
        }
        if (i2 != 4) {
            return false;
        }
        return p() || q();
    }

    private void z() {
        float f2;
        float f3;
        int i2;
        int i3;
        if (c.f900a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            f3 = this.e;
            f2 = this.c;
        } else {
            f3 = this.d;
            f2 = this.f897b;
        }
        int[] iArr = c.c;
        float f4 = f3 - f2;
        if (iArr[this.i.ordinal()] != 1) {
            i3 = Math.round(Math.min(f4, 0.0f) / 2.0f);
            i2 = getHeaderSize();
        } else {
            i3 = Math.round(Math.max(f4, 0.0f) / 2.0f);
            i2 = getFooterSize();
        }
        setHeaderScroll(i3);
        if (i3 != 0 && !r()) {
            (iArr[this.i.ordinal()] != 1 ? this.s : this.t).b(((float) Math.abs(i3)) / ((float) i2));
            m mVar = this.g;
            m mVar2 = m.PULL_TO_REFRESH;
            if (mVar != mVar2 && i2 >= Math.abs(i3)) {
                D(mVar2, new boolean[0]);
            } else if (this.g == mVar2 && i2 < Math.abs(i3)) {
                D(m.RELEASE_TO_REFRESH, new boolean[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void A() {
        int maximumPullScroll = (int) (((float) getMaximumPullScroll()) * 1.2f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i2 = c.f900a[getPullToRefreshScrollDirection().ordinal()];
        if (i2 == 1) {
            if (this.h.f()) {
                this.s.setWidth(maximumPullScroll);
                paddingLeft = -maximumPullScroll;
            } else {
                paddingLeft = 0;
            }
            if (this.h.e()) {
                this.t.setWidth(maximumPullScroll);
                paddingRight = -maximumPullScroll;
            } else {
                paddingRight = 0;
            }
        } else if (i2 == 2) {
            if (this.h.f()) {
                this.s.setHeight(maximumPullScroll);
                paddingTop = -maximumPullScroll;
            } else {
                paddingTop = 0;
            }
            if (this.h.e()) {
                this.t.setHeight(maximumPullScroll);
                paddingBottom = -maximumPullScroll;
            } else {
                paddingBottom = 0;
            }
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* access modifiers changed from: protected */
    public final void B(int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
        int i4 = c.f900a[getPullToRefreshScrollDirection().ordinal()];
        if (i4 != 1) {
            if (i4 == 2 && layoutParams.height != i3) {
                layoutParams.height = i3;
            } else {
                return;
            }
        } else if (layoutParams.width != i2) {
            layoutParams.width = i2;
        } else {
            return;
        }
        this.k.requestLayout();
    }

    public void C(CharSequence charSequence, C0046e eVar) {
        j(eVar.f(), eVar.e()).setReleaseLabel(charSequence);
    }

    /* access modifiers changed from: package-private */
    public final void D(m mVar, boolean... zArr) {
        this.g = mVar;
        int i2 = c.f901b[mVar.ordinal()];
        if (i2 == 1) {
            y();
        } else if (i2 == 2) {
            u();
        } else if (i2 == 3) {
            x();
        } else if (i2 == 4 || i2 == 5) {
            w(zArr[0]);
        }
        g<T> gVar = this.w;
        if (gVar != null) {
            gVar.a(this, this.g, this.i);
        }
    }

    /* access modifiers changed from: protected */
    public final void E(int i2) {
        F(i2, (long) getPullToRefreshScrollDuration());
    }

    /* access modifiers changed from: protected */
    public final void H(int i2, j jVar) {
        G(i2, (long) getPullToRefreshScrollDuration(), 0, jVar);
    }

    /* access modifiers changed from: protected */
    public void I() {
        LinearLayout.LayoutParams loadingLayoutLayoutParams = getLoadingLayoutLayoutParams();
        if (this == this.s.getParent()) {
            removeView(this.s);
        }
        if (this.h.f()) {
            d(this.s, 0, loadingLayoutLayoutParams);
        }
        if (this == this.t.getParent()) {
            removeView(this.t);
        }
        if (this.h.e()) {
            e(this.t, loadingLayoutLayoutParams);
        }
        A();
        C0046e eVar = this.h;
        if (eVar == C0046e.BOTH) {
            eVar = C0046e.PULL_FROM_START;
        }
        this.i = eVar;
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        View refreshableView = getRefreshableView();
        if (refreshableView instanceof ViewGroup) {
            ((ViewGroup) refreshableView).addView(view, i2, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
    }

    /* access modifiers changed from: protected */
    public final void d(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void e(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, -1, layoutParams);
    }

    /* access modifiers changed from: protected */
    public com.handmark.pulltorefresh.library.f.d g(Context context, C0046e eVar, TypedArray typedArray) {
        com.handmark.pulltorefresh.library.f.d a2 = this.r.a(context, eVar, getPullToRefreshScrollDirection(), typedArray);
        a2.setVisibility(4);
        return a2;
    }

    public final C0046e getCurrentMode() {
        return this.i;
    }

    public final boolean getFilterTouchEvents() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final com.handmark.pulltorefresh.library.f.d getFooterLayout() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public final int getFooterSize() {
        return this.t.getContentSize();
    }

    /* access modifiers changed from: protected */
    public final com.handmark.pulltorefresh.library.f.d getHeaderLayout() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public final int getHeaderSize() {
        return this.s.getContentSize();
    }

    public final a getLoadingLayoutProxy() {
        return j(true, true);
    }

    public final C0046e getMode() {
        return this.h;
    }

    public abstract k getPullToRefreshScrollDirection();

    /* access modifiers changed from: protected */
    public int getPullToRefreshScrollDuration() {
        return 200;
    }

    /* access modifiers changed from: protected */
    public int getPullToRefreshScrollDurationLonger() {
        return 325;
    }

    public final T getRefreshableView() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public FrameLayout getRefreshableViewWrapper() {
        return this.k;
    }

    public final boolean getShowViewWhileRefreshing() {
        return this.l;
    }

    public final m getState() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public b h(boolean z, boolean z2) {
        b bVar = new b();
        if (z && this.h.f()) {
            bVar.a(this.s);
        }
        if (z2 && this.h.e()) {
            bVar.a(this.t);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public abstract T i(Context context, AttributeSet attributeSet);

    public final a j(boolean z, boolean z2) {
        return h(z, z2);
    }

    /* access modifiers changed from: protected */
    public void k(TypedArray typedArray) {
    }

    public final boolean m() {
        return this.h.d();
    }

    public final boolean n() {
        return Build.VERSION.SDK_INT >= 9 && this.o && c.a(this.j);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        C0046e eVar;
        if (!m()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f = false;
            return false;
        } else if (action != 0 && this.f) {
            return true;
        } else {
            if (action != 0) {
                if (action == 2) {
                    if (!this.m && r()) {
                        return true;
                    }
                    if (o()) {
                        float y = motionEvent.getY();
                        float x2 = motionEvent.getX();
                        if (c.f900a[getPullToRefreshScrollDirection().ordinal()] != 1) {
                            f3 = y - this.c;
                            f2 = x2 - this.f897b;
                        } else {
                            f3 = x2 - this.f897b;
                            f2 = y - this.c;
                        }
                        float abs = Math.abs(f3);
                        if (abs > ((float) this.f896a) && (!this.n || abs > Math.abs(f2))) {
                            if (this.h.f() && f3 >= 1.0f && q()) {
                                this.c = y;
                                this.f897b = x2;
                                this.f = true;
                                if (this.h == C0046e.BOTH) {
                                    eVar = C0046e.PULL_FROM_START;
                                }
                            } else if (this.h.e() && f3 <= -1.0f && p()) {
                                this.c = y;
                                this.f897b = x2;
                                this.f = true;
                                if (this.h == C0046e.BOTH) {
                                    eVar = C0046e.PULL_FROM_END;
                                }
                            }
                            this.i = eVar;
                        }
                    }
                }
            } else if (o()) {
                float y2 = motionEvent.getY();
                this.e = y2;
                this.c = y2;
                float x3 = motionEvent.getX();
                this.d = x3;
                this.f897b = x3;
                this.f = false;
            }
            return this.f;
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setMode(C0046e.c(bundle.getInt("ptr_mode", 0)));
            this.i = C0046e.c(bundle.getInt("ptr_current_mode", 0));
            this.m = bundle.getBoolean("ptr_disable_scrolling", false);
            this.l = bundle.getBoolean("ptr_show_refreshing_view", true);
            super.onRestoreInstanceState(bundle.getParcelable("ptr_super"));
            m b2 = m.b(bundle.getInt("ptr_state", 0));
            if (b2 == m.REFRESHING || b2 == m.MANUAL_REFRESHING) {
                D(b2, true);
            }
            s(bundle);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        t(bundle);
        bundle.putInt("ptr_state", this.g.a());
        bundle.putInt("ptr_mode", this.h.b());
        bundle.putInt("ptr_current_mode", this.i.b());
        bundle.putBoolean("ptr_disable_scrolling", this.m);
        bundle.putBoolean("ptr_show_refreshing_view", this.l);
        bundle.putParcelable("ptr_super", super.onSaveInstanceState());
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        A();
        B(i2, i3);
        post(new b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        if (r0 != 3) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.m()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r4.m
            r2 = 1
            if (r0 != 0) goto L_0x0014
            boolean r0 = r4.r()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x0021
            int r0 = r5.getEdgeFlags()
            if (r0 == 0) goto L_0x0021
            return r1
        L_0x0021:
            int r0 = r5.getAction()
            if (r0 == 0) goto L_0x0074
            if (r0 == r2) goto L_0x0044
            r3 = 2
            if (r0 == r3) goto L_0x0030
            r5 = 3
            if (r0 == r5) goto L_0x0044
            goto L_0x008b
        L_0x0030:
            boolean r0 = r4.f
            if (r0 == 0) goto L_0x008b
            float r0 = r5.getY()
            r4.c = r0
            float r5 = r5.getX()
            r4.f897b = r5
            r4.z()
            return r2
        L_0x0044:
            boolean r5 = r4.f
            if (r5 == 0) goto L_0x008b
            r4.f = r1
            com.handmark.pulltorefresh.library.e$m r5 = r4.g
            com.handmark.pulltorefresh.library.e$m r0 = com.handmark.pulltorefresh.library.e.m.RELEASE_TO_REFRESH
            if (r5 != r0) goto L_0x0062
            com.handmark.pulltorefresh.library.e$i<T> r5 = r4.u
            if (r5 != 0) goto L_0x0058
            com.handmark.pulltorefresh.library.e$h<T> r5 = r4.v
            if (r5 == 0) goto L_0x0062
        L_0x0058:
            com.handmark.pulltorefresh.library.e$m r5 = com.handmark.pulltorefresh.library.e.m.REFRESHING
            boolean[] r0 = new boolean[r2]
            r0[r1] = r2
            r4.D(r5, r0)
            return r2
        L_0x0062:
            boolean r5 = r4.r()
            if (r5 == 0) goto L_0x006c
            r4.E(r1)
            return r2
        L_0x006c:
            com.handmark.pulltorefresh.library.e$m r5 = com.handmark.pulltorefresh.library.e.m.RESET
            boolean[] r0 = new boolean[r1]
            r4.D(r5, r0)
            return r2
        L_0x0074:
            boolean r0 = r4.o()
            if (r0 == 0) goto L_0x008b
            float r0 = r5.getY()
            r4.e = r0
            r4.c = r0
            float r5 = r5.getX()
            r4.d = r5
            r4.f897b = r5
            return r2
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract boolean p();

    /* access modifiers changed from: protected */
    public abstract boolean q();

    public final boolean r() {
        m mVar = this.g;
        return mVar == m.REFRESHING || mVar == m.MANUAL_REFRESHING;
    }

    /* access modifiers changed from: protected */
    public void s(Bundle bundle) {
    }

    public void setDisableScrollingWhileRefreshing(boolean z) {
        setScrollingWhileRefreshingEnabled(!z);
    }

    public final void setFilterTouchEvents(boolean z) {
        this.n = z;
    }

    /* access modifiers changed from: protected */
    public final void setHeaderScroll(int i2) {
        com.handmark.pulltorefresh.library.f.d dVar;
        int maximumPullScroll = getMaximumPullScroll();
        int min = Math.min(maximumPullScroll, Math.max(-maximumPullScroll, i2));
        if (this.p) {
            if (min < 0) {
                dVar = this.s;
            } else if (min > 0) {
                dVar = this.t;
            } else {
                this.s.setVisibility(4);
                this.t.setVisibility(4);
            }
            dVar.setVisibility(0);
        }
        int i3 = c.f900a[getPullToRefreshScrollDirection().ordinal()];
        if (i3 == 1) {
            scrollTo(min, 0);
        } else if (i3 == 2) {
            scrollTo(0, min);
        }
    }

    public void setLastUpdatedLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setLastUpdatedLabel(charSequence);
    }

    public void setLoadingDrawable(Drawable drawable) {
        getLoadingLayoutProxy().setLoadingDrawable(drawable);
    }

    public void setLongClickable(boolean z) {
        getRefreshableView().setLongClickable(z);
    }

    public final void setMode(C0046e eVar) {
        if (eVar != this.h) {
            this.h = eVar;
            I();
        }
    }

    public void setOnPullEventListener(g<T> gVar) {
        this.w = gVar;
    }

    public final void setOnRefreshListener(h<T> hVar) {
        this.v = hVar;
        this.u = null;
    }

    public final void setOnRefreshListener(i<T> iVar) {
        this.u = iVar;
        this.v = null;
    }

    public void setPullLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setPullLabel(charSequence);
    }

    public final void setPullToRefreshEnabled(boolean z) {
        setMode(z ? C0046e.a() : C0046e.DISABLED);
    }

    public final void setPullToRefreshOverScrollEnabled(boolean z) {
        this.o = z;
    }

    public final void setRefreshing(boolean z) {
        if (!r()) {
            D(m.MANUAL_REFRESHING, z);
        }
    }

    public void setRefreshingLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setRefreshingLabel(charSequence);
    }

    public void setReleaseLabel(CharSequence charSequence) {
        C(charSequence, C0046e.BOTH);
    }

    public void setScrollAnimationInterpolator(Interpolator interpolator) {
        this.q = interpolator;
    }

    public final void setScrollingWhileRefreshingEnabled(boolean z) {
        this.m = z;
    }

    public final void setShowViewWhileRefreshing(boolean z) {
        this.l = z;
    }

    /* access modifiers changed from: protected */
    public void t(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void u() {
        com.handmark.pulltorefresh.library.f.d dVar;
        int i2 = c.c[this.i.ordinal()];
        if (i2 == 1) {
            dVar = this.t;
        } else if (i2 == 2) {
            dVar = this.s;
        } else {
            return;
        }
        dVar.d();
    }

    public final void v() {
        if (r()) {
            D(m.RESET, new boolean[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void w(boolean z) {
        if (this.h.f()) {
            this.s.f();
        }
        if (this.h.e()) {
            this.t.f();
        }
        if (!z) {
            f();
        } else if (this.l) {
            a aVar = new a();
            int i2 = c.c[this.i.ordinal()];
            H((i2 == 1 || i2 == 3) ? getFooterSize() : -getHeaderSize(), aVar);
        } else {
            E(0);
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        com.handmark.pulltorefresh.library.f.d dVar;
        int i2 = c.c[this.i.ordinal()];
        if (i2 == 1) {
            dVar = this.t;
        } else if (i2 == 2) {
            dVar = this.s;
        } else {
            return;
        }
        dVar.h();
    }

    /* access modifiers changed from: protected */
    public void y() {
        this.f = false;
        this.p = true;
        this.s.j();
        this.t.j();
        E(0);
    }
}
