package b.a.a.a.m0.i;

import android.util.Log;
import b.a.a.a.m0.a;
import b.a.a.a.m0.e;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class g implements b.a.a.a.m0.b {

    /* renamed from: b  reason: collision with root package name */
    public static final int f519b = w.o("ID3");

    /* renamed from: a  reason: collision with root package name */
    private final a f520a;

    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f521a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f522b;
        /* access modifiers changed from: private */
        public final int c;

        public b(int i, boolean z, int i2) {
            this.f521a = i;
            this.f522b = z;
            this.c = i2;
        }
    }

    public g() {
        this((a) null);
    }

    public g(a aVar) {
        this.f520a = aVar;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        return i2 <= i ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    private static a d(m mVar, int i, int i2) {
        int i3;
        String str;
        int x = mVar.x();
        String s = s(x);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        mVar.g(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + w.G(new String(bArr, 0, 3, "ISO-8859-1"));
            if (str.equals("image/jpg")) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = v(bArr, 0);
            String G = w.G(new String(bArr, 0, i3, "ISO-8859-1"));
            if (G.indexOf(47) == -1) {
                str = "image/" + G;
            } else {
                str = G;
            }
        }
        int i5 = i3 + 2;
        int u = u(bArr, i5, x);
        return new a(str, new String(bArr, i5, u - i5, s), bArr[i3 + 1] & 255, b(bArr, u + r(x), i4));
    }

    private static b e(m mVar, int i, String str) {
        byte[] bArr = new byte[i];
        mVar.g(bArr, 0, i);
        return new b(str, bArr);
    }

    private static c f(m mVar, int i, int i2, boolean z, int i3, a aVar) {
        m mVar2 = mVar;
        int c = mVar.c();
        int v = v(mVar2.f734a, c);
        String str = new String(mVar2.f734a, c, v - c, "ISO-8859-1");
        mVar.J(v + 1);
        int i4 = mVar.i();
        int i5 = mVar.i();
        long z2 = mVar.z();
        long j = z2 == 4294967295L ? -1 : z2;
        long z3 = mVar.z();
        long j2 = z3 == 4294967295L ? -1 : z3;
        ArrayList arrayList = new ArrayList();
        int i6 = c + i;
        while (mVar.c() < i6) {
            h i7 = i(i2, mVar, z, i3, aVar);
            if (i7 != null) {
                arrayList.add(i7);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, i4, i5, j, j2, hVarArr);
    }

    private static d g(m mVar, int i, int i2, boolean z, int i3, a aVar) {
        m mVar2 = mVar;
        int c = mVar.c();
        int v = v(mVar2.f734a, c);
        String str = new String(mVar2.f734a, c, v - c, "ISO-8859-1");
        mVar.J(v + 1);
        int x = mVar.x();
        boolean z2 = (x & 2) != 0;
        boolean z3 = (x & 1) != 0;
        int x2 = mVar.x();
        String[] strArr = new String[x2];
        for (int i4 = 0; i4 < x2; i4++) {
            int c2 = mVar.c();
            int v2 = v(mVar2.f734a, c2);
            strArr[i4] = new String(mVar2.f734a, c2, v2 - c2, "ISO-8859-1");
            mVar.J(v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c + i;
        while (mVar.c() < i5) {
            h i6 = i(i2, mVar, z, i3, aVar);
            if (i6 != null) {
                arrayList.add(i6);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z2, z3, strArr, hVarArr);
    }

    private static e h(m mVar, int i) {
        if (i < 4) {
            return null;
        }
        int x = mVar.x();
        String s = s(x);
        byte[] bArr = new byte[3];
        mVar.g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        mVar.g(bArr2, 0, i2);
        int u = u(bArr2, 0, x);
        String str2 = new String(bArr2, 0, u, s);
        int r = u + r(x);
        return new e(str, str2, m(bArr2, r, u(bArr2, r, x), s));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static b.a.a.a.m0.i.h i(int r19, b.a.a.a.r0.m r20, boolean r21, int r22, b.a.a.a.m0.i.g.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.x()
            int r9 = r20.x()
            int r10 = r20.x()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.x()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.B()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.B()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.A()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.D()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.d()
            r7.J(r0)
            return r16
        L_0x0067:
            int r1 = r20.c()
            int r5 = r1 + r15
            int r1 = r20.d()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r4, r0)
            int r0 = r20.d()
            r7.J(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.J(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0215
            if (r4 == 0) goto L_0x00f8
            goto L_0x0215
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.K(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.K(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = w(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            b.a.a.a.m0.i.j r1 = o(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = t(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            b.a.a.a.m0.i.j r1 = n(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x012e:
            r0 = move-exception
            goto L_0x0211
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            b.a.a.a.m0.i.k r1 = q(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = t(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            b.a.a.a.m0.i.k r1 = p(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            b.a.a.a.m0.i.i r1 = l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            b.a.a.a.m0.i.f r1 = j(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0197
            if (r9 != r3) goto L_0x0197
            if (r10 != r11) goto L_0x0197
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0197
            if (r9 != r4) goto L_0x0197
            if (r10 != r3) goto L_0x0197
            if (r13 != r11) goto L_0x0197
        L_0x0192:
            b.a.a.a.m0.i.a r1 = d(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x0197:
            if (r8 != r11) goto L_0x01a8
            if (r9 != r6) goto L_0x01a8
            r3 = 77
            if (r10 != r3) goto L_0x01a8
            if (r13 == r3) goto L_0x01a3
            if (r0 != r2) goto L_0x01a8
        L_0x01a3:
            b.a.a.a.m0.i.e r1 = h(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x01a8:
            if (r8 != r11) goto L_0x01c2
            r2 = 72
            if (r9 != r2) goto L_0x01c2
            if (r10 != r5) goto L_0x01c2
            if (r13 != r4) goto L_0x01c2
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            b.a.a.a.m0.i.c r1 = f(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x01c2:
            if (r8 != r11) goto L_0x01da
            if (r9 != r1) goto L_0x01da
            if (r10 != r6) goto L_0x01da
            if (r13 != r11) goto L_0x01da
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            b.a.a.a.m0.i.d r1 = g(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            goto L_0x01e2
        L_0x01da:
            java.lang.String r1 = t(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            b.a.a.a.m0.i.b r1 = e(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
        L_0x01e2:
            if (r1 != 0) goto L_0x0204
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            java.lang.String r0 = t(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0208 }
            android.util.Log.w(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0208 }
        L_0x0204:
            r7.J(r14)
            return r1
        L_0x0208:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r12, r0)     // Catch:{ all -> 0x012e }
            r7.J(r14)
            return r16
        L_0x0211:
            r7.J(r14)
            throw r0
        L_0x0215:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r12, r0)
            r7.J(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.m0.i.g.i(int, b.a.a.a.r0.m, boolean, int, b.a.a.a.m0.i.g$a):b.a.a.a.m0.i.h");
    }

    private static f j(m mVar, int i) {
        int x = mVar.x();
        String s = s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.g(bArr, 0, i2);
        int v = v(bArr, 0);
        String str = new String(bArr, 0, v, "ISO-8859-1");
        int i3 = v + 1;
        int u = u(bArr, i3, x);
        String m = m(bArr, i3, u, s);
        int r = u + r(x);
        int u2 = u(bArr, r, x);
        return new f(str, m, m(bArr, r, u2, s), b(bArr, u2 + r(x), i2));
    }

    private static b k(m mVar) {
        StringBuilder sb;
        String str;
        String str2;
        if (mVar.a() < 10) {
            str2 = "Data too short to be an ID3 tag";
        } else {
            int A = mVar.A();
            if (A != f519b) {
                sb = new StringBuilder();
                str = "Unexpected first three bytes of ID3 tag header: ";
            } else {
                A = mVar.x();
                boolean z = true;
                mVar.K(1);
                int x = mVar.x();
                int w = mVar.w();
                if (A == 2) {
                    if ((x & 64) != 0) {
                        str2 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (A == 3) {
                    if ((x & 64) != 0) {
                        int i = mVar.i();
                        mVar.K(i);
                        w -= i + 4;
                    }
                } else if (A == 4) {
                    if ((x & 64) != 0) {
                        int w2 = mVar.w();
                        mVar.K(w2 - 4);
                        w -= w2;
                    }
                    if ((x & 16) != 0) {
                        w -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    str = "Skipped ID3 tag with unsupported majorVersion=";
                }
                if (A >= 4 || (x & 128) == 0) {
                    z = false;
                }
                return new b(A, z, w);
            }
            sb.append(str);
            sb.append(A);
            str2 = sb.toString();
        }
        Log.w("Id3Decoder", str2);
        return null;
    }

    private static i l(m mVar, int i) {
        byte[] bArr = new byte[i];
        mVar.g(bArr, 0, i);
        int v = v(bArr, 0);
        return new i(new String(bArr, 0, v, "ISO-8859-1"), b(bArr, v + 1, i));
    }

    private static String m(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static j n(m mVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int x = mVar.x();
        String s = s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.g(bArr, 0, i2);
        return new j(str, (String) null, new String(bArr, 0, u(bArr, 0, x), s));
    }

    private static j o(m mVar, int i) {
        if (i < 1) {
            return null;
        }
        int x = mVar.x();
        String s = s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.g(bArr, 0, i2);
        int u = u(bArr, 0, x);
        String str = new String(bArr, 0, u, s);
        int r = u + r(x);
        return new j("TXXX", str, m(bArr, r, u(bArr, r, x), s));
    }

    private static k p(m mVar, int i, String str) {
        byte[] bArr = new byte[i];
        mVar.g(bArr, 0, i);
        return new k(str, (String) null, new String(bArr, 0, v(bArr, 0), "ISO-8859-1"));
    }

    private static k q(m mVar, int i) {
        if (i < 1) {
            return null;
        }
        int x = mVar.x();
        String s = s(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        mVar.g(bArr, 0, i2);
        int u = u(bArr, 0, x);
        String str = new String(bArr, 0, u, s);
        int r = u + r(x);
        return new k("WXXX", str, m(bArr, r, v(bArr, r), "ISO-8859-1"));
    }

    private static int r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String t(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    private static int u(byte[] bArr, int i, int i2) {
        int v = v(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if (v % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = v(bArr, v + 1);
        }
        return bArr.length;
    }

    private static int v(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static int w(m mVar, int i) {
        byte[] bArr = mVar.f734a;
        int c = mVar.c();
        while (true) {
            int i2 = c + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[c] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, c + 2, bArr, i2, (i - c) - 2);
                i--;
            }
            c = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r10 & 128) != 0) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean x(b.a.a.a.r0.m r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.c()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x00af }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.i()     // Catch:{ all -> 0x00af }
            long r8 = r18.z()     // Catch:{ all -> 0x00af }
            int r10 = r18.D()     // Catch:{ all -> 0x00af }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.A()     // Catch:{ all -> 0x00af }
            int r8 = r18.A()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.J(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.J(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007b
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r4 = 0
            goto L_0x008b
        L_0x007b:
            if (r0 != r3) goto L_0x0089
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0083:
            r3 = 0
        L_0x0084:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0089:
            r3 = 0
            goto L_0x0079
        L_0x008b:
            if (r4 == 0) goto L_0x008f
            int r3 = r3 + 4
        L_0x008f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0098
            r1.J(r2)
            return r6
        L_0x0098:
            int r3 = r18.a()     // Catch:{ all -> 0x00af }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
            r1.J(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.K(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0008
        L_0x00ab:
            r1.J(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.J(r2)
            goto L_0x00b5
        L_0x00b4:
            throw r0
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.m0.i.g.x(b.a.a.a.r0.m, int, int, boolean):boolean");
    }

    public b.a.a.a.m0.a a(e eVar) {
        ByteBuffer byteBuffer = eVar.c;
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    public b.a.a.a.m0.a c(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        m mVar = new m(bArr, i);
        b k = k(mVar);
        if (k == null) {
            return null;
        }
        int c = mVar.c();
        int i2 = k.f521a == 2 ? 6 : 10;
        int b2 = k.c;
        if (k.f522b) {
            b2 = w(mVar, k.c);
        }
        mVar.I(c + b2);
        boolean z = false;
        if (!x(mVar, k.f521a, i2, false)) {
            if (k.f521a != 4 || !x(mVar, 4, i2, true)) {
                Log.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + k.f521a);
                return null;
            }
            z = true;
        }
        while (mVar.a() >= i2) {
            h i3 = i(k.f521a, mVar, z, i2, this.f520a);
            if (i3 != null) {
                arrayList.add(i3);
            }
        }
        return new b.a.a.a.m0.a((List<? extends a.b>) arrayList);
    }
}
