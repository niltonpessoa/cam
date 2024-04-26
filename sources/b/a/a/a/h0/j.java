package b.a.a.a.h0;

import b.a.a.a.h0.d;
import b.a.a.a.r0.a;
import b.a.a.a.r0.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class j implements d {
    private static final int h = Float.floatToIntBits(Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    private int f282b = -1;
    private int c = -1;
    private int d = 0;
    private ByteBuffer e;
    private ByteBuffer f;
    private boolean g;

    public j() {
        ByteBuffer byteBuffer = d.f255a;
        this.e = byteBuffer;
        this.f = byteBuffer;
    }

    private static void j(int i, ByteBuffer byteBuffer) {
        double d2 = (double) i;
        Double.isNaN(d2);
        int floatToIntBits = Float.floatToIntBits((float) (d2 * 4.656612875245797E-10d));
        if (floatToIntBits == h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f;
        this.f = d.f255a;
        return byteBuffer;
    }

    public boolean b() {
        return this.g && this.f == d.f255a;
    }

    public void c() {
        this.g = true;
    }

    public boolean d() {
        return w.w(this.d);
    }

    public boolean e(int i, int i2, int i3) {
        if (!w.w(i3)) {
            throw new d.a(i, i2, i3);
        } else if (this.f282b == i && this.c == i2 && this.d == i3) {
            return false;
        } else {
            this.f282b = i;
            this.c = i2;
            this.d = i3;
            return true;
        }
    }

    public int f() {
        return this.f282b;
    }

    public void flush() {
        this.f = d.f255a;
        this.g = false;
    }

    public int g() {
        return 4;
    }

    public void h(ByteBuffer byteBuffer) {
        a.f(d());
        boolean z = this.d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        if (this.e.capacity() < i) {
            this.e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.e.clear();
        }
        if (z) {
            while (position < limit) {
                j((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.e);
                position += 4;
            }
        } else {
            while (position < limit) {
                j(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.e);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.e.flip();
        this.f = this.e;
    }

    public int i() {
        return this.c;
    }

    public void reset() {
        flush();
        this.e = d.f255a;
        this.f282b = -1;
        this.c = -1;
        this.d = 0;
    }
}
