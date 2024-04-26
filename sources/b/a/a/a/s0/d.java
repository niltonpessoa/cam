package b.a.a.a.s0;

import b.a.a.a.r0.k;
import b.a.a.a.r0.m;
import b.a.a.a.u;
import java.util.Collections;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f756a;

    /* renamed from: b  reason: collision with root package name */
    public final int f757b;

    private d(List<byte[]> list, int i) {
        this.f756a = list;
        this.f757b = i;
    }

    public static d a(m mVar) {
        try {
            mVar.K(21);
            int x = mVar.x() & 3;
            int x2 = mVar.x();
            int c = mVar.c();
            int i = 0;
            for (int i2 = 0; i2 < x2; i2++) {
                mVar.K(1);
                int D = mVar.D();
                for (int i3 = 0; i3 < D; i3++) {
                    int D2 = mVar.D();
                    i += D2 + 4;
                    mVar.K(D2);
                }
            }
            mVar.J(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < x2; i5++) {
                mVar.K(1);
                int D3 = mVar.D();
                for (int i6 = 0; i6 < D3; i6++) {
                    int D4 = mVar.D();
                    byte[] bArr2 = k.f726a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(mVar.f734a, mVar.c(), bArr, length, D4);
                    i4 = length + D4;
                    mVar.K(D4);
                }
            }
            return new d(i == 0 ? null : Collections.singletonList(bArr), x + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new u("Error parsing HEVC config", e);
        }
    }
}
