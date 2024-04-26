package b.a.a.a.q0;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final r<? super n> f702a;

    /* renamed from: b  reason: collision with root package name */
    private RandomAccessFile f703b;
    private Uri c;
    private long d;
    private boolean e;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public n(r<? super n> rVar) {
        this.f702a = rVar;
    }

    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f703b.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.d -= (long) read;
                r<? super n> rVar = this.f702a;
                if (rVar != null) {
                    rVar.c(this, read);
                }
            }
            return read;
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    public long b(h hVar) {
        try {
            this.c = hVar.f691a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(hVar.f691a.getPath(), "r");
            this.f703b = randomAccessFile;
            randomAccessFile.seek(hVar.d);
            long j = hVar.e;
            if (j == -1) {
                j = this.f703b.length() - hVar.d;
            }
            this.d = j;
            if (j >= 0) {
                this.e = true;
                r<? super n> rVar = this.f702a;
                if (rVar != null) {
                    rVar.b(this, hVar);
                }
                return this.d;
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
            RandomAccessFile randomAccessFile = this.f703b;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f703b = null;
            if (this.e) {
                this.e = false;
                r<? super n> rVar = this.f702a;
                if (rVar != null) {
                    rVar.a(this);
                }
            }
        } catch (IOException e2) {
            throw new a(e2);
        } catch (Throwable th) {
            this.f703b = null;
            if (this.e) {
                this.e = false;
                r<? super n> rVar2 = this.f702a;
                if (rVar2 != null) {
                    rVar2.a(this);
                }
            }
            throw th;
        }
    }
}
