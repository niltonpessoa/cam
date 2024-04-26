package org.jaxen.dom;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NamespaceNode implements Node {
    public static final short NAMESPACE_NODE = 13;
    private String name;
    private Node parent;
    private String value;

    private static class EmptyNodeList implements NodeList {
        private EmptyNodeList() {
        }

        public int getLength() {
            return 0;
        }

        public Node item(int i) {
            return null;
        }
    }

    public NamespaceNode(Node node, String str, String str2) {
        this.parent = node;
        this.name = str;
        this.value = str2;
    }

    NamespaceNode(Node node, Node node2) {
        String nodeName = node2.getNodeName();
        this.name = nodeName.equals("xmlns") ? "" : nodeName.substring(6);
        this.parent = node;
        this.value = node2.getNodeValue();
    }

    private void disallowModification() {
        throw new DOMException(7, "Namespace node may not be modified");
    }

    private boolean equals(Object obj, Object obj2) {
        return (obj == null && obj2 == null) || (obj != null && obj.equals(obj2));
    }

    private int hashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public Node appendChild(Node node) {
        disallowModification();
        return null;
    }

    public Node cloneNode(boolean z) {
        return new NamespaceNode(this.parent, this.name, this.value);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof NamespaceNode)) {
            return false;
        }
        NamespaceNode namespaceNode = (NamespaceNode) obj;
        return equals(this.parent, namespaceNode.getParentNode()) && equals(this.name, namespaceNode.getNodeName()) && equals(this.value, namespaceNode.getNodeValue());
    }

    public NamedNodeMap getAttributes() {
        return null;
    }

    public NodeList getChildNodes() {
        return new EmptyNodeList();
    }

    public Node getFirstChild() {
        return null;
    }

    public Node getLastChild() {
        return null;
    }

    public String getLocalName() {
        return this.name;
    }

    public String getNamespaceURI() {
        return null;
    }

    public Node getNextSibling() {
        return null;
    }

    public String getNodeName() {
        return this.name;
    }

    public short getNodeType() {
        return 13;
    }

    public String getNodeValue() {
        return this.value;
    }

    public Document getOwnerDocument() {
        Node node = this.parent;
        if (node == null) {
            return null;
        }
        return node.getOwnerDocument();
    }

    public Node getParentNode() {
        return this.parent;
    }

    public String getPrefix() {
        return null;
    }

    public Node getPreviousSibling() {
        return null;
    }

    public boolean hasAttributes() {
        return false;
    }

    public boolean hasChildNodes() {
        return false;
    }

    public int hashCode() {
        return hashCode(this.parent) + hashCode(this.name) + hashCode(this.value);
    }

    public Node insertBefore(Node node, Node node2) {
        disallowModification();
        return null;
    }

    public boolean isSupported(String str, String str2) {
        return false;
    }

    public void normalize() {
    }

    public Node removeChild(Node node) {
        disallowModification();
        return null;
    }

    public Node replaceChild(Node node, Node node2) {
        disallowModification();
        return null;
    }

    public void setNodeValue(String str) {
        disallowModification();
    }

    public void setPrefix(String str) {
        disallowModification();
    }
}
