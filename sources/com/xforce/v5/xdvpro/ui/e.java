package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import b.b.d.b;
import b.b.d.c;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.xforce.v5.xdvpro.R;
import java.util.ArrayList;
import java.util.List;

public class e extends android.support.v4.app.e implements RadioGroup.OnCheckedChangeListener {
    private int Y = 1664;
    private g Z;
    private RadioGroup a0;
    private c b0;
    private List<String> c0;
    private List<RadioButton> d0;

    public void V(Bundle bundle) {
        super.V(bundle);
    }

    @SuppressLint({"NewApi"})
    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d("X1OptSportCaptureFragment", "onCreateView    ");
        View inflate = layoutInflater.inflate(R.layout.fragment_optslowphotography, (ViewGroup) null);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.opt_radiogroup);
        this.a0 = radioGroup;
        radioGroup.setOnCheckedChangeListener(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.a0.getLayoutParams();
        c q = b.e().q();
        this.b0 = q;
        this.c0 = q.a();
        Log.d("X1OptSportCaptureFragment", "all_item  size " + this.c0.size());
        if (this.c0.size() <= 1) {
            layoutParams.width = ((int) g().getResources().getDimension(R.dimen.opt_record_bar_width)) / 2;
            this.a0.setLayoutParams(layoutParams);
        }
        this.d0 = new ArrayList();
        RadioGroup.LayoutParams layoutParams2 = new RadioGroup.LayoutParams(-1, -1, 1.0f);
        for (int i = 0; i < this.c0.size(); i++) {
            RadioButton radioButton = new RadioButton(g());
            radioButton.setButtonDrawable(R.drawable.video_por_wbset_item_selector);
            radioButton.setText(this.c0.get(i));
            radioButton.setId(i);
            radioButton.setTag("wb_" + i);
            radioButton.setGravity(17);
            this.d0.add(radioButton);
            this.a0.addView(radioButton, layoutParams2);
        }
        if (!g.i1) {
            for (RadioButton textColor : this.d0) {
                textColor.setTextColor(y().getColor(R.color.main_color));
            }
        }
        return inflate;
    }

    public void k1() {
        Log.d("X1OptSportCaptureFragment", "refreshViews    ");
        int s = this.c0.size() > 1 ? d0.t().s("ml_record_slowmotion") : 0;
        this.a0.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        this.d0.get(s).setChecked(true);
        this.a0.setOnCheckedChangeListener(this);
    }

    public void l1(g gVar) {
        this.Z = gVar;
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.c0.size() > 1 && this.Z != null && i != -1) {
            d0.t().Q("ml_record_slowmotion", i);
            this.Z.W1(this.Y, i);
        }
    }

    public void p0() {
        super.p0();
        c0.a(0, "X1OptSportCaptureFragment", "onResume()");
        if (!g.i1) {
            k1();
        }
    }

    public void s0() {
        super.s0();
        c0.a(0, "X1OptSportCaptureFragment", "onStop()");
    }
}
