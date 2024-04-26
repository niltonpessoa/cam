package a.b.b.b;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V> {
    static Object[] d;
    static int e;
    static Object[] f;
    static int g;

    /* renamed from: a  reason: collision with root package name */
    int[] f33a = c.f20a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f34b = c.f21b;
    int c = 0;

    private void a(int i) {
        if (i == 8) {
            synchronized (a.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.f34b = objArr;
                    f = (Object[]) objArr[0];
                    this.f33a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (a.class) {
                Object[] objArr2 = d;
                if (objArr2 != null) {
                    this.f34b = objArr2;
                    d = (Object[]) objArr2[0];
                    this.f33a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
            }
        }
        this.f33a = new int[i];
        this.f34b = new Object[(i << 1)];
    }

    private static int b(int[] iArr, int i, int i2) {
        try {
            return c.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (a.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    public void c(int i) {
        int i2 = this.c;
        int[] iArr = this.f33a;
        if (iArr.length < i) {
            Object[] objArr = this.f34b;
            a(i);
            if (this.c > 0) {
                System.arraycopy(iArr, 0, this.f33a, 0, i2);
                System.arraycopy(objArr, 0, this.f34b, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f33a;
            Object[] objArr = this.f34b;
            this.f33a = c.f20a;
            this.f34b = c.f21b;
            this.c = 0;
            d(iArr, objArr, i);
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f33a, i2, i);
        if (b2 < 0 || obj.equals(this.f34b[b2 << 1])) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f33a[i3] == i) {
            if (obj.equals(this.f34b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b2 - 1;
        while (i4 >= 0 && this.f33a[i4] == i) {
            if (obj.equals(this.f34b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.c) {
                try {
                    Object i2 = i(i);
                    Object l = l(i);
                    Object obj2 = hVar.get(i2);
                    if (l == null) {
                        if (obj2 != null || !hVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!l.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.c) {
                try {
                    Object i4 = i(i3);
                    Object l2 = l(i3);
                    Object obj3 = map.get(i4);
                    if (l2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!l2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int b2 = b(this.f33a, i, 0);
        if (b2 < 0 || this.f34b[b2 << 1] == null) {
            return b2;
        }
        int i2 = b2 + 1;
        while (i2 < i && this.f33a[i2] == 0) {
            if (this.f34b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b2 - 1;
        while (i3 >= 0 && this.f33a[i3] == 0) {
            if (this.f34b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public V get(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return this.f34b[(f2 << 1) + 1];
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int h(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.f34b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f33a;
        Object[] objArr = this.f34b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public K i(int i) {
        return this.f34b[i << 1];
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public V j(int i) {
        V[] vArr = this.f34b;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.c;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.f33a, vArr, i3);
            this.f33a = c.f20a;
            this.f34b = c.f21b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f33a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f34b;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f34b;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                a(i6);
                if (i3 == this.c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f33a, 0, i);
                        System.arraycopy(vArr, 0, this.f34b, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f33a, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f34b, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.c) {
            this.c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f34b;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public V l(int i) {
        return this.f34b[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.c;
        if (k == null) {
            i2 = g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f34b;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.f33a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f34b;
            a(i6);
            if (i3 == this.c) {
                int[] iArr2 = this.f33a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f34b, 0, objArr.length);
                }
                d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f33a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f34b;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.c - i5) << 1);
        }
        int i8 = this.c;
        if (i3 == i8) {
            int[] iArr4 = this.f33a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f34b;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return j(f2);
        }
        return null;
    }

    public int size() {
        return this.c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
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
