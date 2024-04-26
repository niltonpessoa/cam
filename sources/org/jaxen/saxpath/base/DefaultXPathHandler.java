package org.jaxen.saxpath.base;

import org.jaxen.saxpath.XPathHandler;

class DefaultXPathHandler implements XPathHandler {
    private static final DefaultXPathHandler instance = new DefaultXPathHandler();

    static class Singleton {
        static final DefaultXPathHandler instance = new DefaultXPathHandler((AnonymousClass1) null);

        Singleton() {
        }
    }

    private DefaultXPathHandler() {
    }

    public static XPathHandler getInstance() {
        return instance;
    }

    public void endAbsoluteLocationPath() {
    }

    public void endAdditiveExpr(int i) {
    }

    public void endAllNodeStep() {
    }

    public void endAndExpr(boolean z) {
    }

    public void endCommentNodeStep() {
    }

    public void endEqualityExpr(int i) {
    }

    public void endFilterExpr() {
    }

    public void endFunction() {
    }

    public void endMultiplicativeExpr(int i) {
    }

    public void endNameStep() {
    }

    public void endOrExpr(boolean z) {
    }

    public void endPathExpr() {
    }

    public void endPredicate() {
    }

    public void endProcessingInstructionNodeStep() {
    }

    public void endRelationalExpr(int i) {
    }

    public void endRelativeLocationPath() {
    }

    public void endTextNodeStep() {
    }

    public void endUnaryExpr(int i) {
    }

    public void endUnionExpr(boolean z) {
    }

    public void endXPath() {
    }

    public void literal(String str) {
    }

    public void number(double d) {
    }

    public void number(int i) {
    }

    public void startAbsoluteLocationPath() {
    }

    public void startAdditiveExpr() {
    }

    public void startAllNodeStep(int i) {
    }

    public void startAndExpr() {
    }

    public void startCommentNodeStep(int i) {
    }

    public void startEqualityExpr() {
    }

    public void startFilterExpr() {
    }

    public void startFunction(String str, String str2) {
    }

    public void startMultiplicativeExpr() {
    }

    public void startNameStep(int i, String str, String str2) {
    }

    public void startOrExpr() {
    }

    public void startPathExpr() {
    }

    public void startPredicate() {
    }

    public void startProcessingInstructionNodeStep(int i, String str) {
    }

    public void startRelationalExpr() {
    }

    public void startRelativeLocationPath() {
    }

    public void startTextNodeStep(int i) {
    }

    public void startUnaryExpr() {
    }

    public void startUnionExpr() {
    }

    public void startXPath() {
    }

    public void variableReference(String str, String str2) {
    }
}
