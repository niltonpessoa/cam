package org.dom4j.jaxb;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import org.dom4j.Element;
import org.dom4j.dom.DOMDocument;

abstract class JAXBSupport {
    private ClassLoader classloader;
    private String contextPath;
    private JAXBContext jaxbContext;
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public JAXBSupport(String str) {
        this.contextPath = str;
    }

    public JAXBSupport(String str, ClassLoader classLoader) {
        this.contextPath = str;
        this.classloader = classLoader;
    }

    private JAXBContext getContext() {
        if (this.jaxbContext == null) {
            ClassLoader classLoader = this.classloader;
            this.jaxbContext = classLoader == null ? JAXBContext.newInstance(this.contextPath) : JAXBContext.newInstance(this.contextPath, classLoader);
        }
        return this.jaxbContext;
    }

    private Marshaller getMarshaller() {
        if (this.marshaller == null) {
            this.marshaller = getContext().createMarshaller();
        }
        return this.marshaller;
    }

    private Unmarshaller getUnmarshaller() {
        if (this.unmarshaller == null) {
            this.unmarshaller = getContext().createUnmarshaller();
        }
        return this.unmarshaller;
    }

    /* access modifiers changed from: protected */
    public Element marshal(javax.xml.bind.Element element) {
        DOMDocument dOMDocument = new DOMDocument();
        getMarshaller().marshal(element, dOMDocument);
        return dOMDocument.getRootElement();
    }

    /* access modifiers changed from: protected */
    public javax.xml.bind.Element unmarshal(Element element) {
        return (javax.xml.bind.Element) getUnmarshaller().unmarshal(new StreamSource(new StringReader(element.asXML())));
    }
}
