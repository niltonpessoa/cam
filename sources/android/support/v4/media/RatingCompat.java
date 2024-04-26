package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f167a;

    /* renamed from: b  reason: collision with root package name */
    private final float f168b;

    static class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f167a = i;
        this.f168b = f;
    }

    public int describeContents() {
        return this.f167a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f167a);
        sb.append(" rating=");
        float f = this.f168b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f167a);
        parcel.writeFloat(this.f168b);
    }
}
