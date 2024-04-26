package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.e0;
import com.rp.rptool.util.y;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity;
import com.xforce.v5.xdvpro.widget.m;
import com.xforce.v5.xdvpro.widget.n;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

@SuppressLint({"NewApi"})
public class X1NewWiFiSelectActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f1024a = true;

    /* renamed from: b  reason: collision with root package name */
    final long[] f1025b = new long[4];
    private String c;
    private String d;
    private m e;
    /* access modifiers changed from: private */
    public com.xforce.v5.xdvpro.widget.e f;
    private Button g;
    private TextView h;
    /* access modifiers changed from: private */
    public TextView i;
    private Button j;
    private Button k;
    /* access modifiers changed from: private */
    public int l = 10;
    /* access modifiers changed from: private */
    public boolean m = false;
    private boolean n = false;
    /* access modifiers changed from: private */
    public int o;
    d0.e p = new a();
    private com.xforce.v5.xdvpro.widget.f q;
    /* access modifiers changed from: private */
    public Handler r = new b();

    class a implements d0.e {
        a() {
        }

        public void a(b.b.e.a.b bVar) {
            int b2 = bVar.b();
            if (b2 == 12289) {
                X1NewWiFiSelectActivity.this.L(bVar);
            } else if (b2 == 12290) {
                X1NewWiFiSelectActivity.this.K(bVar);
            } else if (b2 == 12322) {
                X1NewWiFiSelectActivity.this.M(bVar);
            }
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                String m = e0.o().m(X1NewWiFiSelectActivity.this);
                TextView k = X1NewWiFiSelectActivity.this.i;
                k.setText(Html.fromHtml("<u>" + m + "</u>"));
                if (X1NewWiFiSelectActivity.this.m) {
                    X1NewWiFiSelectActivity.this.r.sendEmptyMessageDelayed(0, 1500);
                }
            } else if (i == 1) {
                d0.t().J((b.b.e.a.a) message.obj);
            } else if (i == 2) {
                d0.t().K();
            } else if (i == 3) {
                X1NewWiFiSelectActivity.this.w();
            } else if (i == 136) {
                X1NewWiFiSelectActivity.this.u();
                X1NewWiFiSelectActivity.this.y();
            } else if (i == 153) {
                X1NewWiFiSelectActivity.this.A();
            } else if (i == 161) {
                X1NewWiFiSelectActivity.this.z();
                X1NewWiFiSelectActivity.this.B();
            } else if (i != 256) {
                if (i == 1002) {
                    int unused = X1NewWiFiSelectActivity.this.o = 0;
                }
            } else if (!X1NewWiFiSelectActivity.this.E()) {
                X1NewWiFiSelectActivity.this.r.sendEmptyMessageDelayed(256, 1000);
            }
        }
    }

    class c implements Runnable {
        c(X1NewWiFiSelectActivity x1NewWiFiSelectActivity) {
        }

        public void run() {
            File file = new File(b.c.a.a.d.b.f865a);
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    if (file2.getName().contains("zh-") || file2.getName().equals("setting_keys.xml")) {
                        file2.delete();
                    }
                }
            }
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            X1NewWiFiSelectActivity x1NewWiFiSelectActivity = X1NewWiFiSelectActivity.this;
            x1NewWiFiSelectActivity.startActivityForResult(intent, x1NewWiFiSelectActivity.l);
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            X1NewWiFiSelectActivity.this.finish();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            long[] jArr = X1NewWiFiSelectActivity.this.f1025b;
            System.arraycopy(jArr, 1, jArr, 0, jArr.length - 1);
            long[] jArr2 = X1NewWiFiSelectActivity.this.f1025b;
            jArr2[jArr2.length - 1] = SystemClock.uptimeMillis();
            if (SystemClock.uptimeMillis() - X1NewWiFiSelectActivity.this.f1025b[0] <= 500) {
                c0.a(0, "X1WiFiSelectActivity", "点击了4次啦");
                n.g(X1NewWiFiSelectActivity.this, "可以连接TP机器啦");
                boolean unused = X1NewWiFiSelectActivity.this.f1024a = true;
            }
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        public void onClick(View view) {
            d0.t().i();
            X1NewWiFiSelectActivity.this.finish();
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            c0.a(0, "X1WiFiSelectActivity", "onclick btn_Shoot");
            X1NewWiFiSelectActivity.this.P();
            X1NewWiFiSelectActivity.this.N();
        }
    }

    class i implements View.OnClickListener {
        i() {
        }

        public void onClick(View view) {
            c0.a(0, "X1WiFiSelectActivity", "onclick btn_media");
            X1NewWiFiSelectActivity.this.C("A5H9X6ZEXT86GJKL111A");
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        public void onClick(View view) {
            X1NewWiFiSelectActivity.this.f.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void A() {
        d0.t().m(this, "http://192.168.10.1:8082/usr/share/minigui/res/lang/setting_keys.xml");
        d0.t().A(this, "http://192.168.10.1:8082/usr/share/minigui/res/lang");
        d0.t().z("http://192.168.10.1:8082/tmp/data/.data/sqlite/sunxi.db", b.c.a.a.d.b.f865a);
        this.r.sendEmptyMessageDelayed(256, 2000);
    }

    /* access modifiers changed from: private */
    public void B() {
        Intent intent;
        c0.a(0, "X1WiFiSelectActivity", "enterMainView()");
        b.c.a.a.d.b.p = false;
        u();
        T();
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
    public void C(String str) {
        c0.a(0, "X1WiFiSelectActivity", "enterOfflineMode()");
        b.c.a.a.d.b.p = true;
        d0.t().P(new b.b.e.a.c(str, "", -1, "", -1));
        u();
        startActivity(new Intent(this, XFTPMainFragmentActivity.class));
        finish();
    }

    /* access modifiers changed from: private */
    public boolean E() {
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
        if (this.r.hasMessages(256)) {
            this.r.removeMessages(256);
        }
        J();
        return true;
    }

    private void F(b.b.e.a.a aVar) {
        c0.a(0, "X1WiFiSelectActivity", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "X1WiFiSelectActivity", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "X1WiFiSelectActivity", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.r.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 1;
        this.r.sendMessage(obtainMessage);
    }

    private void G() {
        c0.a(0, "X1WiFiSelectActivity", "initDatas");
    }

    private void H() {
        c0.a(0, "X1WiFiSelectActivity", "initViews");
        TextView textView = (TextView) findViewById(R.id.tv_curssid);
        this.i = textView;
        textView.setText("");
        TextView textView2 = (TextView) findViewById(R.id.tv_title);
        this.h = textView2;
        textView2.setOnClickListener(new f());
        Button button = (Button) findViewById(R.id.back_btn);
        this.g = button;
        button.setOnClickListener(new g());
        Button button2 = (Button) findViewById(R.id.btn_shoot);
        this.j = button2;
        button2.setOnClickListener(new h());
        Button button3 = (Button) findViewById(R.id.btn_media);
        this.k = button3;
        button3.setOnClickListener(new i());
    }

    private void J() {
        c0.a(0, "X1WiFiSelectActivity", "ealen test 配置文件已下载完毕，准备连接");
        b.b.e.a.c p2 = d0.t().p();
        O(p2.l(), p2.d());
    }

    /* access modifiers changed from: private */
    public void K(b.b.e.a.b bVar) {
        c0.a(0, "X1WiFiSelectActivity", "respConnectDevFail() rtnMsg = " + bVar);
        if (this.n) {
            d0.t().p().r(bVar.d());
            this.r.sendEmptyMessage(3);
        }
    }

    /* access modifiers changed from: private */
    public void L(b.b.e.a.b bVar) {
        c0.a(0, "X1WiFiSelectActivity", "respConnectDevSuccess() rtnMsg = " + bVar);
        if (this.n) {
            if (this.r.hasMessages(3)) {
                this.r.removeMessages(3);
            }
            if (this.r.hasMessages(161)) {
                this.r.removeMessages(161);
            }
            this.n = false;
            if (d0.t().g()) {
                b.b.d.b.e().s(this);
            } else if (d0.t().h() || this.f1024a) {
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
                z();
                n.h(this, "device error, please try again!", 1);
                return;
            }
            this.r.sendEmptyMessage(161);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(b.b.e.a.b r14) {
        /*
            r13 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = "X1WiFiSelectActivity"
            java.lang.String r4 = "respSearchDevice() "
            com.rp.rptool.util.c0.a(r2, r3, r4)
            boolean r4 = r13.n
            if (r4 != 0) goto L_0x0011
            return
        L_0x0011:
            int r4 = r14.d()
            r5 = -1
            r6 = 3
            if (r4 > r5) goto L_0x0023
            java.lang.String r4 = "respSearchDevice() overtime!"
            com.rp.rptool.util.c0.a(r2, r3, r4)
            android.os.Handler r4 = r13.r
            r4.sendEmptyMessage(r6)
        L_0x0023:
            int r4 = r14.c()
            int r5 = com.rp.rptool.util.b0.a()
            int r4 = r4 / r5
            if (r4 != 0) goto L_0x0039
            java.lang.String r14 = "respSearchDevice() returnMsg to num == 0!"
            com.rp.rptool.util.c0.a(r6, r3, r14)
            android.os.Handler r14 = r13.r
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
            r13.A()
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
            java.lang.String r7 = r13.c
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00ec
            java.lang.String r5 = "XML OPTION MODIFY SSID!"
            com.rp.rptool.util.c0.a(r2, r3, r5)
            java.lang.String r5 = r0.l()
            java.lang.String r7 = r13.c
            java.lang.String r8 = "ssid"
            b.c.a.a.d.b.w(r5, r8, r7)
        L_0x00ec:
            java.lang.String r4 = r4.b()
            java.lang.String r5 = r13.d
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = r13.d
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "XML OPTION MODIFY SSIDPWD!"
            com.rp.rptool.util.c0.a(r2, r3, r1)
            java.lang.String r0 = r0.l()
            java.lang.String r1 = r13.d
            java.lang.String r2 = "ssidpwd"
            b.c.a.a.d.b.w(r0, r2, r1)
            goto L_0x0126
        L_0x0111:
            java.lang.String r4 = "XML OPTION SAVED DEVICE !"
            com.rp.rptool.util.c0.a(r2, r3, r4)
            b.c.a.a.c.a r2 = new b.c.a.a.c.a
            java.lang.String r0 = r0.l()
            java.lang.String r3 = r13.c
            java.lang.String r4 = r13.d
            r2.<init>(r0, r3, r4, r1)
            b.c.a.a.d.b.a(r2)
        L_0x0126:
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            int r14 = r14.d()
            r0.r(r14)
            r13.u()
            android.os.Handler r14 = r13.r
            r0 = 30000(0x7530, double:1.4822E-319)
            r14.sendEmptyMessageDelayed(r6, r0)
            return
        L_0x0140:
            java.lang.String r14 = "respSearchDevice() uid null error!"
            com.rp.rptool.util.c0.a(r6, r3, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.X1NewWiFiSelectActivity.M(b.b.e.a.b):void");
    }

    /* access modifiers changed from: private */
    public void N() {
        c0.a(0, "X1WiFiSelectActivity", "searchAndConnect()");
        if (this.r.hasMessages(2)) {
            this.r.removeMessages(2);
        }
        if (!this.n) {
            this.n = true;
        }
        String str = this.c;
        if (str == null || "".equals(str)) {
            this.c = e0.o().m(this);
            this.d = "";
        }
        d0.t().B();
        d0.t().N(this.p);
        this.r.sendEmptyMessageDelayed(2, 1000);
        this.r.sendEmptyMessageDelayed(3, 30000);
    }

    private void O(String str, String str2) {
        c0.a(0, "X1WiFiSelectActivity", "sendConnectDevice()");
        d0.t().H(str, str2);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"StringFormatInvalid"})
    public void P() {
        c0.a(0, "X1WiFiSelectActivity", "showWaittingConWiFiDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.q;
        if (fVar == null || !fVar.isShowing()) {
            if (this.q == null) {
                this.q = new com.xforce.v5.xdvpro.widget.f(this, R.style.confirm_dialog);
            }
            this.q.show();
            this.q.d(true);
            this.q.setCancelable(false);
            this.q.c(String.format(getResources().getString(R.string.connectting_wifi), new Object[]{""}));
        }
    }

    private void Q(String str) {
        if (this.f == null) {
            this.f = new com.xforce.v5.xdvpro.widget.e(this, R.style.confirm_dialog, true);
        }
        if (!this.f.isShowing() || str == null || !str.equals(this.f.a())) {
            this.f.show();
            this.f.setCancelable(false);
            this.f.d(str);
            this.f.e(new j());
        }
    }

    private void R() {
        this.m = true;
        this.r.sendEmptyMessage(0);
    }

    private void S() {
        this.m = false;
        if (this.r.hasMessages(0)) {
            this.r.removeMessages(0);
        }
    }

    private void T() {
        c0.a(0, "X1WiFiSelectActivity", "syncTimetoDev()");
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(11);
        int i3 = instance.get(12);
        int i4 = instance.get(13);
        int i5 = instance.get(1);
        int i6 = instance.get(2) + 1;
        int i7 = instance.get(5);
        c0.a(0, "X1WiFiSelectActivity", "syncTimetoDev() msg = " + (i5 + " ," + i6 + " ," + i7 + " ," + i2 + " ," + i3 + " ," + i4));
        F(new b.b.e.a.a(d0.t().p().g(), 1599, y.a(i5, i6, i7, i2, i3, i4), y.b()));
    }

    /* access modifiers changed from: private */
    public void u() {
        c0.a(0, "X1WiFiSelectActivity", "checkDirs()");
        b.c.a.a.d.b.t(this, getResources().getString(R.string.app_name), d0.t().p().l());
    }

    private void v() {
        if (Build.VERSION.SDK_INT >= 23) {
            c0.a(0, "X1WiFiSelectActivity", "Phone system version is higher or equal 6.0, systemVersion" + b.c.a.a.d.d.a());
            if (D(this)) {
                c0.a(0, "X1WiFiSelectActivity", "GPS已打开");
            } else {
                I(this);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"StringFormatInvalid"})
    public void w() {
        c0.a(0, "X1WiFiSelectActivity", "connectOverTm()");
        this.n = false;
        if (this.r.hasMessages(3)) {
            this.r.removeMessages(3);
        }
        if (this.r.hasMessages(256)) {
            this.r.removeMessages(256);
        }
        z();
        String string = getResources().getString(R.string.connect_wifi_overtime);
        Q("WiFi " + string);
    }

    private void x() {
        new Thread(new c(this)).start();
    }

    /* access modifiers changed from: private */
    public void y() {
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
    public void z() {
        c0.a(0, "X1WiFiSelectActivity", "dismissWaittingConWiFiDialog()");
        com.xforce.v5.xdvpro.widget.f fVar = this.q;
        if (fVar != null && fVar.isShowing()) {
            this.q.dismiss();
        }
    }

    public boolean D(Context context) {
        return ((LocationManager) context.getSystemService("location")).isProviderEnabled("gps");
    }

    public void I(Context context) {
        new AlertDialog.Builder(this).setTitle(R.string.tips).setMessage(R.string.gpsNotifyMsg).setNegativeButton(R.string.cancel, new e()).setPositiveButton(R.string.main_setting, new d()).setCancelable(false).show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_newwifiselect);
        H();
        G();
        x();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m mVar = this.e;
        if (mVar != null && mVar.isShowing()) {
            this.e.dismiss();
            this.e = null;
        }
        com.xforce.v5.xdvpro.widget.e eVar = this.f;
        if (eVar != null && eVar.isShowing()) {
            this.f.dismiss();
            this.f = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        v();
        R();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        n.c();
        S();
        e0.o().k();
        super.onStop();
    }
}
