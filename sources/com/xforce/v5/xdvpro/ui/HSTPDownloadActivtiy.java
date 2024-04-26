package com.xforce.v5.xdvpro.ui;

import android.app.Activity;
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
import android.os.StatFs;
import android.provider.MediaStore;
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
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class HSTPDownloadActivtiy extends Activity implements View.OnClickListener, f {
    public static long p = -1;

    /* renamed from: a  reason: collision with root package name */
    private Button f970a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f971b;
    private TextView c;
    private ProgressBar d;
    private long e;
    private ListView f;
    private List<b.b.b.d.a> g;
    private com.xforce.v5.xdvpro.widget.b h;
    private int i = -1;
    private i j;
    /* access modifiers changed from: private */
    public e k;
    private i l;
    private d m;
    /* access modifiers changed from: private */
    public Handler n = new b();
    private d0.e o = new c();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            HSTPDownloadActivtiy.this.k.dismiss();
            HSTPDownloadActivtiy.this.s();
        }
    }

    class b extends Handler {
        b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            boolean z = false;
            if (i != 0) {
                if (i == 1214) {
                    d0.t().J((b.b.e.a.a) message.obj);
                    return;
                } else if (i != 8196) {
                    if (i != 45060) {
                        switch (i) {
                            case 40961:
                                HSTPDownloadActivtiy.this.m();
                                return;
                            case 40962:
                                if (g.i1) {
                                    HSTPDownloadActivtiy hSTPDownloadActivtiy = HSTPDownloadActivtiy.this;
                                    String str = (String) message.obj;
                                    if (message.arg1 == 1) {
                                        z = true;
                                    }
                                    n.i(hSTPDownloadActivtiy, str, z);
                                    return;
                                }
                                n.h(HSTPDownloadActivtiy.this, (String) message.obj, 1);
                                return;
                            default:
                                return;
                        }
                    } else {
                        HSTPDownloadActivtiy.this.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File((String) message.obj))));
                        return;
                    }
                }
            }
            b.c.a.a.d.b.p = true;
            HSTPDownloadActivtiy hSTPDownloadActivtiy2 = HSTPDownloadActivtiy.this;
            hSTPDownloadActivtiy2.B(hSTPDownloadActivtiy2.getResources().getString(R.string.device_disconnect), false);
        }
    }

    class c implements d0.e {
        c() {
        }

        public void a(b.b.e.a.b bVar) {
            c0.a(0, "HSTPDownloadActivtiy", "handleUNToolCallback() type = " + bVar.b());
            Message obtainMessage = HSTPDownloadActivtiy.this.n.obtainMessage();
            obtainMessage.obj = bVar;
            obtainMessage.what = bVar.b();
            HSTPDownloadActivtiy.this.n.sendMessage(obtainMessage);
        }
    }

    private class d extends BroadcastReceiver {
        private d() {
        }

        /* synthetic */ d(HSTPDownloadActivtiy hSTPDownloadActivtiy, a aVar) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (!XFTPMainFragmentActivity.K.equals(b.c.a.a.d.b.h(HSTPDownloadActivtiy.this))) {
                    c0.a(0, "HSTPDownloadActivtiy", "state_change");
                    HSTPDownloadActivtiy.this.n.sendEmptyMessage(0);
                }
            }
        }
    }

    private void A() {
        if (this.k == null) {
            this.k = new e(this, R.style.confirm_dialog);
        }
        this.k.show();
        this.k.d(getResources().getString(R.string.confirm_exit_download));
        this.k.e(new a());
    }

    /* access modifiers changed from: private */
    public void B(String str, boolean z) {
        Message obtainMessage = this.n.obtainMessage();
        obtainMessage.what = 40962;
        obtainMessage.obj = str;
        obtainMessage.arg1 = z ? 1 : 0;
        this.n.sendMessage(obtainMessage);
    }

    private void l(String str) {
        Message obtainMessage = this.n.obtainMessage();
        obtainMessage.what = 45060;
        obtainMessage.obj = str;
        obtainMessage.arg1 = -1;
        this.n.sendMessage(obtainMessage);
    }

    /* access modifiers changed from: private */
    public void m() {
        this.i++;
        this.h.e(0.0f);
        this.h.d("");
        long j2 = 0;
        this.h.f(0);
        if (this.i >= this.g.size()) {
            c0.a(1, "HSTPDownloadActivtiy", getResources().getString(R.string.file_download_end));
            this.h.d("");
            this.h.notifyDataSetChanged();
            return;
        }
        long j3 = p;
        b.b.b.d.a aVar = this.g.get(this.i);
        b.c.a.a.d.b.c + "/" + aVar.l() + aVar.a();
        File file = new File(b.c.a.a.d.b.g + "/" + aVar.l() + aVar.a());
        if (file.exists()) {
            file.delete();
        }
        if (aVar.c() != 0) {
            j2 = (aVar.c() / 1024) / 1024;
        }
        long j4 = j3 + j2;
        if (j4 - j2 <= 100) {
            c0.a(3, "HSTPDownloadActivtiy", "downloadfile:" + aVar.d() + " TOO BIG![" + j4 + "-" + j2 + "]");
            this.h.a(aVar.d());
            this.h.notifyDataSetChanged();
            B(getResources().getString(R.string.big_file_storage_notenougth_download_fail), false);
            this.n.sendEmptyMessageDelayed(40961, 500);
            return;
        }
        String f2 = aVar.f();
        c0.a(0, "HSTPDownloadActivtiy", "DOWNLOAD FILE url = ------- " + f2);
        b.b.a.a aVar2 = new b.b.a.a(aVar.d(), f2, b.c.a.a.d.b.c, aVar.c());
        c0.a(0, "HSTPDownloadActivtiy", "DOWNLOAD FILE ------- " + aVar2);
        d0.t().l(aVar2);
        if (aVar.d().contains("MP4") || aVar.d().contains("mp4")) {
            String str = "http://" + d0.t().p().c() + ":8082/file/media/" + b.c.a.a.d.b.n(aVar.d()) + ".thm";
            c0.a(0, "HSTPDownloadActivtiy", "DOWNLOAD Thumb FILE thumbUrl = ------- " + str);
            d0.t().l(new b.b.a.a(aVar.i(), str, b.c.a.a.d.b.f, 10));
        }
    }

    private String n() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        p = blockSize;
        return Formatter.formatFileSize(this, blockSize);
    }

    private String o() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        this.e = blockSize;
        return Formatter.formatFileSize(this, blockSize);
    }

    private void p(int i2, int i3) {
        c0.a(0, "HSTPDownloadActivtiy", "sendIOCtrlMsgToDevs" + i2 + "," + i3 + ")");
        if (d0.t().p() == null) {
            c0.a(3, "HSTPDownloadActivtiy", "sendIOCtrlMsgToDevs() device == null");
        } else {
            q(new b.b.e.a.a(d0.t().p().g(), i2, x.a(i3), x.b()));
        }
    }

    private void q(b.b.e.a.a aVar) {
        c0.a(0, "HSTPDownloadActivtiy", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "HSTPDownloadActivtiy", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "HSTPDownloadActivtiy", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.n.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 1214;
        this.n.sendMessage(obtainMessage);
    }

    private void r() {
        d0.t().O(this);
        this.n.sendEmptyMessageDelayed(40961, 500);
    }

    /* access modifiers changed from: private */
    public void s() {
        d0.t().n();
        if (!b.c.a.a.d.b.p) {
            x();
            y();
        }
        finish();
    }

    private void t() {
        c0.a(0, "HSTPDownloadActivtiy", "refreshSizeBar()");
        this.f971b.setText(n());
        this.c.setText(o());
        ProgressBar progressBar = this.d;
        long j2 = this.e;
        double d2 = (double) (j2 - p);
        Double.isNaN(d2);
        double d3 = (double) j2;
        Double.isNaN(d3);
        progressBar.setProgress((int) ((d2 * 100.0d) / d3));
    }

    private void u() {
        c0.a(0, "HSTPDownloadActivtiy", "registerWiFiConnectReceiver()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.m == null) {
            this.m = new d(this, (a) null);
        }
        registerReceiver(this.m, intentFilter);
    }

    private void v(File file) {
        c0.a(0, "HSTPDownloadActivtiy", "saveImageToAlbum() " + file.getName());
        try {
            MediaStore.Images.Media.insertImage(getContentResolver(), file.getAbsolutePath(), file.getName(), (String) null);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        sendBroadcast(intent);
    }

    private void w(File file) {
        c0.a(0, "HSTPDownloadActivtiy", "saveVideoToAlbum() " + file.getName());
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        sendBroadcast(intent);
    }

    private void x() {
        c0.a(0, "HSTPDownloadActivtiy", "sendBrocastToRefreshDevList()");
        Intent intent = new Intent();
        intent.setAction("refresh_list_filter");
        intent.putExtra("notify_only", true);
        sendBroadcast(intent);
        intent.setAction("local_refresh_list_filter");
        sendBroadcast(intent);
    }

    private void y() {
        c0.a(0, "HSTPDownloadActivtiy", "sendCmdStartPerView ()");
        p(1816, 1);
    }

    private void z() {
        c0.a(0, "HSTPDownloadActivtiy", "sendCmdStopPreView ()");
        p(1816, 0);
    }

    public void a(String str) {
        c0.a(0, "HSTPDownloadActivtiy", "downloadFailRtn() fileName = " + str);
        if (!str.contains("thm")) {
            this.h.a(str);
            this.h.notifyDataSetChanged();
            this.n.sendEmptyMessage(40961);
        }
    }

    public void b(String str) {
        String str2;
        StringBuilder sb;
        String str3;
        if (str.contains("thm")) {
            b.c.a.a.d.b.e(new File(b.c.a.a.d.b.f + File.separator + str));
        }
        if (str.contains(".jpg") || str.contains(".mp4")) {
            str2 = b.c.a.a.d.b.e(new File(b.c.a.a.d.b.c + File.separator + str)).getName();
        } else {
            str2 = str;
        }
        if (!str.contains("thm")) {
            this.h.d(str);
            this.h.e(1.0f);
            this.h.b(str);
            this.h.notifyDataSetChanged();
            t();
            this.n.sendEmptyMessage(40961);
            if (Build.VERSION.SDK_INT >= 29) {
                b.c.a.a.d.b.A(this, b.c.a.a.d.b.c + "/" + str2);
                if (str.contains(".jpg")) {
                    v(new File(b.c.a.a.d.b.c + "/" + str2));
                    return;
                }
                b.c.a.a.d.b.d(b.c.a.a.d.b.c + "/" + str2, "/sdcard/Movies/" + str2, false);
                w(new File("/sdcard/Movies/" + str2));
                return;
            }
            String str4 = b.c.a.a.d.b.c + "/" + str2;
            if (str2.toLowerCase().contains("mp4")) {
                b.c.a.a.d.b.d(str4, "/mnt/sdcard/Movies/" + str2, false);
                l("/mnt/sdcard/Movies/" + str2);
                sb = new StringBuilder();
                str3 = "/Movies/";
            } else if (str2.toLowerCase().contains("jpg")) {
                b.c.a.a.d.b.d(str4, "/mnt/sdcard/Pictures/" + str2, false);
                l("/mnt/sdcard/Pictures/" + str2);
                sb = new StringBuilder();
                str3 = "/Pictures/";
            } else {
                return;
            }
            sb.append(str3);
            sb.append(str2);
            B(sb.toString(), true);
        }
    }

    public void c(String str, long j2) {
        if (!str.contains("thm")) {
            this.h.f(j2);
            this.h.notifyDataSetChanged();
        }
    }

    public void d(String str, float f2) {
        if (!str.contains("thm")) {
            this.h.d(str);
            this.h.e(f2);
            this.h.notifyDataSetChanged();
        }
    }

    public void e(String str) {
        if (!str.contains("thm")) {
            this.h.d(str);
            this.h.notifyDataSetChanged();
        }
    }

    public void f(String str) {
    }

    public void onClick(View view) {
        if (view.getId() == R.id.back_btn) {
            if (this.i == this.g.size()) {
                if (!b.c.a.a.d.b.p) {
                    y();
                    x();
                }
                finish();
                return;
            }
            A();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_download);
        Button button = (Button) findViewById(R.id.back_btn);
        this.f970a = button;
        button.setOnClickListener(this);
        this.d = (ProgressBar) findViewById(R.id.local_size_progress);
        this.f971b = (TextView) findViewById(R.id.local_size_left);
        this.c = (TextView) findViewById(R.id.local_size_total);
        this.g = (ArrayList) getIntent().getSerializableExtra("download_info");
        this.f = (ListView) findViewById(R.id.download_list);
        com.xforce.v5.xdvpro.widget.b bVar = new com.xforce.v5.xdvpro.widget.b(this, this.g);
        this.h = bVar;
        this.f.setAdapter(bVar);
        this.f.setClickable(false);
        t();
        z();
        r();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return true;
        }
        if (this.i == this.g.size()) {
            if (!b.c.a.a.d.b.p) {
                y();
                x();
            }
            finish();
            return true;
        }
        A();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        u();
        d0.t().N(this.o);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        n.c();
        com.xforce.v5.xdvpro.widget.b bVar = this.h;
        if (bVar != null) {
            bVar.c();
        }
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
        d dVar = this.m;
        if (dVar != null) {
            unregisterReceiver(dVar);
        }
        super.onStop();
    }
}
