package com.rp.rptool.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

public class e0 {
    private static String j = "RPWifiHelper";
    private static e0 k;

    /* renamed from: a  reason: collision with root package name */
    private boolean f939a = false;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public c f940b = null;
    private WifiManager c = null;
    private Context d = null;
    private String e = null;
    private b f;
    /* access modifiers changed from: private */
    public boolean g = false;
    private int h = -1;
    /* access modifiers changed from: private */
    public Handler i = new a();

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 40961) {
                switch (i) {
                    case 45057:
                        if (e0.this.f940b != null) {
                            e0.this.f940b.b();
                            return;
                        }
                        return;
                    case 45058:
                        if (e0.this.f940b != null) {
                            e0.this.f940b.d();
                            return;
                        }
                        return;
                    case 45059:
                        if (e0.this.f940b != null) {
                            e0.this.f940b.a();
                            return;
                        }
                        return;
                    case 45060:
                        if (e0.this.f940b != null) {
                            e0.this.f940b.e();
                            return;
                        }
                        return;
                    case 45061:
                        if (e0.this.f940b != null) {
                            e0.this.f940b.c();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                boolean unused = e0.this.w();
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                if (!e0.this.g) {
                    e0.this.q();
                    if (e0.this.i()) {
                        e0.this.i.sendEmptyMessage(45061);
                    }
                }
            } else if (!action.equals("android.net.wifi.STATE_CHANGE")) {
                action.equals("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public enum d {
        WIFICIPHER_WEP,
        WIFICIPHER_WPA,
        WIFICIPHER_NOPASS,
        WIFICIPHER_INVALID
    }

    private WifiConfiguration a(String str) {
        for (WifiConfiguration next : this.c.getConfiguredNetworks()) {
            String str2 = next.SSID;
            if (str2.equals("\"" + str + "\"")) {
                return next;
            }
        }
        return null;
    }

    private List<b.c.a.a.c.b> h(WifiManager wifiManager, List<ScanResult> list) {
        boolean z;
        String str;
        if (list == null) {
            c0.a(3, j, "analyzeScanList() scanResults null!");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ScanResult next : list) {
            String str2 = next.SSID;
            if (str2 != null && !"".equals(str2)) {
                String str3 = next.capabilities;
                if (str3.contains(b.c.a.a.c.b.h) || str3.contains(b.c.a.a.c.b.i) || str3.contains(b.c.a.a.c.b.j)) {
                    if (str3.contains(b.c.a.a.c.b.i) || str3.contains(b.c.a.a.c.b.j)) {
                        str3 = b.c.a.a.c.b.l;
                    } else if (str3.contains(b.c.a.a.c.b.h)) {
                        str3 = b.c.a.a.c.b.h;
                    }
                    str = str3;
                    z = true;
                } else {
                    str = b.c.a.a.c.b.k;
                    z = false;
                }
                arrayList.add(new b.c.a.a.c.b(str2, "", WifiManager.calculateSignalLevel(next.level, 3), str, z));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public boolean i() {
        return r() && !m(this.d).equals(this.e);
    }

    private WifiConfiguration j(String str, String str2, d dVar) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = "\"" + str + "\"";
        wifiConfiguration.preSharedKey = "\"" + str2 + "\"";
        wifiConfiguration.hiddenSSID = true;
        wifiConfiguration.allowedAuthAlgorithms.set(0);
        wifiConfiguration.allowedProtocols.set(0);
        wifiConfiguration.allowedProtocols.set(1);
        wifiConfiguration.allowedKeyManagement.set(1);
        wifiConfiguration.allowedKeyManagement.set(2);
        wifiConfiguration.allowedGroupCiphers.set(2);
        wifiConfiguration.allowedGroupCiphers.set(3);
        wifiConfiguration.allowedPairwiseCiphers.set(1);
        wifiConfiguration.allowedPairwiseCiphers.set(2);
        wifiConfiguration.status = 2;
        return wifiConfiguration;
    }

    public static e0 o() {
        if (k == null) {
            k = new e0();
        }
        return k;
    }

    /* access modifiers changed from: private */
    public void q() {
        boolean z = false;
        c0.a(0, j, "initWifiStatus()");
        if (this.c == null) {
            this.c = (WifiManager) this.d.getSystemService("wifi");
        }
        if (this.c.getWifiState() == 3) {
            z = true;
        }
        this.f939a = z;
    }

    private boolean r() {
        if (this.d != null && this.f940b != null && this.c != null) {
            return true;
        }
        c0.a(3, j, "isInitWiFiHelper() RPWifiHelper hasn't init yet!");
        return false;
    }

    private void t() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.f == null) {
            this.f = new b();
        }
        this.d.registerReceiver(this.f, intentFilter);
    }

    private void u() {
        Context context;
        b bVar = this.f;
        if (bVar == null || (context = this.d) == null) {
            c0.a(3, j, "unRegisterReceiver() error!");
        } else {
            context.unregisterReceiver(bVar);
        }
    }

    /* access modifiers changed from: private */
    public boolean w() {
        int i2;
        Handler handler;
        c0.a(0, j, "wifiConnectCheckFinish() ---- ");
        if (!this.g) {
            c0.a(3, j, "wifiConnectCheckFinish() is finish connecting but still has message!");
            if (this.i.hasMessages(2000)) {
                this.i.removeMessages(2000);
            }
            this.i.sendEmptyMessage(45059);
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.d.getSystemService("connectivity")).getActiveNetworkInfo();
        this.e = m(this.d);
        String str = j;
        if (activeNetworkInfo == null) {
            c0.a(3, str, "wifiConnectCheckFinish() error ni == null");
        } else {
            c0.a(0, str, "connected = " + activeNetworkInfo.isConnected() + " connecting state = " + activeNetworkInfo.getState());
        }
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (z) {
            if (this.i.hasMessages(2000)) {
                this.i.removeMessages(2000);
            }
            c0.a(0, j, "checkWifiConnectFinish() connect finish!");
            this.h = -1;
            this.g = false;
            handler = this.i;
            i2 = 45058;
        } else {
            int i3 = this.h + 1;
            this.h = i3;
            if (15 < i3) {
                c0.a(3, j, "wifiConnectCheckFinish() check wifi connect over 15 times");
                if (this.i.hasMessages(2000)) {
                    this.i.removeMessages(2000);
                }
                this.h = -1;
                this.g = false;
                handler = this.i;
                i2 = 45060;
            } else {
                this.i.sendEmptyMessageDelayed(40961, 2000);
                handler = this.i;
                i2 = 45057;
            }
        }
        handler.sendEmptyMessage(i2);
        return z;
    }

    public void k() {
        u();
        this.f940b = null;
        this.d = null;
    }

    public int l(Context context) {
        WifiInfo n = n(context);
        if (n != null) {
            return n.getNetworkId();
        }
        return -1;
    }

    public String m(Context context) {
        WifiInfo n = n(context);
        String ssid = n != null ? n.getSSID() : null;
        return ssid.contains("\"") ? (String) ssid.subSequence(1, ssid.length() - 1) : ssid;
    }

    public WifiInfo n(Context context) {
        return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
    }

    public void p(Context context, c cVar) {
        this.d = context;
        this.f940b = cVar;
        q();
        t();
        this.e = m(context);
    }

    public boolean s() {
        return this.f939a;
    }

    public boolean v(String str, String str2) {
        boolean z;
        this.g = false;
        if (str.equals(m(this.d))) {
            c0.a(1, j, "reconnect wifi to check the key!");
            int l = l(this.d);
            this.c.disableNetwork(l);
            this.c.disconnect();
            this.c.removeNetwork(l);
            this.c.saveConfiguration();
        }
        if (!r()) {
            return false;
        }
        this.g = true;
        if (!this.f939a) {
            x();
        }
        while (this.c.getWifiState() == 2) {
            try {
                Thread.currentThread();
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
        }
        WifiConfiguration a2 = a(str);
        if (a2 == null) {
            z = this.c.enableNetwork(this.c.addNetwork(j(str, str2, d.WIFICIPHER_WPA)), true);
        } else {
            z = this.c.enableNetwork(a2.networkId, true);
        }
        this.i.sendEmptyMessage(40961);
        return z;
    }

    public boolean x() {
        if (!r()) {
            return false;
        }
        if (!this.c.isWifiEnabled()) {
            return this.c.setWifiEnabled(true);
        }
        c0.a(0, j, "wifiOpen() already opened!");
        return true;
    }

    public List<b.c.a.a.c.b> y() {
        if (!r()) {
            return null;
        }
        if (!this.f939a || !this.c.isWifiEnabled()) {
            c0.a(3, j, "wifiScan() WIFI not open !");
            x();
            return null;
        }
        WifiManager wifiManager = this.c;
        if (wifiManager == null) {
            c0.a(3, j, "wifiScan() wifiManager error!");
            return null;
        }
        wifiManager.startScan();
        List<ScanResult> scanResults = this.c.getScanResults();
        if (scanResults != null) {
            return h(this.c, scanResults);
        }
        c0.a(3, j, "wifiScan() scan null scanList!");
        return null;
    }
}
