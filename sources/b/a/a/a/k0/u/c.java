package b.a.a.a.k0.u;

import android.util.Log;
import b.a.a.a.k0.f;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import b.a.a.a.u;

final class c {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f484a;

        /* renamed from: b  reason: collision with root package name */
        public final long f485b;

        private a(int i, long j) {
            this.f484a = i;
            this.f485b = j;
        }

        public static a a(f fVar, m mVar) {
            fVar.h(mVar.f734a, 0, 8);
            mVar.J(0);
            return new a(mVar.i(), mVar.n());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.a.a.a.k0.u.b a(b.a.a.a.k0.f r17) {
        /*
            r0 = r17
            b.a.a.a.r0.a.e(r17)
            b.a.a.a.r0.m r1 = new b.a.a.a.r0.m
            r2 = 16
            r1.<init>((int) r2)
            b.a.a.a.k0.u.c$a r3 = b.a.a.a.k0.u.c.a.a(r0, r1)
            int r3 = r3.f484a
            java.lang.String r4 = "RIFF"
            int r4 = b.a.a.a.r0.w.o(r4)
            r5 = 0
            if (r3 == r4) goto L_0x001c
            return r5
        L_0x001c:
            byte[] r3 = r1.f734a
            r4 = 0
            r6 = 4
            r0.h(r3, r4, r6)
            r1.J(r4)
            int r3 = r1.i()
            java.lang.String r7 = "WAVE"
            int r7 = b.a.a.a.r0.w.o(r7)
            java.lang.String r8 = "WavHeaderReader"
            if (r3 == r7) goto L_0x0049
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported RIFF format: "
            r0.append(r1)
            r0.append(r3)
        L_0x0041:
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r8, r0)
            return r5
        L_0x0049:
            b.a.a.a.k0.u.c$a r3 = b.a.a.a.k0.u.c.a.a(r0, r1)
            int r7 = r3.f484a
            java.lang.String r9 = "fmt "
            int r9 = b.a.a.a.r0.w.o(r9)
            if (r7 == r9) goto L_0x005e
            long r9 = r3.f485b
            int r3 = (int) r9
            r0.j(r3)
            goto L_0x0049
        L_0x005e:
            long r9 = r3.f485b
            r11 = 16
            r7 = 1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0069
            r9 = 1
            goto L_0x006a
        L_0x0069:
            r9 = 0
        L_0x006a:
            b.a.a.a.r0.a.f(r9)
            byte[] r9 = r1.f734a
            r0.h(r9, r4, r2)
            r1.J(r4)
            int r9 = r1.p()
            int r11 = r1.p()
            int r12 = r1.o()
            int r13 = r1.o()
            int r14 = r1.p()
            int r15 = r1.p()
            int r1 = r11 * r15
            int r1 = r1 / 8
            if (r14 != r1) goto L_0x00d9
            if (r9 == r7) goto L_0x00b3
            r1 = 3
            if (r9 == r1) goto L_0x00ab
            r1 = 65534(0xfffe, float:9.1833E-41)
            if (r9 == r1) goto L_0x00b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported WAV format type: "
        L_0x00a4:
            r0.append(r1)
            r0.append(r9)
            goto L_0x0041
        L_0x00ab:
            r1 = 32
            if (r15 != r1) goto L_0x00b0
            r4 = 4
        L_0x00b0:
            r16 = r4
            goto L_0x00b9
        L_0x00b3:
            int r1 = b.a.a.a.r0.w.q(r15)
            r16 = r1
        L_0x00b9:
            if (r16 != 0) goto L_0x00cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported WAV bit depth "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = " for type "
            goto L_0x00a4
        L_0x00cb:
            long r3 = r3.f485b
            int r1 = (int) r3
            int r1 = r1 - r2
            r0.j(r1)
            b.a.a.a.k0.u.b r0 = new b.a.a.a.k0.u.b
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r0
        L_0x00d9:
            b.a.a.a.u r0 = new b.a.a.a.u
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected block alignment: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "; got: "
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            goto L_0x00f9
        L_0x00f8:
            throw r0
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.u.c.a(b.a.a.a.k0.f):b.a.a.a.k0.u.b");
    }

    public static void b(f fVar, b bVar) {
        b.a.a.a.r0.a.e(fVar);
        b.a.a.a.r0.a.e(bVar);
        fVar.b();
        m mVar = new m(8);
        while (true) {
            a a2 = a.a(fVar, mVar);
            if (a2.f484a != w.o("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.f484a);
                long j = a2.f485b + 8;
                if (a2.f484a == w.o("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    fVar.c((int) j);
                } else {
                    throw new u("Chunk is too large (~2GB+) to skip; id: " + a2.f484a);
                }
            } else {
                fVar.c(8);
                bVar.k(fVar.k(), a2.f485b);
                return;
            }
        }
    }
}
