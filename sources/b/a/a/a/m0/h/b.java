package b.a.a.a.m0.h;

import b.a.a.a.m0.a;
import b.a.a.a.m0.e;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class b implements b.a.a.a.m0.b {
    public a a(e eVar) {
        ByteBuffer byteBuffer = eVar.c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        m mVar = new m(array, limit);
        String r = mVar.r();
        String r2 = mVar.r();
        long z = mVar.z();
        long C = w.C(mVar.z(), 1000000, z);
        return new a(new a(r, r2, w.C(mVar.z(), 1000, z), mVar.z(), Arrays.copyOfRange(array, mVar.c(), limit), C));
    }
}
