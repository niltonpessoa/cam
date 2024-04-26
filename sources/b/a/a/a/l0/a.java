package b.a.a.a.l0;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import b.a.a.a.r0.j;
import b.a.a.a.r0.w;

@TargetApi(16)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f498a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f499b;
    public final boolean c;
    public final boolean d;
    private final String e;
    private final MediaCodecInfo.CodecCapabilities f;

    private a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        b.a.a.a.r0.a.e(str);
        this.f498a = str;
        this.e = str2;
        this.f = codecCapabilities;
        boolean z3 = true;
        this.f499b = !z && codecCapabilities != null && e(codecCapabilities);
        this.c = codecCapabilities != null && l(codecCapabilities);
        if (!z2 && (codecCapabilities == null || !j(codecCapabilities))) {
            z3 = false;
        }
        this.d = z3;
    }

    private static int a(String str, String str2, int i) {
        if (i > 1 || ((w.f743a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    @TargetApi(21)
    private static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        return (d2 == -1.0d || d2 <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d2);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return w.f743a >= 19 && f(codecCapabilities);
    }

    @TargetApi(19)
    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return w.f743a >= 21 && k(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return w.f743a >= 21 && m(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void o(String str) {
        Log.d("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f498a + ", " + this.e + "] [" + w.e + "]");
    }

    private void p(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f498a + ", " + this.e + "] [" + w.e + "]");
    }

    public static a q(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new a(str, str2, codecCapabilities, z, z2);
    }

    public static a r(String str) {
        return new a(str, (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    @TargetApi(21)
    public Point b(int i, int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "align.vCaps";
            } else {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(w.e(i, widthAlignment) * widthAlignment, w.e(i2, heightAlignment) * heightAlignment);
            }
        }
        p(str);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] d() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l0.a.d():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    @TargetApi(21)
    public boolean g(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (a(this.f498a, this.e, audioCapabilities.getMaxInputChannelCount()) >= i) {
                return true;
            } else {
                str = "channelCount.support, " + i;
            }
        }
        p(str);
        return false;
    }

    @TargetApi(21)
    public boolean h(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i)) {
                return true;
            } else {
                str = "sampleRate.support, " + i;
            }
        }
        p(str);
        return false;
    }

    public boolean i(String str) {
        String b2;
        StringBuilder sb;
        String str2;
        if (str == null || this.e == null || (b2 = j.b(str)) == null) {
            return true;
        }
        if (!this.e.equals(b2)) {
            sb = new StringBuilder();
            str2 = "codec.mime ";
        } else {
            Pair<Integer, Integer> e2 = d.e(str);
            if (e2 == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : d()) {
                if (codecProfileLevel.profile == ((Integer) e2.first).intValue() && codecProfileLevel.level >= ((Integer) e2.second).intValue()) {
                    return true;
                }
            }
            sb = new StringBuilder();
            str2 = "codec.profileLevel, ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", ");
        sb.append(b2);
        p(sb.toString());
        return false;
    }

    @TargetApi(21)
    public boolean n(int i, int i2, double d2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (c(videoCapabilities, i, i2, d2)) {
                return true;
            } else {
                if (i >= i2 || !c(videoCapabilities, i2, i, d2)) {
                    str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d2;
                } else {
                    o("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d2);
                    return true;
                }
            }
        }
        p(str);
        return false;
    }
}
