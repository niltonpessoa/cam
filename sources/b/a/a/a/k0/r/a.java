package b.a.a.a.k0.r;

import b.a.a.a.r0.m;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class a {
    public static final int A = w.o("trun");
    public static final int A0 = w.o("udta");
    public static final int B = w.o("sidx");
    public static final int B0 = w.o("meta");
    public static final int C = w.o("moov");
    public static final int C0 = w.o("ilst");
    public static final int D = w.o("mvhd");
    public static final int D0 = w.o("mean");
    public static final int E = w.o("trak");
    public static final int E0 = w.o("name");
    public static final int F = w.o("mdia");
    public static final int F0 = w.o("data");
    public static final int G = w.o("minf");
    public static final int G0 = w.o("emsg");
    public static final int H = w.o("stbl");
    public static final int H0 = w.o("st3d");
    public static final int I = w.o("avcC");
    public static final int I0 = w.o("sv3d");
    public static final int J = w.o("hvcC");
    public static final int J0 = w.o("proj");
    public static final int K = w.o("esds");
    public static final int K0 = w.o("vp08");
    public static final int L = w.o("moof");
    public static final int L0 = w.o("vp09");
    public static final int M = w.o("traf");
    public static final int M0 = w.o("vpcC");
    public static final int N = w.o("mvex");
    public static final int N0 = w.o("camm");
    public static final int O = w.o("mehd");
    public static final int O0 = w.o("alac");
    public static final int P = w.o("tkhd");
    public static final int Q = w.o("edts");
    public static final int R = w.o("elst");
    public static final int S = w.o("mdhd");
    public static final int T = w.o("hdlr");
    public static final int U = w.o("stsd");
    public static final int V = w.o("pssh");
    public static final int W = w.o("sinf");
    public static final int X = w.o("schm");
    public static final int Y = w.o("schi");
    public static final int Z = w.o("tenc");
    public static final int a0 = w.o("encv");

    /* renamed from: b  reason: collision with root package name */
    public static final int f358b = w.o("ftyp");
    public static final int b0 = w.o("enca");
    public static final int c = w.o("avc1");
    public static final int c0 = w.o("frma");
    public static final int d = w.o("avc3");
    public static final int d0 = w.o("saiz");
    public static final int e = w.o("hvc1");
    public static final int e0 = w.o("saio");
    public static final int f = w.o("hev1");
    public static final int f0 = w.o("sbgp");
    public static final int g = w.o("s263");
    public static final int g0 = w.o("sgpd");
    public static final int h = w.o("d263");
    public static final int h0 = w.o("uuid");
    public static final int i = w.o("mdat");
    public static final int i0 = w.o("senc");
    public static final int j = w.o("mp4a");
    public static final int j0 = w.o("pasp");
    public static final int k = w.o(".mp3");
    public static final int k0 = w.o("TTML");
    public static final int l = w.o("wave");
    public static final int l0 = w.o("mp4v");
    public static final int m = w.o("lpcm");
    public static final int m0 = w.o("stts");
    public static final int n = w.o("sowt");
    public static final int n0 = w.o("stss");
    public static final int o = w.o("ac-3");
    public static final int o0 = w.o("ctts");
    public static final int p = w.o("dac3");
    public static final int p0 = w.o("stsc");
    public static final int q = w.o("ec-3");
    public static final int q0 = w.o("stsz");
    public static final int r = w.o("dec3");
    public static final int r0 = w.o("stz2");
    public static final int s = w.o("dtsc");
    public static final int s0 = w.o("stco");
    public static final int t = w.o("dtsh");
    public static final int t0 = w.o("co64");
    public static final int u = w.o("dtsl");
    public static final int u0 = w.o("tx3g");
    public static final int v = w.o("dtse");
    public static final int v0 = w.o("wvtt");
    public static final int w = w.o("ddts");
    public static final int w0 = w.o("stpp");
    public static final int x = w.o("tfdt");
    public static final int x0 = w.o("c608");
    public static final int y = w.o("tfhd");
    public static final int y0 = w.o("samr");
    public static final int z = w.o("trex");
    public static final int z0 = w.o("sawb");

    /* renamed from: a  reason: collision with root package name */
    public final int f359a;

    /* renamed from: b.a.a.a.k0.r.a$a  reason: collision with other inner class name */
    static final class C0022a extends a {
        public final long P0;
        public final List<b> Q0 = new ArrayList();
        public final List<C0022a> R0 = new ArrayList();

        public C0022a(int i, long j) {
            super(i);
            this.P0 = j;
        }

        public void d(C0022a aVar) {
            this.R0.add(aVar);
        }

        public void e(b bVar) {
            this.Q0.add(bVar);
        }

        public C0022a f(int i) {
            int size = this.R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0022a aVar = this.R0.get(i2);
                if (aVar.f359a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i) {
            int size = this.Q0.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.Q0.get(i2);
                if (bVar.f359a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return a.a(this.f359a) + " leaves: " + Arrays.toString(this.Q0.toArray()) + " containers: " + Arrays.toString(this.R0.toArray());
        }
    }

    static final class b extends a {
        public final m P0;

        public b(int i, m mVar) {
            super(i);
            this.P0 = mVar;
        }
    }

    static {
        w.o("vmhd");
    }

    public a(int i2) {
        this.f359a = i2;
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static int c(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.f359a);
    }
}
