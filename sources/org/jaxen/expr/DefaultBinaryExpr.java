package org.jaxen.expr;

abstract class DefaultBinaryExpr extends DefaultExpr implements BinaryExpr {
    private Expr lhs;
    private Expr rhs;

    public DefaultBinaryExpr(Expr expr, Expr expr2) {
        this.lhs = expr;
        this.rhs = expr2;
    }

    public Expr getLHS() {
        return this.lhs;
    }

    public abstract String getOperator();

    public Expr getRHS() {
        return this.rhs;
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        stringBuffer.append(getLHS().getText());
        stringBuffer.append(" ");
        stringBuffer.append(getOperator());
        stringBuffer.append(" ");
        stringBuffer.append(getRHS().getText());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public void setLHS(Expr expr) {
        this.lhs = expr;
    }

    public void setRHS(Expr expr) {
        this.rhs = expr;
    }

    public Expr simplify() {
        setLHS(getLHS().simplify());
        setRHS(getRHS().simplify());
        return this;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(");
        stringBuffer.append(getClass().getName());
        stringBuffer.append("): ");
        stringBuffer.append(getLHS());
        stringBuffer.append(", ");
        stringBuffer.append(getRHS());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
