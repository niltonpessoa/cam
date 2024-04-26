package b.a.a.a.o0;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import b.a.a.a.r0.w;

public final class a {
    public static final a g = new a(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f594a;

    /* renamed from: b  reason: collision with root package name */
    public final int f595b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public a(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f594a = i;
        this.f595b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    @TargetApi(19)
    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return w.f743a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @TargetApi(19)
    private static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    private static a c(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.f594a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.f595b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
