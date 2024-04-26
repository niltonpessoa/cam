package org.jaxen.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import org.jaxen.JaxenException;
import org.jaxen.JaxenRuntimeException;
import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;

public class DescendantAxisIterator implements Iterator {
    private Iterator children;
    private Navigator navigator;
    private Stack stack;

    public DescendantAxisIterator(Object obj, Navigator navigator2) {
        this(navigator2, navigator2.getChildAxisIterator(obj));
    }

    public DescendantAxisIterator(Navigator navigator2, Iterator it) {
        this.stack = new Stack();
        this.navigator = navigator2;
        this.children = it;
    }

    public boolean hasNext() {
        while (!this.children.hasNext()) {
            if (this.stack.isEmpty()) {
                return false;
            }
            this.children = (Iterator) this.stack.pop();
        }
        return true;
    }

    public Object next() {
        try {
            if (hasNext()) {
                Object next = this.children.next();
                this.stack.push(this.children);
                this.children = this.navigator.getChildAxisIterator(next);
                return next;
            }
            throw new NoSuchElementException();
        } catch (UnsupportedAxisException e) {
            throw new JaxenRuntimeException((JaxenException) e);
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
