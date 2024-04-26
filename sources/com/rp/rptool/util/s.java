package com.rp.rptool.util;

import java.io.UnsupportedEncodingException;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public int f959a;

    /* renamed from: b  reason: collision with root package name */
    public int f960b;
    public byte[] c = new byte[992];

    public s(byte[] bArr) {
        this.f959a = b.b(bArr, 0);
        this.f960b = b.b(bArr, 4);
        byte[] bArr2 = this.c;
        System.arraycopy(bArr, 8, bArr2, 0, bArr2.length);
    }

    public String toString() {
        String str;
        try {
            str = new String(this.c, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str = "";
        }
        return "AW_cdr_get_file_list [totalCnt=" + this.f959a + ", currentIndex=" + this.f960b + ", filelist=" + str + "]";
    }
}
