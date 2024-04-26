package com.rp.rptool.util;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f929a = true;

    public static void a(int i, String str, String str2) {
        if (f929a) {
            StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
            String str3 = "Line:" + stackTraceElement.getLineNumber() + " ||" + str2;
            b(str3);
            if (i == 0) {
                Log.d(str, str3);
            } else if (i == 1) {
                Log.i(str, str3);
            } else if (i == 2) {
                Log.w(str, str3);
            } else if (i == 3) {
                Log.e(str, str3);
            }
        }
    }

    public static void b(String str) {
        try {
            File file = new File("/mnt/sdcard/.writeLog.log");
            if (!file.exists()) {
                file.createNewFile();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("-----------" + simpleDateFormat.format(new Date()) + "------------\n");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n");
            stringBuffer.append(sb.toString());
            fileOutputStream.write(stringBuffer.toString().getBytes("utf-8"));
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
