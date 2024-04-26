package b.a.a.a.o0.t;

import b.a.a.a.o0.g;
import b.a.a.a.r0.m;
import java.util.regex.Pattern;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f664a = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");

    static {
        Pattern.compile("^NOTE(( |\t).*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void c(m mVar) {
        String k = mVar.k();
        if (k == null || !f664a.matcher(k).matches()) {
            throw new g("Expected WEBVTT. Got " + k);
        }
    }
}
