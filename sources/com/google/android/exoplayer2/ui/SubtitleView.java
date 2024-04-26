package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import b.a.a.a.o0.a;
import b.a.a.a.o0.b;
import b.a.a.a.o0.k;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.List;

public final class SubtitleView extends View implements k {

    /* renamed from: a  reason: collision with root package name */
    private final List<h> f880a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private List<b> f881b;
    private int c = 0;
    private float d = 0.0533f;
    private boolean e = true;
    private boolean f = true;
    private a g = a.g;
    private float h = 0.08f;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void b(int i, float f2) {
        if (this.c != i || this.d != f2) {
            this.c = i;
            this.d = f2;
            invalidate();
        }
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private a getUserCaptionStyleV19() {
        return a.a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    public void a(float f2, boolean z) {
        b(z ? 1 : 0, f2);
    }

    public void c() {
        setStyle((w.f743a < 19 || isInEditMode()) ? a.g : getUserCaptionStyleV19());
    }

    public void d() {
        setFractionalTextSize(((w.f743a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    public void dispatchDraw(Canvas canvas) {
        float f2;
        List<b> list = this.f881b;
        int i = 0;
        int size = list == null ? 0 : list.size();
        int top = getTop();
        int bottom = getBottom();
        int left = getLeft() + getPaddingLeft();
        int paddingTop = getPaddingTop() + top;
        int right = getRight() + getPaddingRight();
        int paddingBottom = bottom - getPaddingBottom();
        if (paddingBottom > paddingTop && right > left) {
            int i2 = this.c;
            if (i2 == 2) {
                f2 = this.d;
            } else {
                f2 = ((float) (i2 == 0 ? paddingBottom - paddingTop : bottom - top)) * this.d;
            }
            if (f2 > 0.0f) {
                while (i < size) {
                    int i3 = paddingBottom;
                    int i4 = right;
                    this.f880a.get(i).b(this.f881b.get(i), this.e, this.f, this.g, f2, this.h, canvas, left, paddingTop, i4, i3);
                    i++;
                    paddingBottom = i3;
                    right = i4;
                }
            }
        }
    }

    public void p(List<b> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.e != z || this.f != z) {
            this.e = z;
            this.f = z;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f2) {
        if (this.h != f2) {
            this.h = f2;
            invalidate();
        }
    }

    public void setCues(List<b> list) {
        if (this.f881b != list) {
            this.f881b = list;
            int size = list == null ? 0 : list.size();
            while (this.f880a.size() < size) {
                this.f880a.add(new h(getContext()));
            }
            invalidate();
        }
    }

    public void setFractionalTextSize(float f2) {
        a(f2, false);
    }

    public void setStyle(a aVar) {
        if (this.g != aVar) {
            this.g = aVar;
            invalidate();
        }
    }
}
