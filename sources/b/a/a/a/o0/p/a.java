package b.a.a.a.o0.p;

import android.util.Log;
import b.a.a.a.o0.b;
import b.a.a.a.o0.c;
import b.a.a.a.r0.h;
import b.a.a.a.r0.m;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends c {
    private static final Pattern s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private final boolean n;
    private int o;
    private int p;
    private int q;
    private int r;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.n = false;
            return;
        }
        this.n = true;
        String str = new String(list.get(0));
        b.a.a.a.r0.a.a(str.startsWith("Format: "));
        F(str);
        G(new m(list.get(1)));
    }

    private void D(String str, List<b> list, h hVar) {
        long j;
        StringBuilder sb;
        StringBuilder sb2;
        String str2;
        if (this.o == 0) {
            sb2 = new StringBuilder();
            str2 = "Skipping dialogue line before complete format: ";
        } else {
            String[] split = str.substring(10).split(",", this.o);
            if (split.length != this.o) {
                sb2 = new StringBuilder();
                str2 = "Skipping dialogue line with fewer columns than format: ";
            } else {
                long H = H(split[this.p]);
                if (H == -9223372036854775807L) {
                    sb = new StringBuilder();
                } else {
                    String str3 = split[this.q];
                    if (!str3.trim().isEmpty()) {
                        j = H(str3);
                        if (j == -9223372036854775807L) {
                            sb = new StringBuilder();
                        }
                    } else {
                        j = -9223372036854775807L;
                    }
                    list.add(new b(split[this.r].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                    hVar.a(H);
                    if (j != -9223372036854775807L) {
                        list.add((Object) null);
                        hVar.a(j);
                        return;
                    }
                    return;
                }
                sb2.append("Skipping invalid timing: ");
                sb2.append(str);
                Log.w("SsaDecoder", sb2.toString());
            }
        }
        sb2.append(str2);
        sb2.append(str);
        Log.w("SsaDecoder", sb2.toString());
    }

    private void E(m mVar, List<b> list, h hVar) {
        while (true) {
            String k = mVar.k();
            if (k == null) {
                return;
            }
            if (!this.n && k.startsWith("Format: ")) {
                F(k);
            } else if (k.startsWith("Dialogue: ")) {
                D(k, list, hVar);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 8
            java.lang.String r6 = r6.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r6 = android.text.TextUtils.split(r6, r0)
            int r0 = r6.length
            r5.o = r0
            r0 = -1
            r5.p = r0
            r5.q = r0
            r5.r = r0
            r1 = 0
            r2 = 0
        L_0x0018:
            int r3 = r5.o
            if (r2 >= r3) goto L_0x0061
            r3 = r6[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = b.a.a.a.r0.w.G(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case 100571: goto L_0x0048;
                case 3556653: goto L_0x003d;
                case 109757538: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r3 = -1
            goto L_0x0052
        L_0x0032:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x003b
            goto L_0x0030
        L_0x003b:
            r3 = 2
            goto L_0x0052
        L_0x003d:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0046
            goto L_0x0030
        L_0x0046:
            r3 = 1
            goto L_0x0052
        L_0x0048:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0051
            goto L_0x0030
        L_0x0051:
            r3 = 0
        L_0x0052:
            switch(r3) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0059;
                case 2: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x005e
        L_0x0056:
            r5.p = r2
            goto L_0x005e
        L_0x0059:
            r5.r = r2
            goto L_0x005e
        L_0x005c:
            r5.q = r2
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0061:
            int r6 = r5.p
            if (r6 == r0) goto L_0x006d
            int r6 = r5.q
            if (r6 == r0) goto L_0x006d
            int r6 = r5.r
            if (r6 != r0) goto L_0x006f
        L_0x006d:
            r5.o = r1
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.p.a.F(java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private void G(b.a.a.a.r0.m r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.String r0 = r3.k()
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "[Events]"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.p.a.G(b.a.a.a.r0.m):void");
    }

    public static long H(String str) {
        Matcher matcher = s.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public b z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        h hVar = new h();
        m mVar = new m(bArr, i);
        if (!this.n) {
            G(mVar);
        }
        E(mVar, arrayList, hVar);
        b[] bVarArr = new b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new b(bVarArr, hVar.d());
    }
}
