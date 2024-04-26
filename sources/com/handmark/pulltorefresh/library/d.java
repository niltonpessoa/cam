package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.handmark.pulltorefresh.library.e;
import com.handmark.pulltorefresh.library.f.c;
import com.xforce.v5.xdvpro.R;

public abstract class d<T extends AbsListView> extends e<T> implements AbsListView.OnScrollListener {
    private e.f A;
    private View B;
    private c C;
    private c D;
    private boolean E;
    private boolean F = true;
    private boolean y;
    private AbsListView.OnScrollListener z;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f895a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.handmark.pulltorefresh.library.e$e[] r0 = com.handmark.pulltorefresh.library.e.C0046e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f895a = r0
                com.handmark.pulltorefresh.library.e$e r1 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_END     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f895a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.handmark.pulltorefresh.library.e$e r1 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.d.a.<clinit>():void");
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((AbsListView) this.j).setOnScrollListener(this);
    }

    private void J() {
        c cVar;
        c cVar2;
        e.C0046e mode = getMode();
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (mode.f() && this.C == null) {
            this.C = new c(getContext(), e.C0046e.PULL_FROM_START);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.indicator_right_padding);
            layoutParams.gravity = 53;
            refreshableViewWrapper.addView(this.C, layoutParams);
        } else if (!mode.f() && (cVar2 = this.C) != null) {
            refreshableViewWrapper.removeView(cVar2);
            this.C = null;
        }
        if (mode.e() && this.D == null) {
            this.D = new c(getContext(), e.C0046e.PULL_FROM_END);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = getResources().getDimensionPixelSize(R.dimen.indicator_right_padding);
            layoutParams2.gravity = 85;
            refreshableViewWrapper.addView(this.D, layoutParams2);
        } else if (!mode.e() && (cVar = this.D) != null) {
            refreshableViewWrapper.removeView(cVar);
            this.D = null;
        }
    }

    private static FrameLayout.LayoutParams K(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = layoutParams instanceof LinearLayout.LayoutParams ? ((LinearLayout.LayoutParams) layoutParams).gravity : 17;
        return layoutParams2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r0 = ((android.widget.AbsListView) r4.j).getChildAt(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean L() {
        /*
            r4 = this;
            T r0 = r4.j
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            android.widget.Adapter r0 = r0.getAdapter()
            r1 = 1
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0012
            goto L_0x0039
        L_0x0012:
            T r0 = r4.j
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            int r0 = r0.getFirstVisiblePosition()
            r2 = 0
            if (r0 > r1) goto L_0x0038
            T r0 = r4.j
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            android.view.View r0 = r0.getChildAt(r2)
            if (r0 == 0) goto L_0x0038
            int r0 = r0.getTop()
            T r3 = r4.j
            android.widget.AbsListView r3 = (android.widget.AbsListView) r3
            int r3 = r3.getTop()
            if (r0 < r3) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            return r1
        L_0x0038:
            return r2
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.d.L():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r0 = ((android.widget.AbsListView) r4.j).getChildAt(r2 - ((android.widget.AbsListView) r4.j).getFirstVisiblePosition());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean N() {
        /*
            r4 = this;
            T r0 = r4.j
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            android.widget.Adapter r0 = r0.getAdapter()
            r1 = 1
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0012
            goto L_0x004c
        L_0x0012:
            T r0 = r4.j
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            int r0 = r0.getCount()
            int r0 = r0 - r1
            T r2 = r4.j
            android.widget.AbsListView r2 = (android.widget.AbsListView) r2
            int r2 = r2.getLastVisiblePosition()
            int r0 = r0 - r1
            r3 = 0
            if (r2 < r0) goto L_0x004b
            T r0 = r4.j
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            int r0 = r0.getFirstVisiblePosition()
            int r2 = r2 - r0
            T r0 = r4.j
            android.widget.AbsListView r0 = (android.widget.AbsListView) r0
            android.view.View r0 = r0.getChildAt(r2)
            if (r0 == 0) goto L_0x004b
            int r0 = r0.getBottom()
            T r2 = r4.j
            android.widget.AbsListView r2 = (android.widget.AbsListView) r2
            int r2 = r2.getBottom()
            if (r0 > r2) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            return r1
        L_0x004b:
            return r3
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.d.N():boolean");
    }

    private void O() {
        if (this.C != null) {
            getRefreshableViewWrapper().removeView(this.C);
            this.C = null;
        }
        if (this.D != null) {
            getRefreshableViewWrapper().removeView(this.D);
            this.D = null;
        }
    }

    private void P() {
        if (this.C != null) {
            if (r() || !q()) {
                if (this.C.b()) {
                    this.C.a();
                }
            } else if (!this.C.b()) {
                this.C.e();
            }
        }
        if (this.D == null) {
            return;
        }
        if (r() || !p()) {
            if (this.D.b()) {
                this.D.a();
            }
        } else if (!this.D.b()) {
            this.D.e();
        }
    }

    private boolean getShowIndicatorInternal() {
        return this.E && m();
    }

    /* access modifiers changed from: protected */
    public void I() {
        super.I();
        if (getShowIndicatorInternal()) {
            J();
        } else {
            O();
        }
    }

    public boolean M() {
        return getHeaderLayout().isShown();
    }

    public boolean getShowIndicator() {
        return this.E;
    }

    /* access modifiers changed from: protected */
    public void k(TypedArray typedArray) {
        this.E = typedArray.getBoolean(17, !n());
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.A != null) {
            this.y = i3 > 0 && i + i2 >= i3 + -1;
        }
        if (getShowIndicatorInternal()) {
            P();
        }
        AbsListView.OnScrollListener onScrollListener = this.z;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        View view = this.B;
        if (view != null && !this.F) {
            view.scrollTo(-i, -i2);
        }
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        e.f fVar;
        if (i == 0 && (fVar = this.A) != null && this.y) {
            fVar.a();
        }
        AbsListView.OnScrollListener onScrollListener = this.z;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean p() {
        return N();
    }

    /* access modifiers changed from: protected */
    public boolean q() {
        return L();
    }

    public void setAdapter(ListAdapter listAdapter) {
        ((AdapterView) this.j).setAdapter(listAdapter);
    }

    public final void setEmptyView(View view) {
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (view != null) {
            view.setClickable(true);
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            FrameLayout.LayoutParams K = K(view.getLayoutParams());
            if (K != null) {
                refreshableViewWrapper.addView(view, K);
            } else {
                refreshableViewWrapper.addView(view);
            }
        }
        T t = this.j;
        if (t instanceof com.handmark.pulltorefresh.library.f.a) {
            ((com.handmark.pulltorefresh.library.f.a) t).a(view);
        } else {
            ((AbsListView) t).setEmptyView(view);
        }
        this.B = view;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        ((AbsListView) this.j).setOnItemClickListener(onItemClickListener);
    }

    public final void setOnLastItemVisibleListener(e.f fVar) {
        this.A = fVar;
    }

    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.z = onScrollListener;
    }

    public final void setScrollEmptyView(boolean z2) {
        this.F = z2;
    }

    public void setShowIndicator(boolean z2) {
        this.E = z2;
        if (getShowIndicatorInternal()) {
            J();
        } else {
            O();
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        c cVar;
        super.u();
        if (getShowIndicatorInternal()) {
            int i = a.f895a[getCurrentMode().ordinal()];
            if (i == 1) {
                cVar = this.D;
            } else if (i == 2) {
                cVar = this.C;
            } else {
                return;
            }
            cVar.c();
        }
    }

    /* access modifiers changed from: protected */
    public void w(boolean z2) {
        super.w(z2);
        if (getShowIndicatorInternal()) {
            P();
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        c cVar;
        super.x();
        if (getShowIndicatorInternal()) {
            int i = a.f895a[getCurrentMode().ordinal()];
            if (i == 1) {
                cVar = this.D;
            } else if (i == 2) {
                cVar = this.C;
            } else {
                return;
            }
            cVar.d();
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        if (getShowIndicatorInternal()) {
            P();
        }
    }
}
