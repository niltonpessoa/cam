package org.jaxen.dom.html;

import org.jaxen.BaseXPath;

public class HTMLXPath extends BaseXPath {
    public HTMLXPath(String str) {
        this(str, true);
    }

    public HTMLXPath(String str, boolean z) {
        super(str, DocumentNavigator.getInstance(z));
    }
}
