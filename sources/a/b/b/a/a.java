package a.b.b.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: a.b.b.a.a$a  reason: collision with other inner class name */
    public static abstract class C0001a extends Binder implements a {

        /* renamed from: a.b.b.a.a$a$a  reason: collision with other inner class name */
        private static class C0002a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f12a;

            C0002a(IBinder iBinder) {
                this.f12a = iBinder;
            }

            public IBinder asBinder() {
                return this.f12a;
            }
        }

        public C0001a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0002a(iBinder) : (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                n(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    void n(int i, Bundle bundle);
}
