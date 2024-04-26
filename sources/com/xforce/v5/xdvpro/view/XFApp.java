package com.xforce.v5.xdvpro.view;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;

public class XFApp extends Application {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[SYNTHETIC, Splitter:B:18:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(int r5) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x003a }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r3.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch:{ all -> 0x003a }
            r3.append(r5)     // Catch:{ all -> 0x003a }
            java.lang.String r5 = "/cmdline"
            r3.append(r5)     // Catch:{ all -> 0x003a }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x003a }
            r2.<init>(r5)     // Catch:{ all -> 0x003a }
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r5 = r1.readLine()     // Catch:{ all -> 0x0038 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0038 }
            if (r2 != 0) goto L_0x002f
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0038 }
        L_0x002f:
            r1.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0037:
            return r5
        L_0x0038:
            r5 = move-exception
            goto L_0x003c
        L_0x003a:
            r5 = move-exception
            r1 = r0
        L_0x003c:
            r5.printStackTrace()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0049:
            return r0
        L_0x004a:
            r5 = move-exception
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0055:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xforce.v5.xdvpro.view.XFApp.a(int):java.lang.String");
    }

    public Resources getResources() {
        Resources resources = super.getResources();
        Configuration configuration = new Configuration();
        configuration.setToDefaults();
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return resources;
    }

    public void onCreate() {
        super.onCreate();
        getApplicationContext().getPackageName();
        a(Process.myPid());
    }
}
