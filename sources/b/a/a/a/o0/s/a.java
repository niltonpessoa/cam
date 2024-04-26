package b.a.a.a.o0.s;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import b.a.a.a.o0.b;
import b.a.a.a.o0.c;
import b.a.a.a.o0.e;
import b.a.a.a.o0.g;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import java.nio.charset.Charset;
import java.util.List;

public final class a extends c {
    private static final int u = w.o("styl");
    private static final int v = w.o("tbox");
    private final m n = new m();
    private boolean o;
    private int p;
    private int q;
    private String r;
    private float s;
    private int t;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        H(list);
    }

    private void C(m mVar, SpannableStringBuilder spannableStringBuilder) {
        D(mVar.a() >= 12);
        int D = mVar.D();
        int D2 = mVar.D();
        mVar.K(2);
        int x = mVar.x();
        mVar.K(1);
        int i = mVar.i();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i2 = D;
        int i3 = D2;
        F(spannableStringBuilder2, x, this.p, i2, i3, 0);
        E(spannableStringBuilder2, i, this.q, i2, i3, 0);
    }

    private static void D(boolean z) {
        if (!z) {
            throw new g("Unexpected subtitle format.");
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void F(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L_0x004c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x000c
            r10 = 1
            goto L_0x000d
        L_0x000c:
            r10 = 0
        L_0x000d:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r10 == 0) goto L_0x0023
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L_0x001f
            r4 = 3
            r3.<init>(r4)
            goto L_0x002b
        L_0x001f:
            r3.<init>(r1)
            goto L_0x002b
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L_0x002b:
            r5.setSpan(r3, r8, r9, r7)
        L_0x002e:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x003e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L_0x003e:
            if (r1 != 0) goto L_0x004c
            if (r10 != 0) goto L_0x004c
            if (r2 != 0) goto L_0x004c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.s.a.F(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    private static void G(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    private void H(List<byte[]> list) {
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.p = bArr[24];
            this.q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            if ("Serif".equals(new String(bArr, 43, bArr.length - 43))) {
                str = "serif";
            }
            this.r = str;
            int i = bArr[25] * 20;
            this.t = i;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.o = z;
            if (z) {
                float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i);
                this.s = f;
                this.s = w.h(f, 0.0f, 0.95f);
                return;
            }
        } else {
            this.p = 0;
            this.q = -1;
            this.r = str;
            this.o = false;
        }
        this.s = 0.85f;
    }

    private static String I(m mVar) {
        char e;
        D(mVar.a() >= 2);
        int D = mVar.D();
        if (D == 0) {
            return "";
        }
        return mVar.v(D, Charset.forName((mVar.a() < 2 || !((e = mVar.e()) == 65279 || e == 65534)) ? "UTF-8" : "UTF-16"));
    }

    /* access modifiers changed from: protected */
    public e z(byte[] bArr, int i, boolean z) {
        this.n.H(bArr, i);
        String I = I(this.n);
        if (I.isEmpty()) {
            return b.f648b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(I);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        F(spannableStringBuilder2, this.p, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder2, this.q, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder2, this.r, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f = this.s;
        while (this.n.a() >= 8) {
            int c = this.n.c();
            int i2 = this.n.i();
            int i3 = this.n.i();
            boolean z2 = true;
            if (i3 == u) {
                if (this.n.a() < 2) {
                    z2 = false;
                }
                D(z2);
                int D = this.n.D();
                for (int i4 = 0; i4 < D; i4++) {
                    C(this.n, spannableStringBuilder);
                }
            } else if (i3 == v && this.o) {
                if (this.n.a() < 2) {
                    z2 = false;
                }
                D(z2);
                f = w.h(((float) this.n.D()) / ((float) this.t), 0.0f, 0.95f);
            }
            this.n.J(c + i2);
        }
        return new b(new b(spannableStringBuilder, (Layout.Alignment) null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
