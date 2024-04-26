package b.a.a.a.o0.t;

import android.text.TextUtils;
import b.a.a.a.r0.d;
import b.a.a.a.r0.m;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a  reason: collision with root package name */
    private final m f650a = new m();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f651b = new StringBuilder();

    private void a(d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.v(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            String[] split = str.split("\\.");
            String str2 = split[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.u(str2.substring(0, indexOf2));
                dVar.t(str2.substring(indexOf2 + 1));
            } else {
                dVar.u(str2);
            }
            if (split.length > 1) {
                dVar.s((String[]) Arrays.copyOfRange(split, 1, split.length));
            }
        }
    }

    private static boolean b(m mVar) {
        int c2 = mVar.c();
        int d = mVar.d();
        byte[] bArr = mVar.f734a;
        if (c2 + 2 > d) {
            return false;
        }
        int i = c2 + 1;
        if (bArr[c2] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArr[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= d) {
                mVar.K(d - mVar.c());
                return true;
            } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                i2 = i3 + 1;
                d = i2;
            } else {
                i2 = i3;
            }
        }
    }

    private static boolean c(m mVar) {
        char j = j(mVar, mVar.c());
        if (j != 9 && j != 10 && j != 12 && j != 13 && j != ' ') {
            return false;
        }
        mVar.K(1);
        return true;
    }

    private static String e(m mVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c2 = mVar.c();
        int d = mVar.d();
        while (c2 < d && !z) {
            char c3 = (char) mVar.f734a[c2];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z = true;
            } else {
                c2++;
                sb.append(c3);
            }
        }
        mVar.K(c2 - mVar.c());
        return sb.toString();
    }

    static String f(m mVar, StringBuilder sb) {
        m(mVar);
        if (mVar.a() == 0) {
            return null;
        }
        String e = e(mVar, sb);
        if (!"".equals(e)) {
            return e;
        }
        return "" + ((char) mVar.x());
    }

    private static String g(m mVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c2 = mVar.c();
            String f = f(mVar, sb);
            if (f == null) {
                return null;
            }
            if ("}".equals(f) || ";".equals(f)) {
                mVar.J(c2);
                z = true;
            } else {
                sb2.append(f);
            }
        }
        return sb2.toString();
    }

    private static String h(m mVar, StringBuilder sb) {
        m(mVar);
        if (mVar.a() < 5 || !"::cue".equals(mVar.u(5))) {
            return null;
        }
        int c2 = mVar.c();
        String f = f(mVar, sb);
        if (f == null) {
            return null;
        }
        if ("{".equals(f)) {
            mVar.J(c2);
            return "";
        }
        String k = "(".equals(f) ? k(mVar) : null;
        String f2 = f(mVar, sb);
        if (!")".equals(f2) || f2 == null) {
            return null;
        }
        return k;
    }

    private static void i(m mVar, d dVar, StringBuilder sb) {
        m(mVar);
        String e = e(mVar, sb);
        if (!"".equals(e) && ":".equals(f(mVar, sb))) {
            m(mVar);
            String g = g(mVar, sb);
            if (g != null && !"".equals(g)) {
                int c2 = mVar.c();
                String f = f(mVar, sb);
                if (!";".equals(f)) {
                    if ("}".equals(f)) {
                        mVar.J(c2);
                    } else {
                        return;
                    }
                }
                if ("color".equals(e)) {
                    dVar.p(d.c(g));
                } else if ("background-color".equals(e)) {
                    dVar.n(d.c(g));
                } else if ("text-decoration".equals(e)) {
                    if ("underline".equals(g)) {
                        dVar.w(true);
                    }
                } else if ("font-family".equals(e)) {
                    dVar.q(g);
                } else if ("font-weight".equals(e)) {
                    if ("bold".equals(g)) {
                        dVar.o(true);
                    }
                } else if ("font-style".equals(e) && "italic".equals(g)) {
                    dVar.r(true);
                }
            }
        }
    }

    private static char j(m mVar, int i) {
        return (char) mVar.f734a[i];
    }

    private static String k(m mVar) {
        int c2 = mVar.c();
        int d = mVar.d();
        boolean z = false;
        while (c2 < d && !z) {
            int i = c2 + 1;
            z = ((char) mVar.f734a[c2]) == ')';
            c2 = i;
        }
        return mVar.u((c2 - 1) - mVar.c()).trim();
    }

    static void l(m mVar) {
        do {
        } while (!TextUtils.isEmpty(mVar.k()));
    }

    static void m(m mVar) {
        while (true) {
            boolean z = true;
            while (mVar.a() > 0 && z) {
                if (!c(mVar) && !b(mVar)) {
                    z = false;
                }
            }
            return;
        }
    }

    public d d(m mVar) {
        this.f651b.setLength(0);
        int c2 = mVar.c();
        l(mVar);
        this.f650a.H(mVar.f734a, mVar.c());
        this.f650a.J(c2);
        String h = h(this.f650a, this.f651b);
        if (h == null || !"{".equals(f(this.f650a, this.f651b))) {
            return null;
        }
        d dVar = new d();
        a(dVar, h);
        String str = null;
        boolean z = false;
        while (!z) {
            int c3 = this.f650a.c();
            str = f(this.f650a, this.f651b);
            boolean z2 = str == null || "}".equals(str);
            if (!z2) {
                this.f650a.J(c3);
                i(this.f650a, dVar, this.f651b);
            }
            z = z2;
        }
        if ("}".equals(str)) {
            return dVar;
        }
        return null;
    }
}
