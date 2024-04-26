package b.a.a.a.o0.m;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import b.a.a.a.o0.b;
import b.a.a.a.o0.e;
import b.a.a.a.o0.i;
import b.a.a.a.r0.m;
import java.util.ArrayList;
import java.util.List;

public final class a extends d {
    private static final int[] s = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] t = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] u = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] v = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] w = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] x = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] y = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private final m g = new m();
    private final int h;
    private final int i;
    private final ArrayList<C0034a> j = new ArrayList<>();
    private C0034a k = new C0034a(0, 4);
    private List<b> l;
    private List<b> m;
    private int n;
    private int o;
    private boolean p;
    private byte q;
    private byte r;

    /* renamed from: b.a.a.a.o0.m.a$a  reason: collision with other inner class name */
    private static class C0034a {

        /* renamed from: a  reason: collision with root package name */
        private final List<CharacterStyle> f599a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<C0035a> f600b = new ArrayList();
        private final List<SpannableString> c = new ArrayList();
        private final SpannableStringBuilder d = new SpannableStringBuilder();
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;

        /* renamed from: b.a.a.a.o0.m.a$a$a  reason: collision with other inner class name */
        private static class C0035a {

            /* renamed from: a  reason: collision with root package name */
            public final CharacterStyle f601a;

            /* renamed from: b  reason: collision with root package name */
            public final int f602b;
            public final int c;

            public C0035a(CharacterStyle characterStyle, int i, int i2) {
                this.f601a = characterStyle;
                this.f602b = i;
                this.c = i2;
            }
        }

        public C0034a(int i2, int i3) {
            g(i2);
            i(i3);
        }

        public void a(char c2) {
            this.d.append(c2);
        }

        public void b() {
            int length = this.d.length();
            if (length > 0) {
                this.d.delete(length - 1, length);
            }
        }

        public b c() {
            int i2;
            float f2;
            int i3;
            int i4;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < this.c.size(); i5++) {
                spannableStringBuilder.append(this.c.get(i5));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i6 = this.f + this.g;
            int length = (32 - i6) - spannableStringBuilder.length();
            int i7 = i6 - length;
            if (this.h == 2 && (Math.abs(i7) < 3 || length < 0)) {
                f2 = 0.5f;
                i2 = 1;
            } else if (this.h != 2 || i7 <= 0) {
                f2 = ((((float) i6) / 32.0f) * 0.8f) + 0.1f;
                i2 = 0;
            } else {
                f2 = ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f;
                i2 = 2;
            }
            if (this.h == 1 || (i4 = this.e) > 7) {
                i4 = (this.e - 15) - 2;
                i3 = 2;
            } else {
                i3 = 0;
            }
            return new b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i4, 1, i3, f2, i2, Float.MIN_VALUE);
        }

        public SpannableString d() {
            int length = this.d.length();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f599a.size(); i3++) {
                this.d.setSpan(this.f599a.get(i3), 0, length, 33);
            }
            while (i2 < this.f600b.size()) {
                C0035a aVar = this.f600b.get(i2);
                int size = this.f600b.size();
                int i4 = aVar.c;
                this.d.setSpan(aVar.f601a, aVar.f602b, i2 < size - i4 ? this.f600b.get(i4 + i2).f602b : length, 33);
                i2++;
            }
            if (this.j != -1) {
                this.d.setSpan(new UnderlineSpan(), this.j, length, 33);
            }
            return new SpannableString(this.d);
        }

        public int e() {
            return this.e;
        }

        public boolean f() {
            return this.f599a.isEmpty() && this.f600b.isEmpty() && this.c.isEmpty() && this.d.length() == 0;
        }

        public void g(int i2) {
            this.h = i2;
            this.f599a.clear();
            this.f600b.clear();
            this.c.clear();
            this.d.clear();
            this.e = 15;
            this.f = 0;
            this.g = 0;
            this.j = -1;
        }

        public void h() {
            this.c.add(d());
            this.d.clear();
            this.f599a.clear();
            this.f600b.clear();
            this.j = -1;
            int min = Math.min(this.i, this.e);
            while (this.c.size() >= min) {
                this.c.remove(0);
            }
        }

        public void i(int i2) {
            this.i = i2;
        }

        public void j(int i2) {
            this.f = i2;
        }

        public void k(CharacterStyle characterStyle, int i2) {
            this.f600b.add(new C0035a(characterStyle, this.d.length(), i2));
        }

        public void l(CharacterStyle characterStyle) {
            this.f599a.add(characterStyle);
        }

        public void m(int i2) {
            this.e = i2;
        }

        public void n(int i2) {
            this.g = i2;
        }

        public void o(boolean z) {
            if (z) {
                this.j = this.d.length();
            } else if (this.j != -1) {
                this.d.setSpan(new UnderlineSpan(), this.j, this.d.length(), 33);
                this.j = -1;
            }
        }

        public String toString() {
            return this.d.toString();
        }
    }

    public a(String str, int i2) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 3 || i2 == 4) {
            this.i = 2;
        } else {
            this.i = 1;
        }
        C(0);
        B();
    }

    private static boolean A(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    private void B() {
        this.k.g(this.n);
        this.j.clear();
        this.j.add(this.k);
    }

    private void C(int i2) {
        int i3 = this.n;
        if (i3 != i2) {
            this.n = i2;
            B();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.l = null;
            }
        }
    }

    private void D(int i2) {
        this.o = i2;
        this.k.i(i2);
    }

    private static char n(byte b2) {
        return (char) v[(b2 & Byte.MAX_VALUE) - 32];
    }

    private List<b> o() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            b c = this.j.get(i2).c();
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    private static char p(byte b2) {
        return (char) x[b2 & 31];
    }

    private static char q(byte b2) {
        return (char) y[b2 & 31];
    }

    private static char r(byte b2) {
        return (char) w[b2 & 15];
    }

    private boolean s(byte b2, byte b3) {
        boolean z = z(b2);
        if (z) {
            if (this.p && this.q == b2 && this.r == b3) {
                this.p = false;
                return true;
            }
            this.p = true;
            this.q = b2;
            this.r = b3;
        }
        if (w(b2, b3)) {
            t(b3);
        } else if (y(b2, b3)) {
            v(b2, b3);
        } else if (A(b2, b3)) {
            this.k.n(b3 - 32);
        } else if (x(b2, b3)) {
            u(b3);
        }
        return z;
    }

    private void t(byte b2) {
        this.k.o((b2 & 1) == 1);
        int i2 = (b2 >> 1) & 15;
        if (i2 == 7) {
            this.k.k(new StyleSpan(2), 2);
            this.k.k(new ForegroundColorSpan(-1), 1);
            return;
        }
        this.k.k(new ForegroundColorSpan(u[i2]), 1);
    }

    private void u(byte b2) {
        if (b2 == 32) {
            C(2);
        } else if (b2 != 41) {
            switch (b2) {
                case 37:
                    C(1);
                    D(2);
                    return;
                case 38:
                    C(1);
                    D(3);
                    return;
                case 39:
                    C(1);
                    D(4);
                    return;
                default:
                    int i2 = this.n;
                    if (i2 != 0) {
                        if (b2 != 33) {
                            switch (b2) {
                                case 44:
                                    this.l = null;
                                    if (!(i2 == 1 || i2 == 3)) {
                                        return;
                                    }
                                case 45:
                                    if (i2 == 1 && !this.k.f()) {
                                        this.k.h();
                                        return;
                                    }
                                    return;
                                case 46:
                                    break;
                                case 47:
                                    this.l = o();
                                    break;
                                default:
                                    return;
                            }
                            B();
                            return;
                        }
                        this.k.b();
                        return;
                    }
                    return;
            }
        } else {
            C(3);
        }
    }

    private void v(byte b2, byte b3) {
        int i2 = s[b2 & 7];
        if ((b3 & 32) != 0) {
            i2++;
        }
        if (i2 != this.k.e()) {
            if (this.n != 1 && !this.k.f()) {
                C0034a aVar = new C0034a(this.n, this.o);
                this.k = aVar;
                this.j.add(aVar);
            }
            this.k.m(i2);
        }
        if ((b3 & 1) == 1) {
            this.k.l(new UnderlineSpan());
        }
        int i3 = (b3 >> 1) & 15;
        if (i3 > 7) {
            this.k.j(t[i3 & 7]);
        } else if (i3 == 7) {
            this.k.l(new StyleSpan(2));
            this.k.l(new ForegroundColorSpan(-1));
        } else {
            this.k.l(new ForegroundColorSpan(u[i3]));
        }
    }

    private static boolean w(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    private static boolean x(byte b2, byte b3) {
        return (b2 & 247) == 20 && (b3 & 240) == 32;
    }

    private static boolean y(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    private static boolean z(byte b2) {
        return (b2 & 240) == 16;
    }

    public void a() {
    }

    /* access modifiers changed from: protected */
    public e f() {
        List<b> list = this.l;
        this.m = list;
        return new e(list);
    }

    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        C(0);
        D(4);
        B();
        this.p = false;
        this.q = 0;
        this.r = 0;
    }

    /* access modifiers changed from: protected */
    public void g(i iVar) {
        int i2;
        C0034a aVar;
        char n2;
        this.g.H(iVar.c.array(), iVar.c.limit());
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int a2 = this.g.a();
            int i3 = this.h;
            if (a2 < i3) {
                break;
            }
            byte x2 = i3 == 2 ? -4 : (byte) this.g.x();
            byte x3 = (byte) (this.g.x() & 127);
            byte x4 = (byte) (this.g.x() & 127);
            if ((x2 & 6) == 4 && (((i2 = this.i) != 1 || (x2 & 1) == 0) && ((i2 != 2 || (x2 & 1) == 1) && !(x3 == 0 && x4 == 0)))) {
                if ((x3 & 247) == 17 && (x4 & 240) == 48) {
                    aVar = this.k;
                    n2 = r(x4);
                } else if ((x3 & 246) == 18 && (x4 & 224) == 32) {
                    this.k.b();
                    if ((x3 & 1) == 0) {
                        aVar = this.k;
                        n2 = p(x4);
                    } else {
                        aVar = this.k;
                        n2 = q(x4);
                    }
                } else {
                    if ((x3 & 224) == 0) {
                        z2 = s(x3, x4);
                    } else {
                        this.k.a(n(x3));
                        if ((x4 & 224) != 0) {
                            aVar = this.k;
                            n2 = n(x4);
                        }
                    }
                    z = true;
                }
                aVar.a(n2);
                z = true;
            }
        }
        if (z) {
            if (!z2) {
                this.p = false;
            }
            int i4 = this.n;
            if (i4 == 1 || i4 == 3) {
                this.l = o();
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return this.l != this.m;
    }
}
