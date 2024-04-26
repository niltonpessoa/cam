package org.jaxen.expr;

import org.jaxen.JaxenException;
import org.jaxen.expr.iter.IterableAncestorAxis;
import org.jaxen.expr.iter.IterableAncestorOrSelfAxis;
import org.jaxen.expr.iter.IterableAttributeAxis;
import org.jaxen.expr.iter.IterableAxis;
import org.jaxen.expr.iter.IterableChildAxis;
import org.jaxen.expr.iter.IterableDescendantAxis;
import org.jaxen.expr.iter.IterableDescendantOrSelfAxis;
import org.jaxen.expr.iter.IterableFollowingAxis;
import org.jaxen.expr.iter.IterableFollowingSiblingAxis;
import org.jaxen.expr.iter.IterableNamespaceAxis;
import org.jaxen.expr.iter.IterableParentAxis;
import org.jaxen.expr.iter.IterablePrecedingAxis;
import org.jaxen.expr.iter.IterablePrecedingSiblingAxis;
import org.jaxen.expr.iter.IterableSelfAxis;

public class DefaultXPathFactory implements XPathFactory {
    public LocationPath createAbsoluteLocationPath() {
        return new DefaultAbsoluteLocationPath();
    }

    public BinaryExpr createAdditiveExpr(Expr expr, Expr expr2, int i) {
        if (i == 7) {
            return new DefaultPlusExpr(expr, expr2);
        }
        if (i == 8) {
            return new DefaultMinusExpr(expr, expr2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unhandled operator in createAdditiveExpr(): ");
        stringBuffer.append(i);
        throw new JaxenException(stringBuffer.toString());
    }

    public Step createAllNodeStep(int i) {
        return new DefaultAllNodeStep(getIterableAxis(i), createPredicateSet());
    }

    public BinaryExpr createAndExpr(Expr expr, Expr expr2) {
        return new DefaultAndExpr(expr, expr2);
    }

    public Step createCommentNodeStep(int i) {
        return new DefaultCommentNodeStep(getIterableAxis(i), createPredicateSet());
    }

    public BinaryExpr createEqualityExpr(Expr expr, Expr expr2, int i) {
        if (i == 1) {
            return new DefaultEqualsExpr(expr, expr2);
        }
        if (i == 2) {
            return new DefaultNotEqualsExpr(expr, expr2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unhandled operator in createEqualityExpr(): ");
        stringBuffer.append(i);
        throw new JaxenException(stringBuffer.toString());
    }

    public FilterExpr createFilterExpr(Expr expr) {
        return new DefaultFilterExpr(expr, createPredicateSet());
    }

    public FunctionCallExpr createFunctionCallExpr(String str, String str2) {
        return new DefaultFunctionCallExpr(str, str2);
    }

    public LiteralExpr createLiteralExpr(String str) {
        return new DefaultLiteralExpr(str);
    }

    public BinaryExpr createMultiplicativeExpr(Expr expr, Expr expr2, int i) {
        switch (i) {
            case 9:
                return new DefaultMultiplyExpr(expr, expr2);
            case 10:
                return new DefaultModExpr(expr, expr2);
            case 11:
                return new DefaultDivExpr(expr, expr2);
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unhandled operator in createMultiplicativeExpr(): ");
                stringBuffer.append(i);
                throw new JaxenException(stringBuffer.toString());
        }
    }

    public Step createNameStep(int i, String str, String str2) {
        return new DefaultNameStep(getIterableAxis(i), str, str2, createPredicateSet());
    }

    public NumberExpr createNumberExpr(double d) {
        return new DefaultNumberExpr(new Double(d));
    }

    public NumberExpr createNumberExpr(int i) {
        return new DefaultNumberExpr(new Double((double) i));
    }

    public BinaryExpr createOrExpr(Expr expr, Expr expr2) {
        return new DefaultOrExpr(expr, expr2);
    }

    public PathExpr createPathExpr(FilterExpr filterExpr, LocationPath locationPath) {
        return new DefaultPathExpr(filterExpr, locationPath);
    }

    public Predicate createPredicate(Expr expr) {
        return new DefaultPredicate(expr);
    }

    public PredicateSet createPredicateSet() {
        return new PredicateSet();
    }

    public Step createProcessingInstructionNodeStep(int i, String str) {
        return new DefaultProcessingInstructionNodeStep(getIterableAxis(i), str, createPredicateSet());
    }

    public BinaryExpr createRelationalExpr(Expr expr, Expr expr2, int i) {
        if (i == 3) {
            return new DefaultLessThanExpr(expr, expr2);
        }
        if (i == 4) {
            return new DefaultLessThanEqualExpr(expr, expr2);
        }
        if (i == 5) {
            return new DefaultGreaterThanExpr(expr, expr2);
        }
        if (i == 6) {
            return new DefaultGreaterThanEqualExpr(expr, expr2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unhandled operator in createRelationalExpr(): ");
        stringBuffer.append(i);
        throw new JaxenException(stringBuffer.toString());
    }

    public LocationPath createRelativeLocationPath() {
        return new DefaultRelativeLocationPath();
    }

    public Step createTextNodeStep(int i) {
        return new DefaultTextNodeStep(getIterableAxis(i), createPredicateSet());
    }

    public Expr createUnaryExpr(Expr expr, int i) {
        return i != 12 ? expr : new DefaultUnaryExpr(expr);
    }

    public UnionExpr createUnionExpr(Expr expr, Expr expr2) {
        return new DefaultUnionExpr(expr, expr2);
    }

    public VariableReferenceExpr createVariableReferenceExpr(String str, String str2) {
        return new DefaultVariableReferenceExpr(str, str2);
    }

    public XPathExpr createXPath(Expr expr) {
        return new DefaultXPathExpr(expr);
    }

    /* access modifiers changed from: protected */
    public IterableAxis getIterableAxis(int i) {
        switch (i) {
            case 1:
                return new IterableChildAxis(i);
            case 2:
                return new IterableDescendantAxis(i);
            case 3:
                return new IterableParentAxis(i);
            case 4:
                return new IterableAncestorAxis(i);
            case 5:
                return new IterableFollowingSiblingAxis(i);
            case 6:
                return new IterablePrecedingSiblingAxis(i);
            case 7:
                return new IterableFollowingAxis(i);
            case 8:
                return new IterablePrecedingAxis(i);
            case 9:
                return new IterableAttributeAxis(i);
            case 10:
                return new IterableNamespaceAxis(i);
            case 11:
                return new IterableSelfAxis(i);
            case 12:
                return new IterableDescendantOrSelfAxis(i);
            case 13:
                return new IterableAncestorOrSelfAxis(i);
            default:
                return null;
        }
    }
}
