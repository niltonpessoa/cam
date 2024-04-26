package android.support.v4.app;

import android.arch.lifecycle.p;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f121a;

    /* renamed from: b  reason: collision with root package name */
    final int f122b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    final boolean j;
    Bundle k;
    e l;

    static class a implements Parcelable.Creator<o> {
        a() {
        }

        /* renamed from: a */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        /* renamed from: b */
        public o[] newArray(int i) {
            return new o[i];
        }
    }

    o(Parcel parcel) {
        this.f121a = parcel.readString();
        this.f122b = parcel.readInt();
        boolean z = true;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readBundle();
        this.j = parcel.readInt() == 0 ? false : z;
        this.k = parcel.readBundle();
    }

    o(e eVar) {
        this.f121a = eVar.getClass().getName();
        this.f122b = eVar.e;
        this.c = eVar.m;
        this.d = eVar.x;
        this.e = eVar.y;
        this.f = eVar.z;
        this.g = eVar.C;
        this.h = eVar.B;
        this.i = eVar.g;
        this.j = eVar.A;
    }

    public e a(i iVar, g gVar, e eVar, l lVar, p pVar) {
        if (this.l == null) {
            Context e2 = iVar.e();
            Bundle bundle = this.i;
            if (bundle != null) {
                bundle.setClassLoader(e2.getClassLoader());
            }
            this.l = gVar != null ? gVar.a(e2, this.f121a, this.i) : e.F(e2, this.f121a, this.i);
            Bundle bundle2 = this.k;
            if (bundle2 != null) {
                bundle2.setClassLoader(e2.getClassLoader());
                this.l.f80b = this.k;
            }
            this.l.Y0(this.f122b, eVar);
            e eVar2 = this.l;
            eVar2.m = this.c;
            eVar2.o = true;
            eVar2.x = this.d;
            eVar2.y = this.e;
            eVar2.z = this.f;
            eVar2.C = this.g;
            eVar2.B = this.h;
            eVar2.A = this.j;
            eVar2.r = iVar.d;
            if (k.E) {
                Log.v("FragmentManager", "Instantiated fragment " + this.l);
            }
        }
        e eVar3 = this.l;
        eVar3.u = lVar;
        eVar3.v = pVar;
        return eVar3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f121a);
        parcel.writeInt(this.f122b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
    }
}
