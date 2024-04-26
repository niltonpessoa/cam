package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import b.a.a.a.o0.a;
import b.a.a.a.o0.b;
import b.a.a.a.r0.w;

final class h {
    private float A;
    private float B;
    private int C;
    private int D;
    private int E;
    private int F;
    private StaticLayout G;
    private int H;
    private int I;
    private int J;
    private Rect K;

    /* renamed from: a  reason: collision with root package name */
    private final RectF f889a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    private final float f890b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final TextPaint h;
    private final Paint i;
    private CharSequence j;
    private Layout.Alignment k;
    private Bitmap l;
    private float m;
    private int n;
    private int o;
    private float p;
    private int q;
    private float r;
    private float s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public h(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.g = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f890b = round;
        this.c = round;
        this.d = round;
        this.e = round;
        TextPaint textPaint = new TextPaint();
        this.h = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.l, (Rect) null, this.K, (Paint) null);
    }

    private void d(Canvas canvas, boolean z2) {
        if (z2) {
            e(canvas);
        } else {
            c(canvas);
        }
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.G;
        if (staticLayout != null) {
            int save = canvas.save();
            canvas.translate((float) this.H, (float) this.I);
            if (Color.alpha(this.x) > 0) {
                this.i.setColor(this.x);
                canvas.drawRect((float) (-this.J), 0.0f, (float) (staticLayout.getWidth() + this.J), (float) staticLayout.getHeight(), this.i);
            }
            if (Color.alpha(this.w) > 0) {
                this.i.setColor(this.w);
                float lineTop = (float) staticLayout.getLineTop(0);
                int lineCount = staticLayout.getLineCount();
                int i2 = 0;
                while (i2 < lineCount) {
                    this.f889a.left = staticLayout.getLineLeft(i2) - ((float) this.J);
                    this.f889a.right = staticLayout.getLineRight(i2) + ((float) this.J);
                    RectF rectF = this.f889a;
                    rectF.top = lineTop;
                    rectF.bottom = (float) staticLayout.getLineBottom(i2);
                    RectF rectF2 = this.f889a;
                    float f2 = rectF2.bottom;
                    float f3 = this.f890b;
                    canvas.drawRoundRect(rectF2, f3, f3, this.i);
                    i2++;
                    lineTop = f2;
                }
            }
            int i3 = this.z;
            boolean z2 = true;
            if (i3 == 1) {
                this.h.setStrokeJoin(Paint.Join.ROUND);
                this.h.setStrokeWidth(this.c);
                this.h.setColor(this.y);
                this.h.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout.draw(canvas);
            } else if (i3 == 2) {
                TextPaint textPaint = this.h;
                float f4 = this.d;
                float f5 = this.e;
                textPaint.setShadowLayer(f4, f5, f5, this.y);
            } else if (i3 == 3 || i3 == 4) {
                if (i3 != 3) {
                    z2 = false;
                }
                int i4 = -1;
                int i5 = z2 ? -1 : this.y;
                if (z2) {
                    i4 = this.y;
                }
                float f6 = this.d / 2.0f;
                this.h.setColor(this.v);
                this.h.setStyle(Paint.Style.FILL);
                float f7 = -f6;
                this.h.setShadowLayer(this.d, f7, f7, i5);
                staticLayout.draw(canvas);
                this.h.setShadowLayer(this.d, f6, f6, i4);
            }
            this.h.setColor(this.v);
            this.h.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.h.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r7 = this;
            int r0 = r7.E
            int r1 = r7.C
            int r0 = r0 - r1
            int r2 = r7.F
            int r3 = r7.D
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.p
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r3 = (float) r3
            float r2 = (float) r2
            float r4 = r7.m
            float r4 = r4 * r2
            float r3 = r3 + r4
            float r4 = r7.r
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.s
            r5 = 1
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0028
            goto L_0x0038
        L_0x0028:
            float r2 = (float) r0
            android.graphics.Bitmap r4 = r7.l
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.l
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
        L_0x0038:
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r7.o
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L_0x0047
            float r4 = (float) r0
        L_0x0045:
            float r1 = r1 - r4
            goto L_0x004d
        L_0x0047:
            if (r4 != r5) goto L_0x004d
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L_0x0045
        L_0x004d:
            int r1 = java.lang.Math.round(r1)
            int r4 = r7.q
            if (r4 != r6) goto L_0x0058
            float r4 = (float) r2
        L_0x0056:
            float r3 = r3 - r4
            goto L_0x005e
        L_0x0058:
            if (r4 != r5) goto L_0x005e
            int r4 = r2 / 2
            float r4 = (float) r4
            goto L_0x0056
        L_0x005e:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r1
            int r2 = r2 + r3
            r4.<init>(r1, r3, r0, r2)
            r7.K = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h.f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.E
            int r2 = r0.C
            int r1 = r1 - r2
            int r2 = r0.F
            int r3 = r0.D
            int r2 = r2 - r3
            android.text.TextPaint r3 = r0.h
            float r4 = r0.A
            r3.setTextSize(r4)
            float r3 = r0.A
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            int r4 = r3 * 2
            int r5 = r1 - r4
            float r6 = r0.r
            r7 = 1
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x002c
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
        L_0x002c:
            java.lang.String r6 = "SubtitlePainter"
            if (r5 > 0) goto L_0x0036
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            android.util.Log.w(r6, r1)
            return
        L_0x0036:
            boolean r8 = r0.u
            r15 = 0
            if (r8 == 0) goto L_0x0042
            boolean r8 = r0.t
            if (r8 == 0) goto L_0x0042
            java.lang.CharSequence r8 = r0.j
            goto L_0x004c
        L_0x0042:
            boolean r8 = r0.t
            if (r8 != 0) goto L_0x004f
            java.lang.CharSequence r8 = r0.j
            java.lang.String r8 = r8.toString()
        L_0x004c:
            r17 = r8
            goto L_0x0082
        L_0x004f:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r9 = r0.j
            r8.<init>(r9)
            int r9 = r8.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r10 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r10 = r8.getSpans(r15, r9, r10)
            android.text.style.AbsoluteSizeSpan[] r10 = (android.text.style.AbsoluteSizeSpan[]) r10
            java.lang.Class<android.text.style.RelativeSizeSpan> r11 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r9 = r8.getSpans(r15, r9, r11)
            android.text.style.RelativeSizeSpan[] r9 = (android.text.style.RelativeSizeSpan[]) r9
            int r11 = r10.length
            r12 = 0
        L_0x006c:
            if (r12 >= r11) goto L_0x0076
            r13 = r10[r12]
            r8.removeSpan(r13)
            int r12 = r12 + 1
            goto L_0x006c
        L_0x0076:
            int r10 = r9.length
            r11 = 0
        L_0x0078:
            if (r11 >= r10) goto L_0x004c
            r12 = r9[r11]
            r8.removeSpan(r12)
            int r11 = r11 + 1
            goto L_0x0078
        L_0x0082:
            android.text.Layout$Alignment r8 = r0.k
            if (r8 != 0) goto L_0x0088
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x0088:
            r20 = r8
            android.text.StaticLayout r14 = new android.text.StaticLayout
            android.text.TextPaint r10 = r0.h
            float r13 = r0.f
            float r12 = r0.g
            r16 = 1
            r8 = r14
            r9 = r17
            r11 = r5
            r18 = r12
            r12 = r20
            r7 = r14
            r14 = r18
            r24 = r3
            r3 = 0
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.G = r7
            int r7 = r7.getHeight()
            android.text.StaticLayout r8 = r0.G
            int r8 = r8.getLineCount()
            r9 = 0
            r15 = 0
        L_0x00b5:
            if (r15 >= r8) goto L_0x00ca
            android.text.StaticLayout r10 = r0.G
            float r10 = r10.getLineWidth(r15)
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            int r9 = java.lang.Math.max(r10, r9)
            int r15 = r15 + 1
            goto L_0x00b5
        L_0x00ca:
            float r8 = r0.r
            r10 = 1
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x00d4
            if (r9 >= r5) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r5 = r9
        L_0x00d5:
            int r5 = r5 + r4
            float r4 = r0.p
            r8 = 1
            r9 = 2
            int r11 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r11 == 0) goto L_0x0100
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            int r4 = r0.C
            int r1 = r1 + r4
            int r10 = r0.q
            if (r10 != r9) goto L_0x00ee
            int r1 = r1 - r5
            goto L_0x00f4
        L_0x00ee:
            if (r10 != r8) goto L_0x00f4
            int r1 = r1 * 2
            int r1 = r1 - r5
            int r1 = r1 / r9
        L_0x00f4:
            int r1 = java.lang.Math.max(r1, r4)
            int r5 = r5 + r1
            int r4 = r0.E
            int r4 = java.lang.Math.min(r5, r4)
            goto L_0x0104
        L_0x0100:
            int r1 = r1 - r5
            int r1 = r1 / r9
            int r4 = r1 + r5
        L_0x0104:
            int r4 = r4 - r1
            if (r4 > 0) goto L_0x010d
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            android.util.Log.w(r6, r1)
            return
        L_0x010d:
            float r5 = r0.m
            r6 = 1
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0167
            int r6 = r0.n
            if (r6 != 0) goto L_0x0123
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = java.lang.Math.round(r2)
        L_0x011f:
            int r3 = r0.D
        L_0x0121:
            int r2 = r2 + r3
            goto L_0x014c
        L_0x0123:
            android.text.StaticLayout r2 = r0.G
            int r2 = r2.getLineBottom(r3)
            android.text.StaticLayout r5 = r0.G
            int r3 = r5.getLineTop(r3)
            int r2 = r2 - r3
            float r3 = r0.m
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x013f
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            goto L_0x011f
        L_0x013f:
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r5
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            int r3 = r0.F
            goto L_0x0121
        L_0x014c:
            int r3 = r0.o
            if (r3 != r9) goto L_0x0152
            int r2 = r2 - r7
            goto L_0x0158
        L_0x0152:
            if (r3 != r8) goto L_0x0158
            int r2 = r2 * 2
            int r2 = r2 - r7
            int r2 = r2 / r9
        L_0x0158:
            int r3 = r2 + r7
            int r5 = r0.F
            if (r3 <= r5) goto L_0x0161
            int r2 = r5 - r7
            goto L_0x0172
        L_0x0161:
            int r3 = r0.D
            if (r2 >= r3) goto L_0x0172
            r2 = r3
            goto L_0x0172
        L_0x0167:
            int r3 = r0.F
            int r3 = r3 - r7
            float r2 = (float) r2
            float r5 = r0.B
            float r2 = r2 * r5
            int r2 = (int) r2
            int r2 = r3 - r2
        L_0x0172:
            android.text.StaticLayout r3 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.h
            float r6 = r0.f
            float r7 = r0.g
            r23 = 1
            r16 = r3
            r18 = r5
            r19 = r4
            r21 = r6
            r22 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0.G = r3
            r0.H = r1
            r0.I = r2
            r1 = r24
            r0.J = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h.g():void");
    }

    public void b(b bVar, boolean z2, boolean z3, a aVar, float f2, float f3, Canvas canvas, int i2, int i3, int i4, int i5) {
        boolean z4 = bVar.c == null;
        int i6 = -16777216;
        if (z4) {
            if (!TextUtils.isEmpty(bVar.f596a)) {
                i6 = (!bVar.k || !z2) ? aVar.c : bVar.l;
            } else {
                return;
            }
        }
        if (a(this.j, bVar.f596a) && w.b(this.k, bVar.f597b) && this.l == bVar.c && this.m == bVar.d && this.n == bVar.e && w.b(Integer.valueOf(this.o), Integer.valueOf(bVar.f)) && this.p == bVar.g && w.b(Integer.valueOf(this.q), Integer.valueOf(bVar.h)) && this.r == bVar.i && this.s == bVar.j && this.t == z2 && this.u == z3 && this.v == aVar.f594a && this.w == aVar.f595b && this.x == i6 && this.z == aVar.d && this.y == aVar.e && w.b(this.h.getTypeface(), aVar.f) && this.A == f2 && this.B == f3 && this.C == i2 && this.D == i3 && this.E == i4 && this.F == i5) {
            d(canvas, z4);
            return;
        }
        this.j = bVar.f596a;
        this.k = bVar.f597b;
        this.l = bVar.c;
        this.m = bVar.d;
        this.n = bVar.e;
        this.o = bVar.f;
        this.p = bVar.g;
        this.q = bVar.h;
        this.r = bVar.i;
        this.s = bVar.j;
        this.t = z2;
        this.u = z3;
        this.v = aVar.f594a;
        this.w = aVar.f595b;
        this.x = i6;
        this.z = aVar.d;
        this.y = aVar.e;
        this.h.setTypeface(aVar.f);
        this.A = f2;
        this.B = f3;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        this.F = i5;
        if (z4) {
            g();
        } else {
            f();
        }
        d(canvas, z4);
    }
}
