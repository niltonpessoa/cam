package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class a extends android.support.v4.content.a {
    private static C0006a c;

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    public interface C0006a {
        boolean a(Activity activity, int i, int i2, Intent intent);
    }

    public static C0006a d() {
        return c;
    }

    public static void e(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
