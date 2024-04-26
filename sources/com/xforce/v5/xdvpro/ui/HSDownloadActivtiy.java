package com.xforce.v5.xdvpro.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.StatFs;
import android.text.format.Formatter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b.b.a.f;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.x;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.e;
import com.xforce.v5.xdvpro.widget.i;
import com.xforce.v5.xdvpro.widget.n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HSDownloadActivtiy extends Activity implements View.OnClickListener, f {
    public static long o = -1;

    /* renamed from: a  reason: collision with root package name */
    private Button f965a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f966b;
    private TextView c;
    private ProgressBar d;
    private long e;
    private ListView f;
    private List<b.b.b.d.a> g;
    private com.xforce.v5.xdvpro.widget.a h;
    private int i = -1;
    private i j;
    /* access modifiers changed from: private */
    public e k;
    private i l;
    /* access modifiers changed from: private */
    public Handler m = new b();
    private d0.e n = new c();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            HSDownloadActivtiy.this.k.dismiss();
            HSDownloadActivtiy.this.q();
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1214) {
                switch (i) {
                    case 40961:
                        HSDownloadActivtiy.this.k();
                        return;
                    case 40962:
                        boolean z = true;
                        if (g.i1) {
                            HSDownloadActivtiy hSDownloadActivtiy = HSDownloadActivtiy.this;
                            String str = (String) message.obj;
                            if (message.arg1 != 1) {
                                z = false;
                            }
                            n.i(hSDownloadActivtiy, str, z);
                            return;
                        }
                        n.h(HSDownloadActivtiy.this, (String) message.obj, 1);
                        return;
                    default:
                        return;
                }
            } else {
                d0.t().J((b.b.e.a.a) message.obj);
            }
        }
    }

    class c implements d0.e {
        c() {
        }

        public void a(b.b.e.a.b bVar) {
            c0.a(0, "HSDownloadActivtiy", "handleUNToolCallback() type = " + bVar.b());
            Message obtainMessage = HSDownloadActivtiy.this.m.obtainMessage();
            obtainMessage.obj = bVar;
            obtainMessage.what = bVar.b();
            HSDownloadActivtiy.this.m.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        int i2 = this.i + 1;
        this.i = i2;
        if (i2 >= this.g.size()) {
            c0.a(1, "HSDownloadActivtiy", getResources().getString(R.string.file_download_end));
            this.h.c("");
            this.h.notifyDataSetChanged();
            return;
        }
        long j2 = o;
        b.b.b.d.a aVar = this.g.get(this.i);
        b.c.a.a.d.b.c + "/" + aVar.d();
        File file = new File(b.c.a.a.d.b.g + "/" + aVar.d());
        if (file.exists()) {
            file.delete();
        }
        long c2 = (aVar.c() / 1024) / 1024;
        long j3 = j2 + c2;
        if (j3 - c2 <= 100) {
            c0.a(3, "HSDownloadActivtiy", "downloadfile:" + aVar.d() + " TOO BIG![" + j3 + "-" + c2 + "]");
            this.h.a(aVar.d());
            this.h.notifyDataSetChanged();
            w(getResources().getString(R.string.big_file_storage_notenougth_download_fail), false);
            this.m.sendEmptyMessageDelayed(40961, 500);
            return;
        }
        String f2 = aVar.f();
        c0.a(0, "HSDownloadActivtiy", "DOWNLOAD FILE url = ------- " + f2);
        b.b.a.a aVar2 = new b.b.a.a(aVar.d(), f2, b.c.a.a.d.b.c, c2);
        c0.a(0, "HSDownloadActivtiy", "DOWNLOAD FILE ------- " + aVar2);
        d0.t().l(aVar2);
        String k2 = aVar.k();
        c0.a(0, "HSDownloadActivtiy", "DOWNLOAD Thumb FILE thumbUrl = ------- " + k2);
        d0.t().l(new b.b.a.a(aVar.i(), k2, b.c.a.a.d.b.e, 10));
    }

    private String l() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        o = blockSize;
        return Formatter.formatFileSize(this, blockSize);
    }

    private String m() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        this.e = blockSize;
        return Formatter.formatFileSize(this, blockSize);
    }

    private void n(int i2, int i3) {
        c0.a(0, "HSDownloadActivtiy", "sendIOCtrlMsgToDevs" + i2 + "," + i3 + ")");
        if (d0.t().p() == null) {
            c0.a(3, "HSDownloadActivtiy", "sendIOCtrlMsgToDevs() device == null");
        } else {
            o(new b.b.e.a.a(d0.t().p().g(), i2, x.a(i3), x.b()));
        }
    }

    private void o(b.b.e.a.a aVar) {
        c0.a(0, "HSDownloadActivtiy", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "HSDownloadActivtiy", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "HSDownloadActivtiy", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.m.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 1214;
        this.m.sendMessage(obtainMessage);
    }

    private void p() {
        d0.t().O(this);
        this.m.sendEmptyMessageDelayed(40961, 500);
    }

    /* access modifiers changed from: private */
    public void q() {
        d0.t().n();
        boolean z = b.c.a.a.d.b.p;
        s();
        t();
        finish();
    }

    private void r() {
        c0.a(0, "HSDownloadActivtiy", "refreshSizeBar()");
        this.f966b.setText(l());
        this.c.setText(m());
        ProgressBar progressBar = this.d;
        long j2 = this.e;
        double d2 = (double) (j2 - o);
        Double.isNaN(d2);
        double d3 = (double) j2;
        Double.isNaN(d3);
        progressBar.setProgress((int) ((d2 * 100.0d) / d3));
    }

    private void s() {
        c0.a(0, "HSDownloadActivtiy", "sendBrocastToRefreshDevList()");
        Intent intent = new Intent();
        intent.setAction("refresh_list_filter");
        intent.putExtra("notify_only", true);
        sendBroadcast(intent);
        intent.setAction("local_refresh_list_filter");
        sendBroadcast(intent);
    }

    private void t() {
        c0.a(0, "HSDownloadActivtiy", "sendCmdStartPerView ()");
        n(1816, 1);
    }

    private void u() {
        c0.a(0, "HSDownloadActivtiy", "sendCmdStopPreView ()");
        n(1816, 0);
    }

    private void v() {
        if (this.k == null) {
            this.k = new e(this, R.style.confirm_dialog);
        }
        this.k.show();
        this.k.d(getResources().getString(R.string.confirm_exit_download));
        this.k.e(new a());
    }

    private void w(String str, boolean z) {
        Message obtainMessage = this.m.obtainMessage();
        obtainMessage.what = 40962;
        obtainMessage.obj = str;
        obtainMessage.arg1 = z ? 1 : 0;
        this.m.sendMessage(obtainMessage);
    }

    public void a(String str) {
        if (!str.contains("_ths.")) {
            this.h.a(str);
            this.h.notifyDataSetChanged();
            this.m.sendEmptyMessage(40961);
        }
    }

    public void b(String str) {
        if (!str.contains("_ths.")) {
            this.h.c(str);
            this.h.d(1.0f);
            this.h.notifyDataSetChanged();
            this.h.b(str);
            r();
            this.m.sendEmptyMessage(40961);
            b.c.a.a.d.b.A(this, b.c.a.a.d.b.c + "/" + str);
        }
    }

    public void c(String str, long j2) {
        if (!str.contains("_ths.")) {
            this.h.e(j2);
            this.h.notifyDataSetChanged();
        }
    }

    public void d(String str, float f2) {
        if (!str.contains("_ths.")) {
            this.h.c(str);
            this.h.d(f2);
            this.h.notifyDataSetChanged();
        }
    }

    public void e(String str) {
        if (!str.contains("_ths.")) {
            this.h.c(str);
            this.h.notifyDataSetChanged();
        }
    }

    public void f(String str) {
    }

    public void onClick(View view) {
        if (view.getId() == R.id.back_btn) {
            if (this.i == this.g.size()) {
                t();
                s();
                finish();
                return;
            }
            v();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_download);
        Button button = (Button) findViewById(R.id.back_btn);
        this.f965a = button;
        button.setOnClickListener(this);
        this.d = (ProgressBar) findViewById(R.id.local_size_progress);
        this.f966b = (TextView) findViewById(R.id.local_size_left);
        this.c = (TextView) findViewById(R.id.local_size_total);
        this.g = (ArrayList) getIntent().getSerializableExtra("download_info");
        this.f = (ListView) findViewById(R.id.download_list);
        com.xforce.v5.xdvpro.widget.a aVar = new com.xforce.v5.xdvpro.widget.a(this, this.g);
        this.h = aVar;
        this.f.setAdapter(aVar);
        this.f.setClickable(false);
        r();
        u();
        p();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        i iVar = this.j;
        if (iVar != null && iVar.isShowing()) {
            this.j.dismiss();
            this.j = null;
        }
        e eVar = this.k;
        if (eVar != null && eVar.isShowing()) {
            this.k.dismiss();
            this.k = null;
        }
        i iVar2 = this.l;
        if (iVar2 != null && iVar2.isShowing()) {
            this.l.dismiss();
            this.l = null;
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return true;
        }
        if (this.i == this.g.size()) {
            t();
            s();
            finish();
            return true;
        }
        v();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        d0.t().N(this.n);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        n.c();
        super.onStop();
    }
}
