package b.a.a.a.s0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f750a;

    /* renamed from: b  reason: collision with root package name */
    public final int f751b;
    public final int c;
    public final byte[] d;
    private int e;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[0];
        }
    }

    public b(int i, int i2, int i3, byte[] bArr) {
        this.f750a = i;
        this.f751b = i2;
        this.c = i3;
        this.d = bArr;
    }

    b(Parcel parcel) {
        this.f750a = parcel.readInt();
        this.f751b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f750a == bVar.f750a && this.f751b == bVar.f751b && this.c == bVar.c && Arrays.equals(this.d, bVar.d);
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = ((((((527 + this.f750a) * 31) + this.f751b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f750a);
        sb.append(", ");
        sb.append(this.f751b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f750a);
        parcel.writeInt(this.f751b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d != null ? 1 : 0);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
