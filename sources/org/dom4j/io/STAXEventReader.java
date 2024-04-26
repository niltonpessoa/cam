package org.dom4j.io;

import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.EntityReference;
import javax.xml.stream.events.Namespace;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.dom4j.Attribute;
import org.dom4j.CharacterData;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;

public class STAXEventReader {
    private DocumentFactory factory;
    private XMLInputFactory inputFactory;

    public STAXEventReader() {
        this.inputFactory = XMLInputFactory.newInstance();
        this.factory = DocumentFactory.getInstance();
    }

    public STAXEventReader(DocumentFactory documentFactory) {
        this.inputFactory = XMLInputFactory.newInstance();
        this.factory = documentFactory == null ? DocumentFactory.getInstance() : documentFactory;
    }

    public Attribute createAttribute(Element element, javax.xml.stream.events.Attribute attribute) {
        return this.factory.createAttribute(element, createQName(attribute.getName()), attribute.getValue());
    }

    public CharacterData createCharacterData(Characters characters) {
        String data = characters.getData();
        return characters.isCData() ? this.factory.createCDATA(data) : this.factory.createText(data);
    }

    public Comment createComment(javax.xml.stream.events.Comment comment) {
        return this.factory.createComment(comment.getText());
    }

    public Element createElement(StartElement startElement) {
        Element createElement = this.factory.createElement(createQName(startElement.getName()));
        Iterator attributes = startElement.getAttributes();
        while (attributes.hasNext()) {
            javax.xml.stream.events.Attribute attribute = (javax.xml.stream.events.Attribute) attributes.next();
            createElement.addAttribute(createQName(attribute.getName()), attribute.getValue());
        }
        Iterator namespaces = startElement.getNamespaces();
        while (namespaces.hasNext()) {
            Namespace namespace = (Namespace) namespaces.next();
            createElement.addNamespace(namespace.getPrefix(), namespace.getNamespaceURI());
        }
        return createElement;
    }

    public Entity createEntity(EntityReference entityReference) {
        return this.factory.createEntity(entityReference.getName(), entityReference.getDeclaration().getReplacementText());
    }

    public org.dom4j.Namespace createNamespace(Namespace namespace) {
        return this.factory.createNamespace(namespace.getPrefix(), namespace.getNamespaceURI());
    }

    public ProcessingInstruction createProcessingInstruction(javax.xml.stream.events.ProcessingInstruction processingInstruction) {
        return this.factory.createProcessingInstruction(processingInstruction.getTarget(), processingInstruction.getData());
    }

    public QName createQName(javax.xml.namespace.QName qName) {
        return this.factory.createQName(qName.getLocalPart(), qName.getPrefix(), qName.getNamespaceURI());
    }

    public Attribute readAttribute(XMLEventReader xMLEventReader) {
        XMLEvent peek = xMLEventReader.peek();
        if (peek.isAttribute()) {
            return createAttribute((Element) null, xMLEventReader.nextEvent());
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected Attribute event, found: ");
        stringBuffer.append(peek);
        throw new XMLStreamException(stringBuffer.toString());
    }

    public CharacterData readCharacters(XMLEventReader xMLEventReader) {
        XMLEvent peek = xMLEventReader.peek();
        if (peek.isCharacters()) {
            return createCharacterData(xMLEventReader.nextEvent().asCharacters());
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected Characters event, found: ");
        stringBuffer.append(peek);
        throw new XMLStreamException(stringBuffer.toString());
    }

    public Comment readComment(XMLEventReader xMLEventReader) {
        XMLEvent peek = xMLEventReader.peek();
        if (peek instanceof javax.xml.stream.events.Comment) {
            return createComment(xMLEventReader.nextEvent());
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected Comment event, found: ");
        stringBuffer.append(peek);
        throw new XMLStreamException(stringBuffer.toString());
    }

    public Document readDocument(InputStream inputStream) {
        return readDocument(inputStream, (String) null);
    }

    public Document readDocument(InputStream inputStream, String str) {
        XMLEventReader createXMLEventReader = this.inputFactory.createXMLEventReader(str, inputStream);
        try {
            return readDocument(createXMLEventReader);
        } finally {
            createXMLEventReader.close();
        }
    }

    public Document readDocument(Reader reader) {
        return readDocument(reader, (String) null);
    }

    public Document readDocument(Reader reader, String str) {
        XMLEventReader createXMLEventReader = this.inputFactory.createXMLEventReader(str, reader);
        try {
            return readDocument(createXMLEventReader);
        } finally {
            createXMLEventReader.close();
        }
    }

    public Document readDocument(XMLEventReader xMLEventReader) {
        Document document = null;
        while (xMLEventReader.hasNext()) {
            int eventType = xMLEventReader.peek().getEventType();
            if (!(eventType == 4 || eventType == 6)) {
                if (eventType == 7) {
                    StartDocument nextEvent = xMLEventReader.nextEvent();
                    if (document != null) {
                        throw new XMLStreamException("Unexpected StartDocument event", nextEvent.getLocation());
                    } else if (nextEvent.encodingSet()) {
                        document = this.factory.createDocument(nextEvent.getCharacterEncodingScheme());
                    } else {
                        document = this.factory.createDocument();
                    }
                } else if (eventType != 8) {
                    if (document == null) {
                        document = this.factory.createDocument();
                    }
                    document.add(readNode(xMLEventReader));
                }
            }
            xMLEventReader.nextEvent();
        }
        return document;
    }

    public Element readElement(XMLEventReader xMLEventReader) {
        XMLEvent peek = xMLEventReader.peek();
        if (peek.isStartElement()) {
            StartElement asStartElement = xMLEventReader.nextEvent().asStartElement();
            Element createElement = createElement(asStartElement);
            while (xMLEventReader.hasNext()) {
                if (xMLEventReader.peek().isEndElement()) {
                    EndElement asEndElement = xMLEventReader.nextEvent().asEndElement();
                    if (asEndElement.getName().equals(asStartElement.getName())) {
                        return createElement;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Expected ");
                    stringBuffer.append(asStartElement.getName());
                    stringBuffer.append(" end-tag, but found");
                    stringBuffer.append(asEndElement.getName());
                    throw new XMLStreamException(stringBuffer.toString());
                }
                createElement.add(readNode(xMLEventReader));
            }
            throw new XMLStreamException("Unexpected end of stream while reading element content");
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Expected Element event, found: ");
        stringBuffer2.append(peek);
        throw new XMLStreamException(stringBuffer2.toString());
    }

    public Entity readEntityReference(XMLEventReader xMLEventReader) {
        XMLEvent peek = xMLEventReader.peek();
        if (peek.isEntityReference()) {
            return createEntity(xMLEventReader.nextEvent());
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected EntityRef event, found: ");
        stringBuffer.append(peek);
        throw new XMLStreamException(stringBuffer.toString());
    }

    public org.dom4j.Namespace readNamespace(XMLEventReader xMLEventReader) {
        XMLEvent peek = xMLEventReader.peek();
        if (peek.isNamespace()) {
            return createNamespace(xMLEventReader.nextEvent());
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected Namespace event, found: ");
        stringBuffer.append(peek);
        throw new XMLStreamException(stringBuffer.toString());
    }

    public Node readNode(XMLEventReader xMLEventReader) {
        XMLEvent peek = xMLEventReader.peek();
        if (peek.isStartElement()) {
            return readElement(xMLEventReader);
        }
        if (peek.isCharacters()) {
            return readCharacters(xMLEventReader);
        }
        if (peek.isStartDocument()) {
            return readDocument(xMLEventReader);
        }
        if (peek.isProcessingInstruction()) {
            return readProcessingInstruction(xMLEventReader);
        }
        if (peek.isEntityReference()) {
            return readEntityReference(xMLEventReader);
        }
        if (peek.isAttribute()) {
            return readAttribute(xMLEventReader);
        }
        if (peek.isNamespace()) {
            return readNamespace(xMLEventReader);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unsupported event: ");
        stringBuffer.append(peek);
        throw new XMLStreamException(stringBuffer.toString());
    }

    public ProcessingInstruction readProcessingInstruction(XMLEventReader xMLEventReader) {
        XMLEvent peek = xMLEventReader.peek();
        if (peek.isProcessingInstruction()) {
            return createProcessingInstruction(xMLEventReader.nextEvent());
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Expected PI event, found: ");
        stringBuffer.append(peek);
        throw new XMLStreamException(stringBuffer.toString());
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        if (documentFactory == null) {
            documentFactory = DocumentFactory.getInstance();
        }
        this.factory = documentFactory;
    }
}
