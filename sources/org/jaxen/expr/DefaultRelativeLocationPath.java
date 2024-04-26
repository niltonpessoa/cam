package org.jaxen.expr;

public class DefaultRelativeLocationPath extends DefaultLocationPath {
    public void accept(Visitor visitor) {
        visitor.visit((LocationPath) this);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[(DefaultRelativeLocationPath): ");
        stringBuffer.append(super.toString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
