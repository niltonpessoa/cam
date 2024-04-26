package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;

public class IterableAncestorOrSelfAxis extends IterableAxis {
    public IterableAncestorOrSelfAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getAncestorOrSelfAxisIterator(obj);
    }
}
