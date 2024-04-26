package b.a.a.a.k0.o;

import b.a.a.a.k0.n;
import b.a.a.a.r0.m;
import b.a.a.a.u;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    private long f332b = -9223372036854775807L;

    public c() {
        super((n) null);
    }

    private static Boolean e(m mVar) {
        boolean z = true;
        if (mVar.x() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Object f(m mVar, int i) {
        if (i == 0) {
            return h(mVar);
        }
        if (i == 1) {
            return e(mVar);
        }
        if (i == 2) {
            return l(mVar);
        }
        if (i == 3) {
            return j(mVar);
        }
        if (i == 8) {
            return i(mVar);
        }
        if (i == 10) {
            return k(mVar);
        }
        if (i != 11) {
            return null;
        }
        return g(mVar);
    }

    private static Date g(m mVar) {
        Date date = new Date((long) h(mVar).doubleValue());
        mVar.K(2);
        return date;
    }

    private static Double h(m mVar) {
        return Double.valueOf(Double.longBitsToDouble(mVar.q()));
    }

    private static HashMap<String, Object> i(m mVar) {
        int B = mVar.B();
        HashMap<String, Object> hashMap = new HashMap<>(B);
        for (int i = 0; i < B; i++) {
            hashMap.put(l(mVar), f(mVar, m(mVar)));
        }
        return hashMap;
    }

    private static HashMap<String, Object> j(m mVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String l = l(mVar);
            int m = m(mVar);
            if (m == 9) {
                return hashMap;
            }
            hashMap.put(l, f(mVar, m));
        }
    }

    private static ArrayList<Object> k(m mVar) {
        int B = mVar.B();
        ArrayList<Object> arrayList = new ArrayList<>(B);
        for (int i = 0; i < B; i++) {
            arrayList.add(f(mVar, m(mVar)));
        }
        return arrayList;
    }

    private static String l(m mVar) {
        int D = mVar.D();
        int c = mVar.c();
        mVar.K(D);
        return new String(mVar.f734a, c, D);
    }

    private static int m(m mVar) {
        return mVar.x();
    }

    /* access modifiers changed from: protected */
    public boolean b(m mVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void c(m mVar, long j) {
        if (m(mVar) != 2) {
            throw new u();
        } else if ("onMetaData".equals(l(mVar)) && m(mVar) == 8) {
            HashMap<String, Object> i = i(mVar);
            if (i.containsKey("duration")) {
                double doubleValue = ((Double) i.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f332b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    public long d() {
        return this.f332b;
    }
}
