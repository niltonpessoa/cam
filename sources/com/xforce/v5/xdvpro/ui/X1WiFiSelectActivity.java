package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.e0;
import com.rp.rptool.util.y;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity;
import com.xforce.v5.xdvpro.widget.n;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@SuppressLint({"NewApi"})
public class X1WiFiSelectActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f1074a = false;

    /* renamed from: b  reason: collision with root package name */
    final long[] f1075b = new long[4];
    /* access modifiers changed from: private */
    public b.c.a.a.b.d c;
    private ExpandableListView d;
    /* access modifiers changed from: private */
    public List<b.c.a.a.c.b> e;
    /* access modifiers changed from: private */
    public String f;
    /* access modifiers changed from: private */
    public String g;
    /* access modifiers changed from: private */
    public com.xforce.v5.xdvpro.widget.m h;
    /* access modifiers changed from: private */
    public com.xforce.v5.xdvpro.widget.e i;
    private Button j;
    private TextView k;
    /* access modifiers changed from: private */
    public int l = 10;
    private e0.c m = new l();
    /* access modifiers changed from: private */
    public boolean n = false;
    /* access modifiers changed from: private */
    public boolean o = false;
    /* access modifiers changed from: private */
    public int p;
    /* access modifiers changed from: private */
    public com.xforce.v5.xdvpro.widget.e q;
    d0.e r = new b();
    private com.xforce.v5.xdvpro.widget.f s;
    /* access modifiers changed from: private */
    public Handler t = new d();

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1076a;

        a(String str) {
            this.f1076a = str;
        }

        public void onClick(View view) {
            X1WiFiSelectActivity.this.q.dismiss();
            X1WiFiSelectActivity.this.P(this.f1076a);
        }
    }

    class b implements d0.e {
        b() {
        }

        public void a(b.b.e.a.b bVar) {
            int b2 = bVar.b();
            if (b2 == 12289) {
                X1WiFiSelectActivity.this.a0(bVar);
            } else if (b2 == 12290) {
                X1WiFiSelectActivity.this.Z(bVar);
            } else if (b2 == 12322) {
                X1WiFiSelectActivity.this.b0(bVar);
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            if (X1WiFiSelectActivity.this.h.b()) {
                c0.a(0, "X1WiFiSelectActivity", "enter password correct !");
                X1WiFiSelectActivity.this.h.dismiss();
                X1WiFiSelectActivity x1WiFiSelectActivity = X1WiFiSelectActivity.this;
                String unused = x1WiFiSelectActivity.f = x1WiFiSelectActivity.h.d();
                X1WiFiSelectActivity x1WiFiSelectActivity2 = X1WiFiSelectActivity.this;
                String unused2 = x1WiFiSelectActivity2.g = x1WiFiSelectActivity2.h.c();
                boolean unused3 = X1WiFiSelectActivity.this.o = true;
                X1WiFiSelectActivity x1WiFiSelectActivity3 = X1WiFiSelectActivity.this;
                x1WiFiSelectActivity3.J(x1WiFiSelectActivity3.f, X1WiFiSelectActivity.this.g);
                X1WiFiSelectActivity.this.g0();
                return;
            }
            c0.a(0, "X1WiFiSelectActivity", "enter password error!");
        }
    }

    class d extends Handler {
        d() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                List unused = X1WiFiSelectActivity.this.e = e0.o().y();
                X1WiFiSelectActivity.this.Y();
                if (X1WiFiSelectActivity.this.n) {
                    X1WiFiSelectActivity.this.t.sendEmptyMessageDelayed(0, 1500);
                }
            } else if (i == 1) {
                d0.t().J((b.b.e.a.a) message.obj);
            } else if (i == 2) {
                d0.t().K();
            } else if (i == 3) {
                X1WiFiSelectActivity.this.I();
            } else if (i == 136) {
                X1WiFiSelectActivity.this.G();
                X1WiFiSelectActivity.this.L();
            } else if (i == 153) {
                X1WiFiSelectActivity.this.N();
            } else if (i == 161) {
                X1WiFiSelectActivity.this.M();
                X1WiFiSelectActivity.this.O();
            } else if (i != 256) {
                if (i == 1002) {
                    int unused2 = X1WiFiSelectActivity.this.p = 0;
                }
            } else if (!X1WiFiSelectActivity.this.R()) {
                X1WiFiSelectActivity.this.t.sendEmptyMessageDelayed(256, 1000);
            }
        }
    }

    class e implements Runnable {
        e(X1WiFiSelectActivity x1WiFiSelectActivity) {
        }

        public void run() {
            for (File file : new File(b.c.a.a.d.b.f865a).listFiles()) {
                if (file.getName().contains("zh-") || file.getName().equals("setting_keys.xml")) {
                    file.delete();
                }
            }
        }
    }

    class f implements DialogInterface.OnClickListener {
        f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            X1WiFiSelectActivity x1WiFiSelectActivity = X1WiFiSelectActivity.this;
            x1WiFiSelectActivity.startActivityForResult(intent, x1WiFiSelectActivity.l);
        }
    }

    class g implements DialogInterface.OnClickListener {
        g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            X1WiFiSelectActivity.this.finish();
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            long[] jArr = X1WiFiSelectActivity.this.f1075b;
            System.arraycopy(jArr, 1, jArr, 0, jArr.length - 1);
            long[] jArr2 = X1WiFiSelectActivity.this.f1075b;
            jArr2[jArr2.length - 1] = SystemClock.uptimeMillis();
            if (SystemClock.uptimeMillis() - X1WiFiSelectActivity.this.f1075b[0] <= 500) {
                c0.a(0, "X1WiFiSelectActivity", "点击了4次啦");
                n.g(X1WiFiSelectActivity.this, "可以连接TP机器啦");
                boolean unused = X1WiFiSelectActivity.this.f1074a = true;
            }
        }
    }

    class i implements View.OnClickListener {
        i() {
        }

        public void onClick(View view) {
            d0.t().i();
            X1WiFiSelectActivity.this.finish();
        }
    }

    class j implements ExpandableListView.OnGroupClickListener {
        j(X1WiFiSelectActivity x1WiFiSelectActivity) {
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    class k implements ExpandableListView.OnChildClickListener {
        k() {
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            if (X1WiFiSelectActivity.this.o) {
                return false;
            }
            X1WiFiSelectActivity.this.S(X1WiFiSelectActivity.this.c != null ? (String) X1WiFiSelectActivity.this.c.getChild(i, i2) : "");
            return false;
        }
    }

    class l implements e0.c {
        l() {
        }

        public void a() {
            c0.a(2, "X1WiFiSelectActivity", "wifiConnectFail!!!");
            X1WiFiSelectActivity.this.t.sendEmptyMessage(3);
        }

        public void b() {
        }

        public void c() {
            c0.a(3, "X1WiFiSelectActivity", "NET WORK CHANGE!");
        }

        public void d() {
            c0.a(0, "X1WiFiSelectActivity", "wifiConnectSuccess()");
            X1WiFiSelectActivity.this.c0();
        }

        public void e() {
            c0.a(2, "X1WiFiSelectActivity", "wifiConnectOverTm!!!");
            X1WiFiSelectActivity.this.t.sendEmptyMessage(3);
        }
    }

    class m implements View.OnClickListener {
        m() {
        }

        public void onClick(View view) {
            X1WiFiSelectActivity.this.i.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void G() {
        c0.a(0, "X1WiFiSelectActivity", "checkDirs()");
        b.c.a.a.d.b.t(this, getResources().getString(R.string.app_name), d0.t().p().l());
    }

    private void H() {
        if (Build.VERSION.SDK_INT >= 23) {
            c0.a(0, "X1WiFiSelectActivity", "Phone system version is higher or equal 6.0, systemVersion" + b.c.a.a.d.d.a());
            if (Q(this)) {
                c0.a(0, "X1WiFiSelectActivity", "GPS已打开");
            } else {
                W(this);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"StringFormatInvalid"})
    public void I() {
        c0.a(0, "X1WiFiSelectActivity", "connectOverTm()");
        this.o = false;
        if (this.t.hasMessages(3)) {
            this.t.removeMessages(3);
        }
        if (this.t.hasMessages(256)) {
            this.t.removeMessages(256);
        }
        this.c.d(e0.o().m(this));
        this.c.notifyDataSetChanged();
        M();
        String string = getResources().getString(R.string.connect_wifi_overtime);
        h0("WiFi " + string);
    }

    /* access modifiers changed from: private */
    public void J(String str, String str2) {
        c0.a(0, "X1WiFiSelectActivity", "connectWifi() ssid = " + str + " pwd = " + str2);
        j0();
        this.o = true;
        this.c.notifyDataSetChanged();
        e0.o().v(str, str2);
    }

    private void K() {
        new Thread(new e(this)).start();
    }

    /* access modifiers changed from: private */
    public void L() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(b.c.a.a.d.b.f865a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(d0.t().p().l());
        sb.append(str2);
        sb.append("settings.xml");
        String sb2 = sb.toString();
        File file = new File(sb2);
        try {
            if (file.exists()) {
                new DataOutputStream(new FileOutputStream(file)).close();
                str = file.delete() ? "delete success" : "delete fail";
            } else {
                str = " file不存在";
            }
            c0.a(0, sb2, str);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void M() {
        c0.a(0, "X1WiFiSelectActivity", "dismissWaittingConWiFiDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.s;
        if (fVar != null && fVar.isShowing()) {
            this.s.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void N() {
        d0.t().m(this, "http://192.168.10.1:8082/usr/share/minigui/res/lang/setting_keys.xml");
        d0.t().A(this, "http://192.168.10.1:8082/usr/share/minigui/res/lang");
        d0.t().z("http://192.168.10.1:8082/tmp/data/.data/sqlite/sunxi.db", b.c.a.a.d.b.f865a);
        this.t.sendEmptyMessageDelayed(256, 2000);
    }

    /* access modifiers changed from: private */
    public void O() {
        Intent intent;
        c0.a(0, "X1WiFiSelectActivity", "enterMainView()");
        b.c.a.a.d.b.p = false;
        G();
        k0();
        if (d0.t().p().e().equals("Dv")) {
            intent = new Intent(this, X1MainFragmentActivity.class);
        } else {
            String b2 = d0.t().p().b();
            if (b2 == null || "".equals(b2)) {
                intent = new Intent(this, XFTPMainFragmentActivity.class);
            } else if (b2.equals("V3H-3")) {
                c0.a(0, "X1WiFiSelectActivity", "enterMainView() - enter V3H3");
                intent = new Intent(this, XFTPV3H3MainFragmentActivity.class);
            } else {
                intent = new Intent(this, XFTPMainFragmentActivity.class);
            }
        }
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public void P(String str) {
        c0.a(0, "X1WiFiSelectActivity", "enterOfflineMode()");
        b.c.a.a.d.b.p = true;
        d0.t().P(new b.b.e.a.c(b.c.a.a.d.b.i(str).c(), "", -1, "", -1));
        G();
        startActivity(new Intent(this, XFTPMainFragmentActivity.class));
        finish();
    }

    /* access modifiers changed from: private */
    public boolean R() {
        StringBuilder sb = new StringBuilder();
        sb.append(b.c.a.a.d.b.f865a);
        String str = File.separator;
        sb.append(str);
        sb.append("menu_config.lua");
        File file = new File(sb.toString());
        File file2 = new File(b.c.a.a.d.b.f865a + str + "menu_config_old.lua");
        File file3 = new File(b.c.a.a.d.b.f865a + str + "net_config.lua");
        File file4 = new File(b.c.a.a.d.b.f865a + str + "setting_keys.xml");
        File file5 = new File(b.c.a.a.d.b.f865a + str + "zh-EN.xml");
        if ((!file.exists() && !file2.exists() && !file3.exists() && !file4.exists()) || !file5.exists()) {
            return false;
        }
        if (this.t.hasMessages(256)) {
            this.t.removeMessages(256);
        }
        X();
        return true;
    }

    /* access modifiers changed from: private */
    public void S(String str) {
        c0.a(0, "X1WiFiSelectActivity", "handleClickItem() tmpSelectedSSID = " + str);
        this.f = "";
        this.g = "";
        b.c.a.a.c.b b2 = this.c.b(str);
        if (b2 != null && !b2.b().equals("")) {
            if (b2.e()) {
                e0(b2.b());
                return;
            }
            if (b2.b().equals(e0.o().m(this))) {
                g0();
                c0();
                return;
            }
            f0(b2);
        }
    }

    private void T(b.b.e.a.a aVar) {
        c0.a(0, "X1WiFiSelectActivity", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "X1WiFiSelectActivity", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "X1WiFiSelectActivity", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.t.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 1;
        this.t.sendMessage(obtainMessage);
    }

    private void U() {
        c0.a(0, "X1WiFiSelectActivity", "initDatas");
        Y();
        if (!e0.o().s()) {
            this.c.e(true);
        } else {
            this.c.e(false);
        }
        this.c.notifyDataSetChanged();
    }

    private void V() {
        c0.a(0, "X1WiFiSelectActivity", "initViews");
        TextView textView = (TextView) findViewById(R.id.tv_title);
        this.k = textView;
        textView.setOnClickListener(new h());
        Button button = (Button) findViewById(R.id.back_btn);
        this.j = button;
        button.setOnClickListener(new i());
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.wifi_list);
        this.d = expandableListView;
        expandableListView.setGroupIndicator((Drawable) null);
        this.d.setOnGroupClickListener(new j(this));
        this.d.setOnChildClickListener(new k());
    }

    private void X() {
        c0.a(0, "X1WiFiSelectActivity", "ealen test 配置文件已下载完毕，准备连接");
        b.b.e.a.c p2 = d0.t().p();
        d0(p2.l(), p2.d());
    }

    /* access modifiers changed from: private */
    public void Y() {
        c0.a(0, "X1WiFiSelectActivity", "refreshList");
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (this.c == null) {
            List<String> k2 = b.c.a.a.d.b.k();
            for (int i2 = 0; i2 < k2.size(); i2++) {
                c0.a(0, "X1WiFiSelectActivity", "savedWifis;" + i2 + ":" + k2.get(i2));
            }
            b.c.a.a.b.d dVar = new b.c.a.a.b.d(this, this.e, k2);
            this.c = dVar;
            this.d.setAdapter(dVar);
            this.d.setOverScrollMode(2);
        } else {
            this.c.d(e0.o().m(this));
            this.c.f(this.e);
        }
        if (this.e.size() > 0 && this.c.c()) {
            this.c.e(false);
        }
        this.c.notifyDataSetChanged();
        for (int i3 = 0; i3 < this.c.getGroupCount(); i3++) {
            this.d.expandGroup(i3);
        }
    }

    /* access modifiers changed from: private */
    public void Z(b.b.e.a.b bVar) {
        c0.a(0, "X1WiFiSelectActivity", "respConnectDevFail() rtnMsg = " + bVar);
        if (this.o) {
            d0.t().p().r(bVar.d());
            this.t.sendEmptyMessage(3);
        }
    }

    /* access modifiers changed from: private */
    public void a0(b.b.e.a.b bVar) {
        c0.a(0, "X1WiFiSelectActivity", "respConnectDevSuccess() rtnMsg = " + bVar);
        if (this.o) {
            if (this.t.hasMessages(3)) {
                this.t.removeMessages(3);
            }
            if (this.t.hasMessages(161)) {
                this.t.removeMessages(161);
            }
            this.o = false;
            if (d0.t().g()) {
                b.b.d.b.e().s(this);
            } else if (d0.t().h() || this.f1074a) {
                d0.t().p().p("Dv-Tp");
                String b2 = d0.t().p().b();
                if (b2 == null || "".equals(b2)) {
                    b.b.d.b.e().t(this);
                } else if (b2.equals("V3H-3")) {
                    c0.a(0, "X1WiFiSelectActivity", "find 316 - V3H3 device");
                    b.b.d.b.e().u(this, b2);
                }
            } else {
                c0.a(0, "X1WiFiSelectActivity", "not right pro file !~~");
                M();
                n.h(this, "device error, please try again!", 1);
                return;
            }
            this.t.sendEmptyMessage(161);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0(b.b.e.a.b r14) {
        /*
            r13 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = "X1WiFiSelectActivity"
            java.lang.String r4 = "respSearchDevice() "
            com.rp.rptool.util.c0.a(r2, r3, r4)
            boolean r4 = r13.o
            if (r4 != 0) goto L_0x0011
            return
        L_0x0011:
            int r4 = r14.d()
            r5 = -1
            r6 = 3
            if (r4 > r5) goto L_0x0023
            java.lang.String r4 = "respSearchDevice() overtime!"
            com.rp.rptool.util.c0.a(r2, r3, r4)
            android.os.Handler r4 = r13.t
            r4.sendEmptyMessage(r6)
        L_0x0023:
            int r4 = r14.c()
            int r5 = com.rp.rptool.util.b0.a()
            int r4 = r4 / r5
            if (r4 != 0) goto L_0x0039
            java.lang.String r14 = "respSearchDevice() returnMsg to num == 0!"
            com.rp.rptool.util.c0.a(r6, r3, r14)
            android.os.Handler r14 = r13.t
            r14.sendEmptyMessage(r6)
            return
        L_0x0039:
            r12 = -1
            com.rp.rptool.util.b0 r4 = new com.rp.rptool.util.b0
            byte[] r5 = r14.a()
            r4.<init>(r5, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "respSearchDevice() info = "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.rp.rptool.util.c0.a(r2, r3, r5)
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            byte[] r7 = r4.f925a     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            r5.<init>(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.lang.String r5 = r5.trim()     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            r7.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            java.lang.String r8 = "******* uid = "
            r7.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            r7.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            java.lang.String r7 = r7.toString()     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            com.rp.rptool.util.c0.a(r2, r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            goto L_0x0083
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r5 = r1
        L_0x007b:
            r7.printStackTrace()
            java.lang.String r7 = "respSearchDevice() uid 2 String error!"
            com.rp.rptool.util.c0.a(r6, r3, r7)
        L_0x0083:
            r8 = r5
            if (r8 == 0) goto L_0x0140
            boolean r5 = r1.equals(r8)
            if (r5 == 0) goto L_0x008e
            goto L_0x0140
        L_0x008e:
            com.rp.rptool.util.d0 r5 = com.rp.rptool.util.d0.t()
            r5.j()
            com.rp.rptool.util.d0 r5 = com.rp.rptool.util.d0.t()
            r5.k()
            r13.N()
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            byte[] r4 = r4.f926b     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r5.<init>(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r0 = r5.trim()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r11 = r0
            goto L_0x00b6
        L_0x00ac:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = "respSearchDevice() ip 2 String error!"
            com.rp.rptool.util.c0.a(r2, r3, r0)
            r11 = r1
        L_0x00b6:
            b.b.e.a.c r0 = new b.b.e.a.c
            r10 = -1
            java.lang.String r9 = "12345"
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            com.rp.rptool.util.d0 r4 = com.rp.rptool.util.d0.t()
            r4.P(r0)
            java.lang.String r4 = r0.l()
            b.c.a.a.c.a r4 = b.c.a.a.d.b.j(r4)
            if (r4 == 0) goto L_0x0111
            java.lang.String r5 = r4.a()
            java.lang.String r7 = r13.f
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00ec
            java.lang.String r5 = "XML OPTION MODIFY SSID!"
            com.rp.rptool.util.c0.a(r2, r3, r5)
            java.lang.String r5 = r0.l()
            java.lang.String r7 = r13.f
            java.lang.String r8 = "ssid"
            b.c.a.a.d.b.w(r5, r8, r7)
        L_0x00ec:
            java.lang.String r4 = r4.b()
            java.lang.String r5 = r13.g
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = r13.g
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "XML OPTION MODIFY SSIDPWD!"
            com.rp.rptool.util.c0.a(r2, r3, r1)
            java.lang.String r0 = r0.l()
            java.lang.String r1 = r13.g
            java.lang.String r2 = "ssidpwd"
            b.c.a.a.d.b.w(r0, r2, r1)
            goto L_0x0126
        L_0x0111:
            java.lang.String r4 = "XML OPTION SAVED DEVICE !"
            com.rp.rptool.util.c0.a(r2, r3, r4)
            b.c.a.a.c.a r2 = new b.c.a.a.c.a
            java.lang.String r0 = r0.l()
            java.lang.String r3 = r13.f
            java.lang.String r4 = r13.g
            r2.<init>(r0, r3, r4, r1)
            b.c.a.a.d.b.a(r2)
        L_0x0126:
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            int r14 = r14.d()
            r0.r(r14)
            r13.G()
            android.os.Handler r14 = r13.t
            r0 = 30000(0x7530, double:1.4822E-319)
            r14.sendEmptyMessageDelayed(r6, r0)
            return
        L_0x0140:
            java.lang.String r14 = "respSearchDevice() uid null error!"
            com.rp.rptool.util.c0.a(r6, r3, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.X1WiFiSelectActivity.b0(b.b.e.a.b):void");
    }

    /* access modifiers changed from: private */
    public void c0() {
        c0.a(0, "X1WiFiSelectActivity", "searchAndConnect()");
        if (this.t.hasMessages(2)) {
            this.t.removeMessages(2);
        }
        if (!this.o) {
            this.o = true;
        }
        String str = this.f;
        if (str == null || "".equals(str)) {
            this.f = e0.o().m(this);
            this.g = "";
        }
        d0.t().B();
        d0.t().N(this.r);
        this.t.sendEmptyMessageDelayed(2, 1000);
        this.t.sendEmptyMessageDelayed(3, 30000);
    }

    private void d0(String str, String str2) {
        c0.a(0, "X1WiFiSelectActivity", "sendConnectDevice()");
        d0.t().H(str, str2);
    }

    private void e0(String str) {
        c0.a(0, "X1WiFiSelectActivity", "showOffLineEnterDialog()");
        if (this.q == null) {
            this.q = new com.xforce.v5.xdvpro.widget.e(this, R.style.confirm_dialog);
        }
        this.q.show();
        com.xforce.v5.xdvpro.widget.e eVar = this.q;
        eVar.d(str + getResources().getString(R.string.not_online_sure_offline_enter));
        this.q.e(new a(str));
    }

    private void f0(b.c.a.a.c.b bVar) {
        if (this.h == null) {
            this.h = new com.xforce.v5.xdvpro.widget.m(this, R.style.confirm_dialog);
        }
        this.h.show();
        this.h.g(bVar.b());
        if (!bVar.c().equals("")) {
            this.h.h(bVar.c());
        }
        this.h.f(new c());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"StringFormatInvalid"})
    public void g0() {
        c0.a(0, "X1WiFiSelectActivity", "showWaittingConWiFiDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.s;
        if (fVar == null || !fVar.isShowing()) {
            if (this.s == null) {
                this.s = new com.xforce.v5.xdvpro.widget.f(this, R.style.confirm_dialog);
            }
            this.s.show();
            this.s.d(true);
            this.s.setCancelable(false);
            this.s.c(String.format(getResources().getString(R.string.connectting_wifi), new Object[]{""}));
        }
    }

    private void h0(String str) {
        if (this.i == null) {
            this.i = new com.xforce.v5.xdvpro.widget.e(this, R.style.confirm_dialog, true);
        }
        if (!this.i.isShowing() || str == null || !str.equals(this.i.a())) {
            this.i.show();
            this.i.setCancelable(false);
            this.i.d(str);
            this.i.e(new m());
        }
    }

    private void i0() {
        this.n = true;
        this.t.sendEmptyMessage(0);
    }

    private void j0() {
        this.n = false;
        if (this.t.hasMessages(0)) {
            this.t.removeMessages(0);
        }
    }

    private void k0() {
        c0.a(0, "X1WiFiSelectActivity", "syncTimetoDev()");
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(11);
        int i3 = instance.get(12);
        int i4 = instance.get(13);
        int i5 = instance.get(1);
        int i6 = instance.get(2) + 1;
        int i7 = instance.get(5);
        c0.a(0, "X1WiFiSelectActivity", "syncTimetoDev() msg = " + (i5 + " ," + i6 + " ," + i7 + " ," + i2 + " ," + i3 + " ," + i4));
        T(new b.b.e.a.a(d0.t().p().g(), 1599, y.a(i5, i6, i7, i2, i3, i4), y.b()));
    }

    public boolean Q(Context context) {
        return ((LocationManager) context.getSystemService("location")).isProviderEnabled("gps");
    }

    public void W(Context context) {
        new AlertDialog.Builder(this).setTitle(R.string.tips).setMessage(R.string.gpsNotifyMsg).setNegativeButton(R.string.cancel, new g()).setPositiveButton(R.string.main_setting, new f()).setCancelable(false).show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifiselect);
        V();
        U();
        K();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        com.xforce.v5.xdvpro.widget.m mVar = this.h;
        if (mVar != null && mVar.isShowing()) {
            this.h.dismiss();
            this.h = null;
        }
        com.xforce.v5.xdvpro.widget.e eVar = this.i;
        if (eVar != null && eVar.isShowing()) {
            this.i.dismiss();
            this.i = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        H();
        e0.o().p(this, this.m);
        i0();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        n.c();
        j0();
        e0.o().k();
        super.onStop();
    }
}
