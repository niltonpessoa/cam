package org.jaxen.expr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.ContextSupport;
import org.jaxen.function.BooleanFunction;

public class PredicateSet implements Serializable {
    private List predicates = Collections.EMPTY_LIST;

    public void addPredicate(Predicate predicate) {
        if (this.predicates == Collections.EMPTY_LIST) {
            this.predicates = new ArrayList();
        }
        this.predicates.add(predicate);
    }

    public List applyPredicate(Predicate predicate, List list, ContextSupport contextSupport) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        Context context = new Context(contextSupport);
        ArrayList arrayList2 = new ArrayList(1);
        context.setNodeSet(arrayList2);
        int i = 0;
        while (i < size) {
            Object obj = list.get(i);
            arrayList2.clear();
            arrayList2.add(obj);
            context.setNodeSet(arrayList2);
            i++;
            context.setPosition(i);
            context.setSize(size);
            Object evaluate = predicate.evaluate(context);
            if (evaluate instanceof Number) {
                if (((Number) evaluate).intValue() != i) {
                }
            } else if (!BooleanFunction.evaluate(evaluate, context.getNavigator()).booleanValue()) {
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public boolean evaluateAsBoolean(List list, ContextSupport contextSupport) {
        return !evaluatePredicates(list, contextSupport).isEmpty();
    }

    /* access modifiers changed from: protected */
    public List evaluatePredicates(List list, ContextSupport contextSupport) {
        if (this.predicates.size() == 0) {
            return list;
        }
        for (Predicate applyPredicate : this.predicates) {
            list = applyPredicate(applyPredicate, list, contextSupport);
        }
        return list;
    }

    public List getPredicates() {
        return this.predicates;
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Predicate text : this.predicates) {
            stringBuffer.append(text.getText());
        }
        return stringBuffer.toString();
    }

    public void simplify() {
        for (Predicate simplify : this.predicates) {
            simplify.simplify();
        }
    }
}
