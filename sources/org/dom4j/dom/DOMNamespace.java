package org.dom4j.dom;

import org.dom4j.Element;
import org.dom4j.tree.DefaultNamespace;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMNamespace extends DefaultNamespace implements Node {
    public DOMNamespace(String str, String str2) {
        super(str, str2);
    }

    public DOMNamespace(Element element, String str, String str2) {
        super(element, str, str2);
    }

    public Node appendChild(Node node) {
        return DOMNodeHelper.appendChild(this, node);
    }

    public Node cloneNode(boolean z) {
        return DOMNodeHelper.cloneNode(this, z);
    }

    public NamedNodeMap getAttributes() {
        return DOMNodeHelper.getAttributes(this);
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
        return DOMNodeHelper.getLocalName(this);
    }

    public String getNamespaceURI() {
        return DOMNodeHelper.getNamespaceURI(this);
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

    public Node getParentNode() {
        return DOMNodeHelper.getParentNode(this);
    }

    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    public boolean hasAttributes() {
        return DOMNodeHelper.hasAttributes(this);
    }

    public boolean hasChildNodes() {
        return DOMNodeHelper.hasChildNodes(this);
    }

    public Node insertBefore(Node node, Node node2) {
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
