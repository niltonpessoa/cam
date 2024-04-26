package b.a.a.a.p0;

import android.graphics.Point;
import android.text.TextUtils;
import b.a.a.a.b0;
import b.a.a.a.n;
import b.a.a.a.n0.m;
import b.a.a.a.p0.e;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class b extends d {
    private static final int[] f = new int[0];
    private final e.a d;
    private final AtomicReference<c> e;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f669a;

        /* renamed from: b  reason: collision with root package name */
        public final int f670b;
        public final String c;

        public a(int i, int i2, String str) {
            this.f669a = i;
            this.f670b = i2;
            this.c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f669a == aVar.f669a && this.f670b == aVar.f670b && TextUtils.equals(this.c, aVar.c);
        }

        public int hashCode() {
            int i = ((this.f669a * 31) + this.f670b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: b.a.a.a.p0.b$b  reason: collision with other inner class name */
    private static final class C0040b implements Comparable<C0040b> {

        /* renamed from: a  reason: collision with root package name */
        private final c f671a;

        /* renamed from: b  reason: collision with root package name */
        private final int f672b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;

        public C0040b(n nVar, c cVar, int i) {
            this.f671a = cVar;
            int i2 = 0;
            this.f672b = b.x(i, false) ? 1 : 0;
            this.c = b.p(nVar, cVar.f673a) ? 1 : 0;
            this.d = (nVar.x & 1) != 0 ? 1 : i2;
            this.e = nVar.r;
            this.f = nVar.s;
            this.g = nVar.f543b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
            r0 = r3.f;
            r2 = r4.f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compareTo(b.a.a.a.p0.b.C0040b r4) {
            /*
                r3 = this;
                int r0 = r3.f672b
                int r1 = r4.f672b
                if (r0 == r1) goto L_0x000b
                int r4 = b.a.a.a.p0.b.n(r0, r1)
                return r4
            L_0x000b:
                int r1 = r3.c
                int r2 = r4.c
                if (r1 == r2) goto L_0x0016
                int r4 = b.a.a.a.p0.b.n(r1, r2)
                return r4
            L_0x0016:
                int r1 = r3.d
                int r2 = r4.d
                if (r1 == r2) goto L_0x0021
                int r4 = b.a.a.a.p0.b.n(r1, r2)
                return r4
            L_0x0021:
                b.a.a.a.p0.b$c r1 = r3.f671a
                boolean r1 = r1.l
                if (r1 == 0) goto L_0x0030
                int r4 = r4.g
                int r0 = r3.g
                int r4 = b.a.a.a.p0.b.n(r4, r0)
                return r4
            L_0x0030:
                r1 = 1
                if (r0 != r1) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r1 = -1
            L_0x0035:
                int r0 = r3.e
                int r2 = r4.e
                if (r0 == r2) goto L_0x0042
            L_0x003b:
                int r4 = b.a.a.a.p0.b.n(r0, r2)
            L_0x003f:
                int r1 = r1 * r4
                return r1
            L_0x0042:
                int r0 = r3.f
                int r2 = r4.f
                if (r0 == r2) goto L_0x0049
                goto L_0x003b
            L_0x0049:
                int r0 = r3.g
                int r4 = r4.g
                int r4 = b.a.a.a.p0.b.n(r0, r4)
                goto L_0x003f
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.p0.b.C0040b.compareTo(b.a.a.a.p0.b$b):int");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0040b.class != obj.getClass()) {
                return false;
            }
            C0040b bVar = (C0040b) obj;
            return this.f672b == bVar.f672b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g;
        }

        public int hashCode() {
            return (((((((((this.f672b * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g;
        }
    }

    public static final class c {
        public static final c p = new c();

        /* renamed from: a  reason: collision with root package name */
        public final String f673a;

        /* renamed from: b  reason: collision with root package name */
        public final String f674b;
        public final boolean c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final boolean h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;

        private c() {
            this((String) null, (String) null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        private c(String str, String str2, boolean z, int i2, boolean z2, boolean z3, boolean z4, int i3, int i4, int i5, boolean z5, boolean z6, int i6, int i7, boolean z7) {
            this.f673a = w.A(str);
            this.f674b = w.A(str2);
            this.c = z;
            this.d = i2;
            this.l = z2;
            this.m = z3;
            this.n = z4;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = z5;
            this.o = z6;
            this.i = i6;
            this.j = i7;
            this.k = z7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.c == cVar.c && this.d == cVar.d && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.e == cVar.e && this.f == cVar.f && this.h == cVar.h && this.o == cVar.o && this.k == cVar.k && this.i == cVar.i && this.j == cVar.j && this.g == cVar.g && TextUtils.equals(this.f673a, cVar.f673a) && TextUtils.equals(this.f674b, cVar.f674b);
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((this.c ? 1 : 0) * true) + this.d) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.h ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + this.g) * 31) + this.f673a.hashCode()) * 31) + this.f674b.hashCode();
        }
    }

    public b() {
        this((e.a) null);
    }

    public b(e.a aVar) {
        this.d = aVar;
        this.e = new AtomicReference<>(c.p);
    }

    private static e A(b0 b0Var, b.a.a.a.n0.n nVar, int[][] iArr, c cVar, e.a aVar) {
        b.a.a.a.n0.n nVar2 = nVar;
        c cVar2 = cVar;
        int i = cVar2.n ? 24 : 16;
        boolean z = cVar2.m && (b0Var.s() & i) != 0;
        for (int i2 = 0; i2 < nVar2.f587a; i2++) {
            m a2 = nVar2.a(i2);
            int[] u = u(a2, iArr[i2], z, i, cVar2.e, cVar2.f, cVar2.g, cVar2.i, cVar2.j, cVar2.k);
            if (u.length > 0) {
                return aVar.a(a2, u);
            }
            e.a aVar2 = aVar;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r15 = r2.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r4 = r2.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r4 = r2.f543b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0083, code lost:
        if (m(r2.f543b, r10) < 0) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static b.a.a.a.p0.e C(b.a.a.a.n0.n r18, int[][] r19, b.a.a.a.p0.b.c r20) {
        /*
            r0 = r18
            r1 = r20
            r3 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x000b:
            int r11 = r0.f587a
            if (r5 >= r11) goto L_0x00c1
            b.a.a.a.n0.m r11 = r0.a(r5)
            int r12 = r1.i
            int r13 = r1.j
            boolean r14 = r1.k
            java.util.List r12 = w(r11, r12, r13, r14)
            r13 = r19[r5]
            r14 = 0
        L_0x0020:
            int r15 = r11.f585a
            if (r14 >= r15) goto L_0x00ba
            r15 = r13[r14]
            boolean r2 = r1.o
            boolean r2 = x(r15, r2)
            if (r2 == 0) goto L_0x00b3
            b.a.a.a.n r2 = r11.a(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r15 = r12.contains(r15)
            r16 = 1
            if (r15 == 0) goto L_0x0058
            int r15 = r2.j
            if (r15 == r3) goto L_0x0046
            int r4 = r1.e
            if (r15 > r4) goto L_0x0058
        L_0x0046:
            int r4 = r2.k
            if (r4 == r3) goto L_0x004e
            int r15 = r1.f
            if (r4 > r15) goto L_0x0058
        L_0x004e:
            int r4 = r2.f543b
            if (r4 == r3) goto L_0x0056
            int r15 = r1.g
            if (r4 > r15) goto L_0x0058
        L_0x0056:
            r4 = 1
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r4 != 0) goto L_0x0060
            boolean r15 = r1.h
            if (r15 != 0) goto L_0x0060
            goto L_0x00b3
        L_0x0060:
            if (r4 == 0) goto L_0x0064
            r15 = 2
            goto L_0x0065
        L_0x0064:
            r15 = 1
        L_0x0065:
            r3 = r13[r14]
            r0 = 0
            boolean r3 = x(r3, r0)
            if (r3 == 0) goto L_0x0070
            int r15 = r15 + 1000
        L_0x0070:
            if (r15 <= r8) goto L_0x0075
            r17 = 1
            goto L_0x0077
        L_0x0075:
            r17 = 0
        L_0x0077:
            if (r15 != r8) goto L_0x00a6
            boolean r0 = r1.l
            if (r0 == 0) goto L_0x008b
            int r0 = r2.f543b
            int r0 = m(r0, r10)
            if (r0 >= 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r16 = 0
        L_0x0088:
            r17 = r16
            goto L_0x00a6
        L_0x008b:
            int r0 = r2.s()
            if (r0 == r9) goto L_0x0096
            int r0 = m(r0, r9)
            goto L_0x009c
        L_0x0096:
            int r0 = r2.f543b
            int r0 = m(r0, r10)
        L_0x009c:
            if (r3 == 0) goto L_0x00a3
            if (r4 == 0) goto L_0x00a3
            if (r0 <= 0) goto L_0x0086
            goto L_0x0088
        L_0x00a3:
            if (r0 >= 0) goto L_0x0086
            goto L_0x0088
        L_0x00a6:
            if (r17 == 0) goto L_0x00b3
            int r0 = r2.f543b
            int r2 = r2.s()
            r10 = r0
            r9 = r2
            r6 = r11
            r7 = r14
            r8 = r15
        L_0x00b3:
            int r14 = r14 + 1
            r0 = r18
            r3 = -1
            goto L_0x0020
        L_0x00ba:
            int r5 = r5 + 1
            r0 = r18
            r3 = -1
            goto L_0x000b
        L_0x00c1:
            if (r6 != 0) goto L_0x00c5
            r2 = 0
            goto L_0x00ca
        L_0x00c5:
            b.a.a.a.p0.c r2 = new b.a.a.a.p0.c
            r2.<init>(r6, r7)
        L_0x00ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.p0.b.C(b.a.a.a.n0.n, int[][], b.a.a.a.p0.b$c):b.a.a.a.p0.e");
    }

    private static int m(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: private */
    public static int n(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    private static void o(m mVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            m mVar2 = mVar;
            if (!z(mVar.a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list2.remove(size);
            }
        }
    }

    protected static boolean p(n nVar, String str) {
        return str != null && TextUtils.equals(str, w.A(nVar.y));
    }

    protected static boolean q(n nVar) {
        return TextUtils.isEmpty(nVar.y) || p(nVar, "und");
    }

    private static int r(m mVar, int[] iArr, a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < mVar.f585a; i2++) {
            if (y(mVar.a(i2), iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    private static int[] s(m mVar, int[] iArr, boolean z) {
        int r;
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < mVar.f585a; i2++) {
            n a2 = mVar.a(i2);
            a aVar2 = new a(a2.r, a2.s, z ? null : a2.f);
            if (hashSet.add(aVar2) && (r = r(mVar, iArr, aVar2)) > i) {
                i = r;
                aVar = aVar2;
            }
        }
        if (i <= 1) {
            return f;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < mVar.f585a; i4++) {
            if (y(mVar.a(i4), iArr[i4], aVar)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    private static int t(m mVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            m mVar2 = mVar;
            if (z(mVar.a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    private static int[] u(m mVar, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        String str;
        int t;
        m mVar2 = mVar;
        if (mVar2.f585a < 2) {
            return f;
        }
        List<Integer> w = w(mVar2, i5, i6, z2);
        if (w.size() < 2) {
            return f;
        }
        if (!z) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i7 = 0;
            for (int i8 = 0; i8 < w.size(); i8++) {
                String str3 = mVar2.a(w.get(i8).intValue()).f;
                if (hashSet.add(str3) && (t = t(mVar, iArr, i, str3, i2, i3, i4, w)) > i7) {
                    i7 = t;
                    str2 = str3;
                }
            }
            str = str2;
        } else {
            str = null;
        }
        o(mVar, iArr, i, str, i2, i3, i4, w);
        return w.size() < 2 ? f : w.F(w);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point v(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = b.a.a.a.r0.w.e(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = b.a.a.a.r0.w.e(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.p0.b.v(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> w(m mVar, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(mVar.f585a);
        for (int i4 = 0; i4 < mVar.f585a; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < mVar.f585a; i6++) {
                n a2 = mVar.a(i6);
                int i7 = a2.j;
                if (i7 > 0 && (i3 = a2.k) > 0) {
                    Point v = v(z, i, i2, i7, i3);
                    int i8 = a2.j;
                    int i9 = a2.k;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (((float) v.x) * 0.98f)) && i9 >= ((int) (((float) v.y) * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int s = mVar.a(((Integer) arrayList.get(size)).intValue()).s();
                    if (s == -1 || s > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    protected static boolean x(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static boolean y(n nVar, int i, a aVar) {
        if (!x(i, false) || nVar.r != aVar.f669a || nVar.s != aVar.f670b) {
            return false;
        }
        String str = aVar.c;
        return str == null || TextUtils.equals(str, nVar.f);
    }

    private static boolean z(n nVar, String str, int i, int i2, int i3, int i4, int i5) {
        if (!x(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !w.b(nVar.f, str)) {
            return false;
        }
        int i6 = nVar.j;
        if (i6 != -1 && i6 > i3) {
            return false;
        }
        int i7 = nVar.k;
        if (i7 != -1 && i7 > i4) {
            return false;
        }
        int i8 = nVar.f543b;
        return i8 == -1 || i8 <= i5;
    }

    /* access modifiers changed from: protected */
    public e B(b.a.a.a.n0.n nVar, int[][] iArr, c cVar, e.a aVar) {
        b.a.a.a.n0.n nVar2 = nVar;
        c cVar2 = cVar;
        e.a aVar2 = aVar;
        C0040b bVar = null;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < nVar2.f587a; i3++) {
            m a2 = nVar2.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a2.f585a; i4++) {
                if (x(iArr2[i4], cVar2.o)) {
                    C0040b bVar2 = new C0040b(a2.a(i4), cVar2, iArr2[i4]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i = i3;
                        i2 = i4;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        m a3 = nVar2.a(i);
        if (!cVar2.l && aVar2 != null) {
            int[] s = s(a3, iArr[i], cVar2.m);
            if (s.length > 0) {
                return aVar2.a(a3, s);
            }
        }
        return new c(a3, i2);
    }

    /* access modifiers changed from: protected */
    public e D(int i, b.a.a.a.n0.n nVar, int[][] iArr, c cVar) {
        m mVar = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < nVar.f587a; i4++) {
            m a2 = nVar.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a2.f585a; i5++) {
                if (x(iArr2[i5], cVar.o)) {
                    int i6 = 1;
                    if ((a2.a(i5).x & 1) != 0) {
                        i6 = 2;
                    }
                    if (x(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i3) {
                        mVar = a2;
                        i2 = i5;
                        i3 = i6;
                    }
                }
            }
        }
        if (mVar == null) {
            return null;
        }
        return new c(mVar, i2);
    }

    /* access modifiers changed from: protected */
    public e E(b.a.a.a.n0.n nVar, int[][] iArr, c cVar) {
        b.a.a.a.n0.n nVar2 = nVar;
        c cVar2 = cVar;
        m mVar = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < nVar2.f587a; i3++) {
            m a2 = nVar2.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a2.f585a; i4++) {
                if (x(iArr2[i4], cVar2.o)) {
                    n a3 = a2.a(i4);
                    int i5 = a3.x & (cVar2.d ^ -1);
                    int i6 = 1;
                    boolean z = (i5 & 1) != 0;
                    boolean z2 = (i5 & 2) != 0;
                    boolean p = p(a3, cVar2.f674b);
                    if (p || (cVar2.c && q(a3))) {
                        i6 = (z ? 8 : !z2 ? 6 : 4) + (p ? 1 : 0);
                    } else if (z) {
                        i6 = 3;
                    } else if (z2) {
                        if (p(a3, cVar2.f673a)) {
                            i6 = 2;
                        }
                    }
                    if (x(iArr2[i4], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i2) {
                        mVar = a2;
                        i = i4;
                        i2 = i6;
                    }
                }
            }
        }
        if (mVar == null) {
            return null;
        }
        return new c(mVar, i);
    }

    /* access modifiers changed from: protected */
    public e F(b0 b0Var, b.a.a.a.n0.n nVar, int[][] iArr, c cVar, e.a aVar) {
        e A = (cVar.l || aVar == null) ? null : A(b0Var, nVar, iArr, cVar, aVar);
        return A == null ? C(nVar, iArr, cVar) : A;
    }

    /* access modifiers changed from: protected */
    public e[] k(b0[] b0VarArr, b.a.a.a.n0.n[] nVarArr, int[][][] iArr) {
        b0[] b0VarArr2 = b0VarArr;
        int length = b0VarArr2.length;
        e[] eVarArr = new e[length];
        c cVar = this.e.get();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i >= length) {
                break;
            }
            if (2 == b0VarArr2[i].g()) {
                if (!z) {
                    eVarArr[i] = F(b0VarArr2[i], nVarArr[i], iArr[i], cVar, this.d);
                    z = eVarArr[i] != null;
                }
                if (nVarArr[i].f587a <= 0) {
                    z3 = false;
                }
                z2 |= z3;
            }
            i++;
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i2 = 0; i2 < length; i2++) {
            int g = b0VarArr2[i2].g();
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        eVarArr[i2] = D(b0VarArr2[i2].g(), nVarArr[i2], iArr[i2], cVar);
                    } else if (!z5) {
                        eVarArr[i2] = E(nVarArr[i2], iArr[i2], cVar);
                        z5 = eVarArr[i2] != null;
                    }
                }
            } else if (!z4) {
                eVarArr[i2] = B(nVarArr[i2], iArr[i2], cVar, z2 ? null : this.d);
                z4 = eVarArr[i2] != null;
            }
        }
        return eVarArr;
    }
}
