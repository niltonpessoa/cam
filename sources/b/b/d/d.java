package b.b.d;

import android.content.Context;
import b.b.a.h;
import b.c.a.a.d.b;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.Element;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f817b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f818a;

    class a implements h {
        a(d dVar) {
        }

        public void a(String str) {
            c0.a(0, "RPSettingUtil", "initLocalRawFiles download fail --- " + str);
        }

        public void b(String str) {
            c0.a(0, "RPSettingUtil", "initLocalRawFiles download success --- " + str);
        }
    }

    public static d c() {
        if (f817b == null) {
            f817b = new d();
        }
        return f817b;
    }

    public void a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("setting_keys.xml");
        b.b.a.a aVar = new b.b.a.a("setting_keys.xml", sb.toString(), b.f865a);
        c0.a(0, "RPSettingUtil", "xmlFile -- " + aVar);
        c0.a(0, "RPSettingUtil", "xmlFile -- " + str);
        File file = new File(b.f865a + str2 + "setting_keys.xml");
        if (file.exists()) {
            file.delete();
        }
        d0.t().l(aVar);
    }

    public int b(String str) {
        Map<String, Integer> map = this.f818a;
        if (map != null && map.containsKey(str)) {
            return this.f818a.get(str).intValue();
        }
        return 0;
    }

    public List<String> d(Document document, String str) {
        List selectNodes = document.selectNodes("/resources/string-array[@name='" + str + "']");
        if (selectNodes == null || selectNodes.size() <= 0) {
            return null;
        }
        List selectNodes2 = ((Element) selectNodes.get(0)).selectNodes("item");
        int size = selectNodes2.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Element) selectNodes2.get(i)).getStringValue());
        }
        return arrayList;
    }

    public String e(Document document, String str) {
        List selectNodes = document.selectNodes("/resources/string[@name='" + str + "']");
        c0.a(0, "RPSettingUtil", "getXmlStrValue nameId = " + str + "list.size = " + selectNodes.size());
        if (selectNodes != null && selectNodes.size() > 0) {
            return ((Element) selectNodes.get(0)).getStringValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b.f865a);
        sb.append(File.separator);
        sb.append("zh-EN.xml");
        c0.a(0, "RPSettingUtil", new File(sb.toString()).exists() ? "zh-EN.xml 已经下载好了啊" : "zh-EN.xml 还没下载好");
        return null;
    }

    public void f(Context context, String str) {
        String e = a.c().e(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(e);
        b.b.a.a aVar = new b.b.a.a(e, sb.toString(), b.f865a);
        b.b.a.a aVar2 = new b.b.a.a("zh-EN.xml", str + str2 + "zh-EN.xml", b.f865a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("xmlFile -- ");
        sb2.append(aVar);
        c0.a(0, "RPSettingUtil", sb2.toString());
        c0.a(0, "RPSettingUtil", "xmlFile -- " + aVar2);
        d0.t().R(new a(this));
        d0.t().l(aVar);
        d0.t().l(aVar2);
    }

    public void g(String str, int i) {
        if (this.f818a == null) {
            this.f818a = new HashMap();
        }
        this.f818a.put(str, Integer.valueOf(i));
    }
}
