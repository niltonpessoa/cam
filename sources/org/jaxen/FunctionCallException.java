package org.jaxen;

import java.io.PrintStream;
import java.io.PrintWriter;

public class FunctionCallException extends JaxenException {
    private Throwable nestedException;

    public FunctionCallException(String str) {
        super(str);
    }

    public FunctionCallException(String str, Exception exc) {
        super(str);
        this.nestedException = exc;
    }

    public FunctionCallException(Throwable th) {
        super(th.getMessage());
        this.nestedException = th;
    }

    public Throwable fillInStackTrace() {
        Throwable th = this.nestedException;
        return th == null ? super.fillInStackTrace() : th.fillInStackTrace();
    }

    public Throwable getNestedException() {
        return this.nestedException;
    }

    public void printStackTrace() {
        super.printStackTrace();
        if (this.nestedException != null) {
            System.out.println("Root cause:");
            this.nestedException.printStackTrace();
        }
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.nestedException != null) {
            printStream.println("Root cause:");
            this.nestedException.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.nestedException != null) {
            printWriter.println("Root cause:");
            this.nestedException.printStackTrace(printWriter);
        }
    }
}
