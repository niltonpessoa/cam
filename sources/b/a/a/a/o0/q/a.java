package b.a.a.a.o0.q;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import b.a.a.a.o0.b;
import b.a.a.a.o0.c;
import b.a.a.a.r0.h;
import b.a.a.a.r0.m;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends c {
    private static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    private final StringBuilder n = new StringBuilder();

    public a() {
        super("SubripDecoder");
    }

    private static long D(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public b z(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        h hVar = new h();
        m mVar = new m(bArr, i);
        while (true) {
            String k = mVar.k();
            if (k == null) {
                break;
            } else if (k.length() != 0) {
                try {
                    Integer.parseInt(k);
                    k = mVar.k();
                    if (k == null) {
                        Log.w("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = o.matcher(k);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        hVar.a(D(matcher, 1));
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            hVar.a(D(matcher, 6));
                        } else {
                            z2 = false;
                        }
                        this.n.setLength(0);
                        while (true) {
                            String k2 = mVar.k();
                            if (TextUtils.isEmpty(k2)) {
                                break;
                            }
                            if (this.n.length() > 0) {
                                this.n.append("<br>");
                            }
                            this.n.append(k2.trim());
                        }
                        arrayList.add(new b(Html.fromHtml(this.n.toString())));
                        if (z2) {
                            arrayList.add((Object) null);
                        }
                    } else {
                        sb = new StringBuilder();
                        str = "Skipping invalid timing: ";
                        sb.append(str);
                        sb.append(k);
                        Log.w("SubripDecoder", sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
            }
        }
        b[] bVarArr = new b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new b(bVarArr, hVar.d());
    }
}
