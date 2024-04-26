package b.a.a.a.r0;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import b.a.a.a.e0;
import b.a.a.a.q0.f;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final int f743a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f744b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static final int[] f = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f745a;

        a(String str) {
            this.f745a = str;
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f745a);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        }
        f743a = i;
        String str = Build.DEVICE;
        f744b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i;
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static String A(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return G(str);
        }
    }

    public static long B(long j, e0 e0Var, long j2, long j3) {
        if (e0.c.equals(e0Var)) {
            return j;
        }
        long E = E(j, e0Var.f230a, Long.MIN_VALUE);
        long a2 = a(j, e0Var.f231b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = E <= j2 && j2 <= a2;
        if (E > j3 || j3 > a2) {
            z = false;
        }
        return (!z2 || !z) ? z2 ? j2 : z ? j3 : E : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public static long C(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d2 = (double) j2;
        double d3 = (double) j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = (double) j;
        Double.isNaN(d4);
        return (long) (d4 * (d2 / d3));
    }

    public static void D(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (j2 >= j || j % j2 != 0) {
            double d2 = (double) j;
            double d3 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = d2 / d3;
            while (i < jArr.length) {
                double d5 = (double) jArr[i];
                Double.isNaN(d5);
                jArr[i] = (long) (d5 * d4);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    public static long E(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    public static int[] F(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    public static String G(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String H(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static long a(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0009
            r5 = r0 ^ -1
            goto L_0x001b
        L_0x0009:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x0009
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r5 = r0 + -1
            goto L_0x001b
        L_0x001a:
            r5 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0024
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0024:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.r0.w.c(long[], long, boolean, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r4 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r4 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.r0.w.d(long[], long, boolean, boolean):int");
    }

    public static int e(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static void f(f fVar) {
        if (fVar != null) {
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int g(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static float h(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int i(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static long j(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static int k(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static byte[] l(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static String m(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static int n(int i) {
        if (i == 0) {
            return 16777216;
        }
        if (i == 1) {
            return 3538944;
        }
        if (i == 2) {
            return 13107200;
        }
        if (i == 3 || i == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static int o(String str) {
        int length = str.length();
        a.a(length <= 4);
        char c2 = 0;
        for (int i = 0; i < length; i++) {
            c2 = (c2 << 8) | str.charAt(i);
        }
        return c2;
    }

    public static long p(long j, float f2) {
        if (f2 == 1.0f) {
            return j;
        }
        double d2 = (double) j;
        double d3 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static int q(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int r(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i != 1073741824) {
            if (i == 2) {
                return i2 * 2;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 * 4;
    }

    public static long s(long j, float f2) {
        if (f2 == 1.0f) {
            return j;
        }
        double d2 = (double) j;
        double d3 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static int t(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String u(StringBuilder sb, Formatter formatter, long j) {
        Formatter formatter2;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        if (j5 > 0) {
            formatter2 = formatter.format("%d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)});
        } else {
            formatter2 = formatter.format("%02d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j3)});
        }
        return formatter2.toString();
    }

    public static byte[] v(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static boolean w(int i) {
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    public static boolean x(int i) {
        return i == 10 || i == 13;
    }

    public static boolean y(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || scheme.equals("file");
    }

    public static ExecutorService z(String str) {
        return Executors.newSingleThreadExecutor(new a(str));
    }
}
