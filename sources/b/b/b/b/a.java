package b.b.b.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b.b.e.a.c;
import com.rp.rptool.util.d0;
import java.util.ArrayList;
import java.util.List;

public class a {
    private int b(String str) {
        SQLiteDatabase d = b.b.b.c.a.d();
        int i = 0;
        if (!(d == null || str == null || "".equals(str))) {
            Cursor c = b.b.b.c.a.c(d, str);
            if (c != null) {
                c.moveToFirst();
                i = c.getInt(0);
            }
            b.b.b.c.a.a(c);
            b.b.b.c.a.b(d);
        }
        return i;
    }

    private String c() {
        c p = d0.t().p();
        return (!p.e().equals("Dv") && p.e().equals("Dv-Tp")) ? "MediaFile100" : "MediaFile";
    }

    private List<b.b.b.d.a> f(String str) {
        b.b.b.d.a aVar;
        SQLiteDatabase d = b.b.b.c.a.d();
        if (d == null || str == null || "".equals(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor c = b.b.b.c.a.c(d, str);
        if (c == null) {
            return arrayList;
        }
        c p = d0.t().p();
        while (c.moveToNext()) {
            String str2 = "192.168.10.1";
            if (p.e().equals("Dv")) {
                if (d0.t().p() != null) {
                    str2 = d0.t().p().c();
                }
                String str3 = "http://" + str2 + ":8082" + c.getString(0);
                aVar = new b.b.b.d.a(str3, str3.replace(str3.substring(str3.length() - 4, str3.length()), "_ths.jpg"), c.getLong(1), c.getString(2), c.getString(3), c.getLong(4));
            } else {
                if (d0.t().p() != null) {
                    str2 = d0.t().p().c();
                }
                String str4 = "http://" + str2 + ":8082/file/media/" + c.getString(2);
                long j = c.getLong(5);
                if (j <= 0) {
                    j = 1;
                }
                aVar = new b.b.b.d.a(str4, j);
            }
            arrayList.add(aVar);
            Log.e("TEST", "TMP FILE : " + aVar);
        }
        return arrayList;
    }

    private String g() {
        c p = d0.t().p();
        return (!p.e().equals("Dv") && p.e().equals("Dv-Tp")) ? "id" : "time";
    }

    public int a() {
        return b("SELECT COUNT(*) FROM " + c());
    }

    public List<b.b.b.d.a> d(int i, int i2) {
        return f("SELECT * FROM " + c() + " ORDER BY " + g() + " DESC LIMIT " + i2 + " OFFSET " + i);
    }

    public List<b.b.b.d.a> e(int i) {
        return d(0, i);
    }
}
