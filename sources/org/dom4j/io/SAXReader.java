package org.dom4j.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.net.URL;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.ElementHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class SAXReader {
    private static final String SAX_DECL_HANDLER = "http://xml.org/sax/properties/declaration-handler";
    private static final String SAX_LEXICALHANDLER = "http://xml.org/sax/handlers/LexicalHandler";
    private static final String SAX_LEXICAL_HANDLER = "http://xml.org/sax/properties/lexical-handler";
    private static final String SAX_NAMESPACES = "http://xml.org/sax/features/namespaces";
    private static final String SAX_NAMESPACE_PREFIXES = "http://xml.org/sax/features/namespace-prefixes";
    private static final String SAX_STRING_INTERNING = "http://xml.org/sax/features/string-interning";
    private DispatchHandler dispatchHandler;
    private String encoding = null;
    private EntityResolver entityResolver;
    private ErrorHandler errorHandler;
    private DocumentFactory factory;
    private boolean ignoreComments = false;
    private boolean includeExternalDTDDeclarations = false;
    private boolean includeInternalDTDDeclarations = false;
    private boolean mergeAdjacentText = false;
    private boolean stringInternEnabled = true;
    private boolean stripWhitespaceText = false;
    private boolean validating;
    private XMLFilter xmlFilter;
    private XMLReader xmlReader;

    protected static class SAXEntityResolver implements EntityResolver, Serializable {
        protected String uriPrefix;

        public SAXEntityResolver(String str) {
            this.uriPrefix = str;
        }

        public InputSource resolveEntity(String str, String str2) {
            if (str2 != null && str2.length() > 0 && this.uriPrefix != null && str2.indexOf(58) <= 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(this.uriPrefix);
                stringBuffer.append(str2);
                str2 = stringBuffer.toString();
            }
            return new InputSource(str2);
        }
    }

    public SAXReader() {
    }

    public SAXReader(String str) {
        if (str != null) {
            this.xmlReader = XMLReaderFactory.createXMLReader(str);
        }
    }

    public SAXReader(String str, boolean z) {
        if (str != null) {
            this.xmlReader = XMLReaderFactory.createXMLReader(str);
        }
        this.validating = z;
    }

    public SAXReader(DocumentFactory documentFactory) {
        this.factory = documentFactory;
    }

    public SAXReader(DocumentFactory documentFactory, boolean z) {
        this.factory = documentFactory;
        this.validating = z;
    }

    public SAXReader(XMLReader xMLReader) {
        this.xmlReader = xMLReader;
    }

    public SAXReader(XMLReader xMLReader, boolean z) {
        this.xmlReader = xMLReader;
        this.validating = z;
    }

    public SAXReader(boolean z) {
        this.validating = z;
    }

    public void addHandler(String str, ElementHandler elementHandler) {
        getDispatchHandler().addHandler(str, elementHandler);
    }

    /* access modifiers changed from: protected */
    public void configureReader(XMLReader xMLReader, DefaultHandler defaultHandler) {
        SAXHelper.setParserProperty(xMLReader, SAX_LEXICALHANDLER, defaultHandler);
        SAXHelper.setParserProperty(xMLReader, SAX_LEXICAL_HANDLER, defaultHandler);
        if (this.includeInternalDTDDeclarations || this.includeExternalDTDDeclarations) {
            SAXHelper.setParserProperty(xMLReader, SAX_DECL_HANDLER, defaultHandler);
        }
        SAXHelper.setParserFeature(xMLReader, SAX_NAMESPACES, true);
        SAXHelper.setParserFeature(xMLReader, SAX_NAMESPACE_PREFIXES, false);
        SAXHelper.setParserFeature(xMLReader, SAX_STRING_INTERNING, isStringInternEnabled());
        SAXHelper.setParserFeature(xMLReader, "http://xml.org/sax/features/use-locator2", true);
        try {
            xMLReader.setFeature("http://xml.org/sax/features/validation", isValidating());
            ErrorHandler errorHandler2 = this.errorHandler;
            if (errorHandler2 != null) {
                xMLReader.setErrorHandler(errorHandler2);
            } else {
                xMLReader.setErrorHandler(defaultHandler);
            }
        } catch (Exception e) {
            if (isValidating()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Validation not supported for XMLReader: ");
                stringBuffer.append(xMLReader);
                throw new DocumentException(stringBuffer.toString(), e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public SAXContentHandler createContentHandler(XMLReader xMLReader) {
        return new SAXContentHandler(getDocumentFactory(), this.dispatchHandler);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r3.lastIndexOf(47);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.xml.sax.EntityResolver createDefaultEntityResolver(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0018
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0018
            r0 = 47
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto L_0x0018
            r1 = 0
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r1, r0)
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            org.dom4j.io.SAXReader$SAXEntityResolver r0 = new org.dom4j.io.SAXReader$SAXEntityResolver
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.io.SAXReader.createDefaultEntityResolver(java.lang.String):org.xml.sax.EntityResolver");
    }

    /* access modifiers changed from: protected */
    public XMLReader createXMLReader() {
        return SAXHelper.createXMLReader(isValidating());
    }

    /* access modifiers changed from: protected */
    public DispatchHandler getDispatchHandler() {
        if (this.dispatchHandler == null) {
            this.dispatchHandler = new DispatchHandler();
        }
        return this.dispatchHandler;
    }

    public DocumentFactory getDocumentFactory() {
        if (this.factory == null) {
            this.factory = DocumentFactory.getInstance();
        }
        return this.factory;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public XMLFilter getXMLFilter() {
        return this.xmlFilter;
    }

    public XMLReader getXMLReader() {
        if (this.xmlReader == null) {
            this.xmlReader = createXMLReader();
        }
        return this.xmlReader;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [org.xml.sax.XMLReader] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.xml.sax.XMLReader installXMLFilter(org.xml.sax.XMLReader r5) {
        /*
            r4 = this;
            org.xml.sax.XMLFilter r0 = r4.getXMLFilter()
            if (r0 == 0) goto L_0x0017
            r1 = r0
        L_0x0007:
            org.xml.sax.XMLReader r2 = r1.getParent()
            boolean r3 = r2 instanceof org.xml.sax.XMLFilter
            if (r3 == 0) goto L_0x0013
            r1 = r2
            org.xml.sax.XMLFilter r1 = (org.xml.sax.XMLFilter) r1
            goto L_0x0007
        L_0x0013:
            r1.setParent(r5)
            return r0
        L_0x0017:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.io.SAXReader.installXMLFilter(org.xml.sax.XMLReader):org.xml.sax.XMLReader");
    }

    public boolean isIgnoreComments() {
        return this.ignoreComments;
    }

    public boolean isIncludeExternalDTDDeclarations() {
        return this.includeExternalDTDDeclarations;
    }

    public boolean isIncludeInternalDTDDeclarations() {
        return this.includeInternalDTDDeclarations;
    }

    public boolean isMergeAdjacentText() {
        return this.mergeAdjacentText;
    }

    public boolean isStringInternEnabled() {
        return this.stringInternEnabled;
    }

    public boolean isStripWhitespaceText() {
        return this.stripWhitespaceText;
    }

    public boolean isValidating() {
        return this.validating;
    }

    public Document read(File file) {
        try {
            InputSource inputSource = new InputSource(new FileInputStream(file));
            String str = this.encoding;
            if (str != null) {
                inputSource.setEncoding(str);
            }
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                StringBuffer stringBuffer = new StringBuffer("file://");
                if (!absolutePath.startsWith(File.separator)) {
                    stringBuffer.append("/");
                }
                stringBuffer.append(absolutePath.replace('\\', '/'));
                inputSource.setSystemId(stringBuffer.toString());
            }
            return read(inputSource);
        } catch (FileNotFoundException e) {
            throw new DocumentException(e.getMessage(), e);
        }
    }

    public Document read(InputStream inputStream) {
        InputSource inputSource = new InputSource(inputStream);
        String str = this.encoding;
        if (str != null) {
            inputSource.setEncoding(str);
        }
        return read(inputSource);
    }

    public Document read(InputStream inputStream, String str) {
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(str);
        String str2 = this.encoding;
        if (str2 != null) {
            inputSource.setEncoding(str2);
        }
        return read(inputSource);
    }

    public Document read(Reader reader) {
        InputSource inputSource = new InputSource(reader);
        String str = this.encoding;
        if (str != null) {
            inputSource.setEncoding(str);
        }
        return read(inputSource);
    }

    public Document read(Reader reader, String str) {
        InputSource inputSource = new InputSource(reader);
        inputSource.setSystemId(str);
        String str2 = this.encoding;
        if (str2 != null) {
            inputSource.setEncoding(str2);
        }
        return read(inputSource);
    }

    public Document read(String str) {
        InputSource inputSource = new InputSource(str);
        String str2 = this.encoding;
        if (str2 != null) {
            inputSource.setEncoding(str2);
        }
        return read(inputSource);
    }

    public Document read(URL url) {
        InputSource inputSource = new InputSource(url.toExternalForm());
        String str = this.encoding;
        if (str != null) {
            inputSource.setEncoding(str);
        }
        return read(inputSource);
    }

    public Document read(InputSource inputSource) {
        try {
            XMLReader installXMLFilter = installXMLFilter(getXMLReader());
            EntityResolver entityResolver2 = this.entityResolver;
            if (entityResolver2 == null) {
                entityResolver2 = createDefaultEntityResolver(inputSource.getSystemId());
                this.entityResolver = entityResolver2;
            }
            installXMLFilter.setEntityResolver(entityResolver2);
            SAXContentHandler createContentHandler = createContentHandler(installXMLFilter);
            createContentHandler.setEntityResolver(entityResolver2);
            createContentHandler.setInputSource(inputSource);
            boolean isIncludeInternalDTDDeclarations = isIncludeInternalDTDDeclarations();
            boolean isIncludeExternalDTDDeclarations = isIncludeExternalDTDDeclarations();
            createContentHandler.setIncludeInternalDTDDeclarations(isIncludeInternalDTDDeclarations);
            createContentHandler.setIncludeExternalDTDDeclarations(isIncludeExternalDTDDeclarations);
            createContentHandler.setMergeAdjacentText(isMergeAdjacentText());
            createContentHandler.setStripWhitespaceText(isStripWhitespaceText());
            createContentHandler.setIgnoreComments(isIgnoreComments());
            installXMLFilter.setContentHandler(createContentHandler);
            configureReader(installXMLFilter, createContentHandler);
            installXMLFilter.parse(inputSource);
            return createContentHandler.getDocument();
        } catch (Exception e) {
            if (e instanceof SAXParseException) {
                SAXParseException sAXParseException = (SAXParseException) e;
                String systemId = sAXParseException.getSystemId();
                if (systemId == null) {
                    systemId = "";
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Error on line ");
                stringBuffer.append(sAXParseException.getLineNumber());
                stringBuffer.append(" of document ");
                stringBuffer.append(systemId);
                stringBuffer.append(" : ");
                stringBuffer.append(sAXParseException.getMessage());
                throw new DocumentException(stringBuffer.toString(), e);
            }
            throw new DocumentException(e.getMessage(), e);
        }
    }

    public void removeHandler(String str) {
        getDispatchHandler().removeHandler(str);
    }

    public void resetHandlers() {
        getDispatchHandler().resetHandlers();
    }

    public void setDefaultHandler(ElementHandler elementHandler) {
        getDispatchHandler().setDefaultHandler(elementHandler);
    }

    /* access modifiers changed from: protected */
    public void setDispatchHandler(DispatchHandler dispatchHandler2) {
        this.dispatchHandler = dispatchHandler2;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.factory = documentFactory;
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }

    public void setEntityResolver(EntityResolver entityResolver2) {
        this.entityResolver = entityResolver2;
    }

    public void setErrorHandler(ErrorHandler errorHandler2) {
        this.errorHandler = errorHandler2;
    }

    public void setFeature(String str, boolean z) {
        getXMLReader().setFeature(str, z);
    }

    public void setIgnoreComments(boolean z) {
        this.ignoreComments = z;
    }

    public void setIncludeExternalDTDDeclarations(boolean z) {
        this.includeExternalDTDDeclarations = z;
    }

    public void setIncludeInternalDTDDeclarations(boolean z) {
        this.includeInternalDTDDeclarations = z;
    }

    public void setMergeAdjacentText(boolean z) {
        this.mergeAdjacentText = z;
    }

    public void setProperty(String str, Object obj) {
        getXMLReader().setProperty(str, obj);
    }

    public void setStringInternEnabled(boolean z) {
        this.stringInternEnabled = z;
    }

    public void setStripWhitespaceText(boolean z) {
        this.stripWhitespaceText = z;
    }

    public void setValidation(boolean z) {
        this.validating = z;
    }

    public void setXMLFilter(XMLFilter xMLFilter) {
        this.xmlFilter = xMLFilter;
    }

    public void setXMLReader(XMLReader xMLReader) {
        this.xmlReader = xMLReader;
    }

    public void setXMLReaderClassName(String str) {
        setXMLReader(XMLReaderFactory.createXMLReader(str));
    }
}
