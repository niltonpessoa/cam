package org.dom4j.datatype;

import com.sun.msv.datatype.DatabindableDatatype;
import com.sun.msv.datatype.SerializationContext;
import com.sun.msv.datatype.xsd.XSDatatype;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.tree.DefaultElement;
import org.relaxng.datatype.DatatypeException;
import org.relaxng.datatype.ValidationContext;

public class DatatypeElement extends DefaultElement implements SerializationContext, ValidationContext {
    private Object data;
    private XSDatatype datatype;

    public DatatypeElement(QName qName, int i, XSDatatype xSDatatype) {
        super(qName, i);
        this.datatype = xSDatatype;
    }

    public DatatypeElement(QName qName, XSDatatype xSDatatype) {
        super(qName);
        this.datatype = xSDatatype;
    }

    public Element addText(String str) {
        validate(str);
        return super.addText(str);
    }

    /* access modifiers changed from: protected */
    public void childAdded(Node node) {
        this.data = null;
        super.childAdded(node);
    }

    /* access modifiers changed from: protected */
    public void childRemoved(Node node) {
        this.data = null;
        super.childRemoved(node);
    }

    public String getBaseUri() {
        return null;
    }

    public Object getData() {
        String textTrim;
        if (this.data == null && (textTrim = getTextTrim()) != null && textTrim.length() > 0) {
            XSDatatype xSDatatype = this.datatype;
            this.data = xSDatatype instanceof DatabindableDatatype ? xSDatatype.createJavaObject(textTrim, this) : xSDatatype.createValue(textTrim, this);
        }
        return this.data;
    }

    public String getNamespacePrefix(String str) {
        Namespace namespaceForURI = getNamespaceForURI(str);
        if (namespaceForURI != null) {
            return namespaceForURI.getPrefix();
        }
        return null;
    }

    public XSDatatype getXSDatatype() {
        return this.datatype;
    }

    public boolean isNotation(String str) {
        return false;
    }

    public boolean isUnparsedEntity(String str) {
        return true;
    }

    public String resolveNamespacePrefix(String str) {
        Namespace namespaceForPrefix = getNamespaceForPrefix(str);
        if (namespaceForPrefix != null) {
            return namespaceForPrefix.getURI();
        }
        return null;
    }

    public void setData(Object obj) {
        String convertToLexicalValue = this.datatype.convertToLexicalValue(obj, this);
        validate(convertToLexicalValue);
        this.data = obj;
        setText(convertToLexicalValue);
    }

    public void setText(String str) {
        validate(str);
        super.setText(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(hashCode());
        stringBuffer.append(" [Element: <");
        stringBuffer.append(getQualifiedName());
        stringBuffer.append(" attributes: ");
        stringBuffer.append(attributeList());
        stringBuffer.append(" data: ");
        stringBuffer.append(getData());
        stringBuffer.append(" />]");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public void validate(String str) {
        try {
            this.datatype.checkValid(str, this);
        } catch (DatatypeException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
