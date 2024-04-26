package a.b.b.b;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    f<K, V>.b f24a;

    /* renamed from: b  reason: collision with root package name */
    f<K, V>.c f25b;
    f<K, V>.e c;

    final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final int f26a;

        /* renamed from: b  reason: collision with root package name */
        int f27b;
        int c;
        boolean d = false;

        a(int i) {
            this.f26a = i;
            this.f27b = f.this.d();
        }

        public boolean hasNext() {
            return this.c < this.f27b;
        }

        public T next() {
            if (hasNext()) {
                T b2 = f.this.b(this.c, this.f26a);
                this.c++;
                this.d = true;
                return b2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                int i = this.c - 1;
                this.c = i;
                this.f27b--;
                this.d = false;
                f.this.h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            a((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = f.this.d();
            for (Map.Entry entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d != f.this.d();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = f.this.e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return c.b(f.this.b(e, 1), entry.getValue());
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
            return f.k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = f.this.d() - 1; d >= 0; d--) {
                Object b2 = f.this.b(d, 0);
                Object b3 = f.this.b(d, 1);
                i += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = f.this.d() - 1; d >= 0; d--) {
                Object b2 = f.this.b(d, 0);
                i += b2 == null ? 0 : b2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e = f.this.e(obj);
            if (e < 0) {
                return false;
            }
            f.this.h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        int f30a;

        /* renamed from: b  reason: collision with root package name */
        int f31b;
        boolean c = false;

        d() {
            this.f30a = f.this.d() - 1;
            this.f31b = -1;
        }

        public Map.Entry<K, V> a() {
            if (hasNext()) {
                this.f31b++;
                this.c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return c.b(entry.getKey(), f.this.b(this.f31b, 0)) && c.b(entry.getValue(), f.this.b(this.f31b, 1));
            }
        }

        public K getKey() {
            if (this.c) {
                return f.this.b(this.f31b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.c) {
                return f.this.b(this.f31b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f31b < this.f30a;
        }

        public int hashCode() {
            if (this.c) {
                int i = 0;
                Object b2 = f.this.b(this.f31b, 0);
                Object b3 = f.this.b(this.f31b, 1);
                int hashCode = b2 == null ? 0 : b2.hashCode();
                if (b3 != null) {
                    i = b3.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* bridge */ /* synthetic */ Object next() {
            a();
            return this;
        }

        public void remove() {
            if (this.c) {
                f.this.h(this.f31b);
                this.f31b--;
                this.f30a--;
                this.c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.c) {
                return f.this.i(this.f31b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f = f.this.f(obj);
            if (f < 0) {
                return false;
            }
            f.this.h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = f.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(f.this.b(i, 1))) {
                    f.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = f.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(f.this.b(i, 1))) {
                    f.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 1);
        }
    }

    f() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(K k, V v);

    /* access modifiers changed from: protected */
    public abstract void h(int i);

    /* access modifiers changed from: protected */
    public abstract V i(int i, V v);

    public Set<Map.Entry<K, V>> l() {
        if (this.f24a == null) {
            this.f24a = new b();
        }
        return this.f24a;
    }

    public Set<K> m() {
        if (this.f25b == null) {
            this.f25b = new c();
        }
        return this.f25b;
    }

    public Collection<V> n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    public Object[] q(int i) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2);
        }
        for (int i2 = 0; i2 < d2; i2++) {
            tArr[i2] = b(i2, i);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}
