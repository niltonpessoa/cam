package org.jaxen.dom;

import org.jaxen.BaseXPath;

public class DOMXPath extends BaseXPath {
    public DOMXPath(String str) {
        super(str, DocumentNavigator.getInstance());
    }
}
