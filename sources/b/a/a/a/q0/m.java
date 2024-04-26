package b.a.a.a.q0;

import b.a.a.a.q0.o;

public final class m extends o.a {

    /* renamed from: b  reason: collision with root package name */
    private final String f701b;
    private final r<? super f> c;
    private final int d;
    private final int e;
    private final boolean f;

    public m(String str) {
        this(str, (r<? super f>) null);
    }

    public m(String str, r<? super f> rVar) {
        this(str, rVar, 8000, 8000, false);
    }

    public m(String str, r<? super f> rVar, int i, int i2, boolean z) {
        this.f701b = str;
        this.c = rVar;
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public l c(o.e eVar) {
        return new l(this.f701b, (b.a.a.a.r0.o<String>) null, this.c, this.d, this.e, this.f, eVar);
    }
}
