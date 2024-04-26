package androidx.media;

import android.support.v4.media.AudioAttributesCompat;
import androidx.versionedparcelable.a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f158a = (a) aVar.q(audioAttributesCompat.f158a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.s(false, false);
        aVar.D(audioAttributesCompat.f158a, 1);
    }
}
