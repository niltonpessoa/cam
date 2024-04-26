package b.a.a.a.o0.m;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import b.a.a.a.o0.e;
import b.a.a.a.o0.i;
import b.a.a.a.r0.l;
import b.a.a.a.r0.m;
import com.google.android.exoplayer2.ui.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class c extends d {
    private final m g = new m();
    private final l h = new l();
    private final int i;
    private final a[] j;
    private a k;
    private List<b.a.a.a.o0.b> l;
    private List<b.a.a.a.o0.b> m;
    private b n;
    private int o;

    private static final class a {
        private static final int[] A = {0, 0, 0, 0, 0, 0, 2};
        private static final int[] B = {3, 3, 3, 3, 3, 3, 1};
        private static final boolean[] C = {false, false, false, true, true, true, false};
        private static final int[] D;
        private static final int[] E = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] F = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] G;
        public static final int w = h(2, 2, 2, 0);
        public static final int x;
        public static final int y;
        private static final int[] z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a  reason: collision with root package name */
        private final List<SpannableString> f603a = new LinkedList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f604b = new SpannableStringBuilder();
        private boolean c;
        private boolean d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;

        static {
            int h2 = h(0, 0, 0, 0);
            x = h2;
            int h3 = h(0, 0, 0, 3);
            y = h3;
            D = new int[]{h2, h3, h2, h2, h3, h2, h2};
            G = new int[]{h2, h2, h2, h2, h2, h3, h3};
        }

        public a() {
            l();
        }

        public static int g(int i2, int i3, int i4) {
            return h(i2, i3, i4, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                b.a.a.a.r0.a.c(r4, r0, r1)
                b.a.a.a.r0.a.c(r5, r0, r1)
                b.a.a.a.r0.a.c(r6, r0, r1)
                b.a.a.a.r0.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.m.c.a.h(int, int, int, int):int");
        }

        public void a(char c2) {
            if (c2 == 10) {
                this.f603a.add(d());
                this.f604b.clear();
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.t != -1) {
                    this.t = 0;
                }
                while (true) {
                    if ((this.k && this.f603a.size() >= this.j) || this.f603a.size() >= 15) {
                        this.f603a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f604b.append(c2);
            }
        }

        public void b() {
            int length = this.f604b.length();
            if (length > 0) {
                this.f604b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b.a.a.a.o0.m.b c() {
            /*
                r15 = this;
                boolean r0 = r15.j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f603a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f603a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.d()
                r2.append(r1)
                int r1 = r15.l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.i
                int r8 = r1 % 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x009a
            L_0x0093:
                int r8 = r1 % 3
                if (r8 != r5) goto L_0x0099
                r8 = 1
                goto L_0x009a
            L_0x0099:
                r8 = 2
            L_0x009a:
                int r9 = r1 / 3
                if (r9 != 0) goto L_0x00a0
                r9 = 0
                goto L_0x00a6
            L_0x00a0:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x00a5
                r9 = 1
                goto L_0x00a6
            L_0x00a5:
                r9 = 2
            L_0x00a6:
                int r11 = r15.o
                int r1 = x
                if (r11 == r1) goto L_0x00ad
                r0 = 1
            L_0x00ad:
                b.a.a.a.o0.m.b r13 = new b.a.a.a.o0.m.b
                r5 = 0
                r12 = 1
                int r14 = r15.e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r12
                r10 = r0
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.m.c.a.c():b.a.a.a.o0.m.b");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f604b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f603a.clear();
            this.f604b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            boolean z6 = z3;
            int i10 = i8;
            int i11 = i9;
            this.c = true;
            this.d = z2;
            this.k = z6;
            this.e = i2;
            this.f = z5;
            this.g = i3;
            this.h = i4;
            this.i = i7;
            int i12 = i5 + 1;
            if (this.j != i12) {
                this.j = i12;
                while (true) {
                    if ((!z6 || this.f603a.size() < this.j) && this.f603a.size() < 15) {
                        break;
                    }
                    this.f603a.remove(0);
                }
            }
            if (!(i10 == 0 || this.m == i10)) {
                this.m = i10;
                int i13 = i10 - 1;
                q(D[i13], y, C[i13], 0, A[i13], B[i13], z[i13]);
            }
            if (i11 != 0 && this.n != i11) {
                this.n = i11;
                int i14 = i11 - 1;
                m(0, 1, 1, false, false, F[i14], E[i14]);
                n(w, G[i14], x);
            }
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            return !i() || (this.f603a.isEmpty() && this.f604b.length() == 0);
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i2 = x;
            this.o = i2;
            this.s = w;
            this.u = i2;
        }

        public void m(int i2, int i3, int i4, boolean z2, boolean z3, int i5, int i6) {
            if (this.p != -1) {
                if (!z2) {
                    this.f604b.setSpan(new StyleSpan(2), this.p, this.f604b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.f604b.length();
            }
            if (this.q != -1) {
                if (!z3) {
                    this.f604b.setSpan(new UnderlineSpan(), this.q, this.f604b.length(), 33);
                    this.q = -1;
                }
            } else if (z3) {
                this.q = this.f604b.length();
            }
        }

        public void n(int i2, int i3, int i4) {
            if (!(this.r == -1 || this.s == i2)) {
                this.f604b.setSpan(new ForegroundColorSpan(this.s), this.r, this.f604b.length(), 33);
            }
            if (i2 != w) {
                this.r = this.f604b.length();
                this.s = i2;
            }
            if (!(this.t == -1 || this.u == i3)) {
                this.f604b.setSpan(new BackgroundColorSpan(this.u), this.t, this.f604b.length(), 33);
            }
            if (i3 != x) {
                this.t = this.f604b.length();
                this.u = i3;
            }
        }

        public void o(int i2, int i3) {
            if (this.v != i2) {
                a(10);
            }
            this.v = i2;
        }

        public void p(boolean z2) {
            this.d = z2;
        }

        public void q(int i2, int i3, boolean z2, int i4, int i5, int i6, int i7) {
            this.o = i2;
            this.l = i7;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f605a;

        /* renamed from: b  reason: collision with root package name */
        public final int f606b;
        public final byte[] c;
        int d = 0;

        public b(int i, int i2) {
            this.f605a = i;
            this.f606b = i2;
            this.c = new byte[((i2 * 2) - 1)];
        }
    }

    public c(int i2) {
        this.i = i2 == -1 ? 1 : i2;
        this.j = new a[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.j[i3] = new a();
        }
        this.k = this.j[0];
        D();
    }

    private void A() {
        this.h.o(4);
        int h2 = this.h.h(4);
        this.h.o(2);
        this.k.o(h2, this.h.h(6));
    }

    private void B() {
        int h2 = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int h3 = this.h.h(2);
        int g2 = a.g(this.h.h(2), this.h.h(2), this.h.h(2));
        if (this.h.g()) {
            h3 |= 4;
        }
        boolean g3 = this.h.g();
        int h4 = this.h.h(2);
        int h5 = this.h.h(2);
        int h6 = this.h.h(2);
        this.h.o(8);
        this.k.q(h2, g2, g3, h3, h4, h5, h6);
    }

    private void C() {
        String str;
        StringBuilder sb;
        b bVar = this.n;
        int i2 = bVar.d;
        if (i2 != (bVar.f606b * 2) - 1) {
            Log.w("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.n.f606b * 2) - 1) + ", but current index is " + this.n.d + " (sequence number " + this.n.f605a + "); ignoring packet");
            return;
        }
        this.h.l(bVar.c, i2);
        int h2 = this.h.h(3);
        int h3 = this.h.h(5);
        if (h2 == 7) {
            this.h.o(2);
            h2 += this.h.h(6);
        }
        if (h3 == 0) {
            if (h2 != 0) {
                Log.w("Cea708Decoder", "serviceNumber is non-zero (" + h2 + ") when blockSize is 0");
            }
        } else if (h2 == this.i) {
            boolean z = false;
            while (this.h.b() > 0) {
                int h4 = this.h.h(8);
                if (h4 == 16) {
                    h4 = this.h.h(8);
                    if (h4 <= 31) {
                        r(h4);
                    } else if (h4 <= 127) {
                        w(h4);
                    } else if (h4 <= 159) {
                        s(h4);
                    } else if (h4 <= 255) {
                        x(h4);
                    } else {
                        sb = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb.append(str);
                        sb.append(h4);
                        Log.w("Cea708Decoder", sb.toString());
                    }
                } else if (h4 <= 31) {
                    p(h4);
                } else if (h4 <= 127) {
                    u(h4);
                } else if (h4 <= 159) {
                    q(h4);
                } else if (h4 <= 255) {
                    v(h4);
                } else {
                    sb = new StringBuilder();
                    str = "Invalid base command: ";
                    sb.append(str);
                    sb.append(h4);
                    Log.w("Cea708Decoder", sb.toString());
                }
                z = true;
            }
            if (z) {
                this.l = o();
            }
        }
    }

    private void D() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.j[i2].l();
        }
    }

    private void n() {
        if (this.n != null) {
            C();
            this.n = null;
        }
    }

    private List<b.a.a.a.o0.b> o() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.j[i2].j() && this.j[i2].k()) {
                arrayList.add(this.j[i2].c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    private void p(int i2) {
        l lVar;
        if (i2 == 0) {
            return;
        }
        if (i2 != 3) {
            int i3 = 8;
            if (i2 != 8) {
                switch (i2) {
                    case 12:
                        D();
                        return;
                    case 13:
                        this.k.a(10);
                        return;
                    case g.H /*14*/:
                        return;
                    default:
                        if (i2 >= 17 && i2 <= 23) {
                            Log.w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i2);
                            lVar = this.h;
                        } else if (i2 < 24 || i2 > 31) {
                            Log.w("Cea708Decoder", "Invalid C0 command: " + i2);
                            return;
                        } else {
                            Log.w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i2);
                            lVar = this.h;
                            i3 = 16;
                        }
                        lVar.o(i3);
                        return;
                }
            } else {
                this.k.b();
            }
        } else {
            this.l = o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r5 = r4.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r5.o(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r4.h.g() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r4.j[8 - r2].l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r4.h.g() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r4.j[8 - r2].p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        if (r4.h.g() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r4.j[8 - r2].e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        r4.k = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x00f9;
                case 129: goto L_0x00f9;
                case 130: goto L_0x00f9;
                case 131: goto L_0x00f9;
                case 132: goto L_0x00f9;
                case 133: goto L_0x00f9;
                case 134: goto L_0x00f9;
                case 135: goto L_0x00f9;
                case 136: goto L_0x00e3;
                case 137: goto L_0x00cc;
                case 138: goto L_0x00b5;
                case 139: goto L_0x0099;
                case 140: goto L_0x0083;
                case 141: goto L_0x007c;
                case 142: goto L_0x0107;
                case 143: goto L_0x0077;
                case 144: goto L_0x0063;
                case 145: goto L_0x0051;
                case 146: goto L_0x0043;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0031;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            android.util.Log.w(r0, r5)
            goto L_0x0107
        L_0x0020:
            int r5 = r5 + -152
            r4.t(r5)
            int r0 = r4.o
            if (r0 == r5) goto L_0x0107
            r4.o = r5
            b.a.a.a.o0.m.c$a[] r0 = r4.j
            r5 = r0[r5]
            goto L_0x0105
        L_0x0031:
            b.a.a.a.o0.m.c$a r5 = r4.k
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x003e
            b.a.a.a.r0.l r5 = r4.h
            r0 = 32
            goto L_0x006d
        L_0x003e:
            r4.B()
            goto L_0x0107
        L_0x0043:
            b.a.a.a.o0.m.c$a r5 = r4.k
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x004c
            goto L_0x006b
        L_0x004c:
            r4.A()
            goto L_0x0107
        L_0x0051:
            b.a.a.a.o0.m.c$a r5 = r4.k
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x005e
            b.a.a.a.r0.l r5 = r4.h
            r0 = 24
            goto L_0x006d
        L_0x005e:
            r4.z()
            goto L_0x0107
        L_0x0063:
            b.a.a.a.o0.m.c$a r5 = r4.k
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0072
        L_0x006b:
            b.a.a.a.r0.l r5 = r4.h
        L_0x006d:
            r5.o(r0)
            goto L_0x0107
        L_0x0072:
            r4.y()
            goto L_0x0107
        L_0x0077:
            r4.D()
            goto L_0x0107
        L_0x007c:
            b.a.a.a.r0.l r5 = r4.h
            r5.o(r1)
            goto L_0x0107
        L_0x0083:
            if (r2 > r1) goto L_0x0107
            b.a.a.a.r0.l r5 = r4.h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0096
            b.a.a.a.o0.m.c$a[] r5 = r4.j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.l()
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x0099:
            r5 = 1
        L_0x009a:
            if (r5 > r1) goto L_0x0107
            b.a.a.a.r0.l r0 = r4.h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00b2
            b.a.a.a.o0.m.c$a[] r0 = r4.j
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.k()
            r3 = r3 ^ r2
            r0.p(r3)
        L_0x00b2:
            int r5 = r5 + 1
            goto L_0x009a
        L_0x00b5:
            if (r2 > r1) goto L_0x0107
            b.a.a.a.r0.l r5 = r4.h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00c9
            b.a.a.a.o0.m.c$a[] r5 = r4.j
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.p(r0)
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00cc:
            r5 = 1
        L_0x00cd:
            if (r5 > r1) goto L_0x0107
            b.a.a.a.r0.l r0 = r4.h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00e0
            b.a.a.a.o0.m.c$a[] r0 = r4.j
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.p(r2)
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x00cd
        L_0x00e3:
            if (r2 > r1) goto L_0x0107
            b.a.a.a.r0.l r5 = r4.h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00f6
            b.a.a.a.o0.m.c$a[] r5 = r4.j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.e()
        L_0x00f6:
            int r2 = r2 + 1
            goto L_0x00e3
        L_0x00f9:
            int r5 = r5 + -128
            int r0 = r4.o
            if (r0 == r5) goto L_0x0107
            r4.o = r5
            b.a.a.a.o0.m.c$a[] r0 = r4.j
            r5 = r0[r5]
        L_0x0105:
            r4.k = r5
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.m.c.q(int):void");
    }

    private void r(int i2) {
        l lVar;
        int i3;
        if (i2 > 7) {
            if (i2 <= 15) {
                lVar = this.h;
                i3 = 8;
            } else if (i2 <= 23) {
                lVar = this.h;
                i3 = 16;
            } else if (i2 <= 31) {
                lVar = this.h;
                i3 = 24;
            } else {
                return;
            }
            lVar.o(i3);
        }
    }

    private void s(int i2) {
        l lVar;
        int i3;
        if (i2 <= 135) {
            lVar = this.h;
            i3 = 32;
        } else if (i2 <= 143) {
            lVar = this.h;
            i3 = 40;
        } else if (i2 <= 159) {
            this.h.o(2);
            this.h.o(this.h.h(6) * 8);
            return;
        } else {
            return;
        }
        lVar.o(i3);
    }

    private void t(int i2) {
        a aVar = this.j[i2];
        this.h.o(2);
        boolean g2 = this.h.g();
        boolean g3 = this.h.g();
        boolean g4 = this.h.g();
        int h2 = this.h.h(3);
        boolean g5 = this.h.g();
        int h3 = this.h.h(7);
        int h4 = this.h.h(8);
        int h5 = this.h.h(4);
        int h6 = this.h.h(4);
        this.h.o(2);
        int h7 = this.h.h(6);
        this.h.o(2);
        aVar.f(g2, g3, g4, h2, g5, h3, h4, h6, h7, h5, this.h.h(3), this.h.h(3));
    }

    private void u(int i2) {
        if (i2 == 127) {
            this.k.a(9835);
        } else {
            this.k.a((char) (i2 & 255));
        }
    }

    private void v(int i2) {
        this.k.a((char) (i2 & 255));
    }

    private void w(int i2) {
        a aVar;
        char c = ' ';
        if (i2 == 32) {
            aVar = this.k;
        } else if (i2 == 33) {
            aVar = this.k;
            c = 160;
        } else if (i2 == 37) {
            aVar = this.k;
            c = 8230;
        } else if (i2 == 42) {
            aVar = this.k;
            c = 352;
        } else if (i2 == 44) {
            aVar = this.k;
            c = 338;
        } else if (i2 == 63) {
            aVar = this.k;
            c = 376;
        } else if (i2 == 57) {
            aVar = this.k;
            c = 8482;
        } else if (i2 == 58) {
            aVar = this.k;
            c = 353;
        } else if (i2 == 60) {
            aVar = this.k;
            c = 339;
        } else if (i2 != 61) {
            switch (i2) {
                case 48:
                    aVar = this.k;
                    c = 9608;
                    break;
                case 49:
                    aVar = this.k;
                    c = 8216;
                    break;
                case 50:
                    aVar = this.k;
                    c = 8217;
                    break;
                case 51:
                    aVar = this.k;
                    c = 8220;
                    break;
                case 52:
                    aVar = this.k;
                    c = 8221;
                    break;
                case 53:
                    aVar = this.k;
                    c = 8226;
                    break;
                default:
                    switch (i2) {
                        case 118:
                            aVar = this.k;
                            c = 8539;
                            break;
                        case 119:
                            aVar = this.k;
                            c = 8540;
                            break;
                        case 120:
                            aVar = this.k;
                            c = 8541;
                            break;
                        case 121:
                            aVar = this.k;
                            c = 8542;
                            break;
                        case 122:
                            aVar = this.k;
                            c = 9474;
                            break;
                        case 123:
                            aVar = this.k;
                            c = 9488;
                            break;
                        case 124:
                            aVar = this.k;
                            c = 9492;
                            break;
                        case 125:
                            aVar = this.k;
                            c = 9472;
                            break;
                        case 126:
                            aVar = this.k;
                            c = 9496;
                            break;
                        case 127:
                            aVar = this.k;
                            c = 9484;
                            break;
                        default:
                            Log.w("Cea708Decoder", "Invalid G2 character: " + i2);
                            return;
                    }
            }
        } else {
            aVar = this.k;
            c = 8480;
        }
        aVar.a(c);
    }

    private void x(int i2) {
        a aVar;
        char c;
        if (i2 == 160) {
            aVar = this.k;
            c = 13252;
        } else {
            Log.w("Cea708Decoder", "Invalid G3 character: " + i2);
            aVar = this.k;
            c = '_';
        }
        aVar.a(c);
    }

    private void y() {
        this.k.m(this.h.h(4), this.h.h(2), this.h.h(2), this.h.g(), this.h.g(), this.h.h(3), this.h.h(3));
    }

    private void z() {
        int h2 = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int h3 = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        this.h.o(2);
        this.k.n(h2, h3, a.g(this.h.h(2), this.h.h(2), this.h.h(2)));
    }

    /* access modifiers changed from: protected */
    public e f() {
        List<b.a.a.a.o0.b> list = this.l;
        this.m = list;
        return new e(list);
    }

    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        this.o = 0;
        this.k = this.j[0];
        D();
        this.n = null;
    }

    /* access modifiers changed from: protected */
    public void g(i iVar) {
        this.g.H(iVar.c.array(), iVar.c.limit());
        while (this.g.a() >= 3) {
            int x = this.g.x() & 7;
            int i2 = x & 3;
            boolean z = false;
            boolean z2 = (x & 4) == 4;
            byte x2 = (byte) this.g.x();
            byte x3 = (byte) this.g.x();
            if ((i2 == 2 || i2 == 3) && z2) {
                if (i2 == 3) {
                    n();
                    int i3 = (x2 & 192) >> 6;
                    byte b2 = x2 & 63;
                    if (b2 == 0) {
                        b2 = 64;
                    }
                    b bVar = new b(i3, b2);
                    this.n = bVar;
                    byte[] bArr = bVar.c;
                    int i4 = bVar.d;
                    bVar.d = i4 + 1;
                    bArr[i4] = x3;
                } else {
                    if (i2 == 2) {
                        z = true;
                    }
                    b.a.a.a.r0.a.a(z);
                    b bVar2 = this.n;
                    if (bVar2 == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.c;
                        int i5 = bVar2.d;
                        int i6 = i5 + 1;
                        bVar2.d = i6;
                        bArr2[i5] = x2;
                        bVar2.d = i6 + 1;
                        bArr2[i6] = x3;
                    }
                }
                b bVar3 = this.n;
                if (bVar3.d == (bVar3.f606b * 2) - 1) {
                    n();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return this.l != this.m;
    }
}
