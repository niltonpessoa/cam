package com.xforce.v5.xdvpro.ui.V3H3;

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
import com.xforce.v5.xdvpro.widget.n;
import com.xforce.v5.xdvpro.widget.o;
import com.xforce.v5.xdvpro.widget.p;
import com.xforce.v5.xdvpro.widget.q;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

public class e extends android.support.v4.app.e implements View.OnClickListener {
    public static boolean W0 = false;
    public static boolean X0 = true;
    public static boolean Y0 = false;
    public static boolean Z0 = false;
    public static boolean a1 = false;
    public static boolean b1 = false;
    public static int c1;
    private ImageButton A0;
    XFHorizontalScrollViewForText B0;
    private int C0 = -1;
    private int D0 = -1;
    private int[] E0;
    private int F0 = 0;
    private boolean G0 = false;
    /* access modifiers changed from: private */
    public boolean H0 = false;
    private int I0 = -1;
    private int J0 = 0;
    private boolean K0 = false;
    private int L0 = -1;
    private q M0;
    /* access modifiers changed from: private */
    public Bitmap N0;
    private i O0;
    private j P0;
    /* access modifiers changed from: private */
    public Handler Q0 = new d();
    /* access modifiers changed from: private */
    public boolean R0 = false;
    private j S0;
    /* access modifiers changed from: private */
    public p T0;
    private int U0;
    /* access modifiers changed from: private */
    public b.b.d.c V0;
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
    public XFTPV3H3MainFragmentActivity h0;
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
            e.this.h0.Q();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            e.this.e2();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            e.this.g2();
        }
    }

    class d extends Handler {
        d() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                e.this.g2();
                b.c.a.a.d.b.q = true;
            } else if (i != 4095) {
                switch (i) {
                    case 0:
                        e.this.o3();
                        return;
                    case 1:
                        e.this.r3();
                        return;
                    case 2:
                        e.this.l2();
                        return;
                    case 3:
                        e.this.k2();
                        return;
                    case 4:
                        d0.t().J((b.b.e.a.a) message.obj);
                        return;
                    case 5:
                        e.this.p2((b.b.e.a.b) message.obj);
                        return;
                    case 6:
                        e.this.g3();
                        return;
                    case 7:
                        d0.t().K();
                        return;
                    default:
                        switch (i) {
                            case 9:
                                e.this.U2();
                                return;
                            case 10:
                                e.this.b2();
                                return;
                            case 11:
                                e.this.m2();
                                return;
                            case 12:
                                e.this.q2();
                                return;
                            case 13:
                                e.this.n3();
                                return;
                            case com.google.android.exoplayer2.ui.g.H:
                                break;
                            case com.google.android.exoplayer2.ui.g.I:
                                e.this.C2();
                                return;
                            case 16:
                                e.this.V2();
                                return;
                            case 17:
                                boolean unused = e.this.H0 = false;
                                return;
                            case 18:
                                e.this.W2();
                                return;
                            default:
                                switch (i) {
                                    case 45057:
                                        e.this.o2();
                                        return;
                                    case 45058:
                                        e.this.n2();
                                        return;
                                    case 45059:
                                        e.this.d2();
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
            } else {
                boolean unused2 = e.this.R0 = false;
                return;
            }
            e.this.q3();
        }
    }

    /* renamed from: com.xforce.v5.xdvpro.ui.V3H3.e$e  reason: collision with other inner class name */
    class C0051e implements XFHorizontalScrollViewForText.c {
        C0051e() {
        }

        public void a(int i, View view, int i2) {
            if (e.Z0 || e.a1 || e.Y0 || e.b1) {
                e.this.k3();
            } else {
                e.this.x3(i2);
            }
        }
    }

    class f implements AdapterView.OnItemClickListener {
        f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            c0.a(0, "XFTPV3H3ShowVideoFragment", "popwindow onclick i:" + i);
            if (e.Z0 || e.a1 || e.Y0 || e.b1) {
                e.this.k3();
                return;
            }
            String c = e.this.V0.c();
            byte[] bArr = null;
            try {
                bArr = c.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            c0.a(0, "XFTPV3H3ShowVideoFragment", "itemStr:" + c + " mode_dv:" + 8 + " i:" + i);
            d0.t().J(new b.b.e.a.a(d0.t().q(), 1615, com.rp.rptool.util.p.a(8, i, bArr), com.rp.rptool.util.p.b()));
            e.this.f3();
            e.this.T0.dismiss();
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            if (e.c1 / 4 == 1) {
                if (e.this.H0) {
                    c0.a(0, "XFTPV3H3ShowVideoFragment", "capture isLock~~~~~~!");
                } else if (e.Z0 || e.a1) {
                    e.this.k3();
                } else if (!e.this.a2()) {
                    e.this.i3();
                } else {
                    e.this.i2();
                    d0.t().x(new b.b.e.a.a(d0.t().q(), 1632, (byte[]) null, 0));
                    boolean unused = e.this.H0 = true;
                    e.this.Q0.sendEmptyMessageDelayed(17, 1500);
                    if (e.c1 == 6) {
                        e.this.j3();
                    }
                }
            } else if (e.Y0) {
                e.this.k3();
            } else if (!e.Z0 && !e.this.a2()) {
                e.this.i3();
            } else if (!e.Z0 && !e.this.Y1()) {
                n.g(e.this.g(), e.this.y().getString(R.string.dev_storage_limit));
            } else if (!e.this.R0) {
                boolean unused2 = e.this.R0 = true;
                e.this.Q0.sendEmptyMessageDelayed(4095, 2000);
                d0.t().p().q(b.c.a.a.d.b.r(d0.t().p().f()));
                e.this.Y2(d0.t().p().f());
                e.this.y2();
            }
        }
    }

    class h implements RPVideoViewHelper.c {
        h() {
        }

        public void a() {
            c0.a(0, "XFTPV3H3ShowVideoFragment", "videoViewEnd()");
            e.W0 = false;
            boolean unused = e.this.n0 = false;
        }

        public void b() {
            e eVar = e.this;
            Bitmap unused = eVar.N0 = eVar.f0.getShotCut();
        }

        public void c() {
            c0.a(0, "XFTPV3H3ShowVideoFragment", "videoViewShow()");
            e.this.Q0.sendEmptyMessage(100);
            e.W0 = true;
            boolean unused = e.this.m0 = false;
        }

        public void d() {
        }
    }

    private void A2() {
        this.Q0.sendEmptyMessage(45058);
    }

    private void B2() {
        this.Q0.sendEmptyMessage(45057);
    }

    /* access modifiers changed from: private */
    public void C2() {
        int i;
        c0.a(0, "XFTPV3H3ShowVideoFragment", "refreshTakePhoto()");
        if (c1 == 7) {
            int i2 = this.E0[6];
            i = Integer.parseInt(Pattern.compile("[^0-9]").matcher(b.b.d.b.e().i(8, 6).a().get(i2)).replaceAll(""));
        } else {
            i = 0;
        }
        if (Y0) {
            if (this.Q0.hasMessages(11)) {
                this.Q0.removeMessages(11);
            }
            q qVar = this.M0;
            if (qVar != null && qVar.isShowing()) {
                this.M0.d(0);
            }
            if (this.s0.getVisibility() != 8) {
                this.s0.setVisibility(8);
            }
            this.J0 = 0;
            this.I0 = -1;
            Y0 = false;
            V2();
            d0.t().w(1607, 1);
            return;
        }
        this.K0 = true;
        this.I0 = -1;
        this.J0 = 0;
        if (i == 0) {
            Y0 = false;
            i2();
            d0.t().w(1607, 1);
            V2();
            return;
        }
        Y0 = true;
        q qVar2 = this.M0;
        if (qVar2 != null && qVar2.isShowing()) {
            this.M0.d(1);
        }
        if (i > 0) {
            this.I0 = i;
            this.K0 = true;
        }
        int i3 = this.I0;
        if (i3 != -1) {
            this.J0 = i3;
            m3();
        }
    }

    private void E2() {
        int i = 0;
        b.b.d.c i2 = b.b.d.b.e().i(8, 0);
        int i3 = c1;
        if (i3 == 0 || i3 == 2) {
            i2 = b.b.d.b.e().i(8, 0);
            int[] iArr = this.E0;
            if (iArr != null && iArr.length > 0) {
                i = iArr[0];
            }
        } else if (i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7) {
            i2 = b.b.d.b.e().i(8, 4);
            int[] iArr2 = this.E0;
            if (iArr2 != null && iArr2.length > 0) {
                i = iArr2[4];
            }
        }
        this.x0.setText(i2.a().get(i));
        this.r0.setText(i2.a().get(i));
    }

    private void F2() {
        int i;
        Resources resources;
        ImageButton imageButton;
        if (c1 / 4 == 1) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r0 != 7) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G2() {
        /*
            r6 = this;
            int[] r0 = r6.E0
            r1 = 7
            r2 = 0
            if (r0 == 0) goto L_0x000c
            int r3 = r0.length
            if (r3 <= 0) goto L_0x000c
            r0 = r0[r1]
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            b.b.d.b r3 = b.b.d.b.e()
            int r4 = c1
            java.lang.String[] r0 = r3.k(r4, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "refreshVideoPorMidParamsModeSelector() data = "
            r3.append(r4)
            java.util.List r4 = java.util.Arrays.asList(r0)
            r3.append(r4)
            java.lang.String r4 = "modev = "
            r3.append(r4)
            int r4 = c1
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "XFTPV3H3ShowVideoFragment"
            com.rp.rptool.util.c0.a(r2, r4, r3)
            android.view.View r3 = r6.i0
            r4 = 2131231009(0x7f080121, float:1.8078087E38)
            android.view.View r3 = r3.findViewById(r4)
            com.xforce.v5.xdvpro.widget.XFHorizontalScrollViewForText r3 = (com.xforce.v5.xdvpro.widget.XFHorizontalScrollViewForText) r3
            r6.B0 = r3
            android.view.View r3 = r6.i0
            r4 = 2131231010(0x7f080122, float:1.8078089E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            com.xforce.v5.xdvpro.widget.XFHorizontalScrollViewForText r4 = r6.B0
            int r5 = r0.length
            r4.d(r3, r5, r0)
            com.xforce.v5.xdvpro.widget.XFHorizontalScrollViewForText r0 = r6.B0
            com.xforce.v5.xdvpro.ui.V3H3.e$e r3 = new com.xforce.v5.xdvpro.ui.V3H3.e$e
            r3.<init>()
            r0.setOnItemClickListener(r3)
            int r0 = c1
            r3 = 2
            if (r0 == 0) goto L_0x0079
            if (r0 == r3) goto L_0x0079
            r4 = 4
            if (r0 == r4) goto L_0x0079
            r4 = 5
            if (r0 == r4) goto L_0x0078
            r4 = 6
            if (r0 == r4) goto L_0x0076
            if (r0 == r1) goto L_0x0078
            goto L_0x0079
        L_0x0076:
            r2 = 1
            goto L_0x0079
        L_0x0078:
            r2 = 2
        L_0x0079:
            com.xforce.v5.xdvpro.widget.XFHorizontalScrollViewForText r0 = r6.B0
            r0.setSelectCount(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.V3H3.e.G2():void");
    }

    private void H2(b.b.e.a.b bVar) {
        r rVar = new r(bVar.a());
        c0.a(0, "XFTPV3H3ShowVideoFragment", "ealen test respChangeWorkMode rtnMsg.value = " + rVar.f958a);
        if (rVar.f958a == 0) {
            new Handler().postDelayed(new c(), 500);
            return;
        }
        c0.a(0, "XFTPV3H3ShowVideoFragment", "respChangeWorkMode() dismissChangeModeLoadingDialog");
        d2();
    }

    private void I2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "sendIOCtrlResp() NAT_CMD_CHECK_TF_CARD_RESP");
        z zVar = new z(bVar.a());
        c0.a(0, "XFTPV3H3ShowVideoFragment", "NAT_CMD_CHECK_TF_CARD_RESP capacity = " + zVar);
        d0.t().p().s((long) zVar.f964b);
        d0.t().p().t((long) zVar.f963a);
    }

    private void J2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "respConnectDevFail() rtnMsg = " + bVar);
        d0.t().p().r(bVar.d());
        this.Q0.sendEmptyMessageDelayed(7, 500);
    }

    private void K2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "respConnectDevSuccess() rtnMsg = " + bVar);
        d0.t().p().r(bVar.d());
        d0.t().z("http://192.168.10.1:8082/tmp/data/.data/sqlite/sunxi.db", b.c.a.a.d.b.f865a);
        V2();
        this.Q0.sendEmptyMessage(0);
    }

    private void L2(w wVar) {
        String str;
        c0.a(0, "XFTPV3H3ShowVideoFragment", "item's respGetAllConfig config = " + wVar.toString());
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
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str = "";
        }
        d0.t().p().o(str);
        y2();
        c3();
        v2();
        w2(0);
        d0.t().w(1607, 1);
        d0.t().C(this.h0);
    }

    private void M2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", " ealen test --- IOTYPE_USER_SDV_GET_MODE_CONFIG_RESP ---");
    }

    private void N2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", " ealen test --- IOTYPE_USER_SDV_GET_MODE_INFO_RESP --- ");
        com.rp.rptool.util.n nVar = new com.rp.rptool.util.n(bVar.a());
        c1 = nVar.f954a;
        c0.a(0, "XFTPV3H3ShowVideoFragment", "mode:" + nVar.f954a + " work_state:" + nVar.f955b + " sdcard_state:" + nVar.c + " battery:" + nVar.d + " remain_video_len:" + nVar.e + " remain_pic_count:" + nVar.f);
        int i = c1;
        if (i == 9 || i == 10) {
            b1 = true;
            if (X0) {
                o.g(this.h0, "设备正处在文件界面，禁止APP的其他操作", false);
            } else {
                Toast.makeText(this.h0, "设备正处在文件界面，禁止APP的其他操作", 0).show();
            }
        } else {
            h2();
        }
    }

    private void O2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "--- IOTYPE_USER_SDV_GET_SYS_CONFIG_REQ ---");
        m mVar = new m(bVar.a());
        c0.a(0, "XFTPV3H3ShowVideoFragment", "mode:" + mVar.f952a + " count:" + mVar.f953b);
        this.E0 = new int[mVar.f953b];
        for (int i = 0; i < mVar.f953b; i++) {
            int i2 = i * 8;
            int b2 = com.rp.rptool.util.b.b(mVar.c, i2);
            short b3 = com.rp.rptool.util.b.b(mVar.c, i2 + 4);
            this.E0[b3] = b2;
            c0.a(0, "XFTPV3H3ShowVideoFragment", "i = " + i + " value = " + b2 + " index = " + b3);
        }
        B2();
        A2();
        d0.t().w(1607, 1);
    }

    private void P2(b.b.e.a.b bVar) {
        bVar.b();
        int i = new r(bVar.a()).f958a;
        c0.a(0, "XFTPV3H3ShowVideoFragment", "NAT_CMD_RECORD_ON_OFF_RESP -- result = " + i);
        if (i != 0) {
            Z0 = false;
            if (X0) {
                o.g(g(), this.Y.getString(R.string.record_error_check_tfcard), false);
            } else {
                Toast.makeText(g(), this.Y.getString(R.string.record_error_check_tfcard), 0).show();
            }
        } else if (Z0) {
            p3();
        } else {
            l3();
        }
    }

    private void Q2(b.b.e.a.b bVar) {
        String str;
        String str2 = "";
        c0.a(0, "XFTPV3H3ShowVideoFragment", "respSearchDevice()");
        if (!d0.t().f933b) {
            this.Q0.sendEmptyMessage(6);
        } else if (bVar.c() / b0.a() == 0) {
            c0.a(3, "XFTPV3H3ShowVideoFragment", "respSearchDevice() returnMsg to num == 0!");
            this.Q0.sendEmptyMessageAtTime(7, 1000);
        } else {
            b0 b0Var = new b0(bVar.a(), 0);
            c0.a(0, "XFTPV3H3ShowVideoFragment", "respSearchDevice() info = " + b0Var);
            try {
                str = new String(b0Var.f925a, "UTF-8").trim();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                c0.a(3, "XFTPV3H3ShowVideoFragment", "respSearchDevice() uid 2 String error!");
                str = str2;
            }
            if (str == null || str2.equals(str)) {
                c0.a(3, "XFTPV3H3ShowVideoFragment", "respSearchDevice() uid null error!");
                return;
            }
            try {
                str2 = new String(b0Var.f926b, "UTF-8").trim();
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                c0.a(0, "XFTPV3H3ShowVideoFragment", "respSearchDevice() ip 2 String error!");
            }
            b.b.e.a.c cVar = new b.b.e.a.c(str, "12345", -1, str2, -1);
            d0.t().P(cVar);
            b.c.a.a.d.b.j(cVar.l());
            X2(cVar.l(), cVar.d());
        }
    }

    private void R2(b.b.e.a.b bVar) {
        com.rp.rptool.util.o oVar = new com.rp.rptool.util.o(bVar.a());
        c0.a(0, "XFTPV3H3ShowVideoFragment", "IOTYPE_USER_SDV_SET_MODE_CONFIG_RESP reslut = " + oVar.f957b + "mode = " + oVar.f956a);
        g2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        com.rp.rptool.util.d0.t().w(1607, 1);
        V2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        com.rp.rptool.util.c0.a(0, "XFTPV3H3ShowVideoFragment", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void S2(b.b.e.a.b r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "XFTPV3H3ShowVideoFragment"
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
            b1 = r0
            int r8 = c1
            if (r8 == r5) goto L_0x0049
            r0 = 10
            if (r8 != r0) goto L_0x011b
        L_0x0049:
            r7.g2()
            goto L_0x011b
        L_0x004e:
            b1 = r6
            goto L_0x011b
        L_0x0052:
            boolean r8 = Y0
            if (r8 != 0) goto L_0x0058
            Y0 = r6
        L_0x0058:
            android.widget.TextView r8 = r7.s0
            int r8 = r8.getVisibility()
            if (r8 != r3) goto L_0x0065
            android.widget.TextView r8 = r7.s0
            r8.setVisibility(r0)
        L_0x0065:
            int r8 = r2.f946b
            if (r8 != r6) goto L_0x006c
            r7.i2()
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
            r7.l3()
            int r8 = r2.f946b
            r7.L0 = r8
            android.widget.TextView r0 = r7.t0
            java.lang.String r8 = r7.s3(r8)
            r0.setText(r8)
            goto L_0x011b
        L_0x00b2:
            r7.p3()
            r7.L0 = r0
        L_0x00b7:
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            r8.w(r4, r6)
            r7.V2()
            goto L_0x011b
        L_0x00c2:
            android.os.Handler r8 = r7.Q0
            boolean r8 = r8.hasMessages(r5)
            if (r8 == 0) goto L_0x00cf
            android.os.Handler r8 = r7.Q0
            r8.removeMessages(r5)
        L_0x00cf:
            android.os.Handler r8 = r7.Q0
            r8.sendEmptyMessage(r5)
            int r8 = c1
            r1 = 5
            if (r8 != r1) goto L_0x00da
            goto L_0x00b7
        L_0x00da:
            r1 = 6
            if (r8 != r1) goto L_0x00e1
            r7.e2()
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
            Y0 = r0
            goto L_0x00b7
        L_0x00f7:
            java.lang.String r8 = "录像卡满啦"
            com.rp.rptool.util.c0.a(r0, r1, r8)
            r7.V2()
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            r8.w(r4, r6)
            r7.Z1()
            r7.i3()
            goto L_0x011b
        L_0x010d:
            r7.Z1()
            java.lang.String r8 = "TF异常-- 拔出TF卡"
            goto L_0x0118
        L_0x0113:
            r7.Z1()
            java.lang.String r8 = "TF异常-- 插入TF卡"
        L_0x0118:
            com.rp.rptool.util.c0.a(r0, r1, r8)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.V3H3.e.S2(b.b.e.a.b):void");
    }

    private void T2(b.b.e.a.b bVar) {
        bVar.b();
        int i = new r(bVar.a()).f958a;
        c0.a(0, "XFTPV3H3ShowVideoFragment", " ------------- ONCLICK POR CAPTURE RESP-------------");
        c0.a(0, "XFTPV3H3ShowVideoFragment", "NAT_CMD_TAKE_PHOTO_RESP -- result = " + i);
        if (i != 0 || c1 == 6) {
            if (i != 0 || c1 != 6) {
                if (X0) {
                    o.g(g(), this.Y.getString(R.string.capture_error_check_tfcard), false);
                } else {
                    Toast.makeText(g(), this.Y.getString(R.string.capture_error_check_tfcard), 0).show();
                }
            }
        } else if (Y0) {
            if (this.s0.getVisibility() != 8) {
                this.s0.setVisibility(8);
            }
            Y0 = false;
            V2();
            d0.t().w(1607, 1);
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void U2() {
        if (this.Q0.hasMessages(10)) {
            this.Q0.removeMessages(10);
        }
        if (this.N0 != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(f2(this.N0));
            c0.a(0, "XFTPV3H3ShowVideoFragment", "ealen test 获取到的缩略图不为空");
            this.y0.setBackground(bitmapDrawable);
        }
    }

    /* access modifiers changed from: private */
    public void V2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "sendBrocastToRefreshDevList()");
        Intent intent = new Intent();
        intent.setAction("refresh_list_filter");
        g().sendBroadcast(intent);
        intent.setAction("local_refresh_list_filter");
        g().sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public void W2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "sendBrocastToRefreshLocalList()");
        Intent intent = new Intent();
        intent.setAction("local_refresh_list_filter");
        g().sendBroadcast(intent);
    }

    private void X2(String str, String str2) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "sendConnectDevice()");
        d0.t().H(str, str2);
    }

    /* access modifiers changed from: private */
    public boolean Y1() {
        return d0.t().p().h() > 103;
    }

    /* access modifiers changed from: private */
    public void Y2(int i) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "setRecordSwitch(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1634, x.a(i), x.b()));
    }

    @Deprecated
    private void Z2(int i) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "setSlowGraphy(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1830, x.a(i), x.b()));
    }

    /* access modifiers changed from: private */
    public boolean a2() {
        return d0.t().p().i() != 0 && d0.t().p().h() > 400;
    }

    private void a3(int i) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "setTakePhoto(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1632, x.a(i), x.b()));
        this.H0 = true;
        this.Q0.sendEmptyMessageDelayed(17, 1500);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void b2() {
        if (this.j0.getVisibility() != 8) {
            this.j0.setVisibility(8);
            this.j0.setBackground((Drawable) null);
        }
    }

    private void b3(int i) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "setTipsView index == " + i);
    }

    private void c2() {
        q qVar;
        if (!X0 && (qVar = this.M0) != null && qVar.isShowing()) {
            this.M0.dismiss();
        }
    }

    private void c3() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "setUIByDevType()");
    }

    /* access modifiers changed from: private */
    public void d2() {
        if (this.Q0.hasMessages(45059)) {
            this.Q0.removeMessages(45059);
        }
        j jVar = this.S0;
        if (jVar != null && jVar.isShowing()) {
            this.S0.dismiss();
        }
    }

    private void d3() {
        this.a0.setBackgroundColor(y().getColor(R.color.black));
        this.c0.setVisibility(8);
        this.a0.setVisibility(0);
        this.q0.setText(this.Y.getString(R.string.offline));
    }

    /* access modifiers changed from: private */
    public void e2() {
        j jVar = this.P0;
        if (jVar != null && jVar.isShowing()) {
            this.P0.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void f3() {
        if (this.S0 == null) {
            this.S0 = new j(this.h0, R.style.confirm_dialog);
        }
        if (!this.S0.isShowing()) {
            this.S0.show();
            this.S0.d(true);
            this.S0.c(this.Y.getString(R.string.please_wait));
            this.S0.setCancelable(false);
        }
        this.Q0.sendEmptyMessageDelayed(45059, 5000);
    }

    /* access modifiers changed from: private */
    public void g2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "ealen test getModeInfo()");
        f3();
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1636, (byte[]) null, 0));
    }

    /* access modifiers changed from: private */
    public void g3() {
        if (this.O0 == null) {
            this.O0 = new i(this.h0, R.style.confirm_dialog);
        }
        this.O0.show();
        this.O0.b(this.Y.getString(R.string.device_connect_overtime));
        this.O0.setCancelable(false);
        this.O0.c(new a());
    }

    private void h2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "ealen test getNowConfig()");
        j2();
    }

    private void h3() {
        q qVar;
        if (!X0 && (qVar = this.M0) != null && qVar.isShowing()) {
            this.M0.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void i2() {
        if (W0) {
            this.f0.goShotCut();
        }
    }

    /* access modifiers changed from: private */
    public void i3() {
        String string = this.Y.getString(d0.t().p().i() == 0 ? R.string.file_dev_has_no_card : R.string.dev_storage_limit);
        if (X0) {
            o.g(this.h0, string, false);
        } else {
            Toast.makeText(this.h0, string, 1).show();
        }
    }

    private void j2() {
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1619, l.a(8), l.b()));
    }

    /* access modifiers changed from: private */
    public void j3() {
        if (this.P0 == null) {
            this.P0 = new j(this.h0, R.style.confirm_dialog);
        }
        this.P0.show();
        this.P0.d(true);
        this.P0.c(this.Y.getString(R.string.motion_capture_loading));
        this.P0.setCancelable(false);
        new Handler().postDelayed(new b(), 10000);
    }

    /* access modifiers changed from: private */
    public void k2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "handleChangeLanscape");
        this.p0.setVisibility(8);
        this.o0.setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: private */
    public void l2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "handleChangePortrait");
        this.p0.setVisibility(0);
        this.o0.setBackgroundColor(-1);
    }

    private void l3() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "startCountingVideo()");
        if (!Z0) {
            i2();
        }
        if (this.u0.getVisibility() != 0) {
            this.u0.setVisibility(0);
            this.t0.setText("00:00");
            this.L0 = 0;
        }
        Z0 = true;
    }

    /* access modifiers changed from: private */
    public void m2() {
        long j;
        Handler handler;
        if (this.s0.getVisibility() != 0) {
            this.s0.setVisibility(0);
        }
        if (this.J0 <= 0) {
            i2();
            if (this.s0.getVisibility() != 8) {
                this.s0.setVisibility(8);
            }
            if (this.K0) {
                if (this.Q0.hasMessages(11)) {
                    this.Q0.removeMessages(11);
                }
                q qVar = this.M0;
                if (qVar != null && qVar.isShowing()) {
                    this.M0.d(0);
                }
                if (this.s0.getVisibility() != 8) {
                    this.s0.setVisibility(8);
                }
                this.J0 = 0;
                this.I0 = -1;
                Y0 = false;
                V2();
                d0.t().w(1607, 1);
                return;
            }
            this.J0 = this.I0;
            handler = this.Q0;
            j = 300;
        } else {
            TextView textView = this.s0;
            textView.setText(this.J0 + "");
            this.J0 = this.J0 - 1;
            handler = this.Q0;
            j = 1000;
        }
        handler.sendEmptyMessageDelayed(11, j);
    }

    private void m3() {
        this.Q0.sendEmptyMessage(11);
    }

    /* access modifiers changed from: private */
    public void n2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "handleRefreshSysTPUI()");
    }

    /* access modifiers changed from: private */
    public void n3() {
        if (!W0 || this.G0) {
            c0.a(0, "XFTPV3H3ShowVideoFragment", "startVideoAnim()");
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
    public void o2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "handleRefreshTPUI()");
        G2();
        F2();
        E2();
        c0.a(0, "XFTPV3H3ShowVideoFragment", "handleRefreshTPUI() dismissChangeModeLoadingDialog");
        d2();
    }

    /* access modifiers changed from: private */
    public void o3() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "startVideoStream()");
        this.Q0.removeMessages(0);
        this.Q0.removeMessages(1);
        if (!W0 && !this.m0 && !this.n0) {
            c0.a(0, "XFTPV3H3ShowVideoFragment", "plr --- isStartVideoStream = " + W0 + " isStartingVideoStream = " + this.m0 + " isStopingVideoStream = " + this.n0);
            if (d0.t().p() == null) {
                c0.a(3, "XFTPV3H3ShowVideoFragment", "startVideoStream device = null");
                return;
            }
            n3();
            this.m0 = true;
            d0.t().L(this.f0);
        } else if (this.n0) {
            this.Q0.sendEmptyMessageDelayed(0, 1000);
        }
    }

    /* access modifiers changed from: private */
    public void p2(b.b.e.a.b bVar) {
        String str;
        c0.a(0, "XFTPV3H3ShowVideoFragment", "handleRefreshUI() --- " + bVar);
        switch (bVar.b()) {
            case 1608:
                I2(bVar);
                return;
            case 1610:
                c0.a(0, "XFTPV3H3ShowVideoFragment", "TF异常 NAT_CMD_TF_CARD_CHANGE_STATUS");
                int i = new r(bVar.a()).f958a;
                if (i == 1) {
                    Z1();
                    str = "TF异常-- 插入TF卡";
                } else if (i == 0) {
                    Z1();
                    str = "TF异常-- 拔出TF卡";
                } else {
                    return;
                }
                c0.a(0, "XFTPV3H3ShowVideoFragment", str);
                return;
            case 1614:
                H2(bVar);
                return;
            case 1616:
                R2(bVar);
                return;
            case 1618:
                M2(bVar);
                return;
            case 1620:
                O2(bVar);
                return;
            case 1633:
                T2(bVar);
                return;
            case 1635:
                P2(bVar);
                return;
            case 1637:
                N2(bVar);
                return;
            case 1638:
                S2(bVar);
                return;
            case 1649:
            case 1665:
            case 1667:
                w2(this.F0);
                return;
            case 1651:
            case 1653:
            case 1669:
            case 1671:
            case 1673:
                v2();
                return;
            case 1815:
                L2(new w(bVar.a()));
                return;
            case 1831:
                int i2 = new r(bVar.a()).f958a;
                c0.a(0, "XFTPV3H3ShowVideoFragment", "NAT_CMD_SET_SLOW_GRAPHY_RESP -- result = " + i2);
                if (i2 == 0) {
                    z2();
                    if (d0.t().p().j() == 1) {
                        l3();
                        return;
                    }
                    i2();
                    p3();
                    d0.t().w(1607, 1);
                    V2();
                    return;
                }
                d0.t().p().u(0);
                z2();
                if (X0) {
                    o.g(g(), this.Y.getString(R.string.slow_record_error_check_tfcard), false);
                    return;
                } else {
                    Toast.makeText(g(), this.Y.getString(R.string.slow_record_error_check_tfcard), 0).show();
                    return;
                }
            case 1834:
                c0.a(0, "XFTPV3H3ShowVideoFragment", "录像卡满啦，NAT_CMD_RECORD_TO_FULL_DISK");
                V2();
                d0.t().w(1607, 1);
                Z1();
                i3();
                return;
            case 1840:
                c0.a(0, "XFTPV3H3ShowVideoFragment", "NAT_CMD_MOTION_TAKE_PHOTO_FINISH 运动轨迹拍照结束返回");
                if (d0.t().s("ml_photo_dramashot") != 0) {
                    V2();
                    d0.t().w(1607, 1);
                    e2();
                    return;
                } else if (c1 == 5) {
                    c0.a(0, "XFTPV3H3ShowVideoFragment", "自动拍照拍完一张返回");
                    if (this.Q0.hasMessages(11)) {
                        this.Q0.removeMessages(11);
                    }
                    this.J0 = this.I0;
                    m3();
                    return;
                } else {
                    return;
                }
            case 12289:
                K2(bVar);
                return;
            case 12290:
                J2(bVar);
                return;
            case 12322:
                Q2(bVar);
                if (this.Q0.hasMessages(7)) {
                    this.Q0.removeMessages(7);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void p3() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "stopCoutingVideo()");
        if (!this.Q0.hasMessages(9)) {
            this.Q0.sendEmptyMessage(9);
        }
        c0.a(0, "XFTPV3H3ShowVideoFragment", "stopCoutingVideo()");
        if (this.u0.getVisibility() != 8) {
            this.u0.setVisibility(8);
            this.t0.setText("00:00");
            this.L0 = 0;
        }
        if (this.Q0.hasMessages(12)) {
            this.Q0.removeMessages(12);
        }
        Z0 = false;
    }

    /* access modifiers changed from: private */
    public void q2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "handleRefreshVideoCounterTxt()");
        this.t0.setText(s3(this.L0));
        this.L0++;
        int s = d0.t().s("ml_record_loop");
        if (s != 0) {
            if (s == 1) {
                s = 120;
            } else if (s == 2) {
                s = 180;
            } else if (s == 3) {
                s = 300;
            }
            if (this.L0 == s) {
                this.L0 = 0;
            }
        }
        this.Q0.sendEmptyMessageDelayed(12, 1000);
    }

    /* access modifiers changed from: private */
    public void q3() {
        if (8 != this.a0.getVisibility()) {
            this.a0.setVisibility(8);
        }
        this.b0.cancel();
        this.G0 = false;
    }

    private void r2() {
        W0 = false;
        this.m0 = false;
        this.n0 = false;
    }

    private void s2() {
        boolean z = b.c.a.a.d.b.p;
    }

    private String s3(int i) {
        int i2 = i / 60;
        int i3 = i2 / 60;
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i2 % 60), Integer.valueOf(i % 60)});
    }

    private void t2() {
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
        this.w0.setVisibility(8);
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
        c0.a(3, "XFTPV3H3ShowVideoFragment", "video view width  = " + i + " height = " + i3);
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
            d3();
            this.h0.A();
            this.Q0.sendEmptyMessage(18);
            return;
        }
        this.Q0.sendEmptyMessage(0);
        this.Q0.sendEmptyMessageDelayed(16, 1500);
    }

    private void t3() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "totalExit()");
        this.Q0.sendEmptyMessageDelayed(1, 1000);
        this.h0.Q();
    }

    private void u3() {
        int i;
        int i2 = c1;
        if (i2 / 4 == 1) {
            this.C0 = i2;
            i = this.D0;
            if (i == -1) {
                i = 0;
                if (this.E0[1] > 0) {
                    i = 2;
                }
            }
        } else {
            this.D0 = i2;
            i = this.C0;
            if (i == -1) {
                i = 4;
            }
        }
        c0.a(3, "XFTPV3H3ShowVideoFragment", "videoPorBtmModeOnClick() mode_dv:" + c1);
        c0.a(3, "XFTPV3H3ShowVideoFragment", "ealen test videoPorBtmModeOnClick() set mode dv:" + i);
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1613, x.a(i), x.b()));
        f3();
    }

    @TargetApi(16)
    @Deprecated
    private void v2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "refreshBtnBackgroundImages()");
        int b2 = b.b.d.d.c().b("ml_record_timelapse");
        int b3 = b.b.d.d.c().b("ml_record_loop");
        if (!X0) {
            this.M0.e(0);
        }
        if (b2 != 0) {
            if (!X0) {
                this.M0.e(1);
            }
        } else if (b3 != 0 && !X0) {
            this.M0.e(2);
        }
        int b4 = b.b.d.d.c().b("ml_photo_timed");
        int b5 = b.b.d.d.c().b("ml_photo_auto");
        int b6 = b.b.d.d.c().b("ml_photo_dramashot");
        if (!X0) {
            this.M0.b(0);
        }
        if (b4 != 0) {
            if (!X0) {
                this.M0.b(1);
            }
        } else if (b5 != 0) {
            if (!X0) {
                this.M0.b(2);
            }
        } else if (b6 != 0 && !X0) {
            this.M0.b(3);
        }
    }

    private void v3() {
        b.b.d.c cVar;
        this.U0 = b.b.d.b.e().c(c1);
        this.V0 = b.b.d.b.e().i(c1, this.U0);
        int i = c1;
        if (i == 0 || i == 2) {
            this.U0 = 0;
            cVar = b.b.d.b.e().i(8, 0);
        } else {
            if (i == 4 || i == 5 || i == 6 || i == 7) {
                this.U0 = 4;
                cVar = b.b.d.b.e().i(8, 4);
            }
            p pVar = new p(this.h0, this.V0.a(), this.E0[this.U0], new f());
            this.T0 = pVar;
            pVar.d(this.x0);
        }
        this.V0 = cVar;
        p pVar2 = new p(this.h0, this.V0.a(), this.E0[this.U0], new f());
        this.T0 = pVar2;
        pVar2.d(this.x0);
    }

    private void w2(int i) {
        String str;
        b.b.d.c cVar;
        String str2;
        d0 d0Var;
        c0.a(0, "XFTPV3H3ShowVideoFragment", "refreshMiddleTipsView tag ==" + i);
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

    private void w3() {
        c0.a(3, "XFTPV3H3ShowVideoFragment", "videoPorBtmStartOnClick() ");
        new Handler().post(new g());
    }

    private void x2(int i) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "refreshPagesView index = " + i);
        b3(i);
        this.F0 = i;
        w2(i);
    }

    /* access modifiers changed from: private */
    public void x3(int i) {
        int i2 = 4;
        int i3 = 0;
        boolean z = c1 < 4;
        if (i == 0) {
            if (z) {
                if (this.E0[1] != 0) {
                    i2 = 2;
                }
            }
            c0.a(3, "XFTPV3H3ShowVideoFragment", "ealen test videoPorMidParamsModeSelectorOnclick() mode_dv:" + i2);
            d0.t().J(new b.b.e.a.a(d0.t().q(), 1613, x.a(i2), x.b()));
            f3();
        } else if (i != 1) {
            if (i == 2 && !z) {
                int[] iArr = this.E0;
                if (iArr != null && iArr.length > 0) {
                    i3 = iArr[7];
                }
                i2 = i3 == 0 ? 7 : 5;
                c0.a(3, "XFTPV3H3ShowVideoFragment", "ealen test videoPorMidParamsModeSelectorOnclick() mode_dv:" + i2);
                d0.t().J(new b.b.e.a.a(d0.t().q(), 1613, x.a(i2), x.b()));
                f3();
            }
        } else if (!z) {
            i2 = 6;
            c0.a(3, "XFTPV3H3ShowVideoFragment", "ealen test videoPorMidParamsModeSelectorOnclick() mode_dv:" + i2);
            d0.t().J(new b.b.e.a.a(d0.t().q(), 1613, x.a(i2), x.b()));
            f3();
        }
        i2 = 0;
        c0.a(3, "XFTPV3H3ShowVideoFragment", "ealen test videoPorMidParamsModeSelectorOnclick() mode_dv:" + i2);
        d0.t().J(new b.b.e.a.a(d0.t().q(), 1613, x.a(i2), x.b()));
        f3();
    }

    /* access modifiers changed from: private */
    public void y2() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "refreshRecordSwitch()");
    }

    @Deprecated
    private void z2() {
        boolean z = false;
        c0.a(0, "XFTPV3H3ShowVideoFragment", "refreshSlowGraphy()");
        if (d0.t().p().j() != 0) {
            z = true;
        }
        a1 = z;
        q qVar = this.M0;
        if (qVar != null && qVar.isShowing()) {
            this.M0.h(d0.t().p().j());
        }
    }

    public void D2(b.b.e.a.b bVar) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "refreshUI() rtnMsg = " + bVar);
        Message obtainMessage = this.Q0.obtainMessage();
        obtainMessage.what = 5;
        obtainMessage.obj = bVar;
        this.Q0.sendMessage(obtainMessage);
    }

    public void Q(int i, int i2, Intent intent) {
        super.Q(i, i2, intent);
        if (i == 1001 && i2 == 1003) {
            t3();
        }
    }

    public void V(Bundle bundle) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "onCreate");
        super.V(bundle);
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "onCreateView");
        this.Y = y();
        if (this.i0 == null) {
            this.i0 = layoutInflater.inflate(R.layout.fragment_showvideo_tp, viewGroup, false);
            this.h0 = (XFTPV3H3MainFragmentActivity) g();
            t2();
            s2();
            r2();
        } else {
            c0.a(0, "XFTPV3H3ShowVideoFragment", "onCreateView view not null");
        }
        ViewGroup viewGroup2 = (ViewGroup) this.i0.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.i0);
        }
        return this.i0;
    }

    public void Z1() {
        if (d0.t().p() != null) {
            if (Z0) {
                d0.t().p().q(0);
                y2();
                p3();
            }
            if (d0.t().s("ml_photo_dramashot") != 0) {
                e2();
            }
            if (Y0) {
                C2();
            }
            if (a1) {
                d0.t().p().u(b.c.a.a.d.b.r(d0.t().p().j()));
                z2();
                p3();
            }
        }
    }

    public void a0() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "onDestroy");
        super.a0();
    }

    public void e3() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "--- settingViewReturn() ---");
        if (Build.VERSION.SDK_INT >= 16) {
            this.y0.setBackground(y().getDrawable(R.drawable.video_por_btm_file));
        } else {
            this.y0.setBackgroundDrawable(y().getDrawable(R.drawable.video_por_btm_file));
        }
        if (!b.c.a.a.d.b.p) {
            f3();
            g2();
        }
    }

    public Bitmap f2(Bitmap bitmap) {
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k3() {
        /*
            r3 = this;
            boolean r0 = Z0
            if (r0 != 0) goto L_0x0016
            boolean r0 = a1
            if (r0 == 0) goto L_0x0009
            goto L_0x0016
        L_0x0009:
            boolean r0 = Y0
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
            boolean r1 = b1
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = "设备正处在文件界面，禁止APP的其他操作"
        L_0x0025:
            boolean r1 = X0
            r2 = 0
            if (r1 == 0) goto L_0x0030
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r1 = r3.h0
            com.xforce.v5.xdvpro.widget.o.g(r1, r0, r2)
            goto L_0x0039
        L_0x0030:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r1 = r3.h0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.V3H3.e.k3():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0240, code lost:
        r9.h0.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0280, code lost:
        r9.R0 = true;
        r9.Q0.sendEmptyMessageDelayed(4095, 2000);
        com.rp.rptool.util.d0.t().p().u(b.c.a.a.d.b.r(com.rp.rptool.util.d0.t().p().j()));
        z2();
        Z2(com.rp.rptool.util.d0.t().p().j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0358, code lost:
        j3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0135, code lost:
        r9.Q0.sendEmptyMessage(8);
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
            boolean r10 = X0
            r0 = 2131492927(0x7f0c003f, float:1.860932E38)
            if (r10 == 0) goto L_0x0023
            android.support.v4.app.f r10 = r9.g()
            android.content.res.Resources r1 = r9.Y
            java.lang.String r0 = r1.getString(r0)
            com.xforce.v5.xdvpro.widget.o.g(r10, r0, r2)
            goto L_0x0032
        L_0x0023:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r10 = r9.h0
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
            boolean r10 = X0
            r0 = 2131492926(0x7f0c003e, float:1.8609318E38)
            if (r10 == 0) goto L_0x0052
            android.support.v4.app.f r10 = r9.g()
            android.content.res.Resources r1 = r9.Y
            java.lang.String r0 = r1.getString(r0)
            com.xforce.v5.xdvpro.widget.o.g(r10, r0, r2)
            goto L_0x0061
        L_0x0052:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r10 = r9.h0
            android.content.res.Resources r1 = r9.Y
            java.lang.String r0 = r1.getString(r0)
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r2)
            r10.show()
        L_0x0061:
            return
        L_0x0062:
            int r10 = r10.getId()
            java.lang.String r0 = "ml_photo_dramashot"
            r1 = 2
            r3 = 2000(0x7d0, double:9.88E-321)
            r5 = 4095(0xfff, float:5.738E-42)
            r6 = 1
            switch(r10) {
                case 2131230987: goto L_0x0321;
                case 2131230988: goto L_0x02d0;
                case 2131230989: goto L_0x02ba;
                case 2131230990: goto L_0x0268;
                case 2131230991: goto L_0x0263;
                case 2131230992: goto L_0x025e;
                case 2131230993: goto L_0x0259;
                default: goto L_0x0071;
            }
        L_0x0071:
            r7 = 8
            java.lang.String r8 = "XFTPV3H3ShowVideoFragment"
            switch(r10) {
                case 2131230998: goto L_0x024b;
                case 2131231022: goto L_0x022e;
                case 2131231025: goto L_0x0227;
                case 2131231027: goto L_0x01fa;
                default: goto L_0x0078;
            }
        L_0x0078:
            switch(r10) {
                case 2131231001: goto L_0x01e1;
                case 2131231002: goto L_0x01bc;
                case 2131231003: goto L_0x019d;
                case 2131231004: goto L_0x0193;
                case 2131231005: goto L_0x0140;
                default: goto L_0x007b;
            }
        L_0x007b:
            switch(r10) {
                case 2131231015: goto L_0x0128;
                case 2131231016: goto L_0x0118;
                default: goto L_0x007e;
            }
        L_0x007e:
            switch(r10) {
                case 2131231019: goto L_0x00a6;
                case 2131231020: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x035b
        L_0x0083:
            boolean r10 = Z0
            if (r10 != 0) goto L_0x00a2
            boolean r10 = Y0
            if (r10 == 0) goto L_0x008c
            goto L_0x00a2
        L_0x008c:
            int r10 = r9.F0
            if (r10 == r1) goto L_0x0093
            r9.x2(r1)
        L_0x0093:
            boolean r10 = r9.a2()
            if (r10 != 0) goto L_0x009d
            r9.i3()
            return
        L_0x009d:
            boolean r10 = r9.R0
            if (r10 == 0) goto L_0x0280
            return
        L_0x00a2:
            r9.k3()
            return
        L_0x00a6:
            boolean r10 = a1
            if (r10 != 0) goto L_0x0114
            boolean r10 = Y0
            if (r10 == 0) goto L_0x00af
            goto L_0x0114
        L_0x00af:
            int r10 = r9.F0
            if (r10 == 0) goto L_0x00b6
            r9.x2(r2)
        L_0x00b6:
            boolean r10 = r9.a2()
            if (r10 != 0) goto L_0x00c0
            r9.i3()
            return
        L_0x00c0:
            boolean r10 = r9.Y1()
            if (r10 != 0) goto L_0x00d9
            android.support.v4.app.f r10 = r9.g()
            android.content.res.Resources r0 = r9.y()
            r1 = 2131492920(0x7f0c0038, float:1.8609306E38)
            java.lang.String r0 = r0.getString(r1)
            com.xforce.v5.xdvpro.widget.n.g(r10, r0)
            return
        L_0x00d9:
            boolean r10 = r9.R0
            if (r10 == 0) goto L_0x00de
            return
        L_0x00de:
            r9.R0 = r6
            android.os.Handler r10 = r9.Q0
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
            r9.Y2(r10)
            r9.y2()
            goto L_0x035b
        L_0x0114:
            r9.k3()
            return
        L_0x0118:
            boolean r10 = Z0
            if (r10 != 0) goto L_0x0124
            boolean r10 = a1
            if (r10 != 0) goto L_0x0124
            boolean r10 = Y0
            if (r10 == 0) goto L_0x0135
        L_0x0124:
            r9.k3()
            return
        L_0x0128:
            boolean r10 = Z0
            if (r10 != 0) goto L_0x013c
            boolean r10 = a1
            if (r10 != 0) goto L_0x013c
            boolean r10 = Y0
            if (r10 == 0) goto L_0x0135
            goto L_0x013c
        L_0x0135:
            android.os.Handler r10 = r9.Q0
            r10.sendEmptyMessage(r7)
            goto L_0x035b
        L_0x013c:
            r9.k3()
            return
        L_0x0140:
            java.lang.String r10 = " ------------- ONCLICK POR CAPTURE -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = r9.H0
            if (r10 == 0) goto L_0x014f
            java.lang.String r10 = "capture isLock~~~~~~!"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            return
        L_0x014f:
            boolean r10 = Z0
            if (r10 != 0) goto L_0x018f
            boolean r10 = a1
            if (r10 == 0) goto L_0x0158
            goto L_0x018f
        L_0x0158:
            int r10 = r9.F0
            if (r10 == r6) goto L_0x015f
            r9.x2(r6)
        L_0x015f:
            boolean r10 = r9.a2()
            if (r10 != 0) goto L_0x0169
            r9.i3()
            return
        L_0x0169:
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            r10.v(r2)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.k()
            r9.a3(r10)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            int r10 = r10.s(r0)
            if (r10 == 0) goto L_0x035b
            goto L_0x0358
        L_0x018f:
            r9.k3()
            return
        L_0x0193:
            java.lang.String r10 = " ------------- ONCLICK POR START -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            r9.w3()
            goto L_0x035b
        L_0x019d:
            java.lang.String r10 = " ------------- ONCLICK POR PARAM -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = Z0
            if (r10 != 0) goto L_0x01b8
            boolean r10 = a1
            if (r10 != 0) goto L_0x01b8
            boolean r10 = Y0
            if (r10 != 0) goto L_0x01b8
            boolean r10 = b1
            if (r10 == 0) goto L_0x01b3
            goto L_0x01b8
        L_0x01b3:
            r9.v3()
            goto L_0x035b
        L_0x01b8:
            r9.k3()
            return
        L_0x01bc:
            java.lang.String r10 = " ------------- ONCLICK POR MODE -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = Z0
            if (r10 != 0) goto L_0x01dd
            boolean r10 = a1
            if (r10 != 0) goto L_0x01dd
            boolean r10 = Y0
            if (r10 != 0) goto L_0x01dd
            int r10 = c1
            r0 = 9
            if (r10 == r0) goto L_0x01dd
            r0 = 10
            if (r10 != r0) goto L_0x01d8
            goto L_0x01dd
        L_0x01d8:
            r9.u3()
            goto L_0x035b
        L_0x01dd:
            r9.k3()
            return
        L_0x01e1:
            java.lang.String r10 = " ------------- ONCLICK POR FILE -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = Z0
            if (r10 != 0) goto L_0x01f6
            boolean r10 = a1
            if (r10 != 0) goto L_0x01f6
            boolean r10 = Y0
            if (r10 != 0) goto L_0x01f6
            boolean r10 = b1
            if (r10 == 0) goto L_0x0240
        L_0x01f6:
            r9.k3()
            return
        L_0x01fa:
            java.lang.String r10 = " ------------- ONCLICK POR TOP SETTING -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = Z0
            if (r10 != 0) goto L_0x0223
            boolean r10 = a1
            if (r10 != 0) goto L_0x0223
            boolean r10 = Y0
            if (r10 != 0) goto L_0x0223
            boolean r10 = b1
            if (r10 == 0) goto L_0x0210
            goto L_0x0223
        L_0x0210:
            int[] r10 = r9.E0
            if (r10 == 0) goto L_0x021f
            int r0 = r10.length
            if (r0 > 0) goto L_0x0218
            goto L_0x021f
        L_0x0218:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r0 = r9.h0
            r0.B(r7, r10)
            goto L_0x035b
        L_0x021f:
            r9.j2()
            return
        L_0x0223:
            r9.k3()
            return
        L_0x0227:
            java.lang.String r10 = " ------------- ONCLICK POR TOP DV SETTING -------------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            goto L_0x035b
        L_0x022e:
            java.lang.String r10 = " ----- video_shotcut -------"
            com.rp.rptool.util.c0.a(r2, r8, r10)
            boolean r10 = Z0
            if (r10 != 0) goto L_0x0247
            boolean r10 = a1
            if (r10 != 0) goto L_0x0247
            boolean r10 = Y0
            if (r10 == 0) goto L_0x0240
            goto L_0x0247
        L_0x0240:
            com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity r10 = r9.h0
            r10.z()
            goto L_0x035b
        L_0x0247:
            r9.k3()
            return
        L_0x024b:
            boolean r10 = b.c.a.a.d.b.p
            if (r10 != 0) goto L_0x035b
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            goto L_0x035b
        L_0x0259:
            r9.x2(r1)
            goto L_0x035b
        L_0x025e:
            r9.x2(r6)
            goto L_0x035b
        L_0x0263:
            r9.x2(r2)
            goto L_0x035b
        L_0x0268:
            boolean r10 = Z0
            if (r10 != 0) goto L_0x02b6
            boolean r10 = Y0
            if (r10 == 0) goto L_0x0271
            goto L_0x02b6
        L_0x0271:
            boolean r10 = r9.a2()
            if (r10 != 0) goto L_0x027b
            r9.i3()
            return
        L_0x027b:
            boolean r10 = r9.R0
            if (r10 == 0) goto L_0x0280
            return
        L_0x0280:
            r9.R0 = r6
            android.os.Handler r10 = r9.Q0
            r10.sendEmptyMessageDelayed(r5, r3)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            int r0 = r0.j()
            int r0 = b.c.a.a.d.b.r(r0)
            r10.u(r0)
            r9.z2()
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.j()
            r9.Z2(r10)
            goto L_0x035b
        L_0x02b6:
            r9.k3()
            return
        L_0x02ba:
            boolean r10 = Z0
            if (r10 != 0) goto L_0x02cc
            boolean r10 = a1
            if (r10 != 0) goto L_0x02cc
            boolean r10 = Y0
            if (r10 == 0) goto L_0x02c7
            goto L_0x02cc
        L_0x02c7:
            r9.h3()
            goto L_0x035b
        L_0x02cc:
            r9.k3()
            return
        L_0x02d0:
            boolean r10 = a1
            if (r10 != 0) goto L_0x031d
            boolean r10 = Y0
            if (r10 == 0) goto L_0x02d9
            goto L_0x031d
        L_0x02d9:
            boolean r10 = r9.a2()
            if (r10 != 0) goto L_0x02e3
            r9.i3()
            return
        L_0x02e3:
            boolean r10 = r9.R0
            if (r10 == 0) goto L_0x02e8
            return
        L_0x02e8:
            r9.R0 = r6
            android.os.Handler r10 = r9.Q0
            r10.sendEmptyMessageDelayed(r5, r3)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r0 = r0.p()
            int r0 = r0.f()
            int r0 = b.c.a.a.d.b.r(r0)
            r10.q(r0)
            r9.y2()
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.f()
            r9.Y2(r10)
            goto L_0x035b
        L_0x031d:
            r9.k3()
            return
        L_0x0321:
            boolean r10 = Z0
            if (r10 != 0) goto L_0x035c
            boolean r10 = a1
            if (r10 == 0) goto L_0x032a
            goto L_0x035c
        L_0x032a:
            boolean r10 = r9.a2()
            if (r10 != 0) goto L_0x0334
            r9.i3()
            return
        L_0x0334:
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            r10.v(r2)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r10 = r10.p()
            int r10 = r10.k()
            r9.a3(r10)
            com.rp.rptool.util.d0 r10 = com.rp.rptool.util.d0.t()
            int r10 = r10.s(r0)
            if (r10 == 0) goto L_0x035b
        L_0x0358:
            r9.j3()
        L_0x035b:
            return
        L_0x035c:
            r9.k3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.V3H3.e.onClick(android.view.View):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c2();
        int i = configuration.orientation;
        if (i == 2) {
            X0 = false;
            this.Z.setLayoutParams(this.d0);
            this.a0.setLayoutParams(this.d0);
            this.j0.setLayoutParams(this.k0);
            WindowManager.LayoutParams attributes = this.h0.getWindow().getAttributes();
            attributes.flags |= 1024;
            this.h0.getWindow().setAttributes(attributes);
            this.h0.getWindow().addFlags(512);
            this.Q0.sendEmptyMessage(3);
        } else if (i == 1) {
            X0 = true;
            this.Z.setLayoutParams(this.e0);
            this.a0.setLayoutParams(this.e0);
            this.j0.setLayoutParams(this.l0);
            WindowManager.LayoutParams attributes2 = this.h0.getWindow().getAttributes();
            attributes2.flags &= -1025;
            this.h0.getWindow().setAttributes(attributes2);
            this.h0.getWindow().clearFlags(512);
            this.Q0.sendEmptyMessage(2);
            if (!Z0 && !a1) {
                this.Q0.sendEmptyMessageDelayed(8, 1000);
            }
        }
        if (!b.c.a.a.d.b.p) {
            this.G0 = true;
            this.Q0.sendEmptyMessage(13);
            this.Q0.sendEmptyMessageDelayed(14, 1000);
        }
    }

    public void p0() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "onResume");
        if (!b.c.a.a.d.b.p) {
            this.Q0.sendEmptyMessage(0);
        }
        super.p0();
    }

    public void r3() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "stopVideoStream()");
        this.Q0.removeMessages(0);
        this.Q0.removeMessages(1);
        if (W0) {
            if (d0.t().p() == null) {
                c0.a(3, "XFTPV3H3ShowVideoFragment", "stopVideoStream CCGlobal.device == null!");
                this.Q0.sendEmptyMessageDelayed(1, 500);
                return;
            }
            W0 = false;
            this.n0 = true;
            d0.t().M();
        } else if (this.m0) {
            this.Q0.sendEmptyMessageDelayed(1, 1000);
        }
    }

    public void s0() {
        c0.a(0, "XFTPV3H3ShowVideoFragment", "onStop");
        c0.a(0, "XFTPV3H3ShowVideoFragment", "is offlinemode + " + b.c.a.a.d.b.p);
        super.s0();
    }

    public boolean u2() {
        return X0;
    }
}
