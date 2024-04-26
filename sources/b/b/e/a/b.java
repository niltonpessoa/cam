package b.b.e.a;

import java.io.UnsupportedEncodingException;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f821a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f822b;
    private int c;
    private byte[] d;
    private int e;

    public b(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f821a = i;
        this.f822b = bArr;
        this.c = i2;
        this.d = bArr2;
        this.e = i3;
    }

    public byte[] a() {
        return this.d;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f821a;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = "";
        try {
            str = this.f822b != null ? new String(this.f822b, "UTF-8") : str3;
            try {
                if (this.d != null) {
                    str3 = new String(this.d, "UTF-8");
                }
            } catch (UnsupportedEncodingException e2) {
                UnsupportedEncodingException unsupportedEncodingException = e2;
                str2 = str;
                e = unsupportedEncodingException;
                e.printStackTrace();
                str = str2;
                return "IOCtrlReturnMsg [sid=" + this.f821a + ", uid=" + str + ", IOCTRLType=0x" + Integer.toHexString(this.c) + ", len=" + this.e + ", data=" + str3 + "]";
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            str2 = str3;
        }
        return "IOCtrlReturnMsg [sid=" + this.f821a + ", uid=" + str + ", IOCTRLType=0x" + Integer.toHexString(this.c) + ", len=" + this.e + ", data=" + str3 + "]";
    }
}
