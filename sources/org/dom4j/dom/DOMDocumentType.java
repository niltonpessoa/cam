package org.dom4j.dom;

import org.dom4j.tree.DefaultDocumentType;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMDocumentType extends DefaultDocumentType implements DocumentType {
    public DOMDocumentType() {
    }

    public DOMDocumentType(String str, String str2) {
        super(str, str2);
    }

    public DOMDocumentType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    private void checkNewChildNode(Node node) {
        throw new DOMException(3, "DocumentType nodes cannot have children");
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

    public NamedNodeMap getEntities() {
        return null;
    }

    public Node getFirstChild() {
        return DOMNodeHelper.getFirstChild(this);
    }

    public String getInternalSubset() {
        return getElementName();
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

    public NamedNodeMap getNotations() {
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

    public String getPublicId() {
        return getPublicID();
    }

    public String getSystemId() {
        return getSystemID();
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
