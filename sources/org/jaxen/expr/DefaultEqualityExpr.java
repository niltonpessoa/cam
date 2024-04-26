package org.jaxen.expr;

import java.util.Iterator;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.Navigator;
import org.jaxen.function.BooleanFunction;
import org.jaxen.function.NumberFunction;
import org.jaxen.function.StringFunction;

abstract class DefaultEqualityExpr extends DefaultTruthExpr implements EqualityExpr {
    public DefaultEqualityExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    private boolean evaluateObjectObject(Object obj, Object obj2, Navigator navigator) {
        Object evaluate;
        Object evaluate2;
        if (eitherIsBoolean(obj, obj2)) {
            evaluate = BooleanFunction.evaluate(obj, navigator);
            evaluate2 = BooleanFunction.evaluate(obj2, navigator);
        } else if (eitherIsNumber(obj, obj2)) {
            evaluate = NumberFunction.evaluate(obj, navigator);
            evaluate2 = NumberFunction.evaluate(obj2, navigator);
        } else {
            evaluate = StringFunction.evaluate(obj, navigator);
            evaluate2 = StringFunction.evaluate(obj2, navigator);
        }
        return evaluateObjectObject(evaluate, evaluate2);
    }

    private Boolean evaluateSetSet(List list, List list2, Navigator navigator) {
        Boolean bool = Boolean.FALSE;
        if (!setIsEmpty(list) && !setIsEmpty(list2)) {
            for (Object next : list) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (evaluateObjectObject(next, it.next(), navigator)) {
                            return Boolean.TRUE;
                        }
                    }
                }
            }
        }
        return bool;
    }

    public Object evaluate(Context context) {
        Boolean bool = Boolean.FALSE;
        Object evaluate = getLHS().evaluate(context);
        Object evaluate2 = getRHS().evaluate(context);
        if (evaluate == null || evaluate2 == null) {
            return bool;
        }
        Navigator navigator = context.getNavigator();
        return bothAreSets(evaluate, evaluate2) ? evaluateSetSet((List) evaluate, (List) evaluate2, navigator) : eitherIsSet(evaluate, evaluate2) ? isSet(evaluate) ? evaluateSetSet((List) evaluate, DefaultExpr.convertToList(evaluate2), navigator) : evaluateSetSet(DefaultExpr.convertToList(evaluate), (List) evaluate2, navigator) : evaluateObjectObject(evaluate, evaluate2, navigator) ? Boolean.TRUE : bool;
    }

    /* access modifiers changed from: protected */
    public abstract boolean evaluateObjectObject(Object obj, Object obj2);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultEqualityExpr): ");
        stringBuffer.append(getLHS());
        stringBuffer.append(", ");
        stringBuffer.append(getRHS());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
