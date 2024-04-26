package a.a.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public d<K, V> f4a;

    /* renamed from: b  reason: collision with root package name */
    private d<K, V> f5b;
    private WeakHashMap<g<K, V>, Boolean> c = new WeakHashMap<>();
    private int d = 0;

    /* renamed from: a.a.a.b.b$b  reason: collision with other inner class name */
    static class C0000b<K, V> extends f<K, V> {
        C0000b(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public d<K, V> b(d<K, V> dVar) {
            return dVar.d;
        }

        /* access modifiers changed from: package-private */
        public d<K, V> c(d<K, V> dVar) {
            return dVar.c;
        }
    }

    private static class c<K, V> extends f<K, V> {
        c(d<K, V> dVar, d<K, V> dVar2) {
            super(dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public d<K, V> b(d<K, V> dVar) {
            return dVar.c;
        }

        /* access modifiers changed from: package-private */
        public d<K, V> c(d<K, V> dVar) {
            return dVar.d;
        }
    }

    static class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f6a;

        /* renamed from: b  reason: collision with root package name */
        final V f7b;
        d<K, V> c;
        d<K, V> d;

        d(K k, V v) {
            this.f6a = k;
            this.f7b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f6a.equals(dVar.f6a) && this.f7b.equals(dVar.f7b);
        }

        public K getKey() {
            return this.f6a;
        }

        public V getValue() {
            return this.f7b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f6a + "=" + this.f7b;
        }
    }

    private class e implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private d<K, V> f8a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9b;

        private e() {
            this.f9b = true;
        }

        public void a(d<K, V> dVar) {
            d<K, V> dVar2 = this.f8a;
            if (dVar == dVar2) {
                d<K, V> dVar3 = dVar2.d;
                this.f8a = dVar3;
                this.f9b = dVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            d<K, V> dVar;
            if (this.f9b) {
                this.f9b = false;
                dVar = b.this.f4a;
            } else {
                d<K, V> dVar2 = this.f8a;
                dVar = dVar2 != null ? dVar2.c : null;
            }
            this.f8a = dVar;
            return this.f8a;
        }

        public boolean hasNext() {
            if (this.f9b) {
                return b.this.f4a != null;
            }
            d<K, V> dVar = this.f8a;
            return (dVar == null || dVar.c == null) ? false : true;
        }
    }

    private static abstract class f<K, V> implements Iterator<Map.Entry<K, V>>, g<K, V> {

        /* renamed from: a  reason: collision with root package name */
        d<K, V> f10a;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f11b;

        f(d<K, V> dVar, d<K, V> dVar2) {
            this.f10a = dVar2;
            this.f11b = dVar;
        }

        private d<K, V> e() {
            d<K, V> dVar = this.f11b;
            d<K, V> dVar2 = this.f10a;
            if (dVar == dVar2 || dVar2 == null) {
                return null;
            }
            return c(dVar);
        }

        public void a(d<K, V> dVar) {
            if (this.f10a == dVar && dVar == this.f11b) {
                this.f11b = null;
                this.f10a = null;
            }
            d<K, V> dVar2 = this.f10a;
            if (dVar2 == dVar) {
                this.f10a = b(dVar2);
            }
            if (this.f11b == dVar) {
                this.f11b = e();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract d<K, V> b(d<K, V> dVar);

        /* access modifiers changed from: package-private */
        public abstract d<K, V> c(d<K, V> dVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            d<K, V> dVar = this.f11b;
            this.f11b = e();
            return dVar;
        }

        public boolean hasNext() {
            return this.f11b != null;
        }
    }

    interface g<K, V> {
        void a(d<K, V> dVar);
    }

    public Map.Entry<K, V> b() {
        return this.f4a;
    }

    /* access modifiers changed from: protected */
    public d<K, V> c(K k) {
        d<K, V> dVar = this.f4a;
        while (dVar != null && !dVar.f6a.equals(k)) {
            dVar = dVar.c;
        }
        return dVar;
    }

    public b<K, V>.e d() {
        b<K, V>.e eVar = new e();
        this.c.put(eVar, Boolean.FALSE);
        return eVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        c cVar = new c(this.f5b, this.f4a);
        this.c.put(cVar, Boolean.FALSE);
        return cVar;
    }

    public Map.Entry<K, V> e() {
        return this.f5b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    /* access modifiers changed from: protected */
    public d<K, V> f(K k, V v) {
        d<K, V> dVar = new d<>(k, v);
        this.d++;
        d<K, V> dVar2 = this.f5b;
        if (dVar2 == null) {
            this.f4a = dVar;
        } else {
            dVar2.c = dVar;
            dVar.d = dVar2;
        }
        this.f5b = dVar;
        return dVar;
    }

    public V g(K k, V v) {
        d c2 = c(k);
        if (c2 != null) {
            return c2.f7b;
        }
        f(k, v);
        return null;
    }

    public V h(K k) {
        d c2 = c(k);
        if (c2 == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            for (g<K, V> a2 : this.c.keySet()) {
                a2.a(c2);
            }
        }
        d<K, V> dVar = c2.d;
        d<K, V> dVar2 = c2.c;
        if (dVar != null) {
            dVar.c = dVar2;
        } else {
            this.f4a = dVar2;
        }
        d<K, V> dVar3 = c2.c;
        if (dVar3 != null) {
            dVar3.d = dVar;
        } else {
            this.f5b = dVar;
        }
        c2.c = null;
        c2.d = null;
        return c2.f7b;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C0000b bVar = new C0000b(this.f4a, this.f5b);
        this.c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
