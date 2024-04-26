package b.a.a.a.q0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import b.a.a.a.r0.v;
import b.a.a.a.r0.w;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f707a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b<? extends c> f708b;
    /* access modifiers changed from: private */
    public IOException c;

    public interface a<T extends c> {
        int e(T t, long j, long j2, IOException iOException);

        void h(T t, long j, long j2);

        void m(T t, long j, long j2, boolean z);
    }

    @SuppressLint({"HandlerLeak"})
    private final class b<T extends c> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final T f709a;

        /* renamed from: b  reason: collision with root package name */
        private final a<T> f710b;
        public final int c;
        private final long d;
        private IOException e;
        private int f;
        private volatile Thread g;
        private volatile boolean h;

        public b(Looper looper, T t, a<T> aVar, int i2, long j) {
            super(looper);
            this.f709a = t;
            this.f710b = aVar;
            this.c = i2;
            this.d = j;
        }

        private void b() {
            this.e = null;
            p.this.f707a.execute(p.this.f708b);
        }

        private void c() {
            b unused = p.this.f708b = null;
        }

        private long d() {
            return (long) Math.min((this.f - 1) * 1000, BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);
        }

        public void a(boolean z) {
            this.h = z;
            this.e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f709a.c();
                if (this.g != null) {
                    this.g.interrupt();
                }
            }
            if (z) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f710b.m(this.f709a, elapsedRealtime, elapsedRealtime - this.d, true);
            }
        }

        public void e(int i2) {
            IOException iOException = this.e;
            if (iOException != null && this.f > i2) {
                throw iOException;
            }
        }

        public void f(long j) {
            b.a.a.a.r0.a.f(p.this.f708b == null);
            b unused = p.this.f708b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            if (!this.h) {
                int i2 = message.what;
                if (i2 == 0) {
                    b();
                } else if (i2 != 4) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.d;
                    if (this.f709a.b()) {
                        this.f710b.m(this.f709a, elapsedRealtime, j, false);
                        return;
                    }
                    int i3 = message.what;
                    int i4 = 1;
                    if (i3 == 1) {
                        this.f710b.m(this.f709a, elapsedRealtime, j, false);
                    } else if (i3 == 2) {
                        try {
                            this.f710b.h(this.f709a, elapsedRealtime, j);
                        } catch (RuntimeException e2) {
                            Log.e("LoadTask", "Unexpected exception handling load completed", e2);
                            IOException unused = p.this.c = new f(e2);
                        }
                    } else if (i3 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int e3 = this.f710b.e(this.f709a, elapsedRealtime, j, iOException);
                        if (e3 == 3) {
                            IOException unused2 = p.this.c = this.e;
                        } else if (e3 != 2) {
                            if (e3 != 1) {
                                i4 = 1 + this.f;
                            }
                            this.f = i4;
                            f(d());
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.g = Thread.currentThread();
                if (!this.f709a.b()) {
                    v.a("load:" + this.f709a.getClass().getSimpleName());
                    this.f709a.a();
                    v.c();
                }
                if (!this.h) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e2) {
                e = e2;
                if (this.h) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (InterruptedException unused) {
                b.a.a.a.r0.a.f(this.f709a.b());
                if (!this.h) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e3) {
                Log.e("LoadTask", "Unexpected exception loading stream", e3);
                if (!this.h) {
                    e = new f(e3);
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (OutOfMemoryError e4) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e4);
                if (!this.h) {
                    e = new f(e4);
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (Error e5) {
                Log.e("LoadTask", "Unexpected error loading stream", e5);
                if (!this.h) {
                    obtainMessage(4, e5).sendToTarget();
                }
                throw e5;
            } catch (Throwable th) {
                v.c();
                throw th;
            }
        }
    }

    public interface c {
        void a();

        boolean b();

        void c();
    }

    public interface d {
        void g();
    }

    private static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final d f711a;

        public e(d dVar) {
            this.f711a = dVar;
        }

        public void run() {
            this.f711a.g();
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public p(String str) {
        this.f707a = w.z(str);
    }

    public void e() {
        this.f708b.a(false);
    }

    public boolean f() {
        return this.f708b != null;
    }

    public void g(int i) {
        IOException iOException = this.c;
        if (iOException == null) {
            b<? extends c> bVar = this.f708b;
            if (bVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = bVar.c;
                }
                bVar.e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void h(d dVar) {
        b<? extends c> bVar = this.f708b;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.f707a.execute(new e(dVar));
        }
        this.f707a.shutdown();
    }

    public <T extends c> long i(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        b.a.a.a.r0.a.f(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t, aVar, i, elapsedRealtime).f(0);
        return elapsedRealtime;
    }
}
