package com.xforce.v5.xdvpro.ui.V3H3;

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
    private ViewPager c0;
    private h d0;
    private ArrayList<e> e0;
    private c f0;
    private a g0;
    private g h0;
    private XFTPV3H3MainFragmentActivity i0;
    /* access modifiers changed from: private */
    public int j0 = 0;
    private Button k0;
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
            bVar.r1(bVar.j0);
        }
    }

    /* renamed from: com.xforce.v5.xdvpro.ui.V3H3.b$b  reason: collision with other inner class name */
    class C0048b implements DialogInterface.OnCancelListener {
        C0048b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            b.this.b0.setSelected(!b.this.b0.isSelected());
        }
    }

    private void C1() {
        boolean z;
        g gVar;
        if (this.h0 == null) {
            g gVar2 = new g(g(), R.style.file_opt_dialog);
            this.h0 = gVar2;
            gVar2.setOnCancelListener(new C0048b());
        }
        this.h0.show();
        this.h0.e(this);
        this.h0.f(this);
        this.h0.b(this);
        this.h0.c(this);
        if (this.c0.getCurrentItem() == 0) {
            gVar = this.h0;
            z = false;
        } else {
            gVar = this.h0;
            z = true;
        }
        gVar.d(z);
    }

    /* access modifiers changed from: private */
    public void q1() {
        c0.a(0, "XFTPV3H3FileFragment", "chooseAllReturn()");
        if (this.c0.getCurrentItem() == 0) {
            this.f0.q1();
        } else {
            this.g0.A1();
        }
    }

    /* access modifiers changed from: private */
    public void r1(int i) {
        c0.a(0, "XFTPV3H3FileFragment", "confirmClickReturn(" + i + ")");
        if (this.c0.getCurrentItem() == 0) {
            this.f0.A1(i);
        } else {
            this.g0.J1(i);
        }
        this.i0.x();
        this.a0.setClickable(true);
        this.Z.setClickable(true);
        this.b0.setClickable(true);
    }

    /* access modifiers changed from: private */
    public void s1() {
        c0.a(0, "XFTPV3H3FileFragment", "disChooseAllReturn()");
        if (this.c0.getCurrentItem() == 0) {
            this.f0.t1();
        } else {
            this.g0.D1();
        }
    }

    private void w1() {
        c0.a(0, "XFTPV3H3FileFragment", "initData()");
    }

    private void x1() {
        c0.a(0, "XFTPV3H3FileFragment", "initView()");
        Button button = (Button) this.Y.findViewById(R.id.file_btnlocal);
        this.Z = button;
        button.setOnClickListener(this);
        this.a0 = (Button) this.Y.findViewById(R.id.file_btncdr);
        ImageButton imageButton = (ImageButton) this.Y.findViewById(R.id.file_top_rightbtn);
        this.b0 = imageButton;
        imageButton.setOnClickListener(this);
        this.a0.setOnClickListener(this);
        Button button2 = (Button) this.Y.findViewById(R.id.back_btn);
        this.k0 = button2;
        button2.setOnClickListener(this);
        if (b.c.a.a.d.b.p) {
            this.k0.setVisibility(8);
        }
        this.c0 = (ViewPager) this.Y.findViewById(R.id.file_viewpager);
        c cVar = new c();
        this.f0 = cVar;
        cVar.K1(this);
        a aVar = new a();
        this.g0 = aVar;
        aVar.b2(this);
        ArrayList<e> arrayList = new ArrayList<>();
        this.e0 = arrayList;
        arrayList.add(this.f0);
        this.e0.add(this.g0);
        this.c0.setOffscreenPageLimit(2);
        h hVar = new h(l(), this.e0);
        this.d0 = hVar;
        this.c0.setAdapter(hVar);
        if (b.c.a.a.d.b.p) {
            this.Z.setEnabled(false);
            this.a0.setEnabled(true);
            this.c0.setCurrentItem(0);
            return;
        }
        this.Z.setEnabled(true);
        this.a0.setEnabled(false);
        this.c0.setCurrentItem(1);
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
            java.lang.String r2 = "XFTPV3H3FileFragment"
            com.rp.rptool.util.c0.a(r1, r2, r0)
            com.xforce.v5.xdvpro.widget.g r0 = r4.h0
            r0.dismiss()
            android.widget.ImageButton r0 = r4.b0
            boolean r2 = r0.isSelected()
            r3 = 1
            r2 = r2 ^ r3
            r0.setSelected(r2)
            r4.j0 = r5
            if (r5 == 0) goto L_0x006c
            if (r5 == r3) goto L_0x004d
            r0 = 2
            if (r5 == r0) goto L_0x0043
            r0 = 4
            if (r5 == r0) goto L_0x0039
            goto L_0x007c
        L_0x0039:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r5 = r4.i0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492978(0x7f0c0072, float:1.8609423E38)
            goto L_0x0075
        L_0x0043:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r5 = r4.i0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492979(0x7f0c0073, float:1.8609425E38)
            goto L_0x0075
        L_0x004d:
            boolean r5 = b.c.a.a.d.b.p
            if (r5 != 0) goto L_0x0062
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r5 = r4.i0
            android.content.res.Resources r0 = r4.y()
            r1 = 2131492937(0x7f0c0049, float:1.860934E38)
            java.lang.String r0 = r0.getString(r1)
            b.c.a.a.d.e.a(r5, r0, r3)
            return
        L_0x0062:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r5 = r4.i0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492981(0x7f0c0075, float:1.860943E38)
            goto L_0x0075
        L_0x006c:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r5 = r4.i0
            android.content.res.Resources r0 = r4.y()
            r2 = 2131492980(0x7f0c0074, float:1.8609427E38)
        L_0x0075:
            java.lang.String r0 = r0.getString(r2)
            r5.H(r0)
        L_0x007c:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r5 = r4.i0
            r5.I(r1)
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r5 = r4.i0
            android.content.res.Resources r0 = r4.y()
            r1 = 2131493005(0x7f0c008d, float:1.8609478E38)
            java.lang.String r0 = r0.getString(r1)
            r5.G(r0)
            android.support.v4.view.ViewPager r5 = r4.c0
            int r5 = r5.getCurrentItem()
            if (r5 != 0) goto L_0x009f
            com.xforce.v5.xdvpro.ui.V3H3.c r5 = r4.f0
            r5.J1(r3)
            goto L_0x00a4
        L_0x009f:
            com.xforce.v5.xdvpro.ui.V3H3.a r5 = r4.g0
            r5.a2(r3)
        L_0x00a4:
            r4.B1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.V3H3.b.y1(int):void");
    }

    public void A1(int i, boolean z) {
        c0.a(0, "XFTPV3H3FileFragment", "setTapBottomTips(" + i + "," + z + ")");
        this.i0.J(i, z);
    }

    public void B1() {
        c0.a(0, "XFTPV3H3FileFragment", "showAllTaps()");
        this.i0.K(this.l0);
        this.a0.setClickable(false);
        this.Z.setClickable(false);
        this.b0.setClickable(false);
        this.i0.L();
    }

    public void V(Bundle bundle) {
        c0.a(0, "XFTPV3H3FileFragment", "onCreate");
        super.V(bundle);
        this.i0 = (XFTPV3H3MainFragmentActivity) g();
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "XFTPV3H3FileFragment", "onCreateView");
        if (this.Y == null) {
            this.Y = layoutInflater.inflate(R.layout.fragment_file, (ViewGroup) null);
            x1();
            w1();
        } else {
            c0.a(0, "XFTPV3H3FileFragment", "onCreateView view not null");
        }
        ViewGroup viewGroup2 = (ViewGroup) this.Y.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.Y);
        }
        return this.Y;
    }

    public void a0() {
        c0.a(0, "XFTPV3H3FileFragment", "onDestroy");
        super.a0();
    }

    public void onClick(View view) {
        int i;
        switch (view.getId()) {
            case R.id.back_btn /*2131230730*/:
                this.i0.C();
                return;
            case R.id.file_btncdr /*2131230792*/:
                this.Z.setEnabled(true);
                this.a0.setEnabled(false);
                this.c0.setCurrentItem(1);
                this.g0.z1();
                return;
            case R.id.file_btnlocal /*2131230793*/:
                this.Z.setEnabled(false);
                this.a0.setEnabled(true);
                this.c0.setCurrentItem(0);
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
        c0.a(0, "XFTPV3H3FileFragment", "onResume");
        super.p0();
    }

    public void p1() {
        a aVar = this.g0;
        if (aVar != null) {
            aVar.z1();
        }
    }

    public void s0() {
        c0.a(0, "XFTPV3H3FileFragment", "onStop");
        super.s0();
    }

    public void t1() {
        c0.a(0, "XFTPV3H3FileFragment", "dismissAllTaps()");
        int currentItem = this.c0.getCurrentItem();
        this.a0.setClickable(true);
        this.Z.setClickable(true);
        this.b0.setClickable(true);
        if (currentItem == 0) {
            this.f0.J1(false);
        } else {
            this.g0.a2(false);
        }
    }

    public int u1() {
        return this.c0.getCurrentItem();
    }

    public void v1() {
        this.Z.setEnabled(true);
        this.a0.setEnabled(false);
        this.c0.setCurrentItem(1);
    }

    public void z1(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3FileFragment", "refreshUI()");
        a aVar = this.g0;
        if (aVar != null) {
            aVar.P1(bVar);
        }
    }
}
