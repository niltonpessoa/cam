package b.a.a.a.s0;

import b.a.a.a.r0.c;
import b.a.a.a.r0.k;
import b.a.a.a.r0.m;
import b.a.a.a.u;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f748a;

    /* renamed from: b  reason: collision with root package name */
    public final int f749b;
    public final int c;
    public final int d;
    public final float e;

    private a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f748a = list;
        this.f749b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    private static byte[] a(m mVar) {
        int D = mVar.D();
        int c2 = mVar.c();
        mVar.K(D);
        return c.b(mVar.f734a, c2, D);
    }

    public static a b(m mVar) {
        float f;
        int i;
        int i2;
        try {
            mVar.K(4);
            int x = (mVar.x() & 3) + 1;
            if (x != 3) {
                ArrayList arrayList = new ArrayList();
                int x2 = mVar.x() & 31;
                for (int i3 = 0; i3 < x2; i3++) {
                    arrayList.add(a(mVar));
                }
                int x3 = mVar.x();
                for (int i4 = 0; i4 < x3; i4++) {
                    arrayList.add(a(mVar));
                }
                if (x2 > 0) {
                    k.b i5 = k.i((byte[]) arrayList.get(0), x, ((byte[]) arrayList.get(0)).length);
                    int i6 = i5.f731b;
                    int i7 = i5.c;
                    f = i5.d;
                    i2 = i6;
                    i = i7;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new a(arrayList, x, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new u("Error parsing AVC config", e2);
        }
    }
}
