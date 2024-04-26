package b.b.b.e;

import b.b.b.d.b;
import java.util.Map;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f805b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, b> f806a;

    public static a a() {
        if (f805b == null) {
            f805b = new a();
        }
        return f805b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r8 = r8.split(";");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r8) {
        /*
            r7 = this;
            java.util.Map<java.lang.String, b.b.b.d.b> r0 = r7.f806a
            if (r0 != 0) goto L_0x000b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.f806a = r0
        L_0x000b:
            if (r8 == 0) goto L_0x0058
            java.lang.String r0 = ""
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            java.lang.String r1 = ";"
            java.lang.String[] r8 = r8.split(r1)
            int r1 = r8.length
            if (r1 > 0) goto L_0x0020
            return
        L_0x0020:
            r2 = 0
            r3 = 0
        L_0x0022:
            if (r3 >= r1) goto L_0x0058
            r4 = r8[r3]
            java.lang.String r5 = ":"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0055
            r4 = r8[r3]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            r4 = r8[r3]
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = 2
            if (r5 >= r6) goto L_0x0042
            goto L_0x0055
        L_0x0042:
            r5 = r4[r2]
            r6 = 1
            r4 = r4[r6]
            b.b.b.d.b r6 = new b.b.b.d.b
            r6.<init>(r5, r4)
            java.util.Map<java.lang.String, b.b.b.d.b> r4 = r7.f806a
            java.lang.String r5 = r6.b()
            r4.put(r5, r6)
        L_0x0055:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.b.e.a.b(java.lang.String):void");
    }
}
