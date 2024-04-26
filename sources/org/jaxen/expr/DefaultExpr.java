package org.jaxen.expr;

import java.util.Iterator;
import java.util.List;
import org.jaxen.util.SingleObjectIterator;
import org.jaxen.util.SingletonList;

public abstract class DefaultExpr implements Expr {
    public static Iterator convertToIterator(Object obj) {
        return obj instanceof Iterator ? (Iterator) obj : obj instanceof List ? ((List) obj).iterator() : new SingleObjectIterator(obj);
    }

    public static List convertToList(Object obj) {
        return obj instanceof List ? (List) obj : new SingletonList(obj);
    }

    public Expr simplify() {
        return this;
    }
}
