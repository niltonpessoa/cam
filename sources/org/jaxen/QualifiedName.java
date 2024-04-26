package org.jaxen;

class QualifiedName {
    private String localName;
    private String namespaceURI;

    QualifiedName(String str, String str2) {
        this.namespaceURI = str;
        this.localName = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof QualifiedName)) {
            return false;
        }
        QualifiedName qualifiedName = (QualifiedName) obj;
        String str = this.namespaceURI;
        return str == null ? qualifiedName.namespaceURI == null && qualifiedName.localName.equals(this.localName) : str.equals(qualifiedName.namespaceURI) && qualifiedName.localName.equals(this.localName);
    }

    public String getLocalName() {
        return this.localName;
    }

    public String getNamespaceURI() {
        return this.namespaceURI;
    }

    public int hashCode() {
        int hashCode = this.localName.hashCode();
        String str = this.namespaceURI;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}
