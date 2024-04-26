package com.xforce.v5.xdvpro.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.xforce.v5.xdvpro.R;
import java.util.ArrayList;

public class X1SegmentButton extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private a f1172a;

    /* renamed from: b  reason: collision with root package name */
    private Context f1173b;
    private ArrayList<Button> c;
    private String[] d;
    private int e = 0;
    private int f;
    private int g;
    private int h;
    private float i;
    private String j;

    public interface a {
        void a(int i, Button button);
    }

    public X1SegmentButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1173b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.a.a.a.f826b);
        this.f = obtainStyledAttributes.getColor(2, -1);
        this.g = obtainStyledAttributes.getColor(1, Color.rgb(0, 122, 255));
        this.i = obtainStyledAttributes.getFloat(3, 16.0f);
        String string = obtainStyledAttributes.getString(0);
        this.j = string;
        if (string != null && !"".equals(string)) {
            String[] split = this.j.split(";");
            this.d = split;
            if (split != null) {
                this.h = split.length;
                b();
            }
        }
        this.h = 0;
        b();
    }

    private void a() {
        Button button;
        Resources resources;
        int i2;
        a aVar;
        int i3 = 0;
        while (true) {
            int i4 = this.h;
            if (i3 < i4) {
                if (i3 == 0) {
                    if (this.e == i3) {
                        this.c.get(i3).setBackgroundDrawable(this.f1173b.getResources().getDrawable(R.drawable.segment_left_press));
                        this.c.get(i3).setTextColor(this.f);
                        this.e = i3;
                        aVar = this.f1172a;
                        if (aVar == null) {
                            i3++;
                        }
                    } else {
                        button = this.c.get(i3);
                        resources = this.f1173b.getResources();
                        i2 = R.drawable.segment_left_normal;
                        button.setBackgroundDrawable(resources.getDrawable(i2));
                        this.c.get(i3).setTextColor(this.g);
                        i3++;
                    }
                } else if (i3 == i4 - 1) {
                    if (this.e == i3) {
                        this.c.get(i3).setBackgroundDrawable(this.f1173b.getResources().getDrawable(R.drawable.segment_right_press));
                        this.c.get(i3).setTextColor(this.f);
                        this.e = i3;
                        aVar = this.f1172a;
                        if (aVar == null) {
                            i3++;
                        }
                    } else {
                        button = this.c.get(i3);
                        resources = this.f1173b.getResources();
                        i2 = R.drawable.segment_right_normal;
                        button.setBackgroundDrawable(resources.getDrawable(i2));
                        this.c.get(i3).setTextColor(this.g);
                        i3++;
                    }
                } else if (this.e == i3) {
                    this.c.get(i3).setBackgroundDrawable(this.f1173b.getResources().getDrawable(R.drawable.segment_middle_press));
                    this.c.get(i3).setTextColor(this.f);
                    this.e = i3;
                    aVar = this.f1172a;
                    if (aVar == null) {
                        i3++;
                    }
                } else {
                    button = this.c.get(i3);
                    resources = this.f1173b.getResources();
                    i2 = R.drawable.segment_middle_normal;
                    button.setBackgroundDrawable(resources.getDrawable(i2));
                    this.c.get(i3).setTextColor(this.g);
                    i3++;
                }
                aVar.a(i3, this.c.get(i3));
                i3++;
            } else {
                return;
            }
        }
    }

    private void b() {
        int i2;
        Resources resources;
        int i3;
        this.c = new ArrayList<>();
        if (this.h == 1) {
            Button button = new Button(this.f1173b);
            button.setBackgroundDrawable(this.f1173b.getResources().getDrawable(R.drawable.segment_single));
            button.setTextSize(this.i);
            button.setTextColor(this.f);
            button.setGravity(17);
            button.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            button.setTag(0);
            addView(button);
            button.setOnClickListener(this);
            this.c.add(button);
        } else {
            for (int i4 = 0; i4 < this.h; i4++) {
                Button button2 = new Button(this.f1173b);
                if (i4 == 0) {
                    button2.setBackgroundDrawable(this.f1173b.getResources().getDrawable(R.drawable.segment_left_press));
                    i3 = this.f;
                } else {
                    if (i4 == this.h - 1) {
                        resources = this.f1173b.getResources();
                        i2 = R.drawable.segment_right_normal;
                    } else {
                        resources = this.f1173b.getResources();
                        i2 = R.drawable.segment_middle_normal;
                    }
                    button2.setBackgroundDrawable(resources.getDrawable(i2));
                    i3 = this.g;
                }
                button2.setTextColor(i3);
                button2.setTextSize(this.i);
                button2.setGravity(17);
                button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                button2.setTag(Integer.valueOf(i4));
                addView(button2);
                button2.setOnClickListener(this);
                this.c.add(button2);
            }
        }
        for (int i5 = 0; i5 < this.h; i5++) {
            this.c.get(i5).setText(this.d[i5]);
        }
    }

    public int getPosition() {
        return this.e;
    }

    public void onClick(View view) {
        this.e = ((Integer) view.getTag()).intValue();
        a();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f1172a = aVar;
    }

    public void setPosition(int i2) {
        this.e = i2;
        a();
    }
}
