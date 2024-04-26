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

public class c extends e implements SeekBar.OnSeekBarChangeListener {
    private X1SegmentButton Y;
    private SeekBar Z;
    private int a0;
    private Drawable b0;
    private Drawable c0;
    private Drawable d0;
    private g e0;
    private X1SegmentButton.a f0 = new a();
    private Handler g0 = new b();

    class a implements X1SegmentButton.a {
        a() {
        }

        public void a(int i, Button button) {
            if (i == 0) {
                c.this.v1();
                c.this.s1();
            } else if (i == 1) {
                c.this.x1();
            } else if (i == 2) {
                c.this.u1();
            } else if (i == 3) {
                c.this.t1();
            }
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1000) {
                c.this.q1();
            }
        }
    }

    /* access modifiers changed from: private */
    public void q1() {
        SeekBar seekBar;
        int s;
        int s2 = d0.t().s("ml_photo_timed");
        int s3 = d0.t().s("ml_photo_auto");
        int s4 = d0.t().s("ml_photo_dramashot");
        if (s2 <= 0) {
            int position = this.Y.getPosition();
            if (s4 > 0) {
                if (position != 2) {
                    this.Y.setPosition(2);
                    u1();
                    return;
                }
                seekBar = this.Z;
                s = d0.t().s("ml_photo_dramashot");
            } else if (s3 > 0) {
                if (position != 3) {
                    this.Y.setPosition(3);
                    t1();
                    return;
                }
                seekBar = this.Z;
                s = d0.t().s("ml_photo_auto");
            } else if (position != 0) {
                this.Y.setPosition(0);
                v1();
                return;
            } else {
                return;
            }
        } else if (this.Y.getPosition() != 1) {
            this.Y.setPosition(1);
            x1();
            return;
        } else {
            seekBar = this.Z;
            s = d0.t().s("ml_photo_timed");
        }
        seekBar.setProgress(s);
    }

    /* access modifiers changed from: private */
    public void s1() {
        d0.t().Q("ml_photo_timed", 0);
        this.e0.W1(1668, 0);
        d0.t().Q("ml_photo_auto", 0);
        this.e0.W1(1670, 0);
        d0.t().Q("ml_photo_dramashot", 0);
        this.e0.W1(1672, 0);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void t1() {
        if (8 == this.Z.getVisibility()) {
            this.Z.setVisibility(0);
        }
        this.Z.setBackground(this.b0);
        this.Z.setMax(5);
        this.Z.setProgress(d0.t().s("ml_photo_auto"));
        this.a0 = 1670;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void u1() {
        if (8 == this.Z.getVisibility()) {
            this.Z.setVisibility(0);
        }
        this.Z.setBackground(this.d0);
        this.Z.setMax(3);
        this.Z.setProgress(d0.t().s("ml_photo_dramashot"));
        this.a0 = 1672;
    }

    /* access modifiers changed from: private */
    public void v1() {
        this.Z.setVisibility(8);
        this.a0 = -1;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void x1() {
        if (8 == this.Z.getVisibility()) {
            this.Z.setVisibility(0);
        }
        this.Z.setBackground(this.c0);
        this.Z.setMax(4);
        this.Z.setProgress(d0.t().s("ml_photo_timed"));
        this.a0 = 1668;
    }

    public void V(Bundle bundle) {
        super.V(bundle);
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Resources resources;
        View inflate = layoutInflater.inflate(R.layout.fragment_optcapture, (ViewGroup) null);
        X1SegmentButton x1SegmentButton = (X1SegmentButton) inflate.findViewById(R.id.opt_segment);
        this.Y = x1SegmentButton;
        x1SegmentButton.setOnCheckedChangeListener(this.f0);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.opt_radiogroup);
        this.Z = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        if (g.i1) {
            this.b0 = y().getDrawable(R.drawable.video_opt_capture_auto);
            this.c0 = y().getDrawable(R.drawable.video_opt_capture_timing);
            resources = y();
            i = R.drawable.video_opt_capture_lapse;
        } else {
            this.b0 = y().getDrawable(R.drawable.video_opt_capture_auto_lan);
            this.c0 = y().getDrawable(R.drawable.video_opt_capture_timing_lan);
            resources = y();
            i = R.drawable.video_opt_capture_lapse_lan;
        }
        this.d0 = resources.getDrawable(i);
        return inflate;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        c0.a(0, "X1OptCaptureFragment", "onProgressChanged ar0  == " + seekBar + "  ar1 ==" + i + " ar2 ==" + z);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopTrackingTouch(android.widget.SeekBar r8) {
        /*
            r7 = this;
            int r8 = r8.getProgress()
            int r0 = r7.a0
            r1 = 1668(0x684, float:2.337E-42)
            r2 = -1
            java.lang.String r3 = "ml_photo_auto"
            java.lang.String r4 = "ml_photo_dramashot"
            java.lang.String r5 = "ml_photo_timed"
            r6 = 0
            if (r0 == r1) goto L_0x0051
            r1 = 1670(0x686, float:2.34E-42)
            if (r0 == r1) goto L_0x0033
            r1 = 1672(0x688, float:2.343E-42)
            if (r0 == r1) goto L_0x001c
            r0 = -1
            goto L_0x006e
        L_0x001c:
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            int r0 = r0.s(r4)
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            r1.Q(r5, r6)
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            r1.Q(r4, r8)
            goto L_0x0067
        L_0x0033:
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            int r0 = r0.s(r3)
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            r1.Q(r5, r6)
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            r1.Q(r4, r6)
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            r1.Q(r3, r8)
            goto L_0x006e
        L_0x0051:
            com.rp.rptool.util.d0 r0 = com.rp.rptool.util.d0.t()
            int r0 = r0.s(r5)
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            r1.Q(r5, r8)
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            r1.Q(r4, r6)
        L_0x0067:
            com.rp.rptool.util.d0 r1 = com.rp.rptool.util.d0.t()
            r1.Q(r3, r6)
        L_0x006e:
            if (r0 == r8) goto L_0x007b
            int r0 = r7.a0
            if (r0 == r2) goto L_0x007b
            com.xforce.v5.xdvpro.ui.g r1 = r7.e0
            if (r1 == 0) goto L_0x007b
            r1.W1(r0, r8)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.c.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    public void p0() {
        super.p0();
        c0.a(0, "X1OptCaptureFragment", "onResume()");
        if (!g.i1) {
            r1();
        }
    }

    public void r1() {
        c0.a(0, "X1OptCaptureFragment", "refreshViews()");
        this.g0.sendEmptyMessage(1000);
    }

    public void s0() {
        super.s0();
        c0.a(0, "X1OptCaptureFragment", "onStop()");
    }

    public void w1(g gVar) {
        this.e0 = gVar;
    }
}
