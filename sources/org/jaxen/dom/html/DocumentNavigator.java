package org.jaxen.dom.html;

import java.util.Locale;
import org.jaxen.Navigator;
import org.jaxen.XPath;
import org.w3c.dom.Node;

public class DocumentNavigator extends org.jaxen.dom.DocumentNavigator {
    private static final DocumentNavigator LOWERCASE = new DocumentNavigator(true);
    private static final DocumentNavigator UPPERCASE = new DocumentNavigator(false);
    private final boolean toLowerCase;

    public DocumentNavigator() {
        this(true);
    }

    public DocumentNavigator(boolean z) {
        this.toLowerCase = z;
    }

    public static Navigator getInstance(boolean z) {
        return z ? LOWERCASE : UPPERCASE;
    }

    private boolean isXMLNode(Node node) {
        return (node == null || node.getNamespaceURI() == null) ? false : true;
    }

    public String getElementName(Object obj) {
        return getHTMLNodeName((Node) obj, super.getElementName(obj));
    }

    public String getElementQName(Object obj) {
        return getHTMLNodeName((Node) obj, super.getElementQName(obj));
    }

    /* access modifiers changed from: protected */
    public String getHTMLNodeName(Node node, String str) {
        return (str == null || isXMLNode(node)) ? str : this.toLowerCase ? str.toLowerCase(Locale.ENGLISH) : str.toUpperCase(Locale.ENGLISH);
    }

    public boolean isToLowerCase() {
        return this.toLowerCase;
    }

    public XPath parseXPath(String str) {
        return new HTMLXPath(str);
    }
}
