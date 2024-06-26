package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;

public class PositionFunction implements Function {
    public static Number evaluate(Context context) {
        return new Double((double) context.getPosition());
    }

    public Object call(Context context, List list) {
        if (list.size() == 0) {
            return evaluate(context);
        }
        throw new FunctionCallException("position() requires no arguments.");
    }
}
