package b.a.a.a.o0.r;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

final class d {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, e eVar) {
        Object obj;
        if (eVar.h() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(eVar.h()), i, i2, 33);
        }
        if (eVar.m()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (eVar.n()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (eVar.k()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.c()), i, i2, 33);
        }
        if (eVar.j()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(eVar.b()), i, i2, 33);
        }
        if (eVar.d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(eVar.d()), i, i2, 33);
        }
        if (eVar.i() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(eVar.i()), i, i2, 33);
        }
        int f = eVar.f();
        if (f == 1) {
            obj = new AbsoluteSizeSpan((int) eVar.e(), true);
        } else if (f == 2) {
            obj = new RelativeSizeSpan(eVar.e());
        } else if (f == 3) {
            obj = new RelativeSizeSpan(eVar.e() / 100.0f);
        } else {
            return;
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    public static e d(e eVar, String[] strArr, Map<String, e> map) {
        if (eVar == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (eVar == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (eVar == null && strArr.length > 1) {
            e eVar2 = new e();
            int length = strArr.length;
            while (i < length) {
                eVar2.a(map.get(strArr[i]));
                i++;
            }
            return eVar2;
        } else if (eVar == null || strArr == null || strArr.length != 1) {
            if (!(eVar == null || strArr == null || strArr.length <= 1)) {
                int length2 = strArr.length;
                while (i < length2) {
                    eVar.a(map.get(strArr[i]));
                    i++;
                }
            }
            return eVar;
        } else {
            eVar.a(map.get(strArr[0]));
            return eVar;
        }
    }
}
