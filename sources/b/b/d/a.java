package b.b.d;

import android.content.Context;
import android.content.res.AssetManager;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class a {
    private static a c;

    /* renamed from: a  reason: collision with root package name */
    private String f811a;

    /* renamed from: b  reason: collision with root package name */
    private Document f812b;

    public static a c() {
        if (c == null) {
            c = new a();
        }
        return c;
    }

    public Document a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(e(context));
        String sb2 = sb.toString();
        if (this.f812b == null) {
            String e = e(context);
            this.f812b = f(context, e, sb2, new File(str + str2 + "zh-EN.xml"));
        }
        return this.f812b;
    }

    public Document b(Context context, String str) {
        String e = e(context);
        SAXReader sAXReader = new SAXReader();
        AssetManager assets = context.getResources().getAssets();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(e);
            String sb2 = sb.toString();
            c0.a(0, "Dom4jUtil", "getDocumentWithCustomizeType() - filePath:" + sb2);
            InputStream open = assets.open(sb2);
            if (open.available() <= 0) {
                c0.a(0, "Dom4jUtil", "getDocumentWithCustomizeType() - filePath not found get zh_EN.xml");
                open = assets.open("" + str + str2 + "zh-EN.xml");
            }
            return sAXReader.read(open);
        } catch (DocumentException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public int d(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1622794349:
                if (str.equals("zh-CN.xml")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1602476887:
                if (str.equals("zh-DE.xml")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1565536047:
                if (str.equals("zh-EN.xml")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1560918442:
                if (str.equals("zh-ES.xml")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1533212812:
                if (str.equals("zh-FR.xml")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1445478317:
                if (str.equals("zh-IT.xml")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1434396065:
                if (str.equals("zh-JA.xml")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1392837620:
                if (str.equals("zh-KO.xml")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1245074260:
                if (str.equals("zh-PT.xml")) {
                    c2 = 8;
                    break;
                }
                break;
            case -1186892437:
                if (str.equals("zh-RU.xml")) {
                    c2 = 9;
                    break;
                }
                break;
            case -1140716387:
                if (str.equals("zh-TI.xml")) {
                    c2 = 10;
                    break;
                }
                break;
            case -1127787093:
                if (str.equals("zh-TW.xml")) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return R.raw.zh_cn;
            case 1:
                return R.raw.zh_de;
            case 3:
                return R.raw.zh_es;
            case 4:
                return R.raw.zh_fr;
            case 5:
                return R.raw.zh_it;
            case 6:
                return R.raw.zh_ja;
            case 7:
                return R.raw.zh_ko;
            case 8:
                return R.raw.zh_pt;
            case 9:
                return R.raw.zh_ru;
            case 10:
                return R.raw.zh_ti;
            case 11:
                return R.raw.zh_tw;
            default:
                return R.raw.zh_en;
        }
    }

    public String e(Context context) {
        if (this.f811a == null) {
            this.f811a = g(context);
        }
        return this.f811a;
    }

    public Document f(Context context, String str, String str2, File file) {
        InputStream openRawResource;
        File file2 = new File(str2);
        SAXReader sAXReader = new SAXReader();
        try {
            if (h(str)) {
                if (file2.exists() && file2.isFile() && file2.length() != 0) {
                    return sAXReader.read(file2);
                }
                openRawResource = context.getResources().openRawResource(d(str));
            } else if (file.exists() && file.isFile() && file.length() != 0) {
                return sAXReader.read(file);
            } else {
                openRawResource = context.getResources().openRawResource(d(str));
            }
            return sAXReader.read(openRawResource);
        } catch (DocumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String g(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        String country = locale.getCountry();
        String language = locale.getLanguage();
        if ("zh".equals(language)) {
            return "CN".equals(country) ? "zh-CN.xml" : "zh-TW.xml";
        }
        return "zh-" + language.toUpperCase() + ".xml";
    }

    public boolean h(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1622794349:
                if (str.equals("zh-CN.xml")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1602476887:
                if (str.equals("zh-DE.xml")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1565536047:
                if (str.equals("zh-EN.xml")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1560918442:
                if (str.equals("zh-ES.xml")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1533212812:
                if (str.equals("zh-FR.xml")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1445478317:
                if (str.equals("zh-IT.xml")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1434396065:
                if (str.equals("zh-JA.xml")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1392837620:
                if (str.equals("zh-KO.xml")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1245074260:
                if (str.equals("zh-PT.xml")) {
                    c2 = 8;
                    break;
                }
                break;
            case -1186892437:
                if (str.equals("zh-RU.xml")) {
                    c2 = 9;
                    break;
                }
                break;
            case -1140716387:
                if (str.equals("zh-TI.xml")) {
                    c2 = 10;
                    break;
                }
                break;
            case -1127787093:
                if (str.equals("zh-TW.xml")) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }
}
