package b.a.a.a.s0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import b.a.a.a.l0.d;
import b.a.a.a.n;
import b.a.a.a.r0.j;
import b.a.a.a.r0.v;
import b.a.a.a.r0.w;
import b.a.a.a.s0.h;
import java.nio.ByteBuffer;

@TargetApi(16)
public class e extends b.a.a.a.l0.b {
    private static final int[] F0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private boolean A0;
    private int B0;
    c C0;
    private long D0 = -9223372036854775807L;
    private int E0;
    private final Context W;
    private final f X;
    private final h.a Y;
    private final long Z;
    private final int a0;
    private final boolean b0 = H0();
    private final long[] c0 = new long[10];
    private n[] d0;
    private b e0;
    private boolean f0;
    private Surface g0;
    private Surface h0;
    private int i0 = 1;
    private boolean j0;
    private long k0 = -9223372036854775807L;
    private long l0;
    private int m0;
    private int n0;
    private int o0;
    private long p0;
    private int q0;
    private float r0 = -1.0f;
    private int s0 = -1;
    private int t0 = -1;
    private int u0;
    private float v0 = -1.0f;
    private int w0;
    private int x0;
    private int y0;
    private float z0;

    protected static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f758a;

        /* renamed from: b  reason: collision with root package name */
        public final int f759b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.f758a = i;
            this.f759b = i2;
            this.c = i3;
        }
    }

    @TargetApi(23)
    private final class c implements MediaCodec.OnFrameRenderedListener {
        private c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            e eVar = e.this;
            if (this == eVar.C0) {
                eVar.U0();
            }
        }
    }

    public e(Context context, b.a.a.a.l0.c cVar, long j, b.a.a.a.j0.c<b.a.a.a.j0.e> cVar2, boolean z, Handler handler, h hVar, int i) {
        super(2, cVar, cVar2, z);
        this.Z = j;
        this.a0 = i;
        this.W = context.getApplicationContext();
        this.X = new f(context);
        this.Y = new h.a(handler, hVar);
        E0();
    }

    private static boolean C0(boolean z, n nVar, n nVar2) {
        return nVar.f.equals(nVar2.f) && P0(nVar) == P0(nVar2) && (z || (nVar.j == nVar2.j && nVar.k == nVar2.k));
    }

    private void D0() {
        MediaCodec Y2;
        this.j0 = false;
        if (w.f743a >= 23 && this.A0 && (Y2 = Y()) != null) {
            this.C0 = new c(Y2);
        }
    }

    private void E0() {
        this.w0 = -1;
        this.x0 = -1;
        this.z0 = -1.0f;
        this.y0 = -1;
    }

    private static boolean F0(String str) {
        String str2 = w.f744b;
        if (((!"deb".equals(str2) && !"flo".equals(str2) && !"mido".equals(str2) && !"santoni".equals(str2)) || !"OMX.qcom.video.decoder.avc".equals(str)) && ((!"tcl_eu".equals(str2) && !"SVP-DTV15".equals(str2) && !"BRAVIA_ATV2".equals(str2) && !str2.startsWith("panell_") && !"F3311".equals(str2) && !"M5c".equals(str2) && !"A7010a48".equals(str2)) || !"OMX.MTK.VIDEO.DECODER.AVC".equals(str))) {
            String str3 = w.d;
            return ("ALE-L21".equals(str3) || "CAM-L21".equals(str3)) && "OMX.k3.video.decoder.avc".equals(str);
        }
    }

    @TargetApi(21)
    private static void G0(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private static boolean H0() {
        return w.f743a <= 22 && "foster".equals(w.f744b) && "NVIDIA".equals(w.c);
    }

    private static Point J0(b.a.a.a.l0.a aVar, n nVar) {
        int i = nVar.k;
        int i2 = nVar.j;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = ((float) i) / ((float) i3);
        for (int i4 : F0) {
            int i5 = (int) (((float) i4) * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (w.f743a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point b2 = aVar.b(i6, i4);
                if (aVar.n(b2.x, b2.y, (double) nVar.l)) {
                    return b2;
                }
            } else {
                int e = w.e(i4, 16) * 16;
                int e2 = w.e(i5, 16) * 16;
                if (e * e2 <= d.l()) {
                    int i7 = z ? e2 : e;
                    if (!z) {
                        e = e2;
                    }
                    return new Point(i7, e);
                }
            }
        }
        return null;
    }

    private static int L0(n nVar) {
        if (nVar.g == -1) {
            return M0(nVar.f, nVar.j, nVar.k);
        }
        int size = nVar.h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += nVar.h.get(i2).length;
        }
        return nVar.g + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int M0(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x0083
            if (r7 != r0) goto L_0x0007
            goto L_0x0083
        L_0x0007:
            r5.hashCode()
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x004d;
                case -1662541442: goto L_0x0042;
                case 1187890754: goto L_0x0037;
                case 1331836730: goto L_0x002c;
                case 1599127256: goto L_0x0021;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r5 = -1
            goto L_0x0057
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r5 = 5
            goto L_0x0057
        L_0x0021:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x002a
            goto L_0x0014
        L_0x002a:
            r5 = 4
            goto L_0x0057
        L_0x002c:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r5 = 3
            goto L_0x0057
        L_0x0037:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0040
            goto L_0x0014
        L_0x0040:
            r5 = 2
            goto L_0x0057
        L_0x0042:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x004b
            goto L_0x0014
        L_0x004b:
            r5 = 1
            goto L_0x0057
        L_0x004d:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            r5 = 0
        L_0x0057:
            switch(r5) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0077;
                case 2: goto L_0x007a;
                case 3: goto L_0x005b;
                case 4: goto L_0x007a;
                case 5: goto L_0x0077;
                default: goto L_0x005a;
            }
        L_0x005a:
            return r0
        L_0x005b:
            java.lang.String r5 = b.a.a.a.r0.w.d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0066
            return r0
        L_0x0066:
            r5 = 16
            int r6 = b.a.a.a.r0.w.e(r6, r5)
            int r7 = b.a.a.a.r0.w.e(r7, r5)
            int r6 = r6 * r7
            int r6 = r6 * 16
            int r6 = r6 * 16
            goto L_0x007c
        L_0x0077:
            int r6 = r6 * r7
            goto L_0x007d
        L_0x007a:
            int r6 = r6 * r7
        L_0x007c:
            r2 = 2
        L_0x007d:
            int r6 = r6 * 3
            int r2 = r2 * 2
            int r6 = r6 / r2
            return r6
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.s0.e.M0(java.lang.String, int, int):int");
    }

    private static float O0(n nVar) {
        float f = nVar.n;
        if (f == -1.0f) {
            return 1.0f;
        }
        return f;
    }

    private static int P0(n nVar) {
        int i = nVar.m;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private static boolean Q0(long j) {
        return j < -30000;
    }

    private static boolean R0(long j) {
        return j < -500000;
    }

    private void T0() {
        if (this.m0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.Y.d(this.m0, elapsedRealtime - this.l0);
            this.m0 = 0;
            this.l0 = elapsedRealtime;
        }
    }

    private void V0() {
        int i = this.s0;
        if (i != -1 || this.t0 != -1) {
            if (this.w0 != i || this.x0 != this.t0 || this.y0 != this.u0 || this.z0 != this.v0) {
                this.Y.h(i, this.t0, this.u0, this.v0);
                this.w0 = this.s0;
                this.x0 = this.t0;
                this.y0 = this.u0;
                this.z0 = this.v0;
            }
        }
    }

    private void W0() {
        if (this.j0) {
            this.Y.g(this.g0);
        }
    }

    private void X0() {
        int i = this.w0;
        if (i != -1 || this.x0 != -1) {
            this.Y.h(i, this.x0, this.y0, this.z0);
        }
    }

    private void a1() {
        this.k0 = this.Z > 0 ? SystemClock.elapsedRealtime() + this.Z : -9223372036854775807L;
    }

    @TargetApi(23)
    private static void b1(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private void c1(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.h0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                b.a.a.a.l0.a a02 = a0();
                if (a02 != null && h1(a02)) {
                    surface = c.d(this.W, a02.d);
                    this.h0 = surface;
                }
            }
        }
        if (this.g0 != surface) {
            this.g0 = surface;
            int d = d();
            if (d == 1 || d == 2) {
                MediaCodec Y2 = Y();
                if (w.f743a < 23 || Y2 == null || surface == null || this.f0) {
                    s0();
                    i0();
                } else {
                    b1(Y2, surface);
                }
            }
            if (surface == null || surface == this.h0) {
                E0();
                D0();
                return;
            }
            X0();
            D0();
            if (d == 2) {
                a1();
            }
        } else if (surface != null && surface != this.h0) {
            X0();
            W0();
        }
    }

    private static void d1(MediaCodec mediaCodec, int i) {
        mediaCodec.setVideoScalingMode(i);
    }

    private boolean h1(b.a.a.a.l0.a aVar) {
        return w.f743a >= 23 && !this.A0 && !F0(aVar.f498a) && (!aVar.d || c.c(this.W));
    }

    /* access modifiers changed from: protected */
    public int A0(b.a.a.a.l0.c cVar, b.a.a.a.j0.c<b.a.a.a.j0.e> cVar2, n nVar) {
        boolean z;
        int i;
        int i2;
        String str = nVar.f;
        int i3 = 0;
        if (!j.h(str)) {
            return 0;
        }
        b.a.a.a.j0.a aVar = nVar.i;
        if (aVar != null) {
            z = false;
            for (int i4 = 0; i4 < aVar.d; i4++) {
                z |= aVar.c(i4).e;
            }
        } else {
            z = false;
        }
        b.a.a.a.l0.a b2 = cVar.b(str, z);
        boolean z2 = true;
        if (b2 == null) {
            return (!z || cVar.b(str, false) == null) ? 1 : 2;
        }
        if (!b.a.a.a.a.K(cVar2, aVar)) {
            return 2;
        }
        boolean i5 = b2.i(nVar.c);
        if (i5 && (i = nVar.j) > 0 && (i2 = nVar.k) > 0) {
            if (w.f743a >= 21) {
                i5 = b2.n(i, i2, (double) nVar.l);
            } else {
                if (i * i2 > d.l()) {
                    z2 = false;
                }
                if (!z2) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + nVar.j + "x" + nVar.k + "] [" + w.e + "]");
                }
                i5 = z2;
            }
        }
        int i6 = b2.f499b ? 16 : 8;
        if (b2.c) {
            i3 = 32;
        }
        return (i5 ? 4 : 3) | i6 | i3;
    }

    /* access modifiers changed from: protected */
    public void C() {
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1.0f;
        this.r0 = -1.0f;
        this.D0 = -9223372036854775807L;
        this.E0 = 0;
        E0();
        D0();
        this.X.d();
        this.C0 = null;
        this.A0 = false;
        try {
            super.C();
        } finally {
            this.U.a();
            this.Y.c(this.U);
        }
    }

    /* access modifiers changed from: protected */
    public void D(boolean z) {
        super.D(z);
        int i = z().f227a;
        this.B0 = i;
        this.A0 = i != 0;
        this.Y.e(this.U);
        this.X.e();
    }

    /* access modifiers changed from: protected */
    public void E(long j, boolean z) {
        super.E(j, z);
        D0();
        this.n0 = 0;
        int i = this.E0;
        if (i != 0) {
            this.D0 = this.c0[i - 1];
            this.E0 = 0;
        }
        if (z) {
            a1();
        } else {
            this.k0 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    public void F() {
        super.F();
        this.m0 = 0;
        this.l0 = SystemClock.elapsedRealtime();
        this.p0 = SystemClock.elapsedRealtime() * 1000;
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.k0 = -9223372036854775807L;
        T0();
        super.G();
    }

    /* access modifiers changed from: protected */
    public void H(n[] nVarArr, long j) {
        this.d0 = nVarArr;
        if (this.D0 == -9223372036854775807L) {
            this.D0 = j;
        } else {
            int i = this.E0;
            if (i == this.c0.length) {
                Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.c0[this.E0 - 1]);
            } else {
                this.E0 = i + 1;
            }
            this.c0[this.E0 - 1] = j;
        }
        super.H(nVarArr, j);
    }

    /* access modifiers changed from: protected */
    public void I0(MediaCodec mediaCodec, int i, long j) {
        v.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        v.c();
        j1(1);
    }

    /* access modifiers changed from: protected */
    public b K0(b.a.a.a.l0.a aVar, n nVar, n[] nVarArr) {
        int i = nVar.j;
        int i2 = nVar.k;
        int L0 = L0(nVar);
        if (nVarArr.length == 1) {
            return new b(i, i2, L0);
        }
        boolean z = false;
        for (n nVar2 : nVarArr) {
            if (C0(aVar.f499b, nVar, nVar2)) {
                int i3 = nVar2.j;
                z |= i3 == -1 || nVar2.k == -1;
                i = Math.max(i, i3);
                i2 = Math.max(i2, nVar2.k);
                L0 = Math.max(L0, L0(nVar2));
            }
        }
        if (z) {
            Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point J0 = J0(aVar, nVar);
            if (J0 != null) {
                i = Math.max(i, J0.x);
                i2 = Math.max(i2, J0.y);
                L0 = Math.max(L0, M0(nVar.f, i, i2));
                Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new b(i, i2, L0);
    }

    /* access modifiers changed from: protected */
    public boolean L(MediaCodec mediaCodec, boolean z, n nVar, n nVar2) {
        if (C0(z, nVar, nVar2)) {
            int i = nVar2.j;
            b bVar = this.e0;
            return i <= bVar.f758a && nVar2.k <= bVar.f759b && L0(nVar2) <= this.e0.c;
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat N0(n nVar, b bVar, boolean z, int i) {
        MediaFormat f02 = f0(nVar);
        f02.setInteger("max-width", bVar.f758a);
        f02.setInteger("max-height", bVar.f759b);
        int i2 = bVar.c;
        if (i2 != -1) {
            f02.setInteger("max-input-size", i2);
        }
        if (z) {
            f02.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            G0(f02, i);
        }
        return f02;
    }

    /* access modifiers changed from: protected */
    public boolean S0(MediaCodec mediaCodec, int i, long j, long j2) {
        int J = J(j2);
        if (J == 0) {
            return false;
        }
        this.U.i++;
        j1(this.o0 + J);
        X();
        return true;
    }

    /* access modifiers changed from: protected */
    public void T(b.a.a.a.l0.a aVar, MediaCodec mediaCodec, n nVar, MediaCrypto mediaCrypto) {
        b K0 = K0(aVar, nVar, this.d0);
        this.e0 = K0;
        MediaFormat N0 = N0(nVar, K0, this.b0, this.B0);
        if (this.g0 == null) {
            b.a.a.a.r0.a.f(h1(aVar));
            if (this.h0 == null) {
                this.h0 = c.d(this.W, aVar.d);
            }
            this.g0 = this.h0;
        }
        mediaCodec.configure(N0, this.g0, mediaCrypto, 0);
        if (w.f743a >= 23 && this.A0) {
            this.C0 = new c(mediaCodec);
        }
    }

    /* access modifiers changed from: package-private */
    public void U0() {
        if (!this.j0) {
            this.j0 = true;
            this.Y.g(this.g0);
        }
    }

    /* access modifiers changed from: protected */
    public void X() {
        super.X();
        this.o0 = 0;
    }

    /* access modifiers changed from: protected */
    public void Y0(MediaCodec mediaCodec, int i, long j) {
        V0();
        v.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        v.c();
        this.p0 = SystemClock.elapsedRealtime() * 1000;
        this.U.e++;
        this.n0 = 0;
        U0();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void Z0(MediaCodec mediaCodec, int i, long j, long j2) {
        V0();
        v.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        v.c();
        this.p0 = SystemClock.elapsedRealtime() * 1000;
        this.U.e++;
        this.n0 = 0;
        U0();
    }

    public boolean e() {
        Surface surface;
        if (super.e() && (this.j0 || (((surface = this.h0) != null && this.g0 == surface) || Y() == null || this.A0))) {
            this.k0 = -9223372036854775807L;
            return true;
        } else if (this.k0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.k0) {
                return true;
            }
            this.k0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean e1(long j, long j2) {
        return R0(j);
    }

    /* access modifiers changed from: protected */
    public boolean f1(long j, long j2) {
        return Q0(j);
    }

    /* access modifiers changed from: protected */
    public boolean g1(long j, long j2) {
        return Q0(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    public void i1(MediaCodec mediaCodec, int i, long j) {
        v.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        v.c();
        this.U.f++;
    }

    /* access modifiers changed from: protected */
    public void j0(String str, long j, long j2) {
        this.Y.b(str, j, j2);
        this.f0 = F0(str);
    }

    /* access modifiers changed from: protected */
    public void j1(int i) {
        b.a.a.a.i0.d dVar = this.U;
        dVar.g += i;
        this.m0 += i;
        int i2 = this.n0 + i;
        this.n0 = i2;
        dVar.h = Math.max(i2, dVar.h);
        if (this.m0 >= this.a0) {
            T0();
        }
    }

    /* access modifiers changed from: protected */
    public void k0(n nVar) {
        super.k0(nVar);
        this.Y.f(nVar);
        this.r0 = O0(nVar);
        this.q0 = P0(nVar);
    }

    /* access modifiers changed from: protected */
    public void l0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.s0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.t0 = integer;
        float f = this.r0;
        this.v0 = f;
        if (w.f743a >= 21) {
            int i = this.q0;
            if (i == 90 || i == 270) {
                int i2 = this.s0;
                this.s0 = integer;
                this.t0 = i2;
                this.v0 = 1.0f / f;
            }
        } else {
            this.u0 = this.q0;
        }
        d1(mediaCodec, this.i0);
    }

    /* access modifiers changed from: protected */
    public void m0(long j) {
        this.o0--;
    }

    /* access modifiers changed from: protected */
    public void n0(b.a.a.a.i0.e eVar) {
        this.o0++;
        if (w.f743a < 23 && this.A0) {
            U0();
        }
    }

    /* access modifiers changed from: protected */
    public boolean p0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        long j4;
        long j5 = j2;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j6 = j3;
        while (true) {
            int i4 = this.E0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.c0;
            if (j6 < jArr[0]) {
                break;
            }
            this.D0 = jArr[0];
            int i5 = i4 - 1;
            this.E0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j7 = j6 - this.D0;
        if (z) {
            i1(mediaCodec2, i3, j7);
            return true;
        }
        long j8 = j6 - j;
        if (this.g0 != this.h0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            boolean z2 = d() == 2;
            if (this.j0) {
                long j9 = j7;
                if (z2 && g1(j8, elapsedRealtime - this.p0)) {
                    j4 = j9;
                } else if (!z2) {
                    return false;
                } else {
                    long j10 = j8 - (elapsedRealtime - j5);
                    long nanoTime = System.nanoTime();
                    long b2 = this.X.b(j6, (j10 * 1000) + nanoTime);
                    long j11 = (b2 - nanoTime) / 1000;
                    if (e1(j11, j5) && S0(mediaCodec, i, j9, j)) {
                        return false;
                    }
                    long j12 = j9;
                    if (f1(j11, j5)) {
                        I0(mediaCodec2, i3, j12);
                        return true;
                    } else if (w.f743a >= 21) {
                        if (j11 >= 50000) {
                            return false;
                        }
                        Z0(mediaCodec, i, j12, b2);
                        return true;
                    } else if (j11 >= 30000) {
                        return false;
                    } else {
                        if (j11 > 11000) {
                            try {
                                Thread.sleep((j11 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        Y0(mediaCodec2, i3, j12);
                        return true;
                    }
                }
            } else {
                j4 = j7;
            }
            if (w.f743a >= 21) {
                Z0(mediaCodec, i, j4, System.nanoTime());
                return true;
            }
            Y0(mediaCodec2, i3, j4);
            return true;
        } else if (!Q0(j8)) {
            return false;
        } else {
            i1(mediaCodec2, i3, j7);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void s0() {
        try {
            super.s0();
            this.o0 = 0;
            Surface surface = this.h0;
            if (surface != null) {
                if (this.g0 == surface) {
                    this.g0 = null;
                }
                surface.release();
                this.h0 = null;
            }
        } catch (Throwable th) {
            this.o0 = 0;
            if (this.h0 != null) {
                Surface surface2 = this.g0;
                Surface surface3 = this.h0;
                if (surface2 == surface3) {
                    this.g0 = null;
                }
                surface3.release();
                this.h0 = null;
            }
            throw th;
        }
    }

    public void u(int i, Object obj) {
        if (i == 1) {
            c1((Surface) obj);
        } else if (i == 4) {
            this.i0 = ((Integer) obj).intValue();
            MediaCodec Y2 = Y();
            if (Y2 != null) {
                d1(Y2, this.i0);
            }
        } else {
            super.u(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    public boolean x0(b.a.a.a.l0.a aVar) {
        return this.g0 != null || h1(aVar);
    }
}
