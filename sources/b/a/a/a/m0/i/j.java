package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;

public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f525b;
    public final String c;

    static class a implements Parcelable.Creator<j> {
        a() {
        }

        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* renamed from: b */
        public j[] newArray(int i) {
            return new j[i];
        }
    }

    j(Parcel parcel) {
        super(parcel.readString());
        this.f525b = parcel.readString();
        this.c = parcel.readString();
    }

    public j(String str, String str2, String str3) {
        super(str);
        this.f525b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f523a.equals(jVar.f523a) && w.b(this.f525b, jVar.f525b) && w.b(this.c, jVar.c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f523a.hashCode()) * 31;
        String str = this.f525b;
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
        parcel.writeString(this.f525b);
        parcel.writeString(this.c);
    }
}
