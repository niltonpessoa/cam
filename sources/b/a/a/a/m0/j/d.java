package b.a.a.a.m0.j;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f531a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f532b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List<b> h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        /* renamed from: b */
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f533a;

        /* renamed from: b  reason: collision with root package name */
        public final long f534b;
        public final long c;

        private b(int i, long j, long j2) {
            this.f533a = i;
            this.f534b = j;
            this.c = j2;
        }

        /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f533a);
            parcel.writeLong(this.f534b);
            parcel.writeLong(this.c);
        }
    }

    private d(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<b> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.f531a = j2;
        this.f532b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j3;
        this.g = j4;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j5;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    private d(Parcel parcel) {
        this.f531a = parcel.readLong();
        boolean z = false;
        this.f532b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(b.a(parcel));
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1 ? true : z;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(m mVar, long j2, u uVar) {
        boolean z;
        int i2;
        int i3;
        int i4;
        long j3;
        boolean z2;
        List list;
        long j4;
        boolean z3;
        boolean z4;
        long j5;
        boolean z5;
        u uVar2 = uVar;
        long z6 = mVar.z();
        boolean z7 = (mVar.x() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z7) {
            int x = mVar.x();
            boolean z8 = (x & 128) != 0;
            boolean z9 = (x & 64) != 0;
            boolean z10 = (x & 32) != 0;
            boolean z11 = (x & 16) != 0;
            long b2 = (!z9 || z11) ? -9223372036854775807L : g.b(mVar, j2);
            if (!z9) {
                int x2 = mVar.x();
                ArrayList arrayList = new ArrayList(x2);
                for (int i5 = 0; i5 < x2; i5++) {
                    int x3 = mVar.x();
                    long b3 = !z11 ? g.b(mVar, j2) : -9223372036854775807L;
                    arrayList.add(new b(x3, b3, uVar2.b(b3), (a) null));
                }
                emptyList = arrayList;
            }
            if (z10) {
                long x4 = (long) mVar.x();
                boolean z12 = (128 & x4) != 0;
                j5 = ((((x4 & 1) << 32) | mVar.z()) * 1000) / 90;
                z5 = z12;
            } else {
                z5 = false;
                j5 = -9223372036854775807L;
            }
            i4 = mVar.D();
            z = z9;
            i3 = mVar.x();
            i2 = mVar.x();
            list = emptyList;
            long j6 = b2;
            z2 = z5;
            j3 = j5;
            z3 = z11;
            z4 = z8;
            j4 = j6;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j4 = -9223372036854775807L;
            z2 = false;
            j3 = -9223372036854775807L;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            z = false;
        }
        return new d(z6, z7, z4, z, z3, j4, uVar2.b(j4), list, z2, j3, i4, i3, i2);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f531a);
        parcel.writeByte(this.f532b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.d ? (byte) 1 : 0);
        parcel.writeByte(this.e ? (byte) 1 : 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.h.get(i3).b(parcel);
        }
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }
}
