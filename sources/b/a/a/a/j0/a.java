package b.a.a.a.j0;

import android.os.Parcel;
import android.os.Parcelable;
import b.a.a.a.r0.w;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class a implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0018a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f301a;

    /* renamed from: b  reason: collision with root package name */
    private int f302b;
    public final String c;
    public final int d;

    /* renamed from: b.a.a.a.j0.a$a  reason: collision with other inner class name */
    static class C0018a implements Parcelable.Creator<a> {
        C0018a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C0019a();

        /* renamed from: a  reason: collision with root package name */
        private int f303a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final UUID f304b;
        public final String c;
        public final byte[] d;
        public final boolean e;

        /* renamed from: b.a.a.a.j0.a$b$a  reason: collision with other inner class name */
        static class C0019a implements Parcelable.Creator<b> {
            C0019a() {
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

        b(Parcel parcel) {
            this.f304b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            this.d = parcel.createByteArray();
            this.e = parcel.readByte() != 0;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public b(UUID uuid, String str, byte[] bArr, boolean z) {
            b.a.a.a.r0.a.e(uuid);
            this.f304b = uuid;
            b.a.a.a.r0.a.e(str);
            this.c = str;
            this.d = bArr;
            this.e = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return this.c.equals(bVar.c) && w.b(this.f304b, bVar.f304b) && Arrays.equals(this.d, bVar.d);
        }

        public int hashCode() {
            if (this.f303a == 0) {
                this.f303a = (((this.f304b.hashCode() * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
            }
            return this.f303a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f304b.getMostSignificantBits());
            parcel.writeLong(this.f304b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeByteArray(this.d);
            parcel.writeByte(this.e ? (byte) 1 : 0);
        }
    }

    a(Parcel parcel) {
        this.c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f301a = bVarArr;
        this.d = bVarArr.length;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: b.a.a.a.j0.a$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(java.lang.String r1, boolean r2, b.a.a.a.j0.a.b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            b.a.a.a.j0.a$b[] r3 = (b.a.a.a.j0.a.b[]) r3
        L_0x000e:
            java.util.Arrays.sort(r3, r0)
            r0.f301a = r3
            int r1 = r3.length
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.j0.a.<init>(java.lang.String, boolean, b.a.a.a.j0.a$b[]):void");
    }

    public a(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public a(List<b> list) {
        this((String) null, false, (b[]) list.toArray(new b[list.size()]));
    }

    public a(b... bVarArr) {
        this((String) null, bVarArr);
    }

    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = b.a.a.a.b.f225b;
        return uuid.equals(bVar.f304b) ? uuid.equals(bVar2.f304b) ? 0 : 1 : bVar.f304b.compareTo(bVar2.f304b);
    }

    public a b(String str) {
        return w.b(this.c, str) ? this : new a(str, false, this.f301a);
    }

    public b c(int i) {
        return this.f301a[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return w.b(this.c, aVar.c) && Arrays.equals(this.f301a, aVar.f301a);
    }

    public int hashCode() {
        if (this.f302b == 0) {
            String str = this.c;
            this.f302b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f301a);
        }
        return this.f302b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.f301a, 0);
    }
}
