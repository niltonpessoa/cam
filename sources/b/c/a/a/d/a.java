package b.c.a.a.d;

import android.content.Context;

public class a {
    public static synchronized String a(Context context) {
        String string;
        synchronized (a.class) {
            try {
                string = context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return string;
    }
}
