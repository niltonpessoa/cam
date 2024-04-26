package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;

public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f526b;
    public final String c;

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* renamed from: b */
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    k(Parcel parcel) {
        super(parcel.readString());
        this.f526b = parcel.readString();
        this.c = parcel.readString();
    }

    public k(String str, String str2, String str3) {
        super(str);
        this.f526b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f523a.equals(kVar.f523a) && w.b(this.f526b, kVar.f526b) && w.b(this.c, kVar.c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f523a.hashCode()) * 31;
        String str = this.f526b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f523a);
        parcel.writeString(this.f526b);
        parcel.writeString(this.c);
    }
}
