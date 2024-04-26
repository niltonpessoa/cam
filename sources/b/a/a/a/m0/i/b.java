package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f514b;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    b(Parcel parcel) {
        super(parcel.readString());
        this.f514b = parcel.createByteArray();
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f514b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f523a.equals(bVar.f523a) && Arrays.equals(this.f514b, bVar.f514b);
    }

    public int hashCode() {
        return ((527 + this.f523a.hashCode()) * 31) + Arrays.hashCode(this.f514b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f523a);
        parcel.writeByteArray(this.f514b);
    }
}
