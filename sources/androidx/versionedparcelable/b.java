package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f220a;

    /* renamed from: b  reason: collision with root package name */
    private final Parcel f221b;
    private final int c;
    private final int d;
    private final String e;
    private int f;
    private int g;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    b(Parcel parcel, int i, int i2, String str) {
        this.f220a = new SparseIntArray();
        this.f = -1;
        this.g = 0;
        this.f221b = parcel;
        this.c = i;
        this.d = i2;
        this.g = i;
        this.e = str;
    }

    private int F(int i) {
        int readInt;
        do {
            int i2 = this.g;
            if (i2 >= this.d) {
                return -1;
            }
            this.f221b.setDataPosition(i2);
            int readInt2 = this.f221b.readInt();
            readInt = this.f221b.readInt();
            this.g += readInt2;
        } while (readInt != i);
        return this.f221b.dataPosition();
    }

    public void a() {
        int i = this.f;
        if (i >= 0) {
            int i2 = this.f220a.get(i);
            int dataPosition = this.f221b.dataPosition();
            this.f221b.setDataPosition(i2);
            this.f221b.writeInt(dataPosition - i2);
            this.f221b.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public a b() {
        Parcel parcel = this.f221b;
        int dataPosition = parcel.dataPosition();
        int i = this.g;
        if (i == this.c) {
            i = this.d;
        }
        return new b(parcel, dataPosition, i, this.e + "  ");
    }

    public byte[] f() {
        int readInt = this.f221b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f221b.readByteArray(bArr);
        return bArr;
    }

    public boolean h(int i) {
        int F = F(i);
        if (F == -1) {
            return false;
        }
        this.f221b.setDataPosition(F);
        return true;
    }

    public int j() {
        return this.f221b.readInt();
    }

    public <T extends Parcelable> T l() {
        return this.f221b.readParcelable(b.class.getClassLoader());
    }

    public String n() {
        return this.f221b.readString();
    }

    public void r(int i) {
        a();
        this.f = i;
        this.f220a.put(i, this.f221b.dataPosition());
        v(0);
        v(i);
    }

    public void t(byte[] bArr) {
        if (bArr != null) {
            this.f221b.writeInt(bArr.length);
            this.f221b.writeByteArray(bArr);
            return;
        }
        this.f221b.writeInt(-1);
    }

    public void v(int i) {
        this.f221b.writeInt(i);
    }

    public void x(Parcelable parcelable) {
        this.f221b.writeParcelable(parcelable, 0);
    }

    public void z(String str) {
        this.f221b.writeString(str);
    }
}
