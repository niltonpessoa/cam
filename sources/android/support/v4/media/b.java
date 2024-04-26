package android.support.v4.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class b implements a {

    /* renamed from: a  reason: collision with root package name */
    AudioAttributes f169a;

    /* renamed from: b  reason: collision with root package name */
    int f170b = -1;

    b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f169a.equals(((b) obj).f169a);
    }

    public int hashCode() {
        return this.f169a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f169a;
    }
}
