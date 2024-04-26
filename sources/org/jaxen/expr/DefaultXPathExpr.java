package org.jaxen.expr;

import java.util.List;
import org.jaxen.Context;

public class DefaultXPathExpr implements XPathExpr {
    private Expr rootExpr;

    public DefaultXPathExpr(Expr expr) {
        this.rootExpr = expr;
    }

    public List asList(Context context) {
        return DefaultExpr.convertToList(getRootExpr().evaluate(context));
    }

    public Expr getRootExpr() {
        return this.rootExpr;
    }

    public String getText() {
        return getRootExpr().getText();
    }

    public void setRootExpr(Expr expr) {
        this.rootExpr = expr;
    }

    public void simplify() {
        setRootExpr(getRootExpr().simplify());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultXPath): ");
        stringBuffer.append(getRootExpr());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
