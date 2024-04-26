package b.c.a.a.d;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.util.Log;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.x;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f865a = (Environment.getExternalStorageDirectory() + "/XDV-PRO");

    /* renamed from: b  reason: collision with root package name */
    public static String f866b = (f865a + "/data.xml");
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static int h;
    public static int i;
    public static float j;
    public static int k;
    public static int l = 2;
    public static int m = 2;
    public static int n = 4;
    public static String o = "";
    public static boolean p = true;
    public static boolean q = false;
    public static boolean r;

    class a implements MediaScannerConnection.OnScanCompletedListener {
        a() {
        }

        public void onScanCompleted(String str, Uri uri) {
            Log.v("MediaScanWork", "file " + str + " was scanned seccessfully: " + uri);
        }
    }

    public static void A(Context context, String str) {
        c0.a(0, "CCGlobal", "updateAlbum()");
        MediaScannerConnection.scanFile(context, new String[]{str}, (String[]) null, new a());
    }

    public static void a(b.c.a.a.c.a aVar) {
        c0.a(0, "CCGlobal", "addDevices()");
        if (aVar == null) {
            c0.a(3, "CCGlobal", "addDevices() error device == null");
            return;
        }
        Document document = null;
        try {
            document = new SAXReader().read(new File(f866b));
            Element addElement = document.getRootElement().addElement("device");
            addElement.addAttribute("ssid", aVar.a());
            addElement.addAttribute("ssidpwd", aVar.b());
            addElement.addAttribute("version", aVar.d());
            addElement.addAttribute("uid", aVar.c());
        } catch (DocumentException e2) {
            c0.a(3, "CCGlobal", "addDevices() DocumentException error");
            e2.printStackTrace();
        }
        y(document);
    }

    public static void b(String str) {
        File file = new File(str);
        if (str == null) {
            c0.a(3, "CCGlobal", "checkDir() filePath == null!");
        }
        if (file.exists()) {
            c0.a(0, "CCGlobal", str + " (has been created)");
        } else if (file.mkdirs()) {
            c0.a(0, "CCGlobal", str + " (create success)");
            v();
        } else {
            c0.a(3, "CCGlobal", str + " (create fail)");
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x0055=Splitter:B:38:0x0055, B:32:0x0049=Splitter:B:32:0x0049} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.io.File r4, java.io.File r5) {
        /*
            r0 = 0
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0047, all -> 0x0044 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0047, all -> 0x0044 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0047, all -> 0x0044 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x0047, all -> 0x0044 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003c, all -> 0x0038 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003c, all -> 0x0038 }
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003c, all -> 0x0038 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003c, all -> 0x0038 }
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r5 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0034, all -> 0x0032 }
        L_0x001a:
            int r0 = r2.read(r5)     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0034, all -> 0x0032 }
            r3 = -1
            if (r0 == r3) goto L_0x0025
            r4.write(r5, r1, r0)     // Catch:{ FileNotFoundException -> 0x0036, IOException -> 0x0034, all -> 0x0032 }
            goto L_0x001a
        L_0x0025:
            r1 = 1
            r2.close()     // Catch:{ IOException -> 0x002d }
            r4.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x005e
        L_0x002d:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x005e
        L_0x0032:
            r5 = move-exception
            goto L_0x003a
        L_0x0034:
            r5 = move-exception
            goto L_0x003e
        L_0x0036:
            r5 = move-exception
            goto L_0x0042
        L_0x0038:
            r5 = move-exception
            r4 = r0
        L_0x003a:
            r0 = r2
            goto L_0x0060
        L_0x003c:
            r5 = move-exception
            r4 = r0
        L_0x003e:
            r0 = r2
            goto L_0x0049
        L_0x0040:
            r5 = move-exception
            r4 = r0
        L_0x0042:
            r0 = r2
            goto L_0x0055
        L_0x0044:
            r5 = move-exception
            r4 = r0
            goto L_0x0060
        L_0x0047:
            r5 = move-exception
            r4 = r0
        L_0x0049:
            r5.printStackTrace()     // Catch:{ all -> 0x005f }
            r0.close()     // Catch:{ IOException -> 0x002d }
            r4.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x005e
        L_0x0053:
            r5 = move-exception
            r4 = r0
        L_0x0055:
            r5.printStackTrace()     // Catch:{ all -> 0x005f }
            r0.close()     // Catch:{ IOException -> 0x002d }
            r4.close()     // Catch:{ IOException -> 0x002d }
        L_0x005e:
            return r1
        L_0x005f:
            r5 = move-exception
        L_0x0060:
            r0.close()     // Catch:{ IOException -> 0x0067 }
            r4.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r4 = move-exception
            r4.printStackTrace()
        L_0x006b:
            goto L_0x006d
        L_0x006c:
            throw r5
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.a.a.d.b.c(java.io.File, java.io.File):boolean");
    }

    public static boolean d(String str, String str2, boolean z) {
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            c0.a(3, "CCGlobal", "from file is null!");
            return false;
        }
        if (!file2.exists()) {
            try {
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        boolean c2 = c(file, file2);
        if (z) {
            file.delete();
        }
        return c2;
    }

    public static File e(File file) {
        String[] m2 = m(file);
        return f(file, m2[0], m2[1]);
    }

    public static File f(File file, String str, String str2) {
        File parentFile = file.getParentFile();
        if (!parentFile.exists() && parentFile.mkdir()) {
            Log.v("CCGlobal", "Created directory " + parentFile.getAbsolutePath());
        }
        File file2 = new File(parentFile, str + str2);
        int i2 = 1;
        while (file2.exists() && i2 < Integer.MAX_VALUE) {
            file2 = new File(parentFile, str + '-' + i2 + str2);
            i2++;
        }
        if (file.renameTo(file2)) {
            return file2;
        }
        Log.w("CCGlobal", "Couldn't rename file to " + file2.getAbsolutePath());
        return file;
    }

    public static void g(String str) {
        c0.a(0, "CCGlobal", "deleteDevInfoInFileByUID() uid = " + str);
        if (str == null || "".equals(str)) {
            c0.a(3, "CCGlobal", "deleteDevInfoInFileByUID() uid error");
            return;
        }
        Document document = null;
        try {
            document = new SAXReader().read(new File(f866b));
            Element rootElement = document.getRootElement();
            Iterator it = document.selectNodes("/devices/device").iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Element element = (Element) it.next();
                if (str.equals(element.attributeValue("uid"))) {
                    c0.a(0, "CCGlobal", "deleteDevInfoInFileByUID() success!");
                    rootElement.remove(element);
                    break;
                }
                c0.a(0, "CCGlobal", "find uid = " + element.attributeValue(str));
            }
        } catch (DocumentException e2) {
            c0.a(3, "CCGlobal", "addDevices() DocumentException error");
            e2.printStackTrace();
        }
        y(document);
    }

    public static String h(Context context) {
        c0.a(0, "CCGlobal", "getCurrentSSID()");
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        String ssid = connectionInfo != null ? connectionInfo.getSSID() : null;
        if (ssid.contains("\"")) {
            ssid = (String) ssid.subSequence(1, ssid.length() - 1);
        }
        c0.a(0, "CCGlobal", "getCurrentSSID() currentSSID = " + ssid);
        return ssid;
    }

    public static b.c.a.a.c.a i(String str) {
        c0.a(0, "CCGlobal", "getDeviceFromFileBySSID()");
        b.c.a.a.c.a aVar = null;
        if (str == null || "".equals(str)) {
            c0.a(3, "CCGlobal", "getDeviceFromFileBySSID error ssid = null");
            return null;
        }
        try {
            Document read = new SAXReader().read(new File(f866b));
            read.getRootElement();
            for (Element element : read.selectNodes("/devices/device")) {
                String attributeValue = element.attributeValue("ssid");
                if (str.equals(attributeValue)) {
                    String attributeValue2 = element.attributeValue("ssidpwd");
                    String attributeValue3 = element.attributeValue("version");
                    String attributeValue4 = element.attributeValue("uid");
                    b.c.a.a.c.a aVar2 = new b.c.a.a.c.a(attributeValue, attributeValue2, attributeValue3);
                    try {
                        aVar2.e(attributeValue4);
                        aVar = aVar2;
                    } catch (DocumentException e2) {
                        e = e2;
                        aVar = aVar2;
                        c0.a(3, "CCGlobal", "getDevicesFromFile() DocumentException error");
                        e.printStackTrace();
                        return aVar;
                    }
                }
            }
            c0.a(0, "CCGlobal", "device = \n " + aVar);
        } catch (DocumentException e3) {
            e = e3;
        }
        return aVar;
    }

    public static b.c.a.a.c.a j(String str) {
        c0.a(0, "CCGlobal", "getDeviceFromFileByUid()");
        b.c.a.a.c.a aVar = null;
        if (str == null || "".equals(str)) {
            c0.a(3, "CCGlobal", "getDeviceFromFileByUid error uid = null");
            return null;
        }
        try {
            Document read = new SAXReader().read(new File(f866b));
            read.getRootElement();
            for (Element element : read.selectNodes("/devices/device")) {
                if (str.equals(element.attributeValue("uid"))) {
                    aVar = new b.c.a.a.c.a(str, element.attributeValue("ssid"), element.attributeValue("ssidpwd"), element.attributeValue("version"));
                }
            }
            c0.a(0, "CCGlobal", "device = \n " + aVar);
        } catch (DocumentException e2) {
            c0.a(3, "CCGlobal", "getDeviceFromFileByUid() DocumentException error");
            e2.printStackTrace();
        }
        return aVar;
    }

    public static List<String> k() {
        c0.a(0, "CCGlobal", "getDevicesSSIDsFromFile()");
        s();
        ArrayList arrayList = null;
        try {
            Document read = new SAXReader().read(new File(f866b));
            read.getRootElement();
            ArrayList arrayList2 = new ArrayList();
            for (Element attributeValue : read.selectNodes("/devices/device")) {
                try {
                    arrayList2.add(attributeValue.attributeValue("ssid"));
                } catch (DocumentException e2) {
                    e = e2;
                    arrayList = arrayList2;
                    c0.a(3, "CCGlobal", "getDevicesSSIDsFromFile() DocumentException error");
                    e.printStackTrace();
                    return arrayList;
                }
            }
            c0.a(0, "CCGlobal", "savedSSIDs = \n " + arrayList2);
            return arrayList2;
        } catch (DocumentException e3) {
            e = e3;
            c0.a(3, "CCGlobal", "getDevicesSSIDsFromFile() DocumentException error");
            e.printStackTrace();
            return arrayList;
        }
    }

    public static String l(String str) {
        if (str == null || "".equals(str) || str.length() <= 0) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf <= -1 || lastIndexOf >= str.length() + -1) ? str : str.substring(lastIndexOf + 1);
    }

    public static String[] m(File file) {
        String str;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            str = "";
        } else {
            String substring = name.substring(0, lastIndexOf);
            str = name.substring(lastIndexOf, name.length());
            name = substring;
        }
        return new String[]{name, str};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r2.lastIndexOf(46);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String n(java.lang.String r2) {
        /*
            if (r2 == 0) goto L_0x001c
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x001c
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 <= r1) goto L_0x001c
            int r1 = r2.length()
            if (r0 >= r1) goto L_0x001c
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.c.a.a.d.b.n(java.lang.String):java.lang.String");
    }

    public static String o(long j2) {
        double d2 = (double) j2;
        Double.isNaN(d2);
        return (((float) Math.round(((float) ((d2 / 1024.0d) / 1024.0d)) * 100.0f)) / 100.0f) + "M";
    }

    public static String p(long j2) {
        double d2 = (double) j2;
        Double.isNaN(d2);
        return (((float) Math.round(((float) (d2 / 1024.0d)) * 100.0f)) / 100.0f) + "GB";
    }

    public static String q(long j2) {
        String str;
        float f2;
        String str2 = "B";
        if (j2 > 0) {
            float f3 = (float) j2;
            if (f3 / 1.07374182E9f >= 1.0f) {
                f2 = ((float) (j2 * 100)) / 1.07374182E11f;
                str = (((float) Math.round(f2 * 100.0f)) / 100.0f) + "";
                str2 = "G";
            } else if (f3 / 1048576.0f >= 1.0f) {
                f2 = ((float) (j2 * 100)) / 1.048576E8f;
                str = (((float) Math.round(f2 * 100.0f)) / 100.0f) + "";
                str2 = "M";
            } else if (f3 / 1024.0f >= 1.0f) {
                f2 = ((float) (j2 * 100)) / 102400.0f;
                str = (((float) Math.round(f2 * 100.0f)) / 100.0f) + "";
                str2 = "K";
            } else {
                str = j2 + "";
                f2 = 0.0f;
            }
            c0.a(3, "TEST", "result = " + f2);
        } else {
            str = "0";
        }
        return str + str2;
    }

    public static int r(int i2) {
        return i2 == 0 ? 1 : 0;
    }

    public static void s() {
        c0.a(0, "CCGlobal", "initDataFile()");
        b(f865a);
        File file = new File(f866b);
        if (file.exists()) {
            c0.a(0, "CCGlobal", "DATA_FILE_PATH is exist");
            return;
        }
        try {
            if (file.createNewFile()) {
                c0.a(3, "CCGlobal", "create DATA_FILE success!");
                v();
                return;
            }
            c0.a(3, "CCGlobal", "create DATA_FILE fail!");
        } catch (IOException e2) {
            c0.a(3, "CCGlobal", "create DATA_FILE error!");
            e2.printStackTrace();
        }
    }

    public static void t(Context context, String str, String str2) {
        c0.a(0, "CCGlobal", "initDirs()");
        f865a = context.getExternalFilesDir("").getAbsolutePath();
        f866b = f865a + "/data.xml";
        c = f865a + "/media";
        d = f865a + "/" + str2 + "/update";
        StringBuilder sb = new StringBuilder();
        sb.append(f865a);
        sb.append("/.thumb");
        e = sb.toString();
        f = f865a + "/.thumb_tp";
        g = f865a + "/" + str2 + "/download";
        c0.a(0, "CCGlobal", "MEDIA_DIR=" + c + "UPDATE_DIR=" + d + "THUMB_DIR=" + e + "DOWNLOAD_DIR=" + g);
        b(c);
        b(d);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d);
        sb2.append(File.separator);
        sb2.append(str);
        File file = new File(sb2.toString());
        if (file.exists()) {
            file.delete();
        }
        b(e);
        b(f);
        b(g);
    }

    public static void u(Context context) {
        c0.a(0, "CCGlobal", "initMainDirs()");
        f865a = context.getExternalFilesDir("").getAbsolutePath();
        f866b = f865a + "/data.xml";
    }

    public static void v() {
        Document createDocument = DocumentHelper.createDocument();
        createDocument.addElement("devices");
        y(createDocument);
    }

    public static void w(String str, String str2, String str3) {
        String str4;
        c0.a(0, "CCGlobal", "modifyDevValueInFileByUID()");
        if (str == null || "".equals(str)) {
            str4 = "modifyDevValueInFile() uid error";
        } else if (str2 == null || "".equals(str2)) {
            str4 = "modifyDevValueInFile() attrTag error";
        } else {
            Document document = null;
            try {
                document = new SAXReader().read(new File(f866b));
                document.getRootElement();
                Iterator it = document.selectNodes("/devices/device").iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Element element = (Element) it.next();
                    if (str.equals(element.attributeValue("uid"))) {
                        element.setAttributeValue(str2, str3);
                        c0.a(0, "CCGlobal", "modifyDevValueInFile() success!");
                        break;
                    }
                    c0.a(0, "CCGlobal", "find uid = " + element.attributeValue(str));
                }
            } catch (DocumentException e2) {
                c0.a(3, "CCGlobal", "addDevices() DocumentException error");
                e2.printStackTrace();
            }
            y(document);
            return;
        }
        c0.a(3, "CCGlobal", str4);
    }

    public static String x(String str) {
        return new SimpleDateFormat(str).format(new Date(System.currentTimeMillis()));
    }

    public static void y(Document document) {
        c0.a(0, "CCGlobal", "saveDataFile()");
        try {
            XMLWriter xMLWriter = new XMLWriter((Writer) new FileWriter(new File(f866b)), OutputFormat.createPrettyPrint());
            xMLWriter.write(document);
            xMLWriter.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void z(int i2) {
        if (!p && d0.t().p() != null) {
            d0.t().J(new b.b.e.a.a(d0.t().p().g(), 41022, x.a(i2), x.b()));
        }
    }
}
