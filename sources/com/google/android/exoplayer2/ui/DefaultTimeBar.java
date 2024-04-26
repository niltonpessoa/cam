package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import b.a.a.a.r0.w;
import com.google.android.exoplayer2.ui.i;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class DefaultTimeBar extends View implements i {
    private int[] A;
    private Point B;
    private boolean C;
    private long D;
    private long E;
    private long F;
    private long G;
    private int H;
    private long[] I;
    private boolean[] J;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f874a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f875b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Drawable k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final StringBuilder t;
    private final Formatter u;
    private final Runnable v;
    private final CopyOnWriteArraySet<i.a> w;
    private int x;
    private long y;
    private int z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            DefaultTimeBar.this.s(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z2;
        int i2;
        AttributeSet attributeSet2 = attributeSet;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.w = new CopyOnWriteArraySet<>();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.s = d(displayMetrics, -50);
        int d2 = d(displayMetrics, 4);
        int d3 = d(displayMetrics, 26);
        int d4 = d(displayMetrics, 4);
        int d5 = d(displayMetrics, 12);
        int d6 = d(displayMetrics, 0);
        int d7 = d(displayMetrics, 16);
        if (attributeSet2 != null) {
            Paint paint7 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, g.c, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(g.m);
                this.k = drawable;
                if (drawable != null) {
                    p(drawable);
                    d3 = Math.max(drawable.getMinimumHeight(), d3);
                }
                this.l = obtainStyledAttributes.getDimensionPixelSize(g.f, d2);
                this.m = obtainStyledAttributes.getDimensionPixelSize(g.o, d3);
                this.n = obtainStyledAttributes.getDimensionPixelSize(g.e, d4);
                this.o = obtainStyledAttributes.getDimensionPixelSize(g.n, d5);
                this.p = obtainStyledAttributes.getDimensionPixelSize(g.k, d6);
                this.q = obtainStyledAttributes.getDimensionPixelSize(g.l, d7);
                int i3 = obtainStyledAttributes.getInt(g.i, -1);
                int i4 = obtainStyledAttributes.getInt(g.j, i(i3));
                int i5 = obtainStyledAttributes.getInt(g.g, g(i3));
                int i6 = obtainStyledAttributes.getInt(g.p, j(i3));
                int i7 = obtainStyledAttributes.getInt(g.d, -1291845888);
                int i8 = obtainStyledAttributes.getInt(g.h, h(i7));
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint7.setColor(i8);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.l = d2;
            this.m = d3;
            this.n = d4;
            this.o = d5;
            this.p = d6;
            this.q = d7;
            paint.setColor(-1);
            paint6.setColor(i(-1));
            paint2.setColor(g(-1));
            paint3.setColor(j(-1));
            paint4.setColor(-1291845888);
            this.k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.t = sb;
        this.u = new Formatter(sb, Locale.getDefault());
        this.v = new a();
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            i2 = drawable2.getMinimumWidth();
            z2 = true;
        } else {
            z2 = true;
            i2 = Math.max(this.p, Math.max(this.o, this.q));
        }
        this.r = (i2 + (z2 ? 1 : 0)) / 2;
        this.E = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.x = 20;
        setFocusable(z2);
        if (w.f743a >= 16) {
            l();
        }
    }

    private static int d(DisplayMetrics displayMetrics, int i2) {
        return (int) ((((float) i2) * displayMetrics.density) + 0.5f);
    }

    private void e(Canvas canvas) {
        if (this.E > 0) {
            Rect rect = this.d;
            int i2 = w.i(rect.right, rect.left, this.f875b.right);
            int centerY = this.d.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                canvas.drawCircle((float) i2, (float) centerY, (float) (((this.C || isFocused()) ? this.q : isEnabled() ? this.o : this.p) / 2), this.j);
                return;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.k.getIntrinsicHeight() / 2;
            this.k.setBounds(i2 - intrinsicWidth, centerY - intrinsicHeight, i2 + intrinsicWidth, centerY + intrinsicHeight);
            this.k.draw(canvas);
        }
    }

    private void f(Canvas canvas) {
        int height = this.f875b.height();
        int centerY = this.f875b.centerY() - (height / 2);
        int i2 = height + centerY;
        if (this.E <= 0) {
            Rect rect = this.f875b;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i2, this.g);
            return;
        }
        Rect rect2 = this.c;
        int i3 = rect2.left;
        int i4 = rect2.right;
        int max = Math.max(Math.max(this.f875b.left, i4), this.d.right);
        int i5 = this.f875b.right;
        if (max < i5) {
            canvas.drawRect((float) max, (float) centerY, (float) i5, (float) i2, this.g);
        }
        int max2 = Math.max(i3, this.d.right);
        if (i4 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i4, (float) i2, this.f);
        }
        if (this.d.width() > 0) {
            Rect rect3 = this.d;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i2, this.e);
        }
        int i6 = this.n / 2;
        for (int i7 = 0; i7 < this.H; i7++) {
            long j2 = w.j(this.I[i7], 0, this.E);
            Rect rect4 = this.f875b;
            int min = rect4.left + Math.min(rect4.width() - this.n, Math.max(0, ((int) ((((long) this.f875b.width()) * j2) / this.E)) - i6));
            canvas.drawRect((float) min, (float) centerY, (float) (min + this.n), (float) i2, this.J[i7] ? this.i : this.h);
        }
    }

    public static int g(int i2) {
        return (i2 & 16777215) | -872415232;
    }

    private long getPositionIncrement() {
        long j2 = this.y;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = this.E;
        if (j3 == -9223372036854775807L) {
            return 0;
        }
        return j3 / ((long) this.x);
    }

    private String getProgressText() {
        return w.u(this.t, this.u, this.F);
    }

    private long getScrubberPosition() {
        if (this.f875b.width() <= 0 || this.E == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.d.width()) * this.E) / ((long) this.f875b.width());
    }

    public static int h(int i2) {
        return (i2 & 16777215) | 855638016;
    }

    public static int i(int i2) {
        return i2 | -16777216;
    }

    public static int j(int i2) {
        return (i2 & 16777215) | 855638016;
    }

    private boolean k(float f2, float f3) {
        return this.f874a.contains((int) f2, (int) f3);
    }

    @TargetApi(16)
    private void l() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private void m(float f2) {
        Rect rect = this.d;
        Rect rect2 = this.f875b;
        rect.right = w.i((int) f2, rect2.left, rect2.right);
    }

    private Point n(MotionEvent motionEvent) {
        if (this.A == null) {
            this.A = new int[2];
            this.B = new Point();
        }
        getLocationOnScreen(this.A);
        this.B.set(((int) motionEvent.getRawX()) - this.A[0], ((int) motionEvent.getRawY()) - this.A[1]);
        return this.B;
    }

    private boolean o(long j2) {
        if (this.E <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long j3 = w.j(scrubberPosition + j2, 0, this.E);
        this.D = j3;
        if (j3 == scrubberPosition) {
            return false;
        }
        if (!this.C) {
            r();
        }
        Iterator<i.a> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().i(this, this.D);
        }
        t();
        return true;
    }

    private boolean p(Drawable drawable) {
        return w.f743a >= 23 && q(drawable, getLayoutDirection());
    }

    private static boolean q(Drawable drawable, int i2) {
        return w.f743a >= 23 && drawable.setLayoutDirection(i2);
    }

    private void r() {
        this.C = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<i.a> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().g(this, getScrubberPosition());
        }
    }

    /* access modifiers changed from: private */
    public void s(boolean z2) {
        this.C = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<i.a> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().h(this, getScrubberPosition(), z2);
        }
    }

    private void t() {
        this.c.set(this.f875b);
        this.d.set(this.f875b);
        long j2 = this.C ? this.D : this.F;
        if (this.E > 0) {
            int width = (int) ((((long) this.f875b.width()) * this.G) / this.E);
            Rect rect = this.c;
            Rect rect2 = this.f875b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((((long) this.f875b.width()) * j2) / this.E);
            Rect rect3 = this.d;
            Rect rect4 = this.f875b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.c;
            int i2 = this.f875b.left;
            rect5.right = i2;
            this.d.right = i2;
        }
        invalidate(this.f874a);
    }

    private void u() {
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && this.k.setState(getDrawableState())) {
            invalidate();
        }
    }

    public void a(i.a aVar) {
        this.w.add(aVar);
    }

    public void b(long[] jArr, boolean[] zArr, int i2) {
        b.a.a.a.r0.a.a(i2 == 0 || !(jArr == null || zArr == null));
        this.H = i2;
        this.I = jArr;
        this.J = zArr;
        t();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        f(canvas);
        e(canvas);
        canvas.restore();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(DefaultTimeBar.class.getName());
    }

    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DefaultTimeBar.class.getCanonicalName());
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.E > 0) {
            int i2 = w.f743a;
            if (i2 >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            } else if (i2 >= 16) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (o(r0) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.v);
        postDelayed(r4.v, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0036
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0036
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.o(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.Runnable r5 = r4.v
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.v
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.C
            if (r0 == 0) goto L_0x0036
            java.lang.Runnable r5 = r4.v
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.v
            r5.run()
            return r3
        L_0x0036:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = ((i5 - i3) - this.m) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i4 - i2) - getPaddingRight();
        int i7 = this.m;
        int i8 = ((i7 - this.l) / 2) + i6;
        this.f874a.set(paddingLeft, i6, paddingRight, i7 + i6);
        Rect rect = this.f875b;
        Rect rect2 = this.f874a;
        int i9 = rect2.left;
        int i10 = this.r;
        rect.set(i9 + i10, i8, rect2.right - i10, this.l + i8);
        t();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.m;
        } else if (mode != 1073741824) {
            size = Math.min(this.m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        u();
    }

    public void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.k;
        if (drawable != null && q(drawable, i2)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r3 != 3) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0087
            long r2 = r7.E
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            goto L_0x0087
        L_0x0011:
            android.graphics.Point r0 = r7.n(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x0072
            r5 = 3
            if (r3 == r4) goto L_0x0063
            r6 = 2
            if (r3 == r6) goto L_0x0029
            if (r3 == r5) goto L_0x0063
            goto L_0x0087
        L_0x0029:
            boolean r8 = r7.C
            if (r8 == 0) goto L_0x0087
            int r8 = r7.s
            if (r0 >= r8) goto L_0x0038
            int r8 = r7.z
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L_0x003b
        L_0x0038:
            r7.z = r2
            float r8 = (float) r2
        L_0x003b:
            r7.m(r8)
            long r0 = r7.getScrubberPosition()
            r7.D = r0
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.i$a> r8 = r7.w
            java.util.Iterator r8 = r8.iterator()
        L_0x004a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r8.next()
            com.google.android.exoplayer2.ui.i$a r0 = (com.google.android.exoplayer2.ui.i.a) r0
            long r1 = r7.D
            r0.i(r7, r1)
            goto L_0x004a
        L_0x005c:
            r7.t()
            r7.invalidate()
            return r4
        L_0x0063:
            boolean r0 = r7.C
            if (r0 == 0) goto L_0x0087
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x006e
            r1 = 1
        L_0x006e:
            r7.s(r1)
            return r4
        L_0x0072:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.k(r8, r0)
            if (r0 == 0) goto L_0x0087
            r7.r()
            r7.m(r8)
            long r0 = r7.getScrubberPosition()
            r7.D = r0
            goto L_0x005c
        L_0x0087:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (o(getPositionIncrement()) != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (o(-getPositionIncrement()) != false) goto L_0x0021;
     */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L_0x0008
            return r0
        L_0x0008:
            long r1 = r6.E
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0012
            return r8
        L_0x0012:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r7 != r1) goto L_0x0025
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.o(r1)
            if (r7 == 0) goto L_0x0034
        L_0x0021:
            r6.s(r8)
            goto L_0x0034
        L_0x0025:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L_0x0039
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.o(r1)
            if (r7 == 0) goto L_0x0034
            goto L_0x0021
        L_0x0034:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L_0x0039:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setBufferedPosition(long j2) {
        this.G = j2;
        t();
    }

    public void setDuration(long j2) {
        this.E = j2;
        if (this.C && j2 == -9223372036854775807L) {
            s(true);
        }
        t();
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (this.C && !z2) {
            s(true);
        }
    }

    public void setKeyCountIncrement(int i2) {
        b.a.a.a.r0.a.a(i2 > 0);
        this.x = i2;
        this.y = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j2) {
        b.a.a.a.r0.a.a(j2 > 0);
        this.x = -1;
        this.y = j2;
    }

    public void setPosition(long j2) {
        this.F = j2;
        setContentDescription(getProgressText());
        t();
    }
}
