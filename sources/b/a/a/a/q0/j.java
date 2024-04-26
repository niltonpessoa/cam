package b.a.a.a.q0;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import b.a.a.a.r0.a;
import b.a.a.a.r0.w;

public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f695a;

    /* renamed from: b  reason: collision with root package name */
    private final r<? super f> f696b;
    private final f c;
    private f d;
    private f e;
    private f f;
    private f g;
    private f h;
    private f i;
    private f j;

    public j(Context context, r<? super f> rVar, f fVar) {
        this.f695a = context.getApplicationContext();
        this.f696b = rVar;
        a.e(fVar);
        this.c = fVar;
    }

    private f d() {
        if (this.e == null) {
            this.e = new c(this.f695a, this.f696b);
        }
        return this.e;
    }

    private f e() {
        if (this.f == null) {
            this.f = new d(this.f695a, this.f696b);
        }
        return this.f;
    }

    private f f() {
        if (this.h == null) {
            this.h = new e();
        }
        return this.h;
    }

    private f g() {
        if (this.d == null) {
            this.d = new n(this.f696b);
        }
        return this.d;
    }

    private f h() {
        if (this.i == null) {
            this.i = new q(this.f695a, this.f696b);
        }
        return this.i;
    }

    private f i() {
        if (this.g == null) {
            try {
                this.g = (f) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    public int a(byte[] bArr, int i2, int i3) {
        return this.j.a(bArr, i2, i3);
    }

    public long b(h hVar) {
        f fVar;
        a.f(this.j == null);
        String scheme = hVar.f691a.getScheme();
        if (w.y(hVar.f691a)) {
            if (!hVar.f691a.getPath().startsWith("/android_asset/")) {
                fVar = g();
                this.j = fVar;
                return this.j.b(hVar);
            }
        } else if (!"asset".equals(scheme)) {
            fVar = "content".equals(scheme) ? e() : "rtmp".equals(scheme) ? i() : "data".equals(scheme) ? f() : "rawresource".equals(scheme) ? h() : this.c;
            this.j = fVar;
            return this.j.b(hVar);
        }
        fVar = d();
        this.j = fVar;
        return this.j.b(hVar);
    }

    public Uri c() {
        f fVar = this.j;
        if (fVar == null) {
            return null;
        }
        return fVar.c();
    }

    public void close() {
        f fVar = this.j;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.j = null;
            }
        }
    }
}
