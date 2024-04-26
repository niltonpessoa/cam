package org.jaxen.dom4j;

import org.jaxen.BaseXPath;

public class Dom4jXPath extends BaseXPath {
    public Dom4jXPath(String str) {
        super(str, DocumentNavigator.getInstance());
    }
}
