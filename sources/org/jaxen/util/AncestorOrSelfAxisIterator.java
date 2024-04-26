package org.jaxen.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jaxen.JaxenException;
import org.jaxen.JaxenRuntimeException;
import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;

public class AncestorOrSelfAxisIterator implements Iterator {
    private Object contextNode;
    private Navigator navigator;

    public AncestorOrSelfAxisIterator(Object obj, Navigator navigator2) {
        this.contextNode = obj;
        this.navigator = navigator2;
    }

    public boolean hasNext() {
        return this.contextNode != null;
    }

    public Object next() {
        try {
            if (hasNext()) {
                Object obj = this.contextNode;
                this.contextNode = this.navigator.getParentNode(obj);
                return obj;
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
