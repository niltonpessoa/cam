package android.support.v4.view.j;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f217a;

    private a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f217a = accessibilityNodeInfo;
    }

    private static String b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public static a x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new a(accessibilityNodeInfo);
    }

    public void a(int i) {
        this.f217a.addAction(i);
    }

    public int c() {
        return this.f217a.getActions();
    }

    public void d(Rect rect) {
        this.f217a.getBoundsInParent(rect);
    }

    public void e(Rect rect) {
        this.f217a.getBoundsInScreen(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.f217a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((a) obj).f217a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return true;
    }

    public CharSequence f() {
        return this.f217a.getClassName();
    }

    public CharSequence g() {
        return this.f217a.getContentDescription();
    }

    public CharSequence h() {
        return this.f217a.getPackageName();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f217a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public CharSequence i() {
        return this.f217a.getText();
    }

    public String j() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f217a.getViewIdResourceName();
        }
        return null;
    }

    public boolean k() {
        return this.f217a.isCheckable();
    }

    public boolean l() {
        return this.f217a.isChecked();
    }

    public boolean m() {
        return this.f217a.isClickable();
    }

    public boolean n() {
        return this.f217a.isEnabled();
    }

    public boolean o() {
        return this.f217a.isFocusable();
    }

    public boolean p() {
        return this.f217a.isFocused();
    }

    public boolean q() {
        return this.f217a.isLongClickable();
    }

    public boolean r() {
        return this.f217a.isPassword();
    }

    public boolean s() {
        return this.f217a.isScrollable();
    }

    public boolean t() {
        return this.f217a.isSelected();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb.append("; boundsInParent: " + rect);
        e(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(h());
        sb.append("; className: ");
        sb.append(f());
        sb.append("; text: ");
        sb.append(i());
        sb.append("; contentDescription: ");
        sb.append(g());
        sb.append("; viewId: ");
        sb.append(j());
        sb.append("; checkable: ");
        sb.append(k());
        sb.append("; checked: ");
        sb.append(l());
        sb.append("; focusable: ");
        sb.append(o());
        sb.append("; focused: ");
        sb.append(p());
        sb.append("; selected: ");
        sb.append(t());
        sb.append("; clickable: ");
        sb.append(m());
        sb.append("; longClickable: ");
        sb.append(q());
        sb.append("; enabled: ");
        sb.append(n());
        sb.append("; password: ");
        sb.append(r());
        sb.append("; scrollable: " + s());
        sb.append("; [");
        int c = c();
        while (c != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(c);
            c &= numberOfTrailingZeros ^ -1;
            sb.append(b(numberOfTrailingZeros));
            if (c != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void u(CharSequence charSequence) {
        this.f217a.setClassName(charSequence);
    }

    public void v(boolean z) {
        this.f217a.setScrollable(z);
    }

    public AccessibilityNodeInfo w() {
        return this.f217a;
    }
}
