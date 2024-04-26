package android.support.v4.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class d {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f77a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f78b;

        public static IBinder a(Bundle bundle, String str) {
            if (!f78b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f77a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f78b = true;
            }
            Method method2 = f77a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f77a = null;
                }
            }
            return null;
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.a(bundle, str);
    }
}
