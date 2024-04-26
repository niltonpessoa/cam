package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;

public class FalseFunction implements Function {
    public static Boolean evaluate() {
        return Boolean.FALSE;
    }

    public Object call(Context context, List list) {
        if (list.size() == 0) {
            return evaluate();
        }
        throw new FunctionCallException("false() requires no arguments.");
    }
}
