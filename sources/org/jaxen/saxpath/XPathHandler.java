package org.jaxen.saxpath;

public interface XPathHandler {
    void endAbsoluteLocationPath();

    void endAdditiveExpr(int i);

    void endAllNodeStep();

    void endAndExpr(boolean z);

    void endCommentNodeStep();

    void endEqualityExpr(int i);

    void endFilterExpr();

    void endFunction();

    void endMultiplicativeExpr(int i);

    void endNameStep();

    void endOrExpr(boolean z);

    void endPathExpr();

    void endPredicate();

    void endProcessingInstructionNodeStep();

    void endRelationalExpr(int i);

    void endRelativeLocationPath();

    void endTextNodeStep();

    void endUnaryExpr(int i);

    void endUnionExpr(boolean z);

    void endXPath();

    void literal(String str);

    void number(double d);

    void number(int i);

    void startAbsoluteLocationPath();

    void startAdditiveExpr();

    void startAllNodeStep(int i);

    void startAndExpr();

    void startCommentNodeStep(int i);

    void startEqualityExpr();

    void startFilterExpr();

    void startFunction(String str, String str2);

    void startMultiplicativeExpr();

    void startNameStep(int i, String str, String str2);

    void startOrExpr();

    void startPathExpr();

    void startPredicate();

    void startProcessingInstructionNodeStep(int i, String str);

    void startRelationalExpr();

    void startRelativeLocationPath();

    void startTextNodeStep(int i);

    void startUnaryExpr();

    void startUnionExpr();

    void startXPath();

    void variableReference(String str, String str2);
}
