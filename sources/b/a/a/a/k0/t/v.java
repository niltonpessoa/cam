package b.a.a.a.k0.t;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import b.a.a.a.k0.e;
import b.a.a.a.k0.f;
import b.a.a.a.k0.g;
import b.a.a.a.k0.k;
import b.a.a.a.k0.l;
import b.a.a.a.k0.t.w;
import b.a.a.a.r0.l;
import b.a.a.a.r0.m;
import b.a.a.a.r0.u;
import b.a.a.a.r0.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class v implements e {
    /* access modifiers changed from: private */
    public static final long m = ((long) w.o("AC-3"));
    /* access modifiers changed from: private */
    public static final long n = ((long) w.o("EAC3"));
    /* access modifiers changed from: private */
    public static final long o = ((long) w.o("HEVC"));
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f468a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<u> f469b;
    private final m c;
    private final SparseIntArray d;
    /* access modifiers changed from: private */
    public final w.c e;
    /* access modifiers changed from: private */
    public final SparseArray<w> f;
    /* access modifiers changed from: private */
    public final SparseBooleanArray g;
    /* access modifiers changed from: private */
    public g h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public boolean j;
    /* access modifiers changed from: private */
    public w k;
    private int l;

    private class a implements r {

        /* renamed from: a  reason: collision with root package name */
        private final l f470a = new l(new byte[4]);

        public a() {
        }

        public void b(u uVar, g gVar, w.d dVar) {
        }

        public void c(m mVar) {
            if (mVar.x() == 0) {
                mVar.K(7);
                int a2 = mVar.a() / 4;
                for (int i = 0; i < a2; i++) {
                    mVar.f(this.f470a, 4);
                    int h = this.f470a.h(16);
                    this.f470a.o(3);
                    if (h == 0) {
                        this.f470a.o(13);
                    } else {
                        int h2 = this.f470a.h(13);
                        v.this.f.put(h2, new s(new b(h2)));
                        v.j(v.this);
                    }
                }
                if (v.this.f468a != 2) {
                    v.this.f.remove(0);
                }
            }
        }
    }

    private class b implements r {

        /* renamed from: a  reason: collision with root package name */
        private final l f472a = new l(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<w> f473b = new SparseArray<>();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int i) {
            this.d = i;
        }

        private w.b a(m mVar, int i) {
            int c2 = mVar.c();
            int i2 = i + c2;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (mVar.c() < i2) {
                int x = mVar.x();
                int c3 = mVar.c() + mVar.x();
                if (x == 5) {
                    long z = mVar.z();
                    if (z != v.m) {
                        if (z != v.n) {
                            if (z == v.o) {
                                i3 = 36;
                            }
                            mVar.K(c3 - mVar.c());
                        }
                        i3 = 135;
                        mVar.K(c3 - mVar.c());
                    }
                } else if (x != 106) {
                    if (x != 122) {
                        if (x == 123) {
                            i3 = 138;
                        } else if (x == 10) {
                            str = mVar.u(3).trim();
                        } else if (x == 89) {
                            arrayList = new ArrayList();
                            while (mVar.c() < c3) {
                                String trim = mVar.u(3).trim();
                                int x2 = mVar.x();
                                byte[] bArr = new byte[4];
                                mVar.g(bArr, 0, 4);
                                arrayList.add(new w.a(trim, x2, bArr));
                            }
                            i3 = 89;
                        }
                        mVar.K(c3 - mVar.c());
                    }
                    i3 = 135;
                    mVar.K(c3 - mVar.c());
                }
                i3 = 129;
                mVar.K(c3 - mVar.c());
            }
            mVar.J(i2);
            return new w.b(i3, str, arrayList, Arrays.copyOfRange(mVar.f734a, c2, i2));
        }

        public void b(u uVar, g gVar, w.d dVar) {
        }

        public void c(m mVar) {
            u uVar;
            m mVar2 = mVar;
            if (mVar.x() == 2) {
                int i = 0;
                if (v.this.f468a == 1 || v.this.f468a == 2 || v.this.i == 1) {
                    uVar = (u) v.this.f469b.get(0);
                } else {
                    uVar = new u(((u) v.this.f469b.get(0)).c());
                    v.this.f469b.add(uVar);
                }
                mVar2.K(2);
                int D = mVar.D();
                int i2 = 5;
                mVar2.K(5);
                mVar2.f(this.f472a, 2);
                int i3 = 4;
                this.f472a.o(4);
                mVar2.K(this.f472a.h(12));
                if (v.this.f468a == 2 && v.this.k == null) {
                    w.b bVar = new w.b(21, (String) null, (List<w.a>) null, new byte[0]);
                    v vVar = v.this;
                    w unused = vVar.k = vVar.e.b(21, bVar);
                    v.this.k.b(uVar, v.this.h, new w.d(D, 21, 8192));
                }
                this.f473b.clear();
                this.c.clear();
                int a2 = mVar.a();
                while (a2 > 0) {
                    mVar2.f(this.f472a, i2);
                    int h = this.f472a.h(8);
                    this.f472a.o(3);
                    int h2 = this.f472a.h(13);
                    this.f472a.o(i3);
                    int h3 = this.f472a.h(12);
                    w.b a3 = a(mVar2, h3);
                    if (h == 6) {
                        h = a3.f476a;
                    }
                    a2 -= h3 + 5;
                    int i4 = v.this.f468a == 2 ? h : h2;
                    if (!v.this.g.get(i4)) {
                        w n = (v.this.f468a == 2 && h == 21) ? v.this.k : v.this.e.b(h, a3);
                        if (v.this.f468a != 2 || h2 < this.c.get(i4, 8192)) {
                            this.c.put(i4, h2);
                            this.f473b.put(i4, n);
                        }
                    }
                    i2 = 5;
                    i3 = 4;
                }
                int size = this.c.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = this.c.keyAt(i5);
                    v.this.g.put(keyAt, true);
                    w valueAt = this.f473b.valueAt(i5);
                    if (valueAt != null) {
                        if (valueAt != v.this.k) {
                            valueAt.b(uVar, v.this.h, new w.d(D, keyAt, 8192));
                        }
                        v.this.f.put(this.c.valueAt(i5), valueAt);
                    }
                }
                if (v.this.f468a != 2) {
                    v.this.f.remove(this.d);
                    v vVar2 = v.this;
                    if (vVar2.f468a != 1) {
                        i = v.this.i - 1;
                    }
                    int unused2 = vVar2.i = i;
                    if (v.this.i == 0) {
                        v.this.h.d();
                    } else {
                        return;
                    }
                } else if (!v.this.j) {
                    v.this.h.d();
                    int unused3 = v.this.i = 0;
                } else {
                    return;
                }
                boolean unused4 = v.this.j = true;
            }
        }
    }

    public v(int i2, int i3) {
        this(i2, new u(0), new e(i3));
    }

    public v(int i2, u uVar, w.c cVar) {
        b.a.a.a.r0.a.e(cVar);
        this.e = cVar;
        this.f468a = i2;
        if (i2 == 1 || i2 == 2) {
            this.f469b = Collections.singletonList(uVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f469b = arrayList;
            arrayList.add(uVar);
        }
        this.c = new m(new byte[9400], 0);
        this.g = new SparseBooleanArray();
        this.f = new SparseArray<>();
        this.d = new SparseIntArray();
        v();
    }

    static /* synthetic */ int j(v vVar) {
        int i2 = vVar.i;
        vVar.i = i2 + 1;
        return i2;
    }

    private void v() {
        this.g.clear();
        this.f.clear();
        SparseArray<w> a2 = this.e.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f.put(a2.keyAt(i2), a2.valueAt(i2));
        }
        this.f.put(0, new s(new a()));
        this.k = null;
    }

    public void a() {
    }

    public void d(g gVar) {
        this.h = gVar;
        gVar.c(new l.b(-9223372036854775807L));
    }

    public void f(long j2, long j3) {
        int size = this.f469b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f469b.get(i2).g();
        }
        this.c.F();
        this.d.clear();
        v();
        this.l = 0;
    }

    public int g(f fVar, k kVar) {
        m mVar = this.c;
        byte[] bArr = mVar.f734a;
        if (9400 - mVar.c() < 188) {
            int a2 = this.c.a();
            if (a2 > 0) {
                System.arraycopy(bArr, this.c.c(), bArr, 0, a2);
            }
            this.c.H(bArr, a2);
        }
        while (this.c.a() < 188) {
            int d2 = this.c.d();
            int a3 = fVar.a(bArr, d2, 9400 - d2);
            if (a3 == -1) {
                return -1;
            }
            this.c.I(d2 + a3);
        }
        int d3 = this.c.d();
        int c2 = this.c.c();
        int i2 = c2;
        while (i2 < d3 && bArr[i2] != 71) {
            i2++;
        }
        this.c.J(i2);
        int i3 = i2 + 188;
        if (i3 > d3) {
            int i4 = this.l + (i2 - c2);
            this.l = i4;
            if (this.f468a != 2 || i4 <= 376) {
                return 0;
            }
            throw new b.a.a.a.u("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.l = 0;
        int i5 = this.c.i();
        if ((8388608 & i5) == 0) {
            boolean z = (4194304 & i5) != 0;
            int i6 = (2096896 & i5) >> 8;
            boolean z2 = (i5 & 32) != 0;
            w wVar = (i5 & 16) != 0 ? this.f.get(i6) : null;
            if (wVar != null) {
                if (this.f468a != 2) {
                    int i7 = i5 & 15;
                    int i8 = this.d.get(i6, i7 - 1);
                    this.d.put(i6, i7);
                    if (i8 != i7) {
                        if (i7 != ((i8 + 1) & 15)) {
                            wVar.a();
                        }
                    }
                }
                if (z2) {
                    this.c.K(this.c.x());
                }
                this.c.I(i3);
                wVar.c(this.c, z);
                this.c.I(d3);
            }
        }
        this.c.J(i3);
        return 0;
    }

    public boolean h(f fVar) {
        byte[] bArr = this.c.f734a;
        fVar.h(bArr, 0, 940);
        int i2 = 0;
        while (i2 < 188) {
            int i3 = 0;
            while (i3 != 5) {
                if (bArr[(i3 * 188) + i2] != 71) {
                    i2++;
                } else {
                    i3++;
                }
            }
            fVar.c(i2);
            return true;
        }
        return false;
    }
}
