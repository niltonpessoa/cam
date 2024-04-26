package org.jaxen.saxpath.base;

class Token {
    private String parseText;
    private int tokenBegin;
    private int tokenEnd;
    private int tokenType;

    public Token(int i, String str, int i2, int i3) {
        setTokenType(i);
        setParseText(str);
        setTokenBegin(i2);
        setTokenEnd(i3);
    }

    private void setParseText(String str) {
        this.parseText = str;
    }

    private void setTokenBegin(int i) {
        this.tokenBegin = i;
    }

    private void setTokenEnd(int i) {
        this.tokenEnd = i;
    }

    private void setTokenType(int i) {
        this.tokenType = i;
    }

    /* access modifiers changed from: package-private */
    public int getTokenBegin() {
        return this.tokenBegin;
    }

    /* access modifiers changed from: package-private */
    public int getTokenEnd() {
        return this.tokenEnd;
    }

    public String getTokenText() {
        return this.parseText.substring(getTokenBegin(), getTokenEnd());
    }

    public int getTokenType() {
        return this.tokenType;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ (");
        stringBuffer.append(this.tokenType);
        stringBuffer.append(") (");
        stringBuffer.append(getTokenText());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
