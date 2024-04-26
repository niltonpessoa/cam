package b.a.a.a.o0.r;

import android.util.Log;
import b.a.a.a.o0.c;
import b.a.a.a.o0.g;
import b.a.a.a.r0.w;
import b.a.a.a.r0.x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class a extends c {
    private static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final C0038a s = new C0038a(30.0f, 1, 1);
    private final XmlPullParserFactory n;

    /* renamed from: b.a.a.a.o0.r.a$a  reason: collision with other inner class name */
    private static final class C0038a {

        /* renamed from: a  reason: collision with root package name */
        final float f638a;

        /* renamed from: b  reason: collision with root package name */
        final int f639b;
        final int c;

        C0038a(float f, int i, int i2) {
            this.f638a = f;
            this.f639b = i;
            this.c = i2;
        }
    }

    public a() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private e C(e eVar) {
        return eVar == null ? new e() : eVar;
    }

    private static boolean E(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data") || str.equals("smpte:information");
    }

    private static void F(String str, e eVar) {
        Matcher matcher;
        String[] split = str.split("\\s+");
        if (split.length == 1) {
            matcher = q.matcher(str);
        } else if (split.length == 2) {
            matcher = q.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new g("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.hashCode();
            char c = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    eVar.t(3);
                    break;
                case 1:
                    eVar.t(2);
                    break;
                case 2:
                    eVar.t(1);
                    break;
                default:
                    throw new g("Invalid unit for fontSize: '" + group + "'.");
            }
            eVar.s(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        throw new g("Invalid expression for fontSize: '" + str + "'.");
    }

    private C0038a G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(" ");
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new g("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C0038a aVar = s;
        int i = aVar.f639b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = aVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C0038a(((float) parseInt) * f, i, i2);
    }

    private Map<String, e> H(XmlPullParser xmlPullParser, Map<String, e> map, Map<String, c> map2) {
        c J;
        do {
            xmlPullParser.next();
            if (x.e(xmlPullParser, "style")) {
                String a2 = x.a(xmlPullParser, "style");
                e K = K(xmlPullParser, new e());
                if (a2 != null) {
                    for (String str : L(a2)) {
                        K.a(map.get(str));
                    }
                }
                if (K.g() != null) {
                    map.put(K.g(), K);
                }
            } else if (x.e(xmlPullParser, "region") && (J = J(xmlPullParser)) != null) {
                map2.put(J.f642a, J);
            }
        } while (!x.c(xmlPullParser, "head"));
        return map;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private b.a.a.a.o0.r.b I(org.xmlpull.v1.XmlPullParser r20, b.a.a.a.o0.r.b r21, java.util.Map<java.lang.String, b.a.a.a.o0.r.c> r22, b.a.a.a.o0.r.a.C0038a r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            int r4 = r20.getAttributeCount()
            r5 = 0
            b.a.a.a.o0.r.e r11 = r0.K(r1, r5)
            java.lang.String r9 = ""
            r12 = r5
            r13 = r9
            r5 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0025:
            if (r5 >= r4) goto L_0x009b
            java.lang.String r6 = r1.getAttributeName(r5)
            java.lang.String r7 = r1.getAttributeValue(r5)
            r6.hashCode()
            int r18 = r6.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0067;
                case 99841: goto L_0x005c;
                case 100571: goto L_0x0051;
                case 93616297: goto L_0x0046;
                case 109780401: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            r8 = -1
            goto L_0x0071
        L_0x003b:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0044
            goto L_0x0039
        L_0x0044:
            r8 = 4
            goto L_0x0071
        L_0x0046:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x004f
            goto L_0x0039
        L_0x004f:
            r8 = 3
            goto L_0x0071
        L_0x0051:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x005a
            goto L_0x0039
        L_0x005a:
            r8 = 2
            goto L_0x0071
        L_0x005c:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0065
            goto L_0x0039
        L_0x0065:
            r8 = 1
            goto L_0x0071
        L_0x0067:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0070
            goto L_0x0039
        L_0x0070:
            r8 = 0
        L_0x0071:
            switch(r8) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008a;
                case 2: goto L_0x0085;
                case 3: goto L_0x007e;
                case 4: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x0082
        L_0x0075:
            java.lang.String[] r6 = r0.L(r7)
            int r7 = r6.length
            if (r7 <= 0) goto L_0x0082
            r12 = r6
            goto L_0x0082
        L_0x007e:
            long r9 = M(r7, r3)
        L_0x0082:
            r6 = r22
            goto L_0x0098
        L_0x0085:
            long r14 = M(r7, r3)
            goto L_0x0082
        L_0x008a:
            long r16 = M(r7, r3)
            goto L_0x0082
        L_0x008f:
            r6 = r22
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x0098
            r13 = r7
        L_0x0098:
            int r5 = r5 + 1
            goto L_0x0025
        L_0x009b:
            if (r2 == 0) goto L_0x00b3
            long r3 = r2.d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00ad
            long r9 = r9 + r3
        L_0x00ad:
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            long r14 = r14 + r3
            goto L_0x00b8
        L_0x00b3:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00b8:
            r7 = r9
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00d0
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00c6
            long r16 = r7 + r16
            r9 = r16
            goto L_0x00d1
        L_0x00c6:
            if (r2 == 0) goto L_0x00d0
            long r2 = r2.e
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00d0
            r9 = r2
            goto L_0x00d1
        L_0x00d0:
            r9 = r14
        L_0x00d1:
            java.lang.String r6 = r20.getName()
            b.a.a.a.o0.r.b r1 = b.a.a.a.o0.r.b.c(r6, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.r.a.I(org.xmlpull.v1.XmlPullParser, b.a.a.a.o0.r.b, java.util.Map, b.a.a.a.o0.r.a$a):b.a.a.a.o0.r.b");
    }

    private c J(XmlPullParser xmlPullParser) {
        String str;
        StringBuilder sb;
        String str2;
        float f;
        String a2 = x.a(xmlPullParser, "id");
        if (a2 == null) {
            return null;
        }
        String a3 = x.a(xmlPullParser, "origin");
        if (a3 != null) {
            Pattern pattern = r;
            Matcher matcher = pattern.matcher(a3);
            if (matcher.matches()) {
                int i = 1;
                try {
                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                    float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                    String a4 = x.a(xmlPullParser, "extent");
                    if (a4 != null) {
                        Matcher matcher2 = pattern.matcher(a4);
                        if (matcher2.matches()) {
                            try {
                                float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                                float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                                String a5 = x.a(xmlPullParser, "displayAlign");
                                if (a5 != null) {
                                    String G = w.G(a5);
                                    G.hashCode();
                                    if (G.equals("center")) {
                                        f = parseFloat2 + (parseFloat4 / 2.0f);
                                    } else if (G.equals("after")) {
                                        f = parseFloat2 + parseFloat4;
                                        i = 2;
                                    }
                                    return new c(a2, parseFloat, f, 0, i, parseFloat3);
                                }
                                f = parseFloat2;
                                i = 0;
                                return new c(a2, parseFloat, f, 0, i, parseFloat3);
                            } catch (NumberFormatException unused) {
                                sb = new StringBuilder();
                                str2 = "Ignoring region with malformed extent: ";
                            }
                        } else {
                            sb = new StringBuilder();
                            str2 = "Ignoring region with unsupported extent: ";
                        }
                    } else {
                        str = "Ignoring region without an extent";
                    }
                } catch (NumberFormatException unused2) {
                    sb = new StringBuilder();
                    str2 = "Ignoring region with malformed origin: ";
                }
            } else {
                sb = new StringBuilder();
                str2 = "Ignoring region with unsupported origin: ";
            }
            sb.append(str2);
            sb.append(a3);
            str = sb.toString();
        } else {
            str = "Ignoring region without an origin";
        }
        Log.w("TtmlDecoder", str);
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0110, code lost:
        if (r3.equals("linethrough") == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0172, code lost:
        if (r3.equals("start") == false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private b.a.a.a.o0.r.e K(org.xmlpull.v1.XmlPullParser r12, b.a.a.a.o0.r.e r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x01d5
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            r4.hashCode()
            int r5 = r4.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = -1
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x007c;
                case -1224696685: goto L_0x0071;
                case -1065511464: goto L_0x0066;
                case -879295043: goto L_0x005b;
                case -734428249: goto L_0x0050;
                case 3355: goto L_0x0045;
                case 94842723: goto L_0x003a;
                case 365601008: goto L_0x002f;
                case 1287124693: goto L_0x0022;
                default: goto L_0x001f;
            }
        L_0x001f:
            r4 = -1
            goto L_0x0086
        L_0x0022:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002b
            goto L_0x001f
        L_0x002b:
            r4 = 8
            goto L_0x0086
        L_0x002f:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0038
            goto L_0x001f
        L_0x0038:
            r4 = 7
            goto L_0x0086
        L_0x003a:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0043
            goto L_0x001f
        L_0x0043:
            r4 = 6
            goto L_0x0086
        L_0x0045:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x004e
            goto L_0x001f
        L_0x004e:
            r4 = 5
            goto L_0x0086
        L_0x0050:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0059
            goto L_0x001f
        L_0x0059:
            r4 = 4
            goto L_0x0086
        L_0x005b:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0064
            goto L_0x001f
        L_0x0064:
            r4 = 3
            goto L_0x0086
        L_0x0066:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006f
            goto L_0x001f
        L_0x006f:
            r4 = 2
            goto L_0x0086
        L_0x0071:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007a
            goto L_0x001f
        L_0x007a:
            r4 = 1
            goto L_0x0086
        L_0x007c:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0085
            goto L_0x001f
        L_0x0085:
            r4 = 0
        L_0x0086:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x01c4;
                case 1: goto L_0x01bc;
                case 2: goto L_0x015c;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00eb;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00c1;
                case 7: goto L_0x00a2;
                case 8: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x01d1
        L_0x008d:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            int r4 = b.a.a.a.r0.d.d(r3)     // Catch:{ IllegalArgumentException -> 0x009a }
            r13.o(r4)     // Catch:{ IllegalArgumentException -> 0x009a }
            goto L_0x01d1
        L_0x009a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            goto L_0x00b2
        L_0x00a2:
            b.a.a.a.o0.r.e r13 = r11.C(r13)     // Catch:{ g -> 0x00ab }
            F(r3, r13)     // Catch:{ g -> 0x00ab }
            goto L_0x01d1
        L_0x00ab:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
        L_0x00b2:
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r5, r3)
            goto L_0x01d1
        L_0x00c1:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            int r4 = b.a.a.a.r0.d.d(r3)     // Catch:{ IllegalArgumentException -> 0x00ce }
            r13.q(r4)     // Catch:{ IllegalArgumentException -> 0x00ce }
            goto L_0x01d1
        L_0x00ce:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            goto L_0x00b2
        L_0x00d6:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01d1
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            r13.u(r3)
            goto L_0x01d1
        L_0x00eb:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.p(r3)
            goto L_0x01d1
        L_0x00fa:
            java.lang.String r3 = b.a.a.a.r0.w.G(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x0129;
                case -1026963764: goto L_0x011e;
                case 913457136: goto L_0x0113;
                case 1679736913: goto L_0x010a;
                default: goto L_0x0108;
            }
        L_0x0108:
            r7 = -1
            goto L_0x0133
        L_0x010a:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0133
            goto L_0x0108
        L_0x0113:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x011c
            goto L_0x0108
        L_0x011c:
            r7 = 2
            goto L_0x0133
        L_0x011e:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0127
            goto L_0x0108
        L_0x0127:
            r7 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0132
            goto L_0x0108
        L_0x0132:
            r7 = 0
        L_0x0133:
            switch(r7) {
                case 0: goto L_0x0153;
                case 1: goto L_0x014a;
                case 2: goto L_0x0141;
                case 3: goto L_0x0138;
                default: goto L_0x0136;
            }
        L_0x0136:
            goto L_0x01d1
        L_0x0138:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            r13.w(r10)
            goto L_0x01d1
        L_0x0141:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            r13.w(r1)
            goto L_0x01d1
        L_0x014a:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            r13.y(r10)
            goto L_0x01d1
        L_0x0153:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            r13.y(r1)
            goto L_0x01d1
        L_0x015c:
            java.lang.String r3 = b.a.a.a.r0.w.G(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0196;
                case 100571: goto L_0x018b;
                case 3317767: goto L_0x0180;
                case 108511772: goto L_0x0175;
                case 109757538: goto L_0x016c;
                default: goto L_0x016a;
            }
        L_0x016a:
            r6 = -1
            goto L_0x01a0
        L_0x016c:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01a0
            goto L_0x016a
        L_0x0175:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x017e
            goto L_0x016a
        L_0x017e:
            r6 = 3
            goto L_0x01a0
        L_0x0180:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0189
            goto L_0x016a
        L_0x0189:
            r6 = 2
            goto L_0x01a0
        L_0x018b:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0194
            goto L_0x016a
        L_0x0194:
            r6 = 1
            goto L_0x01a0
        L_0x0196:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x019f
            goto L_0x016a
        L_0x019f:
            r6 = 0
        L_0x01a0:
            switch(r6) {
                case 0: goto L_0x01b5;
                case 1: goto L_0x01a4;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01a4;
                case 4: goto L_0x01ab;
                default: goto L_0x01a3;
            }
        L_0x01a3:
            goto L_0x01d1
        L_0x01a4:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01b1
        L_0x01ab:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x01b1:
            r13.x(r3)
            goto L_0x01d1
        L_0x01b5:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01b1
        L_0x01bc:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            r13.r(r3)
            goto L_0x01d1
        L_0x01c4:
            b.a.a.a.o0.r.e r13 = r11.C(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.v(r3)
        L_0x01d1:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x01d5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.r.a.K(org.xmlpull.v1.XmlPullParser, b.a.a.a.o0.r.e):b.a.a.a.o0.r.e");
    }

    private String[] L(String str) {
        return str.split("\\s+");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b3, code lost:
        if (r13.equals("ms") == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ea, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        r8 = r8 * r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
        java.lang.Double.isNaN(r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long M(java.lang.String r13, b.a.a.a.o0.r.a.C0038a r14) {
        /*
            java.util.regex.Pattern r0 = o
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r13 = r0.group(r7)
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r9)
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x0050
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0051
        L_0x0050:
            r9 = r4
        L_0x0051:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0063
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f638a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x0064
        L_0x0063:
            r9 = r4
        L_0x0064:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0083
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f639b
            double r4 = (double) r13
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            float r13 = r14.f638a
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r4 = r0 / r13
        L_0x0083:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0088:
            java.util.regex.Pattern r0 = p
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0106
            java.lang.String r13 = r0.group(r7)
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            r13.hashCode()
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto L_0x00d7;
                case 104: goto L_0x00cc;
                case 109: goto L_0x00c1;
                case 116: goto L_0x00b6;
                case 3494: goto L_0x00ad;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r4 = -1
            goto L_0x00e1
        L_0x00ad:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00e1
            goto L_0x00ab
        L_0x00b6:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00bf
            goto L_0x00ab
        L_0x00bf:
            r4 = 3
            goto L_0x00e1
        L_0x00c1:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00ca
            goto L_0x00ab
        L_0x00ca:
            r4 = 2
            goto L_0x00e1
        L_0x00cc:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00d5
            goto L_0x00ab
        L_0x00d5:
            r4 = 1
            goto L_0x00e1
        L_0x00d7:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00e0
            goto L_0x00ab
        L_0x00e0:
            r4 = 0
        L_0x00e1:
            switch(r4) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00f0;
                case 3: goto L_0x00ec;
                case 4: goto L_0x00e5;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x0102
        L_0x00e5:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00ea:
            double r8 = r8 / r13
            goto L_0x0102
        L_0x00ec:
            int r13 = r14.c
            double r13 = (double) r13
            goto L_0x00fe
        L_0x00f0:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x00f8
        L_0x00f3:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x00f8:
            double r8 = r8 * r13
            goto L_0x0102
        L_0x00fb:
            float r13 = r14.f638a
            double r13 = (double) r13
        L_0x00fe:
            java.lang.Double.isNaN(r13)
            goto L_0x00ea
        L_0x0102:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x0106:
            b.a.a.a.o0.g r14 = new b.a.a.a.o0.g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            goto L_0x011e
        L_0x011d:
            throw r14
        L_0x011e:
            goto L_0x011d
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.o0.r.a.M(java.lang.String, b.a.a.a.o0.r.a$a):long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public f z(byte[] bArr, int i, boolean z) {
        try {
            XmlPullParser newPullParser = this.n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            f fVar = null;
            hashMap2.put("", new c((String) null));
            int i2 = 0;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            LinkedList linkedList = new LinkedList();
            C0038a aVar = s;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                b bVar = (b) linkedList.peekLast();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = G(newPullParser);
                        }
                        if (!E(name)) {
                            Log.i("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else if ("head".equals(name)) {
                            H(newPullParser, hashMap, hashMap2);
                        } else {
                            try {
                                b I = I(newPullParser, bVar, hashMap2, aVar);
                                linkedList.addLast(I);
                                if (bVar != null) {
                                    bVar.a(I);
                                }
                            } catch (g e) {
                                Log.w("TtmlDecoder", "Suppressing parser error", e);
                            }
                        }
                    } else if (eventType == 4) {
                        bVar.a(b.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            fVar = new f((b) linkedList.getLast(), hashMap, hashMap2);
                        }
                        linkedList.removeLast();
                    }
                    newPullParser.next();
                } else if (eventType != 2) {
                    if (eventType == 3) {
                        i2--;
                    }
                    newPullParser.next();
                }
                i2++;
                newPullParser.next();
            }
            return fVar;
        } catch (XmlPullParserException e2) {
            throw new g("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
