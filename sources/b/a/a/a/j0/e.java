package b.a.a.a.j0;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCrypto f305a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f306b;

    public MediaCrypto a() {
        return this.f305a;
    }

    public boolean b(String str) {
        return !this.f306b && this.f305a.requiresSecureDecoderComponent(str);
    }
}
