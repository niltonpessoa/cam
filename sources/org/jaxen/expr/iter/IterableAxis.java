package org.jaxen.expr.iter;

import java.io.Serializable;
import java.util.Iterator;
import org.jaxen.ContextSupport;

public abstract class IterableAxis implements Serializable {
    private int value;

    public IterableAxis(int i) {
        this.value = i;
    }

    public abstract Iterator iterator(Object obj, ContextSupport contextSupport);

    public Iterator namedAccessIterator(Object obj, ContextSupport contextSupport, String str, String str2, String str3) {
        throw new UnsupportedOperationException("Named access unsupported");
    }

    public boolean supportsNamedAccess(ContextSupport contextSupport) {
        return false;
    }

    public int value() {
        return this.value;
    }
}
