package com.xforce.v5.xdvpro.widget.photoview;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.xforce.v5.xdvpro.widget.photoview.b;

public class PhotoView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private final b f1220a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView.ScaleType f1221b;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        this.f1220a = new b(this);
        ImageView.ScaleType scaleType = this.f1221b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f1221b = null;
        }
    }

    public RectF getDisplayRect() {
        return this.f1220a.p();
    }

    public float getMaxScale() {
        return this.f1220a.s();
    }

    public float getMidScale() {
        return this.f1220a.t();
    }

    public float getMinScale() {
        return this.f1220a.u();
    }

    public float getScale() {
        return this.f1220a.v();
    }

    public ImageView.ScaleType getScaleType() {
        return this.f1220a.w();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1220a.n();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f1220a.B(z);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        b bVar = this.f1220a;
        if (bVar != null) {
            bVar.N();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        b bVar = this.f1220a;
        if (bVar != null) {
            bVar.N();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b bVar = this.f1220a;
        if (bVar != null) {
            bVar.N();
        }
    }

    public void setMaxScale(float f) {
        this.f1220a.E(f);
    }

    public void setMidScale(float f) {
        this.f1220a.F(f);
    }

    public void setMinScale(float f) {
        this.f1220a.G(f);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f1220a.H(onLongClickListener);
    }

    public void setOnMatrixChangeListener(b.e eVar) {
        this.f1220a.I(eVar);
    }

    public void setOnPhotoTapListener(b.f fVar) {
        this.f1220a.J(fVar);
    }

    public void setOnViewTapListener(b.g gVar) {
        this.f1220a.K(gVar);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        b bVar = this.f1220a;
        if (bVar != null) {
            bVar.L(scaleType);
        } else {
            this.f1221b = scaleType;
        }
    }

    public void setZoomable(boolean z) {
        this.f1220a.M(z);
    }
}
