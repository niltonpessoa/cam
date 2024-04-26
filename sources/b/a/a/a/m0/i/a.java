package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;
import java.util.Arrays;

public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0028a();

    /* renamed from: b  reason: collision with root package name */
    public final String f513b;
    public final String c;
    public final int d;
    public final byte[] e;

    /* renamed from: b.a.a.a.m0.i.a$a  reason: collision with other inner class name */
    static class C0028a implements Parcelable.Creator<a> {
        C0028a() {
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
        super("APIC");
        this.f513b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f513b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.d == aVar.d && w.b(this.f513b, aVar.f513b) && w.b(this.c, aVar.c) && Arrays.equals(this.e, aVar.e);
    }

    public int hashCode() {
        int i = (527 + this.d) * 31;
        String str = this.f513b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f513b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }
}
