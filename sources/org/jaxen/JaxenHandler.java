package org.jaxen;

import java.util.Iterator;
import java.util.LinkedList;
import org.jaxen.expr.DefaultXPathFactory;
import org.jaxen.expr.Expr;
import org.jaxen.expr.FilterExpr;
import org.jaxen.expr.FunctionCallExpr;
import org.jaxen.expr.LocationPath;
import org.jaxen.expr.Predicate;
import org.jaxen.expr.Predicated;
import org.jaxen.expr.Step;
import org.jaxen.expr.XPathExpr;
import org.jaxen.expr.XPathFactory;
import org.jaxen.saxpath.XPathHandler;

public class JaxenHandler implements XPathHandler {
    protected boolean simplified;
    protected LinkedList stack = new LinkedList();
    private XPathExpr xpath;
    private XPathFactory xpathFactory = new DefaultXPathFactory();

    /* access modifiers changed from: protected */
    public void addParameters(FunctionCallExpr functionCallExpr, Iterator it) {
        while (it.hasNext()) {
            functionCallExpr.addParameter((Expr) it.next());
        }
    }

    /* access modifiers changed from: protected */
    public void addPredicates(Predicated predicated, Iterator it) {
        while (it.hasNext()) {
            predicated.addPredicate((Predicate) it.next());
        }
    }

    /* access modifiers changed from: protected */
    public void addSteps(LocationPath locationPath, Iterator it) {
        while (it.hasNext()) {
            locationPath.addStep((Step) it.next());
        }
    }

    /* access modifiers changed from: protected */
    public boolean canPop() {
        return peekFrame().size() > 0;
    }

    public void endAbsoluteLocationPath() {
        endLocationPath();
    }

    public void endAdditiveExpr(int i) {
        if (i != 0) {
            Expr expr = (Expr) pop();
            push(getXPathFactory().createAdditiveExpr(expr, (Expr) pop(), i));
        }
    }

    public void endAllNodeStep() {
        endStep();
    }

    public void endAndExpr(boolean z) {
        if (z) {
            Expr expr = (Expr) pop();
            push(getXPathFactory().createAndExpr(expr, (Expr) pop()));
        }
    }

    public void endCommentNodeStep() {
        endStep();
    }

    public void endEqualityExpr(int i) {
        if (i != 0) {
            Expr expr = (Expr) pop();
            push(getXPathFactory().createEqualityExpr(expr, (Expr) pop(), i));
        }
    }

    public void endFilterExpr() {
        FilterExpr createFilterExpr = getXPathFactory().createFilterExpr((Expr) peekFrame().removeFirst());
        addPredicates(createFilterExpr, popFrame().iterator());
        push(createFilterExpr);
    }

    public void endFunction() {
        FunctionCallExpr functionCallExpr = (FunctionCallExpr) peekFrame().removeFirst();
        addParameters(functionCallExpr, popFrame().iterator());
        push(functionCallExpr);
    }

    /* access modifiers changed from: protected */
    public void endLocationPath() {
        LocationPath locationPath = (LocationPath) peekFrame().removeFirst();
        addSteps(locationPath, popFrame().iterator());
        push(locationPath);
    }

    public void endMultiplicativeExpr(int i) {
        if (i != 0) {
            Expr expr = (Expr) pop();
            push(getXPathFactory().createMultiplicativeExpr(expr, (Expr) pop(), i));
        }
    }

    public void endNameStep() {
        endStep();
    }

    public void endOrExpr(boolean z) {
        if (z) {
            Expr expr = (Expr) pop();
            push(getXPathFactory().createOrExpr(expr, (Expr) pop()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: org.jaxen.expr.LocationPath} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: org.jaxen.expr.LocationPath} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: org.jaxen.expr.FilterExpr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: org.jaxen.expr.LocationPath} */
    /* JADX WARNING: type inference failed for: r1v5, types: [org.jaxen.expr.LocationPath] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void endPathExpr() {
        /*
            r4 = this;
            int r0 = r4.stackSize()
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x0019
            java.lang.Object r0 = r4.pop()
            r1 = r0
            org.jaxen.expr.LocationPath r1 = (org.jaxen.expr.LocationPath) r1
            java.lang.Object r0 = r4.pop()
        L_0x0013:
            org.jaxen.expr.FilterExpr r0 = (org.jaxen.expr.FilterExpr) r0
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0023
        L_0x0019:
            java.lang.Object r0 = r4.pop()
            boolean r2 = r0 instanceof org.jaxen.expr.LocationPath
            if (r2 == 0) goto L_0x0013
            org.jaxen.expr.LocationPath r0 = (org.jaxen.expr.LocationPath) r0
        L_0x0023:
            r4.popFrame()
            org.jaxen.expr.XPathFactory r2 = r4.getXPathFactory()
            org.jaxen.expr.PathExpr r0 = r2.createPathExpr(r1, r0)
            r4.push(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jaxen.JaxenHandler.endPathExpr():void");
    }

    public void endPredicate() {
        Predicate createPredicate = getXPathFactory().createPredicate((Expr) pop());
        popFrame();
        push(createPredicate);
    }

    public void endProcessingInstructionNodeStep() {
        endStep();
    }

    public void endRelationalExpr(int i) {
        if (i != 0) {
            Expr expr = (Expr) pop();
            push(getXPathFactory().createRelationalExpr(expr, (Expr) pop(), i));
        }
    }

    public void endRelativeLocationPath() {
        endLocationPath();
    }

    /* access modifiers changed from: protected */
    public void endStep() {
        Step step = (Step) peekFrame().removeFirst();
        addPredicates(step, popFrame().iterator());
        push(step);
    }

    public void endTextNodeStep() {
        endStep();
    }

    public void endUnaryExpr(int i) {
        if (i != 0) {
            push(getXPathFactory().createUnaryExpr((Expr) pop(), i));
        }
    }

    public void endUnionExpr(boolean z) {
        if (z) {
            Expr expr = (Expr) pop();
            push(getXPathFactory().createUnionExpr(expr, (Expr) pop()));
        }
    }

    public void endXPath() {
        this.xpath = getXPathFactory().createXPath((Expr) pop());
        popFrame();
    }

    public XPathExpr getXPathExpr() {
        return getXPathExpr(true);
    }

    public XPathExpr getXPathExpr(boolean z) {
        if (z && !this.simplified) {
            this.xpath.simplify();
            this.simplified = true;
        }
        return this.xpath;
    }

    public XPathFactory getXPathFactory() {
        return this.xpathFactory;
    }

    public void literal(String str) {
        push(getXPathFactory().createLiteralExpr(str));
    }

    public void number(double d) {
        push(getXPathFactory().createNumberExpr(d));
    }

    public void number(int i) {
        push(getXPathFactory().createNumberExpr(i));
    }

    /* access modifiers changed from: protected */
    public LinkedList peekFrame() {
        return (LinkedList) this.stack.getLast();
    }

    /* access modifiers changed from: protected */
    public Object pop() {
        return peekFrame().removeLast();
    }

    /* access modifiers changed from: protected */
    public LinkedList popFrame() {
        return (LinkedList) this.stack.removeLast();
    }

    /* access modifiers changed from: protected */
    public void push(Object obj) {
        peekFrame().addLast(obj);
    }

    /* access modifiers changed from: protected */
    public void pushFrame() {
        this.stack.addLast(new LinkedList());
    }

    /* access modifiers changed from: protected */
    public void returnExpr() {
        popFrame();
        push((Expr) pop());
    }

    public void setXPathFactory(XPathFactory xPathFactory) {
        this.xpathFactory = xPathFactory;
    }

    /* access modifiers changed from: protected */
    public int stackSize() {
        return peekFrame().size();
    }

    public void startAbsoluteLocationPath() {
        pushFrame();
        push(getXPathFactory().createAbsoluteLocationPath());
    }

    public void startAdditiveExpr() {
    }

    public void startAllNodeStep(int i) {
        pushFrame();
        push(getXPathFactory().createAllNodeStep(i));
    }

    public void startAndExpr() {
    }

    public void startCommentNodeStep(int i) {
        pushFrame();
        push(getXPathFactory().createCommentNodeStep(i));
    }

    public void startEqualityExpr() {
    }

    public void startFilterExpr() {
        pushFrame();
    }

    public void startFunction(String str, String str2) {
        pushFrame();
        push(getXPathFactory().createFunctionCallExpr(str, str2));
    }

    public void startMultiplicativeExpr() {
    }

    public void startNameStep(int i, String str, String str2) {
        pushFrame();
        push(getXPathFactory().createNameStep(i, str, str2));
    }

    public void startOrExpr() {
    }

    public void startPathExpr() {
        pushFrame();
    }

    public void startPredicate() {
        pushFrame();
    }

    public void startProcessingInstructionNodeStep(int i, String str) {
        pushFrame();
        push(getXPathFactory().createProcessingInstructionNodeStep(i, str));
    }

    public void startRelationalExpr() {
    }

    public void startRelativeLocationPath() {
        pushFrame();
        push(getXPathFactory().createRelativeLocationPath());
    }

    public void startTextNodeStep(int i) {
        pushFrame();
        push(getXPathFactory().createTextNodeStep(i));
    }

    public void startUnaryExpr() {
    }

    public void startUnionExpr() {
    }

    public void startXPath() {
        this.simplified = false;
        pushFrame();
    }

    public void variableReference(String str, String str2) {
        push(getXPathFactory().createVariableReferenceExpr(str, str2));
    }
}
