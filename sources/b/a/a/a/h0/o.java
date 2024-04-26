package b.a.a.a.h0;

import b.a.a.a.h0.d;
import b.a.a.a.r0.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class o implements d {

    /* renamed from: b  reason: collision with root package name */
    private boolean f288b;
    private int c;
    private int d;
    private int e = -1;
    private int f;
    private int g;
    private ByteBuffer h;
    private ByteBuffer i;
    private byte[] j;
    private int k;
    private boolean l;

    public o() {
        ByteBuffer byteBuffer = d.f255a;
        this.h = byteBuffer;
        this.i = byteBuffer;
    }

    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.i;
        this.i = d.f255a;
        return byteBuffer;
    }

    public boolean b() {
        return this.l && this.i == d.f255a;
    }

    public void c() {
        this.l = true;
    }

    public boolean d() {
        return this.f288b;
    }

    public boolean e(int i2, int i3, int i4) {
        if (i4 == 2) {
            this.e = i3;
            this.f = i2;
            int i5 = this.d;
            this.j = new byte[(i5 * i3 * 2)];
            this.k = 0;
            int i6 = this.c;
            this.g = i3 * i6 * 2;
            boolean z = this.f288b;
            boolean z2 = (i6 == 0 && i5 == 0) ? false : true;
            this.f288b = z2;
            return z != z2;
        }
        throw new d.a(i2, i3, i4);
    }

    public int f() {
        return this.f;
    }

    public void flush() {
        this.i = d.f255a;
        this.l = false;
        this.g = 0;
        this.k = 0;
    }

    public int g() {
        return 2;
    }

    public void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int min = Math.min(i2, this.g);
        this.g -= min;
        byteBuffer.position(position + min);
        if (this.g <= 0) {
            int i3 = i2 - min;
            int length = (this.k + i3) - this.j.length;
            if (this.h.capacity() < length) {
                this.h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
            } else {
                this.h.clear();
            }
            int i4 = w.i(length, 0, this.k);
            this.h.put(this.j, 0, i4);
            int i5 = w.i(length - i4, 0, i3);
            byteBuffer.limit(byteBuffer.position() + i5);
            this.h.put(byteBuffer);
            byteBuffer.limit(limit);
            int i6 = i3 - i5;
            int i7 = this.k - i4;
            this.k = i7;
            byte[] bArr = this.j;
            System.arraycopy(bArr, i4, bArr, 0, i7);
            byteBuffer.get(this.j, this.k, i6);
            this.k += i6;
            this.h.flip();
            this.i = this.h;
        }
    }

    public int i() {
        return this.e;
    }

    public void j(int i2, int i3) {
        this.c = i2;
        this.d = i3;
    }

    public void reset() {
        flush();
        this.h = d.f255a;
        this.e = -1;
        this.f = -1;
        this.j = null;
    }
}
