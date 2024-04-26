package b.a.a.a.o0.t;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import b.a.a.a.o0.t.e;
import b.a.a.a.r0.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f658b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f659a = new StringBuilder();

    private static final class a {
        private static final String[] e = new String[0];

        /* renamed from: a  reason: collision with root package name */
        public final String f660a;

        /* renamed from: b  reason: collision with root package name */
        public final int f661b;
        public final String c;
        public final String[] d;

        private a(String str, int i, String str2, String[] strArr) {
            this.f661b = i;
            this.f660a = str;
            this.c = str2;
            this.d = strArr;
        }

        public static a a(String str, int i) {
            String str2;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] split = trim.split("\\.");
            return new a(split[0], i, str2, split.length > 1 ? (String[]) Arrays.copyOfRange(split, 1, split.length) : e);
        }

        public static a b() {
            return new a("", 0, "", new String[0]);
        }
    }

    private static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public final int f662a;

        /* renamed from: b  reason: collision with root package name */
        public final d f663b;

        public b(int i, d dVar) {
            this.f662a = i;
            this.f663b = dVar;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return this.f662a - bVar.f662a;
        }
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        char c2;
        str.hashCode();
        char c3 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c3 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c3 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c3 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c3 = 3;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                c2 = '>';
                break;
            case 1:
                c2 = '<';
                break;
            case 2:
                c2 = '&';
                break;
            case 3:
                c2 = ' ';
                break;
            default:
                Log.w("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089 A[LOOP:0: B:31:0x0087->B:32:0x0089, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.lang.String r8, b.a.a.a.o0.t.f.a r9, android.text.SpannableStringBuilder r10, java.util.List<b.a.a.a.o0.t.d> r11, java.util.List<b.a.a.a.o0.t.f.b> r12) {
        /*
            int r0 = r9.f661b
            int r1 = r10.length()
            java.lang.String r2 = r9.f660a
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = -1
            switch(r3) {
                case 0: goto L_0x0059;
                case 98: goto L_0x004e;
                case 99: goto L_0x0043;
                case 105: goto L_0x0038;
                case 117: goto L_0x002d;
                case 118: goto L_0x0022;
                case 3314158: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0063
        L_0x0017:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0020
            goto L_0x0063
        L_0x0020:
            r7 = 6
            goto L_0x0063
        L_0x0022:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x002b
            goto L_0x0063
        L_0x002b:
            r7 = 5
            goto L_0x0063
        L_0x002d:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0036
            goto L_0x0063
        L_0x0036:
            r7 = 4
            goto L_0x0063
        L_0x0038:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0041
            goto L_0x0063
        L_0x0041:
            r7 = 3
            goto L_0x0063
        L_0x0043:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004c
            goto L_0x0063
        L_0x004c:
            r7 = 2
            goto L_0x0063
        L_0x004e:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0057
            goto L_0x0063
        L_0x0057:
            r7 = 1
            goto L_0x0063
        L_0x0059:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            r2 = 33
            switch(r7) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0075;
                case 2: goto L_0x007d;
                case 3: goto L_0x006f;
                case 4: goto L_0x0069;
                case 5: goto L_0x007d;
                case 6: goto L_0x007d;
                default: goto L_0x0068;
            }
        L_0x0068:
            return
        L_0x0069:
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            goto L_0x007a
        L_0x006f:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r4)
            goto L_0x007a
        L_0x0075:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r6)
        L_0x007a:
            r10.setSpan(r3, r0, r1, r2)
        L_0x007d:
            r12.clear()
            e(r11, r8, r9, r12)
            int r8 = r12.size()
        L_0x0087:
            if (r5 >= r8) goto L_0x0097
            java.lang.Object r9 = r12.get(r5)
            b.a.a.a.o0.t.f$b r9 = (b.a.a.a.o0.t.f.b) r9
            b.a.a.a.o0.t.d r9 = r9.f663b
            c(r10, r9, r0, r1)
            int r5 = r5 + 1
            goto L_0x0087
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.t.f.b(java.lang.String, b.a.a.a.o0.t.f$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, d dVar, int i, int i2) {
        Object obj;
        if (dVar != null) {
            if (dVar.g() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(dVar.g()), i, i2, 33);
            }
            if (dVar.k()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (dVar.l()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (dVar.j()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.b()), i, i2, 33);
            }
            if (dVar.i()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.a()), i, i2, 33);
            }
            if (dVar.c() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(dVar.c()), i, i2, 33);
            }
            if (dVar.h() != null) {
                spannableStringBuilder.setSpan(new AlignmentSpan.Standard(dVar.h()), i, i2, 33);
            }
            int e = dVar.e();
            if (e == 1) {
                obj = new AbsoluteSizeSpan((int) dVar.d(), true);
            } else if (e == 2) {
                obj = new RelativeSizeSpan(dVar.d());
            } else if (e == 3) {
                obj = new RelativeSizeSpan(dVar.d() / 100.0f);
            } else {
                return;
            }
            spannableStringBuilder.setSpan(obj, i, i2, 33);
        }
    }

    private static int d(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static void e(List<d> list, String str, a aVar, List<b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d dVar = list.get(i);
            int f = dVar.f(str, aVar.f660a, aVar.d, aVar.c);
            if (f > 0) {
                list2.add(new b(f, dVar));
            }
        }
        Collections.sort(list2);
    }

    private static String f(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim.split("[ \\.]")[0];
    }

    private static boolean g(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c2 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c2 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c2 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c2 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    private static boolean i(String str, Matcher matcher, m mVar, e.b bVar, StringBuilder sb, List<d> list) {
        try {
            bVar.j(h.b(matcher.group(1)));
            bVar.d(h.b(matcher.group(2)));
            j(matcher.group(3), bVar);
            sb.setLength(0);
            while (true) {
                String k = mVar.k();
                if (!TextUtils.isEmpty(k)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(k.trim());
                } else {
                    k(str, sb.toString(), bVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }

    static void j(String str, e.b bVar) {
        Matcher matcher = c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    l(group2, bVar);
                } else if ("align".equals(group)) {
                    bVar.l(o(group2));
                } else if ("position".equals(group)) {
                    n(group2, bVar);
                } else if ("size".equals(group)) {
                    bVar.m(h.a(group2));
                } else {
                    Log.w("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                Log.w("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static void k(String str, String str2, e.b bVar, List<d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = d(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    String f = f(substring);
                    if (f != null && g(f)) {
                        if (z) {
                            while (!stack.isEmpty()) {
                                a aVar = (a) stack.pop();
                                b(str, aVar, spannableStringBuilder, list, arrayList);
                                if (aVar.f660a.equals(f)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            stack.push(a.a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!stack.isEmpty()) {
            b(str, (a) stack.pop(), spannableStringBuilder, list, arrayList);
        }
        b(str, a.b(), spannableStringBuilder, list, arrayList);
        bVar.k(spannableStringBuilder);
    }

    private static void l(String str, e.b bVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.f(m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.f(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            bVar.e(h.a(str));
            bVar.g(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        bVar.e((float) parseInt);
        bVar.g(1);
    }

    private static int m(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                Log.w("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void n(String str, e.b bVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.i(m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.i(Integer.MIN_VALUE);
        }
        bVar.h(h.a(str));
    }

    private static Layout.Alignment o(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c2 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c2 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return Layout.Alignment.ALIGN_CENTER;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 3:
            case 5:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                Log.w("WebvttCueParser", "Invalid alignment value: " + str);
                return null;
        }
    }

    public boolean h(m mVar, e.b bVar, List<d> list) {
        String k = mVar.k();
        if (k == null) {
            return false;
        }
        Pattern pattern = f658b;
        Matcher matcher = pattern.matcher(k);
        if (matcher.matches()) {
            return i((String) null, matcher, mVar, bVar, this.f659a, list);
        }
        String k2 = mVar.k();
        if (k2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(k2);
        if (!matcher2.matches()) {
            return false;
        }
        return i(k.trim(), matcher2, mVar, bVar, this.f659a, list);
    }
}
