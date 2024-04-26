package com.xforce.v5.xdvpro.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class X1NoSlideViewPager extends ViewPager {
    private boolean j0 = false;

    public X1NoSlideViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.j0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setPagingEnabled(boolean z) {
        this.j0 = z;
    }
}
