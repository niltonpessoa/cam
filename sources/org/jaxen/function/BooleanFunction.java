package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class BooleanFunction implements Function {
    public static Boolean evaluate(Object obj, Navigator navigator) {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() == 0) {
                return bool2;
            }
            obj = list.get(0);
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (!(obj instanceof Number)) {
            return obj instanceof String ? ((String) obj).length() > 0 ? bool : bool2 : obj != null ? bool : bool2;
        }
        double doubleValue = ((Number) obj).doubleValue();
        return (doubleValue == 0.0d || Double.isNaN(doubleValue)) ? bool2 : bool;
    }

    public Object call(Context context, List list) {
        if (list.size() == 1) {
            return evaluate(list.get(0), context.getNavigator());
        }
        throw new FunctionCallException("boolean() requires one argument");
    }
}
