package b.a.a.a.m0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0026a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f509a;

    /* renamed from: b.a.a.a.m0.a$a  reason: collision with other inner class name */
    static class C0026a implements Parcelable.Creator<a> {
        C0026a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[0];
        }
    }

    public interface b extends Parcelable {
    }

    a(Parcel parcel) {
        this.f509a = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.f509a;
            if (i < bVarArr.length) {
                bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public a(List<? extends b> list) {
        if (list != null) {
            b[] bVarArr = new b[list.size()];
            this.f509a = bVarArr;
            list.toArray(bVarArr);
            return;
        }
        this.f509a = new b[0];
    }

    public a(b... bVarArr) {
        this.f509a = bVarArr == null ? new b[0] : bVarArr;
    }

    public b a(int i) {
        return this.f509a[i];
    }

    public int b() {
        return this.f509a.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f509a, ((a) obj).f509a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f509a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f509a.length);
        for (b writeParcelable : this.f509a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
