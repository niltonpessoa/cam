package com.xforce.v5.xdvpro.widget.photoview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.xforce.v5.xdvpro.widget.photoview.e;
import java.lang.ref.WeakReference;

public class b implements View.OnTouchListener, e.d, GestureDetector.OnDoubleTapListener, ViewTreeObserver.OnGlobalLayoutListener {
    static final boolean z = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: a  reason: collision with root package name */
    private float f1222a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    private float f1223b = 1.75f;
    private float c = 3.0f;
    private boolean d = true;
    /* access modifiers changed from: private */
    public WeakReference<ImageView> e;
    private ViewTreeObserver f;
    private GestureDetector g;
    private e h;
    private final Matrix i = new Matrix();
    private final Matrix j = new Matrix();
    /* access modifiers changed from: private */
    public final Matrix k = new Matrix();
    private final RectF l = new RectF();
    private final float[] m = new float[9];
    private e n;
    private f o;
    private g p;
    /* access modifiers changed from: private */
    public View.OnLongClickListener q;
    private int r;
    private int s;
    private int t;
    private int u;
    private d v;
    private int w = 2;
    private boolean x;
    private ImageView.ScaleType y = ImageView.ScaleType.FIT_CENTER;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (b.this.q != null) {
                b.this.q.onLongClick((View) b.this.e.get());
            }
        }
    }

    /* renamed from: com.xforce.v5.xdvpro.widget.photoview.b$b  reason: collision with other inner class name */
    static /* synthetic */ class C0055b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1225a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1225a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1225a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1225a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1225a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1225a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.widget.photoview.b.C0055b.<clinit>():void");
        }
    }

    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final float f1226a;

        /* renamed from: b  reason: collision with root package name */
        private final float f1227b;
        private final float c;
        private final float d;

        public c(float f, float f2, float f3, float f4) {
            this.c = f2;
            this.f1226a = f3;
            this.f1227b = f4;
            this.d = f < f2 ? 1.07f : 0.93f;
        }

        public void run() {
            ImageView r = b.this.r();
            if (r != null) {
                Matrix f = b.this.k;
                float f2 = this.d;
                f.postScale(f2, f2, this.f1226a, this.f1227b);
                b.this.j();
                float v = b.this.v();
                float f3 = this.d;
                if ((f3 <= 1.0f || v >= this.c) && (f3 >= 1.0f || this.c >= v)) {
                    float f4 = this.c / v;
                    b.this.k.postScale(f4, f4, this.f1226a, this.f1227b);
                    b.this.j();
                    return;
                }
                a.a(r, this);
            }
        }
    }

    private class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final d f1228a;

        /* renamed from: b  reason: collision with root package name */
        private int f1229b;
        private int c;

        public d(Context context) {
            this.f1228a = d.f(context);
        }

        public void a() {
            if (b.z) {
                Log.d("PhotoViewAttacher", "Cancel Fling");
            }
            this.f1228a.c(true);
        }

        public void b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF p = b.this.p();
            if (p != null) {
                int round = Math.round(-p.left);
                float f = (float) i;
                if (f < p.width()) {
                    i5 = Math.round(p.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-p.top);
                float f2 = (float) i2;
                if (f2 < p.height()) {
                    i7 = Math.round(p.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.f1229b = round;
                this.c = round2;
                if (b.z) {
                    Log.d("PhotoViewAttacher", "fling. StartX:" + round + " StartY:" + round2 + " MaxX:" + i5 + " MaxY:" + i7);
                }
                if (round != i5 || round2 != i7) {
                    this.f1228a.b(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }

        public void run() {
            ImageView r = b.this.r();
            if (r != null && this.f1228a.a()) {
                int d2 = this.f1228a.d();
                int e = this.f1228a.e();
                if (b.z) {
                    Log.d("PhotoViewAttacher", "fling run(). CurrentX:" + this.f1229b + " CurrentY:" + this.c + " NewX:" + d2 + " NewY:" + e);
                }
                b.this.k.postTranslate((float) (this.f1229b - d2), (float) (this.c - e));
                b bVar = b.this;
                bVar.C(bVar.o());
                this.f1229b = d2;
                this.c = e;
                a.a(r, this);
            }
        }
    }

    public interface e {
        void a(RectF rectF);
    }

    public interface f {
        void a(View view, float f, float f2);
    }

    public interface g {
        void a(View view, float f, float f2);
    }

    public b(ImageView imageView) {
        this.e = new WeakReference<>(imageView);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        this.f = viewTreeObserver;
        viewTreeObserver.addOnGlobalLayoutListener(this);
        D(imageView);
        if (!imageView.isInEditMode()) {
            this.h = e.b(imageView.getContext(), this);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
            this.g = gestureDetector;
            gestureDetector.setOnDoubleTapListener(this);
            M(true);
        }
    }

    private void A() {
        this.k.reset();
        C(o());
        l();
    }

    /* access modifiers changed from: private */
    public void C(Matrix matrix) {
        RectF q2;
        ImageView r2 = r();
        if (r2 != null) {
            k();
            r2.setImageMatrix(matrix);
            if (this.n != null && (q2 = q(matrix)) != null) {
                this.n.a(q2);
            }
        }
    }

    private static void D(ImageView imageView) {
        if (imageView != null && !(imageView instanceof PhotoView)) {
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    private void O(Drawable drawable) {
        Matrix.ScaleToFit scaleToFit;
        Matrix matrix;
        float min;
        ImageView r2 = r();
        if (r2 != null && drawable != null) {
            float width = (float) r2.getWidth();
            float height = (float) r2.getHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.i.reset();
            float f2 = (float) intrinsicWidth;
            float f3 = width / f2;
            float f4 = (float) intrinsicHeight;
            float f5 = height / f4;
            ImageView.ScaleType scaleType = this.y;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.i.postTranslate((width - f2) / 2.0f, (height - f4) / 2.0f);
            } else {
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    min = Math.max(f3, f5);
                } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                    min = Math.min(1.0f, Math.min(f3, f5));
                } else {
                    RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
                    RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
                    int i2 = C0055b.f1225a[this.y.ordinal()];
                    if (i2 == 2) {
                        matrix = this.i;
                        scaleToFit = Matrix.ScaleToFit.START;
                    } else if (i2 == 3) {
                        matrix = this.i;
                        scaleToFit = Matrix.ScaleToFit.END;
                    } else if (i2 == 4) {
                        matrix = this.i;
                        scaleToFit = Matrix.ScaleToFit.CENTER;
                    } else if (i2 == 5) {
                        matrix = this.i;
                        scaleToFit = Matrix.ScaleToFit.FILL;
                    }
                    matrix.setRectToRect(rectF, rectF2, scaleToFit);
                }
                this.i.postScale(min, min);
                this.i.postTranslate((width - (f2 * min)) / 2.0f, (height - (f4 * min)) / 2.0f);
            }
            A();
        }
    }

    private void i() {
        d dVar = this.v;
        if (dVar != null) {
            dVar.a();
            this.v = null;
        }
    }

    /* access modifiers changed from: private */
    public void j() {
        l();
        C(o());
    }

    private void k() {
        ImageView r2 = r();
        if (r2 != null && !(r2 instanceof PhotoView) && r2.getScaleType() != ImageView.ScaleType.MATRIX) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
            r11 = this;
            android.widget.ImageView r0 = r11.r()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.Matrix r1 = r11.o()
            android.graphics.RectF r1 = r11.q(r1)
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            float r2 = r1.height()
            float r3 = r1.width()
            int r4 = r0.getHeight()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 3
            r7 = 2
            r8 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x003f
            int[] r9 = com.xforce.v5.xdvpro.widget.photoview.b.C0055b.f1225a
            android.widget.ImageView$ScaleType r10 = r11.y
            int r10 = r10.ordinal()
            r9 = r9[r10]
            if (r9 == r7) goto L_0x003c
            float r4 = r4 - r2
            if (r9 == r6) goto L_0x0038
            float r4 = r4 / r5
        L_0x0038:
            float r2 = r1.top
        L_0x003a:
            float r4 = r4 - r2
            goto L_0x004f
        L_0x003c:
            float r2 = r1.top
            goto L_0x0045
        L_0x003f:
            float r2 = r1.top
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x0047
        L_0x0045:
            float r4 = -r2
            goto L_0x004f
        L_0x0047:
            float r2 = r1.bottom
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x004e
            goto L_0x003a
        L_0x004e:
            r4 = 0
        L_0x004f:
            int r0 = r0.getWidth()
            float r0 = (float) r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0073
            int[] r2 = com.xforce.v5.xdvpro.widget.photoview.b.C0055b.f1225a
            android.widget.ImageView$ScaleType r8 = r11.y
            int r8 = r8.ordinal()
            r2 = r2[r8]
            if (r2 == r7) goto L_0x006c
            float r0 = r0 - r3
            if (r2 == r6) goto L_0x0068
            float r0 = r0 / r5
        L_0x0068:
            float r1 = r1.left
            float r0 = r0 - r1
            goto L_0x006f
        L_0x006c:
            float r0 = r1.left
            float r0 = -r0
        L_0x006f:
            r8 = r0
            r11.w = r7
            goto L_0x008b
        L_0x0073:
            float r2 = r1.left
            int r3 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x007e
            r0 = 0
            r11.w = r0
            float r8 = -r2
            goto L_0x008b
        L_0x007e:
            float r1 = r1.right
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0088
            float r8 = r0 - r1
            r0 = 1
            goto L_0x0089
        L_0x0088:
            r0 = -1
        L_0x0089:
            r11.w = r0
        L_0x008b:
            android.graphics.Matrix r0 = r11.k
            r0.postTranslate(r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.widget.photoview.b.l():void");
    }

    private static void m(float f2, float f3, float f4) {
        if (f2 >= f3) {
            throw new IllegalArgumentException("MinZoom should be less than MidZoom");
        } else if (f3 >= f4) {
            throw new IllegalArgumentException("MidZoom should be less than MaxZoom");
        }
    }

    private RectF q(Matrix matrix) {
        Drawable drawable;
        ImageView r2 = r();
        if (r2 == null || (drawable = r2.getDrawable()) == null) {
            return null;
        }
        this.l.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.l);
        return this.l;
    }

    private float x(Matrix matrix, int i2) {
        matrix.getValues(this.m);
        return this.m[i2];
    }

    private static boolean y(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    private static boolean z(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C0055b.f1225a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    public void B(boolean z2) {
        this.d = z2;
    }

    public void E(float f2) {
        m(this.f1222a, this.f1223b, f2);
        this.c = f2;
    }

    public void F(float f2) {
        m(this.f1222a, f2, this.c);
        this.f1223b = f2;
    }

    public void G(float f2) {
        m(f2, this.f1223b, this.c);
        this.f1222a = f2;
    }

    public final void H(View.OnLongClickListener onLongClickListener) {
        this.q = onLongClickListener;
    }

    public final void I(e eVar) {
        this.n = eVar;
    }

    public final void J(f fVar) {
        this.o = fVar;
    }

    public final void K(g gVar) {
        this.p = gVar;
    }

    public final void L(ImageView.ScaleType scaleType) {
        if (z(scaleType) && scaleType != this.y) {
            this.y = scaleType;
            N();
        }
    }

    public final void M(boolean z2) {
        this.x = z2;
        N();
    }

    public final void N() {
        ImageView r2 = r();
        if (r2 == null) {
            return;
        }
        if (this.x) {
            D(r2);
            O(r2.getDrawable());
            return;
        }
        A();
    }

    public final void P(float f2, float f3, float f4) {
        ImageView r2 = r();
        if (r2 != null) {
            r2.post(new c(v(), f2, f3, f4));
        }
    }

    public final void a(float f2, float f3, float f4) {
        if (z) {
            Log.d("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}));
        }
        if (!y(r())) {
            return;
        }
        if (v() < this.c || f2 < 1.0f) {
            this.k.postScale(f2, f2, f3, f4);
            j();
        }
    }

    public final void b(float f2, float f3) {
        if (z) {
            Log.d("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", new Object[]{Float.valueOf(f2), Float.valueOf(f3)}));
        }
        ImageView r2 = r();
        if (r2 != null && y(r2)) {
            this.k.postTranslate(f2, f3);
            j();
            if (this.d && !this.h.a()) {
                int i2 = this.w;
                if (i2 == 2 || ((i2 == 0 && f2 >= 1.0f) || (i2 == 1 && f2 <= -1.0f))) {
                    r2.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    public final void c(float f2, float f3, float f4, float f5) {
        if (z) {
            Log.d("PhotoViewAttacher", "onFling. sX: " + f2 + " sY: " + f3 + " Vx: " + f4 + " Vy: " + f5);
        }
        ImageView r2 = r();
        if (y(r2)) {
            d dVar = new d(r2.getContext());
            this.v = dVar;
            dVar.b(r2.getWidth(), r2.getHeight(), (int) f4, (int) f5);
            r2.post(this.v);
        }
    }

    @SuppressLint({"NewApi"})
    public final void n() {
        if (Build.VERSION.SDK_INT >= 16) {
            WeakReference<ImageView> weakReference = this.e;
            if (weakReference != null) {
                ((ImageView) weakReference.get()).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            ViewTreeObserver viewTreeObserver = this.f;
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                this.f.removeOnGlobalLayoutListener(this);
            } else {
                return;
            }
        } else {
            WeakReference<ImageView> weakReference2 = this.e;
            if (weakReference2 != null) {
                ((ImageView) weakReference2.get()).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            ViewTreeObserver viewTreeObserver2 = this.f;
            if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.f.removeGlobalOnLayoutListener(this);
            } else {
                return;
            }
        }
        this.f = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.e = null;
    }

    /* access modifiers changed from: protected */
    public Matrix o() {
        this.j.set(this.i);
        this.j.postConcat(this.k);
        return this.j;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            float v2 = v();
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = this.f1223b;
            if (v2 >= f2) {
                if (v2 >= f2) {
                    f2 = this.c;
                    if (v2 < f2) {
                    }
                }
                P(this.f1222a, x2, y2);
                return true;
            }
            P(f2, x2, y2);
            return true;
        } catch (ArrayIndexOutOfBoundsException unused) {
            return true;
        }
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void onGlobalLayout() {
        ImageView r2 = r();
        if (r2 != null && this.x) {
            int top = r2.getTop();
            int right = r2.getRight();
            int bottom = r2.getBottom();
            int left = r2.getLeft();
            if (top != this.r || bottom != this.t || left != this.u || right != this.s) {
                O(r2.getDrawable());
                this.r = top;
                this.s = right;
                this.t = bottom;
                this.u = left;
            }
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF p2;
        ImageView r2 = r();
        if (r2 == null) {
            return false;
        }
        if (!(this.o == null || (p2 = p()) == null)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (p2.contains(x2, y2)) {
                this.o.a(r2, (x2 - p2.left) / p2.width(), (y2 - p2.top) / p2.height());
                return true;
            }
        }
        g gVar = this.p;
        if (gVar == null) {
            return false;
        }
        gVar.a(r2, motionEvent.getX(), motionEvent.getY());
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RectF p2;
        boolean z2 = false;
        if (!this.x) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            i();
        } else if ((action == 1 || action == 3) && v() < this.f1222a && (p2 = p()) != null) {
            view.post(new c(v(), this.f1222a, p2.centerX(), p2.centerY()));
            z2 = true;
        }
        GestureDetector gestureDetector = this.g;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            z2 = true;
        }
        e eVar = this.h;
        if (eVar == null || !eVar.c(motionEvent)) {
            return z2;
        }
        return true;
    }

    public final RectF p() {
        l();
        return q(o());
    }

    public final ImageView r() {
        WeakReference<ImageView> weakReference = this.e;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView != null) {
            return imageView;
        }
        n();
        throw new IllegalStateException("ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
    }

    public float s() {
        return this.c;
    }

    public float t() {
        return this.f1223b;
    }

    public float u() {
        return this.f1222a;
    }

    public final float v() {
        return x(this.k, 0);
    }

    public final ImageView.ScaleType w() {
        return this.y;
    }
}
