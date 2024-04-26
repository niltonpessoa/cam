package org.dom4j.io;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.Branch;
import org.dom4j.CDATA;
import org.dom4j.CharacterData;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Text;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

public class SAXWriter implements XMLReader {
    protected static final String FEATURE_NAMESPACES = "http://xml.org/sax/features/namespaces";
    protected static final String FEATURE_NAMESPACE_PREFIXES = "http://xml.org/sax/features/namespace-prefixes";
    protected static final String[] LEXICAL_HANDLER_NAMES = {"http://xml.org/sax/properties/lexical-handler", "http://xml.org/sax/handlers/LexicalHandler"};
    private AttributesImpl attributes;
    private ContentHandler contentHandler;
    private boolean declareNamespaceAttributes;
    private DTDHandler dtdHandler;
    private EntityResolver entityResolver;
    private ErrorHandler errorHandler;
    private Map features;
    private LexicalHandler lexicalHandler;
    private Map properties;

    public SAXWriter() {
        this.attributes = new AttributesImpl();
        this.features = new HashMap();
        HashMap hashMap = new HashMap();
        this.properties = hashMap;
        hashMap.put(FEATURE_NAMESPACE_PREFIXES, Boolean.FALSE);
        this.properties.put(FEATURE_NAMESPACE_PREFIXES, Boolean.TRUE);
    }

    public SAXWriter(ContentHandler contentHandler2) {
        this();
        this.contentHandler = contentHandler2;
    }

    public SAXWriter(ContentHandler contentHandler2, LexicalHandler lexicalHandler2) {
        this();
        this.contentHandler = contentHandler2;
        this.lexicalHandler = lexicalHandler2;
    }

    public SAXWriter(ContentHandler contentHandler2, LexicalHandler lexicalHandler2, EntityResolver entityResolver2) {
        this();
        this.contentHandler = contentHandler2;
        this.lexicalHandler = lexicalHandler2;
        this.entityResolver = entityResolver2;
    }

    /* access modifiers changed from: protected */
    public AttributesImpl addNamespaceAttribute(AttributesImpl attributesImpl, Namespace namespace) {
        String str;
        if (this.declareNamespaceAttributes) {
            if (attributesImpl == null) {
                attributesImpl = new AttributesImpl();
            }
            String prefix = namespace.getPrefix();
            if (prefix == null || prefix.length() <= 0) {
                str = "xmlns";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("xmlns:");
                stringBuffer.append(prefix);
                str = stringBuffer.toString();
            }
            attributesImpl.addAttribute("", prefix, str, "CDATA", namespace.getURI());
        }
        return attributesImpl;
    }

    /* access modifiers changed from: protected */
    public void checkForNullHandlers() {
    }

    /* access modifiers changed from: protected */
    public Attributes createAttributes(Element element, Attributes attributes2) {
        this.attributes.clear();
        if (attributes2 != null) {
            this.attributes.setAttributes(attributes2);
        }
        Iterator attributeIterator = element.attributeIterator();
        while (attributeIterator.hasNext()) {
            Attribute attribute = (Attribute) attributeIterator.next();
            this.attributes.addAttribute(attribute.getNamespaceURI(), attribute.getName(), attribute.getQualifiedName(), "CDATA", attribute.getValue());
        }
        return this.attributes;
    }

    /* access modifiers changed from: protected */
    public void documentLocator(Document document) {
        String str;
        LocatorImpl locatorImpl = new LocatorImpl();
        DocumentType docType = document.getDocType();
        String str2 = null;
        if (docType != null) {
            str2 = docType.getPublicID();
            str = docType.getSystemID();
        } else {
            str = null;
        }
        if (str2 != null) {
            locatorImpl.setPublicId(str2);
        }
        if (str != null) {
            locatorImpl.setSystemId(str);
        }
        locatorImpl.setLineNumber(-1);
        locatorImpl.setColumnNumber(-1);
        this.contentHandler.setDocumentLocator(locatorImpl);
    }

    /* access modifiers changed from: protected */
    public void dtdHandler(Document document) {
    }

    /* access modifiers changed from: protected */
    public void endDocument() {
        this.contentHandler.endDocument();
    }

    /* access modifiers changed from: protected */
    public void endElement(Element element) {
        this.contentHandler.endElement(element.getNamespaceURI(), element.getName(), element.getQualifiedName());
    }

    /* access modifiers changed from: protected */
    public void endPrefixMapping(NamespaceStack namespaceStack, int i) {
        while (namespaceStack.size() > i) {
            Namespace pop = namespaceStack.pop();
            if (pop != null) {
                this.contentHandler.endPrefixMapping(pop.getPrefix());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void entityResolver(Document document) {
        DocumentType docType;
        if (this.entityResolver != null && (docType = document.getDocType()) != null) {
            String publicID = docType.getPublicID();
            String systemID = docType.getSystemID();
            if (publicID != null || systemID != null) {
                try {
                    this.entityResolver.resolveEntity(publicID, systemID);
                } catch (IOException e) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Could not resolve publicID: ");
                    stringBuffer.append(publicID);
                    stringBuffer.append(" systemID: ");
                    stringBuffer.append(systemID);
                    throw new SAXException(stringBuffer.toString(), e);
                }
            }
        }
    }

    public ContentHandler getContentHandler() {
        return this.contentHandler;
    }

    public DTDHandler getDTDHandler() {
        return this.dtdHandler;
    }

    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public boolean getFeature(String str) {
        Boolean bool = (Boolean) this.features.get(str);
        return bool != null && bool.booleanValue();
    }

    public LexicalHandler getLexicalHandler() {
        return this.lexicalHandler;
    }

    public Object getProperty(String str) {
        int i = 0;
        while (true) {
            String[] strArr = LEXICAL_HANDLER_NAMES;
            if (i >= strArr.length) {
                return this.properties.get(str);
            }
            if (strArr[i].equals(str)) {
                return getLexicalHandler();
            }
            i++;
        }
    }

    public boolean isDeclareNamespaceAttributes() {
        return this.declareNamespaceAttributes;
    }

    /* access modifiers changed from: protected */
    public boolean isIgnoreableNamespace(Namespace namespace, NamespaceStack namespaceStack) {
        String uri;
        if (namespace.equals(Namespace.NO_NAMESPACE) || namespace.equals(Namespace.XML_NAMESPACE) || (uri = namespace.getURI()) == null || uri.length() <= 0) {
            return true;
        }
        return namespaceStack.contains(namespace);
    }

    public void parse(String str) {
        throw new SAXNotSupportedException("This XMLReader can only accept <dom4j> InputSource objects");
    }

    public void parse(InputSource inputSource) {
        if (inputSource instanceof DocumentInputSource) {
            write(((DocumentInputSource) inputSource).getDocument());
            return;
        }
        throw new SAXNotSupportedException("This XMLReader can only accept <dom4j> InputSource objects");
    }

    public void setContentHandler(ContentHandler contentHandler2) {
        this.contentHandler = contentHandler2;
    }

    public void setDTDHandler(DTDHandler dTDHandler) {
        this.dtdHandler = dTDHandler;
    }

    public void setDeclareNamespaceAttributes(boolean z) {
        this.declareNamespaceAttributes = z;
    }

    public void setEntityResolver(EntityResolver entityResolver2) {
        this.entityResolver = entityResolver2;
    }

    public void setErrorHandler(ErrorHandler errorHandler2) {
        this.errorHandler = errorHandler2;
    }

    public void setFeature(String str, boolean z) {
        if (FEATURE_NAMESPACE_PREFIXES.equals(str)) {
            setDeclareNamespaceAttributes(z);
        } else if (FEATURE_NAMESPACE_PREFIXES.equals(str) && !z) {
            throw new SAXNotSupportedException("Namespace feature is always supported in dom4j");
        }
        this.features.put(str, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public void setLexicalHandler(LexicalHandler lexicalHandler2) {
        this.lexicalHandler = lexicalHandler2;
    }

    public void setProperty(String str, Object obj) {
        int i = 0;
        while (true) {
            String[] strArr = LEXICAL_HANDLER_NAMES;
            if (i >= strArr.length) {
                this.properties.put(str, obj);
                return;
            } else if (strArr[i].equals(str)) {
                setLexicalHandler((LexicalHandler) obj);
                return;
            } else {
                i++;
            }
        }
    }

    public void setXMLReader(XMLReader xMLReader) {
        setContentHandler(xMLReader.getContentHandler());
        setDTDHandler(xMLReader.getDTDHandler());
        setEntityResolver(xMLReader.getEntityResolver());
        setErrorHandler(xMLReader.getErrorHandler());
    }

    /* access modifiers changed from: protected */
    public void startDocument() {
        this.contentHandler.startDocument();
    }

    /* access modifiers changed from: protected */
    public void startElement(Element element, AttributesImpl attributesImpl) {
        this.contentHandler.startElement(element.getNamespaceURI(), element.getName(), element.getQualifiedName(), createAttributes(element, attributesImpl));
    }

    /* access modifiers changed from: protected */
    public AttributesImpl startPrefixMapping(Element element, NamespaceStack namespaceStack) {
        Namespace namespace = element.getNamespace();
        AttributesImpl attributesImpl = null;
        if (namespace != null && !isIgnoreableNamespace(namespace, namespaceStack)) {
            namespaceStack.push(namespace);
            this.contentHandler.startPrefixMapping(namespace.getPrefix(), namespace.getURI());
            attributesImpl = addNamespaceAttribute((AttributesImpl) null, namespace);
        }
        List declaredNamespaces = element.declaredNamespaces();
        int size = declaredNamespaces.size();
        for (int i = 0; i < size; i++) {
            Namespace namespace2 = (Namespace) declaredNamespaces.get(i);
            if (!isIgnoreableNamespace(namespace2, namespaceStack)) {
                namespaceStack.push(namespace2);
                this.contentHandler.startPrefixMapping(namespace2.getPrefix(), namespace2.getURI());
                attributesImpl = addNamespaceAttribute(attributesImpl, namespace2);
            }
        }
        return attributesImpl;
    }

    public void write(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.contentHandler.characters(charArray, 0, charArray.length);
        }
    }

    public void write(CDATA cdata) {
        String text = cdata.getText();
        LexicalHandler lexicalHandler2 = this.lexicalHandler;
        if (lexicalHandler2 != null) {
            lexicalHandler2.startCDATA();
            write(text);
            this.lexicalHandler.endCDATA();
            return;
        }
        write(text);
    }

    public void write(Comment comment) {
        if (this.lexicalHandler != null) {
            char[] charArray = comment.getText().toCharArray();
            this.lexicalHandler.comment(charArray, 0, charArray.length);
        }
    }

    public void write(Document document) {
        if (document != null) {
            checkForNullHandlers();
            documentLocator(document);
            startDocument();
            entityResolver(document);
            dtdHandler(document);
            writeContent(document, new NamespaceStack());
            endDocument();
        }
    }

    public void write(Element element) {
        write(element, new NamespaceStack());
    }

    /* access modifiers changed from: protected */
    public void write(Element element, NamespaceStack namespaceStack) {
        int size = namespaceStack.size();
        startElement(element, startPrefixMapping(element, namespaceStack));
        writeContent(element, namespaceStack);
        endElement(element);
        endPrefixMapping(namespaceStack, size);
    }

    public void write(Entity entity) {
        String text = entity.getText();
        if (this.lexicalHandler != null) {
            String name = entity.getName();
            this.lexicalHandler.startEntity(name);
            write(text);
            this.lexicalHandler.endEntity(name);
            return;
        }
        write(text);
    }

    public void write(Node node) {
        Node node2;
        switch (node.getNodeType()) {
            case 1:
                write((Element) node);
                return;
            case 2:
                node2 = (Attribute) node;
                break;
            case 3:
                write(node.getText());
                return;
            case 4:
                write((CDATA) node);
                return;
            case 5:
                write((Entity) node);
                return;
            case 7:
                write((ProcessingInstruction) node);
                return;
            case 8:
                write((Comment) node);
                return;
            case 9:
                write((Document) node);
                return;
            case 10:
                node2 = (DocumentType) node;
                break;
            case 13:
                return;
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Invalid node type: ");
                stringBuffer.append(node);
                throw new SAXException(stringBuffer.toString());
        }
        write(node2);
    }

    public void write(ProcessingInstruction processingInstruction) {
        this.contentHandler.processingInstruction(processingInstruction.getTarget(), processingInstruction.getText());
    }

    public void writeClose(Element element) {
        endElement(element);
    }

    /* access modifiers changed from: protected */
    public void writeContent(Branch branch, NamespaceStack namespaceStack) {
        String str;
        Iterator nodeIterator = branch.nodeIterator();
        while (nodeIterator.hasNext()) {
            Object next = nodeIterator.next();
            if (next instanceof Element) {
                write((Element) next, namespaceStack);
            } else {
                if (next instanceof CharacterData) {
                    if (next instanceof Text) {
                        str = ((Text) next).getText();
                    } else if (next instanceof CDATA) {
                        write((CDATA) next);
                    } else if (next instanceof Comment) {
                        write((Comment) next);
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Invalid Node in DOM4J content: ");
                        stringBuffer.append(next);
                        stringBuffer.append(" of type: ");
                        stringBuffer.append(next.getClass());
                        throw new SAXException(stringBuffer.toString());
                    }
                } else if (next instanceof String) {
                    str = (String) next;
                } else if (next instanceof Entity) {
                    write((Entity) next);
                } else if (next instanceof ProcessingInstruction) {
                    write((ProcessingInstruction) next);
                } else if (next instanceof Namespace) {
                    write((Node) (Namespace) next);
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Invalid Node in DOM4J content: ");
                    stringBuffer2.append(next);
                    throw new SAXException(stringBuffer2.toString());
                }
                write(str);
            }
        }
    }

    public void writeOpen(Element element) {
        startElement(element, (AttributesImpl) null);
    }
}
