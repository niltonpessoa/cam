package org.jaxen;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleNamespaceContext implements NamespaceContext, Serializable {
    private Map namespaces;

    public SimpleNamespaceContext() {
        this.namespaces = new HashMap();
    }

    public SimpleNamespaceContext(Map map) {
        this.namespaces = map;
    }

    public void addElementNamespaces(Navigator navigator, Object obj) {
        Iterator namespaceAxisIterator = navigator.getNamespaceAxisIterator(obj);
        while (namespaceAxisIterator.hasNext()) {
            Object next = namespaceAxisIterator.next();
            String namespacePrefix = navigator.getNamespacePrefix(next);
            String namespaceStringValue = navigator.getNamespaceStringValue(next);
            if (translateNamespacePrefixToUri(namespacePrefix) == null) {
                addNamespace(namespacePrefix, namespaceStringValue);
            }
        }
    }

    public void addNamespace(String str, String str2) {
        this.namespaces.put(str, str2);
    }

    public String translateNamespacePrefixToUri(String str) {
        if (this.namespaces.containsKey(str)) {
            return (String) this.namespaces.get(str);
        }
        return null;
    }
}
