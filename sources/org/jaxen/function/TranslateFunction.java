package org.jaxen.function;

import java.util.HashMap;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

public class TranslateFunction implements Function {
    public static String evaluate(Object obj, Object obj2, Object obj3, Navigator navigator) {
        String evaluate = StringFunction.evaluate(obj, navigator);
        String evaluate2 = StringFunction.evaluate(obj2, navigator);
        String evaluate3 = StringFunction.evaluate(obj3, navigator);
        HashMap hashMap = new HashMap();
        int length = evaluate2.length();
        int length2 = evaluate3.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String intern = evaluate2.substring(i2, i3).intern();
            if (!hashMap.containsKey(intern)) {
                if (i2 < length2) {
                    hashMap.put(intern, new Character(evaluate3.charAt(i2)));
                } else {
                    hashMap.put(intern, (Object) null);
                }
            }
            i2 = i3;
        }
        StringBuffer stringBuffer = new StringBuffer(evaluate.length());
        int length3 = evaluate.length();
        while (i < length3) {
            int i4 = i + 1;
            String substring = evaluate.substring(i, i4);
            if (hashMap.containsKey(substring)) {
                Character ch = (Character) hashMap.get(substring);
                if (ch != null) {
                    stringBuffer.append(ch.charValue());
                }
            } else {
                stringBuffer.append(substring);
            }
            i = i4;
        }
        return new String(stringBuffer);
    }

    public Object call(Context context, List list) {
        if (list.size() == 3) {
            return evaluate(list.get(0), list.get(1), list.get(2), context.getNavigator());
        }
        throw new FunctionCallException("translate() requires three arguments.");
    }
}
