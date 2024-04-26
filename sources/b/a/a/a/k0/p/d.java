package b.a.a.a.k0.p;

import android.util.SparseArray;
import b.a.a.a.j0.a;
import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.l;
import b.a.a.a.k0.n;
import b.a.a.a.r0.h;
import b.a.a.a.r0.k;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import b.a.a.a.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public final class d implements e {
    private static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final byte[] b0 = w.v("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] c0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] d0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID e0 = new UUID(72057594037932032L, -9223371306706625679L);
    private long A;
    private h B;
    private h C;
    private boolean D;
    private int E;
    private long F;
    private long G;
    private int H;
    private int I;
    private int[] J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private byte S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private g Y;

    /* renamed from: a  reason: collision with root package name */
    private final b f339a;

    /* renamed from: b  reason: collision with root package name */
    private final f f340b;
    private final SparseArray<c> c;
    private final boolean d;
    private final m e;
    private final m f;
    private final m g;
    private final m h;
    private final m i;
    private final m j;
    private final m k;
    private final m l;
    private final m m;
    private ByteBuffer n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private c t;
    private boolean u;
    private int v;
    private long w;
    private boolean x;
    private long y;
    private long z;

    static class a implements b.a.a.a.k0.h {
    }

    private final class b implements c {
        private b() {
        }

        /* synthetic */ b(d dVar, a aVar) {
            this();
        }

        public void a(int i) {
            d.this.l(i);
        }

        public void b(int i, int i2, f fVar) {
            d.this.e(i, i2, fVar);
        }

        public int c(int i) {
            return d.this.o(i);
        }

        public void d(int i, double d) {
            d.this.n(i, d);
        }

        public void e(int i, String str) {
            d.this.A(i, str);
        }

        public void f(int i, long j, long j2) {
            d.this.z(i, j, j2);
        }

        public boolean g(int i) {
            return d.this.r(i);
        }

        public void h(int i, long j) {
            d.this.p(i, j);
        }
    }

    private static final class c {
        public float A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public long J;
        public long K;
        public C0021d L;
        public boolean M;
        public boolean N;
        /* access modifiers changed from: private */
        public String O;
        public n P;
        public int Q;

        /* renamed from: a  reason: collision with root package name */
        public String f342a;

        /* renamed from: b  reason: collision with root package name */
        public int f343b;
        public int c;
        public int d;
        public boolean e;
        public byte[] f;
        public n.a g;
        public byte[] h;
        public b.a.a.a.j0.a i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public byte[] o;
        public int p;
        public boolean q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public float y;
        public float z;

        private c() {
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = null;
            this.p = -1;
            this.q = false;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 1000;
            this.v = 200;
            this.w = -1.0f;
            this.x = -1.0f;
            this.y = -1.0f;
            this.z = -1.0f;
            this.A = -1.0f;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 1;
            this.H = -1;
            this.I = 8000;
            this.J = 0;
            this.K = 0;
            this.N = true;
            this.O = "eng";
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private byte[] b() {
            if (this.w == -1.0f || this.x == -1.0f || this.y == -1.0f || this.z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put((byte) 0);
            wrap.putShort((short) ((int) ((this.w * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.x * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.y * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.z * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.A * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.B * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.C * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.D * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) (this.E + 0.5f)));
            wrap.putShort((short) ((int) (this.F + 0.5f)));
            wrap.putShort((short) this.u);
            wrap.putShort((short) this.v);
            return bArr;
        }

        private static List<byte[]> e(m mVar) {
            try {
                mVar.K(16);
                if (mVar.n() != 826496599) {
                    return null;
                }
                byte[] bArr = mVar.f734a;
                for (int c2 = mVar.c() + 20; c2 < bArr.length - 4; c2++) {
                    if (bArr[c2] == 0 && bArr[c2 + 1] == 0 && bArr[c2 + 2] == 1 && bArr[c2 + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, c2, bArr.length));
                    }
                }
                throw new u("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new u("Error parsing FourCC VC1 codec private");
            }
        }

        private static boolean f(m mVar) {
            try {
                int p2 = mVar.p();
                if (p2 == 1) {
                    return true;
                }
                if (p2 != 65534) {
                    return false;
                }
                mVar.J(24);
                return mVar.q() == d.e0.getMostSignificantBits() && mVar.q() == d.e0.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new u("Error parsing MS/ACM codec private");
            }
        }

        private static List<byte[]> g(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i2 = 1;
                    int i3 = 0;
                    while (bArr[i2] == -1) {
                        i3 += 255;
                        i2++;
                    }
                    int i4 = i2 + 1;
                    int i5 = i3 + bArr[i2];
                    int i6 = 0;
                    while (bArr[i4] == -1) {
                        i6 += 255;
                        i4++;
                    }
                    int i7 = i4 + 1;
                    int i8 = i6 + bArr[i4];
                    if (bArr[i7] == 1) {
                        byte[] bArr2 = new byte[i5];
                        System.arraycopy(bArr, i7, bArr2, 0, i5);
                        int i9 = i7 + i5;
                        if (bArr[i9] == 3) {
                            int i10 = i9 + i8;
                            if (bArr[i10] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i10)];
                                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new u("Error parsing vorbis codec private");
                        }
                        throw new u("Error parsing vorbis codec private");
                    }
                    throw new u("Error parsing vorbis codec private");
                }
                throw new u("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new u("Error parsing vorbis codec private");
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0236, code lost:
            r1.append("Unsupported PCM bit depth: ");
            r1.append(r0.H);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0240, code lost:
            r27 = r1;
            r9 = "audio/raw";
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0251, code lost:
            r9 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0253, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0255, code lost:
            r27 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0257, code lost:
            r32 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0288, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c4, code lost:
            r9 = r16;
            r1 = null;
            r27 = -1;
            r32 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x030c, code lost:
            r1.append(r2);
            r1.append(r9);
            android.util.Log.w("MatroskaExtractor", r1.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x032a, code lost:
            r2 = r0.N | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x032f, code lost:
            if (r0.M == false) goto L_0x0332;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0331, code lost:
            r6 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0332, code lost:
            r2 = r2 | r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0337, code lost:
            if (b.a.a.a.r0.j.f(r9) == false) goto L_0x035f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0339, code lost:
            r1 = b.a.a.a.n.g(java.lang.Integer.toString(r45), r9, (java.lang.String) null, -1, r32, r0.G, r0.I, r27, r1, r0.i, r2 ? 1 : 0, r0.O);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0363, code lost:
            if (b.a.a.a.r0.j.h(r9) == false) goto L_0x03d9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0367, code lost:
            if (r0.n != 0) goto L_0x037b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0369, code lost:
            r2 = r0.l;
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x036c, code lost:
            if (r2 != -1) goto L_0x0370;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x036e, code lost:
            r2 = r0.j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0370, code lost:
            r0.l = r2;
            r2 = r0.m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0374, code lost:
            if (r2 != -1) goto L_0x0378;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0376, code lost:
            r2 = r0.k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0378, code lost:
            r0.m = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x037b, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x037c, code lost:
            r4 = r0.l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0380, code lost:
            if (r4 == r3) goto L_0x0394;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0382, code lost:
            r5 = r0.m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0384, code lost:
            if (r5 == r3) goto L_0x0394;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0386, code lost:
            r38 = ((float) (r0.k * r4)) / ((float) (r0.j * r5));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0394, code lost:
            r38 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0398, code lost:
            if (r0.q == false) goto L_0x03ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x039a, code lost:
            r41 = new b.a.a.a.s0.b(r0.r, r0.t, r0.s, b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ac, code lost:
            r41 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ae, code lost:
            r1 = b.a.a.a.n.q(java.lang.Integer.toString(r45), r9, (java.lang.String) null, -1, r32, r0.j, r0.k, -1.0f, r1, -1, r38, r0.o, r0.p, r41, r0.i);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x03dd, code lost:
            if ("application/x-subrip".equals(r9) == false) goto L_0x03ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x03df, code lost:
            r1 = b.a.a.a.n.m(java.lang.Integer.toString(r45), r9, r2 ? 1 : 0, r0.O, r0.i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03eb, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f2, code lost:
            if ("text/x-ssa".equals(r9) == false) goto L_0x0428;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x03f4, code lost:
            r1 = new java.util.ArrayList(2);
            r1.add(b.a.a.a.k0.p.d.b());
            r1.add(r0.h);
            r1 = b.a.a.a.n.o(java.lang.Integer.toString(r45), r9, (java.lang.String) null, -1, r2 ? 1 : 0, r0.O, -1, r0.i, Long.MAX_VALUE, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x042c, code lost:
            if ("application/vobsub".equals(r9) != false) goto L_0x0443;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0432, code lost:
            if ("application/pgs".equals(r9) != false) goto L_0x0443;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x0438, code lost:
            if ("application/dvbsubs".equals(r9) == false) goto L_0x043b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x0442, code lost:
            throw new b.a.a.a.u("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x0443, code lost:
            r1 = b.a.a.a.n.i(java.lang.Integer.toString(r45), r9, (java.lang.String) null, -1, r2 ? 1 : 0, r1, r0.O, r0.i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x045e, code lost:
            r2 = r44.f(r0.f343b, r5);
            r0.P = r2;
            r2.c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x046b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(b.a.a.a.k0.g r44, int r45) {
            /*
                r43 = this;
                r0 = r43
                java.lang.String r1 = r0.f342a
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 4
                r4 = 8
                r5 = 1
                r6 = 0
                r8 = 3
                switch(r2) {
                    case -2095576542: goto L_0x0188;
                    case -2095575984: goto L_0x017c;
                    case -1985379776: goto L_0x0170;
                    case -1784763192: goto L_0x0164;
                    case -1730367663: goto L_0x0158;
                    case -1482641358: goto L_0x014c;
                    case -1482641357: goto L_0x0140;
                    case -1373388978: goto L_0x0134;
                    case -933872740: goto L_0x0126;
                    case -538363189: goto L_0x0118;
                    case -538363109: goto L_0x010a;
                    case -425012669: goto L_0x00fc;
                    case -356037306: goto L_0x00ee;
                    case 62923557: goto L_0x00e0;
                    case 62923603: goto L_0x00d2;
                    case 62927045: goto L_0x00c4;
                    case 82338133: goto L_0x00b6;
                    case 82338134: goto L_0x00a8;
                    case 99146302: goto L_0x009a;
                    case 444813526: goto L_0x008c;
                    case 542569478: goto L_0x007f;
                    case 725957860: goto L_0x0072;
                    case 738597099: goto L_0x0065;
                    case 855502857: goto L_0x0058;
                    case 1422270023: goto L_0x004b;
                    case 1809237540: goto L_0x003e;
                    case 1950749482: goto L_0x0031;
                    case 1950789798: goto L_0x0024;
                    case 1951062397: goto L_0x0017;
                    default: goto L_0x0014;
                }
            L_0x0014:
                r1 = -1
                goto L_0x0193
            L_0x0017:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0020
                goto L_0x0014
            L_0x0020:
                r1 = 28
                goto L_0x0193
            L_0x0024:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002d
                goto L_0x0014
            L_0x002d:
                r1 = 27
                goto L_0x0193
            L_0x0031:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003a
                goto L_0x0014
            L_0x003a:
                r1 = 26
                goto L_0x0193
            L_0x003e:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0047
                goto L_0x0014
            L_0x0047:
                r1 = 25
                goto L_0x0193
            L_0x004b:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0054
                goto L_0x0014
            L_0x0054:
                r1 = 24
                goto L_0x0193
            L_0x0058:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0061
                goto L_0x0014
            L_0x0061:
                r1 = 23
                goto L_0x0193
            L_0x0065:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006e
                goto L_0x0014
            L_0x006e:
                r1 = 22
                goto L_0x0193
            L_0x0072:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007b
                goto L_0x0014
            L_0x007b:
                r1 = 21
                goto L_0x0193
            L_0x007f:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0088
                goto L_0x0014
            L_0x0088:
                r1 = 20
                goto L_0x0193
            L_0x008c:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0096
                goto L_0x0014
            L_0x0096:
                r1 = 19
                goto L_0x0193
            L_0x009a:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a4
                goto L_0x0014
            L_0x00a4:
                r1 = 18
                goto L_0x0193
            L_0x00a8:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b2
                goto L_0x0014
            L_0x00b2:
                r1 = 17
                goto L_0x0193
            L_0x00b6:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c0
                goto L_0x0014
            L_0x00c0:
                r1 = 16
                goto L_0x0193
            L_0x00c4:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00ce
                goto L_0x0014
            L_0x00ce:
                r1 = 15
                goto L_0x0193
            L_0x00d2:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00dc
                goto L_0x0014
            L_0x00dc:
                r1 = 14
                goto L_0x0193
            L_0x00e0:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00ea
                goto L_0x0014
            L_0x00ea:
                r1 = 13
                goto L_0x0193
            L_0x00ee:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f8
                goto L_0x0014
            L_0x00f8:
                r1 = 12
                goto L_0x0193
            L_0x00fc:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0106
                goto L_0x0014
            L_0x0106:
                r1 = 11
                goto L_0x0193
            L_0x010a:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0114
                goto L_0x0014
            L_0x0114:
                r1 = 10
                goto L_0x0193
            L_0x0118:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0122
                goto L_0x0014
            L_0x0122:
                r1 = 9
                goto L_0x0193
            L_0x0126:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0130
                goto L_0x0014
            L_0x0130:
                r1 = 8
                goto L_0x0193
            L_0x0134:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013e
                goto L_0x0014
            L_0x013e:
                r1 = 7
                goto L_0x0193
            L_0x0140:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014a
                goto L_0x0014
            L_0x014a:
                r1 = 6
                goto L_0x0193
            L_0x014c:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0156
                goto L_0x0014
            L_0x0156:
                r1 = 5
                goto L_0x0193
            L_0x0158:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0162
                goto L_0x0014
            L_0x0162:
                r1 = 4
                goto L_0x0193
            L_0x0164:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x016e
                goto L_0x0014
            L_0x016e:
                r1 = 3
                goto L_0x0193
            L_0x0170:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x017a
                goto L_0x0014
            L_0x017a:
                r1 = 2
                goto L_0x0193
            L_0x017c:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0186
                goto L_0x0014
            L_0x0186:
                r1 = 1
                goto L_0x0193
            L_0x0188:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0192
                goto L_0x0014
            L_0x0192:
                r1 = 0
            L_0x0193:
                java.lang.String r2 = ". Setting mimeType to "
                java.lang.String r10 = "Unsupported PCM bit depth: "
                java.lang.String r11 = "application/dvbsubs"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "text/x-ssa"
                java.lang.String r15 = "application/x-subrip"
                java.lang.String r16 = "audio/raw"
                r17 = 4096(0x1000, float:5.74E-42)
                java.lang.String r18 = "video/x-unknown"
                java.lang.String r9 = "audio/x-unknown"
                r19 = 0
                java.lang.String r7 = "MatroskaExtractor"
                switch(r1) {
                    case 0: goto L_0x031b;
                    case 1: goto L_0x031b;
                    case 2: goto L_0x02e9;
                    case 3: goto L_0x02de;
                    case 4: goto L_0x02cd;
                    case 5: goto L_0x02c2;
                    case 6: goto L_0x02bf;
                    case 7: goto L_0x02a7;
                    case 8: goto L_0x028c;
                    case 9: goto L_0x031b;
                    case 10: goto L_0x0275;
                    case 11: goto L_0x026d;
                    case 12: goto L_0x026a;
                    case 13: goto L_0x0261;
                    case 14: goto L_0x025e;
                    case 15: goto L_0x025b;
                    case 16: goto L_0x024f;
                    case 17: goto L_0x024c;
                    case 18: goto L_0x024a;
                    case 19: goto L_0x0247;
                    case 20: goto L_0x025b;
                    case 21: goto L_0x0229;
                    case 22: goto L_0x0227;
                    case 23: goto L_0x0212;
                    case 24: goto L_0x0210;
                    case 25: goto L_0x020d;
                    case 26: goto L_0x020a;
                    case 27: goto L_0x0200;
                    case 28: goto L_0x01b8;
                    default: goto L_0x01b0;
                }
            L_0x01b0:
                b.a.a.a.u r1 = new b.a.a.a.u
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>(r2)
                throw r1
            L_0x01b8:
                r17 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                byte[] r2 = r0.h
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r4)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r9 = r0.J
                java.nio.ByteBuffer r2 = r2.putLong(r9)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r4)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r3 = r0.K
                java.nio.ByteBuffer r2 = r2.putLong(r3)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r16 = "audio/opus"
                r9 = r16
                r27 = -1
                r32 = 5760(0x1680, float:8.071E-42)
                goto L_0x032a
            L_0x0200:
                byte[] r1 = r0.h
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x0289
            L_0x020a:
                java.lang.String r16 = "audio/eac3"
                goto L_0x0251
            L_0x020d:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x0251
            L_0x0210:
                r9 = r15
                goto L_0x0253
            L_0x0212:
                b.a.a.a.r0.m r1 = new b.a.a.a.r0.m
                byte[] r2 = r0.h
                r1.<init>((byte[]) r2)
                b.a.a.a.s0.d r1 = b.a.a.a.s0.d.a(r1)
                java.util.List<byte[]> r2 = r1.f756a
                int r1 = r1.f757b
                r0.Q = r1
                java.lang.String r16 = "video/hevc"
                goto L_0x0288
            L_0x0227:
                r9 = r14
                goto L_0x0253
            L_0x0229:
                int r1 = r0.H
                int r1 = b.a.a.a.r0.w.q(r1)
                if (r1 != 0) goto L_0x0240
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
            L_0x0236:
                r1.append(r10)
                int r3 = r0.H
                r1.append(r3)
                goto L_0x030c
            L_0x0240:
                r27 = r1
                r9 = r16
                r1 = r19
                goto L_0x0257
            L_0x0247:
                r9 = r18
                goto L_0x0253
            L_0x024a:
                r9 = r12
                goto L_0x0253
            L_0x024c:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x0251
            L_0x024f:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x0251:
                r9 = r16
            L_0x0253:
                r1 = r19
            L_0x0255:
                r27 = -1
            L_0x0257:
                r32 = -1
                goto L_0x032a
            L_0x025b:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x0251
            L_0x025e:
                java.lang.String r16 = "audio/ac3"
                goto L_0x0251
            L_0x0261:
                byte[] r1 = r0.h
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x0289
            L_0x026a:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x0251
            L_0x026d:
                byte[] r1 = r0.h
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r9 = r13
                goto L_0x0255
            L_0x0275:
                b.a.a.a.r0.m r1 = new b.a.a.a.r0.m
                byte[] r2 = r0.h
                r1.<init>((byte[]) r2)
                b.a.a.a.s0.a r1 = b.a.a.a.s0.a.b(r1)
                java.util.List<byte[]> r2 = r1.f748a
                int r1 = r1.f749b
                r0.Q = r1
                java.lang.String r16 = "video/avc"
            L_0x0288:
                r1 = r2
            L_0x0289:
                r9 = r16
                goto L_0x0255
            L_0x028c:
                byte[] r1 = new byte[r3]
                byte[] r2 = r0.h
                byte r3 = r2[r6]
                r1[r6] = r3
                byte r3 = r2[r5]
                r1[r5] = r3
                r3 = 2
                byte r4 = r2[r3]
                r1[r3] = r4
                byte r2 = r2[r8]
                r1[r8] = r2
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r9 = r11
                goto L_0x0255
            L_0x02a7:
                b.a.a.a.r0.m r1 = new b.a.a.a.r0.m
                byte[] r2 = r0.h
                r1.<init>((byte[]) r2)
                java.util.List r1 = e(r1)
                if (r1 == 0) goto L_0x02b7
                java.lang.String r16 = "video/wvc1"
                goto L_0x0289
            L_0x02b7:
                java.lang.String r2 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
                android.util.Log.w(r7, r2)
                r9 = r18
                goto L_0x0255
            L_0x02bf:
                java.lang.String r16 = "audio/mpeg"
                goto L_0x02c4
            L_0x02c2:
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x02c4:
                r9 = r16
                r1 = r19
                r27 = -1
                r32 = 4096(0x1000, float:5.74E-42)
                goto L_0x032a
            L_0x02cd:
                r17 = 8192(0x2000, float:1.14794E-41)
                byte[] r1 = r0.h
                java.util.List r1 = g(r1)
                java.lang.String r16 = "audio/vorbis"
                r9 = r16
                r27 = -1
                r32 = 8192(0x2000, float:1.14794E-41)
                goto L_0x032a
            L_0x02de:
                b.a.a.a.k0.p.d$d r1 = new b.a.a.a.k0.p.d$d
                r1.<init>()
                r0.L = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x0251
            L_0x02e9:
                b.a.a.a.r0.m r1 = new b.a.a.a.r0.m
                byte[] r3 = r0.h
                r1.<init>((byte[]) r3)
                boolean r1 = f(r1)
                if (r1 == 0) goto L_0x0305
                int r1 = r0.H
                int r1 = b.a.a.a.r0.w.q(r1)
                if (r1 != 0) goto L_0x0240
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                goto L_0x0236
            L_0x0305:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            L_0x030c:
                r1.append(r2)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r7, r1)
                goto L_0x0253
            L_0x031b:
                byte[] r1 = r0.h
                if (r1 != 0) goto L_0x0322
                r1 = r19
                goto L_0x0326
            L_0x0322:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0326:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x0289
            L_0x032a:
                boolean r2 = r0.N
                r2 = r2 | r6
                boolean r3 = r0.M
                if (r3 == 0) goto L_0x0332
                r6 = 2
            L_0x0332:
                r2 = r2 | r6
                boolean r3 = b.a.a.a.r0.j.f(r9)
                if (r3 == 0) goto L_0x035f
                java.lang.String r20 = java.lang.Integer.toString(r45)
                r22 = 0
                r23 = -1
                int r3 = r0.G
                int r4 = r0.I
                b.a.a.a.j0.a r6 = r0.i
                java.lang.String r7 = r0.O
                r21 = r9
                r24 = r32
                r25 = r3
                r26 = r4
                r28 = r1
                r29 = r6
                r30 = r2
                r31 = r7
                b.a.a.a.n r1 = b.a.a.a.n.g(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x045e
            L_0x035f:
                boolean r3 = b.a.a.a.r0.j.h(r9)
                if (r3 == 0) goto L_0x03d9
                int r2 = r0.n
                if (r2 != 0) goto L_0x037b
                int r2 = r0.l
                r3 = -1
                if (r2 != r3) goto L_0x0370
                int r2 = r0.j
            L_0x0370:
                r0.l = r2
                int r2 = r0.m
                if (r2 != r3) goto L_0x0378
                int r2 = r0.k
            L_0x0378:
                r0.m = r2
                goto L_0x037c
            L_0x037b:
                r3 = -1
            L_0x037c:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = r0.l
                if (r4 == r3) goto L_0x0394
                int r5 = r0.m
                if (r5 == r3) goto L_0x0394
                int r2 = r0.k
                int r2 = r2 * r4
                float r2 = (float) r2
                int r3 = r0.j
                int r3 = r3 * r5
                float r3 = (float) r3
                float r2 = r2 / r3
                r38 = r2
                goto L_0x0396
            L_0x0394:
                r38 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x0396:
                boolean r2 = r0.q
                if (r2 == 0) goto L_0x03ac
                byte[] r2 = r43.b()
                b.a.a.a.s0.b r3 = new b.a.a.a.s0.b
                int r4 = r0.r
                int r5 = r0.t
                int r6 = r0.s
                r3.<init>(r4, r5, r6, r2)
                r41 = r3
                goto L_0x03ae
            L_0x03ac:
                r41 = r19
            L_0x03ae:
                java.lang.String r28 = java.lang.Integer.toString(r45)
                r30 = 0
                r31 = -1
                int r2 = r0.j
                int r3 = r0.k
                r35 = -1082130432(0xffffffffbf800000, float:-1.0)
                r37 = -1
                byte[] r4 = r0.o
                int r5 = r0.p
                b.a.a.a.j0.a r6 = r0.i
                r29 = r9
                r33 = r2
                r34 = r3
                r36 = r1
                r39 = r4
                r40 = r5
                r42 = r6
                b.a.a.a.n r1 = b.a.a.a.n.q(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
                r5 = 2
                goto L_0x045e
            L_0x03d9:
                boolean r3 = r15.equals(r9)
                if (r3 == 0) goto L_0x03ee
                java.lang.String r1 = java.lang.Integer.toString(r45)
                java.lang.String r3 = r0.O
                b.a.a.a.j0.a r4 = r0.i
                b.a.a.a.n r1 = b.a.a.a.n.m(r1, r9, r2, r3, r4)
            L_0x03eb:
                r5 = 3
                goto L_0x045e
            L_0x03ee:
                boolean r3 = r14.equals(r9)
                if (r3 == 0) goto L_0x0428
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 2
                r1.<init>(r3)
                byte[] r3 = b.a.a.a.k0.p.d.b0
                r1.add(r3)
                byte[] r3 = r0.h
                r1.add(r3)
                java.lang.String r28 = java.lang.Integer.toString(r45)
                r30 = 0
                r31 = -1
                java.lang.String r3 = r0.O
                r34 = -1
                b.a.a.a.j0.a r4 = r0.i
                r36 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r29 = r9
                r32 = r2
                r33 = r3
                r35 = r4
                r38 = r1
                b.a.a.a.n r1 = b.a.a.a.n.o(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
                goto L_0x03eb
            L_0x0428:
                boolean r3 = r13.equals(r9)
                if (r3 != 0) goto L_0x0443
                boolean r3 = r12.equals(r9)
                if (r3 != 0) goto L_0x0443
                boolean r3 = r11.equals(r9)
                if (r3 == 0) goto L_0x043b
                goto L_0x0443
            L_0x043b:
                b.a.a.a.u r1 = new b.a.a.a.u
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>(r2)
                throw r1
            L_0x0443:
                java.lang.String r28 = java.lang.Integer.toString(r45)
                r30 = 0
                r31 = -1
                java.lang.String r3 = r0.O
                b.a.a.a.j0.a r4 = r0.i
                r29 = r9
                r32 = r2
                r33 = r1
                r34 = r3
                r35 = r4
                b.a.a.a.n r1 = b.a.a.a.n.i(r28, r29, r30, r31, r32, r33, r34, r35)
                goto L_0x03eb
            L_0x045e:
                int r2 = r0.f343b
                r3 = r44
                b.a.a.a.k0.n r2 = r3.f(r2, r5)
                r0.P = r2
                r2.c(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.p.d.c.c(b.a.a.a.k0.g, int):void");
        }

        public void d() {
            C0021d dVar = this.L;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void h() {
            C0021d dVar = this.L;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* renamed from: b.a.a.a.k0.p.d$d  reason: collision with other inner class name */
    private static final class C0021d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f344a = new byte[12];

        /* renamed from: b  reason: collision with root package name */
        private boolean f345b;
        private int c;
        private int d;
        private long e;
        private int f;

        public void a(c cVar) {
            if (this.f345b && this.c > 0) {
                cVar.P.d(this.e, this.f, this.d, 0, cVar.g);
                this.c = 0;
            }
        }

        public void b() {
            this.f345b = false;
        }

        public void c(c cVar, long j) {
            if (this.f345b) {
                int i = this.c;
                int i2 = i + 1;
                this.c = i2;
                if (i == 0) {
                    this.e = j;
                }
                if (i2 >= 8) {
                    cVar.P.d(this.e, this.f, this.d, 0, cVar.g);
                    this.c = 0;
                }
            }
        }

        public void d(f fVar, int i, int i2) {
            if (!this.f345b) {
                fVar.h(this.f344a, 0, 12);
                fVar.b();
                if (b.a.a.a.h0.a.i(this.f344a) != -1) {
                    this.f345b = true;
                    this.c = 0;
                } else {
                    return;
                }
            }
            if (this.c == 0) {
                this.f = i;
                this.d = 0;
            }
            this.d += i2;
        }
    }

    public d(int i2) {
        this(new a(), i2);
    }

    d(b bVar, int i2) {
        this.p = -1;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1;
        this.z = -1;
        this.A = -9223372036854775807L;
        this.f339a = bVar;
        bVar.b(new b(this, (a) null));
        this.d = (i2 & 1) != 0 ? false : true;
        this.f340b = new f();
        this.c = new SparseArray<>();
        this.g = new m(4);
        this.h = new m(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new m(4);
        this.e = new m(k.f726a);
        this.f = new m(4);
        this.j = new m();
        this.k = new m();
        this.l = new m(8);
        this.m = new m();
    }

    private void B(f fVar, c cVar, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(cVar.f342a)) {
            C(fVar, Z, i2);
        } else if ("S_TEXT/ASS".equals(cVar.f342a)) {
            C(fVar, c0, i2);
        } else {
            n nVar = cVar.P;
            boolean z2 = true;
            if (!this.O) {
                if (cVar.e) {
                    this.M &= -1073741825;
                    int i4 = 128;
                    if (!this.P) {
                        fVar.i(this.g.f734a, 0, 1);
                        this.N++;
                        byte[] bArr = this.g.f734a;
                        if ((bArr[0] & 128) != 128) {
                            this.S = bArr[0];
                            this.P = true;
                        } else {
                            throw new u("Extension bit is set in signal byte");
                        }
                    }
                    byte b2 = this.S;
                    if ((b2 & 1) == 1) {
                        boolean z3 = (b2 & 2) == 2;
                        this.M |= 1073741824;
                        if (!this.Q) {
                            fVar.i(this.l.f734a, 0, 8);
                            this.N += 8;
                            this.Q = true;
                            m mVar = this.g;
                            byte[] bArr2 = mVar.f734a;
                            if (!z3) {
                                i4 = 0;
                            }
                            bArr2[0] = (byte) (i4 | 8);
                            mVar.J(0);
                            nVar.a(this.g, 1);
                            this.V++;
                            this.l.J(0);
                            nVar.a(this.l, 8);
                            this.V += 8;
                        }
                        if (z3) {
                            if (!this.R) {
                                fVar.i(this.g.f734a, 0, 1);
                                this.N++;
                                this.g.J(0);
                                this.T = this.g.x();
                                this.R = true;
                            }
                            int i5 = this.T * 4;
                            this.g.G(i5);
                            fVar.i(this.g.f734a, 0, i5);
                            this.N += i5;
                            short s2 = (short) ((this.T / 2) + 1);
                            int i6 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.n;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.n = ByteBuffer.allocate(i6);
                            }
                            this.n.position(0);
                            this.n.putShort(s2);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i3 = this.T;
                                if (i7 >= i3) {
                                    break;
                                }
                                int B2 = this.g.B();
                                if (i7 % 2 == 0) {
                                    this.n.putShort((short) (B2 - i8));
                                } else {
                                    this.n.putInt(B2 - i8);
                                }
                                i7++;
                                i8 = B2;
                            }
                            int i9 = (i2 - this.N) - i8;
                            int i10 = i3 % 2;
                            ByteBuffer byteBuffer2 = this.n;
                            if (i10 == 1) {
                                byteBuffer2.putInt(i9);
                            } else {
                                byteBuffer2.putShort((short) i9);
                                this.n.putInt(0);
                            }
                            this.m.H(this.n.array(), i6);
                            nVar.a(this.m, i6);
                            this.V += i6;
                        }
                    }
                } else {
                    byte[] bArr3 = cVar.f;
                    if (bArr3 != null) {
                        this.j.H(bArr3, bArr3.length);
                    }
                }
                this.O = true;
            }
            int d2 = i2 + this.j.d();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f342a) && !"V_MPEGH/ISO/HEVC".equals(cVar.f342a)) {
                if (cVar.L != null) {
                    if (this.j.d() != 0) {
                        z2 = false;
                    }
                    b.a.a.a.r0.a.f(z2);
                    cVar.L.d(fVar, this.M, d2);
                }
                while (true) {
                    int i11 = this.N;
                    if (i11 >= d2) {
                        break;
                    }
                    u(fVar, nVar, d2 - i11);
                }
            } else {
                byte[] bArr4 = this.f.f734a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i12 = cVar.Q;
                int i13 = 4 - i12;
                while (this.N < d2) {
                    int i14 = this.U;
                    if (i14 == 0) {
                        v(fVar, bArr4, i13, i12);
                        this.f.J(0);
                        this.U = this.f.B();
                        this.e.J(0);
                        nVar.a(this.e, 4);
                        this.V += 4;
                    } else {
                        this.U = i14 - u(fVar, nVar, i14);
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f342a)) {
                this.h.J(0);
                nVar.a(this.h, 4);
                this.V += 4;
            }
        }
    }

    private void C(f fVar, byte[] bArr, int i2) {
        int length = bArr.length + i2;
        if (this.k.b() < length) {
            this.k.f734a = Arrays.copyOf(bArr, length + i2);
        } else {
            System.arraycopy(bArr, 0, this.k.f734a, 0, bArr.length);
        }
        fVar.i(this.k.f734a, bArr.length, i2);
        this.k.G(length);
    }

    private l i() {
        h hVar;
        h hVar2;
        if (this.p == -1 || this.s == -9223372036854775807L || (hVar = this.B) == null || hVar.c() == 0 || (hVar2 = this.C) == null || hVar2.c() != this.B.c()) {
            this.B = null;
            this.C = null;
            return new l.b(this.s);
        }
        int c2 = this.B.c();
        int[] iArr = new int[c2];
        long[] jArr = new long[c2];
        long[] jArr2 = new long[c2];
        long[] jArr3 = new long[c2];
        int i2 = 0;
        for (int i3 = 0; i3 < c2; i3++) {
            jArr3[i3] = this.B.b(i3);
            jArr[i3] = this.p + this.C.b(i3);
        }
        while (true) {
            int i4 = c2 - 1;
            if (i2 < i4) {
                int i5 = i2 + 1;
                iArr[i2] = (int) (jArr[i5] - jArr[i2]);
                jArr2[i2] = jArr3[i5] - jArr3[i2];
                i2 = i5;
            } else {
                iArr[i4] = (int) ((this.p + this.o) - jArr[i4]);
                jArr2[i4] = this.s - jArr3[i4];
                this.B = null;
                this.C = null;
                return new b.a.a.a.k0.a(iArr, jArr, jArr2, jArr3);
            }
        }
    }

    private void j(c cVar, long j2) {
        c cVar2 = cVar;
        C0021d dVar = cVar2.L;
        long j3 = j2;
        if (dVar != null) {
            dVar.c(cVar2, j3);
        } else {
            if ("S_TEXT/UTF8".equals(cVar2.f342a)) {
                k(cVar, "%02d:%02d:%02d,%03d", 19, 1000, a0);
            } else if ("S_TEXT/ASS".equals(cVar2.f342a)) {
                k(cVar, "%01d:%02d:%02d:%02d", 21, 10000, d0);
            }
            cVar2.P.d(j2, this.M, this.V, 0, cVar2.g);
        }
        this.W = true;
        w();
    }

    private void k(c cVar, String str, int i2, long j2, byte[] bArr) {
        y(this.k.f734a, this.G, str, i2, j2, bArr);
        n nVar = cVar.P;
        m mVar = this.k;
        nVar.a(mVar, mVar.d());
        this.V += this.k.d();
    }

    private static int[] m(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    private static boolean q(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    private boolean s(b.a.a.a.k0.k kVar, long j2) {
        if (this.x) {
            this.z = j2;
            kVar.f320a = this.y;
            this.x = false;
            return true;
        }
        if (this.u) {
            long j3 = this.z;
            if (j3 != -1) {
                kVar.f320a = j3;
                this.z = -1;
                return true;
            }
        }
        return false;
    }

    private void t(f fVar, int i2) {
        if (this.g.d() < i2) {
            if (this.g.b() < i2) {
                m mVar = this.g;
                byte[] bArr = mVar.f734a;
                mVar.H(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i2)), this.g.d());
            }
            m mVar2 = this.g;
            fVar.i(mVar2.f734a, mVar2.d(), i2 - this.g.d());
            this.g.I(i2);
        }
    }

    private int u(f fVar, n nVar, int i2) {
        int i3;
        int a2 = this.j.a();
        if (a2 > 0) {
            i3 = Math.min(i2, a2);
            nVar.a(this.j, i3);
        } else {
            i3 = nVar.b(fVar, i2, false);
        }
        this.N += i3;
        this.V += i3;
        return i3;
    }

    private void v(f fVar, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, this.j.a());
        fVar.i(bArr, i2 + min, i3 - min);
        if (min > 0) {
            this.j.g(bArr, i2, min);
        }
        this.N += i3;
    }

    private void w() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = 0;
        this.Q = false;
        this.j.F();
    }

    private long x(long j2) {
        long j3 = this.q;
        if (j3 != -9223372036854775807L) {
            return w.C(j2, j3, 1000);
        }
        throw new u("Can't scale timecode prior to timecodeScale being set.");
    }

    private static void y(byte[] bArr, long j2, String str, int i2, long j3, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        if (j2 == -9223372036854775807L) {
            bArr4 = bArr2;
            bArr3 = bArr4;
        } else {
            int i3 = (int) (j2 / 3600000000L);
            long j4 = j2 - (((long) (i3 * 3600)) * 1000000);
            int i4 = (int) (j4 / 60000000);
            long j5 = j4 - (((long) (i4 * 60)) * 1000000);
            int i5 = (int) (j5 / 1000000);
            int i6 = (int) ((j5 - (((long) i5) * 1000000)) / j3);
            Locale locale = Locale.US;
            Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
            String str2 = str;
            bArr4 = w.v(String.format(locale, str, objArr));
            bArr3 = bArr2;
        }
        byte[] bArr5 = bArr;
        int i7 = i2;
        System.arraycopy(bArr4, 0, bArr, i2, bArr3.length);
    }

    /* access modifiers changed from: package-private */
    public void A(int i2, String str) {
        if (i2 == 134) {
            this.t.f342a = str;
        } else if (i2 != 17026) {
            if (i2 == 2274716) {
                String unused = this.t.O = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new u("DocType " + str + " not supported");
        }
    }

    public void a() {
    }

    public void d(g gVar) {
        this.Y = gVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f1, code lost:
        throw new b.a.a.a.u("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0243  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r20, int r21, b.a.a.a.k0.f r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            if (r1 == r4) goto L_0x008e
            if (r1 == r5) goto L_0x008e
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0083
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0073
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0053
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0048
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0031
            b.a.a.a.k0.p.d$c r1 = r0.t
            byte[] r4 = new byte[r2]
            r1.o = r4
            r3.i(r4, r6, r2)
            goto L_0x02a0
        L_0x0031:
            b.a.a.a.u r2 = new b.a.a.a.u
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0048:
            b.a.a.a.k0.p.d$c r1 = r0.t
            byte[] r4 = new byte[r2]
            r1.h = r4
            r3.i(r4, r6, r2)
            goto L_0x02a0
        L_0x0053:
            b.a.a.a.r0.m r1 = r0.i
            byte[] r1 = r1.f734a
            java.util.Arrays.fill(r1, r6)
            b.a.a.a.r0.m r1 = r0.i
            byte[] r1 = r1.f734a
            int r4 = 4 - r2
            r3.i(r1, r4, r2)
            b.a.a.a.r0.m r1 = r0.i
            r1.J(r6)
            b.a.a.a.r0.m r1 = r0.i
            long r1 = r1.z()
            int r2 = (int) r1
            r0.v = r2
            goto L_0x02a0
        L_0x0073:
            byte[] r1 = new byte[r2]
            r3.i(r1, r6, r2)
            b.a.a.a.k0.p.d$c r2 = r0.t
            b.a.a.a.k0.n$a r3 = new b.a.a.a.k0.n$a
            r3.<init>(r7, r1, r6, r6)
            r2.g = r3
            goto L_0x02a0
        L_0x0083:
            b.a.a.a.k0.p.d$c r1 = r0.t
            byte[] r4 = new byte[r2]
            r1.f = r4
            r3.i(r4, r6, r2)
            goto L_0x02a0
        L_0x008e:
            int r4 = r0.E
            r8 = 8
            if (r4 != 0) goto L_0x00b3
            b.a.a.a.k0.p.f r4 = r0.f340b
            long r9 = r4.d(r3, r6, r7, r8)
            int r4 = (int) r9
            r0.K = r4
            b.a.a.a.k0.p.f r4 = r0.f340b
            int r4 = r4.b()
            r0.L = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.G = r9
            r0.E = r7
            b.a.a.a.r0.m r4 = r0.g
            r4.F()
        L_0x00b3:
            android.util.SparseArray<b.a.a.a.k0.p.d$c> r4 = r0.c
            int r9 = r0.K
            java.lang.Object r4 = r4.get(r9)
            b.a.a.a.k0.p.d$c r4 = (b.a.a.a.k0.p.d.c) r4
            if (r4 != 0) goto L_0x00c9
            int r1 = r0.L
            int r1 = r2 - r1
            r3.c(r1)
            r0.E = r6
            return
        L_0x00c9:
            int r9 = r0.E
            if (r9 != r7) goto L_0x026d
            r9 = 3
            r0.t(r3, r9)
            b.a.a.a.r0.m r10 = r0.g
            byte[] r10 = r10.f734a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r7
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00f2
            r0.I = r7
            int[] r10 = r0.J
            int[] r10 = m(r10, r7)
            r0.J = r10
            int r13 = r0.L
            int r2 = r2 - r13
            int r2 = r2 - r9
            r10[r6] = r2
        L_0x00ef:
            r6 = 1
            goto L_0x0205
        L_0x00f2:
            if (r1 != r5) goto L_0x0265
            r13 = 4
            r0.t(r3, r13)
            b.a.a.a.r0.m r14 = r0.g
            byte[] r14 = r14.f734a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r7
            r0.I = r14
            int[] r15 = r0.J
            int[] r14 = m(r15, r14)
            r0.J = r14
            if (r10 != r11) goto L_0x0117
            int r9 = r0.L
            int r2 = r2 - r9
            int r2 = r2 - r13
            int r9 = r0.I
            int r2 = r2 / r9
            java.util.Arrays.fill(r14, r6, r9, r2)
            goto L_0x00ef
        L_0x0117:
            if (r10 != r7) goto L_0x014d
            r9 = 0
            r10 = 0
        L_0x011b:
            int r14 = r0.I
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x0142
            int[] r14 = r0.J
            r14[r9] = r6
        L_0x0125:
            int r13 = r13 + r7
            r0.t(r3, r13)
            b.a.a.a.r0.m r14 = r0.g
            byte[] r14 = r14.f734a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.J
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0125
            r14 = r15[r9]
            int r10 = r10 + r14
            int r9 = r9 + 1
            goto L_0x011b
        L_0x0142:
            int[] r9 = r0.J
            int r14 = r14 - r7
            int r15 = r0.L
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x00ef
        L_0x014d:
            if (r10 != r9) goto L_0x024e
            r9 = 0
            r10 = 0
        L_0x0151:
            int r14 = r0.I
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x01fa
            int[] r14 = r0.J
            r14[r9] = r6
            int r13 = r13 + 1
            r0.t(r3, r13)
            b.a.a.a.r0.m r14 = r0.g
            byte[] r14 = r14.f734a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01f2
            r16 = 0
            r14 = 0
        L_0x016d:
            if (r14 >= r8) goto L_0x01bf
            int r18 = 7 - r14
            int r18 = r7 << r18
            b.a.a.a.r0.m r5 = r0.g
            byte[] r5 = r5.f734a
            byte r5 = r5[r15]
            r5 = r5 & r18
            if (r5 == 0) goto L_0x01b5
            int r13 = r13 + r14
            r0.t(r3, r13)
            b.a.a.a.r0.m r5 = r0.g
            byte[] r5 = r5.f734a
            int r16 = r15 + 1
            byte r5 = r5[r15]
            r5 = r5 & r12
            r15 = r18 ^ -1
            r5 = r5 & r15
            long r6 = (long) r5
            r5 = r16
        L_0x0190:
            r16 = r6
            if (r5 >= r13) goto L_0x01a7
            long r6 = r16 << r8
            b.a.a.a.r0.m r15 = r0.g
            byte[] r15 = r15.f734a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r12
            long r11 = (long) r5
            long r6 = r6 | r11
            r5 = r16
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0190
        L_0x01a7:
            if (r9 <= 0) goto L_0x01bf
            int r14 = r14 * 7
            int r14 = r14 + 6
            r5 = 1
            long r11 = r5 << r14
            long r11 = r11 - r5
            long r16 = r16 - r11
            goto L_0x01bf
        L_0x01b5:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x016d
        L_0x01bf:
            r5 = r16
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01ea
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01ea
            int r6 = (int) r5
            int[] r5 = r0.J
            if (r9 != 0) goto L_0x01d5
            goto L_0x01da
        L_0x01d5:
            int r7 = r9 + -1
            r7 = r5[r7]
            int r6 = r6 + r7
        L_0x01da:
            r5[r9] = r6
            r5 = r5[r9]
            int r10 = r10 + r5
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0151
        L_0x01ea:
            b.a.a.a.u r1 = new b.a.a.a.u
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01f2:
            b.a.a.a.u r1 = new b.a.a.a.u
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01fa:
            int[] r5 = r0.J
            r6 = 1
            int r14 = r14 - r6
            int r7 = r0.L
            int r2 = r2 - r7
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x0205:
            b.a.a.a.r0.m r2 = r0.g
            byte[] r2 = r2.f734a
            r5 = 0
            byte r7 = r2[r5]
            int r5 = r7 << 8
            byte r2 = r2[r6]
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = r0.A
            long r9 = (long) r2
            long r9 = r0.x(r9)
            long r5 = r5 + r9
            r0.F = r5
            b.a.a.a.r0.m r2 = r0.g
            byte[] r2 = r2.f734a
            r5 = 2
            byte r6 = r2[r5]
            r6 = r6 & r8
            if (r6 != r8) goto L_0x022a
            r6 = 1
            goto L_0x022b
        L_0x022a:
            r6 = 0
        L_0x022b:
            int r7 = r4.c
            if (r7 == r5) goto L_0x023d
            r7 = 163(0xa3, float:2.28E-43)
            if (r1 != r7) goto L_0x023b
            byte r2 = r2[r5]
            r5 = 128(0x80, float:1.794E-43)
            r2 = r2 & r5
            if (r2 != r5) goto L_0x023b
            goto L_0x023d
        L_0x023b:
            r2 = 0
            goto L_0x023e
        L_0x023d:
            r2 = 1
        L_0x023e:
            if (r6 == 0) goto L_0x0243
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0244
        L_0x0243:
            r5 = 0
        L_0x0244:
            r2 = r2 | r5
            r0.M = r2
            r2 = 2
            r0.E = r2
            r2 = 0
            r0.H = r2
            goto L_0x026d
        L_0x024e:
            b.a.a.a.u r1 = new b.a.a.a.u
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected lacing value: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0265:
            b.a.a.a.u r1 = new b.a.a.a.u
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x026d:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x0298
        L_0x0271:
            int r1 = r0.H
            int r2 = r0.I
            if (r1 >= r2) goto L_0x0294
            int[] r2 = r0.J
            r1 = r2[r1]
            r0.B(r3, r4, r1)
            long r1 = r0.F
            int r5 = r0.H
            int r6 = r4.d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.j(r4, r1)
            int r1 = r0.H
            r2 = 1
            int r1 = r1 + r2
            r0.H = r1
            goto L_0x0271
        L_0x0294:
            r1 = 0
            r0.E = r1
            goto L_0x02a0
        L_0x0298:
            r1 = 0
            int[] r2 = r0.J
            r1 = r2[r1]
            r0.B(r3, r4, r1)
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.p.d.e(int, int, b.a.a.a.k0.f):void");
    }

    public void f(long j2, long j3) {
        this.A = -9223372036854775807L;
        this.E = 0;
        this.f339a.reset();
        this.f340b.e();
        w();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.c.valueAt(i2).h();
        }
    }

    public int g(f fVar, b.a.a.a.k0.k kVar) {
        this.W = false;
        boolean z2 = true;
        while (z2 && !this.W) {
            z2 = this.f339a.a(fVar);
            if (z2 && s(kVar, fVar.k())) {
                return 1;
            }
        }
        if (z2) {
            return 0;
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.c.valueAt(i2).d();
        }
        return -1;
    }

    public boolean h(f fVar) {
        return new e().b(fVar);
    }

    /* access modifiers changed from: package-private */
    public void l(int i2) {
        if (i2 != 160) {
            if (i2 == 174) {
                if (q(this.t.f342a)) {
                    c cVar = this.t;
                    cVar.c(this.Y, cVar.f343b);
                    SparseArray<c> sparseArray = this.c;
                    c cVar2 = this.t;
                    sparseArray.put(cVar2.f343b, cVar2);
                }
                this.t = null;
            } else if (i2 == 19899) {
                int i3 = this.v;
                if (i3 != -1) {
                    long j2 = this.w;
                    if (j2 != -1) {
                        if (i3 == 475249515) {
                            this.y = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new u("Mandatory element SeekID or SeekPosition not found");
            } else if (i2 == 25152) {
                c cVar3 = this.t;
                if (!cVar3.e) {
                    return;
                }
                if (cVar3.g != null) {
                    cVar3.i = new b.a.a.a.j0.a(new a.b(b.a.a.a.b.f225b, "video/webm", this.t.g.f328b));
                    return;
                }
                throw new u("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i2 == 28032) {
                c cVar4 = this.t;
                if (cVar4.e && cVar4.f != null) {
                    throw new u("Combining encryption and compression is not supported");
                }
            } else if (i2 == 357149030) {
                if (this.q == -9223372036854775807L) {
                    this.q = 1000000;
                }
                long j3 = this.r;
                if (j3 != -9223372036854775807L) {
                    this.s = x(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515 && !this.u) {
                    this.Y.c(i());
                    this.u = true;
                }
            } else if (this.c.size() != 0) {
                this.Y.d();
            } else {
                throw new u("No valid tracks were found");
            }
        } else if (this.E == 2) {
            if (!this.X) {
                this.M |= 1;
            }
            j(this.c.get(this.K), this.F);
            this.E = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i2, double d2) {
        if (i2 == 181) {
            this.t.I = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.t.w = (float) d2;
                    return;
                case 21970:
                    this.t.x = (float) d2;
                    return;
                case 21971:
                    this.t.y = (float) d2;
                    return;
                case 21972:
                    this.t.z = (float) d2;
                    return;
                case 21973:
                    this.t.A = (float) d2;
                    return;
                case 21974:
                    this.t.B = (float) d2;
                    return;
                case 21975:
                    this.t.C = (float) d2;
                    return;
                case 21976:
                    this.t.D = (float) d2;
                    return;
                case 21977:
                    this.t.E = (float) d2;
                    return;
                case 21978:
                    this.t.F = (float) d2;
                    return;
                default:
                    return;
            }
        } else {
            this.r = (long) d2;
        }
    }

    /* access modifiers changed from: package-private */
    public int o(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i2, long j2) {
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        this.t.c = (int) j2;
                        return;
                    case 136:
                        c cVar = this.t;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        cVar.M = z2;
                        return;
                    case 155:
                        this.G = x(j2);
                        return;
                    case 159:
                        this.t.G = (int) j2;
                        return;
                    case 176:
                        this.t.j = (int) j2;
                        return;
                    case 179:
                        this.B.a(x(j2));
                        return;
                    case 186:
                        this.t.k = (int) j2;
                        return;
                    case 215:
                        this.t.f343b = (int) j2;
                        return;
                    case 231:
                        this.A = x(j2);
                        return;
                    case 241:
                        if (!this.D) {
                            this.C.a(j2);
                            this.D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.X = true;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            throw new u("ContentCompAlgo " + j2 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            throw new u("DocTypeReadVersion " + j2 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            throw new u("EBMLReadVersion " + j2 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            throw new u("ContentEncAlgo " + j2 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            throw new u("AESSettingsCipherMode " + j2 + " not supported");
                        }
                        return;
                    case 21420:
                        this.w = j2 + this.p;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            this.t.p = 0;
                            return;
                        } else if (i3 == 1) {
                            this.t.p = 2;
                            return;
                        } else if (i3 == 3) {
                            this.t.p = 1;
                            return;
                        } else if (i3 == 15) {
                            this.t.p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.t.l = (int) j2;
                        return;
                    case 21682:
                        this.t.n = (int) j2;
                        return;
                    case 21690:
                        this.t.m = (int) j2;
                        return;
                    case 21930:
                        c cVar2 = this.t;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        cVar2.N = z2;
                        return;
                    case 22186:
                        this.t.J = j2;
                        return;
                    case 22203:
                        this.t.K = j2;
                        return;
                    case 25188:
                        this.t.H = (int) j2;
                        return;
                    case 2352003:
                        this.t.d = (int) j2;
                        return;
                    case 2807729:
                        this.q = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                int i4 = (int) j2;
                                if (i4 == 1) {
                                    this.t.t = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.t.t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j2;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.t.s = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.t.s = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.t.s = 3;
                                return;
                            case 21947:
                                c cVar3 = this.t;
                                cVar3.q = true;
                                int i6 = (int) j2;
                                if (i6 == 1) {
                                    cVar3.r = 1;
                                    return;
                                } else if (i6 == 9) {
                                    cVar3.r = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    cVar3.r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.t.u = (int) j2;
                                return;
                            case 21949:
                                this.t.v = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                throw new u("ContentEncodingScope " + j2 + " not supported");
            }
        } else if (j2 != 0) {
            throw new u("ContentEncodingOrder " + j2 + " not supported");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    /* access modifiers changed from: package-private */
    public void z(int i2, long j2, long j3) {
        if (i2 == 160) {
            this.X = false;
        } else if (i2 == 174) {
            this.t = new c((a) null);
        } else if (i2 == 187) {
            this.D = false;
        } else if (i2 == 19899) {
            this.v = -1;
            this.w = -1;
        } else if (i2 == 20533) {
            this.t.e = true;
        } else if (i2 == 21968) {
            this.t.q = true;
        } else if (i2 == 408125543) {
            long j4 = this.p;
            if (j4 == -1 || j4 == j2) {
                this.p = j2;
                this.o = j3;
                return;
            }
            throw new u("Multiple Segment elements not supported");
        } else if (i2 == 475249515) {
            this.B = new h();
            this.C = new h();
        } else if (i2 != 524531317 || this.u) {
        } else {
            if (!this.d || this.y == -1) {
                this.Y.c(new l.b(this.s));
                this.u = true;
                return;
            }
            this.x = true;
        }
    }
}
