package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;
import java.util.Arrays;

public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f524b;
    public final byte[] c;

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* renamed from: b */
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    i(Parcel parcel) {
        super("PRIV");
        this.f524b = parcel.readString();
        this.c = parcel.createByteArray();
    }

    public i(String str, byte[] bArr) {
        super("PRIV");
        this.f524b = str;
        this.c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return w.b(this.f524b, iVar.f524b) && Arrays.equals(this.c, iVar.c);
    }

    public int hashCode() {
        String str = this.f524b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f524b);
        parcel.writeByteArray(this.c);
    }
}
