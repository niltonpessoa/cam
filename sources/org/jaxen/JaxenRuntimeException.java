package org.jaxen;

public class JaxenRuntimeException extends RuntimeException {
    private JaxenException jaxenException;

    public JaxenRuntimeException(String str) {
        super(str);
    }

    public JaxenRuntimeException(JaxenException jaxenException2) {
        super(jaxenException2);
        this.jaxenException = jaxenException2;
    }

    public JaxenException getJaxenException() {
        return this.jaxenException;
    }
}
