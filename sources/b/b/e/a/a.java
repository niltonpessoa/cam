package b.b.e.a;

import java.io.UnsupportedEncodingException;

public class a {

    /* renamed from: a  reason: collision with root package name */
    int f819a;

    /* renamed from: b  reason: collision with root package name */
    int f820b;
    int c;
    byte[] d;

    public a() {
    }

    public a(int i, int i2, byte[] bArr, int i3) {
        this.f819a = i;
        this.f820b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public byte[] a() {
        return this.d;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.f820b;
    }

    public int d() {
        return this.f819a;
    }

    public String toString() {
        String str = "";
        try {
            if (this.d != null) {
                str = new String(this.d, "UTF-8").trim();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "[sid=" + this.f819a + "][IOCtrlType=" + this.f820b + "][IOCtrlData=" + str + "][IOCtrlDataSize=" + this.c + "]";
    }
}
