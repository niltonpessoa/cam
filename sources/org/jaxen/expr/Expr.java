package org.jaxen.expr;

import java.io.Serializable;
import org.jaxen.Context;

public interface Expr extends Serializable, Visitable {
    Object evaluate(Context context);

    String getText();

    Expr simplify();
}
