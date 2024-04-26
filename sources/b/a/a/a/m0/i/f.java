package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;
import java.util.Arrays;

public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f518b;
    public final String c;
    public final String d;
    public final byte[] e;

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f518b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.createByteArray();
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f518b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return w.b(this.f518b, fVar.f518b) && w.b(this.c, fVar.c) && w.b(this.d, fVar.d) && Arrays.equals(this.e, fVar.e);
    }

    public int hashCode() {
        String str = this.f518b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f518b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }
}
