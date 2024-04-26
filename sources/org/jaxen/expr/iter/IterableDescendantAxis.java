package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;

public class IterableDescendantAxis extends IterableAxis {
    public IterableDescendantAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getDescendantAxisIterator(obj);
    }
}
