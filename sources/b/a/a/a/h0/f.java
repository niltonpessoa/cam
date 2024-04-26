package b.a.a.a.h0;

import b.a.a.a.w;
import java.nio.ByteBuffer;

public interface f {

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public static final class b extends Exception {
        public b(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
        }
    }

    public interface c {
        void a();

        void b(int i);

        void c(int i, long j, long j2);
    }

    public static final class d extends Exception {
        public d(int i) {
            super("AudioTrack write failed: " + i);
        }
    }

    void a();

    boolean b();

    w c();

    w f(w wVar);

    void g(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6);

    void h();

    long i(boolean z);

    void j();

    void k(c cVar);

    void l(b bVar);

    void m();

    boolean n();

    boolean o(int i);

    void p();

    void q(float f);

    void r();

    void reset();

    boolean s(ByteBuffer byteBuffer, long j);

    void t(int i);
}
