package b.a.a.a.m0.j;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.m;

public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0029a();

    /* renamed from: a  reason: collision with root package name */
    public final long f527a;

    /* renamed from: b  reason: collision with root package name */
    public final long f528b;
    public final byte[] c;

    /* renamed from: b.a.a.a.m0.j.a$a  reason: collision with other inner class name */
    static class C0029a implements Parcelable.Creator<a> {
        C0029a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0029a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a(long j, byte[] bArr, long j2) {
        this.f527a = j2;
        this.f528b = j;
        this.c = bArr;
    }

    private a(Parcel parcel) {
        this.f527a = parcel.readLong();
        this.f528b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.c = bArr;
        parcel.readByteArray(bArr);
    }

    /* synthetic */ a(Parcel parcel, C0029a aVar) {
        this(parcel);
    }

    static a a(m mVar, int i, long j) {
        long z = mVar.z();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        mVar.g(bArr, 0, i2);
        return new a(z, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f527a);
        parcel.writeLong(this.f528b);
        parcel.writeInt(this.c.length);
        parcel.writeByteArray(this.c);
    }
}
