package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;

public class IterablePrecedingAxis extends IterableAxis {
    public IterablePrecedingAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getPrecedingAxisIterator(obj);
    }
}
