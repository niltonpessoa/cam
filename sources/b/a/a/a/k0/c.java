package b.a.a.a.k0;

import b.a.a.a.k0.p.d;
import b.a.a.a.k0.q.b;
import b.a.a.a.k0.r.e;
import b.a.a.a.k0.r.g;
import b.a.a.a.k0.t.a;
import b.a.a.a.k0.t.q;
import b.a.a.a.k0.t.v;
import java.lang.reflect.Constructor;

public final class c implements h {
    private static final Constructor<? extends e> g;

    /* renamed from: a  reason: collision with root package name */
    private int f314a;

    /* renamed from: b  reason: collision with root package name */
    private int f315b;
    private int c;
    private int d;
    private int e = 1;
    private int f;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(e.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        g = constructor;
    }

    public synchronized e[] a() {
        e[] eVarArr;
        Constructor<? extends e> constructor = g;
        eVarArr = new e[(constructor == null ? 11 : 12)];
        eVarArr[0] = new d(this.f314a);
        eVarArr[1] = new e(this.c);
        eVarArr[2] = new g(this.f315b);
        eVarArr[3] = new b(this.d);
        eVarArr[4] = new b.a.a.a.k0.t.c();
        eVarArr[5] = new a();
        eVarArr[6] = new v(this.e, this.f);
        eVarArr[7] = new b.a.a.a.k0.o.b();
        eVarArr[8] = new b.a.a.a.k0.s.c();
        eVarArr[9] = new q();
        eVarArr[10] = new b.a.a.a.k0.u.a();
        if (constructor != null) {
            try {
                eVarArr[11] = (e) constructor.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        }
        return eVarArr;
    }
}
