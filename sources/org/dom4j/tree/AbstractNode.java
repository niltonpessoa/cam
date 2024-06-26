package org.dom4j.tree;

import java.io.Serializable;
import java.io.Writer;
import java.util.List;
import org.dom4j.Branch;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.NodeFilter;
import org.dom4j.XPath;
import org.dom4j.rule.Pattern;

public abstract class AbstractNode implements Node, Cloneable, Serializable {
    private static final DocumentFactory DOCUMENT_FACTORY = DocumentFactory.getInstance();
    protected static final String[] NODE_TYPE_NAMES = {"Node", "Element", "Attribute", "Text", "CDATA", "Entity", "Entity", "ProcessingInstruction", "Comment", "Document", "DocumentType", "DocumentFragment", "Notation", "Namespace", "Unknown"};

    public Node asXPathResult(Element element) {
        return supportsParent() ? this : createXPathResult(element);
    }

    public Object clone() {
        if (isReadOnly()) {
            return this;
        }
        try {
            Node node = (Node) super.clone();
            node.setParent((Element) null);
            node.setDocument((Document) null);
            return node;
        } catch (CloneNotSupportedException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("This should never happen. Caught: ");
            stringBuffer.append(e);
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    public Pattern createPattern(String str) {
        return getDocumentFactory().createPattern(str);
    }

    public XPath createXPath(String str) {
        return getDocumentFactory().createXPath(str);
    }

    public NodeFilter createXPathFilter(String str) {
        return getDocumentFactory().createXPathFilter(str);
    }

    /* access modifiers changed from: protected */
    public Node createXPathResult(Element element) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("asXPathResult() not yet implemented fully for: ");
        stringBuffer.append(this);
        throw new RuntimeException(stringBuffer.toString());
    }

    public Node detach() {
        Branch parent = getParent();
        if (!(parent == null && (parent = getDocument()) == null)) {
            parent.remove((Node) this);
        }
        setParent((Element) null);
        setDocument((Document) null);
        return this;
    }

    public Document getDocument() {
        Element parent = getParent();
        if (parent != null) {
            return parent.getDocument();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public DocumentFactory getDocumentFactory() {
        return DOCUMENT_FACTORY;
    }

    public String getName() {
        return null;
    }

    public short getNodeType() {
        return 14;
    }

    public String getNodeTypeName() {
        short nodeType = getNodeType();
        if (nodeType < 0) {
            return "Unknown";
        }
        String[] strArr = NODE_TYPE_NAMES;
        return nodeType >= strArr.length ? "Unknown" : strArr[nodeType];
    }

    public Element getParent() {
        return null;
    }

    public String getPath() {
        return getPath((Element) null);
    }

    public String getStringValue() {
        return getText();
    }

    public String getText() {
        return null;
    }

    public String getUniquePath() {
        return getUniquePath((Element) null);
    }

    public boolean hasContent() {
        return false;
    }

    public boolean isReadOnly() {
        return true;
    }

    public boolean matches(String str) {
        return createXPathFilter(str).matches(this);
    }

    public Number numberValueOf(String str) {
        return createXPath(str).numberValueOf(this);
    }

    public List selectNodes(String str) {
        return createXPath(str).selectNodes(this);
    }

    public List selectNodes(String str, String str2) {
        return selectNodes(str, str2, false);
    }

    public List selectNodes(String str, String str2, boolean z) {
        return createXPath(str).selectNodes(this, createXPath(str2), z);
    }

    public Object selectObject(String str) {
        return createXPath(str).evaluate(this);
    }

    public Node selectSingleNode(String str) {
        return createXPath(str).selectSingleNode(this);
    }

    public void setDocument(Document document) {
    }

    public void setName(String str) {
        throw new UnsupportedOperationException("This node cannot be modified");
    }

    public void setParent(Element element) {
    }

    public void setText(String str) {
        throw new UnsupportedOperationException("This node cannot be modified");
    }

    public boolean supportsParent() {
        return false;
    }

    public String valueOf(String str) {
        return createXPath(str).valueOf(this);
    }

    public void write(Writer writer) {
        writer.write(asXML());
    }
}
