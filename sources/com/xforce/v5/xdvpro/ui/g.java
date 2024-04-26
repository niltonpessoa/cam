package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.e;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
import com.rp.rptool.util.w;
import com.rp.rptool.util.x;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.h;
import com.xforce.v5.xdvpro.widget.i;
import com.xforce.v5.xdvpro.widget.j;
import com.xforce.v5.xdvpro.widget.n;
import com.xforce.v5.xdvpro.widget.o;
import com.xforce.v5.xdvpro.widget.q;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class g extends e implements View.OnClickListener {
    public static boolean h1 = false;
    public static boolean i1 = true;
    public static boolean j1 = false;
    public static boolean k1 = false;
    public static boolean l1 = false;
    private ViewPager A0;
    private ArrayList<e> B0;
    private RelativeLayout C0;
    private LinearLayout D0;
    private ImageView E0;
    private ImageView F0;
    private ImageView G0;
    private ImageView H0;
    private d I0;
    private c J0;
    private e K0;
    private int L0 = 0;
    private boolean M0 = false;
    /* access modifiers changed from: private */
    public boolean N0 = false;
    private int O0 = -1;
    private int P0 = 0;
    private boolean Q0 = false;
    private int R0 = -1;
    private q S0;
    private RelativeLayout T0;
    private ImageView U0;
    private ViewPager V0;
    private TextView W0;
    private TextView X0;
    private Resources Y;
    private TextView Y0;
    private RelativeLayout Z;
    private d Z0;
    private LinearLayout a0;
    private c a1;
    private Animation b0;
    private e b1;
    private ImageView c0;
    /* access modifiers changed from: private */
    public Bitmap c1;
    private RelativeLayout.LayoutParams d0;
    private i d1;
    private RelativeLayout.LayoutParams e0;
    private j e1;
    /* access modifiers changed from: private */
    public RPVideoViewHelper f0;
    /* access modifiers changed from: private */
    public Handler f1 = new b();
    private d g0;
    /* access modifiers changed from: private */
    public boolean g1 = false;
    /* access modifiers changed from: private */
    public X1MainFragmentActivity h0;
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
    private ImageButton r0;
    private RelativeLayout s0;
    private ImageButton t0;
    private ImageButton u0;
    private ImageButton v0;
    private TextView w0;
    private TextView x0;
    private TextView y0;
    private LinearLayout z0;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            g.this.h0.O();
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                b.c.a.a.d.b.q = true;
            } else if (i != 4095) {
                switch (i) {
                    case 0:
                        g.this.L2();
                        return;
                    case 1:
                        g.this.O2();
                        return;
                    case 2:
                        g.this.S1();
                        return;
                    case 3:
                        g.this.R1();
                        return;
                    case 4:
                        d0.t().J((b.b.e.a.a) message.obj);
                        return;
                    case 5:
                        g.this.U1((b.b.e.a.b) message.obj);
                        return;
                    case 6:
                        g.this.A2();
                        return;
                    case 7:
                        d0.t().K();
                        return;
                    case 8:
                        g.this.F2();
                        return;
                    case 9:
                        g.this.o2();
                        return;
                    case 10:
                        g.this.L1();
                        return;
                    case 11:
                        g.this.T1();
                        return;
                    case 12:
                        g.this.V1();
                        return;
                    case 13:
                        g.this.K2();
                        return;
                    case com.google.android.exoplayer2.ui.g.H:
                        break;
                    case com.google.android.exoplayer2.ui.g.I:
                        g.this.i2();
                        return;
                    case 16:
                        g.this.p2();
                        return;
                    case 17:
                        boolean unused = g.this.N0 = false;
                        return;
                    case 18:
                        g.this.q2();
                        return;
                    default:
                        return;
                }
            } else {
                boolean unused2 = g.this.g1 = false;
                return;
            }
            g.this.N2();
        }
    }

    public class c implements ViewPager.j {
        public c() {
        }

        public void a(int i, float f, int i2) {
        }

        public void b(int i) {
        }

        public void c(int i) {
            c0.a(0, "X1ShowVideoFragment", "onPageSelected() arg0 = " + i);
            g.this.e2(i);
        }
    }

    class d implements RPVideoViewHelper.c {
        d() {
        }

        public void a() {
            c0.a(0, "X1ShowVideoFragment", "videoViewEnd()");
            g.h1 = false;
            boolean unused = g.this.n0 = false;
        }

        public void b() {
            g gVar = g.this;
            Bitmap unused = gVar.c1 = gVar.f0.getShotCut();
            g.this.f1.sendEmptyMessage(9);
        }

        public void c() {
            c0.a(0, "X1ShowVideoFragment", "videoViewShow()");
            g.this.f1.sendEmptyMessage(100);
            g.h1 = true;
            boolean unused = g.this.m0 = false;
        }

        public void d() {
        }
    }

    /* access modifiers changed from: private */
    public void A2() {
        if (this.d1 == null) {
            this.d1 = new i(this.h0, R.style.confirm_dialog);
        }
        this.d1.show();
        this.d1.b(this.Y.getString(R.string.device_connect_overtime));
        this.d1.setCancelable(false);
        this.d1.c(new a());
    }

    private void B2() {
        int i;
        q qVar;
        if (!i1) {
            if (this.S0 == null) {
                this.S0 = new q(g(), R.style.video_lanopt_dialog);
            }
            if (!this.S0.isShowing()) {
                this.S0.show();
                c2();
                this.S0.c(this);
                this.S0.f(this);
                this.S0.i(this);
                this.S0.g(d0.t().p().f());
                this.S0.h(d0.t().p().j());
                if (j1) {
                    qVar = this.S0;
                    i = 1;
                } else {
                    qVar = this.S0;
                    i = 0;
                }
                qVar.d(i);
            }
        }
    }

    private void C2() {
        if (!i1) {
            q qVar = this.S0;
            if (qVar != null && qVar.isShowing()) {
                this.S0.dismiss();
            }
            if (this.T0 == null) {
                this.T0 = (RelativeLayout) this.i0.findViewById(R.id.video_lan_view);
                this.V0 = (ViewPager) this.i0.findViewById(R.id.video_lan_bottom_viewpager);
                ImageView imageView = (ImageView) this.i0.findViewById(R.id.video_lan_top_rl);
                this.U0 = imageView;
                imageView.setOnClickListener(this);
                TextView textView = (TextView) this.i0.findViewById(R.id.video_lan_opt_tips_1);
                this.W0 = textView;
                textView.setOnClickListener(this);
                TextView textView2 = (TextView) this.i0.findViewById(R.id.video_lan_opt_tips_2);
                this.X0 = textView2;
                textView2.setOnClickListener(this);
                TextView textView3 = (TextView) this.i0.findViewById(R.id.video_lan_opt_tips_3);
                this.Y0 = textView3;
                textView3.setOnClickListener(this);
                ArrayList arrayList = new ArrayList();
                d dVar = new d();
                this.Z0 = dVar;
                dVar.v1(this);
                c cVar = new c();
                this.a1 = cVar;
                cVar.w1(this);
                e eVar = new e();
                this.b1 = eVar;
                eVar.l1(this);
                arrayList.add(this.Z0);
                arrayList.add(this.a1);
                arrayList.add(this.b1);
                this.V0.setOffscreenPageLimit(3);
                this.V0.setAdapter(new h(l(), arrayList));
                this.V0.setCurrentItem(0);
                this.V0.setOnPageChangeListener(new c());
            }
            if (this.T0.getVisibility() != 0) {
                this.T0.setVisibility(0);
                if (this.L0 != this.V0.getCurrentItem()) {
                    this.V0.setCurrentItem(this.L0);
                }
            }
        }
    }

    private void D2() {
        String string = this.Y.getString(d0.t().p().i() == 0 ? R.string.file_dev_has_no_card : R.string.dev_storage_limit);
        if (i1) {
            o.g(this.h0, string, false);
        } else {
            Toast.makeText(this.h0, string, 1).show();
        }
    }

    private void E2() {
        if (this.e1 == null) {
            this.e1 = new j(this.h0, R.style.confirm_dialog);
        }
        this.e1.show();
        this.e1.d(true);
        this.e1.c(this.Y.getString(R.string.motion_capture_loading));
        this.e1.setCancelable(false);
    }

    /* access modifiers changed from: private */
    public void F2() {
        if (this.C0.getVisibility() == 0) {
            s2(1);
            this.C0.setVisibility(8);
            this.F0.setVisibility(8);
            this.G0.setVisibility(8);
            this.H0.setVisibility(8);
            this.E0.setVisibility(0);
            return;
        }
        this.C0.setVisibility(0);
        s2(this.L0);
        this.F0.setVisibility(0);
        this.G0.setVisibility(0);
        this.H0.setVisibility(0);
        this.E0.setVisibility(8);
    }

    private void H2() {
        if (this.C0.getVisibility() != 0) {
            this.C0.setVisibility(0);
            s2(this.L0);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            this.H0.setVisibility(0);
            this.E0.setVisibility(8);
        }
    }

    private boolean I1() {
        return d0.t().p().h() > 103;
    }

    private void I2() {
        c0.a(0, "X1ShowVideoFragment", "startCountingVideo()");
        this.R0 = 0;
        if (this.z0.getVisibility() != 0) {
            this.z0.setVisibility(0);
        }
        this.f1.sendEmptyMessageDelayed(12, 1000);
    }

    private void J2() {
        this.f1.sendEmptyMessage(11);
    }

    private boolean K1() {
        return d0.t().p().i() != 0 && d0.t().p().h() > 200;
    }

    /* access modifiers changed from: private */
    public void K2() {
        if (!h1 || this.M0) {
            c0.a(0, "X1ShowVideoFragment", "startVideoAnim()");
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
    @SuppressLint({"NewApi"})
    public void L1() {
        if (this.j0.getVisibility() != 8) {
            this.j0.setVisibility(8);
            this.j0.setBackground((Drawable) null);
        }
    }

    /* access modifiers changed from: private */
    public void L2() {
        c0.a(0, "X1ShowVideoFragment", "startVideoStream()");
        this.f1.removeMessages(0);
        this.f1.removeMessages(1);
        if (!h1 && !this.m0 && !this.n0) {
            c0.a(0, "X1ShowVideoFragment", "plr --- isStartVideoStream = " + h1 + " isStartingVideoStream = " + this.m0 + " isStopingVideoStream = " + this.n0);
            if (d0.t().p() == null) {
                c0.a(3, "X1ShowVideoFragment", "startVideoStream device = null");
                return;
            }
            K2();
            this.m0 = true;
            d0.t().L(this.f0);
        } else if (this.n0) {
            this.f1.sendEmptyMessageDelayed(0, 1000);
        }
    }

    private void M1() {
        if (!i1) {
            q qVar = this.S0;
            if (qVar != null && qVar.isShowing()) {
                this.S0.dismiss();
            }
            N1();
        }
    }

    private void M2() {
        c0.a(0, "X1ShowVideoFragment", "stopCoutingVideo()");
        if (this.z0.getVisibility() != 8) {
            this.z0.setVisibility(8);
        }
        if (this.f1.hasMessages(12)) {
            this.f1.removeMessages(12);
        }
        this.y0.setText(P2(0));
    }

    private void N1() {
        RelativeLayout relativeLayout = this.T0;
        if (relativeLayout != null && 8 != relativeLayout.getVisibility()) {
            this.T0.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void N2() {
        if (8 != this.a0.getVisibility()) {
            this.a0.setVisibility(8);
        }
        this.b0.cancel();
        this.M0 = false;
    }

    private void O1() {
        j jVar = this.e1;
        if (jVar != null && jVar.isShowing()) {
            this.e1.dismiss();
        }
    }

    private void P1() {
        c0.a(0, "X1ShowVideoFragment", "getAllConfig()");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1814, (byte[]) null, 0));
    }

    private String P2(int i) {
        int i2 = i / 60;
        int i3 = i2 / 60;
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i2 % 60), Integer.valueOf(i % 60)});
    }

    private void Q1() {
        this.f0.goShotCut();
    }

    private void Q2() {
        c0.a(0, "X1ShowVideoFragment", "totalExit()");
        this.f1.sendEmptyMessageDelayed(1, 1000);
        this.h0.O();
    }

    /* access modifiers changed from: private */
    public void R1() {
        c0.a(0, "X1ShowVideoFragment", "handleChangeLanscape");
        this.p0.setVisibility(8);
        this.s0.setVisibility(8);
        this.o0.setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: private */
    public void S1() {
        c0.a(0, "X1ShowVideoFragment", "handleChangePortrait");
        if (this.L0 != this.A0.getCurrentItem()) {
            this.A0.setCurrentItem(this.L0);
        }
        this.p0.setVisibility(0);
        this.s0.setVisibility(0);
        this.o0.setBackgroundColor(-1);
    }

    /* access modifiers changed from: private */
    public void T1() {
        if (this.x0.getVisibility() != 0) {
            this.x0.setVisibility(0);
        }
        if (this.P0 <= 0) {
            Q1();
            if (this.x0.getVisibility() != 8) {
                this.x0.setVisibility(8);
            }
            if (this.Q0) {
                if (this.f1.hasMessages(11)) {
                    this.f1.removeMessages(11);
                }
                this.t0.setSelected(false);
                q qVar = this.S0;
                if (qVar != null && qVar.isShowing()) {
                    this.S0.d(0);
                }
                if (this.x0.getVisibility() != 8) {
                    this.x0.setVisibility(8);
                }
                if (i1) {
                    H2();
                }
                this.P0 = 0;
                this.O0 = -1;
                j1 = false;
                p2();
                d0.t().w(1607, 1);
                return;
            }
            return;
        }
        TextView textView = this.x0;
        textView.setText(this.P0 + "");
        this.P0 = this.P0 - 1;
        this.f1.sendEmptyMessageDelayed(11, 1000);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0107, code lost:
        if (r8 != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0166, code lost:
        I2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0176, code lost:
        com.rp.rptool.util.d0.t().w(1607, 1);
        p2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0195, code lost:
        if (r8 != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0197, code lost:
        com.xforce.v5.xdvpro.widget.o.g(g(), r7.Y.getString(r0), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01a6, code lost:
        android.widget.Toast.makeText(g(), r7.Y.getString(r0), 0).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0226, code lost:
        if (r8 != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U1(b.b.e.a.b r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleRefreshUI() --- "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r2 = "X1ShowVideoFragment"
            com.rp.rptool.util.c0.a(r1, r2, r0)
            int r0 = r8.b()
            java.lang.String r3 = "ml_photo_dramashot"
            r4 = 1607(0x647, float:2.252E-42)
            r5 = 1
            switch(r0) {
                case 1608: goto L_0x024d;
                case 1610: goto L_0x022a;
                case 1633: goto L_0x01b9;
                case 1635: goto L_0x012f;
                case 1649: goto L_0x0128;
                case 1651: goto L_0x0123;
                case 1653: goto L_0x0123;
                case 1665: goto L_0x0119;
                case 1667: goto L_0x0128;
                case 1669: goto L_0x0123;
                case 1671: goto L_0x0123;
                case 1673: goto L_0x0123;
                case 1815: goto L_0x010b;
                case 1831: goto L_0x00b8;
                case 1834: goto L_0x00a1;
                case 1840: goto L_0x0042;
                case 12289: goto L_0x003d;
                case 12290: goto L_0x0038;
                case 12322: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x028b
        L_0x0025:
            r7.n2(r8)
            android.os.Handler r8 = r7.f1
            r0 = 7
            boolean r8 = r8.hasMessages(r0)
            if (r8 == 0) goto L_0x028b
            android.os.Handler r8 = r7.f1
            r8.removeMessages(r0)
            goto L_0x028b
        L_0x0038:
            r7.k2(r8)
            goto L_0x028b
        L_0x003d:
            r7.l2(r8)
            goto L_0x028b
        L_0x0042:
            java.lang.String r8 = "NAT_CMD_MOTION_TAKE_PHOTO_FINISH 运动轨迹拍照结束返回"
            com.rp.rptool.util.c0.a(r1, r2, r8)
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            int r8 = r8.s(r3)
            if (r8 == 0) goto L_0x0060
            r7.p2()
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            r8.w(r4, r5)
            r7.O1()
            goto L_0x028b
        L_0x0060:
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            java.lang.String r0 = "ml_photo_auto"
            int r8 = r8.s(r0)
            if (r8 == 0) goto L_0x028b
            java.lang.String r8 = "自动拍照拍完一张返回"
            com.rp.rptool.util.c0.a(r1, r2, r8)
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            int r8 = r8.s(r0)
            b.b.d.b r0 = b.b.d.b.e()
            b.b.d.c r0 = r0.b()
            java.util.List r0 = r0.a()
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.length()
            int r0 = r0 - r5
            java.lang.String r8 = r8.substring(r1, r0)
            int r8 = java.lang.Integer.parseInt(r8)
            r7.O0 = r8
            r7.P0 = r8
            r7.J2()
            goto L_0x028b
        L_0x00a1:
            java.lang.String r8 = "录像卡满啦，NAT_CMD_RECORD_TO_FULL_DISK"
            com.rp.rptool.util.c0.a(r1, r2, r8)
            r7.p2()
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            r8.w(r4, r5)
            r7.J1()
            r7.D2()
            goto L_0x028b
        L_0x00b8:
            com.rp.rptool.util.r r0 = new com.rp.rptool.util.r
            byte[] r8 = r8.a()
            r0.<init>(r8)
            int r8 = r0.f958a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "NAT_CMD_SET_SLOW_GRAPHY_RESP -- result = "
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.rp.rptool.util.c0.a(r1, r2, r0)
            if (r8 != 0) goto L_0x00f4
            r7.g2()
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r8 = r8.p()
            int r8 = r8.j()
            if (r8 != r5) goto L_0x00ec
            goto L_0x0166
        L_0x00ec:
            r7.Q1()
            r7.M2()
            goto L_0x0176
        L_0x00f4:
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r8 = r8.p()
            r8.u(r1)
            r7.g2()
            boolean r8 = i1
            r0 = 2131493144(0x7f0c0118, float:1.860976E38)
            if (r8 == 0) goto L_0x01a6
            goto L_0x0197
        L_0x010b:
            com.rp.rptool.util.w r0 = new com.rp.rptool.util.w
            byte[] r8 = r8.a()
            r0.<init>(r8)
            r7.m2(r0)
            goto L_0x028b
        L_0x0119:
            int r8 = r7.L0
            r7.d2(r8)
            r7.h2()
            goto L_0x028b
        L_0x0123:
            r7.c2()
            goto L_0x028b
        L_0x0128:
            int r8 = r7.L0
            r7.d2(r8)
            goto L_0x028b
        L_0x012f:
            com.rp.rptool.util.r r0 = new com.rp.rptool.util.r
            byte[] r8 = r8.a()
            r0.<init>(r8)
            int r8 = r0.f958a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "NAT_CMD_RECORD_ON_OFF_RESP -- result = "
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.rp.rptool.util.c0.a(r1, r2, r0)
            if (r8 != 0) goto L_0x0182
            r7.f2()
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r8 = r8.p()
            int r8 = r8.f()
            if (r8 != r5) goto L_0x016b
            java.lang.String r8 = "NAT_CMD_RECORD_ON_OFF_RESP  -- is recording!"
            com.rp.rptool.util.c0.a(r1, r2, r8)
        L_0x0166:
            r7.I2()
            goto L_0x028b
        L_0x016b:
            java.lang.String r8 = "NAT_CMD_RECORD_ON_OFF_RESP  -- is closing recording!"
            com.rp.rptool.util.c0.a(r1, r2, r8)
            r7.M2()
            r7.Q1()
        L_0x0176:
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            r8.w(r4, r5)
            r7.p2()
            goto L_0x028b
        L_0x0182:
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r8 = r8.p()
            r8.q(r1)
            r7.f2()
            boolean r8 = i1
            r0 = 2131493069(0x7f0c00cd, float:1.8609608E38)
            if (r8 == 0) goto L_0x01a6
        L_0x0197:
            android.support.v4.app.f r8 = r7.g()
            android.content.res.Resources r2 = r7.Y
            java.lang.String r0 = r2.getString(r0)
            com.xforce.v5.xdvpro.widget.o.g(r8, r0, r1)
            goto L_0x028b
        L_0x01a6:
            android.support.v4.app.f r8 = r7.g()
            android.content.res.Resources r2 = r7.Y
            java.lang.String r0 = r2.getString(r0)
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r1)
            r8.show()
            goto L_0x028b
        L_0x01b9:
            com.rp.rptool.util.r r0 = new com.rp.rptool.util.r
            byte[] r8 = r8.a()
            r0.<init>(r8)
            int r8 = r0.f958a
            java.lang.String r0 = " ------------- ONCLICK POR CAPTURE RESP-------------"
            com.rp.rptool.util.c0.a(r1, r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "NAT_CMD_TAKE_PHOTO_RESP -- result = "
            r0.append(r6)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.rp.rptool.util.c0.a(r1, r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Motion_pictures = "
            r0.append(r6)
            com.rp.rptool.util.d0 r6 = com.rp.rptool.util.d0.t()
            int r6 = r6.s(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.rp.rptool.util.c0.a(r1, r2, r0)
            if (r8 != 0) goto L_0x020a
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            int r0 = r0.s(r3)
            if (r0 != 0) goto L_0x020a
            r7.i2()
            goto L_0x028b
        L_0x020a:
            if (r8 != 0) goto L_0x0221
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            int r8 = r8.s(r3)
            if (r8 == 0) goto L_0x0221
            r7.p2()
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            r8.w(r4, r5)
            goto L_0x028b
        L_0x0221:
            boolean r8 = i1
            r0 = 2131492898(0x7f0c0022, float:1.860926E38)
            if (r8 == 0) goto L_0x01a6
            goto L_0x0197
        L_0x022a:
            java.lang.String r0 = "TF异常 NAT_CMD_TF_CARD_CHANGE_STATUS"
            com.rp.rptool.util.c0.a(r1, r2, r0)
            com.rp.rptool.util.r r0 = new com.rp.rptool.util.r
            byte[] r8 = r8.a()
            r0.<init>(r8)
            int r8 = r0.f958a
            if (r8 != r5) goto L_0x0245
            r7.J1()
            java.lang.String r8 = "TF异常-- 插入TF卡"
        L_0x0241:
            com.rp.rptool.util.c0.a(r1, r2, r8)
            goto L_0x028b
        L_0x0245:
            if (r8 != 0) goto L_0x028b
            r7.J1()
            java.lang.String r8 = "TF异常-- 拔出TF卡"
            goto L_0x0241
        L_0x024d:
            java.lang.String r0 = "sendIOCtrlResp() NAT_CMD_CHECK_TF_CARD_RESP"
            com.rp.rptool.util.c0.a(r1, r2, r0)
            com.rp.rptool.util.z r0 = new com.rp.rptool.util.z
            byte[] r8 = r8.a()
            r0.<init>(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "NAT_CMD_CHECK_TF_CARD_RESP capacity = "
            r8.append(r3)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.rp.rptool.util.c0.a(r1, r2, r8)
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r8 = r8.p()
            int r1 = r0.f964b
            long r1 = (long) r1
            r8.s(r1)
            com.rp.rptool.util.d0 r8 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r8 = r8.p()
            int r0 = r0.f963a
            long r0 = (long) r0
            r8.t(r0)
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.g.U1(b.b.e.a.b):void");
    }

    /* access modifiers changed from: private */
    public void V1() {
        c0.a(0, "X1ShowVideoFragment", "handleRefreshVideoCounterTxt()");
        this.y0.setText(P2(this.R0));
        this.R0++;
        int s = d0.t().s("ml_record_loop");
        if (s != 0) {
            if (s == 1) {
                s = 120;
            } else if (s == 2) {
                s = 180;
            } else if (s == 3) {
                s = 300;
            }
            if (this.R0 == s) {
                this.R0 = 0;
            }
        }
        this.f1.sendEmptyMessageDelayed(12, 1000);
    }

    private void X1() {
        if (this.C0.getVisibility() == 0) {
            s2(1);
            this.C0.setVisibility(8);
            this.F0.setVisibility(8);
            this.G0.setVisibility(8);
            this.H0.setVisibility(8);
            this.E0.setVisibility(0);
        }
    }

    private void Y1() {
        h1 = false;
        this.m0 = false;
        this.n0 = false;
    }

    private void Z1() {
        this.A0 = (ViewPager) this.i0.findViewById(R.id.video_opt_viewpager);
        this.C0 = (RelativeLayout) this.i0.findViewById(R.id.video_por_opt_views);
        LinearLayout linearLayout = (LinearLayout) this.i0.findViewById(R.id.video_por_opt_arrows);
        this.D0 = linearLayout;
        linearLayout.setOnClickListener(this);
        this.F0 = (ImageView) this.i0.findViewById(R.id.video_por_opt_arrow_1);
        this.G0 = (ImageView) this.i0.findViewById(R.id.video_por_opt_arrow_2);
        this.H0 = (ImageView) this.i0.findViewById(R.id.video_por_opt_arrow_3);
        ImageView imageView = (ImageView) this.i0.findViewById(R.id.video_por_opt_arrow_off);
        this.E0 = imageView;
        imageView.setOnClickListener(this);
        this.B0 = new ArrayList<>();
        d dVar = new d();
        this.I0 = dVar;
        dVar.v1(this);
        c cVar = new c();
        this.J0 = cVar;
        cVar.w1(this);
        e eVar = new e();
        this.K0 = eVar;
        eVar.l1(this);
        this.B0.add(this.I0);
        this.B0.add(this.J0);
        this.B0.add(this.K0);
        this.A0.setOffscreenPageLimit(3);
        this.A0.setAdapter(new h(l(), this.B0));
        this.A0.setCurrentItem(0);
        this.A0.setOnPageChangeListener(new c());
        if (b.c.a.a.d.b.p) {
            X1();
        }
    }

    private void a2() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.h0.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        this.o0 = (RelativeLayout) this.i0.findViewById(R.id.video_mainbg);
        this.p0 = (RelativeLayout) this.i0.findViewById(R.id.video_titlebar);
        TextView textView = (TextView) this.i0.findViewById(R.id.video_top_tips);
        this.q0 = textView;
        textView.setText(y().getString(R.string.app_name));
        this.r0 = (ImageButton) this.i0.findViewById(R.id.video_top_infobtn);
        this.s0 = (RelativeLayout) this.i0.findViewById(R.id.video_por_opt_bg);
        this.t0 = (ImageButton) this.i0.findViewById(R.id.video_por_capture);
        this.u0 = (ImageButton) this.i0.findViewById(R.id.video_por_record);
        this.v0 = (ImageButton) this.i0.findViewById(R.id.video_por_slowgraphy);
        this.j0 = (ImageView) this.i0.findViewById(R.id.video_shotcut);
        this.w0 = (TextView) this.i0.findViewById(R.id.video_por_middle_tips);
        this.x0 = (TextView) this.i0.findViewById(R.id.video_counter_tips);
        this.y0 = (TextView) this.i0.findViewById(R.id.video_video_counter_tips);
        this.z0 = (LinearLayout) this.i0.findViewById(R.id.video_record_counter_tips_bg);
        this.j0.setOnClickListener(this);
        this.r0.setOnClickListener(this);
        this.t0.setOnClickListener(this);
        this.u0.setOnClickListener(this);
        this.v0.setOnClickListener(this);
        this.Z = (RelativeLayout) this.i0.findViewById(R.id.video_parentview);
        this.a0 = (LinearLayout) this.i0.findViewById(R.id.video_parentview_bg);
        this.c0 = (ImageView) this.i0.findViewById(R.id.video_parentview_loading_img);
        this.Z.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, (i2 * 9) / 16);
        this.d0 = layoutParams;
        layoutParams.addRule(13);
        int i3 = (i * 9) / 16;
        this.e0 = new RelativeLayout.LayoutParams(i, i3);
        c0.a(3, "X1ShowVideoFragment", "video view width  = " + i + " height = " + i3);
        this.e0.addRule(14);
        this.e0.addRule(3, R.id.video_titlebar);
        this.e0.setMargins(0, 0, 0, 0);
        this.Z.setLayoutParams(this.e0);
        this.a0.setLayoutParams(this.e0);
        RPVideoViewHelper rPVideoViewHelper = new RPVideoViewHelper(this.h0, this.Z);
        this.f0 = rPVideoViewHelper;
        d dVar = new d();
        this.g0 = dVar;
        rPVideoViewHelper.setVideoViewListener(dVar);
        this.l0 = (RelativeLayout.LayoutParams) this.j0.getLayoutParams();
        int i4 = i2 / 4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, (i4 * 9) / 16);
        this.k0 = layoutParams2;
        layoutParams2.addRule(11);
        this.k0.addRule(12);
        if (b.c.a.a.d.b.p) {
            z2();
            this.h0.A();
            this.f1.sendEmptyMessage(18);
            return;
        }
        P1();
        this.f1.sendEmptyMessage(0);
        this.f1.sendEmptyMessageDelayed(16, 1500);
    }

    @TargetApi(16)
    private void c2() {
        c0.a(0, "X1ShowVideoFragment", "refreshBtnBackgroundImages()");
        int b2 = b.b.d.d.c().b("ml_record_timelapse");
        int b3 = b.b.d.d.c().b("ml_record_loop");
        this.u0.setBackground(this.Y.getDrawable(R.drawable.normal_record_selector));
        if (!i1) {
            this.S0.e(0);
        }
        if (b2 != 0) {
            this.u0.setBackground(this.Y.getDrawable(R.drawable.time_record_selector));
            if (!i1) {
                this.S0.e(1);
            }
        } else if (b3 != 0) {
            this.u0.setBackground(this.Y.getDrawable(R.drawable.loop_record_selector));
            if (!i1) {
                this.S0.e(2);
            }
        }
        int b4 = b.b.d.d.c().b("ml_photo_timed");
        int b5 = b.b.d.d.c().b("ml_photo_auto");
        int b6 = b.b.d.d.c().b("ml_photo_dramashot");
        this.t0.setBackground(this.Y.getDrawable(R.drawable.normal_capture_selector));
        if (!i1) {
            this.S0.b(0);
        }
        if (b4 != 0) {
            this.t0.setBackground(this.Y.getDrawable(R.drawable.time_capture_selector));
            if (!i1) {
                this.S0.b(1);
            }
        } else if (b5 != 0) {
            this.t0.setBackground(this.Y.getDrawable(R.drawable.auto_capture_selector));
            if (!i1) {
                this.S0.b(2);
            }
        } else if (b6 != 0) {
            this.t0.setBackground(this.Y.getDrawable(R.drawable.motion_capture_selector));
            if (!i1) {
                this.S0.b(3);
            }
        }
    }

    private void d2(int i) {
        String str;
        b.b.d.c cVar;
        String str2;
        d0 d0Var;
        c0.a(0, "X1ShowVideoFragment", "refreshMiddleTipsView tag ==" + i);
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
            this.w0.setText(str);
        } else {
            cVar = b.b.d.b.e().q();
            d0Var = d0.t();
            str2 = "ml_record_slowmotion";
        }
        str = cVar.a().get(d0Var.s(str2));
        this.w0.setText(str);
    }

    /* access modifiers changed from: private */
    public void e2(int i) {
        c0.a(0, "X1ShowVideoFragment", "refreshPagesView index = " + i);
        x2(i);
        this.L0 = i;
        d2(i);
    }

    private void f2() {
        c0.a(0, "X1ShowVideoFragment", "refreshRecordSwitch()");
        if (d0.t().p().f() == 0) {
            this.u0.setSelected(false);
            k1 = false;
            H2();
        } else {
            this.u0.setSelected(true);
            X1();
            k1 = true;
        }
        q qVar = this.S0;
        if (qVar != null && qVar.isShowing()) {
            this.S0.g(d0.t().p().f());
        }
    }

    private void g2() {
        c0.a(0, "X1ShowVideoFragment", "refreshSlowGraphy()");
        if (d0.t().p().j() == 0) {
            this.v0.setSelected(false);
            l1 = false;
            H2();
        } else {
            this.v0.setSelected(true);
            l1 = true;
            X1();
        }
        q qVar = this.S0;
        if (qVar != null && qVar.isShowing()) {
            this.S0.h(d0.t().p().j());
        }
    }

    private void h2() {
        this.K0.k1();
        if (this.T0 != null) {
            this.b1.k1();
        }
    }

    /* access modifiers changed from: private */
    public void i2() {
        c0.a(0, "X1ShowVideoFragment", "refreshTakePhoto()");
        int s = d0.t().s("ml_photo_timed");
        int s2 = d0.t().s("ml_photo_auto");
        if (!j1) {
            this.Q0 = true;
            this.O0 = -1;
            this.P0 = 0;
            if (s == 0 && s2 == 0) {
                j1 = false;
                Q1();
                d0.t().w(1607, 1);
                p2();
                return;
            }
            j1 = true;
            this.t0.setSelected(true);
            q qVar = this.S0;
            if (qVar != null && qVar.isShowing()) {
                this.S0.d(1);
            }
            X1();
            if (s > 0) {
                String str = b.b.d.b.e().o().a().get(s);
                this.O0 = Integer.parseInt(str.substring(0, str.length() - 1));
                this.Q0 = true;
            } else if (s2 > 0) {
                String str2 = b.b.d.b.e().b().a().get(s2);
                this.O0 = Integer.parseInt(str2.substring(0, str2.length() - 1));
                this.Q0 = false;
            }
            int i = this.O0;
            if (i != -1) {
                this.P0 = i;
                J2();
            }
        } else if (s > 0) {
            if (this.f1.hasMessages(11)) {
                this.f1.removeMessages(11);
            }
            this.P0 = this.O0;
            TextView textView = this.x0;
            textView.setText("" + this.P0);
            this.f1.sendEmptyMessage(11);
        } else if (s2 > 0) {
            if (this.f1.hasMessages(11)) {
                this.f1.removeMessages(11);
            }
            this.t0.setSelected(false);
            q qVar2 = this.S0;
            if (qVar2 != null && qVar2.isShowing()) {
                this.S0.d(0);
            }
            if (this.x0.getVisibility() != 8) {
                this.x0.setVisibility(8);
            }
            if (i1) {
                H2();
            }
            this.P0 = 0;
            this.O0 = -1;
            j1 = false;
            p2();
            d0.t().w(1607, 1);
        }
    }

    private void k2(b.b.e.a.b bVar) {
        c0.a(0, "X1ShowVideoFragment", "respConnectDevFail() rtnMsg = " + bVar);
        d0.t().p().r(bVar.d());
        this.f1.sendEmptyMessageDelayed(7, 500);
    }

    private void l2(b.b.e.a.b bVar) {
        c0.a(0, "X1ShowVideoFragment", "respConnectDevSuccess() rtnMsg = " + bVar);
        d0.t().p().r(bVar.d());
        d0.t().z("http://192.168.10.1:8082/tmp/data/.data/sqlite/sunxi.db", b.c.a.a.d.b.f865a);
        p2();
        P1();
        this.f1.sendEmptyMessage(0);
    }

    private void m2(w wVar) {
        String str;
        c0.a(0, "X1ShowVideoFragment", "item's respGetAllConfig config = " + wVar.toString());
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
        f2();
        y2();
        c2();
        d2(0);
        d0.t().w(1607, 1);
        d0.t().C(this.h0);
    }

    private void n2(b.b.e.a.b bVar) {
        String str;
        String str2 = "";
        c0.a(0, "X1ShowVideoFragment", "respSearchDevice()");
        if (!d0.t().f933b) {
            this.f1.sendEmptyMessage(6);
        } else if (bVar.c() / b0.a() == 0) {
            c0.a(3, "X1ShowVideoFragment", "respSearchDevice() returnMsg to num == 0!");
            this.f1.sendEmptyMessageAtTime(7, 1000);
        } else {
            b0 b0Var = new b0(bVar.a(), 0);
            c0.a(0, "X1ShowVideoFragment", "respSearchDevice() info = " + b0Var);
            try {
                str = new String(b0Var.f925a, "UTF-8").trim();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                c0.a(3, "X1ShowVideoFragment", "respSearchDevice() uid 2 String error!");
                str = str2;
            }
            if (str == null || str2.equals(str)) {
                c0.a(3, "X1ShowVideoFragment", "respSearchDevice() uid null error!");
                return;
            }
            try {
                str2 = new String(b0Var.f926b, "UTF-8").trim();
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                c0.a(0, "X1ShowVideoFragment", "respSearchDevice() ip 2 String error!");
            }
            b.b.e.a.c cVar = new b.b.e.a.c(str, "12345", -1, str2, -1);
            d0.t().P(cVar);
            b.c.a.a.d.b.j(cVar.l());
            r2(cVar.l(), cVar.d());
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void o2() {
        if (this.f1.hasMessages(10)) {
            this.f1.removeMessages(10);
        }
        if (this.j0.getVisibility() != 0) {
            this.j0.setVisibility(0);
        }
        if (this.c1 != null) {
            this.j0.setBackground(new BitmapDrawable(this.c1));
        }
        this.f1.sendEmptyMessageDelayed(10, 3000);
    }

    /* access modifiers changed from: private */
    public void p2() {
        c0.a(0, "X1ShowVideoFragment", "sendBrocastToRefreshDevList()");
        Intent intent = new Intent();
        intent.setAction("refresh_list_filter");
        g().sendBroadcast(intent);
        intent.setAction("local_refresh_list_filter");
        g().sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public void q2() {
        c0.a(0, "X1ShowVideoFragment", "sendBrocastToRefreshLocalList()");
        Intent intent = new Intent();
        intent.setAction("local_refresh_list_filter");
        g().sendBroadcast(intent);
    }

    private void r2(String str, String str2) {
        c0.a(0, "X1ShowVideoFragment", "sendConnectDevice()");
        d0.t().H(str, str2);
    }

    private void s2(int i) {
        ImageView imageView;
        if (i1 && 8 != this.C0.getVisibility()) {
            this.F0.setBackgroundDrawable(this.Y.getDrawable(R.drawable.dot_normal));
            this.G0.setBackgroundDrawable(this.Y.getDrawable(R.drawable.dot_normal));
            this.H0.setBackgroundDrawable(this.Y.getDrawable(R.drawable.dot_normal));
            if (i == 0) {
                imageView = this.F0;
            } else if (i == 1) {
                imageView = this.G0;
            } else if (i == 2) {
                imageView = this.H0;
            } else {
                return;
            }
            imageView.setBackgroundDrawable(this.Y.getDrawable(R.drawable.dot_selected));
        }
    }

    private void t2(int i) {
        c0.a(0, "X1ShowVideoFragment", "setCurrentItem index ==" + i);
        if (this.A0.getCurrentItem() != i) {
            this.A0.setCurrentItem(i);
        }
    }

    private void u2(int i) {
        c0.a(0, "X1ShowVideoFragment", "setRecordSwitch(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1634, x.a(i), x.b()));
    }

    private void v2(int i) {
        c0.a(0, "X1ShowVideoFragment", "setSlowGraphy(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1830, x.a(i), x.b()));
    }

    private void w2(int i) {
        c0.a(0, "X1ShowVideoFragment", "setTakePhoto(" + i + ")");
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1632, x.a(i), x.b()));
        this.N0 = true;
        this.f1.sendEmptyMessageDelayed(17, 1500);
    }

    private void x2(int i) {
        TextView textView;
        c0.a(0, "X1ShowVideoFragment", "setTipsView index == " + i);
        if (this.U0 != null) {
            this.W0.setTextColor(this.Y.getColor(R.color.white_half));
            this.X0.setTextColor(this.Y.getColor(R.color.white_half));
            this.Y0.setTextColor(this.Y.getColor(R.color.white_half));
            if (i == 0) {
                textView = this.W0;
            } else if (i == 1) {
                textView = this.X0;
            } else if (i == 2) {
                textView = this.Y0;
            } else {
                return;
            }
            textView.setTextColor(this.Y.getColor(R.color.main_color));
        }
    }

    private void y2() {
        c0.a(0, "X1ShowVideoFragment", "setUIByDevType()");
    }

    private void z2() {
        this.a0.setBackgroundColor(y().getColor(R.color.black));
        this.c0.setVisibility(8);
        this.a0.setVisibility(0);
        this.q0.setText(this.Y.getString(R.string.offline));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G2() {
        /*
            r3 = this;
            boolean r0 = k1
            if (r0 != 0) goto L_0x0016
            boolean r0 = l1
            if (r0 == 0) goto L_0x0009
            goto L_0x0016
        L_0x0009:
            boolean r0 = j1
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
            boolean r1 = i1
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.xforce.v5.xdvpro.ui.X1MainFragmentActivity r1 = r3.h0
            com.xforce.v5.xdvpro.widget.o.g(r1, r0, r2)
            goto L_0x0033
        L_0x002a:
            com.xforce.v5.xdvpro.ui.X1MainFragmentActivity r1 = r3.h0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.g.G2():void");
    }

    public void J1() {
        if (d0.t().p() != null) {
            if (k1) {
                d0.t().p().q(0);
                f2();
                M2();
            }
            if (d0.t().s("ml_photo_dramashot") != 0) {
                O1();
            }
            if (j1) {
                i2();
            }
            if (l1) {
                d0.t().p().u(b.c.a.a.d.b.r(d0.t().p().j()));
                g2();
                M2();
            }
        }
    }

    public void O2() {
        c0.a(0, "X1ShowVideoFragment", "stopVideoStream()");
        this.f1.removeMessages(0);
        this.f1.removeMessages(1);
        if (h1) {
            if (d0.t().p() == null) {
                c0.a(3, "X1ShowVideoFragment", "stopVideoStream CCGlobal.device == null!");
                this.f1.sendEmptyMessageDelayed(1, 500);
                return;
            }
            h1 = false;
            this.n0 = true;
            d0.t().M();
        } else if (this.m0) {
            this.f1.sendEmptyMessageDelayed(1, 1000);
        }
    }

    public void Q(int i, int i2, Intent intent) {
        super.Q(i, i2, intent);
        if (i == 1001 && i2 == 1003) {
            Q2();
        }
    }

    public void V(Bundle bundle) {
        c0.a(0, "X1ShowVideoFragment", "onCreate");
        super.V(bundle);
    }

    public void W1(int i, int i2) {
        c0.a(0, "X1ShowVideoFragment", "handleSeekBarCallBack() cmdTag = " + i + " value = " + i2);
        d0.t().w(i, i2);
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "X1ShowVideoFragment", "onCreateView");
        this.Y = y();
        if (this.i0 == null) {
            this.i0 = layoutInflater.inflate(R.layout.fragment_showvideo, viewGroup, false);
            this.h0 = (X1MainFragmentActivity) g();
            a2();
            Z1();
            Y1();
        } else {
            c0.a(0, "X1ShowVideoFragment", "onCreateView view not null");
        }
        ViewGroup viewGroup2 = (ViewGroup) this.i0.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.i0);
        }
        return this.i0;
    }

    public void a0() {
        c0.a(0, "X1ShowVideoFragment", "onDestroy");
        super.a0();
    }

    public boolean b2() {
        return i1;
    }

    public void j2(b.b.e.a.b bVar) {
        c0.a(0, "X1ShowVideoFragment", "refreshUI() rtnMsg = " + bVar);
        Message obtainMessage = this.f1.obtainMessage();
        obtainMessage.what = 5;
        obtainMessage.obj = bVar;
        this.f1.sendMessage(obtainMessage);
    }

    public void onClick(View view) {
        if (!b.c.a.a.d.b.p || view.getId() == R.id.video_top_infobtn || view.getId() == R.id.video_parentview) {
            if (b.c.a.a.d.b.q || view.getId() == R.id.video_top_infobtn || view.getId() == R.id.video_parentview) {
                int id = view.getId();
                switch (id) {
                    case R.id.video_lan_opt_capture /*2131230987*/:
                        if (k1 || l1) {
                            G2();
                            return;
                        } else if (!K1()) {
                            D2();
                            return;
                        } else {
                            d0.t().p().v(0);
                            w2(d0.t().p().k());
                            if (d0.t().s("ml_photo_dramashot") == 0) {
                                return;
                            }
                        }
                        break;
                    case R.id.video_lan_opt_record /*2131230988*/:
                        if (l1 || j1) {
                            G2();
                            return;
                        } else if (!K1()) {
                            D2();
                            return;
                        } else if (!this.g1) {
                            this.g1 = true;
                            this.f1.sendEmptyMessageDelayed(4095, 2000);
                            d0.t().p().q(b.c.a.a.d.b.r(d0.t().p().f()));
                            f2();
                            u2(d0.t().p().f());
                            return;
                        } else {
                            return;
                        }
                    case R.id.video_lan_opt_setting_btn /*2131230989*/:
                        if (k1 || l1 || j1) {
                            G2();
                            return;
                        } else {
                            C2();
                            return;
                        }
                    case R.id.video_lan_opt_slowgraphy /*2131230990*/:
                        if (k1 || j1) {
                            G2();
                            return;
                        } else if (!K1()) {
                            D2();
                            return;
                        } else if (!this.g1) {
                            this.g1 = true;
                            this.f1.sendEmptyMessageDelayed(4095, 2000);
                            d0.t().p().u(b.c.a.a.d.b.r(d0.t().p().j()));
                            g2();
                            v2(d0.t().p().j());
                            return;
                        } else {
                            return;
                        }
                    case R.id.video_lan_opt_tips_1 /*2131230991*/:
                        e2(0);
                        this.V0.setCurrentItem(0);
                        return;
                    case R.id.video_lan_opt_tips_2 /*2131230992*/:
                        e2(1);
                        this.V0.setCurrentItem(1);
                        return;
                    case R.id.video_lan_opt_tips_3 /*2131230993*/:
                        e2(2);
                        this.V0.setCurrentItem(2);
                        return;
                    case R.id.video_lan_top_rl /*2131230994*/:
                        N1();
                        return;
                    default:
                        switch (id) {
                            case R.id.video_parentview /*2131230998*/:
                                if (!b.c.a.a.d.b.p && d0.t().p() != null) {
                                    RelativeLayout relativeLayout = this.T0;
                                    if (!(relativeLayout == null || 8 == relativeLayout.getVisibility())) {
                                        N1();
                                    }
                                    B2();
                                    return;
                                }
                                return;
                            case R.id.video_por_capture /*2131231005*/:
                                c0.a(0, "X1ShowVideoFragment", " ------------- ONCLICK POR CAPTURE -------------");
                                if (this.N0) {
                                    c0.a(0, "X1ShowVideoFragment", "capture isLock~~~~~~!");
                                    return;
                                } else if (k1 || l1) {
                                    G2();
                                    return;
                                } else {
                                    if (this.L0 != 1) {
                                        e2(1);
                                    }
                                    if (!K1()) {
                                        D2();
                                        return;
                                    }
                                    d0.t().p().v(0);
                                    w2(d0.t().p().k());
                                    if (d0.t().s("ml_photo_dramashot") == 0) {
                                        return;
                                    }
                                }
                                break;
                            case R.id.video_shotcut /*2131231022*/:
                                c0.a(0, "X1ShowVideoFragment", " ----- video_shotcut -------");
                                if (k1 || l1 || j1) {
                                    G2();
                                    return;
                                } else {
                                    this.h0.z();
                                    return;
                                }
                            case R.id.video_top_infobtn /*2131231026*/:
                                if (k1 || l1 || j1) {
                                    G2();
                                    return;
                                } else {
                                    h1(new Intent(g(), X1InfoActivity.class), 1001);
                                    return;
                                }
                            default:
                                switch (id) {
                                    case R.id.video_por_opt_arrow_off /*2131231015*/:
                                        if (k1 || l1 || j1) {
                                            G2();
                                            return;
                                        }
                                    case R.id.video_por_opt_arrows /*2131231016*/:
                                        if (k1 || l1 || j1) {
                                            G2();
                                            return;
                                        }
                                    default:
                                        switch (id) {
                                            case R.id.video_por_record /*2131231019*/:
                                                if (l1 || j1) {
                                                    G2();
                                                    return;
                                                }
                                                if (this.L0 != 0) {
                                                    e2(0);
                                                }
                                                if (!K1()) {
                                                    D2();
                                                    return;
                                                } else if (!I1()) {
                                                    n.g(g(), y().getString(R.string.dev_storage_limit));
                                                    return;
                                                } else if (!this.g1) {
                                                    this.g1 = true;
                                                    this.f1.sendEmptyMessageDelayed(4095, 2000);
                                                    d0.t().p().q(b.c.a.a.d.b.r(d0.t().p().f()));
                                                    u2(d0.t().p().f());
                                                    f2();
                                                    t2(0);
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            case R.id.video_por_slowgraphy /*2131231020*/:
                                                if (k1 || j1) {
                                                    G2();
                                                    return;
                                                }
                                                if (this.L0 != 2) {
                                                    e2(2);
                                                }
                                                if (!K1()) {
                                                    D2();
                                                    return;
                                                } else if (!this.g1) {
                                                    this.g1 = true;
                                                    this.f1.sendEmptyMessageDelayed(4095, 2000);
                                                    d0.t().p().u(b.c.a.a.d.b.r(d0.t().p().j()));
                                                    g2();
                                                    v2(d0.t().p().j());
                                                    t2(2);
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            default:
                                                return;
                                        }
                                }
                                this.f1.sendEmptyMessage(8);
                                return;
                        }
                }
                E2();
            } else if (i1) {
                o.g(g(), this.Y.getString(R.string.device_is_preparing), false);
            } else {
                Toast.makeText(this.h0, this.Y.getString(R.string.device_is_preparing), 0).show();
            }
        } else if (i1) {
            o.g(g(), this.Y.getString(R.string.device_offline), false);
        } else {
            Toast.makeText(this.h0, this.Y.getString(R.string.device_offline), 0).show();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M1();
        int i = configuration.orientation;
        if (i == 2) {
            if (this.C0.getVisibility() == 0) {
                s2(1);
                this.C0.setVisibility(8);
                this.G0.setBackgroundDrawable(this.Y.getDrawable(R.drawable.dot_normal));
            }
            i1 = false;
            this.Z.setLayoutParams(this.d0);
            this.a0.setLayoutParams(this.d0);
            this.j0.setLayoutParams(this.k0);
            WindowManager.LayoutParams attributes = this.h0.getWindow().getAttributes();
            attributes.flags |= 1024;
            this.h0.getWindow().setAttributes(attributes);
            this.h0.getWindow().addFlags(512);
            this.f1.sendEmptyMessage(3);
        } else if (i == 1) {
            i1 = true;
            this.Z.setLayoutParams(this.e0);
            this.a0.setLayoutParams(this.e0);
            this.j0.setLayoutParams(this.l0);
            WindowManager.LayoutParams attributes2 = this.h0.getWindow().getAttributes();
            attributes2.flags &= -1025;
            this.h0.getWindow().setAttributes(attributes2);
            this.h0.getWindow().clearFlags(512);
            this.f1.sendEmptyMessage(2);
            if (!k1 && !l1) {
                this.f1.sendEmptyMessageDelayed(8, 1000);
            }
        }
        if (!b.c.a.a.d.b.p) {
            this.M0 = true;
            this.f1.sendEmptyMessage(13);
            this.f1.sendEmptyMessageDelayed(14, 1000);
        }
    }

    public void p0() {
        c0.a(0, "X1ShowVideoFragment", "onResume");
        if (!b.c.a.a.d.b.p) {
            this.f1.sendEmptyMessage(0);
        }
        super.p0();
    }

    public void s0() {
        c0.a(0, "X1ShowVideoFragment", "onStop");
        if (!b.c.a.a.d.b.p) {
            this.f1.sendEmptyMessage(1);
        }
        super.s0();
    }
}
