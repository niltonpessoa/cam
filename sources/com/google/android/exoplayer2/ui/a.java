package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a.a.g0;
import b.a.a.a.m;
import b.a.a.a.r0.q;
import b.a.a.a.r0.w;
import b.a.a.a.x;
import b.a.a.a.y;
import com.google.android.exoplayer2.ui.i;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;

public class a extends FrameLayout {
    private boolean A;
    private boolean B;
    private boolean C;
    /* access modifiers changed from: private */
    public boolean D;
    private int E;
    private int F;
    private int G;
    /* access modifiers changed from: private */
    public int H;
    private boolean I;
    private long J;
    private long[] K;
    private boolean[] L;
    private long[] M;
    private boolean[] N;
    private final Runnable O = new C0045a();
    /* access modifiers changed from: private */
    public final Runnable P = new b();

    /* renamed from: a  reason: collision with root package name */
    private final c f882a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final View f883b;
    /* access modifiers changed from: private */
    public final View c;
    /* access modifiers changed from: private */
    public final View d;
    /* access modifiers changed from: private */
    public final View e;
    /* access modifiers changed from: private */
    public final View f;
    /* access modifiers changed from: private */
    public final View g;
    /* access modifiers changed from: private */
    public final ImageView h;
    /* access modifiers changed from: private */
    public final View i;
    private final TextView j;
    /* access modifiers changed from: private */
    public final TextView k;
    private final i l;
    /* access modifiers changed from: private */
    public final StringBuilder m;
    /* access modifiers changed from: private */
    public final Formatter n;
    private final g0.b o;
    private final g0.c p;
    private final Drawable q;
    private final Drawable r;
    private final Drawable s;
    private final String t;
    private final String u;
    private final String v;
    /* access modifiers changed from: private */
    public y w;
    /* access modifiers changed from: private */
    public b.a.a.a.c x;
    private d y;
    /* access modifiers changed from: private */
    public x z;

    /* renamed from: com.google.android.exoplayer2.ui.a$a  reason: collision with other inner class name */
    class C0045a implements Runnable {
        C0045a() {
        }

        public void run() {
            a.this.Y();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            a.this.H();
        }
    }

    private final class c extends y.a implements i.a, View.OnClickListener {
        private c() {
        }

        /* synthetic */ c(a aVar, C0045a aVar2) {
            this();
        }

        public void c(boolean z, int i) {
            a.this.X();
            a.this.Y();
        }

        public void d(int i) {
            a.this.Z();
            a.this.W();
        }

        public void f(int i) {
            a.this.W();
            a.this.Y();
        }

        public void g(i iVar, long j) {
            a aVar = a.this;
            aVar.removeCallbacks(aVar.P);
            boolean unused = a.this.D = true;
        }

        public void h(i iVar, long j, boolean z) {
            boolean unused = a.this.D = false;
            if (!z && a.this.w != null) {
                a.this.S(j);
            }
            a.this.I();
        }

        public void i(i iVar, long j) {
            if (a.this.k != null) {
                a.this.k.setText(w.u(a.this.m, a.this.n, j));
            }
        }

        public void k(boolean z) {
            a.this.a0();
            a.this.W();
        }

        public void l(g0 g0Var, Object obj, int i) {
            a.this.W();
            a.this.b0();
            a.this.Y();
        }

        public void onClick(View view) {
            b.a.a.a.c cVar;
            y yVar;
            if (a.this.w != null) {
                if (a.this.c == view) {
                    a.this.M();
                } else if (a.this.f883b == view) {
                    a.this.N();
                } else if (a.this.f == view) {
                    a.this.F();
                } else if (a.this.g == view) {
                    a.this.P();
                } else {
                    boolean z = true;
                    if (a.this.d == view) {
                        if (a.this.w.w() == 1) {
                            if (a.this.z != null) {
                                a.this.z.a();
                            }
                        } else if (a.this.w.w() == 4) {
                            a.this.x.d(a.this.w, a.this.w.B(), -9223372036854775807L);
                        }
                        cVar = a.this.x;
                        yVar = a.this.w;
                    } else if (a.this.e == view) {
                        cVar = a.this.x;
                        yVar = a.this.w;
                        z = false;
                    } else if (a.this.h == view) {
                        a.this.x.a(a.this.w, q.a(a.this.w.s(), a.this.H));
                    } else if (a.this.i == view) {
                        a.this.x.b(a.this.w, true ^ a.this.w.y());
                    }
                    cVar.c(yVar, z);
                }
            }
            a.this.I();
        }
    }

    public interface d {
        void a(int i);
    }

    static {
        m.a("goog.exo.ui");
    }

    public a(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        super(context, attributeSet, i2);
        int i3 = e.exo_player_control_view;
        this.E = BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT;
        this.F = 15000;
        this.G = BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT;
        this.H = 0;
        this.J = -9223372036854775807L;
        this.I = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, g.q, 0, 0);
            try {
                this.E = obtainStyledAttributes.getInt(g.u, this.E);
                this.F = obtainStyledAttributes.getInt(g.s, this.F);
                this.G = obtainStyledAttributes.getInt(g.w, this.G);
                i3 = obtainStyledAttributes.getResourceId(g.r, i3);
                this.H = G(obtainStyledAttributes, this.H);
                this.I = obtainStyledAttributes.getBoolean(g.v, this.I);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.o = new g0.b();
        this.p = new g0.c();
        StringBuilder sb = new StringBuilder();
        this.m = sb;
        this.n = new Formatter(sb, Locale.getDefault());
        this.K = new long[0];
        this.L = new boolean[0];
        this.M = new long[0];
        this.N = new boolean[0];
        c cVar = new c(this, (C0045a) null);
        this.f882a = cVar;
        this.x = new b.a.a.a.d();
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        this.j = (TextView) findViewById(d.exo_duration);
        this.k = (TextView) findViewById(d.exo_position);
        i iVar = (i) findViewById(d.exo_progress);
        this.l = iVar;
        if (iVar != null) {
            iVar.a(cVar);
        }
        View findViewById = findViewById(d.exo_play);
        this.d = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(cVar);
        }
        View findViewById2 = findViewById(d.exo_pause);
        this.e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar);
        }
        View findViewById3 = findViewById(d.exo_prev);
        this.f883b = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar);
        }
        View findViewById4 = findViewById(d.exo_next);
        this.c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(cVar);
        }
        View findViewById5 = findViewById(d.exo_rew);
        this.g = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(cVar);
        }
        View findViewById6 = findViewById(d.exo_ffwd);
        this.f = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(d.exo_repeat_toggle);
        this.h = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        View findViewById7 = findViewById(d.exo_shuffle);
        this.i = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(cVar);
        }
        Resources resources = context.getResources();
        this.q = resources.getDrawable(c.exo_controls_repeat_off);
        this.r = resources.getDrawable(c.exo_controls_repeat_one);
        this.s = resources.getDrawable(c.exo_controls_repeat_all);
        this.t = resources.getString(f.exo_controls_repeat_off_description);
        this.u = resources.getString(f.exo_controls_repeat_one_description);
        this.v = resources.getString(f.exo_controls_repeat_all_description);
    }

    private static boolean D(g0 g0Var, g0.c cVar) {
        if (g0Var.o() > 100) {
            return false;
        }
        int o2 = g0Var.o();
        for (int i2 = 0; i2 < o2; i2++) {
            if (g0Var.l(i2, cVar).g == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void F() {
        if (this.F > 0) {
            long t2 = this.w.t();
            long H2 = this.w.H() + ((long) this.F);
            if (t2 != -9223372036854775807L) {
                H2 = Math.min(H2, t2);
            }
            R(H2);
        }
    }

    private static int G(TypedArray typedArray, int i2) {
        return typedArray.getInt(g.t, i2);
    }

    /* access modifiers changed from: private */
    public void I() {
        removeCallbacks(this.P);
        if (this.G > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i2 = this.G;
            this.J = uptimeMillis + ((long) i2);
            if (this.A) {
                postDelayed(this.P, (long) i2);
                return;
            }
            return;
        }
        this.J = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean J(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    private boolean K() {
        y yVar = this.w;
        return (yVar == null || yVar.w() == 4 || this.w.w() == 1 || !this.w.q()) ? false : true;
    }

    /* access modifiers changed from: private */
    public void M() {
        g0 v2 = this.w.v();
        if (!v2.p()) {
            int B2 = this.w.B();
            int h2 = this.w.h();
            if (h2 != -1) {
                Q(h2, -9223372036854775807L);
            } else if (v2.m(B2, this.p, false).c) {
                Q(B2, -9223372036854775807L);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r1.f243b == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N() {
        /*
            r6 = this;
            b.a.a.a.y r0 = r6.w
            b.a.a.a.g0 r0 = r0.v()
            boolean r1 = r0.p()
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            b.a.a.a.y r1 = r6.w
            int r1 = r1.B()
            b.a.a.a.g0$c r2 = r6.p
            r0.l(r1, r2)
            b.a.a.a.y r0 = r6.w
            int r0 = r0.n()
            r1 = -1
            if (r0 == r1) goto L_0x0040
            b.a.a.a.y r1 = r6.w
            long r1 = r1.H()
            r3 = 3000(0xbb8, double:1.482E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0037
            b.a.a.a.g0$c r1 = r6.p
            boolean r2 = r1.c
            if (r2 == 0) goto L_0x0040
            boolean r1 = r1.f243b
            if (r1 != 0) goto L_0x0040
        L_0x0037:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.Q(r0, r1)
            goto L_0x0045
        L_0x0040:
            r0 = 0
            r6.R(r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.a.N():void");
    }

    private void O() {
        View view;
        View view2;
        boolean K2 = K();
        if (!K2 && (view2 = this.d) != null) {
            view2.requestFocus();
        } else if (K2 && (view = this.e) != null) {
            view.requestFocus();
        }
    }

    /* access modifiers changed from: private */
    public void P() {
        if (this.E > 0) {
            R(Math.max(this.w.H() - ((long) this.E), 0));
        }
    }

    private void Q(int i2, long j2) {
        if (!this.x.d(this.w, i2, j2)) {
            Y();
        }
    }

    private void R(long j2) {
        Q(this.w.B(), j2);
    }

    /* access modifiers changed from: private */
    public void S(long j2) {
        int i2;
        g0 v2 = this.w.v();
        if (this.C && !v2.p()) {
            int o2 = v2.o();
            i2 = 0;
            while (true) {
                long b2 = v2.l(i2, this.p).b();
                if (j2 < b2) {
                    break;
                } else if (i2 == o2 - 1) {
                    j2 = b2;
                    break;
                } else {
                    j2 -= b2;
                    i2++;
                }
            }
        } else {
            i2 = this.w.B();
        }
        Q(i2, j2);
    }

    private void T(boolean z2, View view) {
        if (view != null) {
            view.setEnabled(z2);
            view.setAlpha(z2 ? 1.0f : 0.3f);
            view.setVisibility(0);
        }
    }

    private void V() {
        X();
        W();
        Z();
        a0();
        Y();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W() {
        /*
            r6 = this;
            boolean r0 = r6.L()
            if (r0 == 0) goto L_0x008e
            boolean r0 = r6.A
            if (r0 != 0) goto L_0x000c
            goto L_0x008e
        L_0x000c:
            b.a.a.a.y r0 = r6.w
            if (r0 == 0) goto L_0x0015
            b.a.a.a.g0 r0 = r0.v()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            boolean r3 = r0.p()
            if (r3 != 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x005f
            b.a.a.a.y r3 = r6.w
            boolean r3 = r3.g()
            if (r3 != 0) goto L_0x005f
            b.a.a.a.y r3 = r6.w
            int r3 = r3.B()
            b.a.a.a.g0$c r4 = r6.p
            r0.l(r3, r4)
            b.a.a.a.g0$c r0 = r6.p
            boolean r3 = r0.f243b
            r4 = -1
            if (r3 != 0) goto L_0x004e
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x004e
            b.a.a.a.y r0 = r6.w
            int r0 = r0.n()
            if (r0 == r4) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r0 = 0
            goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            b.a.a.a.g0$c r5 = r6.p
            boolean r5 = r5.c
            if (r5 != 0) goto L_0x005d
            b.a.a.a.y r5 = r6.w
            int r5 = r5.h()
            if (r5 == r4) goto L_0x0061
        L_0x005d:
            r4 = 1
            goto L_0x0062
        L_0x005f:
            r0 = 0
            r3 = 0
        L_0x0061:
            r4 = 0
        L_0x0062:
            android.view.View r5 = r6.f883b
            r6.T(r0, r5)
            android.view.View r0 = r6.c
            r6.T(r4, r0)
            int r0 = r6.F
            if (r0 <= 0) goto L_0x0074
            if (r3 == 0) goto L_0x0074
            r0 = 1
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            android.view.View r4 = r6.f
            r6.T(r0, r4)
            int r0 = r6.E
            if (r0 <= 0) goto L_0x0081
            if (r3 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            android.view.View r0 = r6.g
            r6.T(r1, r0)
            com.google.android.exoplayer2.ui.i r0 = r6.l
            if (r0 == 0) goto L_0x008e
            r0.setEnabled(r3)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.a.W():void");
    }

    /* access modifiers changed from: private */
    public void X() {
        boolean z2;
        if (L() && this.A) {
            boolean K2 = K();
            View view = this.d;
            int i2 = 8;
            boolean z3 = true;
            if (view != null) {
                z2 = (K2 && view.isFocused()) | false;
                this.d.setVisibility(K2 ? 8 : 0);
            } else {
                z2 = false;
            }
            View view2 = this.e;
            if (view2 != null) {
                if (K2 || !view2.isFocused()) {
                    z3 = false;
                }
                z2 |= z3;
                View view3 = this.e;
                if (K2) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
            }
            if (z2) {
                O();
            }
        }
    }

    /* access modifiers changed from: private */
    public void Y() {
        long j2;
        long j3;
        int i2;
        long j4;
        g0.c cVar;
        int i3;
        if (L() && this.A) {
            y yVar = this.w;
            long j5 = 0;
            boolean z2 = true;
            if (yVar != null) {
                g0 v2 = yVar.v();
                if (!v2.p()) {
                    int B2 = this.w.B();
                    boolean z3 = this.C;
                    int i4 = z3 ? 0 : B2;
                    int o2 = z3 ? v2.o() - 1 : B2;
                    long j6 = 0;
                    j4 = 0;
                    i2 = 0;
                    while (true) {
                        if (i4 > o2) {
                            break;
                        }
                        if (i4 == B2) {
                            j4 = j6;
                        }
                        v2.l(i4, this.p);
                        g0.c cVar2 = this.p;
                        int i5 = o2;
                        if (cVar2.g == -9223372036854775807L) {
                            b.a.a.a.r0.a.f(this.C ^ z2);
                            break;
                        }
                        int i6 = cVar2.d;
                        while (true) {
                            cVar = this.p;
                            if (i6 > cVar.e) {
                                break;
                            }
                            v2.f(i6, this.o);
                            int c2 = this.o.c();
                            int i7 = 0;
                            while (i7 < c2) {
                                long f2 = this.o.f(i7);
                                if (f2 == Long.MIN_VALUE) {
                                    i3 = B2;
                                    long j7 = this.o.d;
                                    if (j7 == -9223372036854775807L) {
                                        i7++;
                                        B2 = i3;
                                    } else {
                                        f2 = j7;
                                    }
                                } else {
                                    i3 = B2;
                                }
                                long l2 = f2 + this.o.l();
                                if (l2 >= 0 && l2 <= this.p.g) {
                                    long[] jArr = this.K;
                                    if (i2 == jArr.length) {
                                        int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                        this.K = Arrays.copyOf(jArr, length);
                                        this.L = Arrays.copyOf(this.L, length);
                                    }
                                    this.K[i2] = b.a.a.a.b.b(j6 + l2);
                                    this.L[i2] = this.o.m(i7);
                                    i2++;
                                }
                                i7++;
                                B2 = i3;
                            }
                            int i8 = B2;
                            i6++;
                        }
                        j6 += cVar.g;
                        i4++;
                        o2 = i5;
                        B2 = B2;
                        z2 = true;
                    }
                    j5 = j6;
                } else {
                    j4 = 0;
                    i2 = 0;
                }
                j5 = b.a.a.a.b.b(j5);
                long b2 = b.a.a.a.b.b(j4);
                if (this.w.g()) {
                    j3 = b2 + this.w.j();
                    j2 = j3;
                } else {
                    long H2 = this.w.H() + b2;
                    long p2 = b2 + this.w.p();
                    j3 = H2;
                    j2 = p2;
                }
                if (this.l != null) {
                    int length2 = this.M.length;
                    int i9 = i2 + length2;
                    long[] jArr2 = this.K;
                    if (i9 > jArr2.length) {
                        this.K = Arrays.copyOf(jArr2, i9);
                        this.L = Arrays.copyOf(this.L, i9);
                    }
                    System.arraycopy(this.M, 0, this.K, i2, length2);
                    System.arraycopy(this.N, 0, this.L, i2, length2);
                    this.l.b(this.K, this.L, i9);
                }
            } else {
                j3 = 0;
                j2 = 0;
            }
            TextView textView = this.j;
            if (textView != null) {
                textView.setText(w.u(this.m, this.n, j5));
            }
            TextView textView2 = this.k;
            if (textView2 != null && !this.D) {
                textView2.setText(w.u(this.m, this.n, j3));
            }
            i iVar = this.l;
            if (iVar != null) {
                iVar.setPosition(j3);
                this.l.setBufferedPosition(j2);
                this.l.setDuration(j5);
            }
            removeCallbacks(this.O);
            y yVar2 = this.w;
            int w2 = yVar2 == null ? 1 : yVar2.w();
            if (w2 != 1 && w2 != 4) {
                long j8 = 1000;
                if (this.w.q() && w2 == 3) {
                    float f3 = this.w.c().f787a;
                    if (f3 > 0.1f) {
                        if (f3 <= 5.0f) {
                            long max = (long) (1000 / Math.max(1, Math.round(1.0f / f3)));
                            long j9 = max - (j3 % max);
                            if (j9 < max / 5) {
                                j9 += max;
                            }
                            if (f3 != 1.0f) {
                                j9 = (long) (((float) j9) / f3);
                            }
                            j8 = j9;
                        } else {
                            j8 = 200;
                        }
                    }
                }
                postDelayed(this.O, j8);
            }
        }
    }

    /* access modifiers changed from: private */
    public void Z() {
        ImageView imageView;
        String str;
        ImageView imageView2;
        if (L() && this.A && (imageView = this.h) != null) {
            if (this.H == 0) {
                imageView.setVisibility(8);
            } else if (this.w == null) {
                T(false, imageView);
            } else {
                T(true, imageView);
                int s2 = this.w.s();
                if (s2 == 0) {
                    this.h.setImageDrawable(this.q);
                    imageView2 = this.h;
                    str = this.t;
                } else if (s2 != 1) {
                    if (s2 == 2) {
                        this.h.setImageDrawable(this.s);
                        imageView2 = this.h;
                        str = this.v;
                    }
                    this.h.setVisibility(0);
                } else {
                    this.h.setImageDrawable(this.r);
                    imageView2 = this.h;
                    str = this.u;
                }
                imageView2.setContentDescription(str);
                this.h.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a0() {
        View view;
        if (L() && this.A && (view = this.i) != null) {
            if (!this.I) {
                view.setVisibility(8);
                return;
            }
            y yVar = this.w;
            if (yVar == null) {
                T(false, view);
                return;
            }
            view.setAlpha(yVar.y() ? 1.0f : 0.3f);
            this.i.setEnabled(true);
            this.i.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void b0() {
        y yVar = this.w;
        if (yVar != null) {
            this.C = this.B && D(yVar.v(), this.p);
        }
    }

    public boolean E(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.w == null || !J(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                F();
            } else if (keyCode == 89) {
                P();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    b.a.a.a.c cVar = this.x;
                    y yVar = this.w;
                    cVar.c(yVar, !yVar.q());
                } else if (keyCode == 87) {
                    M();
                } else if (keyCode == 88) {
                    N();
                } else if (keyCode == 126) {
                    this.x.c(this.w, true);
                } else if (keyCode == 127) {
                    this.x.c(this.w, false);
                }
            }
        }
        return true;
    }

    public void H() {
        if (L()) {
            setVisibility(8);
            d dVar = this.y;
            if (dVar != null) {
                dVar.a(getVisibility());
            }
            removeCallbacks(this.O);
            removeCallbacks(this.P);
            this.J = -9223372036854775807L;
        }
    }

    public boolean L() {
        return getVisibility() == 0;
    }

    public void U() {
        if (!L()) {
            setVisibility(0);
            d dVar = this.y;
            if (dVar != null) {
                dVar.a(getVisibility());
            }
            V();
            O();
        }
        I();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return E(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public y getPlayer() {
        return this.w;
    }

    public int getRepeatToggleModes() {
        return this.H;
    }

    public boolean getShowShuffleButton() {
        return this.I;
    }

    public int getShowTimeoutMs() {
        return this.G;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
        long j2 = this.J;
        if (j2 != -9223372036854775807L) {
            long uptimeMillis = j2 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                H();
            } else {
                postDelayed(this.P, uptimeMillis);
            }
        } else if (L()) {
            I();
        }
        V();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = false;
        removeCallbacks(this.O);
        removeCallbacks(this.P);
    }

    public void setControlDispatcher(b.a.a.a.c cVar) {
        if (cVar == null) {
            cVar = new b.a.a.a.d();
        }
        this.x = cVar;
    }

    public void setFastForwardIncrementMs(int i2) {
        this.F = i2;
        W();
    }

    public void setPlaybackPreparer(x xVar) {
        this.z = xVar;
    }

    public void setPlayer(y yVar) {
        y yVar2 = this.w;
        if (yVar2 != yVar) {
            if (yVar2 != null) {
                yVar2.z(this.f882a);
            }
            this.w = yVar;
            if (yVar != null) {
                yVar.i(this.f882a);
            }
            V();
        }
    }

    public void setRepeatToggleModes(int i2) {
        int i3;
        b.a.a.a.c cVar;
        y yVar;
        this.H = i2;
        y yVar2 = this.w;
        if (yVar2 != null) {
            int s2 = yVar2.s();
            if (i2 != 0 || s2 == 0) {
                i3 = 2;
                if (i2 == 1 && s2 == 2) {
                    this.x.a(this.w, 1);
                    return;
                } else if (i2 == 2 && s2 == 1) {
                    cVar = this.x;
                    yVar = this.w;
                } else {
                    return;
                }
            } else {
                cVar = this.x;
                yVar = this.w;
                i3 = 0;
            }
            cVar.a(yVar, i3);
        }
    }

    public void setRewindIncrementMs(int i2) {
        this.E = i2;
        W();
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        this.B = z2;
        b0();
    }

    public void setShowShuffleButton(boolean z2) {
        this.I = z2;
        a0();
    }

    public void setShowTimeoutMs(int i2) {
        this.G = i2;
        if (L()) {
            I();
        }
    }

    public void setVisibilityListener(d dVar) {
        this.y = dVar;
    }
}
