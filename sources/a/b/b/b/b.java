package a.b.b.b;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {
    private static final int[] e = new int[0];
    private static final Object[] f = new Object[0];
    private static Object[] g;
    private static int h;
    private static Object[] i;
    private static int j;

    /* renamed from: a  reason: collision with root package name */
    private int[] f18a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f19b;
    int c;
    private f<E, E> d;

    class a extends f<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i, int i2) {
            return b.this.f19b[i];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.c;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e, E e2) {
            b.this.add(e);
        }

        /* access modifiers changed from: protected */
        public void h(int i) {
            b.this.g(i);
        }

        /* access modifiers changed from: protected */
        public E i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f18a = e;
            this.f19b = f;
        } else {
            a(i2);
        }
        this.c = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = i;
                if (objArr != null) {
                    this.f19b = objArr;
                    i = (Object[]) objArr[0];
                    this.f18a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = g;
                if (objArr2 != null) {
                    this.f19b = objArr2;
                    g = (Object[]) objArr2[0];
                    this.f18a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    h--;
                    return;
                }
            }
        }
        this.f18a = new int[i2];
        this.f19b = new Object[i2];
    }

    private static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (j < 10) {
                    objArr[0] = i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    i = objArr;
                    j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        }
    }

    private f<E, E> d() {
        if (this.d == null) {
            this.d = new a();
        }
        return this.d;
    }

    private int e(Object obj, int i2) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f18a, i3, i2);
        if (a2 < 0 || obj.equals(this.f19b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f18a[i4] == i2) {
            if (obj.equals(this.f19b[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f18a[i5] == i2) {
            if (obj.equals(this.f19b[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    private int f() {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f18a, i2, 0);
        if (a2 < 0 || this.f19b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f18a[i3] == 0) {
            if (this.f19b[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f18a[i4] == 0) {
            if (this.f19b[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = e(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = i3 ^ -1;
        int i5 = this.c;
        int[] iArr = this.f18a;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f19b;
            a(i6);
            int[] iArr2 = this.f18a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f19b, 0, objArr.length);
            }
            c(iArr, objArr, this.c);
        }
        int i7 = this.c;
        if (i4 < i7) {
            int[] iArr3 = this.f18a;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f19b;
            System.arraycopy(objArr2, i4, objArr2, i8, this.c - i4);
        }
        this.f18a[i4] = i2;
        this.f19b[i4] = e2;
        this.c++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        b(this.c + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void b(int i2) {
        int[] iArr = this.f18a;
        if (iArr.length < i2) {
            Object[] objArr = this.f19b;
            a(i2);
            int i3 = this.c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f18a, 0, i3);
                System.arraycopy(objArr, 0, this.f19b, 0, this.c);
            }
            c(iArr, objArr, this.c);
        }
    }

    public void clear() {
        int i2 = this.c;
        if (i2 != 0) {
            c(this.f18a, this.f19b, i2);
            this.f18a = e;
            this.f19b = f;
            this.c = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.c) {
                try {
                    if (!set.contains(h(i2))) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E g(int i2) {
        E[] eArr = this.f19b;
        E e2 = eArr[i2];
        int i3 = this.c;
        if (i3 <= 1) {
            c(this.f18a, eArr, i3);
            this.f18a = e;
            this.f19b = f;
            this.c = 0;
        } else {
            int[] iArr = this.f18a;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.c = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr = this.f19b;
                    System.arraycopy(objArr, i6, objArr, i2, this.c - i2);
                }
                this.f19b[this.c] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                a(i4);
                this.c--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f18a, 0, i2);
                    System.arraycopy(eArr, 0, this.f19b, 0, i2);
                }
                int i7 = this.c;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f18a, i2, i7 - i2);
                    System.arraycopy(eArr, i8, this.f19b, i2, this.c - i2);
                }
            }
        }
        return e2;
    }

    public E h(int i2) {
        return this.f19b[i2];
    }

    public int hashCode() {
        int[] iArr = this.f18a;
        int i2 = this.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        g(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f19b[i2])) {
                g(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.c;
    }

    public Object[] toArray() {
        int i2 = this.c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f19b, 0, objArr, 0, i2);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.c);
        }
        System.arraycopy(this.f19b, 0, tArr, 0, this.c);
        int length = tArr.length;
        int i2 = this.c;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
