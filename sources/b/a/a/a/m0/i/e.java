package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;

public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f517b;
    public final String c;
    public final String d;

    static class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    e(Parcel parcel) {
        super("COMM");
        this.f517b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f517b = str;
        this.c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return w.b(this.c, eVar.c) && w.b(this.f517b, eVar.f517b) && w.b(this.d, eVar.d);
    }

    public int hashCode() {
        String str = this.f517b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f523a);
        parcel.writeString(this.f517b);
        parcel.writeString(this.d);
    }
}
