package org.jaxen.function.ext;

import java.util.List;
import java.util.Locale;
import org.jaxen.Context;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;
import org.jaxen.function.StringFunction;

public class LowerFunction extends LocaleFunctionSupport {
    public static String evaluate(Object obj, Locale locale, Navigator navigator) {
        String evaluate = StringFunction.evaluate(obj, navigator);
        if (locale == null) {
            locale = Locale.ENGLISH;
        }
        return evaluate.toLowerCase(locale);
    }

    public Object call(Context context, List list) {
        Navigator navigator = context.getNavigator();
        int size = list.size();
        if (size > 0) {
            Object obj = list.get(0);
            Locale locale = null;
            if (size > 1) {
                locale = getLocale(list.get(1), navigator);
            }
            return evaluate(obj, locale, navigator);
        }
        throw new FunctionCallException("lower-case() requires at least one argument.");
    }
}
