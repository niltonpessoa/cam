package org.jaxen.expr;

import java.util.Iterator;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.Navigator;
import org.jaxen.function.NumberFunction;

abstract class DefaultRelationalExpr extends DefaultTruthExpr implements RelationalExpr {
    public DefaultRelationalExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    private boolean evaluateObjectObject(Object obj, Object obj2, Navigator navigator) {
        if (!(obj == null || obj2 == null)) {
            Double evaluate = NumberFunction.evaluate(obj, navigator);
            Double evaluate2 = NumberFunction.evaluate(obj2, navigator);
            if (!NumberFunction.isNaN(evaluate) && !NumberFunction.isNaN(evaluate2)) {
                return evaluateDoubleDouble(evaluate, evaluate2);
            }
        }
        return false;
    }

    private Object evaluateSetSet(List list, List list2, Navigator navigator) {
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
        List convertToList;
        List convertToList2;
        Object evaluate = getLHS().evaluate(context);
        Object evaluate2 = getRHS().evaluate(context);
        Navigator navigator = context.getNavigator();
        if (bothAreSets(evaluate, evaluate2)) {
            convertToList = (List) evaluate;
        } else if (!eitherIsSet(evaluate, evaluate2)) {
            return evaluateObjectObject(evaluate, evaluate2, navigator) ? Boolean.TRUE : Boolean.FALSE;
        } else {
            if (isSet(evaluate)) {
                convertToList = (List) evaluate;
                convertToList2 = DefaultExpr.convertToList(evaluate2);
                return evaluateSetSet(convertToList, convertToList2, navigator);
            }
            convertToList = DefaultExpr.convertToList(evaluate);
        }
        convertToList2 = (List) evaluate2;
        return evaluateSetSet(convertToList, convertToList2, navigator);
    }

    /* access modifiers changed from: protected */
    public abstract boolean evaluateDoubleDouble(Double d, Double d2);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultRelationalExpr): ");
        stringBuffer.append(getLHS());
        stringBuffer.append(", ");
        stringBuffer.append(getRHS());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
