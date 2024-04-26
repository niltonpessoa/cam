package org.dom4j.bean;

import java.io.PrintStream;
import org.dom4j.Attribute;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.DefaultAttribute;
import org.xml.sax.Attributes;

public class BeanDocumentFactory extends DocumentFactory {
    static /* synthetic */ Class class$org$dom4j$bean$BeanDocumentFactory;
    private static BeanDocumentFactory singleton = new BeanDocumentFactory();

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static DocumentFactory getInstance() {
        return singleton;
    }

    public Attribute createAttribute(Element element, QName qName, String str) {
        return new DefaultAttribute(qName, str);
    }

    /* access modifiers changed from: protected */
    public Object createBean(QName qName) {
        return null;
    }

    /* access modifiers changed from: protected */
    public Object createBean(QName qName, Attributes attributes) {
        String value = attributes.getValue("class");
        if (value == null) {
            return null;
        }
        try {
            Class cls = class$org$dom4j$bean$BeanDocumentFactory;
            if (cls == null) {
                cls = class$("org.dom4j.bean.BeanDocumentFactory");
                class$org$dom4j$bean$BeanDocumentFactory = cls;
            }
            return Class.forName(value, true, cls.getClassLoader()).newInstance();
        } catch (Exception e) {
            handleException(e);
            return null;
        }
    }

    public Element createElement(QName qName) {
        Object createBean = createBean(qName);
        return createBean == null ? new BeanElement(qName) : new BeanElement(qName, createBean);
    }

    public Element createElement(QName qName, Attributes attributes) {
        Object createBean = createBean(qName, attributes);
        return createBean == null ? new BeanElement(qName) : new BeanElement(qName, createBean);
    }

    /* access modifiers changed from: protected */
    public void handleException(Exception exc) {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("#### Warning: couldn't create bean: ");
        stringBuffer.append(exc);
        printStream.println(stringBuffer.toString());
    }
}
