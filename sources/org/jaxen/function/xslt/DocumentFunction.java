package org.jaxen.function.xslt;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;
import org.jaxen.function.StringFunction;

public class DocumentFunction implements Function {
    public static Object evaluate(String str, Navigator navigator) {
        return navigator.getDocument(str);
    }

    public Object call(Context context, List list) {
        if (list.size() == 1) {
            Navigator navigator = context.getNavigator();
            return evaluate(StringFunction.evaluate(list.get(0), navigator), navigator);
        }
        throw new FunctionCallException("document() requires one argument.");
    }
}
