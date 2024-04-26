package b.a.a.a.q0;

import android.net.Uri;
import android.util.Base64;
import b.a.a.a.u;
import java.net.URLDecoder;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private h f689a;

    /* renamed from: b  reason: collision with root package name */
    private int f690b;
    private byte[] c;

    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.c.length - this.f690b;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.c, this.f690b, bArr, i, min);
        this.f690b += min;
        return min;
    }

    public long b(h hVar) {
        this.f689a = hVar;
        Uri uri = hVar.f691a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] split = uri.getSchemeSpecificPart().split(",");
            if (split.length <= 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        this.c = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new u("Error while parsing Base64 encoded string: " + str, e);
                    }
                } else {
                    this.c = URLDecoder.decode(str, "US-ASCII").getBytes();
                }
                return (long) this.c.length;
            }
            throw new u("Unexpected URI format: " + uri);
        }
        throw new u("Unsupported scheme: " + scheme);
    }

    public Uri c() {
        h hVar = this.f689a;
        if (hVar != null) {
            return hVar.f691a;
        }
        return null;
    }

    public void close() {
        this.f689a = null;
        this.c = null;
    }
}
