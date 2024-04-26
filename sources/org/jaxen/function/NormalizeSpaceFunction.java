package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class NormalizeSpaceFunction implements Function {
    public static String evaluate(Object obj, Navigator navigator) {
        char[] charArray = StringFunction.evaluate(obj, navigator).toCharArray();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i < charArray.length) {
            if (Character.isWhitespace(charArray[i])) {
                if (z) {
                    charArray[i3] = ' ';
                    i3++;
                }
                do {
                    i++;
                    if (i >= charArray.length) {
                        break;
                    }
                } while (!Character.isWhitespace(charArray[i]));
            } else {
                i2 = i3 + 1;
                charArray[i3] = charArray[i];
                i3 = i2;
                i++;
                z = true;
            }
        }
        return new String(charArray, 0, i2);
    }

    public Object call(Context context, List list) {
        if (list.size() >= 1) {
            return evaluate(list.get(0), context.getNavigator());
        }
        throw new FunctionCallException("normalize-space() requires one argument");
    }
}
