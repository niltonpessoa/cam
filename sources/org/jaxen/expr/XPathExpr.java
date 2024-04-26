package org.jaxen.expr;

import java.io.Serializable;
import java.util.List;
import org.jaxen.Context;

public interface XPathExpr extends Serializable {
    List asList(Context context);

    Expr getRootExpr();

    String getText();

    void setRootExpr(Expr expr);

    void simplify();
}
