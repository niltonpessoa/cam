package b.a.a.a.o0.t;

import android.text.SpannableStringBuilder;
import b.a.a.a.o0.b;
import b.a.a.a.o0.e;
import b.a.a.a.r0.a;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class i implements e {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f665a;

    /* renamed from: b  reason: collision with root package name */
    private final int f666b;
    private final long[] c;
    private final long[] d;

    public i(List<e> list) {
        this.f665a = list;
        int size = list.size();
        this.f666b = size;
        this.c = new long[(size * 2)];
        for (int i = 0; i < this.f666b; i++) {
            e eVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.c;
            jArr[i2] = eVar.m;
            jArr[i2 + 1] = eVar.n;
        }
        long[] jArr2 = this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j) {
        int c2 = w.c(this.d, j, false, false);
        if (c2 < this.d.length) {
            return c2;
        }
        return -1;
    }

    public List<b> b(long j) {
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = null;
        e eVar = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.f666b; i++) {
            long[] jArr = this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                e eVar2 = this.f665a.get(i);
                if (!eVar2.a()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        append = spannableStringBuilder.append(eVar.f596a).append("\n");
                    } else {
                        append = spannableStringBuilder.append("\n");
                    }
                    append.append(eVar2.f596a);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new e(spannableStringBuilder));
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    public long c(int i) {
        boolean z = true;
        a.a(i >= 0);
        if (i >= this.d.length) {
            z = false;
        }
        a.a(z);
        return this.d[i];
    }

    public int d() {
        return this.d.length;
    }
}
