package org.jaxen.function;

import java.util.Iterator;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class NumberFunction implements Function {
    private static final Double NaN = new Double(Double.NaN);

    public static Double evaluate(Object obj, Navigator navigator) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return new Double(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? new Double(1.0d) : new Double(0.0d);
        }
        if (!(obj instanceof String)) {
            return ((obj instanceof List) || (obj instanceof Iterator)) ? evaluate(StringFunction.evaluate(obj, navigator), navigator) : (navigator.isElement(obj) || navigator.isAttribute(obj)) ? evaluate(StringFunction.evaluate(obj, navigator), navigator) : new Double(Double.NaN);
        }
        try {
            return new Double((String) obj);
        } catch (NumberFormatException unused) {
            return new Double(Double.NaN);
        }
    }

    public static boolean isNaN(double d) {
        return Double.isNaN(d);
    }

    public static boolean isNaN(Double d) {
        return d.equals(NaN);
    }

    public Object call(Context context, List list) {
        if (list.size() == 1) {
            return evaluate(list.get(0), context.getNavigator());
        }
        throw new FunctionCallException("number() requires one argument.");
    }
}
