package org.dom4j.tree;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

class ConcurrentReaderHashMap extends AbstractMap implements Map, Cloneable, Serializable {
    public static int DEFAULT_INITIAL_CAPACITY = 32;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final int MINIMUM_CAPACITY = 4;
    protected final BarrierLock barrierLock;
    protected transient int count;
    protected transient Set entrySet;
    protected transient Set keySet;
    protected transient Object lastWrite;
    protected float loadFactor;
    protected transient Entry[] table;
    protected int threshold;
    protected transient Collection values;

    protected static class BarrierLock implements Serializable {
        protected BarrierLock() {
        }
    }

    protected static class Entry implements Map.Entry {
        protected final int hash;
        protected final Object key;
        protected final Entry next;
        protected volatile Object value;

        Entry(int i, Object obj, Object obj2, Entry entry) {
            this.hash = i;
            this.key = obj;
            this.next = entry;
            this.value = obj2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.key.equals(entry.getKey()) && this.value.equals(entry.getValue());
        }

        public Object getKey() {
            return this.key;
        }

        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        public Object setValue(Object obj) {
            Objects.requireNonNull(obj);
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.key);
            stringBuffer.append("=");
            stringBuffer.append(this.value);
            return stringBuffer.toString();
        }
    }

    private class EntrySet extends AbstractSet {
        private EntrySet() {
        }

        public void clear() {
            ConcurrentReaderHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ConcurrentReaderHashMap.this.get(entry.getKey());
            return obj2 != null && obj2.equals(entry.getValue());
        }

        public Iterator iterator() {
            return new HashIterator();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            return ConcurrentReaderHashMap.this.findAndRemoveEntry((Map.Entry) obj);
        }

        public int size() {
            return ConcurrentReaderHashMap.this.size();
        }
    }

    protected class HashIterator implements Iterator, Enumeration {
        protected Object currentKey;
        protected Object currentValue;
        protected Entry entry = null;
        protected int index;
        protected Entry lastReturned = null;
        protected final Entry[] tab;

        protected HashIterator() {
            Entry[] tableForReading = ConcurrentReaderHashMap.this.getTableForReading();
            this.tab = tableForReading;
            this.index = tableForReading.length - 1;
        }

        public boolean hasMoreElements() {
            return hasNext();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ADDED_TO_REGION, LOOP:0: B:0:0x0000->B:13:0x0029, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean hasNext() {
            /*
                r3 = this;
            L_0x0000:
                org.dom4j.tree.ConcurrentReaderHashMap$Entry r0 = r3.entry
                if (r0 == 0) goto L_0x0018
                java.lang.Object r0 = r0.value
                if (r0 == 0) goto L_0x0012
                org.dom4j.tree.ConcurrentReaderHashMap$Entry r1 = r3.entry
                java.lang.Object r1 = r1.key
                r3.currentKey = r1
                r3.currentValue = r0
                r0 = 1
                return r0
            L_0x0012:
                org.dom4j.tree.ConcurrentReaderHashMap$Entry r0 = r3.entry
                org.dom4j.tree.ConcurrentReaderHashMap$Entry r0 = r0.next
            L_0x0016:
                r3.entry = r0
            L_0x0018:
                org.dom4j.tree.ConcurrentReaderHashMap$Entry r0 = r3.entry
                if (r0 != 0) goto L_0x0029
                int r1 = r3.index
                if (r1 < 0) goto L_0x0029
                org.dom4j.tree.ConcurrentReaderHashMap$Entry[] r0 = r3.tab
                int r2 = r1 + -1
                r3.index = r2
                r0 = r0[r1]
                goto L_0x0016
            L_0x0029:
                if (r0 != 0) goto L_0x0000
                r0 = 0
                r3.currentValue = r0
                r3.currentKey = r0
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.HashIterator.hasNext():boolean");
        }

        public Object next() {
            if (this.currentKey != null || hasNext()) {
                Object returnValueOfNext = returnValueOfNext();
                Entry entry2 = this.entry;
                this.lastReturned = entry2;
                this.currentValue = null;
                this.currentKey = null;
                this.entry = entry2.next;
                return returnValueOfNext;
            }
            throw new NoSuchElementException();
        }

        public Object nextElement() {
            return next();
        }

        public void remove() {
            Entry entry2 = this.lastReturned;
            if (entry2 != null) {
                ConcurrentReaderHashMap.this.remove(entry2.key);
                this.lastReturned = null;
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: protected */
        public Object returnValueOfNext() {
            return this.entry;
        }
    }

    protected class KeyIterator extends HashIterator {
        private final /* synthetic */ ConcurrentReaderHashMap this$0;

        protected KeyIterator(ConcurrentReaderHashMap concurrentReaderHashMap) {
            super();
            this.this$0 = concurrentReaderHashMap;
        }

        /* access modifiers changed from: protected */
        public Object returnValueOfNext() {
            return this.currentKey;
        }
    }

    private class KeySet extends AbstractSet {
        private KeySet() {
        }

        public void clear() {
            ConcurrentReaderHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            return ConcurrentReaderHashMap.this.containsKey(obj);
        }

        public Iterator iterator() {
            return new KeyIterator(ConcurrentReaderHashMap.this);
        }

        public boolean remove(Object obj) {
            return ConcurrentReaderHashMap.this.remove(obj) != null;
        }

        public int size() {
            return ConcurrentReaderHashMap.this.size();
        }
    }

    protected class ValueIterator extends HashIterator {
        private final /* synthetic */ ConcurrentReaderHashMap this$0;

        protected ValueIterator(ConcurrentReaderHashMap concurrentReaderHashMap) {
            super();
            this.this$0 = concurrentReaderHashMap;
        }

        /* access modifiers changed from: protected */
        public Object returnValueOfNext() {
            return this.currentValue;
        }
    }

    private class Values extends AbstractCollection {
        private Values() {
        }

        public void clear() {
            ConcurrentReaderHashMap.this.clear();
        }

        public boolean contains(Object obj) {
            return ConcurrentReaderHashMap.this.containsValue(obj);
        }

        public Iterator iterator() {
            return new ValueIterator(ConcurrentReaderHashMap.this);
        }

        public int size() {
            return ConcurrentReaderHashMap.this.size();
        }
    }

    public ConcurrentReaderHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, 0.75f);
    }

    public ConcurrentReaderHashMap(int i) {
        this(i, 0.75f);
    }

    public ConcurrentReaderHashMap(int i, float f) {
        this.barrierLock = new BarrierLock();
        this.keySet = null;
        this.entrySet = null;
        this.values = null;
        if (f > 0.0f) {
            this.loadFactor = f;
            int p2capacity = p2capacity(i);
            this.table = new Entry[p2capacity];
            this.threshold = (int) (((float) p2capacity) * f);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Illegal Load factor: ");
        stringBuffer.append(f);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public ConcurrentReaderHashMap(Map map) {
        this(Math.max(((int) (((float) map.size()) / 0.75f)) + 1, 16), 0.75f);
        putAll(map);
    }

    private static int hash(Object obj) {
        int hashCode = obj.hashCode();
        return ((hashCode << 7) - hashCode) + (hashCode >>> 9) + (hashCode >>> 17);
    }

    private int p2capacity(int i) {
        int i2 = MAXIMUM_CAPACITY;
        if (i <= MAXIMUM_CAPACITY && i >= 0) {
            i2 = 4;
            while (i2 < i) {
                i2 <<= 1;
            }
        }
        return i2;
    }

    private synchronized void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.table = new Entry[objectInputStream.readInt()];
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.table.length);
        objectOutputStream.writeInt(this.count);
        for (int length = this.table.length - 1; length >= 0; length--) {
            for (Entry entry = this.table[length]; entry != null; entry = entry.next) {
                objectOutputStream.writeObject(entry.key);
                objectOutputStream.writeObject(entry.value);
            }
        }
    }

    public synchronized int capacity() {
        return this.table.length;
    }

    public synchronized void clear() {
        Entry[] entryArr = this.table;
        for (int i = 0; i < entryArr.length; i++) {
            for (Entry entry = entryArr[i]; entry != null; entry = entry.next) {
                entry.value = null;
            }
            entryArr[i] = null;
        }
        this.count = 0;
        recordModification(entryArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        throw new java.lang.InternalError();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object clone() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.Object r0 = super.clone()     // Catch:{ CloneNotSupportedException -> 0x0036 }
            org.dom4j.tree.ConcurrentReaderHashMap r0 = (org.dom4j.tree.ConcurrentReaderHashMap) r0     // Catch:{ CloneNotSupportedException -> 0x0036 }
            r1 = 0
            r0.keySet = r1     // Catch:{ CloneNotSupportedException -> 0x0036 }
            r0.entrySet = r1     // Catch:{ CloneNotSupportedException -> 0x0036 }
            r0.values = r1     // Catch:{ CloneNotSupportedException -> 0x0036 }
            org.dom4j.tree.ConcurrentReaderHashMap$Entry[] r2 = r11.table     // Catch:{ CloneNotSupportedException -> 0x0036 }
            int r3 = r2.length     // Catch:{ CloneNotSupportedException -> 0x0036 }
            org.dom4j.tree.ConcurrentReaderHashMap$Entry[] r3 = new org.dom4j.tree.ConcurrentReaderHashMap.Entry[r3]     // Catch:{ CloneNotSupportedException -> 0x0036 }
            r0.table = r3     // Catch:{ CloneNotSupportedException -> 0x0036 }
            r4 = 0
        L_0x0016:
            int r5 = r2.length     // Catch:{ CloneNotSupportedException -> 0x0036 }
            if (r4 >= r5) goto L_0x0032
            r5 = r2[r4]     // Catch:{ CloneNotSupportedException -> 0x0036 }
            r6 = r1
        L_0x001c:
            if (r5 == 0) goto L_0x002d
            org.dom4j.tree.ConcurrentReaderHashMap$Entry r7 = new org.dom4j.tree.ConcurrentReaderHashMap$Entry     // Catch:{ CloneNotSupportedException -> 0x0036 }
            int r8 = r5.hash     // Catch:{ CloneNotSupportedException -> 0x0036 }
            java.lang.Object r9 = r5.key     // Catch:{ CloneNotSupportedException -> 0x0036 }
            java.lang.Object r10 = r5.value     // Catch:{ CloneNotSupportedException -> 0x0036 }
            r7.<init>(r8, r9, r10, r6)     // Catch:{ CloneNotSupportedException -> 0x0036 }
            org.dom4j.tree.ConcurrentReaderHashMap$Entry r5 = r5.next     // Catch:{ CloneNotSupportedException -> 0x0036 }
            r6 = r7
            goto L_0x001c
        L_0x002d:
            r3[r4] = r6     // Catch:{ CloneNotSupportedException -> 0x0036 }
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0032:
            monitor-exit(r11)
            return r0
        L_0x0034:
            r0 = move-exception
            goto L_0x003c
        L_0x0036:
            java.lang.InternalError r0 = new java.lang.InternalError     // Catch:{ all -> 0x0034 }
            r0.<init>()     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x003c:
            monitor-exit(r11)
            goto L_0x003f
        L_0x003e:
            throw r0
        L_0x003f:
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.ConcurrentReaderHashMap.clone():java.lang.Object");
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        Objects.requireNonNull(obj);
        Entry[] tableForReading = getTableForReading();
        for (Entry entry : tableForReading) {
            while (entry != null) {
                if (obj.equals(entry.value)) {
                    return true;
                }
                entry = entry.next;
            }
        }
        return false;
    }

    public Enumeration elements() {
        return new ValueIterator(this);
    }

    public Set entrySet() {
        Set set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet2 = new EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    /* access modifiers changed from: protected */
    public boolean eq(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    public synchronized boolean findAndRemoveEntry(Map.Entry entry) {
        boolean z;
        Object key = entry.getKey();
        Object obj = get(key);
        if (obj == null || !obj.equals(entry.getValue())) {
            z = false;
        } else {
            remove(key);
            z = true;
        }
        return z;
    }

    public Object get(Object obj) {
        int hash = hash(obj);
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & hash;
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (true) {
            if (entry == null) {
                Entry[] tableForReading = getTableForReading();
                if (entryArr == tableForReading && entry2 == entryArr[length]) {
                    return null;
                }
                length = hash & (tableForReading.length - 1);
                entry2 = tableForReading[length];
                entryArr = tableForReading;
            } else if (entry.hash != hash || !eq(obj, entry.key)) {
                entry = entry.next;
            } else {
                Object obj2 = entry.value;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (this) {
                    entryArr = this.table;
                }
                length = (entryArr.length - 1) & hash;
                entry2 = entryArr[length];
            }
            entry = entry2;
        }
        while (true) {
        }
    }

    /* access modifiers changed from: protected */
    public final Entry[] getTableForReading() {
        Entry[] entryArr;
        synchronized (this.barrierLock) {
            entryArr = this.table;
        }
        return entryArr;
    }

    public synchronized boolean isEmpty() {
        return this.count == 0;
    }

    public Set keySet() {
        Set set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet2 = new KeySet();
        this.keySet = keySet2;
        return keySet2;
    }

    public Enumeration keys() {
        return new KeyIterator(this);
    }

    public float loadFactor() {
        return this.loadFactor;
    }

    public Object put(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        int hash = hash(obj);
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & hash;
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (entry2 != null && (entry2.hash != hash || !eq(obj, entry2.key))) {
            entry2 = entry2.next;
        }
        synchronized (this) {
            if (entryArr == this.table) {
                if (entry2 != null) {
                    Object obj3 = entry2.value;
                    if (entry == entryArr[length] && obj3 != null) {
                        entry2.value = obj2;
                        return obj3;
                    }
                } else if (entry == entryArr[length]) {
                    Entry entry3 = new Entry(hash, obj, obj2, entry);
                    entryArr[length] = entry3;
                    int i = this.count + 1;
                    this.count = i;
                    if (i >= this.threshold) {
                        rehash();
                    } else {
                        recordModification(entry3);
                    }
                    return null;
                }
            }
            Object sput = sput(obj, obj2, hash);
            return sput;
        }
    }

    public synchronized void putAll(Map map) {
        int size = map.size();
        if (size != 0) {
            while (size >= this.threshold) {
                rehash();
            }
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void recordModification(Object obj) {
        synchronized (this.barrierLock) {
            this.lastWrite = obj;
        }
    }

    /* access modifiers changed from: protected */
    public void rehash() {
        if (r1 >= MAXIMUM_CAPACITY) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i = r1 << 1;
        int i2 = i - 1;
        this.threshold = (int) (((float) i) * this.loadFactor);
        Entry[] entryArr = new Entry[i];
        for (Entry entry : this.table) {
            if (entry != null) {
                int i3 = entry.hash & i2;
                Entry entry2 = entry.next;
                if (entry2 == null) {
                    entryArr[i3] = entry;
                } else {
                    Entry entry3 = entry;
                    while (entry2 != null) {
                        int i4 = entry2.hash & i2;
                        if (i4 != i3) {
                            entry3 = entry2;
                            i3 = i4;
                        }
                        entry2 = entry2.next;
                    }
                    entryArr[i3] = entry3;
                    while (entry != entry3) {
                        int i5 = entry.hash;
                        int i6 = i5 & i2;
                        entryArr[i6] = new Entry(i5, entry.key, entry.value, entryArr[i6]);
                        entry = entry.next;
                    }
                }
            }
        }
        this.table = entryArr;
        recordModification(entryArr);
    }

    public Object remove(Object obj) {
        int hash = hash(obj);
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & hash;
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (entry2 != null && (entry2.hash != hash || !eq(obj, entry2.key))) {
            entry2 = entry2.next;
        }
        synchronized (this) {
            if (entryArr == this.table) {
                if (entry2 != null) {
                    Object obj2 = entry2.value;
                    if (entry == entryArr[length] && obj2 != null) {
                        entry2.value = null;
                        this.count--;
                        Entry entry3 = entry2.next;
                        while (entry != entry2) {
                            Entry entry4 = new Entry(entry.hash, entry.key, entry.value, entry3);
                            entry = entry.next;
                            entry3 = entry4;
                        }
                        entryArr[length] = entry3;
                        recordModification(entry3);
                        return obj2;
                    }
                } else if (entry == entryArr[length]) {
                    return null;
                }
            }
            Object sremove = sremove(obj, hash);
            return sremove;
        }
    }

    public synchronized int size() {
        return this.count;
    }

    /* access modifiers changed from: protected */
    public Object sput(Object obj, Object obj2, int i) {
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & i;
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (entry2 != null) {
            if (entry2.hash != i || !eq(obj, entry2.key)) {
                entry2 = entry2.next;
            } else {
                Object obj3 = entry2.value;
                entry2.value = obj2;
                return obj3;
            }
        }
        Entry entry3 = new Entry(i, obj, obj2, entry);
        entryArr[length] = entry3;
        int i2 = this.count + 1;
        this.count = i2;
        if (i2 >= this.threshold) {
            rehash();
            return null;
        }
        recordModification(entry3);
        return null;
    }

    /* access modifiers changed from: protected */
    public Object sremove(Object obj, int i) {
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & i;
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (entry2 != null) {
            if (entry2.hash != i || !eq(obj, entry2.key)) {
                entry2 = entry2.next;
            } else {
                Object obj2 = entry2.value;
                entry2.value = null;
                this.count--;
                Entry entry3 = entry2.next;
                while (entry != entry2) {
                    Entry entry4 = new Entry(entry.hash, entry.key, entry.value, entry3);
                    entry = entry.next;
                    entry3 = entry4;
                }
                entryArr[length] = entry3;
                recordModification(entry3);
                return obj2;
            }
        }
        return null;
    }

    public Collection values() {
        Collection collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values2 = new Values();
        this.values = values2;
        return values2;
    }
}
