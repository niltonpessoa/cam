package org.dom4j.util;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.QName;

public class AttributeHelper {
    protected AttributeHelper() {
    }

    protected static boolean booleanValue(Attribute attribute) {
        Object data;
        if (attribute == null || (data = attribute.getData()) == null) {
            return false;
        }
        return data instanceof Boolean ? ((Boolean) data).booleanValue() : "true".equalsIgnoreCase(data.toString());
    }

    public static boolean booleanValue(Element element, String str) {
        return booleanValue(element.attribute(str));
    }

    public static boolean booleanValue(Element element, QName qName) {
        return booleanValue(element.attribute(qName));
    }
}
