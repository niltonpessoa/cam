package org.dom4j.dtd;

public class ElementDecl {
    private String model;
    private String name;

    public ElementDecl() {
    }

    public ElementDecl(String str, String str2) {
        this.name = str;
        this.model = str2;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<!ELEMENT ");
        stringBuffer.append(this.name);
        stringBuffer.append(" ");
        stringBuffer.append(this.model);
        stringBuffer.append(">");
        return stringBuffer.toString();
    }
}
