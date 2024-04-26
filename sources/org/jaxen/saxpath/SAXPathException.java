package org.jaxen.saxpath;

import java.io.PrintStream;
import java.io.PrintWriter;

public class SAXPathException extends Exception {
    private Throwable cause;

    public SAXPathException(String str) {
        super(str);
    }

    public SAXPathException(Throwable th) {
        super(th.getMessage());
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.cause != null) {
            printStream.println("root case:");
            this.cause.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.cause != null) {
            printWriter.println("root case:");
            this.cause.printStackTrace(printWriter);
        }
    }
}
