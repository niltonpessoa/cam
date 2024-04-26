package b.a.a.a.o0.n;

import b.a.a.a.o0.c;
import b.a.a.a.r0.m;
import java.util.List;

public final class a extends c {
    private final b n;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        m mVar = new m(list.get(0));
        this.n = new b(mVar.D(), mVar.D());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.n.r();
        }
        return new c(this.n.b(bArr, i));
    }
}
