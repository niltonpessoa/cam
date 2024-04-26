package org.dom4j.bean;

import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.tree.DefaultElement;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;

public class BeanElement extends DefaultElement {
    private static final DocumentFactory DOCUMENT_FACTORY = BeanDocumentFactory.getInstance();
    static /* synthetic */ Class class$org$dom4j$bean$BeanElement;
    private Object bean;

    public BeanElement(String str, Object obj) {
        this(DOCUMENT_FACTORY.createQName(str), obj);
    }

    public BeanElement(String str, Namespace namespace, Object obj) {
        this(DOCUMENT_FACTORY.createQName(str, namespace), obj);
    }

    public BeanElement(QName qName) {
        super(qName);
    }

    public BeanElement(QName qName, Object obj) {
        super(qName);
        this.bean = obj;
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public Element addAttribute(String str, String str2) {
        Attribute attribute = attribute(str);
        if (attribute != null) {
            attribute.setValue(str2);
        }
        return this;
    }

    public Element addAttribute(QName qName, String str) {
        Attribute attribute = attribute(qName);
        if (attribute != null) {
            attribute.setValue(str);
        }
        return this;
    }

    public Attribute attribute(String str) {
        return getBeanAttributeList().attribute(str);
    }

    public Attribute attribute(QName qName) {
        return getBeanAttributeList().attribute(qName);
    }

    /* access modifiers changed from: protected */
    public List createAttributeList() {
        return new BeanAttributeList(this);
    }

    /* access modifiers changed from: protected */
    public List createAttributeList(int i) {
        return new BeanAttributeList(this);
    }

    /* access modifiers changed from: protected */
    public BeanAttributeList getBeanAttributeList() {
        return (BeanAttributeList) attributeList();
    }

    public Object getData() {
        return this.bean;
    }

    /* access modifiers changed from: protected */
    public DocumentFactory getDocumentFactory() {
        return DOCUMENT_FACTORY;
    }

    public void setAttributes(List list) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void setAttributes(Attributes attributes, NamespaceStack namespaceStack, boolean z) {
        String value = attributes.getValue("class");
        if (value != null) {
            try {
                Class cls = class$org$dom4j$bean$BeanElement;
                if (cls == null) {
                    cls = class$("org.dom4j.bean.BeanElement");
                    class$org$dom4j$bean$BeanElement = cls;
                }
                setData(Class.forName(value, true, cls.getClassLoader()).newInstance());
                for (int i = 0; i < attributes.getLength(); i++) {
                    String localName = attributes.getLocalName(i);
                    if (!"class".equalsIgnoreCase(localName)) {
                        addAttribute(localName, attributes.getValue(i));
                    }
                }
            } catch (Exception e) {
                ((BeanDocumentFactory) getDocumentFactory()).handleException(e);
            }
        } else {
            super.setAttributes(attributes, namespaceStack, z);
        }
    }

    public void setData(Object obj) {
        this.bean = obj;
        setAttributeList((List) null);
    }
}
