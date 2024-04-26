package org.jaxen.expr;

import org.jaxen.Context;
import org.jaxen.Navigator;
import org.jaxen.function.BooleanFunction;

class DefaultAndExpr extends DefaultLogicalExpr {
    public DefaultAndExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    public void accept(Visitor visitor) {
        visitor.visit((LogicalExpr) this);
    }

    public Object evaluate(Context context) {
        Boolean bool = Boolean.FALSE;
        Navigator navigator = context.getNavigator();
        return (BooleanFunction.evaluate(getLHS().evaluate(context), navigator).booleanValue() && BooleanFunction.evaluate(getRHS().evaluate(context), navigator).booleanValue()) ? Boolean.TRUE : bool;
    }

    public String getOperator() {
        return "and";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultAndExpr): ");
        stringBuffer.append(getLHS());
        stringBuffer.append(", ");
        stringBuffer.append(getRHS());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
