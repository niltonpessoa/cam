package a.b.b.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends h<K, V> implements Map<K, V> {
    f<K, V> h;

    /* renamed from: a.b.b.b.a$a  reason: collision with other inner class name */
    class C0004a extends f<K, V> {
        C0004a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i, int i2) {
            return a.this.f34b[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        public Map<K, V> c() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return a.this.c;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return a.this.f(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return a.this.h(obj);
        }

        /* access modifiers changed from: protected */
        public void g(K k, V v) {
            a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        public void h(int i) {
            a.this.j(i);
        }

        /* access modifiers changed from: protected */
        public V i(int i, V v) {
            return a.this.k(i, v);
        }
    }

    private f<K, V> m() {
        if (this.h == null) {
            this.h = new C0004a();
        }
        return this.h;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return f.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.c + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m().n();
    }
}
