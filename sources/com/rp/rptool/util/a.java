package com.rp.rptool.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class a {
    private static Map<String, String> a(String str) {
        int indexOf;
        String c = c(str);
        if (c == null || (indexOf = c.indexOf("privateinfo")) == -1) {
            return null;
        }
        String substring = c.substring(indexOf, c.length());
        String[] split = substring.substring(substring.indexOf(123) + 2, substring.indexOf(125)).trim().split(",");
        HashMap hashMap = new HashMap();
        for (String split2 : split) {
            String[] split3 = split2.split("=");
            String trim = split3[0].trim();
            String trim2 = split3[1].trim();
            hashMap.put(trim, trim2.substring(1, trim2.length() - 1));
        }
        String str2 = (String) hashMap.get("producttype");
        d0.t().p().p(str2);
        if (!str2.equals("Dv") && !str2.equals("Dv-Tp")) {
            d0.t().p().n(str2);
        }
        d0.t().p().m((String) hashMap.get("chipid"));
        if ("Sunchip".equals(hashMap.get("manufacturer"))) {
            return hashMap;
        }
        return null;
    }

    public static Map<String, String> b(String str) {
        return a(str);
    }

    public static String c(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile() && file.length() > 0) {
            byte[] bArr = new byte[Long.valueOf(file.length()).intValue()];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            try {
                file.delete();
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }
}
