package android.support.v4.app;

import a.b.b.b.d;
import a.b.b.b.i;
import android.arch.lifecycle.e;
import android.arch.lifecycle.j;
import android.arch.lifecycle.k;
import android.arch.lifecycle.n;
import android.arch.lifecycle.o;
import android.arch.lifecycle.p;
import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class LoaderManagerImpl extends t {
    static boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    private final e f67a;

    /* renamed from: b  reason: collision with root package name */
    private final LoaderViewModel f68b;

    static class LoaderViewModel extends n {

        /* renamed from: b  reason: collision with root package name */
        private static final o.a f69b = new a();

        /* renamed from: a  reason: collision with root package name */
        private i<a> f70a = new i<>();

        static class a implements o.a {
            a() {
            }

            public <T extends n> T a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        static LoaderViewModel c(p pVar) {
            return (LoaderViewModel) new o(pVar, f69b).a(LoaderViewModel.class);
        }

        /* access modifiers changed from: protected */
        public void a() {
            super.a();
            if (this.f70a.k() <= 0) {
                this.f70a.a();
            } else {
                this.f70a.l(0).l(true);
                throw null;
            }
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f70a.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f70a.k() > 0) {
                    a l = this.f70a.l(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f70a.h(0));
                    printWriter.print(": ");
                    printWriter.println(l.toString());
                    l.m(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int k = this.f70a.k();
            for (int i = 0; i < k; i++) {
                this.f70a.l(i).n();
            }
        }
    }

    public static class a<D> extends j<D> {
        private final int j;
        private final Bundle k;
        private final android.support.v4.content.b<D> l;
        private e m;
        private b<D> n;
        private android.support.v4.content.b<D> o;

        /* access modifiers changed from: protected */
        public void h() {
            if (LoaderManagerImpl.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.l.d();
            throw null;
        }

        /* access modifiers changed from: protected */
        public void i() {
            if (LoaderManagerImpl.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.l.e();
            throw null;
        }

        public void j(k<? super D> kVar) {
            super.j(kVar);
            this.m = null;
        }

        public void k(D d) {
            super.k(d);
            android.support.v4.content.b<D> bVar = this.o;
            if (bVar != null) {
                bVar.c();
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        public android.support.v4.content.b<D> l(boolean z) {
            if (LoaderManagerImpl.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.l.a();
            throw null;
        }

        public void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.j);
            printWriter.print(" mArgs=");
            printWriter.println(this.k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.l);
            android.support.v4.content.b<D> bVar = this.l;
            bVar.b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void n() {
            e eVar = this.m;
            b<D> bVar = this.n;
            if (eVar != null && bVar != null) {
                super.j(bVar);
                g(eVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.j);
            sb.append(" : ");
            d.a(this.l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    static class b<D> implements k<D> {
    }

    LoaderManagerImpl(e eVar, p pVar) {
        this.f67a = eVar;
        this.f68b = LoaderViewModel.c(pVar);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f68b.b(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f68b.d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d.a(this.f67a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
