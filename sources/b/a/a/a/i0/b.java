package b.a.a.a.i0;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import b.a.a.a.r0.w;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f290a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f291b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    private final MediaCodec.CryptoInfo i;
    private final C0017b j;

    @TargetApi(24)
    /* renamed from: b.a.a.a.i0.b$b  reason: collision with other inner class name */
    private static final class C0017b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f292a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f293b;

        private C0017b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f292a = cryptoInfo;
            this.f293b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        public void b(int i, int i2) {
            this.f293b.set(i, i2);
            this.f292a.setPattern(this.f293b);
        }
    }

    public b() {
        int i2 = w.f743a;
        C0017b bVar = null;
        MediaCodec.CryptoInfo b2 = i2 >= 16 ? b() : null;
        this.i = b2;
        this.j = i2 >= 24 ? new C0017b(b2) : bVar;
    }

    @TargetApi(16)
    private MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    @TargetApi(16)
    private void d() {
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = this.f;
        cryptoInfo.numBytesOfClearData = this.d;
        cryptoInfo.numBytesOfEncryptedData = this.e;
        cryptoInfo.key = this.f291b;
        cryptoInfo.iv = this.f290a;
        cryptoInfo.mode = this.c;
        if (w.f743a >= 24) {
            this.j.b(this.g, this.h);
        }
    }

    @TargetApi(16)
    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public void c(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f = i2;
        this.d = iArr;
        this.e = iArr2;
        this.f291b = bArr;
        this.f290a = bArr2;
        this.c = i3;
        this.g = i4;
        this.h = i5;
        if (w.f743a >= 16) {
            d();
        }
    }
}
