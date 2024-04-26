package androidx.media;

import androidx.versionedparcelable.a;

public final class AudioAttributesImplBaseParcelizer {
    public static c read(a aVar) {
        c cVar = new c();
        cVar.f171a = aVar.k(cVar.f171a, 1);
        cVar.f172b = aVar.k(cVar.f172b, 2);
        cVar.c = aVar.k(cVar.c, 3);
        cVar.d = aVar.k(cVar.d, 4);
        return cVar;
    }

    public static void write(c cVar, a aVar) {
        aVar.s(false, false);
        aVar.w(cVar.f171a, 1);
        aVar.w(cVar.f172b, 2);
        aVar.w(cVar.c, 3);
        aVar.w(cVar.d, 4);
    }
}
