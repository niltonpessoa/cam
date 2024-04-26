package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f872a;

    /* renamed from: b  reason: collision with root package name */
    private int f873b = 0;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g.f887a, 0, 0);
            try {
                this.f873b = obtainStyledAttributes.getInt(g.f888b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public int getResizeMode() {
        return this.f873b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f873b != 3 && this.f872a > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            float f3 = (this.f872a / (f / f2)) - 1.0f;
            if (Math.abs(f3) > 0.01f) {
                int i3 = this.f873b;
                if (i3 != 1) {
                    if (i3 != 2) {
                        int i4 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                        if (i3 == 4) {
                        }
                    }
                    measuredWidth = (int) (f2 * this.f872a);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                }
                measuredHeight = (int) (f / this.f872a);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public void setAspectRatio(float f) {
        if (this.f872a != f) {
            this.f872a = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f873b != i) {
            this.f873b = i;
            requestLayout();
        }
    }
}
