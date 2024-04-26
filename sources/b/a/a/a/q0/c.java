package b.a.a.a.q0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f685a;

    /* renamed from: b  reason: collision with root package name */
    private final r<? super c> f686b;
    private Uri c;
    private InputStream d;
    private long e;
    private boolean f;

    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public c(Context context, r<? super c> rVar) {
        this.f685a = context.getAssets();
        this.f686b = rVar;
    }

    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e2) {
                throw new a(e2);
            }
        }
        int read = this.d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.e;
            if (j2 != -1) {
                this.e = j2 - ((long) read);
            }
            r<? super c> rVar = this.f686b;
            if (rVar != null) {
                rVar.c(this, read);
            }
            return read;
        } else if (this.e == -1) {
            return -1;
        } else {
            throw new a(new EOFException());
        }
    }

    public long b(h hVar) {
        try {
            Uri uri = hVar.f691a;
            this.c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f685a.open(path, 1);
            this.d = open;
            if (open.skip(hVar.d) >= hVar.d) {
                long j = hVar.e;
                if (j != -1) {
                    this.e = j;
                } else {
                    long available = (long) this.d.available();
                    this.e = available;
                    if (available == 2147483647L) {
                        this.e = -1;
                    }
                }
                this.f = true;
                r<? super c> rVar = this.f686b;
                if (rVar != null) {
                    rVar.b(this, hVar);
                }
                return this.e;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    public Uri c() {
        return this.c;
    }

    public void close() {
        this.c = null;
        try {
            InputStream inputStream = this.d;
            if (inputStream != null) {
                inputStream.close();
            }
            this.d = null;
            if (this.f) {
                this.f = false;
                r<? super c> rVar = this.f686b;
                if (rVar != null) {
                    rVar.a(this);
                }
            }
        } catch (IOException e2) {
            throw new a(e2);
        } catch (Throwable th) {
            this.d = null;
            if (this.f) {
                this.f = false;
                r<? super c> rVar2 = this.f686b;
                if (rVar2 != null) {
                    rVar2.a(this);
                }
            }
            throw th;
        }
    }
}
