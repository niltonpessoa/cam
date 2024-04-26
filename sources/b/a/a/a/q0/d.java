package b.a.a.a.q0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f687a;

    /* renamed from: b  reason: collision with root package name */
    private final r<? super d> f688b;
    private Uri c;
    private AssetFileDescriptor d;
    private FileInputStream e;
    private long f;
    private boolean g;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public d(Context context, r<? super d> rVar) {
        this.f687a = context.getContentResolver();
        this.f688b = rVar;
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
            r<? super d> rVar = this.f688b;
            if (rVar != null) {
                rVar.c(this, read);
            }
            return read;
        } else if (this.f == -1) {
            return -1;
        } else {
            throw new a(new EOFException());
        }
    }

    public long b(h hVar) {
        try {
            Uri uri = hVar.f691a;
            this.c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f687a.openAssetFileDescriptor(uri, "r");
            this.d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.e = new FileInputStream(this.d.getFileDescriptor());
                long startOffset = this.d.getStartOffset();
                long skip = this.e.skip(hVar.d + startOffset) - startOffset;
                if (skip == hVar.d) {
                    long j = hVar.e;
                    long j2 = -1;
                    if (j != -1) {
                        this.f = j;
                    } else {
                        long length = this.d.getLength();
                        if (length == -1) {
                            FileChannel channel = this.e.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j2 = size - channel.position();
                            }
                            this.f = j2;
                        } else {
                            this.f = length - skip;
                        }
                    }
                    this.g = true;
                    r<? super d> rVar = this.f688b;
                    if (rVar != null) {
                        rVar.b(this, hVar);
                    }
                    return this.f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.c);
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
            FileInputStream fileInputStream = this.e;
            if (fileInputStream != null) {
                fileInputStream.close();
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
                    r<? super d> rVar = this.f688b;
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
                    r<? super d> rVar2 = this.f688b;
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
                    r<? super d> rVar3 = this.f688b;
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
                    r<? super d> rVar4 = this.f688b;
                    if (rVar4 != null) {
                        rVar4.a(this);
                    }
                }
                throw th3;
            }
        }
    }
}
