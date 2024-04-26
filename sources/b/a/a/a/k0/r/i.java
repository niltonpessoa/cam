package b.a.a.a.k0.r;

import b.a.a.a.k0.f;
import b.a.a.a.r0.m;
import b.a.a.a.r0.w;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f389a = {w.o("isom"), w.o("iso2"), w.o("iso3"), w.o("iso4"), w.o("iso5"), w.o("iso6"), w.o("avc1"), w.o("hvc1"), w.o("hev1"), w.o("mp41"), w.o("mp42"), w.o("3g2a"), w.o("3g2b"), w.o("3gr6"), w.o("3gs6"), w.o("3ge6"), w.o("3gg6"), w.o("M4V "), w.o("M4A "), w.o("f4v "), w.o("kddi"), w.o("M4VP"), w.o("qt  "), w.o("MSNV")};

    private static boolean a(int i) {
        if ((i >>> 8) == w.o("3gp")) {
            return true;
        }
        for (int i2 : f389a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(f fVar) {
        return c(fVar, true);
    }

    private static boolean c(f fVar, boolean z) {
        boolean z2;
        f fVar2 = fVar;
        long length = fVar.getLength();
        long j = -1;
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i = (int) length;
        m mVar = new m(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            mVar.G(8);
            fVar2.h(mVar.f734a, 0, 8);
            long z4 = mVar.z();
            int i3 = mVar.i();
            int i4 = 16;
            if (z4 == 1) {
                fVar2.h(mVar.f734a, 8, 8);
                mVar.I(16);
                z4 = mVar.C();
            } else {
                if (z4 == 0) {
                    long length2 = fVar.getLength();
                    if (length2 != j) {
                        z4 = ((long) 8) + (length2 - fVar.k());
                    }
                }
                i4 = 8;
            }
            long j2 = (long) i4;
            if (z4 < j2) {
                return false;
            }
            i2 += i4;
            if (i3 != a.C) {
                if (i3 == a.L || i3 == a.N) {
                    z2 = true;
                } else if ((((long) i2) + z4) - j2 >= ((long) i)) {
                    break;
                } else {
                    int i5 = (int) (z4 - j2);
                    i2 += i5;
                    if (i3 == a.f358b) {
                        if (i5 < 8) {
                            return false;
                        }
                        mVar.G(i5);
                        fVar2.h(mVar.f734a, 0, i5);
                        int i6 = i5 / 4;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                break;
                            }
                            if (i7 == 1) {
                                mVar.K(4);
                            } else if (a(mVar.i())) {
                                z3 = true;
                                break;
                            }
                            i7++;
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i5 != 0) {
                        fVar2.j(i5);
                    }
                    j = -1;
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }

    public static boolean d(f fVar) {
        return c(fVar, false);
    }
}
