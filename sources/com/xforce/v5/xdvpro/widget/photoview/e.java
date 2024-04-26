package com.xforce.v5.xdvpro.widget.photoview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    d f1232a;

    private static class a extends e {

        /* renamed from: b  reason: collision with root package name */
        float f1233b;
        float c;
        final float d;
        final float e;
        private VelocityTracker f;
        private boolean g;

        public a(Context context) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.e = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = (float) viewConfiguration.getScaledTouchSlop();
        }

        public boolean a() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
            if (r12 != null) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
            if (r12 == null) goto L_0x00c1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(android.view.MotionEvent r12) {
            /*
                r11 = this;
                int r0 = r12.getAction()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x00aa
                r3 = 0
                if (r0 == r2) goto L_0x005b
                r4 = 2
                if (r0 == r4) goto L_0x001e
                r12 = 3
                if (r0 == r12) goto L_0x0013
                goto L_0x00c1
            L_0x0013:
                android.view.VelocityTracker r12 = r11.f
                if (r12 == 0) goto L_0x00c1
            L_0x0017:
                r12.recycle()
                r11.f = r3
                goto L_0x00c1
            L_0x001e:
                float r0 = r11.d(r12)
                float r3 = r11.e(r12)
                float r4 = r11.f1233b
                float r4 = r0 - r4
                float r5 = r11.c
                float r5 = r3 - r5
                boolean r6 = r11.g
                if (r6 != 0) goto L_0x0046
                float r6 = r4 * r4
                float r7 = r5 * r5
                float r6 = r6 + r7
                double r6 = (double) r6
                double r6 = java.lang.Math.sqrt(r6)
                float r8 = r11.d
                double r8 = (double) r8
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 < 0) goto L_0x0044
                r1 = 1
            L_0x0044:
                r11.g = r1
            L_0x0046:
                boolean r1 = r11.g
                if (r1 == 0) goto L_0x00c1
                com.xforce.v5.xdvpro.widget.photoview.e$d r1 = r11.f1232a
                r1.b(r4, r5)
                r11.f1233b = r0
                r11.c = r3
                android.view.VelocityTracker r0 = r11.f
                if (r0 == 0) goto L_0x00c1
                r0.addMovement(r12)
                goto L_0x00c1
            L_0x005b:
                boolean r0 = r11.g
                if (r0 == 0) goto L_0x00a4
                android.view.VelocityTracker r0 = r11.f
                if (r0 == 0) goto L_0x00a4
                float r0 = r11.d(r12)
                r11.f1233b = r0
                float r0 = r11.e(r12)
                r11.c = r0
                android.view.VelocityTracker r0 = r11.f
                r0.addMovement(r12)
                android.view.VelocityTracker r12 = r11.f
                r0 = 1000(0x3e8, float:1.401E-42)
                r12.computeCurrentVelocity(r0)
                android.view.VelocityTracker r12 = r11.f
                float r12 = r12.getXVelocity()
                android.view.VelocityTracker r0 = r11.f
                float r0 = r0.getYVelocity()
                float r1 = java.lang.Math.abs(r12)
                float r4 = java.lang.Math.abs(r0)
                float r1 = java.lang.Math.max(r1, r4)
                float r4 = r11.e
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 < 0) goto L_0x00a4
                com.xforce.v5.xdvpro.widget.photoview.e$d r1 = r11.f1232a
                float r4 = r11.f1233b
                float r5 = r11.c
                float r12 = -r12
                float r0 = -r0
                r1.c(r4, r5, r12, r0)
            L_0x00a4:
                android.view.VelocityTracker r12 = r11.f
                if (r12 == 0) goto L_0x00c1
                goto L_0x0017
            L_0x00aa:
                android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
                r11.f = r0
                r0.addMovement(r12)
                float r0 = r11.d(r12)
                r11.f1233b = r0
                float r12 = r11.e(r12)
                r11.c = r12
                r11.g = r1
            L_0x00c1:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.widget.photoview.e.a.c(android.view.MotionEvent):boolean");
        }

        /* access modifiers changed from: package-private */
        public float d(MotionEvent motionEvent) {
            return motionEvent.getX();
        }

        /* access modifiers changed from: package-private */
        public float e(MotionEvent motionEvent) {
            return motionEvent.getY();
        }
    }

    @TargetApi(5)
    private static class b extends a {
        private int h = -1;
        private int i = 0;

        public b(Context context) {
            super(context);
        }

        public boolean c(MotionEvent motionEvent) {
            int action = motionEvent.getAction() & 255;
            int i2 = 0;
            if (action != 0) {
                int i3 = 1;
                if (action == 1 || action == 3) {
                    this.h = -1;
                } else if (action == 6) {
                    int action2 = (motionEvent.getAction() & 65280) >> 8;
                    if (motionEvent.getPointerId(action2) == this.h) {
                        if (action2 != 0) {
                            i3 = 0;
                        }
                        this.h = motionEvent.getPointerId(i3);
                        this.f1233b = motionEvent.getX(i3);
                        this.c = motionEvent.getY(i3);
                    }
                }
            } else {
                this.h = motionEvent.getPointerId(0);
            }
            int i4 = this.h;
            if (i4 != -1) {
                i2 = i4;
            }
            this.i = motionEvent.findPointerIndex(i2);
            return super.c(motionEvent);
        }

        /* access modifiers changed from: package-private */
        public float d(MotionEvent motionEvent) {
            try {
                return motionEvent.getX(this.i);
            } catch (Exception unused) {
                return motionEvent.getX();
            }
        }

        /* access modifiers changed from: package-private */
        public float e(MotionEvent motionEvent) {
            try {
                return motionEvent.getY(this.i);
            } catch (Exception unused) {
                return motionEvent.getY();
            }
        }
    }

    @TargetApi(8)
    private static class c extends b {
        private final ScaleGestureDetector j;
        private final ScaleGestureDetector.OnScaleGestureListener k;

        class a implements ScaleGestureDetector.OnScaleGestureListener {
            a() {
            }

            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                c.this.f1232a.a(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }

            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        }

        public c(Context context) {
            super(context);
            a aVar = new a();
            this.k = aVar;
            this.j = new ScaleGestureDetector(context, aVar);
        }

        public boolean a() {
            return this.j.isInProgress();
        }

        public boolean c(MotionEvent motionEvent) {
            this.j.onTouchEvent(motionEvent);
            return super.c(motionEvent);
        }
    }

    public interface d {
        void a(float f, float f2, float f3);

        void b(float f, float f2);

        void c(float f, float f2, float f3, float f4);
    }

    public static e b(Context context, d dVar) {
        int i = Build.VERSION.SDK_INT;
        e aVar = i < 5 ? new a(context) : i < 8 ? new b(context) : new c(context);
        aVar.f1232a = dVar;
        return aVar;
    }

    public abstract boolean a();

    public abstract boolean c(MotionEvent motionEvent);
}
