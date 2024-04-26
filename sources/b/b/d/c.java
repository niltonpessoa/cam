package b.b.d;

import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f815a;

    /* renamed from: b  reason: collision with root package name */
    private String f816b;
    private long c;
    private long d;
    private int e;
    private List<String> f;

    public c(String str, long j, long j2, int i) {
        this.f815a = str;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public c(String str, String str2, int i) {
        this.f815a = str;
        this.f816b = str2;
        this.e = i;
    }

    public c(String str, String str2, long j, long j2, int i) {
        this.f815a = str;
        this.f816b = str2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public List<String> a() {
        return this.f;
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.f815a;
    }

    public String d() {
        return this.f816b;
    }

    public int e() {
        return this.e;
    }

    public void f(List<String> list) {
        this.f = list;
    }

    public void g(String str) {
        this.f816b = str;
    }

    public String toString() {
        return "[id_name:" + this.f815a + "][name:" + this.f816b + "][cmd_send:" + this.c + "][cmd_resp:" + this.d + "][ui_type:" + this.e + "][arrayValues:" + this.f + "]";
    }
}
