package org.jaxen.expr;

import org.jaxen.Context;

public interface FilterExpr extends Expr, Predicated {
    boolean asBoolean(Context context);

    Expr getExpr();
}
