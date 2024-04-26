package com.rp.rptool.util;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public int f963a;

    /* renamed from: b  reason: collision with root package name */
    public int f964b;
    public int c;
    public byte[] d = new byte[4];

    public z(byte[] bArr) {
        this.f963a = b.a(bArr, 0);
        this.f964b = b.a(bArr, 4);
        this.c = b.a(bArr, 8);
        byte[] bArr2 = this.d;
        System.arraycopy(bArr, 10, bArr2, 0, bArr2.length);
    }

    public String toString() {
        return "AW_cdr_tf_capacity is \n [capacity=" + this.f963a + "MB\nfree_space=" + this.f964b + "MB\ndisk_status 0-正常，1-未格式化，2-错误，3-文件系统不匹配，4-休眠, 5-无磁盘, 6-正在格式化\ndisk_status is " + this.c;
    }
}
