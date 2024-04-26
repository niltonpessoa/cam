package org.jaxen.expr;

import java.util.ArrayList;
import java.util.List;
import org.jaxen.Context;

public class DefaultFilterExpr extends DefaultExpr implements FilterExpr, Predicated {
    private Expr expr;
    private PredicateSet predicates;

    public DefaultFilterExpr(Expr expr2, PredicateSet predicateSet) {
        this.expr = expr2;
        this.predicates = predicateSet;
    }

    public DefaultFilterExpr(PredicateSet predicateSet) {
        this.predicates = predicateSet;
    }

    public void accept(Visitor visitor) {
        visitor.visit((FilterExpr) this);
    }

    public void addPredicate(Predicate predicate) {
        this.predicates.addPredicate(predicate);
    }

    public boolean asBoolean(Context context) {
        Object obj;
        Expr expr2 = this.expr;
        if (expr2 != null) {
            obj = expr2.evaluate(context);
        } else {
            List nodeSet = context.getNodeSet();
            ArrayList arrayList = new ArrayList(nodeSet.size());
            arrayList.addAll(nodeSet);
            obj = arrayList;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof List) {
            return getPredicateSet().evaluateAsBoolean((List) obj, context.getContextSupport());
        }
        return false;
    }

    public Object evaluate(Context context) {
        Object evaluate = getExpr().evaluate(context);
        return evaluate instanceof List ? getPredicateSet().evaluatePredicates((List) evaluate, context.getContextSupport()) : evaluate;
    }

    public Expr getExpr() {
        return this.expr;
    }

    public PredicateSet getPredicateSet() {
        return this.predicates;
    }

    public List getPredicates() {
        return this.predicates.getPredicates();
    }

    public String getText() {
        Expr expr2 = this.expr;
        String text = expr2 != null ? expr2.getText() : "";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(text);
        stringBuffer.append(this.predicates.getText());
        return stringBuffer.toString();
    }

    public Expr simplify() {
        this.predicates.simplify();
        Expr expr2 = this.expr;
        if (expr2 != null) {
            this.expr = expr2.simplify();
        }
        return this.predicates.getPredicates().size() == 0 ? getExpr() : this;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultFilterExpr): expr: ");
        stringBuffer.append(this.expr);
        stringBuffer.append(" predicates: ");
        stringBuffer.append(this.predicates);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
