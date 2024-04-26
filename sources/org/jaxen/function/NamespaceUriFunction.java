package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class NamespaceUriFunction implements Function {
    public static String evaluate(List list, Navigator navigator) {
        if (list.isEmpty()) {
            return "";
        }
        Object obj = list.get(0);
        if (obj instanceof List) {
            return evaluate((List) obj, navigator);
        }
        if (navigator.isElement(obj)) {
            return navigator.getElementNamespaceUri(obj);
        }
        if (navigator.isAttribute(obj)) {
            return navigator.getAttributeNamespaceUri(obj);
        }
        if (navigator.isProcessingInstruction(obj)) {
            return navigator.getProcessingInstructionTarget(obj);
        }
        if (navigator.isNamespace(obj)) {
            return navigator.getNamespaceStringValue(obj);
        }
        if (navigator.isDocument(obj) || navigator.isComment(obj) || navigator.isText(obj)) {
            return "";
        }
        throw new FunctionCallException("The argument to the name function must be a node-set");
    }

    public Object call(Context context, List list) {
        if (list.size() == 0) {
            list = context.getNodeSet();
        } else if (list.size() != 1) {
            throw new FunctionCallException("namespace-uri() requires zero or one argument.");
        }
        return evaluate(list, context.getNavigator());
    }
}
