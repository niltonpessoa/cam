package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.rp.rptool.util.RPVideoViewHelper;
import com.rp.rptool.util.b0;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.l;
import com.rp.rptool.util.m;
import com.rp.rptool.util.r;
import com.rp.rptool.util.w;
import com.rp.rptool.util.x;
import com.rp.rptool.util.z;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.XFHorizontalScrollViewForText;
import com.xforce.v5.xdvpro.widget.i;
import com.xforce.v5.xdvpro.widget.j;
import com.xforce.v5.xdvpro.widget.o;
import com.xforce.v5.xdvpro.widget.p;
import com.xforce.v5.xdvpro.widget.q;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class n extends android.support.v4.app.e implements View.OnClickListener {
    public static boolean Y0 = false;
    public static boolean Z0 = true;
    public static boolean a1 = false;
    public static boolean b1 = false;
    public static boolean c1 = false;
    public static boolean d1 = false;
    private ImageButton A0;
    XFHorizontalScrollViewForText B0;
    /* access modifiers changed from: private */
    public int C0 = 0;
    private int D0 = -1;
    private int E0 = -1;
    private int[] F0;
    private int[] G0;
    private int H0 = 0;
    private boolean I0 = false;
    /* access modifiers changed from: private */
    public boolean J0 = false;
    private int K0 = -1;
    private int L0 = 0;
    private boolean M0 = false;
    private int N0 = -1;
    private q O0;
    /* access modifiers changed from: private */
    public Bitmap P0;
    private i Q0;
    private j R0;
    /* access modifiers changed from: private */
    public Handler S0 = new d();
    /* access modifiers changed from: private */
    public boolean T0 = false;
    private j U0;
    /* access modifiers changed from: private */
    public p V0;
    private int W0;
    /* access modifiers changed from: private */
    public b.b.d.c X0;
    private Resources Y;
    private RelativeLayout Z;
    private LinearLayout a0;
    private Animation b0;
    private ImageView c0;
    private RelativeLayout.LayoutParams d0;
    private RelativeLayout.LayoutParams e0;
    /* access modifiers changed from: private */
    public RPVideoViewHelper f0;
    private h g0;
    /* access modifiers changed from: private */
    public XFTPMainFragmentActivity h0;
    private View i0;
    private ImageView j0;
    private RelativeLayout.LayoutParams k0;
    private RelativeLayout.LayoutParams l0;
    /* access modifiers changed from: private */
    public boolean m0;
    /* access modifiers changed from: private */
    public boolean n0;
    private RelativeLayout o0;
    private RelativeLayout p0;
    private TextView q0;
    private TextView r0;
    private TextView s0;
    private TextView t0;
    private LinearLayout u0;
    private ImageButton v0;
    private ImageButton w0;
    private Button x0;
    private ImageButton y0;
    private ImageButton z0;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            n.this.h0.R();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            n.this.f2();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            n.this.i2();
        }
    }

    class d extends Handler {
        d() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                n.this.i2();
                b.c.a.a.d.b.q = true;
            } else if (i != 4095) {
                switch (i) {
                    case 0:
                        n.this.q3();
                        return;
                    case 1:
                        n.this.t3();
                        return;
                    case 2:
                        n.this.n2();
                        return;
                    case 3:
                        n.this.m2();
                        return;
                    case 4:
                        d0.t().J((b.b.e.a.a) message.obj);
                        return;
                    case 5:
                        n.this.r2((b.b.e.a.b) message.obj);
                        return;
                    case 6:
                        n.this.i3();
                        return;
                    case 7:
                        d0.t().K();
                        return;
                    default:
                        switch (i) {
                            case 9:
                                n.this.W2();
                                return;
                            case 10:
                                n.this.c2();
                                return;
                            case 11:
                                n.this.o2();
                                return;
                            case 12:
                                n.this.s2();
                                return;
                            case 13:
                                n.this.p3();
                                return;
                            case com.google.android.exoplayer2.ui.g.H:
                                break;
                            case com.google.android.exoplayer2.ui.g.I:
                                n.this.E2();
                                return;
                            case 16:
                                n.this.X2();
                                return;
                            case 17:
                                boolean unused = n.this.J0 = false;
                                return;
                            case 18:
                                n.this.Y2();
                                return;
                            default:
                                switch (i) {
                                    case 45057:
                                        n.this.q2();
                                        return;
                                    case 45058:
                                        n.this.p2();
                                        return;
                                    case 45059:
                                        n.this.e2();
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
            } else {
                boolean unused2 = n.this.T0 = false;
                return;
            }
            n.this.s3();
        }
    }

    class e implements XFHorizontalScrollViewForText.c {
        e() {
        }

        public void a(int i, View view, int i2) {
            if (n.b1 || n.c1 || n.a1 || n.d1) {
                n.this.m3();
            } else {
                n.this.z3(i2);
            }
        }
    }

    class f implements AdapterView.OnItemClickListener {
        f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            c0.a(0, "XFTPShowVideoFragment", "popwindow onclick i:" + i);
            if (n.b1 || n.c1 || n.a1 || n.d1) {
                n.this.m3();
                return;
            }
            String c = n.this.X0.c();
            byte[] bArr = null;
            try {
                bArr = c.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            c0.a(0, "XFTPShowVideoFragment", "itemStr:" + c + " mode_dv:" + n.this.C0 + " i:" + i);
            d0.t().J(new b.b.e.a.a(d0.t().q(), 1615, com.rp.rptool.util.p.a(n.this.C0, i, bArr), com.rp.rptool.util.p.b()));
            n.this.h3();
            n.this.V0.dismiss();
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            if (n.this.C0 / 4 == 1) {
                if (n.this.J0) {
                    c0.a(0, "XFTPShowVideoFragment", "capture isLock~~~~~~!");
                } else if (n.b1 || n.c1) {
                    n.this.m3();
                } else if (!n.this.b2()) {
                    n.this.k3();
                } else {
                    n.this.k2();
                    d0.t().x(new b.b.e.a.a(d0.t().q(), 1632, (byte[]) null, 0));
                    boolean unused = n.this.J0 = true;
                    n.this.S0.sendEmptyMessageDelayed(17, 1500);
                    if (n.this.C0 == 6) {
                        n.this.l3();
                    }
                }
            } else if (n.a1) {
                n.this.m3();
            } else if (!n.b1 && !n.this.b2()) {
                n.this.k3();
            } else if (!n.b1 && !n.this.Z1()) {
                com.xforce.v5.xdvpro.widget.n.g(n.this.g(), n.this.y().getString(R.string.dev_storage_limit));
            } else if (!n.this.T0) {
                boolean unused2 = n.this.T0 = true;
                n.this.S0.sendEmptyMessageDelayed(4095, 2000);
                d0.t().p().q(b.c.a.a.d.b.r(d0.t().p().f()));
                n.this.a3(d0.t().p().f());
                n.this.A2();
            }
        }
    }

    class h implements RPVideoViewHelper.c {
        h() {
        }

        public void a() {
            c0.a(0, "XFTPShowVideoFragment", "videoViewEnd()");
            n.Y0 = false;
            boolean unused = n.this.n0 = false;
        }

        public void b() {
            n nVar = n.this;
            Bitmap unused = nVar.P0 = nVar.f0.getShotCut();
        }

        public void c() {
            c0.a(0, "XFTPShowVideoFragment", "videoViewShow()");
            n.this.S0.sendEmptyMessage(100);
            n.Y0 = true;
            boolean unused = n.this.m0 = false;
        }

        public void d() {
        }
    }

    /* access modifiers changed from: private */
    public void A2() {
        c0.a(0, "XFTPShowVideoFragment", "refreshRecordSwitch()");
    }

    @Deprecated
    private void B2() {
        boolean z = false;
        c0.a(0, "XFTPShowVideoFragment", "refreshSlowGraphy()");
        if (d0.t().p().j() != 0) {
            z = true;
        }
        c1 = z;
        q qVar = this.O0;
        if (qVar != null && qVar.isShowing()) {
            this.O0.h(d0.t().p().j());
        }
    }

    private void C2() {
        this.S0.sendEmptyMessage(45058);
    }

    private void D2() {
        this.S0.sendEmptyMessage(45057);
    }

    /* access modifiers changed from: private */
    public void E2() {
        int i;
        int i2;
        c0.a(0, "XFTPShowVideoFragment", "refreshTakePhoto()");
        if (this.C0 == 7) {
            int i3 = this.F0[1];
            i = Integer.parseInt(Pattern.compile("[^0-9]").matcher(b.b.d.b.e().i(this.C0, 1).a().get(i3)).replaceAll(""));
        } else {
            i = 0;
        }
        if (this.C0 == 5) {
            int i4 = this.F0[1];
            i2 = Integer.parseInt(Pattern.compile("[^0-9]").matcher(b.b.d.b.e().i(this.C0, 1).a().get(i4)).replaceAll(""));
        } else {
            i2 = 0;
        }
        if (a1) {
            if (this.S0.hasMessages(11)) {
                this.S0.removeMessages(11);
            }
            q qVar = this.O0;
            if (qVar != null && qVar.isShowing()) {
                this.O0.d(0);
            }
            if (this.s0.getVisibility() != 8) {
                this.s0.setVisibility(8);
            }
            this.L0 = 0;
            this.K0 = -1;
            a1 = false;
            X2();
            d0.t().w(1607, 1);
            return;
        }
        this.M0 = true;
        this.K0 = -1;
        this.L0 = 0;
        if (i == 0 && i2 == 0) {
            a1 = false;
            k2();
            d0.t().w(1607, 1);
            X2();
            return;
        }
        a1 = true;
        q qVar2 = this.O0;
        if (qVar2 != null && qVar2.isShowing()) {
            this.O0.d(1);
        }
        if (i > 0) {
            this.K0 = i;
            this.M0 = true;
        } else if (i2 > 0) {
            this.K0 = i2;
            this.M0 = false;
        }
        int i5 = this.K0;
        if (i5 != -1) {
            this.L0 = i5;
            o3();
        }
    }

    private void G2() {
        b.b.d.c i = b.b.d.b.e().i(this.C0, b.b.d.b.e().c(this.C0));
        this.x0.setText(i.a().get(this.F0[b.b.d.b.e().c(this.C0)]));
    }

    private void H2() {
        int i;
        Resources resources;
        ImageButton imageButton;
        if (this.C0 / 4 == 1) {
            this.z0.setBackgroundDrawable(this.Y.getDrawable(R.drawable.video_por_btm_capture_big_selector));
            imageButton = this.A0;
            resources = this.Y;
            i = R.drawable.video_por_btm_record_little_selector;
        } else {
            this.z0.setBackgroundDrawable(this.Y.getDrawable(R.drawable.video_por_btm_record_big_selector));
            imageButton = this.A0;
            resources = this.Y;
            i = R.drawable.video_por_btm_capture_little_selector;
        }
        imageButton.setBackgroundDrawable(resources.getDrawable(i));
    }

    private void I2() {
        String[] j = b.b.d.b.e().j(this.C0);
        c0.a(0, "XFTPShowVideoFragment", "refreshVideoPorMidParamsModeSelector() data = " + Arrays.asList(j) + "modev = " + this.C0);
        this.B0 = (XFHorizontalScrollViewForText) this.i0.findViewById(R.id.video_por_mid_params_mode_selector);
        this.B0.d((LinearLayout) this.i0.findViewById(R.id.video_por_mid_params_mode_selector_li), j.length, j);
        this.B0.setOnItemClickListener(new e());
        this.B0.setSelectCount(this.C0 % 4);
    }

    private void J2(b.b.e.a.b bVar) {
        r rVar = new r(bVar.a());
        c0.a(0, "XFTPShowVideoFragment", "ealen test respChangeWorkMode rtnMsg.value = " + rVar.f958a);
        if (rVar.f958a == 0) {
            new Handler().postDelayed(new c(), 500);
            return;
        }
        c0.a(0, "XFTPShowVideoFragment", "respChangeWorkMode() dismissChangeModeLoadingDialog");
        e2();
    }

    private void K2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPShowVideoFragment", "sendIOCtrlResp() NAT_CMD_CHECK_TF_CARD_RESP");
        z zVar = new z(bVar.a());
        c0.a(0, "XFTPShowVideoFragment", "NAT_CMD_CHECK_TF_CARD_RESP capacity = " + zVar);
        d0.t().p().s((long) zVar.f964b);
        d0.t().p().t((long) zVar.f963a);
    }

    private void L2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPShowVideoFragment", "respConnectDevFail() rtnMsg = " + bVar);
        d0.t().p().r(bVar.d());
        this.S0.sendEmptyMessageDelayed(7, 500);
    }

    private void M2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPShowVideoFragment", "respConnectDevSuccess() rtnMsg = " + bVar);
        d0.t().p().r(bVar.d());
        d0.t().z("http://192.168.10.1:8082/tmp/data/.data/sqlite/sunxi.db", b.c.a.a.d.b.f865a);
        X2();
        this.S0.sendEmptyMessage(0);
    }

    private void N2(w wVar) {
        String str;
        c0.a(0, "XFTPShowVideoFragment", "item's respGetAllConfig config = " + wVar.toString());
        d0.t().Q("ml_record_resolution", wVar.k.f927a);
        d0.t().Q("ml_record_volume", wVar.f962b);
        d0.t().Q("ml_record_timelapse", wVar.m.f927a);
        d0.t().Q("ml_record_loop", wVar.l.f927a);
        d0.t().Q("ml_record_slowmotion", wVar.n.f927a);
        d0.t().Q("ml_photo_resolution", wVar.o.f927a);
        d0.t().Q("ml_photo_timed", wVar.p.f927a);
        d0.t().Q("ml_photo_auto", wVar.q.f927a);
        d0.t().Q("ml_photo_dramashot", wVar.r.f927a);
        d0.t().Q("ml_camera_exposure", wVar.s.f927a);
        d0.t().Q("ml_camera_whitebalance", wVar.t.f927a);
        d0.t().Q("ml_camera_imagerotation", wVar.e);
        d0.t().Q("ml_camera_lightsourcefrequency", wVar.u.f927a);
        d0.t().Q("ml_camera_ledindicator", wVar.f);
        d0.t().Q("ml_camera_autoscreensaver", wVar.v.f927a);
        d0.t().Q("ml_camera_timewatermark", wVar.g);
        try {
            str = new String(wVar.A.c, "UTF-8").trim();
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            str = "";
        }
        d0.t().p().o(str);
        A2();
        e3();
        x2();
        y2(0);
        d0.t().w(1607, 1);
        d0.t().C(this.h0);
    }

    private void O2(b.b.e.a.b bVar) {
        int i;
        c0.a(0, "XFTPShowVideoFragment", " ealen test --- IOTYPE_USER_SDV_GET_MODE_CONFIG_RESP ---");
        m mVar = new m(bVar.a());
        c0.a(0, "XFTPShowVideoFragment", "mode:" + mVar.f952a + " count:" + mVar.f953b);
        this.F0 = new int[mVar.f953b];
        int i2 = 0;
        while (true) {
            i = mVar.f953b;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 * 8;
            int b2 = com.rp.rptool.util.b.b(mVar.c, i3);
            short b3 = com.rp.rptool.util.b.b(mVar.c, i3 + 4);
            this.F0[b3] = b2;
            c0.a(0, "XFTPShowVideoFragment", "i = " + i2 + " value = " + b2 + " index = " + b3);
            i2++;
        }
        c0.a(0, "XFTPShowVideoFragment", "modeSettingValues = " + Arrays.toString(this.F0) + "count = " + i);
        D2();
        int[] iArr = this.G0;
        if (iArr == null || iArr.length <= 0) {
            c0.a(0, "XFTPShowVideoFragment", "ealen test 首次获取配置");
            l2();
            d0.t().w(1607, 1);
        }
    }

    private void P2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPShowVideoFragment", " ealen test --- IOTYPE_USER_SDV_GET_MODE_INFO_RESP --- ");
        com.rp.rptool.util.n nVar = new com.rp.rptool.util.n(bVar.a());
        this.C0 = nVar.f954a;
        c0.a(0, "XFTPShowVideoFragment", "mode:" + nVar.f954a + " work_state:" + nVar.f955b + " sdcard_state:" + nVar.c + " battery:" + nVar.d + " remain_video_len:" + nVar.e + " remain_pic_count:" + nVar.f);
        int i = this.C0;
        if (i == 9 || i == 10) {
            d1 = true;
            if (Z0) {
                o.g(this.h0, "设备正处在文件界面，禁止APP的其他操作", false);
            } else {
                Toast.makeText(this.h0, "设备正处在文件界面，禁止APP的其他操作", 0).show();
            }
        } else {
            j2();
        }
    }

    private void Q2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPShowVideoFragment", "--- IOTYPE_USER_SDV_GET_SYS_CONFIG_REQ ---");
        m mVar = new m(bVar.a());
        c0.a(0, "XFTPShowVideoFragment", "mode:" + mVar.f952a + " count:" + mVar.f953b);
        this.G0 = new int[mVar.f953b];
        for (int i = 0; i < mVar.f953b; i++) {
            int i2 = i * 8;
            int b2 = com.rp.rptool.util.b.b(mVar.c, i2);
            short b3 = com.rp.rptool.util.b.b(mVar.c, i2 + 4);
            this.G0[b3] = b2;
            c0.a(0, "XFTPShowVideoFragment", "i = " + i + " value = " + b2 + " index = " + b3);
        }
        C2();
    }

    private void R2(b.b.e.a.b bVar) {
        bVar.b();
        int i = new r(bVar.a()).f958a;
        c0.a(0, "XFTPShowVideoFragment", "NAT_CMD_RECORD_ON_OFF_RESP -- result = " + i);
        if (i != 0) {
            b1 = false;
            if (Z0) {
                o.g(g(), this.Y.getString(R.string.record_error_check_tfcard), false);
            } else {
                Toast.makeText(g(), this.Y.getString(R.string.record_error_check_tfcard), 0).show();
            }
        } else if (b1) {
            r3();
        } else {
            n3();
        }
    }

    private void S2(b.b.e.a.b bVar) {
        String str;
        String str2 = "";
        c0.a(0, "XFTPShowVideoFragment", "respSearchDevice()");
        if (!d0.t().f933b) {
            this.S0.sendEmptyMessage(6);
        } else if (bVar.c() / b0.a() == 0) {
            c0.a(3, "XFTPShowVideoFragment", "respSearchDevice() returnMsg to num == 0!");
            this.S0.sendEmptyMessageAtTime(7, 1000);
        } else {
            b0 b0Var = new b0(bVar.a(), 0);
            c0.a(0, "XFTPShowVideoFragment", "respSearchDevice() info = " + b0Var);
            try {
                str = new String(b0Var.f925a, "UTF-8").trim();
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                c0.a(3, "XFTPShowVideoFragment", "respSearchDevice() uid 2 String error!");
                str = str2;
            }
            if (str == null || str2.equals(str)) {
                c0.a(3, "XFTPShowVideoFragment", "respSearchDevice() uid null error!");
                return;
            }
            try {
                str2 = new String(b0Var.f926b, "UTF-8").trim();
            } catch (UnsupportedEncodingException e3) {
                e3.printStackTrace();
                c0.a(0, "XFTPShowVideoFragment", "respSearchDevice() ip 2 String error!");
            }
            b.b.e.a.c cVar = new b.b.e.a.c(str, "12345", -1, str2, -1);
            d0.t().P(cVar);
            b.c.a.a.d.b.j(cVar.l());
            Z2(cVar.l(), cVar.d());
        }
    }

    private void T2(b.b.e.a.b bVar) {
        com.rp.rptool.util.o oVar = new com.rp.rptool.util.o(bVar.a());
        c0.a(0, "XFTPShowVideoFragment", "IOTYPE_USER_SDV_SET_MODE_CONFIG_RESP reslut = " + oVar.f957b + "mode = " + oVar.f956a);
        if (this.C0 != 8) {
            h2();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        com.rp.rptool.util.d0.t().w(1607, 1);
        X2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        com.rp.rptool.util.c0.a(0, "XFTPShowVideoFragment", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void U2(b.b.e.a.b r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "XFTPShowVideoFragment"
            java.lang.String r2 = "IOTYPE_USER_SDV_SYNC_STATE_RESP"
            com.rp.rptool.util.c0.a(r0, r1, r2)
            com.rp.rptool.util.f r2 = new com.rp.rptool.util.f
            byte[] r8 = r8.a()
            r2.<init>(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "IOTYPE_USER_SDV_SYNC_STATE_RESP state = "
            r8.append(r3)
            int r3 = r2.f945a
            r8.append(r3)
            java.lang.String r3 = "value = "
            r8.append(r3)
            int r3 = r2.f946b
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            com.rp.rptool.util.c0.a(r0, r1, r8)
            int r8 = r2.f945a
            r3 = 8
            r4 = 1607(0x647, float:2.252E-42)
            r5 = 9
            r6 = 1
            switch(r8) {
                case 0: goto L_0x0113;
                case 1: goto L_0x010d;
                case 2: goto L_0x00f7;
                case 3: goto L_0x003d;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00a1;
                case 7: goto L_0x003d;
                case 8: goto L_0x0052;
                case 9: goto L_0x004e;
                case 10: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x011b
        L_0x003f:
            d1 = r0
            int r8 = r7.C0
            if (r8 == r5) goto L_0x0049
            r0 = 10
            if (r8 != r0) goto L_0x011b
        L_0x0049:
            r7.i2()
            goto L_0x011b
        L_0x004e:
            d1 = r6
            goto L_0x011b
        L_0x0052:
            boolean r8 = a1
            if (r8 != 0) goto L_0x0058
            a1 = r6
        L_0x0058:
            android.widget.TextView r8 = r7.s0
            int r8 = r8.getVisibility()
            if (r8 != r3) goto L_0x0065
            android.widget.TextView r8 = r7.s0
            r8.setVisibility(r0)
        L_0x0065:
            int r8 = r2.f946b
            if (r8 != r6) goto L_0x006c
            r7.k2()
        L_0x006c:
            if (r8 < 0) goto L_0x0088
            android.widget.TextView r8 = r7.s0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r1 = r2.f946b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.setText(r0)
            goto L_0x011b
        L_0x0088:
            b.b.e.a.a r8 = new b.b.e.a.a
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            int r1 = r1.q()
            r2 = 1632(0x660, float:2.287E-42)
            r3 = 0
            r8.<init>(r1, r2, r3, r0)
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            r0.x(r8)
            goto L_0x011b
        L_0x00a1:
            r7.n3()
            int r8 = r2.f946b
            r7.N0 = r8
            android.widget.TextView r0 = r7.t0
            java.lang.String r8 = r7.u3(r8)
            r0.setText(r8)
            goto L_0x011b
        L_0x00b2:
            r7.r3()
            r7.N0 = r0
        L_0x00b7:
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            r8.w(r4, r6)
            r7.X2()
            goto L_0x011b
        L_0x00c2:
            android.os.Handler r8 = r7.S0
            boolean r8 = r8.hasMessages(r5)
            if (r8 == 0) goto L_0x00cf
            android.os.Handler r8 = r7.S0
            r8.removeMessages(r5)
        L_0x00cf:
            android.os.Handler r8 = r7.S0
            r8.sendEmptyMessage(r5)
            int r8 = r7.C0
            r1 = 5
            if (r8 != r1) goto L_0x00da
            goto L_0x00b7
        L_0x00da:
            r1 = 6
            if (r8 != r1) goto L_0x00e1
            r7.f2()
            goto L_0x00b7
        L_0x00e1:
            r1 = 4
            if (r8 == r1) goto L_0x00e7
            r1 = 7
            if (r8 != r1) goto L_0x00b7
        L_0x00e7:
            android.widget.TextView r8 = r7.s0
            int r8 = r8.getVisibility()
            if (r8 == r3) goto L_0x00f4
            android.widget.TextView r8 = r7.s0
            r8.setVisibility(r3)
        L_0x00f4:
            a1 = r0
            goto L_0x00b7
        L_0x00f7:
            java.lang.String r8 = "录像卡满啦"
            com.rp.rptool.util.c0.a(r0, r1, r8)
            r7.X2()
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            r8.w(r4, r6)
            r7.a2()
            r7.k3()
            goto L_0x011b
        L_0x010d:
            r7.a2()
            java.lang.String r8 = "TF异常-- 拔出TF卡"
            goto L_0x0118
        L_0x0113:
            r7.a2()
            java.lang.String r8 = "TF异常-- 插入TF卡"
        L_0x0118:
            com.rp.rptool.util.c0.a(r0, r1, r8)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.n.U2(b.b.e.a.b):void");
    }

    private void V2(b.b.e.a.b bVar) {
        bVar.b();
        int i = new r(bVar.a()).f958a;
        c0.a(0, "XFTPShowVideoFragment", " ------------- ONCLICK POR CAPTURE RESP-------------");
        c0.a(0, "XFTPShowVideoFragment", "NAT_CMD_TAKE_PHOTO_RESP -- result = " + i);
        if (i != 0 || this.C0 == 6) {
            if (i != 0 || this.C0 != 6) {
                if (Z0) {
                    o.g(g(), this.Y.getString(R.string.capture_error_check_tfcard), false);
                } else {
                    Toast.makeText(g(), this.Y.getString(R.string.capture_error_check_tfcard), 0).show();
                }
            }
        } else if (a1) {
            if (this.s0.getVisibility() != 8) {
                this.s0.setVisibility(8);
            }
            a1 = false;
            X2();
            d0.t().w(1607, 1);
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void W2() {
        if (this.S0.hasMessages(10)) {
            this.S0.removeMessages(10);
        }
        if (this.P0 != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(g2(this.P0));
            c0.a(0, "XFTPShowVideoFragment", "ealen test 获取到的缩略图不为空");
            this.y0.setBackground(bitmapDrawable);
        }
    }

    /* access modifiers changed from: private */
    public void X2() {
        c0.a(0, "XFTPShowVideoFragment", "sendBrocastToRefreshDevList()");
        Intent intent = new Intent();
        intent.setAction("refresh_list_filter");
        g().sendBroadcast(intent);
        intent.setAction("local_refresh_list_filter");
        g().sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public void Y2() {
        c0.a(0, "XFTPShowVideoFragment", "sendBrocastToRefreshLocalList()");
        Intent intent = new Intent();
        intent.setAction("local_refresh_list_filter");
        g().sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public boolean Z1() {
        return d0.t().p().h() > 103;
    }

    private void Z2(String str, String str2) {
        c0.a(0, "XFTPShowVideoFragment", "sendConnectDevice()");
        d0.t().H(str, str2);
    }

    /* access modifiers changed from: private */
    public void a3(int i) {
        c0.a(0, "XFTPShowVideoFragment", "setRecordSwitch(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1634, x.a(i), x.b()));
    }

    /* access modifiers changed from: private */
    public boolean b2() {
        return d0.t().p().i() != 0 && d0.t().p().h() > 400;
    }

    @Deprecated
    private void b3(int i) {
        c0.a(0, "XFTPShowVideoFragment", "setSlowGraphy(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1830, x.a(i), x.b()));
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void c2() {
        if (this.j0.getVisibility() != 8) {
            this.j0.setVisibility(8);
            this.j0.setBackground((Drawable) null);
        }
    }

    private void c3(int i) {
        c0.a(0, "XFTPShowVideoFragment", "setTakePhoto(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1632, x.a(i), x.b()));
        this.J0 = true;
        this.S0.sendEmptyMessageDelayed(17, 1500);
    }

    private void d2() {
        q qVar;
        if (!Z0 && (qVar = this.O0) != null && qVar.isShowing()) {
            this.O0.dismiss();
        }
    }

    private void d3(int i) {
        c0.a(0, "XFTPShowVideoFragment", "setTipsView index == " + i);
    }

    /* access modifiers changed from: private */
    public void e2() {
        if (this.S0.hasMessages(45059)) {
            this.S0.removeMessages(45059);
        }
        j jVar = this.U0;
        if (jVar != null && jVar.isShowing()) {
            this.U0.dismiss();
        }
    }

    private void e3() {
        c0.a(0, "XFTPShowVideoFragment", "setUIByDevType()");
    }

    /* access modifiers changed from: private */
    public void f2() {
        j jVar = this.R0;
        if (jVar != null && jVar.isShowing()) {
            this.R0.dismiss();
        }
    }

    private void f3() {
        this.a0.setBackgroundColor(y().getColor(R.color.black));
        this.c0.setVisibility(8);
        this.a0.setVisibility(0);
        this.q0.setText(this.Y.getString(R.string.offline));
    }

    private void h2() {
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1617, l.a(this.C0), l.b()));
    }

    /* access modifiers changed from: private */
    public void h3() {
        if (this.U0 == null) {
            this.U0 = new j(this.h0, R.style.confirm_dialog);
        }
        if (!this.U0.isShowing()) {
            this.U0.show();
            this.U0.d(true);
            this.U0.c(this.Y.getString(R.string.please_wait));
            this.U0.setCancelable(false);
        }
        this.S0.sendEmptyMessageDelayed(45059, 5000);
    }

    /* access modifiers changed from: private */
    public void i2() {
        c0.a(0, "XFTPShowVideoFragment", "ealen test getModeInfo()");
        h3();
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1636, (byte[]) null, 0));
    }

    /* access modifiers changed from: private */
    public void i3() {
        if (this.Q0 == null) {
            this.Q0 = new i(this.h0, R.style.confirm_dialog);
        }
        this.Q0.show();
        this.Q0.b(this.Y.getString(R.string.device_connect_overtime));
        this.Q0.setCancelable(false);
        this.Q0.c(new a());
    }

    private void j2() {
        c0.a(0, "XFTPShowVideoFragment", "ealen test getNowConfig()");
        h2();
    }

    private void j3() {
        q qVar;
        if (!Z0 && (qVar = this.O0) != null && qVar.isShowing()) {
            this.O0.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void k2() {
        if (Y0) {
            this.f0.goShotCut();
        }
    }

    /* access modifiers changed from: private */
    public void k3() {
        String string = this.Y.getString(d0.t().p().i() == 0 ? R.string.file_dev_has_no_card : R.string.dev_storage_limit);
        if (Z0) {
            o.g(this.h0, string, false);
        } else {
            Toast.makeText(this.h0, string, 1).show();
        }
    }

    private void l2() {
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1619, l.a(8), l.b()));
    }

    /* access modifiers changed from: private */
    public void l3() {
        if (this.R0 == null) {
            this.R0 = new j(this.h0, R.style.confirm_dialog);
        }
        this.R0.show();
        this.R0.d(true);
        this.R0.c(this.Y.getString(R.string.motion_capture_loading));
        this.R0.setCancelable(false);
        new Handler().postDelayed(new b(), 10000);
    }

    /* access modifiers changed from: private */
    public void m2() {
        c0.a(0, "XFTPShowVideoFragment", "handleChangeLanscape");
        this.p0.setVisibility(8);
        this.o0.setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: private */
    public void n2() {
        c0.a(0, "XFTPShowVideoFragment", "handleChangePortrait");
        this.p0.setVisibility(0);
        this.o0.setBackgroundColor(-1);
    }

    private void n3() {
        c0.a(0, "XFTPShowVideoFragment", "startCountingVideo()");
        if (!b1) {
            k2();
        }
        if (this.u0.getVisibility() != 0) {
            this.u0.setVisibility(0);
            this.t0.setText("00:00");
            this.N0 = 0;
        }
        b1 = true;
    }

    /* access modifiers changed from: private */
    public void o2() {
        long j;
        Handler handler;
        if (this.s0.getVisibility() != 0) {
            this.s0.setVisibility(0);
        }
        if (this.L0 <= 0) {
            k2();
            if (this.s0.getVisibility() != 8) {
                this.s0.setVisibility(8);
            }
            if (this.M0) {
                if (this.S0.hasMessages(11)) {
                    this.S0.removeMessages(11);
                }
                q qVar = this.O0;
                if (qVar != null && qVar.isShowing()) {
                    this.O0.d(0);
                }
                if (this.s0.getVisibility() != 8) {
                    this.s0.setVisibility(8);
                }
                this.L0 = 0;
                this.K0 = -1;
                a1 = false;
                X2();
                d0.t().w(1607, 1);
                return;
            }
            this.L0 = this.K0;
            handler = this.S0;
            j = 300;
        } else {
            TextView textView = this.s0;
            textView.setText(this.L0 + "");
            this.L0 = this.L0 - 1;
            handler = this.S0;
            j = 1000;
        }
        handler.sendEmptyMessageDelayed(11, j);
    }

    private void o3() {
        this.S0.sendEmptyMessage(11);
    }

    /* access modifiers changed from: private */
    public void p2() {
        c0.a(0, "XFTPShowVideoFragment", "handleRefreshSysTPUI()");
    }

    /* access modifiers changed from: private */
    public void p3() {
        if (!Y0 || this.I0) {
            c0.a(0, "XFTPShowVideoFragment", "startVideoAnim()");
            if (8 == this.a0.getVisibility()) {
                this.a0.setVisibility(0);
            }
            if (this.b0 == null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.h0, R.anim.loading_animation);
                this.b0 = loadAnimation;
                this.c0.startAnimation(loadAnimation);
            }
        }
    }

    /* access modifiers changed from: private */
    public void q2() {
        c0.a(0, "XFTPShowVideoFragment", "handleRefreshTPUI()");
        this.r0.setText(b.b.d.b.e().i(this.C0, 0).a().get(this.F0[0]));
        I2();
        H2();
        G2();
        c0.a(0, "XFTPShowVideoFragment", "handleRefreshTPUI() dismissChangeModeLoadingDialog");
        e2();
    }

    /* access modifiers changed from: private */
    public void q3() {
        c0.a(0, "XFTPShowVideoFragment", "startVideoStream()");
        this.S0.removeMessages(0);
        this.S0.removeMessages(1);
        if (!Y0 && !this.m0 && !this.n0) {
            c0.a(0, "XFTPShowVideoFragment", "plr --- isStartVideoStream = " + Y0 + " isStartingVideoStream = " + this.m0 + " isStopingVideoStream = " + this.n0);
            if (d0.t().p() == null) {
                c0.a(3, "XFTPShowVideoFragment", "startVideoStream device = null");
                return;
            }
            p3();
            this.m0 = true;
            d0.t().L(this.f0);
        } else if (this.n0) {
            this.S0.sendEmptyMessageDelayed(0, 1000);
        }
    }

    /* access modifiers changed from: private */
    public void r2(b.b.e.a.b bVar) {
        String str;
        c0.a(0, "XFTPShowVideoFragment", "handleRefreshUI() --- " + bVar);
        switch (bVar.b()) {
            case 1608:
                K2(bVar);
                return;
            case 1610:
                c0.a(0, "XFTPShowVideoFragment", "TF异常 NAT_CMD_TF_CARD_CHANGE_STATUS");
                int i = new r(bVar.a()).f958a;
                if (i == 1) {
                    a2();
                    str = "TF异常-- 插入TF卡";
                } else if (i == 0) {
                    a2();
                    str = "TF异常-- 拔出TF卡";
                } else {
                    return;
                }
                c0.a(0, "XFTPShowVideoFragment", str);
                return;
            case 1614:
                J2(bVar);
                return;
            case 1616:
                T2(bVar);
                return;
            case 1618:
                O2(bVar);
                return;
            case 1620:
                Q2(bVar);
                return;
            case 1633:
                V2(bVar);
                return;
            case 1635:
                R2(bVar);
                return;
            case 1637:
                P2(bVar);
                return;
            case 1638:
                U2(bVar);
                return;
            case 1649:
            case 1665:
            case 1667:
                y2(this.H0);
                return;
            case 1651:
            case 1653:
            case 1669:
            case 1671:
            case 1673:
                x2();
                return;
            case 1815:
                N2(new w(bVar.a()));
                return;
            case 1831:
                int i2 = new r(bVar.a()).f958a;
                c0.a(0, "XFTPShowVideoFragment", "NAT_CMD_SET_SLOW_GRAPHY_RESP -- result = " + i2);
                if (i2 == 0) {
                    B2();
                    if (d0.t().p().j() == 1) {
                        n3();
                        return;
                    }
                    k2();
                    r3();
                    d0.t().w(1607, 1);
                    X2();
                    return;
                }
                d0.t().p().u(0);
                B2();
                if (Z0) {
                    o.g(g(), this.Y.getString(R.string.slow_record_error_check_tfcard), false);
                    return;
                } else {
                    Toast.makeText(g(), this.Y.getString(R.string.slow_record_error_check_tfcard), 0).show();
                    return;
                }
            case 1834:
                c0.a(0, "XFTPShowVideoFragment", "录像卡满啦，NAT_CMD_RECORD_TO_FULL_DISK");
                X2();
                d0.t().w(1607, 1);
                a2();
                k3();
                return;
            case 1840:
                c0.a(0, "XFTPShowVideoFragment", "NAT_CMD_MOTION_TAKE_PHOTO_FINISH 运动轨迹拍照结束返回");
                if (d0.t().s("ml_photo_dramashot") != 0) {
                    X2();
                    d0.t().w(1607, 1);
                    f2();
                    return;
                } else if (this.C0 == 5) {
                    c0.a(0, "XFTPShowVideoFragment", "自动拍照拍完一张返回");
                    if (this.S0.hasMessages(11)) {
                        this.S0.removeMessages(11);
                    }
                    this.L0 = this.K0;
                    o3();
                    return;
                } else {
                    return;
                }
            case 12289:
                M2(bVar);
                return;
            case 12290:
                L2(bVar);
                return;
            case 12322:
                S2(bVar);
                if (this.S0.hasMessages(7)) {
                    this.S0.removeMessages(7);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void r3() {
        c0.a(0, "XFTPShowVideoFragment", "stopCoutingVideo()");
        if (!this.S0.hasMessages(9)) {
            this.S0.sendEmptyMessage(9);
        }
        c0.a(0, "XFTPShowVideoFragment", "stopCoutingVideo()");
        if (this.u0.getVisibility() != 8) {
            this.u0.setVisibility(8);
            this.t0.setText("00:00");
            this.N0 = 0;
        }
        if (this.S0.hasMessages(12)) {
            this.S0.removeMessages(12);
        }
        b1 = false;
    }

    /* access modifiers changed from: private */
    public void s2() {
        c0.a(0, "XFTPShowVideoFragment", "handleRefreshVideoCounterTxt()");
        this.t0.setText(u3(this.N0));
        this.N0++;
        int s = d0.t().s("ml_record_loop");
        if (s != 0) {
            if (s == 1) {
                s = 120;
            } else if (s == 2) {
                s = 180;
            } else if (s == 3) {
                s = 300;
            }
            if (this.N0 == s) {
                this.N0 = 0;
            }
        }
        this.S0.sendEmptyMessageDelayed(12, 1000);
    }

    /* access modifiers changed from: private */
    public void s3() {
        if (8 != this.a0.getVisibility()) {
            this.a0.setVisibility(8);
        }
        this.b0.cancel();
        this.I0 = false;
    }

    private void t2() {
        Y0 = false;
        this.m0 = false;
        this.n0 = false;
    }

    private void u2() {
        boolean z = b.c.a.a.d.b.p;
    }

    private String u3(int i) {
        int i2 = i / 60;
        int i3 = i2 / 60;
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i2 % 60), Integer.valueOf(i % 60)});
    }

    private void v2() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.h0.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        this.x0 = (Button) this.i0.findViewById(R.id.video_por_btm_param);
        ImageButton imageButton = (ImageButton) this.i0.findViewById(R.id.video_por_btm_start);
        this.z0 = imageButton;
        imageButton.setOnClickListener(this);
        this.o0 = (RelativeLayout) this.i0.findViewById(R.id.video_mainbg);
        this.p0 = (RelativeLayout) this.i0.findViewById(R.id.video_titlebar);
        TextView textView = (TextView) this.i0.findViewById(R.id.video_top_tips);
        this.q0 = textView;
        textView.setText(y().getString(R.string.app_name));
        this.j0 = (ImageView) this.i0.findViewById(R.id.video_shotcut);
        this.r0 = (TextView) this.i0.findViewById(R.id.video_por_middle_tips);
        this.s0 = (TextView) this.i0.findViewById(R.id.video_counter_tips);
        this.t0 = (TextView) this.i0.findViewById(R.id.video_video_counter_tips);
        this.u0 = (LinearLayout) this.i0.findViewById(R.id.video_record_counter_tips_bg);
        this.j0.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) this.i0.findViewById(R.id.video_top_setting);
        this.v0 = imageButton2;
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = (ImageButton) this.i0.findViewById(R.id.video_top_dv_setting);
        this.w0 = imageButton3;
        imageButton3.setOnClickListener(this);
        ImageButton imageButton4 = (ImageButton) this.i0.findViewById(R.id.video_por_btm_file);
        this.y0 = imageButton4;
        imageButton4.setOnClickListener(this);
        ImageButton imageButton5 = (ImageButton) this.i0.findViewById(R.id.video_por_btm_start);
        this.z0 = imageButton5;
        imageButton5.setOnClickListener(this);
        Button button = (Button) this.i0.findViewById(R.id.video_por_btm_param);
        this.x0 = button;
        button.setOnClickListener(this);
        ImageButton imageButton6 = (ImageButton) this.i0.findViewById(R.id.video_por_btm_mode);
        this.A0 = imageButton6;
        imageButton6.setOnClickListener(this);
        this.Z = (RelativeLayout) this.i0.findViewById(R.id.video_parentview);
        this.a0 = (LinearLayout) this.i0.findViewById(R.id.video_parentview_bg);
        this.c0 = (ImageView) this.i0.findViewById(R.id.video_parentview_loading_img);
        this.Z.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, (i2 * 9) / 16);
        this.d0 = layoutParams;
        layoutParams.addRule(13);
        int i3 = (i * 9) / 16;
        this.e0 = new RelativeLayout.LayoutParams(i, i3);
        c0.a(3, "XFTPShowVideoFragment", "video view width  = " + i + " height = " + i3);
        this.e0.addRule(14);
        this.e0.addRule(3, R.id.video_titlebar);
        this.e0.setMargins(0, 0, 0, 0);
        this.Z.setLayoutParams(this.e0);
        this.a0.setLayoutParams(this.e0);
        RPVideoViewHelper rPVideoViewHelper = new RPVideoViewHelper(this.h0, this.Z);
        this.f0 = rPVideoViewHelper;
        h hVar = new h();
        this.g0 = hVar;
        rPVideoViewHelper.setVideoViewListener(hVar);
        this.l0 = (RelativeLayout.LayoutParams) this.j0.getLayoutParams();
        int i4 = i2 / 4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, (i4 * 9) / 16);
        this.k0 = layoutParams2;
        layoutParams2.addRule(11);
        this.k0.addRule(12);
        if (b.c.a.a.d.b.p) {
            f3();
            this.h0.A();
            this.S0.sendEmptyMessage(18);
            return;
        }
        this.S0.sendEmptyMessage(0);
        this.S0.sendEmptyMessageDelayed(16, 1500);
    }

    private void v3() {
        c0.a(0, "XFTPShowVideoFragment", "totalExit()");
        this.S0.sendEmptyMessageDelayed(1, 1000);
        this.h0.R();
    }

    private void w3() {
        int i;
        int i2 = this.C0;
        if (i2 / 4 == 1) {
            this.D0 = i2;
            i = this.E0;
            if (i == -1) {
                i = 0;
            }
        } else {
            this.E0 = i2;
            i = this.D0;
            if (i == -1) {
                i = 4;
            }
        }
        c0.a(3, "XFTPShowVideoFragment", "videoPorBtmModeOnClick() mode_dv:" + this.C0);
        c0.a(3, "XFTPShowVideoFragment", "ealen test videoPorBtmModeOnClick() set mode dv:" + i);
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1613, x.a(i), x.b()));
        h3();
    }

    @TargetApi(16)
    @Deprecated
    private void x2() {
        c0.a(0, "XFTPShowVideoFragment", "refreshBtnBackgroundImages()");
        int b2 = b.b.d.d.c().b("ml_record_timelapse");
        int b3 = b.b.d.d.c().b("ml_record_loop");
        if (!Z0) {
            this.O0.e(0);
        }
        if (b2 != 0) {
            if (!Z0) {
                this.O0.e(1);
            }
        } else if (b3 != 0 && !Z0) {
            this.O0.e(2);
        }
        int b4 = b.b.d.d.c().b("ml_photo_timed");
        int b5 = b.b.d.d.c().b("ml_photo_auto");
        int b6 = b.b.d.d.c().b("ml_photo_dramashot");
        if (!Z0) {
            this.O0.b(0);
        }
        if (b4 != 0) {
            if (!Z0) {
                this.O0.b(1);
            }
        } else if (b5 != 0) {
            if (!Z0) {
                this.O0.b(2);
            }
        } else if (b6 != 0 && !Z0) {
            this.O0.b(3);
        }
    }

    private void x3() {
        this.W0 = b.b.d.b.e().c(this.C0);
        this.X0 = b.b.d.b.e().i(this.C0, this.W0);
        p pVar = new p(this.h0, this.X0.a(), this.F0[this.W0], new f());
        this.V0 = pVar;
        pVar.d(this.x0);
    }

    private void y2(int i) {
        String str;
        b.b.d.c cVar;
        String str2;
        d0 d0Var;
        c0.a(0, "XFTPShowVideoFragment", "refreshMiddleTipsView tag ==" + i);
        if (i == 0) {
            cVar = b.b.d.b.e().p();
            d0Var = d0.t();
            str2 = "ml_record_resolution";
        } else if (i == 1) {
            cVar = b.b.d.b.e().l();
            d0Var = d0.t();
            str2 = "ml_photo_resolution";
        } else if (i != 2) {
            str = "";
            this.r0.setText(str);
        } else {
            cVar = b.b.d.b.e().q();
            d0Var = d0.t();
            str2 = "ml_record_slowmotion";
        }
        str = cVar.a().get(d0Var.s(str2));
        this.r0.setText(str);
    }

    private void y3() {
        c0.a(3, "XFTPShowVideoFragment", "videoPorBtmStartOnClick() ");
        new Handler().post(new g());
    }

    private void z2(int i) {
        c0.a(0, "XFTPShowVideoFragment", "refreshPagesView index = " + i);
        d3(i);
        this.H0 = i;
        y2(i);
    }

    /* access modifiers changed from: private */
    public void z3(int i) {
        if (this.C0 / 4 == 1) {
            i += 4;
        }
        c0.a(3, "XFTPShowVideoFragment", "ealen test videoPorMidParamsModeSelectorOnclick() mode_dv:" + i);
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1613, x.a(i), x.b()));
        h3();
    }

    public void F2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPShowVideoFragment", "refreshUI() rtnMsg = " + bVar);
        Message obtainMessage = this.S0.obtainMessage();
        obtainMessage.what = 5;
        obtainMessage.obj = bVar;
        this.S0.sendMessage(obtainMessage);
    }

    public void Q(int i, int i2, Intent intent) {
        super.Q(i, i2, intent);
        if (i == 1001 && i2 == 1003) {
            v3();
        }
    }

    public void V(Bundle bundle) {
        c0.a(0, "XFTPShowVideoFragment", "onCreate");
        super.V(bundle);
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "XFTPShowVideoFragment", "onCreateView");
        this.Y = y();
        if (this.i0 == null) {
            this.i0 = layoutInflater.inflate(R.layout.fragment_showvideo_tp, viewGroup, false);
            this.h0 = (XFTPMainFragmentActivity) g();
            v2();
            u2();
            t2();
        } else {
            c0.a(0, "XFTPShowVideoFragment", "onCreateView view not null");
        }
        ViewGroup viewGroup2 = (ViewGroup) this.i0.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.i0);
        }
        return this.i0;
    }

    public void a0() {
        c0.a(0, "XFTPShowVideoFragment", "onDestroy");
        super.a0();
    }

    public void a2() {
        if (d0.t().p() != null) {
            if (b1) {
                d0.t().p().q(0);
                A2();
                r3();
            }
            if (d0.t().s("ml_photo_dramashot") != 0) {
                f2();
            }
            if (a1) {
                E2();
            }
            if (c1) {
                d0.t().p().u(b.c.a.a.d.b.r(d0.t().p().j()));
                B2();
                r3();
            }
        }
    }

    public Bitmap g2(Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 200, 200, true);
        Bitmap createBitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        canvas.drawCircle(100.0f, 100.0f, 100.0f, paint);
        paint.reset();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public void g3() {
        c0.a(0, "XFTPShowVideoFragment", "--- settingViewReturn() ---");
        if (Build.VERSION.SDK_INT >= 16) {
            this.y0.setBackground(y().getDrawable(R.drawable.video_por_btm_file));
        } else {
            this.y0.setBackgroundDrawable(y().getDrawable(R.drawable.video_por_btm_file));
        }
        if (!b.c.a.a.d.b.p) {
            h3();
            d0.t().J(new b.b.e.a.a(d0.t().q(), 1617, l.a(this.C0), l.b()));
            d0.t().J(new b.b.e.a.a(d0.t().q(), 1619, l.a(8), l.b()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3() {
        /*
            r3 = this;
            boolean r0 = b1
            if (r0 != 0) goto L_0x0016
            boolean r0 = c1
            if (r0 == 0) goto L_0x0009
            goto L_0x0016
        L_0x0009:
            boolean r0 = a1
            if (r0 == 0) goto L_0x0013
            android.content.res.Resources r0 = r3.Y
            r1 = 2131492909(0x7f0c002d, float:1.8609283E38)
            goto L_0x001b
        L_0x0013:
            java.lang.String r0 = ""
            goto L_0x001f
        L_0x0016:
            android.content.res.Resources r0 = r3.Y
            r1 = 2131493081(0x7f0c00d9, float:1.8609632E38)
        L_0x001b:
            java.lang.String r0 = r0.getString(r1)
        L_0x001f:
            boolean r1 = d1
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = "设备正处在文件界面，禁止APP的其他操作"
        L_0x0025:
            boolean r1 = Z0
            r2 = 0
            if (r1 == 0) goto L_0x0030
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r1 = r3.h0
            com.xforce.v5.xdvpro.widget.o.g(r1, r0, r2)
            goto L_0x0039
        L_0x0030:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r1 = r3.h0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.n.m3():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x026e, code lost:
        r9.h0.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02ae, code lost:
        r9.T0 = true;
        r9.S0.sendEmptyMessageDelayed(4095, 2000);
        com.rp.rptool.util.d0.t().p().u(b.c.a.a.d.b.r(com.rp.rptool.util.d0.t().p().j()));
        B2();
        b3(com.rp.rptool.util.d0.t().p().j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0386, code lost:
        l3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013e, code lost:
        r9.S0.sendEmptyMessage(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r10) {
        /*
            r9 = this;
            boolean r0 = b.c.a.a.d.b.p
            r1 = 2131230998(0x7f080116, float:1.8078065E38)
            r2 = 0
            if (r0 == 0) goto L_0x0033
            int r0 = r10.getId()
            if (r0 == r1) goto L_0x0033
            boolean r10 = Z0
            r0 = 2131492927(0x7f0c003f, float:1.860932E38)
            if (r10 == 0) goto L_0x0023
            android.support.v4.app.f r10 = r9.g()
            android.content.res.Resources r1 = r9.Y
            java.lang.String r0 = r1.getString(r0)
            com.xforce.v5.xdvpro.widget.o.g(r10, r0, r2)
            goto L_0x0032
        L_0x0023:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r10 = r9.h0
            android.content.res.Resources r1 = r9.Y
            java.lang.String r0 = r1.getString(r0)
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r2)
            r10.show()
        L_0x0032:
            return
        L_0x0033:
            boolean r0 = b.c.a.a.d.b.q
            if (r0 != 0) goto L_0x0062
            int r0 = r10.getId()
            if (r0 == r1) goto L_0x0062
            boolean r10 = Z0
            r0 = 2131492926(0x7f0c003e, float:1.8609318E38)
            if (r10 == 0) goto L_0x0052
            android.support.v4.app.f r10 = r9.g()
            android.content.res.Resources r1 = r9.Y
            java.lang.String r0 = r1.getString(r0)
            com.xforce.v5.xdvpro.widget.o.g(r10, r0, r2)
            goto L_0x0061
        L_0x0052:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r10 = r9.h0
            android.content.res.Resources r1 = r9.Y
            java.lang.String r0 = r1.getString(r0)
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r2)
            r10.show()
        L_0x0061:
            return
        L_0x0062:
            int[] r0 = r9.F0
            if (r0 == 0) goto L_0x038e
            int r0 = r0.length
            if (r0 > 0) goto L_0x006b
            goto L_0x038e
        L_0x006b:
            int r10 = r10.getId()
            java.lang.String r0 = "ml_photo_dramashot"
            r1 = 2
            r3 = 2000(0x7d0, double:9.88E-321)
            r5 = 4095(0xfff, float:5.738E-42)
            r6 = 1
            switch(r10) {
                case 2131230987: goto L_0x034f;
                case 2131230988: goto L_0x02fe;
                case 2131230989: goto L_0x02e8;
                case 2131230990: goto L_0x0296;
                case 2131230991: goto L_0x0291;
                case 2131230992: goto L_0x028c;
                case 2131230993: goto L_0x0287;
                default: goto L_0x007a;
            }
        L_0x007a:
            r7 = 8
            java.lang.String r8 = "XFTPShowVideoFragment"
            switch(r10) {
                case 2131230998: goto L_0x0279;
                case 2131231022: goto L_0x025c;
                case 2131231025: goto L_0x022f;
                case 2131231027: goto L_0x0203;
                default: goto L_0x0081;
            }
        L_0x0081:
            switch(r10) {
                case 2131231001: goto L_0x01ea;
                case 2131231002: goto L_0x01c5;
                case 2131231003: goto L_0x01a6;
                case 2131231004: goto L_0x019c;
                case 2131231005: goto L_0x0149;
                default: goto L_0x0084;
            }
        L_0x0084:
            switch(r10) {
                case 2131231015: goto L_0x0131;
                case 2131231016: goto L_0x0121;
                default: goto L_0x0087;
            }
        L_0x0087:
            switch(r10) {
                case 2131231019: goto L_0x00af;
                case 2131231020: goto L_0x008c;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x0389
        L_0x008c:
            boolean r10 = b1
            if (r10 != 0) goto L_0x00ab
            boolean r10 = a1
            if (r10 == 0) goto L_0x0095
            goto L_0x00ab
        L_0x0095:
            int r10 = r9.H0
            if (r10 == r1) goto L_0x009c
            r9.z2(r1)
        L_0x009c:
            boolean r10 = r9.b2()
            if (r10 != 0) goto L_0x00a6
            r9.k3()
            return
        L_0x00a6:
            boolean r10 = r9.T0
            if (r10 == 0) goto L_0x02ae
            return
        L_0x00ab:
            r9.m3()
            return
        L_0x00af:
            boolean r10 = c1
            if (r10 != 0) goto L_0x011d
            boolean r10 = a1
            if (r10 == 0) goto L_0x00b8
            goto L_0x011d
        L_0x00b8:
            int r10 = r9.H0
            if (r10 == 0) goto L_0x00bf
            r9.z2(r2)
        L_0x00bf:
            boolean r10 = r9.b2()
            if (r10 != 0) goto L_0x00c9
            r9.k3()
            return
        L_0x00c9:
            boolean r10 = r9.Z1()
            if (r10 != 0) goto L_0x00e2
            android.support.v4.app.f r10 = r9.g()
            android.content.res.Resources r0 = r9.y()
            r1 = 2131492920(0x7f0c0038, float:1.8609306E38)
            java.lang.String r0 = r0.getString(r1)
            com.xforce.v5.xdvpro.widget.n.g(r10, r0)
            return
        L_0x00e2:
            boolean r10 = r9.T0
            if (r10 == 0) goto L_0x00e7
            return
        L_0x00e7:
            r9.T0 = r6
            android.os.Handler r10 = r9.S0
            r10.sendEmptyMessageDelayed(r5, r3)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            int r0 = r0.f()
            int r0 = b.c.a.a.d.b.r(r0)
            r10.q(r0)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.f()
            r9.a3(r10)
            r9.A2()
            goto L_0x0389
        L_0x011d:
            r9.m3()
            return
        L_0x0121:
            boolean r10 = b1
            if (r10 != 0) goto L_0x012d
            boolean r10 = c1
            if (r10 != 0) goto L_0x012d
            boolean r10 = a1
            if (r10 == 0) goto L_0x013e
        L_0x012d:
            r9.m3()
            return
        L_0x0131:
            boolean r10 = b1
            if (r10 != 0) goto L_0x0145
            boolean r10 = c1
            if (r10 != 0) goto L_0x0145
            boolean r10 = a1
            if (r10 == 0) goto L_0x013e
            goto L_0x0145
        L_0x013e:
            android.os.Handler r10 = r9.S0
            r10.sendEmptyMessage(r7)
            goto L_0x0389
        L_0x0145:
            r9.m3()
            return
        L_0x0149:
            java.lang.String r10 = " ------------- ONCLICK POR CAPTURE -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = r9.J0
            if (r10 == 0) goto L_0x0158
            java.lang.String r10 = "capture isLock~~~~~~!"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            return
        L_0x0158:
            boolean r10 = b1
            if (r10 != 0) goto L_0x0198
            boolean r10 = c1
            if (r10 == 0) goto L_0x0161
            goto L_0x0198
        L_0x0161:
            int r10 = r9.H0
            if (r10 == r6) goto L_0x0168
            r9.z2(r6)
        L_0x0168:
            boolean r10 = r9.b2()
            if (r10 != 0) goto L_0x0172
            r9.k3()
            return
        L_0x0172:
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            r10.v(r2)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.k()
            r9.c3(r10)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            int r10 = r10.s(r0)
            if (r10 == 0) goto L_0x0389
            goto L_0x0386
        L_0x0198:
            r9.m3()
            return
        L_0x019c:
            java.lang.String r10 = " ------------- ONCLICK POR START -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            r9.y3()
            goto L_0x0389
        L_0x01a6:
            java.lang.String r10 = " ------------- ONCLICK POR PARAM -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = b1
            if (r10 != 0) goto L_0x01c1
            boolean r10 = c1
            if (r10 != 0) goto L_0x01c1
            boolean r10 = a1
            if (r10 != 0) goto L_0x01c1
            boolean r10 = d1
            if (r10 == 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            r9.x3()
            goto L_0x0389
        L_0x01c1:
            r9.m3()
            return
        L_0x01c5:
            java.lang.String r10 = " ------------- ONCLICK POR MODE -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = b1
            if (r10 != 0) goto L_0x01e6
            boolean r10 = c1
            if (r10 != 0) goto L_0x01e6
            boolean r10 = a1
            if (r10 != 0) goto L_0x01e6
            int r10 = r9.C0
            r0 = 9
            if (r10 == r0) goto L_0x01e6
            r0 = 10
            if (r10 != r0) goto L_0x01e1
            goto L_0x01e6
        L_0x01e1:
            r9.w3()
            goto L_0x0389
        L_0x01e6:
            r9.m3()
            return
        L_0x01ea:
            java.lang.String r10 = " ------------- ONCLICK POR FILE -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = b1
            if (r10 != 0) goto L_0x01ff
            boolean r10 = c1
            if (r10 != 0) goto L_0x01ff
            boolean r10 = a1
            if (r10 != 0) goto L_0x01ff
            boolean r10 = d1
            if (r10 == 0) goto L_0x026e
        L_0x01ff:
            r9.m3()
            return
        L_0x0203:
            java.lang.String r10 = " ------------- ONCLICK POR TOP SETTING -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = b1
            if (r10 != 0) goto L_0x022b
            boolean r10 = c1
            if (r10 != 0) goto L_0x022b
            boolean r10 = a1
            if (r10 != 0) goto L_0x022b
            boolean r10 = d1
            if (r10 == 0) goto L_0x0219
            goto L_0x022b
        L_0x0219:
            int[] r10 = r9.F0
            if (r10 == 0) goto L_0x022a
            int r0 = r10.length
            if (r0 > 0) goto L_0x0221
            goto L_0x022a
        L_0x0221:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r0 = r9.h0
            int r1 = r9.C0
            r0.B(r1, r10)
            goto L_0x0389
        L_0x022a:
            return
        L_0x022b:
            r9.m3()
            return
        L_0x022f:
            java.lang.String r10 = " ------------- ONCLICK POR TOP DV SETTING -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = b1
            if (r10 != 0) goto L_0x0258
            boolean r10 = c1
            if (r10 != 0) goto L_0x0258
            boolean r10 = a1
            if (r10 != 0) goto L_0x0258
            boolean r10 = d1
            if (r10 == 0) goto L_0x0245
            goto L_0x0258
        L_0x0245:
            int[] r10 = r9.G0
            if (r10 == 0) goto L_0x0254
            int r0 = r10.length
            if (r0 > 0) goto L_0x024d
            goto L_0x0254
        L_0x024d:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r0 = r9.h0
            r0.B(r7, r10)
            goto L_0x0389
        L_0x0254:
            r9.l2()
            return
        L_0x0258:
            r9.m3()
            return
        L_0x025c:
            java.lang.String r10 = " ----- video_shotcut -------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = b1
            if (r10 != 0) goto L_0x0275
            boolean r10 = c1
            if (r10 != 0) goto L_0x0275
            boolean r10 = a1
            if (r10 == 0) goto L_0x026e
            goto L_0x0275
        L_0x026e:
            com.xforce.v5.xdvpro.ui.XFTPMainFragmentActivity r10 = r9.h0
            r10.z()
            goto L_0x0389
        L_0x0275:
            r9.m3()
            return
        L_0x0279:
            boolean r10 = b.c.a.a.d.b.p
            if (r10 != 0) goto L_0x0389
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            goto L_0x0389
        L_0x0287:
            r9.z2(r1)
            goto L_0x0389
        L_0x028c:
            r9.z2(r6)
            goto L_0x0389
        L_0x0291:
            r9.z2(r2)
            goto L_0x0389
        L_0x0296:
            boolean r10 = b1
            if (r10 != 0) goto L_0x02e4
            boolean r10 = a1
            if (r10 == 0) goto L_0x029f
            goto L_0x02e4
        L_0x029f:
            boolean r10 = r9.b2()
            if (r10 != 0) goto L_0x02a9
            r9.k3()
            return
        L_0x02a9:
            boolean r10 = r9.T0
            if (r10 == 0) goto L_0x02ae
            return
        L_0x02ae:
            r9.T0 = r6
            android.os.Handler r10 = r9.S0
            r10.sendEmptyMessageDelayed(r5, r3)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            int r0 = r0.j()
            int r0 = b.c.a.a.d.b.r(r0)
            r10.u(r0)
            r9.B2()
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.j()
            r9.b3(r10)
            goto L_0x0389
        L_0x02e4:
            r9.m3()
            return
        L_0x02e8:
            boolean r10 = b1
            if (r10 != 0) goto L_0x02fa
            boolean r10 = c1
            if (r10 != 0) goto L_0x02fa
            boolean r10 = a1
            if (r10 == 0) goto L_0x02f5
            goto L_0x02fa
        L_0x02f5:
            r9.j3()
            goto L_0x0389
        L_0x02fa:
            r9.m3()
            return
        L_0x02fe:
            boolean r10 = c1
            if (r10 != 0) goto L_0x034b
            boolean r10 = a1
            if (r10 == 0) goto L_0x0307
            goto L_0x034b
        L_0x0307:
            boolean r10 = r9.b2()
            if (r10 != 0) goto L_0x0311
            r9.k3()
            return
        L_0x0311:
            boolean r10 = r9.T0
            if (r10 == 0) goto L_0x0316
            return
        L_0x0316:
            r9.T0 = r6
            android.os.Handler r10 = r9.S0
            r10.sendEmptyMessageDelayed(r5, r3)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            int r0 = r0.f()
            int r0 = b.c.a.a.d.b.r(r0)
            r10.q(r0)
            r9.A2()
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.f()
            r9.a3(r10)
            goto L_0x0389
        L_0x034b:
            r9.m3()
            return
        L_0x034f:
            boolean r10 = b1
            if (r10 != 0) goto L_0x038a
            boolean r10 = c1
            if (r10 == 0) goto L_0x0358
            goto L_0x038a
        L_0x0358:
            boolean r10 = r9.b2()
            if (r10 != 0) goto L_0x0362
            r9.k3()
            return
        L_0x0362:
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            r10.v(r2)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.k()
            r9.c3(r10)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            int r10 = r10.s(r0)
            if (r10 == 0) goto L_0x0389
        L_0x0386:
            r9.l3()
        L_0x0389:
            return
        L_0x038a:
            r9.m3()
            return
        L_0x038e:
            r9.i2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.n.onClick(android.view.View):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d2();
        int i = configuration.orientation;
        if (i == 2) {
            Z0 = false;
            this.Z.setLayoutParams(this.d0);
            this.a0.setLayoutParams(this.d0);
            this.j0.setLayoutParams(this.k0);
            WindowManager.LayoutParams attributes = this.h0.getWindow().getAttributes();
            attributes.flags |= 1024;
            this.h0.getWindow().setAttributes(attributes);
            this.h0.getWindow().addFlags(512);
            this.S0.sendEmptyMessage(3);
        } else if (i == 1) {
            Z0 = true;
            this.Z.setLayoutParams(this.e0);
            this.a0.setLayoutParams(this.e0);
            this.j0.setLayoutParams(this.l0);
            WindowManager.LayoutParams attributes2 = this.h0.getWindow().getAttributes();
            attributes2.flags &= -1025;
            this.h0.getWindow().setAttributes(attributes2);
            this.h0.getWindow().clearFlags(512);
            this.S0.sendEmptyMessage(2);
            if (!b1 && !c1) {
                this.S0.sendEmptyMessageDelayed(8, 1000);
            }
        }
        if (!b.c.a.a.d.b.p) {
            this.I0 = true;
            this.S0.sendEmptyMessage(13);
            this.S0.sendEmptyMessageDelayed(14, 1000);
        }
    }

    public void p0() {
        c0.a(0, "XFTPShowVideoFragment", "onResume");
        if (!b.c.a.a.d.b.p) {
            this.S0.sendEmptyMessage(0);
        }
        super.p0();
    }

    public void s0() {
        c0.a(0, "XFTPShowVideoFragment", "onStop");
        c0.a(0, "XFTPShowVideoFragment", "is offlinemode + " + b.c.a.a.d.b.p);
        super.s0();
    }

    public void t3() {
        c0.a(0, "XFTPShowVideoFragment", "stopVideoStream()");
        this.S0.removeMessages(0);
        this.S0.removeMessages(1);
        if (Y0) {
            if (d0.t().p() == null) {
                c0.a(3, "XFTPShowVideoFragment", "stopVideoStream CCGlobal.device == null!");
                this.S0.sendEmptyMessageDelayed(1, 500);
                return;
            }
            Y0 = false;
            this.n0 = true;
            d0.t().M();
        } else if (this.m0) {
            this.S0.sendEmptyMessageDelayed(1, 1000);
        }
    }

    public boolean w2() {
        return Z0;
    }
}
