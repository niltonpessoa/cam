package org.jaxen.dom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.jaxen.DefaultNavigator;
import org.jaxen.FunctionCallException;
import org.jaxen.JaxenConstants;
import org.jaxen.Navigator;
import org.jaxen.XPath;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;

public class DocumentNavigator extends DefaultNavigator {
    private static final DocumentNavigator SINGLETON = new DocumentNavigator();

    private static class AttributeIterator implements Iterator {
        private NamedNodeMap map;
        private int pos = 0;

        AttributeIterator(Node node) {
            this.map = node.getAttributes();
        }

        public boolean hasNext() {
            return this.pos < this.map.getLength();
        }

        public Object next() {
            NamedNodeMap namedNodeMap = this.map;
            int i = this.pos;
            this.pos = i + 1;
            Node item = namedNodeMap.item(i);
            if (item != null) {
                return item;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    abstract class NodeIterator implements Iterator {
        private Node node;

        public NodeIterator(Node node2) {
            Node firstNode = getFirstNode(node2);
            while (true) {
                this.node = firstNode;
                if (!isXPathNode(this.node)) {
                    firstNode = getNextNode(this.node);
                } else {
                    return;
                }
            }
        }

        private boolean isXPathNode(Node node2) {
            if (node2 == null) {
                return true;
            }
            short nodeType = node2.getNodeType();
            if (nodeType == 5 || nodeType == 6) {
                return false;
            }
            switch (nodeType) {
                case 10:
                case 11:
                case 12:
                    return false;
                default:
                    return true;
            }
        }

        /* access modifiers changed from: protected */
        public abstract Node getFirstNode(Node node2);

        /* access modifiers changed from: protected */
        public abstract Node getNextNode(Node node2);

        public boolean hasNext() {
            return this.node != null;
        }

        public Object next() {
            Node node2 = this.node;
            if (node2 != null) {
                Node nextNode = getNextNode(node2);
                while (true) {
                    this.node = nextNode;
                    if (isXPathNode(this.node)) {
                        return node2;
                    }
                    nextNode = getNextNode(this.node);
                }
            } else {
                throw new NoSuchElementException();
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static Navigator getInstance() {
        return SINGLETON;
    }

    private StringBuffer getStringValue(Node node, StringBuffer stringBuffer) {
        if (isText(node)) {
            stringBuffer.append(node.getNodeValue());
        } else {
            NodeList childNodes = node.getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                getStringValue(childNodes.item(i), stringBuffer);
            }
        }
        return stringBuffer;
    }

    public Iterator getAttributeAxisIterator(Object obj) {
        return isElement(obj) ? new AttributeIterator((Node) obj) : JaxenConstants.EMPTY_ITERATOR;
    }

    public String getAttributeName(Object obj) {
        Node node = (Node) obj;
        String localName = node.getLocalName();
        return localName == null ? node.getNodeName() : localName;
    }

    public String getAttributeNamespaceUri(Object obj) {
        return ((Node) obj).getNamespaceURI();
    }

    public String getAttributeQName(Object obj) {
        Node node = (Node) obj;
        String nodeName = node.getNodeName();
        return nodeName == null ? node.getLocalName() : nodeName;
    }

    public String getAttributeStringValue(Object obj) {
        if (isAttribute(obj)) {
            return ((Node) obj).getNodeValue();
        }
        return null;
    }

    public Iterator getChildAxisIterator(Object obj) {
        return new NodeIterator(this, (Node) obj) {
            private final /* synthetic */ DocumentNavigator this$0;

            {
                this.this$0 = r1;
            }

            /* access modifiers changed from: protected */
            public Node getFirstNode(Node node) {
                return node.getFirstChild();
            }

            /* access modifiers changed from: protected */
            public Node getNextNode(Node node) {
                return node.getNextSibling();
            }
        };
    }

    public String getCommentStringValue(Object obj) {
        if (isComment(obj)) {
            return ((Node) obj).getNodeValue();
        }
        return null;
    }

    public Object getDocument(String str) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            return newInstance.newDocumentBuilder().parse(str);
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Failed to parse document for URI: ");
            stringBuffer.append(str);
            throw new FunctionCallException(stringBuffer.toString(), e);
        }
    }

    public Object getDocumentNode(Object obj) {
        return isDocument(obj) ? obj : ((Node) obj).getOwnerDocument();
    }

    public Object getElementById(Object obj, String str) {
        Document document = (Document) getDocumentNode(obj);
        if (document != null) {
            return document.getElementById(str);
        }
        return null;
    }

    public String getElementName(Object obj) {
        Node node = (Node) obj;
        String localName = node.getLocalName();
        return localName == null ? node.getNodeName() : localName;
    }

    public String getElementNamespaceUri(Object obj) {
        return ((Node) obj).getNamespaceURI();
    }

    public String getElementQName(Object obj) {
        Node node = (Node) obj;
        String nodeName = node.getNodeName();
        return nodeName == null ? node.getLocalName() : nodeName;
    }

    public String getElementStringValue(Object obj) {
        if (isElement(obj)) {
            return getStringValue((Node) obj, new StringBuffer()).toString();
        }
        return null;
    }

    public Iterator getFollowingAxisIterator(Object obj) {
        return new NodeIterator(this, (Node) obj) {
            private final /* synthetic */ DocumentNavigator this$0;

            {
                this.this$0 = r1;
            }

            /* access modifiers changed from: protected */
            public Node getFirstNode(Node node) {
                if (node == null) {
                    return null;
                }
                Node nextSibling = node.getNextSibling();
                return nextSibling == null ? getFirstNode(node.getParentNode()) : nextSibling;
            }

            /* access modifiers changed from: protected */
            public Node getNextNode(Node node) {
                if (node == null) {
                    return null;
                }
                Node firstChild = node.getFirstChild();
                if (firstChild == null) {
                    firstChild = node.getNextSibling();
                }
                return firstChild == null ? getFirstNode(node.getParentNode()) : firstChild;
            }
        };
    }

    public Iterator getFollowingSiblingAxisIterator(Object obj) {
        return new NodeIterator(this, (Node) obj) {
            private final /* synthetic */ DocumentNavigator this$0;

            {
                this.this$0 = r1;
            }

            /* access modifiers changed from: protected */
            public Node getFirstNode(Node node) {
                return getNextNode(node);
            }

            /* access modifiers changed from: protected */
            public Node getNextNode(Node node) {
                return node.getNextSibling();
            }
        };
    }

    public Iterator getNamespaceAxisIterator(Object obj) {
        if (!isElement(obj)) {
            return JaxenConstants.EMPTY_ITERATOR;
        }
        HashMap hashMap = new HashMap();
        Node node = (Node) obj;
        for (Node node2 = node; node2 != null; node2 = node2.getParentNode()) {
            if (node2.hasAttributes()) {
                NamedNodeMap attributes = node2.getAttributes();
                int length = attributes.getLength();
                for (int i = 0; i < length; i++) {
                    Node item = attributes.item(i);
                    if (item.getNodeName().startsWith("xmlns")) {
                        NamespaceNode namespaceNode = new NamespaceNode(node, item);
                        String nodeName = namespaceNode.getNodeName();
                        if (!hashMap.containsKey(nodeName)) {
                            hashMap.put(nodeName, namespaceNode);
                        }
                    }
                }
            }
        }
        hashMap.put("xml", new NamespaceNode(node, "xml", "http://www.w3.org/XML/1998/namespace"));
        NamespaceNode namespaceNode2 = (NamespaceNode) hashMap.get("");
        if (namespaceNode2 != null && namespaceNode2.getNodeValue().length() == 0) {
            hashMap.remove("");
        }
        return hashMap.values().iterator();
    }

    public String getNamespacePrefix(Object obj) {
        if (isNamespace(obj)) {
            return ((NamespaceNode) obj).getLocalName();
        }
        return null;
    }

    public String getNamespaceStringValue(Object obj) {
        if (isNamespace(obj)) {
            return ((NamespaceNode) obj).getNodeValue();
        }
        return null;
    }

    public Iterator getParentAxisIterator(Object obj) {
        Node node = (Node) obj;
        return node.getNodeType() == 2 ? new NodeIterator(this, node) {
            private final /* synthetic */ DocumentNavigator this$0;

            {
                this.this$0 = r1;
            }

            /* access modifiers changed from: protected */
            public Node getFirstNode(Node node) {
                return ((Attr) node).getOwnerElement();
            }

            /* access modifiers changed from: protected */
            public Node getNextNode(Node node) {
                return null;
            }
        } : new NodeIterator(this, node) {
            private final /* synthetic */ DocumentNavigator this$0;

            {
                this.this$0 = r1;
            }

            /* access modifiers changed from: protected */
            public Node getFirstNode(Node node) {
                return node.getParentNode();
            }

            /* access modifiers changed from: protected */
            public Node getNextNode(Node node) {
                return null;
            }
        };
    }

    public Iterator getPrecedingSiblingAxisIterator(Object obj) {
        return new NodeIterator(this, (Node) obj) {
            private final /* synthetic */ DocumentNavigator this$0;

            {
                this.this$0 = r1;
            }

            /* access modifiers changed from: protected */
            public Node getFirstNode(Node node) {
                return getNextNode(node);
            }

            /* access modifiers changed from: protected */
            public Node getNextNode(Node node) {
                return node.getPreviousSibling();
            }
        };
    }

    public String getProcessingInstructionData(Object obj) {
        return ((ProcessingInstruction) obj).getData();
    }

    public String getProcessingInstructionTarget(Object obj) {
        return ((ProcessingInstruction) obj).getTarget();
    }

    public String getTextStringValue(Object obj) {
        if (isText(obj)) {
            return ((Node) obj).getNodeValue();
        }
        return null;
    }

    public boolean isAttribute(Object obj) {
        if (obj instanceof Node) {
            Node node = (Node) obj;
            return node.getNodeType() == 2 && !"http://www.w3.org/2000/xmlns/".equals(node.getNamespaceURI());
        }
    }

    public boolean isComment(Object obj) {
        return (obj instanceof Node) && ((Node) obj).getNodeType() == 8;
    }

    public boolean isDocument(Object obj) {
        return (obj instanceof Node) && ((Node) obj).getNodeType() == 9;
    }

    public boolean isElement(Object obj) {
        return (obj instanceof Node) && ((Node) obj).getNodeType() == 1;
    }

    public boolean isNamespace(Object obj) {
        return obj instanceof NamespaceNode;
    }

    public boolean isProcessingInstruction(Object obj) {
        return (obj instanceof Node) && ((Node) obj).getNodeType() == 7;
    }

    public boolean isText(Object obj) {
        if (!(obj instanceof Node)) {
            return false;
        }
        short nodeType = ((Node) obj).getNodeType();
        return nodeType == 3 || nodeType == 4;
    }

    public XPath parseXPath(String str) {
        return new DOMXPath(str);
    }

    public String translateNamespacePrefixToUri(String str, Object obj) {
        Iterator namespaceAxisIterator = getNamespaceAxisIterator(obj);
        while (namespaceAxisIterator.hasNext()) {
            NamespaceNode namespaceNode = (NamespaceNode) namespaceAxisIterator.next();
            if (str.equals(namespaceNode.getNodeName())) {
                return namespaceNode.getNodeValue();
            }
        }
        return null;
    }
}
