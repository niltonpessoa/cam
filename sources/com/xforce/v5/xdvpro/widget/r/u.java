package com.xforce.v5.xdvpro.widget.r;

import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.lang.reflect.Array;

public class u implements p {

    /* renamed from: a  reason: collision with root package name */
    private z f1278a = new z(0.0625d, 1.0d, 0.65d, 1);

    /* renamed from: b  reason: collision with root package name */
    private int f1279b;

    public u() {
        b();
    }

    public float[][] a(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                float[] fArr2 = fArr[i3];
                z zVar = this.f1278a;
                int i5 = this.f1279b;
                fArr2[i4] = Math.min(1.0f, (float) Math.abs(zVar.b((double) (i4 + i5), (double) (i5 + i3))));
            }
        }
        return fArr;
    }

    public void b() {
        this.f1279b = w.b(1, BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);
    }
}
