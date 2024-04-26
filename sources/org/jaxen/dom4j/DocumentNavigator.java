package org.jaxen.dom4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Branch;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;
import org.dom4j.Text;
import org.dom4j.io.SAXReader;
import org.jaxen.DefaultNavigator;
import org.jaxen.FunctionCallException;
import org.jaxen.JaxenConstants;
import org.jaxen.NamedAccessNavigator;
import org.jaxen.Navigator;
import org.jaxen.XPath;
import org.jaxen.util.SingleObjectIterator;

public class DocumentNavigator extends DefaultNavigator implements NamedAccessNavigator {
    private transient SAXReader reader;

    private static class Singleton {
        /* access modifiers changed from: private */
        public static DocumentNavigator instance = new DocumentNavigator();

        private Singleton() {
        }
    }

    public static Navigator getInstance() {
        return Singleton.instance;
    }

    private String getNodeStringValue(Node node) {
        return node.getStringValue();
    }

    public Iterator getAttributeAxisIterator(Object obj) {
        return !(obj instanceof Element) ? JaxenConstants.EMPTY_ITERATOR : ((Element) obj).attributeIterator();
    }

    public Iterator getAttributeAxisIterator(Object obj, String str, String str2, String str3) {
        if (!(obj instanceof Element)) {
            return JaxenConstants.EMPTY_ITERATOR;
        }
        Attribute attribute = ((Element) obj).attribute(QName.get(str, str2, str3));
        return attribute == null ? JaxenConstants.EMPTY_ITERATOR : new SingleObjectIterator(attribute);
    }

    public String getAttributeName(Object obj) {
        return ((Attribute) obj).getName();
    }

    public String getAttributeNamespaceUri(Object obj) {
        String namespaceURI = ((Attribute) obj).getNamespaceURI();
        return namespaceURI == null ? "" : namespaceURI;
    }

    public String getAttributeQName(Object obj) {
        return ((Attribute) obj).getQualifiedName();
    }

    public String getAttributeStringValue(Object obj) {
        return getNodeStringValue((Node) obj);
    }

    public Iterator getChildAxisIterator(Object obj) {
        Iterator nodeIterator = obj instanceof Branch ? ((Branch) obj).nodeIterator() : null;
        return nodeIterator != null ? nodeIterator : JaxenConstants.EMPTY_ITERATOR;
    }

    public Iterator getChildAxisIterator(Object obj, String str, String str2, String str3) {
        if (obj instanceof Element) {
            return ((Element) obj).elementIterator(QName.get(str, str2, str3));
        }
        if (!(obj instanceof Document)) {
            return JaxenConstants.EMPTY_ITERATOR;
        }
        Element rootElement = ((Document) obj).getRootElement();
        return !rootElement.getName().equals(str) ? JaxenConstants.EMPTY_ITERATOR : (str3 == null || str3.equals(rootElement.getNamespaceURI())) ? new SingleObjectIterator(rootElement) : JaxenConstants.EMPTY_ITERATOR;
    }

    public String getCommentStringValue(Object obj) {
        return ((Comment) obj).getText();
    }

    public Object getDocument(String str) {
        try {
            return getSAXReader().read(str);
        } catch (DocumentException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Failed to parse document for URI: ");
            stringBuffer.append(str);
            throw new FunctionCallException(stringBuffer.toString(), e);
        }
    }

    public Object getDocumentNode(Object obj) {
        if (obj instanceof Document) {
            return obj;
        }
        if (obj instanceof Node) {
            return ((Node) obj).getDocument();
        }
        return null;
    }

    public String getElementName(Object obj) {
        return ((Element) obj).getName();
    }

    public String getElementNamespaceUri(Object obj) {
        String namespaceURI = ((Element) obj).getNamespaceURI();
        return namespaceURI == null ? "" : namespaceURI;
    }

    public String getElementQName(Object obj) {
        return ((Element) obj).getQualifiedName();
    }

    public String getElementStringValue(Object obj) {
        return getNodeStringValue((Node) obj);
    }

    public Iterator getNamespaceAxisIterator(Object obj) {
        if (!(obj instanceof Element)) {
            return JaxenConstants.EMPTY_ITERATOR;
        }
        Element element = (Element) obj;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Element element2 = element; element2 != null; element2 = element2.getParent()) {
            List<Namespace> declaredNamespaces = element2.declaredNamespaces();
            declaredNamespaces.add(element2.getNamespace());
            for (Attribute namespace : element2.attributes()) {
                declaredNamespaces.add(namespace.getNamespace());
            }
            for (Namespace namespace2 : declaredNamespaces) {
                if (namespace2 != Namespace.NO_NAMESPACE) {
                    String prefix = namespace2.getPrefix();
                    if (!hashSet.contains(prefix)) {
                        hashSet.add(prefix);
                        arrayList.add(namespace2.asXPathResult(element));
                    }
                }
            }
        }
        arrayList.add(Namespace.XML_NAMESPACE.asXPathResult(element));
        return arrayList.iterator();
    }

    public String getNamespacePrefix(Object obj) {
        return ((Namespace) obj).getPrefix();
    }

    public String getNamespaceStringValue(Object obj) {
        return ((Namespace) obj).getURI();
    }

    public short getNodeType(Object obj) {
        if (obj instanceof Node) {
            return ((Node) obj).getNodeType();
        }
        return 0;
    }

    public Iterator getParentAxisIterator(Object obj) {
        if (obj instanceof Document) {
            return JaxenConstants.EMPTY_ITERATOR;
        }
        Node node = (Node) obj;
        Object parent = node.getParent();
        if (parent == null) {
            parent = node.getDocument();
        }
        return new SingleObjectIterator(parent);
    }

    public Object getParentNode(Object obj) {
        if (!(obj instanceof Node)) {
            return null;
        }
        Node node = (Node) obj;
        Object parent = node.getParent();
        if (parent == null && (parent = node.getDocument()) == obj) {
            return null;
        }
        return parent;
    }

    public String getProcessingInstructionData(Object obj) {
        return ((ProcessingInstruction) obj).getText();
    }

    public String getProcessingInstructionTarget(Object obj) {
        return ((ProcessingInstruction) obj).getTarget();
    }

    public SAXReader getSAXReader() {
        if (this.reader == null) {
            SAXReader sAXReader = new SAXReader();
            this.reader = sAXReader;
            sAXReader.setMergeAdjacentText(true);
        }
        return this.reader;
    }

    public String getTextStringValue(Object obj) {
        return getNodeStringValue((Node) obj);
    }

    public boolean isAttribute(Object obj) {
        return obj instanceof Attribute;
    }

    public boolean isComment(Object obj) {
        return obj instanceof Comment;
    }

    public boolean isDocument(Object obj) {
        return obj instanceof Document;
    }

    public boolean isElement(Object obj) {
        return obj instanceof Element;
    }

    public boolean isNamespace(Object obj) {
        return obj instanceof Namespace;
    }

    public boolean isProcessingInstruction(Object obj) {
        return obj instanceof ProcessingInstruction;
    }

    public boolean isText(Object obj) {
        return (obj instanceof Text) || (obj instanceof CDATA);
    }

    public XPath parseXPath(String str) {
        return new Dom4jXPath(str);
    }

    public void setSAXReader(SAXReader sAXReader) {
        this.reader = sAXReader;
    }

    public String translateNamespacePrefixToUri(String str, Object obj) {
        Namespace namespaceForPrefix;
        Element parent = obj instanceof Element ? (Element) obj : obj instanceof Node ? ((Node) obj).getParent() : null;
        if (parent == null || (namespaceForPrefix = parent.getNamespaceForPrefix(str)) == null) {
            return null;
        }
        return namespaceForPrefix.getURI();
    }
}
