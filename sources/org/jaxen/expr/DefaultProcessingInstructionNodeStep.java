package org.jaxen.expr;

import org.jaxen.ContextSupport;
import org.jaxen.Navigator;
import org.jaxen.expr.iter.IterableAxis;

public class DefaultProcessingInstructionNodeStep extends DefaultStep implements ProcessingInstructionNodeStep {
    private String name;

    public DefaultProcessingInstructionNodeStep(IterableAxis iterableAxis, String str, PredicateSet predicateSet) {
        super(iterableAxis, predicateSet);
        this.name = str;
    }

    public void accept(Visitor visitor) {
        visitor.visit((ProcessingInstructionNodeStep) this);
    }

    public String getName() {
        return this.name;
    }

    public boolean matches(Object obj, ContextSupport contextSupport) {
        Navigator navigator = contextSupport.getNavigator();
        if (!navigator.isProcessingInstruction(obj)) {
            return false;
        }
        String name2 = getName();
        if (name2 == null || name2.length() == 0) {
            return true;
        }
        return name2.equals(navigator.getProcessingInstructionTarget(obj));
    }
}
