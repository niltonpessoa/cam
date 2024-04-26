package b.a.a.a.m0.i;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;
import java.util.Arrays;

public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f515b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    private final h[] g;

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

    c(Parcel parcel) {
        super("CHAP");
        this.f515b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public c(String str, int i, int i2, long j, long j2, h[] hVarArr) {
        super("CHAP");
        this.f515b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = hVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && w.b(this.f515b, cVar.f515b) && Arrays.equals(this.g, cVar.g);
    }

    public int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.f515b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f515b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g.length);
        for (h writeParcelable : this.g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
