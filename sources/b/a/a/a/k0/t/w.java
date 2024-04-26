package b.a.a.a.k0.t;

import android.util.SparseArray;
import b.a.a.a.k0.g;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;
import java.util.Collections;
import java.util.List;

public interface w {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f474a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f475b;

        public a(String str, int i, byte[] bArr) {
            this.f474a = str;
            this.f475b = bArr;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f476a;

        /* renamed from: b  reason: collision with root package name */
        public final String f477b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            this.f476a = i;
            this.f477b = str;
            this.c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.d = bArr;
        }
    }

    public interface c {
        SparseArray<w> a();

        w b(int i, b bVar);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f478a;

        /* renamed from: b  reason: collision with root package name */
        private final int f479b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f478a = str;
            this.f479b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.f479b : i + this.c;
            this.e = this.f478a + this.d;
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }
    }

    void a();

    void b(u uVar, g gVar, d dVar);

    void c(m mVar, boolean z);
}
