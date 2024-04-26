package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;

public class IterablePrecedingSiblingAxis extends IterableAxis {
    public IterablePrecedingSiblingAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getPrecedingSiblingAxisIterator(obj);
    }
}
