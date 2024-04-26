package com.handmark.pulltorefresh.library;

import android.graphics.drawable.Drawable;
import com.handmark.pulltorefresh.library.f.d;
import java.util.HashSet;
import java.util.Iterator;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<d> f893a = new HashSet<>();

    b() {
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.f893a.add(dVar);
        }
    }

    public void setLastUpdatedLabel(CharSequence charSequence) {
        Iterator<d> it = this.f893a.iterator();
        while (it.hasNext()) {
            it.next().setLastUpdatedLabel(charSequence);
        }
    }

    public void setLoadingDrawable(Drawable drawable) {
        Iterator<d> it = this.f893a.iterator();
        while (it.hasNext()) {
            it.next().setLoadingDrawable(drawable);
        }
    }

    public void setPullLabel(CharSequence charSequence) {
        Iterator<d> it = this.f893a.iterator();
        while (it.hasNext()) {
            it.next().setPullLabel(charSequence);
        }
    }

    public void setRefreshingLabel(CharSequence charSequence) {
        Iterator<d> it = this.f893a.iterator();
        while (it.hasNext()) {
            it.next().setRefreshingLabel(charSequence);
        }
    }

    public void setReleaseLabel(CharSequence charSequence) {
        Iterator<d> it = this.f893a.iterator();
        while (it.hasNext()) {
            it.next().setReleaseLabel(charSequence);
        }
    }
}
