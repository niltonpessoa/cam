package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class SubstringFunction implements Function {
    public Object call(Context context, List list) {
        int length;
        int i;
        int size = list.size();
        if (size < 2 || size > 3) {
            throw new FunctionCallException("substring() requires two or three arguments.");
        }
        Navigator navigator = context.getNavigator();
        int i2 = 0;
        String evaluate = StringFunction.evaluate(list.get(0), navigator);
        if (evaluate == null || (length = evaluate.length()) == 0) {
            return "";
        }
        Double evaluate2 = NumberFunction.evaluate(list.get(1), navigator);
        if (evaluate2.isNaN()) {
            return "";
        }
        int intValue = RoundFunction.evaluate(evaluate2, navigator).intValue() - 1;
        if (size == 3) {
            Double evaluate3 = NumberFunction.evaluate(list.get(2), navigator);
            i = !evaluate3.isNaN() ? RoundFunction.evaluate(evaluate3, navigator).intValue() : 0;
        } else {
            i = length;
        }
        int i3 = i + intValue;
        if (intValue >= 0) {
            if (intValue > length) {
                return "";
            }
            i2 = intValue;
        }
        if (i3 <= length) {
            length = i3;
        }
        return evaluate.substring(i2, length);
    }
}
