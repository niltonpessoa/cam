package org.jaxen.jdom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jaxen.DefaultNavigator;
import org.jaxen.FunctionCallException;
import org.jaxen.JaxenConstants;
import org.jaxen.NamedAccessNavigator;
import org.jaxen.Navigator;
import org.jaxen.XPath;
import org.jaxen.util.SingleObjectIterator;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import org.jdom.input.SAXBuilder;

public class DocumentNavigator extends DefaultNavigator implements NamedAccessNavigator {

    private static class Singleton {
        /* access modifiers changed from: private */
        public static DocumentNavigator instance = new DocumentNavigator();

        private Singleton() {
        }
    }

    public static Navigator getInstance() {
        return Singleton.instance;
    }

    public Iterator getAttributeAxisIterator(Object obj) {
        return !(obj instanceof Element) ? JaxenConstants.EMPTY_ITERATOR : ((Element) obj).getAttributes().iterator();
    }

    public Iterator getAttributeAxisIterator(Object obj, String str, String str2, String str3) {
        if (obj instanceof Element) {
            Attribute attribute = ((Element) obj).getAttribute(str, str3 == null ? Namespace.NO_NAMESPACE : Namespace.getNamespace(str2, str3));
            if (attribute != null) {
                return new SingleObjectIterator(attribute);
            }
        }
        return JaxenConstants.EMPTY_ITERATOR;
    }

    public String getAttributeName(Object obj) {
        return ((Attribute) obj).getName();
    }

    public String getAttributeNamespaceUri(Object obj) {
        String namespaceURI = ((Attribute) obj).getNamespaceURI();
        if (namespaceURI == null || namespaceURI.length() != 0) {
            return namespaceURI;
        }
        return null;
    }

    public String getAttributeQName(Object obj) {
        Attribute attribute = (Attribute) obj;
        String namespacePrefix = attribute.getNamespacePrefix();
        if (namespacePrefix == null || "".equals(namespacePrefix)) {
            return attribute.getName();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(namespacePrefix);
        stringBuffer.append(":");
        stringBuffer.append(attribute.getName());
        return stringBuffer.toString();
    }

    public String getAttributeStringValue(Object obj) {
        return ((Attribute) obj).getValue();
    }

    public Iterator getChildAxisIterator(Object obj) {
        List content;
        if (obj instanceof Element) {
            content = ((Element) obj).getContent();
        } else if (!(obj instanceof Document)) {
            return JaxenConstants.EMPTY_ITERATOR;
        } else {
            content = ((Document) obj).getContent();
        }
        return content.iterator();
    }

    public Iterator getChildAxisIterator(Object obj, String str, String str2, String str3) {
        if (obj instanceof Element) {
            Element element = (Element) obj;
            return (str3 == null ? element.getChildren(str) : element.getChildren(str, Namespace.getNamespace(str2, str3))).iterator();
        } else if (!(obj instanceof Document)) {
            return JaxenConstants.EMPTY_ITERATOR;
        } else {
            Element rootElement = ((Document) obj).getRootElement();
            return !rootElement.getName().equals(str) ? JaxenConstants.EMPTY_ITERATOR : (str3 == null || Namespace.getNamespace(str2, str3).equals(rootElement.getNamespace())) ? new SingleObjectIterator(rootElement) : JaxenConstants.EMPTY_ITERATOR;
        }
    }

    public String getCommentStringValue(Object obj) {
        return ((Comment) obj).getText();
    }

    public Object getDocument(String str) {
        try {
            return new SAXBuilder().build(str);
        } catch (Exception e) {
            throw new FunctionCallException(e.getMessage());
        }
    }

    public Object getDocumentNode(Object obj) {
        return obj instanceof Document ? obj : ((Element) obj).getDocument();
    }

    public String getElementName(Object obj) {
        return ((Element) obj).getName();
    }

    public String getElementNamespaceUri(Object obj) {
        String namespaceURI = ((Element) obj).getNamespaceURI();
        if (namespaceURI == null || namespaceURI.length() != 0) {
            return namespaceURI;
        }
        return null;
    }

    public String getElementQName(Object obj) {
        Element element = (Element) obj;
        String namespacePrefix = element.getNamespacePrefix();
        if (namespacePrefix == null || namespacePrefix.length() == 0) {
            return element.getName();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(namespacePrefix);
        stringBuffer.append(":");
        stringBuffer.append(element.getName());
        return stringBuffer.toString();
    }

    public String getElementStringValue(Object obj) {
        String elementStringValue;
        StringBuffer stringBuffer = new StringBuffer();
        for (Object next : ((Element) obj).getContent()) {
            if (next instanceof Text) {
                elementStringValue = ((Text) next).getText();
            } else if (next instanceof CDATA) {
                elementStringValue = ((CDATA) next).getText();
            } else if (next instanceof Element) {
                elementStringValue = getElementStringValue(next);
            }
            stringBuffer.append(elementStringValue);
        }
        return stringBuffer.toString();
    }

    public Iterator getNamespaceAxisIterator(Object obj) {
        if (!(obj instanceof Element)) {
            return JaxenConstants.EMPTY_ITERATOR;
        }
        Element element = (Element) obj;
        HashMap hashMap = new HashMap();
        for (Element element2 = element; element2 != null; element2 = element2.getParent() instanceof Element ? (Element) element2.getParent() : null) {
            Namespace namespace = element2.getNamespace();
            if (namespace != Namespace.NO_NAMESPACE && !hashMap.containsKey(namespace.getPrefix())) {
                hashMap.put(namespace.getPrefix(), new XPathNamespace(element, namespace));
            }
            for (Namespace namespace2 : element2.getAdditionalNamespaces()) {
                if (!hashMap.containsKey(namespace2.getPrefix())) {
                    hashMap.put(namespace2.getPrefix(), new XPathNamespace(element, namespace2));
                }
            }
        }
        hashMap.put("xml", new XPathNamespace(element, Namespace.XML_NAMESPACE));
        return hashMap.values().iterator();
    }

    public String getNamespacePrefix(Object obj) {
        return (obj instanceof Namespace ? (Namespace) obj : ((XPathNamespace) obj).getJDOMNamespace()).getPrefix();
    }

    public String getNamespaceStringValue(Object obj) {
        return (obj instanceof Namespace ? (Namespace) obj : ((XPathNamespace) obj).getJDOMNamespace()).getURI();
    }

    public Iterator getParentAxisIterator(Object obj) {
        Document document;
        if (obj instanceof Document) {
            return JaxenConstants.EMPTY_ITERATOR;
        }
        if (obj instanceof Element) {
            Element element = (Element) obj;
            document = element.getParent();
            if (document == null && element.isRootElement()) {
                document = element.getDocument();
            }
        } else {
            document = obj instanceof Attribute ? ((Attribute) obj).getParent() : obj instanceof XPathNamespace ? ((XPathNamespace) obj).getJDOMElement() : obj instanceof ProcessingInstruction ? ((ProcessingInstruction) obj).getParent() : obj instanceof Comment ? ((Comment) obj).getParent() : obj instanceof Text ? ((Text) obj).getParent() : null;
        }
        return document != null ? new SingleObjectIterator(document) : JaxenConstants.EMPTY_ITERATOR;
    }

    public String getProcessingInstructionData(Object obj) {
        return ((ProcessingInstruction) obj).getData();
    }

    public String getProcessingInstructionTarget(Object obj) {
        return ((ProcessingInstruction) obj).getTarget();
    }

    public String getTextStringValue(Object obj) {
        return obj instanceof Text ? ((Text) obj).getText() : obj instanceof CDATA ? ((CDATA) obj).getText() : "";
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
        return (obj instanceof Namespace) || (obj instanceof XPathNamespace);
    }

    public boolean isProcessingInstruction(Object obj) {
        return obj instanceof ProcessingInstruction;
    }

    public boolean isText(Object obj) {
        return (obj instanceof Text) || (obj instanceof CDATA);
    }

    public XPath parseXPath(String str) {
        return new JDOMXPath(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String translateNamespacePrefixToUri(java.lang.String r3, java.lang.Object r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof org.jdom.Element
            r1 = 0
            if (r0 == 0) goto L_0x0008
        L_0x0005:
            org.jdom.Element r4 = (org.jdom.Element) r4
            goto L_0x0040
        L_0x0008:
            boolean r0 = r4 instanceof org.jdom.Text
            if (r0 == 0) goto L_0x0013
            org.jdom.Text r4 = (org.jdom.Text) r4
            org.jdom.Parent r4 = r4.getParent()
            goto L_0x0005
        L_0x0013:
            boolean r0 = r4 instanceof org.jdom.Attribute
            if (r0 == 0) goto L_0x001e
            org.jdom.Attribute r4 = (org.jdom.Attribute) r4
            org.jdom.Element r4 = r4.getParent()
            goto L_0x0040
        L_0x001e:
            boolean r0 = r4 instanceof org.jaxen.jdom.XPathNamespace
            if (r0 == 0) goto L_0x0029
            org.jaxen.jdom.XPathNamespace r4 = (org.jaxen.jdom.XPathNamespace) r4
            org.jdom.Element r4 = r4.getJDOMElement()
            goto L_0x0040
        L_0x0029:
            boolean r0 = r4 instanceof org.jdom.Comment
            if (r0 == 0) goto L_0x0034
            org.jdom.Comment r4 = (org.jdom.Comment) r4
            org.jdom.Parent r4 = r4.getParent()
            goto L_0x0005
        L_0x0034:
            boolean r0 = r4 instanceof org.jdom.ProcessingInstruction
            if (r0 == 0) goto L_0x003f
            org.jdom.ProcessingInstruction r4 = (org.jdom.ProcessingInstruction) r4
            org.jdom.Parent r4 = r4.getParent()
            goto L_0x0005
        L_0x003f:
            r4 = r1
        L_0x0040:
            if (r4 == 0) goto L_0x004d
            org.jdom.Namespace r3 = r4.getNamespace(r3)
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = r3.getURI()
            return r3
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jaxen.jdom.DocumentNavigator.translateNamespacePrefixToUri(java.lang.String, java.lang.Object):java.lang.String");
    }
}
