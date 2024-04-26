package com.rp.rptool.util;

import android.os.Handler;
import android.os.Process;

public class f0 {

    class a implements Runnable {
        a() {
        }

        public void run() {
            Process.killProcess(Process.myPid());
        }
    }

    public static void a(int i) {
        new Handler().postDelayed(new a(), (long) (i * 100));
    }

    public static void b(Object obj) {
        v.j = obj;
        v.st(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.Object r5) {
        /*
            java.lang.Object r0 = com.rp.rptool.util.v.j
            java.lang.String r1 = "error"
            if (r0 != 0) goto L_0x0011
            java.lang.String r5 = "please init application / activity first!"
            android.util.Log.e(r1, r5)
            r5 = 30
            a(r5)
            return
        L_0x0011:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "Application"
            boolean r3 = r0.contains(r2)
            java.lang.String r4 = "Activity"
            if (r3 != 0) goto L_0x002f
            boolean r3 = r0.contains(r4)
            if (r3 != 0) goto L_0x002f
            java.lang.String r5 = "please rename your application or acitivty like 'xxxActivity' or 'xxxApplication' "
            android.util.Log.e(r1, r5)
            return
        L_0x002f:
            boolean r2 = r0.contains(r2)
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0042
            android.app.Application r5 = (android.app.Application) r5
            java.lang.String r3 = r5.getPackageName()
        L_0x003d:
            java.lang.String r5 = com.rp.rptool.util.v.it(r3)
            goto L_0x0050
        L_0x0042:
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x004f
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r3 = r5.getPackageName()
            goto L_0x003d
        L_0x004f:
            r5 = r3
        L_0x0050:
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto L_0x0062
            android.util.Log.e(r1, r5)
            android.util.Log.e(r1, r5)
            r5 = 10
            a(r5)
            goto L_0x006b
        L_0x0062:
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x006b
            android.util.Log.d(r1, r5)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rp.rptool.util.f0.c(java.lang.Object):void");
    }
}
