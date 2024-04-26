package org.dom4j.dom;

import java.io.PrintStream;
import java.util.List;
import org.dom4j.Branch;
import org.dom4j.CharacterData;
import org.dom4j.Element;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class DOMNodeHelper {
    public static final NodeList EMPTY_NODE_LIST = new EmptyNodeList();

    public static class EmptyNodeList implements NodeList {
        public int getLength() {
            return 0;
        }

        public Node item(int i) {
            return null;
        }
    }

    protected DOMNodeHelper() {
    }

    public static Node appendChild(org.dom4j.Node node, Node node2) {
        if (node instanceof Branch) {
            Branch branch = (Branch) node;
            Node parentNode = node2.getParentNode();
            if (parentNode != null) {
                parentNode.removeChild(node2);
            }
            branch.add((org.dom4j.Node) node2);
            return node2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Children not allowed for this node: ");
        stringBuffer.append(node);
        throw new DOMException(3, stringBuffer.toString());
    }

    public static void appendData(CharacterData characterData, String str) {
        if (!characterData.isReadOnly()) {
            String text = characterData.getText();
            if (text == null) {
                characterData.setText(text);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(text);
            stringBuffer.append(str);
            characterData.setText(stringBuffer.toString());
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("CharacterData node is read only: ");
        stringBuffer2.append(characterData);
        throw new DOMException(7, stringBuffer2.toString());
    }

    public static void appendElementsByTagName(List list, Branch branch, String str) {
        boolean equals = "*".equals(str);
        int nodeCount = branch.nodeCount();
        for (int i = 0; i < nodeCount; i++) {
            org.dom4j.Node node = branch.node(i);
            if (node instanceof Element) {
                Element element = (Element) node;
                if (equals || str.equals(element.getName())) {
                    list.add(element);
                }
                appendElementsByTagName(list, element, str);
            }
        }
    }

    public static void appendElementsByTagNameNS(List list, Branch branch, String str, String str2) {
        boolean equals = "*".equals(str);
        boolean equals2 = "*".equals(str2);
        int nodeCount = branch.nodeCount();
        for (int i = 0; i < nodeCount; i++) {
            org.dom4j.Node node = branch.node(i);
            if (node instanceof Element) {
                Element element = (Element) node;
                if ((equals || (((str == null || str.length() == 0) && (element.getNamespaceURI() == null || element.getNamespaceURI().length() == 0)) || (str != null && str.equals(element.getNamespaceURI())))) && (equals2 || str2.equals(element.getName()))) {
                    list.add(element);
                }
                appendElementsByTagNameNS(list, element, str, str2);
            }
        }
    }

    public static Attr asDOMAttr(org.dom4j.Node node) {
        if (node == null) {
            return null;
        }
        if (node instanceof Attr) {
            return (Attr) node;
        }
        notSupported();
        return null;
    }

    public static Document asDOMDocument(org.dom4j.Document document) {
        if (document == null) {
            return null;
        }
        if (document instanceof Document) {
            return (Document) document;
        }
        notSupported();
        return null;
    }

    public static DocumentType asDOMDocumentType(org.dom4j.DocumentType documentType) {
        if (documentType == null) {
            return null;
        }
        if (documentType instanceof DocumentType) {
            return (DocumentType) documentType;
        }
        notSupported();
        return null;
    }

    public static org.w3c.dom.Element asDOMElement(org.dom4j.Node node) {
        if (node == null) {
            return null;
        }
        if (node instanceof org.w3c.dom.Element) {
            return (org.w3c.dom.Element) node;
        }
        notSupported();
        return null;
    }

    public static Node asDOMNode(org.dom4j.Node node) {
        if (node == null) {
            return null;
        }
        if (node instanceof Node) {
            return (Node) node;
        }
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Cannot convert: ");
        stringBuffer.append(node);
        stringBuffer.append(" into a W3C DOM Node");
        printStream.println(stringBuffer.toString());
        notSupported();
        return null;
    }

    public static Text asDOMText(CharacterData characterData) {
        if (characterData == null) {
            return null;
        }
        if (characterData instanceof Text) {
            return (Text) characterData;
        }
        notSupported();
        return null;
    }

    public static Node cloneNode(org.dom4j.Node node, boolean z) {
        return asDOMNode((org.dom4j.Node) node.clone());
    }

    public static NodeList createNodeList(final List list) {
        return new NodeList() {
            public int getLength() {
                return list.size();
            }

            public Node item(int i) {
                if (i >= getLength()) {
                    return null;
                }
                return DOMNodeHelper.asDOMNode((org.dom4j.Node) list.get(i));
            }
        };
    }

    public static void deleteData(CharacterData characterData, int i, int i2) {
        if (characterData.isReadOnly()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("CharacterData node is read only: ");
            stringBuffer.append(characterData);
            throw new DOMException(7, stringBuffer.toString());
        } else if (i2 >= 0) {
            String text = characterData.getText();
            if (text != null) {
                int length = text.length();
                if (i < 0 || i >= length) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No text at offset: ");
                    stringBuffer2.append(i);
                    throw new DOMException(1, stringBuffer2.toString());
                }
                StringBuffer stringBuffer3 = new StringBuffer(text);
                stringBuffer3.delete(i, i2 + i);
                characterData.setText(stringBuffer3.toString());
            }
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Illegal value for count: ");
            stringBuffer4.append(i2);
            throw new DOMException(1, stringBuffer4.toString());
        }
    }

    public static NamedNodeMap getAttributes(org.dom4j.Node node) {
        return null;
    }

    public static NodeList getChildNodes(org.dom4j.Node node) {
        return EMPTY_NODE_LIST;
    }

    public static String getData(CharacterData characterData) {
        return characterData.getText();
    }

    public static Node getFirstChild(org.dom4j.Node node) {
        return null;
    }

    public static Node getLastChild(org.dom4j.Node node) {
        return null;
    }

    public static int getLength(CharacterData characterData) {
        String text = characterData.getText();
        if (text != null) {
            return text.length();
        }
        return 0;
    }

    public static String getLocalName(org.dom4j.Node node) {
        return null;
    }

    public static String getNamespaceURI(org.dom4j.Node node) {
        return null;
    }

    public static Node getNextSibling(org.dom4j.Node node) {
        int indexOf;
        int i;
        Element parent = node.getParent();
        if (parent == null || (indexOf = parent.indexOf(node)) < 0 || (i = indexOf + 1) >= parent.nodeCount()) {
            return null;
        }
        return asDOMNode(parent.node(i));
    }

    public static String getNodeValue(org.dom4j.Node node) {
        return node.getText();
    }

    public static Document getOwnerDocument(org.dom4j.Node node) {
        return asDOMDocument(node.getDocument());
    }

    public static Node getParentNode(org.dom4j.Node node) {
        return asDOMNode(node.getParent());
    }

    public static String getPrefix(org.dom4j.Node node) {
        return null;
    }

    public static Node getPreviousSibling(org.dom4j.Node node) {
        int indexOf;
        Element parent = node.getParent();
        if (parent == null || (indexOf = parent.indexOf(node)) <= 0) {
            return null;
        }
        return asDOMNode(parent.node(indexOf - 1));
    }

    public static boolean hasAttributes(org.dom4j.Node node) {
        return node != null && (node instanceof Element) && ((Element) node).attributeCount() > 0;
    }

    public static boolean hasChildNodes(org.dom4j.Node node) {
        return false;
    }

    public static Node insertBefore(org.dom4j.Node node, Node node2, Node node3) {
        if (node instanceof Branch) {
            Branch branch = (Branch) node;
            List content = branch.content();
            int indexOf = content.indexOf(node3);
            if (indexOf < 0) {
                branch.add((org.dom4j.Node) node2);
            } else {
                content.add(indexOf, node2);
            }
            return node2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Children not allowed for this node: ");
        stringBuffer.append(node);
        throw new DOMException(3, stringBuffer.toString());
    }

    public static void insertData(CharacterData characterData, int i, String str) {
        if (!characterData.isReadOnly()) {
            String text = characterData.getText();
            if (text == null) {
                characterData.setText(str);
                return;
            }
            int length = text.length();
            if (i < 0 || i > length) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("No text at offset: ");
                stringBuffer.append(i);
                throw new DOMException(1, stringBuffer.toString());
            }
            StringBuffer stringBuffer2 = new StringBuffer(text);
            stringBuffer2.insert(i, str);
            characterData.setText(stringBuffer2.toString());
            return;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("CharacterData node is read only: ");
        stringBuffer3.append(characterData);
        throw new DOMException(7, stringBuffer3.toString());
    }

    public static boolean isSupported(org.dom4j.Node node, String str, String str2) {
        return false;
    }

    public static void normalize(org.dom4j.Node node) {
        notSupported();
    }

    public static void notSupported() {
        throw new DOMException(9, "Not supported yet");
    }

    public static Node removeChild(org.dom4j.Node node, Node node2) {
        if (node instanceof Branch) {
            ((Branch) node).remove((org.dom4j.Node) node2);
            return node2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Children not allowed for this node: ");
        stringBuffer.append(node);
        throw new DOMException(3, stringBuffer.toString());
    }

    public static Node replaceChild(org.dom4j.Node node, Node node2, Node node3) {
        if (node instanceof Branch) {
            List content = ((Branch) node).content();
            int indexOf = content.indexOf(node3);
            if (indexOf >= 0) {
                content.set(indexOf, node2);
                return node3;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Tried to replace a non existing child for node: ");
            stringBuffer.append(node);
            throw new DOMException(8, stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Children not allowed for this node: ");
        stringBuffer2.append(node);
        throw new DOMException(3, stringBuffer2.toString());
    }

    public static void replaceData(CharacterData characterData, int i, int i2, String str) {
        if (characterData.isReadOnly()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("CharacterData node is read only: ");
            stringBuffer.append(characterData);
            throw new DOMException(7, stringBuffer.toString());
        } else if (i2 >= 0) {
            String text = characterData.getText();
            if (text != null) {
                int length = text.length();
                if (i < 0 || i >= length) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No text at offset: ");
                    stringBuffer2.append(i);
                    throw new DOMException(1, stringBuffer2.toString());
                }
                StringBuffer stringBuffer3 = new StringBuffer(text);
                stringBuffer3.replace(i, i2 + i, str);
                characterData.setText(stringBuffer3.toString());
            }
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Illegal value for count: ");
            stringBuffer4.append(i2);
            throw new DOMException(1, stringBuffer4.toString());
        }
    }

    public static void setData(CharacterData characterData, String str) {
        characterData.setText(str);
    }

    public static void setNodeValue(org.dom4j.Node node, String str) {
        node.setText(str);
    }

    public static void setPrefix(org.dom4j.Node node, String str) {
        notSupported();
    }

    public static String substringData(CharacterData characterData, int i, int i2) {
        if (i2 >= 0) {
            String text = characterData.getText();
            int length = text != null ? text.length() : 0;
            if (i < 0 || i >= length) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("No text at offset: ");
                stringBuffer.append(i);
                throw new DOMException(1, stringBuffer.toString());
            }
            int i3 = i2 + i;
            return i3 > length ? text.substring(i) : text.substring(i, i3);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Illegal value for count: ");
        stringBuffer2.append(i2);
        throw new DOMException(1, stringBuffer2.toString());
    }

    public static boolean supports(org.dom4j.Node node, String str, String str2) {
        return false;
    }
}
