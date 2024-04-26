package a.a.a.b;

import a.a.a.b.b;
import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {
    private HashMap<K, b.d<K, V>> e = new HashMap<>();

    /* access modifiers changed from: protected */
    public b.d<K, V> c(K k) {
        return this.e.get(k);
    }

    public boolean contains(K k) {
        return this.e.containsKey(k);
    }

    public V g(K k, V v) {
        b.d c = c(k);
        if (c != null) {
            return c.f7b;
        }
        this.e.put(k, f(k, v));
        return null;
    }

    public V h(K k) {
        V h = super.h(k);
        this.e.remove(k);
        return h;
    }

    public Map.Entry<K, V> i(K k) {
        if (contains(k)) {
            return this.e.get(k).d;
        }
        return null;
    }
}
