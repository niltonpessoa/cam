package com.xforce.v5.xdvpro.widget.r;

import com.xforce.v5.xdvpro.widget.r.k;
import com.xforce.v5.xdvpro.widget.r.s;
import java.util.ArrayList;

public class h0 implements o {

    /* renamed from: a  reason: collision with root package name */
    private l f1256a = new l();

    /* renamed from: b  reason: collision with root package name */
    private s f1257b = new s();

    public h0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(k.a.a()));
        arrayList.add(-16777216);
        this.f1256a.f1264a = new k(arrayList);
        s sVar = this.f1257b;
        sVar.f1274b = s.a.f1276b;
        sVar.f1273a = 0.8f;
    }

    public r a(r rVar) {
        r a2 = this.f1256a.a(rVar);
        this.f1257b.a(a2, a2);
        return a2;
    }
}
