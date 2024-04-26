package b.a.a.a.q0;

import android.content.Context;
import b.a.a.a.q0.f;

public final class k implements f.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f697a;

    /* renamed from: b  reason: collision with root package name */
    private final r<? super f> f698b;
    private final f.a c;

    public k(Context context, r<? super f> rVar, f.a aVar) {
        this.f697a = context.getApplicationContext();
        this.f698b = rVar;
        this.c = aVar;
    }

    public k(Context context, String str) {
        this(context, str, (r<? super f>) null);
    }

    public k(Context context, String str, r<? super f> rVar) {
        this(context, rVar, (f.a) new m(str, rVar));
    }

    /* renamed from: b */
    public j a() {
        return new j(this.f697a, this.f698b, this.c.a());
    }
}
