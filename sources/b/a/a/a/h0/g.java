package b.a.a.a.h0;

import b.a.a.a.h0.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class g implements d {

    /* renamed from: b  reason: collision with root package name */
    private int f270b = -1;
    private int c = -1;
    private int[] d;
    private boolean e;
    private int[] f;
    private ByteBuffer g;
    private ByteBuffer h;
    private boolean i;

    public g() {
        ByteBuffer byteBuffer = d.f255a;
        this.g = byteBuffer;
        this.h = byteBuffer;
    }

    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.h;
        this.h = d.f255a;
        return byteBuffer;
    }

    public boolean b() {
        return this.i && this.h == d.f255a;
    }

    public void c() {
        this.i = true;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e(int i2, int i3, int i4) {
        boolean z = !Arrays.equals(this.d, this.f);
        int[] iArr = this.d;
        this.f = iArr;
        if (iArr == null) {
            this.e = false;
            return z;
        } else if (i4 != 2) {
            throw new d.a(i2, i3, i4);
        } else if (!z && this.c == i2 && this.f270b == i3) {
            return false;
        } else {
            this.c = i2;
            this.f270b = i3;
            this.e = i3 != iArr.length;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i5 >= iArr2.length) {
                    return true;
                }
                int i6 = iArr2[i5];
                if (i6 < i3) {
                    this.e = (i6 != i5) | this.e;
                    i5++;
                } else {
                    throw new d.a(i2, i3, i4);
                }
            }
        }
    }

    public int f() {
        return this.c;
    }

    public void flush() {
        this.h = d.f255a;
        this.i = false;
    }

    public int g() {
        return 2;
    }

    public void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f270b * 2)) * this.f.length * 2;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i2 : this.f) {
                this.g.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.f270b * 2;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    public int i() {
        int[] iArr = this.f;
        return iArr == null ? this.f270b : iArr.length;
    }

    public void j(int[] iArr) {
        this.d = iArr;
    }

    public void reset() {
        flush();
        this.g = d.f255a;
        this.f270b = -1;
        this.c = -1;
        this.f = null;
        this.e = false;
    }
}
