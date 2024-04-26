package b.a.a.a.n0;

import android.os.Handler;
import b.a.a.a.n;
import b.a.a.a.q0.h;
import java.io.IOException;

public interface g {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f564a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final g f565b;
        private final long c;

        /* renamed from: b.a.a.a.n0.g$a$a  reason: collision with other inner class name */
        class C0032a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f566a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f567b;
            final /* synthetic */ int c;
            final /* synthetic */ n d;
            final /* synthetic */ int e;
            final /* synthetic */ Object f;
            final /* synthetic */ long g;
            final /* synthetic */ long h;
            final /* synthetic */ long i;

            C0032a(h hVar, int i2, int i3, n nVar, int i4, Object obj, long j2, long j3, long j4) {
                this.f566a = hVar;
                this.f567b = i2;
                this.c = i3;
                this.d = nVar;
                this.e = i4;
                this.f = obj;
                this.g = j2;
                this.h = j3;
                this.i = j4;
            }

            public void run() {
                a.this.f565b.c(this.f566a, this.f567b, this.c, this.d, this.e, this.f, a.this.c(this.g), a.this.c(this.h), this.i);
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f568a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f569b;
            final /* synthetic */ int c;
            final /* synthetic */ n d;
            final /* synthetic */ int e;
            final /* synthetic */ Object f;
            final /* synthetic */ long g;
            final /* synthetic */ long h;
            final /* synthetic */ long i;
            final /* synthetic */ long j;
            final /* synthetic */ long k;
            final /* synthetic */ a l;

            b(a aVar, h hVar, int i2, int i3, n nVar, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
                this.l = aVar;
                this.f568a = hVar;
                this.f569b = i2;
                this.c = i3;
                this.d = nVar;
                this.e = i4;
                this.f = obj;
                this.g = j2;
                this.h = j3;
                this.i = j4;
                this.j = j5;
                this.k = j6;
            }

            public void run() {
                this.l.f565b.b(this.f568a, this.f569b, this.c, this.d, this.e, this.f, this.l.c(this.g), this.l.c(this.h), this.i, this.j, this.k);
            }
        }

        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f570a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f571b;
            final /* synthetic */ int c;
            final /* synthetic */ n d;
            final /* synthetic */ int e;
            final /* synthetic */ Object f;
            final /* synthetic */ long g;
            final /* synthetic */ long h;
            final /* synthetic */ long i;
            final /* synthetic */ long j;
            final /* synthetic */ long k;
            final /* synthetic */ a l;

            c(a aVar, h hVar, int i2, int i3, n nVar, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
                this.l = aVar;
                this.f570a = hVar;
                this.f571b = i2;
                this.c = i3;
                this.d = nVar;
                this.e = i4;
                this.f = obj;
                this.g = j2;
                this.h = j3;
                this.i = j4;
                this.j = j5;
                this.k = j6;
            }

            public void run() {
                this.l.f565b.e(this.f570a, this.f571b, this.c, this.d, this.e, this.f, this.l.c(this.g), this.l.c(this.h), this.i, this.j, this.k);
            }
        }

        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f572a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f573b;
            final /* synthetic */ int c;
            final /* synthetic */ n d;
            final /* synthetic */ int e;
            final /* synthetic */ Object f;
            final /* synthetic */ long g;
            final /* synthetic */ long h;
            final /* synthetic */ long i;
            final /* synthetic */ long j;
            final /* synthetic */ long k;
            final /* synthetic */ IOException l;
            final /* synthetic */ boolean m;
            final /* synthetic */ a n;

            d(a aVar, h hVar, int i2, int i3, n nVar, int i4, Object obj, long j2, long j3, long j4, long j5, long j6, IOException iOException, boolean z) {
                this.n = aVar;
                this.f572a = hVar;
                this.f573b = i2;
                this.c = i3;
                this.d = nVar;
                this.e = i4;
                this.f = obj;
                this.g = j2;
                this.h = j3;
                this.i = j4;
                this.j = j5;
                this.k = j6;
                this.l = iOException;
                this.m = z;
            }

            public void run() {
                this.n.f565b.d(this.f572a, this.f573b, this.c, this.d, this.e, this.f, this.n.c(this.g), this.n.c(this.h), this.i, this.j, this.k, this.l, this.m);
            }
        }

        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f574a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ n f575b;
            final /* synthetic */ int c;
            final /* synthetic */ Object d;
            final /* synthetic */ long e;

            e(int i, n nVar, int i2, Object obj, long j) {
                this.f574a = i;
                this.f575b = nVar;
                this.c = i2;
                this.d = obj;
                this.e = j;
            }

            public void run() {
                a.this.f565b.a(this.f574a, this.f575b, this.c, this.d, a.this.c(this.e));
            }
        }

        public a(Handler handler, g gVar) {
            this(handler, gVar, 0);
        }

        public a(Handler handler, g gVar, long j) {
            Handler handler2;
            if (gVar != null) {
                b.a.a.a.r0.a.e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f564a = handler2;
            this.f565b = gVar;
            this.c = j;
        }

        /* access modifiers changed from: private */
        public long c(long j) {
            long b2 = b.a.a.a.b.b(j);
            if (b2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.c + b2;
        }

        public void d(int i, n nVar, int i2, Object obj, long j) {
            Handler handler;
            if (this.f565b != null && (handler = this.f564a) != null) {
                handler.post(new e(i, nVar, i2, obj, j));
            }
        }

        public void e(h hVar, int i, int i2, n nVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            Handler handler;
            if (this.f565b != null && (handler = this.f564a) != null) {
                c cVar = r0;
                c cVar2 = new c(this, hVar, i, i2, nVar, i3, obj, j, j2, j3, j4, j5);
                handler.post(cVar);
            }
        }

        public void f(h hVar, int i, int i2, n nVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            Handler handler;
            if (this.f565b != null && (handler = this.f564a) != null) {
                b bVar = r0;
                b bVar2 = new b(this, hVar, i, i2, nVar, i3, obj, j, j2, j3, j4, j5);
                handler.post(bVar);
            }
        }

        public void g(h hVar, int i, int i2, n nVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            Handler handler;
            if (this.f565b != null && (handler = this.f564a) != null) {
                d dVar = r0;
                d dVar2 = new d(this, hVar, i, i2, nVar, i3, obj, j, j2, j3, j4, j5, iOException, z);
                handler.post(dVar);
            }
        }

        public void h(h hVar, int i, int i2, n nVar, int i3, Object obj, long j, long j2, long j3) {
            Handler handler;
            if (this.f565b != null && (handler = this.f564a) != null) {
                C0032a aVar = r0;
                C0032a aVar2 = new C0032a(hVar, i, i2, nVar, i3, obj, j, j2, j3);
                handler.post(aVar);
            }
        }
    }

    void a(int i, n nVar, int i2, Object obj, long j);

    void b(h hVar, int i, int i2, n nVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5);

    void c(h hVar, int i, int i2, n nVar, int i3, Object obj, long j, long j2, long j3);

    void d(h hVar, int i, int i2, n nVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z);

    void e(h hVar, int i, int i2, n nVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5);
}
