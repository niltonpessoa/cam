package b.a.a.a.m0.h;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.m0.a;
import b.a.a.a.r0.w;
import java.util.Arrays;

public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0027a();

    /* renamed from: a  reason: collision with root package name */
    public final String f511a;

    /* renamed from: b  reason: collision with root package name */
    public final String f512b;
    public final long c;
    public final long d;
    public final long e;
    public final byte[] f;
    private int g;

    /* renamed from: b.a.a.a.m0.h.a$a  reason: collision with other inner class name */
    static class C0027a implements Parcelable.Creator<a> {
        C0027a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    a(Parcel parcel) {
        this.f511a = parcel.readString();
        this.f512b = parcel.readString();
        this.d = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.createByteArray();
    }

    public a(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.f511a = str;
        this.f512b = str2;
        this.c = j;
        this.e = j2;
        this.f = bArr;
        this.d = j3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.d == aVar.d && this.c == aVar.c && this.e == aVar.e && w.b(this.f511a, aVar.f511a) && w.b(this.f512b, aVar.f512b) && Arrays.equals(this.f, aVar.f);
    }

    public int hashCode() {
        if (this.g == 0) {
            String str = this.f511a;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f512b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.d;
            long j2 = this.c;
            long j3 = this.e;
            this.g = ((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f);
        }
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f511a);
        parcel.writeString(this.f512b);
        parcel.writeLong(this.d);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        parcel.writeByteArray(this.f);
    }
}
