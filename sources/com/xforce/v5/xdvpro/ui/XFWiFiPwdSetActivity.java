package com.xforce.v5.xdvpro.ui;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import b.c.a.a.d.c;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.e0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.f;
import com.xforce.v5.xdvpro.widget.o;
import java.util.regex.Pattern;

public class XFWiFiPwdSetActivity extends Activity implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Button f1107a;

    /* renamed from: b  reason: collision with root package name */
    private EditText f1108b;
    private EditText c;
    private EditText d;
    private EditText e;
    private Button f;
    private f g;
    private Handler h = new a();
    private c i;

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                d0.t().J((b.b.e.a.a) message.obj);
            } else if (i == 1) {
                XFWiFiPwdSetActivity.this.d();
                ((WifiManager) XFWiFiPwdSetActivity.this.getApplicationContext().getSystemService("wifi")).disconnect();
                XFWiFiPwdSetActivity.this.setResult(1002);
                XFWiFiPwdSetActivity.this.finish();
            }
        }
    }

    class b implements c.b {
        b(XFWiFiPwdSetActivity xFWiFiPwdSetActivity) {
        }

        public void a() {
            b.c.a.a.d.b.z(0);
        }

        public void b() {
        }
    }

    private boolean b() {
        c0.a(0, "XFWiFiPwdSetActivity", "checkEnters()");
        String c2 = c(this.f1108b);
        if (!"".equals(c2)) {
            o.g(this, getResources().getString(R.string.device_id) + c2, false);
            this.d.setFocusable(true);
            return false;
        }
        String trim = this.c.getText().toString().trim();
        b.c.a.a.c.a j = b.c.a.a.d.b.j(d0.t().p().l());
        if (j.b().equals(trim) || "".equals(j.b())) {
            String c3 = c(this.d);
            if (!"".equals(c3)) {
                o.g(this, getResources().getString(R.string.new_password) + c3, false);
                this.d.setFocusable(true);
                return false;
            } else if (this.d.getText().toString().trim().equals(this.e.getText().toString().trim())) {
                return true;
            } else {
                o.g(this, getResources().getString(R.string.wifi_not_equal), false);
                this.e.setFocusable(true);
                return false;
            }
        } else {
            o.g(this, getResources().getString(R.string.wifi_oldwifi_error), false);
            return false;
        }
    }

    private String c(EditText editText) {
        String trim = editText.getText().toString().trim();
        if (!"".equals(trim)) {
            return (8 > trim.length() || 16 < trim.length() || !Pattern.compile("[A-Z,a-z,0-9,_,-]*").matcher(trim).matches()) ? getResources().getString(R.string.wifi_wrong_regx) : "";
        }
        String string = getResources().getString(R.string.wifi_is_null);
        editText.setFocusable(true);
        return string;
    }

    /* access modifiers changed from: private */
    public void d() {
        c0.a(0, "XFWiFiPwdSetActivity", "dismissDeleteLoadingView()");
        f fVar = this.g;
        if (fVar != null && fVar.isShowing()) {
            this.g.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
            r7 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            java.lang.String r2 = "XFWiFiPwdSetActivity"
            java.lang.String r3 = "handleConfirmWiFiSet()"
            com.rp.rptool.util.c0.a(r1, r2, r3)
            boolean r1 = r7.b()
            if (r1 == 0) goto L_0x00aa
            android.widget.EditText r1 = r7.f1108b
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            android.widget.EditText r3 = r7.c
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            android.widget.EditText r4 = r7.d
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            r5 = 0
            byte[] r6 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            byte[] r3 = r3.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            byte[] r5 = r4.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r0 = move-exception
            goto L_0x0050
        L_0x004a:
            r0 = move-exception
            r3 = r5
            goto L_0x0050
        L_0x004d:
            r0 = move-exception
            r3 = r5
            r6 = r3
        L_0x0050:
            r0.printStackTrace()
        L_0x0053:
            if (r6 == 0) goto L_0x00a4
            if (r3 == 0) goto L_0x00a4
            if (r5 != 0) goto L_0x005a
            goto L_0x00a4
        L_0x005a:
            b.b.e.a.a r0 = new b.b.e.a.a
            com.rp.rptool.util.d0 r2 = com.rp.rptool.util.d0.t()
            int r2 = r2.q()
            r4 = 1832(0x728, float:2.567E-42)
            byte[] r3 = com.rp.rptool.util.q.a(r6, r3, r5)
            int r5 = com.rp.rptool.util.q.b()
            r0.<init>(r2, r4, r3, r5)
            r7.f(r0)
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            java.lang.String r0 = r0.l()
            java.lang.String r2 = "ssidpwd"
            java.lang.String r3 = ""
            b.c.a.a.d.b.w(r0, r2, r3)
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            java.lang.String r0 = r0.l()
            java.lang.String r2 = "ssid"
            b.c.a.a.d.b.w(r0, r2, r1)
            r7.h()
            android.os.Handler r0 = r7.h
            r1 = 1
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.sendEmptyMessageDelayed(r1, r2)
            goto L_0x00aa
        L_0x00a4:
            r0 = 3
            java.lang.String r1 = "handleConfirmWiFiSet() ssid oldPwd newPwd == null!"
            com.rp.rptool.util.c0.a(r0, r2, r1)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.XFWiFiPwdSetActivity.e():void");
    }

    private void f(b.b.e.a.a aVar) {
        c0.a(0, "XFWiFiPwdSetActivity", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "XFWiFiPwdSetActivity", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "XFWiFiPwdSetActivity", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.h.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 0;
        this.h.sendMessage(obtainMessage);
    }

    private void g() {
        c cVar = new c(this);
        this.i = cVar;
        cVar.b(new b(this));
        this.i.c();
    }

    private void h() {
        c0.a(0, "XFWiFiPwdSetActivity", "showLoadingView()");
        if (this.g == null) {
            this.g = new f(this, R.style.confirm_dialog);
        }
        this.g.show();
        this.g.d(true);
        this.g.setCancelable(false);
        this.g.c(getResources().getString(R.string.wifi_setting_wifi));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_btn) {
            finish();
        } else if (id == R.id.wifi_confirm) {
            e();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifipwdset_tp);
        Button button = (Button) findViewById(R.id.back_btn);
        this.f1107a = button;
        button.setOnClickListener(this);
        this.f1108b = (EditText) findViewById(R.id.wifi_dev);
        this.c = (EditText) findViewById(R.id.wifi_old_pwd);
        this.d = (EditText) findViewById(R.id.wifi_new_pwd);
        this.e = (EditText) findViewById(R.id.wifi_confirm_pwd);
        Button button2 = (Button) findViewById(R.id.wifi_confirm);
        this.f = button2;
        button2.setOnClickListener(this);
        if (d0.t().p() != null) {
            this.f1108b.setText(e0.o().m(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        g();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.i.d();
    }
}
