package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final i<?> f90a;

    private h(i<?> iVar) {
        this.f90a = iVar;
    }

    public static h b(i<?> iVar) {
        return new h(iVar);
    }

    public void a(e eVar) {
        i<?> iVar = this.f90a;
        iVar.d.k(iVar, iVar, eVar);
    }

    public void c() {
        this.f90a.d.s();
    }

    public void d(Configuration configuration) {
        this.f90a.d.t(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f90a.d.u(menuItem);
    }

    public void f() {
        this.f90a.d.v();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f90a.d.w(menu, menuInflater);
    }

    public void h() {
        this.f90a.d.x();
    }

    public void i() {
        this.f90a.d.z();
    }

    public void j(boolean z) {
        this.f90a.d.A(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.f90a.d.P(menuItem);
    }

    public void l(Menu menu) {
        this.f90a.d.Q(menu);
    }

    public void m() {
        this.f90a.d.R();
    }

    public void n(boolean z) {
        this.f90a.d.S(z);
    }

    public boolean o(Menu menu) {
        return this.f90a.d.T(menu);
    }

    public void p() {
        this.f90a.d.U();
    }

    public void q() {
        this.f90a.d.V();
    }

    public void r() {
        this.f90a.d.X();
    }

    public boolean s() {
        return this.f90a.d.c0();
    }

    public e t(String str) {
        return this.f90a.d.i0(str);
    }

    public j u() {
        return this.f90a.f();
    }

    public void v() {
        this.f90a.d.F0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f90a.d.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable, l lVar) {
        this.f90a.d.O0(parcelable, lVar);
    }

    public l y() {
        return this.f90a.d.P0();
    }

    public Parcelable z() {
        return this.f90a.d.R0();
    }
}
