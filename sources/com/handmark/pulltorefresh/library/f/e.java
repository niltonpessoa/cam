package com.handmark.pulltorefresh.library.f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.handmark.pulltorefresh.library.e;
import com.xforce.v5.xdvpro.R;

public class e extends d {
    private final Animation g;
    private final Matrix h;
    private float i;
    private float j;
    private final boolean k;

    public e(Context context, e.C0046e eVar, e.k kVar, TypedArray typedArray) {
        super(context, eVar, kVar, typedArray);
        this.k = typedArray.getBoolean(15, true);
        this.f917b.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix = new Matrix();
        this.h = matrix;
        this.f917b.setImageMatrix(matrix);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 720.0f, 1, 0.5f, 1, 0.5f);
        this.g = rotateAnimation;
        rotateAnimation.setInterpolator(d.f);
        rotateAnimation.setDuration(1200);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
    }

    private void l() {
        Matrix matrix = this.h;
        if (matrix != null) {
            matrix.reset();
            this.f917b.setImageMatrix(this.h);
        }
    }

    public void a(Drawable drawable) {
        if (drawable != null) {
            this.i = (float) Math.round(((float) drawable.getIntrinsicWidth()) / 2.0f);
            this.j = (float) Math.round(((float) drawable.getIntrinsicHeight()) / 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void c(float f) {
        this.h.setRotate(this.k ? f * 90.0f : Math.max(0.0f, Math.min(180.0f, (f * 360.0f) - 180.0f)), this.i, this.j);
        this.f917b.setImageMatrix(this.h);
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f917b.startAnimation(this.g);
    }

    /* access modifiers changed from: protected */
    public int getDefaultDrawableResId() {
        return R.drawable.default_ptr_rotate;
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f917b.clearAnimation();
        l();
    }
}
