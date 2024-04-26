package android.support.v4.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<View, String> f212a;

    static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f213a;

        a(e eVar) {
            this.f213a = eVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) i.g(this.f213a.a(view, i.h(windowInsets)));
        }
    }

    public interface b {
        boolean a(View view, KeyEvent keyEvent);
    }

    static class c {
        private static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f214a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f215b = null;
        private WeakReference<KeyEvent> c = null;

        c() {
        }

        static c a(View view) {
            int i = a.b.a.a.tag_unhandled_key_event_manager;
            c cVar = (c) view.getTag(i);
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c();
            view.setTag(i, cVar2);
            return cVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f214a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c2 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f215b == null) {
                this.f215b = new SparseArray<>();
            }
            return this.f215b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.b.a.a.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((b) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = this.f214a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f214a == null) {
                        this.f214a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f214a.put(view, bool);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f214a.put((View) parent, bool);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c2 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c2));
                }
            }
            return c2 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && g.g(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static i a(View view, i iVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return iVar;
        }
        WindowInsets windowInsets = (WindowInsets) i.g(iVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return i.h(windowInsets);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.a(view).b(view, keyEvent);
    }

    static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return c.a(view).f(keyEvent);
    }

    public static int d(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static String e(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f212a;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static boolean f(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean g(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static i h(View view, i iVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return iVar;
        }
        WindowInsets windowInsets = (WindowInsets) i.g(iVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return i.h(windowInsets);
    }

    public static void i(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void j(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void k(View view, b bVar) {
        view.setAccessibilityDelegate(bVar == null ? null : bVar.c());
    }

    public static void l(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    public static void m(View view, e eVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (eVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(eVar));
        }
    }

    public static void n(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f212a == null) {
            f212a = new WeakHashMap<>();
        }
        f212a.put(view, str);
    }
}
