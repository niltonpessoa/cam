package b.a.a.a.k0.r;

import android.util.Log;
import b.a.a.a.k0.n;
import b.a.a.a.r0.a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f392a;

    /* renamed from: b  reason: collision with root package name */
    public final n.a f393b;
    public final int c;
    public final byte[] d;

    public k(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        a.a((bArr2 != null ? false : z2) ^ (i == 0));
        this.f392a = str;
        this.c = i;
        this.d = bArr2;
        this.f393b = new n.a(a(str), bArr, i2, i3);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                Log.w("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
