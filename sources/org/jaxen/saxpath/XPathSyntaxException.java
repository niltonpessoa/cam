package org.jaxen.saxpath;

public class XPathSyntaxException extends SAXPathException {
    private int position;
    private String xpath;

    public XPathSyntaxException(String str, int i, String str2) {
        super(str2);
        this.position = i;
        this.xpath = str;
    }

    public String getMultilineMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getMessage());
        stringBuffer.append("\n");
        stringBuffer.append(getXPath());
        stringBuffer.append("\n");
        stringBuffer.append(getPositionMarker());
        return stringBuffer.toString();
    }

    public int getPosition() {
        return this.position;
    }

    public String getPositionMarker() {
        StringBuffer stringBuffer = new StringBuffer();
        int position2 = getPosition();
        for (int i = 0; i < position2; i++) {
            stringBuffer.append(" ");
        }
        stringBuffer.append("^");
        return stringBuffer.toString();
    }

    public String getXPath() {
        return this.xpath;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass());
        stringBuffer.append(": ");
        stringBuffer.append(getPosition());
        stringBuffer.append(": ");
        stringBuffer.append(getMessage());
        return stringBuffer.toString();
    }
}
