package b.a.a.a.h0;

import android.os.Handler;
import b.a.a.a.i0.d;
import b.a.a.a.n;

public interface e {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f256a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final e f257b;

        /* renamed from: b.a.a.a.h0.e$a$a  reason: collision with other inner class name */
        class C0015a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b.a.a.a.i0.d f258a;

            C0015a(b.a.a.a.i0.d dVar) {
                this.f258a = dVar;
            }

            public void run() {
                a.this.f257b.f(this.f258a);
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f260a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f261b;
            final /* synthetic */ long c;

            b(String str, long j, long j2) {
                this.f260a = str;
                this.f261b = j;
                this.c = j2;
            }

            public void run() {
                a.this.f257b.h(this.f260a, this.f261b, this.c);
            }
        }

        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f262a;

            c(n nVar) {
                this.f262a = nVar;
            }

            public void run() {
                a.this.f257b.n(this.f262a);
            }
        }

        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f264a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f265b;
            final /* synthetic */ long c;

            d(int i, long j, long j2) {
                this.f264a = i;
                this.f265b = j;
                this.c = j2;
            }

            public void run() {
                a.this.f257b.c(this.f264a, this.f265b, this.c);
            }
        }

        /* renamed from: b.a.a.a.h0.e$a$e  reason: collision with other inner class name */
        class C0016e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b.a.a.a.i0.d f266a;

            C0016e(b.a.a.a.i0.d dVar) {
                this.f266a = dVar;
            }

            public void run() {
                this.f266a.a();
                a.this.f257b.d(this.f266a);
            }
        }

        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f268a;

            f(int i) {
                this.f268a = i;
            }

            public void run() {
                a.this.f257b.b(this.f268a);
            }
        }

        public a(Handler handler, e eVar) {
            Handler handler2;
            if (eVar != null) {
                b.a.a.a.r0.a.e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f256a = handler2;
            this.f257b = eVar;
        }

        public void b(int i) {
            if (this.f257b != null) {
                this.f256a.post(new f(i));
            }
        }

        public void c(int i, long j, long j2) {
            if (this.f257b != null) {
                this.f256a.post(new d(i, j, j2));
            }
        }

        public void d(String str, long j, long j2) {
            if (this.f257b != null) {
                this.f256a.post(new b(str, j, j2));
            }
        }

        public void e(b.a.a.a.i0.d dVar) {
            if (this.f257b != null) {
                this.f256a.post(new C0016e(dVar));
            }
        }

        public void f(b.a.a.a.i0.d dVar) {
            if (this.f257b != null) {
                this.f256a.post(new C0015a(dVar));
            }
        }

        public void g(n nVar) {
            if (this.f257b != null) {
                this.f256a.post(new c(nVar));
            }
        }
    }

    void b(int i);

    void c(int i, long j, long j2);

    void d(d dVar);

    void f(d dVar);

    void h(String str, long j, long j2);

    void n(n nVar);
}
