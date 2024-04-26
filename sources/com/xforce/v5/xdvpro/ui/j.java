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
import b.c.a.a.b.g;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.handmark.pulltorefresh.library.e;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.h;
import com.rp.rptool.util.i;
import com.rp.rptool.util.r;
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

public class j extends android.support.v4.app.e {
    /* access modifiers changed from: private */
    public k Y;
    boolean Z = false;
    PullToRefreshGridView a0;
    GridView b0;
    g c0;
    TextView d0;
    TextView e0;
    ProgressBar f0;
    boolean g0 = false;
    private BroadcastReceiver h0;
    int i0;
    private int j0;
    /* access modifiers changed from: private */
    public int k0;
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
            c0.a(0, "XFTPFileDevFragment", "registerRefreshReceiver flag-------" + booleanExtra);
            if (booleanExtra) {
                j.this.c0.notifyDataSetChanged();
            } else {
                j.this.Z = true;
            }
        }
    }

    class b implements e.i<GridView> {
        b() {
        }

        public void a(com.handmark.pulltorefresh.library.e<GridView> eVar) {
            c0.a(0, "XFTPFileDevFragment", "onRefresh ---------- !");
            if (b.c.a.a.d.b.p) {
                j jVar = j.this;
                jVar.d2(jVar.y().getString(R.string.device_offline), false);
                j.this.p0.sendEmptyMessageDelayed(5, 1000);
            } else if (d0.t().p().i() <= 0) {
                j jVar2 = j.this;
                jVar2.d2(jVar2.y().getString(R.string.file_dev_has_no_card), false);
                j.this.p0.sendEmptyMessageDelayed(5, 1000);
            } else {
                j jVar3 = j.this;
                jVar3.M1(jVar3.a0.M());
            }
        }
    }

    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            c0.a(0, "XFTPFileDevFragment", "onitem click index = " + i);
            if (j.this.l0) {
                c0.a(0, "XFTPFileDevFragment", "isRefreshing ~~~");
                return;
            }
            j jVar = j.this;
            if (jVar.m0) {
                int b2 = jVar.c0.b(i);
                if (b2 == j.this.c0.f().size()) {
                    j.this.Y.A1(b2, true);
                } else {
                    j.this.Y.A1(b2, false);
                }
            } else {
                jVar.K1(i);
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f1141a;

        d(List list) {
            this.f1141a = list;
        }

        public void run() {
            int size = this.f1141a.size();
            int unused = j.this.n0 = size;
            for (int i = 0; i < size; i++) {
                try {
                    b.b.b.d.a aVar = (b.b.b.d.a) this.f1141a.get(i);
                    d0.t().x(new b.b.e.a.a(d0.t().q(), 1828, u.a(aVar.e().getBytes("UTF-8")), u.b()));
                    StringBuilder sb = new StringBuilder();
                    sb.append(b.c.a.a.d.b.g);
                    String str = File.separator;
                    sb.append(str);
                    sb.append(aVar.d());
                    File file = new File(sb.toString());
                    if (file.exists()) {
                        file.delete();
                    }
                    if (aVar.m() == 1) {
                        File file2 = new File(b.c.a.a.d.b.e + str + aVar.d().replace(".jpg", ".thm"));
                        if (file2.exists()) {
                            file2.delete();
                        }
                    }
                    Thread.sleep(100);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            j jVar = j.this;
            jVar.p0.sendEmptyMessageDelayed(3, (long) (jVar.k0 + 7000));
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
                        j.this.H1((b.b.e.a.b) message.obj);
                        return;
                    case 3:
                        if (j.this.p0.hasMessages(3)) {
                            j.this.p0.removeMessages(3);
                        }
                        j.this.C1();
                        return;
                    case 4:
                        if (g.i1) {
                            android.support.v4.app.f g = j.this.g();
                            String str = (String) message.obj;
                            if (message.arg1 != 1) {
                                z = false;
                            }
                            o.g(g, str, z);
                            return;
                        }
                        Toast.makeText(j.this.g(), (String) message.obj, 1).show();
                        return;
                    case 5:
                        PullToRefreshGridView pullToRefreshGridView = j.this.a0;
                        if (pullToRefreshGridView != null) {
                            pullToRefreshGridView.v();
                            boolean unused = j.this.l0 = false;
                            j.this.E1();
                            return;
                        }
                        return;
                    case 6:
                        j.this.y1();
                        return;
                    case 7:
                        j.this.X1();
                        return;
                    case 8:
                        j.this.Q1();
                        return;
                    case 9:
                        j jVar = j.this;
                        jVar.m0 = false;
                        jVar.c0.l(false);
                        j.this.a0.setPullToRefreshEnabled(true);
                        j.this.a0.setMode(e.C0046e.BOTH);
                        return;
                    default:
                        return;
                }
            } else {
                j.this.c0.d();
                j.this.L1();
            }
        }
    }

    public j() {
        int i = ((b.c.a.a.d.b.i - (b.c.a.a.d.b.l * 2)) - ((b.c.a.a.d.b.n - 1) * b.c.a.a.d.b.m)) / b.c.a.a.d.b.n;
        this.i0 = i;
        this.j0 = (b.c.a.a.d.b.h / i) * b.c.a.a.d.b.n;
        this.k0 = 3000;
        this.l0 = false;
        this.m0 = false;
        this.n0 = 0;
        this.p0 = new e();
    }

    private void B1(List<b.b.b.d.a> list) {
        c0.a(0, "XFTPFileDevFragment", "deleteOpt()" + list);
        if (list == null || list.size() <= 0) {
            c0.a(0, "XFTPFileDevFragment", "deleteOpt() list == null");
            return;
        }
        c2();
        new Thread(new d(list)).start();
    }

    /* access modifiers changed from: private */
    public void C1() {
        N1();
        o.g(g(), y().getString(R.string.file_delete_ok), true);
    }

    /* access modifiers changed from: private */
    public void E1() {
        c0.a(0, "XFTPFileDevFragment", "dismissDeleteLoadingView()");
        f fVar = this.o0;
        if (fVar != null && fVar.isShowing()) {
            this.o0.dismiss();
        }
    }

    private void F1(List<b.b.b.d.a> list) {
        c0.a(0, "XFTPFileDevFragment", "downloadOpt()" + list);
        if (list == null || list.size() <= 0) {
            c0.a(0, "XFTPFileDevFragment", "downloadOpt() list == null");
            return;
        }
        int size = list.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            str = str + G1(list.get(i));
            if (i != size - 1) {
                str = str + ";";
            }
        }
        Intent intent = new Intent(g(), HSTPDownloadActivtiy.class);
        intent.putExtra("download_info", (Serializable) list);
        f1(intent);
    }

    private String G1(b.b.b.d.a aVar) {
        return aVar.f() + "-" + aVar.l() + "-" + aVar.m() + "-" + aVar.d() + "-" + aVar.c();
    }

    /* access modifiers changed from: private */
    public void H1(b.b.e.a.b bVar) {
        int b2 = bVar.b();
        if (b2 == 1608) {
            S1(bVar);
        } else if (b2 == 1610) {
            int i = new r(bVar.a()).f958a;
            if (i == 1) {
                d2(y().getString(R.string.tfcard_inserted), true);
                this.p0.sendEmptyMessage(7);
                this.p0.sendEmptyMessageDelayed(0, 2000);
            } else if (i == 0) {
                d2(y().getString(R.string.tfcard_removed), false);
                d0.t().p().t(0);
                d0.t().p().s(0);
                this.p0.sendEmptyMessage(8);
                this.c0.m((List<b.b.b.d.a>) null);
                this.c0.notifyDataSetChanged();
            }
        } else if (b2 == 1638) {
            W1(bVar);
        } else if (b2 == 1829) {
            T1(bVar);
        } else if (b2 == 1842) {
            V1(bVar);
        } else if (b2 == 1844) {
            U1(bVar);
        }
    }

    private void I1() {
        this.b0 = (GridView) this.a0.getRefreshableView();
        g gVar = new g(g(), new ArrayList());
        this.c0 = gVar;
        this.b0.setAdapter(gVar);
        this.b0.setNumColumns(b.c.a.a.d.b.n);
        this.a0.setOnRefreshListener(new b());
        this.b0.setOnItemClickListener(new c());
    }

    /* access modifiers changed from: private */
    public void K1(int i) {
        String str;
        StringBuilder sb;
        c0.a(0, "XFTPFileDevFragment", "onClickFileList() --- index = " + i);
        List<b.b.b.d.a> f = this.c0.f();
        int size = f.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        String c2 = d0.t().p() != null ? d0.t().p().c() : "192.168.10.1";
        for (int i2 = 0; i2 < size; i2++) {
            b.b.b.d.a aVar = f.get(i2);
            if (aVar.m() == 1) {
                sb = new StringBuilder();
                sb.append("http://");
                sb.append(c2);
                sb.append(":8082/file/media/");
                str = aVar.d();
            } else {
                sb = new StringBuilder();
                sb.append("http://");
                sb.append(c2);
                sb.append(":8082/file/media/");
                str = aVar.i();
            }
            sb.append(str);
            String sb2 = sb.toString();
            strArr[i2] = aVar.d();
            strArr2[i2] = sb2;
        }
        Intent intent = new Intent(g(), X1ShowPhotosActivity.class);
        intent.putExtra("param_index", i);
        intent.putExtra("param_dev_view", 1);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f);
        intent.putParcelableArrayListExtra("param_file_list", arrayList);
        f1(intent);
    }

    /* access modifiers changed from: private */
    public void M1(boolean z) {
        c0.a(0, "XFTPFileDevFragment", "refreshFileList() isDrapDown:" + z);
        if (z) {
            N1();
        } else {
            O1();
        }
    }

    private void N1() {
        c0.a(0, "XFTPFileDevFragment", "refreshFileListDrapDown()");
        this.l0 = true;
        d0.t().E();
        d0.t().F();
        X1();
        this.p0.sendEmptyMessageDelayed(6, (long) this.k0);
    }

    private void O1() {
        c0.a(0, "XFTPFileDevFragment", "refreshFileListDrapUp()");
        this.l0 = true;
        List<b.b.b.d.a> f = this.c0.f();
        int size = f != null ? f.size() : 0;
        int o = d0.t().o();
        if (size < o) {
            int i = this.j0;
            if (size + i < o) {
                o = size + i;
            } else {
                c0.a(0, "XFTPFileDevFragment", "最后一次加载，文件列表数量已经达到最大!~~~~~ " + size);
            }
            List<b.b.b.d.a> r = d0.t().r(o);
            this.c0.m(r);
            this.c0.notifyDataSetChanged();
            int size2 = r.size();
            for (int i2 = 0; i2 < size2; i2++) {
                b.b.b.d.a aVar = r.get(i2);
                if (aVar.m() == 1) {
                    Z1(aVar.e());
                }
                if (aVar.c() <= 0) {
                    Y1(aVar.e());
                }
            }
        } else {
            c0.a(0, "XFTPFileDevFragment", "文件列表数量已经达到最大!~~~~~ " + size);
        }
        this.p0.sendEmptyMessageDelayed(5, 1000);
    }

    /* access modifiers changed from: private */
    public void Q1() {
        c0.a(0, "XFTPFileDevFragment", "refreshSizeBar()");
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

    private void R1() {
        c0.a(0, "XFTPFileDevFragment", "registerRefreshReceiver()");
        this.h0 = new a();
        g().registerReceiver(this.h0, new IntentFilter("refresh_list_filter"));
    }

    private void S1(b.b.e.a.b bVar) {
        c0.a(0, "XFTPFileDevFragment", "sendIOCtrlResp() NAT_CMD_CHECK_TF_CARD_RESP");
        z zVar = new z(bVar.a());
        c0.a(0, "XFTPFileDevFragment", "NAT_CMD_CHECK_TF_CARD_RESP capacity = " + zVar);
        d0.t().p().s((long) zVar.f964b);
        d0.t().p().t((long) zVar.f963a);
        Q1();
    }

    private void T1(b.b.e.a.b bVar) {
        com.rp.rptool.util.g gVar = new com.rp.rptool.util.g(bVar.a());
        c0.a(0, "XFTPFileDevFragment", "NAT_CMD_DELETE_FILE_RESP ------ data = " + gVar.f947a);
        int i = this.n0 + -1;
        this.n0 = i;
        if (i == 0) {
            this.p0.sendEmptyMessageDelayed(3, (long) (this.k0 + 1000));
        }
    }

    private void U1(b.b.e.a.b bVar) {
        String str;
        c0.a(0, "XFTPFileDevFragment", "IOTYPE_USER_SDV_GET_FILE_SIZE_RESP");
        i iVar = new i(bVar.a());
        try {
            str = new String(iVar.f948a, "UTF-8").trim();
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            str = "";
        }
        long j = ((long) iVar.f949b) & 4294967295L;
        c0.a(0, "XFTPFileDevFragment", "IOTYPE_USER_SDV_GET_FILE_SIZE_RESP path = " + str + "size = " + j);
        for (b.b.b.d.a next : this.c0.f()) {
            if (next.f().contains(str) && next.c() <= 0) {
                next.o(j);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void V1(b.b.e.a.b r9) {
        /*
            r8 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = ""
            com.rp.rptool.util.k r2 = new com.rp.rptool.util.k
            byte[] r9 = r9.a()
            r2.<init>(r9)
            com.rp.rptool.util.d0 r9 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r9 = r9.p()
            if (r9 == 0) goto L_0x0024
            com.rp.rptool.util.d0 r9 = com.rp.rptool.util.d0.t()
            b.b.e.a.c r9 = r9.p()
            java.lang.String r9 = r9.c()
            goto L_0x0026
        L_0x0024:
            java.lang.String r9 = "192.168.10.1"
        L_0x0026:
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x003f }
            byte[] r4 = r2.f950a     // Catch:{ UnsupportedEncodingException -> 0x003f }
            r3.<init>(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x003f }
            java.lang.String r3 = r3.trim()     // Catch:{ UnsupportedEncodingException -> 0x003f }
            java.lang.String r4 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x003d }
            byte[] r5 = r2.f951b     // Catch:{ UnsupportedEncodingException -> 0x003d }
            r4.<init>(r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x003d }
            java.lang.String r1 = r4.trim()     // Catch:{ UnsupportedEncodingException -> 0x003d }
            goto L_0x0044
        L_0x003d:
            r0 = move-exception
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            r3 = r1
        L_0x0041:
            r0.printStackTrace()
        L_0x0044:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "IOTYPE_USER_SDV_GET_PICTURE_THUMB_RESP photo path = "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r5 = "photo thumbPaht = "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6 = 0
            java.lang.String r7 = "XFTPFileDevFragment"
            com.rp.rptool.util.c0.a(r6, r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            byte[] r4 = r2.f950a
            r0.append(r4)
            r0.append(r5)
            byte[] r2 = r2.f951b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.rp.rptool.util.c0.a(r6, r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "http://"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = ":8082/file/media/"
            r0.append(r9)
            java.lang.String r9 = ".jpg"
            java.lang.String r2 = ".thm"
            java.lang.String r9 = r3.replace(r9, r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            b.c.a.a.b.g r0 = r8.c0
            java.util.List r0 = r0.f()
            java.util.Iterator r2 = r0.iterator()
        L_0x00aa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00d3
            java.lang.Object r3 = r2.next()
            b.b.b.d.a r3 = (b.b.b.d.a) r3
            java.lang.String r4 = r3.i()
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00aa
            r3.t(r9)
            int r3 = r0.indexOf(r3)
            b.c.a.a.b.g r4 = r8.c0
            android.widget.GridView r5 = r8.b0
            android.view.View r5 = r5.getChildAt(r3)
            r4.i(r3, r5)
            goto L_0x00aa
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.j.V1(b.b.e.a.b):void");
    }

    private void W1(b.b.e.a.b bVar) {
        c0.a(0, "XFTPFileDevFragment", "IOTYPE_USER_SDV_SYNC_STATE_RESP");
        com.rp.rptool.util.f fVar = new com.rp.rptool.util.f(bVar.a());
        c0.a(0, "XFTPFileDevFragment", "IOTYPE_USER_SDV_SYNC_STATE_RESP state = " + fVar.f945a + "value = " + fVar.f946b);
        int i = fVar.f945a;
        if (i == 0) {
            d2(y().getString(R.string.tfcard_inserted), true);
            this.p0.sendEmptyMessage(7);
            this.p0.sendEmptyMessageDelayed(0, 2000);
        } else if (i == 1) {
            d2(y().getString(R.string.tfcard_removed), false);
            d0.t().p().t(0);
            d0.t().p().s(0);
            this.p0.sendEmptyMessage(8);
            this.c0.m((List<b.b.b.d.a>) null);
            this.c0.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public void X1() {
        c0.a(0, "XFTPFileDevFragment", "sendCmdCheckTFCard()");
        d0.t().w(1607, 1);
    }

    private void Y1(String str) {
        byte[] bArr;
        c0.a(0, "XFTPFileDevFragment", "sendCmdGetFileSize(" + str + ")");
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            c0.a(3, "XFTPFileDevFragment", "sendCmdGetFileSize() error!");
            e2.printStackTrace();
            bArr = null;
        }
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1843, h.a(bArr), h.b()));
    }

    private void Z1(String str) {
        byte[] bArr;
        c0.a(0, "XFTPFileDevFragment", "sendCmdGetDlUrl(" + str + ")");
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            c0.a(3, "XFTPFileDevFragment", "sendCmdGetDlUrl() error!");
            e2.printStackTrace();
            bArr = null;
        }
        d0.t().x(new b.b.e.a.a(d0.t().q(), 1841, com.rp.rptool.util.j.a(bArr), com.rp.rptool.util.j.b()));
    }

    private void c2() {
        c0.a(0, "XFTPFileDevFragment", "showDeleteLoadingView()");
        if (this.o0 == null) {
            this.o0 = new f(g(), R.style.confirm_dialog);
        }
        this.o0.show();
        this.o0.d(true);
        this.o0.setCancelable(false);
        this.o0.c(y().getString(R.string.file_deleting));
    }

    /* access modifiers changed from: private */
    public void d2(String str, boolean z) {
        if (g.i1 && !this.g0) {
            Message obtainMessage = this.p0.obtainMessage();
            obtainMessage.what = 4;
            obtainMessage.obj = str;
            obtainMessage.arg1 = z ? 1 : 0;
            this.p0.sendMessage(obtainMessage);
        }
    }

    private void e2() {
        c0.a(0, "XFTPFileDevFragment", "unregRefreshReceiver()");
        if (this.h0 != null) {
            g().unregisterReceiver(this.h0);
        }
    }

    /* access modifiers changed from: private */
    public void y1() {
        c0.a(0, "XFTPFileDevFragment", "afterUpdateDBRrefreshList()");
        int o = d0.t().o();
        int i = this.j0;
        if (i <= o) {
            o = i;
        }
        List<b.b.b.d.a> r = d0.t().r(o);
        this.c0.m(r);
        this.p0.sendEmptyMessageDelayed(5, 1000);
        this.c0.notifyDataSetChanged();
        int size = r.size();
        for (int i2 = 0; i2 < size; i2++) {
            b.b.b.d.a aVar = r.get(i2);
            if (aVar.m() == 1) {
                Z1(aVar.e());
            }
            if (aVar.c() <= 0) {
                Y1(aVar.e());
            }
        }
    }

    public void A1() {
        c0.a(0, "XFTPFileDevFragment", "chooseAllRtn()");
        this.Y.A1(this.c0.j(), true);
    }

    public void D1() {
        c0.a(0, "XFTPFileDevFragment", "disChooseAllRtn()");
        this.Y.A1(this.c0.k(), false);
    }

    public void J1(int i) {
        c0.a(0, "XFTPFileDevFragment", "onChildClickConfirm(" + i + ")");
        List<b.b.b.d.a> g = this.c0.g();
        if (g == null || g.size() <= 0) {
            c0.a(0, "XFTPFileDevFragment", "onChildClickConfirm() no selected files!");
            this.p0.sendEmptyMessage(9);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = g.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(g.get(i2));
        }
        this.p0.sendEmptyMessage(9);
        if (i == 2) {
            F1(arrayList);
        } else if (i == 4) {
            B1(arrayList);
        }
    }

    public void L1() {
        if (d0.t().p() != null) {
            if (this.Y.u1() == 1 && ((XFTPMainFragmentActivity) this.Y.g()).l == 0) {
                Toast.makeText(g(), y().getString(R.string.pull_to_refresh_refreshing_label), 1).show();
            }
            if (d0.t().p().i() <= 0) {
                o.g(g(), y().getString(R.string.file_dev_has_no_card), false);
            } else {
                N1();
            }
        }
    }

    public void P1(b.b.e.a.b bVar) {
        c0.a(0, "XFTPFileDevFragment", "refreshMsgCallBack() rtnMsg = " + bVar);
        if (d0.t().p() == null) {
            c0.a(3, "XFTPFileDevFragment", "refreshMsgCallBack() device == null");
            return;
        }
        Message obtainMessage = this.p0.obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.obj = bVar;
        this.p0.sendMessage(obtainMessage);
    }

    public void V(Bundle bundle) {
        c0.a(0, "XFTPFileDevFragment", "onCreate");
        super.V(bundle);
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c0.a(0, "XFTPFileDevFragment", "onCreateView");
        View inflate = layoutInflater.inflate(R.layout.fragment_xffiledev, (ViewGroup) null);
        PullToRefreshGridView pullToRefreshGridView = (PullToRefreshGridView) inflate.findViewById(R.id.local_listbg);
        this.a0 = pullToRefreshGridView;
        pullToRefreshGridView.setScrollingWhileRefreshingEnabled(false);
        this.f0 = (ProgressBar) inflate.findViewById(R.id.cdr_size_progress);
        this.d0 = (TextView) inflate.findViewById(R.id.cdr_size_left);
        this.e0 = (TextView) inflate.findViewById(R.id.cdr_size_total);
        I1();
        R1();
        return inflate;
    }

    public void a0() {
        c0.a(0, "XFTPFileDevFragment", "plr test - onDestroy");
        e2();
        super.a0();
    }

    public void a2(boolean z) {
        this.m0 = z;
        this.c0.l(z);
        this.a0.setPullToRefreshEnabled(!z);
        if (!z) {
            this.a0.setMode(e.C0046e.BOTH);
        }
    }

    public void b2(k kVar) {
        this.Y = kVar;
    }

    public void p0() {
        super.p0();
        c0.a(0, "XFTPFileDevFragment", "plr test - onResume");
        this.g0 = false;
        if (((XFTPMainFragmentActivity) g()).l == 0) {
            c0.a(0, "XFTPFileDevFragment", "ealen test 当前显示的是文件界面");
            z1();
            return;
        }
        c0.a(0, "XFTPFileDevFragment", "ealen test 当前显示的不是文件界面");
    }

    public void r0() {
        super.r0();
        c0.a(0, "XFTPFileDevFragment", "plr test - onStart");
    }

    public void s0() {
        super.s0();
        this.g0 = true;
        c0.a(0, "XFTPFileDevFragment", "plr test - onStop");
    }

    public void z1() {
        if (this.Z) {
            this.Z = false;
            this.c0.c();
            L1();
        }
    }
}
