package org.jaxen.expr;

import org.jaxen.Context;

class DefaultNumberExpr extends DefaultExpr implements NumberExpr {
    private Number number;

    public DefaultNumberExpr(Number number2) {
        this.number = number2;
    }

    public void accept(Visitor visitor) {
        visitor.visit((NumberExpr) this);
    }

    public Object evaluate(Context context) {
        return getNumber();
    }

    public Number getNumber() {
        return this.number;
    }

    public String getText() {
        return getNumber().toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultNumberExpr): ");
        stringBuffer.append(getNumber());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
