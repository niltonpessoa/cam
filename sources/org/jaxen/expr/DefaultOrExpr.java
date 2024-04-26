package org.jaxen.expr;

import org.jaxen.Context;
import org.jaxen.Navigator;
import org.jaxen.function.BooleanFunction;

class DefaultOrExpr extends DefaultLogicalExpr {
    public DefaultOrExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    public void accept(Visitor visitor) {
        visitor.visit((LogicalExpr) this);
    }

    public Object evaluate(Context context) {
        Boolean bool = Boolean.TRUE;
        Navigator navigator = context.getNavigator();
        return (!BooleanFunction.evaluate(getLHS().evaluate(context), navigator).booleanValue() && !BooleanFunction.evaluate(getRHS().evaluate(context), navigator).booleanValue()) ? Boolean.FALSE : bool;
    }

    public String getOperator() {
        return "or";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultOrExpr): ");
        stringBuffer.append(getLHS());
        stringBuffer.append(", ");
        stringBuffer.append(getRHS());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
