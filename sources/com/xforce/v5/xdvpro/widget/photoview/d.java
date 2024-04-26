package com.xforce.v5.xdvpro.widget.photoview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.widget.OverScroller;
import android.widget.Scroller;

public abstract class d {

    @TargetApi(9)
    private static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private OverScroller f1230a;

        public a(Context context) {
            this.f1230a = new OverScroller(context);
        }

        public boolean a() {
            return this.f1230a.computeScrollOffset();
        }

        public void b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f1230a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }

        public void c(boolean z) {
            this.f1230a.forceFinished(z);
        }

        public int d() {
            return this.f1230a.getCurrX();
        }

        public int e() {
            return this.f1230a.getCurrY();
        }
    }

    private static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private Scroller f1231a;

        public b(Context context) {
            this.f1231a = new Scroller(context);
        }

        public boolean a() {
            return this.f1231a.computeScrollOffset();
        }

        public void b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f1231a.fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        public void c(boolean z) {
            this.f1231a.forceFinished(z);
        }

        public int d() {
            return this.f1231a.getCurrX();
        }

        public int e() {
            return this.f1231a.getCurrY();
        }
    }

    public static d f(Context context) {
        return Build.VERSION.SDK_INT < 9 ? new b(context) : new a(context);
    }

    public abstract boolean a();

    public abstract void b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public abstract void c(boolean z);

    public abstract int d();

    public abstract int e();
}
