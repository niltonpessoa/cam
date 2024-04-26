package b.a.a.a.k0.p;

final class f {
    private static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f348a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f349b;
    private int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= d[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int c(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    public int b() {
        return this.c;
    }

    public long d(b.a.a.a.k0.f fVar, boolean z, boolean z2, int i) {
        if (this.f349b == 0) {
            if (!fVar.e(this.f348a, 0, 1, z)) {
                return -1;
            }
            int c2 = c(this.f348a[0] & 255);
            this.c = c2;
            if (c2 != -1) {
                this.f349b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.c;
        if (i2 > i) {
            this.f349b = 0;
            return -2;
        }
        if (i2 != 1) {
            fVar.i(this.f348a, 1, i2 - 1);
        }
        this.f349b = 0;
        return a(this.f348a, this.c, z2);
    }

    public void e() {
        this.f349b = 0;
        this.c = 0;
    }
}
