package b.a.a.a.r0;

import android.util.Pair;
import b.a.a.a.u;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f717a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f718b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f717a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    private static int c(l lVar) {
        int h = lVar.h(5);
        return h == 31 ? lVar.h(6) + 32 : h;
    }

    private static int d(l lVar) {
        int h = lVar.h(4);
        if (h == 15) {
            return lVar.h(24);
        }
        a.a(h < 13);
        return f718b[h];
    }

    public static Pair<Integer, Integer> e(l lVar, boolean z) {
        int c2 = c(lVar);
        int d = d(lVar);
        int h = lVar.h(4);
        if (c2 == 5 || c2 == 29) {
            d = d(lVar);
            c2 = c(lVar);
            if (c2 == 22) {
                h = lVar.h(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(c2 == 1 || c2 == 2 || c2 == 3 || c2 == 4 || c2 == 6 || c2 == 7 || c2 == 17)) {
                switch (c2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new u("Unsupported audio object type: " + c2);
                }
            }
            g(lVar, c2, h);
            switch (c2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = lVar.h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw new u("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = c[h];
        if (i == -1) {
            z2 = false;
        }
        a.a(z2);
        return Pair.create(Integer.valueOf(d), Integer.valueOf(i));
    }

    public static Pair<Integer, Integer> f(byte[] bArr) {
        return e(new l(bArr), false);
    }

    private static void g(l lVar, int i, int i2) {
        lVar.o(1);
        if (lVar.g()) {
            lVar.o(14);
        }
        boolean g = lVar.g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                lVar.o(3);
            }
            if (g) {
                if (i == 22) {
                    lVar.o(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    lVar.o(3);
                }
                lVar.o(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
