package org.dom4j.swing;

import java.io.PrintStream;
import java.io.Serializable;
import org.dom4j.DocumentHelper;
import org.dom4j.XPath;

public class XMLTableColumnDefinition implements Serializable {
    public static final int NODE_TYPE = 3;
    public static final int NUMBER_TYPE = 2;
    public static final int OBJECT_TYPE = 0;
    public static final int STRING_TYPE = 1;
    static /* synthetic */ Class class$java$lang$Number;
    static /* synthetic */ Class class$java$lang$Object;
    static /* synthetic */ Class class$java$lang$String;
    static /* synthetic */ Class class$org$dom4j$Node;
    private XPath columnNameXPath;
    private String name;
    private int type;
    private XPath xpath;

    public XMLTableColumnDefinition() {
    }

    public XMLTableColumnDefinition(String str, String str2, int i) {
        this.name = str;
        this.type = i;
        this.xpath = createXPath(str2);
    }

    public XMLTableColumnDefinition(String str, XPath xPath, int i) {
        this.name = str;
        this.xpath = xPath;
        this.type = i;
    }

    public XMLTableColumnDefinition(XPath xPath, XPath xPath2, int i) {
        this.xpath = xPath2;
        this.columnNameXPath = xPath;
        this.type = i;
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static int parseType(String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        if (str.equals("string")) {
            return 1;
        }
        if (str.equals("number")) {
            return 2;
        }
        return str.equals("node") ? 3 : 0;
    }

    /* access modifiers changed from: protected */
    public XPath createXPath(String str) {
        return DocumentHelper.createXPath(str);
    }

    public Class getColumnClass() {
        int i = this.type;
        if (i == 1) {
            Class cls = class$java$lang$String;
            if (cls != null) {
                return cls;
            }
            Class class$ = class$("java.lang.String");
            class$java$lang$String = class$;
            return class$;
        } else if (i == 2) {
            Class cls2 = class$java$lang$Number;
            if (cls2 != null) {
                return cls2;
            }
            Class class$2 = class$("java.lang.Number");
            class$java$lang$Number = class$2;
            return class$2;
        } else if (i != 3) {
            Class cls3 = class$java$lang$Object;
            if (cls3 != null) {
                return cls3;
            }
            Class class$3 = class$("java.lang.Object");
            class$java$lang$Object = class$3;
            return class$3;
        } else {
            Class cls4 = class$org$dom4j$Node;
            if (cls4 != null) {
                return cls4;
            }
            Class class$4 = class$("org.dom4j.Node");
            class$org$dom4j$Node = class$4;
            return class$4;
        }
    }

    public XPath getColumnNameXPath() {
        return this.columnNameXPath;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public Object getValue(Object obj) {
        int i = this.type;
        return i != 1 ? i != 2 ? i != 3 ? this.xpath.evaluate(obj) : this.xpath.selectSingleNode(obj) : this.xpath.numberValueOf(obj) : this.xpath.valueOf(obj);
    }

    public XPath getXPath() {
        return this.xpath;
    }

    /* access modifiers changed from: protected */
    public void handleException(Exception exc) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Caught: ");
        stringBuffer.append(exc);
        printStream.println(stringBuffer.toString());
    }

    public void setColumnNameXPath(XPath xPath) {
        this.columnNameXPath = xPath;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setXPath(XPath xPath) {
        this.xpath = xPath;
    }
}
