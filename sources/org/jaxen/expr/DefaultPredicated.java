package org.jaxen.expr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class DefaultPredicated {
    private List predicates = new ArrayList();

    protected DefaultPredicated() {
    }

    public void addPredicate(Predicate predicate) {
        getPredicates().add(predicate);
    }

    public List getPredicates() {
        return this.predicates;
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Predicate text : getPredicates()) {
            stringBuffer.append(text.getText());
        }
        return stringBuffer.toString();
    }

    public void simplifyAllPredicates() {
        for (Predicate simplify : getPredicates()) {
            simplify.simplify();
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = getPredicates().iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toString());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }
}
