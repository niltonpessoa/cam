package b.a.a.a.h0;

import b.a.a.a.n;
import b.a.a.a.r0.l;
import b.a.a.a.r0.m;
import java.nio.ByteBuffer;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f245a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f246b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f247a;

        /* renamed from: b  reason: collision with root package name */
        public final int f248b;
        public final int c;
        public final int d;
        public final int e;

        private b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f247a = str;
            this.c = i2;
            this.f248b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static int a() {
        return 1536;
    }

    private static int b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f246b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static n c(m mVar, String str, String str2, b.a.a.a.j0.a aVar) {
        int i = f246b[(mVar.x() & 192) >> 6];
        int x = mVar.x();
        int i2 = d[(x & 56) >> 3];
        if ((x & 4) != 0) {
            i2++;
        }
        return n.h(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, aVar, 0, str2);
    }

    public static b d(l lVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        l lVar2 = lVar;
        int e2 = lVar.e();
        lVar2.o(40);
        boolean z = lVar2.h(5) == 16;
        lVar2.m(e2);
        if (z) {
            lVar2.o(16);
            int h = lVar2.h(2);
            lVar2.o(3);
            int h2 = (lVar2.h(11) + 1) * 2;
            int h3 = lVar2.h(2);
            if (h3 == 3) {
                i6 = c[lVar2.h(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = lVar2.h(2);
                i7 = f245a[i8];
                i6 = f246b[h3];
            }
            int i10 = i7 * 256;
            int h4 = lVar2.h(3);
            boolean g = lVar.g();
            int i11 = d[h4] + (g ? 1 : 0);
            lVar2.o(10);
            if (lVar.g()) {
                lVar2.o(8);
            }
            if (h4 == 0) {
                lVar2.o(5);
                if (lVar.g()) {
                    lVar2.o(8);
                }
            }
            if (h == 1 && lVar.g()) {
                lVar2.o(16);
            }
            if (lVar.g()) {
                if (h4 > 2) {
                    lVar2.o(2);
                }
                if ((h4 & 1) != 0 && h4 > 2) {
                    lVar2.o(6);
                }
                if ((h4 & 4) != 0) {
                    lVar2.o(6);
                }
                if (g && lVar.g()) {
                    lVar2.o(5);
                }
                if (h == 0) {
                    if (lVar.g()) {
                        lVar2.o(6);
                    }
                    if (h4 == 0 && lVar.g()) {
                        lVar2.o(6);
                    }
                    if (lVar.g()) {
                        lVar2.o(6);
                    }
                    int h5 = lVar2.h(2);
                    if (h5 == 1) {
                        lVar2.o(5);
                    } else if (h5 == 2) {
                        lVar2.o(12);
                    } else if (h5 == 3) {
                        int h6 = lVar2.h(5);
                        if (lVar.g()) {
                            lVar2.o(5);
                            if (lVar.g()) {
                                lVar2.o(4);
                            }
                            if (lVar.g()) {
                                lVar2.o(4);
                            }
                            if (lVar.g()) {
                                lVar2.o(4);
                            }
                            if (lVar.g()) {
                                lVar2.o(4);
                            }
                            if (lVar.g()) {
                                lVar2.o(4);
                            }
                            if (lVar.g()) {
                                lVar2.o(4);
                            }
                            if (lVar.g()) {
                                lVar2.o(4);
                            }
                            if (lVar.g()) {
                                if (lVar.g()) {
                                    lVar2.o(4);
                                }
                                if (lVar.g()) {
                                    lVar2.o(4);
                                }
                            }
                        }
                        if (lVar.g()) {
                            lVar2.o(5);
                            if (lVar.g()) {
                                lVar2.o(7);
                                if (lVar.g()) {
                                    lVar2.o(8);
                                }
                            }
                        }
                        lVar2.o((h6 + 2) * 8);
                        lVar.c();
                    }
                    if (h4 < 2) {
                        if (lVar.g()) {
                            lVar2.o(14);
                        }
                        if (h4 == 0 && lVar.g()) {
                            lVar2.o(14);
                        }
                    }
                    if (lVar.g()) {
                        if (i8 == 0) {
                            lVar2.o(5);
                        } else {
                            for (int i12 = 0; i12 < i7; i12++) {
                                if (lVar.g()) {
                                    lVar2.o(5);
                                }
                            }
                        }
                    }
                }
            }
            if (lVar.g()) {
                lVar2.o(5);
                if (h4 == 2) {
                    lVar2.o(4);
                }
                if (h4 >= 6) {
                    lVar2.o(2);
                }
                if (lVar.g()) {
                    lVar2.o(8);
                }
                if (h4 == 0 && lVar.g()) {
                    lVar2.o(8);
                }
                i9 = 3;
                if (h3 < 3) {
                    lVar.n();
                }
            } else {
                i9 = 3;
            }
            if (h == 0 && i8 != i9) {
                lVar.n();
            }
            if (h == 2 && (i8 == i9 || lVar.g())) {
                lVar2.o(6);
            }
            str = (lVar.g() && lVar2.h(6) == 1 && lVar2.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = h;
            i2 = h2;
            i3 = i6;
            i = i10;
            i4 = i11;
        } else {
            lVar2.o(32);
            int h7 = lVar2.h(2);
            int b2 = b(h7, lVar2.h(6));
            lVar2.o(8);
            int h8 = lVar2.h(3);
            if (!((h8 & 1) == 0 || h8 == 1)) {
                lVar2.o(2);
            }
            if ((h8 & 4) != 0) {
                lVar2.o(2);
            }
            if (h8 == 2) {
                lVar2.o(2);
            }
            str = "audio/ac3";
            i2 = b2;
            i3 = f246b[h7];
            i4 = d[h8] + (lVar.g() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new b(str, i5, i4, i3, i2, i);
    }

    public static int e(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return b((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static n f(m mVar, String str, String str2, b.a.a.a.j0.a aVar) {
        m mVar2 = mVar;
        mVar.K(2);
        int i = f246b[(mVar.x() & 192) >> 6];
        int x = mVar.x();
        int i2 = d[(x & 14) >> 1];
        if ((x & 1) != 0) {
            i2++;
        }
        if (((mVar.x() & 30) >> 1) > 0 && (2 & mVar.x()) != 0) {
            i2 += 2;
        }
        return n.h(str, (mVar.a() <= 0 || (mVar.x() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", (String) null, -1, -1, i2, i, (List<byte[]>) null, aVar, 0, str2);
    }

    public static int g(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f245a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    public static int h(ByteBuffer byteBuffer) {
        if (byteBuffer.getInt(byteBuffer.position() + 4) != -1167101192) {
            return 0;
        }
        return 40 << (byteBuffer.get(byteBuffer.position() + 8) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && bArr[7] == -70) {
            return 40 << (bArr[8] & 7);
        }
        return 0;
    }
}
