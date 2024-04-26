package b.a.a.a.o0.n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import b.a.a.a.r0.l;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class b {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f612a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f613b;
    private final Canvas c = new Canvas();
    private final C0036b d = new C0036b(719, 575, 0, 719, 0, 575);
    private final a e = new a(0, c(), d(), e());
    private final h f;
    private Bitmap g;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f614a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f615b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f614a = i;
            this.f615b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* renamed from: b.a.a.a.o0.n.b$b  reason: collision with other inner class name */
    private static final class C0036b {

        /* renamed from: a  reason: collision with root package name */
        public final int f616a;

        /* renamed from: b  reason: collision with root package name */
        public final int f617b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public C0036b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f616a = i;
            this.f617b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f618a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f619b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f618a = i;
            this.f619b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f620a;

        /* renamed from: b  reason: collision with root package name */
        public final int f621b;
        public final SparseArray<e> c;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.f620a = i2;
            this.f621b = i3;
            this.c = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f622a;

        /* renamed from: b  reason: collision with root package name */
        public final int f623b;

        public e(int i, int i2) {
            this.f622a = i;
            this.f623b = i2;
        }
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f624a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f625b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.f624a = i2;
            this.f625b = z;
            this.c = i3;
            this.d = i4;
            this.e = i6;
            this.f = i7;
            this.g = i8;
            this.h = i9;
            this.i = i10;
            this.j = sparseArray;
        }

        public void a(f fVar) {
            if (fVar != null) {
                SparseArray<g> sparseArray = fVar.j;
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    this.j.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                }
            }
        }
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f626a;

        /* renamed from: b  reason: collision with root package name */
        public final int f627b;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f626a = i3;
            this.f627b = i4;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f628a;

        /* renamed from: b  reason: collision with root package name */
        public final int f629b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public C0036b h;
        public d i;

        public h(int i2, int i3) {
            this.f628a = i2;
            this.f629b = i3;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public b(int i2, int i3) {
        Paint paint = new Paint();
        this.f612a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f613b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f = new h(i2, i3);
    }

    private static byte[] a(int i2, int i3, l lVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) lVar.h(i3);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = 127;
                int i4 = (i2 & 1) != 0 ? 127 : 0;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = f(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = 255;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = f(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                int i7 = 170;
                int i8 = 85;
                if (i6 == 0) {
                    int i9 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i10 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = f(255, i9, i10, i8 + i7);
                } else if (i6 != 8) {
                    int i11 = 43;
                    if (i6 == 128) {
                        int i12 = ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i13 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        int i14 = i11 + 127;
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = f(255, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = f(255, i15, i16, i11 + i8);
                    }
                } else {
                    int i17 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i18 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = f(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }

    private static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[LOOP:0: B:1:0x0009->B:31:0x007b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(b.a.a.a.r0.l r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0059
        L_0x0014:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.h(r6)
            int r4 = r4 + r6
        L_0x0020:
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0059
        L_0x0028:
            boolean r4 = r13.g()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L_0x0056
            if (r4 == r5) goto L_0x0052
            if (r4 == r3) goto L_0x004a
            if (r4 == r6) goto L_0x0041
            r11 = r2
            r4 = 0
        L_0x003f:
            r12 = 0
            goto L_0x0059
        L_0x0041:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            goto L_0x0020
        L_0x004a:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            goto L_0x0020
        L_0x0052:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0059
        L_0x0056:
            r4 = 0
            r11 = 1
            goto L_0x003f
        L_0x0059:
            if (r12 == 0) goto L_0x0077
            if (r8 == 0) goto L_0x0077
            if (r15 == 0) goto L_0x0061
            byte r4 = r15[r4]
        L_0x0061:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0077:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x007b
            return r10
        L_0x007b:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.n.b.g(b.a.a.a.r0.l, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[LOOP:0: B:1:0x0009->B:34:0x0085, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int h(b.a.a.a.r0.l r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x0065
        L_0x0015:
            boolean r4 = r13.g()
            r7 = 3
            if (r4 != 0) goto L_0x002b
            int r3 = r13.h(r7)
            if (r3 == 0) goto L_0x0028
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x0065
        L_0x0028:
            r4 = 0
            r11 = 1
            goto L_0x004c
        L_0x002b:
            boolean r4 = r13.g()
            if (r4 != 0) goto L_0x003e
            int r4 = r13.h(r5)
            int r5 = r4 + 4
        L_0x0037:
            int r4 = r13.h(r3)
            r11 = r2
            r12 = r5
            goto L_0x0065
        L_0x003e:
            int r4 = r13.h(r5)
            if (r4 == 0) goto L_0x0062
            if (r4 == r6) goto L_0x005e
            if (r4 == r5) goto L_0x0057
            if (r4 == r7) goto L_0x004e
            r11 = r2
            r4 = 0
        L_0x004c:
            r12 = 0
            goto L_0x0065
        L_0x004e:
            r4 = 8
            int r4 = r13.h(r4)
            int r5 = r4 + 25
            goto L_0x0037
        L_0x0057:
            int r4 = r13.h(r3)
            int r5 = r4 + 9
            goto L_0x0037
        L_0x005e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0065
        L_0x0062:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x0065:
            if (r12 == 0) goto L_0x0081
            if (r8 == 0) goto L_0x0081
            if (r15 == 0) goto L_0x006d
            byte r4 = r15[r4]
        L_0x006d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0081:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0085
            return r10
        L_0x0085:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.n.b.h(b.a.a.a.r0.l, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int i(b.a.a.a.r0.l r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.h(r6)
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.n.b.i(b.a.a.a.r0.l, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static void j(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i5 = i2;
        byte[] bArr4 = bArr;
        l lVar = new l(bArr);
        int i6 = i3;
        int i7 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (lVar.b() != 0) {
            int h2 = lVar.h(8);
            if (h2 != 240) {
                switch (h2) {
                    case 16:
                        if (i5 != 3) {
                            if (i5 != 2) {
                                bArr2 = null;
                                i6 = g(lVar, iArr, bArr2, i6, i7, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr6 == null ? h : bArr6;
                            }
                        } else {
                            bArr3 = bArr5 == null ? i : bArr5;
                        }
                        bArr2 = bArr3;
                        i6 = g(lVar, iArr, bArr2, i6, i7, paint, canvas);
                    case 17:
                        i6 = h(lVar, iArr, i5 == 3 ? j : null, i6, i7, paint, canvas);
                        break;
                    case 18:
                        i6 = i(lVar, iArr, (byte[]) null, i6, i7, paint, canvas);
                        continue;
                    default:
                        switch (h2) {
                            case 32:
                                bArr6 = a(4, 4, lVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, lVar);
                                break;
                            case 34:
                                bArr5 = a(16, 8, lVar);
                                break;
                            default:
                                continue;
                        }
                }
                lVar.c();
            } else {
                i7 += 2;
                i6 = i3;
            }
        }
    }

    private static void k(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? aVar.d : i2 == 2 ? aVar.c : aVar.f615b;
        int i5 = i2;
        int i6 = i3;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        j(cVar.c, iArr, i5, i6, i4, paint2, canvas2);
        j(cVar.d, iArr, i5, i6, i4 + 1, paint2, canvas2);
    }

    private static a l(l lVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        l lVar2 = lVar;
        int i8 = 8;
        int h2 = lVar2.h(8);
        lVar2.o(8);
        int i9 = 2;
        int i10 = i2 - 2;
        int[] c2 = c();
        int[] d2 = d();
        int[] e2 = e();
        while (i10 > 0) {
            int h3 = lVar2.h(i8);
            int h4 = lVar2.h(i8);
            int i11 = i10 - 2;
            int[] iArr = (h4 & 128) != 0 ? c2 : (h4 & 64) != 0 ? d2 : e2;
            if ((h4 & 1) != 0) {
                i6 = lVar2.h(i8);
                i5 = lVar2.h(i8);
                i4 = lVar2.h(i8);
                i3 = lVar2.h(i8);
                i7 = i11 - 4;
            } else {
                i4 = lVar2.h(4) << 4;
                i7 = i11 - 2;
                int h5 = lVar2.h(4) << 4;
                i3 = lVar2.h(i9) << 6;
                i6 = lVar2.h(6) << i9;
                i5 = h5;
            }
            if (i6 == 0) {
                i5 = 0;
                i4 = 0;
                i3 = 255;
            }
            double d3 = (double) i6;
            double d4 = (double) (i5 - 128);
            Double.isNaN(d4);
            Double.isNaN(d3);
            double d5 = (double) (i4 - 128);
            Double.isNaN(d5);
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d3);
            iArr[h3] = f((byte) (255 - (i3 & 255)), w.i((int) (d3 + (1.402d * d4)), 0, 255), w.i((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), w.i((int) (d3 + (d5 * 1.772d)), 0, 255));
            i10 = i7;
            h2 = h2;
            i8 = 8;
            i9 = 2;
        }
        return new a(h2, c2, d2, e2);
    }

    private static C0036b m(l lVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        lVar.o(4);
        boolean g2 = lVar.g();
        lVar.o(3);
        int h2 = lVar.h(16);
        int h3 = lVar.h(16);
        if (g2) {
            int h4 = lVar.h(16);
            int h5 = lVar.h(16);
            int h6 = lVar.h(16);
            i2 = lVar.h(16);
            i4 = h5;
            i3 = h6;
            i5 = h4;
        } else {
            i4 = h2;
            i2 = h3;
            i5 = 0;
            i3 = 0;
        }
        return new C0036b(h2, h3, i5, i4, i3, i2);
    }

    private static c n(l lVar) {
        byte[] bArr;
        int h2 = lVar.h(16);
        lVar.o(4);
        int h3 = lVar.h(2);
        boolean g2 = lVar.g();
        lVar.o(1);
        byte[] bArr2 = null;
        if (h3 == 1) {
            lVar.o(lVar.h(8) * 16);
        } else if (h3 == 0) {
            int h4 = lVar.h(16);
            int h5 = lVar.h(16);
            if (h4 > 0) {
                bArr2 = new byte[h4];
                lVar.j(bArr2, 0, h4);
            }
            if (h5 > 0) {
                bArr = new byte[h5];
                lVar.j(bArr, 0, h5);
                return new c(h2, g2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h2, g2, bArr2, bArr);
    }

    private static d o(l lVar, int i2) {
        int h2 = lVar.h(8);
        int h3 = lVar.h(4);
        int h4 = lVar.h(2);
        lVar.o(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int h5 = lVar.h(8);
            lVar.o(8);
            i3 -= 6;
            sparseArray.put(h5, new e(lVar.h(16), lVar.h(16)));
        }
        return new d(h2, h3, h4, sparseArray);
    }

    private static f p(l lVar, int i2) {
        int i3;
        int i4;
        l lVar2 = lVar;
        int h2 = lVar2.h(8);
        lVar2.o(4);
        boolean g2 = lVar.g();
        lVar2.o(3);
        int i5 = 16;
        int h3 = lVar2.h(16);
        int h4 = lVar2.h(16);
        int h5 = lVar2.h(3);
        int h6 = lVar2.h(3);
        int i6 = 2;
        lVar2.o(2);
        int h7 = lVar2.h(8);
        int h8 = lVar2.h(8);
        int h9 = lVar2.h(4);
        int h10 = lVar2.h(2);
        lVar2.o(2);
        int i7 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i7 > 0) {
            int h11 = lVar2.h(i5);
            int h12 = lVar2.h(i6);
            int h13 = lVar2.h(i6);
            int h14 = lVar2.h(12);
            int i8 = h10;
            lVar2.o(4);
            int h15 = lVar2.h(12);
            i7 -= 6;
            if (h12 == 1 || h12 == 2) {
                i7 -= 2;
                i4 = lVar2.h(8);
                i3 = lVar2.h(8);
            } else {
                i4 = 0;
                i3 = 0;
            }
            sparseArray.put(h11, new g(h12, h13, h14, h15, i4, i3));
            h10 = i8;
            i6 = 2;
            i5 = 16;
        }
        return new f(h2, g2, h3, h4, h5, h6, h7, h8, h9, h10, sparseArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r7.put(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void q(b.a.a.a.r0.l r6, b.a.a.a.o0.n.b.h r7) {
        /*
            r0 = 8
            int r0 = r6.h(r0)
            r1 = 16
            int r2 = r6.h(r1)
            int r1 = r6.h(r1)
            int r3 = r6.d()
            int r3 = r3 + r1
            int r4 = r1 * 8
            int r5 = r6.b()
            if (r4 <= r5) goto L_0x002c
            java.lang.String r7 = "DvbParser"
            java.lang.String r0 = "Data field length exceeds limit"
            android.util.Log.w(r7, r0)
            int r7 = r6.b()
            r6.o(r7)
            return
        L_0x002c:
            switch(r0) {
                case 16: goto L_0x0095;
                case 17: goto L_0x0070;
                case 18: goto L_0x0055;
                case 19: goto L_0x003d;
                case 20: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x00bf
        L_0x0031:
            int r0 = r7.f628a
            if (r2 != r0) goto L_0x00bf
            b.a.a.a.o0.n.b$b r0 = m(r6)
            r7.h = r0
            goto L_0x00bf
        L_0x003d:
            int r0 = r7.f628a
            if (r2 != r0) goto L_0x004a
            b.a.a.a.o0.n.b$c r0 = n(r6)
            android.util.SparseArray<b.a.a.a.o0.n.b$c> r7 = r7.e
        L_0x0047:
            int r1 = r0.f618a
            goto L_0x0061
        L_0x004a:
            int r0 = r7.f629b
            if (r2 != r0) goto L_0x00bf
            b.a.a.a.o0.n.b$c r0 = n(r6)
            android.util.SparseArray<b.a.a.a.o0.n.b$c> r7 = r7.g
            goto L_0x0047
        L_0x0055:
            int r0 = r7.f628a
            if (r2 != r0) goto L_0x0065
            b.a.a.a.o0.n.b$a r0 = l(r6, r1)
            android.util.SparseArray<b.a.a.a.o0.n.b$a> r7 = r7.d
        L_0x005f:
            int r1 = r0.f614a
        L_0x0061:
            r7.put(r1, r0)
            goto L_0x00bf
        L_0x0065:
            int r0 = r7.f629b
            if (r2 != r0) goto L_0x00bf
            b.a.a.a.o0.n.b$a r0 = l(r6, r1)
            android.util.SparseArray<b.a.a.a.o0.n.b$a> r7 = r7.f
            goto L_0x005f
        L_0x0070:
            b.a.a.a.o0.n.b$d r0 = r7.i
            int r4 = r7.f628a
            if (r2 != r4) goto L_0x00bf
            if (r0 == 0) goto L_0x00bf
            b.a.a.a.o0.n.b$f r1 = p(r6, r1)
            int r0 = r0.f621b
            if (r0 != 0) goto L_0x008d
            android.util.SparseArray<b.a.a.a.o0.n.b$f> r0 = r7.c
            int r2 = r1.f624a
            java.lang.Object r0 = r0.get(r2)
            b.a.a.a.o0.n.b$f r0 = (b.a.a.a.o0.n.b.f) r0
            r1.a(r0)
        L_0x008d:
            android.util.SparseArray<b.a.a.a.o0.n.b$f> r7 = r7.c
            int r0 = r1.f624a
            r7.put(r0, r1)
            goto L_0x00bf
        L_0x0095:
            int r0 = r7.f628a
            if (r2 != r0) goto L_0x00bf
            b.a.a.a.o0.n.b$d r0 = r7.i
            b.a.a.a.o0.n.b$d r1 = o(r6, r1)
            int r2 = r1.f621b
            if (r2 == 0) goto L_0x00b5
            r7.i = r1
            android.util.SparseArray<b.a.a.a.o0.n.b$f> r0 = r7.c
            r0.clear()
            android.util.SparseArray<b.a.a.a.o0.n.b$a> r0 = r7.d
            r0.clear()
            android.util.SparseArray<b.a.a.a.o0.n.b$c> r7 = r7.e
            r7.clear()
            goto L_0x00bf
        L_0x00b5:
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.f620a
            int r2 = r1.f620a
            if (r0 == r2) goto L_0x00bf
            r7.i = r1
        L_0x00bf:
            int r7 = r6.d()
            int r3 = r3 - r7
            r6.p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.n.b.q(b.a.a.a.r0.l, b.a.a.a.o0.n.b$h):void");
    }

    public List<b.a.a.a.o0.b> b(byte[] bArr, int i2) {
        int i3;
        SparseArray<g> sparseArray;
        l lVar = new l(bArr, i2);
        while (lVar.b() >= 48 && lVar.h(8) == 15) {
            q(lVar, this.f);
        }
        h hVar = this.f;
        if (hVar.i == null) {
            return Collections.emptyList();
        }
        C0036b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (!(bitmap != null && bVar.f616a + 1 == bitmap.getWidth() && bVar.f617b + 1 == this.g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f616a + 1, bVar.f617b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = this.f.i.c;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            e valueAt = sparseArray2.valueAt(i4);
            f fVar = this.f.c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f622a + bVar.c;
            int i6 = valueAt.f623b + bVar.e;
            float f2 = (float) i5;
            float f3 = (float) i6;
            float f4 = f3;
            float f5 = f2;
            this.c.clipRect(f2, f3, (float) Math.min(fVar.c + i5, bVar.d), (float) Math.min(fVar.d + i6, bVar.f), Region.Op.REPLACE);
            a aVar = this.f.d.get(fVar.f);
            if (aVar == null && (aVar = this.f.f.get(fVar.f)) == null) {
                aVar = this.e;
            }
            SparseArray<g> sparseArray3 = fVar.j;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                g valueAt2 = sparseArray3.valueAt(i7);
                c cVar = this.f.e.get(keyAt);
                c cVar2 = cVar == null ? this.f.g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.e, valueAt2.f626a + i5, i6 + valueAt2.f627b, cVar2.f619b ? null : this.f612a, this.c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f625b) {
                int i8 = fVar.e;
                this.f613b.setColor(i8 == 3 ? aVar.d[fVar.g] : i8 == 2 ? aVar.c[fVar.h] : aVar.f615b[fVar.i]);
                this.c.drawRect(f5, f4, (float) (fVar.c + i5), (float) (fVar.d + i6), this.f613b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.g, i5, i6, fVar.c, fVar.d);
            int i9 = bVar.f616a;
            int i10 = bVar.f617b;
            arrayList.add(new b.a.a.a.o0.b(createBitmap2, f5 / ((float) i9), 0, f4 / ((float) i10), 0, ((float) fVar.c) / ((float) i9), ((float) fVar.d) / ((float) i10)));
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    public void r() {
        this.f.a();
    }
}
