package org.jaxen;

import org.jaxen.saxpath.SAXPathException;

public class JaxenException extends SAXPathException {
    public JaxenException(String str) {
        super(str);
    }

    public JaxenException(Throwable th) {
        super(th);
    }
}
