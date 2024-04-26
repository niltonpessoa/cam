package org.jaxen.expr;

class DefaultGreaterThanEqualExpr extends DefaultRelationalExpr {
    public DefaultGreaterThanEqualExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    public void accept(Visitor visitor) {
        visitor.visit((RelationalExpr) this);
    }

    /* access modifiers changed from: protected */
    public boolean evaluateDoubleDouble(Double d, Double d2) {
        return d.compareTo(d2) >= 0;
    }

    public String getOperator() {
        return ">=";
    }
}
