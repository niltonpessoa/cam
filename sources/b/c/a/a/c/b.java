package b.c.a.a.c;

public class b {
    public static String h = "WEP";
    public static String i = "WPA";
    public static String j = "WPA2";
    public static String k = "OPEN";
    public static String l = "WPA/WPA2";

    /* renamed from: a  reason: collision with root package name */
    private String f863a;

    /* renamed from: b  reason: collision with root package name */
    private String f864b;
    private int c;
    private String d;
    private boolean e;
    private boolean f;
    private boolean g;

    public b(String str, String str2, int i2, String str3, boolean z) {
        this.f863a = str;
        this.f864b = str2;
        this.c = i2;
        this.d = str3;
        this.e = z;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f863a;
    }

    public String c() {
        return this.f864b;
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.e;
    }

    public void h(String str) {
        this.d = str;
    }

    public void i(boolean z) {
        this.g = z;
    }

    public void j(boolean z) {
        this.f = z;
    }

    public void k(int i2) {
        this.c = i2;
    }

    public String toString() {
        return "CCWiFi [name=" + this.f863a + ", password=" + this.f864b + ", strength=" + this.c + ", auth=" + this.d + ", isSecured=" + this.e + ", isOffLine=" + this.g + "]";
    }
}
