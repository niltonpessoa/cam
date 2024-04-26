package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import com.handmark.pulltorefresh.library.e;
import com.xforce.v5.xdvpro.R;

public class PullToRefreshGridView extends d<GridView> {

    class a extends GridView implements com.handmark.pulltorefresh.library.f.a {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void a(View view) {
            super.setEmptyView(view);
        }

        public void setEmptyView(View view) {
            PullToRefreshGridView.this.setEmptyView(view);
        }
    }

    @TargetApi(9)
    final class b extends a {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            boolean overScrollBy = super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            c.d(PullToRefreshGridView.this, i, i3, i2, i4, z);
            return overScrollBy;
        }
    }

    public PullToRefreshGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final GridView i(Context context, AttributeSet attributeSet) {
        GridView bVar = Build.VERSION.SDK_INT >= 9 ? new b(context, attributeSet) : new a(context, attributeSet);
        bVar.setId(R.id.gridview);
        return bVar;
    }

    public final e.k getPullToRefreshScrollDirection() {
        return e.k.VERTICAL;
    }
}
