package b.a.a.a;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import b.a.a.a.h0.e;
import b.a.a.a.i0.d;
import b.a.a.a.m0.f;
import b.a.a.a.o0.k;
import b.a.a.a.s0.g;
import b.a.a.a.s0.h;
import b.a.a.a.y;
import b.a.a.a.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@TargetApi(16)
public class f0 implements i, y.d, y.c {

    /* renamed from: a  reason: collision with root package name */
    protected final a0[] f234a;

    /* renamed from: b  reason: collision with root package name */
    private final i f235b;
    private final b c;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<g> d;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<k> e;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<f> f;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<h> g;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<e> h;
    /* access modifiers changed from: private */
    public n i;
    /* access modifiers changed from: private */
    public n j;
    /* access modifiers changed from: private */
    public Surface k;
    private boolean l;
    private SurfaceHolder m;
    private TextureView n;
    /* access modifiers changed from: private */
    public d o;
    /* access modifiers changed from: private */
    public d p;
    /* access modifiers changed from: private */
    public int q;

    private final class b implements h, e, k, f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        private b() {
        }

        public void a(int i, int i2, int i3, float f) {
            Iterator it = f0.this.d.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(i, i2, i3, f);
            }
            Iterator it2 = f0.this.g.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).a(i, i2, i3, f);
            }
        }

        public void b(int i) {
            int unused = f0.this.q = i;
            Iterator it = f0.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(i);
            }
        }

        public void c(int i, long j, long j2) {
            Iterator it = f0.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c(i, j, j2);
            }
        }

        public void d(d dVar) {
            Iterator it = f0.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(dVar);
            }
            n unused = f0.this.j = null;
            d unused2 = f0.this.p = null;
            int unused3 = f0.this.q = 0;
        }

        public void e(Surface surface) {
            if (f0.this.k == surface) {
                Iterator it = f0.this.d.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).n();
                }
            }
            Iterator it2 = f0.this.g.iterator();
            while (it2.hasNext()) {
                ((h) it2.next()).e(surface);
            }
        }

        public void f(d dVar) {
            d unused = f0.this.p = dVar;
            Iterator it = f0.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).f(dVar);
            }
        }

        public void g(d dVar) {
            Iterator it = f0.this.g.iterator();
            while (it.hasNext()) {
                ((h) it.next()).g(dVar);
            }
            n unused = f0.this.i = null;
            d unused2 = f0.this.o = null;
        }

        public void h(String str, long j, long j2) {
            Iterator it = f0.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).h(str, j, j2);
            }
        }

        public void i(String str, long j, long j2) {
            Iterator it = f0.this.g.iterator();
            while (it.hasNext()) {
                ((h) it.next()).i(str, j, j2);
            }
        }

        public void j(b.a.a.a.m0.a aVar) {
            Iterator it = f0.this.f.iterator();
            while (it.hasNext()) {
                ((f) it.next()).j(aVar);
            }
        }

        public void k(int i, long j) {
            Iterator it = f0.this.g.iterator();
            while (it.hasNext()) {
                ((h) it.next()).k(i, j);
            }
        }

        public void l(n nVar) {
            n unused = f0.this.i = nVar;
            Iterator it = f0.this.g.iterator();
            while (it.hasNext()) {
                ((h) it.next()).l(nVar);
            }
        }

        public void m(d dVar) {
            d unused = f0.this.o = dVar;
            Iterator it = f0.this.g.iterator();
            while (it.hasNext()) {
                ((h) it.next()).m(dVar);
            }
        }

        public void n(n nVar) {
            n unused = f0.this.j = nVar;
            Iterator it = f0.this.h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).n(nVar);
            }
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            f0.this.a0(new Surface(surfaceTexture), true);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            f0.this.a0((Surface) null, true);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void p(List<b.a.a.a.o0.b> list) {
            Iterator it = f0.this.e.iterator();
            while (it.hasNext()) {
                ((k) it.next()).p(list);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            f0.this.a0(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            f0.this.a0((Surface) null, false);
        }
    }

    protected f0(d0 d0Var, b.a.a.a.p0.g gVar, q qVar) {
        this(d0Var, gVar, qVar, b.a.a.a.r0.b.f716a);
    }

    protected f0(d0 d0Var, b.a.a.a.p0.g gVar, q qVar, b.a.a.a.r0.b bVar) {
        b bVar2 = new b();
        this.c = bVar2;
        this.d = new CopyOnWriteArraySet<>();
        this.e = new CopyOnWriteArraySet<>();
        this.f = new CopyOnWriteArraySet<>();
        this.g = new CopyOnWriteArraySet<>();
        this.h = new CopyOnWriteArraySet<>();
        a0[] a2 = d0Var.a(new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()), bVar2, bVar2, bVar2, bVar2);
        this.f234a = a2;
        b.a.a.a.h0.b bVar3 = b.a.a.a.h0.b.e;
        this.f235b = X(a2, gVar, qVar, bVar);
    }

    private void Y() {
        TextureView textureView = this.n;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.c) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.n.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.n = null;
        }
        SurfaceHolder surfaceHolder = this.m;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.c);
            this.m = null;
        }
    }

    /* access modifiers changed from: private */
    public void a0(Surface surface, boolean z) {
        ArrayList<z> arrayList = new ArrayList<>();
        for (a0 a0Var : this.f234a) {
            if (a0Var.g() == 2) {
                z x = this.f235b.x(a0Var);
                x.m(1);
                x.l(surface);
                x.k();
                arrayList.add(x);
            }
        }
        Surface surface2 = this.k;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (z a2 : arrayList) {
                    a2.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.l) {
                this.k.release();
            }
        }
        this.k = surface;
        this.l = z;
    }

    public void A(long j2) {
        this.f235b.A(j2);
    }

    public int B() {
        return this.f235b.B();
    }

    public void C(TextureView textureView) {
        Y();
        this.n = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.c);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        a0(surface, true);
    }

    public void D(TextureView textureView) {
        if (textureView != null && textureView == this.n) {
            C((TextureView) null);
        }
    }

    public b.a.a.a.p0.f E() {
        return this.f235b.E();
    }

    public int F(int i2) {
        return this.f235b.F(i2);
    }

    public void G(g gVar) {
        this.d.remove(gVar);
    }

    public long H() {
        return this.f235b.H();
    }

    public void I(g gVar) {
        this.d.add(gVar);
    }

    public y.c J() {
        return this;
    }

    public void W(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null && surfaceHolder == this.m) {
            Z((SurfaceHolder) null);
        }
    }

    /* access modifiers changed from: protected */
    public i X(a0[] a0VarArr, b.a.a.a.p0.g gVar, q qVar, b.a.a.a.r0.b bVar) {
        return new k(a0VarArr, gVar, qVar, bVar);
    }

    public void Z(SurfaceHolder surfaceHolder) {
        Y();
        this.m = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.c);
            Surface surface2 = surfaceHolder.getSurface();
            if (surface2 != null && surface2.isValid()) {
                surface = surface2;
            }
        }
        a0(surface, false);
    }

    public void a() {
        this.f235b.a();
        Y();
        Surface surface = this.k;
        if (surface != null) {
            if (this.l) {
                surface.release();
            }
            this.k = null;
        }
    }

    public void b(b.a.a.a.n0.f fVar, boolean z, boolean z2) {
        this.f235b.b(fVar, z, z2);
    }

    public w c() {
        return this.f235b.c();
    }

    public void d(int i2) {
        this.f235b.d(i2);
    }

    public void e(boolean z) {
        this.f235b.e(z);
    }

    public y.d f() {
        return this;
    }

    public boolean g() {
        return this.f235b.g();
    }

    public int h() {
        return this.f235b.h();
    }

    public void i(y.b bVar) {
        this.f235b.i(bVar);
    }

    public long j() {
        return this.f235b.j();
    }

    public void k(SurfaceView surfaceView) {
        Z(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void l(SurfaceView surfaceView) {
        W(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void m(int i2, long j2) {
        this.f235b.m(i2, j2);
    }

    public int n() {
        return this.f235b.n();
    }

    public void o(k kVar) {
        this.e.add(kVar);
    }

    public long p() {
        return this.f235b.p();
    }

    public boolean q() {
        return this.f235b.q();
    }

    public void r(k kVar) {
        this.e.remove(kVar);
    }

    public int s() {
        return this.f235b.s();
    }

    public long t() {
        return this.f235b.t();
    }

    public void u(boolean z) {
        this.f235b.u(z);
    }

    public g0 v() {
        return this.f235b.v();
    }

    public int w() {
        return this.f235b.w();
    }

    public z x(z.b bVar) {
        return this.f235b.x(bVar);
    }

    public boolean y() {
        return this.f235b.y();
    }

    public void z(y.b bVar) {
        this.f235b.z(bVar);
    }
}
