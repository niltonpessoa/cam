package com.xforce.v5.xdvpro.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.e;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.c;
import com.xforce.v5.xdvpro.widget.g;
import com.xforce.v5.xdvpro.widget.h;
import java.util.ArrayList;

public class b extends e implements View.OnClickListener {
    private View Y;
    private Button Z;
    private Button a0;
    /* access modifiers changed from: private */
    public ImageButton b0;
    private Button c0;
    private ViewPager d0;
    private h e0;
    private ArrayList<e> f0;
    private i g0;
    private h h0;
    private g i0;
    private X1MainFragmentActivity j0;
    /* access modifiers changed from: private */
    public int k0 = 0;
    private c l0 = new a();

    class a implements c {
        a() {
        }

        public void a() {
            b.this.s1();
        }

        public void b() {
            b.this.t1();
        }

        public void c() {
            b.this.q1();
        }

        public void d() {
            b bVar = b.this;
            bVar.r1(bVar.k0);
        }
    }

    /* renamed from: com.xforce.v5.xdvpro.ui.b$b  reason: collision with other inner class name */
    class C0052b implements DialogInterface.OnCancelListener {
        C0052b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            b.this.b0.setSelected(!b.this.b0.isSelected());
        }
    }

    private void C1() {
        boolean z;
        g gVar;
        if (this.i0 == null) {
            g gVar2 = new g(g(), R.style.file_opt_dialog);
            this.i0 = gVar2;
            gVar2.setOnCancelListener(new C0052b());
        }
        this.i0.show();
        this.i0.e(this);
        this.i0.f(this);
        this.i0.b(this);
        this.i0.c(this);
        if (this.d0.getCurrentItem() == 0) {
            gVar = this.i0;
            z = false;
        } else {
            gVar = this.i0;
            z = true;
        }
        gVar.d(z);
    }

    /* access modifiers changed from: private */
    public void q1() {
        c0.a(0, "X1FileFragment", "chooseAllReturn()");
        if (this.d0.getCurrentItem() == 0) {
            this.g0.q1();
        } else {
            this.h0.z1();
        }
    }

    /* access modifiers changed from: private */
    public void r1(int i) {
        c0.a(0, "X1FileFragment", "confirmClickReturn(" + i + ")");
        if (this.d0.getCurrentItem() == 0) {
            this.g0.A1(i);
        } else {
            this.h0.I1(i);
        }
        this.j0.x();
        this.a0.setClickable(true);
        this.Z.setClickable(true);
        this.b0.setClickable(true);
    }

    /* access modifiers changed from: private */
    public void s1() {
        c0.a(0, "X1FileFragment", "disChooseAllReturn()");
        if (this.d0.getCurrentItem() == 0) {
            this.g0.t1();
        } else {
            this.h0.C1();
        }
    }

    private void w1() {
        c0.a(0, "X1FileFragment", "initData()");
    }

    private void x1() {
        c0.a(0, "X1FileFragment", "initView()");
        Button button = (Button) this.Y.findViewById(R.id.file_btnlocal);
        this.Z = button;
        button.setOnClickListener(this);
        this.a0 = (Button) this.Y.findViewById(R.id.file_btncdr);
        ImageButton imageButton = (ImageButton) this.Y.findViewById(R.id.file_top_rightbtn);
        this.b0 = imageButton;
        imageButton.setOnClickListener(this);
        this.a0.setOnClickListener(this);
        this.Z.setEnabled(true);
        this.a0.setEnabled(false);
        Button button2 = (Button) this.Y.findViewById(R.id.back_btn);
        this.c0 = button2;
        button2.setVisibility(4);
        this.d0 = (ViewPager) this.Y.findViewById(R.id.file_viewpager);
        i iVar = new i();
        this.g0 = iVar;
        iVar.K1(this);
        h hVar = new h();
        this.h0 = hVar;
        hVar.U1(this);
        ArrayList<e> arrayList = new ArrayList<>();
        this.f0 = arrayList;
        arrayList.add(this.g0);
        this.f0.add(this.h0);
        this.d0.setOffscreenPageLimit(2);
        h hVar2 = new h(l(), this.f0);
        this.e0 = hVar2;
        this.d0.setAdapter(hVar2);
        if (b.c.a.a.d.b.p) {
            this.Z.setEnabled(false);
            this.a0.setEnabled(true);
            this.d0.setCurrentItem(0);
            return;
        }
        this.Z.setEnabled(true);
        this.a0.setEnabled(false);
        this.d0.setCurrentItem(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y1(int r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refreshTapTips("
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r2 = "X1FileFragment"
            com.rp.rptool.util.c0.a(r1, r2, r0)
            com.xforce.v5.xdvpro.widget.g r0 = r4.i0
            r0.dismiss()
            android.widget.ImageButton r0 = r4.b0
            boolean r2 = r0.isSelected()
            r3 = 1
            r2 = r2 ^ r3
            r0.setSelected(r2)
            r4.k0 = r5
            if (r5 == 0) goto L_0x0057
            if (r5 == r3) goto L_0x004d
            r0 = 2
            if (r5 == r0) goto L_0x0043
            r0 = 4
            if (r5 == r0) goto L_0x0039
            goto L_0x0067
        L_0x0039:
            com.xforce.v5.xdvpro.ui.X1MainFragmentActivity r5 = r4.j0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492978(0x7f0c0072, float:1.8609423E38)
            goto L_0x0060
        L_0x0043:
            com.xforce.v5.xdvpro.ui.X1MainFragmentActivity r5 = r4.j0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492979(0x7f0c0073, float:1.8609425E38)
            goto L_0x0060
        L_0x004d:
            com.xforce.v5.xdvpro.ui.X1MainFragmentActivity r5 = r4.j0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492981(0x7f0c0075, float:1.860943E38)
            goto L_0x0060
        L_0x0057:
            com.xforce.v5.xdvpro.ui.X1MainFragmentActivity r5 = r4.j0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492980(0x7f0c0074, float:1.8609427E38)
        L_0x0060:
            java.lang.String r0 = r0.getString(r2)
            r5.F(r0)
        L_0x0067:
            com.xforce.v5.xdvpro.ui.X1MainFragmentActivity r5 = r4.j0
            r5.G(r1)
            com.xforce.v5.xdvpro.ui.X1MainFragmentActivity r5 = r4.j0
            android.content.res.Resources r0 = r4.y()
            r1 = 2131493005(0x7f0c008d, float:1.8609478E38)
            java.lang.String r0 = r0.getString(r1)
            r5.E(r0)
            android.support.v4.view.ViewPager r5 = r4.d0
            int r5 = r5.getCurrentItem()
            if (r5 != 0) goto L_0x008a
            com.xforce.v5.xdvpro.ui.i r5 = r4.g0
            r5.J1(r3)
            goto L_0x008f
        L_0x008a:
            com.xforce.v5.xdvpro.ui.h r5 = r4.h0
            r5.T1(r3)
        L_0x008f:
            r4.B1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.b.y1(int):void");
    }

    public void A1(int i, boolean z) {
        c0.a(0, "X1FileFragment", "setTapBottomTips(" + i + "," + z + ")");
        this.j0.H(i, z);
    }

    public void B1() {
        c0.a(0, "X1FileFragment", "showAllTaps()");
        this.j0.I(this.l0);
        this.a0.setClickable(false);
        this.Z.setClickable(false);
        this.b0.setClickable(false);
        this.j0.J();
    }

    public void V(Bundle bundle) {
        c0.a(0, "X1FileFragment", "onCreate");
        super.V(bundle);
        this.j0 = (X1MainFragmentActivity) g();
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "X1FileFragment", "onCreateView");
        if (this.Y == null) {
            this.Y = layoutInflater.inflate(R.layout.fragment_file, (ViewGroup) null);
            x1();
            w1();
        } else {
            c0.a(0, "X1FileFragment", "onCreateView view not null");
        }
        ViewGroup viewGroup2 = (ViewGroup) this.Y.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.Y);
        }
        return this.Y;
    }

    public void a0() {
        c0.a(0, "X1FileFragment", "onDestroy");
        super.a0();
    }

    public void onClick(View view) {
        int i;
        switch (view.getId()) {
            case R.id.file_btncdr /*2131230792*/:
                this.Z.setEnabled(true);
                this.a0.setEnabled(false);
                this.d0.setCurrentItem(1);
                this.h0.y1();
                return;
            case R.id.file_btnlocal /*2131230793*/:
                this.Z.setEnabled(false);
                this.a0.setEnabled(true);
                this.d0.setCurrentItem(0);
                return;
            case R.id.file_opt_dev_delete /*2131230803*/:
                i = 4;
                break;
            case R.id.file_opt_dev_download /*2131230804*/:
                i = 2;
                break;
            case R.id.file_opt_loc_delete /*2131230807*/:
                y1(0);
                return;
            case R.id.file_opt_loc_share /*2131230808*/:
                y1(1);
                return;
            case R.id.file_top_rightbtn /*2131230812*/:
                ImageButton imageButton = this.b0;
                imageButton.setSelected(!imageButton.isSelected());
                C1();
                return;
            default:
                return;
        }
        y1(i);
    }

    public void p0() {
        c0.a(0, "X1FileFragment", "onResume");
        super.p0();
    }

    public void p1() {
        h hVar = this.h0;
        if (hVar != null) {
            hVar.y1();
        }
    }

    public void s0() {
        c0.a(0, "X1FileFragment", "onStop");
        super.s0();
    }

    public void t1() {
        c0.a(0, "X1FileFragment", "dismissAllTaps()");
        int currentItem = this.d0.getCurrentItem();
        this.a0.setClickable(true);
        this.Z.setClickable(true);
        this.b0.setClickable(true);
        if (currentItem == 0) {
            this.g0.J1(false);
        } else {
            this.h0.T1(false);
        }
    }

    public int u1() {
        return this.d0.getCurrentItem();
    }

    public void v1() {
        this.Z.setEnabled(true);
        this.a0.setEnabled(false);
        this.d0.setCurrentItem(1);
    }

    public void z1(b.b.e.a.b bVar) {
        c0.a(0, "X1FileFragment", "refreshUI()");
        h hVar = this.h0;
        if (hVar != null) {
            hVar.O1(bVar);
        }
    }
}
