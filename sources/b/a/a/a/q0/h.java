package b.a.a.a.q0;

import android.net.Uri;
import b.a.a.a.r0.a;
import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f691a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f692b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public h(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public h(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public h(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        a.a(j >= 0);
        a.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        a.a(z);
        this.f691a = uri;
        this.f692b = bArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }

    public boolean a(int i) {
        return (this.g & i) == i;
    }

    public String toString() {
        return "DataSpec[" + this.f691a + ", " + Arrays.toString(this.f692b) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + "]";
    }
}
