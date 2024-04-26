package org.dom4j.io;

import org.dom4j.DocumentFactory;
import org.xml.sax.XMLReader;

class SAXModifyReader extends SAXReader {
    private boolean pruneElements;
    private XMLWriter xmlWriter;

    public SAXModifyReader() {
    }

    public SAXModifyReader(String str) {
        super(str);
    }

    public SAXModifyReader(String str, boolean z) {
        super(str, z);
    }

    public SAXModifyReader(DocumentFactory documentFactory) {
        super(documentFactory);
    }

    public SAXModifyReader(DocumentFactory documentFactory, boolean z) {
        super(documentFactory, z);
    }

    public SAXModifyReader(XMLReader xMLReader) {
        super(xMLReader);
    }

    public SAXModifyReader(XMLReader xMLReader, boolean z) {
        super(xMLReader, z);
    }

    public SAXModifyReader(boolean z) {
        super(z);
    }

    /* access modifiers changed from: protected */
    public SAXContentHandler createContentHandler(XMLReader xMLReader) {
        SAXModifyContentHandler sAXModifyContentHandler = new SAXModifyContentHandler(getDocumentFactory(), getDispatchHandler());
        sAXModifyContentHandler.setXMLWriter(this.xmlWriter);
        return sAXModifyContentHandler;
    }

    /* access modifiers changed from: protected */
    public XMLWriter getXMLWriter() {
        return this.xmlWriter;
    }

    public boolean isPruneElements() {
        return this.pruneElements;
    }

    public void setPruneElements(boolean z) {
        this.pruneElements = z;
    }

    public void setXMLWriter(XMLWriter xMLWriter) {
        this.xmlWriter = xMLWriter;
    }
}
