package com.xforce.v5.xdvpro.widget.r;

import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.lang.reflect.Array;

public class e implements p {

    /* renamed from: a  reason: collision with root package name */
    private z f1243a = new z(0.03125d, 1.0d, 0.5d, 8);

    /* renamed from: b  reason: collision with root package name */
    private int f1244b;

    public e() {
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
                z zVar = this.f1243a;
                int i5 = this.f1244b;
                fArr2[i4] = Math.max(0.0f, Math.min(1.0f, (((float) zVar.b((double) (i4 + i5), (double) (i5 + i3))) * 0.5f) + 0.5f));
            }
        }
        return fArr;
    }

    public void b() {
        this.f1244b = w.b(1, BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);
    }
}
