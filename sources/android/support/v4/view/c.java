package android.support.v4.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f208a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Method f209b = null;
    private static boolean c = false;
    private static Field d;

    public interface a {
        boolean b(KeyEvent keyEvent);
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f208a) {
            try {
                f209b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f208a = true;
        }
        Method method = f209b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (g.b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (g.b(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        return g.c(view, keyEvent);
    }

    public static boolean e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.b(keyEvent) : callback instanceof Activity ? b((Activity) callback, keyEvent) : callback instanceof Dialog ? c((Dialog) callback, keyEvent) : (view != null && g.b(view, keyEvent)) || aVar.b(keyEvent);
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
