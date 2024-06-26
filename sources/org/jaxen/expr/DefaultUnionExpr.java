package org.jaxen.expr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.XPathSyntaxException;

public class DefaultUnionExpr extends DefaultBinaryExpr implements UnionExpr {
    public DefaultUnionExpr(Expr expr, Expr expr2) {
        super(expr, expr2);
    }

    public void accept(Visitor visitor) {
        visitor.visit((UnionExpr) this);
    }

    public Object evaluate(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            List list = (List) getLHS().evaluate(context);
            HashSet hashSet = new HashSet();
            arrayList.addAll(list);
            hashSet.addAll(list);
            for (Object next : (List) getRHS().evaluate(context)) {
                if (!hashSet.contains(next)) {
                    arrayList.add(next);
                    hashSet.add(next);
                }
            }
            Collections.sort(arrayList, new NodeComparator(context.getNavigator()));
            return arrayList;
        } catch (ClassCastException unused) {
            throw new XPathSyntaxException(getText(), context.getPosition(), "Unions are only allowed over node-sets");
        }
    }

    public String getOperator() {
        return "|";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultUnionExpr): ");
        stringBuffer.append(getLHS());
        stringBuffer.append(", ");
        stringBuffer.append(getRHS());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
