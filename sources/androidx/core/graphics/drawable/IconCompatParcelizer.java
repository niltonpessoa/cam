package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f155a = aVar.k(iconCompat.f155a, 1);
        iconCompat.c = aVar.g(iconCompat.c, 2);
        iconCompat.d = aVar.m(iconCompat.d, 3);
        iconCompat.e = aVar.k(iconCompat.e, 4);
        iconCompat.f = aVar.k(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) aVar.m(iconCompat.g, 6);
        iconCompat.i = aVar.o(iconCompat.i, 7);
        iconCompat.e();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.s(true, true);
        iconCompat.f(aVar.e());
        aVar.w(iconCompat.f155a, 1);
        aVar.u(iconCompat.c, 2);
        aVar.y(iconCompat.d, 3);
        aVar.w(iconCompat.e, 4);
        aVar.w(iconCompat.f, 5);
        aVar.y(iconCompat.g, 6);
        aVar.A(iconCompat.i, 7);
    }
}
