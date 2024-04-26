package b.a.a.a.m0.j;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;

public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f540a;

    /* renamed from: b  reason: collision with root package name */
    public final long f541b;

    static class a implements Parcelable.Creator<g> {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public g[] newArray(int i) {
            return new g[i];
        }
    }

    private g(long j, long j2) {
        this.f540a = j;
        this.f541b = j2;
    }

    /* synthetic */ g(long j, long j2, a aVar) {
        this(j, j2);
    }

    static g a(m mVar, long j, u uVar) {
        long b2 = b(mVar, j);
        return new g(b2, uVar.b(b2));
    }

    static long b(m mVar, long j) {
        long x = (long) mVar.x();
        if ((128 & x) != 0) {
            return 8589934591L & ((((x & 1) << 32) | mVar.z()) + j);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f540a);
        parcel.writeLong(this.f541b);
    }
}
