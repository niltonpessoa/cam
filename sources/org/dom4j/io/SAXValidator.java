package org.dom4j.io;

import java.io.IOException;
import org.dom4j.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SAXValidator {
    private ErrorHandler errorHandler;
    private XMLReader xmlReader;

    public SAXValidator() {
    }

    public SAXValidator(XMLReader xMLReader) {
        this.xmlReader = xMLReader;
    }

    /* access modifiers changed from: protected */
    public void configureReader() {
        if (this.xmlReader.getContentHandler() == null) {
            this.xmlReader.setContentHandler(new DefaultHandler());
        }
        this.xmlReader.setFeature("http://xml.org/sax/features/validation", true);
        this.xmlReader.setFeature("http://xml.org/sax/features/namespaces", true);
        this.xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
    }

    /* access modifiers changed from: protected */
    public XMLReader createXMLReader() {
        return SAXHelper.createXMLReader(true);
    }

    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public XMLReader getXMLReader() {
        if (this.xmlReader == null) {
            this.xmlReader = createXMLReader();
            configureReader();
        }
        return this.xmlReader;
    }

    public void setErrorHandler(ErrorHandler errorHandler2) {
        this.errorHandler = errorHandler2;
    }

    public void setXMLReader(XMLReader xMLReader) {
        this.xmlReader = xMLReader;
        configureReader();
    }

    public void validate(Document document) {
        if (document != null) {
            XMLReader xMLReader = getXMLReader();
            ErrorHandler errorHandler2 = this.errorHandler;
            if (errorHandler2 != null) {
                xMLReader.setErrorHandler(errorHandler2);
            }
            try {
                xMLReader.parse(new DocumentInputSource(document));
            } catch (IOException e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Caught and exception that should never happen: ");
                stringBuffer.append(e);
                throw new RuntimeException(stringBuffer.toString());
            }
        }
    }
}
