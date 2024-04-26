package b.a.a.a.k0.s;

import b.a.a.a.j0.a;
import b.a.a.a.k0.s.h;
import b.a.a.a.n;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class g extends h {
    private static final int o = w.o("Opus");
    private static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean n;

    g() {
    }

    private long l(byte[] bArr) {
        byte b2 = bArr[0] & 255;
        byte b3 = b2 & 3;
        byte b4 = 2;
        if (b3 == 0) {
            b4 = 1;
        } else if (!(b3 == 1 || b3 == 2)) {
            b4 = bArr[1] & 63;
        }
        int i = b2 >> 3;
        int i2 = i & 3;
        return (long) (b4 * (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2));
    }

    private void m(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    public static boolean n(m mVar) {
        int a2 = mVar.a();
        byte[] bArr = p;
        if (a2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        mVar.g(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public long e(m mVar) {
        return b(l(mVar.f734a));
    }

    /* access modifiers changed from: protected */
    public boolean h(m mVar, long j, h.b bVar) {
        boolean z = true;
        if (!this.n) {
            byte[] copyOf = Arrays.copyOf(mVar.f734a, mVar.d());
            byte b2 = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            m(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            m(arrayList, 3840);
            bVar.f411a = n.h((String) null, "audio/opus", (String) null, -1, -1, b2, 48000, arrayList, (a) null, 0, (String) null);
            this.n = true;
            return true;
        }
        if (mVar.i() != o) {
            z = false;
        }
        mVar.J(0);
        return z;
    }

    /* access modifiers changed from: protected */
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = false;
        }
    }
}
