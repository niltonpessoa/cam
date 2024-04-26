package b.a.a.a.k0.r;

import android.util.Log;
import b.a.a.a.m0.a;
import b.a.a.a.m0.i.a;
import b.a.a.a.m0.i.e;
import b.a.a.a.m0.i.h;
import b.a.a.a.m0.i.j;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;

final class f {
    private static final int A = w.o("sosn");
    private static final int B = w.o("tvsh");
    private static final int C = w.o("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a  reason: collision with root package name */
    private static final int f382a = w.o("nam");

    /* renamed from: b  reason: collision with root package name */
    private static final int f383b = w.o("trk");
    private static final int c = w.o("cmt");
    private static final int d = w.o("day");
    private static final int e = w.o("ART");
    private static final int f = w.o("too");
    private static final int g = w.o("alb");
    private static final int h = w.o("com");
    private static final int i = w.o("wrt");
    private static final int j = w.o("lyr");
    private static final int k = w.o("gen");
    private static final int l = w.o("covr");
    private static final int m = w.o("gnre");
    private static final int n = w.o("grp");
    private static final int o = w.o("disk");
    private static final int p = w.o("trkn");
    private static final int q = w.o("tmpo");
    private static final int r = w.o("cpil");
    private static final int s = w.o("aART");
    private static final int t = w.o("sonm");
    private static final int u = w.o("soal");
    private static final int v = w.o("soar");
    private static final int w = w.o("soaa");
    private static final int x = w.o("soco");
    private static final int y = w.o("rtng");
    private static final int z = w.o("pgap");

    private static e a(int i2, m mVar) {
        int i3 = mVar.i();
        if (mVar.i() == a.F0) {
            mVar.K(8);
            String s2 = mVar.s(i3 - 16);
            return new e("und", s2, s2);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + a.a(i2));
        return null;
    }

    private static a b(m mVar) {
        String str;
        int i2 = mVar.i();
        if (mVar.i() == a.F0) {
            int b2 = a.b(mVar.i());
            String str2 = b2 == 13 ? "image/jpeg" : b2 == 14 ? "image/png" : null;
            if (str2 == null) {
                str = "Unrecognized cover art flags: " + b2;
            } else {
                mVar.K(4);
                int i3 = i2 - 16;
                byte[] bArr = new byte[i3];
                mVar.g(bArr, 0, i3);
                return new a(str2, (String) null, 3, bArr);
            }
        } else {
            str = "Failed to parse cover art attribute";
        }
        Log.w("MetadataUtil", str);
        return null;
    }

    public static a.b c(m mVar) {
        int c2 = mVar.c() + mVar.i();
        int i2 = mVar.i();
        int i3 = (i2 >> 24) & 255;
        if (i3 == 169 || i3 == 65533) {
            int i4 = 16777215 & i2;
            if (i4 == c) {
                e a2 = a(i2, mVar);
                mVar.J(c2);
                return a2;
            }
            if (i4 != f382a) {
                if (i4 != f383b) {
                    if (i4 != h) {
                        if (i4 != i) {
                            if (i4 == d) {
                                j g2 = g(i2, "TDRC", mVar);
                                mVar.J(c2);
                                return g2;
                            } else if (i4 == e) {
                                j g3 = g(i2, "TPE1", mVar);
                                mVar.J(c2);
                                return g3;
                            } else if (i4 == f) {
                                j g4 = g(i2, "TSSE", mVar);
                                mVar.J(c2);
                                return g4;
                            } else if (i4 == g) {
                                j g5 = g(i2, "TALB", mVar);
                                mVar.J(c2);
                                return g5;
                            } else if (i4 == j) {
                                j g6 = g(i2, "USLT", mVar);
                                mVar.J(c2);
                                return g6;
                            } else if (i4 == k) {
                                j g7 = g(i2, "TCON", mVar);
                                mVar.J(c2);
                                return g7;
                            } else if (i4 == n) {
                                j g8 = g(i2, "TIT1", mVar);
                                mVar.J(c2);
                                return g8;
                            }
                        }
                    }
                    j g9 = g(i2, "TCOM", mVar);
                    mVar.J(c2);
                    return g9;
                }
            }
            j g10 = g(i2, "TIT2", mVar);
            mVar.J(c2);
            return g10;
        }
        try {
            if (i2 == m) {
                return f(mVar);
            }
            if (i2 == o) {
                j d2 = d(i2, "TPOS", mVar);
                mVar.J(c2);
                return d2;
            } else if (i2 == p) {
                j d3 = d(i2, "TRCK", mVar);
                mVar.J(c2);
                return d3;
            } else if (i2 == q) {
                h h2 = h(i2, "TBPM", mVar, true, false);
                mVar.J(c2);
                return h2;
            } else if (i2 == r) {
                h h3 = h(i2, "TCMP", mVar, true, true);
                mVar.J(c2);
                return h3;
            } else if (i2 == l) {
                b.a.a.a.m0.i.a b2 = b(mVar);
                mVar.J(c2);
                return b2;
            } else if (i2 == s) {
                j g11 = g(i2, "TPE2", mVar);
                mVar.J(c2);
                return g11;
            } else if (i2 == t) {
                j g12 = g(i2, "TSOT", mVar);
                mVar.J(c2);
                return g12;
            } else if (i2 == u) {
                j g13 = g(i2, "TSO2", mVar);
                mVar.J(c2);
                return g13;
            } else if (i2 == v) {
                j g14 = g(i2, "TSOA", mVar);
                mVar.J(c2);
                return g14;
            } else if (i2 == w) {
                j g15 = g(i2, "TSOP", mVar);
                mVar.J(c2);
                return g15;
            } else if (i2 == x) {
                j g16 = g(i2, "TSOC", mVar);
                mVar.J(c2);
                return g16;
            } else if (i2 == y) {
                h h4 = h(i2, "ITUNESADVISORY", mVar, false, false);
                mVar.J(c2);
                return h4;
            } else if (i2 == z) {
                h h5 = h(i2, "ITUNESGAPLESS", mVar, false, true);
                mVar.J(c2);
                return h5;
            } else if (i2 == A) {
                j g17 = g(i2, "TVSHOWSORT", mVar);
                mVar.J(c2);
                return g17;
            } else if (i2 == B) {
                j g18 = g(i2, "TVSHOW", mVar);
                mVar.J(c2);
                return g18;
            } else if (i2 == C) {
                h e2 = e(mVar, c2);
                mVar.J(c2);
                return e2;
            }
        } finally {
            mVar.J(c2);
        }
        Log.d("MetadataUtil", "Skipped unknown metadata entry: " + a.a(i2));
        mVar.J(c2);
        return null;
    }

    private static j d(int i2, String str, m mVar) {
        int i3 = mVar.i();
        if (mVar.i() == a.F0 && i3 >= 22) {
            mVar.K(10);
            int D2 = mVar.D();
            if (D2 > 0) {
                String str2 = "" + D2;
                int D3 = mVar.D();
                if (D3 > 0) {
                    str2 = str2 + "/" + D3;
                }
                return new j(str, (String) null, str2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i2));
        return null;
    }

    private static h e(m mVar, int i2) {
        String str = null;
        String str2 = null;
        int i3 = -1;
        int i4 = -1;
        while (mVar.c() < i2) {
            int c2 = mVar.c();
            int i5 = mVar.i();
            int i6 = mVar.i();
            mVar.K(4);
            if (i6 == a.D0) {
                str = mVar.s(i5 - 12);
            } else if (i6 == a.E0) {
                str2 = mVar.s(i5 - 12);
            } else {
                if (i6 == a.F0) {
                    i3 = c2;
                    i4 = i5;
                }
                mVar.K(i5 - 12);
            }
        }
        if (!"com.apple.iTunes".equals(str) || !"iTunSMPB".equals(str2) || i3 == -1) {
            return null;
        }
        mVar.J(i3);
        mVar.K(16);
        return new e("und", str2, mVar.s(i4 - 16));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static b.a.a.a.m0.i.j f(b.a.a.a.r0.m r3) {
        /*
            int r3 = i(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = D
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            b.a.a.a.m0.i.j r1 = new b.a.a.a.m0.i.j
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.k0.r.f.f(b.a.a.a.r0.m):b.a.a.a.m0.i.j");
    }

    private static j g(int i2, String str, m mVar) {
        int i3 = mVar.i();
        if (mVar.i() == a.F0) {
            mVar.K(8);
            return new j(str, (String) null, mVar.s(i3 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + a.a(i2));
        return null;
    }

    private static h h(int i2, String str, m mVar, boolean z2, boolean z3) {
        int i3 = i(mVar);
        if (z3) {
            i3 = Math.min(1, i3);
        }
        if (i3 >= 0) {
            return z2 ? new j(str, (String) null, Integer.toString(i3)) : new e("und", str, Integer.toString(i3));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i2));
        return null;
    }

    private static int i(m mVar) {
        mVar.K(4);
        if (mVar.i() == a.F0) {
            mVar.K(8);
            return mVar.x();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
