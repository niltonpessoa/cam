package org.jaxen.expr;

import org.jaxen.Context;
import org.jaxen.function.NumberFunction;

class DefaultPlusExpr extends DefaultAdditiveExpr {
    public DefaultPlusExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    public void accept(Visitor visitor) {
        visitor.visit((AdditiveExpr) this);
    }

    public Object evaluate(Context context) {
        return new Double(NumberFunction.evaluate(getLHS().evaluate(context), context.getNavigator()).doubleValue() + NumberFunction.evaluate(getRHS().evaluate(context), context.getNavigator()).doubleValue());
    }

    public String getOperator() {
        return "+";
    }
}
