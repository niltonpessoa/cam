package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f203b = new C0012a();

    /* renamed from: a  reason: collision with root package name */
    private final Parcelable f204a;

    /* renamed from: android.support.v4.view.a$a  reason: collision with other inner class name */
    static class C0012a extends a {
        C0012a() {
            super((C0012a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f203b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a() {
        this.f204a = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f204a = readParcelable == null ? f203b : readParcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f204a = parcelable == f203b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ a(C0012a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f204a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f204a, i);
    }
}
