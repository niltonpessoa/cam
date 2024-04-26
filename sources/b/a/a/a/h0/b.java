package b.a.a.a.h0;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

public final class b {
    public static final b e = new C0014b().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f249a;

    /* renamed from: b  reason: collision with root package name */
    public final int f250b;
    public final int c;
    private AudioAttributes d;

    /* renamed from: b.a.a.a.h0.b$b  reason: collision with other inner class name */
    public static final class C0014b {

        /* renamed from: a  reason: collision with root package name */
        private int f251a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f252b = 0;
        private int c = 1;

        public b a() {
            return new b(this.f251a, this.f252b, this.c);
        }
    }

    private b(int i, int i2, int i3) {
        this.f249a = i;
        this.f250b = i2;
        this.c = i3;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    public AudioAttributes a() {
        if (this.d == null) {
            this.d = new AudioAttributes.Builder().setContentType(this.f249a).setFlags(this.f250b).setUsage(this.c).build();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f249a == bVar.f249a && this.f250b == bVar.f250b && this.c == bVar.c;
    }

    public int hashCode() {
        return ((((527 + this.f249a) * 31) + this.f250b) * 31) + this.c;
    }
}
