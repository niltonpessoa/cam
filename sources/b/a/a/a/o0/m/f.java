package b.a.a.a.o0.m;

import android.util.Log;
import b.a.a.a.k0.n;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final int f610a = w.o("GA94");

    /* renamed from: b  reason: collision with root package name */
    private static final int f611b = w.o("DTG1");

    public static void a(long j, m mVar, n[] nVarArr) {
        m mVar2 = mVar;
        n[] nVarArr2 = nVarArr;
        while (mVar.a() > 1) {
            int b2 = b(mVar);
            int b3 = b(mVar);
            int c = mVar.c() + b3;
            if (b3 == -1 || b3 > mVar.a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                c = mVar.d();
            } else if (b2 == 4 && b3 >= 8) {
                int x = mVar.x();
                int D = mVar.D();
                int i = D == 49 ? mVar.i() : 0;
                int x2 = mVar.x();
                if (D == 47) {
                    mVar2.K(1);
                }
                boolean z = x == 181 && (D == 49 || D == 47) && x2 == 3;
                if (D == 49) {
                    z &= i == f610a || i == f611b;
                }
                if (z) {
                    mVar2.K(1);
                    int x3 = (mVar.x() & 31) * 3;
                    int c2 = mVar.c();
                    for (n nVar : nVarArr2) {
                        mVar2.J(c2);
                        nVar.a(mVar2, x3);
                        nVar.d(j, 1, x3, 0, (n.a) null);
                    }
                }
            }
            mVar2.J(c);
        }
    }

    private static int b(m mVar) {
        int i = 0;
        while (mVar.a() != 0) {
            int x = mVar.x();
            i += x;
            if (x != 255) {
                return i;
            }
        }
        return -1;
    }
}
