package org.jaxen.expr;

import java.io.Serializable;
import org.jaxen.Context;

public interface Predicate extends Serializable, Visitable {
    Object evaluate(Context context);

    Expr getExpr();

    String getText();

    void setExpr(Expr expr);

    void simplify();
}
