package a.b.b.a;

import a.b.b.a.a;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final Handler f13a = null;

    /* renamed from: b  reason: collision with root package name */
    a f14b;

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

    /* renamed from: a.b.b.a.b$b  reason: collision with other inner class name */
    class C0003b extends a.C0001a {
        C0003b() {
        }

        public void n(int i, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f13a;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                bVar.a(i, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f16a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f17b;

        c(int i, Bundle bundle) {
            this.f16a = i;
            this.f17b = bundle;
        }

        public void run() {
            b.this.a(this.f16a, this.f17b);
        }
    }

    b(Parcel parcel) {
        this.f14b = a.C0001a.p(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f14b == null) {
                this.f14b = new C0003b();
            }
            parcel.writeStrongBinder(this.f14b.asBinder());
        }
    }
}
