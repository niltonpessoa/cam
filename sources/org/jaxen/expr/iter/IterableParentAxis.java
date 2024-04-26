package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;

public class IterableParentAxis extends IterableAxis {
    public IterableParentAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getParentAxisIterator(obj);
    }
}
