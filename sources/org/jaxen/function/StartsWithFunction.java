package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class StartsWithFunction implements Function {
    public static Boolean evaluate(Object obj, Object obj2, Navigator navigator) {
        return StringFunction.evaluate(obj, navigator).startsWith(StringFunction.evaluate(obj2, navigator)) ? Boolean.TRUE : Boolean.FALSE;
    }

    public Object call(Context context, List list) {
        if (list.size() == 2) {
            return evaluate(list.get(0), list.get(1), context.getNavigator());
        }
        throw new FunctionCallException("starts-with() requires two arguments.");
    }
}
