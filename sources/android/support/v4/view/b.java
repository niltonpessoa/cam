package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final View.AccessibilityDelegate f205b = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f206a = new a(this);

    private static final class a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final b f207a;

        a(b bVar) {
            this.f207a = bVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f207a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            android.support.v4.view.j.b b2 = this.f207a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f207a.d(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f207a.e(view, android.support.v4.view.j.a.x(accessibilityNodeInfo));
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f207a.f(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f207a.g(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f207a.h(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f207a.i(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f207a.j(view, accessibilityEvent);
        }
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return f205b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public android.support.v4.view.j.b b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = f205b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new android.support.v4.view.j.b(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate c() {
        return this.f206a;
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        f205b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(View view, android.support.v4.view.j.a aVar) {
        f205b.onInitializeAccessibilityNodeInfo(view, aVar.w());
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        f205b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f205b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean h(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f205b.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    public void i(View view, int i) {
        f205b.sendAccessibilityEvent(view, i);
    }

    public void j(View view, AccessibilityEvent accessibilityEvent) {
        f205b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
