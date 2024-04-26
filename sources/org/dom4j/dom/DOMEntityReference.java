package org.dom4j.dom;

import org.dom4j.Element;
import org.dom4j.tree.DefaultEntity;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMEntityReference extends DefaultEntity implements EntityReference {
    public DOMEntityReference(String str) {
        super(str);
    }

    public DOMEntityReference(String str, String str2) {
        super(str, str2);
    }

    public DOMEntityReference(Element element, String str, String str2) {
        super(element, str, str2);
    }

    private void checkNewChildNode(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 1 && nodeType != 3 && nodeType != 8 && nodeType != 7 && nodeType != 4 && nodeType != 5) {
            throw new DOMException(3, "Given node cannot be a child of an entity reference");
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
        return null;
    }

    public Document getOwnerDocument() {
        return DOMNodeHelper.getOwnerDocument(this);
    }

    public Node getParentNode() {
        return DOMNodeHelper.getParentNode(this);
    }

    public String getPrefix() {
        return DOMNodeHelper.getPrefix(this);
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
    }

    public void setPrefix(String str) {
        DOMNodeHelper.setPrefix(this, str);
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }
}
