package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.r;
import com.rp.rptool.util.x;
import com.rp.rptool.util.y;
import com.rp.rptool.util.z;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.k;
import com.xforce.v5.xdvpro.widget.l;
import com.xforce.v5.xdvpro.widget.o;
import java.util.Calendar;
import java.util.List;

public class f extends android.support.v4.app.e {
    public static boolean o0 = false;
    private ExpandableListView Y;
    private b.c.a.a.b.b Z;
    private X1MainFragmentActivity a0;
    private k b0;
    private boolean c0;
    private Resources d0;
    /* access modifiers changed from: private */
    public k e0;
    private com.xforce.v5.xdvpro.widget.f f0;
    private com.xforce.v5.xdvpro.widget.f g0;
    /* access modifiers changed from: private */
    public k h0;
    private com.xforce.v5.xdvpro.widget.d i0 = new i(this);
    private com.xforce.v5.xdvpro.widget.f j0;
    /* access modifiers changed from: private */
    public com.xforce.v5.xdvpro.widget.e k0;
    private l l0;
    private l.b m0 = new b();
    /* access modifiers changed from: private */
    public Handler n0 = new c();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            f.this.k0.dismiss();
            f.this.b2();
        }
    }

    class b implements l.b {
        b() {
        }

        public void a(int i, int i2) {
            Message obtainMessage = f.this.n0.obtainMessage();
            obtainMessage.what = 4;
            obtainMessage.arg1 = i;
            obtainMessage.arg2 = i2;
            f.this.n0.sendMessage(obtainMessage);
        }
    }

    class c extends Handler {
        c() {
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    f.this.J1((b.b.e.a.b) message.obj);
                    return;
                case 1:
                    d0.t().J((b.b.e.a.a) message.obj);
                    return;
                case 2:
                    f.this.C1();
                    ((WifiManager) f.this.g().getApplicationContext().getSystemService("wifi")).disconnect();
                    break;
                case 3:
                    f.this.E1();
                    return;
                case 4:
                    f.this.H1(message.arg1, message.arg2);
                    return;
                case 5:
                case 9:
                    f.this.P1();
                    return;
                case 6:
                    f.this.D1();
                    break;
                case 7:
                    f.this.Q1();
                    f.this.D1();
                    ((WifiManager) f.this.g().getApplicationContext().getSystemService("wifi")).disconnect();
                    f.this.Z1();
                    return;
                case 8:
                    f.this.I1();
                    return;
                default:
                    return;
            }
            f.this.b2();
        }
    }

    class d implements ExpandableListView.OnGroupClickListener {
        d(f fVar) {
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    class e implements ExpandableListView.OnChildClickListener {
        e() {
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            f.this.G1(i, i2);
            return false;
        }
    }

    /* renamed from: com.xforce.v5.xdvpro.ui.f$f  reason: collision with other inner class name */
    class C0053f implements View.OnClickListener {
        C0053f() {
        }

        public void onClick(View view) {
            f.this.e0.dismiss();
            f.this.Y1();
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        public void onClick(View view) {
            f.this.h0.dismiss();
            f.this.X1();
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            f.this.b2();
        }
    }

    class i implements com.xforce.v5.xdvpro.widget.d {
        i(f fVar) {
        }

        public void a(String str, boolean z) {
            c0.a(0, "X1SettingFragment", "toggleButtonClickRtn(" + str + "," + z + ")");
            if (!b.c.a.a.d.b.p) {
                String[] split = str.split(":");
                if (split.length < 2) {
                    c0.a(3, "X1SettingFragment", "toggleButtonClickRtn() tags return error!");
                    return;
                }
                b.b.d.c g = b.b.d.b.e().g(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                d0.t().Q(g.c(), z ? 1 : 0);
                d0.t().w((int) g.b(), z);
            }
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        public void onClick(View view) {
            f.this.k0.dismiss();
            f.this.b2();
        }
    }

    private void B1() {
        if (this.l0 == null) {
            l lVar = new l(this.a0, R.style.portrait_set_dialog);
            this.l0 = lVar;
            lVar.h(this.m0);
        }
    }

    /* access modifiers changed from: private */
    public void C1() {
        c0.a(0, "X1SettingFragment", "dismissLoadingCloseWiFiDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.j0;
        if (fVar != null && fVar.isShowing()) {
            this.j0.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void D1() {
        c0.a(0, "X1SettingFragment", "dismissLoadingFactoryDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.f0;
        if (fVar != null && fVar.isShowing()) {
            this.f0.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void E1() {
        c0.a(0, "X1SettingFragment", "dismissLsettings.xmloadingFormatDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.g0;
        if (fVar != null && fVar.isShowing()) {
            this.g0.dismiss();
        }
    }

    private void F1() {
        c0.a(0, "X1SettingFragment", "getAllConfig()");
        L1(new b.b.e.a.a(d0.t().p().g(), 1814, (byte[]) null, 0));
    }

    /* access modifiers changed from: private */
    public void G1(int i2, int i3) {
        Resources resources;
        k kVar;
        int i4;
        c0.a(0, "X1SettingFragment", "handleChildClick() gid = " + i2 + " cid = " + i3);
        b.b.d.c g2 = b.b.d.b.e().g(i2, i3);
        if (b.c.a.a.d.b.p && !g2.c().equals("ml_exit_id")) {
            o.g(g(), y().getString(R.string.device_offline), false);
        } else if (!b.c.a.a.d.b.q && !g2.c().equals("ml_exit_id")) {
            o.g(g(), y().getString(R.string.device_is_preparing), false);
        } else if (g2.c().equals("ml_exit_id")) {
            if (this.b0 == null) {
                this.b0 = new k(this.a0, R.style.confirm_dialog);
            }
            this.b0.show();
            if (b.c.a.a.d.b.p) {
                kVar = this.b0;
                resources = y();
                i4 = R.string.sure_total_exit_app;
            } else {
                kVar = this.b0;
                resources = y();
                i4 = R.string.sure_total_exit_app_then_recive_nothing;
            }
            kVar.c(resources.getString(i4));
            this.b0.a(new h());
        } else if (g2.c().equals("ml_device_format")) {
            V1();
        } else if (g2.c().equals("ml_device_resetfactory")) {
            W1();
        } else if (!g2.c().equals("ml_storage_id")) {
            if (g2.c().equals("ml_device_datetime_sync")) {
                a2();
            } else if (g2.c().equals("ml_camera_wifi_set")) {
                h1(new Intent(g(), X1WiFiPwdSetActivity.class), 1001);
            } else {
                if (this.l0 == null) {
                    B1();
                }
                int s = d0.t().s(g2.c());
                List<String> a2 = g2.a();
                this.l0.show();
                this.l0.a(g2.d(), a2, (int) g2.b(), s);
            }
        }
    }

    /* access modifiers changed from: private */
    public void H1(int i2, int i3) {
        String str;
        d0 d0Var;
        c0.a(0, "X1SettingFragment", "handleDialogCallback() value = " + i2 + " cmdTag = " + i3);
        d0.t().w(i3, i2);
        d0.t().Q(b.b.d.b.e().f(i3).c(), i2);
        if (i3 == 1650) {
            d0Var = d0.t();
            str = "ml_record_timelapse";
        } else if (i3 != 1652) {
            if (i3 == 1668) {
                d0.t().Q("ml_photo_auto", 0);
            } else if (i3 == 1670) {
                d0.t().Q("ml_photo_timed", 0);
            } else if (i3 == 1672) {
                d0.t().Q("ml_photo_timed", 0);
                d0.t().Q("ml_photo_auto", 0);
                return;
            } else {
                return;
            }
            d0.t().Q("ml_photo_dramashot", 0);
            return;
        } else {
            d0Var = d0.t();
            str = "ml_record_loop";
        }
        d0Var.Q(str, 0);
    }

    /* access modifiers changed from: private */
    public void I1() {
        d0.t().w(1607, 1);
        c0.a(0, "X1SettingFragment", "handleFormatOption()");
        Intent intent = new Intent();
        intent.setAction("refresh_list_filter");
        intent.putExtra("notify_only", false);
        g().sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public void J1(b.b.e.a.b bVar) {
        Handler handler;
        int i2;
        long j2;
        b.b.d.c f;
        c0.a(0, "X1SettingFragment", "handleRefreshUI()" + bVar);
        int b2 = bVar.b();
        if (this.c0 || d0.t().p() == null) {
            c0.a(0, "X1SettingFragment", "handleRefreshUI(" + b2 + ")  error isOnstop or device == null");
            return;
        }
        if (b2 != 1600) {
            if (b2 == 1606) {
                r rVar = new r(bVar.a());
                int i3 = rVar.f958a;
                c0.a(0, "X1SettingFragment", "NAT_CMD_FORMAT_TF_CARD_RESP result = " + rVar.f958a);
                if (i3 == 0) {
                    c0.a(0, "X1SettingFragment", "NAT_CMD_FORMAT_TF_CARD_RESP  set success!");
                    this.n0.sendEmptyMessageDelayed(3, 1000);
                    I1();
                    handler = this.n0;
                    i2 = 8;
                    j2 = 2000;
                } else {
                    this.n0.sendEmptyMessageDelayed(3, 1000);
                    c0.a(3, "X1SettingFragment", "NAT_CMD_FORMAT_TF_CARD_RESP  set fail!");
                }
            } else if (b2 == 1608) {
                c0.a(0, "X1SettingFragment", "sendIOCtrlResp() NAT_CMD_CHECK_TF_CARD_RESP");
                z zVar = new z(bVar.a());
                c0.a(0, "X1SettingFragment", "NAT_CMD_CHECK_TF_CARD_RESP capacity = " + zVar);
                d0.t().p().s((long) zVar.f964b);
                d0.t().p().t((long) zVar.f963a);
                N1();
            } else if (b2 == 1809) {
                r rVar2 = new r(bVar.a());
                c0.a(0, "X1SettingFragment", "NAT_CMD_FACTORY_RESET_RESP result = " + rVar2.f958a);
            } else if (b2 == 1815) {
                handler = this.n0;
                i2 = 5;
                j2 = 500;
            } else if (!(b2 == 1833 || (f = b.b.d.b.e().f(b2)) == null || f.d().equals(""))) {
                T1(0);
            }
            handler.sendEmptyMessageDelayed(i2, j2);
        } else {
            int i4 = new r(bVar.a()).f958a;
            if (i4 == 0) {
                c0.a(0, "X1SettingFragment", "NAT_CMD_SET_TIME_RESP  set success!");
            } else {
                c0.a(3, "X1SettingFragment", "NAT_CMD_SET_TIME_RESP  set fail!");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.d0.getString(R.string.set_synctime));
            sb.append(this.d0.getString(i4 == 0 ? R.string.success : R.string.fail));
            String sb2 = sb.toString();
            if (this.a0.n == 2) {
                U1(sb2, i4);
            }
        }
        P1();
    }

    private void K1(int i2, int i3) {
        c0.a(0, "X1SettingFragment", "sendIOCtrlMsgToDevs" + i2 + "," + i3 + ")");
        L1(new b.b.e.a.a(d0.t().p().g(), i2, x.a(i3), x.b()));
    }

    private void L1(b.b.e.a.a aVar) {
        c0.a(0, "X1SettingFragment", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "X1SettingFragment", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "X1SettingFragment", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.n0.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 1;
        this.n0.sendMessage(obtainMessage);
    }

    private void M1() {
    }

    private void N1() {
        String str;
        c0.a(0, "X1SettingFragment", "refreshTFCardResp()");
        String str2 = "--";
        if (d0.t().p().i() > 0) {
            String p = b.c.a.a.d.b.p(d0.t().p().i());
            str2 = b.c.a.a.d.b.p(d0.t().p().h());
            str = p;
        } else {
            str = str2;
        }
        str2 + "/" + str;
        this.Z.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public void P1() {
        c0.a(0, "X1SettingFragment", "refreshValues()");
        this.Z.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public void Q1() {
        b.c.a.a.d.b.g(d0.t().p().l());
        WifiManager wifiManager = (WifiManager) this.a0.getApplicationContext().getSystemService("wifi");
    }

    private void R1() {
        c0.a(0, "X1SettingFragment", "sendCmdFactoryReset()");
        K1(1808, 1);
        o0 = true;
    }

    private void S1() {
        c0.a(0, "X1SettingFragment", "sendCmdFormatTFCard()");
        K1(1605, 1);
    }

    private void T1(int i2) {
        U1(y().getString(i2 == 0 ? R.string.set_success : R.string.set_fail), i2);
    }

    private void U1(String str, int i2) {
        boolean z = false;
        if (g.i1) {
            android.support.v4.app.f g2 = g();
            if (i2 == 0) {
                z = true;
            }
            o.g(g2, str, z);
            return;
        }
        Toast.makeText(this.a0, str, 0).show();
    }

    private void V1() {
        c0.a(0, "X1SettingFragment", "showConfirmFormatCardDialog()");
        if (this.e0 == null) {
            this.e0 = new k(g(), R.style.confirm_dialog);
        }
        this.e0.show();
        this.e0.c(y().getString(R.string.setting_sure_format_card));
        this.e0.a(new C0053f());
    }

    private void W1() {
        c0.a(0, "X1SettingFragment", "showConfirmResetDevDialog()");
        if (this.h0 == null) {
            this.h0 = new k(g(), R.style.confirm_dialog);
        }
        this.h0.show();
        this.h0.c(y().getString(R.string.setting_sure_reset_device));
        this.h0.a(new g());
    }

    /* access modifiers changed from: private */
    public void X1() {
        c0.a(0, "X1SettingFragment", "showLoadingFactoryResetDialog()");
        if (this.f0 == null) {
            this.f0 = new com.xforce.v5.xdvpro.widget.f(g(), R.style.confirm_dialog);
        }
        this.f0.setCancelable(false);
        this.f0.show();
        this.f0.c(this.d0.getString(R.string.reseting_device));
        this.f0.d(true);
        R1();
        this.n0.sendEmptyMessageDelayed(7, 3000);
    }

    /* access modifiers changed from: private */
    public void Y1() {
        c0.a(0, "X1SettingFragment", "showLoadingFormatDialog()");
        if (this.g0 == null) {
            this.g0 = new com.xforce.v5.xdvpro.widget.f(g(), R.style.confirm_dialog);
        }
        this.g0.setCancelable(false);
        this.g0.show();
        this.g0.d(true);
        this.g0.c(y().getString(R.string.formating_tf_card));
        S1();
    }

    /* access modifiers changed from: private */
    public void Z1() {
        if (this.k0 == null) {
            this.k0 = new com.xforce.v5.xdvpro.widget.e(this.a0, R.style.confirm_dialog);
        }
        this.k0.show();
        this.k0.setCancelable(false);
        this.k0.d(y().getString(R.string.reseting_success_restart_app));
        this.k0.e(new j());
        this.k0.c(new a());
    }

    private void a2() {
        c0.a(0, "X1SettingFragment", "syncTimetoDev()");
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(11);
        int i3 = instance.get(12);
        int i4 = instance.get(13);
        int i5 = instance.get(1);
        int i6 = instance.get(2) + 1;
        int i7 = instance.get(5);
        c0.a(0, "X1SettingFragment", "syncTimetoDev() msg = " + (i5 + " ," + i6 + " ," + i7 + " ," + i2 + " ," + i3 + " ," + i4));
        L1(new b.b.e.a.a(d0.t().p().g(), 1599, y.a(i5, i6, i7, i2, i3, i4), y.b()));
    }

    /* access modifiers changed from: private */
    public void b2() {
        c0.a(0, "X1SettingFragment", "totalExit");
        this.a0.O();
    }

    public void O1(b.b.e.a.b bVar) {
        c0.a(0, "X1SettingFragment", "refreshUI() rtnMsg = " + bVar);
        Message obtainMessage = this.n0.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = bVar;
        this.n0.sendMessage(obtainMessage);
    }

    public void Q(int i2, int i3, Intent intent) {
        c0.a(0, "X1SettingFragment", "onActivityResult()" + i2 + ":" + i3);
        if (i2 == 1001) {
            if (i3 == 1002) {
                b.c.a.a.d.b.g(d0.t().p().l());
            }
        } else if (i2 == 1003) {
            F1();
        }
    }

    public void V(Bundle bundle) {
        c0.a(0, "X1SettingFragment", "onCreate");
        super.V(bundle);
        M1();
    }

    @SuppressLint({"NewApi"})
    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "X1SettingFragment", "onCreateView");
        View inflate = layoutInflater.inflate(R.layout.fragment_setting, (ViewGroup) null);
        this.d0 = y();
        this.a0 = (X1MainFragmentActivity) g();
        this.Y = (ExpandableListView) inflate.findViewById(R.id.setting_listview);
        b.c.a.a.b.b bVar = new b.c.a.a.b.b(this.a0, b.b.d.b.e().a());
        this.Z = bVar;
        bVar.c(this.i0);
        this.Y.setAdapter(this.Z);
        this.Y.setGroupIndicator((Drawable) null);
        this.Y.setOnGroupClickListener(new d(this));
        this.Y.setOnChildClickListener(new e());
        for (int i2 = 0; i2 < this.Z.getGroupCount(); i2++) {
            this.Y.expandGroup(i2);
        }
        this.Y.setOverScrollMode(2);
        this.n0.sendEmptyMessageDelayed(9, 1000);
        return inflate;
    }

    public void a0() {
        c0.a(0, "X1SettingFragment", "onDestroy");
        super.a0();
    }

    public void p0() {
        c0.a(0, "X1SettingFragment", "onResume");
        super.p0();
        this.c0 = false;
    }

    public void s0() {
        c0.a(0, "X1SettingFragment", "onStop");
        super.s0();
        this.c0 = true;
    }
}
