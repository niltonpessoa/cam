package org.dom4j.dom;

import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;
import org.dom4j.Text;
import org.dom4j.util.SingletonStrategy;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentType;

public class DOMDocumentFactory extends DocumentFactory implements DOMImplementation {
    static /* synthetic */ Class class$org$dom4j$dom$DOMDocumentFactory;
    private static SingletonStrategy singleton;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|7|8|(1:10)|11|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[Catch:{ Exception -> 0x002f }] */
    static {
        /*
            java.lang.String r0 = "org.dom4j.util.SimpleSingleton"
            r1 = 0
            java.lang.String r2 = "org.dom4j.dom.DOMDocumentFactory.singleton.strategy"
            java.lang.String r0 = java.lang.System.getProperty(r2, r0)     // Catch:{ Exception -> 0x000e }
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x000e }
            goto L_0x0014
        L_0x000e:
            java.lang.String r0 = "org.dom4j.util.SimpleSingleton"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            java.lang.Object r0 = r1.newInstance()     // Catch:{ Exception -> 0x002f }
            org.dom4j.util.SingletonStrategy r0 = (org.dom4j.util.SingletonStrategy) r0     // Catch:{ Exception -> 0x002f }
            singleton = r0     // Catch:{ Exception -> 0x002f }
            java.lang.Class r1 = class$org$dom4j$dom$DOMDocumentFactory     // Catch:{ Exception -> 0x002f }
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "org.dom4j.dom.DOMDocumentFactory"
            java.lang.Class r1 = class$(r1)     // Catch:{ Exception -> 0x002f }
            class$org$dom4j$dom$DOMDocumentFactory = r1     // Catch:{ Exception -> 0x002f }
        L_0x0028:
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x002f }
            r0.setSingletonClassName(r1)     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.dom.DOMDocumentFactory.<clinit>():void");
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static DocumentFactory getInstance() {
        return (DOMDocumentFactory) singleton.instance();
    }

    /* access modifiers changed from: protected */
    public DOMDocumentType asDocumentType(DocumentType documentType) {
        return documentType instanceof DOMDocumentType ? (DOMDocumentType) documentType : new DOMDocumentType(documentType.getName(), documentType.getPublicId(), documentType.getSystemId());
    }

    public Attribute createAttribute(Element element, QName qName, String str) {
        return new DOMAttribute(qName, str);
    }

    public CDATA createCDATA(String str) {
        return new DOMCDATA(str);
    }

    public Comment createComment(String str) {
        return new DOMComment(str);
    }

    public org.dom4j.DocumentType createDocType(String str, String str2, String str3) {
        return new DOMDocumentType(str, str2, str3);
    }

    public Document createDocument() {
        DOMDocument dOMDocument = new DOMDocument();
        dOMDocument.setDocumentFactory(this);
        return dOMDocument;
    }

    public org.w3c.dom.Document createDocument(String str, String str2, DocumentType documentType) {
        DOMDocument dOMDocument = documentType != null ? new DOMDocument(asDocumentType(documentType)) : new DOMDocument();
        dOMDocument.addElement(createQName(str2, str));
        return dOMDocument;
    }

    public DocumentType createDocumentType(String str, String str2, String str3) {
        return new DOMDocumentType(str, str2, str3);
    }

    public Element createElement(QName qName) {
        return new DOMElement(qName);
    }

    public Element createElement(QName qName, int i) {
        return new DOMElement(qName, i);
    }

    public Entity createEntity(String str) {
        return new DOMEntityReference(str);
    }

    public Entity createEntity(String str, String str2) {
        return new DOMEntityReference(str, str2);
    }

    public Namespace createNamespace(String str, String str2) {
        return new DOMNamespace(str, str2);
    }

    public ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return new DOMProcessingInstruction(str, str2);
    }

    public ProcessingInstruction createProcessingInstruction(String str, Map map) {
        return new DOMProcessingInstruction(str, map);
    }

    public Text createText(String str) {
        return new DOMText(str);
    }

    public boolean hasFeature(String str, String str2) {
        if ("XML".equalsIgnoreCase(str) || "Core".equalsIgnoreCase(str)) {
            return str2 == null || str2.length() == 0 || "1.0".equals(str2) || "2.0".equals(str2);
        }
        return false;
    }
}
