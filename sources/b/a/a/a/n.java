package b.a.a.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;
import b.a.a.a.s0.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();
    private int A;

    /* renamed from: a  reason: collision with root package name */
    public final String f542a;

    /* renamed from: b  reason: collision with root package name */
    public final int f543b;
    public final String c;
    public final b.a.a.a.m0.a d;
    public final String e;
    public final String f;
    public final int g;
    public final List<byte[]> h;
    public final b.a.a.a.j0.a i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final float n;
    public final int o;
    public final byte[] p;
    public final b q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    static class a implements Parcelable.Creator<n> {
        a() {
        }

        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        /* renamed from: b */
        public n[] newArray(int i) {
            return new n[i];
        }
    }

    n(Parcel parcel) {
        this.f542a = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.c = parcel.readString();
        this.f543b = parcel.readInt();
        this.g = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readFloat();
        this.m = parcel.readInt();
        this.n = parcel.readFloat();
        this.p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.o = parcel.readInt();
        this.q = (b) parcel.readParcelable(b.class.getClassLoader());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.w = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.h.add(parcel.createByteArray());
        }
        this.i = (b.a.a.a.j0.a) parcel.readParcelable(b.a.a.a.j0.a.class.getClassLoader());
        this.d = (b.a.a.a.m0.a) parcel.readParcelable(b.a.a.a.m0.a.class.getClassLoader());
    }

    n(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, b bVar, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, b.a.a.a.j0.a aVar, b.a.a.a.m0.a aVar2) {
        this.f542a = str;
        this.e = str2;
        this.f = str3;
        this.c = str4;
        this.f543b = i2;
        this.g = i3;
        this.j = i4;
        this.k = i5;
        this.l = f2;
        this.m = i6;
        this.n = f3;
        this.p = bArr;
        this.o = i7;
        this.q = bVar;
        this.r = i8;
        this.s = i9;
        this.t = i10;
        this.u = i11;
        this.v = i12;
        this.x = i13;
        this.y = str5;
        this.z = i14;
        this.w = j2;
        this.h = list == null ? Collections.emptyList() : list;
        this.i = aVar;
        this.d = aVar2;
    }

    public static n f(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, b.a.a.a.j0.a aVar, int i9, String str4, b.a.a.a.m0.a aVar2) {
        return new n(str, (String) null, str2, str3, i2, i3, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (b) null, i4, i5, i6, i7, i8, i9, str4, -1, Long.MAX_VALUE, list, aVar, aVar2);
    }

    public static n g(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, b.a.a.a.j0.a aVar, int i7, String str4) {
        return f(str, str2, str3, i2, i3, i4, i5, i6, -1, -1, list, aVar, i7, str4, (b.a.a.a.m0.a) null);
    }

    public static n h(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, b.a.a.a.j0.a aVar, int i6, String str4) {
        return g(str, str2, str3, i2, i3, i4, i5, -1, list, aVar, i6, str4);
    }

    public static n i(String str, String str2, String str3, int i2, int i3, List<byte[]> list, String str4, b.a.a.a.j0.a aVar) {
        return new n(str, (String) null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (b) null, -1, -1, -1, -1, -1, i3, str4, -1, Long.MAX_VALUE, list, aVar, (b.a.a.a.m0.a) null);
    }

    public static n j(String str, String str2, long j2) {
        return new n(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j2, (List<byte[]>) null, (b.a.a.a.j0.a) null, (b.a.a.a.m0.a) null);
    }

    public static n k(String str, String str2, String str3, int i2, b.a.a.a.j0.a aVar) {
        return new n(str, (String) null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, aVar, (b.a.a.a.m0.a) null);
    }

    public static n l(String str, String str2, int i2, String str3) {
        return m(str, str2, i2, str3, (b.a.a.a.j0.a) null);
    }

    public static n m(String str, String str2, int i2, String str3, b.a.a.a.j0.a aVar) {
        return o(str, str2, (String) null, -1, i2, str3, -1, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static n n(String str, String str2, String str3, int i2, int i3, String str4, int i4, b.a.a.a.j0.a aVar) {
        return o(str, str2, str3, i2, i3, str4, i4, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static n o(String str, String str2, String str3, int i2, int i3, String str4, int i4, b.a.a.a.j0.a aVar, long j2, List<byte[]> list) {
        return new n(str, (String) null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (b) null, -1, -1, -1, -1, -1, i3, str4, i4, j2, list, aVar, (b.a.a.a.m0.a) null);
    }

    public static n p(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, b.a.a.a.j0.a aVar) {
        return q(str, str2, str3, i2, i3, i4, i5, f2, list, i6, f3, (byte[]) null, -1, (b) null, aVar);
    }

    public static n q(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, b bVar, b.a.a.a.j0.a aVar) {
        return new n(str, (String) null, str2, str3, i2, i3, i4, i5, f2, i6, f3, bArr, i7, bVar, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, aVar, (b.a.a.a.m0.a) null);
    }

    @TargetApi(16)
    private static void t(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    @TargetApi(24)
    private static void u(MediaFormat mediaFormat, b bVar) {
        if (bVar != null) {
            w(mediaFormat, "color-transfer", bVar.c);
            w(mediaFormat, "color-standard", bVar.f750a);
            w(mediaFormat, "color-range", bVar.f751b);
            t(mediaFormat, "hdr-static-info", bVar.d);
        }
    }

    @TargetApi(16)
    private static void v(MediaFormat mediaFormat, String str, float f2) {
        if (f2 != -1.0f) {
            mediaFormat.setFloat(str, f2);
        }
    }

    @TargetApi(16)
    private static void w(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    @TargetApi(16)
    private static void x(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public n a(b.a.a.a.j0.a aVar) {
        String str = this.f542a;
        return new n(str, this.e, this.f, this.c, this.f543b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.h, aVar, this.d);
    }

    public n b(int i2, int i3) {
        String str = this.f542a;
        return new n(str, this.e, this.f, this.c, this.f543b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, i2, i3, this.x, this.y, this.z, this.w, this.h, this.i, this.d);
    }

    public n c(int i2) {
        String str = this.f542a;
        return new n(str, this.e, this.f, this.c, this.f543b, i2, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.h, this.i, this.d);
    }

    public n d(b.a.a.a.m0.a aVar) {
        String str = this.f542a;
        return new n(str, this.e, this.f, this.c, this.f543b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.h, this.i, aVar);
    }

    public int describeContents() {
        return 0;
    }

    public n e(long j2) {
        return new n(this.f542a, this.e, this.f, this.c, this.f543b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, j2, this.h, this.i, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f543b == nVar.f543b && this.g == nVar.g && this.j == nVar.j && this.k == nVar.k && this.l == nVar.l && this.m == nVar.m && this.n == nVar.n && this.o == nVar.o && this.r == nVar.r && this.s == nVar.s && this.t == nVar.t && this.u == nVar.u && this.v == nVar.v && this.w == nVar.w && this.x == nVar.x && w.b(this.f542a, nVar.f542a) && w.b(this.y, nVar.y) && this.z == nVar.z && w.b(this.e, nVar.e) && w.b(this.f, nVar.f) && w.b(this.c, nVar.c) && w.b(this.i, nVar.i) && w.b(this.d, nVar.d) && w.b(this.q, nVar.q) && Arrays.equals(this.p, nVar.p) && this.h.size() == nVar.h.size()) {
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    if (!Arrays.equals(this.h.get(i2), nVar.h.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.A == 0) {
            String str = this.f542a;
            int i2 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f543b) * 31) + this.j) * 31) + this.k) * 31) + this.r) * 31) + this.s) * 31;
            String str5 = this.y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.z) * 31;
            b.a.a.a.j0.a aVar = this.i;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b.a.a.a.m0.a aVar2 = this.d;
            if (aVar2 != null) {
                i2 = aVar2.hashCode();
            }
            this.A = hashCode6 + i2;
        }
        return this.A;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat r() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f);
        x(mediaFormat, "language", this.y);
        w(mediaFormat, "max-input-size", this.g);
        w(mediaFormat, "width", this.j);
        w(mediaFormat, "height", this.k);
        v(mediaFormat, "frame-rate", this.l);
        w(mediaFormat, "rotation-degrees", this.m);
        w(mediaFormat, "channel-count", this.r);
        w(mediaFormat, "sample-rate", this.s);
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            mediaFormat.setByteBuffer("csd-" + i2, ByteBuffer.wrap(this.h.get(i2)));
        }
        u(mediaFormat, this.q);
        return mediaFormat;
    }

    public int s() {
        int i2;
        int i3 = this.j;
        if (i3 == -1 || (i2 = this.k) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public String toString() {
        return "Format(" + this.f542a + ", " + this.e + ", " + this.f + ", " + this.f543b + ", " + this.y + ", [" + this.j + ", " + this.k + ", " + this.l + "], [" + this.r + ", " + this.s + "])";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f542a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.c);
        parcel.writeInt(this.f543b);
        parcel.writeInt(this.g);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.l);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        parcel.writeInt(this.p != null ? 1 : 0);
        byte[] bArr = this.p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.o);
        parcel.writeParcelable(this.q, i2);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeLong(this.w);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.h.get(i3));
        }
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
