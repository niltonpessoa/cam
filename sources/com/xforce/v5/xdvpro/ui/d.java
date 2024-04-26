package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.X1SegmentButton;

public class d extends e implements SeekBar.OnSeekBarChangeListener {
    private X1SegmentButton Y;
    private SeekBar Z;
    private int a0;
    private Drawable b0;
    private Drawable c0;
    private g d0;
    private X1SegmentButton.a e0 = new a();
    private Handler f0 = new b();

    class a implements X1SegmentButton.a {
        a() {
        }

        public void a(int i, Button button) {
            if (i == 0) {
                d.this.u1();
                d.this.r1();
            } else if (i == 1) {
                d.this.t1();
            } else if (i == 2) {
                d.this.s1();
            }
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1000) {
                d.this.p1();
            }
        }
    }

    /* access modifiers changed from: private */
    public void p1() {
        SeekBar seekBar;
        int s;
        int s2 = d0.t().s("ml_record_loop");
        if (d0.t().s("ml_record_timelapse") > 0) {
            if (this.Y.getPosition() != 2) {
                this.Y.setPosition(2);
                s1();
                return;
            }
            seekBar = this.Z;
            s = d0.t().s("ml_record_timelapse");
        } else if (s2 > 0) {
            if (this.Y.getPosition() != 1) {
                this.Y.setPosition(1);
                t1();
                return;
            }
            seekBar = this.Z;
            s = d0.t().s("ml_record_loop");
        } else if (this.Y.getPosition() != 0) {
            this.Y.setPosition(0);
            u1();
            return;
        } else {
            return;
        }
        seekBar.setProgress(s);
    }

    /* access modifiers changed from: private */
    public void r1() {
        d0.t().Q("ml_record_loop", 0);
        this.d0.W1(1650, 0);
        d0.t().Q("ml_record_timelapse", 0);
        this.d0.W1(1652, 0);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void s1() {
        if (8 == this.Z.getVisibility()) {
            this.Z.setVisibility(0);
        }
        this.Z.setBackground(this.c0);
        this.Z.setMax(7);
        this.Z.setProgress(d0.t().s("ml_record_timelapse"));
        this.a0 = 1652;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void t1() {
        if (8 == this.Z.getVisibility()) {
            this.Z.setVisibility(0);
        }
        this.Z.setBackground(this.b0);
        this.Z.setMax(3);
        this.Z.setProgress(d0.t().s("ml_record_loop"));
        this.a0 = 1650;
    }

    /* access modifiers changed from: private */
    public void u1() {
        this.Z.setVisibility(8);
        this.a0 = -1;
    }

    public void V(Bundle bundle) {
        super.V(bundle);
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Resources resources;
        View inflate = layoutInflater.inflate(R.layout.fragment_optrecord, (ViewGroup) null);
        X1SegmentButton x1SegmentButton = (X1SegmentButton) inflate.findViewById(R.id.opt_segment);
        this.Y = x1SegmentButton;
        x1SegmentButton.setOnCheckedChangeListener(this.e0);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.opt_radiogroup);
        this.Z = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        if (g.i1) {
            this.b0 = y().getDrawable(R.drawable.video_opt_record_duration);
            resources = y();
            i = R.drawable.video_opt_record_delay_tm;
        } else {
            this.b0 = y().getDrawable(R.drawable.video_opt_record_duration_lan);
            resources = y();
            i = R.drawable.video_opt_record_delay_tm_lan;
        }
        this.c0 = resources.getDrawable(i);
        return inflate;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int i;
        int i2;
        g gVar;
        int progress = seekBar.getProgress();
        int i3 = this.a0;
        if (i3 == 1650) {
            i = d0.t().s("ml_record_loop");
            d0.t().Q("ml_record_loop", progress);
            d0.t().Q("ml_record_timelapse", 0);
        } else if (i3 != 1652) {
            i = -1;
        } else {
            i = d0.t().s("ml_record_timelapse");
            d0.t().Q("ml_record_timelapse", progress);
            d0.t().Q("ml_record_loop", 0);
        }
        if (i != progress && (i2 = this.a0) != -1 && (gVar = this.d0) != null) {
            gVar.W1(i2, progress);
        }
    }

    public void p0() {
        super.p0();
        c0.a(0, "X1OptRecordFragment", "onResume()");
        if (!g.i1) {
            q1();
        }
    }

    public void q1() {
        c0.a(0, "X1OptRecordFragment", "refreshViews()");
        this.f0.sendEmptyMessage(1000);
    }

    public void s0() {
        super.s0();
        c0.a(0, "X1OptRecordFragment", "onStop()");
    }

    public void v1(g gVar) {
        this.d0 = gVar;
    }
}
