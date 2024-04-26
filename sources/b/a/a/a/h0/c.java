package b.a.a.a.h0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
public final class c {
    public static final c c = new c(new int[]{2}, 2);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f253a;

    /* renamed from: b  reason: collision with root package name */
    private final int f254b;

    c(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f253a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f253a = new int[0];
        }
        this.f254b = i;
    }

    public static c a(Context context) {
        return b(context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static c b(Intent intent) {
        return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? c : new c(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    public boolean c(int i) {
        return Arrays.binarySearch(this.f253a, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f253a, cVar.f253a) && this.f254b == cVar.f254b;
    }

    public int hashCode() {
        return this.f254b + (Arrays.hashCode(this.f253a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f254b + ", supportedEncodings=" + Arrays.toString(this.f253a) + "]";
    }
}
