package b.b.a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f791a;

    /* renamed from: b  reason: collision with root package name */
    private long f792b = 0;
    private String c;
    private String d;
    private float e = 0.0f;
    private long f = 0;

    public a(String str, String str2, String str3) {
        this.f791a = str;
        this.c = str2;
        this.d = str3;
        this.f = 0;
    }

    public a(String str, String str2, String str3, long j) {
        this.f791a = str;
        this.c = str2;
        this.d = str3;
        this.f = j;
    }

    public long a() {
        return this.f792b;
    }

    public long b() {
        return this.f;
    }

    public String c() {
        return this.f791a;
    }

    public String d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public String f() {
        return this.c;
    }

    public void g(long j) {
        this.f792b = j;
    }

    public void h(float f2) {
        this.e = f2;
    }

    public String toString() {
        return "[name:" + this.f791a + "][url:" + this.c + "][path:" + this.d + "][filesize:" + this.f + "]";
    }
}
