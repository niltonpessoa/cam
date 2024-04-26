package com.handmark.pulltorefresh.library.f;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.handmark.pulltorefresh.library.e;

@SuppressLint({"ViewConstructor"})
public abstract class d extends FrameLayout implements com.handmark.pulltorefresh.library.a {
    static final Interpolator f = new LinearInterpolator();

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f916a;

    /* renamed from: b  reason: collision with root package name */
    protected final ImageView f917b;
    private boolean c;
    protected final e.C0046e d;
    protected final e.k e;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f918a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f919b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.handmark.pulltorefresh.library.e$e[] r0 = com.handmark.pulltorefresh.library.e.C0046e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f919b = r0
                r1 = 1
                com.handmark.pulltorefresh.library.e$e r2 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_END     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f919b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.handmark.pulltorefresh.library.e$e r3 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.handmark.pulltorefresh.library.e$k[] r2 = com.handmark.pulltorefresh.library.e.k.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f918a = r2
                com.handmark.pulltorefresh.library.e$k r3 = com.handmark.pulltorefresh.library.e.k.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f918a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.handmark.pulltorefresh.library.e$k r2 = com.handmark.pulltorefresh.library.e.k.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.f.d.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0138  */
    @android.annotation.SuppressLint({"ResourceAsColor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r7, com.handmark.pulltorefresh.library.e.C0046e r8, com.handmark.pulltorefresh.library.e.k r9, android.content.res.TypedArray r10) {
        /*
            r6 = this;
            r6.<init>(r7)
            r6.d = r8
            r6.e = r9
            int[] r0 = com.handmark.pulltorefresh.library.f.d.a.f918a
            int r1 = r9.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x001a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            r2 = 2131361853(0x7f0a003d, float:1.834347E38)
            goto L_0x0021
        L_0x001a:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r7)
            r2 = 2131361852(0x7f0a003c, float:1.8343468E38)
        L_0x0021:
            r0.inflate(r2, r6)
            r0 = 2131230820(0x7f080064, float:1.8077704E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.f916a = r0
            r2 = 2131230930(0x7f0800d2, float:1.8077927E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f917b = r0
            android.widget.FrameLayout r0 = r6.f916a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int[] r2 = com.handmark.pulltorefresh.library.f.d.a.f919b
            int r3 = r8.ordinal()
            r3 = r2[r3]
            r4 = 5
            r5 = 3
            if (r3 == r1) goto L_0x0068
            com.handmark.pulltorefresh.library.e$k r3 = com.handmark.pulltorefresh.library.e.k.VERTICAL
            if (r9 != r3) goto L_0x0055
            r9 = 80
            goto L_0x0056
        L_0x0055:
            r9 = 5
        L_0x0056:
            r0.gravity = r9
            r9 = 2131493047(0x7f0c00b7, float:1.8609563E38)
            r7.getString(r9)
            r9 = 2131493048(0x7f0c00b8, float:1.8609565E38)
            r7.getString(r9)
            r9 = 2131493049(0x7f0c00b9, float:1.8609567E38)
            goto L_0x0081
        L_0x0068:
            com.handmark.pulltorefresh.library.e$k r3 = com.handmark.pulltorefresh.library.e.k.VERTICAL
            if (r9 != r3) goto L_0x006f
            r9 = 48
            goto L_0x0070
        L_0x006f:
            r9 = 3
        L_0x0070:
            r0.gravity = r9
            r9 = 2131493044(0x7f0c00b4, float:1.8609557E38)
            r7.getString(r9)
            r9 = 2131493045(0x7f0c00b5, float:1.860956E38)
            r7.getString(r9)
            r9 = 2131493046(0x7f0c00b6, float:1.8609561E38)
        L_0x0081:
            r7.getString(r9)
            r9 = 7
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x009f
            android.graphics.drawable.Drawable r9 = r10.getDrawable(r9)
            if (r9 == 0) goto L_0x009f
            android.content.res.Resources r9 = r6.getResources()
            r0 = 2131034162(0x7f050032, float:1.7678834E38)
            int r9 = r9.getColor(r0)
            com.handmark.pulltorefresh.library.f.g.b(r6, r9)
        L_0x009f:
            r9 = 9
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x00b4
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.getValue(r9, r0)
            int r9 = r0.data
            r6.setTextAppearance(r9)
        L_0x00b4:
            r9 = 18
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x00c9
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.getValue(r9, r0)
            int r9 = r0.data
            r6.setSubTextAppearance(r9)
        L_0x00c9:
            r9 = 10
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x00da
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            if (r9 == 0) goto L_0x00da
            r6.setTextColor(r9)
        L_0x00da:
            r9 = 8
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x00eb
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            if (r9 == 0) goto L_0x00eb
            r6.setSubTextColor(r9)
        L_0x00eb:
            r9 = 0
            r0 = 2
            boolean r3 = r10.hasValue(r0)
            if (r3 == 0) goto L_0x00f7
            android.graphics.drawable.Drawable r9 = r10.getDrawable(r0)
        L_0x00f7:
            int r8 = r8.ordinal()
            r8 = r2[r8]
            if (r8 == r1) goto L_0x0119
            boolean r8 = r10.hasValue(r4)
            if (r8 == 0) goto L_0x010a
            android.graphics.drawable.Drawable r9 = r10.getDrawable(r4)
            goto L_0x0136
        L_0x010a:
            r8 = 6
            boolean r0 = r10.hasValue(r8)
            if (r0 == 0) goto L_0x0136
            java.lang.String r9 = "ptrDrawableTop"
            java.lang.String r0 = "ptrDrawableStart"
            com.handmark.pulltorefresh.library.f.f.a(r9, r0)
            goto L_0x0120
        L_0x0119:
            r8 = 4
            boolean r0 = r10.hasValue(r8)
            if (r0 == 0) goto L_0x0125
        L_0x0120:
            android.graphics.drawable.Drawable r9 = r10.getDrawable(r8)
            goto L_0x0136
        L_0x0125:
            boolean r8 = r10.hasValue(r5)
            if (r8 == 0) goto L_0x0136
            java.lang.String r8 = "ptrDrawableBottom"
            java.lang.String r9 = "ptrDrawableEnd"
            com.handmark.pulltorefresh.library.f.f.a(r8, r9)
            android.graphics.drawable.Drawable r9 = r10.getDrawable(r5)
        L_0x0136:
            if (r9 != 0) goto L_0x0144
            android.content.res.Resources r7 = r7.getResources()
            int r8 = r6.getDefaultDrawableResId()
            android.graphics.drawable.Drawable r9 = r7.getDrawable(r8)
        L_0x0144:
            r6.setLoadingDrawable(r9)
            r6.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.f.d.<init>(android.content.Context, com.handmark.pulltorefresh.library.e$e, com.handmark.pulltorefresh.library.e$k, android.content.res.TypedArray):void");
    }

    private void setSubHeaderText(CharSequence charSequence) {
    }

    private void setSubTextAppearance(int i) {
    }

    private void setSubTextColor(ColorStateList colorStateList) {
    }

    private void setTextAppearance(int i) {
    }

    private void setTextColor(ColorStateList colorStateList) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(Drawable drawable);

    public final void b(float f2) {
        if (!this.c) {
            c(f2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(float f2);

    public final void d() {
        e();
    }

    /* access modifiers changed from: protected */
    public abstract void e();

    public final void f() {
        if (this.c) {
            ((AnimationDrawable) this.f917b.getDrawable()).start();
        } else {
            g();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g();

    public final int getContentSize() {
        return a.f918a[this.e.ordinal()] != 1 ? this.f916a.getHeight() : this.f916a.getWidth();
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultDrawableResId();

    public final void h() {
        i();
    }

    /* access modifiers changed from: protected */
    public abstract void i();

    public final void j() {
        this.f917b.setVisibility(0);
        if (this.c) {
            ((AnimationDrawable) this.f917b.getDrawable()).stop();
        } else {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    public final void setHeight(int i) {
        getLayoutParams().height = i;
        requestLayout();
    }

    public void setLastUpdatedLabel(CharSequence charSequence) {
        setSubHeaderText(charSequence);
    }

    public final void setLoadingDrawable(Drawable drawable) {
        this.f917b.setImageDrawable(drawable);
        this.c = drawable instanceof AnimationDrawable;
        a(drawable);
    }

    public void setPullLabel(CharSequence charSequence) {
    }

    public void setRefreshingLabel(CharSequence charSequence) {
    }

    public void setReleaseLabel(CharSequence charSequence) {
    }

    public void setTextTypeface(Typeface typeface) {
    }

    public final void setWidth(int i) {
        getLayoutParams().width = i;
        requestLayout();
    }
}
