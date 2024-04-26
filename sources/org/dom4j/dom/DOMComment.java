package org.dom4j.dom;

import org.dom4j.Element;
import org.dom4j.tree.DefaultComment;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMComment extends DefaultComment implements Comment {
    public DOMComment(String str) {
        super(str);
    }

    public DOMComment(Element element, String str) {
        super(element, str);
    }

    private void checkNewChildNode(Node node) {
        throw new DOMException(3, "Comment nodes cannot have children");
    }

    public Node appendChild(Node node) {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    public void appendData(String str) {
        DOMNodeHelper.appendData(this, str);
    }

    public Node cloneNode(boolean z) {
        return DOMNodeHelper.cloneNode(this, z);
    }

    public void deleteData(int i, int i2) {
        DOMNodeHelper.deleteData(this, i, i2);
    }

    public NamedNodeMap getAttributes() {
        return null;
    }

    public NodeList getChildNodes() {
        return DOMNodeHelper.getChildNodes(this);
    }

    public String getData() {
        return DOMNodeHelper.getData(this);
    }

    public Node getFirstChild() {
        return DOMNodeHelper.getFirstChild(this);
    }

    public Node getLastChild() {
        return DOMNodeHelper.getLastChild(this);
    }

    public int getLength() {
        return DOMNodeHelper.getLength(this);
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
        return "#comment";
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

    public void insertData(int i, String str) {
        DOMNodeHelper.insertData(this, i, str);
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

    public void replaceData(int i, int i2, String str) {
        DOMNodeHelper.replaceData(this, i, i2, str);
    }

    public void setData(String str) {
        DOMNodeHelper.setData(this, str);
    }

    public void setNodeValue(String str) {
        DOMNodeHelper.setNodeValue(this, str);
    }

    public void setPrefix(String str) {
        DOMNodeHelper.setPrefix(this, str);
    }

    public String substringData(int i, int i2) {
        return DOMNodeHelper.substringData(this, i, i2);
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }
}
