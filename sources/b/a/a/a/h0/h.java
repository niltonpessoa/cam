package b.a.a.a.h0;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import b.a.a.a.h0.f;
import b.a.a.a.w;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;

public final class h implements f {
    public static boolean l0 = false;
    public static boolean m0 = false;
    private w A;
    private long B;
    private long C;
    private ByteBuffer D;
    private int E;
    private int F;
    private int G;
    private long H;
    private long I;
    private boolean J;
    private long K;
    private Method L;
    private int M;
    private long N;
    private long O;
    private int P;
    private long Q;
    private long R;
    private int S;
    private int T;
    private long U;
    private long V;
    private long W;
    private float X;
    private d[] Y;
    private ByteBuffer[] Z;

    /* renamed from: a  reason: collision with root package name */
    private final c f271a;
    private ByteBuffer a0;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f272b;
    private ByteBuffer b0;
    private final g c;
    private byte[] c0;
    private final o d;
    private int d0;
    private final n e;
    private int e0;
    private final d[] f;
    private boolean f0;
    private final d[] g;
    private boolean g0;
    /* access modifiers changed from: private */
    public final ConditionVariable h;
    private int h0;
    private final long[] i;
    private boolean i0;
    private final c j;
    private boolean j0;
    private final ArrayDeque<f> k;
    private long k0;
    private f.c l;
    private AudioTrack m;
    private AudioTrack n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private b u;
    private boolean v;
    private boolean w;
    private int x;
    private long y;
    private w z;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioTrack f273a;

        a(AudioTrack audioTrack) {
            this.f273a = audioTrack;
        }

        public void run() {
            try {
                this.f273a.flush();
                this.f273a.release();
            } finally {
                h.this.h.open();
            }
        }
    }

    class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioTrack f275a;

        b(h hVar, AudioTrack audioTrack) {
            this.f275a = audioTrack;
        }

        public void run() {
            this.f275a.release();
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        protected AudioTrack f276a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f277b;
        private int c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;
        private long i;
        private long j;

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public long a() {
            if (this.g != -9223372036854775807L) {
                return Math.min(this.j, this.i + ((((SystemClock.elapsedRealtime() * 1000) - this.g) * ((long) this.c)) / 1000000));
            }
            int playState = this.f276a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = 4294967295L & ((long) this.f276a.getPlaybackHeadPosition());
            if (this.f277b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f = this.d;
                }
                playbackHeadPosition += this.f;
            }
            if (b.a.a.a.r0.w.f743a <= 28) {
                if (playbackHeadPosition == 0 && this.d > 0 && playState == 3) {
                    if (this.h == -9223372036854775807L) {
                        this.h = SystemClock.elapsedRealtime();
                    }
                    return this.d;
                }
                this.h = -9223372036854775807L;
            }
            if (this.d > playbackHeadPosition) {
                this.e++;
            }
            this.d = playbackHeadPosition;
            return playbackHeadPosition + (this.e << 32);
        }

        public long b() {
            return (a() * 1000000) / ((long) this.c);
        }

        public long c() {
            throw new UnsupportedOperationException();
        }

        public long d() {
            throw new UnsupportedOperationException();
        }

        public void e(long j2) {
            this.i = a();
            this.g = SystemClock.elapsedRealtime() * 1000;
            this.j = j2;
            this.f276a.stop();
        }

        public boolean f(long j2) {
            return this.h != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.h >= 200;
        }

        public void g() {
            if (this.g == -9223372036854775807L) {
                this.f276a.pause();
            }
        }

        public void h(AudioTrack audioTrack, boolean z) {
            this.f276a = audioTrack;
            this.f277b = z;
            this.g = -9223372036854775807L;
            this.h = -9223372036854775807L;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            if (audioTrack != null) {
                this.c = audioTrack.getSampleRate();
            }
        }

        public boolean i() {
            return false;
        }
    }

    @TargetApi(19)
    private static class d extends c {
        private final AudioTimestamp k = new AudioTimestamp();
        private long l;
        private long m;
        private long n;

        public d() {
            super((a) null);
        }

        public long c() {
            return this.n;
        }

        public long d() {
            return this.k.nanoTime;
        }

        public void h(AudioTrack audioTrack, boolean z) {
            super.h(audioTrack, z);
            this.l = 0;
            this.m = 0;
            this.n = 0;
        }

        public boolean i() {
            boolean timestamp = this.f276a.getTimestamp(this.k);
            if (timestamp) {
                long j = this.k.framePosition;
                if (this.m > j) {
                    this.l++;
                }
                this.m = j;
                this.n = j + (this.l << 32);
            }
            return timestamp;
        }
    }

    public static final class e extends RuntimeException {
        public e(String str) {
            super(str);
        }
    }

    private static final class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final w f278a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f279b;
        /* access modifiers changed from: private */
        public final long c;

        private f(w wVar, long j, long j2) {
            this.f278a = wVar;
            this.f279b = j;
            this.c = j2;
        }

        /* synthetic */ f(w wVar, long j, long j2, a aVar) {
            this(wVar, j, j2);
        }
    }

    public h(c cVar, d[] dVarArr) {
        this(cVar, dVarArr, false);
    }

    public h(c cVar, d[] dVarArr, boolean z2) {
        this.f271a = cVar;
        this.f272b = z2;
        this.h = new ConditionVariable(true);
        if (b.a.a.a.r0.w.f743a >= 18) {
            try {
                this.L = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.j = b.a.a.a.r0.w.f743a >= 19 ? new d() : new c((a) null);
        g gVar = new g();
        this.c = gVar;
        o oVar = new o();
        this.d = oVar;
        n nVar = new n();
        this.e = nVar;
        d[] dVarArr2 = new d[(dVarArr.length + 4)];
        this.f = dVarArr2;
        dVarArr2[0] = new l();
        dVarArr2[1] = gVar;
        dVarArr2[2] = oVar;
        System.arraycopy(dVarArr, 0, dVarArr2, 3, dVarArr.length);
        dVarArr2[dVarArr.length + 3] = nVar;
        this.g = new d[]{new j()};
        this.i = new long[10];
        this.X = 1.0f;
        this.T = 0;
        this.u = b.e;
        this.h0 = 0;
        this.A = w.d;
        this.e0 = -1;
        this.Y = new d[0];
        this.Z = new ByteBuffer[0];
        this.k = new ArrayDeque<>();
    }

    private long A() {
        return this.o ? this.N / ((long) this.M) : this.O;
    }

    private long B() {
        return this.o ? this.Q / ((long) this.P) : this.R;
    }

    private boolean C() {
        return I() && this.T != 0;
    }

    private void D() {
        this.h.block();
        this.n = E();
        f(this.A);
        O();
        int audioSessionId = this.n.getAudioSessionId();
        if (l0 && b.a.a.a.r0.w.f743a < 21) {
            AudioTrack audioTrack = this.m;
            if (!(audioTrack == null || audioSessionId == audioTrack.getAudioSessionId())) {
                N();
            }
            if (this.m == null) {
                this.m = F(audioSessionId);
            }
        }
        if (this.h0 != audioSessionId) {
            this.h0 = audioSessionId;
            f.c cVar = this.l;
            if (cVar != null) {
                cVar.b(audioSessionId);
            }
        }
        this.j.h(this.n, K());
        Q();
        this.j0 = false;
    }

    private AudioTrack E() {
        AudioTrack audioTrack;
        if (b.a.a.a.r0.w.f743a >= 21) {
            audioTrack = u();
        } else {
            int t2 = b.a.a.a.r0.w.t(this.u.c);
            audioTrack = this.h0 == 0 ? new AudioTrack(t2, this.r, this.s, this.t, this.x, 1) : new AudioTrack(t2, this.r, this.s, this.t, this.x, 1, this.h0);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new f.b(state, this.r, this.s, this.x);
    }

    private AudioTrack F(int i2) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
    }

    private long G(long j2) {
        return (j2 * 1000000) / ((long) this.q);
    }

    private static boolean H(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    private boolean I() {
        return this.n != null;
    }

    private void J() {
        String str;
        long b2 = this.j.b();
        if (b2 != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.I >= 30000) {
                long[] jArr = this.i;
                int i2 = this.F;
                jArr[i2] = b2 - nanoTime;
                this.F = (i2 + 1) % 10;
                int i3 = this.G;
                if (i3 < 10) {
                    this.G = i3 + 1;
                }
                this.I = nanoTime;
                this.H = 0;
                int i4 = 0;
                while (true) {
                    int i5 = this.G;
                    if (i4 >= i5) {
                        break;
                    }
                    this.H += this.i[i4] / ((long) i5);
                    i4++;
                }
            }
            if (!K() && nanoTime - this.K >= 500000) {
                boolean i6 = this.j.i();
                this.J = i6;
                if (i6) {
                    long d2 = this.j.d() / 1000;
                    long c2 = this.j.c();
                    if (d2 >= this.V) {
                        if (Math.abs(d2 - nanoTime) > 5000000) {
                            str = "Spurious audio timestamp (system clock mismatch): " + c2 + ", " + d2 + ", " + nanoTime + ", " + b2 + ", " + A() + ", " + B();
                            if (m0) {
                                throw new e(str);
                            }
                        } else if (Math.abs(x(c2) - b2) > 5000000) {
                            str = "Spurious audio timestamp (frame position mismatch): " + c2 + ", " + d2 + ", " + nanoTime + ", " + b2 + ", " + A() + ", " + B();
                            if (m0) {
                                throw new e(str);
                            }
                        }
                        Log.w("AudioTrack", str);
                    }
                    this.J = false;
                }
                Method method = this.L;
                if (method != null && this.o) {
                    try {
                        long intValue = (((long) ((Integer) method.invoke(this.n, (Object[]) null)).intValue()) * 1000) - this.y;
                        this.W = intValue;
                        long max = Math.max(intValue, 0);
                        this.W = max;
                        if (max > 5000000) {
                            Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.W);
                            this.W = 0;
                        }
                    } catch (Exception unused) {
                        this.L = null;
                    }
                }
                this.K = nanoTime;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean K() {
        /*
            r2 = this;
            int r0 = b.a.a.a.r0.w.f743a
            r1 = 23
            if (r0 >= r1) goto L_0x0010
            int r0 = r2.t
            r1 = 5
            if (r0 == r1) goto L_0x000e
            r1 = 6
            if (r0 != r1) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.h0.h.K():boolean");
    }

    private boolean L() {
        return K() && this.n.getPlayState() == 2 && this.n.getPlaybackHeadPosition() == 0;
    }

    private void M(long j2) {
        ByteBuffer byteBuffer;
        int length = this.Y.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.Z[i2 - 1];
            } else {
                byteBuffer = this.a0;
                if (byteBuffer == null) {
                    byteBuffer = d.f255a;
                }
            }
            if (i2 == length) {
                T(byteBuffer, j2);
            } else {
                d dVar = this.Y[i2];
                dVar.h(byteBuffer);
                ByteBuffer a2 = dVar.a();
                this.Z[i2] = a2;
                if (a2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    private void N() {
        AudioTrack audioTrack = this.m;
        if (audioTrack != null) {
            this.m = null;
            new b(this, audioTrack).start();
        }
    }

    private void O() {
        ArrayList arrayList = new ArrayList();
        for (d dVar : y()) {
            if (dVar.d()) {
                arrayList.add(dVar);
            } else {
                dVar.flush();
            }
        }
        int size = arrayList.size();
        this.Y = (d[]) arrayList.toArray(new d[size]);
        this.Z = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.Y[i2];
            dVar2.flush();
            this.Z[i2] = dVar2.a();
        }
    }

    private void P() {
        this.H = 0;
        this.G = 0;
        this.F = 0;
        this.I = 0;
        this.J = false;
        this.K = 0;
    }

    private void Q() {
        if (I()) {
            if (b.a.a.a.r0.w.f743a >= 21) {
                R(this.n, this.X);
            } else {
                S(this.n, this.X);
            }
        }
    }

    @TargetApi(21)
    private static void R(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    private static void S(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    private void T(ByteBuffer byteBuffer, long j2) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.b0;
            boolean z2 = true;
            int i2 = 0;
            if (byteBuffer2 != null) {
                b.a.a.a.r0.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.b0 = byteBuffer;
                if (b.a.a.a.r0.w.f743a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.c0;
                    if (bArr == null || bArr.length < remaining) {
                        this.c0 = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.c0, 0, remaining);
                    byteBuffer.position(position);
                    this.d0 = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (b.a.a.a.r0.w.f743a < 21) {
                int a2 = this.x - ((int) (this.Q - (this.j.a() * ((long) this.P))));
                if (a2 > 0 && (i2 = this.n.write(this.c0, this.d0, Math.min(remaining2, a2))) > 0) {
                    this.d0 += i2;
                    byteBuffer.position(byteBuffer.position() + i2);
                }
            } else if (this.i0) {
                if (j2 == -9223372036854775807L) {
                    z2 = false;
                }
                b.a.a.a.r0.a.f(z2);
                i2 = V(this.n, byteBuffer, remaining2, j2);
            } else {
                i2 = U(this.n, byteBuffer, remaining2);
            }
            this.k0 = SystemClock.elapsedRealtime();
            if (i2 >= 0) {
                boolean z3 = this.o;
                if (z3) {
                    this.Q += (long) i2;
                }
                if (i2 == remaining2) {
                    if (!z3) {
                        this.R += (long) this.S;
                    }
                    this.b0 = null;
                    return;
                }
                return;
            }
            throw new f.d(i2);
        }
    }

    @TargetApi(21)
    private static int U(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    @TargetApi(21)
    private int V(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (this.D == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.D = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.D.putInt(1431633921);
        }
        if (this.E == 0) {
            this.D.putInt(4, i2);
            this.D.putLong(8, j2 * 1000);
            this.D.position(0);
            this.E = i2;
        }
        int remaining = this.D.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.D, remaining, 1);
            if (write < 0) {
                this.E = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int U2 = U(audioTrack, byteBuffer, i2);
        if (U2 < 0) {
            this.E = 0;
            return U2;
        }
        this.E -= U2;
        return U2;
    }

    private long e(long j2) {
        long j3;
        long p2;
        while (!this.k.isEmpty() && j2 >= this.k.getFirst().c) {
            f remove = this.k.remove();
            this.A = remove.f278a;
            this.C = remove.c;
            this.B = remove.f279b - this.U;
        }
        if (this.A.f787a == 1.0f) {
            return (j2 + this.B) - this.C;
        }
        if (this.k.isEmpty()) {
            j3 = this.B;
            p2 = this.e.j(j2 - this.C);
        } else {
            j3 = this.B;
            p2 = b.a.a.a.r0.w.p(j2 - this.C, this.A.f787a);
        }
        return j3 + p2;
    }

    @TargetApi(21)
    private AudioTrack u() {
        AudioAttributes build = this.i0 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.u.a();
        AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.s).setEncoding(this.t).setSampleRate(this.r).build();
        int i2 = this.h0;
        return new AudioTrack(build, build2, this.x, 1, i2 != 0 ? i2 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean v() {
        /*
            r9 = this;
            int r0 = r9.e0
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.v
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x0010
        L_0x000d:
            b.a.a.a.h0.d[] r0 = r9.Y
            int r0 = r0.length
        L_0x0010:
            r9.e0 = r0
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.e0
            b.a.a.a.h0.d[] r5 = r9.Y
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0036
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.c()
        L_0x0028:
            r9.M(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.e0
            int r0 = r0 + r2
            goto L_0x0010
        L_0x0036:
            java.nio.ByteBuffer r0 = r9.b0
            if (r0 == 0) goto L_0x0042
            r9.T(r0, r7)
            java.nio.ByteBuffer r0 = r9.b0
            if (r0 == 0) goto L_0x0042
            return r3
        L_0x0042:
            r9.e0 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.h0.h.v():boolean");
    }

    private long w(long j2) {
        return (j2 * ((long) this.r)) / 1000000;
    }

    private long x(long j2) {
        return (j2 * 1000000) / ((long) this.r);
    }

    private d[] y() {
        return this.p ? this.g : this.f;
    }

    private static int z(int i2, ByteBuffer byteBuffer) {
        if (i2 == 7 || i2 == 8) {
            return i.e(byteBuffer);
        }
        if (i2 == 5) {
            return a.a();
        }
        if (i2 == 6) {
            return a.g(byteBuffer);
        }
        if (i2 == 14) {
            return a.h(byteBuffer) * 8;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i2);
    }

    public void a() {
        reset();
        N();
        for (d reset : this.f) {
            reset.reset();
        }
        for (d reset2 : this.g) {
            reset2.reset();
        }
        this.h0 = 0;
        this.g0 = false;
    }

    public boolean b() {
        return !I() || (this.f0 && !n());
    }

    public w c() {
        return this.A;
    }

    public w f(w wVar) {
        if (!I() || this.w) {
            float l2 = this.e.l(wVar.f787a);
            n nVar = this.e;
            float f2 = wVar.f788b;
            nVar.k(f2);
            w wVar2 = new w(l2, f2);
            w wVar3 = this.z;
            if (wVar3 == null) {
                wVar3 = !this.k.isEmpty() ? this.k.getLast().f278a : this.A;
            }
            if (!wVar2.equals(wVar3)) {
                if (I()) {
                    this.z = wVar2;
                } else {
                    this.A = wVar2;
                }
            }
            return this.A;
        }
        w wVar4 = w.d;
        this.A = wVar4;
        return wVar4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0118 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(int r18, int r19, int r20, int r21, int[] r22, int r23, int r24) {
        /*
            r17 = this;
            r1 = r17
            r0 = r21
            r2 = r20
            r1.q = r2
            boolean r3 = H(r18)
            r1.o = r3
            boolean r3 = r1.f272b
            r4 = 1
            if (r3 == 0) goto L_0x0023
            r3 = 1073741824(0x40000000, float:2.0)
            boolean r3 = r1.o(r3)
            if (r3 == 0) goto L_0x0023
            boolean r3 = b.a.a.a.r0.w.w(r18)
            if (r3 == 0) goto L_0x0023
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            r1.p = r3
            boolean r3 = r1.o
            if (r3 == 0) goto L_0x0030
            int r3 = b.a.a.a.r0.w.r(r18, r19)
            r1.M = r3
        L_0x0030:
            boolean r3 = r1.o
            r6 = 4
            if (r3 == 0) goto L_0x003b
            r3 = r18
            if (r3 == r6) goto L_0x003d
            r7 = 1
            goto L_0x003e
        L_0x003b:
            r3 = r18
        L_0x003d:
            r7 = 0
        L_0x003e:
            if (r7 == 0) goto L_0x0046
            boolean r8 = r1.p
            if (r8 != 0) goto L_0x0046
            r8 = 1
            goto L_0x0047
        L_0x0046:
            r8 = 0
        L_0x0047:
            r1.w = r8
            if (r7 == 0) goto L_0x0090
            b.a.a.a.h0.o r8 = r1.d
            r9 = r23
            r10 = r24
            r8.j(r9, r10)
            b.a.a.a.h0.g r8 = r1.c
            r9 = r22
            r8.j(r9)
            b.a.a.a.h0.d[] r8 = r17.y()
            int r9 = r8.length
            r10 = r2
            r11 = 0
            r12 = 0
            r2 = r19
        L_0x0065:
            if (r11 >= r9) goto L_0x0094
            r13 = r8[r11]
            boolean r14 = r13.e(r10, r2, r3)     // Catch:{ a -> 0x0088 }
            r12 = r12 | r14
            boolean r14 = r13.d()
            if (r14 == 0) goto L_0x0085
            int r2 = r13.i()
            int r3 = r13.f()
            int r10 = r13.g()
            r16 = r10
            r10 = r3
            r3 = r16
        L_0x0085:
            int r11 = r11 + 1
            goto L_0x0065
        L_0x0088:
            r0 = move-exception
            r2 = r0
            b.a.a.a.h0.f$a r0 = new b.a.a.a.h0.f$a
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0090:
            r10 = r2
            r12 = 0
            r2 = r19
        L_0x0094:
            r8 = 252(0xfc, float:3.53E-43)
            r9 = 12
            switch(r2) {
                case 1: goto L_0x00c6;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00be;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00b5;
                case 8: goto L_0x00b2;
                default: goto L_0x009b;
            }
        L_0x009b:
            b.a.a.a.h0.f$a r0 = new b.a.a.a.h0.f$a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unsupported channel count: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00b2:
            int r6 = b.a.a.a.b.f224a
            goto L_0x00c6
        L_0x00b5:
            r6 = 1276(0x4fc, float:1.788E-42)
            goto L_0x00c6
        L_0x00b8:
            r6 = 252(0xfc, float:3.53E-43)
            goto L_0x00c6
        L_0x00bb:
            r6 = 220(0xdc, float:3.08E-43)
            goto L_0x00c6
        L_0x00be:
            r6 = 204(0xcc, float:2.86E-43)
            goto L_0x00c6
        L_0x00c1:
            r6 = 28
            goto L_0x00c6
        L_0x00c4:
            r6 = 12
        L_0x00c6:
            int r11 = b.a.a.a.r0.w.f743a
            r13 = 23
            r14 = 7
            r15 = 5
            if (r11 > r13) goto L_0x00ed
            java.lang.String r13 = b.a.a.a.r0.w.f744b
            java.lang.String r5 = "foster"
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x00ed
            java.lang.String r5 = b.a.a.a.r0.w.c
            java.lang.String r13 = "NVIDIA"
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L_0x00ed
            r5 = 3
            if (r2 == r5) goto L_0x00ee
            if (r2 == r15) goto L_0x00ee
            if (r2 == r14) goto L_0x00ea
            goto L_0x00ed
        L_0x00ea:
            int r8 = b.a.a.a.b.f224a
            goto L_0x00ee
        L_0x00ed:
            r8 = r6
        L_0x00ee:
            r5 = 25
            if (r11 > r5) goto L_0x0103
            java.lang.String r5 = b.a.a.a.r0.w.f744b
            java.lang.String r6 = "fugu"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0103
            boolean r5 = r1.o
            if (r5 != 0) goto L_0x0103
            if (r2 != r4) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r9 = r8
        L_0x0104:
            if (r12 != 0) goto L_0x0119
            boolean r5 = r17.I()
            if (r5 == 0) goto L_0x0119
            int r5 = r1.t
            if (r5 != r3) goto L_0x0119
            int r5 = r1.r
            if (r5 != r10) goto L_0x0119
            int r5 = r1.s
            if (r5 != r9) goto L_0x0119
            return
        L_0x0119:
            r17.reset()
            r1.v = r7
            r1.r = r10
            r1.s = r9
            r1.t = r3
            boolean r5 = r1.o
            if (r5 == 0) goto L_0x012e
            int r2 = b.a.a.a.r0.w.r(r3, r2)
            r1.P = r2
        L_0x012e:
            if (r0 == 0) goto L_0x0133
        L_0x0130:
            r1.x = r0
            goto L_0x017f
        L_0x0133:
            boolean r0 = r1.o
            if (r0 == 0) goto L_0x016a
            int r0 = r1.t
            int r0 = android.media.AudioTrack.getMinBufferSize(r10, r9, r0)
            r2 = -2
            if (r0 == r2) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r4 = 0
        L_0x0142:
            b.a.a.a.r0.a.f(r4)
            int r2 = r0 * 4
            r3 = 250000(0x3d090, double:1.235164E-318)
            long r3 = r1.w(r3)
            int r4 = (int) r3
            int r3 = r1.P
            int r4 = r4 * r3
            long r5 = (long) r0
            r7 = 750000(0xb71b0, double:3.70549E-318)
            long r7 = r1.w(r7)
            int r0 = r1.P
            long r9 = (long) r0
            long r7 = r7 * r9
            long r5 = java.lang.Math.max(r5, r7)
            int r0 = (int) r5
            int r0 = b.a.a.a.r0.w.i(r2, r4, r0)
            goto L_0x0130
        L_0x016a:
            int r0 = r1.t
            if (r0 == r15) goto L_0x017c
            r2 = 6
            if (r0 != r2) goto L_0x0172
            goto L_0x017c
        L_0x0172:
            if (r0 != r14) goto L_0x0178
            r0 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0130
        L_0x0178:
            r0 = 294912(0x48000, float:4.1326E-40)
            goto L_0x0130
        L_0x017c:
            r0 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0130
        L_0x017f:
            boolean r0 = r1.o
            if (r0 == 0) goto L_0x018e
            int r0 = r1.x
            int r2 = r1.P
            int r0 = r0 / r2
            long r2 = (long) r0
            long r2 = r1.x(r2)
            goto L_0x0193
        L_0x018e:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0193:
            r1.y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.h0.h.g(int, int, int, int, int[], int, int):void");
    }

    public void h() {
        this.g0 = false;
        if (I()) {
            P();
            this.j.g();
        }
    }

    public long i(boolean z2) {
        long j2;
        if (!C()) {
            return Long.MIN_VALUE;
        }
        if (this.n.getPlayState() == 3) {
            J();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.J) {
            j2 = x(this.j.c() + w(nanoTime - (this.j.d() / 1000)));
        } else {
            j2 = this.G == 0 ? this.j.b() : nanoTime + this.H;
            if (!z2) {
                j2 -= this.W;
            }
        }
        return this.U + e(Math.min(j2, x(B())));
    }

    public void j() {
        if (this.i0) {
            this.i0 = false;
            this.h0 = 0;
            reset();
        }
    }

    public void k(f.c cVar) {
        this.l = cVar;
    }

    public void l(b bVar) {
        if (!this.u.equals(bVar)) {
            this.u = bVar;
            if (!this.i0) {
                reset();
                this.h0 = 0;
            }
        }
    }

    public void m() {
        if (!this.f0 && I() && v()) {
            this.j.e(B());
            this.E = 0;
            this.f0 = true;
        }
    }

    public boolean n() {
        return I() && (B() > this.j.a() || L());
    }

    public boolean o(int i2) {
        if (H(i2)) {
            return i2 != 4 || b.a.a.a.r0.w.f743a >= 21;
        }
        c cVar = this.f271a;
        return cVar != null && cVar.c(i2);
    }

    public void p() {
        if (this.T == 1) {
            this.T = 2;
        }
    }

    public void q(float f2) {
        if (this.X != f2) {
            this.X = f2;
            Q();
        }
    }

    public void r() {
        this.g0 = true;
        if (I()) {
            this.V = System.nanoTime() / 1000;
            this.n.play();
        }
    }

    public void reset() {
        if (I()) {
            this.N = 0;
            this.O = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            w wVar = this.z;
            if (wVar != null) {
                this.A = wVar;
                this.z = null;
            } else if (!this.k.isEmpty()) {
                this.A = this.k.getLast().f278a;
            }
            this.k.clear();
            this.B = 0;
            this.C = 0;
            this.a0 = null;
            this.b0 = null;
            int i2 = 0;
            while (true) {
                d[] dVarArr = this.Y;
                if (i2 >= dVarArr.length) {
                    break;
                }
                d dVar = dVarArr[i2];
                dVar.flush();
                this.Z[i2] = dVar.a();
                i2++;
            }
            this.f0 = false;
            this.e0 = -1;
            this.D = null;
            this.E = 0;
            this.T = 0;
            this.W = 0;
            P();
            if (this.n.getPlayState() == 3) {
                this.n.pause();
            }
            AudioTrack audioTrack = this.n;
            this.n = null;
            this.j.h((AudioTrack) null, false);
            this.h.close();
            new a(audioTrack).start();
        }
    }

    public boolean s(ByteBuffer byteBuffer, long j2) {
        String str;
        String str2;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j2;
        ByteBuffer byteBuffer3 = this.a0;
        b.a.a.a.r0.a.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!I()) {
            D();
            if (this.g0) {
                r();
            }
        }
        if (K()) {
            if (this.n.getPlayState() == 2) {
                this.j0 = false;
                return false;
            } else if (this.n.getPlayState() == 1 && this.j.a() != 0) {
                return false;
            }
        }
        boolean z2 = this.j0;
        boolean n2 = n();
        this.j0 = n2;
        if (z2 && !n2 && this.n.getPlayState() != 1 && this.l != null) {
            this.l.c(this.x, b.a.a.a.b.b(this.y), SystemClock.elapsedRealtime() - this.k0);
        }
        if (this.a0 != null) {
            str = "AudioTrack";
        } else if (!byteBuffer.hasRemaining()) {
            return true;
        } else {
            if (!this.o && this.S == 0) {
                int z3 = z(this.t, byteBuffer2);
                this.S = z3;
                if (z3 == 0) {
                    return true;
                }
            }
            if (this.z == null) {
                str2 = "AudioTrack";
            } else if (!v()) {
                return false;
            } else {
                ArrayDeque<f> arrayDeque = this.k;
                str2 = "AudioTrack";
                f fVar = r12;
                f fVar2 = new f(this.z, Math.max(0, j3), x(B()), (a) null);
                arrayDeque.add(fVar);
                this.z = null;
                O();
            }
            if (this.T == 0) {
                this.U = Math.max(0, j3);
                this.T = 1;
                str = str2;
            } else {
                long G2 = this.U + G(A());
                if (this.T != 1 || Math.abs(G2 - j3) <= 200000) {
                    str = str2;
                    i2 = 2;
                } else {
                    str = str2;
                    Log.e(str, "Discontinuity detected [expected " + G2 + ", got " + j3 + "]");
                    i2 = 2;
                    this.T = 2;
                }
                if (this.T == i2) {
                    this.U += j3 - G2;
                    this.T = 1;
                    f.c cVar = this.l;
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            }
            if (this.o) {
                this.N += (long) byteBuffer.remaining();
            } else {
                this.O += (long) this.S;
            }
            this.a0 = byteBuffer2;
        }
        if (this.v) {
            M(j3);
        } else {
            T(this.a0, j3);
        }
        if (!this.a0.hasRemaining()) {
            this.a0 = null;
            return true;
        } else if (!this.j.f(B())) {
            return false;
        } else {
            Log.w(str, "Resetting stalled audio track");
            reset();
            return true;
        }
    }

    public void t(int i2) {
        b.a.a.a.r0.a.f(b.a.a.a.r0.w.f743a >= 21);
        if (!this.i0 || this.h0 != i2) {
            this.i0 = true;
            this.h0 = i2;
            reset();
        }
    }
}
