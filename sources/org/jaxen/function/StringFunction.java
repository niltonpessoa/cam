package org.jaxen.function;

import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.JaxenException;
import org.jaxen.JaxenRuntimeException;
import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;

public class StringFunction implements Function {
    private static NumberFormat format;

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        format = instance;
        instance.setGroupingUsed(false);
        format.setMaximumFractionDigits(32);
    }

    public static String evaluate(Object obj, Navigator navigator) {
        if (obj == null) {
            return "";
        }
        if (navigator != null) {
            try {
                if (navigator.isText(obj)) {
                    return navigator.getTextStringValue(obj);
                }
            } catch (UnsupportedAxisException e) {
                throw new JaxenRuntimeException((JaxenException) e);
            }
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.isEmpty()) {
                return "";
            }
            obj = list.get(0);
        }
        if (navigator == null || (!navigator.isElement(obj) && !navigator.isDocument(obj))) {
            return (navigator == null || !navigator.isAttribute(obj)) ? (navigator == null || !navigator.isText(obj)) ? (navigator == null || !navigator.isProcessingInstruction(obj)) ? (navigator == null || !navigator.isComment(obj)) ? (navigator == null || !navigator.isNamespace(obj)) ? obj instanceof String ? (String) obj : obj instanceof Boolean ? stringValue(((Boolean) obj).booleanValue()) : obj instanceof Number ? stringValue(((Number) obj).doubleValue()) : "" : navigator.getNamespaceStringValue(obj) : navigator.getCommentStringValue(obj) : navigator.getProcessingInstructionData(obj) : navigator.getTextStringValue(obj) : navigator.getAttributeStringValue(obj);
        }
        Iterator descendantAxisIterator = navigator.getDescendantAxisIterator(obj);
        StringBuffer stringBuffer = new StringBuffer();
        while (descendantAxisIterator.hasNext()) {
            Object next = descendantAxisIterator.next();
            if (navigator.isText(next)) {
                stringBuffer.append(navigator.getTextStringValue(next));
            }
        }
        return stringBuffer.toString();
    }

    public static String stringValue(double d) {
        return format.format(d);
    }

    public static String stringValue(boolean z) {
        return z ? "true" : "false";
    }

    public Object call(Context context, List list) {
        Object obj;
        int size = list.size();
        if (size == 0) {
            obj = context.getNodeSet();
        } else if (size == 1) {
            obj = list.get(0);
        } else {
            throw new FunctionCallException("string() requires one argument.");
        }
        return evaluate(obj, context.getNavigator());
    }
}
