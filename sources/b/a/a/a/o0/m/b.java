package b.a.a.a.o0.m;

import android.text.Layout;

final class b extends b.a.a.a.o0.b implements Comparable<b> {
    public final int m;

    public b(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.m = i5;
    }

    /* renamed from: a */
    public int compareTo(b bVar) {
        int i = bVar.m;
        int i2 = this.m;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
