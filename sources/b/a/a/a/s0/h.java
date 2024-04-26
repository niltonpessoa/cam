package b.a.a.a.s0;

import android.os.Handler;
import android.view.Surface;
import b.a.a.a.i0.d;
import b.a.a.a.n;

public interface h {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f767a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final h f768b;

        /* renamed from: b.a.a.a.s0.h$a$a  reason: collision with other inner class name */
        class C0041a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b.a.a.a.i0.d f769a;

            C0041a(b.a.a.a.i0.d dVar) {
                this.f769a = dVar;
            }

            public void run() {
                a.this.f768b.m(this.f769a);
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f771a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f772b;
            final /* synthetic */ long c;

            b(String str, long j, long j2) {
                this.f771a = str;
                this.f772b = j;
                this.c = j2;
            }

            public void run() {
                a.this.f768b.i(this.f771a, this.f772b, this.c);
            }
        }

        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f773a;

            c(n nVar) {
                this.f773a = nVar;
            }

            public void run() {
                a.this.f768b.l(this.f773a);
            }
        }

        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f775a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f776b;

            d(int i, long j) {
                this.f775a = i;
                this.f776b = j;
            }

            public void run() {
                a.this.f768b.k(this.f775a, this.f776b);
            }
        }

        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f777a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f778b;
            final /* synthetic */ int c;
            final /* synthetic */ float d;

            e(int i, int i2, int i3, float f) {
                this.f777a = i;
                this.f778b = i2;
                this.c = i3;
                this.d = f;
            }

            public void run() {
                a.this.f768b.a(this.f777a, this.f778b, this.c, this.d);
            }
        }

        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Surface f779a;

            f(Surface surface) {
                this.f779a = surface;
            }

            public void run() {
                a.this.f768b.e(this.f779a);
            }
        }

        class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b.a.a.a.i0.d f781a;

            g(b.a.a.a.i0.d dVar) {
                this.f781a = dVar;
            }

            public void run() {
                this.f781a.a();
                a.this.f768b.g(this.f781a);
            }
        }

        public a(Handler handler, h hVar) {
            Handler handler2;
            if (hVar != null) {
                b.a.a.a.r0.a.e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f767a = handler2;
            this.f768b = hVar;
        }

        public void b(String str, long j, long j2) {
            if (this.f768b != null) {
                this.f767a.post(new b(str, j, j2));
            }
        }

        public void c(b.a.a.a.i0.d dVar) {
            if (this.f768b != null) {
                this.f767a.post(new g(dVar));
            }
        }

        public void d(int i, long j) {
            if (this.f768b != null) {
                this.f767a.post(new d(i, j));
            }
        }

        public void e(b.a.a.a.i0.d dVar) {
            if (this.f768b != null) {
                this.f767a.post(new C0041a(dVar));
            }
        }

        public void f(n nVar) {
            if (this.f768b != null) {
                this.f767a.post(new c(nVar));
            }
        }

        public void g(Surface surface) {
            if (this.f768b != null) {
                this.f767a.post(new f(surface));
            }
        }

        public void h(int i, int i2, int i3, float f2) {
            if (this.f768b != null) {
                this.f767a.post(new e(i, i2, i3, f2));
            }
        }
    }

    void a(int i, int i2, int i3, float f);

    void e(Surface surface);

    void g(d dVar);

    void i(String str, long j, long j2);

    void k(int i, long j);

    void l(n nVar);

    void m(d dVar);
}
