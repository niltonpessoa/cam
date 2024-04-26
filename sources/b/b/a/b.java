package b.b.a;

import android.util.Log;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f793a = true;

    public static void a(int i, String str, String str2) {
        if (!f793a) {
            return;
        }
        if (i == 0) {
            Log.d(str, str2);
        } else if (i == 1) {
            Log.i(str, str2);
        } else if (i == 2) {
            Log.w(str, str2);
        } else if (i == 3) {
            Log.e(str, str2);
        }
    }
}
