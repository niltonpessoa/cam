package b.a.a.a.h0;

import b.a.a.a.h0.d;
import b.a.a.a.r0.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class n implements d {

    /* renamed from: b  reason: collision with root package name */
    private int f287b;
    private int c = -1;
    private int d = -1;
    private m e;
    private float f = 1.0f;
    private float g = 1.0f;
    private int h = -1;
    private ByteBuffer i;
    private ShortBuffer j;
    private ByteBuffer k;
    private long l;
    private long m;
    private boolean n;

    public n() {
        ByteBuffer byteBuffer = d.f255a;
        this.i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = byteBuffer;
        this.f287b = -1;
    }

    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.k;
        this.k = d.f255a;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
            r1 = this;
            boolean r0 = r1.n
            if (r0 == 0) goto L_0x0010
            b.a.a.a.h0.m r0 = r1.e
            if (r0 == 0) goto L_0x000e
            int r0 = r0.k()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.h0.n.b():boolean");
    }

    public void c() {
        this.e.r();
        this.n = true;
    }

    public boolean d() {
        return Math.abs(this.f - 1.0f) >= 0.01f || Math.abs(this.g - 1.0f) >= 0.01f || this.h != this.d;
    }

    public boolean e(int i2, int i3, int i4) {
        if (i4 == 2) {
            int i5 = this.f287b;
            if (i5 == -1) {
                i5 = i2;
            }
            if (this.d == i2 && this.c == i3 && this.h == i5) {
                return false;
            }
            this.d = i2;
            this.c = i3;
            this.h = i5;
            return true;
        }
        throw new d.a(i2, i3, i4);
    }

    public int f() {
        return this.h;
    }

    public void flush() {
        this.e = new m(this.d, this.c, this.f, this.g, this.h);
        this.k = d.f255a;
        this.l = 0;
        this.m = 0;
        this.n = false;
    }

    public int g() {
        return 2;
    }

    public void h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.l += (long) remaining;
            this.e.s(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int k2 = this.e.k() * this.c * 2;
        if (k2 > 0) {
            if (this.i.capacity() < k2) {
                ByteBuffer order = ByteBuffer.allocateDirect(k2).order(ByteOrder.nativeOrder());
                this.i = order;
                this.j = order.asShortBuffer();
            } else {
                this.i.clear();
                this.j.clear();
            }
            this.e.j(this.j);
            this.m += (long) k2;
            this.i.limit(k2);
            this.k = this.i;
        }
    }

    public int i() {
        return this.c;
    }

    public long j(long j2) {
        long j3 = this.m;
        if (j3 >= 1024) {
            int i2 = this.h;
            int i3 = this.d;
            long j4 = this.l;
            if (i2 == i3) {
                return w.C(j2, j4, j3);
            }
            return w.C(j2, j4 * ((long) i2), j3 * ((long) i3));
        }
        double d2 = (double) this.f;
        double d3 = (double) j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (long) (d2 * d3);
    }

    public float k(float f2) {
        this.g = w.h(f2, 0.1f, 8.0f);
        return f2;
    }

    public float l(float f2) {
        float h2 = w.h(f2, 0.1f, 8.0f);
        this.f = h2;
        return h2;
    }

    public void reset() {
        this.e = null;
        ByteBuffer byteBuffer = d.f255a;
        this.i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = byteBuffer;
        this.c = -1;
        this.d = -1;
        this.h = -1;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.f287b = -1;
    }
}
