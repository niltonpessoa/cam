package org.dom4j.datatype;

import com.sun.msv.datatype.xsd.XSDatatype;
import java.util.HashMap;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.QName;

public class DatatypeElementFactory extends DocumentFactory {
    private Map attributeXSDatatypes = new HashMap();
    private Map childrenXSDatatypes = new HashMap();
    private QName elementQName;

    public DatatypeElementFactory(QName qName) {
        this.elementQName = qName;
    }

    public Attribute createAttribute(Element element, QName qName, String str) {
        XSDatatype attributeXSDatatype = getAttributeXSDatatype(qName);
        return attributeXSDatatype == null ? super.createAttribute(element, qName, str) : new DatatypeAttribute(qName, attributeXSDatatype, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = ((org.dom4j.datatype.DatatypeElementFactory) r0).getChildElementXSDatatype(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.dom4j.Element createElement(org.dom4j.QName r3) {
        /*
            r2 = this;
            com.sun.msv.datatype.xsd.XSDatatype r0 = r2.getChildElementXSDatatype(r3)
            if (r0 == 0) goto L_0x000c
            org.dom4j.datatype.DatatypeElement r1 = new org.dom4j.datatype.DatatypeElement
            r1.<init>(r3, r0)
            return r1
        L_0x000c:
            org.dom4j.DocumentFactory r0 = r3.getDocumentFactory()
            boolean r1 = r0 instanceof org.dom4j.datatype.DatatypeElementFactory
            if (r1 == 0) goto L_0x0022
            org.dom4j.datatype.DatatypeElementFactory r0 = (org.dom4j.datatype.DatatypeElementFactory) r0
            com.sun.msv.datatype.xsd.XSDatatype r0 = r0.getChildElementXSDatatype(r3)
            if (r0 == 0) goto L_0x0022
            org.dom4j.datatype.DatatypeElement r1 = new org.dom4j.datatype.DatatypeElement
            r1.<init>(r3, r0)
            return r1
        L_0x0022:
            org.dom4j.Element r3 = super.createElement((org.dom4j.QName) r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.datatype.DatatypeElementFactory.createElement(org.dom4j.QName):org.dom4j.Element");
    }

    public XSDatatype getAttributeXSDatatype(QName qName) {
        return (XSDatatype) this.attributeXSDatatypes.get(qName);
    }

    public XSDatatype getChildElementXSDatatype(QName qName) {
        return (XSDatatype) this.childrenXSDatatypes.get(qName);
    }

    public QName getQName() {
        return this.elementQName;
    }

    public void setAttributeXSDatatype(QName qName, XSDatatype xSDatatype) {
        this.attributeXSDatatypes.put(qName, xSDatatype);
    }

    public void setChildElementXSDatatype(QName qName, XSDatatype xSDatatype) {
        this.childrenXSDatatypes.put(qName, xSDatatype);
    }
}
