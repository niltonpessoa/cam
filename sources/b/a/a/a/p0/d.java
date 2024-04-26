package b.a.a.a.p0;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b.a.a.a.b0;
import b.a.a.a.c0;
import b.a.a.a.n0.m;
import b.a.a.a.n0.n;
import b.a.a.a.p0.e;
import java.util.Arrays;
import java.util.Map;

public abstract class d extends g {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<Map<n, b>> f675a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseBooleanArray f676b = new SparseBooleanArray();
    private int c = 0;

    public static final class a {
        a(int[] iArr, n[] nVarArr, int[] iArr2, int[][][] iArr3, n nVar) {
            int length = nVarArr.length;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final e.a f677a;

        /* renamed from: b  reason: collision with root package name */
        public final int f678b;
        public final int[] c;

        public e a(n nVar) {
            return this.f677a.a(nVar.a(this.f678b), this.c);
        }
    }

    private boolean[] d(b0[] b0VarArr, e[] eVarArr) {
        int length = eVarArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = !this.f676b.get(i) && (b0VarArr[i].g() == 5 || eVarArr[i] != null);
        }
        return zArr;
    }

    private static int e(b0[] b0VarArr, m mVar) {
        int length = b0VarArr.length;
        int i = 0;
        for (int i2 = 0; i2 < b0VarArr.length; i2++) {
            b0 b0Var = b0VarArr[i2];
            for (int i3 = 0; i3 < mVar.f585a; i3++) {
                int a2 = b0Var.a(mVar.a(i3)) & 7;
                if (a2 > i) {
                    if (a2 == 4) {
                        return i2;
                    }
                    length = i2;
                    i = a2;
                }
            }
        }
        return length;
    }

    private static int[] f(b0 b0Var, m mVar) {
        int[] iArr = new int[mVar.f585a];
        for (int i = 0; i < mVar.f585a; i++) {
            iArr[i] = b0Var.a(mVar.a(i));
        }
        return iArr;
    }

    private static int[] g(b0[] b0VarArr) {
        int length = b0VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = b0VarArr[i].s();
        }
        return iArr;
    }

    private static void i(b0[] b0VarArr, n[] nVarArr, int[][][] iArr, c0[] c0VarArr, e[] eVarArr, int i) {
        boolean z;
        if (i != 0) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= b0VarArr.length) {
                    z = true;
                    break;
                }
                int g = b0VarArr[i2].g();
                e eVar = eVarArr[i2];
                if ((g == 1 || g == 2) && eVar != null && j(iArr[i2], nVarArr[i2], eVar)) {
                    if (g == 1) {
                        if (i4 != -1) {
                            break;
                        }
                        i4 = i2;
                    } else if (i3 != -1) {
                        break;
                    } else {
                        i3 = i2;
                    }
                }
                i2++;
            }
            z = false;
            if (!(i4 == -1 || i3 == -1)) {
                z2 = true;
            }
            if (z && z2) {
                c0 c0Var = new c0(i);
                c0VarArr[i4] = c0Var;
                c0VarArr[i3] = c0Var;
            }
        }
    }

    private static boolean j(int[][] iArr, n nVar, e eVar) {
        if (eVar == null) {
            return false;
        }
        int b2 = nVar.b(eVar.a());
        for (int i = 0; i < eVar.e(); i++) {
            if ((iArr[b2][eVar.i(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    public final void b(Object obj) {
        a aVar = (a) obj;
    }

    public final h c(b0[] b0VarArr, n nVar) {
        b0[] b0VarArr2 = b0VarArr;
        n nVar2 = nVar;
        int[] iArr = new int[(b0VarArr2.length + 1)];
        int length = b0VarArr2.length + 1;
        m[][] mVarArr = new m[length][];
        int[][][] iArr2 = new int[(b0VarArr2.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = nVar2.f587a;
            mVarArr[i] = new m[i2];
            iArr2[i] = new int[i2][];
        }
        int[] g = g(b0VarArr);
        for (int i3 = 0; i3 < nVar2.f587a; i3++) {
            m a2 = nVar2.a(i3);
            int e = e(b0VarArr2, a2);
            int[] f = e == b0VarArr2.length ? new int[a2.f585a] : f(b0VarArr2[e], a2);
            int i4 = iArr[e];
            mVarArr[e][i4] = a2;
            iArr2[e][i4] = f;
            iArr[e] = iArr[e] + 1;
        }
        n[] nVarArr = new n[b0VarArr2.length];
        int[] iArr3 = new int[b0VarArr2.length];
        for (int i5 = 0; i5 < b0VarArr2.length; i5++) {
            int i6 = iArr[i5];
            nVarArr[i5] = new n((m[]) Arrays.copyOf(mVarArr[i5], i6));
            iArr2[i5] = (int[][]) Arrays.copyOf(iArr2[i5], i6);
            iArr3[i5] = b0VarArr2[i5].g();
        }
        n nVar3 = new n((m[]) Arrays.copyOf(mVarArr[b0VarArr2.length], iArr[b0VarArr2.length]));
        e[] k = k(b0VarArr2, nVarArr, iArr2);
        int i7 = 0;
        while (true) {
            e eVar = null;
            if (i7 >= b0VarArr2.length) {
                break;
            }
            if (this.f676b.get(i7)) {
                k[i7] = null;
            } else {
                n nVar4 = nVarArr[i7];
                if (h(i7, nVar4)) {
                    b bVar = (b) this.f675a.get(i7).get(nVar4);
                    if (bVar != null) {
                        eVar = bVar.a(nVar4);
                    }
                    k[i7] = eVar;
                }
            }
            i7++;
        }
        boolean[] d = d(b0VarArr2, k);
        a aVar = new a(iArr3, nVarArr, g, iArr2, nVar3);
        c0[] c0VarArr = new c0[b0VarArr2.length];
        for (int i8 = 0; i8 < b0VarArr2.length; i8++) {
            c0VarArr[i8] = d[i8] ? c0.f226b : null;
        }
        i(b0VarArr, nVarArr, iArr2, c0VarArr, k, this.c);
        return new h(nVar, d, new f(k), aVar, c0VarArr);
    }

    public final boolean h(int i, n nVar) {
        Map map = this.f675a.get(i);
        return map != null && map.containsKey(nVar);
    }

    /* access modifiers changed from: protected */
    public abstract e[] k(b0[] b0VarArr, n[] nVarArr, int[][][] iArr);
}
