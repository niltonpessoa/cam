package org.jaxen.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.jaxen.JaxenConstants;
import org.jaxen.Navigator;

public class PrecedingSiblingAxisIterator implements Iterator {
    private Object contextNode;
    private Navigator navigator;
    private Object nextObj;
    private Iterator siblingIter;

    public PrecedingSiblingAxisIterator(Object obj, Navigator navigator2) {
        this.contextNode = obj;
        this.navigator = navigator2;
        init();
        if (this.siblingIter.hasNext()) {
            this.nextObj = this.siblingIter.next();
        }
    }

    private void init() {
        Iterator it;
        Object parentNode = this.navigator.getParentNode(this.contextNode);
        if (parentNode != null) {
            Iterator childAxisIterator = this.navigator.getChildAxisIterator(parentNode);
            LinkedList linkedList = new LinkedList();
            while (childAxisIterator.hasNext()) {
                Object next = childAxisIterator.next();
                if (next.equals(this.contextNode)) {
                    break;
                }
                linkedList.addFirst(next);
            }
            it = linkedList.iterator();
        } else {
            it = JaxenConstants.EMPTY_ITERATOR;
        }
        this.siblingIter = it;
    }

    public boolean hasNext() {
        return this.nextObj != null;
    }

    public Object next() {
        if (hasNext()) {
            Object obj = this.nextObj;
            this.nextObj = this.siblingIter.hasNext() ? this.siblingIter.next() : null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
