package com.nostra13.universalimageloader.utils;

import android.util.Log;
import com.nostra13.universalimageloader.core.ImageLoader;

public final class L {
    private static final String LOG_FORMAT = "%1$s\n%2$s";
    private static volatile boolean writeDebugLogs = false;
    private static volatile boolean writeLogs = true;

    private L() {
    }

    public static void d(String str, Object... objArr) {
        if (writeDebugLogs) {
            log(3, (Throwable) null, str, objArr);
        }
    }

    @Deprecated
    public static void disableLogging() {
        writeLogs(false);
    }

    public static void e(String str, Object... objArr) {
        log(6, (Throwable) null, str, objArr);
    }

    public static void e(Throwable th) {
        log(6, th, (String) null, new Object[0]);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        log(6, th, str, objArr);
    }

    @Deprecated
    public static void enableLogging() {
        writeLogs(true);
    }

    public static void i(String str, Object... objArr) {
        log(4, (Throwable) null, str, objArr);
    }

    private static void log(int i, Throwable th, String str, Object... objArr) {
        if (writeLogs) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                if (str == null) {
                    str = th.getMessage();
                }
                str = String.format(LOG_FORMAT, new Object[]{str, Log.getStackTraceString(th)});
            }
            Log.println(i, ImageLoader.TAG, str);
        }
    }

    public static void w(String str, Object... objArr) {
        log(5, (Throwable) null, str, objArr);
    }

    public static void writeDebugLogs(boolean z) {
        writeDebugLogs = z;
    }

    public static void writeLogs(boolean z) {
        writeLogs = z;
    }
}
