package org.jaxen.function;

import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;

public class LangFunction implements Function {
    private static final String LANG_LOCALNAME = "lang";
    private static final String XMLNS_URI = "http://www.w3.org/XML/1998/namespace";

    private static Boolean evaluate(List list, Object obj, Navigator navigator) {
        return Boolean.valueOf(evaluate(list.get(0), StringFunction.evaluate(obj, navigator), navigator));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (LANG_LOCALNAME.equals(r6.getAttributeName(r1)) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (XMLNS_URI.equals(r6.getAttributeNamespaceUri(r1)) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        return isSublang(r6.getAttributeStringValue(r1), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0004, code lost:
        if (r6.isElement(r4) == false) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = r6.getParentNode(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r6.isElement(r4) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.getAttributeAxisIterator(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r1 = r0.next();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean evaluate(java.lang.Object r4, java.lang.String r5, org.jaxen.Navigator r6) {
        /*
            boolean r0 = r6.isElement(r4)
            if (r0 != 0) goto L_0x000a
        L_0x0006:
            java.lang.Object r4 = r6.getParentNode(r4)
        L_0x000a:
            if (r4 == 0) goto L_0x0041
            boolean r0 = r6.isElement(r4)
            if (r0 == 0) goto L_0x0041
            java.util.Iterator r0 = r6.getAttributeAxisIterator(r4)
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0006
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = r6.getAttributeName(r1)
            java.lang.String r3 = "lang"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = r6.getAttributeNamespaceUri(r1)
            java.lang.String r3 = "http://www.w3.org/XML/1998/namespace"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0016
            java.lang.String r4 = r6.getAttributeStringValue(r1)
            boolean r4 = isSublang(r4, r5)
            return r4
        L_0x0041:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jaxen.function.LangFunction.evaluate(java.lang.Object, java.lang.String, org.jaxen.Navigator):boolean");
    }

    private static boolean isSublang(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        int length = str2.length();
        return str.length() > length && str.charAt(length) == '-' && str.substring(0, length).equalsIgnoreCase(str2);
    }

    public Object call(Context context, List list) {
        if (list.size() == 1) {
            try {
                return evaluate(context.getNodeSet(), list.get(0), context.getNavigator());
            } catch (UnsupportedAxisException e) {
                throw new FunctionCallException("Can't evaluate lang()", e);
            }
        } else {
            throw new FunctionCallException("lang() requires exactly one argument.");
        }
    }
}
