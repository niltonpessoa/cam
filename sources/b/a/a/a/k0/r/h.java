package b.a.a.a.k0.r;

import android.util.Log;
import b.a.a.a.r0.m;
import java.util.UUID;

public final class h {

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final UUID f388a;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f388a = uuid;
        }
    }

    private static a a(byte[] bArr) {
        m mVar = new m(bArr);
        if (mVar.d() < 32) {
            return null;
        }
        mVar.J(0);
        if (mVar.i() != mVar.a() + 4 || mVar.i() != a.V) {
            return null;
        }
        int c = a.c(mVar.i());
        if (c > 1) {
            Log.w("PsshAtomUtil", "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(mVar.q(), mVar.q());
        if (c == 1) {
            mVar.K(mVar.B() * 16);
        }
        int B = mVar.B();
        if (B != mVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[B];
        mVar.g(bArr2, 0, B);
        return new a(uuid, c, bArr2);
    }

    public static UUID b(byte[] bArr) {
        a a2 = a(bArr);
        if (a2 == null) {
            return null;
        }
        return a2.f388a;
    }
}
