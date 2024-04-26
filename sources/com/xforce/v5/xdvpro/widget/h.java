package com.xforce.v5.xdvpro.widget;

import android.support.v4.app.e;
import android.support.v4.app.j;
import android.support.v4.app.n;
import android.view.ViewGroup;
import java.util.ArrayList;

public class h extends n {
    private ArrayList<e> d;

    public h(j jVar, ArrayList<e> arrayList) {
        super(jVar);
        this.d = arrayList;
    }

    public int d() {
        return this.d.size();
    }

    public void l(ViewGroup viewGroup, int i, Object obj) {
        super.l(viewGroup, i, obj);
    }

    public e p(int i) {
        return this.d.get(i);
    }
}
