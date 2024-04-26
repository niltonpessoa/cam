package b.a.a.a.l0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final a f501a = a.r("OMX.google.raw.decoder");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f502b = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<b, List<a>> c = new HashMap<>();
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final Map<String, Integer> f;
    private static int g = -1;

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f503a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f504b;

        public b(String str, boolean z) {
            this.f503a = str;
            this.f504b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f503a, bVar.f503a) && this.f504b == bVar.f504b;
        }

        public int hashCode() {
            String str = this.f503a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f504b ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: b.a.a.a.l0.d$d  reason: collision with other inner class name */
    private interface C0025d {
        int a();

        MediaCodecInfo b(int i);

        boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean d();
    }

    private static final class e implements C0025d {
        private e() {
        }

        public int a() {
            return MediaCodecList.getCodecCount();
        }

        public MediaCodecInfo b(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        public boolean d() {
            return false;
        }
    }

    @TargetApi(21)
    private static final class f implements C0025d {

        /* renamed from: a  reason: collision with root package name */
        private final int f505a;

        /* renamed from: b  reason: collision with root package name */
        private MediaCodecInfo[] f506b;

        public f(boolean z) {
            this.f505a = z ? 1 : 0;
        }

        private void e() {
            if (this.f506b == null) {
                this.f506b = new MediaCodecList(this.f505a).getCodecInfos();
            }
        }

        public int a() {
            e();
            return this.f506b.length;
        }

        public MediaCodecInfo b(int i) {
            e();
            return this.f506b[i];
        }

        public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        public boolean d() {
            return true;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    private static void a(List<a> list) {
        if (w.f743a < 26) {
            if (list.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(list.get(0).f498a)) {
                for (int i = 1; i < list.size(); i++) {
                    a aVar = list.get(i);
                    if ("OMX.google.raw.decoder".equals(aVar.f498a)) {
                        list.remove(i);
                        list.add(0, aVar);
                        return;
                    }
                }
            }
        }
    }

    private static int b(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    private static boolean c(String str) {
        if (w.f743a <= 22) {
            String str2 = w.d;
            if ((str2.equals("ODROID-XU3") || str2.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static Pair<Integer, Integer> d(String str, String[] strArr) {
        StringBuilder sb;
        Integer num;
        Integer num2;
        String str2;
        if (strArr.length < 2) {
            sb = new StringBuilder();
        } else {
            try {
                if (strArr[1].length() == 6) {
                    num2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                    num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                } else if (strArr.length >= 3) {
                    Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                    num = Integer.valueOf(Integer.parseInt(strArr[2]));
                    num2 = valueOf;
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                Integer valueOf2 = Integer.valueOf(d.get(num2.intValue()));
                if (valueOf2 == null) {
                    str2 = "Unknown AVC profile: " + num2;
                    Log.w("MediaCodecUtil", str2);
                    return null;
                }
                Integer valueOf3 = Integer.valueOf(e.get(num.intValue()));
                if (valueOf3 != null) {
                    return new Pair<>(valueOf2, valueOf3);
                }
                sb = new StringBuilder();
                sb.append("Unknown AVC level: ");
                sb.append(num);
                str2 = sb.toString();
                Log.w("MediaCodecUtil", str2);
                return null;
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        }
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        Log.w("MediaCodecUtil", str2);
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r3.equals("avc1") == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> e(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            r2 = 0
            r3 = r1[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3006243: goto L_0x003b;
                case 3006244: goto L_0x0030;
                case 3199032: goto L_0x0025;
                case 3214780: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r2 = -1
            goto L_0x0044
        L_0x001a:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            r2 = 3
            goto L_0x0044
        L_0x0025:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x002e
            goto L_0x0018
        L_0x002e:
            r2 = 2
            goto L_0x0044
        L_0x0030:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0039
            goto L_0x0018
        L_0x0039:
            r2 = 1
            goto L_0x0044
        L_0x003b:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0044
            goto L_0x0018
        L_0x0044:
            switch(r2) {
                case 0: goto L_0x004d;
                case 1: goto L_0x004d;
                case 2: goto L_0x0048;
                case 3: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            return r0
        L_0x0048:
            android.util.Pair r6 = i(r6, r1)
            return r6
        L_0x004d:
            android.util.Pair r6 = d(r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l0.d.e(java.lang.String):android.util.Pair");
    }

    public static a f(String str, boolean z) {
        List<a> g2 = g(str, z);
        if (g2.isEmpty()) {
            return null;
        }
        return g2.get(0);
    }

    public static synchronized List<a> g(String str, boolean z) {
        synchronized (d.class) {
            b bVar = new b(str, z);
            HashMap<b, List<a>> hashMap = c;
            List<a> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = w.f743a;
            C0025d fVar = i >= 21 ? new f(z) : new e();
            ArrayList<a> h = h(bVar, fVar, str);
            if (z && h.isEmpty() && 21 <= i && i <= 23) {
                fVar = new e();
                h = h(bVar, fVar, str);
                if (!h.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + h.get(0).f498a);
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                h.addAll(h(new b("audio/eac3", bVar.f504b), fVar, str));
            }
            a(h);
            List<a> unmodifiableList = Collections.unmodifiableList(h);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[Catch:{ Exception -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[Catch:{ Exception -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a A[SYNTHETIC, Splitter:B:38:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<b.a.a.a.l0.a> h(b.a.a.a.l0.d.b r17, b.a.a.a.l0.d.C0025d r18, java.lang.String r19) {
        /*
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e1 }
            r3.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r4 = r1.f503a     // Catch:{ Exception -> 0x00e1 }
            int r5 = r18.a()     // Catch:{ Exception -> 0x00e1 }
            boolean r6 = r18.d()     // Catch:{ Exception -> 0x00e1 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x00e0
            android.media.MediaCodecInfo r9 = r2.b(r8)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x00e1 }
            r11 = r19
            boolean r0 = k(r9, r10, r6, r11)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x00e1 }
            int r13 = r12.length     // Catch:{ Exception -> 0x00e1 }
            r14 = 0
        L_0x002c:
            if (r14 >= r13) goto L_0x00d6
            r15 = r12[r14]     // Catch:{ Exception -> 0x00e1 }
            boolean r0 = r15.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x00cc
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r15)     // Catch:{ Exception -> 0x007f }
            boolean r7 = r2.c(r4, r0)     // Catch:{ Exception -> 0x007f }
            boolean r2 = c(r10)     // Catch:{ Exception -> 0x007f }
            if (r6 == 0) goto L_0x004f
            r16 = r5
            boolean r5 = r1.f504b     // Catch:{ Exception -> 0x004d }
            if (r5 == r7) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r5 = 0
            goto L_0x0058
        L_0x004d:
            r0 = move-exception
            goto L_0x0082
        L_0x004f:
            r16 = r5
        L_0x0051:
            if (r6 != 0) goto L_0x0060
            boolean r5 = r1.f504b     // Catch:{ Exception -> 0x004d }
            if (r5 != 0) goto L_0x0060
            goto L_0x004b
        L_0x0058:
            b.a.a.a.l0.a r0 = b.a.a.a.l0.a.q(r10, r4, r0, r2, r5)     // Catch:{ Exception -> 0x004d }
            r3.add(r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x00ce
        L_0x0060:
            r5 = 0
            if (r6 != 0) goto L_0x00ce
            if (r7 == 0) goto L_0x00ce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r7.<init>()     // Catch:{ Exception -> 0x004d }
            r7.append(r10)     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = ".secure"
            r7.append(r5)     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x004d }
            r7 = 1
            b.a.a.a.l0.a r0 = b.a.a.a.l0.a.q(r5, r4, r0, r2, r7)     // Catch:{ Exception -> 0x004d }
            r3.add(r0)     // Catch:{ Exception -> 0x004d }
            return r3
        L_0x007f:
            r0 = move-exception
            r16 = r5
        L_0x0082:
            int r2 = b.a.a.a.r0.w.f743a     // Catch:{ Exception -> 0x00e1 }
            r5 = 23
            java.lang.String r7 = "MediaCodecUtil"
            if (r2 > r5) goto L_0x00aa
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x00e1 }
            if (r2 != 0) goto L_0x00aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
            r0.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = "Skipping codec "
            r0.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r0.append(r10)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = " (failed to query capabilities)"
            r0.append(r2)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e1 }
            android.util.Log.e(r7, r0)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00ce
        L_0x00aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
            r1.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = "Failed to query codec "
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r1.append(r10)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r1.append(r15)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00e1 }
            android.util.Log.e(r7, r1)     // Catch:{ Exception -> 0x00e1 }
            throw r0     // Catch:{ Exception -> 0x00e1 }
        L_0x00cc:
            r16 = r5
        L_0x00ce:
            int r14 = r14 + 1
            r2 = r18
            r5 = r16
            goto L_0x002c
        L_0x00d6:
            r16 = r5
            int r8 = r8 + 1
            r2 = r18
            r5 = r16
            goto L_0x0014
        L_0x00e0:
            return r3
        L_0x00e1:
            r0 = move-exception
            b.a.a.a.l0.d$c r1 = new b.a.a.a.l0.d$c
            r2 = 0
            r1.<init>(r0)
            goto L_0x00ea
        L_0x00e9:
            throw r1
        L_0x00ea:
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.l0.d.h(b.a.a.a.l0.d$b, b.a.a.a.l0.d$d, java.lang.String):java.util.ArrayList");
    }

    private static Pair<Integer, Integer> i(String str, String[] strArr) {
        int i;
        String str2;
        StringBuilder sb;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            Matcher matcher = f502b.matcher(strArr[1]);
            if (!matcher.matches()) {
                sb = new StringBuilder();
            } else {
                str = matcher.group(1);
                if ("1".equals(str)) {
                    i = 1;
                } else if ("2".equals(str)) {
                    i = 2;
                } else {
                    sb = new StringBuilder();
                    sb.append("Unknown HEVC profile string: ");
                    sb.append(str);
                    str2 = sb.toString();
                    Log.w("MediaCodecUtil", str2);
                    return null;
                }
                Integer num = f.get(strArr[3]);
                if (num != null) {
                    return new Pair<>(Integer.valueOf(i), num);
                }
                str2 = "Unknown HEVC level string: " + matcher.group(1);
                Log.w("MediaCodecUtil", str2);
                return null;
            }
        }
        sb.append("Ignoring malformed HEVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        Log.w("MediaCodecUtil", str2);
        return null;
    }

    public static a j() {
        return f501a;
    }

    private static boolean k(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = w.f743a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = w.f744b;
            if ("a70".equals(str3) || ("Xiaomi".equals(w.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = w.f744b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = w.f744b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && w.c.equals("samsung"))) {
            String str6 = w.f744b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || str6.equals("SC-05G") || str6.equals("marinelteatt") || str6.equals("404SC") || str6.equals("SC-04G") || str6.equals("SCV31")) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(w.c)) {
            String str7 = w.f744b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i > 19 || !w.f744b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    public static int l() {
        if (g == -1) {
            int i = 0;
            a f2 = f("video/avc", false);
            if (f2 != null) {
                MediaCodecInfo.CodecProfileLevel[] d2 = f2.d();
                int length = d2.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(b(d2[i].level), i2);
                    i++;
                }
                i = Math.max(i2, w.f743a >= 21 ? 345600 : 172800);
            }
            g = i;
        }
        return g;
    }
}
