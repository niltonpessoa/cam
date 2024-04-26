package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;

public class IterableDescendantOrSelfAxis extends IterableAxis {
    public IterableDescendantOrSelfAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getDescendantOrSelfAxisIterator(obj);
    }
}
