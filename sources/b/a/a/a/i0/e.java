package b.a.a.a.i0;

import java.nio.ByteBuffer;

public class e extends a {

    /* renamed from: b  reason: collision with root package name */
    public final b f296b = new b();
    public ByteBuffer c;
    public long d;
    private final int e;

    public e(int i) {
        this.e = i;
    }

    private ByteBuffer m(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    public static e r() {
        return new e(0);
    }

    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public void n(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = m(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.c.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer m = m(i2);
            if (position > 0) {
                this.c.position(0);
                this.c.limit(position);
                m.put(this.c);
            }
            this.c = m;
        }
    }

    public final void o() {
        this.c.flip();
    }

    public final boolean p() {
        return h(1073741824);
    }

    public final boolean q() {
        return this.c == null && this.e == 0;
    }
}
