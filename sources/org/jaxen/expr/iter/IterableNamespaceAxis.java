package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;

public class IterableNamespaceAxis extends IterableAxis {
    public IterableNamespaceAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getNamespaceAxisIterator(obj);
    }
}
