package org.jaxen.expr;

import java.util.Collections;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.ContextSupport;
import org.jaxen.Navigator;
import org.jaxen.util.SingletonList;

public class DefaultAbsoluteLocationPath extends DefaultLocationPath {
    public void accept(Visitor visitor) {
        visitor.visit((LocationPath) this);
    }

    public Object evaluate(Context context) {
        ContextSupport contextSupport = context.getContextSupport();
        Navigator navigator = contextSupport.getNavigator();
        Context context2 = new Context(contextSupport);
        List nodeSet = context.getNodeSet();
        if (nodeSet.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Object documentNode = navigator.getDocumentNode(nodeSet.get(0));
        if (documentNode == null) {
            return Collections.EMPTY_LIST;
        }
        context2.setNodeSet(new SingletonList(documentNode));
        return super.evaluate(context2);
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("/");
        stringBuffer.append(super.getText());
        return stringBuffer.toString();
    }

    public boolean isAbsolute() {
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultAbsoluteLocationPath): ");
        stringBuffer.append(super.toString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
