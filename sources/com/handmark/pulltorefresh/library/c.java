package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.view.View;
import com.handmark.pulltorefresh.library.e;

@TargetApi(9)
public final class c {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f894a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.handmark.pulltorefresh.library.e$k[] r0 = com.handmark.pulltorefresh.library.e.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f894a = r0
                com.handmark.pulltorefresh.library.e$k r1 = com.handmark.pulltorefresh.library.e.k.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f894a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.handmark.pulltorefresh.library.e$k r1 = com.handmark.pulltorefresh.library.e.k.VERTICAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.handmark.pulltorefresh.library.c.a.<clinit>():void");
        }
    }

    static boolean a(View view) {
        return view.getOverScrollMode() != 2;
    }

    public static void b(e<?> eVar, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z) {
        int i7;
        int i8;
        if (a.f894a[eVar.getPullToRefreshScrollDirection().ordinal()] != 1) {
            i2 = i4;
            int i9 = i3;
            i7 = eVar.getScrollY();
            i = i9;
        } else {
            i7 = eVar.getScrollX();
        }
        if (eVar.n() && !eVar.r()) {
            e.C0046e mode = eVar.getMode();
            if (mode.d() && !z && i != 0) {
                int i10 = i + i2;
                if (i10 < 0 - i6) {
                    if (mode.f()) {
                        if (i7 == 0) {
                            eVar.D(e.m.OVERSCROLLING, new boolean[0]);
                        }
                        i8 = i7 + i10;
                    } else {
                        return;
                    }
                } else if (i10 > i5 + i6) {
                    if (mode.e()) {
                        if (i7 == 0) {
                            eVar.D(e.m.OVERSCROLLING, new boolean[0]);
                        }
                        i8 = (i7 + i10) - i5;
                    } else {
                        return;
                    }
                } else if (Math.abs(i10) <= i6 || Math.abs(i10 - i5) <= i6) {
                    eVar.D(e.m.RESET, new boolean[0]);
                    return;
                } else {
                    return;
                }
                eVar.setHeaderScroll((int) (f * ((float) i8)));
            } else if (z && e.m.OVERSCROLLING == eVar.getState()) {
                eVar.D(e.m.RESET, new boolean[0]);
            }
        }
    }

    public static void c(e<?> eVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        b(eVar, i, i2, i3, i4, i5, 0, 1.0f, z);
    }

    public static void d(e<?> eVar, int i, int i2, int i3, int i4, boolean z) {
        c(eVar, i, i2, i3, i4, 0, z);
    }
}
