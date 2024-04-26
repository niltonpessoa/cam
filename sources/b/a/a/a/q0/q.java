package b.a.a.a.q0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f712a;

    /* renamed from: b  reason: collision with root package name */
    private final r<? super q> f713b;
    private Uri c;
    private AssetFileDescriptor d;
    private InputStream e;
    private long f;
    private boolean g;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }

        public a(String str) {
            super(str);
        }
    }

    public q(Context context, r<? super q> rVar) {
        this.f712a = context.getResources();
        this.f713b = rVar;
    }

    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
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
        int read = this.e.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f;
            if (j2 != -1) {
                this.f = j2 - ((long) read);
            }
            r<? super q> rVar = this.f713b;
            if (rVar != null) {
                rVar.c(this, read);
            }
            return read;
        } else if (this.f == -1) {
            return -1;
        } else {
            throw new a((IOException) new EOFException());
        }
    }

    public long b(h hVar) {
        try {
            Uri uri = hVar.f691a;
            this.c = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                this.d = this.f712a.openRawResourceFd(Integer.parseInt(this.c.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.d.getFileDescriptor());
                this.e = fileInputStream;
                fileInputStream.skip(this.d.getStartOffset());
                if (this.e.skip(hVar.d) >= hVar.d) {
                    long j = hVar.e;
                    long j2 = -1;
                    if (j != -1) {
                        this.f = j;
                    } else {
                        long length = this.d.getLength();
                        if (length != -1) {
                            j2 = length - hVar.d;
                        }
                        this.f = j2;
                    }
                    this.g = true;
                    r<? super q> rVar = this.f713b;
                    if (rVar != null) {
                        rVar.b(this, hVar);
                    }
                    return this.f;
                }
                throw new EOFException();
            }
            throw new a("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.");
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
            InputStream inputStream = this.e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.e = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.d = null;
                if (this.g) {
                    this.g = false;
                    r<? super q> rVar = this.f713b;
                    if (rVar != null) {
                        rVar.a(this);
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            } catch (Throwable th) {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    r<? super q> rVar2 = this.f713b;
                    if (rVar2 != null) {
                        rVar2.a(this);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new a(e3);
        } catch (Throwable th2) {
            this.e = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.d;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.d = null;
                if (this.g) {
                    this.g = false;
                    r<? super q> rVar3 = this.f713b;
                    if (rVar3 != null) {
                        rVar3.a(this);
                    }
                }
                throw th2;
            } catch (IOException e4) {
                throw new a(e4);
            } catch (Throwable th3) {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    r<? super q> rVar4 = this.f713b;
                    if (rVar4 != null) {
                        rVar4.a(this);
                    }
                }
                throw th3;
            }
        }
    }
}
