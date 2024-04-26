package org.jaxen.pattern;

import org.jaxen.Context;
import org.jaxen.Navigator;

public class NameTest extends NodeTest {
    private String name;
    private short nodeType;

    public NameTest(String str, short s) {
        this.name = str;
        this.nodeType = s;
    }

    public short getMatchType() {
        return this.nodeType;
    }

    public double getPriority() {
        return 0.0d;
    }

    public String getText() {
        if (this.nodeType != 2) {
            return this.name;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("@");
        stringBuffer.append(this.name);
        return stringBuffer.toString();
    }

    public boolean matches(Object obj, Context context) {
        String str;
        String attributeName;
        Navigator navigator = context.getNavigator();
        short s = this.nodeType;
        if (s == 1) {
            return navigator.isElement(obj) && this.name.equals(navigator.getElementName(obj));
        }
        if (s == 2) {
            return navigator.isAttribute(obj) && this.name.equals(navigator.getAttributeName(obj));
        }
        if (navigator.isElement(obj)) {
            str = this.name;
            attributeName = navigator.getElementName(obj);
        } else if (!navigator.isAttribute(obj)) {
            return false;
        } else {
            str = this.name;
            attributeName = navigator.getAttributeName(obj);
        }
        return str.equals(attributeName);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("[ name: ");
        stringBuffer.append(this.name);
        stringBuffer.append(" type: ");
        stringBuffer.append(this.nodeType);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
