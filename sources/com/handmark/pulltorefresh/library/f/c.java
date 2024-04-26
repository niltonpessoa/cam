package com.handmark.pulltorefresh.library.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.handmark.pulltorefresh.library.e;
import com.xforce.v5.xdvpro.R;

@SuppressLint({"ViewConstructor"})
public class c extends FrameLayout implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    private Animation f913a;

    /* renamed from: b  reason: collision with root package name */
    private Animation f914b;
    private ImageView c;
    private final Animation d;
    private final Animation e;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f915a;

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
                f915a = r0
                com.handmark.pulltorefresh.library.e$e r1 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_END     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f915a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.handmark.pulltorefresh.library.e$e r1 = com.handmark.pulltorefresh.library.e.C0046e.PULL_FROM_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.f.c.a.<clinit>():void");
        }
    }

    public c(Context context, e.C0046e eVar) {
        super(context);
        int i;
        int i2;
        this.c = new ImageView(context);
        Drawable drawable = getResources().getDrawable(R.drawable.indicator_arrow);
        this.c.setImageDrawable(drawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.indicator_internal_padding);
        this.c.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(this.c);
        if (a.f915a[eVar.ordinal()] != 1) {
            i = R.anim.slide_in_from_top;
            i2 = R.anim.slide_out_to_top;
            setBackgroundResource(R.drawable.indicator_bg_top);
        } else {
            i = R.anim.slide_in_from_bottom;
            setBackgroundResource(R.drawable.indicator_bg_bottom);
            this.c.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.setRotate(180.0f, ((float) drawable.getIntrinsicWidth()) / 2.0f, ((float) drawable.getIntrinsicHeight()) / 2.0f);
            this.c.setImageMatrix(matrix);
            i2 = R.anim.slide_out_to_bottom;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
        this.f913a = loadAnimation;
        loadAnimation.setAnimationListener(this);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i2);
        this.f914b = loadAnimation2;
        loadAnimation2.setAnimationListener(this);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.d = rotateAnimation;
        rotateAnimation.setInterpolator(linearInterpolator);
        rotateAnimation.setDuration(150);
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.e = rotateAnimation2;
        rotateAnimation2.setInterpolator(linearInterpolator);
        rotateAnimation2.setDuration(150);
        rotateAnimation2.setFillAfter(true);
    }

    public void a() {
        startAnimation(this.f914b);
    }

    public final boolean b() {
        Animation animation = getAnimation();
        return animation != null ? this.f913a == animation : getVisibility() == 0;
    }

    public void c() {
        this.c.startAnimation(this.e);
    }

    public void d() {
        this.c.startAnimation(this.d);
    }

    public void e() {
        this.c.clearAnimation();
        startAnimation(this.f913a);
    }

    public void onAnimationEnd(Animation animation) {
        int i;
        if (animation == this.f914b) {
            this.c.clearAnimation();
            i = 8;
        } else {
            if (animation == this.f913a) {
                i = 0;
            }
            clearAnimation();
        }
        setVisibility(i);
        clearAnimation();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        setVisibility(0);
    }
}
