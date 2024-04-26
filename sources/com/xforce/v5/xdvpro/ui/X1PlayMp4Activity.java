package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import b.c.a.a.d.c;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.o;
import java.io.IOException;

public class X1PlayMp4Activity extends Activity implements View.OnClickListener, SurfaceHolder.Callback, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private Button f1053a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f1054b;
    private RelativeLayout c;
    private RelativeLayout.LayoutParams d;
    private RelativeLayout.LayoutParams e;
    private RelativeLayout.LayoutParams f;
    private RelativeLayout.LayoutParams g;
    private RelativeLayout h;
    private LinearLayout i;
    /* access modifiers changed from: private */
    public TextView j;
    /* access modifiers changed from: private */
    public TextView k;
    /* access modifiers changed from: private */
    public TextView l;
    /* access modifiers changed from: private */
    public TextView m;
    private ImageButton n;
    private boolean o = true;
    private SurfaceView p;
    /* access modifiers changed from: private */
    public SeekBar q;
    MediaPlayer r;
    /* access modifiers changed from: private */
    public int s;
    SurfaceHolder t;
    private LinearLayout u;
    private LinearLayout v;
    private String w;
    private String x;
    /* access modifiers changed from: private */
    public Handler y = new b();
    private b.c.a.a.d.c z;

    class a implements MediaPlayer.OnPreparedListener {
        a() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            X1PlayMp4Activity.this.q.setMax(mediaPlayer.getDuration());
            X1PlayMp4Activity.this.y.sendEmptyMessage(0);
            X1PlayMp4Activity.this.j.setText(X1PlayMp4Activity.this.u(mediaPlayer.getCurrentPosition()));
            X1PlayMp4Activity.this.k.setText(X1PlayMp4Activity.this.u(mediaPlayer.getCurrentPosition()));
            X1PlayMp4Activity.this.l.setText(X1PlayMp4Activity.this.u(mediaPlayer.getDuration()));
            X1PlayMp4Activity.this.m.setText(X1PlayMp4Activity.this.u(mediaPlayer.getDuration()));
            mediaPlayer.seekTo(X1PlayMp4Activity.this.s);
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                X1PlayMp4Activity x1PlayMp4Activity = X1PlayMp4Activity.this;
                MediaPlayer mediaPlayer = x1PlayMp4Activity.r;
                if (mediaPlayer != null) {
                    int unused = x1PlayMp4Activity.s = mediaPlayer.getCurrentPosition();
                }
                X1PlayMp4Activity.this.q.setProgress(X1PlayMp4Activity.this.s);
                TextView c = X1PlayMp4Activity.this.j;
                X1PlayMp4Activity x1PlayMp4Activity2 = X1PlayMp4Activity.this;
                c.setText(x1PlayMp4Activity2.u(x1PlayMp4Activity2.s));
                TextView d = X1PlayMp4Activity.this.k;
                X1PlayMp4Activity x1PlayMp4Activity3 = X1PlayMp4Activity.this;
                d.setText(x1PlayMp4Activity3.u(x1PlayMp4Activity3.s));
                X1PlayMp4Activity.this.y.sendEmptyMessage(0);
            } else if (i == 1) {
                X1PlayMp4Activity.this.finish();
            }
        }
    }

    class c implements c.b {
        c(X1PlayMp4Activity x1PlayMp4Activity) {
        }

        public void a() {
            b.c.a.a.d.b.z(0);
        }

        public void b() {
        }
    }

    @SuppressLint({"NewApi"})
    private void i() {
        c0.a(0, "X1PlayMp4Activity", "changeLanscapeView");
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags |= 1024;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(512);
        this.c.setLayoutParams(this.e);
        this.h.setBackgroundColor(getResources().getColor(R.color.lan_bottom_bg_color));
        this.h.setVisibility(8);
        this.f1053a.setTextColor(getResources().getColor(R.color.white));
        this.j.setTextColor(getResources().getColor(R.color.white));
        this.l.setTextColor(getResources().getColor(R.color.white));
        this.i.setBackground(getResources().getDrawable(R.drawable.video_lan_opt_bg));
        this.i.setVisibility(8);
        this.i.setLayoutParams(this.f);
        this.i.setGravity(17);
        this.v.setVisibility(0);
        this.u.setVisibility(8);
    }

    @SuppressLint({"NewApi"})
    private void j() {
        c0.a(0, "X1PlayMp4Activity", "changePortraitView");
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags &= -1025;
        getWindow().setAttributes(attributes);
        getWindow().clearFlags(512);
        this.f1054b.setBackgroundColor(getResources().getColor(R.color.groupitem_bg));
        this.c.setLayoutParams(this.d);
        this.h.setBackgroundDrawable(getResources().getDrawable(R.drawable.top_title_bar_bg));
        this.h.setVisibility(0);
        this.f1053a.setTextColor(getResources().getColor(R.color.main_color));
        this.j.setTextColor(getResources().getColor(R.color.black));
        this.l.setTextColor(getResources().getColor(R.color.black));
        this.i.setBackgroundColor(getResources().getColor(R.color.transparent));
        this.i.setVisibility(0);
        this.i.setLayoutParams(this.g);
        this.i.setGravity(1);
        this.v.setVisibility(8);
        this.u.setVisibility(0);
    }

    private void k() {
        MediaPlayer mediaPlayer = this.r;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.r.release();
            this.r = null;
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.r = mediaPlayer2;
        mediaPlayer2.setOnCompletionListener(this);
        this.r.setOnErrorListener(this);
        this.r.setOnPreparedListener(this);
        this.r.setOnSeekCompleteListener(this);
        this.r.setOnVideoSizeChangedListener(this);
        Uri parse = Uri.parse(this.w);
        this.f1053a.setText(this.x);
        try {
            this.r.setDataSource(this, parse);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.r.prepare();
            this.r.setOnPreparedListener(new a());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private void l() {
        this.w = getIntent().getStringExtra("param_url");
        this.x = getIntent().getStringExtra("param_name");
    }

    private void m() {
        this.p = (SurfaceView) findViewById(R.id.playmp4_video_view);
        this.q = (SeekBar) findViewById(R.id.playmp4_video_seekbar);
        this.n.setOnClickListener(this);
        this.q.setOnSeekBarChangeListener(this);
        SurfaceHolder holder = this.p.getHolder();
        this.t = holder;
        holder.addCallback(this);
        this.t.setType(3);
    }

    private void n() {
        Button button = (Button) findViewById(R.id.back_btn);
        this.f1053a = button;
        button.setOnClickListener(this);
        this.f1054b = (RelativeLayout) findViewById(R.id.main_bg);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.playmp4_video);
        this.c = relativeLayout;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = (b.c.a.a.d.b.i * 9) / 16;
        this.d = layoutParams;
        int i2 = b.c.a.a.d.b.h;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, (i2 * 9) / 16);
        this.e = layoutParams2;
        layoutParams2.addRule(13);
        this.c.setLayoutParams(this.d);
        this.c.setOnClickListener(this);
        this.h = (RelativeLayout) findViewById(R.id.top_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.playmp4_ctl);
        this.i = linearLayout;
        this.g = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        this.f = new RelativeLayout.LayoutParams(-1, (int) getResources().getDimension(R.dimen.video_lanopt_bg_height));
        int dimension = (int) getResources().getDimension(R.dimen.playmp4_ctlbtn_margin);
        RelativeLayout.LayoutParams layoutParams3 = this.f;
        layoutParams3.bottomMargin = dimension;
        layoutParams3.leftMargin = dimension;
        layoutParams3.rightMargin = dimension;
        layoutParams3.addRule(12);
        this.j = (TextView) findViewById(R.id.playmp4_ctl_left_text);
        this.k = (TextView) findViewById(R.id.playmp4_ctl_left_text2);
        this.l = (TextView) findViewById(R.id.playmp4_ctl_right_text);
        this.m = (TextView) findViewById(R.id.playmp4_ctl_right_text2);
        ImageButton imageButton = (ImageButton) findViewById(R.id.playmp4_ctl_btn_mid_por);
        this.n = imageButton;
        imageButton.setOnClickListener(this);
        this.u = (LinearLayout) findViewById(R.id.playmp4_ctl_right_tips_ll);
        this.v = (LinearLayout) findViewById(R.id.playmp4_ctl_right_tips_ll2);
        if (o(this)) {
            this.o = false;
            i();
        }
    }

    public static boolean o(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private void p() {
        int i2;
        ImageButton imageButton;
        c0.a(0, "X1PlayMp4Activity", "midBtnOpt() isPlaying = " + this.r.isPlaying());
        if (this.r.isPlaying()) {
            q();
            imageButton = this.n;
            i2 = R.drawable.playmp4_por_midbtn_0_selector;
        } else {
            r();
            imageButton = this.n;
            i2 = R.drawable.playmp4_por_midbtn_1_selector;
        }
        imageButton.setBackgroundResource(i2);
    }

    private void q() {
        this.r.pause();
    }

    private void r() {
        this.r.start();
        this.n.setBackgroundResource(R.drawable.playmp4_por_midbtn_1_selector);
    }

    private void s() {
        b.c.a.a.d.c cVar = new b.c.a.a.d.c(this);
        this.z = cVar;
        cVar.b(new c(this));
        this.z.c();
    }

    private void t() {
        c0.a(0, "X1PlayMp4Activity", "resetPlayer()");
        this.q.setProgress(0);
        this.s = 0;
        this.j.setText(u(0));
        this.k.setText(u(this.s));
        this.n.setBackgroundResource(R.drawable.playmp4_por_midbtn_0_selector);
        MediaPlayer mediaPlayer = this.r;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.r.pause();
            }
            this.r.reset();
        }
        this.f1053a.setText(this.x);
        try {
            this.r.setDataSource(this.w);
            this.r.prepare();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (SecurityException e3) {
            e3.printStackTrace();
        } catch (IllegalStateException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    private void v(boolean z2) {
        c0.a(0, "X1PlayMp4Activity", "totalStopVideo()");
        MediaPlayer mediaPlayer = this.r;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                q();
            }
            this.r.reset();
            this.r.release();
            this.r = null;
        }
        if (z2) {
            this.y.sendEmptyMessageDelayed(1, 500);
        }
    }

    public void onClick(View view) {
        RelativeLayout relativeLayout;
        int i2;
        LinearLayout linearLayout;
        int i3;
        switch (view.getId()) {
            case R.id.back_btn /*2131230730*/:
                v(true);
                return;
            case R.id.playmp4_ctl_btn_mid_lan /*2131230897*/:
            case R.id.playmp4_ctl_btn_mid_por /*2131230898*/:
                p();
                return;
            case R.id.playmp4_video /*2131230911*/:
                if (!this.o) {
                    if (8 == this.h.getVisibility()) {
                        this.h.setVisibility(0);
                        relativeLayout = this.h;
                        i2 = R.anim.push_top_in;
                    } else {
                        this.h.setVisibility(8);
                        relativeLayout = this.h;
                        i2 = R.anim.push_top_out;
                    }
                    relativeLayout.startAnimation(AnimationUtils.loadAnimation(this, i2));
                    if (8 == this.i.getVisibility()) {
                        this.i.setVisibility(0);
                        linearLayout = this.i;
                        i3 = R.anim.push_bottom_in;
                    } else {
                        this.i.setVisibility(8);
                        linearLayout = this.i;
                        i3 = R.anim.push_bottom_out;
                    }
                    linearLayout.startAnimation(AnimationUtils.loadAnimation(this, i3));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        c0.a(0, "X1PlayMp4Activity", "onCompletion and ==== resetPlayer");
        this.y.removeMessages(0);
        t();
    }

    public void onConfigurationChanged(Configuration configuration) {
        o.c();
        int i2 = configuration.orientation;
        if (i2 == 2) {
            this.o = false;
            i();
        } else if (i2 == 1) {
            this.o = true;
            j();
        }
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_playmp4);
        n();
        l();
        m();
        k();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        return false;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        return false;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            v(true);
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2) {
            this.r.seekTo(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        b.c.a.a.d.b.z(1);
        s();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.z.d();
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        c0.a(0, "X1PlayMp4Activity", "surfaceChanged()");
        this.r.setDisplay(this.t);
        r();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public String u(int i2) {
        int i3 = i2 / 1000;
        int i4 = i3 / 60;
        int i5 = i4 / 60;
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i4 % 60), Integer.valueOf(i3 % 60)});
    }
}
