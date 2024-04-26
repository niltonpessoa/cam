package com.xforce.v5.xdvpro.widget.r;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public float f1273a = 0.9f;

    /* renamed from: b  reason: collision with root package name */
    public int f1274b = a.f1275a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static int f1275a = 3;

        /* renamed from: b  reason: collision with root package name */
        public static int f1276b = 6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x014f, code lost:
        if (r15 > 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0151, code lost:
        r6 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01e5, code lost:
        if (r6 < 255) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x01f8, code lost:
        r17.o(r12, r13, ((r1 * r10) + (r4 * r9)) >> 8, ((r2 * r10) + (r5 * r9)) >> 8, ((r3 * r10) + (r6 * r9)) >> 8);
        r13 = r13 + 1;
        r0 = r16;
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r6 < 255) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        r6 = r6 - 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00ff, code lost:
        if (r0 < 255) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0101, code lost:
        r6 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xforce.v5.xdvpro.widget.r.r a(com.xforce.v5.xdvpro.widget.r.r r17, com.xforce.v5.xdvpro.widget.r.r r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            r8 = r18
            float r1 = r0.f1273a
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            int r9 = (int) r1
            int r10 = 255 - r9
            r12 = 0
        L_0x0010:
            int r1 = r17.m()
            if (r12 >= r1) goto L_0x0224
            r13 = 0
        L_0x0017:
            int r1 = r17.i()
            if (r13 >= r1) goto L_0x021c
            int r1 = r7.l(r12, r13)
            int r2 = r7.h(r12, r13)
            int r3 = r7.f(r12, r13)
            int r4 = r8.l(r12, r13)
            int r5 = r8.h(r12, r13)
            int r6 = r8.f(r12, r13)
            int r14 = r0.f1274b
            r11 = 128(0x80, float:1.794E-43)
            r15 = 255(0xff, float:3.57E-43)
            switch(r14) {
                case 1: goto L_0x01e9;
                case 2: goto L_0x01d6;
                case 3: goto L_0x01cc;
                case 4: goto L_0x0190;
                case 5: goto L_0x0154;
                case 6: goto L_0x0119;
                case 7: goto L_0x010d;
                case 8: goto L_0x0104;
                case 9: goto L_0x00c8;
                case 10: goto L_0x008e;
                case 11: goto L_0x004b;
                case 12: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x01f8
        L_0x0040:
            if (r4 != 0) goto L_0x01f8
            if (r5 != 0) goto L_0x01f8
            if (r4 != 0) goto L_0x01f8
            r4 = r1
            r5 = r2
        L_0x0048:
            r6 = r3
            goto L_0x01f8
        L_0x004b:
            if (r4 >= r11) goto L_0x0057
            int r4 = r4 * 2
            int r4 = r4 + r1
            if (r4 >= r15) goto L_0x0054
            r4 = 0
            goto L_0x0060
        L_0x0054:
            int r4 = r4 + -255
            goto L_0x0060
        L_0x0057:
            int r4 = r4 + -128
            int r4 = r4 * 2
            int r4 = r4 + r1
            if (r4 <= r15) goto L_0x0060
            r4 = 255(0xff, float:3.57E-43)
        L_0x0060:
            if (r5 >= r11) goto L_0x006c
            int r5 = r5 * 2
            int r5 = r5 + r2
            if (r5 >= r15) goto L_0x0069
            r5 = 0
            goto L_0x0075
        L_0x0069:
            int r5 = r5 + -255
            goto L_0x0075
        L_0x006c:
            int r5 = r5 + -128
            int r5 = r5 * 2
            int r5 = r5 + r2
            if (r5 <= r15) goto L_0x0075
            r5 = 255(0xff, float:3.57E-43)
        L_0x0075:
            if (r6 >= r11) goto L_0x0083
            int r6 = r6 * 2
            int r6 = r6 + r3
            if (r6 >= r15) goto L_0x007f
        L_0x007c:
            r6 = 0
            goto L_0x01f8
        L_0x007f:
            int r6 = r6 + -255
            goto L_0x01f8
        L_0x0083:
            int r6 = r6 + -128
            int r6 = r6 * 2
            int r6 = r6 + r3
            if (r6 <= r15) goto L_0x01f8
        L_0x008a:
            r6 = 255(0xff, float:3.57E-43)
            goto L_0x01f8
        L_0x008e:
            int r4 = r4 * r4
            if (r1 == r15) goto L_0x0094
            r11 = r1
            goto L_0x0096
        L_0x0094:
            r11 = 254(0xfe, float:3.56E-43)
        L_0x0096:
            int r11 = 255 - r11
            int r4 = r4 / r11
            int r5 = r5 * r5
            if (r2 == r15) goto L_0x009f
            r11 = r2
            goto L_0x00a1
        L_0x009f:
            r11 = 254(0xfe, float:3.56E-43)
        L_0x00a1:
            int r11 = 255 - r11
            int r5 = r5 / r11
            int r6 = r6 * r6
            if (r3 == r15) goto L_0x00aa
            r11 = r3
            goto L_0x00ac
        L_0x00aa:
            r11 = 254(0xfe, float:3.56E-43)
        L_0x00ac:
            int r11 = 255 - r11
            int r6 = r6 / r11
            if (r1 != r15) goto L_0x00b3
            r4 = r1
            goto L_0x00b8
        L_0x00b3:
            if (r4 >= r15) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r4 = 255(0xff, float:3.57E-43)
        L_0x00b8:
            if (r2 != r15) goto L_0x00bc
            r5 = r2
            goto L_0x00c1
        L_0x00bc:
            if (r5 >= r15) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r5 = 255(0xff, float:3.57E-43)
        L_0x00c1:
            if (r3 != r15) goto L_0x00c4
        L_0x00c3:
            goto L_0x0048
        L_0x00c4:
            if (r6 >= r15) goto L_0x008a
            goto L_0x01f8
        L_0x00c8:
            int r11 = r1 * r1
            if (r4 == r15) goto L_0x00ce
            r14 = r4
            goto L_0x00d0
        L_0x00ce:
            r14 = 254(0xfe, float:3.56E-43)
        L_0x00d0:
            int r14 = 255 - r14
            int r11 = r11 / r14
            int r14 = r2 * r2
            if (r5 == r15) goto L_0x00d9
            r0 = r5
            goto L_0x00db
        L_0x00d9:
            r0 = 254(0xfe, float:3.56E-43)
        L_0x00db:
            int r0 = 255 - r0
            int r14 = r14 / r0
            int r0 = r3 * r3
            if (r6 == r15) goto L_0x00e4
            r8 = r6
            goto L_0x00e6
        L_0x00e4:
            r8 = 254(0xfe, float:3.56E-43)
        L_0x00e6:
            int r8 = 255 - r8
            int r0 = r0 / r8
            if (r4 != r15) goto L_0x00ec
            goto L_0x00f2
        L_0x00ec:
            if (r11 >= r15) goto L_0x00f0
            r4 = r11
            goto L_0x00f2
        L_0x00f0:
            r4 = 255(0xff, float:3.57E-43)
        L_0x00f2:
            if (r5 != r15) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            if (r14 >= r15) goto L_0x00f9
            r5 = r14
            goto L_0x00fb
        L_0x00f9:
            r5 = 255(0xff, float:3.57E-43)
        L_0x00fb:
            if (r6 != r15) goto L_0x00ff
            goto L_0x01f8
        L_0x00ff:
            if (r0 >= r15) goto L_0x008a
        L_0x0101:
            r6 = r0
            goto L_0x01f8
        L_0x0104:
            if (r4 <= r1) goto L_0x0107
            r4 = r1
        L_0x0107:
            if (r5 <= r2) goto L_0x010a
            r5 = r2
        L_0x010a:
            if (r6 <= r3) goto L_0x01f8
            goto L_0x00c3
        L_0x010d:
            if (r4 <= r1) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r4 = r1
        L_0x0111:
            if (r5 <= r2) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r5 = r2
        L_0x0115:
            if (r6 <= r3) goto L_0x0048
            goto L_0x01f8
        L_0x0119:
            int r0 = 255 - r1
            int r0 = r0 << 8
            r8 = 1
            if (r4 == 0) goto L_0x0122
            r11 = r4
            goto L_0x0123
        L_0x0122:
            r11 = 1
        L_0x0123:
            int r0 = r0 / r11
            int r0 = 255 - r0
            int r11 = 255 - r2
            int r11 = r11 << 8
            if (r5 == 0) goto L_0x012e
            r14 = r5
            goto L_0x012f
        L_0x012e:
            r14 = 1
        L_0x012f:
            int r11 = r11 / r14
            int r11 = 255 - r11
            int r14 = 255 - r3
            int r14 = r14 << 8
            if (r6 == 0) goto L_0x0139
            r8 = r6
        L_0x0139:
            int r14 = r14 / r8
            int r15 = r15 - r14
            if (r4 != 0) goto L_0x013e
            goto L_0x0143
        L_0x013e:
            if (r0 <= 0) goto L_0x0142
            r4 = r0
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            if (r5 != 0) goto L_0x0146
            goto L_0x014b
        L_0x0146:
            if (r11 <= 0) goto L_0x014a
            r5 = r11
            goto L_0x014b
        L_0x014a:
            r5 = 0
        L_0x014b:
            if (r6 != 0) goto L_0x014f
            goto L_0x01f8
        L_0x014f:
            if (r15 <= 0) goto L_0x007c
        L_0x0151:
            r6 = r15
            goto L_0x01f8
        L_0x0154:
            int r0 = r1 << 8
            if (r4 == r15) goto L_0x015a
            r8 = r4
            goto L_0x015c
        L_0x015a:
            r8 = 254(0xfe, float:3.56E-43)
        L_0x015c:
            int r8 = 255 - r8
            int r0 = r0 / r8
            int r8 = r2 << 8
            if (r5 == r15) goto L_0x0165
            r11 = r5
            goto L_0x0167
        L_0x0165:
            r11 = 254(0xfe, float:3.56E-43)
        L_0x0167:
            int r11 = 255 - r11
            int r8 = r8 / r11
            int r11 = r3 << 8
            if (r6 == r15) goto L_0x0170
            r14 = r6
            goto L_0x0172
        L_0x0170:
            r14 = 254(0xfe, float:3.56E-43)
        L_0x0172:
            int r14 = 255 - r14
            int r11 = r11 / r14
            if (r4 != r15) goto L_0x0178
            goto L_0x017e
        L_0x0178:
            if (r0 >= r15) goto L_0x017c
            r4 = r0
            goto L_0x017e
        L_0x017c:
            r4 = 255(0xff, float:3.57E-43)
        L_0x017e:
            if (r5 != r15) goto L_0x0181
            goto L_0x0187
        L_0x0181:
            if (r8 >= r15) goto L_0x0185
            r5 = r8
            goto L_0x0187
        L_0x0185:
            r5 = 255(0xff, float:3.57E-43)
        L_0x0187:
            if (r6 != r15) goto L_0x018b
            goto L_0x01f8
        L_0x018b:
            if (r11 >= r15) goto L_0x008a
            r6 = r11
            goto L_0x01f8
        L_0x0190:
            if (r4 >= r11) goto L_0x0198
            int r0 = r1 * 2
            int r0 = r0 * r4
            int r0 = r0 / r15
            goto L_0x01a3
        L_0x0198:
            int r0 = 255 - r1
            int r0 = r0 * 2
            int r4 = 255 - r4
            int r0 = r0 * r4
            int r0 = r0 / r15
            int r0 = 255 - r0
        L_0x01a3:
            r4 = r0
            if (r5 >= r11) goto L_0x01ac
            int r0 = r2 * 2
            int r0 = r0 * r5
            int r0 = r0 / r15
            goto L_0x01b7
        L_0x01ac:
            int r0 = 255 - r2
            int r0 = r0 * 2
            int r5 = 255 - r5
            int r0 = r0 * r5
            int r0 = r0 / r15
            int r0 = 255 - r0
        L_0x01b7:
            r5 = r0
            if (r6 >= r11) goto L_0x01c1
            int r0 = r3 * 2
            int r0 = r0 * r6
            int r0 = r0 / r15
            goto L_0x0101
        L_0x01c1:
            int r0 = 255 - r3
            int r0 = r0 * 2
            int r6 = 255 - r6
            int r0 = r0 * r6
            int r0 = r0 / r15
            int r15 = r15 - r0
            goto L_0x0151
        L_0x01cc:
            int r4 = r4 * r1
            int r4 = r4 / r15
            int r5 = r5 * r2
            int r5 = r5 / r15
            int r6 = r6 * r3
            int r6 = r6 / r15
            goto L_0x01f8
        L_0x01d6:
            int r4 = r4 + r1
            int r5 = r5 + r2
            int r6 = r6 + r3
            if (r4 >= r15) goto L_0x01dd
            r4 = 0
            goto L_0x01df
        L_0x01dd:
            int r4 = r4 + -255
        L_0x01df:
            if (r5 >= r15) goto L_0x01e3
            r5 = 0
            goto L_0x01e5
        L_0x01e3:
            int r5 = r5 + -255
        L_0x01e5:
            if (r6 >= r15) goto L_0x007f
            goto L_0x007c
        L_0x01e9:
            int r4 = r4 + r1
            int r5 = r5 + r2
            int r6 = r6 + r3
            if (r4 <= r15) goto L_0x01f0
            r4 = 255(0xff, float:3.57E-43)
        L_0x01f0:
            if (r5 <= r15) goto L_0x01f4
            r5 = 255(0xff, float:3.57E-43)
        L_0x01f4:
            if (r6 <= r15) goto L_0x01f8
            goto L_0x008a
        L_0x01f8:
            int r1 = r1 * r10
            int r4 = r4 * r9
            int r1 = r1 + r4
            int r2 = r2 * r10
            int r5 = r5 * r9
            int r2 = r2 + r5
            int r3 = r3 * r10
            int r6 = r6 * r9
            int r3 = r3 + r6
            int r4 = r1 >> 8
            int r5 = r2 >> 8
            int r6 = r3 >> 8
            r1 = r17
            r2 = r12
            r3 = r13
            r1.o(r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            r0 = r16
            r8 = r18
            goto L_0x0017
        L_0x021c:
            int r12 = r12 + 1
            r0 = r16
            r8 = r18
            goto L_0x0010
        L_0x0224:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.widget.r.s.a(com.xforce.v5.xdvpro.widget.r.r, com.xforce.v5.xdvpro.widget.r.r):com.xforce.v5.xdvpro.widget.r.r");
    }
}
