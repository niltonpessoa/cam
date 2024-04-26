package org.jaxen.expr;

import java.util.List;

abstract class DefaultTruthExpr extends DefaultBinaryExpr {
    public DefaultTruthExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    /* access modifiers changed from: protected */
    public boolean bothAreBoolean(Object obj, Object obj2) {
        return (obj instanceof Boolean) && (obj2 instanceof Boolean);
    }

    /* access modifiers changed from: protected */
    public boolean bothAreSets(Object obj, Object obj2) {
        return (obj instanceof List) && (obj2 instanceof List);
    }

    /* access modifiers changed from: protected */
    public boolean eitherIsBoolean(Object obj, Object obj2) {
        return (obj instanceof Boolean) || (obj2 instanceof Boolean);
    }

    /* access modifiers changed from: protected */
    public boolean eitherIsNumber(Object obj, Object obj2) {
        return (obj instanceof Number) || (obj2 instanceof Number);
    }

    /* access modifiers changed from: protected */
    public boolean eitherIsSet(Object obj, Object obj2) {
        return (obj instanceof List) || (obj2 instanceof List);
    }

    /* access modifiers changed from: protected */
    public boolean isBoolean(Object obj) {
        return obj instanceof Boolean;
    }

    /* access modifiers changed from: protected */
    public boolean isNumber(Object obj) {
        return obj instanceof Number;
    }

    /* access modifiers changed from: protected */
    public boolean isSet(Object obj) {
        return obj instanceof List;
    }

    /* access modifiers changed from: protected */
    public boolean isString(Object obj) {
        return obj instanceof String;
    }

    /* access modifiers changed from: protected */
    public boolean setIsEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultTruthExpr): ");
        stringBuffer.append(getLHS());
        stringBuffer.append(", ");
        stringBuffer.append(getRHS());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
