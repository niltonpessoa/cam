package b.c.a.a.d;

import android.content.Context;
import android.widget.Toast;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f870a = true;

    /* renamed from: b  reason: collision with root package name */
    private static Toast f871b;

    public static void a(Context context, CharSequence charSequence, int i) {
        if (f870a) {
            Toast toast = f871b;
            if (toast == null) {
                f871b = Toast.makeText(context, charSequence, i);
            } else {
                toast.setText(charSequence);
            }
            f871b.show();
        }
    }
}
