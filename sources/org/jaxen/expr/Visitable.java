package org.jaxen.expr;

public interface Visitable {
    void accept(Visitor visitor);
}
