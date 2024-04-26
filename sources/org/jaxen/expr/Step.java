package org.jaxen.expr;

import java.util.Iterator;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.ContextSupport;

public interface Step extends Predicated, Visitable {
    Iterator axisIterator(Object obj, ContextSupport contextSupport);

    List evaluate(Context context);

    int getAxis();

    String getText();

    boolean matches(Object obj, ContextSupport contextSupport);

    void simplify();
}
