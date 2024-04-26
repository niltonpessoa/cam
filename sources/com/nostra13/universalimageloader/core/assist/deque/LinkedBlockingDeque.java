package com.nostra13.universalimageloader.core.assist.deque;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LinkedBlockingDeque<E> extends AbstractQueue<E> implements BlockingDeque<E>, Serializable {
    private static final long serialVersionUID = -387911632671998426L;
    private final int capacity;
    private transient int count;
    transient Node<E> first;
    transient Node<E> last;
    final ReentrantLock lock;
    private final Condition notEmpty;
    private final Condition notFull;

    private abstract class AbstractItr implements Iterator<E> {
        private Node<E> lastRet;
        Node<E> next;
        E nextItem;

        AbstractItr() {
            ReentrantLock reentrantLock = LinkedBlockingDeque.this.lock;
            reentrantLock.lock();
            try {
                Node<E> firstNode = firstNode();
                this.next = firstNode;
                this.nextItem = firstNode == null ? null : firstNode.item;
            } finally {
                reentrantLock.unlock();
            }
        }

        private Node<E> succ(Node<E> node) {
            while (true) {
                Node<E> nextNode = nextNode(node);
                if (nextNode == null) {
                    return null;
                }
                if (nextNode.item != null) {
                    return nextNode;
                }
                if (nextNode == node) {
                    return firstNode();
                }
                node = nextNode;
            }
        }

        /* access modifiers changed from: package-private */
        public void advance() {
            ReentrantLock reentrantLock = LinkedBlockingDeque.this.lock;
            reentrantLock.lock();
            try {
                Node<E> succ = succ(this.next);
                this.next = succ;
                this.nextItem = succ == null ? null : succ.item;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract Node<E> firstNode();

        public boolean hasNext() {
            return this.next != null;
        }

        public E next() {
            Node<E> node = this.next;
            if (node != null) {
                this.lastRet = node;
                E e = this.nextItem;
                advance();
                return e;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        public abstract Node<E> nextNode(Node<E> node);

        public void remove() {
            Node<E> node = this.lastRet;
            if (node != null) {
                this.lastRet = null;
                ReentrantLock reentrantLock = LinkedBlockingDeque.this.lock;
                reentrantLock.lock();
                try {
                    if (node.item != null) {
                        LinkedBlockingDeque.this.unlink(node);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private class DescendingItr extends AbstractItr {
        private DescendingItr() {
            super();
        }

        /* access modifiers changed from: package-private */
        public Node<E> firstNode() {
            return LinkedBlockingDeque.this.last;
        }

        /* access modifiers changed from: package-private */
        public Node<E> nextNode(Node<E> node) {
            return node.prev;
        }
    }

    private class Itr extends AbstractItr {
        private Itr() {
            super();
        }

        /* access modifiers changed from: package-private */
        public Node<E> firstNode() {
            return LinkedBlockingDeque.this.first;
        }

        /* access modifiers changed from: package-private */
        public Node<E> nextNode(Node<E> node) {
            return node.next;
        }
    }

    static final class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(E e) {
            this.item = e;
        }
    }

    public LinkedBlockingDeque() {
        this(Integer.MAX_VALUE);
    }

    public LinkedBlockingDeque(int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
        this.notFull = reentrantLock.newCondition();
        if (i > 0) {
            this.capacity = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public LinkedBlockingDeque(Collection<? extends E> collection) {
        this(Integer.MAX_VALUE);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            for (Object next : collection) {
                if (next == null) {
                    throw new NullPointerException();
                } else if (!linkLast(new Node(next))) {
                    throw new IllegalStateException("Deque full");
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private boolean linkFirst(Node<E> node) {
        int i = this.count;
        if (i >= this.capacity) {
            return false;
        }
        Node<E> node2 = this.first;
        node.next = node2;
        this.first = node;
        if (this.last == null) {
            this.last = node;
        } else {
            node2.prev = node;
        }
        this.count = i + 1;
        this.notEmpty.signal();
        return true;
    }

    private boolean linkLast(Node<E> node) {
        int i = this.count;
        if (i >= this.capacity) {
            return false;
        }
        Node<E> node2 = this.last;
        node.prev = node2;
        this.last = node;
        if (this.first == null) {
            this.first = node;
        } else {
            node2.next = node;
        }
        this.count = i + 1;
        this.notEmpty.signal();
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.count = 0;
        this.first = null;
        this.last = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                add(readObject);
            } else {
                return;
            }
        }
    }

    private E unlinkFirst() {
        Node<E> node = this.first;
        if (node == null) {
            return null;
        }
        Node<E> node2 = node.next;
        E e = node.item;
        node.item = null;
        node.next = node;
        this.first = node2;
        if (node2 == null) {
            this.last = null;
        } else {
            node2.prev = null;
        }
        this.count--;
        this.notFull.signal();
        return e;
    }

    private E unlinkLast() {
        Node<E> node = this.last;
        if (node == null) {
            return null;
        }
        Node<E> node2 = node.prev;
        E e = node.item;
        node.item = null;
        node.prev = node;
        this.last = node2;
        if (node2 == null) {
            this.first = null;
        } else {
            node2.next = null;
        }
        this.count--;
        this.notFull.signal();
        return e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (Node<E> node = this.first; node != null; node = node.next) {
                objectOutputStream.writeObject(node.item);
            }
            objectOutputStream.writeObject((Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void addFirst(E e) {
        if (!offerFirst(e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    public void addLast(E e) {
        if (!offerLast(e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    public void clear() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Node<E> node = this.first;
            while (node != null) {
                node.item = null;
                Node<E> node2 = node.next;
                node.prev = null;
                node.next = null;
                node = node2;
            }
            this.last = null;
            this.first = null;
            this.count = 0;
            this.notFull.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            for (Node<E> node = this.first; node != null; node = node.next) {
                if (obj.equals(node.item)) {
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public Iterator<E> descendingIterator() {
        return new DescendingItr();
    }

    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    public int drainTo(Collection<? super E> collection, int i) {
        Objects.requireNonNull(collection);
        if (collection != this) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                int min = Math.min(i, this.count);
                for (int i2 = 0; i2 < min; i2++) {
                    collection.add(this.first.item);
                    unlinkFirst();
                }
                return min;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public E element() {
        return getFirst();
    }

    public E getFirst() {
        E peekFirst = peekFirst();
        if (peekFirst != null) {
            return peekFirst;
        }
        throw new NoSuchElementException();
    }

    public E getLast() {
        E peekLast = peekLast();
        if (peekLast != null) {
            return peekLast;
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new Itr();
    }

    public boolean offer(E e) {
        return offerLast(e);
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) {
        return offerLast(e, j, timeUnit);
    }

    public boolean offerFirst(E e) {
        Objects.requireNonNull(e);
        Node node = new Node(e);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return linkFirst(node);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean offerFirst(E e, long j, TimeUnit timeUnit) {
        boolean z;
        Objects.requireNonNull(e);
        Node node = new Node(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                if (linkFirst(node)) {
                    z = true;
                    break;
                } else if (nanos <= 0) {
                    z = false;
                    break;
                } else {
                    nanos = this.notFull.awaitNanos(nanos);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return z;
    }

    public boolean offerLast(E e) {
        Objects.requireNonNull(e);
        Node node = new Node(e);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return linkLast(node);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean offerLast(E e, long j, TimeUnit timeUnit) {
        boolean z;
        Objects.requireNonNull(e);
        Node node = new Node(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                if (linkLast(node)) {
                    z = true;
                    break;
                } else if (nanos <= 0) {
                    z = false;
                    break;
                } else {
                    nanos = this.notFull.awaitNanos(nanos);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return z;
    }

    public E peek() {
        return peekFirst();
    }

    public E peekFirst() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Node<E> node = this.first;
            return node == null ? null : node.item;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E peekLast() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Node<E> node = this.last;
            return node == null ? null : node.item;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E poll() {
        return pollFirst();
    }

    public E poll(long j, TimeUnit timeUnit) {
        return pollFirst(j, timeUnit);
    }

    public E pollFirst() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return unlinkFirst();
        } finally {
            reentrantLock.unlock();
        }
    }

    public E pollFirst(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                E unlinkFirst = unlinkFirst();
                if (unlinkFirst != null) {
                    reentrantLock.unlock();
                    return unlinkFirst;
                } else if (nanos <= 0) {
                    return null;
                } else {
                    nanos = this.notEmpty.awaitNanos(nanos);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public E pollLast() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return unlinkLast();
        } finally {
            reentrantLock.unlock();
        }
    }

    public E pollLast(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                E unlinkLast = unlinkLast();
                if (unlinkLast != null) {
                    reentrantLock.unlock();
                    return unlinkLast;
                } else if (nanos <= 0) {
                    return null;
                } else {
                    nanos = this.notEmpty.awaitNanos(nanos);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public E pop() {
        return removeFirst();
    }

    public void push(E e) {
        addFirst(e);
    }

    public void put(E e) {
        putLast(e);
    }

    public void putFirst(E e) {
        Objects.requireNonNull(e);
        Node node = new Node(e);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (!linkFirst(node)) {
            try {
                this.notFull.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void putLast(E e) {
        Objects.requireNonNull(e);
        Node node = new Node(e);
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (!linkLast(node)) {
            try {
                this.notFull.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.capacity - this.count;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E remove() {
        return removeFirst();
    }

    public boolean remove(Object obj) {
        return removeFirstOccurrence(obj);
    }

    public E removeFirst() {
        E pollFirst = pollFirst();
        if (pollFirst != null) {
            return pollFirst;
        }
        throw new NoSuchElementException();
    }

    public boolean removeFirstOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            for (Node<E> node = this.first; node != null; node = node.next) {
                if (obj.equals(node.item)) {
                    unlink(node);
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E removeLast() {
        E pollLast = pollLast();
        if (pollLast != null) {
            return pollLast;
        }
        throw new NoSuchElementException();
    }

    public boolean removeLastOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            for (Node<E> node = this.last; node != null; node = node.prev) {
                if (obj.equals(node.item)) {
                    unlink(node);
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int size() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.count;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E take() {
        return takeFirst();
    }

    public E takeFirst() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                E unlinkFirst = unlinkFirst();
                if (unlinkFirst != null) {
                    return unlinkFirst;
                }
                this.notEmpty.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public E takeLast() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                E unlinkLast = unlinkLast();
                if (unlinkLast != null) {
                    return unlinkLast;
                }
                this.notEmpty.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public Object[] toArray() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.count];
            int i = 0;
            Node<E> node = this.first;
            while (node != null) {
                int i2 = i + 1;
                objArr[i] = node.item;
                node = node.next;
                i = i2;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            int length = tArr.length;
            T[] tArr2 = tArr;
            if (length < this.count) {
                tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.count);
            }
            int i = 0;
            Node<E> node = this.first;
            while (node != null) {
                tArr2[i] = node.item;
                node = node.next;
                i++;
            }
            if (tArr2.length > i) {
                tArr2[i] = null;
            }
            return tArr2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Node<E> node = this.first;
            if (node == null) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            while (true) {
                E e = node.item;
                if (e == this) {
                    e = "(this Collection)";
                }
                sb.append(e);
                node = node.next;
                if (node == null) {
                    sb.append(']');
                    String sb2 = sb.toString();
                    reentrantLock.unlock();
                    return sb2;
                }
                sb.append(',');
                sb.append(' ');
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void unlink(Node<E> node) {
        Node<E> node2 = node.prev;
        Node<E> node3 = node.next;
        if (node2 == null) {
            unlinkFirst();
        } else if (node3 == null) {
            unlinkLast();
        } else {
            node2.next = node3;
            node3.prev = node2;
            node.item = null;
            this.count--;
            this.notFull.signal();
        }
    }
}
