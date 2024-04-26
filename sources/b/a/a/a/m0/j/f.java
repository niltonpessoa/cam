package b.a.a.a.m0.j;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f535a;

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f536a;

        /* renamed from: b  reason: collision with root package name */
        public final long f537b;

        private b(int i, long j) {
            this.f536a = i;
            this.f537b = j;
        }

        /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }

        /* access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f536a);
            parcel.writeLong(this.f537b);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f538a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f539b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private c(long j2, boolean z, boolean z2, boolean z3, List<b> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.f538a = j2;
            this.f539b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j3;
            this.g = z4;
            this.h = j4;
            this.i = i2;
            this.j = i3;
            this.k = i4;
        }

        private c(Parcel parcel) {
            this.f538a = parcel.readLong();
            boolean z = false;
            this.f539b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(b.c(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1 ? true : z;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* access modifiers changed from: private */
        public static c e(m mVar) {
            boolean z;
            int i2;
            int i3;
            int i4;
            long j2;
            boolean z2;
            long j3;
            ArrayList arrayList;
            boolean z3;
            long j4;
            boolean z4;
            long z5 = mVar.z();
            boolean z6 = (mVar.x() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z6) {
                int x = mVar.x();
                boolean z7 = (x & 128) != 0;
                boolean z8 = (x & 64) != 0;
                boolean z9 = (x & 32) != 0;
                long z10 = z8 ? mVar.z() : -9223372036854775807L;
                if (!z8) {
                    int x2 = mVar.x();
                    ArrayList arrayList3 = new ArrayList(x2);
                    for (int i5 = 0; i5 < x2; i5++) {
                        arrayList3.add(new b(mVar.x(), mVar.z(), (a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z9) {
                    long x3 = (long) mVar.x();
                    boolean z11 = (128 & x3) != 0;
                    j4 = ((((x3 & 1) << 32) | mVar.z()) * 1000) / 90;
                    z4 = z11;
                } else {
                    z4 = false;
                    j4 = -9223372036854775807L;
                }
                int D = mVar.D();
                int x4 = mVar.x();
                z = z8;
                i2 = mVar.x();
                j2 = j4;
                arrayList = arrayList2;
                long j5 = z10;
                i4 = D;
                i3 = x4;
                j3 = j5;
                boolean z12 = z7;
                z2 = z4;
                z3 = z12;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j3 = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                z = false;
            }
            return new c(z5, z6, z3, z, arrayList, j3, z2, j2, i4, i3, i2);
        }

        /* access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f538a);
            parcel.writeByte(this.f539b ? (byte) 1 : 0);
            parcel.writeByte(this.c ? (byte) 1 : 0);
            parcel.writeByte(this.d ? (byte) 1 : 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f.get(i2).d(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(c.d(parcel));
        }
        this.f535a = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    private f(List<c> list) {
        this.f535a = Collections.unmodifiableList(list);
    }

    static f a(m mVar) {
        int x = mVar.x();
        ArrayList arrayList = new ArrayList(x);
        for (int i = 0; i < x; i++) {
            arrayList.add(c.e(mVar));
        }
        return new f((List<c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f535a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f535a.get(i2).f(parcel);
        }
    }
}
