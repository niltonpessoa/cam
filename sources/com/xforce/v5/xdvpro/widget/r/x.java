package com.xforce.v5.xdvpro.widget.r;

public class x implements o {

    /* renamed from: a  reason: collision with root package name */
    private j f1282a;

    /* renamed from: b  reason: collision with root package name */
    private w f1283b;
    private g0 c;
    private l d;

    public x() {
        j jVar = new j();
        this.f1282a = jVar;
        jVar.f1262a = 0.3f;
        w wVar = new w();
        this.f1283b = wVar;
        wVar.f1281a = 0.03f;
        g0 g0Var = new g0();
        this.c = g0Var;
        g0Var.f1253a = 0.6f;
        l lVar = new l();
        this.d = lVar;
        lVar.c = 0.3f;
    }

    public r a(r rVar) {
        w wVar = this.f1283b;
        this.f1282a.a(rVar);
        wVar.a(rVar);
        r a2 = this.d.a(rVar);
        this.c.a(a2);
        return a2;
    }
}
