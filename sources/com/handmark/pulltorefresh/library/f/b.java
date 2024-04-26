package com.handmark.pulltorefresh.library.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.handmark.pulltorefresh.library.e;
import com.xforce.v5.xdvpro.R;

@SuppressLint({"ViewConstructor"})
public class b extends d {
    private final Animation g;
    private final Animation h;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f912a;

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
                f912a = r0
                com.handmark.pulltorefresh.library.e$e r1 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_END     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f912a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.handmark.pulltorefresh.library.e$e r1 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.f.b.a.<clinit>():void");
        }
    }

    public b(Context context, e.C0046e eVar, e.k kVar, TypedArray typedArray) {
        super(context, eVar, kVar, typedArray);
        float f = (float) (eVar == e.C0046e.PULL_FROM_START ? -180 : 180);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, f, 1, 0.5f, 1, 0.5f);
        this.g = rotateAnimation;
        Interpolator interpolator = d.f;
        rotateAnimation.setInterpolator(interpolator);
        rotateAnimation.setDuration(150);
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.h = rotateAnimation2;
        rotateAnimation2.setInterpolator(interpolator);
        rotateAnimation2.setDuration(150);
        rotateAnimation2.setFillAfter(true);
    }

    private float getDrawableRotationAngle() {
        int i = a.f912a[this.d.ordinal()];
        return i != 1 ? (i == 2 && this.e == e.k.HORIZONTAL) ? 270.0f : 0.0f : this.e == e.k.HORIZONTAL ? 90.0f : 180.0f;
    }

    /* access modifiers changed from: protected */
    public void a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            ViewGroup.LayoutParams layoutParams = this.f917b.getLayoutParams();
            int max = Math.max(intrinsicHeight, intrinsicWidth);
            layoutParams.height = max;
            layoutParams.width = max;
            this.f917b.requestLayout();
            this.f917b.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.postTranslate(((float) (layoutParams.width - intrinsicWidth)) / 2.0f, ((float) (layoutParams.height - intrinsicHeight)) / 2.0f);
            matrix.postRotate(getDrawableRotationAngle(), ((float) layoutParams.width) / 2.0f, ((float) layoutParams.height) / 2.0f);
            this.f917b.setImageMatrix(matrix);
        }
    }

    /* access modifiers changed from: protected */
    public void c(float f) {
    }

    /* access modifiers changed from: protected */
    public void e() {
        if (this.g == this.f917b.getAnimation()) {
            this.f917b.startAnimation(this.h);
        }
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f917b.clearAnimation();
        this.f917b.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public int getDefaultDrawableResId() {
        return R.drawable.default_ptr_flip;
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f917b.startAnimation(this.g);
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f917b.clearAnimation();
        this.f917b.setVisibility(0);
    }
}
