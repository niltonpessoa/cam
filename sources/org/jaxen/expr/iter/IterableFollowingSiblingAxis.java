package org.jaxen.expr.iter;

import java.util.Iterator;
import org.jaxen.ContextSupport;

public class IterableFollowingSiblingAxis extends IterableAxis {
    public IterableFollowingSiblingAxis(int i) {
        super(i);
    }

    public Iterator iterator(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().getFollowingSiblingAxisIterator(obj);
    }
}
