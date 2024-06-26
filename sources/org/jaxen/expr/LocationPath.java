package org.jaxen.expr;

import java.util.List;

public interface LocationPath extends Expr {
    void addStep(Step step);

    List getSteps();

    String getText();

    boolean isAbsolute();
}
