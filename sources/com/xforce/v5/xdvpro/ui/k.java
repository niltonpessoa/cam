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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.c;
import com.xforce.v5.xdvpro.widget.g;
import com.xforce.v5.xdvpro.widget.h;
import java.util.ArrayList;

public class k extends e implements View.OnClickListener {
    private View Y;
    private LinearLayout Z;
    private TextView a0;
    private Button b0;
    private Button c0;
    /* access modifiers changed from: private */
    public ImageButton d0;
    private ViewPager e0;
    private h f0;
    private ArrayList<e> g0;
    private l h0;
    private j i0;
    private g j0;
    private XFTPMainFragmentActivity k0;
    /* access modifiers changed from: private */
    public int l0 = 0;
    private Button m0;
    private c n0 = new a();

    class a implements c {
        a() {
        }

        public void a() {
            k.this.s1();
        }

        public void b() {
            k.this.t1();
        }

        public void c() {
            k.this.q1();
        }

        public void d() {
            k kVar = k.this;
            kVar.r1(kVar.l0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            k.this.d0.setSelected(!k.this.d0.isSelected());
        }
    }

    private void C1() {
        boolean z;
        g gVar;
        if (this.j0 == null) {
            g gVar2 = new g(g(), R.style.file_opt_dialog);
            this.j0 = gVar2;
            gVar2.setOnCancelListener(new b());
        }
        this.j0.show();
        this.j0.e(this);
        this.j0.f(this);
        this.j0.b(this);
        this.j0.c(this);
        if (this.e0.getCurrentItem() == 0) {
            gVar = this.j0;
            z = false;
        } else {
            gVar = this.j0;
            z = true;
        }
        gVar.d(z);
    }

    /* access modifiers changed from: private */
    public void q1() {
        c0.a(0, "XFTPFileFragment", "chooseAllReturn()");
        if (this.e0.getCurrentItem() == 0) {
            this.h0.q1();
        } else {
            this.i0.A1();
        }
    }

    /* access modifiers changed from: private */
    public void r1(int i) {
        c0.a(0, "XFTPFileFragment", "confirmClickReturn(" + i + ")");
        if (this.e0.getCurrentItem() == 0) {
            this.h0.A1(i);
        } else {
            this.i0.J1(i);
        }
        this.k0.x();
        this.c0.setClickable(true);
        this.b0.setClickable(true);
        this.d0.setClickable(true);
    }

    /* access modifiers changed from: private */
    public void s1() {
        c0.a(0, "XFTPFileFragment", "disChooseAllReturn()");
        if (this.e0.getCurrentItem() == 0) {
            this.h0.t1();
        } else {
            this.i0.D1();
        }
    }

    private void w1() {
        c0.a(0, "XFTPFileFragment", "initData()");
    }

    private void x1() {
        c0.a(0, "XFTPFileFragment", "initView()");
        this.Z = (LinearLayout) this.Y.findViewById(R.id.file_top_btns_bg);
        this.a0 = (TextView) this.Y.findViewById(R.id.file_top_local);
        Button button = (Button) this.Y.findViewById(R.id.file_btnlocal);
        this.b0 = button;
        button.setOnClickListener(this);
        this.c0 = (Button) this.Y.findViewById(R.id.file_btncdr);
        ImageButton imageButton = (ImageButton) this.Y.findViewById(R.id.file_top_rightbtn);
        this.d0 = imageButton;
        imageButton.setOnClickListener(this);
        this.c0.setOnClickListener(this);
        Button button2 = (Button) this.Y.findViewById(R.id.back_btn);
        this.m0 = button2;
        button2.setOnClickListener(this);
        if (!b.c.a.a.d.b.p) {
            this.d0.setVisibility(0);
            this.Z.setVisibility(0);
            this.a0.setVisibility(8);
        } else {
            this.d0.setVisibility(8);
            this.Z.setVisibility(8);
            this.a0.setVisibility(0);
        }
        this.e0 = (ViewPager) this.Y.findViewById(R.id.file_viewpager);
        l lVar = new l();
        this.h0 = lVar;
        lVar.K1(this);
        j jVar = new j();
        this.i0 = jVar;
        jVar.b2(this);
        ArrayList<e> arrayList = new ArrayList<>();
        this.g0 = arrayList;
        arrayList.add(this.h0);
        this.g0.add(this.i0);
        this.e0.setOffscreenPageLimit(2);
        h hVar = new h(l(), this.g0);
        this.f0 = hVar;
        this.e0.setAdapter(hVar);
        if (b.c.a.a.d.b.p) {
            this.b0.setEnabled(false);
            this.c0.setEnabled(true);
            this.e0.setCurrentItem(0);
            return;
        }
        this.b0.setEnabled(true);
        this.c0.setEnabled(false);
        this.e0.setCurrentItem(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
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
            java.lang.String r2 = "XFTPFileFragment"
            com.rp.rptool.util.c0.a(r1, r2, r0)
            com.xforce.v5.xdvpro.widget.g r0 = r4.j0
            r0.dismiss()
            android.widget.ImageButton r0 = r4.d0
            boolean r2 = r0.isSelected()
            r3 = 1
            r2 = r2 ^ r3
            r0.setSelected(r2)
            r4.l0 = r5
            if (r5 == 0) goto L_0x006c
            if (r5 == r3) goto L_0x004d
            r0 = 2
            if (r5 == r0) goto L_0x0043
            r0 = 4
            if (r5 == r0) goto L_0x0039
            goto L_0x007c
        L_0x0039:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r5 = r4.k0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492978(0x7f0c0072, float:1.8609423E38)
            goto L_0x0075
        L_0x0043:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r5 = r4.k0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492979(0x7f0c0073, float:1.8609425E38)
            goto L_0x0075
        L_0x004d:
            boolean r5 = b.c.a.a.d.b.p
            if (r5 != 0) goto L_0x0062
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r5 = r4.k0
            android.content.res.Resources r0 = r4.y()
            r1 = 2131492937(0x7f0c0049, float:1.860934E38)
            java.lang.String r0 = r0.getString(r1)
            b.c.a.a.d.e.a(r5, r0, r3)
            return
        L_0x0062:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r5 = r4.k0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492981(0x7f0c0075, float:1.860943E38)
            goto L_0x0075
        L_0x006c:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r5 = r4.k0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492980(0x7f0c0074, float:1.8609427E38)
        L_0x0075:
            java.lang.String r0 = r0.getString(r2)
            r5.I(r0)
        L_0x007c:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r5 = r4.k0
            r5.J(r1)
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r5 = r4.k0
            android.content.res.Resources r0 = r4.y()
            r1 = 2131493005(0x7f0c008d, float:1.8609478E38)
            java.lang.String r0 = r0.getString(r1)
            r5.H(r0)
            android.support.v4.view.ViewPager r5 = r4.e0
            int r5 = r5.getCurrentItem()
            if (r5 != 0) goto L_0x009f
            com.xforce.v5.xdvpro.ui.l r5 = r4.h0
            r5.J1(r3)
            goto L_0x00a4
        L_0x009f:
            com.xforce.v5.xdvpro.ui.j r5 = r4.i0
            r5.a2(r3)
        L_0x00a4:
            r4.B1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.k.y1(int):void");
    }

    public void A1(int i, boolean z) {
        c0.a(0, "XFTPFileFragment", "setTapBottomTips(" + i + "," + z + ")");
        this.k0.K(i, z);
    }

    public void B1() {
        c0.a(0, "XFTPFileFragment", "showAllTaps()");
        this.k0.L(this.n0);
        this.c0.setClickable(false);
        this.b0.setClickable(false);
        this.d0.setClickable(false);
        this.k0.M();
    }

    public void V(Bundle bundle) {
        c0.a(0, "XFTPFileFragment", "onCreate");
        super.V(bundle);
        this.k0 = (XFTPMainFragmentActivity) g();
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "XFTPFileFragment", "onCreateView");
        if (this.Y == null) {
            this.Y = layoutInflater.inflate(R.layout.fragment_file, (ViewGroup) null);
            x1();
            w1();
        } else {
            c0.a(0, "XFTPFileFragment", "onCreateView view not null");
        }
        ViewGroup viewGroup2 = (ViewGroup) this.Y.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.Y);
        }
        return this.Y;
    }

    public void a0() {
        c0.a(0, "XFTPFileFragment", "onDestroy");
        super.a0();
    }

    public void onClick(View view) {
        int i;
        switch (view.getId()) {
            case R.id.back_btn /*2131230730*/:
                if (!b.c.a.a.d.b.p) {
                    this.k0.C();
                    return;
                } else {
                    this.k0.D();
                    return;
                }
            case R.id.file_btncdr /*2131230792*/:
                this.b0.setEnabled(true);
                this.c0.setEnabled(false);
                this.e0.setCurrentItem(1);
                this.i0.z1();
                return;
            case R.id.file_btnlocal /*2131230793*/:
                this.b0.setEnabled(false);
                this.c0.setEnabled(true);
                this.e0.setCurrentItem(0);
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
                ImageButton imageButton = this.d0;
                imageButton.setSelected(!imageButton.isSelected());
                C1();
                return;
            default:
                return;
        }
        y1(i);
    }

    public void p0() {
        c0.a(0, "XFTPFileFragment", "onResume");
        super.p0();
    }

    public void p1() {
        j jVar = this.i0;
        if (jVar != null) {
            jVar.z1();
        }
    }

    public void s0() {
        c0.a(0, "XFTPFileFragment", "onStop");
        super.s0();
    }

    public void t1() {
        c0.a(0, "XFTPFileFragment", "dismissAllTaps()");
        int currentItem = this.e0.getCurrentItem();
        this.c0.setClickable(true);
        this.b0.setClickable(true);
        this.d0.setClickable(true);
        if (currentItem == 0) {
            this.h0.J1(false);
        } else {
            this.i0.a2(false);
        }
    }

    public int u1() {
        return this.e0.getCurrentItem();
    }

    public void v1() {
        this.b0.setEnabled(true);
        this.c0.setEnabled(false);
        this.e0.setCurrentItem(1);
    }

    public void z1(b.b.e.a.b bVar) {
        c0.a(0, "XFTPFileFragment", "refreshUI()");
        j jVar = this.i0;
        if (jVar != null) {
            jVar.P1(bVar);
        }
    }
}
