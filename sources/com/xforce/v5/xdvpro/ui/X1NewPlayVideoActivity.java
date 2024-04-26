package com.xforce.v5.xdvpro.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import b.a.a.a.e;
import b.a.a.a.f0;
import b.a.a.a.g;
import b.a.a.a.g0;
import b.a.a.a.h;
import b.a.a.a.i;
import b.a.a.a.j;
import b.a.a.a.n0.d;
import b.a.a.a.n0.n;
import b.a.a.a.p0.f;
import b.a.a.a.q0.k;
import b.a.a.a.q0.m;
import b.a.a.a.w;
import b.a.a.a.y;
import com.google.android.exoplayer2.ui.PlayerView;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.ui.V3H3.XFTPV3H3MainFragmentActivity;

public class X1NewPlayVideoActivity extends Activity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    /* access modifiers changed from: private */
    public boolean A = true;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f1018a = false;

    /* renamed from: b  reason: collision with root package name */
    private d f1019b;
    private RelativeLayout c;
    private Button d;
    private TextView e;
    /* access modifiers changed from: private */
    public RelativeLayout f;
    /* access modifiers changed from: private */
    public TextView g;
    private TextView h;
    /* access modifiers changed from: private */
    public SeekBar i;
    /* access modifiers changed from: private */
    public Button j;
    private Button k;
    private Button l;
    private ProgressBar m;
    private String n = "";
    private String o = "";
    private long p = 0;
    private long q = 0;
    /* access modifiers changed from: private */
    public PlayerView r;
    /* access modifiers changed from: private */
    public i s;
    /* access modifiers changed from: private */
    public boolean t = true;
    private int u;
    private long v;
    y.b w = new b();
    /* access modifiers changed from: private */
    public Handler x = new c();
    private boolean y = false;
    /* access modifiers changed from: private */
    public boolean z = false;

    class a implements View.OnTouchListener {
        a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!X1NewPlayVideoActivity.this.A) {
                c0.a(0, "X1NewPlayVideoActivity", "click video_view");
                if (X1NewPlayVideoActivity.this.f.getVisibility() == 8) {
                    X1NewPlayVideoActivity.this.x();
                } else {
                    X1NewPlayVideoActivity.this.w();
                }
            }
            return false;
        }
    }

    class b implements y.b {
        b() {
        }

        public void b(w wVar) {
            c0.a(0, "X1NewPlayVideoActivity", "playbackParameters:" + wVar);
        }

        public void c(boolean z, int i) {
            c0.a(0, "X1NewPlayVideoActivity", "playWhenReady:" + z + " playbackState:" + i);
            if (i == 2) {
                X1NewPlayVideoActivity.this.G();
                X1NewPlayVideoActivity.this.j.setBackground(X1NewPlayVideoActivity.this.getResources().getDrawable(R.drawable.playvideo_btn_start_selector));
            } else if (i == 3) {
                X1NewPlayVideoActivity.this.F();
                X1NewPlayVideoActivity.this.N();
                if (X1NewPlayVideoActivity.this.t) {
                    X1NewPlayVideoActivity.this.j.setBackground(X1NewPlayVideoActivity.this.getResources().getDrawable(R.drawable.playvideo_btn_pause_selector));
                    X1NewPlayVideoActivity.this.i.setEnabled(true);
                    if (X1NewPlayVideoActivity.this.f1018a) {
                        c0.a(0, "X1NewPlayVideoActivity", " start play but enterbg then pause!");
                        boolean unused = X1NewPlayVideoActivity.this.t = false;
                        X1NewPlayVideoActivity.this.j.setBackground(X1NewPlayVideoActivity.this.getResources().getDrawable(R.drawable.playvideo_btn_start_selector));
                        X1NewPlayVideoActivity.this.s.e(X1NewPlayVideoActivity.this.t);
                    }
                } else if (X1NewPlayVideoActivity.this.z) {
                    boolean unused2 = X1NewPlayVideoActivity.this.t = true;
                    X1NewPlayVideoActivity.this.s.e(X1NewPlayVideoActivity.this.t);
                    X1NewPlayVideoActivity.this.j.setBackground(X1NewPlayVideoActivity.this.getResources().getDrawable(R.drawable.playvideo_btn_pause_selector));
                    boolean unused3 = X1NewPlayVideoActivity.this.z = false;
                    X1NewPlayVideoActivity.this.i.setEnabled(true);
                }
            } else if (i == 4) {
                boolean unused4 = X1NewPlayVideoActivity.this.t = false;
                X1NewPlayVideoActivity.this.i.setEnabled(false);
                X1NewPlayVideoActivity.this.j.setBackground(X1NewPlayVideoActivity.this.getResources().getDrawable(R.drawable.playvideo_btn_start_selector));
                X1NewPlayVideoActivity.this.g.setText(X1NewPlayVideoActivity.this.J(0));
                X1NewPlayVideoActivity.this.i.setProgress(0);
                if (X1NewPlayVideoActivity.this.s.s() == 0) {
                    i unused5 = X1NewPlayVideoActivity.this.s = null;
                    PlayerView unused6 = X1NewPlayVideoActivity.this.r = null;
                    boolean unused7 = X1NewPlayVideoActivity.this.t = true;
                }
            }
        }

        public void d(int i) {
            c0.a(0, "X1NewPlayVideoActivity", "repeatMode:" + i);
        }

        public void e(boolean z) {
        }

        public void f(int i) {
            c0.a(0, "X1NewPlayVideoActivity", "reason:" + i);
        }

        public void j(n nVar, f fVar) {
            c0.a(0, "X1NewPlayVideoActivity", "onTracksChanged");
        }

        public void k(boolean z) {
            c0.a(0, "X1NewPlayVideoActivity", "shuffleModeEnabled:" + z);
        }

        public void l(g0 g0Var, Object obj, int i) {
            c0.a(0, "X1NewPlayVideoActivity", "onTimelineChanged");
            if (X1NewPlayVideoActivity.this.s != null && X1NewPlayVideoActivity.this.s.w() > 1) {
                X1NewPlayVideoActivity.this.N();
            }
        }

        public void m(h hVar) {
            X1NewPlayVideoActivity x1NewPlayVideoActivity;
            String str;
            c0.a(0, "X1NewPlayVideoActivity", "error:" + hVar);
            int i = hVar.f244a;
            X1NewPlayVideoActivity.this.i.setEnabled(false);
            if (i == 0) {
                x1NewPlayVideoActivity = X1NewPlayVideoActivity.this;
                str = "文件异常，播放失败";
            } else {
                x1NewPlayVideoActivity = X1NewPlayVideoActivity.this;
                str = "播放失败！";
            }
            x1NewPlayVideoActivity.K(str);
        }

        public void o() {
            c0.a(0, "X1NewPlayVideoActivity", "onSeekProcessed");
        }
    }

    class c extends Handler {
        c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 40961:
                    X1NewPlayVideoActivity.this.M();
                    return;
                case 40962:
                    b.c.a.a.d.b.p = true;
                    X1NewPlayVideoActivity x1NewPlayVideoActivity = X1NewPlayVideoActivity.this;
                    Toast.makeText(x1NewPlayVideoActivity, x1NewPlayVideoActivity.getResources().getString(R.string.device_disconnect), 1).show();
                    return;
                default:
                    return;
            }
        }
    }

    private class d extends BroadcastReceiver {
        private d() {
        }

        /* synthetic */ d(X1NewPlayVideoActivity x1NewPlayVideoActivity, a aVar) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                String h = b.c.a.a.d.b.h(X1NewPlayVideoActivity.this);
                if (XFTPV3H3MainFragmentActivity.K == null) {
                    if (XFTPMainFragmentActivity.K.equals(h)) {
                        return;
                    }
                } else if (XFTPMainFragmentActivity.K != null || XFTPV3H3MainFragmentActivity.K.equals(h)) {
                    return;
                }
                c0.a(0, "X1NewPlayVideoActivity", "state_change");
                X1NewPlayVideoActivity.this.x.sendEmptyMessage(40962);
            }
        }
    }

    private void A() {
    }

    private void B() {
    }

    private void C() {
        Intent intent = getIntent();
        this.n = intent.getStringExtra("video_path");
        this.o = intent.getStringExtra("video_name");
        O();
    }

    private void D() {
        this.c = (RelativeLayout) findViewById(R.id.top);
        Button button = (Button) findViewById(R.id.back);
        this.d = button;
        button.setOnClickListener(this);
        this.e = (TextView) findViewById(R.id.videoname);
        this.f = (RelativeLayout) findViewById(R.id.controller);
        this.g = (TextView) findViewById(R.id.time_current);
        this.h = (TextView) findViewById(R.id.time_total);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekbar);
        this.i = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.i.setEnabled(false);
        Button button2 = (Button) findViewById(R.id.playback);
        this.j = button2;
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.fallback);
        this.k = button3;
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.forward);
        this.l = button4;
        button4.setOnClickListener(this);
        this.m = (ProgressBar) findViewById(R.id.loading);
    }

    private void E() {
        PlayerView playerView = (PlayerView) findViewById(R.id.video_view);
        this.r = playerView;
        playerView.setOnTouchListener(new a());
        f0 a2 = j.a(new g(this), new b.a.a.a.p0.b(), new e());
        this.s = a2;
        this.r.setPlayer(a2);
        this.s.e(this.t);
        this.s.m(this.u, this.v);
        this.s.d(0);
        this.s.i(this.w);
        Uri parse = Uri.parse(this.n);
        this.s.b(this.n.contains("http") ? z(parse) : y(parse), true, false);
    }

    /* access modifiers changed from: private */
    public void F() {
        this.m.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void G() {
        this.m.setVisibility(0);
    }

    private void H() {
        c0.a(0, "X1NewPlayVideoActivity", "registerWiFiConnectReceiver()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.f1019b == null) {
            this.f1019b = new d(this, (a) null);
        }
        registerReceiver(this.f1019b, intentFilter);
    }

    private void I() {
        i iVar = this.s;
        if (iVar != null) {
            this.v = iVar.H();
            this.u = this.s.B();
            this.t = this.s.q();
            this.s.a();
            this.s = null;
        }
    }

    /* access modifiers changed from: private */
    public String J(int i2) {
        if (i2 <= 0) {
            return "00:00";
        }
        int i3 = i2 / 60;
        if (i3 < 60) {
            return L(i3) + ":" + L(i2 % 60) + "";
        }
        int i4 = i3 / 60;
        if (i4 < 24) {
            int i5 = i3 % 60;
            return L(i4) + ":" + L(i5) + ":" + L((i2 - (i4 * 3600)) - (i5 * 60)) + ":";
        }
        int i6 = i4 / 24;
        int i7 = i4 % 24;
        return L(i6) + "天" + L(i7) + "小时" + L((i3 - ((i6 * 24) * 60)) - (i7 * 60)) + "分钟";
    }

    /* access modifiers changed from: private */
    public void K(String str) {
        Toast.makeText(this, str, 1).show();
    }

    private String L(int i2) {
        StringBuilder sb;
        if (i2 < 0 || i2 >= 10) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append("0");
            sb.append(Integer.toString(i2));
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void M() {
        i iVar;
        if (this.x.hasMessages(40961)) {
            this.x.removeMessages(40961);
        }
        if (!this.y && !this.z && this.t && (iVar = this.s) != null && iVar.w() > 1) {
            if (this.s.w() == 4) {
                this.g.setText(J(0));
                this.i.setProgress(0);
                return;
            }
            long H = this.s.H();
            this.q = H;
            if (H < 0) {
                this.q = 0;
            }
            this.g.setText(J((int) (this.q / 1000)));
            this.i.setProgress((int) (this.q / 100));
            this.x.sendEmptyMessageDelayed(40961, 500);
        }
    }

    /* access modifiers changed from: private */
    public void N() {
        this.p = this.s.t();
        this.q = this.s.H();
        c0.a(0, "X1NewPlayVideoActivity", " total:" + this.p + " current:" + this.q);
        long j2 = this.p;
        if (j2 > 0) {
            this.h.setText(J((int) (j2 / 1000)));
            this.i.setMax((int) (this.p / 100));
            this.x.sendEmptyMessage(40961);
        }
        if (this.q < 0) {
            this.q = 0;
        }
        this.g.setText(J((int) (this.q / 1000)));
        this.i.setProgress((int) (this.q / 100));
    }

    private void O() {
        this.e.setText(this.o);
    }

    /* access modifiers changed from: private */
    public void w() {
        this.c.setVisibility(8);
        this.c.startAnimation(AnimationUtils.loadAnimation(this, R.anim.push_top_out));
        this.f.setVisibility(8);
        this.f.startAnimation(AnimationUtils.loadAnimation(this, R.anim.push_bottom_out));
    }

    /* access modifiers changed from: private */
    public void x() {
        this.c.setVisibility(0);
        this.c.startAnimation(AnimationUtils.loadAnimation(this, R.anim.push_top_in));
        this.f.setVisibility(0);
        this.f.startAnimation(AnimationUtils.loadAnimation(this, R.anim.push_bottom_in));
    }

    private b.a.a.a.n0.f y(Uri uri) {
        return new d.b(new k(this, "xforce")).a(uri);
    }

    private b.a.a.a.n0.f z(Uri uri) {
        return new d.b(new m("xforce")).a(uri);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        if (r4 <= 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        r2 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r13 = r13.getId()
            r0 = 100
            r2 = 0
            r4 = 2131165354(0x7f0700aa, float:1.7944923E38)
            r5 = 1
            r6 = 3
            r7 = 40961(0xa001, float:5.7399E-41)
            r8 = 0
            switch(r13) {
                case 2131230729: goto L_0x011f;
                case 2131230791: goto L_0x00b6;
                case 2131230823: goto L_0x005b;
                case 2131230894: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0125
        L_0x0016:
            b.a.a.a.i r13 = r12.s
            if (r13 == 0) goto L_0x0054
            boolean r0 = r12.y
            if (r0 != 0) goto L_0x0054
            boolean r0 = r12.z
            if (r0 != 0) goto L_0x0054
            int r13 = r13.w()
            if (r13 != r6) goto L_0x0125
            boolean r13 = r12.t
            if (r13 == 0) goto L_0x0039
            r12.t = r8
            android.widget.Button r13 = r12.j
            android.content.res.Resources r0 = r12.getResources()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            goto L_0x0048
        L_0x0039:
            r12.t = r5
            android.widget.Button r13 = r12.j
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131165353(0x7f0700a9, float:1.794492E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
        L_0x0048:
            r13.setBackground(r0)
            b.a.a.a.i r13 = r12.s
            boolean r0 = r12.t
            r13.e(r0)
            goto L_0x0125
        L_0x0054:
            if (r13 != 0) goto L_0x0125
            r12.E()
            goto L_0x0125
        L_0x005b:
            b.a.a.a.i r13 = r12.s
            if (r13 == 0) goto L_0x0125
            boolean r9 = r12.y
            if (r9 != 0) goto L_0x0125
            boolean r9 = r12.z
            if (r9 != 0) goto L_0x0125
            int r13 = r13.w()
            if (r13 != r6) goto L_0x0125
            android.os.Handler r13 = r12.x
            boolean r13 = r13.hasMessages(r7)
            if (r13 == 0) goto L_0x007a
            android.os.Handler r13 = r12.x
            r13.removeMessages(r7)
        L_0x007a:
            boolean r13 = r12.t
            if (r13 == 0) goto L_0x0092
            r12.t = r8
            b.a.a.a.i r13 = r12.s
            r13.e(r8)
            android.widget.Button r13 = r12.j
            android.content.res.Resources r6 = r12.getResources()
            android.graphics.drawable.Drawable r4 = r6.getDrawable(r4)
            r13.setBackground(r4)
        L_0x0092:
            android.widget.SeekBar r13 = r12.i
            r13.setEnabled(r8)
            r12.z = r5
            android.widget.SeekBar r13 = r12.i
            int r13 = r13.getProgress()
            int r13 = r13 * 100
            int r13 = r13 + 5000
            long r4 = (long) r13
            long r6 = r12.p
            long r8 = r6 - r4
            r10 = 2000(0x7d0, double:9.88E-321)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 > 0) goto L_0x0104
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 > 0) goto L_0x00b3
            goto L_0x0105
        L_0x00b3:
            long r2 = r6 - r10
            goto L_0x0105
        L_0x00b6:
            b.a.a.a.i r13 = r12.s
            if (r13 == 0) goto L_0x0125
            boolean r9 = r12.y
            if (r9 != 0) goto L_0x0125
            boolean r9 = r12.z
            if (r9 != 0) goto L_0x0125
            int r13 = r13.w()
            if (r13 != r6) goto L_0x0125
            android.os.Handler r13 = r12.x
            boolean r13 = r13.hasMessages(r7)
            if (r13 == 0) goto L_0x00d5
            android.os.Handler r13 = r12.x
            r13.removeMessages(r7)
        L_0x00d5:
            boolean r13 = r12.t
            if (r13 == 0) goto L_0x00ed
            r12.t = r8
            b.a.a.a.i r13 = r12.s
            r13.e(r8)
            android.widget.Button r13 = r12.j
            android.content.res.Resources r6 = r12.getResources()
            android.graphics.drawable.Drawable r4 = r6.getDrawable(r4)
            r13.setBackground(r4)
        L_0x00ed:
            android.widget.SeekBar r13 = r12.i
            r13.setEnabled(r8)
            r12.z = r5
            android.widget.SeekBar r13 = r12.i
            int r13 = r13.getProgress()
            int r13 = r13 * 100
            int r13 = r13 + -5000
            long r4 = (long) r13
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 > 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r2 = r4
        L_0x0105:
            android.widget.TextView r13 = r12.g
            int r4 = (int) r2
            int r4 = r4 / 1000
            java.lang.String r4 = r12.J(r4)
            r13.setText(r4)
            android.widget.SeekBar r13 = r12.i
            long r0 = r2 / r0
            int r1 = (int) r0
            r13.setProgress(r1)
            b.a.a.a.i r13 = r12.s
            r13.A(r2)
            goto L_0x0125
        L_0x011f:
            r12.I()
            r12.finish()
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.X1NewPlayVideoActivity.onClick(android.view.View):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = configuration.orientation;
        if (i2 == 2) {
            this.A = false;
            A();
            w();
        } else if (i2 == 1) {
            this.A = true;
            B();
            x();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(R.layout.activity_newplayvideo);
        D();
        C();
        E();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        c0.a(0, "X1NewPlayVideoActivity", "onDestroy");
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        I();
        finish();
        return false;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2) {
            this.g.setText(J((seekBar.getProgress() * 100) / 1000));
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        c0.a(0, "X1NewPlayVideoActivity", "onResume");
        super.onResume();
        if (this.f1018a) {
            this.f1018a = false;
            if (this.s.w() == 3 && !this.t) {
                this.t = true;
                this.s.e(true);
                this.j.setBackground(getResources().getDrawable(R.drawable.playvideo_btn_pause_selector));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        c0.a(0, "X1NewPlayVideoActivity", "onStart");
        H();
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        c0.a(0, "X1NewPlayVideoActivity", "onStartTrackingTouch");
        this.y = true;
        if (this.x.hasMessages(40961)) {
            this.x.removeMessages(40961);
        }
        this.g.setText(J((seekBar.getProgress() * 100) / 1000));
        c0.a(0, "X1NewPlayVideoActivity", "getPlayWhenReady:" + this.s.q());
        if (this.t) {
            this.t = false;
            this.s.e(false);
            this.j.setBackground(getResources().getDrawable(R.drawable.playvideo_btn_start_selector));
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        c0.a(0, "X1NewPlayVideoActivity", "onStop");
        super.onStop();
        d dVar = this.f1019b;
        if (dVar != null) {
            unregisterReceiver(dVar);
        }
        this.f1018a = true;
        i iVar = this.s;
        if (iVar != null && iVar.w() == 3 && this.t) {
            this.t = false;
            this.s.e(false);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        c0.a(0, "X1NewPlayVideoActivity", "onStopTrackingTouch");
        seekBar.setEnabled(false);
        this.y = false;
        this.z = true;
        long progress = (long) (seekBar.getProgress() * 100);
        long j2 = this.p;
        if (j2 - progress <= 2000) {
            progress = j2 <= 2000 ? 0 : j2 - 2000;
        }
        this.g.setText(J(((int) progress) / 1000));
        seekBar.setProgress((int) (progress / 100));
        this.s.A(progress);
    }
}
