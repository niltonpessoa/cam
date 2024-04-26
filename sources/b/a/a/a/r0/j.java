package b.a.a.a.r0;

import android.text.TextUtils;

public final class j {
    public static int a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 4;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
                return 6;
            case 1:
                return 7;
            case 2:
                return 5;
            case 4:
                return 8;
            case 5:
                return 14;
            default:
                return 0;
        }
    }

    public static String b(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            return "video/avc";
        }
        if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (trim.startsWith("vp9") || trim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (trim.startsWith("vp8") || trim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (trim.startsWith("mp4a")) {
            if (trim.startsWith("mp4a.")) {
                String substring = trim.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = c(Integer.parseInt(w.H(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (trim.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (trim.startsWith("opus")) {
                return "audio/opus";
            }
            if (trim.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            return null;
        }
    }

    public static String c(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 107) {
            return "audio/mpeg";
        }
        if (i == 96 || i == 97) {
            return "video/mpeg2";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
                return "audio/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    default:
                        return null;
                }
        }
    }

    private static String d(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (f(str)) {
            return 1;
        }
        if (h(str)) {
            return 2;
        }
        if (g(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        return ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-camera-motion".equals(str)) ? 4 : -1;
    }

    public static boolean f(String str) {
        return "audio".equals(d(str));
    }

    public static boolean g(String str) {
        return "text".equals(d(str));
    }

    public static boolean h(String str) {
        return "video".equals(d(str));
    }
}
