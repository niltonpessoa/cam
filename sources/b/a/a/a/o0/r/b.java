package b.a.a.a.o0.r;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import b.a.a.a.r0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f640a;

    /* renamed from: b  reason: collision with root package name */
    public final String f641b;
    public final boolean c;
    public final long d;
    public final long e;
    public final e f;
    public final String g;
    private final String[] h;
    private final HashMap<String, Integer> i;
    private final HashMap<String, Integer> j;
    private List<b> k;

    private b(String str, String str2, long j2, long j3, e eVar, String[] strArr, String str3) {
        this.f640a = str;
        this.f641b = str2;
        this.f = eVar;
        this.h = strArr;
        this.c = str2 != null;
        this.d = j2;
        this.e = j3;
        a.e(str3);
        this.g = str3;
        this.i = new HashMap<>();
        this.j = new HashMap<>();
    }

    private void b(Map<String, e> map, SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
        e d2;
        if (i2 != i3 && (d2 = d.d(this.f, this.h, map)) != null) {
            d.a(spannableStringBuilder, i2, i3, d2);
        }
    }

    public static b c(String str, long j2, long j3, e eVar, String[] strArr, String str2) {
        return new b(str, (String) null, j2, j3, eVar, strArr, str2);
    }

    public static b d(String str) {
        return new b((String) null, d.b(str), -9223372036854775807L, -9223372036854775807L, (e) null, (String[]) null, "");
    }

    private SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder) {
        int i2;
        int i3;
        int length = spannableStringBuilder.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (spannableStringBuilder.charAt(i5) == ' ') {
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                    i7++;
                }
                int i8 = i7 - i6;
                if (i8 > 0) {
                    spannableStringBuilder.delete(i5, i5 + i8);
                    length -= i8;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i9 = 0;
        while (true) {
            i2 = length - 1;
            if (i9 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i9) == 10) {
                int i10 = i9 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    spannableStringBuilder.delete(i10, i9 + 2);
                    length--;
                }
            }
            i9++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == ' ') {
            spannableStringBuilder.delete(i2, length);
            length--;
        }
        while (true) {
            i3 = length - 1;
            if (i4 >= i3) {
                break;
            }
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i11 = i4 + 1;
                if (spannableStringBuilder.charAt(i11) == 10) {
                    spannableStringBuilder.delete(i4, i11);
                    length--;
                }
            }
            i4++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i3) == 10) {
            spannableStringBuilder.delete(i3, length);
        }
        return spannableStringBuilder;
    }

    private void i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f640a);
        if (z || equals) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.k != null) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                this.k.get(i2).i(treeSet, z || equals);
            }
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    private void m(Map<String, e> map, Map<String, SpannableStringBuilder> map2) {
        for (Map.Entry next : this.j.entrySet()) {
            String str = (String) next.getKey();
            b(map, map2.get(str), this.i.containsKey(str) ? this.i.get(str).intValue() : 0, ((Integer) next.getValue()).intValue());
            for (int i2 = 0; i2 < g(); i2++) {
                f(i2).m(map, map2);
            }
        }
    }

    private void n(long j2, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.i.clear();
        this.j.clear();
        String str2 = this.g;
        if (!"".equals(str2)) {
            str = str2;
        }
        if (this.c && z) {
            k(str, map).append(this.f641b);
        } else if ("br".equals(this.f640a) && z) {
            k(str, map).append(10);
        } else if (!"metadata".equals(this.f640a) && l(j2)) {
            boolean equals = "p".equals(this.f640a);
            for (Map.Entry next : map.entrySet()) {
                this.i.put(next.getKey(), Integer.valueOf(((SpannableStringBuilder) next.getValue()).length()));
            }
            for (int i2 = 0; i2 < g(); i2++) {
                f(i2).n(j2, z || equals, str, map);
            }
            if (equals) {
                d.c(k(str, map));
            }
            for (Map.Entry next2 : map.entrySet()) {
                this.j.put(next2.getKey(), Integer.valueOf(((SpannableStringBuilder) next2.getValue()).length()));
            }
        }
    }

    public void a(b bVar) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(bVar);
    }

    public b f(int i2) {
        List<b> list = this.k;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<b> list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<b.a.a.a.o0.b> h(long j2, Map<String, e> map, Map<String, c> map2) {
        TreeMap treeMap = new TreeMap();
        n(j2, false, this.g, treeMap);
        m(map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            c cVar = map2.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            e(spannableStringBuilder);
            arrayList.add(new b.a.a.a.o0.b(spannableStringBuilder, (Layout.Alignment) null, cVar.c, cVar.d, cVar.e, cVar.f643b, Integer.MIN_VALUE, cVar.f));
        }
        return arrayList;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public boolean l(long j2) {
        long j3 = this.d;
        return (j3 == -9223372036854775807L && this.e == -9223372036854775807L) || (j3 <= j2 && this.e == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < this.e) || (j3 <= j2 && j2 < this.e));
    }
}
