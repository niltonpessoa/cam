package b.a.a.a.l0;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import b.a.a.a.h;
import b.a.a.a.i0.d;
import b.a.a.a.j0.c;
import b.a.a.a.j0.e;
import b.a.a.a.l0.d;
import b.a.a.a.n;
import b.a.a.a.o;
import b.a.a.a.r0.k;
import b.a.a.a.r0.v;
import b.a.a.a.r0.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class b extends b.a.a.a.a {
    private static final byte[] V = w.l("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private ByteBuffer[] E;
    private ByteBuffer[] F;
    private long G;
    private int H;
    private int I;
    private ByteBuffer J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    protected d U;
    private final c i;
    private final c<e> j;
    private final boolean k;
    private final b.a.a.a.i0.e l;
    private final b.a.a.a.i0.e m;
    private final o n;
    private final List<Long> o;
    private final MediaCodec.BufferInfo p;
    private n q;
    private b.a.a.a.j0.b<e> r;
    private b.a.a.a.j0.b<e> s;
    private MediaCodec t;
    private a u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public static class a extends Exception {
        public a(n nVar, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + nVar, th);
            String str = nVar.f;
            a(i);
        }

        public a(n nVar, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + nVar, th);
            String str2 = nVar.f;
            if (w.f743a >= 21) {
                b(th);
            }
        }

        private static String a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        @TargetApi(21)
        private static String b(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public b(int i2, c cVar, c<e> cVar2, boolean z2) {
        super(i2);
        b.a.a.a.r0.a.f(w.f743a >= 16);
        b.a.a.a.r0.a.e(cVar);
        this.i = cVar;
        this.j = cVar2;
        this.k = z2;
        this.l = new b.a.a.a.i0.e(0);
        this.m = b.a.a.a.i0.e.r();
        this.n = new o();
        this.o = new ArrayList();
        this.p = new MediaCodec.BufferInfo();
        this.M = 0;
        this.N = 0;
    }

    private void B0(a aVar) {
        throw h.a(aVar, A());
    }

    private int M(String str) {
        int i2 = w.f743a;
        if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = w.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i2 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = w.f744b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean N(String str, n nVar) {
        return w.f743a < 21 && nVar.h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean O(String str) {
        int i2 = w.f743a;
        return (i2 <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (i2 <= 19 && "hb2000".equals(w.f744b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
    }

    private static boolean P(String str) {
        return w.f743a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean Q(String str) {
        return w.f743a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
    }

    private static boolean R(String str) {
        int i2 = w.f743a;
        return i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i2 == 19 && w.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean S(String str, n nVar) {
        return w.f743a <= 18 && nVar.r == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    @TargetApi(23)
    private static void U(MediaFormat mediaFormat) {
        mediaFormat.setInteger("priority", 0);
    }

    private boolean V(long j2, long j3) {
        boolean z2;
        int i2;
        if (!h0()) {
            if (!this.A || !this.P) {
                i2 = this.t.dequeueOutputBuffer(this.p, c0());
            } else {
                try {
                    i2 = this.t.dequeueOutputBuffer(this.p, c0());
                } catch (IllegalStateException unused) {
                    o0();
                    if (this.R) {
                        s0();
                    }
                    return false;
                }
            }
            if (i2 >= 0) {
                if (this.D) {
                    this.D = false;
                    this.t.releaseOutputBuffer(i2, false);
                    return true;
                } else if ((this.p.flags & 4) != 0) {
                    o0();
                    return false;
                } else {
                    this.I = i2;
                    ByteBuffer g0 = g0(i2);
                    this.J = g0;
                    if (g0 != null) {
                        g0.position(this.p.offset);
                        ByteBuffer byteBuffer = this.J;
                        MediaCodec.BufferInfo bufferInfo = this.p;
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    }
                    this.K = y0(this.p.presentationTimeUs);
                }
            } else if (i2 == -2) {
                r0();
                return true;
            } else if (i2 == -3) {
                q0();
                return true;
            } else {
                if (this.y && (this.Q || this.N == 2)) {
                    o0();
                }
                return false;
            }
        }
        if (!this.A || !this.P) {
            MediaCodec mediaCodec = this.t;
            ByteBuffer byteBuffer2 = this.J;
            int i3 = this.I;
            MediaCodec.BufferInfo bufferInfo2 = this.p;
            z2 = p0(j2, j3, mediaCodec, byteBuffer2, i3, bufferInfo2.flags, bufferInfo2.presentationTimeUs, this.K);
        } else {
            try {
                MediaCodec mediaCodec2 = this.t;
                ByteBuffer byteBuffer3 = this.J;
                int i4 = this.I;
                MediaCodec.BufferInfo bufferInfo3 = this.p;
                z2 = p0(j2, j3, mediaCodec2, byteBuffer3, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.K);
            } catch (IllegalStateException unused2) {
                o0();
                if (this.R) {
                    s0();
                }
                return false;
            }
        }
        if (!z2) {
            return false;
        }
        m0(this.p.presentationTimeUs);
        w0();
        return true;
    }

    private boolean W() {
        int i2;
        int i3;
        MediaCodec mediaCodec = this.t;
        if (mediaCodec == null || this.N == 2 || this.Q) {
            return false;
        }
        if (this.H < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.H = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.l.c = e0(dequeueInputBuffer);
            this.l.f();
        }
        if (this.N == 1) {
            if (!this.y) {
                this.P = true;
                this.t.queueInputBuffer(this.H, 0, 0, 0, 4);
                v0();
            }
            this.N = 2;
            return false;
        } else if (this.C) {
            this.C = false;
            ByteBuffer byteBuffer = this.l.c;
            byte[] bArr = V;
            byteBuffer.put(bArr);
            this.t.queueInputBuffer(this.H, 0, bArr.length, 0, 0);
            v0();
            this.O = true;
            return true;
        } else {
            if (this.S) {
                i3 = -4;
                i2 = 0;
            } else {
                if (this.M == 1) {
                    for (int i4 = 0; i4 < this.q.h.size(); i4++) {
                        this.l.c.put(this.q.h.get(i4));
                    }
                    this.M = 2;
                }
                i2 = this.l.c.position();
                i3 = I(this.n, this.l, false);
            }
            if (i3 == -3) {
                return false;
            }
            if (i3 == -5) {
                if (this.M == 2) {
                    this.l.f();
                    this.M = 1;
                }
                k0(this.n.f593a);
                return true;
            } else if (this.l.j()) {
                if (this.M == 2) {
                    this.l.f();
                    this.M = 1;
                }
                this.Q = true;
                if (!this.O) {
                    o0();
                    return false;
                }
                try {
                    if (!this.y) {
                        this.P = true;
                        this.t.queueInputBuffer(this.H, 0, 0, 0, 4);
                        v0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw h.a(e, A());
                }
            } else if (!this.T || this.l.k()) {
                this.T = false;
                boolean p2 = this.l.p();
                boolean z0 = z0(p2);
                this.S = z0;
                if (z0) {
                    return false;
                }
                if (this.w && !p2) {
                    k.b(this.l.c);
                    if (this.l.c.position() == 0) {
                        return true;
                    }
                    this.w = false;
                }
                try {
                    b.a.a.a.i0.e eVar = this.l;
                    long j2 = eVar.d;
                    if (eVar.i()) {
                        this.o.add(Long.valueOf(j2));
                    }
                    this.l.o();
                    n0(this.l);
                    if (p2) {
                        this.t.queueSecureInputBuffer(this.H, 0, d0(this.l, i2), j2, 0);
                    } else {
                        this.t.queueInputBuffer(this.H, 0, this.l.c.limit(), j2, 0);
                    }
                    v0();
                    this.O = true;
                    this.M = 0;
                    this.U.c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw h.a(e2, A());
                }
            } else {
                this.l.f();
                if (this.M == 2) {
                    this.M = 1;
                }
                return true;
            }
        }
    }

    private void Z() {
        if (w.f743a < 21) {
            this.E = this.t.getInputBuffers();
            this.F = this.t.getOutputBuffers();
        }
    }

    private static MediaCodec.CryptoInfo d0(b.a.a.a.i0.e eVar, int i2) {
        MediaCodec.CryptoInfo a2 = eVar.f296b.a();
        if (i2 == 0) {
            return a2;
        }
        if (a2.numBytesOfClearData == null) {
            a2.numBytesOfClearData = new int[1];
        }
        int[] iArr = a2.numBytesOfClearData;
        iArr[0] = iArr[0] + i2;
        return a2;
    }

    private ByteBuffer e0(int i2) {
        return w.f743a >= 21 ? this.t.getInputBuffer(i2) : this.E[i2];
    }

    private ByteBuffer g0(int i2) {
        return w.f743a >= 21 ? this.t.getOutputBuffer(i2) : this.F[i2];
    }

    private boolean h0() {
        return this.I >= 0;
    }

    private void o0() {
        if (this.N == 2) {
            s0();
            i0();
            return;
        }
        this.R = true;
        t0();
    }

    private void q0() {
        if (w.f743a < 21) {
            this.F = this.t.getOutputBuffers();
        }
    }

    private void r0() {
        MediaFormat outputFormat = this.t.getOutputFormat();
        if (this.v != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.D = true;
            return;
        }
        if (this.B) {
            outputFormat.setInteger("channel-count", 1);
        }
        l0(this.t, outputFormat);
    }

    private void u0() {
        if (w.f743a < 21) {
            this.E = null;
            this.F = null;
        }
    }

    private void v0() {
        this.H = -1;
        this.l.c = null;
    }

    private void w0() {
        this.I = -1;
        this.J = null;
    }

    private boolean y0(long j2) {
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.o.get(i2).longValue() == j2) {
                this.o.remove(i2);
                return true;
            }
        }
        return false;
    }

    private boolean z0(boolean z2) {
        b.a.a.a.j0.b<e> bVar = this.r;
        if (bVar == null || (!z2 && this.k)) {
            return false;
        }
        int d = bVar.d();
        if (d != 1) {
            return d != 4;
        }
        throw h.a(this.r.b(), A());
    }

    /* access modifiers changed from: protected */
    public abstract int A0(c cVar, c<e> cVar2, n nVar);

    /* access modifiers changed from: protected */
    public void C() {
        this.q = null;
        try {
            s0();
            try {
                b.a.a.a.j0.b<e> bVar = this.r;
                if (bVar != null) {
                    this.j.c(bVar);
                }
                try {
                    b.a.a.a.j0.b<e> bVar2 = this.s;
                    if (!(bVar2 == null || bVar2 == this.r)) {
                        this.j.c(bVar2);
                    }
                } finally {
                    this.r = null;
                    this.s = null;
                }
            } catch (Throwable th) {
                b.a.a.a.j0.b<e> bVar3 = this.s;
                if (!(bVar3 == null || bVar3 == this.r)) {
                    this.j.c(bVar3);
                }
                throw th;
            } finally {
                this.r = null;
                this.s = null;
            }
        } catch (Throwable th2) {
            try {
                b.a.a.a.j0.b<e> bVar4 = this.s;
                if (!(bVar4 == null || bVar4 == this.r)) {
                    this.j.c(bVar4);
                }
                throw th2;
            } finally {
                this.r = null;
                this.s = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void D(boolean z2) {
        this.U = new d();
    }

    /* access modifiers changed from: protected */
    public void E(long j2, boolean z2) {
        this.Q = false;
        this.R = false;
        if (this.t != null) {
            X();
        }
    }

    /* access modifiers changed from: protected */
    public void F() {
    }

    /* access modifiers changed from: protected */
    public void G() {
    }

    /* access modifiers changed from: protected */
    public boolean L(MediaCodec mediaCodec, boolean z2, n nVar, n nVar2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void T(a aVar, MediaCodec mediaCodec, n nVar, MediaCrypto mediaCrypto);

    /* access modifiers changed from: protected */
    public void X() {
        this.G = -9223372036854775807L;
        v0();
        w0();
        this.T = true;
        this.S = false;
        this.K = false;
        this.o.clear();
        this.C = false;
        this.D = false;
        if (this.x || ((this.z && this.P) || this.N != 0)) {
            s0();
            i0();
        } else {
            this.t.flush();
            this.O = false;
        }
        if (this.L && this.q != null) {
            this.M = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final MediaCodec Y() {
        return this.t;
    }

    public final int a(n nVar) {
        try {
            return A0(this.i, this.j, nVar);
        } catch (d.c e) {
            throw h.a(e, A());
        }
    }

    /* access modifiers changed from: protected */
    public final a a0() {
        return this.u;
    }

    public boolean b() {
        return this.R;
    }

    /* access modifiers changed from: protected */
    public a b0(c cVar, n nVar, boolean z2) {
        return cVar.b(nVar.f, z2);
    }

    /* access modifiers changed from: protected */
    public long c0() {
        return 0;
    }

    public boolean e() {
        return this.q != null && !this.S && (B() || h0() || (this.G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.G));
    }

    /* access modifiers changed from: protected */
    public final MediaFormat f0(n nVar) {
        MediaFormat r2 = nVar.r();
        if (w.f743a >= 23) {
            U(r2);
        }
        return r2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[SYNTHETIC, Splitter:B:15:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i0() {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.t
            if (r0 != 0) goto L_0x0153
            b.a.a.a.n r0 = r11.q
            if (r0 != 0) goto L_0x000a
            goto L_0x0153
        L_0x000a:
            b.a.a.a.j0.b<b.a.a.a.j0.e> r1 = r11.s
            r11.r = r1
            java.lang.String r0 = r0.f
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002f
            b.a.a.a.j0.d r1 = r1.a()
            b.a.a.a.j0.e r1 = (b.a.a.a.j0.e) r1
            if (r1 != 0) goto L_0x0026
            b.a.a.a.j0.b<b.a.a.a.j0.e> r1 = r11.r
            b.a.a.a.j0.b$a r1 = r1.b()
            if (r1 == 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            return
        L_0x0026:
            android.media.MediaCrypto r4 = r1.a()
            boolean r1 = r1.b(r0)
            goto L_0x0031
        L_0x002f:
            r4 = r3
            r1 = 0
        L_0x0031:
            b.a.a.a.l0.a r5 = r11.u
            if (r5 != 0) goto L_0x0098
            b.a.a.a.l0.c r5 = r11.i     // Catch:{ c -> 0x0089 }
            b.a.a.a.n r6 = r11.q     // Catch:{ c -> 0x0089 }
            b.a.a.a.l0.a r5 = r11.b0(r5, r6, r1)     // Catch:{ c -> 0x0089 }
            r11.u = r5     // Catch:{ c -> 0x0089 }
            if (r5 != 0) goto L_0x0076
            if (r1 == 0) goto L_0x0076
            b.a.a.a.l0.c r5 = r11.i     // Catch:{ c -> 0x0089 }
            b.a.a.a.n r6 = r11.q     // Catch:{ c -> 0x0089 }
            b.a.a.a.l0.a r2 = r11.b0(r5, r6, r2)     // Catch:{ c -> 0x0089 }
            r11.u = r2     // Catch:{ c -> 0x0089 }
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = "MediaCodecRenderer"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ c -> 0x0089 }
            r5.<init>()     // Catch:{ c -> 0x0089 }
            java.lang.String r6 = "Drm session requires secure decoder for "
            r5.append(r6)     // Catch:{ c -> 0x0089 }
            r5.append(r0)     // Catch:{ c -> 0x0089 }
            java.lang.String r0 = ", but no secure decoder available. Trying to proceed with "
            r5.append(r0)     // Catch:{ c -> 0x0089 }
            b.a.a.a.l0.a r0 = r11.u     // Catch:{ c -> 0x0089 }
            java.lang.String r0 = r0.f498a     // Catch:{ c -> 0x0089 }
            r5.append(r0)     // Catch:{ c -> 0x0089 }
            java.lang.String r0 = "."
            r5.append(r0)     // Catch:{ c -> 0x0089 }
            java.lang.String r0 = r5.toString()     // Catch:{ c -> 0x0089 }
            android.util.Log.w(r2, r0)     // Catch:{ c -> 0x0089 }
        L_0x0076:
            b.a.a.a.l0.a r0 = r11.u
            if (r0 == 0) goto L_0x007b
            goto L_0x0098
        L_0x007b:
            b.a.a.a.l0.b$a r0 = new b.a.a.a.l0.b$a
            b.a.a.a.n r2 = r11.q
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((b.a.a.a.n) r2, (java.lang.Throwable) r3, (boolean) r1, (int) r4)
            r11.B0(r0)
            throw r3
        L_0x0089:
            r0 = move-exception
            b.a.a.a.l0.b$a r2 = new b.a.a.a.l0.b$a
            b.a.a.a.n r4 = r11.q
            r5 = -49998(0xffffffffffff3cb2, float:NaN)
            r2.<init>((b.a.a.a.n) r4, (java.lang.Throwable) r0, (boolean) r1, (int) r5)
            r11.B0(r2)
            throw r3
        L_0x0098:
            b.a.a.a.l0.a r0 = r11.u
            boolean r0 = r11.x0(r0)
            if (r0 != 0) goto L_0x00a1
            return
        L_0x00a1:
            b.a.a.a.l0.a r0 = r11.u
            java.lang.String r0 = r0.f498a
            int r2 = r11.M(r0)
            r11.v = r2
            b.a.a.a.n r2 = r11.q
            boolean r2 = N(r0, r2)
            r11.w = r2
            boolean r2 = R(r0)
            r11.x = r2
            boolean r2 = Q(r0)
            r11.y = r2
            boolean r2 = O(r0)
            r11.z = r2
            boolean r2 = P(r0)
            r11.A = r2
            b.a.a.a.n r2 = r11.q
            boolean r2 = S(r0, r2)
            r11.B = r2
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0147 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r2.<init>()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r7 = "createCodec:"
            r2.append(r7)     // Catch:{ Exception -> 0x0147 }
            r2.append(r0)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0147 }
            b.a.a.a.r0.v.a(r2)     // Catch:{ Exception -> 0x0147 }
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0147 }
            r11.t = r2     // Catch:{ Exception -> 0x0147 }
            b.a.a.a.r0.v.c()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r2 = "configureCodec"
            b.a.a.a.r0.v.a(r2)     // Catch:{ Exception -> 0x0147 }
            b.a.a.a.l0.a r2 = r11.u     // Catch:{ Exception -> 0x0147 }
            android.media.MediaCodec r7 = r11.t     // Catch:{ Exception -> 0x0147 }
            b.a.a.a.n r8 = r11.q     // Catch:{ Exception -> 0x0147 }
            r11.T(r2, r7, r8, r4)     // Catch:{ Exception -> 0x0147 }
            b.a.a.a.r0.v.c()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r2 = "startCodec"
            b.a.a.a.r0.v.a(r2)     // Catch:{ Exception -> 0x0147 }
            android.media.MediaCodec r2 = r11.t     // Catch:{ Exception -> 0x0147 }
            r2.start()     // Catch:{ Exception -> 0x0147 }
            b.a.a.a.r0.v.c()     // Catch:{ Exception -> 0x0147 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0147 }
            long r9 = r7 - r5
            r5 = r11
            r6 = r0
            r5.j0(r6, r7, r9)     // Catch:{ Exception -> 0x0147 }
            r11.Z()     // Catch:{ Exception -> 0x0147 }
            int r0 = r11.d()
            r1 = 2
            if (r0 != r1) goto L_0x012f
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x0134
        L_0x012f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0134:
            r11.G = r0
            r11.v0()
            r11.w0()
            r0 = 1
            r11.T = r0
            b.a.a.a.i0.d r1 = r11.U
            int r2 = r1.f294a
            int r2 = r2 + r0
            r1.f294a = r2
            return
        L_0x0147:
            r2 = move-exception
            b.a.a.a.l0.b$a r4 = new b.a.a.a.l0.b$a
            b.a.a.a.n r5 = r11.q
            r4.<init>((b.a.a.a.n) r5, (java.lang.Throwable) r2, (boolean) r1, (java.lang.String) r0)
            r11.B0(r4)
            throw r3
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l0.b.i0():void");
    }

    /* access modifiers changed from: protected */
    public abstract void j0(String str, long j2, long j3);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r5.k == r0.k) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k0(b.a.a.a.n r5) {
        /*
            r4 = this;
            b.a.a.a.n r0 = r4.q
            r4.q = r5
            b.a.a.a.j0.a r5 = r5.i
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x000d
        L_0x000b:
            b.a.a.a.j0.a r2 = r0.i
        L_0x000d:
            boolean r5 = b.a.a.a.r0.w.b(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0049
            b.a.a.a.n r5 = r4.q
            b.a.a.a.j0.a r5 = r5.i
            if (r5 == 0) goto L_0x0047
            b.a.a.a.j0.c<b.a.a.a.j0.e> r5 = r4.j
            if (r5 == 0) goto L_0x0037
            android.os.Looper r1 = android.os.Looper.myLooper()
            b.a.a.a.n r3 = r4.q
            b.a.a.a.j0.a r3 = r3.i
            b.a.a.a.j0.b r5 = r5.b(r1, r3)
            r4.s = r5
            b.a.a.a.j0.b<b.a.a.a.j0.e> r1 = r4.r
            if (r5 != r1) goto L_0x0049
            b.a.a.a.j0.c<b.a.a.a.j0.e> r1 = r4.j
            r1.c(r5)
            goto L_0x0049
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.A()
            b.a.a.a.h r5 = b.a.a.a.h.a(r5, r0)
            throw r5
        L_0x0047:
            r4.s = r1
        L_0x0049:
            b.a.a.a.j0.b<b.a.a.a.j0.e> r5 = r4.s
            b.a.a.a.j0.b<b.a.a.a.j0.e> r1 = r4.r
            if (r5 != r1) goto L_0x007d
            android.media.MediaCodec r5 = r4.t
            if (r5 == 0) goto L_0x007d
            b.a.a.a.l0.a r1 = r4.u
            boolean r1 = r1.f499b
            b.a.a.a.n r3 = r4.q
            boolean r5 = r4.L(r5, r1, r0, r3)
            if (r5 == 0) goto L_0x007d
            r4.L = r2
            r4.M = r2
            int r5 = r4.v
            r1 = 2
            if (r5 == r1) goto L_0x007a
            if (r5 != r2) goto L_0x0079
            b.a.a.a.n r5 = r4.q
            int r1 = r5.j
            int r3 = r0.j
            if (r1 != r3) goto L_0x0079
            int r5 = r5.k
            int r0 = r0.k
            if (r5 != r0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            r4.C = r2
            goto L_0x008a
        L_0x007d:
            boolean r5 = r4.O
            if (r5 == 0) goto L_0x0084
            r4.N = r2
            goto L_0x008a
        L_0x0084:
            r4.s0()
            r4.i0()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l0.b.k0(b.a.a.a.n):void");
    }

    /* access modifiers changed from: protected */
    public abstract void l0(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public void m0(long j2) {
    }

    /* access modifiers changed from: protected */
    public abstract void n0(b.a.a.a.i0.e eVar);

    /* access modifiers changed from: protected */
    public abstract boolean p0(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z2);

    public final int s() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void s0() {
        this.G = -9223372036854775807L;
        v0();
        w0();
        this.S = false;
        this.K = false;
        this.o.clear();
        u0();
        this.u = null;
        this.L = false;
        this.O = false;
        this.w = false;
        this.x = false;
        this.v = 0;
        this.y = false;
        this.z = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.P = false;
        this.M = 0;
        this.N = 0;
        MediaCodec mediaCodec = this.t;
        if (mediaCodec != null) {
            this.U.f295b++;
            try {
                mediaCodec.stop();
                try {
                    this.t.release();
                    this.t = null;
                    b.a.a.a.j0.b<e> bVar = this.r;
                    if (bVar != null && this.s != bVar) {
                        try {
                            this.j.c(bVar);
                        } finally {
                            this.r = null;
                        }
                    }
                } catch (Throwable th) {
                    this.t = null;
                    b.a.a.a.j0.b<e> bVar2 = this.r;
                    if (!(bVar2 == null || this.s == bVar2)) {
                        this.j.c(bVar2);
                    }
                    throw th;
                } finally {
                    this.r = null;
                }
            } catch (Throwable th2) {
                this.t = null;
                b.a.a.a.j0.b<e> bVar3 = this.r;
                if (!(bVar3 == null || this.s == bVar3)) {
                    try {
                        this.j.c(bVar3);
                    } finally {
                        this.r = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    public void t(long j2, long j3) {
        if (this.R) {
            t0();
            return;
        }
        if (this.q == null) {
            this.m.f();
            int I2 = I(this.n, this.m, true);
            if (I2 == -5) {
                k0(this.n.f593a);
            } else if (I2 == -4) {
                b.a.a.a.r0.a.f(this.m.j());
                this.Q = true;
                o0();
                return;
            } else {
                return;
            }
        }
        i0();
        if (this.t != null) {
            v.a("drainAndFeed");
            do {
            } while (V(j2, j3));
            do {
            } while (W());
            v.c();
        } else {
            this.U.d += J(j2);
            this.m.f();
            int I3 = I(this.n, this.m, false);
            if (I3 == -5) {
                k0(this.n.f593a);
            } else if (I3 == -4) {
                b.a.a.a.r0.a.f(this.m.j());
                this.Q = true;
                o0();
            }
        }
        this.U.a();
    }

    /* access modifiers changed from: protected */
    public void t0() {
    }

    /* access modifiers changed from: protected */
    public boolean x0(a aVar) {
        return true;
    }
}
