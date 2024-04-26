package b.b.b.d;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f804a;

    public b(String str, String str2) {
        this.f804a = a(str);
        Long.valueOf(str2).longValue();
    }

    private String a(String str) {
        String[] split = str.split("/");
        return (split == null || split.length <= 0) ? "" : split[split.length - 1];
    }

    public String b() {
        return this.f804a;
    }
}
