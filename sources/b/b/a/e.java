package b.b.a;

import android.os.Handler;
import android.os.Message;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class e implements d {
    private static String h = "RPDLTool";
    private static e i;

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f796a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private List<c> f797b = Collections.synchronizedList(new LinkedList());
    private c c;
    private f d;
    private h e;
    private g f;
    private Handler g = new a();

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            c cVar = (c) message.obj;
            switch (message.what) {
                case 100:
                    e.this.m(cVar);
                    return;
                case 101:
                    e.this.h(cVar);
                    return;
                case 102:
                    e.this.i(cVar);
                    return;
                case 103:
                    e.this.l(cVar);
                    return;
                case 104:
                    e.this.j(cVar);
                    return;
                case 105:
                    e.this.k(cVar);
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void h(c cVar) {
        String str = h;
        b.a(0, str, "callbackDLCancel() name = " + cVar.c().c());
        this.c = null;
        synchronized (this.f797b) {
            this.f797b.remove(cVar);
            f fVar = this.d;
            if (fVar != null) {
                fVar.f(cVar.c().c());
            }
        }
    }

    /* access modifiers changed from: private */
    public void i(c cVar) {
        String str = h;
        b.a(0, str, "callbackDLFail() name = " + cVar.c().c());
        this.c = null;
        synchronized (this.f797b) {
            this.f797b.remove(cVar);
            f fVar = this.d;
            if (fVar != null) {
                fVar.a(cVar.c().c());
            }
            h hVar = this.e;
            if (hVar != null) {
                hVar.a(cVar.c().c());
            }
            g gVar = this.f;
            if (gVar != null) {
                gVar.a(cVar.c().c());
            }
        }
    }

    /* access modifiers changed from: private */
    public void j(c cVar) {
        String str = h;
        b.a(0, str, "callbackDLProgress() name = " + cVar.c().c() + " progress = " + cVar.c().e());
        f fVar = this.d;
        if (fVar != null) {
            fVar.d(cVar.c().c(), cVar.c().e());
        }
    }

    /* access modifiers changed from: private */
    public void k(c cVar) {
        String str = h;
        b.a(0, str, "callbackDLSpeed() name = " + cVar.c().c() + " speed = " + cVar.c().a());
        f fVar = this.d;
        if (fVar != null) {
            fVar.c(cVar.c().c(), cVar.c().a());
        }
    }

    /* access modifiers changed from: private */
    public void l(c cVar) {
        String str = h;
        b.a(0, str, "callbackDLStart() name = " + cVar.c().c());
        this.c = cVar;
        f fVar = this.d;
        if (fVar != null) {
            fVar.e(cVar.c().c());
        }
    }

    /* access modifiers changed from: private */
    public void m(c cVar) {
        String str = h;
        b.a(0, str, "callbackDLSuccess() name = " + cVar.c().c());
        this.c = null;
        synchronized (this.f797b) {
            this.f797b.remove(cVar);
            f fVar = this.d;
            if (fVar != null) {
                fVar.b(cVar.c().c());
            }
            h hVar = this.e;
            if (hVar != null) {
                hVar.b(cVar.c().c());
            }
            g gVar = this.f;
            if (gVar != null) {
                gVar.b(cVar.c().c());
            }
        }
    }

    private boolean n(a aVar) {
        int size = this.f797b.size();
        if (size <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (aVar.c().equals(this.f797b.get(i2).c().c())) {
                return true;
            }
        }
        return false;
    }

    public static e q() {
        if (i == null) {
            i = new e();
        }
        return i;
    }

    public void a(int i2, c cVar) {
        Message obtainMessage = this.g.obtainMessage();
        obtainMessage.what = i2;
        obtainMessage.obj = cVar;
        this.g.sendMessage(obtainMessage);
    }

    public void o(a aVar) {
        String str = h;
        b.a(0, str, "downloadFile() dlFile.name = " + aVar.c());
        if (!n(aVar)) {
            c cVar = new c(aVar, this);
            synchronized (this.f797b) {
                this.f797b.add(cVar);
                if (this.f796a == null) {
                    this.f796a = Executors.newSingleThreadExecutor();
                }
                this.f796a.submit(cVar);
            }
            return;
        }
        String str2 = h;
        b.a(3, str2, "downloadFile() dlFile.name = " + aVar.c() + " EXIST!");
    }

    public void p() {
        b.a(0, h, "exitDownload()");
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
        ExecutorService executorService = this.f796a;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f796a = null;
        }
    }

    public h r() {
        return this.e;
    }

    public void s(f fVar) {
        this.d = fVar;
    }

    public void t(h hVar) {
        this.e = hVar;
    }
}
