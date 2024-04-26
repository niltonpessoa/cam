package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class StringLengthFunction implements Function {
    public static Number evaluate(Object obj, Navigator navigator) {
        return new Double((double) StringFunction.evaluate(obj, navigator).length());
    }

    public Object call(Context context, List list) {
        Object obj;
        if (list.size() == 0) {
            obj = context.getNodeSet();
        } else if (list.size() == 1) {
            obj = list.get(0);
        } else {
            throw new FunctionCallException("string-length() requires one argument.");
        }
        return evaluate(obj, context.getNavigator());
    }
}
