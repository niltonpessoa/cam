package org.dom4j.io;

import javax.xml.transform.sax.SAXSource;
import org.dom4j.Document;
import org.dom4j.Node;
import org.xml.sax.InputSource;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

public class DocumentSource extends SAXSource {
    public static final String DOM4J_FEATURE = "http://org.dom4j.io.DoucmentSource/feature";
    private XMLReader xmlReader = new SAXWriter();

    public DocumentSource(Document document) {
        setDocument(document);
    }

    public DocumentSource(Node node) {
        setDocument(node.getDocument());
    }

    public Document getDocument() {
        return ((DocumentInputSource) getInputSource()).getDocument();
    }

    public XMLReader getXMLReader() {
        return this.xmlReader;
    }

    public void setDocument(Document document) {
        super.setInputSource(new DocumentInputSource(document));
    }

    public void setInputSource(InputSource inputSource) {
        if (inputSource instanceof DocumentInputSource) {
            super.setInputSource((DocumentInputSource) inputSource);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setXMLReader(XMLReader xMLReader) {
        XMLFilter xMLFilter;
        XMLReader xMLReader2;
        if (xMLReader instanceof SAXWriter) {
            xMLReader2 = (SAXWriter) xMLReader;
        } else if (xMLReader instanceof XMLFilter) {
            while (true) {
                xMLFilter = (XMLFilter) xMLReader;
                XMLReader parent = xMLFilter.getParent();
                if (!(parent instanceof XMLFilter)) {
                    break;
                }
                xMLReader = parent;
            }
            xMLFilter.setParent(this.xmlReader);
            xMLReader2 = xMLFilter;
        } else {
            throw new UnsupportedOperationException();
        }
        this.xmlReader = xMLReader2;
    }
}
