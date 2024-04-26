package b.b.c;

import android.content.Context;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import java.io.File;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class a {
    private static a n;

    /* renamed from: a  reason: collision with root package name */
    private String f809a;

    /* renamed from: b  reason: collision with root package name */
    private String f810b;
    public boolean c;
    public String d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    Document m;

    private Document a(Context context) {
        Document document = this.m;
        if (document != null) {
            return document;
        }
        File file = new File(this.f810b);
        SAXReader sAXReader = new SAXReader();
        try {
            this.m = !file.exists() ? sAXReader.read(context.getResources().openRawResource(R.raw.settings)) : sAXReader.read(file);
        } catch (DocumentException e2) {
            e2.printStackTrace();
        }
        return this.m;
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (n == null) {
                n = new a();
            }
            aVar = n;
        }
        return aVar;
    }

    private void e(Context context) {
        c0.a(0, "RPInfoUtil", "initAllInfos()");
        Document a2 = a(context);
        this.d = d(context, a2, "/Infos/Short");
        this.e = c(context, a2, "/Infos/ProductType");
        this.f = c(context, a2, "/Infos/ModelType");
        this.g = c(context, a2, "/Infos/ScreenStruct");
        this.h = d(context, a2, "/Infos/SensorType");
        this.i = d(context, a2, "/Infos/ScreenType");
        this.j = d(context, a2, "/Infos/CamType");
        this.k = d(context, a2, "/Infos/FirmDate");
        this.l = d(context, a2, "/Infos/SubClient");
        c0.a(0, "RPInfoUtil", "INFO UTIL toString:" + toString());
    }

    public int c(Context context, Document document, String str) {
        List selectNodes = a(context).selectNodes(str);
        if (selectNodes.size() <= 0) {
            return -1;
        }
        return Integer.parseInt(((Element) selectNodes.get(0)).getStringValue());
    }

    public String d(Context context, Document document, String str) {
        List selectNodes = a(context).selectNodes(str);
        return selectNodes.size() <= 0 ? "" : ((Element) selectNodes.get(0)).getStringValue();
    }

    public boolean f(Context context) {
        boolean z;
        if (this.c) {
            if (this.m == null) {
                e(context);
            }
            if (this.f > 0) {
                z = true;
                c0.a(0, "RPInfoUtil", "isPrivateModel()==" + z);
                return z;
            }
        }
        z = false;
        c0.a(0, "RPInfoUtil", "isPrivateModel()==" + z);
        return z;
    }

    public String toString() {
        return "RPInfoUtil [pathXML=" + this.f809a + ", pathLocal=" + this.f810b + ", isOpen=" + this.c + ", nameClient=" + this.d + ", typeProduct=" + this.e + ", typeModel=" + this.f + ", typeScreenStruct=" + this.g + ", typeSensor=" + this.h + ", typeScreen=" + this.i + ", typeCam=" + this.j + ", dateFirm=" + this.k + ", nameSubClient=" + this.l + "]";
    }
}
