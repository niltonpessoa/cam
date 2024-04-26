package org.jaxen.xom;

import org.jaxen.BaseXPath;

public class XOMXPath extends BaseXPath {
    public XOMXPath(String str) {
        super(str, new DocumentNavigator());
    }
}
