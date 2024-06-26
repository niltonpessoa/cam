package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class SubstringBeforeFunction implements Function {
    public static String evaluate(Object obj, Object obj2, Navigator navigator) {
        String evaluate = StringFunction.evaluate(obj, navigator);
        int indexOf = evaluate.indexOf(StringFunction.evaluate(obj2, navigator));
        return indexOf < 0 ? "" : evaluate.substring(0, indexOf);
    }

    public Object call(Context context, List list) {
        if (list.size() == 2) {
            return evaluate(list.get(0), list.get(1), context.getNavigator());
        }
        throw new FunctionCallException("substring-before() requires two arguments.");
    }
}
