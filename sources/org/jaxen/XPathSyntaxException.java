package org.jaxen;

public class XPathSyntaxException extends JaxenException {
    private int position;
    private String xpath;

    public XPathSyntaxException(String str, int i, String str2) {
        super(str2);
        this.xpath = str;
        this.position = i;
    }

    public XPathSyntaxException(org.jaxen.saxpath.XPathSyntaxException xPathSyntaxException) {
        super((Throwable) xPathSyntaxException);
        this.xpath = xPathSyntaxException.getXPath();
        this.position = xPathSyntaxException.getPosition();
    }

    public String getMultilineMessage() {
        StringBuffer stringBuffer = new StringBuffer(getMessage());
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
}
