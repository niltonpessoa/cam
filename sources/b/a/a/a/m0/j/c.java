package b.a.a.a.m0.j;

import b.a.a.a.m0.a;
import b.a.a.a.m0.b;
import b.a.a.a.m0.e;
import b.a.a.a.r0.l;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;
import java.nio.ByteBuffer;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final m f529a = new m();

    /* renamed from: b  reason: collision with root package name */
    private final l f530b = new l();
    private u c;

    public a a(e eVar) {
        u uVar = this.c;
        if (uVar == null || eVar.f != uVar.e()) {
            u uVar2 = new u(eVar.d);
            this.c = uVar2;
            uVar2.a(eVar.d - eVar.f);
        }
        ByteBuffer byteBuffer = eVar.c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f529a.H(array, limit);
        this.f530b.l(array, limit);
        this.f530b.o(39);
        long h = (((long) this.f530b.h(1)) << 32) | ((long) this.f530b.h(32));
        this.f530b.o(20);
        int h2 = this.f530b.h(12);
        int h3 = this.f530b.h(8);
        a.b bVar = null;
        this.f529a.K(14);
        if (h3 == 0) {
            bVar = new e();
        } else if (h3 == 255) {
            bVar = a.a(this.f529a, h2, h);
        } else if (h3 == 4) {
            bVar = f.a(this.f529a);
        } else if (h3 == 5) {
            bVar = d.a(this.f529a, h, this.c);
        } else if (h3 == 6) {
            bVar = g.a(this.f529a, h, this.c);
        }
        if (bVar == null) {
            return new a(new a.b[0]);
        }
        return new a(bVar);
    }
}
