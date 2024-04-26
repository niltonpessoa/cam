package org.jaxen.jdom;

import org.jaxen.BaseXPath;

public class JDOMXPath extends BaseXPath {
    public JDOMXPath(String str) {
        super(str, DocumentNavigator.getInstance());
    }
}
