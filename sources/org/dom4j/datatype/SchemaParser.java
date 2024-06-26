package org.dom4j.datatype;

import com.sun.msv.datatype.xsd.DatatypeFactory;
import com.sun.msv.datatype.xsd.TypeIncubator;
import com.sun.msv.datatype.xsd.XSDatatype;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.io.SAXReader;
import org.dom4j.util.AttributeHelper;
import org.relaxng.datatype.DatatypeException;
import org.relaxng.datatype.ValidationContext;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

public class SchemaParser {
    private static final QName XSD_ALL;
    private static final QName XSD_ATTRIBUTE;
    private static final QName XSD_CHOICE;
    private static final QName XSD_COMPLEXTYPE;
    private static final QName XSD_ELEMENT;
    private static final QName XSD_INCLUDE;
    private static final Namespace XSD_NAMESPACE;
    private static final QName XSD_RESTRICTION;
    private static final QName XSD_SEQUENCE;
    private static final QName XSD_SIMPLETYPE;
    private Map dataTypeCache;
    private DatatypeDocumentFactory documentFactory;
    private NamedTypeResolver namedTypeResolver;
    private Namespace targetNamespace;

    static {
        Namespace namespace = Namespace.get("xsd", "http://www.w3.org/2001/XMLSchema");
        XSD_NAMESPACE = namespace;
        XSD_ELEMENT = QName.get("element", namespace);
        XSD_ATTRIBUTE = QName.get("attribute", namespace);
        XSD_SIMPLETYPE = QName.get("simpleType", namespace);
        XSD_COMPLEXTYPE = QName.get("complexType", namespace);
        XSD_RESTRICTION = QName.get("restriction", namespace);
        XSD_SEQUENCE = QName.get("sequence", namespace);
        XSD_CHOICE = QName.get("choice", namespace);
        XSD_ALL = QName.get("all", namespace);
        XSD_INCLUDE = QName.get("include", namespace);
    }

    public SchemaParser() {
        this(DatatypeDocumentFactory.singleton);
    }

    public SchemaParser(DatatypeDocumentFactory datatypeDocumentFactory) {
        this.dataTypeCache = new HashMap();
        this.documentFactory = datatypeDocumentFactory;
        this.namedTypeResolver = new NamedTypeResolver(datatypeDocumentFactory);
    }

    private XSDatatype dataTypeForXsdAttribute(Element element) {
        String attributeValue = element.attributeValue("type");
        if (attributeValue != null) {
            return getTypeByName(attributeValue);
        }
        Element element2 = element.element(XSD_SIMPLETYPE);
        if (element2 != null) {
            return loadXSDatatypeFromSimpleType(element2);
        }
        String attributeValue2 = element.attributeValue("name");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The attribute: ");
        stringBuffer.append(attributeValue2);
        stringBuffer.append(" has no type attribute and does not contain a ");
        stringBuffer.append("<simpleType/> element");
        throw new InvalidSchemaException(stringBuffer.toString());
    }

    private XSDatatype deriveSimpleType(XSDatatype xSDatatype, Element element) {
        TypeIncubator typeIncubator = new TypeIncubator(xSDatatype);
        try {
            Iterator elementIterator = element.elementIterator();
            while (elementIterator.hasNext()) {
                Element element2 = (Element) elementIterator.next();
                typeIncubator.addFacet(element2.getName(), element2.attributeValue("value"), AttributeHelper.booleanValue(element2, "fixed"), (ValidationContext) null);
            }
            return typeIncubator.derive("", (String) null);
        } catch (DatatypeException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid restriction: ");
            stringBuffer.append(e.getMessage());
            stringBuffer.append(" when trying to build restriction: ");
            stringBuffer.append(element);
            onSchemaError(stringBuffer.toString());
            return null;
        }
    }

    private DatatypeElementFactory getDatatypeElementFactory(QName qName) {
        DatatypeElementFactory elementFactory = this.documentFactory.getElementFactory(qName);
        if (elementFactory != null) {
            return elementFactory;
        }
        DatatypeElementFactory datatypeElementFactory = new DatatypeElementFactory(qName);
        qName.setDocumentFactory(datatypeElementFactory);
        return datatypeElementFactory;
    }

    private QName getQName(String str) {
        Namespace namespace = this.targetNamespace;
        return namespace == null ? this.documentFactory.createQName(str) : this.documentFactory.createQName(str, namespace);
    }

    private XSDatatype getTypeByName(String str) {
        XSDatatype xSDatatype = (XSDatatype) this.dataTypeCache.get(str);
        if (xSDatatype == null) {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                try {
                    xSDatatype = DatatypeFactory.getTypeByName(str.substring(indexOf + 1));
                } catch (DatatypeException unused) {
                }
            }
            if (xSDatatype == null) {
                try {
                    xSDatatype = DatatypeFactory.getTypeByName(str);
                } catch (DatatypeException unused2) {
                }
            }
            if (xSDatatype == null) {
                xSDatatype = (XSDatatype) this.namedTypeResolver.simpleTypeMap.get(getQName(str));
            }
            if (xSDatatype != null) {
                this.dataTypeCache.put(str, xSDatatype);
            }
        }
        return xSDatatype;
    }

    private synchronized void internalBuild(Document document) {
        Element rootElement = document.getRootElement();
        if (rootElement != null) {
            Iterator elementIterator = rootElement.elementIterator(XSD_INCLUDE);
            while (elementIterator.hasNext()) {
                String attributeValue = ((Element) elementIterator.next()).attributeValue("schemaLocation");
                EntityResolver entityResolver = document.getEntityResolver();
                if (entityResolver != null) {
                    try {
                        InputSource resolveEntity = entityResolver.resolveEntity((String) null, attributeValue);
                        if (resolveEntity != null) {
                            build(new SAXReader().read(resolveEntity));
                        } else {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Could not resolve the schema URI: ");
                            stringBuffer.append(attributeValue);
                            throw new InvalidSchemaException(stringBuffer.toString());
                        }
                    } catch (Exception e) {
                        PrintStream printStream = System.out;
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Failed to load schema: ");
                        stringBuffer2.append(attributeValue);
                        printStream.println(stringBuffer2.toString());
                        PrintStream printStream2 = System.out;
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Caught: ");
                        stringBuffer3.append(e);
                        printStream2.println(stringBuffer3.toString());
                        e.printStackTrace();
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("Failed to load schema: ");
                        stringBuffer4.append(attributeValue);
                        throw new InvalidSchemaException(stringBuffer4.toString());
                    }
                } else {
                    throw new InvalidSchemaException("No EntityResolver available");
                }
            }
            Iterator elementIterator2 = rootElement.elementIterator(XSD_ELEMENT);
            while (elementIterator2.hasNext()) {
                onDatatypeElement((Element) elementIterator2.next(), this.documentFactory);
            }
            Iterator elementIterator3 = rootElement.elementIterator(XSD_SIMPLETYPE);
            while (elementIterator3.hasNext()) {
                onNamedSchemaSimpleType((Element) elementIterator3.next());
            }
            Iterator elementIterator4 = rootElement.elementIterator(XSD_COMPLEXTYPE);
            while (elementIterator4.hasNext()) {
                onNamedSchemaComplexType((Element) elementIterator4.next());
            }
            this.namedTypeResolver.resolveNamedTypes();
        }
    }

    private XSDatatype loadXSDatatypeFromSimpleType(Element element) {
        String str;
        StringBuffer stringBuffer;
        Element element2 = element.element(XSD_RESTRICTION);
        if (element2 != null) {
            String attributeValue = element2.attributeValue("base");
            if (attributeValue != null) {
                XSDatatype typeByName = getTypeByName(attributeValue);
                if (typeByName != null) {
                    return deriveSimpleType(typeByName, element2);
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Invalid base type: ");
                stringBuffer2.append(attributeValue);
                stringBuffer2.append(" when trying to build restriction: ");
                stringBuffer2.append(element2);
                str = stringBuffer2.toString();
                onSchemaError(str);
                return null;
            }
            Element element3 = element.element(XSD_SIMPLETYPE);
            if (element3 != null) {
                return loadXSDatatypeFromSimpleType(element3);
            }
            stringBuffer = new StringBuffer();
            stringBuffer.append("The simpleType element: ");
            stringBuffer.append(element);
            stringBuffer.append(" must contain a base attribute or simpleType");
            stringBuffer.append(" element");
        } else {
            stringBuffer = new StringBuffer();
            stringBuffer.append("No <restriction>. Could not create XSDatatype for simpleType: ");
            stringBuffer.append(element);
        }
        str = stringBuffer.toString();
        onSchemaError(str);
        return null;
    }

    private void onChildElements(Element element, DatatypeElementFactory datatypeElementFactory) {
        Iterator elementIterator = element.elementIterator(XSD_ELEMENT);
        while (elementIterator.hasNext()) {
            onDatatypeElement((Element) elementIterator.next(), datatypeElementFactory);
        }
    }

    private void onDatatypeAttribute(Element element, DatatypeElementFactory datatypeElementFactory, Element element2) {
        String attributeValue = element2.attributeValue("name");
        QName qName = getQName(attributeValue);
        XSDatatype dataTypeForXsdAttribute = dataTypeForXsdAttribute(element2);
        if (dataTypeForXsdAttribute != null) {
            datatypeElementFactory.setAttributeXSDatatype(qName, dataTypeForXsdAttribute);
            return;
        }
        String attributeValue2 = element2.attributeValue("type");
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Warning: Couldn't find XSDatatype for type: ");
        stringBuffer.append(attributeValue2);
        stringBuffer.append(" attribute: ");
        stringBuffer.append(attributeValue);
        printStream.println(stringBuffer.toString());
    }

    private void onDatatypeElement(Element element, DocumentFactory documentFactory2) {
        XSDatatype loadXSDatatypeFromSimpleType;
        String attributeValue = element.attributeValue("name");
        String attributeValue2 = element.attributeValue("type");
        QName qName = getQName(attributeValue);
        DatatypeElementFactory datatypeElementFactory = getDatatypeElementFactory(qName);
        if (attributeValue2 != null) {
            XSDatatype typeByName = getTypeByName(attributeValue2);
            if (typeByName != null) {
                datatypeElementFactory.setChildElementXSDatatype(qName, typeByName);
                return;
            }
            this.namedTypeResolver.registerTypedElement(element, getQName(attributeValue2), documentFactory2);
            return;
        }
        Element element2 = element.element(XSD_SIMPLETYPE);
        if (!(element2 == null || (loadXSDatatypeFromSimpleType = loadXSDatatypeFromSimpleType(element2)) == null)) {
            datatypeElementFactory.setChildElementXSDatatype(qName, loadXSDatatypeFromSimpleType);
        }
        Element element3 = element.element(XSD_COMPLEXTYPE);
        if (element3 != null) {
            onSchemaComplexType(element3, datatypeElementFactory);
        }
        Iterator elementIterator = element.elementIterator(XSD_ATTRIBUTE);
        if (elementIterator.hasNext()) {
            do {
                onDatatypeAttribute(element, datatypeElementFactory, (Element) elementIterator.next());
            } while (elementIterator.hasNext());
        }
    }

    private void onNamedSchemaComplexType(Element element) {
        Attribute attribute = element.attribute("name");
        if (attribute != null) {
            QName qName = getQName(attribute.getText());
            DatatypeElementFactory datatypeElementFactory = getDatatypeElementFactory(qName);
            onSchemaComplexType(element, datatypeElementFactory);
            this.namedTypeResolver.registerComplexType(qName, datatypeElementFactory);
        }
    }

    private void onNamedSchemaSimpleType(Element element) {
        Attribute attribute = element.attribute("name");
        if (attribute != null) {
            this.namedTypeResolver.registerSimpleType(getQName(attribute.getText()), loadXSDatatypeFromSimpleType(element));
        }
    }

    private void onSchemaComplexType(Element element, DatatypeElementFactory datatypeElementFactory) {
        Iterator elementIterator = element.elementIterator(XSD_ATTRIBUTE);
        while (elementIterator.hasNext()) {
            Element element2 = (Element) elementIterator.next();
            QName qName = getQName(element2.attributeValue("name"));
            XSDatatype dataTypeForXsdAttribute = dataTypeForXsdAttribute(element2);
            if (dataTypeForXsdAttribute != null) {
                datatypeElementFactory.setAttributeXSDatatype(qName, dataTypeForXsdAttribute);
            }
        }
        Element element3 = element.element(XSD_SEQUENCE);
        if (element3 != null) {
            onChildElements(element3, datatypeElementFactory);
        }
        Element element4 = element.element(XSD_CHOICE);
        if (element4 != null) {
            onChildElements(element4, datatypeElementFactory);
        }
        Element element5 = element.element(XSD_ALL);
        if (element5 != null) {
            onChildElements(element5, datatypeElementFactory);
        }
    }

    private void onSchemaError(String str) {
        throw new InvalidSchemaException(str);
    }

    public void build(Document document) {
        this.targetNamespace = null;
        internalBuild(document);
    }

    public void build(Document document, Namespace namespace) {
        this.targetNamespace = namespace;
        internalBuild(document);
    }
}
