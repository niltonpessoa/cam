package android.support.v4.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.io.File;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f153a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static TypedValue f154b;

    public static Drawable a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f153a) {
                if (f154b == null) {
                    f154b = new TypedValue();
                }
                context.getResources().getValue(i, f154b, true);
                i = f154b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    public static File[] b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] c(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }
}
