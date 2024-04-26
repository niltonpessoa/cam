package org.jaxen.expr;

import org.jaxen.ContextSupport;
import org.jaxen.expr.iter.IterableAxis;

public class DefaultCommentNodeStep extends DefaultStep implements CommentNodeStep {
    public DefaultCommentNodeStep(IterableAxis iterableAxis, PredicateSet predicateSet) {
        super(iterableAxis, predicateSet);
    }

    public void accept(Visitor visitor) {
        visitor.visit((CommentNodeStep) this);
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getAxisName());
        stringBuffer.append("::comment()");
        return stringBuffer.toString();
    }

    public boolean matches(Object obj, ContextSupport contextSupport) {
        return contextSupport.getNavigator().isComment(obj);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultCommentNodeStep): ");
        stringBuffer.append(getAxis());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
