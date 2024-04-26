package com.xforce.v5.xdvpro.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.handmark.pulltorefresh.library.e;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.r;
import com.rp.rptool.util.t;
import com.rp.rptool.util.u;
import com.rp.rptool.util.z;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.f;
import com.xforce.v5.xdvpro.widget.o;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class h extends android.support.v4.app.e {
    /* access modifiers changed from: private */
    public b Y;
    boolean Z = false;
    PullToRefreshGridView a0;
    GridView b0;
    b.c.a.a.b.e c0;
    TextView d0;
    TextView e0;
    ProgressBar f0;
    boolean g0 = false;
    private BroadcastReceiver h0;
    int i0;
    private int j0;
    private int k0;
    /* access modifiers changed from: private */
    public boolean l0;
    boolean m0;
    /* access modifiers changed from: private */
    public int n0;
    private f o0;
    Handler p0;

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("notify_only", false);
            c0.a(0, "XFFileDevFragment", "registerRefreshReceiver flag-------" + booleanExtra);
            if (booleanExtra) {
                h.this.c0.notifyDataSetChanged();
            } else {
                h.this.Z = true;
            }
        }
    }

    class b implements e.i<GridView> {
        b() {
        }

        public void a(com.handmark.pulltorefresh.library.e<GridView> eVar) {
            c0.a(0, "XFFileDevFragment", "onRefresh ---------- !");
            if (b.c.a.a.d.b.p) {
                h hVar = h.this;
                hVar.W1(hVar.y().getString(R.string.device_offline), false);
                h.this.p0.sendEmptyMessageDelayed(5, 1000);
            } else if (d0.t().p().i() <= 0) {
                h hVar2 = h.this;
                hVar2.W1(hVar2.y().getString(R.string.file_dev_has_no_card), false);
                h.this.p0.sendEmptyMessageDelayed(5, 1000);
            } else {
                h hVar3 = h.this;
                hVar3.L1(hVar3.a0.M());
            }
        }
    }

    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            c0.a(0, "XFFileDevFragment", "onitem click index = " + i);
            if (h.this.l0) {
                c0.a(0, "XFFileDevFragment", "isRefreshing ~~~");
                return;
            }
            h hVar = h.this;
            if (hVar.m0) {
                int a2 = hVar.c0.a(i);
                if (a2 == h.this.c0.d().size()) {
                    h.this.Y.A1(a2, true);
                } else {
                    h.this.Y.A1(a2, false);
                }
            } else {
                hVar.J1(i);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f1131a;

        d(List list) {
            this.f1131a = list;
        }

        public void run() {
            int size = this.f1131a.size();
            int unused = h.this.n0 = size;
            for (int i = 0; i < size; i++) {
                try {
                    b.b.b.d.a aVar = (b.b.b.d.a) this.f1131a.get(i);
                    d0.t().x(new b.b.e.a.a(d0.t().q(), 1828, u.a(aVar.e().getBytes("UTF-8")), u.b()));
                    File file = new File(b.c.a.a.d.b.g + File.separator + aVar.d());
                    if (file.exists()) {
                        file.delete();
                    }
                    Thread.sleep(100);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            h.this.M1();
        }
    }

    class e extends Handler {
        e() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 0) {
                boolean z = true;
                switch (i) {
                    case 2:
                        h.this.G1((b.b.e.a.b) message.obj);
                        return;
                    case 3:
                        h.this.B1();
                        return;
                    case 4:
                        if (g.i1) {
                            android.support.v4.app.f g = h.this.g();
                            String str = (String) message.obj;
                            if (message.arg1 != 1) {
                                z = false;
                            }
                            o.g(g, str, z);
                            return;
                        }
                        Toast.makeText(h.this.g(), (String) message.obj, 1).show();
                        return;
                    case 5:
                        PullToRefreshGridView pullToRefreshGridView = h.this.a0;
                        if (pullToRefreshGridView != null) {
                            pullToRefreshGridView.v();
                            boolean unused = h.this.l0 = false;
                            return;
                        }
                        return;
                    case 6:
                        h.this.x1();
                        return;
                    case 7:
                        h.this.R1();
                        return;
                    case 8:
                        h.this.P1();
                        return;
                    case 9:
                        h hVar = h.this;
                        hVar.m0 = false;
                        hVar.c0.h(false);
                        h.this.a0.setPullToRefreshEnabled(true);
                        h.this.a0.setMode(e.C0046e.BOTH);
                        return;
                    default:
                        return;
                }
            } else {
                h.this.K1();
            }
        }
    }

    public h() {
        int i = ((b.c.a.a.d.b.i - (b.c.a.a.d.b.l * 2)) - ((b.c.a.a.d.b.n - 1) * b.c.a.a.d.b.m)) / b.c.a.a.d.b.n;
        this.i0 = i;
        this.j0 = (b.c.a.a.d.b.h / i) * b.c.a.a.d.b.n;
        this.k0 = 3000;
        this.l0 = false;
        this.m0 = false;
        this.n0 = 0;
        this.p0 = new e();
    }

    private void A1(List<b.b.b.d.a> list) {
        c0.a(0, "XFFileDevFragment", "deleteOpt()" + list);
        if (list == null || list.size() <= 0) {
            c0.a(0, "XFFileDevFragment", "deleteOpt() list == null");
            return;
        }
        V1();
        new Thread(new d(list)).start();
    }

    /* access modifiers changed from: private */
    public void B1() {
        M1();
        D1();
        o.g(g(), y().getString(R.string.file_delete_ok), true);
    }

    private void D1() {
        c0.a(0, "XFFileDevFragment", "dismissDeleteLoadingView()");
        f fVar = this.o0;
        if (fVar != null && fVar.isShowing()) {
            this.o0.dismiss();
        }
    }

    private void E1(List<b.b.b.d.a> list) {
        c0.a(0, "XFFileDevFragment", "downloadOpt()" + list);
        if (list == null || list.size() <= 0) {
            c0.a(0, "XFFileDevFragment", "downloadOpt() list == null");
            return;
        }
        int size = list.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            str = str + F1(list.get(i));
            if (i != size - 1) {
                str = str + ";";
            }
        }
        Intent intent = new Intent(g(), HSDownloadActivtiy.class);
        intent.putExtra("download_info", (Serializable) list);
        f1(intent);
    }

    private String F1(b.b.b.d.a aVar) {
        return aVar.e() + "-" + aVar.l() + "-" + aVar.m() + "-" + aVar.d() + "-" + aVar.c();
    }

    /* access modifiers changed from: private */
    public void G1(b.b.e.a.b bVar) {
        int b2 = bVar.b();
        if (b2 != 1608) {
            if (b2 == 1610) {
                int i = new r(bVar.a()).f958a;
                if (i == 1) {
                    W1(y().getString(R.string.tfcard_inserted), true);
                    this.p0.sendEmptyMessage(7);
                    this.p0.sendEmptyMessageDelayed(0, 2000);
                    return;
                } else if (i == 0) {
                    W1(y().getString(R.string.tfcard_removed), false);
                    d0.t().p().t(0);
                    d0.t().p().s(0);
                    this.p0.sendEmptyMessage(8);
                    this.c0.i((List<b.b.b.d.a>) null);
                } else {
                    return;
                }
            } else if (b2 == 1829) {
                r rVar = new r(bVar.a());
                c0.a(0, "XFFileDevFragment", "NAT_CMD_DELETE_FILE_RESP ------ data = " + rVar.f958a);
                int i2 = this.n0 - 1;
                this.n0 = i2;
                if (i2 == 0) {
                    this.p0.sendEmptyMessageDelayed(3, (long) (this.k0 + 2000));
                    return;
                }
                return;
            } else if (b2 != 41033) {
                return;
            }
            this.c0.notifyDataSetChanged();
            return;
        }
        c0.a(0, "XFFileDevFragment", "sendIOCtrlResp() NAT_CMD_CHECK_TF_CARD_RESP");
        z zVar = new z(bVar.a());
        c0.a(0, "XFFileDevFragment", "NAT_CMD_CHECK_TF_CARD_RESP capacity = " + zVar);
        d0.t().p().s((long) zVar.f964b);
        d0.t().p().t((long) zVar.f963a);
        P1();
    }

    private void H1() {
        this.b0 = (GridView) this.a0.getRefreshableView();
        b.c.a.a.b.e eVar = new b.c.a.a.b.e(g(), new ArrayList());
        this.c0 = eVar;
        this.b0.setAdapter(eVar);
        this.b0.setNumColumns(b.c.a.a.d.b.n);
        this.a0.setOnRefreshListener(new b());
        this.b0.setOnItemClickListener(new c());
    }

    /* access modifiers changed from: private */
    public void J1(int i) {
        c0.a(0, "XFFileDevFragment", "onClickFileList() --- index = " + i);
        List<b.b.b.d.a> d2 = this.c0.d();
        int size = d2.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        if (d0.t().p() != null) {
            d0.t().p().c();
        }
        Intent intent = new Intent(g(), X1ShowPhotosActivity.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(d2);
        intent.putParcelableArrayListExtra("param_file_list", arrayList);
        intent.putExtra("param_index", i);
        intent.putExtra("param_dev_view", 1);
        f1(intent);
    }

    /* access modifiers changed from: private */
    public void L1(boolean z) {
        c0.a(0, "XFFileDevFragment", "refreshFileList() isDrapDown:" + z);
        if (z) {
            M1();
        } else {
            N1();
        }
    }

    /* access modifiers changed from: private */
    public void M1() {
        c0.a(0, "XFFileDevFragment", "refreshFileListDrapDown()");
        this.l0 = true;
        d0.t().E();
        d0.t().F();
        R1();
        this.p0.sendEmptyMessageDelayed(6, (long) this.k0);
        this.p0.sendEmptyMessageDelayed(5, (long) (this.k0 + 1000));
    }

    private void N1() {
        c0.a(0, "XFFileDevFragment", "refreshFileListDrapUp()");
        this.l0 = true;
        List<b.b.b.d.a> d2 = this.c0.d();
        int size = d2 != null ? d2.size() : 0;
        int o = d0.t().o();
        if (size < o) {
            int i = this.j0;
            if (size + i < o) {
                o = size + i;
            } else {
                c0.a(0, "XFFileDevFragment", "最后一次加载，文件列表数量已经达到最大!~~~~~ " + size);
            }
            List<b.b.b.d.a> r = d0.t().r(o);
            int size2 = r.size();
            for (int i2 = 0; i2 < size2; i2++) {
                b.b.b.d.a aVar = r.get(i2);
                if (aVar.m() != 1) {
                    S1(aVar.e());
                }
            }
            this.c0.i(r);
            this.c0.notifyDataSetChanged();
        } else {
            c0.a(0, "XFFileDevFragment", "文件列表数量已经达到最大!~~~~~ " + size);
        }
        this.p0.sendEmptyMessageDelayed(5, 1000);
    }

    /* access modifiers changed from: private */
    public void P1() {
        c0.a(0, "XFFileDevFragment", "refreshSizeBar()");
        if (d0.t().p().i() == 0) {
            this.d0.setText("0GB");
            this.e0.setText("0GB");
            this.f0.setProgress(0);
            return;
        }
        long i = d0.t().p().i();
        long h = d0.t().p().h();
        this.d0.setText(b.c.a.a.d.b.p(h));
        this.e0.setText(b.c.a.a.d.b.p(i));
        ProgressBar progressBar = this.f0;
        double d2 = (double) (i - h);
        Double.isNaN(d2);
        double d3 = (double) i;
        Double.isNaN(d3);
        progressBar.setProgress((int) ((d2 * 100.0d) / d3));
    }

    private void Q1() {
        c0.a(0, "XFFileDevFragment", "registerRefreshReceiver()");
        this.h0 = new a();
        g().registerReceiver(this.h0, new IntentFilter("refresh_list_filter"));
    }

    /* access modifiers changed from: private */
    public void R1() {
        c0.a(0, "XFFileDevFragment", "sendCmdCheckTFCard()");
        d0.t().w(1607, 1);
    }

    private void S1(String str) {
        byte[] bArr;
        c0.a(0, "XFFileDevFragment", "sendCmdGetDlUrl(" + str + ")");
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            c0.a(3, "XFFileDevFragment", "sendCmdGetDlUrl() error!");
            e2.printStackTrace();
            bArr = null;
        }
        d0.t().x(new b.b.e.a.a(d0.t().q(), 41032, t.a(bArr), t.b()));
    }

    private void V1() {
        c0.a(0, "XFFileDevFragment", "showDeleteLoadingView()");
        if (this.o0 == null) {
            this.o0 = new f(g(), R.style.confirm_dialog);
        }
        this.o0.show();
        this.o0.d(true);
        this.o0.setCancelable(false);
        this.o0.c(y().getString(R.string.file_deleting));
    }

    /* access modifiers changed from: private */
    public void W1(String str, boolean z) {
        if (g.i1 && !this.g0) {
            Message obtainMessage = this.p0.obtainMessage();
            obtainMessage.what = 4;
            obtainMessage.obj = str;
            obtainMessage.arg1 = z ? 1 : 0;
            this.p0.sendMessage(obtainMessage);
        }
    }

    private void X1() {
        c0.a(0, "XFFileDevFragment", "unregRefreshReceiver()");
        if (this.h0 != null) {
            g().unregisterReceiver(this.h0);
        }
    }

    /* access modifiers changed from: private */
    public void x1() {
        c0.a(0, "XFFileDevFragment", "afterUpdateDBRrefreshList()");
        int o = d0.t().o();
        int i = this.j0;
        if (i <= o) {
            o = i;
        }
        this.c0.i(d0.t().r(o));
        this.c0.notifyDataSetChanged();
    }

    public void C1() {
        c0.a(0, "XFFileDevFragment", "disChooseAllRtn()");
        this.Y.A1(this.c0.g(), false);
    }

    public void I1(int i) {
        c0.a(0, "XFFileDevFragment", "onChildClickConfirm(" + i + ")");
        List<b.b.b.d.a> e2 = this.c0.e();
        if (e2 == null || e2.size() <= 0) {
            c0.a(0, "XFFileDevFragment", "onChildClickConfirm() no selected files!");
            this.p0.sendEmptyMessage(9);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = e2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(e2.get(i2));
        }
        this.p0.sendEmptyMessage(9);
        if (i == 2) {
            E1(arrayList);
        } else if (i == 4) {
            A1(arrayList);
        }
    }

    public void K1() {
        if (d0.t().p() != null) {
            if (this.Y.u1() == 1) {
                Toast.makeText(g(), y().getString(R.string.pull_to_refresh_refreshing_label), 1).show();
            }
            if (d0.t().p().i() <= 0) {
                o.g(g(), y().getString(R.string.file_dev_has_no_card), false);
            } else {
                M1();
            }
        }
    }

    public void O1(b.b.e.a.b bVar) {
        c0.a(0, "XFFileDevFragment", "refreshMsgCallBack() rtnMsg = " + bVar);
        if (d0.t().p() == null) {
            c0.a(3, "XFFileDevFragment", "refreshMsgCallBack() device == null");
            return;
        }
        Message obtainMessage = this.p0.obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.obj = bVar;
        this.p0.sendMessage(obtainMessage);
    }

    public void T1(boolean z) {
        this.m0 = z;
        this.c0.h(z);
        this.a0.setPullToRefreshEnabled(!z);
        if (!z) {
            this.a0.setMode(e.C0046e.BOTH);
        }
    }

    public void U1(b bVar) {
        this.Y = bVar;
    }

    public void V(Bundle bundle) {
        c0.a(0, "XFFileDevFragment", "onCreate");
        super.V(bundle);
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "XFFileDevFragment", "onCreateView");
        View inflate = layoutInflater.inflate(R.layout.fragment_xffiledev, (ViewGroup) null);
        PullToRefreshGridView pullToRefreshGridView = (PullToRefreshGridView) inflate.findViewById(R.id.local_listbg);
        this.a0 = pullToRefreshGridView;
        pullToRefreshGridView.setScrollingWhileRefreshingEnabled(false);
        this.f0 = (ProgressBar) inflate.findViewById(R.id.cdr_size_progress);
        this.d0 = (TextView) inflate.findViewById(R.id.cdr_size_left);
        this.e0 = (TextView) inflate.findViewById(R.id.cdr_size_total);
        H1();
        Q1();
        return inflate;
    }

    public void a0() {
        c0.a(0, "XFFileDevFragment", "plr test - onDestroy");
        X1();
        super.a0();
    }

    public void p0() {
        super.p0();
        c0.a(0, "XFFileDevFragment", "plr test - onResume");
        this.g0 = false;
        if (((X1MainFragmentActivity) g()).n == 0) {
            c0.a(0, "XFFileDevFragment", "ealen test 当前显示的是文件界面");
            y1();
            return;
        }
        c0.a(0, "XFFileDevFragment", "ealen test 当前显示的不是文件界面");
    }

    public void r0() {
        super.r0();
        c0.a(0, "XFFileDevFragment", "plr test - onStart");
    }

    public void s0() {
        super.s0();
        this.g0 = true;
        c0.a(0, "XFFileDevFragment", "plr test - onStop");
    }

    public void y1() {
        if (this.Z) {
            this.Z = false;
            this.c0.b();
            K1();
        }
    }

    public void z1() {
        c0.a(0, "XFFileDevFragment", "chooseAllRtn()");
        this.Y.A1(this.c0.f(), true);
    }
}
