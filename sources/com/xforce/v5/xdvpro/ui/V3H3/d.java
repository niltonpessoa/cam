package com.xforce.v5.xdvpro.ui.V3H3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.m;
import com.rp.rptool.util.p;
import com.rp.rptool.util.r;
import com.rp.rptool.util.x;
import com.rp.rptool.util.y;
import com.rp.rptool.util.z;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.ui.XFWiFiPwdSetActivity;
import com.xforce.v5.xdvpro.widget.k;
import com.xforce.v5.xdvpro.widget.l;
import com.xforce.v5.xdvpro.widget.o;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.List;

public class d extends android.support.v4.app.e {
    public static boolean u0 = false;
    /* access modifiers changed from: private */
    public ListView Y;
    private b.c.a.a.b.c Z;
    /* access modifiers changed from: private */
    public XFTPV3H3MainFragmentActivity a0;
    private k b0;
    private boolean c0;
    private Resources d0;
    private Button e0;
    /* access modifiers changed from: private */
    public View f0;
    private TextView g0;
    /* access modifiers changed from: private */
    public int h0 = 8;
    private int[] i0;
    /* access modifiers changed from: private */
    public k j0;
    private com.xforce.v5.xdvpro.widget.f k0;
    private com.xforce.v5.xdvpro.widget.f l0;
    /* access modifiers changed from: private */
    public k m0;
    private com.xforce.v5.xdvpro.widget.d n0 = new i(this);
    private com.xforce.v5.xdvpro.widget.f o0;
    public com.xforce.v5.xdvpro.widget.e p0;
    private l q0;
    private l.b r0 = new b();
    private com.xforce.v5.xdvpro.widget.j s0;
    /* access modifiers changed from: private */
    public Handler t0 = new c();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            d.this.p0.dismiss();
            d.this.o2();
        }
    }

    class b implements l.b {
        b() {
        }

        public void a(int i, int i2) {
            Message obtainMessage = d.this.t0.obtainMessage();
            obtainMessage.what = 4;
            obtainMessage.arg1 = i;
            obtainMessage.arg2 = i2;
            d.this.t0.sendMessage(obtainMessage);
        }
    }

    class c extends Handler {
        c() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            switch (i) {
                case 0:
                    d.this.Q1((b.b.e.a.b) message.obj);
                    return;
                case 1:
                    d0.t().J((b.b.e.a.a) message.obj);
                    return;
                case 2:
                    d.this.H1();
                    ((WifiManager) d.this.g().getApplicationContext().getSystemService("wifi")).disconnect();
                    break;
                case 3:
                    d.this.J1();
                    return;
                case 4:
                    d.this.O1(message.arg1, message.arg2);
                    return;
                case 5:
                case 9:
                    d.this.X1();
                    return;
                case 6:
                    d.this.I1();
                    break;
                case 7:
                    d.this.Y1();
                    d.this.I1();
                    ((WifiManager) d.this.g().getApplicationContext().getSystemService("wifi")).disconnect();
                    d.this.l2();
                    return;
                case 8:
                    d.this.P1();
                    return;
                default:
                    switch (i) {
                        case 45057:
                            d.this.U1();
                            return;
                        case 45058:
                            if (d.this.h0 != 8) {
                                d.this.Y.removeFooterView(d.this.f0);
                                return;
                            } else if (d.this.Y.getFooterViewsCount() == 0) {
                                d.this.Y.addFooterView(d.this.f0);
                                return;
                            } else {
                                return;
                            }
                        case 45059:
                            d.this.K1();
                            return;
                        default:
                            return;
                    }
            }
            d.this.o2();
        }
    }

    /* renamed from: com.xforce.v5.xdvpro.ui.V3H3.d$d  reason: collision with other inner class name */
    class C0050d implements View.OnClickListener {
        C0050d() {
        }

        public void onClick(View view) {
            d.this.a0.C();
        }
    }

    class e implements AdapterView.OnItemClickListener {
        e() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            d dVar = d.this;
            dVar.N1(dVar.h0, i);
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            d.this.j0.dismiss();
            d.this.k2();
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        public void onClick(View view) {
            d.this.m0.dismiss();
            d.this.j2();
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            d.this.o2();
        }
    }

    class i implements com.xforce.v5.xdvpro.widget.d {
        i(d dVar) {
        }

        public void a(String str, boolean z) {
            c0.a(0, "XFTPV3H3SettingFragment", "toggleButtonClickRtn(" + str + "," + z + ")");
            if (!b.c.a.a.d.b.p) {
                String[] split = str.split(":");
                if (split.length < 2) {
                    c0.a(3, "XFTPV3H3SettingFragment", "toggleButtonClickRtn() tags return error!");
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
            d.this.p0.dismiss();
            d.this.o2();
        }
    }

    private void G1() {
        if (this.q0 == null) {
            l lVar = new l(this.a0, R.style.confirm_dialog);
            this.q0 = lVar;
            lVar.h(this.r0);
        }
    }

    /* access modifiers changed from: private */
    public void H1() {
        c0.a(0, "XFTPV3H3SettingFragment", "dismissLoadingCloseWiFiDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.o0;
        if (fVar != null && fVar.isShowing()) {
            this.o0.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void I1() {
        c0.a(0, "XFTPV3H3SettingFragment", "dismissLoadingFactoryDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.k0;
        if (fVar != null && fVar.isShowing()) {
            this.k0.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void J1() {
        c0.a(0, "XFTPV3H3SettingFragment", "dismissLsettings.xmloadingFormatDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.l0;
        if (fVar != null && fVar.isShowing()) {
            this.l0.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void K1() {
        if (this.t0.hasMessages(45059)) {
            this.t0.removeMessages(45059);
        }
        com.xforce.v5.xdvpro.widget.j jVar = this.s0;
        if (jVar != null && jVar.isShowing()) {
            this.s0.dismiss();
        }
    }

    private void L1() {
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1617, com.rp.rptool.util.l.a(this.h0), com.rp.rptool.util.l.b()));
    }

    private void M1() {
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1619, com.rp.rptool.util.l.a(8), com.rp.rptool.util.l.b()));
    }

    /* access modifiers changed from: private */
    public void N1(int i2, int i3) {
        Resources resources;
        k kVar;
        int i4;
        int i5 = 0;
        c0.a(0, "XFTPV3H3SettingFragment", "handleChildClick() mode id = " + i2 + " index = " + i3);
        b.b.d.c i6 = b.b.d.b.e().i(i2, i3);
        if (b.c.a.a.d.b.p && !i6.c().equals("ml_exit_id")) {
            o.g(g(), y().getString(R.string.device_offline), false);
        } else if (b.c.a.a.d.b.q || i6.c().equals("ml_exit_id")) {
            int[] iArr = this.i0;
            if (iArr != null && iArr.length > i3) {
                i5 = (this.h0 != 8 || !d0.t().p().a().equals("V5")) ? this.i0[i3] : this.i0[b.b.d.b.e().d(i3)];
            }
            List<String> a2 = i6.a();
            if (a2 != null && a2.size() > 0 && i5 == -1) {
                return;
            }
            if (i6.c().equals("ml_exit_id")) {
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
                return;
            }
            if (d0.t().p().a().equals("V5")) {
                int b2 = this.Z.b("ml_record_eis");
                int b3 = this.Z.b("ml_camera_distortioncalibration");
                int b4 = this.Z.b("ml_record_resolution");
                if (i6.c().equals("ml_record_eis")) {
                    int i7 = this.h0;
                    if (i7 != 1 && i7 != 3) {
                        if (b3 >= 0 && this.i0[b3] == 1) {
                            return;
                        }
                        if (b4 >= 0) {
                            b.b.d.c cVar = this.Z.a().get(b4);
                            int i8 = this.i0[b4];
                            if (cVar.a() != null && cVar.a().size() > 0) {
                                String str = cVar.a().get(i8);
                                if (str.contains("120") || str.contains("240")) {
                                    return;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (i6.c().equals("ml_camera_distortioncalibration")) {
                    if (this.h0 != 1) {
                        if (b2 >= 0 && this.i0[b2] == 1) {
                            return;
                        }
                        if (b4 >= 0) {
                            b.b.d.c cVar2 = this.Z.a().get(b4);
                            int i9 = this.i0[b4];
                            if (cVar2.a() != null && cVar2.a().size() > 0) {
                                String str2 = cVar2.a().get(i9);
                                if (str2.contains("120") || str2.contains("240")) {
                                    return;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            if (i6.c().equals("ml_device_format")) {
                h2();
            } else if (i6.c().equals("ml_device_resetfactory")) {
                i2();
            } else if (!i6.c().equals("ml_storage_id")) {
                if (i6.c().equals("ml_device_time_config") || i6.c().equals("ml_device_date_config")) {
                    n2();
                } else if (i6.c().equals("ml_device_wireless_reset")) {
                    h1(new Intent(g(), XFWiFiPwdSetActivity.class), 2001);
                } else {
                    if (this.q0 == null) {
                        G1();
                    }
                    this.q0.show();
                    this.q0.a(i6.d(), a2, i3, i5);
                }
            }
        } else {
            o.g(g(), y().getString(R.string.device_is_preparing), false);
        }
    }

    /* access modifiers changed from: private */
    public void O1(int i2, int i3) {
        byte[] bArr;
        b.b.e.a.a aVar;
        c0.a(0, "XFTPV3H3SettingFragment", "handleDialogCallback() value = " + i2 + " cmdTag = " + i3);
        this.q0.dismiss();
        m2();
        b.b.d.c cVar = (b.b.d.c) this.Z.getItem(i3);
        c0.a(0, "XFTPV3H3SettingFragment", "handleDialogCallback() item = " + cVar);
        String c2 = cVar.c();
        b.b.e.a.a aVar2 = null;
        try {
            bArr = c2.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            bArr = null;
        }
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1615, p.a(this.h0, i2, bArr), p.b()));
        if (c2.equals("mode_loop_rec") && e.c1 < 4) {
            if (i2 == 0) {
                int q = d0.t().q();
                byte[] a2 = x.a(0);
                int b2 = x.b();
            } else {
                aVar = new b.b.e.a.a(d0.t().q(), 1613, x.a(2), x.b());
            }
            d0.t().J(aVar);
        }
        if (c2.equals("ml_continue_timing_mode")) {
            int i4 = e.c1;
            if (i4 == 5 && i2 == 0) {
                aVar2 = new b.b.e.a.a(d0.t().q(), 1613, x.a(7), x.b());
            } else if (i4 == 7 && i2 == 1) {
                aVar2 = new b.b.e.a.a(d0.t().q(), 1613, x.a(5), x.b());
            }
            if (aVar2 != null) {
                d0.t().J(aVar2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void P1() {
        d0.t().w(1607, 1);
        c0.a(0, "XFTPV3H3SettingFragment", "handleFormatOption()");
        Intent intent = new Intent();
        intent.setAction("refresh_list_filter");
        intent.putExtra("notify_only", false);
        g().sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public void Q1(b.b.e.a.b bVar) {
        String str;
        c0.a(0, "XFTPV3H3SettingFragment", "handleRefreshUI()" + bVar);
        int b2 = bVar.b();
        if (this.c0 || d0.t().p() == null) {
            c0.a(0, "XFTPV3H3SettingFragment", "handleRefreshUI(" + b2 + ")  error isOnstop or device == null");
            return;
        }
        if (b2 == 1600) {
            int i2 = new r(bVar.a()).f958a;
            if (i2 == 0) {
                c0.a(0, "XFTPV3H3SettingFragment", "NAT_CMD_SET_TIME_RESP  set success!");
            } else {
                c0.a(3, "XFTPV3H3SettingFragment", "NAT_CMD_SET_TIME_RESP  set fail!");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.d0.getString(R.string.set_synctime));
            sb.append(this.d0.getString(i2 == 0 ? R.string.success : R.string.fail));
            String sb2 = sb.toString();
            if (this.a0.l == 2) {
                g2(sb2, i2);
            }
        } else if (b2 == 1606) {
            r rVar = new r(bVar.a());
            int i3 = rVar.f958a;
            c0.a(0, "XFTPV3H3SettingFragment", "NAT_CMD_FORMAT_TF_CARD_RESP result = " + rVar.f958a);
            if (i3 == 0) {
                c0.a(0, "XFTPV3H3SettingFragment", "NAT_CMD_FORMAT_TF_CARD_RESP  set success!");
                this.t0.sendEmptyMessageDelayed(3, 1000);
                P1();
                this.t0.sendEmptyMessageDelayed(8, 2000);
            } else {
                this.t0.sendEmptyMessageDelayed(3, 1000);
                c0.a(3, "XFTPV3H3SettingFragment", "NAT_CMD_FORMAT_TF_CARD_RESP  set fail!");
            }
        } else if (b2 == 1608) {
            c0.a(0, "XFTPV3H3SettingFragment", "sendIOCtrlResp() NAT_CMD_CHECK_TF_CARD_RESP");
            z zVar = new z(bVar.a());
            c0.a(0, "XFTPV3H3SettingFragment", "NAT_CMD_CHECK_TF_CARD_RESP capacity = " + zVar);
            d0.t().p().s((long) zVar.f964b);
            d0.t().p().t((long) zVar.f963a);
            V1();
        } else if (b2 == 1616) {
            b2(bVar);
        } else if (b2 == 1618) {
            Z1(bVar);
        } else if (b2 != 1620) {
            if (b2 == 1809) {
                r rVar2 = new r(bVar.a());
                str = "NAT_CMD_FACTORY_RESET_RESP result = " + rVar2.f958a;
            } else if (b2 != 1833) {
                b.b.d.c f2 = b.b.d.b.e().f(b2);
                if (f2 != null && !f2.d().equals("")) {
                    f2(0);
                }
            } else {
                c0.a(0, "XFTPV3H3SettingFragment", "NAT_CMD_SET_WIFI_PWD_RESP");
                str = "NAT_CMD_SET_WIFI_PWD_RESP failed";
            }
            c0.a(0, "XFTPV3H3SettingFragment", str);
        } else {
            a2(bVar);
        }
        X1();
    }

    private void R1(int i2, int i3) {
        c0.a(0, "XFTPV3H3SettingFragment", "sendIOCtrlMsgToDevs" + i2 + "," + i3 + ")");
        S1(new b.b.e.a.a(d0.t().p().g(), i2, x.a(i3), x.b()));
    }

    private void S1(b.b.e.a.a aVar) {
        c0.a(0, "XFTPV3H3SettingFragment", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "XFTPV3H3SettingFragment", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "XFTPV3H3SettingFragment", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.t0.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 1;
        this.t0.sendMessage(obtainMessage);
    }

    private void T1() {
    }

    /* access modifiers changed from: private */
    public void U1() {
        this.Z.e(this.h0);
        this.Z.c(b.b.d.b.e().h(this.h0));
        this.Z.d(this.i0);
        this.Z.notifyDataSetChanged();
        this.t0.sendEmptyMessage(45058);
    }

    private void V1() {
        String str;
        c0.a(0, "XFTPV3H3SettingFragment", "refreshTFCardResp()");
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
    public void X1() {
        c0.a(0, "XFTPV3H3SettingFragment", "refreshValues()");
        this.Z.d(this.i0);
        this.Z.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public void Y1() {
        b.c.a.a.d.b.g(d0.t().p().l());
        WifiManager wifiManager = (WifiManager) this.a0.getApplicationContext().getSystemService("wifi");
    }

    private void Z1(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3SettingFragment", " ealen test --- IOTYPE_USER_SDV_GET_MODE_CONFIG_RESP ---");
        m mVar = new m(bVar.a());
        c0.a(0, "XFTPV3H3SettingFragment", "mode:" + mVar.f952a + " count:" + mVar.f953b);
        this.i0 = new int[mVar.f953b];
        for (int i2 = 0; i2 < mVar.f953b; i2++) {
            int i3 = i2 * 8;
            int b2 = com.rp.rptool.util.b.b(mVar.c, i3);
            short b3 = com.rp.rptool.util.b.b(mVar.c, i3 + 4);
            this.i0[b3] = b2;
            c0.a(0, "XFTPV3H3SettingFragment", "i = " + i2 + " value = " + b2 + " index = " + b3);
        }
        K1();
        this.t0.sendEmptyMessage(45057);
    }

    private void a2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3SettingFragment", "--- IOTYPE_USER_SDV_GET_SYS_CONFIG_REQ ---");
        m mVar = new m(bVar.a());
        c0.a(0, "XFTPV3H3SettingFragment", "mode:" + mVar.f952a + " count:" + mVar.f953b);
        this.i0 = new int[mVar.f953b];
        for (int i2 = 0; i2 < mVar.f953b; i2++) {
            int i3 = i2 * 8;
            int b2 = com.rp.rptool.util.b.b(mVar.c, i3);
            short b3 = com.rp.rptool.util.b.b(mVar.c, i3 + 4);
            this.i0[b3] = b2;
            c0.a(0, "XFTPV3H3SettingFragment", "i = " + i2 + " value = " + b2 + " index = " + b3);
        }
        K1();
        this.t0.sendEmptyMessage(45057);
    }

    private void b2(b.b.e.a.b bVar) {
        com.rp.rptool.util.o oVar = new com.rp.rptool.util.o(bVar.a());
        c0.a(0, "XFTPV3H3SettingFragment", "IOTYPE_USER_SDV_SET_MODE_CONFIG_RESP reslut = " + oVar.f957b + "mode = " + oVar.f956a);
        int i2 = oVar.f957b;
        if (i2 == 0) {
            c0.a(0, "XFTPV3H3SettingFragment", "NAT_CMD_SET_TIME_RESP  set success!");
        } else {
            c0.a(3, "XFTPV3H3SettingFragment", "NAT_CMD_SET_TIME_RESP  set fail!");
        }
        g2(this.d0.getString(i2 == 0 ? R.string.set_success : R.string.set_fail), i2);
        if (this.h0 != 8) {
            L1();
        } else {
            M1();
        }
    }

    private void c2() {
        c0.a(0, "XFTPV3H3SettingFragment", "sendCmdFactoryReset()");
        R1(1808, 1);
        u0 = true;
    }

    private void d2() {
        c0.a(0, "XFTPV3H3SettingFragment", "sendCmdFormatTFCard()");
        R1(1605, 1);
    }

    private void f2(int i2) {
        g2(y().getString(i2 == 0 ? R.string.set_success : R.string.set_fail), i2);
    }

    private void g2(String str, int i2) {
        boolean z = false;
        if (com.xforce.v5.xdvpro.ui.g.i1) {
            android.support.v4.app.f g2 = g();
            if (i2 == 0) {
                z = true;
            }
            o.g(g2, str, z);
            return;
        }
        Toast.makeText(this.a0, str, 0).show();
    }

    private void h2() {
        c0.a(0, "XFTPV3H3SettingFragment", "showConfirmFormatCardDialog()");
        if (this.j0 == null) {
            this.j0 = new k(g(), R.style.confirm_dialog);
        }
        this.j0.show();
        this.j0.c(y().getString(R.string.setting_sure_format_card));
        this.j0.a(new f());
    }

    private void i2() {
        c0.a(0, "XFTPV3H3SettingFragment", "showConfirmResetDevDialog()");
        if (this.m0 == null) {
            this.m0 = new k(g(), R.style.confirm_dialog);
        }
        this.m0.show();
        this.m0.c(y().getString(R.string.setting_sure_reset_device));
        this.m0.a(new g());
    }

    /* access modifiers changed from: private */
    public void j2() {
        c0.a(0, "XFTPV3H3SettingFragment", "showLoadingFactoryResetDialog()");
        if (this.k0 == null) {
            this.k0 = new com.xforce.v5.xdvpro.widget.f(g(), R.style.confirm_dialog);
        }
        this.k0.setCancelable(false);
        this.k0.show();
        this.k0.c(this.d0.getString(R.string.reseting_device));
        this.k0.d(true);
        c2();
        this.t0.sendEmptyMessageDelayed(7, 4000);
    }

    /* access modifiers changed from: private */
    public void k2() {
        c0.a(0, "XFTPV3H3SettingFragment", "showLoadingFormatDialog()");
        if (this.l0 == null) {
            this.l0 = new com.xforce.v5.xdvpro.widget.f(g(), R.style.confirm_dialog);
        }
        this.l0.setCancelable(false);
        this.l0.show();
        this.l0.d(true);
        this.l0.c(y().getString(R.string.formating_tf_card));
        this.t0.sendEmptyMessageDelayed(3, 5000);
        d2();
    }

    /* access modifiers changed from: private */
    public void l2() {
        if (this.p0 == null) {
            this.p0 = new com.xforce.v5.xdvpro.widget.e(this.a0, R.style.confirm_dialog);
        }
        this.p0.show();
        this.p0.setCancelable(false);
        this.p0.d(y().getString(R.string.reseting_success_restart_app));
        this.p0.e(new j());
        this.p0.c(new a());
    }

    private void m2() {
        if (this.s0 == null) {
            this.s0 = new com.xforce.v5.xdvpro.widget.j(this.a0, R.style.confirm_dialog);
        }
        if (!this.s0.isShowing()) {
            this.s0.show();
            this.s0.d(true);
            this.s0.c(this.d0.getString(R.string.please_wait));
            this.s0.setCancelable(false);
        }
        this.t0.sendEmptyMessageDelayed(45059, 5000);
    }

    private void n2() {
        c0.a(0, "XFTPV3H3SettingFragment", "syncTimetoDev()");
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(11);
        int i3 = instance.get(12);
        int i4 = instance.get(13);
        int i5 = instance.get(1);
        int i6 = instance.get(2) + 1;
        int i7 = instance.get(5);
        c0.a(0, "XFTPV3H3SettingFragment", "syncTimetoDev() msg = " + (i5 + " ," + i6 + " ," + i7 + " ," + i2 + " ," + i3 + " ," + i4));
        S1(new b.b.e.a.a(d0.t().p().g(), 1599, y.a(i5, i6, i7, i2, i3, i4), y.b()));
    }

    /* access modifiers changed from: private */
    public void o2() {
        c0.a(0, "XFTPV3H3SettingFragment", "totalExit");
        this.a0.Q();
    }

    public void Q(int i2, int i3, Intent intent) {
        c0.a(0, "XFTPV3H3SettingFragment", "onActivityResult()" + i2 + ":" + i3);
        if (i2 == 2001 && i3 == 2002) {
            b.c.a.a.d.b.g(d0.t().p().l());
        }
    }

    public void V(Bundle bundle) {
        c0.a(0, "XFTPV3H3SettingFragment", "onCreate");
        super.V(bundle);
        T1();
    }

    public void W1(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3SettingFragment", "refreshUI() rtnMsg = " + bVar);
        Message obtainMessage = this.t0.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = bVar;
        this.t0.sendMessage(obtainMessage);
    }

    @SuppressLint({"NewApi"})
    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "XFTPV3H3SettingFragment", "onCreateView");
        View inflate = layoutInflater.inflate(R.layout.fragment_setting_tp, (ViewGroup) null);
        this.d0 = y();
        this.a0 = (XFTPV3H3MainFragmentActivity) g();
        Button button = (Button) inflate.findViewById(R.id.back_btn);
        this.e0 = button;
        button.setOnClickListener(new C0050d());
        TextView textView = (TextView) inflate.findViewById(R.id.top_title_tv);
        this.Y = (ListView) inflate.findViewById(R.id.setting_listview);
        b.c.a.a.b.c cVar = new b.c.a.a.b.c(this.a0, b.b.d.b.e().h(this.h0));
        this.Z = cVar;
        cVar.f(this.n0);
        View inflate2 = s().inflate(R.layout.setting_footer, (ViewGroup) null);
        this.f0 = inflate2;
        TextView textView2 = (TextView) inflate2.findViewById(R.id.tv_appinfo);
        this.g0 = textView2;
        textView2.setText(b.c.a.a.d.a.a(g()) + "  V" + b.c.a.a.d.b.o);
        this.Y.setAdapter(this.Z);
        this.Y.setOnItemClickListener(new e());
        this.Y.setOverScrollMode(2);
        this.t0.sendEmptyMessageDelayed(9, 1000);
        return inflate;
    }

    public void a0() {
        c0.a(0, "XFTPV3H3SettingFragment", "onDestroy");
        super.a0();
    }

    public void e2(int i2, int[] iArr) {
        this.h0 = i2;
        this.i0 = iArr;
        this.t0.sendEmptyMessage(45057);
    }

    public void p0() {
        c0.a(0, "XFTPV3H3SettingFragment", "onResume");
        super.p0();
        this.c0 = false;
    }

    public void s0() {
        c0.a(0, "XFTPV3H3SettingFragment", "onStop");
        super.s0();
        this.c0 = true;
    }
}
