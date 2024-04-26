package com.xforce.v5.xdvpro.ui;

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
import android.widget.RadioButton;
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

public class X1MainFragmentActivity extends android.support.v4.app.f implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    private Button A;
    private Button B;
    private com.xforce.v5.xdvpro.widget.c C;
    KeyguardManager.KeyguardLock D;
    /* access modifiers changed from: private */
    public int E = 0;
    private boolean F = false;
    /* access modifiers changed from: private */
    public i G;
    private View.OnClickListener H = new b();
    private f I;
    private String J = "";
    /* access modifiers changed from: private */
    public Handler K = new c();
    private d0.e L = new d();
    private b.c.a.a.d.c M;
    private RadioGroup l;
    private RadioButton[] m;
    public int n = 0;
    private OrientationEventListener o;
    private ViewPager p;
    private h q;
    private ArrayList<android.support.v4.app.e> r;
    private g s;
    private b t;
    private f u;
    private RelativeLayout v;
    private RelativeLayout w;
    private TextView x;
    private TextView y;
    private Button z;

    class a extends OrientationEventListener {
        a(Context context) {
            super(context);
        }

        public void onOrientationChanged(int i) {
            X1MainFragmentActivity x1MainFragmentActivity;
            if (b.c.a.a.d.b.q) {
                int i2 = 1;
                if ((i >= 0 && i <= 30) || i >= 330) {
                    x1MainFragmentActivity = X1MainFragmentActivity.this;
                } else if (i >= 230 && i <= 310) {
                    x1MainFragmentActivity = X1MainFragmentActivity.this;
                    if (x1MainFragmentActivity.n == 0) {
                        i2 = 0;
                    }
                } else if (i < 100 && i > 80) {
                    x1MainFragmentActivity = X1MainFragmentActivity.this;
                    if (x1MainFragmentActivity.n == 0) {
                        i2 = 8;
                    }
                } else {
                    return;
                }
                x1MainFragmentActivity.setRequestedOrientation(i2);
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            if (X1MainFragmentActivity.this.G != null && X1MainFragmentActivity.this.G.isShowing()) {
                X1MainFragmentActivity.this.G.dismiss();
            }
            X1MainFragmentActivity.this.O();
        }
    }

    class c extends Handler {
        c() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                X1MainFragmentActivity.this.v();
            } else if (i == 1) {
                int unused = X1MainFragmentActivity.this.E = 0;
            } else if (i == 40961) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    class d implements d0.e {
        d() {
        }

        public void a(b.b.e.a.b bVar) {
            c0.a(0, "X1MainFragmentActivity", "handleUNToolCallback() type = " + bVar.b());
            Message obtainMessage = X1MainFragmentActivity.this.K.obtainMessage();
            obtainMessage.obj = bVar;
            obtainMessage.what = -1;
            bVar.b();
            int b2 = bVar.b();
            obtainMessage.what = b2;
            if (b2 != -1) {
                X1MainFragmentActivity.this.p(bVar);
            }
        }
    }

    class e implements c.b {
        e(X1MainFragmentActivity x1MainFragmentActivity) {
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
                c0.a(0, "X1MainFragmentActivity", "state_change");
                X1MainFragmentActivity.this.K.sendEmptyMessage(0);
            }
        }
    }

    private void B() {
        c0.a(0, "X1MainFragmentActivity", "initView");
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.main_radio);
        this.l = radioGroup;
        radioGroup.setOnCheckedChangeListener(this);
        this.m = new RadioButton[]{(RadioButton) findViewById(R.id.main_btnvideo), (RadioButton) findViewById(R.id.main_btnfile), (RadioButton) findViewById(R.id.main_btnsetting)};
        this.p = (ViewPager) findViewById(R.id.main_viewpager);
        this.s = new g();
        this.t = new b();
        this.u = new f();
        ArrayList<android.support.v4.app.e> arrayList = new ArrayList<>();
        this.r = arrayList;
        arrayList.add(this.s);
        this.r.add(this.t);
        this.r.add(this.u);
        this.p.setOffscreenPageLimit(3);
        h hVar = new h(g(), this.r);
        this.q = hVar;
        this.p.setAdapter(hVar);
        this.p.setCurrentItem(0);
        this.m[0].setChecked(true);
        this.v = (RelativeLayout) findViewById(R.id.main_tap_top_view);
        this.z = (Button) findViewById(R.id.main_tap_top_back);
        this.x = (TextView) findViewById(R.id.main_tap_top_tips);
        this.w = (RelativeLayout) findViewById(R.id.main_tap_bottom_view);
        Button button = (Button) findViewById(R.id.main_tap_bottom_choose);
        this.A = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.main_tap_bottom_confirm);
        this.B = button2;
        button2.setOnClickListener(this);
        this.y = (TextView) findViewById(R.id.main_tap_bottom_tips);
        this.z.setOnClickListener(this);
    }

    private void C() {
        if (!b.c.a.a.d.b.p) {
            b.c.a.a.d.c cVar = new b.c.a.a.d.c(this);
            this.M = cVar;
            cVar.b(new e(this));
            this.M.c();
        }
    }

    private void D() {
        c0.a(0, "X1MainFragmentActivity", "registerWiFiConnectReceiver()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.I == null) {
            this.J = b.c.a.a.d.b.h(this);
            this.I = new f();
        }
        registerReceiver(this.I, intentFilter);
    }

    private void L() {
        setRequestedOrientation(1);
        a aVar = new a(this);
        this.o = aVar;
        aVar.enable();
    }

    /* access modifiers changed from: private */
    public void p(b.b.e.a.b bVar) {
        c0.a(0, "X1MainFragmentActivity", "RefreshUICallBack rtnMsg = " + bVar);
        g gVar = this.s;
        if (gVar != null) {
            gVar.j2(bVar);
        }
        b bVar2 = this.t;
        if (bVar2 != null) {
            bVar2.z1(bVar);
        }
        f fVar = this.u;
        if (fVar != null) {
            fVar.O1(bVar);
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        c0.a(0, "X1MainFragmentActivity", "checkNetWordChanged()");
        if (!b.c.a.a.d.b.p) {
            if (!this.J.equals(b.c.a.a.d.b.h(this))) {
                K();
                this.s.J1();
            }
        }
    }

    private void y() {
        c0.a(0, "X1MainFragmentActivity", "enterBackgroundView()");
        b.c.a.a.d.b.z(0);
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
    }

    public void A() {
        if (g.i1) {
            this.n = 1;
            this.m[0].setChecked(false);
            this.m[1].setChecked(true);
            this.m[2].setChecked(false);
            this.p.setCurrentItem(1);
        }
    }

    public void E(String str) {
        this.A.setText(str);
    }

    public void F(String str) {
        this.x.setText(str);
    }

    public void G(int i) {
        c0.a(0, "X1MainFragmentActivity", "setTapsBottomTips(" + i + ")");
        this.y.setText(String.format(getResources().getString(R.string.main_has_select), new Object[]{Integer.valueOf(i)}));
    }

    public void H(int i, boolean z2) {
        Resources resources;
        int i2;
        c0.a(0, "X1MainFragmentActivity", "setTapsBottomTips(" + i + "," + z2 + ")");
        G(i);
        this.F = z2;
        Button button = this.A;
        if (z2) {
            resources = getResources();
            i2 = R.string.main_choose_none;
        } else {
            resources = getResources();
            i2 = R.string.main_choose_all;
        }
        button.setText(resources.getString(i2));
    }

    public void I(com.xforce.v5.xdvpro.widget.c cVar) {
        this.C = cVar;
    }

    public void J() {
        c0.a(0, "X1MainFragmentActivity", "showAllTaps()");
        this.F = false;
        if (this.v.getVisibility() != 0) {
            this.v.setVisibility(0);
            this.v.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_from_top));
        }
        if (this.w.getVisibility() != 0) {
            this.w.setVisibility(0);
            this.w.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_from_bottom));
        }
        int i = 0;
        while (true) {
            RadioButton[] radioButtonArr = this.m;
            if (i < radioButtonArr.length) {
                radioButtonArr[i].setEnabled(false);
                i++;
            } else {
                return;
            }
        }
    }

    public void K() {
        c0.a(0, "X1MainFragmentActivity", "showWiFiChangeDialog()");
        if (!f.o0) {
            if (this.G == null) {
                this.G = new i(this, R.style.confirm_dialog);
            }
            if (!this.G.isShowing()) {
                this.G.show();
                this.G.setCancelable(false);
                this.G.c(this.H);
            }
        }
    }

    public void M() {
        int i;
        Resources resources;
        Button button;
        c0.a(0, "X1MainFragmentActivity", "tapChooseBtnClick()");
        if (this.F) {
            com.xforce.v5.xdvpro.widget.c cVar = this.C;
            if (cVar != null) {
                this.F = false;
                cVar.a();
                button = this.A;
                resources = getResources();
                i = R.string.main_choose_all;
            } else {
                return;
            }
        } else {
            com.xforce.v5.xdvpro.widget.c cVar2 = this.C;
            if (cVar2 != null) {
                this.F = true;
                cVar2.c();
                button = this.A;
                resources = getResources();
                i = R.string.main_choose_none;
            } else {
                return;
            }
        }
        button.setText(resources.getString(i));
    }

    public void N() {
        c0.a(0, "X1MainFragmentActivity", "tapConfirmBtnClick()");
        com.xforce.v5.xdvpro.widget.c cVar = this.C;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void O() {
        c0.a(0, "X1MainFragmentActivity", "totalExit()");
        this.D.reenableKeyguard();
        this.s.O2();
        d0.t().I();
        d0.t().i();
        this.K.sendEmptyMessageDelayed(40961, 500);
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        o.c();
        switch (i) {
            case R.id.main_btnfile /*2131230856*/:
                if (g.k1 || g.l1 || g.j1) {
                    this.s.G2();
                    int i2 = 0;
                    while (true) {
                        RadioButton[] radioButtonArr = this.m;
                        if (i2 < radioButtonArr.length) {
                            if (i2 == this.n) {
                                radioButtonArr[i2].setChecked(true);
                            } else {
                                radioButtonArr[i2].setChecked(false);
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                } else {
                    this.t.p1();
                    this.p.setCurrentItem(1);
                    this.n = 1;
                    return;
                }
                break;
            case R.id.main_btnsetting /*2131230857*/:
                if (g.k1 || g.l1 || g.j1) {
                    this.s.G2();
                    int i3 = 0;
                    while (true) {
                        RadioButton[] radioButtonArr2 = this.m;
                        if (i3 < radioButtonArr2.length) {
                            if (i3 == this.n) {
                                radioButtonArr2[i3].setChecked(true);
                            } else {
                                radioButtonArr2[i3].setChecked(false);
                            }
                            i3++;
                        } else {
                            return;
                        }
                    }
                } else {
                    this.p.setCurrentItem(2);
                    this.n = 2;
                    return;
                }
                break;
            case R.id.main_btnvideo /*2131230858*/:
                this.p.setCurrentItem(0);
                this.n = 0;
                return;
            default:
                return;
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_tap_bottom_choose /*2131230861*/:
                M();
                return;
            case R.id.main_tap_bottom_confirm /*2131230862*/:
                N();
                return;
            case R.id.main_tap_top_back /*2131230865*/:
                w();
                return;
            default:
                return;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        c0.a(0, "X1MainFragmentActivity", "CCGloabal.isInitDecvice ==" + b.c.a.a.d.b.q);
        o.c();
        int i = configuration.orientation;
        if (i == 2) {
            if (this.n == 0) {
                this.l.setVisibility(8);
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 1024;
                getWindow().setAttributes(attributes);
                getWindow().addFlags(512);
            }
        } else if (i == 1 && this.l.getVisibility() == 8) {
            this.l.setVisibility(0);
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
        c0.a(0, "X1MainFragmentActivity", "onCreate");
        requestWindowFeature(1);
        getWindow().setFlags(128, 128);
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435462, "SimpleTimer");
        newWakeLock.acquire();
        newWakeLock.release();
        KeyguardManager.KeyguardLock newKeyguardLock = ((KeyguardManager) getSystemService("keyguard")).newKeyguardLock("");
        this.D = newKeyguardLock;
        newKeyguardLock.disableKeyguard();
        setContentView(R.layout.activity_main);
        B();
        L();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        c0.a(0, "X1MainFragmentActivity", "onDestroy");
        f fVar = this.I;
        if (fVar != null) {
            unregisterReceiver(fVar);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.s.b2()) {
            int i2 = this.E + 1;
            this.E = i2;
            if (i2 == 2) {
                if (this.K.hasMessages(1)) {
                    this.K.removeMessages(1);
                }
                this.E = 0;
            } else {
                o.g(this, getResources().getString(R.string.main_double_click_return_desktop), true);
                this.K.sendEmptyMessageDelayed(1, 1500);
                return false;
            }
        }
        y();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        c0.a(0, "X1MainFragmentActivity", "onResume");
        C();
        d0.t().N(this.L);
        b.c.a.a.d.b.z(1);
        D();
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        c0.a(0, "X1MainFragmentActivity", "onStop");
        if (!b.c.a.a.d.b.p) {
            this.M.d();
        }
        super.onStop();
    }

    public void w() {
        c0.a(0, "X1MainFragmentActivity", "dismissAllTaps()");
        x();
        com.xforce.v5.xdvpro.widget.c cVar = this.C;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void x() {
        int i = 0;
        c0.a(0, "X1MainFragmentActivity", "dismissTapsView()");
        if (this.v.getVisibility() == 0) {
            this.v.setVisibility(8);
            this.v.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_out_to_top));
        }
        if (this.w.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.w.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_out_to_bottom));
        }
        while (true) {
            RadioButton[] radioButtonArr = this.m;
            if (i < radioButtonArr.length) {
                radioButtonArr[i].setEnabled(true);
                i++;
            } else {
                return;
            }
        }
    }

    public void z() {
        if (g.i1) {
            this.n = 1;
            this.m[0].setChecked(false);
            this.m[2].setChecked(false);
            this.m[1].setChecked(true);
            this.p.setCurrentItem(1);
        }
        this.t.v1();
    }
}
