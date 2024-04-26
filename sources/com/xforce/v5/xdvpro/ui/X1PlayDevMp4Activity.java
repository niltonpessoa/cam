package com.xforce.v5.xdvpro.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import b.c.a.a.d.c;
import com.rp.rptool.util.c0;
import com.rp.rptool.util.d0;
import com.rp.rptool.util.x;
import com.xforce.v5.xdvpro.R;
import com.xforce.v5.xdvpro.widget.o;
import java.io.File;

public class X1PlayDevMp4Activity extends Activity implements View.OnClickListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, SeekBar.OnSeekBarChangeListener {
    /* access modifiers changed from: private */
    public static int L = -1;
    /* access modifiers changed from: private */
    public String A;
    /* access modifiers changed from: private */
    public int B = 0;
    /* access modifiers changed from: private */
    public long C = 0;
    /* access modifiers changed from: private */
    public long D = 0;
    /* access modifiers changed from: private */
    public boolean E = false;
    /* access modifiers changed from: private */
    public boolean F = false;
    /* access modifiers changed from: private */
    public boolean G = false;
    /* access modifiers changed from: private */
    public boolean H = false;
    /* access modifiers changed from: private */
    public ProgressDialog I = null;
    /* access modifiers changed from: private */
    public Handler J = new c();
    private b.c.a.a.d.c K;

    /* renamed from: a  reason: collision with root package name */
    private Button f1047a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f1048b;
    private RelativeLayout c;
    private RelativeLayout.LayoutParams d;
    private RelativeLayout.LayoutParams e;
    private RelativeLayout.LayoutParams f;
    private RelativeLayout.LayoutParams g;
    private RelativeLayout h;
    private LinearLayout i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    /* access modifiers changed from: private */
    public TextView n;
    private ImageButton o;
    private boolean p = true;
    /* access modifiers changed from: private */
    public VideoView q;
    private SeekBar r;
    private boolean s = true;
    String t;
    String u;
    byte[] v = new byte[102400];
    private LinearLayout w;
    private LinearLayout x;
    private e y;
    /* access modifiers changed from: private */
    public String z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            if (X1PlayDevMp4Activity.this.I == null) {
                X1PlayDevMp4Activity x1PlayDevMp4Activity = X1PlayDevMp4Activity.this;
                ProgressDialog unused = x1PlayDevMp4Activity.I = ProgressDialog.show(x1PlayDevMp4Activity, x1PlayDevMp4Activity.getResources().getString(R.string.playmp4_loading_title), X1PlayDevMp4Activity.this.getResources().getString(R.string.playmp4_loading), true, false);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: java.io.FileOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.io.FileOutputStream} */
        /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2 */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v4, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: type inference failed for: r2v1, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r2v2 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r3v12 */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r2v3 */
        /* JADX WARNING: type inference failed for: r3v14 */
        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0130, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0131, code lost:
            r3 = r1;
            r1 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0134, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0135, code lost:
            r2 = r1;
            r1 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
            r3 = r1;
            r1 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x013b, code lost:
            r3 = r1;
            r1 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0130 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
          PHI: (r1v12 java.io.FileOutputStream) = (r1v0 java.io.FileOutputStream), (r1v24 java.io.FileOutputStream), (r1v25 java.io.FileOutputStream), (r1v29 java.io.FileOutputStream), (r1v30 java.io.FileOutputStream) binds: [B:7:0x0046, B:18:0x008f, B:24:0x00c0, B:27:0x00cf, B:25:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:7:0x0046] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0148 A[SYNTHETIC, Splitter:B:62:0x0148] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014f A[SYNTHETIC, Splitter:B:66:0x014f] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x015e A[SYNTHETIC, Splitter:B:76:0x015e] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0171 A[SYNTHETIC, Splitter:B:88:0x0171] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x017d A[SYNTHETIC, Splitter:B:95:0x017d] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0184 A[SYNTHETIC, Splitter:B:99:0x0184] */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = "X1PlayDevMp4Activity"
                r1 = 0
                r2 = 3
                java.net.URL r3 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r4 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                java.lang.String r4 = r4.z     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                r3.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                java.net.URLConnection r3 = r3.openConnection()     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                java.io.File r4 = new java.io.File     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r5 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                java.lang.String r5 = r5.A     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                r4.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                boolean r5 = r4.exists()     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                if (r5 == 0) goto L_0x0029
                r4.delete()     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
            L_0x0029:
                java.io.File r5 = r4.getParentFile()     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                r5.mkdirs()     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                r4.createNewFile()     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r5 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                long r6 = r4.length()     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                long unused = r5.C = r6     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                r6 = 1
                r5.<init>(r4, r6)     // Catch:{ SocketTimeoutException -> 0x0169, ConnectTimeoutException -> 0x0156, Exception -> 0x0141, all -> 0x013e }
                java.lang.String r4 = "User-Agent"
                java.lang.String r7 = "NetFox"
                r3.setRequestProperty(r4, r7)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                java.lang.String r4 = "RANGE"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r7.<init>()     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                java.lang.String r8 = "bytes="
                r7.append(r8)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r8 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                long r8 = r8.C     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r7.append(r8)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                java.lang.String r8 = "-"
                r7.append(r8)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                java.lang.String r7 = r7.toString()     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r3.setRequestProperty(r4, r7)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                java.io.InputStream r1 = r3.getInputStream()     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r4 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                int r3 = r3.getContentLength()     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                long r7 = (long) r3     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                long unused = r4.D = r7     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                long r3 = r3.D     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r7 = -1
                int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r9 != 0) goto L_0x008f
                r5.close()     // Catch:{ IOException -> 0x0088 }
                goto L_0x0089
            L_0x0088:
            L_0x0089:
                if (r1 == 0) goto L_0x008e
                r1.close()     // Catch:{ IOException -> 0x008e }
            L_0x008e:
                return
            L_0x008f:
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                long r7 = r3.C     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.w(r3, r7)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                android.os.Handler r3 = r3.J     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r4 = 0
                r3.sendEmptyMessage(r4)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                boolean unused = r3.G = r4     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                boolean unused = r3.E = r4     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
            L_0x00ac:
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                byte[] r3 = r3.v     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                int r3 = r1.read(r3)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r7 = -1
                if (r3 == r7) goto L_0x0107
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r7 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                boolean r7 = r7.G     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                if (r7 == 0) goto L_0x00c0
                goto L_0x0107
            L_0x00c0:
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r7 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ Exception -> 0x00ce, all -> 0x0130 }
                byte[] r7 = r7.v     // Catch:{ Exception -> 0x00ce, all -> 0x0130 }
                r5.write(r7, r4, r3)     // Catch:{ Exception -> 0x00ce, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r7 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ Exception -> 0x00ce, all -> 0x0130 }
                long r8 = (long) r3     // Catch:{ Exception -> 0x00ce, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.t(r7, r8)     // Catch:{ Exception -> 0x00ce, all -> 0x0130 }
                goto L_0x00d2
            L_0x00ce:
                r3 = move-exception
                r3.printStackTrace()     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
            L_0x00d2:
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                boolean r3 = r3.E     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                if (r3 != 0) goto L_0x00ac
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                android.os.Handler r3 = r3.J     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                boolean r3 = r3.hasMessages(r2)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                if (r3 != 0) goto L_0x00ac
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r3.W()     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.c()     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                int r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.L     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                int r3 = r3 * 1000
                int r3 = r3 + 2000
                r7 = 5000(0x1388, float:7.006E-42)
                if (r7 > r3) goto L_0x00fc
                r3 = 5000(0x1388, float:7.006E-42)
            L_0x00fc:
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r7 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                android.os.Handler r7 = r7.J     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                long r8 = (long) r3     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r7.sendEmptyMessageDelayed(r2, r8)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                goto L_0x00ac
            L_0x0107:
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                boolean r3 = r3.G     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                if (r3 == 0) goto L_0x011a
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                boolean unused = r3.G = r4     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                r3.F()     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                goto L_0x0124
            L_0x011a:
                java.lang.String r3 = "download finish!"
                com.rp.rptool.util.c0.a(r2, r0, r3)     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity r3 = com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.this     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
                boolean unused = r3.H = r6     // Catch:{ SocketTimeoutException -> 0x013b, ConnectTimeoutException -> 0x0138, Exception -> 0x0134, all -> 0x0130 }
            L_0x0124:
                r5.close()     // Catch:{ IOException -> 0x0128 }
                goto L_0x0129
            L_0x0128:
            L_0x0129:
                if (r1 == 0) goto L_0x0179
                r1.close()     // Catch:{ IOException -> 0x0179 }
                goto L_0x0179
            L_0x0130:
                r0 = move-exception
                r3 = r1
                r1 = r5
                goto L_0x017b
            L_0x0134:
                r0 = move-exception
                r2 = r1
                r1 = r5
                goto L_0x0143
            L_0x0138:
                r3 = r1
                r1 = r5
                goto L_0x0157
            L_0x013b:
                r3 = r1
                r1 = r5
                goto L_0x016a
            L_0x013e:
                r0 = move-exception
                r3 = r1
                goto L_0x017b
            L_0x0141:
                r0 = move-exception
                r2 = r1
            L_0x0143:
                r0.printStackTrace()     // Catch:{ all -> 0x0153 }
                if (r1 == 0) goto L_0x014d
                r1.close()     // Catch:{ IOException -> 0x014c }
                goto L_0x014d
            L_0x014c:
            L_0x014d:
                if (r2 == 0) goto L_0x0179
                r2.close()     // Catch:{ IOException -> 0x0179 }
                goto L_0x0179
            L_0x0153:
                r0 = move-exception
                r3 = r2
                goto L_0x017b
            L_0x0156:
                r3 = r1
            L_0x0157:
                java.lang.String r4 = "ConnectTimeoutException()"
                com.rp.rptool.util.c0.a(r2, r0, r4)     // Catch:{ all -> 0x017a }
                if (r1 == 0) goto L_0x0163
                r1.close()     // Catch:{ IOException -> 0x0162 }
                goto L_0x0163
            L_0x0162:
            L_0x0163:
                if (r3 == 0) goto L_0x0179
            L_0x0165:
                r3.close()     // Catch:{ IOException -> 0x0179 }
                goto L_0x0179
            L_0x0169:
                r3 = r1
            L_0x016a:
                java.lang.String r4 = "SocketTimeoutException()"
                com.rp.rptool.util.c0.a(r2, r0, r4)     // Catch:{ all -> 0x017a }
                if (r1 == 0) goto L_0x0176
                r1.close()     // Catch:{ IOException -> 0x0175 }
                goto L_0x0176
            L_0x0175:
            L_0x0176:
                if (r3 == 0) goto L_0x0179
                goto L_0x0165
            L_0x0179:
                return
            L_0x017a:
                r0 = move-exception
            L_0x017b:
                if (r1 == 0) goto L_0x0182
                r1.close()     // Catch:{ IOException -> 0x0181 }
                goto L_0x0182
            L_0x0181:
            L_0x0182:
                if (r3 == 0) goto L_0x0187
                r3.close()     // Catch:{ IOException -> 0x0187 }
            L_0x0187:
                goto L_0x0189
            L_0x0188:
                throw r0
            L_0x0189:
                goto L_0x0188
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.ui.X1PlayDevMp4Activity.b.run():void");
        }
    }

    class c extends Handler {
        c() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                if (!X1PlayDevMp4Activity.this.H) {
                    double r = (double) X1PlayDevMp4Activity.this.C;
                    Double.isNaN(r);
                    double u = (double) X1PlayDevMp4Activity.this.D;
                    Double.isNaN(u);
                    X1PlayDevMp4Activity.this.n.setText(String.format(X1PlayDevMp4Activity.this.getResources().getString(R.string.playmp4_has_dl), new Object[]{Double.valueOf(((r * 100.0d) / u) * 1.0d)}));
                } else {
                    X1PlayDevMp4Activity.this.n.setText(X1PlayDevMp4Activity.this.getResources().getString(R.string.playmp4_has_downloaded));
                }
                if (X1PlayDevMp4Activity.this.q.isPlaying()) {
                    X1PlayDevMp4Activity.this.Q();
                }
                X1PlayDevMp4Activity.this.J.sendEmptyMessageDelayed(0, 1000);
            } else if (i == 1) {
                X1PlayDevMp4Activity.this.finish();
            } else if (i == 3) {
                boolean unused = X1PlayDevMp4Activity.this.E = true;
                boolean unused2 = X1PlayDevMp4Activity.this.F = false;
                X1PlayDevMp4Activity.this.J.removeMessages(3);
                X1PlayDevMp4Activity.this.q.setVideoPath(X1PlayDevMp4Activity.this.A);
                X1PlayDevMp4Activity.this.q.start();
                X1PlayDevMp4Activity.this.q.seekTo(X1PlayDevMp4Activity.this.B);
                if (X1PlayDevMp4Activity.this.I != null) {
                    X1PlayDevMp4Activity.this.I.dismiss();
                    ProgressDialog unused3 = X1PlayDevMp4Activity.this.I = null;
                }
            } else if (i == 4) {
                X1PlayDevMp4Activity.this.T();
                X1PlayDevMp4Activity.this.Y();
            } else if (i == 1214) {
                d0.t().J((b.b.e.a.a) message.obj);
            } else if (i == 40961) {
                b.c.a.a.d.b.p = true;
                X1PlayDevMp4Activity x1PlayDevMp4Activity = X1PlayDevMp4Activity.this;
                Toast.makeText(x1PlayDevMp4Activity, x1PlayDevMp4Activity.getResources().getString(R.string.device_disconnect), 1).show();
            }
        }
    }

    class d implements c.b {
        d(X1PlayDevMp4Activity x1PlayDevMp4Activity) {
        }

        public void a() {
            b.c.a.a.d.b.z(0);
        }

        public void b() {
        }
    }

    private class e extends BroadcastReceiver {
        private e() {
        }

        /* synthetic */ e(X1PlayDevMp4Activity x1PlayDevMp4Activity, a aVar) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                String h = b.c.a.a.d.b.h(X1PlayDevMp4Activity.this);
                String str = XFTPMainFragmentActivity.K;
                if (str != null && !str.equals(h)) {
                    c0.a(0, "X1PlayDevMp4Activity", "state_change");
                    X1PlayDevMp4Activity.this.J.sendEmptyMessage(40961);
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void C() {
        c0.a(0, "X1PlayDevMp4Activity", "changeLanscapeView");
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags |= 1024;
        getWindow().setAttributes(attributes);
        getWindow().addFlags(512);
        this.f1048b.setBackgroundColor(getResources().getColor(R.color.black));
        this.c.setLayoutParams(this.e);
        this.h.setBackgroundColor(getResources().getColor(R.color.lan_bottom_bg_color));
        this.h.setVisibility(8);
        this.f1047a.setTextColor(getResources().getColorStateList(R.color.white_transwhite_text_color));
        this.j.setTextColor(getResources().getColor(R.color.white));
        this.l.setTextColor(getResources().getColor(R.color.white));
        this.n.setTextColor(getResources().getColor(R.color.white));
        this.i.setBackground(getResources().getDrawable(R.drawable.video_lan_opt_bg));
        this.i.setVisibility(8);
        this.i.setLayoutParams(this.f);
        this.i.setGravity(17);
        this.x.setVisibility(0);
        this.w.setVisibility(8);
    }

    @SuppressLint({"NewApi"})
    private void D() {
        c0.a(0, "X1PlayDevMp4Activity", "changePortraitView");
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags &= -1025;
        getWindow().setAttributes(attributes);
        getWindow().clearFlags(512);
        this.f1048b.setBackgroundColor(getResources().getColor(R.color.groupitem_bg));
        this.c.setLayoutParams(this.d);
        this.h.setBackgroundDrawable(getResources().getDrawable(R.drawable.top_title_bar_bg));
        this.h.setVisibility(0);
        this.f1047a.setTextColor(getResources().getColorStateList(R.color.black_green_text_color));
        this.j.setTextColor(getResources().getColor(R.color.black));
        this.l.setTextColor(getResources().getColor(R.color.black));
        this.n.setTextColor(getResources().getColor(R.color.black));
        this.i.setBackgroundColor(getResources().getColor(R.color.transparent));
        this.i.setVisibility(0);
        this.i.setLayoutParams(this.g);
        this.i.setGravity(1);
        this.x.setVisibility(8);
        this.w.setVisibility(0);
    }

    private String E(String str) {
        if ("".equals(str)) {
            c0.a(3, "X1PlayDevMp4Activity", "checkHasDownlaod() filename is null");
            return "";
        }
        String str2 = b.c.a.a.d.b.g + "/" + str;
        File file = new File(str2);
        if (file.exists()) {
            c0.a(0, "X1PlayDevMp4Activity", str + " is in download dir");
            if (0 < file.length()) {
                return str2;
            }
            file.delete();
        }
        return "";
    }

    /* access modifiers changed from: private */
    public void F() {
        StringBuilder sb;
        String str;
        c0.a(0, "X1PlayDevMp4Activity", "deleteDownloadFile()");
        File file = new File(this.A);
        if (file.exists()) {
            if (file.delete()) {
                sb = new StringBuilder();
                sb.append("deleteDownloadFile()");
                sb.append(file.getName());
                str = " delete success!";
            } else {
                sb = new StringBuilder();
                sb.append("deleteDownloadFile()");
                sb.append(file.getName());
                str = " delete error!";
            }
            sb.append(str);
            c0.a(0, "X1PlayDevMp4Activity", sb.toString());
        }
    }

    private void G(int i2, int i3) {
        c0.a(0, "X1PlayDevMp4Activity", "sendIOCtrlMsgToDevs" + i2 + "," + i3 + ")");
        if (d0.t().p() == null) {
            c0.a(3, "X1PlayDevMp4Activity", "sendIOCtrlMsgToDevs() device == null");
        } else {
            H(new b.b.e.a.a(d0.t().q(), i2, x.a(i3), x.b()));
        }
    }

    private void H(b.b.e.a.a aVar) {
        c0.a(0, "X1PlayDevMp4Activity", "sendIOCtrlMsgToDevs()");
        if (aVar == null) {
            c0.a(3, "X1PlayDevMp4Activity", "sendIOCtrlMsgToDevs() error msg == null");
            return;
        }
        c0.a(0, "X1PlayDevMp4Activity", "sendIOCtrlMsgToDevs() type = " + aVar.c());
        Message obtainMessage = this.J.obtainMessage();
        obtainMessage.obj = aVar;
        obtainMessage.what = 1214;
        this.J.sendMessage(obtainMessage);
    }

    private void I() {
        this.q.setOnPreparedListener(this);
        this.q.setOnCompletionListener(this);
        this.q.setOnErrorListener(this);
        Y();
    }

    private void J() {
        this.t = getIntent().getStringExtra("param_url");
        this.u = getIntent().getStringExtra("param_name");
    }

    private void K() {
        this.q = (VideoView) findViewById(R.id.playmp4_video_view);
        this.r = (SeekBar) findViewById(R.id.playmp4_video_seekbar);
        this.o.setOnClickListener(this);
        this.r.setOnSeekBarChangeListener(this);
    }

    private void L() {
        Button button = (Button) findViewById(R.id.back_btn);
        this.f1047a = button;
        button.setOnClickListener(this);
        this.f1048b = (RelativeLayout) findViewById(R.id.main_bg);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.playmp4_video);
        this.c = relativeLayout;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = (b.c.a.a.d.b.i * 9) / 16;
        this.d = layoutParams;
        int i2 = b.c.a.a.d.b.h;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, (i2 * 9) / 16);
        this.e = layoutParams2;
        layoutParams2.addRule(13);
        this.c.setLayoutParams(this.d);
        this.c.setOnClickListener(this);
        this.h = (RelativeLayout) findViewById(R.id.top_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.playmp4_ctl);
        this.i = linearLayout;
        this.g = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        this.f = new RelativeLayout.LayoutParams(-1, (int) getResources().getDimension(R.dimen.video_lanopt_bg_height));
        int dimension = (int) getResources().getDimension(R.dimen.playmp4_ctlbtn_margin);
        RelativeLayout.LayoutParams layoutParams3 = this.f;
        layoutParams3.bottomMargin = dimension;
        layoutParams3.leftMargin = dimension;
        layoutParams3.rightMargin = dimension;
        layoutParams3.addRule(12);
        this.j = (TextView) findViewById(R.id.playmp4_ctl_left_text);
        this.k = (TextView) findViewById(R.id.playmp4_ctl_left_text2);
        this.l = (TextView) findViewById(R.id.playmp4_ctl_right_text);
        this.m = (TextView) findViewById(R.id.playmp4_ctl_right_text2);
        this.n = (TextView) findViewById(R.id.playmp4_ctl_right_tips);
        this.n.setText(String.format(getResources().getString(R.string.playmp4_has_dl), new Object[]{Double.valueOf(0.0d)}));
        ImageButton imageButton = (ImageButton) findViewById(R.id.playmp4_ctl_btn_mid_por);
        this.o = imageButton;
        imageButton.setOnClickListener(this);
        this.w = (LinearLayout) findViewById(R.id.playmp4_ctl_right_tips_ll);
        this.x = (LinearLayout) findViewById(R.id.playmp4_ctl_right_tips_ll2);
        if (X1PlayMp4Activity.o(this)) {
            this.p = false;
            C();
        }
    }

    private void M() {
        c0.a(0, "X1PlayDevMp4Activity", "midBtnOpt()");
        if (this.s) {
            Y();
        } else if (this.q.isPlaying()) {
            N();
        } else {
            O();
        }
    }

    private void N() {
        this.q.pause();
        this.o.setBackgroundResource(R.drawable.playmp4_por_midbtn_0_selector);
    }

    private void O() {
        this.q.start();
        this.o.setBackgroundResource(R.drawable.playmp4_por_midbtn_1_selector);
    }

    private void P() {
        c0.a(0, "X1PlayDevMp4Activity", "playLocalVideo()");
        this.H = true;
        this.F = false;
        this.E = true;
        this.q.setVideoPath(this.A);
        O();
        this.q.seekTo(this.B);
        this.J.sendEmptyMessage(0);
    }

    /* access modifiers changed from: private */
    public void Q() {
        c0.a(0, "X1PlayDevMp4Activity", "refreshVideoDuration()");
        if (this.q.isPlaying()) {
            int duration = this.q.getDuration();
            this.r.setMax(duration);
            this.B = this.q.getCurrentPosition();
            this.l.setText(a0(duration));
            this.m.setText(a0(duration));
            this.j.setText(a0(this.B));
            this.k.setText(a0(this.B));
            this.r.setProgress(this.B);
        }
    }

    private void R() {
        b.c.a.a.d.c cVar = new b.c.a.a.d.c(this);
        this.K = cVar;
        cVar.b(new d(this));
        this.K.c();
    }

    private void S() {
        c0.a(0, "X1PlayDevMp4Activity", "registerWiFiConnectReceiver()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.y == null) {
            this.y = new e(this, (a) null);
        }
        registerReceiver(this.y, intentFilter);
    }

    /* access modifiers changed from: private */
    public void T() {
        c0.a(0, "X1PlayDevMp4Activity", "resetPlayer()");
        this.r.setProgress(0);
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.j.setText(a0(0));
        this.k.setText(a0(this.B));
        this.o.setBackgroundResource(R.drawable.playmp4_por_midbtn_0_selector);
        this.s = true;
    }

    private void U() {
        c0.a(0, "X1PlayDevMp4Activity", "sendCmdStartPerView ()");
        G(1816, 1);
    }

    private void V() {
        c0.a(0, "X1PlayDevMp4Activity", "sendCmdStopPreView ()");
        G(1816, 0);
    }

    /* access modifiers changed from: private */
    public void W() {
        this.J.post(new a());
    }

    private void X() {
        c0.a(0, "X1PlayDevMp4Activity", "startDownloadAndPlayVideo()");
        String str = this.A;
        if (str == null || "".equals(str)) {
            c0.a(3, "X1PlayDevMp4Activity", "startDownloadAndPlayVideo() dlLocUrl is null!");
            return;
        }
        String str2 = this.z;
        if (str2 == null || "".equals(str2)) {
            c0.a(3, "X1PlayDevMp4Activity", "startDownloadAndPlayVideo() remoteUrl is null!");
            return;
        }
        this.H = false;
        new Thread(new b()).start();
    }

    /* access modifiers changed from: private */
    public void Y() {
        this.f1047a.setText(this.u);
        String E2 = E(this.u);
        if (!"".equals(E2) || !this.t.contains("http://")) {
            c0.a(0, "X1PlayDevMp4Activity", "initPlayer() " + this.u + " is in local");
            this.A = E2;
            if (E2.equals("")) {
                this.A = this.t;
            }
            P();
        } else {
            c0.a(0, "X1PlayDevMp4Activity", "initPlayer() " + this.u + " haven't downlaod!");
            this.z = this.t;
            this.A = b.c.a.a.d.b.g + "/" + this.u;
            X();
        }
        this.s = false;
    }

    private void Z() {
        c0.a(0, "X1PlayDevMp4Activity", "stopVideo()");
        this.G = true;
        if (this.q.isPlaying()) {
            N();
            this.J.removeMessages(4);
        }
        this.J.removeMessages(0);
    }

    private void b0(boolean z2) {
        c0.a(0, "X1PlayDevMp4Activity", "totalStopVideo()");
        Z();
        if (!b.c.a.a.d.b.p) {
            U();
        }
        if (z2) {
            this.J.sendEmptyMessageDelayed(1, 500);
        }
    }

    static /* synthetic */ int c() {
        int i2 = L;
        L = i2 + 1;
        return i2;
    }

    static /* synthetic */ long t(X1PlayDevMp4Activity x1PlayDevMp4Activity, long j2) {
        long j3 = x1PlayDevMp4Activity.C + j2;
        x1PlayDevMp4Activity.C = j3;
        return j3;
    }

    static /* synthetic */ long w(X1PlayDevMp4Activity x1PlayDevMp4Activity, long j2) {
        long j3 = x1PlayDevMp4Activity.D + j2;
        x1PlayDevMp4Activity.D = j3;
        return j3;
    }

    public String a0(int i2) {
        int i3 = i2 / 1000;
        int i4 = i3 / 60;
        int i5 = i4 / 60;
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i4 % 60), Integer.valueOf(i3 % 60)});
    }

    public void onClick(View view) {
        RelativeLayout relativeLayout;
        int i2;
        LinearLayout linearLayout;
        int i3;
        switch (view.getId()) {
            case R.id.back_btn /*2131230730*/:
                b0(true);
                return;
            case R.id.playmp4_ctl_btn_mid_lan /*2131230897*/:
            case R.id.playmp4_ctl_btn_mid_por /*2131230898*/:
                M();
                return;
            case R.id.playmp4_video /*2131230911*/:
                if (!this.p) {
                    if (8 == this.h.getVisibility()) {
                        this.h.setVisibility(0);
                        relativeLayout = this.h;
                        i2 = R.anim.push_top_in;
                    } else {
                        this.h.setVisibility(8);
                        relativeLayout = this.h;
                        i2 = R.anim.push_top_out;
                    }
                    relativeLayout.startAnimation(AnimationUtils.loadAnimation(this, i2));
                    if (8 == this.i.getVisibility()) {
                        this.i.setVisibility(0);
                        linearLayout = this.i;
                        i3 = R.anim.push_bottom_in;
                    } else {
                        this.i.setVisibility(8);
                        linearLayout = this.i;
                        i3 = R.anim.push_bottom_out;
                    }
                    linearLayout.startAnimation(AnimationUtils.loadAnimation(this, i3));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        c0.a(0, "X1PlayDevMp4Activity", "onCompletion()");
        if (!this.F) {
            T();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        o.c();
        int i2 = configuration.orientation;
        if (i2 == 2) {
            this.p = false;
            C();
        } else if (i2 == 1) {
            this.p = true;
            D();
        }
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_playdevmp4);
        L();
        J();
        K();
        V();
        I();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        c0.a(0, "X1PlayDevMp4Activity", "onError()");
        if (!this.H) {
            this.F = true;
            this.E = false;
            N();
        } else {
            c0.a(3, "X1PlayDevMp4Activity", "onError() isdownloadend but still error!");
            this.J.sendEmptyMessage(3);
        }
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        return false;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            b0(true);
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        c0.a(0, "X1PlayDevMp4Activity", "onPrepared()");
        this.o.setBackgroundResource(R.drawable.playmp4_por_midbtn_1_selector);
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2) {
            int i3 = 0;
            c0.a(0, "X1PlayDevMp4Activity", "onProgressChanged(fromuser)");
            if (this.B <= i2 && !this.H) {
                long j2 = this.C;
                long j3 = this.D;
                if (j2 < j3) {
                    double d2 = (double) j2;
                    Double.isNaN(d2);
                    double d3 = (double) j3;
                    Double.isNaN(d3);
                    int duration = (int) ((((float) this.q.getDuration()) * ((float) ((d2 * 1.0d) / d3))) - 3000.0f);
                    if (duration > 0) {
                        i3 = duration;
                    }
                    if (i2 > i3) {
                        this.q.seekTo(i3);
                    } else {
                        this.q.seekTo(i2);
                    }
                    if (!this.q.isPlaying()) {
                        O();
                        return;
                    }
                    return;
                }
            }
            this.q.seekTo(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        S();
        b.c.a.a.d.b.z(1);
        R();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        e eVar = this.y;
        if (eVar != null) {
            unregisterReceiver(eVar);
        }
        this.K.d();
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
    }
}
