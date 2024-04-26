package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;

public class CountFunction implements Function {
    public static Number evaluate(Object obj) {
        if (obj == null) {
            return new Double(0.0d);
        }
        if (obj instanceof List) {
            return new Double((double) ((List) obj).size());
        }
        throw new FunctionCallException("Count function can only be used for node-sets");
    }

    public Object call(Context context, List list) {
        if (list.size() == 1) {
            return evaluate(list.get(0));
        }
        throw new FunctionCallException("count() requires one argument.");
    }
}
