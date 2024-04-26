package org.dom4j.dtd;

public class InternalEntityDecl {
    private String name;
    private String value;

    public InternalEntityDecl() {
    }

    public InternalEntityDecl(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    private String escapeEntityValue(String str) {
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                str2 = "&#34;";
            } else if (charAt == '<') {
                str2 = "&#38;#60;";
            } else if (charAt == '>') {
                str2 = "&#62;";
            } else if (charAt == '&') {
                str2 = "&#38;#38;";
            } else if (charAt == '\'') {
                str2 = "&#39;";
            } else if (charAt < ' ') {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("&#");
                stringBuffer2.append(charAt);
                stringBuffer2.append(";");
                str2 = stringBuffer2.toString();
            } else {
                stringBuffer.append(charAt);
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("<!ENTITY ");
        if (this.name.startsWith("%")) {
            stringBuffer.append("% ");
            str = this.name.substring(1);
        } else {
            str = this.name;
        }
        stringBuffer.append(str);
        stringBuffer.append(" \"");
        stringBuffer.append(escapeEntityValue(this.value));
        stringBuffer.append("\">");
        return stringBuffer.toString();
    }
}
