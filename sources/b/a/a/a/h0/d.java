package b.a.a.a.h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f255a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a extends Exception {
        public a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    ByteBuffer a();

    boolean b();

    void c();

    boolean d();

    boolean e(int i, int i2, int i3);

    int f();

    void flush();

    int g();

    void h(ByteBuffer byteBuffer);

    int i();

    void reset();
}
