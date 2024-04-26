package b.a.a.a.o0;

import b.a.a.a.i0.g;
import java.nio.ByteBuffer;

public abstract class c extends g<i, j, g> implements f {
    protected c(String str) {
        super(new i[2], new j[2]);
        v(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final g k(i iVar, j jVar, boolean z) {
        try {
            ByteBuffer byteBuffer = iVar.c;
            j jVar2 = jVar;
            jVar2.n(iVar.d, z(byteBuffer.array(), byteBuffer.limit(), z), iVar.f);
            jVar.g(Integer.MIN_VALUE);
            return null;
        } catch (g e) {
            return e;
        }
    }

    /* access modifiers changed from: protected */
    public final void B(j jVar) {
        super.s(jVar);
    }

    public void b(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final i h() {
        return new i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final j i() {
        return new d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final g j(Throwable th) {
        return new g("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    public abstract e z(byte[] bArr, int i, boolean z);
}
