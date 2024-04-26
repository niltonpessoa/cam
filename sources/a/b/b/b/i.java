package a.b.b.b;

public class i<E> implements Cloneable {
    private static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f35a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f36b;
    private Object[] c;
    private int d;

    public i() {
        this(10);
    }

    public i(int i) {
        this.f35a = false;
        if (i == 0) {
            this.f36b = c.f20a;
            this.c = c.f21b;
        } else {
            int d2 = c.d(i);
            this.f36b = new int[d2];
            this.c = new Object[d2];
        }
        this.d = 0;
    }

    private void d() {
        int i = this.d;
        int[] iArr = this.f36b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f35a = false;
        this.d = i2;
    }

    public void a() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.f35a = false;
    }

    /* renamed from: b */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f36b = (int[]) this.f36b.clone();
            iVar.c = (Object[]) this.c.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f36b
            int r1 = r3.d
            int r4 = a.b.b.b.c.a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.c
            r1 = r0[r4]
            java.lang.Object r2 = e
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f35a = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.b.b.i.c(int):void");
    }

    public E e(int i) {
        return f(i, (Object) null);
    }

    public E f(int i, E e2) {
        int a2 = c.a(this.f36b, this.d, i);
        if (a2 >= 0) {
            E[] eArr = this.c;
            if (eArr[a2] != e) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public int g(int i) {
        if (this.f35a) {
            d();
        }
        return c.a(this.f36b, this.d, i);
    }

    public int h(int i) {
        if (this.f35a) {
            d();
        }
        return this.f36b[i];
    }

    public void i(int i, E e2) {
        int a2 = c.a(this.f36b, this.d, i);
        if (a2 >= 0) {
            this.c[a2] = e2;
            return;
        }
        int i2 = a2 ^ -1;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == e) {
                this.f36b[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f35a && i3 >= this.f36b.length) {
            d();
            i2 = c.a(this.f36b, this.d, i) ^ -1;
        }
        int i4 = this.d;
        if (i4 >= this.f36b.length) {
            int d2 = c.d(i4 + 1);
            int[] iArr = new int[d2];
            Object[] objArr2 = new Object[d2];
            int[] iArr2 = this.f36b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f36b = iArr;
            this.c = objArr2;
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f36b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.d - i2);
        }
        this.f36b[i2] = i;
        this.c[i2] = e2;
        this.d++;
    }

    public void j(int i) {
        c(i);
    }

    public int k() {
        if (this.f35a) {
            d();
        }
        return this.d;
    }

    public E l(int i) {
        if (this.f35a) {
            d();
        }
        return this.c[i];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(h(i));
            sb.append('=');
            Object l = l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
