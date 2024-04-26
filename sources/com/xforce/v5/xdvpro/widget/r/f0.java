package com.xforce.v5.xdvpro.widget.r;

import android.graphics.Point;
import com.xforce.v5.xdvpro.widget.r.o;

public class f0 implements o {

    /* renamed from: a  reason: collision with root package name */
    double f1249a;

    /* renamed from: b  reason: collision with root package name */
    double f1250b;
    double c;
    double d;
    Point[] e = new Point[17];
    byte f;
    int g = 24;

    public f0(int i, int i2, int i3, byte b2) {
        int a2 = o.a.a(i3, -45, 45);
        this.f1249a = Math.sin(b(a2));
        this.f1250b = Math.cos(b(a2));
        double a3 = (double) o.a.a(i, 2, 200);
        Double.isNaN(a3);
        this.c = 3.141592653589793d / a3;
        this.f = b2;
        int a4 = o.a.a(i2, -20, 20);
        a4 = a4 == 0 ? 1 : a4;
        double d2 = (double) (a4 * a4);
        Double.isNaN(d2);
        double abs = (double) (Math.abs(a4) / a4);
        Double.isNaN(abs);
        this.d = (d2 / 10.0d) * abs;
        for (int i4 = 0; i4 < 17; i4++) {
            double d3 = (double) (i4 * 4);
            Double.isNaN(d3);
            double d4 = d3 / 17.0d;
            double d5 = (double) i4;
            Double.isNaN(d5);
            double d6 = d5 / 17.0d;
            double d7 = (double) ((int) d4);
            Double.isNaN(d7);
            double d8 = d4 - d7;
            Point[] pointArr = this.e;
            double d9 = this.f1250b;
            double d10 = this.f1249a;
            pointArr[i4] = new Point((int) ((d9 * d8) + (d10 * d6)), (int) ((d9 * d6) - (d10 * d8)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (((r1 * r1) + (r2 * r2)) <= r6) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        if (r2 == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xforce.v5.xdvpro.widget.r.r a(com.xforce.v5.xdvpro.widget.r.r r34) {
        /*
            r33 = this;
            r0 = r33
            r7 = r34
            int r8 = r34.m()
            int r9 = r34.i()
            double r1 = (double) r8
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double.isNaN(r1)
            double r10 = r1 / r3
            int r1 = r34.i()
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r12 = r1 / r3
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r8 <= r9) goto L_0x0027
            int r1 = r1 * r9
            int r1 = r1 / r8
            goto L_0x002a
        L_0x0027:
            int r1 = r1 * r8
            int r1 = r1 / r9
        L_0x002a:
            r14 = r1
            int r15 = r8 >> 1
            int r16 = r9 >> 1
            int r1 = r15 * r15
            int r2 = r16 * r16
            int r1 = r1 + r2
            double r1 = (double) r1
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r3
            int r6 = (int) r1
            r4 = 0
        L_0x003e:
            if (r4 >= r8) goto L_0x0198
            r3 = 0
        L_0x0041:
            if (r3 >= r9) goto L_0x018a
            byte r1 = r0.f
            r2 = 1
            if (r1 != r2) goto L_0x0073
            int r1 = r15 - r4
            int r2 = r16 - r3
            int r5 = r34.m()
            r18 = r15
            int r15 = r34.i()
            if (r5 <= r15) goto L_0x005d
            int r2 = r2 * r14
            int r2 = r2 >> 14
            goto L_0x0061
        L_0x005d:
            int r1 = r1 * r14
            int r1 = r1 >> 14
        L_0x0061:
            int r1 = r1 * r1
            int r2 = r2 * r2
            int r1 = r1 + r2
            if (r1 > r6) goto L_0x00a3
        L_0x0068:
            r15 = r3
            r17 = r4
            r20 = r6
            r22 = r14
            r19 = 0
            goto L_0x017e
        L_0x0073:
            r18 = r15
            r5 = 2
            if (r1 != r5) goto L_0x00a3
            int r1 = r0.g
            if (r4 >= r1) goto L_0x0083
            int r5 = r9 - r4
            if (r3 >= r5) goto L_0x0083
            if (r3 < r4) goto L_0x0083
            goto L_0x00a0
        L_0x0083:
            if (r3 >= r1) goto L_0x008c
            int r5 = r8 - r3
            if (r4 >= r5) goto L_0x008c
            if (r4 < r3) goto L_0x008c
            goto L_0x00a0
        L_0x008c:
            int r5 = r8 - r1
            if (r4 <= r5) goto L_0x009a
            int r5 = r8 - r4
            if (r3 < r5) goto L_0x009a
            int r5 = r9 + r4
            int r5 = r5 - r8
            if (r3 >= r5) goto L_0x009a
            goto L_0x00a0
        L_0x009a:
            int r1 = r9 - r1
            if (r3 <= r1) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r2 = 0
        L_0x00a0:
            if (r2 != 0) goto L_0x00a3
            goto L_0x0068
        L_0x00a3:
            double r1 = (double) r4
            java.lang.Double.isNaN(r1)
            double r1 = r1 - r10
            int r1 = (int) r1
            r15 = r6
            double r5 = (double) r3
            java.lang.Double.isNaN(r5)
            double r5 = r5 - r12
            int r2 = (int) r5
            r21 = r3
            r5 = 0
            r6 = 0
            r19 = 0
            r20 = 0
        L_0x00b8:
            r3 = 17
            if (r5 >= r3) goto L_0x0151
            android.graphics.Point[] r3 = r0.e
            r22 = r14
            r14 = r3[r5]
            int r14 = r14.x
            int r14 = r14 + r1
            r23 = r15
            double r14 = (double) r14
            r3 = r3[r5]
            int r3 = r3.y
            int r3 = r2 - r3
            r24 = r1
            r25 = r2
            double r1 = (double) r3
            r26 = r4
            double r3 = r0.f1250b
            java.lang.Double.isNaN(r14)
            double r27 = r3 * r14
            r29 = r5
            r30 = r6
            double r5 = r0.f1249a
            java.lang.Double.isNaN(r1)
            double r31 = r5 * r1
            double r27 = r27 + r31
            double r5 = -r5
            java.lang.Double.isNaN(r14)
            double r5 = r5 * r14
            java.lang.Double.isNaN(r1)
            double r3 = r3 * r1
            double r5 = r5 + r3
            double r1 = r0.d
            double r3 = r0.c
            double r3 = r3 * r27
            double r3 = java.lang.Math.tan(r3)
            double r1 = r1 * r3
            double r27 = r27 + r1
            double r1 = r0.d
            double r3 = r0.c
            double r3 = r3 * r5
            double r3 = java.lang.Math.tan(r3)
            double r1 = r1 * r3
            double r5 = r5 + r1
            double r1 = r0.f1250b
            double r3 = r1 * r27
            double r14 = r0.f1249a
            double r31 = r14 * r5
            double r3 = r3 - r31
            double r14 = r14 * r27
            double r1 = r1 * r5
            double r14 = r14 + r1
            double r3 = r3 + r10
            int r1 = (int) r3
            double r14 = r14 + r12
            int r2 = (int) r14
            int r3 = r8 + -1
            r5 = 0
            int r1 = com.xforce.v5.xdvpro.widget.r.o.a.a(r1, r5, r3)
            int r3 = r9 + -1
            int r2 = com.xforce.v5.xdvpro.widget.r.o.a.a(r2, r5, r3)
            int r3 = r7.l(r1, r2)
            int r6 = r30 + r3
            int r3 = r7.h(r1, r2)
            int r19 = r19 + r3
            int r1 = r7.f(r1, r2)
            int r20 = r20 + r1
            int r1 = r29 + 1
            r5 = r1
            r14 = r22
            r15 = r23
            r1 = r24
            r2 = r25
            r4 = r26
            goto L_0x00b8
        L_0x0151:
            r26 = r4
            r30 = r6
            r22 = r14
            r23 = r15
            r5 = 0
            int r6 = r30 / 17
            int r4 = com.xforce.v5.xdvpro.widget.r.r.b(r6)
            int r19 = r19 / 17
            int r6 = com.xforce.v5.xdvpro.widget.r.r.b(r19)
            int r20 = r20 / 17
            int r14 = com.xforce.v5.xdvpro.widget.r.r.b(r20)
            r1 = r34
            r2 = r26
            r15 = r21
            r3 = r15
            r17 = r26
            r19 = 0
            r5 = r6
            r20 = r23
            r6 = r14
            r1.o(r2, r3, r4, r5, r6)
        L_0x017e:
            int r3 = r15 + 1
            r4 = r17
            r15 = r18
            r6 = r20
            r14 = r22
            goto L_0x0041
        L_0x018a:
            r17 = r4
            r20 = r6
            r22 = r14
            r18 = r15
            r19 = 0
            int r4 = r17 + 1
            goto L_0x003e
        L_0x0198:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.widget.r.f0.a(com.xforce.v5.xdvpro.widget.r.r):com.xforce.v5.xdvpro.widget.r.r");
    }

    /* access modifiers changed from: package-private */
    public double b(int i) {
        double d2 = (double) i;
        Double.isNaN(d2);
        return (d2 * 3.141592653589793d) / 180.0d;
    }
}
