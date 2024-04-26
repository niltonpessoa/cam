package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c f219a;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f219a = new b(parcel).p();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new b(parcel).C(this.f219a);
    }
}
