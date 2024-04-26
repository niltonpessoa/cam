package com.xforce.v5.xdvpro.ui.V3H3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.StatFs;
import android.support.v4.content.FileProvider;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b.c.a.a.b.g;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.handmark.pulltorefresh.library.e;
import com.rp.rptool.util.c0;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.ui.X1ShowPhotosActivity;
import com.xforce.v5.xdvpro.widget.f;
import com.xforce.v5.xdvpro.widget.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class c extends android.support.v4.app.e {
    PullToRefreshGridView Y;
    GridView Z;
    g a0;
    TextView b0;
    TextView c0;
    ProgressBar d0;
    TextView e0;
    b f0;
    private long g0;
    private long h0;
    int i0;
    private int j0;
    /* access modifiers changed from: private */
    public boolean k0 = false;
    boolean l0 = false;
    private f m0;
    private BroadcastReceiver n0;
    Handler o0 = new e();

    class a implements e.i<GridView> {
        a() {
        }

        public void a(com.handmark.pulltorefresh.library.e<GridView> eVar) {
            c0.a(0, "XFTPV3H3FileLocalFragment", "onRefresh ---------- !");
            c cVar = c.this;
            cVar.D1(cVar.Y.M());
        }
    }

    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            c0.a(0, "XFTPV3H3FileLocalFragment", "onitem click index = " + i);
            if (c.this.k0) {
                c0.a(0, "XFTPV3H3FileLocalFragment", "isRefreshing ~~~");
                return;
            }
            c cVar = c.this;
            if (cVar.l0) {
                int b2 = cVar.a0.b(i);
                int size = c.this.a0.f().size();
                c0.a(0, "XFTPV3H3FileLocalFragment", "sizeNow ==" + b2 + "!!!!!!!sizeTotal==" + size);
                if (b2 == size) {
                    c.this.f0.A1(b2, true);
                } else {
                    c.this.f0.A1(b2, false);
                }
            } else {
                cVar.B1(i);
            }
        }
    }

    /* renamed from: com.xforce.v5.xdvpro.ui.V3H3.c$c  reason: collision with other inner class name */
    class C0049c implements Comparator<File> {
        C0049c(c cVar) {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            if (file.isDirectory() && file2.isFile()) {
                return -1;
            }
            if (!file.isFile() || !file2.isDirectory()) {
                return file2.getName().compareTo(file.getName());
            }
            return 1;
        }
    }

    class d extends BroadcastReceiver {
        d() {
        }

        public void onReceive(Context context, Intent intent) {
            c.this.o0.sendEmptyMessageDelayed(0, 1000);
        }
    }

    class e extends Handler {
        e() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                c.this.C1();
            } else if (i == 1) {
                PullToRefreshGridView pullToRefreshGridView = c.this.Y;
                if (pullToRefreshGridView != null) {
                    pullToRefreshGridView.v();
                    boolean unused = c.this.k0 = false;
                }
            } else if (i == 2) {
                c.this.G1();
            } else if (i == 3) {
                c.this.s1();
            } else if (i == 4) {
                c cVar = c.this;
                cVar.l0 = false;
                cVar.a0.l(false);
                c.this.Y.setPullToRefreshEnabled(true);
                c.this.Y.setMode(e.C0046e.BOTH);
            }
        }
    }

    public c() {
        int i = ((b.c.a.a.d.b.i - (b.c.a.a.d.b.l * 2)) - ((b.c.a.a.d.b.n - 1) * b.c.a.a.d.b.m)) / b.c.a.a.d.b.n;
        this.i0 = i;
        this.j0 = (b.c.a.a.d.b.h / i) * b.c.a.a.d.b.n;
    }

    /* access modifiers changed from: private */
    public void B1(int i) {
        c0.a(0, "XFTPV3H3FileLocalFragment", "onClickFileList() --- index = " + i);
        List<b.b.b.d.a> f = this.a0.f();
        int size = f.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        Intent intent = new Intent(g(), X1ShowPhotosActivity.class);
        intent.putExtra("param_index", i);
        intent.putExtra("param_dev_view", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f);
        intent.putParcelableArrayListExtra("param_file_list", arrayList);
        f1(intent);
    }

    /* access modifiers changed from: private */
    public void D1(boolean z) {
        c0.a(0, "XFTPV3H3FileLocalFragment", "refreshFileList() isDrapDown:" + z);
        if (z) {
            E1();
        } else {
            F1();
        }
    }

    private void E1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "refreshFileListDrapDown()");
        this.o0.sendEmptyMessage(2);
        List<b.b.b.d.a> v1 = v1(b.c.a.a.d.b.c);
        int size = v1.size();
        int i = this.j0;
        if (i <= size) {
            size = i;
        }
        List<b.b.b.d.a> subList = v1.subList(0, size);
        this.a0.m(subList);
        this.a0.notifyDataSetChanged();
        c0.a(0, "XFTPV3H3FileLocalFragment", "fileList == " + subList);
        this.o0.sendEmptyMessageDelayed(1, 1000);
    }

    private void F1() {
        int i;
        c0.a(0, "XFTPV3H3FileLocalFragment", "refreshFileListDrapUp() pageSizePre:" + this.j0);
        this.k0 = true;
        List<b.b.b.d.a> f = this.a0.f();
        int size = f != null ? f.size() : 0;
        List<b.b.b.d.a> v1 = v1(b.c.a.a.d.b.c);
        int size2 = v1.size();
        if (size < size2) {
            int i2 = this.j0;
            if (size2 >= i2 && (i = size + i2) < size2) {
                size2 = i;
            }
        } else {
            c0.a(0, "XFTPV3H3FileLocalFragment", "已经是最大值");
        }
        List<b.b.b.d.a> subList = v1.subList(0, size2);
        this.a0.m(subList);
        this.a0.notifyDataSetChanged();
        c0.a(0, "XFTPV3H3FileLocalFragment", "fileList == " + subList);
        this.o0.sendEmptyMessageDelayed(1, 1000);
    }

    /* access modifiers changed from: private */
    public void G1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "refreshSizeBar()");
        this.b0.setText(x1());
        this.c0.setText(y1());
        ProgressBar progressBar = this.d0;
        long j = this.g0;
        double d2 = (double) (j - this.h0);
        Double.isNaN(d2);
        double d3 = (double) j;
        Double.isNaN(d3);
        progressBar.setProgress((int) ((d2 * 100.0d) / d3));
    }

    private void H1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "registerRefreshReceiver()");
        this.n0 = new d();
        g().registerReceiver(this.n0, new IntentFilter("local_refresh_list_filter"));
    }

    private void I1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "sendBrocastToRefreshDevList()");
        Intent intent = new Intent();
        intent.putExtra("notify_only", true);
        intent.setAction("refresh_list_filter");
        g().sendBroadcast(intent);
    }

    private void L1(List<b.b.b.d.a> list) {
        c0.a(0, "XFTPV3H3FileLocalFragment", "shareOpt()");
        int size = list.size();
        if (list == null || size <= 0) {
            c0.a(0, "XFTPV3H3FileLocalFragment", "shareOpt() size = 0");
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = "*/*";
        for (int i = 0; i < size; i++) {
            File file = new File(b.c.a.a.d.b.c + File.separator + list.get(i).d());
            str = w1(file);
            arrayList.add(Build.VERSION.SDK_INT >= 24 ? FileProvider.e(g(), "com.xforce.v5.xdvpro.fileProvider", file) : Uri.fromFile(file));
        }
        boolean z = arrayList.size() > 1;
        Intent intent = new Intent(z ? "android.intent.action.SEND_MULTIPLE" : "android.intent.action.SEND");
        intent.setType(str);
        if (z) {
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        } else {
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
        }
        this.a0.l(false);
        this.Y.setPullToRefreshEnabled(true);
        this.Y.setMode(e.C0046e.BOTH);
        f1(Intent.createChooser(intent, y().getString(R.string.file_opt_share)));
    }

    private void M1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "showDeleteLoadingView()");
        if (this.m0 == null) {
            this.m0 = new f(g(), R.style.confirm_dialog);
        }
        this.m0.show();
        this.m0.d(true);
        this.m0.c(y().getString(R.string.file_deleting));
    }

    private void N1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "unregRefreshReceiver()");
        if (this.n0 != null) {
            g().unregisterReceiver(this.n0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r1(java.util.List<b.b.b.d.a> r12) {
        /*
            r11 = this;
            r0 = 0
            java.lang.String r1 = "XFTPV3H3FileLocalFragment"
            java.lang.String r2 = "deleteOpt()"
            com.rp.rptool.util.c0.a(r0, r1, r2)
            if (r12 == 0) goto L_0x015d
            int r2 = r12.size()
            if (r2 <= 0) goto L_0x015d
            r11.M1()
            int r2 = r12.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "handleDeleteFiles() size = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.rp.rptool.util.c0.a(r0, r1, r3)
            r3 = 0
        L_0x002c:
            r4 = 3
            if (r3 >= r2) goto L_0x0156
            java.lang.Object r5 = r12.get(r3)
            b.b.b.d.a r5 = (b.b.b.d.a) r5
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = b.c.a.a.d.b.c
            r7.append(r8)
            java.lang.String r8 = java.io.File.separator
            r7.append(r8)
            java.lang.String r9 = r5.d()
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x0088
            boolean r7 = r6.delete()
            if (r7 == 0) goto L_0x0079
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r6.getName()
            r4.append(r6)
            java.lang.String r6 = " delete success!"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.rp.rptool.util.c0.a(r0, r1, r4)
            goto L_0x00a0
        L_0x0079:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = r6.getName()
            r7.append(r6)
            java.lang.String r6 = " delete fail!"
            goto L_0x0096
        L_0x0088:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = r6.getName()
            r7.append(r6)
            java.lang.String r6 = " file not exist!"
        L_0x0096:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.rp.rptool.util.c0.a(r4, r1, r6)
        L_0x00a0:
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = b.c.a.a.d.b.e
            r6.append(r7)
            r6.append(r8)
            java.lang.String r7 = r5.i()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6)
            boolean r6 = r4.exists()
            java.lang.String r7 = "缩略图删除成功"
            java.lang.String r9 = "缩略图删除失败"
            if (r6 == 0) goto L_0x00ed
            boolean r4 = r4.delete()
            if (r4 == 0) goto L_0x00dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x00d2:
            java.lang.String r5 = r5.i()
            r4.append(r5)
            r4.append(r7)
            goto L_0x014b
        L_0x00dd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x00e2:
            java.lang.String r5 = r5.i()
            r4.append(r5)
            r4.append(r9)
            goto L_0x014b
        L_0x00ed:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r5.i()
            r4.append(r6)
            java.lang.String r6 = "thumb文件夹找不到"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.rp.rptool.util.c0.a(r0, r1, r4)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = b.c.a.a.d.b.f
            r6.append(r10)
            r6.append(r8)
            java.lang.String r8 = r5.i()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6)
            boolean r6 = r4.exists()
            if (r6 == 0) goto L_0x013a
            boolean r4 = r4.delete()
            if (r4 == 0) goto L_0x0134
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x00d2
        L_0x0134:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x00e2
        L_0x013a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.i()
            r4.append(r5)
            java.lang.String r5 = "没找到缩略图"
            r4.append(r5)
        L_0x014b:
            java.lang.String r4 = r4.toString()
            com.rp.rptool.util.c0.a(r0, r1, r4)
            int r3 = r3 + 1
            goto L_0x002c
        L_0x0156:
            android.os.Handler r12 = r11.o0
            r0 = 1000(0x3e8, double:4.94E-321)
            r12.sendEmptyMessageDelayed(r4, r0)
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.V3H3.c.r1(java.util.List):void");
    }

    /* access modifiers changed from: private */
    public void s1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "deleteOptEnd()");
        u1();
        o.g(g(), y().getString(R.string.file_delete_ok), true);
        this.o0.sendEmptyMessageDelayed(0, 1000);
        I1();
    }

    private void u1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "dismissDeleteLoadingView()");
        f fVar = this.m0;
        if (fVar != null && fVar.isShowing()) {
            this.m0.dismiss();
        }
    }

    private List<b.b.b.d.a> v1(String str) {
        String str2;
        StringBuilder sb;
        c0.a(0, "XFTPV3H3FileLocalFragment", "getFileFromSDCard()" + str);
        if (str == null || "".equals(str)) {
            str = b.c.a.a.d.b.c;
        }
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            int visibility = this.e0.getVisibility();
            if (length <= 0) {
                if (visibility != 0) {
                    this.e0.setVisibility(0);
                }
            } else if (visibility != 8) {
                this.e0.setVisibility(8);
            }
            c0.a(0, "XFTPV3H3FileLocalFragment", "getFileFromSDCard() size = " + length);
            ArrayList arrayList = new ArrayList();
            for (File add : listFiles) {
                arrayList.add(add);
            }
            Collections.sort(arrayList, new C0049c(this));
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < length; i++) {
                File file2 = (File) arrayList.get(i);
                b.b.b.d.a aVar = new b.b.b.d.a();
                aVar.p(file2.getName());
                aVar.s(b.c.a.a.d.b.n(aVar.d()) + ".thm");
                String lowerCase = b.c.a.a.d.b.l(file2.getName()).toLowerCase();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("file:///");
                sb2.append(b.c.a.a.d.b.f);
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(aVar.i());
                aVar.t(sb2.toString());
                aVar.q("file:///" + b.c.a.a.d.b.c + str3 + aVar.d());
                aVar.r("file:///" + b.c.a.a.d.b.c + str3 + aVar.d());
                if (!new File(b.c.a.a.d.b.f + str3 + aVar.i()).exists()) {
                    aVar.s(aVar.d().split("\\.")[0] + "_ths.jpg");
                    if (!new File(b.c.a.a.d.b.e + str3 + aVar.i()).exists()) {
                        sb = new StringBuilder();
                        sb.append("file:///");
                        sb.append(b.c.a.a.d.b.c);
                        sb.append(str3);
                        str2 = aVar.d();
                    } else {
                        sb = new StringBuilder();
                        sb.append("file:///");
                        sb.append(b.c.a.a.d.b.e);
                        sb.append(str3);
                        str2 = aVar.i();
                    }
                    sb.append(str2);
                    aVar.t(sb.toString());
                }
                aVar.v(lowerCase.equals("mp4") ? 2 : 1);
                aVar.u(0);
                arrayList2.add(aVar);
            }
            return arrayList2;
        } else if (this.e0.getVisibility() == 0) {
            return null;
        } else {
            this.e0.setVisibility(0);
            return null;
        }
    }

    private String w1(File file) {
        String name = file.getName();
        String lowerCase = name.substring(name.lastIndexOf(".") + 1, name.length()).toLowerCase();
        String str = (lowerCase.equals("m4a") || lowerCase.equals("mp3") || lowerCase.equals("mid") || lowerCase.equals("xmf") || lowerCase.equals("ogg") || lowerCase.equals("wav")) ? "audio" : (lowerCase.equals("3gp") || lowerCase.equals("mp4")) ? "video" : (lowerCase.equals("jpg") || lowerCase.equals("gif") || lowerCase.equals("png") || lowerCase.equals("jpeg") || lowerCase.equals("bmp")) ? "image" : lowerCase.equals("apk") ? "application/vnd.android.package-archive" : "*";
        if (lowerCase.equals("apk")) {
            return str;
        }
        return str + "/*";
    }

    private String x1() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        this.h0 = blockSize;
        return Formatter.formatFileSize(g(), blockSize);
    }

    private String y1() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        this.g0 = blockSize;
        return Formatter.formatFileSize(g(), blockSize);
    }

    private void z1() {
        GridView gridView = (GridView) this.Y.getRefreshableView();
        this.Z = gridView;
        gridView.setNumColumns(b.c.a.a.d.b.n);
        g gVar = new g(g(), new ArrayList());
        this.a0 = gVar;
        this.Z.setAdapter(gVar);
        this.Y.setOnRefreshListener(new a());
        this.Z.setOnItemClickListener(new b());
    }

    public void A1(int i) {
        c0.a(0, "XFTPV3H3FileLocalFragment", "onChildClickConfirm(" + i + ")");
        List<b.b.b.d.a> g = this.a0.g();
        if (g == null || g.size() <= 0) {
            this.o0.sendEmptyMessage(4);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = g.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(g.get(i2));
        }
        this.o0.sendEmptyMessage(4);
        if (i == 0) {
            r1(arrayList);
        } else if (i == 1) {
            L1(arrayList);
        }
    }

    public void C1() {
        E1();
    }

    public void J1(boolean z) {
        this.l0 = z;
        this.a0.l(z);
        this.Y.setPullToRefreshEnabled(!z);
        if (!z) {
            this.Y.setMode(e.C0046e.BOTH);
        }
    }

    public void K1(b bVar) {
        this.f0 = bVar;
    }

    public void V(Bundle bundle) {
        super.V(bundle);
    }

    public View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_xffilelocal, (ViewGroup) null);
        PullToRefreshGridView pullToRefreshGridView = (PullToRefreshGridView) inflate.findViewById(R.id.local_listbg);
        this.Y = pullToRefreshGridView;
        pullToRefreshGridView.setScrollingWhileRefreshingEnabled(false);
        this.d0 = (ProgressBar) inflate.findViewById(R.id.local_size_progress);
        this.b0 = (TextView) inflate.findViewById(R.id.local_size_left);
        this.c0 = (TextView) inflate.findViewById(R.id.local_size_total);
        this.e0 = (TextView) inflate.findViewById(R.id.local_empty_view);
        G1();
        z1();
        H1();
        return inflate;
    }

    public void a0() {
        N1();
        super.a0();
    }

    public void p0() {
        super.p0();
    }

    public void q1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "chooseAllRtn()");
        this.f0.A1(this.a0.j(), true);
    }

    public void s0() {
        super.s0();
    }

    public void t1() {
        c0.a(0, "XFTPV3H3FileLocalFragment", "disChooseAllRtn()");
        this.f0.A1(this.a0.k(), false);
    }
}
