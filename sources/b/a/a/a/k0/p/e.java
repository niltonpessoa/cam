package b.a.a.a.k0.p;

import b.a.a.a.k0.f;
import b.a.a.a.r0.m;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final m f346a = new m(8);

    /* renamed from: b  reason: collision with root package name */
    private int f347b;

    private long a(f fVar) {
        int i = 0;
        fVar.h(this.f346a.f734a, 0, 1);
        byte b2 = this.f346a.f734a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (i2 ^ -1);
        fVar.h(this.f346a.f734a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f346a.f734a[i] & 255) + (i4 << 8);
        }
        this.f347b += i3 + 1;
        return (long) i4;
    }

    public boolean b(f fVar) {
        f fVar2 = fVar;
        long length = fVar.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        fVar2.h(this.f346a.f734a, 0, 4);
        this.f347b = 4;
        for (long z = this.f346a.z(); z != 440786851; z = ((z << 8) & -256) | ((long) (this.f346a.f734a[0] & 255))) {
            int i2 = this.f347b + 1;
            this.f347b = i2;
            if (i2 == i) {
                return false;
            }
            fVar2.h(this.f346a.f734a, 0, 1);
        }
        long a2 = a(fVar);
        long j2 = (long) this.f347b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j2 + a2 >= length) {
            return false;
        }
        while (true) {
            int i3 = this.f347b;
            long j3 = j2 + a2;
            if (((long) i3) >= j3) {
                return ((long) i3) == j3;
            }
            if (a(fVar) == Long.MIN_VALUE) {
                return false;
            }
            long a3 = a(fVar);
            if (a3 < 0 || a3 > 2147483647L) {
                return false;
            }
            if (a3 != 0) {
                fVar2.j((int) a3);
                this.f347b = (int) (((long) this.f347b) + a3);
            }
        }
        return false;
    }
}
