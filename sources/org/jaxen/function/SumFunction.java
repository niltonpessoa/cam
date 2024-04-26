package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class SumFunction implements Function {
    public static Double evaluate(Object obj, Navigator navigator) {
        if (obj instanceof List) {
            double d = 0.0d;
            for (Object evaluate : (List) obj) {
                d += NumberFunction.evaluate(evaluate, navigator).doubleValue();
            }
            return new Double(d);
        }
        throw new FunctionCallException("The argument to the sum function must be a node-set");
    }

    public Object call(Context context, List list) {
        if (list.size() == 1) {
            return evaluate(list.get(0), context.getNavigator());
        }
        throw new FunctionCallException("sum() requires one argument.");
    }
}
