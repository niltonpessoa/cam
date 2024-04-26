package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

public final class AudioAttributesImplApi21Parcelizer {
    public static b read(a aVar) {
        b bVar = new b();
        bVar.f169a = (AudioAttributes) aVar.m(bVar.f169a, 1);
        bVar.f170b = aVar.k(bVar.f170b, 2);
        return bVar;
    }

    public static void write(b bVar, a aVar) {
        aVar.s(false, false);
        aVar.y(bVar.f169a, 1);
        aVar.w(bVar.f170b, 2);
    }
}
