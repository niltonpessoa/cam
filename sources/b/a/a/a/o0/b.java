package b.a.a.a.o0;

import android.graphics.Bitmap;
import android.text.Layout;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f596a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f597b;
    public final Bitmap c;
    public final float d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public final float j;
    public final boolean k;
    public final int l;

    public b(Bitmap bitmap, float f2, int i2, float f3, int i3, float f4, float f5) {
        this((CharSequence) null, (Layout.Alignment) null, bitmap, f3, 0, i3, f2, i2, f4, f5, false, -16777216);
    }

    public b(CharSequence charSequence) {
        this(charSequence, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, f2, i2, i3, f3, i4, f4, false, -16777216);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5) {
        this(charSequence, alignment, (Bitmap) null, f2, i2, i3, f3, i4, f4, Float.MIN_VALUE, z, i5);
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, float f4, float f5, boolean z, int i5) {
        this.f596a = charSequence;
        this.f597b = alignment;
        this.c = bitmap;
        this.d = f2;
        this.e = i2;
        this.f = i3;
        this.g = f3;
        this.h = i4;
        this.i = f4;
        this.j = f5;
        this.k = z;
        this.l = i5;
    }
}
