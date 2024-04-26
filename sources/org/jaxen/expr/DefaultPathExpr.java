package org.jaxen.expr;

import org.jaxen.Context;

class DefaultPathExpr extends DefaultExpr implements PathExpr {
    private Expr filterExpr;
    private LocationPath locationPath;

    public DefaultPathExpr(Expr expr, LocationPath locationPath2) {
        this.filterExpr = expr;
        this.locationPath = locationPath2;
    }

    public void accept(Visitor visitor) {
        visitor.visit((PathExpr) this);
    }

    public Object evaluate(Context context) {
        Context context2;
        Object obj = null;
        if (getFilterExpr() != null) {
            obj = getFilterExpr().evaluate(context);
            context2 = new Context(context.getContextSupport());
            context2.setNodeSet(DefaultExpr.convertToList(obj));
        } else {
            context2 = null;
        }
        return getLocationPath() != null ? getLocationPath().evaluate(context2) : obj;
    }

    public Expr getFilterExpr() {
        return this.filterExpr;
    }

    public LocationPath getLocationPath() {
        return this.locationPath;
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getFilterExpr() != null) {
            stringBuffer.append(getFilterExpr().getText());
        }
        if (getLocationPath() != null) {
            stringBuffer.append(getLocationPath().getText());
        }
        return stringBuffer.toString();
    }

    public void setFilterExpr(Expr expr) {
        this.filterExpr = expr;
    }

    public Expr simplify() {
        if (getFilterExpr() != null) {
            setFilterExpr(getFilterExpr().simplify());
        }
        if (getLocationPath() != null) {
            getLocationPath().simplify();
        }
        if (getFilterExpr() == null && getLocationPath() == null) {
            return null;
        }
        return getLocationPath() == null ? getFilterExpr() : getFilterExpr() == null ? getLocationPath() : this;
    }

    public String toString() {
        StringBuffer stringBuffer;
        Object filterExpr2;
        if (getLocationPath() != null) {
            stringBuffer = new StringBuffer();
            stringBuffer.append("[(DefaultPathExpr): ");
            stringBuffer.append(getFilterExpr());
            stringBuffer.append(", ");
            filterExpr2 = getLocationPath();
        } else {
            stringBuffer = new StringBuffer();
            stringBuffer.append("[(DefaultPathExpr): ");
            filterExpr2 = getFilterExpr();
        }
        stringBuffer.append(filterExpr2);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
