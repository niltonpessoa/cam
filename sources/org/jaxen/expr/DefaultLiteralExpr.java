package org.jaxen.expr;

import org.jaxen.Context;

class DefaultLiteralExpr extends DefaultExpr implements LiteralExpr {
    private String literal;

    public DefaultLiteralExpr(String str) {
        this.literal = str;
    }

    public void accept(Visitor visitor) {
        visitor.visit((LiteralExpr) this);
    }

    public Object evaluate(Context context) {
        return getLiteral();
    }

    public String getLiteral() {
        return this.literal;
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        stringBuffer.append(getLiteral());
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultLiteralExpr): ");
        stringBuffer.append(getLiteral());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
