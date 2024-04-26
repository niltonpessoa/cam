package b.a.a.a.k0;

import b.a.a.a.m0.a;
import b.a.a.a.m0.i.e;
import b.a.a.a.m0.i.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class i {
    public static final g.a c = new a();
    private static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f316a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f317b = -1;

    static class a implements g.a {
        a() {
        }

        public boolean a(int i, int i2, int i3, int i4, int i5) {
            return i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2);
        }
    }

    private boolean b(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = d.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f316a = parseInt;
                    this.f317b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public boolean a() {
        return (this.f316a == -1 || this.f317b == -1) ? false : true;
    }

    public boolean c(b.a.a.a.m0.a aVar) {
        for (int i = 0; i < aVar.b(); i++) {
            a.b a2 = aVar.a(i);
            if (a2 instanceof e) {
                e eVar = (e) a2;
                if (b(eVar.c, eVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f316a = i2;
        this.f317b = i3;
        return true;
    }
}
