package b.a.a.a.m0.j;

import android.os.Parcel;
import android.os.Parcelable;

public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    static class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e();
        }

        /* renamed from: b */
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
