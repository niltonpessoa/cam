package com.rp.rptool.util;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import b.b.a.f;
import b.b.a.h;
import com.rp.rptool.util.v;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class d0 {
    private static d0 k;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f932a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f933b = false;
    /* access modifiers changed from: private */
    public boolean c;
    private b.b.e.a.c d;
    private e e;
    private Handler f = new a();
    /* access modifiers changed from: private */
    public Handler g = new b();
    private v.a h = new c();
    private List<s> i;
    h j = new d(this);

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                d0.this.J((b.b.e.a.a) message.obj);
            }
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            c0.a(0, "RPToolUtil", "handleMessage() msg.what = " + message.what);
            switch (message.what) {
                case 1001:
                    d0.this.G((b.b.e.a.b) message.obj);
                    return;
                case 1002:
                    d0 d0Var = d0.this;
                    if (d0Var.f933b) {
                        d0Var.g.removeMessages(1002);
                        return;
                    }
                    v.sed();
                    d0.d(d0.this);
                    if (d0.this.f932a < 10) {
                        d0.this.g.sendEmptyMessageDelayed(1002, 1000);
                        return;
                    }
                    boolean unused = d0.this.c = false;
                    d0 d0Var2 = d0.this;
                    d0Var2.f933b = false;
                    b.b.e.a.b bVar = new b.b.e.a.b(-1, (byte[]) null, 12322, (byte[]) null, -1);
                    Message obtainMessage = d0Var2.g.obtainMessage();
                    obtainMessage.what = 1001;
                    obtainMessage.obj = bVar;
                    d0.this.g.sendMessage(obtainMessage);
                    return;
                case 1003:
                    d0.this.v((s) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    class c implements v.a {
        c() {
        }

        public void a(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
            if (i2 == 12322) {
                d0 d0Var = d0.this;
                d0Var.f933b = true;
                boolean unused = d0Var.c = false;
            }
            if (i2 == 40998) {
                s sVar = new s(bArr2);
                c0.a(0, "RPToolUtil", "NAT_CMD_GET_FILE_LIST_RESP" + sVar.toString());
                Message obtainMessage = d0.this.g.obtainMessage();
                obtainMessage.what = 1003;
                obtainMessage.obj = sVar;
                d0.this.g.sendMessage(obtainMessage);
                return;
            }
            b.b.e.a.b bVar = new b.b.e.a.b(i, bArr, i2, bArr2, i3);
            Message obtainMessage2 = d0.this.g.obtainMessage();
            obtainMessage2.what = 1001;
            obtainMessage2.obj = bVar;
            d0.this.g.sendMessage(obtainMessage2);
        }
    }

    class d implements h {
        d(d0 d0Var) {
        }

        public void a(String str) {
            String str2;
            if (str.equals(b.b.b.c.b.f800a)) {
                str2 = "download db info fail!~~~";
            } else if (str.equals("menu_config.lua")) {
                str2 = "download menu_config.lua fail!~~~";
            } else if (str.equals("net_config.lua")) {
                str2 = "download net_config.lua fail!~~~";
            } else {
                return;
            }
            c0.a(0, "RPToolUtil", str2);
        }

        public void b(String str) {
            String str2;
            if (str.equals(b.b.b.c.b.f800a)) {
                str2 = "download db info success!~~~";
            } else if (str.equals("menu_config.lua")) {
                str2 = "download menu_config.lua success!~~~";
            } else if (str.equals("net_config.lua")) {
                str2 = "download net_config.lua success!~~~";
            } else {
                return;
            }
            c0.a(0, "RPToolUtil", str2);
        }
    }

    public interface e {
        void a(b.b.e.a.b bVar);
    }

    /* access modifiers changed from: private */
    public void G(b.b.e.a.b bVar) {
        c0.a(0, "RPToolUtil", "sendIOCtrlMsgResp() rtnMsg = " + bVar);
        e eVar = this.e;
        if (eVar != null) {
            eVar.a(bVar);
        }
    }

    static /* synthetic */ int d(d0 d0Var) {
        int i2 = d0Var.f932a;
        d0Var.f932a = i2 + 1;
        return i2;
    }

    public static synchronized d0 t() {
        d0 d0Var;
        synchronized (d0.class) {
            if (k == null) {
                k = new d0();
            }
            d0Var = k;
        }
        return d0Var;
    }

    private void u(List<s> list) {
        StringBuffer stringBuffer = new StringBuffer();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                stringBuffer.append(new String(list.get(i2).c, "UTF-8").trim());
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        c0.a(3, "RPToolUtil", "handleRtnGetAllFileList------ list = " + stringBuffer.toString());
        D(stringBuffer.toString());
    }

    /* access modifiers changed from: private */
    public void v(s sVar) {
        Log.e("RPToolUtil", "handleRtnGetFileList() run here?????");
        if (this.i == null) {
            this.i = new ArrayList();
        }
        if (sVar.f960b == 0 && this.i.size() > 0) {
            this.i.clear();
        }
        this.i.add(sVar);
        if (sVar.f960b == sVar.f959a - 1) {
            u(this.i);
        }
    }

    public void A(Context context, String str) {
        b.b.d.d.c().f(context, str);
    }

    public void B() {
        c0.a(1, "RPToolUtil", "initTool()");
        v.setJniCallbackListener(this.h);
        v.yt();
    }

    public boolean C(Context context) {
        return b.b.c.a.b().f(context);
    }

    public void D(String str) {
        b.b.b.a.c().e(str);
    }

    public void E() {
        h hVar = this.j;
        if (!(hVar == null && hVar == b.b.a.e.q().r())) {
            b.b.a.e.q().t(this.j);
        }
        b.b.a.a aVar = new b.b.a.a(b.b.b.c.b.f800a, b.b.b.c.b.c, b.b.b.c.b.f801b);
        File file = new File(b.b.b.c.b.f801b + File.separator + b.b.b.c.b.f800a);
        if (file.exists() && file.delete()) {
            c0.a(3, "RPToolUtil", "refreshFileDBInfo 旧数据删除成功");
        }
        c0.a(3, "RPToolUtil", "refreshFileDBInfo -- dlDBFile = " + aVar);
        l(aVar);
    }

    public void F() {
        J(new b.b.e.a.a(q(), 40997, x.a(1), x.b()));
    }

    public void H(String str, String str2) {
        c0.a(1, "RPToolUtil", "sendConnectDevice()");
        v.cd(str, str2);
    }

    public void I() {
        c0.a(1, "RPToolUtil", "sendDisConnectDevice()");
        if (this.d != null) {
            v.dd(q());
        }
    }

    public boolean J(b.b.e.a.a aVar) {
        v.sac(aVar.d(), aVar.c(), aVar.a(), aVar.b());
        return true;
    }

    public void K() {
        c0.a(1, "RPToolUtil", "searchDevice()");
        this.f933b = false;
        this.f932a = 0;
        this.g.sendEmptyMessageDelayed(1002, 1000);
    }

    public int L(Object obj) {
        b.b.e.a.c cVar = this.d;
        int ss = (cVar == null || cVar.g() < 0) ? -1 : v.ss(obj, this.d.g());
        c0.a(0, "RPToolUtil", "sendStartVideo --- rtn = " + ss);
        return ss;
    }

    public int M() {
        b.b.e.a.c cVar = this.d;
        if (cVar == null || cVar.g() < 0) {
            return -1;
        }
        return v.ssm(this.d.g());
    }

    public void N(e eVar) {
        this.e = eVar;
    }

    public void O(f fVar) {
        b.b.a.e.q().s(fVar);
    }

    public void P(b.b.e.a.c cVar) {
        this.d = cVar;
    }

    public void Q(String str, int i2) {
        b.b.d.d.c().g(str, i2);
    }

    public void R(h hVar) {
        b.b.a.e.q().t(hVar);
    }

    public boolean g() {
        c0.a(0, "RPToolUtil", "checkBuildFile()");
        if (a.b(b.c.a.a.d.b.f865a + File.separator + "menu_config.lua") != null) {
            return true;
        }
        c0.a(0, "RPToolUtil", "proFile not exit!");
        return false;
    }

    public boolean h() {
        c0.a(0, "RPToolUtil", "checkBuildFileForTP()");
        if (a.b(b.c.a.a.d.b.f865a + File.separator + "net_config.lua") != null) {
            return true;
        }
        c0.a(0, "RPToolUtil", "proFile not exit!");
        return false;
    }

    public void i() {
        c0.a(1, "RPToolUtil", "deinitTool()");
        v.dt();
    }

    public void j() {
        c0.a(0, "RPToolUtil", "downloadBuildFile()");
        b.b.a.a aVar = new b.b.a.a("menu_config.lua", "http://192.168.10.1:8082/usr/share/app/sdv/menu_config.lua", b.c.a.a.d.b.f865a);
        R(this.j);
        l(aVar);
    }

    public void k() {
        c0.a(0, "RPToolUtil", "downloadBuildFileForTP()");
        b.b.a.a aVar = new b.b.a.a("net_config.lua", "http://192.168.10.1:8082/usr/share/app/sdv/net_config.lua", b.c.a.a.d.b.f865a);
        R(this.j);
        l(aVar);
    }

    public void l(b.b.a.a aVar) {
        b.b.a.e.q().o(aVar);
    }

    public void m(Context context, String str) {
        b.b.d.d.c().a(context, str);
    }

    public void n() {
        b.b.a.e.q().p();
    }

    public int o() {
        return b.b.b.a.c().a();
    }

    public b.b.e.a.c p() {
        return this.d;
    }

    public int q() {
        b.b.e.a.c cVar = this.d;
        if (cVar == null) {
            return -1;
        }
        return cVar.g();
    }

    public List<b.b.b.d.a> r(int i2) {
        return b.b.b.a.c().b(i2);
    }

    public int s(String str) {
        return b.b.d.d.c().b(str);
    }

    public void w(int i2, int i3) {
        c0.a(0, "RPToolUtil", "sendIOCtrlMsgToDevs" + i2 + "," + i3 + ")");
        b.b.e.a.c cVar = this.d;
        if (cVar == null) {
            c0.a(3, "RPToolUtil", "sendIOCtrlMsgToDevs() device == null");
        } else {
            x(new b.b.e.a.a(cVar.g(), i2, x.a(i3), x.b()));
        }
    }

    public void x(b.b.e.a.a aVar) {
        c0.a(0, "RPToolUtil", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "RPToolUtil", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "RPToolUtil", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.f.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 1;
        this.f.sendMessage(obtainMessage);
    }

    public void y(Object obj) {
        f0.b(obj);
    }

    public void z(String str, String str2) {
        c0.a(0, "RPToolUtil", "initFileDataPool --- start!");
        b.b.b.a.c().d(str, str2);
        E();
    }
}
