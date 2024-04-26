package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b.a.a.a.c;
import b.a.a.a.m0.a;
import b.a.a.a.n0.n;
import b.a.a.a.o0.k;
import b.a.a.a.p0.e;
import b.a.a.a.p0.f;
import b.a.a.a.r0.w;
import b.a.a.a.s0.g;
import b.a.a.a.x;
import b.a.a.a.y;
import com.google.android.exoplayer2.ui.a;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.util.List;

public class PlayerView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AspectRatioFrameLayout f877a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final View f878b;
    /* access modifiers changed from: private */
    public final View c;
    private final ImageView d;
    /* access modifiers changed from: private */
    public final SubtitleView e;
    private final a f;
    private final b g;
    private final FrameLayout h;
    private y i;
    private boolean j;
    private boolean k;
    private Bitmap l;
    private int m;
    private boolean n;
    /* access modifiers changed from: private */
    public boolean o;
    private boolean p;
    /* access modifiers changed from: private */
    public int q;

    private final class b extends y.a implements k, g, View.OnLayoutChangeListener {
        private b() {
        }

        public void a(int i, int i2, int i3, float f) {
            if (PlayerView.this.f877a != null) {
                float f2 = (i2 == 0 || i == 0) ? 1.0f : (((float) i) * f) / ((float) i2);
                if (PlayerView.this.c instanceof TextureView) {
                    if (i3 == 90 || i3 == 270) {
                        f2 = 1.0f / f2;
                    }
                    if (PlayerView.this.q != 0) {
                        PlayerView.this.c.removeOnLayoutChangeListener(this);
                    }
                    int unused = PlayerView.this.q = i3;
                    if (PlayerView.this.q != 0) {
                        PlayerView.this.c.addOnLayoutChangeListener(this);
                    }
                    PlayerView.l((TextureView) PlayerView.this.c, PlayerView.this.q);
                }
                PlayerView.this.f877a.setAspectRatio(f2);
            }
        }

        public void c(boolean z, int i) {
            if (!PlayerView.this.s() || !PlayerView.this.o) {
                PlayerView.this.t(false);
            } else {
                PlayerView.this.q();
            }
        }

        public void f(int i) {
            if (PlayerView.this.s() && PlayerView.this.o) {
                PlayerView.this.q();
            }
        }

        public void j(n nVar, f fVar) {
            PlayerView.this.A();
        }

        public void n() {
            if (PlayerView.this.f878b != null) {
                PlayerView.this.f878b.setVisibility(4);
            }
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.l((TextureView) view, PlayerView.this.q);
        }

        public void p(List<b.a.a.a.o0.b> list) {
            if (PlayerView.this.e != null) {
                PlayerView.this.e.p(list);
            }
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (isInEditMode()) {
            this.f877a = null;
            this.f878b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            ImageView imageView = new ImageView(context2);
            if (w.f743a >= 23) {
                n(getResources(), imageView);
            } else {
                m(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = e.exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, g.x, 0, 0);
            try {
                int i9 = g.F;
                z3 = obtainStyledAttributes.hasValue(i9);
                i6 = obtainStyledAttributes.getColor(i9, 0);
                int resourceId = obtainStyledAttributes.getResourceId(g.C, i8);
                z2 = obtainStyledAttributes.getBoolean(g.H, true);
                i5 = obtainStyledAttributes.getResourceId(g.z, 0);
                z = obtainStyledAttributes.getBoolean(g.I, true);
                i4 = obtainStyledAttributes.getInt(g.G, 1);
                i3 = obtainStyledAttributes.getInt(g.D, 0);
                int i10 = obtainStyledAttributes.getInt(g.E, BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);
                boolean z7 = obtainStyledAttributes.getBoolean(g.B, true);
                boolean z8 = obtainStyledAttributes.getBoolean(g.y, true);
                int i11 = resourceId;
                boolean z9 = obtainStyledAttributes.getBoolean(g.A, true);
                obtainStyledAttributes.recycle();
                z4 = z7;
                i7 = i10;
                z5 = z8;
                z6 = z9;
                i8 = i11;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z6 = true;
            z5 = true;
            i7 = BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT;
            z4 = true;
            i6 = 0;
            z3 = false;
            z2 = true;
            i5 = 0;
            z = true;
            i4 = 1;
            i3 = 0;
        }
        LayoutInflater.from(context).inflate(i8, this);
        this.g = new b();
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(d.exo_content_frame);
        this.f877a = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            w(aspectRatioFrameLayout, i3);
        }
        View findViewById = findViewById(d.exo_shutter);
        this.f878b = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i6);
        }
        if (aspectRatioFrameLayout == null || i4 == 0) {
            this.c = null;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            View textureView = i4 == 2 ? new TextureView(context2) : new SurfaceView(context2);
            this.c = textureView;
            textureView.setLayoutParams(layoutParams);
            aspectRatioFrameLayout.addView(textureView, 0);
        }
        this.h = (FrameLayout) findViewById(d.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(d.exo_artwork);
        this.d = imageView2;
        this.k = z2 && imageView2 != null;
        if (i5 != 0) {
            this.l = BitmapFactory.decodeResource(context.getResources(), i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(d.exo_subtitles);
        this.e = subtitleView;
        if (subtitleView != null) {
            subtitleView.c();
            subtitleView.d();
        }
        a aVar = (a) findViewById(d.exo_controller);
        View findViewById2 = findViewById(d.exo_controller_placeholder);
        if (aVar != null) {
            this.f = aVar;
        } else if (findViewById2 != null) {
            a aVar2 = new a(context2, (AttributeSet) null, 0, attributeSet2);
            this.f = aVar2;
            aVar2.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(aVar2, indexOfChild);
        } else {
            this.f = null;
        }
        a aVar3 = this.f;
        this.m = aVar3 == null ? 0 : i7;
        this.p = z4;
        this.n = z5;
        this.o = z6;
        this.j = z && aVar3 != null;
        q();
    }

    /* access modifiers changed from: private */
    public void A() {
        y yVar = this.i;
        if (yVar != null) {
            f E = yVar.E();
            int i2 = 0;
            while (i2 < E.f679a) {
                if (this.i.F(i2) != 2 || E.a(i2) == null) {
                    i2++;
                } else {
                    p();
                    return;
                }
            }
            View view = this.f878b;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.k) {
                for (int i3 = 0; i3 < E.f679a; i3++) {
                    e a2 = E.a(i3);
                    if (a2 != null) {
                        int i4 = 0;
                        while (i4 < a2.e()) {
                            b.a.a.a.m0.a aVar = a2.d(i4).d;
                            if (aVar == null || !v(aVar)) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                        continue;
                    }
                }
                if (u(this.l)) {
                    return;
                }
            }
            p();
        }
    }

    /* access modifiers changed from: private */
    public static void l(TextureView textureView, int i2) {
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (width == 0.0f || height == 0.0f || i2 == 0) {
            textureView.setTransform((Matrix) null);
            return;
        }
        Matrix matrix = new Matrix();
        float f2 = width / 2.0f;
        float f3 = height / 2.0f;
        matrix.postRotate((float) i2, f2, f3);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        textureView.setTransform(matrix);
    }

    private static void m(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(c.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(b.exo_edit_mode_background_color));
    }

    @TargetApi(23)
    private static void n(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(c.exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(b.exo_edit_mode_background_color, (Resources.Theme) null));
    }

    private void p() {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.d.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean r(int i2) {
        return i2 == 19 || i2 == 270 || i2 == 22 || i2 == 271 || i2 == 20 || i2 == 269 || i2 == 21 || i2 == 268 || i2 == 23;
    }

    /* access modifiers changed from: private */
    public boolean s() {
        y yVar = this.i;
        return yVar != null && yVar.g() && this.i.q();
    }

    /* access modifiers changed from: private */
    public void t(boolean z) {
        if ((!s() || !this.o) && this.j) {
            boolean z2 = this.f.L() && this.f.getShowTimeoutMs() <= 0;
            boolean x = x();
            if (z || z2 || x) {
                z(x);
            }
        }
    }

    private boolean u(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0) {
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f877a;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(((float) width) / ((float) height));
                }
                this.d.setImageBitmap(bitmap);
                this.d.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private boolean v(b.a.a.a.m0.a aVar) {
        for (int i2 = 0; i2 < aVar.b(); i2++) {
            a.b a2 = aVar.a(i2);
            if (a2 instanceof b.a.a.a.m0.i.a) {
                byte[] bArr = ((b.a.a.a.m0.i.a) a2).e;
                return u(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            }
        }
        return false;
    }

    private static void w(AspectRatioFrameLayout aspectRatioFrameLayout, int i2) {
        aspectRatioFrameLayout.setResizeMode(i2);
    }

    private boolean x() {
        y yVar = this.i;
        if (yVar == null) {
            return true;
        }
        int w = yVar.w();
        return this.n && (w == 1 || w == 4 || !this.i.q());
    }

    private void z(boolean z) {
        if (this.j) {
            this.f.setShowTimeoutMs(z ? 0 : this.m);
            this.f.U();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        y yVar = this.i;
        if (yVar == null || !yVar.g()) {
            boolean z = r(keyEvent.getKeyCode()) && this.j && !this.f.L();
            t(true);
            return z || o(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }
        this.h.requestFocus();
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean getControllerAutoShow() {
        return this.n;
    }

    public boolean getControllerHideOnTouch() {
        return this.p;
    }

    public int getControllerShowTimeoutMs() {
        return this.m;
    }

    public Bitmap getDefaultArtwork() {
        return this.l;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.h;
    }

    public y getPlayer() {
        return this.i;
    }

    public SubtitleView getSubtitleView() {
        return this.e;
    }

    public boolean getUseArtwork() {
        return this.k;
    }

    public boolean getUseController() {
        return this.j;
    }

    public View getVideoSurfaceView() {
        return this.c;
    }

    public boolean o(KeyEvent keyEvent) {
        return this.j && this.f.E(keyEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j || this.i == null || motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (!this.f.L()) {
            t(true);
        } else if (this.p) {
            this.f.H();
        }
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.j || this.i == null) {
            return false;
        }
        t(true);
        return true;
    }

    public void q() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.H();
        }
    }

    public void setControlDispatcher(c cVar) {
        b.a.a.a.r0.a.f(this.f != null);
        this.f.setControlDispatcher(cVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.n = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.o = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        b.a.a.a.r0.a.f(this.f != null);
        this.p = z;
    }

    public void setControllerShowTimeoutMs(int i2) {
        b.a.a.a.r0.a.f(this.f != null);
        this.m = i2;
        if (this.f.L()) {
            y();
        }
    }

    public void setControllerVisibilityListener(a.d dVar) {
        b.a.a.a.r0.a.f(this.f != null);
        this.f.setVisibilityListener(dVar);
    }

    public void setDefaultArtwork(Bitmap bitmap) {
        if (this.l != bitmap) {
            this.l = bitmap;
            A();
        }
    }

    public void setFastForwardIncrementMs(int i2) {
        b.a.a.a.r0.a.f(this.f != null);
        this.f.setFastForwardIncrementMs(i2);
    }

    public void setPlaybackPreparer(x xVar) {
        b.a.a.a.r0.a.f(this.f != null);
        this.f.setPlaybackPreparer(xVar);
    }

    public void setPlayer(y yVar) {
        y yVar2 = this.i;
        if (yVar2 != yVar) {
            if (yVar2 != null) {
                yVar2.z(this.g);
                y.d f2 = this.i.f();
                if (f2 != null) {
                    f2.G(this.g);
                    View view = this.c;
                    if (view instanceof TextureView) {
                        f2.D((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        f2.l((SurfaceView) view);
                    }
                }
                y.c J = this.i.J();
                if (J != null) {
                    J.r(this.g);
                }
            }
            this.i = yVar;
            if (this.j) {
                this.f.setPlayer(yVar);
            }
            View view2 = this.f878b;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            SubtitleView subtitleView = this.e;
            if (subtitleView != null) {
                subtitleView.setCues((List<b.a.a.a.o0.b>) null);
            }
            if (yVar != null) {
                y.d f3 = yVar.f();
                if (f3 != null) {
                    View view3 = this.c;
                    if (view3 instanceof TextureView) {
                        f3.C((TextureView) view3);
                    } else if (view3 instanceof SurfaceView) {
                        f3.k((SurfaceView) view3);
                    }
                    f3.I(this.g);
                }
                y.c J2 = yVar.J();
                if (J2 != null) {
                    J2.o(this.g);
                }
                yVar.i(this.g);
                t(false);
                A();
                return;
            }
            q();
            p();
        }
    }

    public void setRepeatToggleModes(int i2) {
        b.a.a.a.r0.a.f(this.f != null);
        this.f.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        b.a.a.a.r0.a.f(this.f877a != null);
        this.f877a.setResizeMode(i2);
    }

    public void setRewindIncrementMs(int i2) {
        b.a.a.a.r0.a.f(this.f != null);
        this.f.setRewindIncrementMs(i2);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        b.a.a.a.r0.a.f(this.f != null);
        this.f.setShowMultiWindowTimeBar(z);
    }

    public void setShowShuffleButton(boolean z) {
        b.a.a.a.r0.a.f(this.f != null);
        this.f.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f878b;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z) {
        b.a.a.a.r0.a.f(!z || this.d != null);
        if (this.k != z) {
            this.k = z;
            A();
        }
    }

    public void setUseController(boolean z) {
        a aVar;
        y yVar;
        b.a.a.a.r0.a.f(!z || this.f != null);
        if (this.j != z) {
            this.j = z;
            if (z) {
                aVar = this.f;
                yVar = this.i;
            } else {
                a aVar2 = this.f;
                if (aVar2 != null) {
                    aVar2.H();
                    aVar = this.f;
                    yVar = null;
                } else {
                    return;
                }
            }
            aVar.setPlayer(yVar);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.c;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    public void y() {
        z(x());
    }
}
