package org.dom4j.dtd;

public class ExternalEntityDecl {
    private String name;
    private String publicID;
    private String systemID;

    public ExternalEntityDecl() {
    }

    public ExternalEntityDecl(String str, String str2, String str3) {
        this.name = str;
        this.publicID = str2;
        this.systemID = str3;
    }

    public String getName() {
        return this.name;
    }

    public String getPublicID() {
        return this.publicID;
    }

    public String getSystemID() {
        return this.systemID;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPublicID(String str) {
        this.publicID = str;
    }

    public void setSystemID(String str) {
        this.systemID = str;
    }

    public String toString() {
        String str;
        String str2;
        StringBuffer stringBuffer = new StringBuffer("<!ENTITY ");
        if (this.name.startsWith("%")) {
            stringBuffer.append("% ");
            str = this.name.substring(1);
        } else {
            str = this.name;
        }
        stringBuffer.append(str);
        if (this.publicID != null) {
            stringBuffer.append(" PUBLIC \"");
            stringBuffer.append(this.publicID);
            stringBuffer.append("\" ");
            if (this.systemID != null) {
                str2 = "\"";
            }
            stringBuffer.append(">");
            return stringBuffer.toString();
        }
        if (this.systemID != null) {
            str2 = " SYSTEM \"";
        }
        stringBuffer.append(">");
        return stringBuffer.toString();
        stringBuffer.append(str2);
        stringBuffer.append(this.systemID);
        stringBuffer.append("\" ");
        stringBuffer.append(">");
        return stringBuffer.toString();
    }
}
