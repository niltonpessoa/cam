package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;
import org.jaxen.NamedAccessNavigator;

public class IterableAttributeAxis extends IterableAxis {
    public IterableAttributeAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getAttributeAxisIterator(obj);
    }

    public Iterator namedAccessIterator(Object obj, ContextSupport contextSupport, String str, String str2, String str3) {
        return ((NamedAccessNavigator) contextSupport.getNavigator()).getAttributeAxisIterator(obj, str, str2, str3);
    }

    public boolean supportsNamedAccess(ContextSupport contextSupport) {
        return contextSupport.getNavigator() instanceof NamedAccessNavigator;
    }
}
