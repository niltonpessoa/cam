package b.a.a.a.h0;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import b.a.a.a.h;
import b.a.a.a.h0.e;
import b.a.a.a.h0.f;
import b.a.a.a.l0.c;
import b.a.a.a.n;
import b.a.a.a.r0.i;
import b.a.a.a.r0.j;
import b.a.a.a.r0.w;
import java.nio.ByteBuffer;

@TargetApi(16)
public class k extends b.a.a.a.l0.b implements i {
    /* access modifiers changed from: private */
    public final e.a W;
    private final f X;
    private boolean Y;
    private boolean Z;
    private MediaFormat a0;
    private int b0;
    private int c0;
    private int d0;
    private int e0;
    private long f0;
    private boolean g0;
    /* access modifiers changed from: private */
    public boolean h0;

    private final class b implements f.c {
        private b() {
        }

        public void a() {
            k.this.H0();
            boolean unused = k.this.h0 = true;
        }

        public void b(int i) {
            k.this.W.b(i);
            k.this.G0(i);
        }

        public void c(int i, long j, long j2) {
            k.this.W.c(i, j, j2);
            k.this.I0(i, j, j2);
        }
    }

    public k(c cVar, b.a.a.a.j0.c<b.a.a.a.j0.e> cVar2, boolean z, Handler handler, e eVar, c cVar3, d... dVarArr) {
        this(cVar, cVar2, z, handler, eVar, new h(cVar3, dVarArr));
    }

    public k(c cVar, b.a.a.a.j0.c<b.a.a.a.j0.e> cVar2, boolean z, Handler handler, e eVar, f fVar) {
        super(1, cVar, cVar2, z);
        this.W = new e.a(handler, eVar);
        this.X = fVar;
        fVar.k(new b());
    }

    private static boolean F0(String str) {
        if (w.f743a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(w.c)) {
            String str2 = w.f744b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private void J0() {
        long i = this.X.i(b());
        if (i != Long.MIN_VALUE) {
            if (!this.h0) {
                i = Math.max(this.f0, i);
            }
            this.f0 = i;
            this.h0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public int A0(c cVar, b.a.a.a.j0.c<b.a.a.a.j0.e> cVar2, n nVar) {
        boolean z;
        int i;
        int i2;
        String str = nVar.f;
        boolean z2 = false;
        if (!j.f(str)) {
            return 0;
        }
        int i3 = w.f743a >= 21 ? 32 : 0;
        boolean K = b.a.a.a.a.K(cVar2, nVar.i);
        int i4 = 4;
        if (K && E0(str) && cVar.a() != null) {
            return i3 | 8 | 4;
        }
        if (("audio/raw".equals(str) && !this.X.o(nVar.t)) || !this.X.o(2)) {
            return 1;
        }
        b.a.a.a.j0.a aVar = nVar.i;
        if (aVar != null) {
            z = false;
            for (int i5 = 0; i5 < aVar.d; i5++) {
                z |= aVar.c(i5).e;
            }
        } else {
            z = false;
        }
        b.a.a.a.l0.a b2 = cVar.b(str, z);
        if (b2 == null) {
            return (!z || cVar.b(str, false) == null) ? 1 : 2;
        }
        if (!K) {
            return 2;
        }
        if (w.f743a < 21 || (((i = nVar.s) == -1 || b2.h(i)) && ((i2 = nVar.r) == -1 || b2.g(i2)))) {
            z2 = true;
        }
        if (!z2) {
            i4 = 3;
        }
        return i3 | 8 | i4;
    }

    /* access modifiers changed from: protected */
    public void C() {
        try {
            this.X.a();
            try {
                super.C();
            } finally {
                this.U.a();
                this.W.e(this.U);
            }
        } catch (Throwable th) {
            super.C();
            throw th;
        } finally {
            this.U.a();
            this.W.e(this.U);
        }
    }

    /* access modifiers changed from: protected */
    public void D(boolean z) {
        super.D(z);
        this.W.f(this.U);
        int i = z().f227a;
        if (i != 0) {
            this.X.t(i);
        } else {
            this.X.j();
        }
    }

    /* access modifiers changed from: protected */
    public void E(long j, boolean z) {
        super.E(j, z);
        this.X.reset();
        this.f0 = j;
        this.g0 = true;
        this.h0 = true;
    }

    /* access modifiers changed from: protected */
    public boolean E0(String str) {
        int a2 = j.a(str);
        return a2 != 0 && this.X.o(a2);
    }

    /* access modifiers changed from: protected */
    public void F() {
        super.F();
        this.X.r();
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.X.h();
        J0();
        super.G();
    }

    /* access modifiers changed from: protected */
    public void G0(int i) {
    }

    /* access modifiers changed from: protected */
    public void H0() {
    }

    /* access modifiers changed from: protected */
    public void I0(int i, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    public void T(b.a.a.a.l0.a aVar, MediaCodec mediaCodec, n nVar, MediaCrypto mediaCrypto) {
        this.Z = F0(aVar.f498a);
        MediaFormat f02 = f0(nVar);
        if (this.Y) {
            this.a0 = f02;
            f02.setString("mime", "audio/raw");
            mediaCodec.configure(this.a0, (Surface) null, mediaCrypto, 0);
            this.a0.setString("mime", nVar.f);
            return;
        }
        mediaCodec.configure(f02, (Surface) null, mediaCrypto, 0);
        this.a0 = null;
    }

    public boolean b() {
        return super.b() && this.X.b();
    }

    /* access modifiers changed from: protected */
    public b.a.a.a.l0.a b0(c cVar, n nVar, boolean z) {
        b.a.a.a.l0.a a2;
        if (!E0(nVar.f) || (a2 = cVar.a()) == null) {
            this.Y = false;
            return super.b0(cVar, nVar, z);
        }
        this.Y = true;
        return a2;
    }

    public b.a.a.a.w c() {
        return this.X.c();
    }

    public boolean e() {
        return this.X.n() || super.e();
    }

    public b.a.a.a.w f(b.a.a.a.w wVar) {
        return this.X.f(wVar);
    }

    /* access modifiers changed from: protected */
    public void j0(String str, long j, long j2) {
        this.W.d(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public void k0(n nVar) {
        super.k0(nVar);
        this.W.g(nVar);
        this.b0 = "audio/raw".equals(nVar.f) ? nVar.t : 2;
        this.c0 = nVar.r;
        int i = nVar.u;
        int i2 = 0;
        if (i == -1) {
            i = 0;
        }
        this.d0 = i;
        int i3 = nVar.v;
        if (i3 != -1) {
            i2 = i3;
        }
        this.e0 = i2;
    }

    /* access modifiers changed from: protected */
    public void l0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.a0;
        if (mediaFormat2 != null) {
            i = j.a(mediaFormat2.getString("mime"));
            mediaFormat = this.a0;
        } else {
            i = this.b0;
        }
        int i3 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.Z || integer != 6 || (i2 = this.c0) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i2];
            for (int i4 = 0; i4 < this.c0; i4++) {
                iArr[i4] = i4;
            }
        }
        try {
            this.X.g(i3, integer, integer2, 0, iArr, this.d0, this.e0);
        } catch (f.a e) {
            throw h.a(e, A());
        }
    }

    /* access modifiers changed from: protected */
    public void n0(b.a.a.a.i0.e eVar) {
        if (this.g0 && !eVar.i()) {
            if (Math.abs(eVar.d - this.f0) > 500000) {
                this.f0 = eVar.d;
            }
            this.g0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean p0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.Y && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.U.f++;
            this.X.p();
            return true;
        } else {
            try {
                if (!this.X.s(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.U.e++;
                return true;
            } catch (f.b | f.d e) {
                throw h.a(e, A());
            }
        }
    }

    public i q() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void t0() {
        try {
            this.X.m();
        } catch (f.d e) {
            throw h.a(e, A());
        }
    }

    public void u(int i, Object obj) {
        if (i == 2) {
            this.X.q(((Float) obj).floatValue());
        } else if (i != 3) {
            super.u(i, obj);
        } else {
            this.X.l((b) obj);
        }
    }

    public long x() {
        if (d() == 2) {
            J0();
        }
        return this.f0;
    }
}
