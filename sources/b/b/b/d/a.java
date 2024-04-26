package b.b.b.d;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.a.a.d.b;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0042a();

    /* renamed from: a  reason: collision with root package name */
    private String f802a;

    /* renamed from: b  reason: collision with root package name */
    private String f803b;
    private String c;
    private long d;
    private int e;
    private String f;
    private String g;
    private long h;
    private String i;

    /* renamed from: b.b.b.d.a$a  reason: collision with other inner class name */
    class C0042a implements Parcelable.Creator<a> {
        C0042a() {
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

    public a() {
    }

    protected a(Parcel parcel) {
        this.f802a = parcel.readString();
        this.f803b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readLong();
        this.i = parcel.readString();
    }

    public a(String str, long j) {
        this.f802a = str;
        String b2 = b(str);
        this.f = b2;
        this.e = 1;
        if (b2.contains("MP4") || this.f.contains("mp4")) {
            this.e = 2;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = this.f802a;
        sb.append(str2.substring(0, str2.length() - 4));
        sb.append(".sec");
        this.f803b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        String str3 = this.f802a;
        sb2.append(str3.substring(0, str3.length() - 4));
        sb2.append(".thm");
        this.c = sb2.toString();
        String str4 = this.f;
        this.i = str4.substring(str4.lastIndexOf("."));
        this.g = b.n(this.f) + ".thm";
        if (this.e == 1) {
            this.c = "";
        }
        this.h = 0;
        this.d = j;
        if (this.f.contains("ASMR") || this.f.contains("ATLR")) {
            this.f803b = this.f802a;
        }
    }

    public a(String str, String str2, long j, String str3, String str4, long j2) {
        this.c = str2;
        this.f802a = str;
        this.d = j;
        this.e = n(str3, str4);
        String b2 = b(str);
        this.f = b2;
        this.g = j(b2);
        this.h = j2;
        this.f803b = g();
        String str5 = this.f;
        this.i = str5.substring(str5.lastIndexOf("."));
        if (this.f.contains("slow")) {
            this.f803b = this.f802a;
        }
    }

    private String b(String str) {
        String[] split = str.split("/");
        return (split == null || split.length <= 0) ? "" : split[split.length - 1];
    }

    private String g() {
        if (this.e != 2) {
            return null;
        }
        String str = this.f802a;
        return str.substring(0, str.length() - 4) + "_ths.mp4";
    }

    private String j(String str) {
        String str2 = str.split("\\.")[0];
        return str2 + "_ths.jpg";
    }

    private int n(String str, String str2) {
        if ("lock".equals(str2)) {
            return 3;
        }
        return "photo".equals(str) ? 1 : 2;
    }

    public String a() {
        return this.i;
    }

    public long c() {
        return this.h;
    }

    public String d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        String str = this.f802a;
        return str.substring(str.indexOf("/mnt"), str.length());
    }

    public String f() {
        return this.f802a;
    }

    public String h() {
        return this.f803b;
    }

    public String i() {
        return this.g;
    }

    public String k() {
        return this.c;
    }

    public long l() {
        return this.d;
    }

    public int m() {
        return this.e;
    }

    public void o(long j) {
        this.h = j;
    }

    public void p(String str) {
        this.f = str;
    }

    public void q(String str) {
        this.f802a = str;
    }

    public void r(String str) {
        this.f803b = str;
    }

    public void s(String str) {
        this.g = str;
    }

    public void t(String str) {
        this.c = str;
    }

    public String toString() {
        return "[name=" + this.f + "][time=" + this.d + "][type=" + this.e + "][path_origin=" + this.f802a + "]";
    }

    public void u(long j) {
        this.d = j;
    }

    public void v(int i2) {
        this.e = i2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f802a);
        parcel.writeString(this.f803b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
    }
}
