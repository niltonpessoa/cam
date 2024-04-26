package org.jaxen.expr;

import org.jaxen.ContextSupport;
import org.jaxen.expr.iter.IterableAxis;

public class DefaultTextNodeStep extends DefaultStep implements TextNodeStep {
    public DefaultTextNodeStep(IterableAxis iterableAxis, PredicateSet predicateSet) {
        super(iterableAxis, predicateSet);
    }

    public void accept(Visitor visitor) {
        visitor.visit((TextNodeStep) this);
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getAxisName());
        stringBuffer.append("::text()");
        stringBuffer.append(super.getText());
        return stringBuffer.toString();
    }

    public boolean matches(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().isText(obj);
    }
}
