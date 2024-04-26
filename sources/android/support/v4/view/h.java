package android.support.v4.view;

import a.b.a.a;
import android.os.Build;
import android.view.ViewGroup;

public final class h {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(a.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && g.e(viewGroup) == null) ? false : true;
    }
}
