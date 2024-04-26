package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    o[] f117a;

    /* renamed from: b  reason: collision with root package name */
    int[] f118b;
    c[] c;
    int d = -1;
    int e;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    public m() {
    }

    public m(Parcel parcel) {
        this.f117a = (o[]) parcel.createTypedArray(o.CREATOR);
        this.f118b = parcel.createIntArray();
        this.c = (c[]) parcel.createTypedArray(c.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f117a, i);
        parcel.writeIntArray(this.f118b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
