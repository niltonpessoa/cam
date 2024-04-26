package org.dom4j.dom;

import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.DefaultAttribute;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMAttribute extends DefaultAttribute implements Attr {
    public DOMAttribute(Element element, QName qName, String str) {
        super(element, qName, str);
    }

    public DOMAttribute(QName qName) {
        super(qName);
    }

    public DOMAttribute(QName qName, String str) {
        super(qName, str);
    }

    private void checkNewChildNode(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 3 && nodeType != 5) {
            throw new DOMException(3, "The node cannot be a child of attribute");
        }
    }

    public Node appendChild(Node node) {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    public Node cloneNode(boolean z) {
        return DOMNodeHelper.cloneNode(this, z);
    }

    public NamedNodeMap getAttributes() {
        return null;
    }

    public NodeList getChildNodes() {
        return DOMNodeHelper.getChildNodes(this);
    }

    public Node getFirstChild() {
        return DOMNodeHelper.getFirstChild(this);
    }

    public Node getLastChild() {
        return DOMNodeHelper.getLastChild(this);
    }

    public String getLocalName() {
        return getQName().getName();
    }

    public String getNamespaceURI() {
        return getQName().getNamespaceURI();
    }

    public Node getNextSibling() {
        return DOMNodeHelper.getNextSibling(this);
    }

    public String getNodeName() {
        return getName();
    }

    public String getNodeValue() {
        return DOMNodeHelper.getNodeValue(this);
    }

    public Document getOwnerDocument() {
        return DOMNodeHelper.getOwnerDocument(this);
    }

    public org.w3c.dom.Element getOwnerElement() {
        return DOMNodeHelper.asDOMElement(getParent());
    }

    public Node getParentNode() {
        return null;
    }

    public String getPrefix() {
        return getQName().getNamespacePrefix();
    }

    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    public boolean getSpecified() {
        return true;
    }

    public boolean hasAttributes() {
        return DOMNodeHelper.hasAttributes(this);
    }

    public boolean hasChildNodes() {
        return DOMNodeHelper.hasChildNodes(this);
    }

    public Node insertBefore(Node node, Node node2) {
        checkNewChildNode(node);
        return DOMNodeHelper.insertBefore(this, node, node2);
    }

    public boolean isSupported(String str, String str2) {
        return DOMNodeHelper.isSupported(this, str, str2);
    }

    public void normalize() {
        DOMNodeHelper.normalize(this);
    }

    public Node removeChild(Node node) {
        return DOMNodeHelper.removeChild(this, node);
    }

    public Node replaceChild(Node node, Node node2) {
        checkNewChildNode(node);
        return DOMNodeHelper.replaceChild(this, node, node2);
    }

    public void setNodeValue(String str) {
        DOMNodeHelper.setNodeValue(this, str);
    }

    public void setPrefix(String str) {
        DOMNodeHelper.setPrefix(this, str);
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }
}
