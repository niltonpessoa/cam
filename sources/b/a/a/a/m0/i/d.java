package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;
import java.util.Arrays;

public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f516b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    private final h[] f;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: b */
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f516b = parcel.readString();
        boolean z = true;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() == 0 ? false : z;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public d(String str, boolean z, boolean z2, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f516b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.c == dVar.c && this.d == dVar.d && w.b(this.f516b, dVar.f516b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f, dVar.f);
    }

    public int hashCode() {
        int i = (((true + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f516b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f516b);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f.length);
        for (h writeParcelable : this.f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
