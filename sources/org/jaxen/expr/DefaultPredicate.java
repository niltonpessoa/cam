package org.jaxen.expr;

import org.jaxen.Context;

class DefaultPredicate implements Predicate {
    private Expr expr;

    public DefaultPredicate(Expr expr2) {
        setExpr(expr2);
    }

    public void accept(Visitor visitor) {
        visitor.visit((Predicate) this);
    }

    public Object evaluate(Context context) {
        return getExpr().evaluate(context);
    }

    public Expr getExpr() {
        return this.expr;
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(getExpr().getText());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public void setExpr(Expr expr2) {
        this.expr = expr2;
    }

    public void simplify() {
        setExpr(getExpr().simplify());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultPredicate): ");
        stringBuffer.append(getExpr());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
