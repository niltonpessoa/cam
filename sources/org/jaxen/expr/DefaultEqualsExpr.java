package org.jaxen.expr;

import org.jaxen.function.NumberFunction;

class DefaultEqualsExpr extends DefaultEqualityExpr {
    public DefaultEqualsExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    public void accept(Visitor visitor) {
        visitor.visit((EqualityExpr) this);
    }

    /* access modifiers changed from: protected */
    public boolean evaluateObjectObject(Object obj, Object obj2) {
        if (!eitherIsNumber(obj, obj2) || (!NumberFunction.isNaN((Double) obj) && !NumberFunction.isNaN((Double) obj2))) {
            return obj.equals(obj2);
        }
        return false;
    }

    public String getOperator() {
        return "=";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultEqualsExpr): ");
        stringBuffer.append(getLHS());
        stringBuffer.append(", ");
        stringBuffer.append(getRHS());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
