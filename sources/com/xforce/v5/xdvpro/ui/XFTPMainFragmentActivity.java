package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.Process;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c.a.a.d.c;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.h;
import com.xforce.v5.xdvpro.widget.i;
import com.xforce.v5.xdvpro.widget.o;
import java.util.ArrayList;

public class XFTPMainFragmentActivity extends android.support.v4.app.f implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    public static String K;
    private com.xforce.v5.xdvpro.widget.c A;
    KeyguardManager.KeyguardLock B;
    /* access modifiers changed from: private */
    public int C = 0;
    private boolean D = false;
    /* access modifiers changed from: private */
    public i E;
    private View.OnClickListener F = new b();
    private f G;
    /* access modifiers changed from: private */
    public Handler H = new c();
    private d0.e I = new d();
    private b.c.a.a.d.c J;
    public int l = 1;
    private OrientationEventListener m;
    private ViewPager n;
    private h o;
    private ArrayList<android.support.v4.app.e> p;
    private k q;
    private n r;
    private m s;
    private RelativeLayout t;
    private RelativeLayout u;
    private TextView v;
    private TextView w;
    private Button x;
    private Button y;
    private Button z;

    class a extends OrientationEventListener {
        a(Context context) {
            super(context);
        }

        public void onOrientationChanged(int i) {
            if (b.c.a.a.d.b.q) {
                if ((i >= 0 && i <= 30) || i >= 330) {
                    XFTPMainFragmentActivity.this.setRequestedOrientation(1);
                }
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            if (XFTPMainFragmentActivity.this.E != null && XFTPMainFragmentActivity.this.E.isShowing()) {
                XFTPMainFragmentActivity.this.E.dismiss();
            }
            XFTPMainFragmentActivity.this.R();
        }
    }

    class c extends Handler {
        c() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                XFTPMainFragmentActivity.this.v();
            } else if (i == 1) {
                int unused = XFTPMainFragmentActivity.this.C = 0;
            } else if (i == 40961) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    class d implements d0.e {
        d() {
        }

        public void a(b.b.e.a.b bVar) {
            c0.a(0, "XFTPMainFragmentActivity", "handleUNToolCallback() type = " + bVar.b());
            XFTPMainFragmentActivity.this.p(bVar);
        }
    }

    class e implements c.b {
        e(XFTPMainFragmentActivity xFTPMainFragmentActivity) {
        }

        public void a() {
            b.c.a.a.d.b.z(0);
        }

        public void b() {
        }
    }

    public class f extends BroadcastReceiver {
        public f() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                c0.a(0, "XFTPMainFragmentActivity", "state_change");
                XFTPMainFragmentActivity.this.H.sendEmptyMessage(0);
            }
        }
    }

    private void E() {
        c0.a(0, "XFTPMainFragmentActivity", "initView");
        this.n = (ViewPager) findViewById(R.id.main_viewpager);
        this.r = new n();
        this.q = new k();
        this.s = new m();
        ArrayList<android.support.v4.app.e> arrayList = new ArrayList<>();
        this.p = arrayList;
        arrayList.add(this.q);
        this.p.add(this.r);
        this.p.add(this.s);
        this.n.setOffscreenPageLimit(3);
        h hVar = new h(g(), this.p);
        this.o = hVar;
        this.n.setAdapter(hVar);
        this.n.setCurrentItem(1);
        this.t = (RelativeLayout) findViewById(R.id.main_tap_top_view);
        this.x = (Button) findViewById(R.id.main_tap_top_back);
        this.v = (TextView) findViewById(R.id.main_tap_top_tips);
        this.u = (RelativeLayout) findViewById(R.id.main_tap_bottom_view);
        Button button = (Button) findViewById(R.id.main_tap_bottom_choose);
        this.y = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.main_tap_bottom_confirm);
        this.z = button2;
        button2.setOnClickListener(this);
        this.w = (TextView) findViewById(R.id.main_tap_bottom_tips);
        this.x.setOnClickListener(this);
    }

    private void F() {
        if (!b.c.a.a.d.b.p) {
            b.c.a.a.d.c cVar = new b.c.a.a.d.c(this);
            this.J = cVar;
            cVar.b(new e(this));
            this.J.c();
        }
    }

    private void G() {
        c0.a(0, "XFTPMainFragmentActivity", "registerWiFiConnectReceiver()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.G == null) {
            K = b.c.a.a.d.b.h(this);
            this.G = new f();
        }
        registerReceiver(this.G, intentFilter);
    }

    private void O() {
        setRequestedOrientation(1);
        a aVar = new a(this);
        this.m = aVar;
        aVar.enable();
    }

    /* access modifiers changed from: private */
    public void p(b.b.e.a.b bVar) {
        c0.a(0, "XFTPMainFragmentActivity", "RefreshUICallBack rtnMsg = " + bVar);
        k kVar = this.q;
        if (kVar != null && this.l == 0) {
            kVar.z1(bVar);
        }
        n nVar = this.r;
        if (nVar != null && this.l == 1) {
            nVar.F2(bVar);
        }
        m mVar = this.s;
        if (mVar != null && this.l == 2) {
            mVar.W1(bVar);
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        c0.a(0, "XFTPMainFragmentActivity", "checkNetWordChanged()");
        if (!b.c.a.a.d.b.p) {
            if (!K.equals(b.c.a.a.d.b.h(this))) {
                N();
                this.r.a2();
            }
        }
    }

    private void y() {
        c0.a(0, "XFTPMainFragmentActivity", "enterBackgroundView()");
        b.c.a.a.d.b.z(0);
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
    }

    public void A() {
        if (n.Z0) {
            this.l = 0;
            this.n.setCurrentItem(0);
        }
    }

    public void B(int i, int[] iArr) {
        this.s.e2(i, iArr);
        this.l = 2;
        this.n.setCurrentItem(2);
    }

    public void C() {
        this.l = 1;
        this.n.setCurrentItem(1);
        this.r.g3();
    }

    public void D() {
        startActivity(new Intent(this, X1NewWiFiSelectActivity.class));
        finish();
    }

    public void H(String str) {
        this.y.setText(str);
    }

    public void I(String str) {
        this.v.setText(str);
    }

    @SuppressLint({"StringFormatInvalid"})
    public void J(int i) {
        c0.a(0, "XFTPMainFragmentActivity", "setTapsBottomTips(" + i + ")");
        this.w.setText(String.format(getResources().getString(R.string.main_has_select), new Object[]{Integer.valueOf(i)}));
    }

    public void K(int i, boolean z2) {
        Resources resources;
        int i2;
        c0.a(0, "XFTPMainFragmentActivity", "setTapsBottomTips(" + i + "," + z2 + ")");
        J(i);
        this.D = z2;
        Button button = this.y;
        if (z2) {
            resources = getResources();
            i2 = R.string.main_choose_none;
        } else {
            resources = getResources();
            i2 = R.string.main_choose_all;
        }
        button.setText(resources.getString(i2));
    }

    public void L(com.xforce.v5.xdvpro.widget.c cVar) {
        this.A = cVar;
    }

    public void M() {
        c0.a(0, "XFTPMainFragmentActivity", "showAllTaps()");
        this.D = false;
        if (this.t.getVisibility() != 0) {
            this.t.setVisibility(0);
            this.t.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_from_top));
        }
        if (this.u.getVisibility() != 0) {
            this.u.setVisibility(0);
            this.u.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_from_bottom));
        }
    }

    public void N() {
        c0.a(0, "XFTPMainFragmentActivity", "showWiFiChangeDialog()");
        if (!m.u0) {
            if (this.E == null) {
                this.E = new i(this, R.style.confirm_dialog);
            }
            if (!this.E.isShowing()) {
                this.E.show();
                this.E.setCancelable(false);
                this.E.c(this.F);
            }
        }
    }

    public void P() {
        int i;
        Resources resources;
        Button button;
        c0.a(0, "XFTPMainFragmentActivity", "tapChooseBtnClick()");
        if (this.D) {
            com.xforce.v5.xdvpro.widget.c cVar = this.A;
            if (cVar != null) {
                this.D = false;
                cVar.a();
                button = this.y;
                resources = getResources();
                i = R.string.main_choose_all;
            } else {
                return;
            }
        } else {
            com.xforce.v5.xdvpro.widget.c cVar2 = this.A;
            if (cVar2 != null) {
                this.D = true;
                cVar2.c();
                button = this.y;
                resources = getResources();
                i = R.string.main_choose_none;
            } else {
                return;
            }
        }
        button.setText(resources.getString(i));
    }

    public void Q() {
        c0.a(0, "XFTPMainFragmentActivity", "tapConfirmBtnClick()");
        com.xforce.v5.xdvpro.widget.c cVar = this.A;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void R() {
        c0.a(0, "XFTPMainFragmentActivity", "totalExit()");
        this.B.reenableKeyguard();
        this.H.sendEmptyMessageDelayed(40961, 500);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r0.r.m3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r1.setCurrentItem(r2);
        r0.l = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCheckedChanged(android.widget.RadioGroup r1, int r2) {
        /*
            r0 = this;
            com.xforce.v5.xdvpro.widget.o.c()
            switch(r2) {
                case 2131230856: goto L_0x0027;
                case 2131230857: goto L_0x0010;
                case 2131230858: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x003d
        L_0x0007:
            android.support.v4.view.ViewPager r1 = r0.n
            r2 = 0
        L_0x000a:
            r1.setCurrentItem(r2)
            r0.l = r2
            goto L_0x003d
        L_0x0010:
            boolean r1 = com.xforce.v5.xdvpro.ui.g.k1
            if (r1 != 0) goto L_0x0021
            boolean r1 = com.xforce.v5.xdvpro.ui.g.l1
            if (r1 != 0) goto L_0x0021
            boolean r1 = com.xforce.v5.xdvpro.ui.g.j1
            if (r1 == 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            android.support.v4.view.ViewPager r1 = r0.n
            r2 = 2
            goto L_0x000a
        L_0x0021:
            com.xforce.v5.xdvpro.ui.n r1 = r0.r
            r1.m3()
            return
        L_0x0027:
            boolean r1 = com.xforce.v5.xdvpro.ui.g.k1
            if (r1 != 0) goto L_0x0021
            boolean r1 = com.xforce.v5.xdvpro.ui.g.l1
            if (r1 != 0) goto L_0x0021
            boolean r1 = com.xforce.v5.xdvpro.ui.g.j1
            if (r1 == 0) goto L_0x0034
            goto L_0x0021
        L_0x0034:
            com.xforce.v5.xdvpro.ui.k r1 = r0.q
            r1.p1()
            android.support.v4.view.ViewPager r1 = r0.n
            r2 = 1
            goto L_0x000a
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity.onCheckedChanged(android.widget.RadioGroup, int):void");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_tap_bottom_choose /*2131230861*/:
                P();
                return;
            case R.id.main_tap_bottom_confirm /*2131230862*/:
                Q();
                return;
            case R.id.main_tap_top_back /*2131230865*/:
                w();
                return;
            default:
                return;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        c0.a(0, "XFTPMainFragmentActivity", "CCGloabal.isInitDecvice ==" + b.c.a.a.d.b.q);
        o.c();
        int i = configuration.orientation;
        if (i == 2) {
            if (this.l == 0) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 1024;
                getWindow().setAttributes(attributes);
                getWindow().addFlags(512);
            }
        } else if (i == 1) {
            WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
            attributes2.flags &= -1025;
            getWindow().setAttributes(attributes2);
            getWindow().clearFlags(512);
        }
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c0.a(0, "XFTPMainFragmentActivity", "onCreate");
        requestWindowFeature(1);
        getWindow().setFlags(128, 128);
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435462, "SimpleTimer");
        newWakeLock.acquire();
        newWakeLock.release();
        KeyguardManager.KeyguardLock newKeyguardLock = ((KeyguardManager) getSystemService("keyguard")).newKeyguardLock("");
        this.B = newKeyguardLock;
        newKeyguardLock.disableKeyguard();
        setContentView(R.layout.activity_main_tp);
        E();
        O();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        c0.a(0, "XFTPMainFragmentActivity", "onDestroy");
        f fVar = this.G;
        if (fVar != null) {
            unregisterReceiver(fVar);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.r.w2()) {
            int i2 = this.C + 1;
            this.C = i2;
            if (i2 == 2) {
                if (this.H.hasMessages(1)) {
                    this.H.removeMessages(1);
                }
                this.C = 0;
            } else {
                o.g(this, getResources().getString(R.string.main_double_click_return_desktop), true);
                this.H.sendEmptyMessageDelayed(1, 1500);
                return false;
            }
        }
        y();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        c0.a(0, "XFTPMainFragmentActivity", "onResume");
        F();
        d0.t().N(this.I);
        G();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        c0.a(0, "XFTPMainFragmentActivity", "onStop");
        if (!b.c.a.a.d.b.p) {
            this.J.d();
        }
        super.onStop();
    }

    public void w() {
        c0.a(0, "XFTPMainFragmentActivity", "dismissAllTaps()");
        x();
        com.xforce.v5.xdvpro.widget.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void x() {
        c0.a(0, "XFTPMainFragmentActivity", "dismissTapsView()");
        if (this.t.getVisibility() == 0) {
            this.t.setVisibility(8);
            this.t.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_out_to_top));
        }
        if (this.u.getVisibility() == 0) {
            this.u.setVisibility(8);
            this.u.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_out_to_bottom));
        }
    }

    public void z() {
        if (g.i1) {
            this.l = 0;
            this.n.setCurrentItem(0);
            this.q.p1();
        }
        this.q.v1();
    }
}
