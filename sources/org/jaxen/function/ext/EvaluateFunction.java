package org.jaxen.function.ext;

import java.util.Collections;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.ContextSupport;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;
import org.jaxen.XPath;
import org.jaxen.function.StringFunction;
import org.jaxen.saxpath.SAXPathException;

public class EvaluateFunction implements Function {
    public static List evaluate(Context context, Object obj) {
        if (context.getNodeSet().size() == 0) {
            return Collections.EMPTY_LIST;
        }
        Navigator navigator = context.getNavigator();
        try {
            XPath parseXPath = navigator.parseXPath(obj instanceof String ? (String) obj : StringFunction.evaluate(obj, navigator));
            ContextSupport contextSupport = context.getContextSupport();
            parseXPath.setVariableContext(contextSupport.getVariableContext());
            parseXPath.setFunctionContext(contextSupport.getFunctionContext());
            parseXPath.setNamespaceContext(contextSupport.getNamespaceContext());
            return parseXPath.selectNodes(context.duplicate());
        } catch (SAXPathException e) {
            throw new FunctionCallException(e.toString());
        }
    }

    public Object call(Context context, List list) {
        if (list.size() == 1) {
            return evaluate(context, list.get(0));
        }
        throw new FunctionCallException("evaluate() requires one argument");
    }
}
