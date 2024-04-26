package org.dom4j;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.dom4j.tree.QNameCache;
import org.dom4j.util.SingletonStrategy;

public class QName implements Serializable {
    static /* synthetic */ Class class$org$dom4j$tree$QNameCache;
    private static SingletonStrategy singleton;
    private DocumentFactory documentFactory;
    private int hashCode;
    private String name;
    private transient Namespace namespace;
    private String qualifiedName;

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
            java.lang.String r2 = "org.dom4j.QName.singleton.strategy"
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
            java.lang.Class r1 = class$org$dom4j$tree$QNameCache     // Catch:{ Exception -> 0x002f }
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "org.dom4j.tree.QNameCache"
            java.lang.Class r1 = class$(r1)     // Catch:{ Exception -> 0x002f }
            class$org$dom4j$tree$QNameCache = r1     // Catch:{ Exception -> 0x002f }
        L_0x0028:
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x002f }
            r0.setSingletonClassName(r1)     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.QName.<clinit>():void");
    }

    public QName(String str) {
        this(str, Namespace.NO_NAMESPACE);
    }

    public QName(String str, Namespace namespace2) {
        this.name = str == null ? "" : str;
        this.namespace = namespace2 == null ? Namespace.NO_NAMESPACE : namespace2;
    }

    public QName(String str, Namespace namespace2, String str2) {
        this.name = str == null ? "" : str;
        this.qualifiedName = str2;
        this.namespace = namespace2 == null ? Namespace.NO_NAMESPACE : namespace2;
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static QName get(String str) {
        return getCache().get(str);
    }

    public static QName get(String str, String str2) {
        return str2 == null ? getCache().get(str) : getCache().get(str, str2);
    }

    public static QName get(String str, String str2, String str3) {
        return ((str2 == null || str2.length() == 0) && str3 == null) ? get(str) : (str2 == null || str2.length() == 0) ? getCache().get(str, Namespace.get(str3)) : str3 == null ? get(str) : getCache().get(str, Namespace.get(str2, str3));
    }

    public static QName get(String str, Namespace namespace2) {
        return getCache().get(str, namespace2);
    }

    public static QName get(String str, Namespace namespace2, String str2) {
        return getCache().get(str, namespace2, str2);
    }

    private static QNameCache getCache() {
        return (QNameCache) singleton.instance();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.namespace = Namespace.get((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.namespace.getPrefix());
        objectOutputStream.writeObject(this.namespace.getURI());
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QName) {
            QName qName = (QName) obj;
            return hashCode() == qName.hashCode() && getName().equals(qName.getName()) && getNamespaceURI().equals(qName.getNamespaceURI());
        }
        return false;
    }

    public DocumentFactory getDocumentFactory() {
        return this.documentFactory;
    }

    public String getName() {
        return this.name;
    }

    public Namespace getNamespace() {
        return this.namespace;
    }

    public String getNamespacePrefix() {
        Namespace namespace2 = this.namespace;
        return namespace2 == null ? "" : namespace2.getPrefix();
    }

    public String getNamespaceURI() {
        Namespace namespace2 = this.namespace;
        return namespace2 == null ? "" : namespace2.getURI();
    }

    public String getQualifiedName() {
        String str;
        if (this.qualifiedName == null) {
            String namespacePrefix = getNamespacePrefix();
            if (namespacePrefix == null || namespacePrefix.length() <= 0) {
                str = this.name;
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(namespacePrefix);
                stringBuffer.append(":");
                stringBuffer.append(this.name);
                str = stringBuffer.toString();
            }
            this.qualifiedName = str;
        }
        return this.qualifiedName;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int hashCode2 = getName().hashCode() ^ getNamespaceURI().hashCode();
            this.hashCode = hashCode2;
            if (hashCode2 == 0) {
                this.hashCode = 47806;
            }
        }
        return this.hashCode;
    }

    public void setDocumentFactory(DocumentFactory documentFactory2) {
        this.documentFactory = documentFactory2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" [name: ");
        stringBuffer.append(getName());
        stringBuffer.append(" namespace: \"");
        stringBuffer.append(getNamespace());
        stringBuffer.append("\"]");
        return stringBuffer.toString();
    }
}
