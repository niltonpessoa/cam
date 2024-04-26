package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f75a;

    /* renamed from: b  reason: collision with root package name */
    final int f76b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;
    final boolean l;

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(Parcel parcel) {
        this.f75a = parcel.createIntArray();
        this.f76b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        this.l = parcel.readInt() != 0;
    }

    public c(b bVar) {
        int size = bVar.f72b.size();
        this.f75a = new int[(size * 6)];
        if (bVar.i) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                b.a aVar = bVar.f72b.get(i3);
                int[] iArr = this.f75a;
                int i4 = i2 + 1;
                iArr[i2] = aVar.f73a;
                int i5 = i4 + 1;
                e eVar = aVar.f74b;
                iArr[i4] = eVar != null ? eVar.e : -1;
                int i6 = i5 + 1;
                iArr[i5] = aVar.c;
                int i7 = i6 + 1;
                iArr[i6] = aVar.d;
                int i8 = i7 + 1;
                iArr[i7] = aVar.e;
                i2 = i8 + 1;
                iArr[i8] = aVar.f;
            }
            this.f76b = bVar.g;
            this.c = bVar.h;
            this.d = bVar.j;
            this.e = bVar.l;
            this.f = bVar.m;
            this.g = bVar.n;
            this.h = bVar.o;
            this.i = bVar.p;
            this.j = bVar.q;
            this.k = bVar.r;
            this.l = bVar.s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public b a(k kVar) {
        b bVar = new b(kVar);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f75a;
            if (i2 < iArr.length) {
                b.a aVar = new b.a();
                int i4 = i2 + 1;
                aVar.f73a = iArr[i2];
                if (k.E) {
                    Log.v("FragmentManager", "Instantiate " + bVar + " op #" + i3 + " base fragment #" + this.f75a[i4]);
                }
                int i5 = i4 + 1;
                int i6 = this.f75a[i4];
                aVar.f74b = i6 >= 0 ? kVar.e.get(i6) : null;
                int[] iArr2 = this.f75a;
                int i7 = i5 + 1;
                int i8 = iArr2[i5];
                aVar.c = i8;
                int i9 = i7 + 1;
                int i10 = iArr2[i7];
                aVar.d = i10;
                int i11 = i9 + 1;
                int i12 = iArr2[i9];
                aVar.e = i12;
                int i13 = iArr2[i11];
                aVar.f = i13;
                bVar.c = i8;
                bVar.d = i10;
                bVar.e = i12;
                bVar.f = i13;
                bVar.f(aVar);
                i3++;
                i2 = i11 + 1;
            } else {
                bVar.g = this.f76b;
                bVar.h = this.c;
                bVar.j = this.d;
                bVar.l = this.e;
                bVar.i = true;
                bVar.m = this.f;
                bVar.n = this.g;
                bVar.o = this.h;
                bVar.p = this.i;
                bVar.q = this.j;
                bVar.r = this.k;
                bVar.s = this.l;
                bVar.g(1);
                return bVar;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f75a);
        parcel.writeInt(this.f76b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        parcel.writeInt(this.l ? 1 : 0);
    }
}
