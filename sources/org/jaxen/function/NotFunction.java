package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class NotFunction implements Function {
    public static Boolean evaluate(Object obj, Navigator navigator) {
        return BooleanFunction.evaluate(obj, navigator).booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

    public Object call(Context context, List list) {
        if (list.size() == 1) {
            return evaluate(list.get(0), context.getNavigator());
        }
        throw new FunctionCallException("not() requires one argument.");
    }
}
