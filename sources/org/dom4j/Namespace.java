package org.dom4j;

import org.dom4j.tree.AbstractNode;
import org.dom4j.tree.DefaultNamespace;
import org.dom4j.tree.NamespaceCache;

public class Namespace extends AbstractNode {
    protected static final NamespaceCache CACHE;
    public static final Namespace NO_NAMESPACE;
    public static final Namespace XML_NAMESPACE;
    private int hashCode;
    private String prefix;
    private String uri;

    static {
        NamespaceCache namespaceCache = new NamespaceCache();
        CACHE = namespaceCache;
        XML_NAMESPACE = namespaceCache.get("xml", "http://www.w3.org/XML/1998/namespace");
        NO_NAMESPACE = namespaceCache.get("", "");
    }

    public Namespace(String str, String str2) {
        this.prefix = str == null ? "" : str;
        this.uri = str2 == null ? "" : str2;
    }

    public static Namespace get(String str) {
        return CACHE.get(str);
    }

    public static Namespace get(String str, String str2) {
        return CACHE.get(str, str2);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String asXML() {
        String str;
        StringBuffer stringBuffer = new StringBuffer(10);
        String prefix2 = getPrefix();
        if (prefix2 == null || prefix2.length() <= 0) {
            str = "xmlns=\"";
        } else {
            stringBuffer.append("xmlns:");
            stringBuffer.append(prefix2);
            str = "=\"";
        }
        stringBuffer.append(str);
        stringBuffer.append(getURI());
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public int createHashCode() {
        int hashCode2 = this.uri.hashCode() ^ this.prefix.hashCode();
        if (hashCode2 == 0) {
            return 47806;
        }
        return hashCode2;
    }

    /* access modifiers changed from: protected */
    public Node createXPathResult(Element element) {
        return new DefaultNamespace(element, getPrefix(), getURI());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Namespace) {
            Namespace namespace = (Namespace) obj;
            return hashCode() == namespace.hashCode() && this.uri.equals(namespace.getURI()) && this.prefix.equals(namespace.getPrefix());
        }
        return false;
    }

    public short getNodeType() {
        return 13;
    }

    public String getPath(Element element) {
        StringBuffer stringBuffer = new StringBuffer(10);
        Element parent = getParent();
        if (!(parent == null || parent == element)) {
            stringBuffer.append(parent.getPath(element));
            stringBuffer.append('/');
        }
        stringBuffer.append(getXPathNameStep());
        return stringBuffer.toString();
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getStringValue() {
        return this.uri;
    }

    public String getText() {
        return this.uri;
    }

    public String getURI() {
        return this.uri;
    }

    public String getUniquePath(Element element) {
        StringBuffer stringBuffer = new StringBuffer(10);
        Element parent = getParent();
        if (!(parent == null || parent == element)) {
            stringBuffer.append(parent.getUniquePath(element));
            stringBuffer.append('/');
        }
        stringBuffer.append(getXPathNameStep());
        return stringBuffer.toString();
    }

    public String getXPathNameStep() {
        String str = this.prefix;
        if (str == null || "".equals(str)) {
            return "namespace::*[name()='']";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("namespace::");
        stringBuffer.append(this.prefix);
        return stringBuffer.toString();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = createHashCode();
        }
        return this.hashCode;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" [Namespace: prefix ");
        stringBuffer.append(getPrefix());
        stringBuffer.append(" mapped to URI \"");
        stringBuffer.append(getURI());
        stringBuffer.append("\"]");
        return stringBuffer.toString();
    }
}
