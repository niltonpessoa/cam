package org.jaxen.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import org.jaxen.JaxenConstants;
import org.jaxen.JaxenException;
import org.jaxen.JaxenRuntimeException;
import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;

public class PrecedingAxisIterator implements Iterator {
    private Iterator ancestorOrSelf;
    private ListIterator childrenOrSelf = JaxenConstants.EMPTY_LIST_ITERATOR;
    private Navigator navigator;
    private Iterator precedingSibling = JaxenConstants.EMPTY_ITERATOR;
    private Stack stack = new Stack();

    public PrecedingAxisIterator(Object obj, Navigator navigator2) {
        this.navigator = navigator2;
        this.ancestorOrSelf = navigator2.getAncestorOrSelfAxisIterator(obj);
    }

    private ListIterator childrenOrSelf(Object obj) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            Iterator childAxisIterator = this.navigator.getChildAxisIterator(obj);
            if (childAxisIterator != null) {
                while (childAxisIterator.hasNext()) {
                    arrayList.add(childAxisIterator.next());
                }
            }
            return arrayList.listIterator(arrayList.size());
        } catch (UnsupportedAxisException e) {
            throw new JaxenRuntimeException((JaxenException) e);
        }
    }

    public boolean hasNext() {
        ListIterator listIterator;
        while (!this.childrenOrSelf.hasPrevious()) {
            try {
                if (this.stack.isEmpty()) {
                    while (!this.precedingSibling.hasNext()) {
                        if (!this.ancestorOrSelf.hasNext()) {
                            return false;
                        }
                        this.precedingSibling = new PrecedingSiblingAxisIterator(this.ancestorOrSelf.next(), this.navigator);
                    }
                    listIterator = childrenOrSelf(this.precedingSibling.next());
                } else {
                    listIterator = (ListIterator) this.stack.pop();
                }
                this.childrenOrSelf = listIterator;
            } catch (UnsupportedAxisException e) {
                throw new JaxenRuntimeException((JaxenException) e);
            }
        }
        return true;
    }

    public Object next() {
        if (hasNext()) {
            while (true) {
                Object previous = this.childrenOrSelf.previous();
                if (!this.childrenOrSelf.hasPrevious()) {
                    return previous;
                }
                this.stack.push(this.childrenOrSelf);
                this.childrenOrSelf = childrenOrSelf(previous);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
